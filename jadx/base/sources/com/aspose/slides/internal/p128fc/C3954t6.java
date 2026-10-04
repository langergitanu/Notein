package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p033b2.C1576x1;
import com.aspose.slides.internal.p200j6.C5208m9;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.t6 */
/* JADX INFO: loaded from: classes.dex */
public class C3954t6 implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10708k4;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10709x1;

    public C3954t6(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack) {
        this.f10708k4 = interfaceC9477x1;
        this.f10709x1 = stack;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        int i;
        C7185jd c7185jd;
        int size = list.size();
        int i2 = 0;
        if (size == 1) {
            c7185jd = list.get_Item(0);
        } else {
            C7186k4 c7186k4 = new C7186k4();
            while (true) {
                i = size - 1;
                if (i2 >= i) {
                    break;
                }
                c7186k4.m27783k4(list.get_Item(i2));
                i2++;
            }
            c7185jd = list.get_Item(i);
        }
        C1576x1 c1576x1 = this.f10709x1.peek().m46100to().get_Item(((C7182dy) c7185jd).m27766k4());
        C9470du c9470duMo46638k4 = this.f10708k4.mo46638k4();
        C5208m9 c5208m9M46585kk = c9470duMo46638k4.m46585kk();
        c5208m9M46585kk.m22222k4(c1576x1);
        c9470duMo46638k4.m46571k4(c5208m9M46585kk);
        this.f10708k4.mo46639k4(c9470duMo46638k4);
    }
}
