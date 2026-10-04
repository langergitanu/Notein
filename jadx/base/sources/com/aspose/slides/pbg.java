package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class pbg extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private final jk9 f48022k4;

    public pbg(C13847mr c13847mr) {
        c13847mr.m64945h4().getType();
        jk9 jk9Var = new jk9(c13847mr.m64945h4().getFirstSliceAngle() & 65535, c13847mr.m64945h4(), c13847mr.m64944dy().toArray(new C0886d8[0]));
        this.f48022k4 = jk9Var;
        m73215k4(jk9Var);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        this.f48022k4.m73210fa(((mxy) c14713vw).m67812h4());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        mxy mxyVarM67812h4 = mxyVar.m67812h4();
        this.f48022k4.m73208du(mxyVarM67812h4.m67814to() - mxyVar.m67814to());
        this.f48022k4.m73212h4(mxyVarM67812h4.m67811du() - mxyVar.m67811du());
        this.f48022k4.m73220ss();
    }
}
