package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class xhm extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    protected AutoShape f50079k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f50080x1 = true;

    /* JADX INFO: renamed from: m9 */
    private void m73362m9() {
        C12013m9 c12013m9Mo4321to = mo4321to();
        FontData fontData = new FontData(c12013m9Mo4321to.m56651x1().m56527du());
        C12003du c12003duClone = mo4317du().Clone();
        IGenericEnumerator<IParagraph> it = this.f50079k4.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                if (next.getParagraphFormat().getBullet().getType() == -1) {
                    next.getParagraphFormat().getBullet().setType((byte) 0);
                }
                IPortionFormat defaultPortionFormat = next.getParagraphFormat().getDefaultPortionFormat();
                defaultPortionFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) defaultPortionFormat.getFillFormat().getSolidFillColor()).m1080k4(c12003duClone.Clone());
                if (defaultPortionFormat.getLatinFont() == null) {
                    defaultPortionFormat.setLatinFont(fontData);
                }
                if (defaultPortionFormat.getEastAsianFont() == null) {
                    defaultPortionFormat.setEastAsianFont(fontData);
                }
                if (C14044b3.m66437kk(defaultPortionFormat.getFontHeight())) {
                    defaultPortionFormat.setFontHeight(c12013m9Mo4321to.m56639dy());
                }
                if (defaultPortionFormat.getFontBold() == -1) {
                    defaultPortionFormat.setFontBold(c12013m9Mo4321to.m56645k4() ? (byte) 1 : (byte) 0);
                }
                if (defaultPortionFormat.getFontItalic() == -1) {
                    defaultPortionFormat.setFontItalic(c12013m9Mo4321to.m56641h4() ? (byte) 1 : (byte) 0);
                }
                if (defaultPortionFormat.getFontUnderline() == -1) {
                    defaultPortionFormat.setFontUnderline(c12013m9Mo4321to.m56637ck() ? (byte) 2 : (byte) 0);
                }
                IParagraphFormat paragraphFormat = next.getParagraphFormat();
                if (paragraphFormat.getAlignment() == -1) {
                    paragraphFormat.setAlignment(1);
                }
                if (paragraphFormat.getFontAlignment() == -1) {
                    paragraphFormat.setFontAlignment(2);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        TextFrameFormat textFrameFormat = (TextFrameFormat) this.f50079k4.m288x1().getTextFrameFormat();
        textFrameFormat.setRotationAngle(Float.NaN);
        textFrameFormat.m2953k4(textFrameFormat.m2963to().m73500k4(xmh.f50156k4.Clone()).Clone());
    }

    /* JADX INFO: renamed from: du */
    public abstract C12003du mo4317du();

    /* JADX INFO: renamed from: h4 */
    public abstract float mo4318h4();

    /* JADX INFO: renamed from: k4 */
    public final oju m73363k4(String str, float f, float f2) {
        return m73364k4(str, f, f2, true);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo4319k4(AutoShape autoShape);

    /* JADX INFO: renamed from: kk */
    public final void m73366kk(boolean z) {
        this.f50080x1 = z;
    }

    /* JADX INFO: renamed from: ks */
    public final AutoShape m73367ks() {
        return this.f50079k4;
    }

    /* JADX INFO: renamed from: to */
    public abstract C12013m9 mo4321to();

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        AutoShape autoShape;
        float fM73206c6;
        if (this.f50079k4 == null || !this.f50080x1) {
            return;
        }
        if (mo4318h4() != 0.0f) {
            this.f50079k4.setX(m73223ts().m56897x1() - (this.f50079k4.getWidth() / 2.0f));
            autoShape = this.f50079k4;
            fM73206c6 = m73223ts().m56895kk() - (this.f50079k4.getHeight() / 2.0f);
        } else {
            this.f50079k4.setX(m73227xk());
            autoShape = this.f50079k4;
            fM73206c6 = m73206c6();
        }
        autoShape.setY(fM73206c6);
        C14365qy c14365qyM7149to = m73218lr().m7149to();
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM7149to);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            this.f50079k4.m2546bz().mo4131k4(c14365qyM7149to.m69870wy(), c14365qyM7149to.m69821ak(), InterruptionToken.getNone());
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: yj */
    public final C12007ix[] m73368yj() {
        return jq6.m63492k4(this.f50079k4.m288x1().f3523to);
    }

    /* JADX INFO: renamed from: k4 */
    public final oju m73364k4(String str, float f, float f2, boolean z) {
        if (this.f50079k4 == null) {
            AutoShape autoShape = new AutoShape(m73218lr().m7149to().m69834fa());
            this.f50079k4 = autoShape;
            autoShape.setShapeType(5);
        }
        float fMo4318h4 = C14064he.m66715kk(mo4318h4()) ? 0.0f : mo4318h4();
        this.f50079k4.setWidth(C14116yg.m67480k4(fMo4318h4) == 90.0f ? f2 : f);
        this.f50079k4.setHeight(C14116yg.m67480k4(fMo4318h4) == 90.0f ? f : f2);
        this.f50079k4.setRotation(-fMo4318h4);
        this.f50079k4.addTextFrame(C14113y2.m67362du(str, C14113y2.m67365dy(C14052dq.m66570kk())));
        mo4319k4(this.f50079k4);
        m73362m9();
        jq6.m63494x1(this.f50079k4.m288x1().f3523to);
        C12007ix c12007ixClone = C14873z5.m74318k4(m73368yj()).Clone();
        if (!z) {
            return new oju(f, f2);
        }
        TextFrameFormat textFrameFormat = (TextFrameFormat) this.f50079k4.m288x1().getTextFrameFormat();
        float f3 = (float) (textFrameFormat.m2963to().f50160x1 + textFrameFormat.m2963to().f50159to);
        float f4 = (float) (textFrameFormat.m2963to().f50158kk + textFrameFormat.m2963to().f50157du);
        if (!C14064he.m66715kk(f3)) {
            c12007ixClone.m56576x1(c12007ixClone.m56550c5() + f3);
        }
        if (!C14064he.m66715kk(f4)) {
            c12007ixClone.m56560k4(c12007ixClone.m56575x1() + f4);
        }
        jjy jjyVar = new jjy(c12007ixClone.Clone());
        if (textFrameFormat.getTextVerticalType() == 4 || textFrameFormat.getTextVerticalType() == 3 || textFrameFormat.getTextVerticalType() == 5 || textFrameFormat.getTextVerticalType() == 6) {
            this.f50079k4.setWidth((float) C14116yg.m67501x1(jjyVar.m63358kk()));
            this.f50079k4.setHeight((float) C14116yg.m67501x1(jjyVar.m63360x1()));
            jq6.m63494x1(this.f50079k4.m288x1().f3523to);
            jjyVar.m63353k4(fMo4318h4);
            return new oju(jjyVar.m63358kk(), jjyVar.m63360x1());
        }
        this.f50079k4.setWidth((float) C14116yg.m67501x1(jjyVar.m63360x1()));
        this.f50079k4.setHeight((float) C14116yg.m67501x1(jjyVar.m63358kk()));
        jq6.m63494x1(this.f50079k4.m288x1().f3523to);
        jjyVar.m63353k4(fMo4318h4);
        return new oju(jjyVar.m63360x1(), jjyVar.m63358kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m73361k4(Object obj, String str) {
        return C13729ki.m63880k4(obj, str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73365k4(IChartTextFormat iChartTextFormat) {
        if (iChartTextFormat.getPortionFormat().isHardUnderlineFill() == 1) {
            this.f50079k4.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setHardUnderlineFill((byte) 1);
        }
        if (iChartTextFormat.getPortionFormat().getFontUnderline() != -1) {
            this.f50079k4.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontUnderline(iChartTextFormat.getPortionFormat().getFontUnderline());
        }
        if (iChartTextFormat.getPortionFormat().getUnderlineFillFormat().getFillType() != -1) {
            ((FillFormat) C7019kk.m27452k4((Object) this.f50079k4.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getUnderlineFillFormat(), FillFormat.class)).m1456k4(iChartTextFormat.getPortionFormat().getUnderlineFillFormat());
        }
    }
}
