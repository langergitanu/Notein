package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class WheelEffect implements InterfaceC1225hv {

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f3703k4;

    /* JADX INFO: renamed from: kk */
    private final C12025x6[] f3704kk;

    /* JADX INFO: renamed from: to */
    private final int f3705to;

    /* JADX INFO: renamed from: x1 */
    private final float f3706x1;

    public static final class Mode extends AbstractC14106wy {
        public static final int Normal = 0;
        public static final int Reverse = 1;
        public static final int Symetric = 2;

        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(Mode.class, Integer.class) { // from class: com.aspose.slides.WheelEffect.Mode.1
                {
                    addConstant("Normal", 0L);
                    addConstant("Reverse", 1L);
                    addConstant("Symetric", 2L);
                }
            });
        }

        private Mode() {
        }
    }

    public WheelEffect(C12023wl c12023wl, int i) {
        this.f3703k4 = new C12025x6();
        this.f3705to = i;
        this.f3703k4 = new C12025x6(c12023wl.m56865x1() * 0.5f, c12023wl.m56862kk() * 0.5f);
        this.f3706x1 = C14116yg.m67483k4(c12023wl.m56865x1(), c12023wl.m56862kk());
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 6);
        this.f3704kk = c12025x6Arr;
        this.f3703k4.CloneTo(c12025x6Arr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m3089k4(double d) {
        return new C12025x6(this.f3703k4.m56897x1() + (this.f3706x1 * ((float) C14116yg.m67470dy(d))), this.f3703k4.m56895kk() + (this.f3706x1 * ((float) C14116yg.m67495m9(d))));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        double d = ((double) f) * 6.283185307179586d;
        int i = this.f3705to;
        double d2 = -1.5707963267948966d;
        if (i == 1) {
            d = -d;
        } else if (i == 2) {
            d2 = (-1.5707963267948966d) - (d / 2.0d);
        }
        m3089k4(0.0d + d2).CloneTo(this.f3704kk[1]);
        m3089k4((d / 4.0d) + d2).CloneTo(this.f3704kk[2]);
        m3089k4((d / 2.0d) + d2).CloneTo(this.f3704kk[3]);
        m3089k4(((3.0d * d) / 4.0d) + d2).CloneTo(this.f3704kk[4]);
        m3089k4(d + d2).CloneTo(this.f3704kk[5]);
        abstractC12008jd.mo17534k4(C12010kk.m56613x1(), this.f3704kk);
    }
}
