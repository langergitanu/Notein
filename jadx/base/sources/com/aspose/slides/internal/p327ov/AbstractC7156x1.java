package com.aspose.slides.internal.p327ov;

import OooO0O0.OooO00o;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p140fz.C4150m9;
import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p327ov.C7150h4;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.x1 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC7156x1<TCtx extends C7150h4> extends AbstractC7152k4<TCtx> {

    /* JADX INFO: renamed from: to */
    protected final C11898h4 f19302to;

    public AbstractC7156x1(C4804dy c4804dy, C11898h4 c11898h4) {
        super(c4804dy);
        this.f19302to = c11898h4;
    }

    /* JADX INFO: renamed from: dy */
    private float m27735dy(C7150h4 c7150h4) {
        float fM56895kk = 0.0f;
        C9468x1 c9468x1 = new C9468x1(new C12025x6(0.0f, 0.0f), new C12025x6(0.0f, 1.0f));
        for (int i = 0; i < c7150h4.f19280up.size(); i++) {
            List<C9466kk> list = c7150h4.f19280up.get(i);
            for (C9466kk c9466kk : list) {
                C12025x6 c12025x6M46540k4 = c9468x1.m46540k4(new C9468x1(c9466kk.m46518k4(), c9466kk.m46519x1()));
                if (c12025x6M46540k4 != null && C9467to.m46528k4(c12025x6M46540k4) && c12025x6M46540k4.m56895kk() < fM56895kk && c9466kk.m46520x1(c12025x6M46540k4, 0.01f)) {
                    fM56895kk = c12025x6M46540k4.m56895kk();
                    c7150h4.f19278ks = c7150h4.f19282yj.get(0).booleanValue();
                }
            }
            if (i > 0) {
                List<C9466kk> list2 = c7150h4.f19280up.get(i - 1);
                if (!list2.isEmpty() && !list.isEmpty()) {
                    C9466kk c9466kk2 = new C9466kk(((C9466kk) OooO00o.OooO00o(1, list2)).m46519x1(), list.get(0).m46518k4());
                    C12025x6 c12025x6M46540k42 = c9468x1.m46540k4(new C9468x1(c9466kk2.m46518k4(), c9466kk2.m46519x1()));
                    if (c12025x6M46540k42 != null && C9467to.m46528k4(c12025x6M46540k42) && c12025x6M46540k42.m56895kk() < fM56895kk && c9466kk2.m46520x1(c12025x6M46540k42, 0.01f)) {
                        fM56895kk = c12025x6M46540k42.m56895kk();
                        c7150h4.f19278ks = false;
                    }
                }
            }
        }
        return Math.abs(fM56895kk);
    }

    /* JADX INFO: renamed from: k4 */
    private float m27737k4(float f, float f2, float f3, float f4, float f5) {
        return ((f4 * f2) + f) - (f5 * f3);
    }

    /* JADX INFO: renamed from: m9 */
    private float m27739m9() {
        return this.f19286x1.m56930ne() * this.f19302to.m55599dy() * mo27710h4();
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public TCtx mo27701k4() {
        TCtx tctx = (TCtx) mo27716to();
        C11896dy c11896dy = (C11896dy) mo27713kk().deepClone();
        tctx.f19277fa = c11896dy;
        c11896dy.m55526dy();
        m27740m9(tctx);
        float fM27735dy = m27735dy(tctx);
        tctx.f19293k4 = -fM27735dy;
        float fMo27710h4 = mo27710h4();
        tctx.f19297x1 = this.f19286x1.m56930ne() * fM27735dy * fMo27710h4;
        if (m27747x1() >= this.f19284k4.m19881to()) {
            fMo27710h4 *= 2.0f;
        }
        tctx.f19279rv = fMo27710h4;
        return tctx;
    }

    /* JADX INFO: renamed from: h4 */
    public float mo27710h4() {
        float fM55596c5 = this.f19302to.m55596c5();
        if (fM55596c5 <= 0.0f) {
            return 1.0f;
        }
        return fM55596c5;
    }

    /* JADX INFO: renamed from: kk */
    public abstract C11896dy mo27713kk();

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public abstract void mo27707x1(TCtx tctx);

    /* JADX INFO: renamed from: to */
    public abstract TCtx mo27716to();

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final void mo27704kk(TCtx tctx) {
    }

    /* JADX INFO: renamed from: x1 */
    public float m27747x1() {
        return this.f19302to.m55596c5() * this.f19284k4.m19882x1();
    }

    /* JADX INFO: renamed from: h4 */
    private void m27736h4(TCtx tctx) {
        Iterator<C2633x1> itM12022kk = tctx.f19287c5.m12022kk();
        if (itM12022kk.hasNext()) {
            C12025x6 c12025x6M12036to = itM12022kk.next().m12036to();
            float[] fArrM27482k4 = this.f19285kk.m27482k4(tctx.f19294kk, tctx.f19296to, c12025x6M12036to.m56897x1(), c12025x6M12036to.m56895kk());
            tctx.f19290dy = new C12025x6(fArrM27482k4[0], fArrM27482k4[1]);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m27740m9(C7150h4 c7150h4) {
        C7148du c7148du = new C7148du();
        C4803du.m19876k4(c7150h4.f19277fa, c7148du);
        c7150h4.f19280up = c7148du.m27721kk();
        c7150h4.f19282yj = c7148du.m27722to();
    }

    /* JADX INFO: renamed from: x1 */
    private float m27741x1(float f, float f2, float f3, float f4, float f5) {
        return (f5 * f2) + (f4 * f3) + f;
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public final void mo27705to(TCtx tctx) {
    }

    /* JADX INFO: renamed from: k4 */
    public float m27743k4(C7150h4 c7150h4, float f, float f2, float f3, float f4) {
        C9468x1 c9468x1 = new C9468x1(new C12025x6(f, f2), new C12025x6(f3, f4));
        C9466kk c9466kk = new C9466kk(f, f2, f3, f4);
        double d = c7150h4.f19294kk;
        double d2 = c7150h4.f19296to;
        double d3 = c7150h4.f19297x1;
        if (c9468x1.m46542k4()) {
            double d4 = f3;
            double[] dArrM46530k4 = C9467to.m46530k4(1.0d, d2 * (-2.0d), ((d * d) + C21825OoooOO0.OooO00o(d4, 2.0d, d, (d4 * d4) + (d2 * d2))) - (d3 * d3));
            if (dArrM46530k4 == null) {
                return 0.0f;
            }
            double d5 = dArrM46530k4[0];
            float f5 = (float) d4;
            float f6 = (float) d5;
            if (c9466kk.m46520x1(new C12025x6(f5, f6), 0.01f)) {
                c7150h4.f19281x6 = new C12025x6(f5, f6);
                float f7 = (float) (d4 - d);
                return C9467to.m46533x1(f7, (float) (((double) f4) - d2), f7, (float) (d5 - d2));
            }
            if (dArrM46530k4.length < 2) {
                return 0.0f;
            }
            double d6 = dArrM46530k4[1];
            float f8 = (float) d6;
            if (!c9466kk.m46520x1(new C12025x6(f5, f8), 0.01f)) {
                return 0.0f;
            }
            c7150h4.f19281x6 = new C12025x6(f5, f8);
            float f9 = (float) (d4 - d);
            return C9467to.m46533x1(f9, (float) (((double) f4) - d2), f9, (float) (d6 - d2));
        }
        float f10 = -c9468x1.f34471k4;
        float f11 = c9468x1.f34475x1;
        double d7 = f10 / f11;
        double d8 = ((double) ((-c9468x1.f34472kk) / f11)) - d2;
        double[] dArrM46530k42 = C9467to.m46530k4((d7 * d7) + 1.0d, ((d7 * 2.0d) * d8) - (2.0d * d), ((d8 * d8) + (d * d)) - (d3 * d3));
        if (dArrM46530k42 == null) {
            return 0.0f;
        }
        double d9 = dArrM46530k42[0];
        float f12 = (float) d9;
        double dM46537k4 = c9468x1.m46537k4(f12);
        float f13 = (float) dM46537k4;
        if (c9466kk.m46520x1(new C12025x6(f12, f13), 0.01f)) {
            c7150h4.f19281x6 = new C12025x6(f12, f13);
            return C9467to.m46533x1((float) (((double) f3) - d), (float) (((double) f4) - d2), (float) (d9 - d), (float) (dM46537k4 - d2));
        }
        if (dArrM46530k42.length < 2) {
            return 0.0f;
        }
        double d10 = dArrM46530k42[1];
        float f14 = (float) d10;
        double dM46537k42 = c9468x1.m46537k4(f14);
        float f15 = (float) dM46537k42;
        if (!c9466kk.m46520x1(new C12025x6(f14, f15), 0.01f)) {
            return 0.0f;
        }
        c7150h4.f19281x6 = new C12025x6(f14, f15);
        return C9467to.m46533x1((float) (((double) f3) - d), (float) (((double) f4) - d2), (float) (d10 - d), (float) (dM46537k42 - d2));
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void mo27729du(TCtx tctx) {
        m27736h4((C7150h4) tctx);
        C12025x6 c12025x6 = new C12025x6(tctx.f19294kk, tctx.f19296to);
        float fM27739m9 = m27739m9();
        if (fM27739m9 != 0.0f && mo27711k4((C7150h4) tctx)) {
            C12025x6 c12025x62 = tctx.f19281x6;
            if (c12025x62 == null) {
                Iterator<C2633x1> itM12022kk = tctx.f19287c5.m12022kk();
                if (itM12022kk.hasNext()) {
                    c12025x6 = m27738k4(fM27739m9, c12025x6, itM12022kk.next().m12036to(), itM12022kk);
                }
            } else {
                c12025x6 = m27738k4(fM27739m9, c12025x6, c12025x62, (Iterator<C2633x1>) null);
            }
        }
        tctx.f19287c5.m12021k4(C2633x1.m12029k4(c12025x6.m56897x1(), c12025x6.m56895kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m27738k4(float f, C12025x6 c12025x6, C12025x6 c12025x62, Iterator<C2633x1> it) {
        C12025x6 c12025x6M46524k4 = C9467to.m46524k4(new C9468x1(c12025x6, c12025x62), c12025x6, c12025x62, f);
        if (f > 0.0f && f >= C9467to.m46521k4(c12025x6, c12025x62) && it != null) {
            it.remove();
        }
        return c12025x6M46524k4;
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m27744k4(C7150h4 c7150h4, float f, float f2, C12025x6 c12025x6) {
        float f3 = c7150h4.f19294kk;
        float f4 = c7150h4.f19296to;
        float[] fArrM27482k4 = this.f19285kk.m27482k4(f3, f4, f, f2);
        C7024du c7024duMo16588x1 = C4150m9.m16599k4(this.f19284k4).mo16588x1(fArrM27482k4[0], fArrM27482k4[1]);
        float f5 = -c7024duMo16588x1.f19088k4;
        float f6 = c7150h4.f19279rv;
        float f7 = f5 * f6;
        float f8 = (-c7024duMo16588x1.f19091x1) * f6;
        return new C12025x6(m27737k4(f3, f7, f8, c12025x6.m56897x1(), c12025x6.m56895kk()), m27741x1(f4, f7, f8, c12025x6.m56897x1(), c12025x6.m56895kk()));
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo27734k4(TCtx tctx, float f, float f2) {
        tctx.f19289du = f;
        tctx.f19291h4 = f2;
        if (tctx.f19288ck || tctx.f19297x1 == 0.0f || C9467to.m46532kk(tctx.f19294kk, tctx.f19296to, f, f2) <= tctx.f19297x1) {
            return;
        }
        tctx.f19288ck = true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo27711k4(TCtx tctx) {
        return true;
    }
}
