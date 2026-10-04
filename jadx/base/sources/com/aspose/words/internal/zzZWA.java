package com.aspose.words.internal;

import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWA {
    public static boolean zzt(Class cls) {
        while (cls != null) {
            if (!Modifier.isPublic(cls.getModifiers())) {
                return false;
            }
            cls = cls.getDeclaringClass();
        }
        return true;
    }

    public static boolean zzu(Class cls) {
        return cls == Void.TYPE || cls == Void.class;
    }
}
