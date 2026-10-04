package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.wt */
/* JADX INFO: loaded from: classes3.dex */
class C14750wt extends upj {

    /* JADX INFO: renamed from: k4 */
    private final jk9 f49855k4;

    /* JADX INFO: renamed from: kk */
    private t1m f49856kk;

    /* JADX INFO: renamed from: x1 */
    private final C14881zd f49857x1;

    public C14750wt(C13847mr c13847mr) {
        super(c13847mr);
        c13847mr.m64945h4().getType();
        jk9 jk9Var = new jk9(m71747dy(), c13847mr.m64945h4(), m71751to());
        this.f49855k4 = jk9Var;
        if (jk9Var.m63385to().length > 0) {
            jk9Var.m63385to()[0].m5532k4(true);
        }
        C14881zd c14881zd = new C14881zd(m71750m9());
        this.f49857x1 = c14881zd;
        c14881zd.m5415x1(m71748jd());
        if (c13847mr.m64945h4().hasSeriesLines() && !c14881zd.m5408dy()) {
            t1m t1mVar = new t1m(c13847mr);
            this.f49856kk = t1mVar;
            m73215k4(t1mVar);
        }
        m73215k4(jk9Var);
        m73215k4(c14881zd);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72925k4(mxy mxyVar, mxy[] mxyVarArr, mxy[] mxyVarArr2) {
        float gapWidth = m71746ck().m64945h4().getGapWidth() / 400.0f;
        float secondPieSize = (m71746ck().m64945h4().getSecondPieSize() & 65535) / 200.0f;
        float fM72555k4 = mxyVar.m72555k4() / ((gapWidth + 1.0f) + secondPieSize);
        float f = fM72555k4 * 1.0f;
        float f2 = secondPieSize * fM72555k4;
        float f3 = f2 * 2.0f;
        float fM72556x1 = mxyVar.m72556x1();
        if (fM72556x1 < C14116yg.m67481k4(f, f3)) {
            fM72555k4 *= fM72556x1 / C14116yg.m67481k4(f, f3);
            f = fM72555k4 * 1.0f;
            f2 = secondPieSize * fM72555k4;
            f3 = f2 * 2.0f;
        }
        float f4 = gapWidth * fM72555k4;
        float fM72555k42 = ((((mxyVar.m72555k4() - f) - f4) - f2) / 2.0f) + mxyVar.m67814to();
        mxyVarArr[0] = new mxy(f, f, fM72555k42, C20503OooO00o.OooO0O0(mxyVar.m72556x1(), f, 2.0f, mxyVar.m67811du()));
        mxyVarArr2[0] = new mxy(f2, f3, fM72555k42 + mxyVarArr[0].m72555k4() + f4, C20503OooO00o.OooO0O0(mxyVar.m72556x1(), f3, 2.0f, mxyVar.m67811du()));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        mxy[] mxyVarArr = {null};
        mxy[] mxyVarArr2 = {null};
        m72925k4(mxyVar, mxyVarArr, mxyVarArr2);
        mxy mxyVar2 = mxyVarArr[0];
        mxy mxyVar3 = mxyVarArr2[0];
        this.f49855k4.m73208du(mxyVar2.m67814to() - mxyVar.m67814to());
        this.f49855k4.m73212h4(mxyVar2.m67811du() - mxyVar.m67811du());
        this.f49855k4.m73220ss();
        this.f49857x1.m73208du(mxyVar3.m67814to() - mxyVar.m67814to());
        this.f49857x1.m73212h4(mxyVar3.m67811du() - mxyVar.m67811du());
        this.f49857x1.m73220ss();
        if (this.f49856kk == null || this.f49857x1.m5408dy()) {
            return;
        }
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12025x6[] c12025x6Arr2 = {c12025x62};
        m71749k4(this.f49855k4.m63385to()[0], c12025x6Arr, c12025x6Arr2);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12025x6Arr2[0].CloneTo(c12025x62);
        this.f49856kk.m70917k4(c12025x6.Clone(), c12025x62.Clone(), new C12025x6(this.f49857x1.m73227xk(), this.f49857x1.m73206c6()).Clone(), new C12025x6(this.f49857x1.m73227xk(), this.f49857x1.m73206c6() + this.f49857x1.m73203ak()).Clone());
        this.f49856kk.m73220ss();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        mxy[] mxyVarArr = {null};
        mxy[] mxyVarArr2 = {null};
        m72925k4(mxyVar, mxyVarArr, mxyVarArr2);
        mxy mxyVar2 = mxyVarArr[0];
        mxy mxyVar3 = mxyVarArr2[0];
        this.f49855k4.m73210fa(mxyVar2);
        this.f49857x1.m73210fa(mxyVar3);
        t1m t1mVar = this.f49856kk;
        if (t1mVar != null) {
            t1mVar.m73210fa(mxyVar);
        }
    }
}
