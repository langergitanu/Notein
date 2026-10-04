package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.ss */
/* JADX INFO: loaded from: classes.dex */
public class C4292ss extends AbstractC4271e0 {

    /* JADX INFO: renamed from: k4 */
    private double f11714k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1979du f11715x1;

    public C4292ss(double d, InterfaceC1979du interfaceC1979du) {
        this.f11714k4 = d;
        this.f11715x1 = interfaceC1979du;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4292ss c4292ss = (C4292ss) C7019kk.m27452k4(obj, C4292ss.class);
        return c4292ss != null && C10017to.m49169k4(this.f11714k4, c4292ss.f11714k4) && C10017to.m49170k4(this.f11715x1, c4292ss.f11715x1);
    }

    public int hashCode() {
        return C10017to.m49168k4(this.f11715x1) + ((C10017to.m49167k4(this.f11714k4) + 31) * 31);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: j_ */
    public String mo9926j_() {
        return C14113y2.m67408k4(C14044b3.m66425h4(this.f11714k4 * 100.0d), "%");
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public double mo9879k4() {
        return mo9880k4((InterfaceC1981h4) null);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: kk */
    public boolean mo9883kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: to */
    public int mo9884to() {
        return C7019kk.m27462to(Double.valueOf(mo9879k4()), 14);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return new C6765kp(C14067j2.m66727k4(this).mo48540du()).m26792k4("[factor=").m26784k4(this.f11714k4).m26792k4(",lbase=").m26791k4(this.f11715x1).m26792k4("]").toString();
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public int mo9886x1(InterfaceC1981h4 interfaceC1981h4) {
        return C7019kk.m27462to(Double.valueOf(mo9880k4(interfaceC1981h4)), 14);
    }

    /* JADX INFO: renamed from: yj */
    public final double m17269yj() {
        return this.f11714k4 * 100.0d;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public double mo9880k4(InterfaceC1981h4 interfaceC1981h4) {
        try {
            return this.f11714k4 * ((double) this.f11715x1.mo9873k4(interfaceC1981h4));
        } catch (C1921qq unused) {
            return 0.0d;
        }
    }
}
