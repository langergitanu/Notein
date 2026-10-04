package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZS {
    private static ThreadLocal<Boolean> zzdm = new ThreadLocal<Boolean>() { // from class: com.aspose.words.internal.zzZZS.1
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    private static ThreadLocal<Integer> zzdl = new ThreadLocal<Integer>() { // from class: com.aspose.words.internal.zzZZS.2
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Integer initialValue() {
            return 0;
        }
    };
    private static ThreadLocal<zzFU> zzdk = new ThreadLocal<zzFU>() { // from class: com.aspose.words.internal.zzZZS.3
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ zzFU initialValue() {
            return null;
        }
    };

    public static byte[] zzT8(int i) {
        if (zzdk.get() == null) {
            zzdk.set(zzS1.zzRu());
            if (!zzdm.get().booleanValue()) {
                zzdk.get().zz0(SecureRandom.getSeed(i));
            }
        }
        byte[] bArr = new byte[i];
        zzdk.get().nextBytes(bArr);
        return bArr;
    }

    public static zzZOZ zzY(Object... objArr) {
        if (!zzdm.get().booleanValue()) {
            return zzZOZ.zziD();
        }
        if (objArr.length == 0) {
            Object[] objArr2 = {zzdl.get()};
            ThreadLocal<Integer> threadLocal = zzdl;
            threadLocal.set(Integer.valueOf(threadLocal.get().intValue() + 1));
            objArr = objArr2;
        }
        byte[] bArr = new byte[16];
        int i = 0;
        for (Object obj : objArr) {
            zzZ1.zzZ(zzk(obj) ^ zzZQK.zzA(bArr, i), bArr, i);
            i = (i + 4) % 16;
        }
        return new zzZOZ(bArr);
    }

    private static int zzk(Object obj) {
        byte[] bArr = (byte[]) zzZKW.zzZ(obj, byte[].class);
        if (bArr != null) {
            obj = zzZ1.zzZ(bArr, 0, Math.min(256, bArr.length));
        }
        String str = (String) zzZKW.zzZ(obj, String.class);
        if (str != null) {
            return zzIL.zzZ4(str);
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        throw new IllegalStateException("Type of object is not supported.");
    }

    public static boolean zzrR() {
        return zzdm.get().booleanValue();
    }
}
