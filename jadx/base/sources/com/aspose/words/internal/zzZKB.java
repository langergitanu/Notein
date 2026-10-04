package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKB {
    public static zzZOR zzW(InputStream inputStream) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZ(inputStream, zzzor);
        zzzor.zzH(0L);
        return zzzor;
    }

    public static void zzY(zzZOP zzzop, OutputStream outputStream) throws Exception {
        zzzop.zzH(0L);
        zzZ(zzzop, outputStream);
    }

    public static void zzZ(InputStream inputStream, zzZOP zzzop, int i) throws Exception {
        if (i == 0) {
            return;
        }
        if (i < 0) {
            zzZ(inputStream, zzzop);
            return;
        }
        if (!(zzzop instanceof zzZOR)) {
            byte[] bArr = new byte[4096];
            do {
                int i2 = inputStream.read(bArr, 0, Math.min(4096, i));
                if (i2 <= 0) {
                    break;
                }
                i -= i2;
                zzzop.write(bArr, 0, i2);
            } while (i > 0);
        } else {
            int position = (int) zzzop.getPosition();
            int length = (int) zzzop.getLength();
            int iMin = Math.min(length, position) + i;
            if (iMin > length) {
                zzzop.setLength(iMin);
            }
            byte[] bArrZziA = ((zzZOR) zzzop).zziA();
            do {
                int i3 = inputStream.read(bArrZziA, position, i);
                if (i3 < 0) {
                    break;
                }
                i -= i3;
                position += i3;
            } while (i > 0);
            zzzop.zzH(position);
        }
        zzzop.flush();
    }

    public static byte[] zzZX(zzZOP zzzop) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = zzzop.read(bArr, 0, 4096);
            if (i <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void zzZ(InputStream inputStream, zzZOP zzzop) throws Exception {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i > 0) {
                zzzop.write(bArr, 0, i);
            } else {
                zzzop.flush();
                return;
            }
        }
    }

    public static void zzZ(zzZOP zzzop, OutputStream outputStream) throws Exception {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = zzzop.read(bArr, 0, 8192);
            if (i > 0) {
                outputStream.write(bArr, 0, i);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    public static void zzZ(InputStream inputStream, OutputStream outputStream) throws Exception {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i > 0) {
                outputStream.write(bArr, 0, i);
            } else {
                outputStream.flush();
                return;
            }
        }
    }
}
