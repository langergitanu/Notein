package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGC {

    /* JADX INFO: renamed from: eL */
    private static final zzYGE f50817eL = new zzYGB();

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f50817eL.zzZ(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new zzYGF(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception decoding Hex string: ")), e);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return zzm(bArr, 0, bArr.length);
    }

    public static String zzVE(byte[] bArr) {
        return zzZH(bArr, bArr.length);
    }

    private static String zzZH(byte[] bArr, int i) {
        return zzYGI.zzVG(zzm(bArr, 0, i));
    }

    public static byte[] zzm(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f50817eL.zzZ(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new zzYGD(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception encoding Hex string: ")), e);
        }
    }
}
