package com.lenovo.api.stylusprediction;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class PreSysProp {
    private static final String TAG = "PreSysProp";
    private static Method sysPropGet;
    private static Method sysPropSet;

    static {
        try {
            for (Method method : Class.forName("android.os.SystemProperties").getMethods()) {
                String name = method.getName();
                if (name.equalsIgnoreCase("get")) {
                    sysPropGet = method;
                } else if (name.equalsIgnoreCase("set")) {
                    sysPropSet = method;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private PreSysProp() {
    }

    public static int get(String str, int i) {
        StringBuilder sb;
        try {
            return Integer.valueOf((String) sysPropGet.invoke(null, str, i + "")).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder("IllegalAccessException = ");
            sb.append(e.getMessage());
            Log.e(TAG, sb.toString());
            return i;
        } catch (IllegalArgumentException e2) {
            e = e2;
            sb = new StringBuilder("IllegalArgumentException = ");
            sb.append(e.getMessage());
            Log.e(TAG, sb.toString());
            return i;
        } catch (InvocationTargetException e3) {
            e = e3;
            sb = new StringBuilder("InvocationTargetException = ");
            sb.append(e.getMessage());
            Log.e(TAG, sb.toString());
            return i;
        }
    }
}
