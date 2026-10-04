package com.aspose.slides.internal.p267m6;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.m6.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6322kk {

    /* JADX INFO: renamed from: du */
    private char f17977du;

    /* JADX INFO: renamed from: k4 */
    private C11683c5 f17978k4;

    /* JADX INFO: renamed from: kk */
    private String f17979kk;

    /* JADX INFO: renamed from: to */
    private String f17980to;

    /* JADX INFO: renamed from: x1 */
    private C11683c5 f17981x1;

    public C6322kk(String str, C6324x1 c6324x1) {
        char c;
        int i;
        if (str.length() == 0) {
            throw XsltException.create("Format cannot be empty.", new String[0]);
        }
        this.f17977du = c6324x1.f17990kk;
        this.f17978k4 = (C11683c5) c6324x1.f17989k4.deepClone();
        C6765kp c6765kp = new C6765kp();
        char cCharAt = this.f17978k4.m55062ne().charAt(0);
        char cCharAt2 = this.f17978k4.m55050ix().charAt(0);
        char cCharAt3 = this.f17978k4.m55038b3().charAt(0);
        char cCharAt4 = this.f17978k4.m55073wy().charAt(0);
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        int iM26807x1 = -1;
        int iM26807x12 = -1;
        while (i3 < str.length()) {
            char cCharAt5 = str.charAt(i3);
            boolean z7 = z;
            if (cCharAt5 != c6324x1.f17992x1) {
                char c2 = c6324x1.f17990kk;
                boolean z8 = z2;
                if (cCharAt5 == c2) {
                    if (z4 && !z6) {
                        throw XsltException.create("Format '{0}' cannot have zero digit symbol after digit symbol after decimal point.", str);
                    }
                    iM26807x12 = c6765kp.m26807x1();
                    c6765kp.m26780k4('0');
                    z = true;
                    z3 = true;
                } else if (cCharAt5 == c6324x1.f17991to) {
                    if (!z7) {
                        throw XsltException.create("Format string should have at least one digit or zero digit.", new String[0]);
                    }
                    if (z8) {
                        throw XsltException.create("Format '{0}' has two pattern separators.", str);
                    }
                    int iM25886k4 = m25886k4(c6765kp, i2, iM26807x1 < 0 ? iM26807x12 + 1 : iM26807x1);
                    this.f17978k4.m55055k4(new int[]{iM25886k4 > 9 ? 0 : iM25886k4});
                    if (z5) {
                        i = 0;
                    } else {
                        i = 0;
                        this.f17978k4.m55075x1(0);
                    }
                    this.f17979kk = c6765kp.toString();
                    c6765kp.m26801k4(i);
                    C11683c5 c11683c5 = (C11683c5) c6324x1.f17989k4.deepClone();
                    this.f17981x1 = c11683c5;
                    c11683c5.m55066to(C14113y2.f47374k4);
                    z2 = true;
                    z6 = true;
                    i2 = 0;
                    z = false;
                    z3 = false;
                    z4 = false;
                    iM26807x1 = -1;
                    iM26807x12 = -1;
                    z5 = false;
                } else if (cCharAt5 != cCharAt) {
                    if (cCharAt5 == cCharAt2) {
                        iM26807x12 = c6765kp.m26807x1();
                        c6765kp.m26780k4(',');
                        i2 = iM26807x12;
                    } else {
                        if (cCharAt5 == cCharAt3) {
                            c = '%';
                        } else if (cCharAt5 == cCharAt4) {
                            c = 8240;
                        } else if (cCharAt5 == '\'') {
                            int iM67434x1 = C14113y2.m67434x1(str, '\'', i3 + 1);
                            iM67434x1 = iM67434x1 < 0 ? str.length() - 1 : iM67434x1;
                            c6765kp.m26793k4(str, i3, (iM67434x1 - i3) + 1);
                            i3 = iM67434x1;
                        } else {
                            if ((('0' <= cCharAt5 && cCharAt5 <= '9') || cCharAt5 == 7) && c2 != '0') {
                                c6765kp.m26780k4((char) 7);
                            }
                            if (C14113y2.m67429to("0#.,%‰Ee\\'\";", cCharAt5) >= 0) {
                                c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_WINDOWS);
                            }
                            c6765kp.m26780k4(cCharAt5);
                        }
                        c6765kp.m26780k4(c);
                    }
                    z = z7;
                } else {
                    if (z5) {
                        throw XsltException.create("Format '{0}' cannot have two decimal separators.", str);
                    }
                    iM26807x1 = c6765kp.m26807x1();
                    c6765kp.m26780k4(FilenameUtils.EXTENSION_SEPARATOR);
                    z5 = true;
                    z = z7;
                    z2 = z8;
                    z3 = false;
                    z4 = false;
                    z6 = false;
                }
                z2 = z8;
            } else {
                if (z3 && z6) {
                    throw XsltException.create("Format '{0}' cannot have digit symbol after zero digit symbol before a decimal point.", str);
                }
                iM26807x12 = c6765kp.m26807x1();
                c6765kp.m26780k4('#');
                z = true;
                z4 = true;
            }
            i3++;
        }
        boolean z9 = z2;
        if (!z) {
            throw XsltException.create("Format string should have at least one digit or zero digit.", new String[0]);
        }
        C11683c5 c11683c52 = z9 ? this.f17981x1 : this.f17978k4;
        int iM25886k42 = m25886k4(c6765kp, i2, iM26807x1 < 0 ? iM26807x12 + 1 : iM26807x1);
        c11683c52.m55055k4(new int[]{iM25886k42 > 9 ? 0 : iM25886k42});
        if (!z5) {
            c11683c52.m55075x1(0);
        }
        String string = c6765kp.toString();
        if (z9) {
            this.f17980to = string;
        } else {
            this.f17979kk = string;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m25886k4(C6765kp c6765kp, int i, int i2) {
        int i3;
        if (i > 0 && i == i2 - 1) {
            c6765kp.m26809x1(i3, 1);
            return 0;
        }
        if (i2 > i) {
            return (i2 - i) - 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m25888k4(double d) {
        C11683c5 c11683c5;
        String str;
        if (d >= 0.0d || (c11683c5 = this.f17981x1) == null) {
            c11683c5 = this.f17978k4;
            str = this.f17979kk;
        } else {
            str = this.f17980to;
        }
        String strM66434k4 = C14044b3.m66434k4(d, str, c11683c5);
        if (this.f17977du == '0') {
            return strM66434k4;
        }
        C6765kp c6765kp = new C6765kp(strM66434k4.length());
        int i = this.f17977du - '0';
        int i2 = 0;
        while (i2 < strM66434k4.length()) {
            char cCharAt = strM66434k4.charAt(i2);
            if ((((long) (cCharAt - '0')) & 4294967295L) <= 9) {
                cCharAt = (char) (cCharAt + ((char) i));
            } else if (cCharAt == 7) {
                i2++;
                cCharAt = strM66434k4.charAt(i2);
            }
            c6765kp.m26780k4(cCharAt);
            i2++;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m25887k4(double d, String str, C6324x1 c6324x1) {
        return new C6322kk(str, c6324x1).m25888k4(d);
    }
}
