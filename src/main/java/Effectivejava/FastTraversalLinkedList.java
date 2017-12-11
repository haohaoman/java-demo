package Effectivejava;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *  * @Description completion javadoc.
 *  *
 *  * @author yonghao.jiang
 *  * @since 15 十一月 2017
 *  
 */
public class FastTraversalLinkedList<E> extends AbstractList<E> {
    private class WriteList {

        boolean changed = false;

        /**
         * 这个是实际操作对象
         */
        LinkedList<E> list = new LinkedList<E>();

        /**
         * 这个是同步的关联对象
         */
        private ReadList companion;

        public void setCompanion (ReadList companion){
            this.companion = companion;
        }

        public void synchronice (){
            if (companion.changed) {
                list = new LinkedList<E>(companion.list);
                companion.changed = false;
            }
        }

        public boolean add (E e){
            synchronice();
            changed = true;
            return list.add(e);
        }

        public void add (int index, E e){
            synchronice();
            changed = true;
            list.add(index, e);
        }

        public Iterator<E> iterator (){
            synchronice();
            return list.iterator();
        }

        public void clear (){
            list.clear();
            changed = false;
        }

    }

    private class ReadList {

        /**
         * 这个是实际操作对象
         */
        private ArrayList<E> list = new ArrayList<E>();

        /**
         * 这个是同步的关联对象
         */
        private WriteList companion;

        public void setCompanion (WriteList companion){
            this.companion = companion;
        }

        boolean changed = false;

        public void synchronice (){
            if (companion.changed) {
                list = new ArrayList<E>(companion.list);
                companion.changed = false;
            }
        }

        public int size (){
            synchronice();
            return list.size();
        }

        public E get (int index){
            synchronice();
            return list.get(index);
        }

        public boolean add (E e){
            synchronice();
            changed = true;
            return list.add(e);
        }

        public E remove (int index){
            synchronice();
            changed = true;
            return list.remove(index);
        }

        public boolean remove (Object obj){
            synchronice();
            changed = true;
            return list.remove(obj);
        }

        public void clear (){
            list.clear();
            changed = false;
        }

    }

    private ReadList rlist = new ReadList();

    private WriteList writeList = new WriteList();

    {
        rlist.setCompanion(writeList);
        writeList.setCompanion(rlist);
    }

    @Override
    public E get (int index){
        return rlist.get(index);
    }

    @Override
    public int size (){
        return rlist.size();
    }

    public static void main (String[] args){
        FastTraversalLinkedList fastTraversalLinkedList = new FastTraversalLinkedList();
        fastTraversalLinkedList.add("111");
        fastTraversalLinkedList.add("222");
        fastTraversalLinkedList.add("333");
        String a = (String) fastTraversalLinkedList.get(0);
    }
}
