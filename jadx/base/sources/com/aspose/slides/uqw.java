package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class uqw extends AbstractC1164gw {

    /* JADX INFO: renamed from: k4 */
    private lyj f49360k4;

    public uqw(C0886d8 c0886d8) {
        super(c0886d8);
        IMarker iMarkerM599x1 = c0886d8.m4988jd().m599x1();
        m71753k4(new lyj(iMarkerM599x1 == null ? c0886d8.m5012up().m64945h4().getMarker() : iMarkerM599x1, c0886d8.m5012up()));
        m73215k4((AbstractC14770x9) m71754to());
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3519k4() {
        return new C12025x6(m73223ts().m56897x1(), m73223ts().m56895kk());
    }

    /* JADX INFO: renamed from: to */
    public final lyj m71754to() {
        return this.f49360k4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        m71754to().m73220ss();
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3520k4(C14177nd c14177nd) {
        return new C12025x6(m73223ts().m56897x1(), m73223ts().m56895kk());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71753k4(lyj lyjVar) {
        this.f49360k4 = lyjVar;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m71754to().m73210fa(new C14713vw(100.0f, 100.0f));
        if (m6926yj().m5012up().m64945h4().getType() != 72) {
            m73217kk(m71754to().m73225wy());
            m73222to(m71754to().m73203ak());
        } else {
            m73217kk(0.0f);
            m73222to(0.0f);
            m71754to().mo63967x1(false);
        }
    }
}
