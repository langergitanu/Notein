package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ne */
/* JADX INFO: loaded from: classes.dex */
public final class C4458ne extends AbstractC4434bz {

    /* JADX INFO: renamed from: du */
    private C4473um f12247du;

    /* JADX INFO: renamed from: h4 */
    private float f12248h4;

    /* JADX INFO: renamed from: m9 */
    private float f12249m9;

    public C4458ne(InterfaceC4472u4 interfaceC4472u4, C4442e0 c4442e0, List<C4430ar> list, int i, float f, float f2) {
        super(interfaceC4472u4, c4442e0, list, i);
        this.f12247du = new C4473um();
        this.f12248h4 = f;
        this.f12249m9 = f2;
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public C4428ai mo18091k4(AbstractC4434bz.kk kkVar) {
        C4428ai c4428ai = new C4428ai();
        C4428ai[] c4428aiArr = {c4428ai};
        this.f12174k4.mo18194k4(kkVar.f12182kk.m18285k4(), kkVar.f12182kk.m18290x1(), c4428aiArr);
        c4428aiArr[0].CloneTo(c4428ai);
        c4428ai.m18050to(c4428ai.m18049to() * C4479w6.m18404k4(this.f12248h4, this.f12249m9, C4489zj.m18500kk(kkVar.f12184x1.Clone(), new C4489zj(0.0f, 0.0f, 1.0f))));
        return c4428ai;
    }

    public C4458ne(InterfaceC4472u4 interfaceC4472u4, C4442e0 c4442e0, C4430ar c4430ar, int i, float f, float f2) {
        super(interfaceC4472u4, c4442e0, c4430ar, i);
        this.f12247du = new C4473um();
        this.f12248h4 = f;
        this.f12249m9 = f2;
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public AbstractC4434bz.kk mo18092k4(AbstractC4434bz.x1 x1Var) {
        AbstractC4434bz.kk kkVar = new AbstractC4434bz.kk();
        this.f12247du.m18373kk(x1Var.f12185k4.Clone()).CloneTo(kkVar.f12181k4);
        this.f12177x1.m18165kk().m18377x1(x1Var.f12187x1.Clone()).CloneTo(kkVar.f12184x1);
        x1Var.f12186kk.CloneTo(kkVar.f12182kk);
        this.f12177x1.m18165kk().m18370k4(x1Var.f12185k4.Clone()).Clone();
        return kkVar;
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public void mo18093k4() {
        C4473um.m18361k4(C4473um.m18361k4(this.f12177x1.m18165kk(), this.f12177x1.m18162k4()), this.f12177x1.m18168x1()).CloneTo(this.f12247du);
    }
}
