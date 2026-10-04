package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.FieldType;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.uz */
/* JADX INFO: loaded from: classes5.dex */
public class C12272uz {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC6747ar f41043k4 = C12555c5.m58553k4("IBM437");

    /* JADX INFO: renamed from: x1 */
    private static final AbstractC6747ar f41045x1 = C12555c5.m58553k4("UTF-8");

    /* JADX INFO: renamed from: kk */
    private static final C14050ca f41044kk = new C14050ca();

    /* JADX INFO: renamed from: k4 */
    public static int m57394k4(AbstractC3150x6 abstractC3150x6) {
        try {
            return m57395k4(abstractC3150x6, "nul");
        } catch (C12253du unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static int m57406kk(C14084qq c14084qq) {
        c14084qq.m67145ne().CloneTo(c14084qq);
        m57410x1(c14084qq.Clone()).CloneTo(c14084qq);
        return (int) (((long) ((((c14084qq.m67147to() << 11) & 63488) | ((c14084qq.m67126ck() / 2) & 31) | ((c14084qq.m67144m9() << 5) & 2016)) & 65535)) | (((long) (((((c14084qq.m67153x1() & 31) | ((c14084qq.m67129dy() << 5) & 480)) | (((c14084qq.m67158yj() - 1980) << 9) & 65024)) & 65535) << 16)) & 4294967295L));
    }

    /* JADX INFO: renamed from: x1 */
    private static char m57408x1(int i) {
        return (char) (f41044kk.m66547k4(26) + i);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m57395k4(AbstractC3150x6 abstractC3150x6, String str) {
        byte[] bArr = new byte[4];
        if (abstractC3150x6.read(bArr, 0, 4) == 4) {
            return ((((((bArr[3] & 255) * 256) + (bArr[2] & 255)) * 256) + (bArr[1] & 255)) * 256) + (bArr[0] & 255);
        }
        throw new C12253du(C14113y2.m67402k4(str, Long.valueOf(abstractC3150x6.getPosition())));
    }

    /* JADX INFO: renamed from: kk */
    public static byte[] m57407kk(String str) {
        return m57405k4(str, f41043k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m57409x1(AbstractC3150x6 abstractC3150x6) {
        return m57395k4(abstractC3150x6, "Could not read block - no data!  (position 0x{0:X8})");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m57396k4(AbstractC3150x6 abstractC3150x6, byte[] bArr, int i, int i2, String str) {
        return abstractC3150x6.read(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public static C14084qq m57410x1(C14084qq c14084qq) {
        return c14084qq;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m57397k4(AbstractC3150x6 abstractC3150x6, int i) {
        long position = abstractC3150x6.getPosition();
        char c = 3;
        byte[] bArr = {(byte) (i >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)};
        int i2 = 65536;
        byte[] bArr2 = new byte[65536];
        boolean z = false;
        while (true) {
            int i3 = abstractC3150x6.read(bArr2, 0, i2);
            if (i3 == 0) {
                break;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr2[i4] == bArr[c]) {
                    long position2 = abstractC3150x6.getPosition();
                    abstractC3150x6.seek(i4 - i3, 1);
                    boolean z2 = m57394k4(abstractC3150x6) == i;
                    if (z2) {
                        z = z2;
                        break;
                    }
                    abstractC3150x6.seek(position2, 0);
                    z = z2;
                }
                i4++;
                c = 3;
            }
            if (z) {
                break;
            }
            c = 3;
            i2 = 65536;
        }
        if (z) {
            return (abstractC3150x6.getPosition() - position) - 4;
        }
        abstractC3150x6.seek(position, 0);
        return -1L;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m57411x1(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() < 2) {
            return C14113y2.m67393k4(str, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        }
        if (str.charAt(1) == ':' && str.charAt(2) == '\\') {
            str = C14113y2.m67422kk(str, 3);
        }
        return C14113y2.m67393k4(str, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14084qq m57398k4(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (i == 65535 || i == 0) {
            return new C14084qq(1995, 1, 1, 0, 0, 0, 0);
        }
        short s = (short) (65535 & i);
        short s2 = (short) ((((long) i) & 4294901760L) >> 16);
        int i13 = ((65024 & s2) >> 9) + FieldType.FIELD_CITATION;
        int i14 = (s2 & 480) >> 5;
        int i15 = s2 & 31;
        int i16 = (63488 & s) >> 11;
        int i17 = (s & 2016) >> 5;
        int i18 = (s & 31) * 2;
        boolean z = false;
        if (i18 >= 60) {
            i17++;
            i2 = 0;
        } else {
            i2 = i18;
        }
        if (i17 >= 60) {
            i16++;
            i3 = 0;
        } else {
            i3 = i17;
        }
        if (i16 >= 24) {
            i15++;
            i4 = 0;
        } else {
            i4 = i16;
        }
        int i19 = i15;
        C14084qq c14084qqClone = C14084qq.m67081jd().Clone();
        try {
            i10 = i4;
            i11 = i3;
            i12 = i2;
        } catch (ArgumentOutOfRangeException unused) {
        }
        try {
            z = true;
            c14084qqClone = new C14084qq(i13, i14, i19, i10, i11, i12, 0);
        } catch (ArgumentOutOfRangeException unused2) {
            i4 = i10;
            i3 = i11;
            i2 = i12;
            if (i13 == 1980 && i14 == 0 && i19 == 0) {
                try {
                    try {
                        z = true;
                        c14084qqClone = new C14084qq(FieldType.FIELD_CITATION, 1, 1, i4, i3, i2, 0);
                    } catch (ArgumentOutOfRangeException unused3) {
                        z = true;
                        c14084qqClone = new C14084qq(FieldType.FIELD_CITATION, 1, 1, 0, 0, 0, 0);
                    }
                } catch (ArgumentOutOfRangeException unused4) {
                }
            } else {
                while (i13 < 1980) {
                    i13++;
                }
                while (i13 > 2030) {
                    i13--;
                }
                while (i14 < 1) {
                    i14++;
                }
                while (i14 > 12) {
                    i14--;
                }
                while (i19 < 1) {
                    i19++;
                }
                while (i19 > 28) {
                    i19--;
                }
                while (i3 < 0) {
                    i3++;
                }
                int i20 = i3;
                while (i20 > 59) {
                    i20--;
                }
                while (i2 < 0) {
                    i2++;
                }
                int i21 = i2;
                while (i21 > 59) {
                    i21--;
                }
                try {
                    i5 = i20;
                    i6 = i21;
                    i7 = i13;
                    i8 = i14;
                    i9 = i19;
                    int i22 = i4;
                    try {
                        z = true;
                        c14084qqClone = new C14084qq(i7, i8, i9, i22, i5, i6, 0);
                    } catch (ArgumentOutOfRangeException unused5) {
                        i4 = i22;
                    }
                } catch (ArgumentOutOfRangeException unused6) {
                    i5 = i20;
                    i6 = i21;
                    i7 = i13;
                    i8 = i14;
                    i9 = i19;
                }
                i13 = i7;
                i14 = i8;
                i19 = i9;
                i3 = i5;
                i2 = i6;
            }
        }
        if (z) {
            return c14084qqClone;
        }
        throw new C12247b3(C14113y2.m67402k4("Bad date/time format in the zip file. ({0})", C14113y2.m67402k4("y({0}) m({1}) d({2}) h({3}) m({4}) s({5})", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i19), Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2))));
    }

    /* JADX INFO: renamed from: k4 */
    public static C14084qq m57399k4(C14084qq c14084qq) {
        return c14084qq;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m57400k4() {
        String strM67408k4;
        do {
            strM67408k4 = C14113y2.m67408k4("DotNetZip-", m57401k4(8, 97), ".tmp");
        } while (C3131h4.m13361kk(strM67408k4));
        return strM67408k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m57401k4(int i, int i2) {
        boolean z = i2 == 0;
        String str = C14113y2.f47374k4;
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (z) {
                i2 = f41044kk.m66547k4(2) == 0 ? 65 : 97;
            }
            cArr[i3] = m57408x1(i2);
        }
        return C14113y2.m67405k4(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m57402k4(String str) {
        if (C14113y2.m67448x1(str, "./")) {
            str = C14113y2.m67422kk(str, 2);
        }
        return new C12380dy("^(.*/)b?([^/\\\\.]+/\\\\.\\\\./)(.+)$").m57987kk(C14113y2.m67401k4(str, "/./", "/"), "$1$3");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m57403k4(byte[] bArr) {
        return m57404k4(bArr, f41045x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m57404k4(byte[] bArr, AbstractC6747ar abstractC6747ar) {
        return abstractC6747ar.mo26682x1(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m57405k4(String str, AbstractC6747ar abstractC6747ar) {
        return abstractC6747ar.mo26677to(str);
    }
}
