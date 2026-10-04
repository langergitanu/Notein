package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.w9 */
/* JADX INFO: loaded from: classes3.dex */
class C14729w9 extends xhm {

    /* JADX INFO: renamed from: kk */
    private C14787xi f49775kk;

    /* JADX INFO: renamed from: x1 */
    private C14697vp f49776x1;

    public C14729w9(C14787xi c14787xi) {
        this.f49776x1 = c14787xi.m73431yd();
        this.f49775kk = c14787xi;
        boolean z = true;
        if (c14787xi.m73384dy().getPosition() != 1 && this.f49775kk.m73384dy().getPosition() != 2) {
            z = false;
        }
        if (this.f49776x1.m72477k4() && z) {
            this.f49776x1.m72476k4(90);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m72666x1(AutoShape autoShape) {
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShape.getTextFrame().getTextFrameFormat();
        ITextFrameFormat textFrameFormat2 = this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding() != null ? this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat() : null;
        xmh xmhVarClone = textFrameFormat.m2963to().Clone();
        double marginRight = 3.0d;
        xmhVarClone.f50160x1 = (textFrameFormat2 == null || C14044b3.m66437kk(textFrameFormat2.getMarginLeft())) ? 3.0d : textFrameFormat2.getMarginLeft();
        if (textFrameFormat2 != null && !C14044b3.m66437kk(textFrameFormat2.getMarginRight())) {
            marginRight = textFrameFormat2.getMarginRight();
        }
        xmhVarClone.f50159to = marginRight;
        textFrameFormat.m2953k4(xmhVarClone.Clone());
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        return this.f49776x1.m72475du();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        float fM72480x1 = this.f49776x1.m72480x1();
        if (!C14064he.m66715kk(this.f49775kk.m73384dy().m327x1().getTextFormat().getTextBlockFormat().getRotationAngle())) {
            fM72480x1 = this.f49775kk.m73384dy().m327x1().getTextFormat().getTextBlockFormat().getRotationAngle() * (-1.0f);
        }
        if (this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding() == null) {
            return fM72480x1;
        }
        byte textVerticalType = this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType();
        if (textVerticalType == 0) {
            fM72480x1 = 0.0f;
        } else if (textVerticalType == 1 || textVerticalType == 2 || textVerticalType == 3 || textVerticalType == 4 || textVerticalType == 5) {
            fM72480x1 = 90.0f;
        }
        return !C14064he.m66715kk(this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle()) ? this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle() * (-1.0f) : fM72480x1;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        m73365k4(this.f49775kk.m73384dy().m327x1().getTextFormat());
        if (this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding() != null && !C14113y2.m67411k4(this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getText())) {
            autoShape.m288x1().m2930x1(this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding());
        }
        if (this.f49775kk.m73384dy().m327x1().getTextFormat().getTextBlockFormat().getTextVerticalType() != -1) {
            autoShape.getTextFrame().getTextFrameFormat().setTextVerticalType(this.f49775kk.m73384dy().m327x1().getTextFormat().getTextBlockFormat().getTextVerticalType());
        }
        if (this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding() != null && this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType() != -1) {
            autoShape.getTextFrame().getTextFrameFormat().setTextVerticalType(this.f49775kk.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType());
        }
        m72666x1(autoShape);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m72667m9() {
        return this.f49775kk.m73384dy().getPosition();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        return this.f49776x1.m72479to();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        C14365qy c14365qyM73423wy = this.f49775kk.m73423wy();
        oju ojuVar = new oju(c14365qyM73423wy.m69867v4(), c14365qyM73423wy.m69852lr());
        oju ojuVar2 = new oju(ojuVar.f47836k4 * 0.85f, ojuVar.f47837x1 * 0.6f);
        m73214k4(m73363k4(this.f49776x1.m72478kk(), ojuVar2.f47836k4, ojuVar2.f47837x1).Clone().Clone());
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
