package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p271mc.C6362dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.C9431to;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p469w2.C11882k4;
import com.aspose.slides.internal.p469w2.C11883x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.um */
/* JADX INFO: loaded from: classes.dex */
public class C3959um implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10716k4;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10717x1;

    public C3959um(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack) {
        this.f10716k4 = interfaceC9477x1;
        this.f10717x1 = stack;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 1) {
            throw new ArgumentNullException(C14113y2.m67402k4("Operand missing for operator '{0}'", c3958u4.f10713k4));
        }
        C9470du c9470duMo46638k4 = this.f10716k4.mo46638k4();
        C7185jd c7185jd = list.get_Item(0);
        if (C7019kk.m27469x1(c7185jd, C7182dy.class)) {
            C9431to c9431to = this.f10717x1.peek().m46099kk().get_Item(((C7182dy) c7185jd).m27766k4());
            C7187kk c7187kkM46175k4 = c9431to.m46175k4();
            if (c7187kkM46175k4.m27805k4(C7182dy.f19532mq)) {
                c9470duMo46638k4.m46608x1(c9431to.m46185x1());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19447h9)) {
                c9470duMo46638k4.m46568k4(C6362dy.m26130k4(c9431to.m46176kk()));
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19427fu)) {
                c9470duMo46638k4.m46609x1(C6362dy.m26133x1(c9431to.m46181to()));
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19421fc)) {
                c9470duMo46638k4.m46587kk(c9431to.m46169du());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19545n9)) {
                c9470duMo46638k4.m46588kk((int) AbstractC14106wy.parse(C7019kk.m27443k4((Class<?>) C11883x1.class), c9431to.m46172h4()));
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19634tb)) {
                c9470duMo46638k4.m46566k4(c9431to.m46178m9());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19469iu)) {
                c9470duMo46638k4.m46589kk(c9431to.m46170dy());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19579pk)) {
                c9470duMo46638k4.m46598to(c9431to.m46174jd());
            }
            c7187kkM46175k4.m27805k4(C7182dy.f19461i5);
            if (c7187kkM46175k4.m27805k4(C7182dy.f19405ei)) {
                c9470duMo46638k4.m46607x1(c9431to.m46168ck());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19725yq)) {
                c9470duMo46638k4.m46586kk(c9431to.m46171fa());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19505kx)) {
                c9470duMo46638k4.m46583k4(c9431to.m46183up());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19538my)) {
                c9470duMo46638k4.m46567k4(c9431to.m46173ix().m8462k4());
                c9470duMo46638k4.m46584k4(C6362dy.m26132k4(c9431to.m46173ix(), c9431to.m46185x1()));
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19619s7)) {
                int iM27462to = C7019kk.m27462to(Float.valueOf(c9431to.m46182u4() * 255.0f), 13);
                c9470duMo46638k4.m46612x1(C12003du.m56398k4(iM27462to, c9470duMo46638k4.m46615xk().m56507jd() & 255, c9470duMo46638k4.m46615xk().m56502ck() & 255, c9470duMo46638k4.m46615xk().m56505fa() & 255).Clone());
                c9470duMo46638k4.m46597to(iM27462to);
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19418f9)) {
                int iM27462to2 = C7019kk.m27462to(Float.valueOf(c9431to.m46184uz() * 255.0f), 13);
                c9470duMo46638k4.m46580k4(C12003du.m56398k4(iM27462to2, c9470duMo46638k4.m46552b3().m56507jd() & 255, c9470duMo46638k4.m46552b3().m56502ck() & 255, c9470duMo46638k4.m46552b3().m56505fa() & 255).Clone());
                c9470duMo46638k4.m46559du(iM27462to2);
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19392du)) {
                c9470duMo46638k4.m46613x1(c9431to.m46187yj());
            }
            c7187kkM46175k4.m27805k4(C7182dy.f19603qy);
            if (c7187kkM46175k4.m27805k4(C7182dy.f19372cl)) {
                C11882k4 c11882k4M46177ks = c9431to.m46177ks();
                if (c11882k4M46177ks != null) {
                    c11882k4M46177ks.m55480k4(c9470duMo46638k4.m46565k4().m55760h4());
                }
                c9470duMo46638k4.m46578k4(c11882k4M46177ks);
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19702xk)) {
                c9470duMo46638k4.m46581k4(c9431to.m46180rv());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19575pa) && !c9431to.m46175k4().m27805k4(C7182dy.f19496kh)) {
                c9470duMo46638k4.m46575k4(c9431to.m46186x6());
            }
            if (c7187kkM46175k4.m27805k4(C7182dy.f19496kh)) {
                c9470duMo46638k4.m46575k4(c9431to.m46179ne());
            }
            this.f10716k4.mo46639k4(c9470duMo46638k4);
        }
    }
}
