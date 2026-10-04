package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PVIObject implements ISlideComponent, InterfaceC14376r6 {

    /* JADX INFO: renamed from: du */
    private InterfaceC14397rj f2937du;

    /* JADX INFO: renamed from: h4 */
    private IPresentationComponent f2938h4;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f2939k4;

    /* JADX INFO: renamed from: kk */
    private boolean f2940kk;

    /* JADX INFO: renamed from: m9 */
    private ISlideComponent f2941m9;

    /* JADX INFO: renamed from: to */
    private boolean f2942to;

    /* JADX INFO: renamed from: x1 */
    private Object f2943x1;

    public PVIObject(InterfaceC14397rj interfaceC14397rj) {
        this.f2937du = interfaceC14397rj;
        this.f2939k4 = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: M_ */
    public abstract Object mo331M_();

    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
    }

    public boolean equals(Object obj) {
        PVIObject pVIObject = (PVIObject) C7019kk.m27452k4(obj, PVIObject.class);
        if (pVIObject == null) {
            return false;
        }
        if (m2138ix()) {
            return m2144u4() != this ? m2144u4().equals(pVIObject) : super.equals(obj);
        }
        if (pVIObject.m2138ix()) {
            return pVIObject.m2144u4().equals(this);
        }
        return true;
    }

    public IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f2938h4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2937du, iPresentationComponentArr);
            IPresentationComponent iPresentationComponent2 = iPresentationComponentArr[0];
            this.f2938h4 = iPresentationComponent2;
            if (C7019kk.m27469x1(iPresentationComponent2, PVIObject.class) && !C7019kk.m27469x1(this.f2938h4, IChartComponent.class) && !C7019kk.m27469x1(this.f2938h4, Background.class)) {
                this.f2938h4 = ((PVIObject) C7019kk.m27452k4((Object) this.f2938h4, PVIObject.class)).getParent_IPresentationComponent();
            }
        }
        return this.f2938h4;
    }

    public ISlideComponent getParent_ISlideComponent() {
        ISlideComponent iSlideComponent = this.f2941m9;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f2937du, iSlideComponentArr);
            ISlideComponent iSlideComponent2 = iSlideComponentArr[0];
            this.f2941m9 = iSlideComponent2;
            if (C7019kk.m27469x1(iSlideComponent2, PVIObject.class) && !C7019kk.m27469x1(this.f2938h4, IChartComponent.class) && !C7019kk.m27469x1(this.f2938h4, Background.class)) {
                this.f2941m9 = ((PVIObject) C7019kk.m27452k4((Object) this.f2941m9, PVIObject.class)).getParent_ISlideComponent();
            }
        }
        return this.f2941m9;
    }

    public InterfaceC14397rj getParent_Immediate() {
        return this.f2937du;
    }

    @Override // com.aspose.slides.ISlideComponent
    public BaseSlide getSlide() {
        ISlideComponent iSlideComponent = (ISlideComponent) C7019kk.m27452k4((Object) getParent_ISlideComponent(), ISlideComponent.class);
        if (iSlideComponent != null) {
            return (BaseSlide) iSlideComponent.getSlide();
        }
        return null;
    }

    public long getVersion() {
        if (m2138ix()) {
            return ((InterfaceC14376r6) m2144u4()).getVersion();
        }
        return 1L;
    }

    public int hashCode() {
        return (!m2138ix() || m2144u4() == this) ? super.hashCode() : m2144u4().hashCode();
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m2138ix() {
        return this.f2943x1 != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final <T, TRealObject> T m2139k4(vha<T, TRealObject> vhaVar) {
        return m2138ix() ? vhaVar.f49506x1.invoke((TRealObject) m2144u4()) : vhaVar.f49504k4;
    }

    /* JADX INFO: renamed from: qq */
    public final void m2143qq() {
        this.f2938h4 = null;
        this.f2941m9 = null;
    }

    /* JADX INFO: renamed from: u4 */
    public final Object m2144u4() {
        return this.f2943x1;
    }

    /* JADX INFO: renamed from: uz */
    public final void m2145uz() {
        if (!m2138ix()) {
            m2146wl();
            this.f2943x1 = mo331M_();
        }
        if (this.f2942to) {
            return;
        }
        if (C7019kk.m27469x1(this.f2939k4, PVIObject.class)) {
            ((PVIObject) this.f2939k4).m2145uz();
        }
        this.f2942to = true;
    }

    /* JADX INFO: renamed from: wl */
    public final void m2146wl() {
        if (this.f2940kk) {
            return;
        }
        this.f2940kk = true;
        mo334N_();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2147x1(InterfaceC14397rj interfaceC14397rj) {
        this.f2937du = interfaceC14397rj;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public Presentation getPresentation() {
        IPresentationComponent iPresentationComponent = (IPresentationComponent) C7019kk.m27452k4((Object) getParent_IPresentationComponent(), IPresentationComponent.class);
        if (iPresentationComponent != null) {
            return (Presentation) iPresentationComponent.getPresentation();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2140k4(Object obj) {
        this.f2943x1 = obj;
        if (obj == null) {
            this.f2940kk = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final <P> void m2141k4(P p, P p2) {
        if (m2138ix() && this.f2942to) {
            return;
        }
        if ((p != null || p2 == null) && (p == null || p.equals(p2))) {
            return;
        }
        m2145uz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final <T, TRealObject> boolean m2142k4(vha<T, TRealObject> vhaVar, T t) {
        m2141k4(vhaVar.f49504k4, t);
        if (!m2138ix()) {
            return false;
        }
        vhaVar.f49505kk.mo1091k4(t, m2144u4());
        return true;
    }
}
