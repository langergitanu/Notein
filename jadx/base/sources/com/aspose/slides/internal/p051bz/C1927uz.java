package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.uz */
/* JADX INFO: loaded from: classes3.dex */
public class C1927uz extends AbstractC4282kp implements InterfaceC1984kk {

    /* JADX INFO: renamed from: k4 */
    private double f6854k4;

    /* JADX INFO: renamed from: x1 */
    private int f6855x1;

    public C1927uz(double d, int i) {
        this.f6854k4 = d;
        this.f6855x1 = i;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: dy */
    public InterfaceC1984kk mo9877dy() {
        if (this.f6855x1 == 1) {
            return this;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7019kk.m27469x1(obj, C1927uz.class)) {
            return false;
        }
        C1927uz c1927uz = (C1927uz) obj;
        return this.f6855x1 == c1927uz.f6855x1 && C10017to.m49169k4(this.f6854k4, c1927uz.f6854k4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: h4 */
    public InterfaceC1986to mo9878h4() {
        return this;
    }

    public int hashCode() {
        return C10017to.m49167k4(this.f6854k4) + ((this.f6855x1 + 31) * 31);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final double mo9879k4() {
        return this.f6854k4;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: kk */
    public final boolean mo9883kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: m9 */
    public Object mo9924m9() {
        return Double.valueOf(this.f6854k4);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: to */
    public final int mo9884to() {
        return C7019kk.m27462to(Double.valueOf(this.f6854k4), 14);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return this.f6855x1 == 1 ? C14113y2.m67408k4(C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(this.f6854k4), 14)), "mpt") : C14113y2.m67408k4(C14044b3.m66425h4(this.f6854k4), "^", C14057f9.m66591x1(this.f6855x1));
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9885x1() {
        return this.f6855x1;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final double mo9880k4(InterfaceC1981h4 interfaceC1981h4) {
        return this.f6854k4;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9886x1(InterfaceC1981h4 interfaceC1981h4) {
        return C7019kk.m27462to(Double.valueOf(this.f6854k4), 14);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: k4 */
    public C12003du mo9923k4(C12814to c12814to) {
        return C12003du.f40505to;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final void mo9881k4(int i) {
        this.f6854k4 = i;
    }
}
