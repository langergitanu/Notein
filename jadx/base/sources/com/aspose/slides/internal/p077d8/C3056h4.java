package com.aspose.slides.internal.p077d8;

import com.aspose.slides.PatternStyle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.h4 */
/* JADX INFO: loaded from: classes3.dex */
class C3056h4 {

    /* JADX INFO: renamed from: k4 */
    protected static final byte[] f9081k4 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};

    /* JADX INFO: renamed from: x1 */
    protected static final byte[] f9082x1 = new byte[256];

    static {
        byte b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = f9082x1;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = -1;
            i++;
        }
        while (true) {
            byte[] bArr2 = f9081k4;
            if (b >= bArr2.length) {
                byte[] bArr3 = f9082x1;
                bArr3[32] = -2;
                bArr3[10] = -2;
                bArr3[13] = -2;
                bArr3[9] = -2;
                bArr3[12] = -2;
                bArr3[61] = -3;
                return;
            }
            f9082x1[bArr2[b]] = b;
            b = (byte) (b + 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static final int m12940k4(InputStream inputStream, boolean z) throws IOException {
        byte b;
        int i = 0;
        do {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return -1;
            }
            b = f9082x1[(byte) i2];
            if (z && (b == -1 || (i > 0 && b > -1))) {
                throw new IOException("Unexpected char");
            }
            if (b == -3) {
                i++;
            }
        } while (b <= -1);
        return b;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m12945x1(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        int iM12940k4;
        boolean z2 = false;
        while (!z2) {
            int iM12940k42 = m12940k4(inputStream, z);
            if (iM12940k42 == -1 || (iM12940k4 = m12940k4(inputStream, z)) == -1) {
                break;
            }
            int[] iArr = {iM12940k42, iM12940k4, m12940k4(inputStream, z), m12940k4(inputStream, z)};
            outputStream.write((iArr[0] << 2) | (iArr[1] >> 4));
            int i = iArr[2];
            if (i != -1) {
                outputStream.write((i >> 2) | (iArr[1] << 4));
                int i2 = iArr[3];
                if (i2 != -1) {
                    outputStream.write((iArr[2] << 6) | i2);
                }
            }
            z2 = true;
        }
        outputStream.flush();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12941k4(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        int i;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && (i = inputStream.read()) != -1) {
            int[] iArr = {i, inputStream.read(), inputStream.read()};
            byte[] bArr = f9081k4;
            outputStream.write(bArr[iArr[0] >> 2]);
            int i3 = iArr[1];
            if (i3 != -1) {
                outputStream.write(bArr[(i3 >> 4) | ((iArr[0] << 4) & 48)]);
                int i4 = iArr[2];
                if (i4 != -1) {
                    outputStream.write(bArr[((iArr[1] << 2) & 60) | (i4 >> 6)]);
                    outputStream.write(bArr[iArr[2] & 63]);
                    i2 += 4;
                    if (!z && i2 >= 76) {
                        outputStream.write(10);
                        i2 = 0;
                    }
                } else {
                    outputStream.write(bArr[(iArr[1] << 2) & 60]);
                }
            } else {
                outputStream.write(bArr[(iArr[0] << 4) & 48]);
                outputStream.write(61);
            }
            outputStream.write(61);
            z2 = true;
            i2 += 4;
            if (!z) {
            }
        }
        if (z && i2 >= 1) {
            outputStream.write(10);
        }
        outputStream.flush();
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m12946x1(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        int i = length % 4;
        if (i != 0) {
            length += 4 - i;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((length * 3) / 4);
        try {
            m12945x1(byteArrayInputStream, byteArrayOutputStream, false);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12942k4(String str) {
        return m12946x1(str.getBytes());
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12943k4(byte[] bArr) {
        return m12944k4(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12944k4(byte[] bArr, int i, int i2, boolean z) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
        int length = bArr.length;
        int i3 = length % 3;
        if (i3 != 0) {
            length += 3 - i3;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((length * 4) / 3);
        try {
            m12941k4(byteArrayInputStream, byteArrayOutputStream, z);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
