package com.aspose.words.internal;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYPQ {
    static final Class zzVUv = zzwx("javax.crypto.spec.GCMParameterSpec");

    public static AlgorithmParameterSpec zzX(final zzZD5 zzzd5) throws InvalidParameterSpecException {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYPQ.1
            @Override // java.security.PrivilegedAction
            public final Object run() {
                try {
                    zzZAN zzzanZzYc = zzZAN.zzYc(zzzd5);
                    return zzYPQ.zzVUv.getConstructor(Integer.TYPE, byte[].class).newInstance(Integer.valueOf(zzzanZzYc.zzXJX() * 8), zzzanZzYc.zzXJY());
                } catch (NoSuchMethodException unused) {
                    return new InvalidParameterSpecException("no constructor found!");
                } catch (Exception e) {
                    return new InvalidParameterSpecException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("construction failed: ")));
                }
            }
        });
        if (objDoPrivileged instanceof AlgorithmParameterSpec) {
            return (AlgorithmParameterSpec) objDoPrivileged;
        }
        throw ((InvalidParameterSpecException) objDoPrivileged);
    }

    public static Class[] zzXBb() {
        return zzXBc() ? new Class[]{zzVUv, IvParameterSpec.class} : new Class[]{zzYN5.class, IvParameterSpec.class};
    }

    public static boolean zzXBc() {
        return zzVUv != null;
    }

    public static zzZAN zzY(final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYPQ.2
            @Override // java.security.PrivilegedAction
            public final Object run() {
                try {
                    Class cls = zzYPQ.zzVUv;
                    return new zzZAN((byte[]) cls.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]), ((Integer) cls.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue() / 8);
                } catch (Exception e) {
                    return new InvalidParameterSpecException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("cannot process GCMParameterSpec: ")));
                }
            }
        });
        if (objDoPrivileged instanceof zzZAN) {
            return (zzZAN) objDoPrivileged;
        }
        throw ((InvalidParameterSpecException) objDoPrivileged);
    }

    public static boolean zzZ(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = zzVUv;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }

    public static boolean zzh(Class cls) {
        return zzVUv == cls;
    }

    private static Class zzwx(String str) {
        try {
            return zzYPQ.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
