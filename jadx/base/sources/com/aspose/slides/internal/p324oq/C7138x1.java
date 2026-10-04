package com.aspose.slides.internal.p324oq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p081de.C3153k4;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3782c5;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.oq.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7138x1 extends C3182du implements InterfaceC3186k4, InterfaceC7137k4 {
    public C7138x1() {
        this.f9456h4 = "path";
    }

    /* JADX INFO: renamed from: b3 */
    public final String m27685b3() {
        return this.f9461x1.m13692to("d");
    }

    /* JADX INFO: renamed from: jd */
    public final void m27686jd(String str) {
        this.f9461x1.set_Item("d", str);
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        return C3153k4.m13468k4(mo17081x1(c3786fa, c12015qq.Clone())).m55523c5();
    }

    @Override // com.aspose.slides.internal.p324oq.InterfaceC7137k4
    /* JADX INFO: renamed from: x1 */
    public final List<C3785dy> mo17081x1(C3786fa c3786fa, C12015qq c12015qq) {
        return C3782c5.m15111k4(m27685b3(), c3786fa);
    }

    public C7138x1(String str, C3187kk c3187kk, C3181c5 c3181c5) {
        super(str, c3187kk, c3181c5);
    }
}
