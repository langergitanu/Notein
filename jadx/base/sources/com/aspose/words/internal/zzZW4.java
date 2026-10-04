package com.aspose.words.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZW4 {
    private zzZW5[] zz84;

    private zzZW4(zzZW5[] zzzw5Arr) {
        this.zz84 = zzzw5Arr;
    }

    private static Member[] zzX(Class cls, int i) {
        if (i == 1) {
            return cls.getConstructors();
        }
        if (i == 2) {
            return cls.getMethods();
        }
        if (i == 6) {
            return cls.getFields();
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: memberType");
    }

    private static zz6P[] zzY(Constructor constructor) {
        zzZZO.zzrK();
        constructor.getDeclaringClass();
        zzZZO.zzrH();
        return zzZZO.zzZ(constructor);
    }

    private static void zzZ(ArrayList<zzZW5> arrayList, Class cls, int i, zzRJ zzrj) {
        for (Member member : zzX(cls, i)) {
            zz6P[] zz6pArrZzX = zzX(member, i);
            if (zz6pArrZzX != null) {
                Object objZzZ = zzZ(null, member);
                zzZ(arrayList, new zzZW5(objZzZ, member, i, zz6pArrZzX), objZzZ, member, null);
            }
        }
    }

    public static zzZW4 zzs(Class cls) {
        zzZZO.zzrL();
        ArrayList arrayList = new ArrayList();
        zzZ(arrayList, cls, 1, null);
        zzZ(arrayList, cls, 2, null);
        zzZ(arrayList, cls, 6, null);
        return new zzZW4((zzZW5[]) arrayList.toArray(new zzZW5[0]));
    }

    private static zz6P[] zzY(Method method) {
        zzZZO.zzrI();
        if (zzZWA.zzu(method.getReturnType())) {
            return null;
        }
        method.getReturnType();
        zzZZO.zzrH();
        zzZZO.zzrJ();
        return zzZZO.zzZ(method);
    }

    private static zz6P[] zzX(Member member, int i) {
        if (i == 1) {
            return zzY((Constructor) member);
        }
        if (i == 2) {
            return zzY((Method) member);
        }
        if (i == 6) {
            return zzZ((Field) member);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: memberType");
    }

    private static Object zzZ(zzRJ zzrj, Member member) {
        return zzrj != null ? zzrj.zzQU() : member;
    }

    private static void zzZ(ArrayList<zzZW5> arrayList, zzZW5 zzzw5, Object obj, Member member, zzRJ zzrj) {
        if (zzrj != null) {
            zzrj.zzZ(zzzw5, obj, member);
        }
        zzZQG.zzZ(arrayList, zzzw5);
    }

    private static zz6P[] zzZ(Field field) {
        field.getType();
        zzZZO.zzrL();
        field.getType();
        zzZZO.zzrH();
        return zz6P.zzlP;
    }

    public final void zzY(zzF7 zzf7) {
        for (zzZW5 zzzw5 : this.zz84) {
            zzf7.zzR(zzzw5);
        }
    }

    public final void zzZ(zzZW6 zzzw6) {
        for (zzZW5 zzzw5 : this.zz84) {
            zzzw5.zzZ(zzzw6);
        }
    }
}
