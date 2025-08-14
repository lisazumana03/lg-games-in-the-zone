package za.co.capetown.lggames.service;

import java.util.List;

public interface IService <T, ID>{
    T create(T t);
    T read(ID id);
    List<T> getAll();
    T update(ID id, T t);
}
