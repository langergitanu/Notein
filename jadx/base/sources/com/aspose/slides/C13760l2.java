package com.aspose.slides;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p071cz.AbstractC2665b2;
import com.aspose.slides.internal.p071cz.C2867q6;
import com.aspose.slides.internal.p071cz.C2891s1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: renamed from: com.aspose.slides.l2 */
/* JADX INFO: loaded from: classes3.dex */
class C13760l2 extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    public static final String[] f45924k4 = {"0", "?r1 - ?l1", "?b1 - ?t1", "0", "0", "0", "0", "left", "top", "right", "bottom"};

    /* JADX INFO: renamed from: x1 */
    public static final String[] f45925x1 = {"0", "w1", "h1", "0", "0", "0", "0", "l1", "t1", "r1", "b1"};

    /* JADX INFO: renamed from: c5 */
    private f7k[] f45926c5;

    /* JADX INFO: renamed from: ck */
    private C14843yd[] f45927ck;

    /* JADX INFO: renamed from: du */
    private C13791lr[] f45928du;

    /* JADX INFO: renamed from: dy */
    private C0899df[] f45929dy;

    /* JADX INFO: renamed from: h4 */
    private C1253ij[] f45930h4;

    /* JADX INFO: renamed from: jd */
    private C14843yd[] f45931jd;

    /* JADX INFO: renamed from: kk */
    private int f45932kk;

    /* JADX INFO: renamed from: m9 */
    private C14663v4[] f45933m9;

    /* JADX INFO: renamed from: to */
    private C13760l2 f45934to;

    public C13760l2() {
        this.f45932kk = -1;
        this.f45928du = new C13791lr[0];
    }

    /* JADX INFO: renamed from: c5 */
    public final C13760l2 m64255c5() {
        return this.f45934to;
    }

    /* JADX INFO: renamed from: du */
    public final f7k[] m64256du() {
        return this.f45926c5;
    }

    /* JADX INFO: renamed from: dy */
    public final int m64257dy() {
        return this.f45932kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C14843yd[] m64258h4() {
        return this.f45931jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m64259k4(double[] dArr, byte[] bArr, long j) {
        return m64260k4(dArr, bArr, j, new byte[]{0});
    }

    /* JADX INFO: renamed from: kk */
    public final C14663v4[] m64271kk() {
        return this.f45933m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14843yd[] m64272m9() {
        return this.f45927ck;
    }

    /* JADX INFO: renamed from: to */
    public final C0899df[] m64273to() {
        return this.f45929dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m64274x1(double[] dArr, byte[] bArr, long j) {
        return m64260k4(dArr, bArr, j, new byte[]{0}) / 60000.0f;
    }

    public C13760l2(C13791lr[] c13791lrArr, C0899df[] c0899dfArr, C1253ij[] c1253ijArr, C14663v4[] c14663v4Arr, f7k[] f7kVarArr, C14843yd c14843yd, C14843yd c14843yd2) {
        this.f45932kk = 0;
        this.f45928du = c13791lrArr;
        this.f45930h4 = c1253ijArr;
        this.f45933m9 = c14663v4Arr;
        this.f45929dy = c0899dfArr;
        this.f45926c5 = f7kVarArr;
        if (c14843yd != null) {
            this.f45931jd = new C14843yd[]{c14843yd};
            this.f45927ck = new C14843yd[]{c14843yd2};
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static long m64254x1(int i) {
        return (-27273042329612L) - ((long) i);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m64260k4(double[] dArr, byte[] bArr, long j, byte[] bArr2) {
        bArr2[0] = 0;
        if (j >= -27273042329600L) {
            return j <= 27273042316900L ? j : this.f45928du[(int) (j - 27273042316901L)].m64504k4();
        }
        int i = (int) ((-27273042329601L) - j);
        bArr2[0] = bArr[i];
        return (float) dArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ee, code lost:
    
        if (r20 == 0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m64251k4(List<C0899df> list, byte b, long j, long j2, long j3) {
        int i;
        double d;
        double dM67498to;
        double d2;
        double dM67498to2;
        double dM67470dy;
        double d3;
        double dM67498to3;
        if (j < -27273042329600L || j > 27273042316900L || j2 < -27273042329600L || j2 > 27273042316900L || j3 < -27273042329600L || j3 > 27273042316900L) {
            if (b != 1 && b != 0) {
                if (b == 2 && j3 == 1) {
                    if (j != 0) {
                    }
                }
                if (b == 3 && j >= -27273042329600L && j <= 27273042316900L) {
                    return j > 0 ? j2 : j3;
                }
                while (i < list.size()) {
                }
                list.addItem(new C0899df(C14113y2.m67408k4("GT", C14057f9.m66591x1(list.size())), b, j, j2, j3));
                return m64254x1(list.size() - 1);
            }
            if (j != j3) {
                if (j2 != j3) {
                    if (b == 0 && (j == 0 || j2 == 0)) {
                        return 0L;
                    }
                    for (i = 0; i < list.size(); i++) {
                        C0899df c0899df = list.get_Item(i);
                        if (c0899df != null && c0899df.m5079h4() == b && c0899df.m5083kk() == j && c0899df.m5085to() == j2 && c0899df.m5078du() == j3) {
                            return m64254x1(i);
                        }
                    }
                    list.addItem(new C0899df(C14113y2.m67408k4("GT", C14057f9.m66591x1(list.size())), b, j, j2, j3));
                    return m64254x1(list.size() - 1);
                }
                return j;
            }
        }
        switch (b) {
            case 0:
                d = j * j2;
                dM67498to = d / j3;
                if (dM67498to != 0.0d) {
                    double dM67497to = C14116yg.m67497to(dM67498to);
                    if (C14116yg.m67475k4((dM67497to - dM67498to) / (dM67498to + dM67497to)) < 0.01d) {
                        return C7019kk.m27438h4(Double.valueOf(dM67497to), 14);
                    }
                }
                return 0L;
            case 1:
                dM67498to = (j + j2) - j3;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 2:
                d = j + j2;
                dM67498to = d / j3;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 3:
                if (j > 0) {
                }
                break;
            case 4:
                return C14116yg.m67485k4(j);
            case 5:
                dM67498to = C14116yg.m67498to(j2, j) / 2.9088820866572157E-7d;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 6:
                d2 = j;
                dM67498to2 = C14116yg.m67498to(j3, j2);
                dM67470dy = C14116yg.m67470dy(dM67498to2);
                dM67498to = d2 * dM67470dy;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 7:
                d2 = j;
                dM67498to2 = j2 * 2.9088820866572157E-7d;
                dM67470dy = C14116yg.m67470dy(dM67498to2);
                dM67498to = d2 * dM67470dy;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 8:
                return C14116yg.m67486k4(j, j2);
            case 9:
                return C14116yg.m67492kk(j, j2);
            case 10:
                double d4 = j;
                double d5 = j2;
                double d6 = (d5 * d5) + (d4 * d4);
                double d7 = j3;
                d3 = (d7 * d7) + d6;
                dM67498to = C14116yg.m67496rv(d3);
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 11:
                dM67498to = j;
                double d8 = j2;
                if (dM67498to <= d8) {
                    dM67498to = j3;
                    if (d8 <= dM67498to) {
                        dM67498to = d8;
                    }
                }
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 12:
                d2 = j;
                dM67498to3 = C14116yg.m67498to(j3, j2);
                dM67470dy = C14116yg.m67495m9(dM67498to3);
                dM67498to = d2 * dM67470dy;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 13:
                d2 = j;
                dM67498to3 = j2 * 2.9088820866572157E-7d;
                dM67470dy = C14116yg.m67495m9(dM67498to3);
                dM67498to = d2 * dM67470dy;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 14:
                d3 = j;
                dM67498to = C14116yg.m67496rv(d3);
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 15:
                d2 = j;
                dM67470dy = C14116yg.m67466c5(j2 * 2.9088820866572157E-7d);
                dM67498to = d2 * dM67470dy;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            case 16:
                dM67498to = j;
                if (dM67498to != 0.0d) {
                }
                return 0L;
            default:
                dM67498to = 0.0d;
                if (dM67498to != 0.0d) {
                }
                return 0L;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64275x1(C14843yd[] c14843ydArr) {
        this.f45927ck = c14843ydArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m64252k4(String str, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        int i;
        long j;
        if (C14113y2.m67411k4(str)) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) == ' ') {
            i2++;
        }
        if (str.charAt(i2) == '-') {
            do {
                i2++;
                if (i2 >= length) {
                    break;
                }
            } while (str.charAt(i2) == ' ');
            i = -1;
        } else {
            if (str.charAt(i2) == '+') {
                do {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } while (str.charAt(i2) == ' ');
            }
            i = 1;
        }
        long j2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                Integer[] numArr = {0};
                boolean zTryGetValue = dictionary.tryGetValue(str, numArr);
                int iIntValue = numArr[0].intValue();
                if (!zTryGetValue) {
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    int i3 = length - 1;
                    long jCharAt = 0;
                    long j3 = 1;
                    for (char c = '0'; i2 < i3 && str.charAt(i3) >= c && str.charAt(i3) <= '9'; c = '0') {
                        jCharAt = (((long) (str.charAt(i3) - c)) * j3) + jCharAt;
                        j3 *= 10;
                        i3--;
                    }
                    long j4 = jCharAt;
                    if (j4 == 0) {
                        i3++;
                        j = 1;
                    } else {
                        if (i3 == i2 || str.charAt(i3) != 'd') {
                            throw new PptxReadException(C14113y2.m67402k4("Invalid adjustable \"{0}\"", str));
                        }
                        j = j4;
                    }
                    String strM67443x1 = C14113y2.m67443x1(str, i2, i3 - i2);
                    if (C14113y2.m67363du(str, strM67443x1)) {
                        throw new PptxReadException(C14113y2.m67402k4("Invalid adjustable \"{0}\"", str));
                    }
                    list.addItem(null);
                    int i4 = (-list.size()) - 11;
                    dictionary.set_Item(str, Integer.valueOf(i4));
                    list.set_Item(list.size() - 1, new C0899df(str, (byte) 0, m64252k4(strM67443x1, dictionary, list), ((long) i) * j2, j, true));
                    iIntValue = i4;
                }
                return ((long) iIntValue) + (iIntValue < 0 ? -27273042329600L : 27273042316900L);
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i2++;
        }
        return ((long) i) * j2;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1253ij[] m64276x1() {
        return this.f45930h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m64261k4(C12015qq c12015qq) {
        int i = this.f45932kk;
        if (i == 5 || i == -1 || i == 0) {
            return c12015qq;
        }
        AbstractC2665b2 abstractC2665b2M12132k4 = AbstractC2665b2.m12132k4(i, new C2891s1());
        for (C13791lr c13791lr : this.f45928du) {
            abstractC2665b2M12132k4.m12332x1().mo12283k4(c13791lr.m64509kk(), r4.m64504k4());
        }
        C2867q6 c2867q6Mo12133k4 = abstractC2665b2M12132k4.mo12133k4(c12015qq.m56699x1(), c12015qq.m56697kk());
        return new C12015qq((float) c2867q6Mo12133k4.m12482k4(), (float) c2867q6Mo12133k4.m12484x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m64253k4(long j, C0899df[] c0899dfArr, C13791lr[] c13791lrArr, String[] strArr) {
        if (j < -27273042329600L) {
            return j <= -27273042329612L ? C14113y2.m67408k4(MsalUtils.QUERY_STRING_SYMBOL, c0899dfArr[(int) ((-27273042329612L) - j)].m5080k4()) : C14113y2.m67408k4(MsalUtils.QUERY_STRING_SYMBOL, f45925x1[(int) ((-27273042329601L) - j)]);
        }
        if (j <= 27273042316900L) {
            return C13850af.m65104k4(j);
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            return "";
        }
        int i = (int) (j - 27273042316901L);
        int iM67201k4 = AbstractC14092to.m67201k4(strArr, c13791lrArr[i].m64509kk());
        return iM67201k4 > -1 ? C14113y2.m67408k4("$", C14057f9.m66591x1(iM67201k4)) : C14113y2.m67408k4("$", c13791lrArr[i].m64509kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64262k4(int i) {
        this.f45932kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64263k4(C13760l2 c13760l2) {
        this.f45934to = c13760l2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64264k4(C0899df[] c0899dfArr) {
        this.f45929dy = c0899dfArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64265k4(f7k[] f7kVarArr) {
        this.f45926c5 = f7kVarArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64266k4(C1253ij[] c1253ijArr) {
        this.f45930h4 = c1253ijArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64267k4(C13791lr[] c13791lrArr) {
        this.f45928du = c13791lrArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64268k4(C14663v4[] c14663v4Arr) {
        this.f45933m9 = c14663v4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64269k4(C14843yd[] c14843ydArr) {
        this.f45931jd = c14843ydArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13791lr[] m64270k4() {
        return this.f45928du;
    }
}
