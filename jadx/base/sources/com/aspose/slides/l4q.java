package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class l4q extends upj {

    /* JADX INFO: renamed from: k4 */
    private final jk9 f45938k4;

    /* JADX INFO: renamed from: kk */
    private t1m f45939kk;

    /* JADX INFO: renamed from: x1 */
    private final jk9 f45940x1;

    public l4q(C13847mr c13847mr) {
        super(c13847mr);
        c13847mr.m64945h4().getType();
        jk9 jk9Var = new jk9(m71747dy(), c13847mr.m64945h4(), m71751to());
        this.f45938k4 = jk9Var;
        jk9Var.m63385to()[0].m5532k4(true);
        qma qmaVar = new qma(m71745c5(), c13847mr.m64945h4(), m71750m9());
        this.f45940x1 = qmaVar;
        qmaVar.m5415x1(m71748jd());
        if (c13847mr.m64945h4().hasSeriesLines() && !qmaVar.m5408dy()) {
            t1m t1mVar = new t1m(c13847mr);
            this.f45939kk = t1mVar;
            m73215k4(t1mVar);
        }
        m73215k4(jk9Var);
        m73215k4(qmaVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64306k4(mxy mxyVar, mxy[] mxyVarArr, mxy[] mxyVarArr2) {
        float gapWidth = m71746ck().m64945h4().getGapWidth() / 200.0f;
        float secondPieSize = (m71746ck().m64945h4().getSecondPieSize() & 65535) / 100.0f;
        float fM72555k4 = mxyVar.m72555k4() / ((gapWidth + 1.0f) + secondPieSize);
        float f = fM72555k4 * 1.0f;
        float f2 = secondPieSize * fM72555k4;
        float fM72556x1 = mxyVar.m72556x1();
        if (fM72556x1 < f) {
            fM72555k4 *= fM72556x1 / f;
            f = fM72555k4 * 1.0f;
            f2 = secondPieSize * fM72555k4;
        }
        float f3 = gapWidth * fM72555k4;
        float fM72555k42 = ((((mxyVar.m72555k4() - f) - f3) - f2) / 2.0f) + mxyVar.m67814to();
        mxyVarArr[0] = new mxy(f, f, fM72555k42, C20503OooO00o.OooO0O0(mxyVar.m72556x1(), f, 2.0f, mxyVar.m67811du()));
        mxyVarArr2[0] = new mxy(f2, f2, fM72555k42 + mxyVarArr[0].m72555k4() + f3, C20503OooO00o.OooO0O0(mxyVar.m72556x1(), f2, 2.0f, mxyVar.m67811du()));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        eh0 eh0Var;
        mxy mxyVar = (mxy) c14713vw;
        eh0 eh0Var2 = null;
        mxy[] mxyVarArr = {null};
        mxy[] mxyVarArr2 = {null};
        m64306k4(mxyVar, mxyVarArr, mxyVarArr2);
        mxy mxyVar2 = mxyVarArr[0];
        mxy mxyVar3 = mxyVarArr2[0];
        this.f45938k4.m73208du(mxyVar2.m67814to() - mxyVar.m67814to());
        this.f45938k4.m73212h4(mxyVar2.m67811du() - mxyVar.m67811du());
        this.f45938k4.m73220ss();
        this.f45940x1.m73208du(mxyVar3.m67814to() - mxyVar.m67814to());
        this.f45940x1.m73212h4(mxyVar3.m67811du() - mxyVar.m67811du());
        this.f45940x1.m73220ss();
        if (this.f45939kk == null || this.f45940x1.m5408dy()) {
            return;
        }
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12025x6[] c12025x6Arr2 = {c12025x62};
        m71749k4(this.f45938k4.m63385to()[0], c12025x6Arr, c12025x6Arr2);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12025x6Arr2[0].CloneTo(c12025x62);
        if (this.f45940x1.m63385to().length > 1) {
            eh0Var = null;
            for (eh0 eh0Var3 : this.f45940x1.m63385to()) {
                double dM5527fa = eh0Var3.m5527fa();
                double dM5527fa2 = eh0Var3.m5527fa() + eh0Var3.m5535up();
                if (eh0Var2 == null && ((dM5527fa2 < 360.0d && dM5527fa < 90.0d && dM5527fa2 > 90.0d) || (dM5527fa2 > 360.0d && dM5527fa2 % 360.0d > 90.0d))) {
                    eh0Var2 = eh0Var3;
                }
                if (eh0Var == null && dM5527fa < 270.0d && dM5527fa2 > 270.0d) {
                    eh0Var = eh0Var3;
                }
            }
        } else {
            eh0Var2 = this.f45940x1.m63385to()[0];
            eh0Var = eh0Var2;
        }
        C12025x6 c12025x63 = new C12025x6();
        C12025x6 c12025x64 = new C12025x6();
        C12025x6 c12025x65 = new C12025x6();
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        c12025x6Clone.CloneTo(c12025x64);
        c12025x6Clone.CloneTo(c12025x63);
        if (eh0Var2 != null) {
            C12025x6[] c12025x6Arr3 = {c12025x65};
            C12025x6[] c12025x6Arr4 = {c12025x64};
            m71749k4(eh0Var2, c12025x6Arr3, c12025x6Arr4);
            c12025x6Arr3[0].CloneTo(c12025x65);
            c12025x6Arr4[0].CloneTo(c12025x64);
        }
        if (eh0Var != null) {
            C12025x6[] c12025x6Arr5 = {c12025x63};
            C12025x6[] c12025x6Arr6 = {c12025x65};
            m71749k4(eh0Var, c12025x6Arr5, c12025x6Arr6);
            c12025x6Arr5[0].CloneTo(c12025x63);
            c12025x6Arr6[0].CloneTo(c12025x65);
        }
        this.f45939kk.m70917k4(c12025x6.Clone(), c12025x62.Clone(), c12025x63.Clone(), c12025x64.Clone());
        this.f45939kk.m73220ss();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        mxy[] mxyVarArr = {null};
        mxy[] mxyVarArr2 = {null};
        m64306k4(mxyVar, mxyVarArr, mxyVarArr2);
        mxy mxyVar2 = mxyVarArr[0];
        mxy mxyVar3 = mxyVarArr2[0];
        this.f45938k4.m73210fa(mxyVar2);
        this.f45940x1.m73210fa(mxyVar3);
        t1m t1mVar = this.f45939kk;
        if (t1mVar != null) {
            t1mVar.m73210fa(mxyVar);
        }
    }
}
