package com.aspose.slides.internal.p313oa;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.wy */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC7008wy {

    /* JADX INFO: renamed from: k4 */
    private C7010x6 f19055k4;

    /* JADX INFO: renamed from: kk */
    private int f19056kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f19058x1;

    /* JADX INFO: renamed from: to */
    private boolean f19057to = false;

    /* JADX INFO: renamed from: du */
    private float[] f19053du = new float[3];

    /* JADX INFO: renamed from: h4 */
    private float[] f19054h4 = new float[3];

    /* JADX INFO: renamed from: du */
    public boolean m27407du() {
        return this.f19058x1;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean mo27325h4() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6981c5 m27408k4(int i) {
        AbstractC7002u4 abstractC7002u4M27420k4 = this.f19055k4.m27420k4(i);
        if (abstractC7002u4M27420k4 == null || !C7019kk.m27469x1(abstractC7002u4M27420k4, AbstractC6981c5.class)) {
            throw new C6997ne();
        }
        return (AbstractC6981c5) abstractC7002u4M27420k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo27327k4(float[] fArr);

    /* JADX INFO: renamed from: kk */
    public int m27409kk() {
        return this.f19058x1 ? this.f19055k4.m27423x1().f19015h4 : this.f19055k4.m27423x1().f19012du;
    }

    /* JADX INFO: renamed from: to */
    public C7010x6 m27411to() {
        return this.f19055k4;
    }

    /* JADX INFO: renamed from: x1 */
    public int m27412x1() {
        return this.f19058x1 ? this.f19055k4.m27423x1().f19012du : this.f19055k4.m27423x1().f19015h4;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC7008wy m27404k4(C7010x6 c7010x6, boolean z, int i) {
        AbstractC7002u4 abstractC7002u4M27420k4;
        AbstractC7008wy abstractC7008wyM27297k4;
        int i2;
        int i3 = 1;
        int i4 = i == 3 ? 1 : i;
        if (z) {
            abstractC7002u4M27420k4 = c7010x6.m27420k4(C7019kk.m27462to(Long.valueOf(C7019kk.m27435du(Long.valueOf(i4), 10) + C7019kk.m27435du((Object) 1093812784L, 10)), 10));
            if (abstractC7002u4M27420k4 == null) {
                abstractC7002u4M27420k4 = c7010x6.m27420k4(1093812784);
            }
            if (abstractC7002u4M27420k4 != null) {
                switch (c7010x6.m27423x1().f19012du) {
                    case 876825682:
                    case 1129142603:
                        i3 = 2;
                    case 860048466:
                    case 1129142560:
                    case 1212961568:
                    case 1213421088:
                    case 1281450528:
                    case 1282766368:
                    case 1380401696:
                    case 1482250784:
                    case 1497588338:
                    case 1501067552:
                        abstractC7008wyM27297k4 = C6977ak.m27297k4(i3, abstractC7002u4M27420k4);
                        break;
                    default:
                        throw new NotSupportedException(C14113y2.m67402k4("Not supported ColorSpace: {0}", C7019kk.m27466x1(c7010x6.m27423x1().f19012du)));
                }
            }
            abstractC7008wyM27297k4 = null;
        } else {
            abstractC7002u4M27420k4 = c7010x6.m27420k4(C7019kk.m27462to(Long.valueOf(C7019kk.m27435du(Long.valueOf(i4), 10) + C7019kk.m27435du((Object) 1110589744L, 10)), 10));
            if (abstractC7002u4M27420k4 == null) {
                abstractC7002u4M27420k4 = c7010x6.m27420k4(1110589744);
            }
            if (abstractC7002u4M27420k4 != null) {
                int i5 = c7010x6.m27423x1().f19015h4;
                if (i5 != 1281450528 && i5 != 1482250784) {
                    throw new NotSupportedException(C14113y2.m67402k4("Wrong ColorSpace: {0}", C7019kk.m27466x1(c7010x6.m27423x1().f19015h4)));
                }
                abstractC7008wyM27297k4 = C6977ak.m27297k4(i3, abstractC7002u4M27420k4);
            }
            abstractC7008wyM27297k4 = null;
        }
        if (abstractC7002u4M27420k4 == null) {
            int i6 = c7010x6.m27423x1().f19012du;
            if (i6 == 1196573017) {
                i2 = 6;
            } else {
                if (i6 != 1380401696) {
                    throw new C7004up();
                }
                i2 = 0;
            }
            abstractC7008wyM27297k4 = C6977ak.m27297k4(i2, null);
        }
        if (abstractC7008wyM27297k4 == null) {
            throw new C7000to();
        }
        abstractC7008wyM27297k4.m27406x1(c7010x6, z, i);
        return abstractC7008wyM27297k4;
    }

    /* JADX INFO: renamed from: to */
    private void m27405to(float[] fArr) {
        if (this.f19055k4.m27423x1().f19015h4 == 1281450528) {
            if (mo27325h4()) {
                C6999rv.m27390kk(fArr, false);
            } else {
                C6999rv.m27387k4(fArr, false);
            }
        }
        fArr[0] = C6979b3.m27311x1((fArr[0] * this.f19053du[0]) + this.f19054h4[0]);
        fArr[1] = C6979b3.m27311x1((fArr[1] * this.f19053du[1]) + this.f19054h4[1]);
        fArr[2] = C6979b3.m27311x1((fArr[2] * this.f19053du[2]) + this.f19054h4[2]);
        if (this.f19055k4.m27423x1().f19015h4 == 1281450528) {
            if (mo27325h4()) {
                C6999rv.m27393to(fArr, false);
            } else {
                C6999rv.m27396x1(fArr, false);
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m27410kk(float[] fArr) {
        if (this.f19057to && this.f19058x1) {
            m27405to(fArr);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC6981c5 m27413x1(int i) {
        AbstractC6981c5 abstractC6981c5M27408k4 = m27408k4(i);
        abstractC6981c5M27408k4.m27316k4();
        C7007wl c7007wl = new C7007wl();
        c7007wl.m27317k4(new float[2048]);
        for (int i2 = 0; i2 < 2048; i2++) {
            c7007wl.m27318kk()[i2] = abstractC6981c5M27408k4.m27319x1(i2 / 2047.0f);
        }
        return c7007wl;
    }

    /* JADX INFO: renamed from: x1 */
    private void m27406x1(C7010x6 c7010x6, boolean z, int i) {
        this.f19055k4 = c7010x6;
        this.f19058x1 = z;
        this.f19056kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27326k4() {
        int i = this.f19056kk;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            AbstractC7002u4 abstractC7002u4M27420k4 = this.f19055k4.m27420k4(2004119668);
            if (abstractC7002u4M27420k4 == null || !C7019kk.m27469x1(abstractC7002u4M27420k4, C7012yd.class)) {
                throw new C6997ne();
            }
            C7012yd c7012yd = (C7012yd) abstractC7002u4M27420k4;
            if (C6987e0.m27341x1(c7012yd.m27424up(), this.f19055k4.m27423x1().f19019ks)) {
                this.f19057to = true;
                this.f19053du[0] = c7012yd.m27424up().f19006k4 / this.f19055k4.m27423x1().f19019ks.f19006k4;
                this.f19053du[1] = c7012yd.m27424up().f19008x1 / this.f19055k4.m27423x1().f19019ks.f19008x1;
                this.f19053du[2] = c7012yd.m27424up().f19007kk / this.f19055k4.m27423x1().f19019ks.f19007kk;
                if (!this.f19058x1) {
                    float[] fArr = this.f19053du;
                    fArr[0] = 1.0f / fArr[0];
                    fArr[1] = 1.0f / fArr[1];
                    fArr[2] = 1.0f / fArr[2];
                }
                float[] fArr2 = this.f19054h4;
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                return;
            }
            return;
        }
        if (C7019kk.m27435du(Long.valueOf(this.f19055k4.m27423x1().f19018kk), 10) < 67108864) {
            this.f19057to = true;
            float[] fArr3 = this.f19053du;
            fArr3[0] = 0.9965153f;
            fArr3[1] = 0.9965269f;
            fArr3[2] = 0.9965208f;
            float[] fArr4 = this.f19054h4;
            fArr4[0] = 0.0016800256f;
            fArr4[1] = 0.0017365766f;
            fArr4[2] = 0.0014350219f;
            if (this.f19058x1) {
                return;
            }
            float f = 1.0f / fArr3[0];
            fArr3[0] = f;
            float f2 = 1.0f / fArr3[1];
            fArr3[1] = f2;
            float f3 = 1.0f / fArr3[2];
            fArr3[2] = f3;
            fArr4[0] = (-fArr4[0]) * f;
            fArr4[1] = (-fArr4[1]) * f2;
            fArr4[2] = (-fArr4[2]) * f3;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m27414x1(float[] fArr) {
        if (!this.f19057to || this.f19058x1) {
            return;
        }
        m27405to(fArr);
    }
}
