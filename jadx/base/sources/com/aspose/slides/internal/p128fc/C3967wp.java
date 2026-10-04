package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p200j6.AbstractC5200du;
import com.aspose.slides.internal.p200j6.C5199ck;
import com.aspose.slides.internal.p200j6.C5201dy;
import com.aspose.slides.internal.p200j6.C5202fa;
import com.aspose.slides.internal.p200j6.C5204jd;
import com.aspose.slides.internal.p200j6.C5206kk;
import com.aspose.slides.internal.p200j6.C5207ks;
import com.aspose.slides.internal.p200j6.C5209rv;
import com.aspose.slides.internal.p200j6.C5211up;
import com.aspose.slides.internal.p200j6.C5213x6;
import com.aspose.slides.internal.p200j6.C5214yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.wp */
/* JADX INFO: loaded from: classes.dex */
public class C3967wp implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10727k4;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10728x1;

    public C3967wp(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack) {
        this.f10727k4 = interfaceC9477x1;
        this.f10728x1 = stack;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        AbstractC5200du abstractC5200du;
        C9470du c9470duMo46638k4 = this.f10727k4.mo46638k4();
        C9421c5 c9421c5Peek = this.f10728x1.peek();
        if (c9421c5Peek.m46096k4() == null || !c9421c5Peek.m46096k4().containsKey(c9470duMo46638k4.m46616yd()) || (abstractC5200du = c9421c5Peek.m46096k4().get_Item(c9470duMo46638k4.m46616yd())) == null) {
            return;
        }
        InterfaceC3941ks c3933gi = C7019kk.m27469x1(abstractC5200du, C5204jd.class) ? new C3933gi(this.f10727k4) : C7019kk.m27469x1(abstractC5200du, C5202fa.class) ? new C3972xw(this.f10727k4) : C7019kk.m27469x1(abstractC5200du, C5201dy.class) ? new C3953sv(this.f10727k4) : C7019kk.m27469x1(abstractC5200du, C5211up.class) ? new C3951s7(this.f10727k4) : C7019kk.m27469x1(abstractC5200du, C5206kk.class) ? new C3932g8(this.f10727k4) : C7019kk.m27469x1(abstractC5200du, C5213x6.class) ? new C3964vj(this.f10727k4, this.f10728x1) : C7019kk.m27469x1(abstractC5200du, C5199ck.class) ? new C3940kp(this.f10727k4) : C7019kk.m27469x1(abstractC5200du, C5209rv.class) ? new C3954t6(this.f10727k4, this.f10728x1) : (!C7019kk.m27469x1(abstractC5200du, C5214yj.class) && C7019kk.m27469x1(abstractC5200du, C5207ks.class)) ? new C3930f9(this.f10727k4) : null;
        if (c3933gi != null) {
            c3933gi.mo15630k4(c3958u4, list);
        }
    }
}
