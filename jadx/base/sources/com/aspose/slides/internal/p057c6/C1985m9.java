package com.aspose.slides.internal.p057c6;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.c6.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1985m9 implements InterfaceC1979du {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC3524ks f6949k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1984kk f6950kk;

    /* JADX INFO: renamed from: x1 */
    private int f6951x1;

    public C1985m9(AbstractC3533um abstractC3533um, int i) {
        AbstractC4282kp abstractC4282kpM14402to;
        this.f6949k4 = abstractC3533um.m14393k4();
        this.f6951x1 = i;
        if (i == 1) {
            abstractC4282kpM14402to = abstractC3533um.m14402to(103);
        } else if (i != 2) {
            return;
        } else {
            abstractC4282kpM14402to = abstractC3533um.m14398kk(103);
        }
        this.f6950kk = abstractC4282kpM14402to.mo9877dy();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7019kk.m27469x1(obj, C1985m9.class)) {
            return false;
        }
        C1985m9 c1985m9 = (C1985m9) obj;
        return C10017to.m49170k4(this.f6950kk, c1985m9.f6950kk) && this.f6951x1 == c1985m9.f6951x1 && C10017to.m49170k4(this.f6949k4, c1985m9.f6949k4);
    }

    public int hashCode() {
        return C10017to.m49168k4(this.f6949k4) + ((((C10017to.m49168k4(this.f6950kk) + 31) * 31) + this.f6951x1) * 31);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
    /* JADX INFO: renamed from: k4 */
    public final int mo9872k4() {
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC1984kk m10114kk() {
        return this.f6950kk;
    }

    public String toString() {
        return C14113y2.m67407k4(C14113y2.f47374k4, "[fo=", this.f6949k4.toString(), ",", "baseType=", C14057f9.m66591x1(this.f6951x1), ",", "baseLength=", this.f6950kk, "]");
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
    /* JADX INFO: renamed from: x1 */
    public final double mo9874x1() {
        return 1.0d;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
    /* JADX INFO: renamed from: k4 */
    public final int mo9873k4(InterfaceC1981h4 interfaceC1981h4) {
        if (interfaceC1981h4 == null) {
            return 0;
        }
        int i = this.f6951x1;
        return (i == 1 || i == 2) ? this.f6950kk.mo9886x1(interfaceC1981h4) : interfaceC1981h4.mo10099k4(i, this.f6949k4);
    }
}
