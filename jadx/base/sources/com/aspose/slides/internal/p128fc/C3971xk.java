package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p033b2.C1574kk;
import com.aspose.slides.internal.p033b2.C1575to;
import com.aspose.slides.internal.p033b2.C1576x1;
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
import com.aspose.slides.internal.p271mc.C6371x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.xk */
/* JADX INFO: loaded from: classes.dex */
public class C3971xk implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10734k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9473k4 f10735kk;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10736x1;

    public C3971xk(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack, InterfaceC9473k4 interfaceC9473k4) {
        this.f10734k4 = interfaceC9477x1;
        this.f10736x1 = stack;
        this.f10735kk = interfaceC9473k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        AbstractC5200du abstractC5200du;
        InterfaceC3941ks c3946qm;
        C9470du c9470duMo46638k4 = this.f10734k4.mo46638k4();
        C9421c5 c9421c5Peek = this.f10736x1.peek();
        if ("Pattern".equals(c9470duMo46638k4.m46616yd())) {
            if (C7019kk.m27469x1(list.get_Item(list.size() - 1), C7182dy.class)) {
                C1576x1 c1576x1 = c9421c5Peek.m46100to().get_Item(((C7182dy) OooO0O0.OooO00o(list, 1)).m27766k4());
                if (C7019kk.m27469x1(c1576x1, C1574kk.class)) {
                    m15662k4(c9470duMo46638k4, (C1574kk) C7019kk.m27452k4((Object) c1576x1, C1574kk.class));
                } else if (C7019kk.m27469x1(c1576x1, C1575to.class)) {
                    c9470duMo46638k4.m46577k4(C6371x1.m26193k4((C1575to) C7019kk.m27452k4((Object) c1576x1, C1575to.class)));
                }
            }
            this.f10734k4.mo46639k4(c9470duMo46638k4);
        }
        if (c9421c5Peek.m46096k4() == null || !c9421c5Peek.m46096k4().containsKey(c9470duMo46638k4.m46616yd()) || (abstractC5200du = c9421c5Peek.m46096k4().get_Item(c9470duMo46638k4.m46616yd())) == null) {
            return;
        }
        if (!C7019kk.m27469x1(abstractC5200du, C5209rv.class)) {
            if (C7019kk.m27469x1(abstractC5200du, C5211up.class)) {
                c3946qm = new C3928e0(this.f10734k4);
            } else if (C7019kk.m27469x1(abstractC5200du, C5204jd.class)) {
                c3946qm = new C3957ts(this.f10734k4);
            } else if (C7019kk.m27469x1(abstractC5200du, C5202fa.class) || C7019kk.m27469x1(abstractC5200du, C5201dy.class)) {
                c3946qm = null;
            } else if (C7019kk.m27469x1(abstractC5200du, C5206kk.class)) {
                c3946qm = new C3916ak(this.f10734k4);
            } else if (C7019kk.m27469x1(abstractC5200du, C5213x6.class)) {
                c3946qm = new C3946qm(this.f10734k4, this.f10736x1);
            } else {
                if (!C7019kk.m27469x1(abstractC5200du, C5199ck.class) && !C7019kk.m27469x1(abstractC5200du, C5214yj.class)) {
                    C7019kk.m27469x1(abstractC5200du, C5207ks.class);
                }
                c3946qm = null;
            }
        }
        if (c3946qm != null) {
            c3946qm.mo15630k4(c3958u4, list);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m15662k4(C9470du c9470du, C1574kk c1574kk) {
        C11913yj c11913yjM55760h4 = c9470du.m46565k4().m55760h4();
        c11913yjM55760h4.m55769k4(C9476to.m46654k4(this.f10735kk.mo46644k4()), 1);
        c9470du.m46574k4(C6371x1.m26194x1(c1574kk, c11913yjM55760h4));
        c9470du.m46572k4(C6371x1.m26192k4(c1574kk, c11913yjM55760h4));
    }
}
