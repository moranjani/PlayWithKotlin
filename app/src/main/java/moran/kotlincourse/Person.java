package moran.kotlincourse;

import android.text.TextUtils;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        TextUtils.isEmpty(address);
    }


}
