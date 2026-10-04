package com.aspose.slides.internal.p371qw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C9952fa extends C12717os {

    /* JADX INFO: renamed from: k4 */
    public boolean f35884k4;

    /* JADX INFO: renamed from: x1 */
    public List<InterfaceC1861h4> f35885x1;

    public C9952fa(InterfaceC12711lr interfaceC12711lr, boolean z, List<InterfaceC1861h4> list) {
        super(interfaceC12711lr);
        this.f35884k4 = z;
        this.f35885x1 = list;
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    public String toString() {
        C6765kp c6765kp = new C6765kp("Table");
        c6765kp.m26792k4(this.f35884k4 ? "Header" : "Footer");
        c6765kp.m26792k4("Position:");
        c6765kp.m26805kk(m59073du()).m26792k4("(");
        c6765kp.m26791k4(this.f35885x1);
        c6765kp.m26792k4(")");
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    /* JADX INFO: renamed from: w_ */
    public boolean mo48915w_() {
        return true;
    }
}
