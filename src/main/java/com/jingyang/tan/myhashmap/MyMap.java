package com.jingyang.tan.myhashmap;


/**
 * HashMap 顶层接口
 * @since 4月 09, 2020 21:44
 */

public interface MyMap<K,V>{

    int size();

    V get(K k);

    V put(K k,V v);

    interface Entry<K,V>{
        K getKey();

        V getValue();
    }
}
