package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class SoftEdge implements ISoftEdge, lft, InterfaceC14376r6, InterfaceC14397rj, Cloneable {

    /* JADX INFO: renamed from: du */
    private long f3447du;

    /* JADX INFO: renamed from: h4 */
    private i1e f3448h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1156gp> f3449k4 = new AbstractC7018k4<AbstractC1156gp>() { // from class: com.aspose.slides.SoftEdge.1
        {
            SoftEdge.this.f3453x1 = new AbstractC1156gp() { // from class: com.aspose.slides.SoftEdge.1.1
                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    for (AbstractC1156gp abstractC1156gp : ((AbstractC7018k4) C06361.this).f19081x1) {
                        if (abstractC1156gp != null) {
                            abstractC1156gp.mo1395k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private double f3450kk = 1.0d;

    /* JADX INFO: renamed from: m9 */
    private IPresentationComponent f3451m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC14397rj f3452to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1156gp f3453x1;

    public SoftEdge(InterfaceC14397rj interfaceC14397rj) {
        this.f3452to = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: kk */
    private void m2825kk() {
        this.f3447du++;
        m2826to();
    }

    /* JADX INFO: renamed from: to */
    private void m2826to() {
        AbstractC1156gp abstractC1156gp = this.f3453x1;
        if (abstractC1156gp == null || this.f3449k4.m27430k4()) {
            return;
        }
        abstractC1156gp.mo1395k4();
    }

    public boolean equals(Object obj) {
        SoftEdge softEdge = (SoftEdge) C7019kk.m27452k4(obj, SoftEdge.class);
        if (softEdge == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13088k4(this.f3450kk, softEdge.f3450kk);
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3451m9;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3452to, iPresentationComponentArr);
            this.f3451m9 = iPresentationComponentArr[0];
        }
        return this.f3451m9;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3452to;
    }

    @Override // com.aspose.slides.ISoftEdge
    public final double getRadius() {
        return this.f3450kk;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return this.f3447du;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Object memberwiseClone() {
        try {
            return (SoftEdge) clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.ISoftEdge
    public final void setRadius(double d) {
        this.f3450kk = d;
        m2825kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final SoftEdge m2829x1() {
        return (SoftEdge) memberwiseClone();
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final ISoftEdgeEffectiveData getEffective() {
        return m2827k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final i1e m2827k4() {
        if (this.f3448h4 == null) {
            this.f3448h4 = new i1e(this);
        }
        return this.f3448h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2828k4(InterfaceC14397rj interfaceC14397rj) {
        this.f3452to = interfaceC14397rj;
        m2825kk();
    }
}
