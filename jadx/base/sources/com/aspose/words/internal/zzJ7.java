package com.aspose.words.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
final class zzJ7 extends zzZW6 {
    private static Object[] zzz8 = new Object[0];

    public zzJ7(Class cls) {
        super(cls, zzZW4.zzs(cls));
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzY(zzAD zzad, Object obj, Object obj2, Object obj3) throws Exception {
        return zzZ(zzad, obj, obj2, obj3, null, null, null, null, 1);
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2) throws Exception {
        return zzad.zzAG() != 6 ? zzZ(zzad, obj, obj2, null, null, null, null, null, 0) : ((Field) obj).get(obj2);
    }

    private static Object zzY(zzAD zzad, Object obj, Object obj2, Object[] objArr) throws Exception {
        try {
            int iZzAG = zzad.zzAG();
            if (iZzAG == 1) {
                return ((Constructor) obj).newInstance(objArr);
            }
            if (iZzAG == 2) {
                return ((Method) obj).invoke(obj2, objArr);
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: binding");
        } catch (InvocationTargetException e) {
            throw ((Exception) e.getCause());
        }
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2, Object obj3, Object obj4) throws Exception {
        return zzZ(zzad, obj, obj2, obj3, obj4, null, null, null, 2);
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Exception {
        return zzZ(zzad, obj, obj2, obj3, obj4, obj5, null, null, 3);
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws Exception {
        return zzZ(zzad, obj, obj2, obj3, obj4, obj5, obj6, null, 4);
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) throws Exception {
        return zzZ(zzad, obj, obj2, obj3, obj4, obj5, obj6, obj7, 5);
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2, Object[] objArr) throws Exception {
        if (objArr.length == zzad.zzAE().length && !zzad.zzAI()) {
            return zzY(zzad, obj, obj2, objArr);
        }
        Object[] objArrZzZ = zzZ(zzad);
        Object objZzZ = zzZ(zzad, objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            zzZ(objArrZzZ, objZzZ, objArr[i], i);
        }
        zzZ(zzad, objArrZzZ, objZzZ, objArr.length);
        return zzY(zzad, obj, obj2, objArrZzZ);
    }

    private static Object zzZ(zzAD zzad, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) throws Exception {
        Object[] objArrZzZ = zzZ(zzad);
        Object objZzZ = zzZ(zzad, i);
        zzZ(objArrZzZ, objZzZ, obj3, 0, i);
        zzZ(objArrZzZ, objZzZ, obj4, 1, i);
        zzZ(objArrZzZ, objZzZ, obj5, 2, i);
        zzZ(objArrZzZ, objZzZ, obj6, 3, i);
        zzZ(objArrZzZ, objZzZ, obj7, 4, i);
        zzZ(zzad, objArrZzZ, objZzZ, i);
        return zzY(zzad, obj, obj2, objArrZzZ);
    }

    private static Object[] zzZ(zzAD zzad) {
        int length = zzad.zzAE().length;
        return length == 0 ? zzz8 : new Object[length];
    }

    private static Object zzZ(zzAD zzad, int i) {
        if (!zzad.zzAI()) {
            return null;
        }
        return zzZZO.zzY(zzad.zzAE()[r0.length - 1].zzwU().getType(), zzad.zzV6(i));
    }

    private static void zzZ(Object[] objArr, Object obj, Object obj2, int i, int i2) {
        if (i < i2) {
            zzZ(objArr, obj, obj2, i);
        }
    }

    private static void zzZ(Object[] objArr, Object obj, Object obj2, int i) {
        int length = objArr.length - 1;
        if (i >= length && (i != length || obj != null)) {
            zzZZO.zzZ(obj, i - length, obj2);
        } else {
            objArr[i] = obj2;
        }
    }

    private static void zzZ(zzAD zzad, Object[] objArr, Object obj, int i) {
        if (obj != null) {
            objArr[objArr.length - 1] = obj;
        }
        while (i < objArr.length) {
            zz6P zz6p = zzad.zzAE()[i];
            if (!zz6p.isVarArgs()) {
                objArr[i] = zz6p.getDefaultValue();
            }
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzAF
    public final void zzZ(zzAD zzad, Object obj, Object obj2, Object obj3) throws Exception {
        if (zzad.zzAG() == 6) {
            ((Field) obj).set(obj2, obj3);
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: binding");
    }
}
