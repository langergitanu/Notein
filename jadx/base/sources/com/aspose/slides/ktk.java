package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10549mu;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class ktk extends AbstractC14413rs {

    /* JADX INFO: renamed from: k4 */
    private C10549mu[] f45866k4;

    /* JADX INFO: renamed from: kk */
    private ITextFrameFormat f45867kk;

    /* JADX INFO: renamed from: x1 */
    private C14093tq<Integer> f45868x1 = new C14093tq<>();

    public ktk(ITextFrameFormat iTextFrameFormat) {
        this.f45867kk = iTextFrameFormat;
    }

    /* JADX INFO: renamed from: kk */
    private void m64158kk() {
        if (C7019kk.m27469x1(this.f45867kk, PVIObject.class)) {
            ((PVIObject) this.f45867kk).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64159k4(C14093tq<Integer> c14093tq) {
        c14093tq.CloneTo(this.f45868x1);
        m64158kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final C14093tq<Integer> m64162x1() {
        return this.f45868x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64160k4(C10549mu[] c10549muArr) {
        this.f45866k4 = c10549muArr;
        m64158kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final C10549mu[] m64161k4() {
        return this.f45866k4;
    }
}
