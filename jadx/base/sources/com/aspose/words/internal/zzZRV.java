package com.aspose.words.internal;

import java.io.EOFException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRV {
    public static byte[] zzD(byte[] bArr, int i) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzT(zzzor, i);
        } finally {
            zzzor.close();
        }
    }

    public static byte[] zzT(byte[] bArr, int i, int i2) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzZ(zzzor, i, i2);
        } finally {
            zzzor.close();
        }
    }

    private static InflaterInputStream zzX(int i, zzZOP zzzop) throws Exception {
        if (i == 0) {
            return new InflaterInputStream(new zzZK7(zzzop), new Inflater(true));
        }
        if (i == 1) {
            return new InflaterInputStream(new zzZK7(zzzop), new Inflater(false));
        }
        throw new Exception("Unknown compression method specified.");
    }

    private static byte[] zzY(zzZOP zzzop, int i, int i2) throws Exception {
        if (i == 0) {
            i = (int) zzzop.getLength();
        }
        zzZOR zzzor = new zzZOR(i);
        zzZKB.zzZ(zzX(i2, zzzop), zzzor);
        return zzzor.zzWy();
    }

    public static byte[] zzZ(zzZOP zzzop, int i, int i2) throws Exception {
        try {
            return zzY(zzzop, i, i2);
        } catch (EOFException unused) {
            zzZOR zzzor = new zzZOR(((int) zzzop.getLength()) + 1);
            zzzop.zzH(0L);
            zzZYQ.zzX(zzzop, zzzor);
            zzzor.writeByte((byte) 0);
            zzzor.zzH(0L);
            return zzY(zzzor, i, i2);
        }
    }

    public static boolean zzZN(zzZOP zzzop) {
        try {
            if (zzzop.canRead()) {
                return new zzZRW(zzzop).zzm0();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] zzT(zzZOP zzzop, int i) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzZ(zzzop, zzzor, i);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    private static DeflaterOutputStream zzY(int i, zzZOP zzzop) throws Exception {
        if (i == 0) {
            return new DeflaterOutputStream(new zzZK6(zzzop), new Deflater(-1, true));
        }
        if (i == 1) {
            return new DeflaterOutputStream(new zzZK6(zzzop), new Deflater(-1, false));
        }
        throw new Exception("Unknown compression method specified.");
    }

    public static int zzZ(zzZOP zzzop, zzZOR zzzor, int i) throws Exception {
        int position = (int) zzzor.getPosition();
        DeflaterOutputStream deflaterOutputStreamZzY = zzY(i, zzzor);
        try {
            zzZKB.zzZ(zzzop, deflaterOutputStreamZzY);
            deflaterOutputStreamZzY.finish();
            return ((int) zzzor.getPosition()) - position;
        } catch (Throwable th) {
            deflaterOutputStreamZzY.finish();
            throw th;
        }
    }

    public static void zzZ(byte[] bArr, int i, int i2, zzZOP zzzop) throws Exception {
        int i3 = i2 < 10485760 ? i2 : i2 / 3;
        Deflater deflater = new Deflater();
        deflater.setInput(bArr, i, i2);
        deflater.finish();
        byte[] bArr2 = new byte[i3];
        while (true) {
            int iDeflate = deflater.deflate(bArr2, 0, i3);
            if (iDeflate <= 0) {
                return;
            } else {
                zzzop.write(bArr2, 0, iDeflate);
            }
        }
    }
}
