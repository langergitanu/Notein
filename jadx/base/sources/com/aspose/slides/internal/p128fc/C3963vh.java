package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.C9471dy;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p506xo.C12587m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.vh */
/* JADX INFO: loaded from: classes.dex */
public class C3963vh implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10721k4;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10722x1;

    public C3963vh(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack) {
        this.f10721k4 = interfaceC9477x1;
        this.f10722x1 = stack;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 2) {
            return;
        }
        C7182dy c7182dy = (C7182dy) list.get_Item(0);
        float fM27753to = ((C7179c5) list.get_Item(1)).m27753to();
        C9470du c9470duMo46638k4 = this.f10721k4.mo46638k4();
        C9471dy c9471dyClone = c9470duMo46638k4.m46554c5().Clone();
        c9471dyClone.m46625k4(fM27753to);
        C9421c5 c9421c5Peek = this.f10722x1.peek();
        String strM27766k4 = c7182dy.m27766k4();
        c9471dyClone.m46628k4(c9421c5Peek.m46101x1().containsKey(strM27766k4) ? c9421c5Peek.m46101x1().get_Item(strM27766k4) : C12587m9.m58746k4());
        c9470duMo46638k4.m46576k4(c9471dyClone.Clone());
        this.f10721k4.mo46639k4(c9470duMo46638k4);
    }
}
