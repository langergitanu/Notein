package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12009k4;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Images {
    public static IImage fromData(byte[] bArr) {
        return new yyn(bArr);
    }

    public static IImage fromFile(String str) {
        return new yyn(m1766k4(str));
    }

    public static IImage fromStream(InputStream inputStream) {
        return new yyn(m1765k4(inputStream));
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m1765k4(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = inputStream.read(bArr, 0, 4096);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (IOException unused2) {
                throw new RuntimeException("File not found.");
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m1766k4(String str) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)));
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            throw new RuntimeException("File not found.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static IImage[] m1767k4(C12009k4[] c12009k4Arr) {
        IImage[] iImageArr = new IImage[c12009k4Arr.length];
        for (int i = 0; i < c12009k4Arr.length; i++) {
            iImageArr[i] = new yyn(c12009k4Arr[i]);
        }
        return iImageArr;
    }
}
