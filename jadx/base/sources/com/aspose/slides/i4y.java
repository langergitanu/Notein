package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class i4y {

    /* JADX INFO: renamed from: dy */
    private boolean f5617dy;

    /* JADX INFO: renamed from: kk */
    private ColorFormat f5620kk;

    /* JADX INFO: renamed from: x1 */
    private u4g f5623x1;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<u4g> f5619k4 = new AbstractC7018k4<u4g>() { // from class: com.aspose.slides.i4y.1
        {
            i4y.this.f5623x1 = new u4g() { // from class: com.aspose.slides.i4y.1.1
                @Override // com.aspose.slides.u4g
                /* JADX INFO: renamed from: k4 */
                public void mo7442k4() {
                    Iterator it = ((AbstractC7018k4) C12391.this).f19081x1.iterator();
                    while (it.hasNext()) {
                        ((u4g) it.next()).mo7442k4();
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: to */
    private float f5622to = Float.NaN;

    /* JADX INFO: renamed from: du */
    private float f5616du = Float.NaN;

    /* JADX INFO: renamed from: h4 */
    private float f5618h4 = Float.NaN;

    /* JADX INFO: renamed from: m9 */
    private byte f5621m9 = -1;

    public i4y(IPictureFrame iPictureFrame) {
        this.f5620kk = new ColorFormat((InterfaceC14397rj) iPictureFrame);
        m7429k4((byte) -1);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m7424c5() {
        return this.f5617dy;
    }

    /* JADX INFO: renamed from: du */
    public final int m7425du() {
        return this.f5620kk.getSchemeColor();
    }

    /* JADX INFO: renamed from: dy */
    public final float m7426dy() {
        return this.f5618h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m7427h4() {
        return this.f5622to;
    }

    /* JADX INFO: renamed from: jd */
    public final void m7428jd() {
        u4g u4gVar = this.f5623x1;
        if (u4gVar == null || this.f5619k4.m27430k4()) {
            return;
        }
        u4gVar.mo7442k4();
    }

    /* JADX INFO: renamed from: kk */
    public final C12003du m7435kk() {
        this.f5620kk.getColorTransform().clear();
        if (!C14064he.m66715kk(this.f5616du)) {
            this.f5620kk.getColorTransform().add(16, this.f5616du);
        }
        if (!C14064he.m66715kk(this.f5618h4)) {
            this.f5620kk.getColorTransform().add(15, this.f5618h4);
        }
        return this.f5620kk.m1084to();
    }

    /* JADX INFO: renamed from: m9 */
    public final float m7437m9() {
        return this.f5616du;
    }

    /* JADX INFO: renamed from: to */
    public final String m7438to() {
        return m7439x1() == 1 ? C14113y2.m67408k4("#", C14113y2.m67443x1(C14113y2.m67402k4("{0:x8}", Integer.valueOf(m7435kk().m56506h4())), 2, 6)) : "none";
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m7439x1() {
        return this.f5621m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7429k4(byte b) {
        this.f5621m9 = b;
        m7428jd();
    }

    /* JADX INFO: renamed from: kk */
    public final void m7436kk(float f) {
        this.f5618h4 = f;
        m7428jd();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7440x1(float f) {
        this.f5616du = f;
        m7428jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7430k4(float f) {
        this.f5622to = f;
        m7428jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7431k4(int i) {
        this.f5620kk.setSchemeColor(i);
        m7428jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7432k4(C12003du c12003du) {
        this.f5620kk.m1080k4(c12003du.Clone());
        m7428jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7433k4(boolean z) {
        this.f5617dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7434k4() {
        return m7439x1() == -1;
    }
}
