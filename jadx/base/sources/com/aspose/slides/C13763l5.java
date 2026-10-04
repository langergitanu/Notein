package com.aspose.slides;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.l5 */
/* JADX INFO: loaded from: classes3.dex */
class C13763l5 {

    /* JADX INFO: renamed from: k4 */
    private C12003du f45948k4 = new C12003du();

    /* JADX INFO: renamed from: x1 */
    private double f45949x1;

    /* JADX INFO: renamed from: kk */
    private static final float[] f45945kk = {17.5f, 17.5f, 14.5f, 14.5f, 10.5f, 10.25f, 8.25f, 7.25f, 7.25f, 5.25f, 4.25f};

    /* JADX INFO: renamed from: to */
    private static final float[] f45947to = {17.5f, 17.5f, 17.5f, 17.5f, 17.5f, 14.25f, 10.5f, 10.5f, 6.25f, 5.25f, 4.75f};

    /* JADX INFO: renamed from: du */
    private static final float[] f45942du = {33.0f, 24.5f, 20.0f, 18.0f, 16.5f, 12.25f, 10.5f, 8.5f, 7.0f, 5.0f, 4.0f};

    /* JADX INFO: renamed from: h4 */
    private static final float[] f45944h4 = {33.0f, 24.0f, 20.0f, 18.0f, 18.5f, 12.25f, 10.5f, 8.5f, 7.0f, 5.5f, 4.5f};

    /* JADX INFO: renamed from: m9 */
    private static final float[] f45946m9 = {41.5f, 35.5f, 27.5f, 22.5f, 17.5f, 13.0f, 10.5f, 8.25f, 6.5f, 5.0f, 4.0f};

    /* JADX INFO: renamed from: dy */
    private static final float[] f45943dy = {41.5f, 35.5f, 27.5f, 22.5f, 17.5f, 13.5f, 11.0f, 8.25f, 6.75f, 5.0f, 4.25f};

    /* JADX INFO: renamed from: c5 */
    private static final float[] f45941c5 = {4.0f, 6.0f, 8.0f, 12.0f, 16.0f, 24.0f, 32.0f, 48.0f, 64.0f, 96.0f, 128.0f};

    public C13763l5(IGlowEffectiveData iGlowEffectiveData) {
        if (iGlowEffectiveData == null) {
            throw new ArgumentNullException("glowEffectiveData is null.");
        }
        ((C1241i6) iGlowEffectiveData).m7537x1().CloneTo(this.f45948k4);
        this.f45949x1 = iGlowEffectiveData.getRadius();
    }

    /* JADX INFO: renamed from: k4 */
    private float m64307k4(float[] fArr, float[] fArr2, double d) {
        if (fArr.length != fArr2.length) {
            throw new ArgumentException("fontHeight and rates should have same number of elements");
        }
        int i = 0;
        float f = -3.4028235E38f;
        float f2 = Float.MAX_VALUE;
        for (float f3 : fArr) {
            if (f < f3) {
                f = f3;
            }
            if (f2 > f3) {
                f2 = f3;
            }
        }
        if (d >= f) {
            return fArr2[fArr2.length - 1];
        }
        if (d <= f2) {
            return fArr2[0];
        }
        int i2 = 0;
        while (true) {
            if (i2 >= fArr.length) {
                i2 = 0;
                break;
            }
            float f4 = fArr[i2];
            if (d < f4) {
                i = i2 - 1;
                break;
            }
            if (d == f4) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i == i2) {
            return fArr2[i];
        }
        float f5 = fArr2[i];
        float f6 = fArr2[i2] - f5;
        float f7 = fArr[i2];
        return (float) C21532OooOOo.OooO0O0(d, fArr[i], f6 / (f7 - r12), f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0327  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.aspose.slides.internal.wh.jd] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.aspose.slides.internal.wh.jd] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.aspose.slides.zn] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m64308k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, qy7 qy7Var) {
        C11896dy c11896dy2;
        C12026yj c12026yj;
        C12009k4 c12009k4;
        ?? r14;
        C12026yj c12026yj2;
        float fM56930ne;
        double d;
        C12025x6 c12025x6;
        double d2;
        float fM64307k4;
        float fM64307k42;
        if (((qy7Var.m69907kk() == null || qy7Var.m69907kk().m5681to() == 0) && (qy7Var.m69917to() == null || !qy7Var.m69917to().m3903h4())) || this.f45949x1 == 0.0d || (this.f45948k4.m56501c5() & 255) == 0) {
            return;
        }
        double d3 = this.f45949x1;
        C12003du c12003duClone = this.f45948k4.Clone();
        try {
            C12026yj c12026yjM3930x6 = (qy7Var.m69917to() == null || !qy7Var.m69917to().m3903h4()) ? null : qy7Var.m69917to().m3930x6();
            try {
                c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
                try {
                    C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
                    if (c12026yjM3930x6 != null) {
                        try {
                            fM56930ne = c12026yjM3930x6.m56930ne();
                        } catch (Throwable th) {
                            th = th;
                            c12026yj = c12026yjM3930x6;
                            c12009k4 = null;
                            r14 = 0;
                            if (c12026yj != null) {
                            }
                            if (c12009k4 != null) {
                            }
                            if (r14 != 0) {
                            }
                            if (c11896dy2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        fM56930ne = 0.0f;
                    }
                    double d4 = 2.0d * d3;
                    c12026yj2 = c12026yjM3930x6;
                    try {
                        c12009k4 = new C12009k4(C7019kk.m27462to(Double.valueOf(((double) c12007ixClone.m56550c5()) + d4), 14), C7019kk.m27462to(Double.valueOf(((double) c12007ixClone.m56575x1()) + d4), 14));
                        try {
                            if (abstractC14897zn.m74608ar() != null) {
                                c12009k4.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
                            }
                            double d5 = ((double) fM56930ne) + d3;
                            C12025x6 c12025x62 = new C12025x6((float) (((double) c12007ixClone.m56557jd()) - d5), (float) (((double) c12007ixClone.m56551ck()) - d5));
                            C11913yj c11913yj = new C11913yj();
                            c11913yj.m55777kk(-c12025x62.m56897x1(), -c12025x62.m56895kk());
                            c11896dy2.m55577x1(c11913yj);
                            float fM69915rv = qy7Var.m69915rv();
                            boolean z = true;
                            int i = 0;
                            if ((d3 > 4.0d || fM69915rv > 26.0f) && ((d3 > 6.0d || fM69915rv > 20.0f) && (d3 >= 10.0d || fM69915rv > 12.0f))) {
                                d = 10.0d;
                                z = false;
                            } else {
                                d = 10.0d;
                            }
                            ?? M70048k4 = C14381rb.m70048k4(c12009k4, (AbstractC14897zn) abstractC14897zn);
                            try {
                                if (z) {
                                    c12025x6 = c12025x62;
                                    try {
                                        if (qy7Var.m69917to() == null || !qy7Var.m69917to().m3903h4()) {
                                            C12026yj c12026yj3 = new C12026yj(c12003duClone.Clone(), ((float) d3) / 5.0f);
                                            try {
                                                try {
                                                    M70048k4.mo17540k4(c12026yj3, c11896dy2);
                                                    c12026yj3.dispose();
                                                } catch (Throwable th2) {
                                                    c12026yj3.dispose();
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                M70048k4 = 1084227584;
                                                c12026yj = c12026yj2;
                                                r14 = M70048k4;
                                                if (c12026yj != null) {
                                                }
                                                if (c12009k4 != null) {
                                                }
                                                if (r14 != 0) {
                                                }
                                                if (c11896dy2 != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            C12026yj c12026yj4 = (C12026yj) C7019kk.m27452k4(c12026yj2.deepClone(), C12026yj.class);
                                            try {
                                                c12026yj4.m56923k4(c12003duClone.Clone());
                                                c12026yj4.m56926kk(((float) d3) / 5.0f);
                                                M70048k4.mo17540k4(c12026yj4, c11896dy2);
                                                c12026yj4.dispose();
                                            } finally {
                                            }
                                        }
                                        if (qy7Var.m69907kk() != null && qy7Var.m69907kk().m5681to() != 0) {
                                            C11999ar c11999ar = new C11999ar(c12003duClone.Clone());
                                            try {
                                                M70048k4.mo17527k4(c11999ar, c11896dy2);
                                                c11999ar.dispose();
                                            } finally {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } else {
                                    C12003du c12003duClone2 = C12003du.m56398k4(255, 0, 0, c12003duClone.m56501c5() & 255).Clone();
                                    if (qy7Var.m69917to() == null || !qy7Var.m69917to().m3903h4()) {
                                        d2 = d;
                                    } else {
                                        d2 = d;
                                        C12026yj c12026yj5 = (C12026yj) C7019kk.m27452k4(c12026yj2.deepClone(), C12026yj.class);
                                        try {
                                            c12026yj5.m56923k4(c12003duClone2.Clone());
                                            M70048k4.mo17540k4(c12026yj5, c11896dy2);
                                            c12026yj5.dispose();
                                        } finally {
                                        }
                                    }
                                    if (qy7Var.m69907kk() != null && qy7Var.m69907kk().m5681to() != 0) {
                                        C11999ar c11999ar2 = new C11999ar(c12003duClone2.Clone());
                                        try {
                                            M70048k4.mo17527k4(c11999ar2, c11896dy2);
                                            c11999ar2.dispose();
                                        } finally {
                                        }
                                    }
                                    byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k4);
                                    int length = bArrM70057k4.length;
                                    int[] iArr = new int[length];
                                    byte bM56505fa = c12003duClone.m56505fa();
                                    byte bM56502ck = c12003duClone.m56502ck();
                                    byte bM56507jd = c12003duClone.m56507jd();
                                    int i2 = 0;
                                    while (i < bArrM70057k4.length) {
                                        iArr[i2] = bArrM70057k4[i] & 255;
                                        bArrM70057k4[i] = bM56505fa;
                                        bArrM70057k4[i + 1] = bM56502ck;
                                        bArrM70057k4[i + 2] = bM56507jd;
                                        i += 4;
                                        i2++;
                                        c12003duClone = c12003duClone;
                                    }
                                    C12003du c12003du = c12003duClone;
                                    if (d3 <= d2) {
                                        float[] fArr = f45941c5;
                                        c12025x6 = c12025x62;
                                        double d6 = fM69915rv;
                                        fM64307k4 = m64307k4(fArr, f45945kk, d6);
                                        fM64307k42 = m64307k4(fArr, f45947to, d6);
                                    } else {
                                        c12025x6 = c12025x62;
                                        if (d3 <= d2 || d3 > 20.0d) {
                                            float[] fArr2 = f45941c5;
                                            double d7 = fM69915rv;
                                            fM64307k4 = m64307k4(fArr2, f45946m9, d7);
                                            fM64307k42 = m64307k4(fArr2, f45943dy, d7);
                                        } else {
                                            float[] fArr3 = f45941c5;
                                            double d8 = fM69915rv;
                                            fM64307k4 = m64307k4(fArr3, f45942du, d8);
                                            fM64307k42 = m64307k4(fArr3, f45944h4, d8);
                                        }
                                    }
                                    int[] iArr2 = new int[length];
                                    C1234i0.m7348k4(iArr, iArr2, c12009k4.mo15760yj(), c12009k4.mo15757m9(), d3 / ((double) fM64307k4), 3);
                                    int iM56501c5 = c12003du.m56501c5() & 255;
                                    for (int i3 = 0; i3 < length; i3++) {
                                        if (iArr2[i3] != 0) {
                                            iArr2[i3] = iM56501c5;
                                        }
                                    }
                                    C1234i0.m7348k4(iArr2, iArr, c12009k4.mo15760yj(), c12009k4.mo15757m9(), d3 / ((double) fM64307k42), 3);
                                    int i4 = 3;
                                    int i5 = 0;
                                    while (i4 < bArrM70057k4.length) {
                                        bArrM70057k4[i4] = (byte) iArr[i5];
                                        i4 += 4;
                                        i5++;
                                    }
                                    C14381rb.m70053k4(c12009k4, bArrM70057k4);
                                }
                                abstractC14897zn.mo64339k4(c12009k4, c12025x6.m56897x1(), c12025x6.m56895kk(), c12009k4.mo15760yj(), c12009k4.mo15757m9());
                                if (c12026yj2 != null) {
                                    c12026yj2.dispose();
                                }
                                c12009k4.dispose();
                                if (M70048k4 != 0) {
                                    M70048k4.dispose();
                                }
                                c11896dy2.dispose();
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c12026yj = c12026yj2;
                            r14 = 0;
                            if (c12026yj != null) {
                                c12026yj.dispose();
                            }
                            if (c12009k4 != null) {
                                c12009k4.dispose();
                            }
                            if (r14 != 0) {
                                r14.dispose();
                            }
                            if (c11896dy2 != null) {
                                c11896dy2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c12026yj = c12026yj2;
                        c12009k4 = null;
                        r14 = 0;
                        if (c12026yj != null) {
                        }
                        if (c12009k4 != null) {
                        }
                        if (r14 != 0) {
                        }
                        if (c11896dy2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c12026yj2 = c12026yjM3930x6;
                }
            } catch (Throwable th9) {
                th = th9;
                c12026yj2 = c12026yjM3930x6;
                c11896dy2 = c11896dy;
            }
        } catch (Throwable th10) {
            th = th10;
            c11896dy2 = c11896dy;
            c12026yj = null;
        }
    }
}
