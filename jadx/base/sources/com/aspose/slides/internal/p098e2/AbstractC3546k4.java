package com.aspose.slides.internal.p098e2;

import com.aspose.slides.internal.p044bq.C1834du;
import com.aspose.slides.internal.p044bq.C1835h4;
import com.aspose.slides.internal.p044bq.C1836k4;
import com.aspose.slides.internal.p044bq.C1837kk;
import com.aspose.slides.internal.p044bq.C1839x1;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p315od.C7023c5;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7031x1;
import com.aspose.slides.internal.p315od.EnumC7025dy;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.e2.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3546k4 implements InterfaceC3545h4 {

    /* JADX INFO: renamed from: k4 */
    protected final float f9879k4;

    /* JADX INFO: renamed from: kk */
    protected final C1834du f9880kk;

    /* JADX INFO: renamed from: to */
    protected final List<C1835h4> f9881to;

    /* JADX INFO: renamed from: x1 */
    protected final C1837kk f9882x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e2.k4$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ int[] f9883k4;

        static {
            int[] iArr = new int[EnumC7025dy.values().length];
            f9883k4 = iArr;
            try {
                iArr[EnumC7025dy.QUAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9883k4[EnumC7025dy.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9883k4[EnumC7025dy.CURVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractC3546k4(C1837kk c1837kk) {
        this.f9879k4 = c1837kk.m9596kk() / 2.0f;
        this.f9882x1 = c1837kk;
        this.f9880kk = c1837kk.m9583h4();
        this.f9881to = c1837kk.m9599m9();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m14418k4(C1836k4 c1836k4, float[] fArr, float[] fArr2, int i, float f) {
        C1836k4 c1836k42;
        float f2 = fArr[2] - fArr[0];
        float f3 = fArr[3] - fArr[1];
        if (f3 == 0.0f || f2 == 0.0f) {
            c1836k42 = c1836k4;
            c1836k42.m9568k4(fArr, i);
        } else {
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
            float f4 = f2 / fSqrt;
            float f5 = f3 / fSqrt;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = (f5 * f7) + (f4 * f6);
            float f9 = (f7 * f4) - (f6 * f5);
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = (f5 * f11) + (f4 * f10);
            float f13 = (f11 * f4) - (f10 * f5);
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = (f5 * f15) + (f4 * f14);
            float f17 = (f15 * f4) - (f14 * f5);
            if (i != 6) {
                if (i == 8) {
                    float f18 = fArr[6];
                    float f19 = fArr[7];
                    c1836k4.m9567k4(f8, f9, f12, f13, f16, f17, (f5 * f19) + (f4 * f18), (f4 * f19) - (f5 * f18));
                }
                c1836k42 = c1836k4;
            } else {
                c1836k4.m9566k4(f8, f9, f12, f13, f16, f17);
                c1836k42 = c1836k4;
            }
        }
        int iM9571x1 = c1836k42.m9571x1(fArr2, 0);
        int iM9569kk = c1836k42.m9569kk(fArr2, iM9571x1) + iM9571x1;
        if (i == 8) {
            iM9569kk += c1836k42.m9570to(fArr2, iM9569kk);
        }
        int iM9612k4 = C1839x1.m9612k4(fArr2, 0, c1836k42.m9564k4(fArr2, iM9569kk, f, 1.0E-4f) + iM9569kk, 1.0E-4f, 0.9999f);
        C1839x1.m9616k4(fArr2, 0, iM9612k4);
        return iM9612k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo14417k4(C1835h4 c1835h4, C12025x6 c12025x6, C7024du c7024du);

    /* JADX INFO: renamed from: kk */
    public void m14423kk() {
        this.f9882x1.m9580c5();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
        this.f9882x1.m9582dy();
    }

    /* JADX INFO: renamed from: k4 */
    private C7024du m14419k4(C1835h4 c1835h4, C12025x6 c12025x6) {
        C7024du c7024duMo16588x1;
        C9466kk.k4 k4Var;
        if (this.f9882x1.m9581du()) {
            c7024duMo16588x1 = new C7024du();
        } else {
            c7024duMo16588x1 = this.f9880kk.f6631x1.mo16588x1(c12025x6.m56897x1(), c12025x6.m56895kk());
            C9466kk.k4 k4VarM27472k4 = c7024duMo16588x1.m27472k4(this.f9880kk.f6624du.m56897x1(), this.f9880kk.f6624du.m56895kk(), c12025x6.m56897x1(), c12025x6.m56895kk());
            C1834du c1834du = this.f9880kk;
            if (c1834du.f6627k4 == null) {
                c1834du.f6627k4 = k4VarM27472k4;
            }
            C9466kk.k4 k4Var2 = c1834du.f6627k4;
            if (k4Var2 == k4VarM27472k4 || !((k4Var2 == (k4Var = C9466kk.k4.LEFT) || k4Var2 == C9466kk.k4.RIGHT) && (k4VarM27472k4 == k4Var || k4VarM27472k4 == C9466kk.k4.RIGHT))) {
                InterfaceC4146h4 interfaceC4146h4 = c1834du.f6631x1;
                InterfaceC4146h4 interfaceC4146h42 = c1835h4.f6639k4;
                if (interfaceC4146h4 != interfaceC4146h42) {
                    c7024duMo16588x1 = interfaceC4146h42.mo16588x1(c12025x6.m56897x1(), c12025x6.m56895kk());
                }
            } else {
                c7024duMo16588x1 = c1835h4.f6639k4.mo16587k4(c12025x6.m56897x1(), c12025x6.m56895kk());
            }
        }
        if (c1835h4.f6641m9 == null) {
            C9466kk.k4[] k4VarArrM14420k4 = m14420k4(this.f9880kk.f6624du, c12025x6, c7024duMo16588x1);
            c1835h4.f6641m9 = k4VarArrM14420k4[0];
            c1835h4.f6635dy = k4VarArrM14420k4[1];
        }
        return c7024duMo16588x1;
    }

    /* JADX INFO: renamed from: kk */
    public void m14424kk(C1835h4 c1835h4, float f, float f2, float f3, float f4) {
        if (this.f9882x1.m9581du()) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.f9882x1.m9597kk(c1835h4, f + f3, f2 + f4);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        AbstractC3546k4 abstractC3546k4 = this;
        float f13 = f;
        float f14 = f2;
        if (C9467to.m46529k4(abstractC3546k4.f9880kk.f6624du, new C12025x6(f13, f14), 0.001f)) {
            return;
        }
        float fM56897x1 = f13 - abstractC3546k4.f9880kk.f6624du.m56897x1();
        float fM56895kk = f14 - abstractC3546k4.f9880kk.f6624du.m56895kk();
        if (fM56897x1 == 0.0f && fM56895kk == 0.0f) {
            fM56897x1 = 1.0f;
        }
        float f15 = fM56897x1;
        C12025x6 c12025x6 = new C12025x6(f15, fM56895kk);
        for (C1835h4 c1835h4 : abstractC3546k4.f9881to) {
            C7024du c7024duM14419k4 = abstractC3546k4.m14419k4(c1835h4, c12025x6);
            float f16 = c7024duM14419k4.f19088k4;
            float f17 = c7024duM14419k4.f19091x1;
            float f18 = c7024duM14419k4.f19089kk;
            float f19 = c7024duM14419k4.f19090to;
            c1835h4.f6632c5 = null;
            c1835h4.f6638jd = null;
            c1835h4.f6633ck = null;
            c1835h4.f6636fa = null;
            abstractC3546k4.mo14417k4(c1835h4, c12025x6, c7024duM14419k4);
            C12025x6 c12025x62 = c1835h4.f6632c5;
            if (c12025x62 != null) {
                abstractC3546k4.f9882x1.m9598kk(c1835h4, c12025x62);
                if (C9467to.m46529k4(c1835h4.f6632c5, c1835h4.f6638jd, 0.0f)) {
                    f3 = f18;
                    f4 = f19;
                } else {
                    f3 = f18;
                    f4 = f19;
                    abstractC3546k4.m14425x1(c1835h4, c1835h4.f6638jd.m56897x1(), c1835h4.f6638jd.m56895kk(), 0.0f, 0.0f);
                }
                f7 = f13;
                f8 = f14;
                f5 = f16;
                f6 = f17;
            } else {
                f3 = f18;
                f4 = f19;
                f5 = f16;
                f6 = f17;
                abstractC3546k4.m14425x1(c1835h4, abstractC3546k4.f9880kk.f6624du.m56897x1(), abstractC3546k4.f9880kk.f6624du.m56895kk(), f5, f6);
                abstractC3546k4 = this;
                f7 = f13;
                f8 = f14;
            }
            abstractC3546k4.m14425x1(c1835h4, f7, f8, f5, f6);
            C12025x6 c12025x63 = c1835h4.f6633ck;
            if (c12025x63 != null) {
                abstractC3546k4.f9882x1.m9600to(c1835h4, c12025x63);
                if (!C9467to.m46529k4(c1835h4.f6633ck, c1835h4.f6636fa, 0.0f)) {
                    abstractC3546k4.m14424kk(c1835h4, c1835h4.f6636fa.m56897x1(), c1835h4.f6636fa.m56895kk(), 0.0f, 0.0f);
                }
                f11 = f;
                f12 = f2;
                f9 = f3;
                f10 = f4;
            } else {
                f9 = f3;
                f10 = f4;
                abstractC3546k4.m14424kk(c1835h4, abstractC3546k4.f9880kk.f6624du.m56897x1(), abstractC3546k4.f9880kk.f6624du.m56895kk(), f9, f10);
                abstractC3546k4 = this;
                f11 = f;
                f12 = f2;
            }
            abstractC3546k4.m14424kk(c1835h4, f11, f12, f9, f10);
            c7024duM14419k4.m27474k4(c1835h4.f6642to);
            f13 = f11;
            f14 = f12;
        }
        abstractC3546k4.f9880kk.f6626h4.m56891k4(f15);
        abstractC3546k4.f9880kk.f6626h4.m56898x1(fM56895kk);
        abstractC3546k4.f9880kk.f6624du.m56891k4(f13);
        abstractC3546k4.f9880kk.f6624du.m56898x1(f14);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        this.f9880kk.f6628kk.m56891k4(f);
        this.f9880kk.f6628kk.m56898x1(f2);
        this.f9880kk.f6624du.m56891k4(f);
        this.f9880kk.f6624du.m56898x1(f2);
        this.f9880kk.f6630to.m56891k4(1.0f);
        this.f9880kk.f6630to.m56898x1(0.0f);
        this.f9880kk.f6626h4.m56891k4(1.0f);
        this.f9880kk.f6626h4.m56898x1(0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public void m14425x1(C1835h4 c1835h4, float f, float f2, float f3, float f4) {
        if (this.f9882x1.m9581du()) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.f9882x1.m9604x1(c1835h4, f + f3, f2 + f4);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        char c;
        int i;
        C1834du c1834du = this.f9880kk;
        float[] fArr = c1834du.f6625dy;
        char c2 = 0;
        fArr[0] = c1834du.f6624du.m56897x1();
        float fM56895kk = this.f9880kk.f6624du.m56895kk();
        int i2 = 1;
        fArr[1] = fM56895kk;
        fArr[2] = f;
        fArr[3] = f2;
        fArr[4] = f3;
        char c3 = 5;
        fArr[5] = f4;
        float f5 = fArr[0];
        float f6 = f - f5;
        float f7 = f2 - fM56895kk;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        if ((f6 == 0.0f && f7 == 0.0f) || (f8 == 0.0f && f9 == 0.0f)) {
            f6 = f3 - f5;
            f7 = f4 - fM56895kk;
            f8 = f6;
            f9 = f7;
        }
        if (f6 != 0.0f || f7 != 0.0f) {
            if (Math.abs(f6) >= 0.1f || Math.abs(f7) >= 0.1f) {
                c = 3;
                i = 4;
            } else {
                c = 3;
                i = 4;
                float fSqrt = (float) Math.sqrt((f7 * f7) + (f6 * f6));
                f6 /= fSqrt;
                f7 /= fSqrt;
            }
            if (Math.abs(f8) < 0.1f && Math.abs(f9) < 0.1f) {
                float fSqrt2 = (float) Math.sqrt((f9 * f9) + (f8 * f8));
                f8 /= fSqrt2;
                f9 /= fSqrt2;
            }
            C12025x6 c12025x6 = new C12025x6(f6, f7);
            for (C1835h4 c1835h4 : this.f9881to) {
                mo14417k4(c1835h4, c12025x6, m14419k4(c1835h4, c12025x6));
            }
            C1834du c1834du2 = this.f9880kk;
            int iM14418k4 = m14418k4(c1834du2.f6629m9, fArr, c1834du2.f6623c5, 6, this.f9879k4);
            C1834du c1834du3 = this.f9880kk;
            C1836k4.k4 k4VarM9565k4 = c1834du3.f6629m9.m9565k4(fArr, 6, c1834du3.f6623c5, iM14418k4);
            int i3 = 0;
            while (k4VarM9565k4.m9573k4()) {
                int iM9574x1 = k4VarM9565k4.m9574x1();
                for (C1835h4 c1835h42 : this.f9881to) {
                    char c4 = c2;
                    C7023c5 c7023c5Mo16591k4 = c1835h42.f6639k4.mo16591k4(fArr, iM9574x1);
                    char c5 = c3;
                    float[] fArr2 = c7023c5Mo16591k4.f19087x1;
                    float[] fArr3 = c7023c5Mo16591k4.f19086kk;
                    int i4 = i2;
                    C1836k4.k4 k4Var = k4VarM9565k4;
                    this.f9882x1.m9604x1(c1835h42, fArr2[c4], fArr2[i4]);
                    int i5 = AnonymousClass1.f9883k4[c7023c5Mo16591k4.f19085k4.ordinal()];
                    if (i5 == i4) {
                        this.f9882x1.m9590k4(c1835h42, fArr2[2], fArr2[c], fArr2[i], fArr2[c5]);
                        this.f9882x1.m9605x1(c1835h42, fArr3[c4], fArr3[i4], fArr3[2], fArr3[c]);
                        i3 = 6;
                    } else if (i5 == 2) {
                        this.f9882x1.m9604x1(c1835h42, fArr2[2], fArr2[c]);
                        this.f9882x1.m9597kk(c1835h42, fArr3[c4], fArr3[i4]);
                        i3 = i;
                    }
                    this.f9882x1.m9597kk(c1835h42, fArr3[i3 - 2], fArr3[i3 - 1]);
                    k4VarM9565k4 = k4Var;
                    c3 = c5;
                    i2 = i4;
                    c2 = c4;
                }
            }
            for (C1835h4 c1835h43 : this.f9881to) {
                c1835h43.f6639k4.mo16588x1(f8, f9).m27474k4(c1835h43.f6642to);
            }
            this.f9880kk.f6626h4.m56891k4(f8);
            this.f9880kk.f6626h4.m56898x1(f9);
            this.f9880kk.f6624du.m56891k4(f3);
            this.f9880kk.f6624du.m56898x1(f4);
            return;
        }
        mo9603x1(f5, fM56895kk);
    }

    /* JADX INFO: renamed from: x1 */
    public void m14426x1(C1835h4 c1835h4, C12025x6 c12025x6, C7024du c7024du) {
        m14422k4(c1835h4, this.f9880kk.f6624du.m56897x1(), this.f9880kk.f6624du.m56895kk(), c7024du.f19088k4, c7024du.f19091x1);
        c12025x6.CloneTo(this.f9880kk.f6630to);
        c7024du.m27474k4(c1835h4.f6640kk);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        int i;
        char c;
        C1835h4 c1835h4;
        C1834du c1834du = this.f9880kk;
        float[] fArr = c1834du.f6625dy;
        fArr[0] = c1834du.f6624du.m56897x1();
        float fM56895kk = this.f9880kk.f6624du.m56895kk();
        fArr[1] = fM56895kk;
        fArr[2] = f;
        fArr[3] = f2;
        int i2 = 4;
        fArr[4] = f3;
        char c2 = 5;
        fArr[5] = f4;
        char c3 = 6;
        fArr[6] = f5;
        char c4 = 7;
        fArr[7] = f6;
        float f7 = fArr[0];
        float f8 = f - f7;
        float f9 = f2 - fM56895kk;
        float f10 = f5 - f3;
        float f11 = f6 - f4;
        boolean z = f8 == 0.0f && f9 == 0.0f;
        boolean z2 = f10 == 0.0f && f11 == 0.0f;
        if (z) {
            f8 = f3 - f7;
            f9 = f4 - fM56895kk;
            if (f8 == 0.0f && f9 == 0.0f) {
                f8 = f5 - f7;
                f9 = f6 - fM56895kk;
            }
        }
        if (z2) {
            f10 = f5 - f;
            f11 = f6 - f2;
            if (f10 == 0.0f && f11 == 0.0f) {
                f10 = f5 - f7;
                f11 = f6 - fM56895kk;
            }
        }
        if (f8 != 0.0f || f9 != 0.0f) {
            if (Math.abs(f8) >= 0.1f || Math.abs(f9) >= 0.1f) {
                i = 0;
                c = 1;
            } else {
                i = 0;
                c = 1;
                float fSqrt = (float) Math.sqrt((f9 * f9) + (f8 * f8));
                f8 /= fSqrt;
                f9 /= fSqrt;
            }
            if (Math.abs(f10) < 0.1f && Math.abs(f11) < 0.1f) {
                float fSqrt2 = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                f10 /= fSqrt2;
                f11 /= fSqrt2;
            }
            float f12 = f10;
            float f13 = f11;
            C12025x6 c12025x6 = new C12025x6(f8, f9);
            for (C1835h4 c1835h42 : this.f9881to) {
                mo14417k4(c1835h42, c12025x6, m14419k4(c1835h42, c12025x6));
            }
            C1834du c1834du2 = this.f9880kk;
            int iM14418k4 = m14418k4(c1834du2.f6629m9, fArr, c1834du2.f6623c5, 8, this.f9879k4);
            C1834du c1834du3 = this.f9880kk;
            C1836k4.k4 k4VarM9565k4 = c1834du3.f6629m9.m9565k4(fArr, 8, c1834du3.f6623c5, iM14418k4);
            int i3 = i;
            while (k4VarM9565k4.m9573k4()) {
                int iM9574x1 = k4VarM9565k4.m9574x1();
                int i4 = i2;
                for (C1835h4 c1835h43 : this.f9881to) {
                    char c5 = c2;
                    char c6 = c3;
                    C7031x1 c7031x1Mo16593x1 = c1835h43.f6639k4.mo16593x1(fArr, iM9574x1);
                    char c7 = c4;
                    float[] fArr2 = c7031x1Mo16593x1.f19110x1;
                    float[] fArr3 = c7031x1Mo16593x1.f19109kk;
                    float[] fArr4 = fArr;
                    this.f9882x1.m9604x1(c1835h43, fArr2[i], fArr2[c]);
                    this.f9882x1.m9597kk(c1835h43, fArr3[i], fArr3[c]);
                    int i5 = AnonymousClass1.f9883k4[c7031x1Mo16593x1.f19108k4.ordinal()];
                    if (i5 == 2) {
                        c1835h4 = c1835h43;
                        this.f9882x1.m9604x1(c1835h4, fArr2[2], fArr2[3]);
                        this.f9882x1.m9597kk(c1835h4, fArr3[i], fArr3[c]);
                        i3 = i4;
                    } else if (i5 != 3) {
                        c1835h4 = c1835h43;
                    } else {
                        this.f9882x1.m9591k4(c1835h43, fArr2[2], fArr2[3], fArr2[i4], fArr2[c5], fArr2[c6], fArr2[c7]);
                        this.f9882x1.m9606x1(c1835h43, fArr3[i], fArr3[c], fArr3[2], fArr3[3], fArr3[i4], fArr3[c5]);
                        c1835h4 = c1835h43;
                        i3 = 8;
                    }
                    this.f9882x1.m9597kk(c1835h4, fArr3[i3 - 2], fArr3[i3 - 1]);
                    c3 = c6;
                    c2 = c5;
                    c4 = c7;
                    fArr = fArr4;
                }
                i2 = i4;
            }
            for (C1835h4 c1835h44 : this.f9881to) {
                c1835h44.f6639k4.mo16588x1(f12, f13).m27474k4(c1835h44.f6642to);
            }
            this.f9880kk.f6626h4.m56891k4(f12);
            this.f9880kk.f6626h4.m56898x1(f13);
            this.f9880kk.f6624du.m56891k4(f5);
            this.f9880kk.f6624du.m56898x1(f6);
            return;
        }
        mo9603x1(f7, fM56895kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m14421k4(C1835h4 c1835h4) {
        this.f9882x1.m9588k4(c1835h4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m14422k4(C1835h4 c1835h4, float f, float f2, float f3, float f4) {
        if (this.f9882x1.m9581du()) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.f9882x1.m9589k4(c1835h4, f + f3, f2 + f4);
    }

    /* JADX INFO: renamed from: k4 */
    private C9466kk.k4[] m14420k4(C12025x6 c12025x6, C12025x6 c12025x62, C7024du c7024du) {
        float fM56897x1 = c12025x6.m56897x1() + c7024du.f19088k4;
        float fM56895kk = c12025x6.m56895kk() + c7024du.f19091x1;
        float fM56897x12 = c12025x6.m56897x1() + c7024du.f19089kk;
        float fM56895kk2 = c12025x6.m56895kk() + c7024du.f19090to;
        C12025x6 c12025x63 = new C12025x6(c12025x62.m56897x1() + c12025x6.m56897x1(), c12025x62.m56895kk() + c12025x6.m56895kk());
        return new C9466kk.k4[]{C9466kk.m46515k4(c12025x6, c12025x63, new C12025x6(fM56897x1, fM56895kk)), C9466kk.m46515k4(c12025x6, c12025x63, new C12025x6(fM56897x12, fM56895kk2))};
    }
}
