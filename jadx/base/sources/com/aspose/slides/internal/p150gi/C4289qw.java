package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.qw */
/* JADX INFO: loaded from: classes.dex */
public class C4289qw extends AbstractC4271e0 {

    /* JADX INFO: renamed from: k4 */
    private double f11708k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3524ks f11709x1;

    public C4289qw(double d, AbstractC3524ks abstractC3524ks) {
        this.f11708k4 = d;
        this.f11709x1 = abstractC3524ks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4289qw c4289qw = (C4289qw) C7019kk.m27452k4(obj, C4289qw.class);
        return c4289qw != null && C10017to.m49170k4(this.f11709x1, c4289qw.f11709x1) && C10017to.m49169k4(this.f11708k4, c4289qw.f11708k4);
    }

    public int hashCode() {
        return C10017to.m49167k4(this.f11708k4) + ((C10017to.m49168k4(this.f11709x1) + 31) * 31);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public double mo9879k4() {
        throw new NotSupportedException("Must call getNumericValue with PercentBaseContext");
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: kk */
    public boolean mo9883kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: to */
    public int mo9884to() {
        throw new NotSupportedException("Must call getValue with PercentBaseContext");
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return C14113y2.m67408k4(C14044b3.m66425h4(this.f11708k4), " table-column-units");
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public int mo9886x1(InterfaceC1981h4 interfaceC1981h4) {
        return OooO00o.OooO00o(this.f11708k4, interfaceC1981h4.mo10099k4(11, this.f11709x1), 14);
    }

    /* JADX INFO: renamed from: yj */
    public final double m17259yj() {
        return this.f11708k4;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public double mo9880k4(InterfaceC1981h4 interfaceC1981h4) {
        return this.f11708k4 * ((double) interfaceC1981h4.mo10099k4(11, this.f11709x1));
    }
}
