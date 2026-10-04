package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZOU {
    public static void delete(String str) throws IOException {
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            throw new IOException(C20593OooO0Oo.OooO0O0("Can't delete ", str, "."));
        }
    }

    public static byte[] zzVi(String str) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            while (true) {
                try {
                    int i = fileInputStream2.read(bArr);
                    if (i == -1) {
                        fileInputStream2.close();
                        return byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static zzZOS zzVj(String str) throws IOException {
        return new zzZOS(str, 3, 1);
    }

    public static zzZON zzVk(String str) throws Exception {
        return new zzZON(str, (byte) 0);
    }

    public static zzZOS zzVl(String str) throws IOException {
        return new zzZOS(str, 2, 3);
    }

    public static zzZOS zzX(String str, int i, int i2) throws IOException {
        return new zzZOS(str, i, i2);
    }

    public static zzZOS zzY(String str, int i, int i2) throws IOException {
        return new zzZOS(str, i, i2);
    }

    public static boolean zzYb(String str) {
        if (str != null && !"".equals(str)) {
            File file = new File(str);
            if (file.exists() && !file.isDirectory()) {
                return true;
            }
        }
        return false;
    }

    public static String zzZ(String str, zzZO0 zzzo0) throws Exception {
        zzZOO zzzoo;
        zzZOO zzzoo2 = null;
        try {
            zzzoo = new zzZOO(str, zzzo0);
        } catch (Throwable th) {
            th = th;
        }
        try {
            String strZziv = zzzoo.zziv();
            zzzoo.close();
            return strZziv;
        } catch (Throwable th2) {
            th = th2;
            zzzoo2 = zzzoo;
            if (zzzoo2 != null) {
                zzzoo2.close();
            }
            throw th;
        }
    }

    public static zzZOS zzv(String str, int i) throws IOException {
        return zzY(str, i, i == 6 ? 2 : 3);
    }
}
