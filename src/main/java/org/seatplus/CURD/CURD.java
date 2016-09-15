package org.seatplus.CURD;

/**
 * Created by anushka.ekanayake on 9/15/2016.
 */
public interface CURD<T,U> {
    public void add(T t);
    public T get(U u);
    public void delete(T t);
    public T getAll();
}
