package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7836hc;
import com.aspose.slides.internal.p332p7.C8041jv;
import com.aspose.slides.internal.p332p7.C8493p6;
import com.aspose.slides.internal.p332p7.C8541pr;
import com.aspose.slides.internal.p332p7.C8734s2;
import com.aspose.slides.internal.p332p7.C8865tf;
import com.aspose.slides.internal.p332p7.C8904tx;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12381h4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.ControlChar;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes3.dex */
class f7k {

    /* JADX INFO: renamed from: du */
    private long f4996du;

    /* JADX INFO: renamed from: dy */
    private boolean f4997dy;

    /* JADX INFO: renamed from: h4 */
    private byte f4998h4;

    /* JADX INFO: renamed from: kk */
    private byte[] f4999kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f5000m9;

    /* JADX INFO: renamed from: to */
    private long f5001to;

    /* JADX INFO: renamed from: x1 */
    private long[] f5002x1;

    /* JADX INFO: renamed from: k4 */
    public static final C3068ks f4995k4 = new C3068ks("close", "moveTo", "lnTo", "arcTo", "quadBezTo", "cubicBezTo");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f4994c5 = new C7017h4("close", "moveTo", "lnTo", "arcTo", "quadBezTo", "cubicBezTo");

    public f7k() {
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        this.f5001to = 0L;
        this.f4996du = 0L;
        this.f4999kk = new byte[0];
        this.f5002x1 = new long[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static double m6027k4(Dictionary<String, Double> dictionary, String str) {
        return dictionary.get_Item(C14422rx.m70365kk(str)).doubleValue();
    }

    /* JADX INFO: renamed from: du */
    public final byte m6031du() {
        return this.f4998h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m6032h4() {
        return this.f5000m9;
    }

    /* JADX INFO: renamed from: kk */
    public final long m6042kk() {
        return this.f4996du;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m6043m9() {
        return this.f4999kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m6044to() {
        return this.f4997dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m6045x1() {
        return this.f5001to;
    }

    public f7k(List<int[]> list, long j, long j2) {
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        this.f4999kk = new byte[list.size()];
        this.f5002x1 = new long[list.size() * 2];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            byte[] bArr = this.f4999kk;
            int i4 = i + 1;
            if (i3 == 0) {
                bArr[i] = 1;
            } else {
                bArr[i] = 2;
            }
            i = i4;
            int[] iArr = list.get_Item(i3);
            long[] jArr = this.f5002x1;
            int i5 = i2 + 1;
            jArr[i2] = iArr[0];
            i2 += 2;
            jArr[i5] = iArr[1];
        }
        this.f5001to = j;
        this.f4996du = j2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m6033k4(long j, long j2, long j3, long j4, long j5, long j6) {
        int[] iArr = {0, -180, 180, -360};
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((j3 + j) / 2.0d)), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((j4 + j2) / 2.0d)), 14);
        long j7 = iM27462to;
        int i = (j5 <= j7 || j6 < ((long) iM27462to2)) ? (j5 > j7 || j6 <= ((long) iM27462to2)) ? (j5 >= j7 || j6 > ((long) iM27462to2)) ? (j5 < j7 || j6 >= ((long) iM27462to2)) ? 0 : 4 : 3 : 2 : 1;
        long jM67485k4 = C14116yg.m67485k4(j5);
        float fM67485k4 = C14116yg.m67485k4(C14116yg.m67485k4(j6) - ((long) iM27462to2));
        float fM67485k42 = C14116yg.m67485k4(jM67485k4 - j7);
        if (i == 1 && fM67485k4 == 0.0f) {
            return 0;
        }
        if (i == 2 && fM67485k42 == 0.0f) {
            return 90;
        }
        if (i == 3 && fM67485k4 == 0.0f) {
            return 180;
        }
        if (i == 4 && fM67485k42 == 0.0f) {
            return 270;
        }
        if (fM67485k42 == 0.0f) {
            return 0;
        }
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67475k4(C14116yg.m67497to(((C14116yg.m67471fa(fM67485k4 / fM67485k42) * 180.0d) / 3.141592653589793d) + ((double) iArr[i - 1])))), 14);
    }

    /* JADX INFO: renamed from: x1 */
    public final C11896dy m6046x1(C13760l2 c13760l2, double[] dArr, byte[] bArr, float f, float f2, float f3, float f4) {
        C11896dy c11896dy;
        long j;
        long j2;
        byte[] bArr2;
        int i;
        int i2;
        int i3;
        float f5;
        C11896dy c11896dy2;
        float f6;
        int i4;
        float f7;
        float f8;
        float fM64259k4;
        int i5;
        float fM64259k42;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        C11896dy c11896dy3 = new C11896dy();
        double d = ((double) f) / 12700.0d;
        double d2 = ((double) f2) / 12700.0d;
        long j3 = this.f5001to;
        long j4 = j3 > 0 ? j3 : 1L;
        long j5 = this.f4996du;
        if (j5 > 0) {
            c11896dy = c11896dy3;
            j = j3;
            j2 = j5;
        } else {
            c11896dy = c11896dy3;
            j = j3;
            j2 = 1;
        }
        double d3 = j > 0 ? (f3 / j4) / 12700.0f : 7.874015748031496E-5d;
        double d4 = j5 > 0 ? (f4 / j2) / 12700.0f : 7.874015748031496E-5d;
        byte[] bArr3 = this.f4999kk;
        int length = bArr3.length;
        int i6 = 0;
        int i7 = 0;
        float fM64259k43 = 0.0f;
        float fM64259k44 = 0.0f;
        while (i6 < length) {
            byte b = bArr3[i6];
            if (b != 0) {
                if (b == 1) {
                    bArr2 = bArr3;
                    i = length;
                    i2 = i6;
                    int i8 = i7;
                    c11896dy2 = c11896dy;
                    c11896dy2.m55585yj();
                    fM64259k43 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i8])) * d3) + d);
                    fM64259k44 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i8 + 1])) * d4) + d2);
                    i7 = i8 + 2;
                } else if (b == 2) {
                    bArr2 = bArr3;
                    i = length;
                    i2 = i6;
                    int i9 = i7;
                    c11896dy2 = c11896dy;
                    float fM64259k45 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i9])) * d3) + d);
                    float fM64259k46 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i9 + 1])) * d4) + d2);
                    c11896dy2.m55574x1(fM64259k43, fM64259k44, fM64259k45, fM64259k46);
                    fM64259k43 = fM64259k45;
                    i7 = i9 + 2;
                    fM64259k44 = fM64259k46;
                } else if (b != 3) {
                    if (b == 4) {
                        bArr2 = bArr3;
                        i = length;
                        i2 = i6;
                        float f15 = fM64259k43;
                        C11896dy c11896dy4 = c11896dy;
                        float f16 = fM64259k44;
                        float fM64259k47 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7])) * d3) + d);
                        float fM64259k48 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 1])) * d4) + d2);
                        fM64259k4 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 2])) * d3) + d);
                        i5 = i7 + 4;
                        fM64259k42 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 3])) * d4) + d2);
                        f9 = (((fM64259k47 - f15) * 2.0f) / 3.0f) + f15;
                        float f17 = (((fM64259k48 - f16) * 2.0f) / 3.0f) + f16;
                        f10 = (((fM64259k48 - fM64259k42) * 2.0f) / 3.0f) + fM64259k42;
                        f11 = f15;
                        f12 = f16;
                        f13 = (((fM64259k47 - fM64259k4) * 2.0f) / 3.0f) + fM64259k4;
                        f14 = f17;
                        c11896dy2 = c11896dy4;
                    } else if (b != 5) {
                        bArr2 = bArr3;
                        i = length;
                        i2 = i6;
                        i3 = i7;
                        f5 = fM64259k43;
                        c11896dy2 = c11896dy;
                        f6 = fM64259k44;
                    } else {
                        byte[] bArr4 = bArr3;
                        int i10 = length;
                        float fM64259k49 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7])) * d3) + d);
                        float fM64259k410 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 1])) * d4) + d2);
                        float fM64259k411 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 2])) * d3) + d);
                        float fM64259k412 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 3])) * d4) + d2);
                        fM64259k4 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 4])) * d3) + d);
                        i5 = i7 + 6;
                        int i11 = i6;
                        fM64259k42 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 5])) * d4) + d2);
                        f11 = fM64259k43;
                        c11896dy2 = c11896dy;
                        f12 = fM64259k44;
                        f9 = fM64259k49;
                        f10 = fM64259k412;
                        i2 = i11;
                        f14 = fM64259k410;
                        bArr2 = bArr4;
                        i = i10;
                        f13 = fM64259k411;
                    }
                    c11896dy2.m55536k4(f11, f12, f9, f14, f13, f10, fM64259k4, fM64259k42);
                    fM64259k43 = fM64259k4;
                    fM64259k44 = fM64259k42;
                    i7 = i5;
                } else {
                    bArr2 = bArr3;
                    i = length;
                    i2 = i6;
                    float f18 = fM64259k43;
                    c11896dy2 = c11896dy;
                    float f19 = fM64259k44;
                    float fM64259k413 = (float) (((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7])) * d3);
                    float fM64259k414 = (float) (((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i7 + 1])) * d4);
                    int i12 = i7 + 3;
                    int i13 = i7;
                    float fM64274x1 = c13760l2.m64274x1(dArr, bArr, this.f5002x1[i7 + 2]);
                    int i14 = i13 + 4;
                    float fM64274x12 = c13760l2.m64274x1(dArr, bArr, this.f5002x1[i12]);
                    if (C14116yg.m67480k4(fM64259k414) + C14116yg.m67480k4(fM64259k413) < 0.005d) {
                        fM64259k43 = f18;
                        fM64259k44 = f19;
                        i7 = i14;
                    } else {
                        if (fM64259k414 == 0.0f) {
                            fM64259k414 = 1.0E-5f;
                        }
                        float f20 = fM64259k413 != 0.0f ? fM64259k413 : 1.0E-5f;
                        double d5 = ((double) (fM64274x1 / 180.0f)) * 3.141592653589793d;
                        double d6 = d3 / d4;
                        if (d6 < 0.9999d || d6 > 1.0001d) {
                            double d7 = ((double) ((fM64274x1 + fM64274x12) / 180.0f)) * 3.141592653589793d;
                            i4 = i14;
                            double dM67498to = C14116yg.m67498to(C14116yg.m67495m9(d5) * d4, C14116yg.m67470dy(d5) * d3);
                            f7 = (float) ((dM67498to * 180.0d) / 3.141592653589793d);
                            float fM67498to = ((float) ((C14116yg.m67498to(C14116yg.m67495m9(d7) * d4, C14116yg.m67470dy(d7) * d3) * 180.0d) / 3.141592653589793d)) - f7;
                            if (fM64274x12 < 0.0f && fM67498to > 0.0f) {
                                fM67498to -= 360.0f;
                            } else if (fM64274x12 > 0.0f && fM67498to <= 0.0f) {
                                fM67498to += 360.0f;
                            }
                            f8 = fM67498to;
                            d5 = dM67498to;
                        } else {
                            f8 = fM64274x12;
                            f7 = fM64274x1;
                            i4 = i14;
                        }
                        double dM67470dy = C14116yg.m67470dy(d5);
                        double dM67495m9 = C14116yg.m67495m9(d5);
                        double d8 = f20;
                        double d9 = ((dM67470dy * dM67470dy) / d8) / d8;
                        double d10 = dM67495m9 * dM67495m9;
                        double d11 = fM64259k414;
                        double dM67496rv = C14116yg.m67496rv(1.0d / (((d10 / d11) / d11) + d9));
                        c11896dy2 = c11896dy2;
                        c11896dy2.m55535k4(((float) (((double) f18) - (dM67470dy * dM67496rv))) - f20, ((float) (((double) f19) - (dM67496rv * dM67495m9))) - fM64259k414, f20 * 2.0f, fM64259k414 * 2.0f, f7, f8);
                        int iM55525du = c11896dy2.m55525du();
                        if (iM55525du < 2) {
                            fM64259k43 = 0.0f;
                            fM64259k44 = 0.0f;
                        } else {
                            C12025x6 c12025x6Clone = c11896dy2.m55565kk()[iM55525du - 1].Clone();
                            float fM56897x1 = c12025x6Clone.m56897x1();
                            fM64259k44 = c12025x6Clone.m56895kk();
                            fM64259k43 = fM56897x1;
                        }
                        i7 = i4;
                    }
                }
                i6 = i2 + 1;
                c11896dy = c11896dy2;
                bArr3 = bArr2;
                length = i;
            } else {
                bArr2 = bArr3;
                i = length;
                i2 = i6;
                i3 = i7;
                f5 = fM64259k43;
                c11896dy2 = c11896dy;
                f6 = fM64259k44;
                c11896dy2.m55567m9();
            }
            i7 = i3;
            fM64259k43 = f5;
            fM64259k44 = f6;
            i6 = i2 + 1;
            c11896dy = c11896dy2;
            bArr3 = bArr2;
            length = i;
        }
        return c11896dy;
    }

    public f7k(List<Byte> list, List<Long> list2) {
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        this.f5001to = 0L;
        this.f4996du = 0L;
        this.f4999kk = C3085sv.m13110x1(list);
        this.f5002x1 = C3085sv.m13068h4(list2);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m6028k4(String str, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        return C13760l2.m64252k4(str, dictionary, list);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6047x1(long j) {
        this.f4996du = j;
    }

    public f7k(C8541pr c8541pr, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        byte b = 1;
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (C7394ca c7394ca : c8541pr.m39058h4()) {
            int iM27428k4 = f4994c5.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1 || iM27428k4 == 2) {
                i2 += 2;
            } else if (iM27428k4 == 3 || iM27428k4 == 4) {
                i2 += 4;
            } else if (iM27428k4 == 5) {
                i2 += 6;
            }
            i3++;
        }
        this.f5002x1 = new long[i2];
        this.f4999kk = new byte[i3];
        C7394ca[] c7394caArrM39058h4 = c8541pr.m39058h4();
        int length = c7394caArrM39058h4.length;
        int i4 = 0;
        int i5 = 0;
        while (i < length) {
            C7394ca c7394ca2 = c7394caArrM39058h4[i];
            byte bM12963k4 = (byte) f4995k4.m12963k4(c7394ca2.m29539k4());
            int i6 = i4 + 1;
            this.f4999kk[i4] = bM12963k4;
            if (bM12963k4 == b) {
                C7836hc c7836hcM34975k4 = ((C8041jv) c7394ca2.m29542x1()).m34975k4();
                int i7 = i5 + 1;
                this.f5002x1[i5] = m6028k4(c7836hcM34975k4.m33274k4(), dictionary, list);
                i5 += 2;
                this.f5002x1[i7] = m6028k4(c7836hcM34975k4.m33276x1(), dictionary, list);
            } else if (bM12963k4 == 2) {
                C7836hc c7836hcM38624k4 = ((C8493p6) c7394ca2.m29542x1()).m38624k4();
                int i8 = i5 + 1;
                this.f5002x1[i5] = m6028k4(c7836hcM38624k4.m33274k4(), dictionary, list);
                i5 += 2;
                this.f5002x1[i8] = m6028k4(c7836hcM38624k4.m33276x1(), dictionary, list);
            } else if (bM12963k4 == 3) {
                C8734s2 c8734s2 = (C8734s2) c7394ca2.m29542x1();
                this.f5002x1[i5] = m6028k4(c8734s2.m40727k4(), dictionary, list);
                this.f5002x1[i5 + 1] = m6028k4(c8734s2.m40733x1(), dictionary, list);
                int i9 = i5 + 3;
                this.f5002x1[i5 + 2] = m6028k4(c8734s2.m40729kk(), dictionary, list);
                i5 += 4;
                this.f5002x1[i9] = m6028k4(c8734s2.m40731to(), dictionary, list);
            } else if (bM12963k4 == 4) {
                C8904tx c8904tx = (C8904tx) c7394ca2.m29542x1();
                this.f5002x1[i5] = m6028k4(c8904tx.m41977k4().m33274k4(), dictionary, list);
                this.f5002x1[i5 + 1] = m6028k4(c8904tx.m41977k4().m33276x1(), dictionary, list);
                int i10 = i5 + 3;
                this.f5002x1[i5 + 2] = m6028k4(c8904tx.m41978x1().m33274k4(), dictionary, list);
                i5 += 4;
                this.f5002x1[i10] = m6028k4(c8904tx.m41978x1().m33276x1(), dictionary, list);
            } else if (bM12963k4 == 5) {
                C8865tf c8865tf = (C8865tf) c7394ca2.m29542x1();
                this.f5002x1[i5] = m6028k4(c8865tf.m41699k4().m33274k4(), dictionary, list);
                this.f5002x1[i5 + 1] = m6028k4(c8865tf.m41699k4().m33276x1(), dictionary, list);
                this.f5002x1[i5 + 2] = m6028k4(c8865tf.m41701x1().m33274k4(), dictionary, list);
                this.f5002x1[i5 + 3] = m6028k4(c8865tf.m41701x1().m33276x1(), dictionary, list);
                int i11 = i5 + 5;
                this.f5002x1[i5 + 4] = m6028k4(c8865tf.m41700kk().m33274k4(), dictionary, list);
                i5 += 6;
                this.f5002x1[i11] = m6028k4(c8865tf.m41700kk().m33276x1(), dictionary, list);
            }
            i++;
            i4 = i6;
            b = 1;
        }
        this.f5001to = C7019kk.m27438h4(Double.valueOf(c8541pr.m39059k4() * 12700.0d), 14);
        this.f4996du = C7019kk.m27438h4(Double.valueOf(c8541pr.m39067x1() * 12700.0d), 14);
        this.f4998h4 = c8541pr.m39065kk();
        this.f5000m9 = c8541pr.m39066to();
        this.f4997dy = c8541pr.m39057du();
    }

    /* JADX INFO: renamed from: k4 */
    public final GeometryPath m6034k4(C13760l2 c13760l2, double[] dArr, byte[] bArr, float f, float f2, float f3, float f4) {
        GeometryPath geometryPath;
        long j;
        long j2;
        int i;
        double d;
        GeometryPath geometryPath2;
        int i2;
        GeometryPath geometryPath3 = new GeometryPath(m6031du(), m6032h4());
        double d2 = ((double) f) / 12700.0d;
        double d3 = ((double) f2) / 12700.0d;
        long j3 = this.f5001to;
        long j4 = j3 > 0 ? j3 : 1L;
        long j5 = this.f4996du;
        if (j5 > 0) {
            geometryPath = geometryPath3;
            j = j3;
            j2 = j5;
        } else {
            geometryPath = geometryPath3;
            j = j3;
            j2 = 1;
        }
        double d4 = j > 0 ? (f3 / j4) / 12700.0f : 7.874015748031496E-5d;
        double d5 = j5 > 0 ? (f4 / j2) / 12700.0f : 7.874015748031496E-5d;
        byte[] bArr2 = this.f4999kk;
        int length = bArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b = bArr2[i3];
            if (b == 0) {
                i = length;
                d = d2;
                geometryPath2 = geometryPath;
                i2 = i3;
                geometryPath2.closeFigure();
            } else if (b == 1) {
                i = length;
                d = d2;
                geometryPath2 = geometryPath;
                i2 = i3;
                int i5 = i4 + 1;
                float fM64259k4 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4])) * d4) + d);
                i4 += 2;
                geometryPath2.moveTo(fM64259k4, (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i5])) * d5) + d3));
            } else if (b == 2) {
                i = length;
                d = d2;
                geometryPath2 = geometryPath;
                i2 = i3;
                int i6 = i4 + 1;
                float fM64259k42 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4])) * d4) + d);
                i4 += 2;
                geometryPath2.lineTo(fM64259k42, (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i6])) * d5) + d3));
            } else if (b == 3) {
                i = length;
                d = d2;
                geometryPath2 = geometryPath;
                i2 = i3;
                float fM64259k43 = (float) (((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4])) * d4);
                float fM64259k44 = (float) (((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 1])) * d5);
                int i7 = i4 + 3;
                float fM64274x1 = c13760l2.m64274x1(dArr, bArr, this.f5002x1[i4 + 2]);
                i4 += 4;
                geometryPath2.arcTo(fM64259k43, fM64259k44, fM64274x1, c13760l2.m64274x1(dArr, bArr, this.f5002x1[i7]));
            } else if (b == 4) {
                i = length;
                geometryPath2 = geometryPath;
                i2 = i3;
                float fM64259k45 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4])) * d4) + d2);
                float fM64259k46 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 1])) * d5) + d3);
                int i8 = i4 + 3;
                float fM64259k47 = (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 2])) * d4) + d2);
                i4 += 4;
                d = d2;
                geometryPath2.quadraticBezierTo(fM64259k45, fM64259k46, fM64259k47, (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i8])) * d5) + d3));
            } else if (b != 5) {
                i = length;
                d = d2;
                geometryPath2 = geometryPath;
                i2 = i3;
            } else {
                i = length;
                geometryPath2 = geometryPath;
                i2 = i3;
                geometryPath2.cubicBezierTo((float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4])) * d4) + d2), (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 1])) * d5) + d3), (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 2])) * d4) + d2), (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 3])) * d5) + d3), (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 4])) * d4) + d2), (float) ((((double) c13760l2.m64259k4(dArr, bArr, this.f5002x1[i4 + 5])) * d5) + d3));
                i4 += 6;
                d = d2;
            }
            i3 = i2 + 1;
            geometryPath = geometryPath2;
            length = i;
            d2 = d;
        }
        return geometryPath;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f7k(String str, long j, long j2) {
        int i;
        int i2;
        int i3;
        int length;
        int length2;
        int length3;
        int length4;
        byte b = 1;
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        C12381h4 c12381h4M57979x1 = C12380dy.m57979x1(str, "[mMZzLlHhVvCcSsQqTtAa][ 0-9?f-]*");
        byte b2 = 2;
        char[] cArr = {ControlChar.SPACE_CHAR, ','};
        char[] cArr2 = new char[c12381h4M57979x1.m57991k4()];
        String[][] strArr = new String[c12381h4M57979x1.m57991k4()][];
        int i4 = 0;
        int length5 = 0;
        int length6 = 0;
        for (int i5 = 0; i5 < c12381h4M57979x1.m57991k4(); i5++) {
            cArr2[i5] = c12381h4M57979x1.m57992k4(i5).mo57995kk().charAt(0);
            String[] strArrM67369h4 = C14113y2.m67369h4(C14113y2.m67440x1(C14113y2.m67401k4(C14113y2.m67396k4(c12381h4M57979x1.m57992k4(i5).mo57995kk(), 0, 1), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, " -")), cArr);
            strArr[i5] = strArrM67369h4;
            switch (cArr2[i5]) {
                case 'A':
                case 'a':
                    length6 += strArrM67369h4.length / 6;
                    length = strArrM67369h4.length / 3;
                    length5 += length;
                    break;
                case 'C':
                case 'c':
                    length2 = strArrM67369h4.length / 6;
                    length6 += length2;
                    length5 += strArrM67369h4.length;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    length6 += strArrM67369h4.length;
                    length = strArrM67369h4.length * 2;
                    length5 += length;
                    break;
                case 'L':
                case 'M':
                case 'l':
                case 'm':
                    length2 = strArrM67369h4.length / 2;
                    length6 += length2;
                    length5 += strArrM67369h4.length;
                    break;
                case 'Q':
                case 'q':
                    length2 = strArrM67369h4.length / 4;
                    length6 += length2;
                    length5 += strArrM67369h4.length;
                    break;
                case 'S':
                case 's':
                    length6 += strArrM67369h4.length / 4;
                    length3 = strArrM67369h4.length;
                    length4 = strArrM67369h4.length / 4;
                    length = (length4 * 2) + length3;
                    length5 += length;
                    break;
                case 'T':
                case 't':
                    length6 += strArrM67369h4.length / 2;
                    length3 = strArrM67369h4.length;
                    length4 = strArrM67369h4.length / 2;
                    length = (length4 * 2) + length3;
                    length5 += length;
                    break;
                case 'Z':
                case 'z':
                    length6++;
                    break;
            }
        }
        this.f5002x1 = new long[length5];
        this.f4999kk = new byte[length6];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        long j3 = 0;
        long jM66866du = 0;
        while (i6 < c12381h4M57979x1.m57991k4()) {
            cArr2[i6] = c12381h4M57979x1.m57992k4(i6).mo57995kk().charAt(i4);
            strArr[i6] = C14113y2.m67369h4(C14113y2.m67440x1(C14113y2.m67401k4(C14113y2.m67396k4(c12381h4M57979x1.m57992k4(i6).mo57995kk(), i4, b), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, " -")), cArr);
            char c = cArr2[i6];
            byte b3 = b;
            byte b4 = b2;
            if (c == 'C') {
                int i9 = 0;
                while (true) {
                    String[] strArr2 = strArr[i6];
                    if (i9 < strArr2.length) {
                        if (i9 % 6 == 0) {
                            int i10 = i7 + 1;
                            this.f4999kk[i7] = 5;
                            if (i9 != 0) {
                                long[] jArr = this.f5002x1;
                                j3 = jArr[i8 - 2];
                                jM66866du = jArr[i8 - 1];
                            }
                            i7 = i10;
                        }
                        if (i9 % 2 == 0) {
                            i = i8 + 1;
                            this.f5002x1[i8] = C14080ne.m66866du(strArr2[i9]) + (cArr2[i6] == 'C' ? 0L : j3);
                        } else {
                            i = i8 + 1;
                            this.f5002x1[i8] = C14080ne.m66866du(strArr2[i9]) + (cArr2[i6] == 'C' ? 0L : jM66866du);
                        }
                        i8 = i;
                        i9++;
                    } else {
                        long[] jArr2 = this.f5002x1;
                        j3 = jArr2[i8 - 2];
                        jM66866du = jArr2[i8 - 1];
                    }
                }
            } else if (c == 'H') {
                int i11 = 0;
                while (true) {
                    String[] strArr3 = strArr[i6];
                    if (i11 < strArr3.length) {
                        int i12 = i7 + 1;
                        this.f4999kk[i7] = b4;
                        long[] jArr3 = this.f5002x1;
                        int i13 = i8 + 1;
                        long jM66866du2 = C14080ne.m66866du(strArr3[i11]);
                        if (cArr2[i6] == 'H') {
                            j3 = 0;
                        }
                        jArr3[i8] = jM66866du2 + j3;
                        long[] jArr4 = this.f5002x1;
                        j3 = jArr4[i8];
                        i8 += 2;
                        jArr4[i13] = jM66866du;
                        i11++;
                        i7 = i12;
                    }
                }
            } else if (c == 'Q') {
                int i14 = 0;
                while (true) {
                    String[] strArr4 = strArr[i6];
                    if (i14 < strArr4.length) {
                        if (i14 % 4 == 0) {
                            int i15 = i7 + 1;
                            this.f4999kk[i7] = 4;
                            if (i14 != 0) {
                                long[] jArr5 = this.f5002x1;
                                j3 = jArr5[i8 - 2];
                                jM66866du = jArr5[i8 - 1];
                            }
                            i7 = i15;
                        }
                        if (i14 % 2 == 0) {
                            i2 = i8 + 1;
                            this.f5002x1[i8] = C14080ne.m66866du(strArr4[i14]) + (cArr2[i6] == 'Q' ? 0L : j3);
                        } else {
                            i2 = i8 + 1;
                            this.f5002x1[i8] = C14080ne.m66866du(strArr4[i14]) + (cArr2[i6] == 'Q' ? 0L : jM66866du);
                        }
                        i8 = i2;
                        i14++;
                    } else {
                        long[] jArr6 = this.f5002x1;
                        j3 = jArr6[i8 - 2];
                        jM66866du = jArr6[i8 - 1];
                    }
                }
            } else if (c == 'V') {
                int i16 = 0;
                while (true) {
                    String[] strArr5 = strArr[i6];
                    if (i16 < strArr5.length) {
                        int i17 = i7 + 1;
                        this.f4999kk[i7] = b4;
                        long[] jArr7 = this.f5002x1;
                        int i18 = i8 + 1;
                        jArr7[i8] = j3;
                        i8 += 2;
                        jArr7[i18] = C14080ne.m66866du(strArr5[i16]) + (cArr2[i6] == 'V' ? 0L : jM66866du);
                        jM66866du = C14080ne.m66866du(strArr[i6][i16]) + jM66866du;
                        i16++;
                        i7 = i17;
                    }
                }
            } else if (c == 'Z') {
                i7++;
            } else if (c != 'c') {
                if (c != 'h') {
                    if (c != 'q') {
                        if (c != 'v') {
                            if (c != 'z') {
                                if (c == 'L') {
                                    int i19 = 0;
                                    while (true) {
                                        String[] strArr6 = strArr[i6];
                                        if (i19 < strArr6.length) {
                                            if (i19 % 2 == 0) {
                                                int i20 = i7 + 1;
                                                this.f4999kk[i7] = b4;
                                                int i21 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr6[i19]) + (cArr2[i6] == 'L' ? 0L : j3);
                                                i7 = i20;
                                                j3 = this.f5002x1[i8];
                                                i8 = i21;
                                            } else {
                                                int i22 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr6[i19]) + (cArr2[i6] == 'L' ? 0L : jM66866du);
                                                i8 = i22;
                                                jM66866du = C14080ne.m66866du(strArr[i6][i19]) + jM66866du;
                                            }
                                            i19++;
                                        }
                                    }
                                } else if (c == 'M') {
                                    int i23 = 0;
                                    while (true) {
                                        String[] strArr7 = strArr[i6];
                                        if (i23 < strArr7.length) {
                                            if (i23 % 2 == 0) {
                                                int i24 = i7 + 1;
                                                this.f4999kk[i7] = b3;
                                                int i25 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr7[i23]) + (cArr2[i6] == 'M' ? 0L : j3);
                                                i7 = i24;
                                                j3 = this.f5002x1[i8];
                                                i8 = i25;
                                            } else {
                                                int i26 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr7[i23]) + (cArr2[i6] == 'M' ? 0L : jM66866du);
                                                i8 = i26;
                                                jM66866du = C14080ne.m66866du(strArr[i6][i23]) + jM66866du;
                                            }
                                            i23++;
                                        }
                                    }
                                } else if (c == 'S') {
                                    int i27 = 0;
                                    while (true) {
                                        String[] strArr8 = strArr[i6];
                                        if (i27 < strArr8.length) {
                                            if (i27 % 4 == 0) {
                                                int i28 = i7 + 1;
                                                this.f4999kk[i7] = 5;
                                                long[] jArr8 = this.f5002x1;
                                                jArr8[i8] = j3;
                                                int i29 = i8 + 2;
                                                jArr8[i8 + 1] = jM66866du;
                                                if (i27 != 0) {
                                                    j3 = jArr8[i8];
                                                    jM66866du = jArr8[i8 + 1];
                                                }
                                                i8 = i29;
                                                i7 = i28;
                                            }
                                            if (i27 % 2 == 0) {
                                                i3 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr8[i27]) + (cArr2[i6] == 'S' ? 0L : j3);
                                            } else {
                                                i3 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr8[i27]) + (cArr2[i6] == 'S' ? 0L : jM66866du);
                                            }
                                            i8 = i3;
                                            i27++;
                                        } else {
                                            long[] jArr9 = this.f5002x1;
                                            j3 = jArr9[i8 - 2];
                                            jM66866du = jArr9[i8 - 1];
                                        }
                                    }
                                } else if (c == 'T') {
                                    int i30 = 0;
                                    while (true) {
                                        String[] strArr9 = strArr[i6];
                                        if (i30 < strArr9.length) {
                                            if (i30 % 2 == 0) {
                                                int i31 = i7 + 1;
                                                this.f4999kk[i7] = 4;
                                                long[] jArr10 = this.f5002x1;
                                                jArr10[i8] = j3;
                                                int i32 = i8 + 2;
                                                jArr10[i8 + 1] = jM66866du;
                                                if (i30 != 0) {
                                                    j3 = jArr10[i8];
                                                    jM66866du = jArr10[i8 + 1];
                                                }
                                                i8 += 3;
                                                jArr10[i32] = C14080ne.m66866du(strArr9[i30]) + (cArr2[i6] == 'T' ? 0L : j3);
                                                i7 = i31;
                                            } else {
                                                int i33 = i8 + 1;
                                                this.f5002x1[i8] = C14080ne.m66866du(strArr9[i30]) + (cArr2[i6] == 'T' ? 0L : jM66866du);
                                                i8 = i33;
                                            }
                                            i30++;
                                        } else {
                                            long[] jArr11 = this.f5002x1;
                                            j3 = jArr11[i8 - 2];
                                            jM66866du = jArr11[i8 - 1];
                                        }
                                    }
                                } else if (c != 'l') {
                                    if (c != 'm') {
                                        if (c != 's') {
                                            if (c != 't') {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i6++;
            b2 = b4;
            b = b3;
            i4 = 0;
        }
        this.f5001to = j;
        this.f4996du = j2;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m6035k4(C0899df[] c0899dfArr, C13791lr[] c13791lrArr, String[] strArr) {
        String strM67400k4;
        String strM67408k4;
        String strM67400k42 = this.f4998h4 == 0 ? " F" : "";
        if (!this.f5000m9) {
            strM67400k42 = C14113y2.m67400k4(strM67400k42, " S");
        }
        int i = 0;
        for (byte b : this.f4999kk) {
            if (b != 0) {
                if (b == 1) {
                    strM67400k4 = C14113y2.m67400k4(C14113y2.m67400k4(strM67400k42, " M"), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i], c0899dfArr, c13791lrArr, strArr)));
                    strM67408k4 = C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 1], c0899dfArr, c13791lrArr, strArr));
                } else if (b == 2) {
                    strM67400k4 = C14113y2.m67400k4(C14113y2.m67400k4(strM67400k42, " L"), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i], c0899dfArr, c13791lrArr, strArr)));
                    strM67408k4 = C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 1], c0899dfArr, c13791lrArr, strArr));
                } else if (b == 3) {
                    i += 4;
                } else if (b == 4) {
                    strM67400k42 = C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(strM67400k42, " Q"), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 1], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 2], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 3], c0899dfArr, c13791lrArr, strArr)));
                    i += 4;
                } else if (b == 5) {
                    strM67400k42 = C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(strM67400k42, " C"), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 1], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 2], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 3], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 4], c0899dfArr, c13791lrArr, strArr))), C14113y2.m67408k4(" ", C13760l2.m64253k4(this.f5002x1[i + 5], c0899dfArr, c13791lrArr, strArr)));
                    i += 6;
                }
                strM67400k42 = C14113y2.m67400k4(strM67400k4, strM67408k4);
                i += 2;
            } else {
                strM67400k42 = C14113y2.m67400k4(strM67400k42, " Z");
            }
        }
        return C14113y2.m67440x1(strM67400k42);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0157. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f7k(String str, long j, long j2, C0735a7 c0735a7, Dictionary<String, Integer> dictionary, List<C0899df> list, Dictionary<String, Double> dictionary2) {
        int i;
        long[] jArr;
        List<Long> list2;
        char[] cArr;
        C0735a7 c0735a72;
        int i2;
        int i3;
        C12381h4 c12381h4;
        char[] cArr2;
        int i4;
        twr twrVar;
        long[] jArr2;
        byte[] bArr;
        int i5;
        int i6;
        C13760l2 c13760l2;
        int i7;
        boolean zM66436k4;
        boolean zM66436k42;
        boolean zM66436k43;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        C12381h4 c12381h42;
        double dM67015to;
        long j3 = j;
        Dictionary<String, Double> dictionary3 = dictionary2;
        int i8 = 1;
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        C12381h4 c12381h4M57979x1 = C12380dy.m57979x1(str, "[ABCFLMNQSTUVWXYZ][^ABCFLMNQSTUVWXYZ]+");
        char[] cArr3 = {ControlChar.SPACE_CHAR, ','};
        char[] cArr4 = new char[c12381h4M57979x1.m57991k4()];
        twr twrVar2 = new twr(new String[c12381h4M57979x1.m57991k4()][]);
        int i9 = 2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i10 >= c12381h4M57979x1.m57991k4()) {
                i = i8;
                i10 = Integer.MIN_VALUE;
                break;
            }
            if (i11 != 0 && i12 != 0 && i13 != 0) {
                i = i8;
                break;
            }
            cArr4[i10] = c12381h4M57979x1.m57992k4(i10).mo57995kk().charAt(0);
            twrVar2.m71371k4(i10, C14113y2.m67369h4(C14113y2.m67440x1(C14113y2.m67422kk(c12381h4M57979x1.m57992k4(i10).mo57995kk(), i8)), cArr3));
            char c = cArr4[i10];
            int i15 = i8;
            if (c == 'A' || c == 'B') {
                i14 = i15;
            } else if (c == 'F') {
                i11 = i15;
            } else if (c == 'N') {
                i12 = i15;
            } else if (c == 'Z') {
                i13 = i15;
            } else if (c == 'V' || c == 'W') {
            }
            i10++;
            i8 = i15;
        }
        int i16 = i10;
        List<Long> list3 = new List<>();
        List<Byte> list4 = new List<>();
        long[] jArr3 = {16200000, 16200000, 5400000, 5400000};
        int i17 = 0;
        long[] jArr4 = {0, 10800000, 10800000, 0};
        double[] dArr = new double[c0735a7.m3309du().length];
        byte[] bArr2 = new byte[c0735a7.m3309du().length];
        if (i14 != 0) {
            byte[][] bArr3 = {bArr2};
            double[][] dArr2 = {dArr};
            jArr = jArr3;
            list2 = list3;
            cArr = cArr4;
            c0735a72 = c0735a7;
            c0735a72.m3316k4(j3, j2, bArr3, dArr2);
            bArr2 = bArr3[0];
            dArr = dArr2[0];
        } else {
            jArr = jArr3;
            list2 = list3;
            cArr = cArr4;
            c0735a72 = c0735a7;
        }
        C13760l2 c13760l2M3314k4 = c0735a72.m3314k4();
        byte[] bArr4 = bArr2;
        int i18 = 0;
        List<Long> list5 = list2;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 0.0d;
        int i19 = 0;
        while (i18 < c12381h4M57979x1.m57991k4()) {
            C13760l2 c13760l22 = c13760l2M3314k4;
            cArr[i18] = c12381h4M57979x1.m57992k4(i18).mo57995kk().charAt(i17);
            twrVar2.m71371k4(i18, C14113y2.m67369h4(C14113y2.m67440x1(C14113y2.m67422kk(c12381h4M57979x1.m57992k4(i18).mo57995kk(), i)), cArr3));
            if (i18 == i16) {
                this.f5002x1 = C3085sv.m13068h4(list5);
                this.f4999kk = C3085sv.m13110x1(list4);
                this.f5001to = j == 0 ? j : 21600L;
                this.f4996du = j2 != 0 ? j2 : 21600L;
            }
            char c2 = cArr[i18];
            if (c2 == 'F') {
                i2 = i9;
                i3 = i16;
                c12381h4 = c12381h4M57979x1;
                cArr2 = cArr3;
                i4 = i18;
                twrVar = twrVar2;
                jArr2 = jArr4;
                bArr = bArr4;
                i5 = 0;
                i6 = 1;
                c13760l2 = c13760l22;
                this.f4998h4 = (byte) 0;
            } else if (c2 != 'Q') {
                i3 = i16;
                if (c2 == 'L') {
                    c12381h4 = c12381h4M57979x1;
                    cArr2 = cArr3;
                    i4 = i18;
                    twrVar = twrVar2;
                    jArr2 = jArr4;
                    bArr = bArr4;
                    c13760l2 = c13760l22;
                    for (int i20 = 0; i20 < twrVar.m71372k4(i4).length; i20++) {
                        char cM71369k4 = twrVar.m71369k4(i4, i20, 0);
                        boolean z = cM71369k4 < '0' || cM71369k4 > '9';
                        int i21 = i20 % 2;
                        if (i21 == 0) {
                            list4.addItem((byte) 2);
                        }
                        list5.addItem(Long.valueOf(C13760l2.m64252k4(twrVar.m71370k4(i4, i20), dictionary, list)));
                        if (i21 == 0) {
                            dDoubleValue = z ? dictionary3.get_Item(twrVar.m71370k4(i4, i20)).doubleValue() : C14080ne.m67015to(twrVar.m71370k4(i4, i20));
                        } else {
                            dDoubleValue2 = z ? dictionary3.get_Item(twrVar.m71370k4(i4, i20)).doubleValue() : C14080ne.m67015to(twrVar.m71370k4(i4, i20));
                        }
                    }
                    i2 = 2;
                    i5 = 0;
                } else if (c2 != 'M') {
                    switch (c2) {
                        case 'A':
                        case 'B':
                            c12381h4 = c12381h4M57979x1;
                            cArr2 = cArr3;
                            int i22 = i18;
                            jArr2 = jArr4;
                            List<Byte>[] listArr = {list4};
                            List<Long>[] listArr2 = {list5};
                            double[] dArr3 = {dDoubleValue};
                            double[] dArr4 = {dDoubleValue2};
                            twrVar = twrVar2;
                            double[] dArr5 = dArr;
                            bArr = bArr4;
                            i6 = 1;
                            dictionary3 = dictionary2;
                            m6030k4(listArr, listArr2, dArr3, dArr4, twrVar, dictionary3, i22, j, j2, false, bArr, dArr5, c13760l22);
                            i4 = i22;
                            c13760l2 = c13760l22;
                            dArr = dArr5;
                            List<Byte> list6 = listArr[0];
                            List<Long> list7 = listArr2[0];
                            dDoubleValue = dArr3[0];
                            dDoubleValue2 = dArr4[0];
                            list4 = list6;
                            list5 = list7;
                            i5 = 0;
                            i2 = 2;
                            break;
                        case 'C':
                            c12381h4 = c12381h4M57979x1;
                            cArr2 = cArr3;
                            int i23 = i18;
                            twr twrVar3 = twrVar2;
                            jArr2 = jArr4;
                            bArr = bArr4;
                            c13760l2 = c13760l22;
                            Dictionary<String, Double> dictionary4 = dictionary3;
                            for (int i24 = 0; i24 < twrVar3.m71372k4(i23).length; i24++) {
                                if (i24 % 6 == 0) {
                                    list4.addItem((byte) 5);
                                }
                                list5.addItem(Long.valueOf(C13760l2.m64252k4(twrVar3.m71370k4(i23, i24), dictionary, list)));
                            }
                            dictionary3 = dictionary4;
                            twrVar = twrVar3;
                            i4 = i23;
                            i5 = 0;
                            i2 = 2;
                            i6 = 1;
                            break;
                        default:
                            switch (c2) {
                                case 'S':
                                    c12381h4 = c12381h4M57979x1;
                                    cArr2 = cArr3;
                                    int i25 = i18;
                                    twr twrVar4 = twrVar2;
                                    jArr2 = jArr4;
                                    bArr = bArr4;
                                    c13760l2 = c13760l22;
                                    this.f5000m9 = false;
                                    i5 = 0;
                                    twrVar = twrVar4;
                                    i4 = i25;
                                    i2 = 2;
                                    i6 = 1;
                                    break;
                                case 'T':
                                case 'U':
                                    int i26 = i9;
                                    c12381h4 = c12381h4M57979x1;
                                    cArr2 = cArr3;
                                    i7 = i18;
                                    twr twrVar5 = twrVar2;
                                    jArr2 = jArr4;
                                    bArr = bArr4;
                                    c13760l2 = c13760l22;
                                    Dictionary<String, Double> dictionary5 = dictionary3;
                                    List<Byte> list8 = list4;
                                    double dLongValue = dDoubleValue;
                                    double dLongValue2 = dDoubleValue2;
                                    int i27 = 0;
                                    while (i27 < twrVar5.m71372k4(i7).length) {
                                        C12025x6 c12025x6 = new C12025x6((float) dLongValue, (float) dLongValue2);
                                        String strM71370k4 = twrVar5.m71370k4(i7, i27);
                                        double[] dArr6 = {0.0d};
                                        boolean zM66436k44 = C14044b3.m66436k4(strM71370k4, dArr6);
                                        int i28 = i26;
                                        double d = dArr6[0];
                                        if (zM66436k44) {
                                            fFloatValue4 = (float) d;
                                        } else {
                                            Double[] dArr7 = {Double.valueOf(0.0d)};
                                            fFloatValue4 = dictionary5.tryGetValue(strM71370k4, dArr7) ? dArr7[0].floatValue() : fFloatValue4;
                                            String strM71370k42 = twrVar5.m71370k4(i7, i27 + 1);
                                            dArr6[0] = d;
                                            zM66436k4 = C14044b3.m66436k4(strM71370k42, dArr6);
                                            double d2 = dArr6[0];
                                            if (zM66436k4) {
                                                Double[] dArr8 = {Double.valueOf(0.0d)};
                                                fFloatValue3 = dictionary5.tryGetValue(strM71370k42, dArr8) ? dArr8[0].floatValue() : fFloatValue3;
                                                C12015qq c12015qq = new C12015qq(1.0f, 1.0f);
                                                String strM71370k43 = twrVar5.m71370k4(i7, i27 + 2);
                                                dArr6[0] = d2;
                                                zM66436k42 = C14044b3.m66436k4(strM71370k43, dArr6);
                                                double d3 = dArr6[0];
                                                if (zM66436k42) {
                                                    fFloatValue2 = (float) d3;
                                                } else {
                                                    Double[] dArr9 = {Double.valueOf(0.0d)};
                                                    fFloatValue2 = dictionary5.tryGetValue(strM71370k43, dArr9) ? dArr9[0].floatValue() : fFloatValue2;
                                                    String strM71370k44 = twrVar5.m71370k4(i7, i27 + 3);
                                                    dArr6[0] = d3;
                                                    zM66436k43 = C14044b3.m66436k4(strM71370k44, dArr6);
                                                    double d4 = dArr6[0];
                                                    if (zM66436k43) {
                                                        Double[] dArr10 = {Double.valueOf(0.0d)};
                                                        boolean zTryGetValue = dictionary5.tryGetValue(strM71370k44, dArr10);
                                                        Double d5 = dArr10[0];
                                                        if (zTryGetValue) {
                                                            fFloatValue = d5.floatValue();
                                                        } else {
                                                            C12007ix c12007ix = new C12007ix(new C12025x6(c12025x6.m56897x1() - (c12015qq.m56699x1() / 2.0f), c12025x6.m56895kk() - (c12015qq.m56697kk() / 2.0f)), c12015qq.Clone());
                                                            List<Byte>[] listArr3 = {list8};
                                                            List<Long>[] listArr4 = {list5};
                                                            m6029k4(c12007ix.Clone(), 0.0f, 360.0f, true, listArr3, listArr4);
                                                            list8 = listArr3[0];
                                                            list5 = listArr4[0];
                                                            dLongValue = ((Long) OooO0O0.OooO00o(list5, i28)).longValue();
                                                            dLongValue2 = ((Long) OooO0O0.OooO00o(list5, 1)).longValue();
                                                            i27 += 6;
                                                            i7 = i7;
                                                            i26 = 2;
                                                        }
                                                    } else {
                                                        fFloatValue = (float) d4;
                                                    }
                                                    c12015qq.m56700x1(fFloatValue * 2.0f);
                                                    C12007ix c12007ix2 = new C12007ix(new C12025x6(c12025x6.m56897x1() - (c12015qq.m56699x1() / 2.0f), c12025x6.m56895kk() - (c12015qq.m56697kk() / 2.0f)), c12015qq.Clone());
                                                    List<Byte>[] listArr32 = {list8};
                                                    List<Long>[] listArr42 = {list5};
                                                    m6029k4(c12007ix2.Clone(), 0.0f, 360.0f, true, listArr32, listArr42);
                                                    list8 = listArr32[0];
                                                    list5 = listArr42[0];
                                                    dLongValue = ((Long) OooO0O0.OooO00o(list5, i28)).longValue();
                                                    dLongValue2 = ((Long) OooO0O0.OooO00o(list5, 1)).longValue();
                                                    i27 += 6;
                                                    i7 = i7;
                                                    i26 = 2;
                                                }
                                                c12015qq.m56695k4(fFloatValue2 * 2.0f);
                                                String strM71370k442 = twrVar5.m71370k4(i7, i27 + 3);
                                                dArr6[0] = d3;
                                                zM66436k43 = C14044b3.m66436k4(strM71370k442, dArr6);
                                                double d42 = dArr6[0];
                                                if (zM66436k43) {
                                                }
                                                c12015qq.m56700x1(fFloatValue * 2.0f);
                                                C12007ix c12007ix22 = new C12007ix(new C12025x6(c12025x6.m56897x1() - (c12015qq.m56699x1() / 2.0f), c12025x6.m56895kk() - (c12015qq.m56697kk() / 2.0f)), c12015qq.Clone());
                                                List<Byte>[] listArr322 = {list8};
                                                List<Long>[] listArr422 = {list5};
                                                m6029k4(c12007ix22.Clone(), 0.0f, 360.0f, true, listArr322, listArr422);
                                                list8 = listArr322[0];
                                                list5 = listArr422[0];
                                                dLongValue = ((Long) OooO0O0.OooO00o(list5, i28)).longValue();
                                                dLongValue2 = ((Long) OooO0O0.OooO00o(list5, 1)).longValue();
                                                i27 += 6;
                                                i7 = i7;
                                                i26 = 2;
                                            } else {
                                                fFloatValue3 = (float) d2;
                                            }
                                            c12025x6.m56898x1(fFloatValue3);
                                            C12015qq c12015qq2 = new C12015qq(1.0f, 1.0f);
                                            String strM71370k432 = twrVar5.m71370k4(i7, i27 + 2);
                                            dArr6[0] = d2;
                                            zM66436k42 = C14044b3.m66436k4(strM71370k432, dArr6);
                                            double d32 = dArr6[0];
                                            if (zM66436k42) {
                                            }
                                            c12015qq2.m56695k4(fFloatValue2 * 2.0f);
                                            String strM71370k4422 = twrVar5.m71370k4(i7, i27 + 3);
                                            dArr6[0] = d32;
                                            zM66436k43 = C14044b3.m66436k4(strM71370k4422, dArr6);
                                            double d422 = dArr6[0];
                                            if (zM66436k43) {
                                            }
                                            c12015qq2.m56700x1(fFloatValue * 2.0f);
                                            C12007ix c12007ix222 = new C12007ix(new C12025x6(c12025x6.m56897x1() - (c12015qq2.m56699x1() / 2.0f), c12025x6.m56895kk() - (c12015qq2.m56697kk() / 2.0f)), c12015qq2.Clone());
                                            List<Byte>[] listArr3222 = {list8};
                                            List<Long>[] listArr4222 = {list5};
                                            m6029k4(c12007ix222.Clone(), 0.0f, 360.0f, true, listArr3222, listArr4222);
                                            list8 = listArr3222[0];
                                            list5 = listArr4222[0];
                                            dLongValue = ((Long) OooO0O0.OooO00o(list5, i28)).longValue();
                                            dLongValue2 = ((Long) OooO0O0.OooO00o(list5, 1)).longValue();
                                            i27 += 6;
                                            i7 = i7;
                                            i26 = 2;
                                        }
                                        c12025x6.m56891k4(fFloatValue4);
                                        String strM71370k422 = twrVar5.m71370k4(i7, i27 + 1);
                                        dArr6[0] = d;
                                        zM66436k4 = C14044b3.m66436k4(strM71370k422, dArr6);
                                        double d22 = dArr6[0];
                                        if (zM66436k4) {
                                        }
                                        c12025x6.m56898x1(fFloatValue3);
                                        C12015qq c12015qq22 = new C12015qq(1.0f, 1.0f);
                                        String strM71370k4322 = twrVar5.m71370k4(i7, i27 + 2);
                                        dArr6[0] = d22;
                                        zM66436k42 = C14044b3.m66436k4(strM71370k4322, dArr6);
                                        double d322 = dArr6[0];
                                        if (zM66436k42) {
                                        }
                                        c12015qq22.m56695k4(fFloatValue2 * 2.0f);
                                        String strM71370k44222 = twrVar5.m71370k4(i7, i27 + 3);
                                        dArr6[0] = d322;
                                        zM66436k43 = C14044b3.m66436k4(strM71370k44222, dArr6);
                                        double d4222 = dArr6[0];
                                        if (zM66436k43) {
                                        }
                                        c12015qq22.m56700x1(fFloatValue * 2.0f);
                                        C12007ix c12007ix2222 = new C12007ix(new C12025x6(c12025x6.m56897x1() - (c12015qq22.m56699x1() / 2.0f), c12025x6.m56895kk() - (c12015qq22.m56697kk() / 2.0f)), c12015qq22.Clone());
                                        List<Byte>[] listArr32222 = {list8};
                                        List<Long>[] listArr42222 = {list5};
                                        m6029k4(c12007ix2222.Clone(), 0.0f, 360.0f, true, listArr32222, listArr42222);
                                        list8 = listArr32222[0];
                                        list5 = listArr42222[0];
                                        dLongValue = ((Long) OooO0O0.OooO00o(list5, i28)).longValue();
                                        dLongValue2 = ((Long) OooO0O0.OooO00o(list5, 1)).longValue();
                                        i27 += 6;
                                        i7 = i7;
                                        i26 = 2;
                                    }
                                    i6 = 1;
                                    list4 = list8;
                                    dDoubleValue = dLongValue;
                                    dDoubleValue2 = dLongValue2;
                                    dictionary3 = dictionary5;
                                    twrVar = twrVar5;
                                    i2 = i26;
                                    i5 = 0;
                                    i4 = i7;
                                    break;
                                case 'V':
                                case 'W':
                                    c12381h4 = c12381h4M57979x1;
                                    List<Byte>[] listArr5 = {list4};
                                    List<Long>[] listArr6 = {list5};
                                    double[] dArr11 = {dDoubleValue};
                                    double[] dArr12 = {dDoubleValue2};
                                    int i29 = i18;
                                    twrVar = twrVar2;
                                    jArr2 = jArr4;
                                    double[] dArr13 = dArr;
                                    cArr2 = cArr3;
                                    bArr = bArr4;
                                    m6030k4(listArr5, listArr6, dArr11, dArr12, twrVar, dictionary3, i29, j3, j2, true, bArr, dArr13, c13760l22);
                                    i7 = i29;
                                    c13760l2 = c13760l22;
                                    dArr = dArr13;
                                    List<Byte> list9 = listArr5[0];
                                    List<Long> list10 = listArr6[0];
                                    dDoubleValue = dArr11[0];
                                    dDoubleValue2 = dArr12[0];
                                    i5 = 0;
                                    list4 = list9;
                                    list5 = list10;
                                    i6 = 1;
                                    i2 = i9;
                                    i4 = i7;
                                    break;
                                case 'X':
                                    c12381h4 = c12381h4M57979x1;
                                    int i30 = i19;
                                    for (int i31 = 0; i31 < twrVar2.m71372k4(i18).length; i31++) {
                                        char cM71369k42 = twrVar2.m71369k4(i18, i31, 0);
                                        boolean z2 = cM71369k42 < '0' || cM71369k42 > '9';
                                        if (i31 % 2 == 0) {
                                            double dDoubleValue3 = z2 ? dictionary3.get_Item(twrVar2.m71370k4(i18, i31)).doubleValue() : C14080ne.m67015to(twrVar2.m71370k4(i18, i31));
                                            list4.addItem((byte) 3);
                                            i30++;
                                            list5.addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67475k4(dDoubleValue - dDoubleValue3)), 14)));
                                        } else {
                                            list5.addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67475k4(dDoubleValue2 - (z2 ? dictionary3.get_Item(twrVar2.m71370k4(i18, i31)).doubleValue() : C14080ne.m67015to(twrVar2.m71370k4(i18, i31))))), 14)));
                                            list5.addItem(Long.valueOf(i30 <= 4 ? jArr[i30 - 1] : jArr[(i30 % 4) - 1]));
                                            list5.addItem(Long.valueOf(i30 % 2 == 0 ? 5400000 : -5400000));
                                        }
                                    }
                                    i2 = i9;
                                    i19 = i30;
                                    cArr2 = cArr3;
                                    i4 = i18;
                                    twrVar = twrVar2;
                                    jArr2 = jArr4;
                                    bArr = bArr4;
                                    i5 = 0;
                                    i6 = 1;
                                    c13760l2 = c13760l22;
                                    break;
                                case 'Y':
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = i19;
                                    while (i33 < twrVar2.m71372k4(i18).length) {
                                        char cM71369k43 = twrVar2.m71369k4(i18, i33, i32);
                                        boolean z3 = cM71369k43 < '0' || cM71369k43 > '9';
                                        if (i33 % 2 == 0) {
                                            if (z3) {
                                                c12381h42 = c12381h4M57979x1;
                                                dM67015to = dictionary3.get_Item(twrVar2.m71370k4(i18, i33)).doubleValue();
                                            } else {
                                                c12381h42 = c12381h4M57979x1;
                                                dM67015to = C14080ne.m67015to(twrVar2.m71370k4(i18, i33));
                                            }
                                            list4.addItem((byte) 3);
                                            i34++;
                                            list5.addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67475k4(dDoubleValue - dM67015to)), 14)));
                                        } else {
                                            c12381h42 = c12381h4M57979x1;
                                            int i35 = i34;
                                            list5.addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67475k4(dDoubleValue2 - (z3 ? dictionary3.get_Item(twrVar2.m71370k4(i18, i33)).doubleValue() : C14080ne.m67015to(twrVar2.m71370k4(i18, i33))))), 14)));
                                            list5.addItem(Long.valueOf(i35 <= 4 ? jArr4[i35 - 1] : jArr4[(i35 % 4) - 1]));
                                            list5.addItem(Long.valueOf(i35 % 2 == 0 ? -5400000 : 5400000));
                                            i34 = i35;
                                        }
                                        i33++;
                                        c12381h4M57979x1 = c12381h42;
                                        i32 = 0;
                                    }
                                    i2 = i9;
                                    i5 = i32;
                                    i19 = i34;
                                    c12381h4 = c12381h4M57979x1;
                                    cArr2 = cArr3;
                                    i4 = i18;
                                    twrVar = twrVar2;
                                    jArr2 = jArr4;
                                    bArr = bArr4;
                                    i6 = 1;
                                    c13760l2 = c13760l22;
                                    break;
                                case 'Z':
                                    list4.addItem((byte) 0);
                                    i2 = i9;
                                    i5 = 0;
                                    c12381h4 = c12381h4M57979x1;
                                    cArr2 = cArr3;
                                    i4 = i18;
                                    twrVar = twrVar2;
                                    jArr2 = jArr4;
                                    bArr = bArr4;
                                    i6 = 1;
                                    c13760l2 = c13760l22;
                                    break;
                                default:
                                    i2 = i9;
                                    c12381h4 = c12381h4M57979x1;
                                    cArr2 = cArr3;
                                    i4 = i18;
                                    twrVar = twrVar2;
                                    jArr2 = jArr4;
                                    bArr = bArr4;
                                    i5 = 0;
                                    i6 = 1;
                                    c13760l2 = c13760l22;
                                    break;
                            }
                            break;
                    }
                } else {
                    c12381h4 = c12381h4M57979x1;
                    cArr2 = cArr3;
                    i4 = i18;
                    twrVar = twrVar2;
                    jArr2 = jArr4;
                    bArr = bArr4;
                    int i36 = 0;
                    c13760l2 = c13760l22;
                    list4.addItem((byte) 1);
                    int i37 = 0;
                    while (i37 < twrVar.m71372k4(i4).length) {
                        char cM71369k44 = twrVar.m71369k4(i4, i37, i36);
                        boolean z4 = cM71369k44 < '0' || cM71369k44 > '9';
                        if (i37 > 1 && i37 % 2 == 0) {
                            list4.addItem((byte) 2);
                        }
                        list5.addItem(Long.valueOf(C13760l2.m64252k4(twrVar.m71370k4(i4, i37), dictionary, list)));
                        String strM71370k45 = twrVar.m71370k4(i4, i37);
                        if (i37 % 2 == 0) {
                            dDoubleValue = (z4 && dictionary3.containsKey(strM71370k45)) ? dictionary3.get_Item(strM71370k45).doubleValue() : C14080ne.m67015to(strM71370k45);
                        } else {
                            dDoubleValue2 = (z4 && dictionary3.containsKey(strM71370k45)) ? dictionary3.get_Item(strM71370k45).doubleValue() : C14080ne.m67015to(strM71370k45);
                        }
                        i37++;
                        i36 = 0;
                    }
                    i5 = i36;
                    i2 = 2;
                }
                i6 = 1;
            } else {
                i2 = i9;
                i3 = i16;
                c12381h4 = c12381h4M57979x1;
                cArr2 = cArr3;
                i4 = i18;
                twrVar = twrVar2;
                jArr2 = jArr4;
                bArr = bArr4;
                c13760l2 = c13760l22;
                for (int i38 = 0; i38 < twrVar.m71372k4(i4).length; i38++) {
                    if (i38 % 4 == 0) {
                        list4.addItem((byte) 4);
                    }
                    list5.addItem(Long.valueOf(C13760l2.m64252k4(twrVar.m71370k4(i4, i38), dictionary, list)));
                }
                i6 = 1;
                i5 = 0;
            }
            i18 = i4 + 1;
            i17 = i5;
            c13760l2M3314k4 = c13760l2;
            i9 = i2;
            cArr3 = cArr2;
            i = i6;
            i16 = i3;
            j3 = j;
            twrVar2 = twrVar;
            bArr4 = bArr;
            jArr4 = jArr2;
            c12381h4M57979x1 = c12381h4;
        }
        this.f5002x1 = C3085sv.m13068h4(list5);
        this.f4999kk = C3085sv.m13110x1(list4);
        this.f5001to = j == 0 ? j : 21600L;
        this.f4996du = j2 != 0 ? j2 : 21600L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6036k4(byte b) {
        this.f4998h4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6037k4(long j) {
        this.f5001to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6038k4(List<C0899df> list, byte[] bArr) {
        qnt qntVar = new qnt(this.f5001to, this.f4996du);
        int i = 0;
        for (byte b : this.f4999kk) {
            if (b == 1 || b == 2) {
                long[] jArr = this.f5002x1;
                jArr[i] = qntVar.m69713k4(list, jArr[i], bArr);
                int i2 = i + 1;
                long[] jArr2 = this.f5002x1;
                jArr2[i2] = qntVar.m69716x1(list, jArr2[i2], bArr);
                i += 2;
            } else if (b == 3) {
                long[] jArr3 = this.f5002x1;
                jArr3[i] = qntVar.m69714kk(list, jArr3[i], bArr);
                int i3 = i + 1;
                long[] jArr4 = this.f5002x1;
                jArr4[i3] = qntVar.m69715to(list, jArr4[i3], bArr);
                i += 4;
            } else if (b == 4) {
                long[] jArr5 = this.f5002x1;
                jArr5[i] = qntVar.m69713k4(list, jArr5[i], bArr);
                int i4 = i + 1;
                long[] jArr6 = this.f5002x1;
                jArr6[i4] = qntVar.m69716x1(list, jArr6[i4], bArr);
                int i5 = i + 2;
                long[] jArr7 = this.f5002x1;
                jArr7[i5] = qntVar.m69713k4(list, jArr7[i5], bArr);
                i += 3;
                long[] jArr8 = this.f5002x1;
                jArr8[i] = qntVar.m69716x1(list, jArr8[i], bArr);
            } else if (b == 5) {
                long[] jArr9 = this.f5002x1;
                jArr9[i] = qntVar.m69713k4(list, jArr9[i], bArr);
                int i6 = i + 1;
                long[] jArr10 = this.f5002x1;
                jArr10[i6] = qntVar.m69716x1(list, jArr10[i6], bArr);
                int i7 = i + 2;
                long[] jArr11 = this.f5002x1;
                jArr11[i7] = qntVar.m69713k4(list, jArr11[i7], bArr);
                int i8 = i + 3;
                long[] jArr12 = this.f5002x1;
                jArr12[i8] = qntVar.m69716x1(list, jArr12[i8], bArr);
                int i9 = i + 4;
                long[] jArr13 = this.f5002x1;
                jArr13[i9] = qntVar.m69713k4(list, jArr13[i9], bArr);
                int i10 = i + 5;
                long[] jArr14 = this.f5002x1;
                jArr14[i10] = qntVar.m69716x1(list, jArr14[i10], bArr);
                i += 6;
            }
        }
        this.f4996du = 0L;
        this.f5001to = 0L;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6029k4(C12007ix c12007ix, float f, float f2, boolean z, List<Byte>[] listArr, List<Long>[] listArr2) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55543k4(c12007ix.Clone(), f, f2);
        int length = (c11896dy.m55565kk().length - 1) / 3;
        if (length > 0 && z) {
            listArr[0].addItem((byte) 1);
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[0].m56897x1())), 14)));
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[0].m56895kk())), 14)));
        }
        int i = 0;
        while (i < length * 3) {
            listArr[0].addItem((byte) 5);
            int i2 = i + 1;
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[i2].m56897x1())), 14)));
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[i2].m56895kk())), 14)));
            int i3 = i + 2;
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[i3].m56897x1())), 14)));
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[i3].m56895kk())), 14)));
            i += 3;
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[i].m56897x1())), 14)));
            listArr2[0].addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(r6[i].m56895kk())), 14)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6039k4(boolean z) {
        this.f5000m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6040k4(byte[] bArr, long[] jArr) {
        List list = new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) this.f4999kk)));
        List list2 = new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4(this.f5002x1)));
        if (bArr != null) {
            list.addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) bArr)));
        }
        if (jArr != null) {
            list2.addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4(jArr)));
        }
        this.f4999kk = C3085sv.m13110x1((List<Byte>) list);
        this.f5002x1 = C3085sv.m13068h4(list2);
    }

    public f7k(byte[] bArr, List<Long> list, int i, int i2, long j, long j2, byte b, boolean z, boolean z2) {
        this.f4998h4 = (byte) 1;
        this.f5000m9 = true;
        this.f4997dy = true;
        this.f5001to = j;
        this.f4996du = j2;
        this.f4999kk = bArr;
        this.f5002x1 = new long[i2];
        Long[] lArr = new Long[i2];
        list.copyTo(i, lArr, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5002x1[i3] = lArr[i3].longValue();
        }
        this.f4998h4 = b;
        this.f5000m9 = z;
        this.f4997dy = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6030k4(List<Byte>[] listArr, List<Long>[] listArr2, double[] dArr, double[] dArr2, twr twrVar, Dictionary<String, Double> dictionary, int i, float f, float f2, boolean z, byte[] bArr, double[] dArr3, C13760l2 c13760l2) {
        int i2;
        char c;
        int i3;
        long[] jArr = new long[8];
        int i4 = 0;
        for (int i5 = 0; i5 < twrVar.m71372k4(i).length; i5++) {
            char cM71369k4 = twrVar.m71369k4(i, i5, 0);
            if (cM71369k4 < '0' || cM71369k4 > '9') {
                i3 = i4 + 1;
                jArr[i4] = C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(m6027k4(dictionary, twrVar.m71370k4(i, i5)))), 14);
            } else {
                i3 = i4 + 1;
                jArr[i4] = C14080ne.m67015to(twrVar.m71370k4(i, i5));
            }
            i4 = i3;
        }
        long j = (jArr[2] - jArr[0]) / 2;
        long j2 = (jArr[3] - jArr[1]) / 2;
        if (C14116yg.m67485k4(j) + C14116yg.m67485k4(j2) < 0.005d) {
            return;
        }
        if (((Byte) OooO0O0.OooO00o(listArr[0], 1)).byteValue() == 1 && z) {
            long j3 = jArr[0];
            if (j3 < 0 || jArr[1] < 0) {
                dArr[0] = C14116yg.m67497to(dArr[0] - j3);
                i2 = 2;
                c = 3;
                dArr2[0] = C14116yg.m67497to(dArr2[0] - jArr[1]);
                listArr2[0].set_Item(r0.size() - 2, Long.valueOf(C7019kk.m27438h4(Double.valueOf(dArr[0]), 14)));
                List<Long> list = listArr2[0];
                list.set_Item(list.size() - 1, Long.valueOf(C7019kk.m27438h4(Double.valueOf(dArr2[0]), 14)));
            }
        } else {
            i2 = 2;
            c = 3;
        }
        int iM6033k4 = m6033k4(jArr[0], jArr[1], jArr[i2], jArr[c], jArr[4], jArr[5]);
        int i6 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        if (!z && iM6033k4 == 0) {
            iM6033k4 = 360;
        }
        int iM6033k42 = m6033k4(jArr[0], jArr[1], jArr[i2], jArr[c], jArr[6], jArr[7]);
        if (!z || iM6033k42 != 0) {
            i6 = iM6033k42;
        }
        int i7 = i6 - iM6033k4;
        if (z && i7 < 0) {
            i7 += StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        }
        float fM64259k4 = c13760l2.m64259k4(dArr3, bArr, j);
        float fM64259k42 = c13760l2.m64259k4(dArr3, bArr, j2);
        float fM64259k43 = c13760l2.m64259k4(dArr3, bArr, iM6033k4);
        float fM64259k44 = c13760l2.m64259k4(dArr3, bArr, i7);
        double d = (((double) fM64259k43) * 3.141592653589793d) / 180.0d;
        double dM67470dy = C14116yg.m67470dy(d);
        double dM67495m9 = C14116yg.m67495m9(d);
        double d2 = fM64259k4;
        double d3 = fM64259k42;
        double dM67496rv = C14116yg.m67496rv(1.0d / ((((dM67495m9 * dM67495m9) / d3) / d3) + (((dM67470dy * dM67470dy) / d2) / d2)));
        float f3 = (float) ((dArr[0] - (dM67470dy * dM67496rv)) - d2);
        float f4 = (float) ((dArr2[0] - (dM67495m9 * dM67496rv)) - d3);
        if (fM64259k44 != 0.0f) {
            m6029k4(new C12007ix(f3, f4, fM64259k4 * 2.0f, fM64259k42 * 2.0f), fM64259k43, fM64259k44, false, listArr, listArr2);
            dArr[0] = ((Long) OooO0O0.OooO00o(listArr2[0], i2)).longValue();
            dArr2[0] = ((Long) OooO0O0.OooO00o(listArr2[0], 1)).longValue();
        }
    }

    public f7k(byte[] bArr, long[] jArr, long j, long j2, byte b, boolean z, boolean z2) {
        this.f5001to = j;
        this.f4996du = j2;
        this.f4999kk = bArr;
        this.f5002x1 = jArr;
        this.f4998h4 = b;
        this.f5000m9 = z;
        this.f4997dy = z2;
    }

    /* JADX INFO: renamed from: k4 */
    public final long[] m6041k4() {
        return this.f5002x1;
    }
}
