package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C9235xv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.o5 */
/* JADX INFO: loaded from: classes3.dex */
class C14215o5 {
    /* JADX INFO: renamed from: k4 */
    private static byte m68333k4(char c) {
        int i;
        if (c <= '9') {
            if (c < '0') {
                throw new Exception("Not hex value.");
            }
            i = c - '0';
        } else if (c <= 'F') {
            if (c < 'A') {
                throw new Exception("Not hex value.");
            }
            i = c - '7';
        } else {
            if (c < 'a' || c > 'f') {
                throw new Exception("Not hex value.");
            }
            i = c - 'W';
        }
        return (byte) i;
    }

    /* JADX INFO: renamed from: k4 */
    public static FontData m68334k4(C9235xv c9235xv) {
        byte[] bArr;
        if (c9235xv == null) {
            return new FontData((String) null);
        }
        String strM44665x1 = c9235xv.m44665x1();
        if (strM44665x1 == null || "".equals(strM44665x1)) {
            bArr = null;
        } else {
            byte[] bArr2 = new byte[10];
            for (int i = 0; i < 10; i++) {
                int i2 = i * 2;
                bArr2[i] = (byte) (((m68333k4(strM44665x1.charAt(i2)) & 255) << 4) + (m68333k4(strM44665x1.charAt(i2 + 1)) & 255));
            }
            bArr = bArr2;
        }
        return new FontData(c9235xv.m44660k4(), c9235xv.m44664to(), c9235xv.m44663kk(), 0, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68335k4(FontData fontData, C9235xv c9235xv) {
        byte[] bArrM1488kk = fontData.m1488kk();
        if (bArrM1488kk != null) {
            c9235xv.m44667x1(C14113y2.m67402k4("{0:x2}{1:x2}{2:x2}{3:x2}{4:x2}{5:x2}{6:x2}{7:x2}{8:x2}{9:x2}", Byte.valueOf(bArrM1488kk[0]), Byte.valueOf(bArrM1488kk[1]), Byte.valueOf(bArrM1488kk[2]), Byte.valueOf(bArrM1488kk[3]), Byte.valueOf(bArrM1488kk[4]), Byte.valueOf(bArrM1488kk[5]), Byte.valueOf(bArrM1488kk[6]), Byte.valueOf(bArrM1488kk[7]), Byte.valueOf(bArrM1488kk[8]), Byte.valueOf(bArrM1488kk[9])));
        }
        c9235xv.m44661k4(fontData.m1490x1());
        c9235xv.m44666x1(fontData.m1485k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68336k4(IFontData iFontData, AbstractC4685kk<C9235xv> abstractC4685kk) {
        if (iFontData == null) {
            return;
        }
        m68337k4(iFontData, abstractC4685kk.invoke());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68337k4(IFontData iFontData, C9235xv c9235xv) {
        if (iFontData == null) {
            c9235xv.m44662k4("");
            return;
        }
        String fontName = iFontData.getFontName();
        c9235xv.m44662k4(fontName != null ? fontName : "");
        m68335k4((FontData) iFontData, c9235xv);
    }
}
