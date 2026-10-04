package com.aspose.slides.internal.p135fp;

import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13616v4;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4089ck implements InterfaceC6900ck {

    /* JADX INFO: renamed from: k4 */
    private final C10019k4 f11156k4;

    /* JADX INFO: renamed from: x1 */
    private C4102rv f11157x1;

    public C4089ck(C10019k4 c10019k4) {
        this.f11156k4 = c10019k4;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: ix */
    public boolean mo10016ix() {
        return m16262k4().m49205k4() != 5;
    }

    /* JADX INFO: renamed from: k4 */
    public C10019k4 m16262k4() {
        return this.f11156k4;
    }

    /* JADX INFO: renamed from: x1 */
    public C4102rv m16264x1() {
        return this.f11157x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16263k4(C4102rv c4102rv) {
        this.f11157x1 = c4102rv;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
    /* JADX INFO: renamed from: x1 */
    public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) throws Throwable {
        C4110x1 c4110x1 = new C4110x1(interfaceC6908m9);
        C13616v4 c13616v4 = new C13616v4();
        c13616v4.m62829k4(C13609qq.m62785x1());
        mo10017k4(c12014ne.Clone(), c13616v4, c4110x1);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: k4 */
    public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) throws Throwable {
        new C4087bv(m16262k4(), interfaceC6899c5, c13616v4, m16264x1()).mo9818k4(c12014ne.Clone());
    }
}
