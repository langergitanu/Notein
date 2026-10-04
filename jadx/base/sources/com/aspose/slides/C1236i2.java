package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.i2 */
/* JADX INFO: loaded from: classes3.dex */
class C1236i2 {

    /* JADX INFO: renamed from: du */
    private final C0823bm f5609du;

    /* JADX INFO: renamed from: k4 */
    private final C14693vm f5610k4;

    /* JADX INFO: renamed from: kk */
    private final C13837mh f5611kk;

    /* JADX INFO: renamed from: to */
    private final C14736wg f5612to;

    /* JADX INFO: renamed from: x1 */
    private final C1244i9 f5613x1;

    public C1236i2(C14365qy c14365qy, float f, boolean z) {
        C14693vm c14693vm = new C14693vm(c14365qy, f, z);
        this.f5610k4 = c14693vm;
        this.f5613x1 = new C1244i9(c14693vm);
        this.f5611kk = new C13837mh(c14693vm);
        this.f5612to = new C14736wg(c14693vm);
        this.f5609du = new C0823bm(c14693vm);
    }

    /* JADX INFO: renamed from: k4 */
    public static AutoShape m7383k4(String str, C12013m9 c12013m9, C12003du c12003du, int i, int i2, C14365qy c14365qy) {
        AutoShape autoShape = new AutoShape(c14365qy.m69834fa());
        autoShape.setShapeType(5);
        autoShape.addTextFrame(str);
        int count = autoShape.getTextFrame().getParagraphs().getCount();
        if (count > 1) {
            String strM67400k4 = C14113y2.f47374k4;
            for (int i3 = 1; i3 < count; i3++) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, autoShape.getTextFrame().getParagraphs().get_Item(i3).getText());
            }
            autoShape.getTextFrame().getParagraphs().get_Item(0).setText(C14113y2.m67408k4(autoShape.getTextFrame().getParagraphs().get_Item(0).getText(), strM67400k4));
            while (autoShape.getTextFrame().getParagraphs().getCount() > 1) {
                autoShape.getTextFrame().getParagraphs().removeAt(autoShape.getTextFrame().getParagraphs().getCount() - 1);
            }
        }
        m7385k4(autoShape, c12013m9, c12003du.Clone(), i, i2);
        autoShape.getFillFormat().setFillType((byte) 0);
        autoShape.getLineFormat().getFillFormat().setFillType((byte) 0);
        return autoShape;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m7384k4(C12007ix c12007ix, int i) {
        float fM56557jd;
        float fM56551ck;
        float fM56550c5;
        float fM56575x1;
        int iM67482k4 = C14116yg.m67482k4(i);
        if (iM67482k4 == 0) {
            fM56557jd = c12007ix.m56557jd();
            fM56551ck = c12007ix.m56551ck();
            fM56550c5 = c12007ix.m56550c5();
            fM56575x1 = c12007ix.m56575x1();
        } else if (iM67482k4 == 15) {
            double dM67482k4 = (((double) C14116yg.m67482k4(i)) / 180.0d) * 3.141592653589793d;
            float fM67475k4 = (float) C14116yg.m67475k4(C14116yg.m67495m9(dM67482k4));
            float fM67475k42 = (float) C14116yg.m67475k4(C14116yg.m67470dy(dM67482k4));
            float fM56575x12 = (c12007ix.m56575x1() * fM67475k4) + (c12007ix.m56550c5() * fM67475k42);
            float fM56575x13 = (c12007ix.m56575x1() * fM67475k42) + (c12007ix.m56550c5() * fM67475k4);
            float fM56557jd2 = c12007ix.m56557jd();
            float fM56551ck2 = c12007ix.m56551ck();
            fM56550c5 = C14116yg.m67481k4(c12007ix.m56550c5(), fM56575x12);
            fM56575x1 = C14116yg.m67481k4(fM56575x13, fM56575x13);
            fM56557jd = fM56557jd2;
            fM56551ck = fM56551ck2;
        } else if (iM67482k4 != 90) {
            fM56557jd = c12007ix.m56557jd();
            fM56551ck = c12007ix.m56551ck();
            fM56550c5 = c12007ix.m56550c5();
            fM56575x1 = c12007ix.m56575x1();
        } else {
            C12025x6 c12025x6 = new C12025x6(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
            C12007ix c12007ix2 = new C12007ix(c12025x6.m56897x1() - (c12007ix.m56575x1() / 2.0f), c12025x6.m56895kk() - (c12007ix.m56550c5() / 2.0f), c12007ix.m56575x1(), c12007ix.m56550c5());
            fM56557jd = c12007ix2.m56557jd();
            float fM56551ck3 = c12007ix2.m56551ck();
            fM56550c5 = C14116yg.m67481k4(c12007ix2.m56575x1(), c12007ix2.m56550c5());
            float fM67481k4 = C14116yg.m67481k4(c12007ix2.m56575x1(), c12007ix2.m56550c5());
            fM56551ck = fM56551ck3;
            fM56575x1 = fM67481k4;
        }
        return new C12007ix(fM56557jd, fM56551ck, fM56550c5, fM56575x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7389k4() {
        this.f5610k4.m72357k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7385k4(AutoShape autoShape, C12013m9 c12013m9, C12003du c12003du, int i, int i2) {
        FontData fontData = new FontData(c12013m9.m56651x1().m56527du());
        C12003du c12003duClone = c12003du.Clone();
        IGenericEnumerator<IParagraph> it = autoShape.getTextFrame().getParagraphs().iterator();
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
                    defaultPortionFormat.setFontHeight(c12013m9.m56639dy());
                }
                if (defaultPortionFormat.getFontBold() == -1) {
                    defaultPortionFormat.setFontBold(c12013m9.m56645k4() ? (byte) 1 : (byte) 0);
                }
                if (defaultPortionFormat.getFontItalic() == -1) {
                    defaultPortionFormat.setFontItalic(c12013m9.m56641h4() ? (byte) 1 : (byte) 0);
                }
                if (defaultPortionFormat.getFontUnderline() == -1) {
                    defaultPortionFormat.setFontUnderline(c12013m9.m56637ck() ? (byte) 2 : (byte) 0);
                }
                IParagraphFormat paragraphFormat = next.getParagraphFormat();
                if (paragraphFormat.getAlignment() == -1) {
                    paragraphFormat.setAlignment(i);
                }
                if (paragraphFormat.getFontAlignment() == -1) {
                    paragraphFormat.setFontAlignment(i2);
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
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShape.m288x1().getTextFrameFormat();
        textFrameFormat.setRotationAngle(Float.NaN);
        textFrameFormat.m2953k4(textFrameFormat.m2963to().m73500k4(xmh.f50156k4.Clone()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7386k4(C0934eb c0934eb, C0763au c0763au, C14365qy c14365qy, float f) {
        if (C14113y2.m67411k4(c0934eb.m5396k4())) {
            return;
        }
        C12007ix c12007ixClone = c0934eb.m5399x1().Clone();
        c12007ixClone.m56576x1((float) C14116yg.m67501x1(c12007ixClone.m56550c5()));
        c12007ixClone.m56560k4((float) C14116yg.m67501x1(c12007ixClone.m56575x1()));
        AutoShape autoShapeM7383k4 = m7383k4(c0934eb.m5396k4(), c0934eb.m5394du(), c0934eb.m5395h4().Clone(), c0934eb.m5398to(), c0934eb.m5397kk(), c14365qy);
        C12007ix c12007ixClone2 = m7384k4(c12007ixClone.Clone(), c0763au.m3736kk()).Clone();
        autoShapeM7383k4.setX(c12007ixClone2.m56557jd());
        autoShapeM7383k4.setY(c12007ixClone2.m56551ck());
        autoShapeM7383k4.setWidth(c12007ixClone2.m56550c5());
        autoShapeM7383k4.setHeight(c12007ixClone2.m56575x1());
        autoShapeM7383k4.setRotation(-c0763au.m3736kk());
        if (c0763au.m3735k4() != null && c0763au.m3735k4().getFillType() != -1) {
            ((FillFormat) autoShapeM7383k4.getFillFormat()).m1456k4((IFillFormat) c0763au.m3735k4());
        }
        if (c0763au.m3737x1() != null && c0763au.m3737x1().getStyle() != -1) {
            ((LineFormat) autoShapeM7383k4.getLineFormat()).m1896k4((ILineFormat) c0763au.m3737x1());
        }
        c14365qy.m69832dy().m7394k4(c14365qy.m69855qm().Clone().Clone(), autoShapeM7383k4, f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7390k4(ijy ijyVar, C12007ix c12007ix, C0962es c0962es) {
        this.f5609du.m4269k4(ijyVar, c12007ix.Clone(), c0962es);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7387k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, FillFormat fillFormat, float f, float f2) {
        azo azoVarM7718x1 = im9.m7718x1(c12003du.Clone(), lineFormat, c14365qy, (float) lineFormat.getEffective().getWidth());
        azoVarM7718x1.f4054h4 = im9.m7685k4(c12003du.Clone(), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, f, c11896dy);
        C0962es c0962esM7684k4 = im9.m7684k4(c12003du2.Clone(), fillFormat, c14365qy, f, c11896dy);
        C12007ix c12007ix = new C12007ix(c14365qy.m69833e0().m64124x1(), c14365qy.m69833e0().m64114kk() - c14365qy.m69833e0().m64100du(), c14365qy.m69867v4(), c14365qy.m69852lr());
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        try {
            c14365qy.m69832dy().m7391k4(c12007ix.Clone(), c0962esM7684k4, azoVarM7718x1, c11896dy2, 0.0f, f2);
            if (c11896dy2 != null) {
                c11896dy2.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7391k4(C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy, float f, float f2) {
        this.f5611kk.m64891k4(c12007ix.Clone(), c0962es, azoVar, c11896dy, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7392k4(C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy, float f, float f2, ilw ilwVar) {
        this.f5612to.m72696k4(c12007ix.Clone(), c0962es, azoVar, c11896dy, f, f2, ilwVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7388k4(C12007ix c12007ix, String str, int i, C12013m9 c12013m9, C12003du c12003du, int i2, int i3, C14365qy c14365qy, float f) {
        if (c12007ix.m56550c5() < 1.0f) {
            c12007ix.m56576x1(1.0f);
        }
        if (c12007ix.m56575x1() < 1.0f) {
            c12007ix.m56560k4(1.0f);
        }
        AutoShape autoShapeM7383k4 = m7383k4(str, c12013m9, c12003du.Clone(), i2, i3, c14365qy);
        C12007ix c12007ixClone = m7384k4(c12007ix.Clone(), i).Clone();
        autoShapeM7383k4.setX(c12007ixClone.m56557jd());
        autoShapeM7383k4.setY(c12007ixClone.m56551ck());
        autoShapeM7383k4.setWidth(c12007ixClone.m56550c5());
        autoShapeM7383k4.setHeight(c12007ixClone.m56575x1());
        autoShapeM7383k4.setRotation(-i);
        c14365qy.m69832dy().m7394k4(c14365qy.m69855qm().Clone().Clone(), autoShapeM7383k4, f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7393k4(boolean z) {
        this.f5613x1.m72887k4(z);
        this.f5611kk.m72887k4(z);
        this.f5612to.m72887k4(z);
        this.f5609du.m72887k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7394k4(C12007ix c12007ix, AutoShape autoShape, float f) {
        return this.f5613x1.m7603k4(c12007ix.Clone(), autoShape, f);
    }
}
