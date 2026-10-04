package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.yd */
/* JADX INFO: loaded from: classes4.dex */
class C7012yd extends AbstractC6994ks {

    /* JADX INFO: renamed from: c5 */
    private C6987e0 f19070c5 = new C6987e0();

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: fa */
    public void mo27299fa() {
        if (this.f19049m9 != 1482250784) {
            throw new C7004up();
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: k4 */
    public void mo27374k4(C6990ix c6990ix) {
        this.f19049m9 = C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10);
        mo27299fa();
        this.f19048dy = c6990ix.m27352kk();
        this.f19070c5.f19006k4 = C7019kk.m27437dy(Long.valueOf(c6990ix.m27352kk()), 10) / 65536.0f;
        this.f19070c5.f19008x1 = C7019kk.m27437dy(Long.valueOf(c6990ix.m27352kk()), 10) / 65536.0f;
        this.f19070c5.f19007kk = C7019kk.m27437dy(Long.valueOf(c6990ix.m27352kk()), 10) / 65536.0f;
    }

    /* JADX INFO: renamed from: up */
    public C6987e0 m27424up() {
        return this.f19070c5;
    }
}
