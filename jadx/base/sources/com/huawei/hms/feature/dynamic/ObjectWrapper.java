package com.huawei.hms.feature.dynamic;

import Oooo0oO.C21023OooO0Oo;
import android.os.IBinder;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* JADX INFO: renamed from: b */
    public final T f53560b;

    public ObjectWrapper(T t) {
        this.f53560b = t;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).f53560b;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                i++;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" fields, The number of field number should be 1.", declaredFields.length, new StringBuilder("Got ")));
        }
        if (declaredFields[0].isAccessible()) {
            throw new IllegalArgumentException("The field is accessible.");
        }
        declaredFields[0].setAccessible(true);
        try {
            return (T) declaredFields[0].get(iBinderAsBinder);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Get binder failed: null or not permitted.");
        }
    }

    public static <T> IObjectWrapper wrap(T t) {
        return new ObjectWrapper(t);
    }
}
