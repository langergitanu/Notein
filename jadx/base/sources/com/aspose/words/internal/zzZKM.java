package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKM {
    public static int zzr(Class cls) {
        if (cls == null) {
            return 0;
        }
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return 3;
            }
            if (cls == Integer.TYPE) {
                return 9;
            }
            if (cls == Character.TYPE) {
                return 4;
            }
            if (cls == Byte.TYPE) {
                return 6;
            }
            if (cls == Short.TYPE) {
                return 7;
            }
            if (cls == Long.TYPE) {
                return 11;
            }
            if (cls == Double.TYPE) {
                return 14;
            }
            if (cls == Float.TYPE) {
                return 13;
            }
            if (cls == Void.TYPE) {
                return 0;
            }
        }
        if (cls == String.class) {
            return 18;
        }
        return cls == zzZQ9.class ? 16 : 1;
    }
}
