package com.aspose.slides.internal.p096dy;

import com.aspose.slides.internal.p423to.C11074x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dy.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3503k4 extends AbstractC3504kk {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC3506x1 f9741k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC3506x1 f9742x1;

    public C3503k4(InterfaceC3506x1 interfaceC3506x1, InterfaceC3506x1 interfaceC3506x12) {
        this.f9741k4 = interfaceC3506x1;
        this.f9742x1 = interfaceC3506x12;
    }

    @Override // com.aspose.slides.internal.p096dy.InterfaceC3506x1
    /* JADX INFO: renamed from: k4 */
    public String mo14058k4() {
        return C14113y2.m67408k4(this.f9741k4.mo14058k4(), " AND ", this.f9742x1.mo14058k4());
    }

    @Override // com.aspose.slides.internal.p096dy.InterfaceC3506x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo10096k4(C11074x1 c11074x1) {
        return this.f9741k4.mo10096k4(c11074x1) && this.f9742x1.mo10096k4(c11074x1);
    }
}
