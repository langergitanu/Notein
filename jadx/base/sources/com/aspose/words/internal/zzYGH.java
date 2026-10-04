package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGH {

    /* JADX INFO: renamed from: eL */
    private static final zzYGE f50821eL = new zzYGG();

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            f50821eL.zzZ(bArr, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new zzYGF(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("unable to decode base64 data: ")), e);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return zzZI(bArr, bArr.length);
    }

    private static byte[] zzZI(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i + 2) / 3) * 4);
        try {
            f50821eL.zzZ(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new zzYGD(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception encoding base64 string: ")), e);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f50821eL.zzZ(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new zzYGF(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("unable to decode base64 string: ")), e);
        }
    }
}
