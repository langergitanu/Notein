package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class s5e {

    /* JADX INFO: renamed from: k4 */
    private IMarker f48758k4;

    /* JADX INFO: renamed from: kk */
    private C13847mr f48759kk;

    /* JADX INFO: renamed from: x1 */
    private C14365qy f48761x1;

    /* JADX INFO: renamed from: to */
    private boolean f48760to = true;

    /* JADX INFO: renamed from: du */
    private C12025x6 f48757du = new C12025x6();

    public s5e(C14365qy c14365qy, IMarker iMarker, C13847mr c13847mr) {
        this.f48758k4 = iMarker;
        this.f48761x1 = c14365qy;
        this.f48759kk = c13847mr;
    }

    /* JADX INFO: renamed from: kk */
    private int m70442kk() {
        int style = this.f48761x1.m69834fa().getStyle() + 1;
        if (style <= 8) {
            return 5;
        }
        return (style > 24 && style <= 32) ? 11 : 7;
    }

    /* JADX INFO: renamed from: k4 */
    public final IMarker m70443k4() {
        return this.f48758k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m70445x1() {
        ChartSeries chartSeriesM64945h4 = this.f48759kk.m64945h4();
        int iM64750k4 = (int) chartSeriesM64945h4.m726k4().m64750k4();
        if (iM64750k4 == -1) {
            return 7;
        }
        if (chartSeriesM64945h4.getType() == 68) {
            return 0;
        }
        switch ((iM64750k4 % 9) + 2) {
            case 2:
                return 2;
            case 3:
                return 7;
            case 4:
                return 9;
            case 5:
                return 10;
            case 6:
                return 8;
            case 7:
                return 0;
            case 8:
                return 10;
            case 9:
                return 3;
            case 10:
                return 1;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70444k4(float f, float f2, float f3) {
        float fM70442kk = f3 == 0.0f ? m70442kk() : f3;
        double d = fM70442kk / 2.0f;
        int iM63759kk = kc0.m63759kk(d);
        C11896dy c11896dy = new C11896dy();
        int symbol = this.f48758k4.getSymbol();
        if (this.f48758k4.getSymbol() == -1 && C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) this.f48758k4, InterfaceC14397rj.class)).getParent_Immediate(), ChartDataPoint.class)) {
            symbol = this.f48759kk.m64946jd().m70443k4().getSymbol();
        }
        if (symbol == -1) {
            m70445x1();
        }
        LineFormat lineFormat = (LineFormat) this.f48758k4.getFormat().getLine();
        if (lineFormat.getFillFormat().getFillType() == -1) {
            lineFormat = (LineFormat) this.f48759kk.m64945h4().getMarker().getFormat().getLine();
        }
        LineFormat lineFormat2 = lineFormat;
        FillFormat fillFormat = (FillFormat) this.f48758k4.getFormat().getFill();
        if (fillFormat.getFillType() == -1) {
            fillFormat = (FillFormat) this.f48759kk.m64945h4().getMarker().getFormat().getFill();
        }
        FillFormat fillFormat2 = fillFormat;
        IEffectFormat effect = this.f48758k4.getFormat().getEffect();
        if (effect.isNoEffects()) {
            effect = this.f48759kk.m64945h4().getMarker().getFormat().getEffect();
        }
        IEffectFormat iEffectFormat = effect;
        ChartSeries chartSeriesM64945h4 = this.f48759kk.m64945h4();
        if (symbol == 0) {
            float f4 = iM63759kk;
            float f5 = f - f4;
            float f6 = f2 - f4;
            float f7 = f4 * 2.0f;
            c11896dy.m55534k4(f5, f6, f7, f7);
            im9.m7694k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, c11896dy, lineFormat2, fillFormat2, iEffectFormat);
            return;
        }
        if (symbol == 1) {
            int iM63759kk2 = kc0.m63759kk(fM70442kk);
            int iM63759kk3 = kc0.m63759kk(fM70442kk / 4.0f);
            im9.m7700k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, new C12007ix((float) (((double) f) - (((double) iM63759kk2) / 2.0d)), (float) (((double) f2) - (((double) iM63759kk3) / 2.0d)), iM63759kk2, iM63759kk3), lineFormat2, fillFormat2, iEffectFormat);
            return;
        }
        if (symbol == 2) {
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
            float f8 = iM63759kk;
            c12025x6Arr[0].m56891k4(f - f8);
            c12025x6Arr[0].m56898x1(f2);
            c12025x6Arr[1].m56891k4(f);
            c12025x6Arr[1].m56898x1(f2 - f8);
            c12025x6Arr[2].m56891k4(f + f8);
            c12025x6Arr[2].m56898x1(f2);
            c12025x6Arr[3].m56891k4(f);
            c12025x6Arr[3].m56898x1(f2 + f8);
            c11896dy.m55570to(c12025x6Arr);
            im9.m7694k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, c11896dy, lineFormat2, fillFormat2, iEffectFormat);
            return;
        }
        if (symbol == 3) {
            int iM63759kk4 = kc0.m63759kk(d);
            int iM63759kk5 = kc0.m63759kk(fM70442kk / 4.0f);
            im9.m7700k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, new C12007ix(f, iM63759kk5 < 2 ? C7019kk.m27462to(Double.valueOf(r5 + 0.5d), 14) : (float) (((double) f2) - (((double) iM63759kk5) / 2.0d)), iM63759kk4, iM63759kk5), lineFormat2, fillFormat2, iEffectFormat);
            return;
        }
        switch (symbol) {
            case 7:
                float f9 = iM63759kk;
                float f10 = f - f9;
                float f11 = f2 - f9;
                float f12 = f9 * 2.0f;
                c11896dy.m55578x1(new C12007ix(f10, f11, f12, f12));
                im9.m7694k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, c11896dy, lineFormat2, fillFormat2, iEffectFormat);
                break;
            case 8:
                float f13 = iM63759kk;
                float f14 = f - f13;
                float f15 = f2 - f13;
                float f16 = f13 * 2.0f;
                im9.m7698k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f48761x1, new C12007ix(f14, f15, f16, f16), (Format) this.f48758k4.getFormat());
                float f17 = iM63759kk * 2;
                float f18 = f14 + f17;
                float f19 = f17 + f15;
                im9.m7709k4(new C12025x6(f14, f15), new C12025x6(f18, f19), this.f48759kk.m64960m9().Clone(), lineFormat2, this.f48761x1);
                im9.m7709k4(new C12025x6(f14, f19), new C12025x6(f18, f15), this.f48759kk.m64960m9().Clone(), lineFormat2, this.f48761x1);
                float f20 = f14 + f13;
                im9.m7709k4(new C12025x6(f20, f15), new C12025x6(f20, f19), this.f48759kk.m64960m9().Clone(), lineFormat2, this.f48761x1);
                break;
            case 9:
                C12025x6[] c12025x6Arr2 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 3);
                float f21 = iM63759kk;
                c12025x6Arr2[0].m56891k4(f - f21);
                float f22 = f2 + f21;
                c12025x6Arr2[0].m56898x1(f22);
                c12025x6Arr2[1].m56891k4(f);
                c12025x6Arr2[1].m56898x1(f2 - f21);
                c12025x6Arr2[2].m56891k4(f + f21);
                c12025x6Arr2[2].m56898x1(f22);
                c11896dy.m55570to(c12025x6Arr2);
                im9.m7694k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, c11896dy, lineFormat2, fillFormat2, iEffectFormat);
                break;
            case 10:
                float f23 = iM63759kk;
                float f24 = f - f23;
                float f25 = f2 - f23;
                float f26 = f23 * 2.0f;
                im9.m7698k4(this.f48759kk.m64960m9().Clone(), chartSeriesM64945h4.m734m9().Clone(), this.f48761x1, new C12007ix(f24, f25, f26, f26), (Format) this.f48758k4.getFormat());
                float f27 = iM63759kk * 2;
                float f28 = f24 + f27;
                float f29 = f27 + f25;
                im9.m7709k4(new C12025x6(f24, f25), new C12025x6(f28, f29), this.f48759kk.m64960m9().Clone(), lineFormat2, this.f48761x1);
                im9.m7709k4(new C12025x6(f24, f29), new C12025x6(f28, f25), this.f48759kk.m64960m9().Clone(), lineFormat2, this.f48761x1);
                break;
        }
    }
}
