package com.aspose.slides.internal.p294n9;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C6767lr {

    /* JADX INFO: renamed from: k4 */
    private static final Hashtable f18698k4 = Hashtable.sync(new Hashtable(AbstractC14070jw.m66789to()));

    /* JADX INFO: renamed from: x1 */
    private static volatile AtomicReferenceArray<C6764kk> f18702x1 = new AtomicReferenceArray<>(8);

    /* JADX INFO: renamed from: kk */
    private static final String f18699kk = C14113y2.m67408k4("ansi_x3.4-1968", "ansi_x3.4-1986", "ascii", "cp367", "cp819", "csascii", "csisolatin1", "csunicode11utf7", "ibm367", "ibm819", "iso-10646-ucs-2", "iso-8859-1", "iso-ir-100", "iso-ir-6", "iso646-us", "iso8859-1", "iso_646.irv:1991", "iso_8859-1", "iso_8859-1:1987", "l1", "latin1", "ucs-2", "unicode", "unicode-1-1-utf-7", "unicode-1-1-utf-8", "unicode-2-0-utf-7", "unicode-2-0-utf-8", "unicodefffe", "us", "us-ascii", "utf-16", "utf-16be", "utf-16le", "utf-32", "utf-32be", "utf-32le", "utf-7", "utf-8", "x-unicode-1-1-utf-7", "x-unicode-1-1-utf-8", "x-unicode-2-0-utf-7", "x-unicode-2-0-utf-8");

    /* JADX INFO: renamed from: to */
    private static final int[] f18701to = {0, 14, 28, 33, 38, 43, 50, 61, 76, 82, 88, 103, 113, 123, 131, 140, 149, 165, 175, 190, 192, 198, 203, 210, 227, 244, StyleIdentifier.INTENSE_EMPHASIS, StyleIdentifier.GRID_TABLE_6_COLORFUL, StyleIdentifier.GRID_TABLE_3_ACCENT_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6, StyleIdentifier.LIST_TABLE_6_COLORFUL, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3, StyleIdentifier.LIST_TABLE_4_ACCENT_4, StyleIdentifier.MENTION, 391, 410, 429};

    /* JADX INFO: renamed from: du */
    private static final int[] f18693du = {20127, 20127, 20127, 20127, 28591, 20127, 28591, 65000, 20127, 28591, 1200, 28591, 28591, 20127, 20127, 28591, 20127, 28591, 28591, 28591, 28591, 1200, 1200, 65000, 65001, 65000, 65001, 1201, 20127, 20127, 1200, 1201, 1200, 12000, 12001, 12000, 65000, 65001, 65000, 65001, 65000, 65001};

    /* JADX INFO: renamed from: h4 */
    private static final int[] f18696h4 = {1200, 1201, 12000, 12001, 20127, 28591, 65000, 65001};

    /* JADX INFO: renamed from: m9 */
    private static final int[] f18700m9 = {1200, 1200, 1200, 1200, 1252, 1252, 1200, 1200};

    /* JADX INFO: renamed from: dy */
    private static final String f18694dy = C14113y2.m67408k4("utf-16", "utf-16BE", "utf-32", "utf-32BE", "us-ascii", "iso-8859-1", "utf-7", "utf-8");

    /* JADX INFO: renamed from: c5 */
    private static final int[] f18691c5 = {0, 6, 14, 20, 28, 36, 46, 51, 56};

    /* JADX INFO: renamed from: jd */
    private static final String f18697jd = C14113y2.m67408k4("Unicode", "Unicode (Big-Endian)", "Unicode (UTF-32)", "Unicode (UTF-32 Big-Endian)", "US-ASCII", "Western European (ISO)", "Unicode (UTF-7)", "Unicode (UTF-8)");

    /* JADX INFO: renamed from: ck */
    private static final int[] f18692ck = {0, 7, 27, 43, 70, 78, 100, 115, 130};

    /* JADX INFO: renamed from: fa */
    private static final long[] f18695fa = {512, 0, 0, 0, 257, 771, 257, 771};

    /* JADX INFO: renamed from: k4 */
    public static int m26815k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        Hashtable hashtable = f18698k4;
        Object obj = hashtable.get_Item(str);
        if (obj != null) {
            return ((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue();
        }
        int iM26818x1 = m26818x1(str);
        hashtable.set_Item(str, Integer.valueOf(iM26818x1));
        return iM26818x1;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m26818x1(String str) {
        int i;
        int length = f18701to.length - 2;
        String strM67361du = C14113y2.m67361du(str);
        int i2 = 0;
        while (true) {
            int i3 = length - i2;
            if (i3 <= 3) {
                while (i2 <= length) {
                    String str2 = f18699kk;
                    int[] iArr = f18701to;
                    int i4 = iArr[i2];
                    int i5 = i2 + 1;
                    if (C14113y2.m67426m9(strM67361du, C14113y2.m67443x1(str2, i4, iArr[i5] - i4)) == 0) {
                        i = f18693du[i2];
                    } else {
                        i2 = i5;
                    }
                }
                throw new ArgumentException(C6770qm.m26823k4("'{0}' is not a supported encoding name. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.", str), "name");
            }
            int i6 = (i3 / 2) + i2;
            String str3 = f18699kk;
            int[] iArr2 = f18701to;
            int i7 = iArr2[i6];
            int iM67426m9 = C14113y2.m67426m9(strM67361du, C14113y2.m67443x1(str3, i7, iArr2[i6 + 1] - i7));
            if (iM67426m9 == 0) {
                i = f18693du[i6];
                break;
            }
            if (iM67426m9 < 0) {
                length = i6;
            } else {
                i2 = i6;
            }
        }
        return i & 65535;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6764kk m26816k4(int i) {
        int i2;
        if (i == 1200) {
            i2 = 0;
        } else if (i == 1201) {
            i2 = 1;
        } else if (i == 12000) {
            i2 = 2;
        } else if (i == 12001) {
            i2 = 3;
        } else if (i == 20127) {
            i2 = 4;
        } else if (i != 28591) {
            switch (i) {
                case 65000:
                    i2 = 6;
                    break;
                case 65001:
                    i2 = 7;
                    break;
                default:
                    return null;
            }
        } else {
            i2 = 5;
        }
        C6764kk c6764kk = f18702x1.get(i2);
        if (c6764kk != null) {
            return c6764kk;
        }
        f18702x1.set(i2, m26817k4(i, i2));
        return f18702x1.get(i2);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m26819x1(int i, int i2) {
        String strM26822k4 = C6770qm.m26822k4(C14113y2.m67408k4("Globalization_cp_", C14057f9.m66591x1(i)));
        if (!C14113y2.m67411k4(strM26822k4)) {
            return strM26822k4;
        }
        String str = f18697jd;
        int[] iArr = f18692ck;
        int i3 = iArr[i2];
        return C14113y2.m67443x1(str, i3, iArr[i2 + 1] - i3);
    }

    /* JADX INFO: renamed from: k4 */
    private static C6764kk m26817k4(int i, int i2) {
        int i3 = f18700m9[i2];
        String str = f18694dy;
        int[] iArr = f18691c5;
        int i4 = iArr[i2];
        String strM67443x1 = C14113y2.m67443x1(str, i4, iArr[i2 + 1] - i4);
        return new C6764kk(i, i3, strM67443x1, strM67443x1, strM67443x1, m26819x1(i, i2), f18695fa[i2]);
    }
}
