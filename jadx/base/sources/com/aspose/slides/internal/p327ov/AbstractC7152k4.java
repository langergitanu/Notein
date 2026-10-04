package com.aspose.slides.internal.p327ov;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p315od.C7029m9;
import com.aspose.slides.internal.p327ov.C7153kk;
import com.aspose.slides.internal.p327ov.InterfaceC7155to;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.k4 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC7152k4<TCtx extends C7153kk> implements InterfaceC7155to {

    /* JADX INFO: renamed from: k4 */
    protected final C4804dy f19284k4;

    /* JADX INFO: renamed from: kk */
    protected final C7029m9 f19285kk = new C7029m9();

    /* JADX INFO: renamed from: x1 */
    protected final C12026yj f19286x1;

    public AbstractC7152k4(C4804dy c4804dy) {
        this.f19284k4 = c4804dy;
        this.f19286x1 = c4804dy.m19879k4();
    }

    /* JADX INFO: renamed from: h4 */
    private InterfaceC7155to.k4 m27728h4(TCtx tctx) {
        InterfaceC7155to.k4 k4Var = new InterfaceC7155to.k4();
        k4Var.f19298k4 = tctx.f19287c5;
        k4Var.f19301x1 = tctx.f19292jd;
        k4Var.f19299kk = new C12025x6(tctx.f19294kk, tctx.f19296to);
        k4Var.f19300to = tctx.f19290dy;
        return k4Var;
    }

    /* JADX INFO: renamed from: du */
    public void mo27729du(TCtx tctx) {
    }

    /* JADX INFO: renamed from: k4 */
    public float m27730k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        float f11 = 0.0f;
        float f12 = 1.0f;
        while (true) {
            f10 = (f11 + f12) / 2.0f;
            if (Math.abs(f11 - f12) < 0.01f) {
                break;
            }
            C12025x6 c12025x6M46534x1 = C9467to.m46534x1(f10, f4, f5, f6, f7, f8, f9);
            double dM46532kk = C9467to.m46532kk(f2, f3, c12025x6M46534x1.m56897x1(), c12025x6M46534x1.m56895kk());
            double d = f;
            if (Math.abs(dM46532kk - d) < 0.009999999776482582d) {
                break;
            }
            if (dM46532kk < d) {
                f11 = f10;
            } else {
                f12 = f10;
            }
        }
        return f10;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract TCtx mo27701k4();

    /* JADX INFO: renamed from: kk */
    public abstract void mo27704kk(TCtx tctx);

    /* JADX INFO: renamed from: to */
    public abstract void mo27705to(TCtx tctx);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo27707x1(TCtx tctx);

    /* JADX INFO: renamed from: k4 */
    public float m27731k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12;
        float f13 = 1.0f;
        float f14 = 0.0f;
        while (true) {
            if (f14 > 0.9f) {
                break;
            }
            float f15 = f14 + 0.1f;
            C12025x6 c12025x6M46523k4 = C9467to.m46523k4(f15, f4, f5, f6, f7, f8, f9, f10, f11);
            if (C9467to.m46532kk(f2, f3, c12025x6M46523k4.m56897x1(), c12025x6M46523k4.m56895kk()) >= f) {
                f13 = f15;
                break;
            }
            f13 = f15;
            f14 = f13;
        }
        while (true) {
            f12 = (f14 + f13) / 2.0f;
            if (Math.abs(f14 - f13) < 0.01f) {
                break;
            }
            C12025x6 c12025x6M46523k42 = C9467to.m46523k4(f12, f4, f5, f6, f7, f8, f9, f10, f11);
            double dM46532kk = C9467to.m46532kk(f2, f3, c12025x6M46523k42.m56897x1(), c12025x6M46523k42.m56895kk());
            double d = f;
            if (Math.abs(dM46532kk - d) < 0.009999999776482582d) {
                break;
            }
            if (dM46532kk < d) {
                f14 = f12;
            } else {
                f13 = f12;
            }
        }
        return f12;
    }

    @Override // com.aspose.slides.internal.p327ov.InterfaceC7155to
    /* JADX INFO: renamed from: k4 */
    public InterfaceC7155to.k4 mo27702k4(C2631kk c2631kk) {
        C7153kk c7153kkMo27701k4 = mo27701k4();
        Iterator<C2633x1> itM12022kk = c2631kk.m12022kk();
        while (itM12022kk.hasNext()) {
            C2633x1 next = itM12022kk.next();
            if (c7153kkMo27701k4.f19288ck) {
                c7153kkMo27701k4.f19287c5.m12025x1(next);
            } else {
                c7153kkMo27701k4.f19295m9 = next.m12035kk();
                int iM12037x1 = next.m12037x1();
                if (iM12037x1 == 2) {
                    m27733k4(c7153kkMo27701k4);
                } else if (iM12037x1 == 4) {
                    mo27707x1(c7153kkMo27701k4);
                } else if (iM12037x1 == 6) {
                    mo27704kk(c7153kkMo27701k4);
                } else if (iM12037x1 == 8) {
                    mo27705to(c7153kkMo27701k4);
                } else if (iM12037x1 == 10) {
                    c7153kkMo27701k4.f19288ck = true;
                }
            }
        }
        mo27729du(c7153kkMo27701k4);
        return m27728h4(c7153kkMo27701k4);
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m27732k4(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        C12025x6[] c12025x6ArrM46531k4 = C9467to.m46531k4(f, f2, f3, f4, f5, f6, f7);
        if (c12025x6ArrM46531k4.length != 1 && C9467to.m46532kk(c12025x6ArrM46531k4[0].m56897x1(), c12025x6ArrM46531k4[0].m56895kk(), f6, f7) >= C9467to.m46532kk(c12025x6ArrM46531k4[1].m56897x1(), c12025x6ArrM46531k4[1].m56895kk(), f6, f7)) {
            return c12025x6ArrM46531k4[1];
        }
        return c12025x6ArrM46531k4[0];
    }

    /* JADX INFO: renamed from: k4 */
    public void m27733k4(TCtx tctx) {
        float[] fArr = tctx.f19295m9;
        float f = fArr[0];
        tctx.f19294kk = f;
        float f2 = fArr[1];
        tctx.f19296to = f2;
        mo27734k4(tctx, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27734k4(TCtx tctx, float f, float f2) {
        tctx.f19289du = f;
        tctx.f19291h4 = f2;
    }
}
