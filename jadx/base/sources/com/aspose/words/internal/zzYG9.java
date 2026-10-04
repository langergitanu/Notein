package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYG9 {

    /* JADX INFO: renamed from: eR */
    private static int f50812eR = 4096;

    public static byte[] zzJ(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzY(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static void zzY(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = f50812eR;
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = inputStream.read(bArr, 0, i);
            if (i2 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    public static int zzZ(InputStream inputStream, byte[] bArr) throws IOException {
        return zzZ(inputStream, bArr, bArr.length);
    }

    private static int zzZ(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }
}
