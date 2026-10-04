package com.aspose.slides.internal.p341po;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.po.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9472h4 implements InterfaceC9477x1 {

    /* JADX INFO: renamed from: k4 */
    private Stack<C9470du> f34520k4 = new Stack<>();

    /* JADX INFO: renamed from: kk */
    private C9470du f34521kk;

    /* JADX INFO: renamed from: x1 */
    private C9470du f34522x1;

    public C9472h4() {
        m46636h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m46636h4() {
        C9471dy c9471dy = new C9471dy();
        c9471dy.m46635x1(1.0f);
        C9470du c9470du = new C9470du();
        c9470du.m46579k4(new C11913yj());
        c9470du.m46580k4(C12003du.m56460uz().Clone());
        c9470du.m46612x1(C12003du.m56460uz().Clone());
        c9470du.m46576k4(c9471dy);
        mo46639k4(c9470du);
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: du */
    public final void mo46637du() {
        this.f34520k4.clear();
        m46636h4();
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: k4 */
    public final C9470du mo46638k4() {
        return this.f34522x1;
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: kk */
    public final void mo46640kk() {
        this.f34520k4.push(mo46638k4());
        mo46639k4(mo46638k4().m46555c6());
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: to */
    public final void mo46641to() {
        mo46639k4(this.f34520k4.pop());
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: x1 */
    public final C9470du mo46642x1() {
        return this.f34521kk;
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: k4 */
    public final void mo46639k4(C9470du c9470du) {
        this.f34522x1 = c9470du;
    }

    @Override // com.aspose.slides.internal.p341po.InterfaceC9477x1
    /* JADX INFO: renamed from: x1 */
    public final void mo46643x1(C9470du c9470du) {
        this.f34521kk = c9470du;
    }
}
