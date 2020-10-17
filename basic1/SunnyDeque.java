package basic1;

import java.util.LinkedList;
import java.util.List;

class SunnyDeque<T> {
    private List<T> list;

    SunnyDeque(){
        list = new LinkedList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void push_front(T t){
        list.add(0,t);
    }
    public void  push_back(T t){
        list.add(list.size(), t);
    }

    public T pop_front(){
        T t = list.get(0);
        list.remove(0);
        return t;
    }
    public T pop_back() {
        T t = list.get(list.size()-1);
        list.remove(list.size()-1);
        return t;
    }


}
