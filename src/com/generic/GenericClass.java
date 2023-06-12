package com.generic;

public class GenericClass<t> {
    t  data;

    public GenericClass(){

    }

    public GenericClass(t data) {

        this.data = data;
    }

    public t kuchBhi(){

        return this.data;
    }
}
