package com.aspose.slides.internal.p247ld;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p084dj.C3166k4;
import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p180ib.C4807kk;
import com.aspose.slides.internal.p180ib.C4808m9;
import com.aspose.slides.internal.p180ib.C4810x1;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p538z2.C13356x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ld.kk */
/* JADX INFO: loaded from: classes.dex */
public class C6027kk extends AbstractC6026k4 {

    /* JADX INFO: renamed from: kk */
    private final C3166k4 f17065kk;

    /* JADX INFO: renamed from: x1 */
    private final C4808m9 f17066x1;

    public C6027kk(C4808m9 c4808m9) {
        super(c4808m9.m19913x1());
        this.f17066x1 = new C4808m9(c4808m9);
        this.f17065kk = new C3166k4(c4808m9.m19911kk(), c4808m9.m19913x1());
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1565x1 m24333k4(C11896dy c11896dy, final float f, final float f2, final float f3, final float f4) {
        final C4810x1 c4810x1 = new C4810x1();
        C4803du.m19876k4(c11896dy, new InterfaceC4809to() { // from class: com.aspose.slides.internal.ld.kk.1
            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9584k4() {
                c4810x1.mo9584k4();
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9602x1() {
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9585k4(float f5, float f6) {
                c4810x1.mo9585k4(C6027kk.this.m24330k4(f, f3, f4, f5, f6), C6027kk.this.m24332x1(f2, f3, f4, f5, f6));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9603x1(float f5, float f6) {
                c4810x1.mo9603x1(C6027kk.this.m24330k4(f, f3, f4, f5, f6), C6027kk.this.m24332x1(f2, f3, f4, f5, f6));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9586k4(float f5, float f6, float f7, float f8) {
                c4810x1.mo9586k4(C6027kk.this.m24330k4(f, f3, f4, f5, f6), C6027kk.this.m24332x1(f2, f3, f4, f5, f6), C6027kk.this.m24330k4(f, f3, f4, f7, f8), C6027kk.this.m24332x1(f2, f3, f4, f7, f8));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9587k4(float f5, float f6, float f7, float f8, float f9, float f10) {
                c4810x1.mo9587k4(C6027kk.this.m24330k4(f, f3, f4, f5, f6), C6027kk.this.m24332x1(f2, f3, f4, f5, f6), C6027kk.this.m24330k4(f, f3, f4, f7, f8), C6027kk.this.m24332x1(f2, f3, f4, f7, f8), C6027kk.this.m24330k4(f, f3, f4, f9, f10), C6027kk.this.m24332x1(f2, f3, f4, f9, f10));
            }
        });
        return c4810x1.m19914kk();
    }

    /* JADX INFO: renamed from: k4 */
    private C12026yj m24334k4(C11898h4 c11898h4) {
        C12026yj c12026yj = new C12026yj(this.f17064k4.m19879k4().m56935x1());
        C11913yj c11913yjM56940x6 = this.f17064k4.m19879k4().m56940x6();
        float fAbs = (float) Math.abs(c11913yjM56940x6.m55761jd());
        float fAbs2 = (float) Math.abs(c11913yjM56940x6.m55784up());
        Math.abs(c11913yjM56940x6.m55759fa());
        Math.abs(c11913yjM56940x6.m55756ck());
        c12026yj.m56922k4(new C11913yj(fAbs < 1.0f ? 1.0f / fAbs : fAbs, 0.0f, 0.0f, fAbs2 < 1.0f ? 1.0f / fAbs2 : fAbs2, 0.0f, 0.0f));
        if (fAbs >= 1.0f && fAbs2 >= 1.0f) {
            c12026yj.m56926kk(c11898h4.m55596c5() * this.f17064k4.m19882x1());
        }
        c12026yj.m56914h4(c11898h4.m55606m9());
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        c11898h4.m55605k4(iArr, iArr2);
        c12026yj.m56932to(iArr[0]);
        c12026yj.m56909du(iArr2[0]);
        return c12026yj;
    }

    @Override // com.aspose.slides.internal.p247ld.AbstractC6026k4
    /* JADX INFO: renamed from: k4 */
    public void mo24331k4(InterfaceC4809to interfaceC4809to, C11898h4 c11898h4, float f, float f2, float f3, float f4) {
        C12026yj c12026yjM24334k4 = m24334k4(c11898h4);
        if (c12026yjM24334k4.m56930ne() * 2.0f < this.f17064k4.m19881to()) {
            return;
        }
        float fM13534k4 = this.f17065kk.m13534k4(c11898h4);
        this.f17066x1.m19908k4(C11896dy.m55503k4(m24333k4(c11898h4.m55608up(), f, f2, fM13534k4 * f3, fM13534k4 * f4)));
        C4808m9 c4808m9 = this.f17066x1;
        c4808m9.m19907k4(new C4804dy(c12026yjM24334k4, c4808m9.m19913x1().m19881to()));
        this.f17066x1.m19909k4(C11913yj.f40121k4.m55760h4());
        this.f17066x1.m19910k4(false);
        for (C13356x1 c13356x1 : new C4807kk(this.f17066x1).m19905k4().m62020k4()) {
            C4803du.m19873k4(c13356x1.f44711k4, interfaceC4809to);
            C4803du.m19873k4(c13356x1.f44713x1, interfaceC4809to);
            C4803du.m19873k4(c13356x1.f44712kk, interfaceC4809to);
        }
    }
}
