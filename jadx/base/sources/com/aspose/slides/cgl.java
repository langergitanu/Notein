package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class cgl extends AbstractC14413rs {

    /* JADX INFO: renamed from: k4 */
    private byte f4325k4;

    /* JADX INFO: renamed from: kk */
    private IPresentationComponent f4326kk;

    /* JADX INFO: renamed from: x1 */
    private IPortionFormat f4328x1;

    /* JADX INFO: renamed from: to */
    private C14093tq<Integer> f4327to = new C14093tq<>();

    /* JADX INFO: renamed from: du */
    private C13827mb f4324du = C1143gg.m6636k4(m4584kk());

    public cgl(IPortionFormat iPortionFormat) {
        this.f4328x1 = iPortionFormat;
    }

    /* JADX INFO: renamed from: du */
    private void m4580du() {
        if (C7019kk.m27469x1(this.f4328x1, PVIObject.class)) {
            ((PVIObject) this.f4328x1).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m4581k4() {
        return this.f4325k4;
    }

    /* JADX INFO: renamed from: kk */
    public final IPresentationComponent m4584kk() {
        IPresentationComponent iPresentationComponent = this.f4326kk;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f4328x1, iPresentationComponentArr);
            this.f4326kk = iPresentationComponentArr[0];
        }
        return this.f4326kk;
    }

    /* JADX INFO: renamed from: to */
    public final C13827mb m4585to() {
        return this.f4324du;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFontData m4586x1() {
        if (this.f4327to.m67302x1()) {
            return m4585to().m64802k4(this.f4327to.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4582k4(byte b) {
        if (C3085sv.m13089k4(this.f4325k4, b)) {
            return;
        }
        this.f4325k4 = b;
        m4580du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4583k4(IFontData iFontData) {
        if (iFontData != null) {
            this.f4327to = new C14093tq<>(Integer.valueOf(m4585to().m64799k4(C13827mb.m64790k4(iFontData.getFontName()), iFontData)));
        } else {
            this.f4327to = new C14093tq<>();
        }
        m4580du();
    }
}
