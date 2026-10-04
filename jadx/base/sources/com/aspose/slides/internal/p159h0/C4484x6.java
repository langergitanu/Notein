package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4484x6 extends AbstractC4434bz {

    /* JADX INFO: renamed from: du */
    private C4473um f12334du;

    public C4484x6(InterfaceC4472u4 interfaceC4472u4, C4442e0 c4442e0, List<C4430ar> list, int i) {
        super(interfaceC4472u4, c4442e0, list, i);
        this.f12334du = new C4473um();
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public C4428ai mo18091k4(AbstractC4434bz.kk kkVar) {
        C4428ai c4428ai = new C4428ai();
        C4428ai[] c4428aiArr = {c4428ai};
        this.f12174k4.mo18194k4(kkVar.f12182kk.m18285k4(), kkVar.f12182kk.m18290x1(), c4428aiArr);
        c4428aiArr[0].CloneTo(c4428ai);
        return c4428ai;
    }

    public C4484x6(InterfaceC4472u4 interfaceC4472u4, C4442e0 c4442e0, C4430ar c4430ar, int i) {
        super(interfaceC4472u4, c4442e0, c4430ar, i);
        this.f12334du = new C4473um();
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public AbstractC4434bz.kk mo18092k4(AbstractC4434bz.x1 x1Var) {
        AbstractC4434bz.kk kkVar = new AbstractC4434bz.kk();
        this.f12334du.m18373kk(x1Var.f12185k4.Clone()).CloneTo(kkVar.f12181k4);
        x1Var.f12186kk.CloneTo(kkVar.f12182kk);
        this.f12177x1.m18165kk().m18370k4(x1Var.f12185k4.Clone()).Clone();
        return kkVar;
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public void mo18093k4() {
        C4473um.m18361k4(C4473um.m18361k4(this.f12177x1.m18165kk(), this.f12177x1.m18162k4()), this.f12177x1.m18168x1()).CloneTo(this.f12334du);
    }
}
