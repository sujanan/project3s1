package com.example.project3s1.util;

public class Debug
{
    public static String tag(Object o)
    {
        if (o == null)
            return "TAG";
        return o.getClass().getName();
    }
}
