package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.bu */
/* JADX INFO: loaded from: classes3.dex */
class C0831bu extends xhm {

    /* JADX INFO: renamed from: kk */
    private C14787xi f4250kk;

    /* JADX INFO: renamed from: x1 */
    private C14245oo f4251x1;

    public C0831bu(C14787xi c14787xi) {
        this.f4251x1 = c14787xi.m73408m9();
        this.f4250kk = c14787xi;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        return this.f4251x1.m68735h4();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        float rotationAngle = (this.f4250kk.m73384dy().getPosition() == 1 || this.f4250kk.m73384dy().getPosition() == 2) ? 90.0f : 0.0f;
        byte textVerticalType = this.f4250kk.m73384dy().getTitle().getTextFormat().getTextBlockFormat().getTextVerticalType();
        if (textVerticalType == 0) {
            rotationAngle = 0.0f;
        } else if (textVerticalType == 1 || textVerticalType == 2 || textVerticalType == 3 || textVerticalType == 4 || textVerticalType == 5) {
            rotationAngle = 90.0f;
        }
        if (!C14064he.m66715kk(this.f4250kk.m73384dy().getTitle().getTextFormat().getTextBlockFormat().getRotationAngle())) {
            rotationAngle = this.f4250kk.m73384dy().getTitle().getTextFormat().getTextBlockFormat().getRotationAngle() * (-1.0f);
        }
        if (this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding() == null) {
            return rotationAngle;
        }
        byte textVerticalType2 = this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType();
        return !C14064he.m66715kk(this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle()) ? this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle() * (-1.0f) : textVerticalType2 != 0 ? (textVerticalType2 == 1 || textVerticalType2 == 2 || textVerticalType2 == 3 || textVerticalType2 == 4 || textVerticalType2 == 5) ? 90.0f : rotationAngle : 0.0f;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        m73365k4(this.f4250kk.m73384dy().getTitle().getTextFormat());
        if (this.f4250kk.m73384dy().getTitle().getTextFormat().getTextBlockFormat().getTextVerticalType() != -1) {
            autoShape.getTextFrame().getTextFrameFormat().setTextVerticalType(this.f4250kk.m73384dy().getTitle().getTextFormat().getTextBlockFormat().getTextVerticalType());
        }
        if (this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding() != null && this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType() != -1) {
            autoShape.getTextFrame().getTextFrameFormat().setTextVerticalType(this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType());
        }
        m4316x1(autoShape);
    }

    /* JADX INFO: renamed from: kk */
    public final int m4320kk() {
        return this.f4250kk.m73384dy().getPosition();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        C12013m9 c12013m9M68734du = this.f4251x1.m68734du();
        return c12013m9M68734du == null ? this.f4251x1.m68744x1() : c12013m9M68734du;
    }

    @Override // com.aspose.slides.xhm, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        im9.m7700k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f4250kk.m73423wy(), m73209e0().Clone(), (LineFormat) this.f4250kk.m73384dy().getTitle().getFormat().getLine(), (FillFormat) this.f4250kk.m73384dy().getTitle().getFormat().getFill(), this.f4250kk.m73384dy().getTitle().getFormat().getEffect());
        super.mo3482x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m4316x1(AutoShape autoShape) {
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShape.getTextFrame().getTextFrameFormat();
        ITextFrameFormat textFrameFormat2 = this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding() != null ? this.f4250kk.m73384dy().getTitle().getTextFrameForOverriding().getTextFrameFormat() : null;
        xmh xmhVarClone = textFrameFormat.m2963to().Clone();
        xmhVarClone.f50160x1 = (textFrameFormat2 == null || C14044b3.m66437kk(textFrameFormat2.getMarginLeft())) ? 3.0f : textFrameFormat2.getMarginLeft();
        xmhVarClone.f50159to = (textFrameFormat2 == null || C14044b3.m66437kk(textFrameFormat2.getMarginRight())) ? 3.0f : textFrameFormat2.getMarginRight();
        textFrameFormat.m2953k4(xmhVarClone.Clone());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        C14365qy c14365qyM68742m9 = this.f4251x1.m68742m9();
        oju ojuVar = new oju(c14365qyM68742m9.m69867v4(), c14365qyM68742m9.m69852lr());
        oju.m68617k4(ojuVar, 0.8f).CloneTo(ojuVar);
        m73214k4(m73363k4(this.f4251x1.m68737k4(), ojuVar.f47836k4, ojuVar.f47837x1).Clone().Clone());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
    }
}
