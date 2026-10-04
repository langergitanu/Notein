package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Glow implements IGlow, lft, InterfaceC14376r6, InterfaceC14397rj, Cloneable {

    /* JADX INFO: renamed from: du */
    private InterfaceC14397rj f2397du;

    /* JADX INFO: renamed from: dy */
    private IPresentationComponent f2398dy;

    /* JADX INFO: renamed from: h4 */
    private long f2399h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1156gp> f2400k4 = new AbstractC7018k4<AbstractC1156gp>() { // from class: com.aspose.slides.Glow.1
        {
            Glow.this.f2404x1 = new AbstractC1156gp() { // from class: com.aspose.slides.Glow.1.1
                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    Iterator it = ((AbstractC7018k4) C04321.this).f19081x1.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1156gp) it.next()).mo1395k4();
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private double f2401kk;

    /* JADX INFO: renamed from: m9 */
    private C1241i6 f2402m9;

    /* JADX INFO: renamed from: to */
    private ColorFormat f2403to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1156gp f2404x1;

    public Glow(InterfaceC14397rj interfaceC14397rj) {
        this.f2397du = interfaceC14397rj;
        ColorFormat colorFormat = new ColorFormat(this, 4, true);
        this.f2403to = colorFormat;
        colorFormat.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.Glow.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.Glow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                Glow.this.m1598to();
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    private void m1597kk() {
        this.f2399h4++;
        m1598to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m1598to() {
        AbstractC1156gp abstractC1156gp = this.f2404x1;
        if (abstractC1156gp == null || this.f2400k4.m27430k4()) {
            return;
        }
        abstractC1156gp.mo1395k4();
    }

    public boolean equals(Object obj) {
        Glow glow = (Glow) C7019kk.m27452k4(obj, Glow.class);
        if (glow == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13090k4(this.f2403to, glow.f2403to) && C3085sv.m13088k4(this.f2401kk, glow.f2401kk);
    }

    @Override // com.aspose.slides.IGlow
    public final IColorFormat getColor() {
        return this.f2403to;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f2398dy;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2397du, iPresentationComponentArr);
            this.f2398dy = iPresentationComponentArr[0];
        }
        return this.f2398dy;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2397du;
    }

    @Override // com.aspose.slides.IGlow
    public final double getRadius() {
        return this.f2401kk;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f2399h4 & 4294967295L) + (this.f2403to.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Object memberwiseClone() {
        try {
            Glow glow = (Glow) clone();
            glow.setRadius(getRadius());
            ColorFormat colorFormat = this.f2403to;
            if (colorFormat == null) {
                return glow;
            }
            glow.f2403to.m1079k4(colorFormat);
            return glow;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IGlow
    public final void setRadius(double d) {
        this.f2401kk = d;
        m1597kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final Glow m1601x1() {
        final Glow glow = (Glow) memberwiseClone();
        ColorFormat colorFormat = new ColorFormat(null);
        glow.f2403to = colorFormat;
        colorFormat.m1079k4(this.f2403to);
        glow.f2403to.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.Glow.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(glow) + "Aspose.Slides.Effects.Glow.OnEffectChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                glow.m1598to();
            }
        });
        return glow;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IGlowEffectiveData getEffective() {
        return m1599k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C1241i6 m1599k4() {
        if (this.f2402m9 == null) {
            this.f2402m9 = new C1241i6(this);
        }
        this.f2402m9.m63282k4(C1241i6.class);
        return this.f2402m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1600k4(InterfaceC14397rj interfaceC14397rj) {
        this.f2397du = interfaceC14397rj;
        this.f2403to.m1081k4((InterfaceC14397rj) this);
        m1597kk();
    }
}
