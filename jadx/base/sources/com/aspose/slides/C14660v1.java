package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p416tb.C10909qq;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.internal.p505xn.C12577yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.v1 */
/* JADX INFO: loaded from: classes3.dex */
class C14660v1 extends C14168n5 {

    /* JADX INFO: renamed from: du */
    private boolean f49446du;

    /* JADX INFO: renamed from: kk */
    private final HandoutLayoutingOptions f49447kk;

    /* JADX INFO: renamed from: to */
    private List<List<C14917zw>> f49448to;

    /* JADX INFO: renamed from: x1 */
    private IFontData f49449x1;

    public C14660v1(MasterHandoutSlide masterHandoutSlide, HandoutLayoutingOptions handoutLayoutingOptions, boolean z) {
        super(masterHandoutSlide);
        this.f49447kk = handoutLayoutingOptions;
        m72044k4(z);
    }

    /* JADX INFO: renamed from: c5 */
    private C12007ix[] m72021c5() {
        boolean z;
        switch (this.f49447kk.getHandout()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
                z = true;
                break;
            case 4:
            case 6:
            case 8:
                z = false;
                break;
            default:
                throw new ArgumentOutOfRangeException(C14042ak.m66410k4(HandoutType.class, this.f49447kk.getHandout()));
        }
        boolean z2 = m72048x1().m56699x1() > m72048x1().m56697kk();
        C12007ix[] c12007ixArr = (C12007ix[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12007ix.class), m72041h4()));
        C12007ix c12007ixClone = C12007ix.m56542k4(new C12007ix(new C12025x6(), m72048x1().Clone()), -40.0f, -40.0f).Clone();
        int iM72041h4 = m72041h4();
        if (iM72041h4 == 1) {
            c12007ixClone.CloneTo(c12007ixArr[0]);
            return c12007ixArr;
        }
        if (iM72041h4 == 2) {
            float fM56550c5 = c12007ixClone.m56550c5();
            if (!z2) {
                float fM56575x1 = c12007ixClone.m56575x1() / 2.0f;
                c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), fM56550c5, fM56575x1);
                c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x1, fM56550c5, fM56575x1);
                return c12007ixArr;
            }
            float f = fM56550c5 / 2.0f;
            float fM56575x12 = c12007ixClone.m56575x1();
            c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f, fM56575x12);
            c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd() + f, c12007ixClone.m56551ck(), f, fM56575x12);
            return c12007ixArr;
        }
        if (iM72041h4 == 3) {
            float fM56550c52 = c12007ixClone.m56550c5();
            if (z2) {
                float f2 = fM56550c52 / 3.0f;
                float fM56575x13 = c12007ixClone.m56575x1() / 2.0f;
                c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f2, fM56575x13);
                c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd() + f2, c12007ixClone.m56551ck(), f2, fM56575x13);
                c12007ixArr[2] = new C12007ix((2.0f * f2) + c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f2, fM56575x13);
                return c12007ixArr;
            }
            float f3 = fM56550c52 / 2.0f;
            float fM56575x14 = c12007ixClone.m56575x1() / 3.0f;
            c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f3, fM56575x14);
            c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x14, f3, fM56575x14);
            c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd(), (2.0f * fM56575x14) + c12007ixClone.m56551ck(), f3, fM56575x14);
            return c12007ixArr;
        }
        if (iM72041h4 == 4) {
            float fM56550c53 = c12007ixClone.m56550c5() / 2.0f;
            float fM56575x15 = c12007ixClone.m56575x1() / 2.0f;
            if (z) {
                c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), fM56550c53, fM56575x15);
                c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd() + fM56550c53, c12007ixClone.m56551ck(), fM56550c53, fM56575x15);
                c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x15, fM56550c53, fM56575x15);
                c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd() + fM56550c53, c12007ixClone.m56551ck() + fM56575x15, fM56550c53, fM56575x15);
                return c12007ixArr;
            }
            c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), fM56550c53, fM56575x15);
            c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x15, fM56550c53, fM56575x15);
            c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd() + fM56550c53, c12007ixClone.m56551ck(), fM56550c53, fM56575x15);
            c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd() + fM56550c53, c12007ixClone.m56551ck() + fM56575x15, fM56550c53, fM56575x15);
            return c12007ixArr;
        }
        if (iM72041h4 != 6) {
            if (iM72041h4 != 9) {
                return c12007ixArr;
            }
            float fM56550c54 = c12007ixClone.m56550c5() / 3.0f;
            float fM56575x16 = c12007ixClone.m56575x1() / 3.0f;
            if (z) {
                c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), fM56550c54, fM56575x16);
                c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd() + fM56550c54, c12007ixClone.m56551ck(), fM56550c54, fM56575x16);
                float f4 = fM56550c54 * 2.0f;
                c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd() + f4, c12007ixClone.m56551ck(), fM56550c54, fM56575x16);
                c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x16, fM56550c54, fM56575x16);
                c12007ixArr[4] = new C12007ix(c12007ixClone.m56557jd() + fM56550c54, c12007ixClone.m56551ck() + fM56575x16, fM56550c54, fM56575x16);
                c12007ixArr[5] = new C12007ix(c12007ixClone.m56557jd() + f4, c12007ixClone.m56551ck() + fM56575x16, fM56550c54, fM56575x16);
                float f5 = 2.0f * fM56575x16;
                c12007ixArr[6] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + f5, fM56550c54, fM56575x16);
                c12007ixArr[7] = new C12007ix(c12007ixClone.m56557jd() + fM56550c54, c12007ixClone.m56551ck() + f5, fM56550c54, fM56575x16);
                c12007ixArr[8] = new C12007ix(c12007ixClone.m56557jd() + f4, c12007ixClone.m56551ck() + f5, fM56550c54, fM56575x16);
                return c12007ixArr;
            }
            c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), fM56550c54, fM56575x16);
            c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x16, fM56550c54, fM56575x16);
            float f6 = fM56575x16 * 2.0f;
            c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + f6, fM56550c54, fM56575x16);
            c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd() + fM56550c54, c12007ixClone.m56551ck(), fM56550c54, fM56575x16);
            c12007ixArr[4] = new C12007ix(c12007ixClone.m56557jd() + fM56550c54, c12007ixClone.m56551ck() + fM56575x16, fM56550c54, fM56575x16);
            c12007ixArr[5] = new C12007ix(c12007ixClone.m56557jd() + fM56550c54, c12007ixClone.m56551ck() + f6, fM56550c54, fM56575x16);
            float f7 = 2.0f * fM56550c54;
            c12007ixArr[6] = new C12007ix(c12007ixClone.m56557jd() + f7, c12007ixClone.m56551ck(), fM56550c54, fM56575x16);
            c12007ixArr[7] = new C12007ix(c12007ixClone.m56557jd() + f7, c12007ixClone.m56551ck() + fM56575x16, fM56550c54, fM56575x16);
            c12007ixArr[8] = new C12007ix(c12007ixClone.m56557jd() + f7, c12007ixClone.m56551ck() + f6, fM56550c54, fM56575x16);
            return c12007ixArr;
        }
        float fM56550c55 = c12007ixClone.m56550c5();
        if (z2) {
            float f8 = fM56550c55 / 3.0f;
            float fM56575x17 = c12007ixClone.m56575x1() / 2.0f;
            if (z) {
                c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f8, fM56575x17);
                c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd() + f8, c12007ixClone.m56551ck(), f8, fM56575x17);
                float f9 = 2.0f * f8;
                c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd() + f9, c12007ixClone.m56551ck(), f8, fM56575x17);
                c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x17, f8, fM56575x17);
                c12007ixArr[4] = new C12007ix(c12007ixClone.m56557jd() + f8, c12007ixClone.m56551ck() + fM56575x17, f8, fM56575x17);
                c12007ixArr[5] = new C12007ix(c12007ixClone.m56557jd() + f9, c12007ixClone.m56551ck() + fM56575x17, f8, fM56575x17);
                return c12007ixArr;
            }
            c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f8, fM56575x17);
            c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x17, f8, fM56575x17);
            c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd() + f8, c12007ixClone.m56551ck(), f8, fM56575x17);
            c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd() + f8, c12007ixClone.m56551ck() + fM56575x17, f8, fM56575x17);
            float f10 = 2.0f * f8;
            c12007ixArr[4] = new C12007ix(c12007ixClone.m56557jd() + f10, c12007ixClone.m56551ck(), f8, fM56575x17);
            c12007ixArr[5] = new C12007ix(c12007ixClone.m56557jd() + f10, c12007ixClone.m56551ck() + fM56575x17, f8, fM56575x17);
            return c12007ixArr;
        }
        float f11 = fM56550c55 / 2.0f;
        float fM56575x18 = c12007ixClone.m56575x1() / 3.0f;
        if (z) {
            c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f11, fM56575x18);
            c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd() + f11, c12007ixClone.m56551ck(), f11, fM56575x18);
            c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x18, f11, fM56575x18);
            c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd() + f11, c12007ixClone.m56551ck() + fM56575x18, f11, fM56575x18);
            float f12 = 2.0f * fM56575x18;
            c12007ixArr[4] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + f12, f11, fM56575x18);
            c12007ixArr[5] = new C12007ix(c12007ixClone.m56557jd() + f11, c12007ixClone.m56551ck() + f12, f11, fM56575x18);
            return c12007ixArr;
        }
        c12007ixArr[0] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), f11, fM56575x18);
        c12007ixArr[1] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + fM56575x18, f11, fM56575x18);
        float f13 = 2.0f * fM56575x18;
        c12007ixArr[2] = new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck() + f13, f11, fM56575x18);
        c12007ixArr[3] = new C12007ix(c12007ixClone.m56557jd() + f11, c12007ixClone.m56551ck(), f11, fM56575x18);
        c12007ixArr[4] = new C12007ix(c12007ixClone.m56557jd() + f11, c12007ixClone.m56551ck() + fM56575x18, f11, fM56575x18);
        c12007ixArr[5] = new C12007ix(c12007ixClone.m56557jd() + f11, c12007ixClone.m56551ck() + f13, f11, fM56575x18);
        return c12007ixArr;
    }

    /* JADX INFO: renamed from: dy */
    private int m72022dy() {
        switch (this.f49447kk.getHandout()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
            case 4:
                return 4;
            case 5:
            case 6:
                return 6;
            case 7:
            case 8:
                return 9;
            default:
                throw new ArgumentOutOfRangeException(C14042ak.m66410k4(HandoutType.class, this.f49447kk.getHandout()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private ITable m72023k4(IBaseSlide iBaseSlide, float f) {
        ITable iTableAddTable = iBaseSlide.getShapes().addTable(75.0f, f + 50.0f, new double[]{75.0d, ((SlideSize) m67872k4().getSlideSize()).m2755k4().m56699x1() - 225.0f}, new double[]{1.0d, 1.0d});
        iTableAddTable.mergeCells(iTableAddTable.get_Item(0, 0), iTableAddTable.get_Item(1, 0), false);
        iTableAddTable.setStylePreset(3);
        if (this.f49449x1 != null) {
            iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f49449x1);
            iTableAddTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f49449x1);
            iTableAddTable.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f49449x1);
        }
        iTableAddTable.get_Item(0, 0).setMarginLeft(0.0d);
        iTableAddTable.get_Item(0, 1).setMarginLeft(0.0d);
        iTableAddTable.get_Item(1, 1).setMarginLeft(0.0d);
        iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
        iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte) 1);
        iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(12.0f);
        iTableAddTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTableAddTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
        iTableAddTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte) 1);
        iTableAddTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0f);
        iTableAddTable.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTableAddTable.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
        iTableAddTable.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0f);
        return iTableAddTable;
    }

    /* JADX INFO: renamed from: m9 */
    private List<List<C14917zw>> m72038m9() {
        return this.f49448to;
    }

    /* JADX INFO: renamed from: x1 */
    private Presentation m72039x1(int[] iArr) {
        AutoShape autoShape;
        m72032k4(iArr);
        Presentation presentation = new Presentation();
        presentation.getSlideSize().setSize(((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), 1);
        presentation.getSlides().removeAt(0);
        IMasterSlide iMasterSlide = presentation.getMasters().get_Item(0);
        iMasterSlide.getShapes().clear();
        IGenericEnumerator<IShape> it = m72040du().getShapes().iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (next.getPlaceholder() == null || next.getPlaceholder().getType() != 7) {
                    iMasterSlide.getShapes().addClone(next);
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
        iMasterSlide.getBackground().setType(m72040du().getBackground().getType());
        ((FillFormat) iMasterSlide.getBackground().getFillFormat()).m1456k4(m72040du().getBackground().getFillFormat());
        ILayoutSlide iLayoutSlide = presentation.getLayoutSlides().get_Item(0);
        iLayoutSlide.getShapes().clear();
        IGenericEnumerator<ISlide> it2 = iMasterSlide.getShapes().iterator();
        while (it2.hasNext()) {
            try {
                iLayoutSlide.getShapes().addClone(it2.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        List.Enumerator<C14917zw> it3 = m72038m9().iterator();
        while (it3.hasNext()) {
            try {
                List<C14917zw> next2 = it3.next();
                ISlide iSlideAddEmptySlide = presentation.getSlides().addEmptySlide(iLayoutSlide);
                C12577yj<Integer, IComment[]> c12577yj = new C12577yj<>(Integer.class, IComment[].class);
                it3 = next2.iterator();
                while (it3.hasNext()) {
                    try {
                        C14917zw next3 = it3.next();
                        next3.m74858k4(iSlideAddEmptySlide, this.f49447kk.getPrintFrameSlide(), this.f49447kk.getPrintSlideNumbers(), this.f49447kk.getPrintComments());
                        if (this.f49447kk.getPrintComments()) {
                            IComment[] slideComments = next3.m74861x1().getSlideComments(null);
                            if (slideComments.length > 0) {
                                c12577yj.addItem(Integer.valueOf(next3.m74861x1().getSlideNumber()), slideComments);
                            }
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                if (c12577yj.size() > 0) {
                    m72029k4(presentation, c12577yj, 0, true);
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                throw th2;
            }
        }
        it2 = presentation.getSlides().iterator();
        while (it2.hasNext()) {
            try {
                ISlide next4 = it2.next();
                next4.getHeaderFooterManager().setFooterVisibility(m72040du().getHeaderFooterManager().isFooterVisible());
                next4.getHeaderFooterManager().setDateTimeVisibility(m72040du().getHeaderFooterManager().isDateTimeVisible());
                next4.getHeaderFooterManager().setSlideNumberVisibility(m72040du().getHeaderFooterManager().isSlideNumberVisible());
                if (m72040du().getHeaderFooterManager().isHeaderVisible() && (autoShape = (AutoShape) C7019kk.m27452k4((Object) m72040du().m391k4((byte) 7), AutoShape.class)) != null) {
                    next4.getShapes().addClone(autoShape).removePlaceholder();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        return presentation;
    }

    /* JADX INFO: renamed from: du */
    public final MasterHandoutSlide m72040du() {
        return (MasterHandoutSlide) this.f47477k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m72041h4() {
        return m72022dy();
    }

    /* JADX INFO: renamed from: kk */
    public final C12015qq m72046kk() {
        return ((SlideSize) m67872k4().getSlideSize()).m2755k4();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m72047to() {
        return this.f49446du;
    }

    /* JADX INFO: renamed from: k4 */
    private Portion m72024k4(String str) {
        Portion portion = new Portion();
        portion.getPortionFormat().setFontHeight(8.0f);
        portion.getPortionFormat().setLatinFont(this.f49449x1);
        portion.getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) portion.getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
        portion.setText(str);
        return portion;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12015qq m72048x1() {
        return ((NotesSize) m67872k4().getNotesSize()).m2030k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C12009k4 m72025k4(C12023wl c12023wl, List<C14917zw> list, int i) {
        Dictionary.Enumerator it;
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C12009k4 c12009k4 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk(), 139273);
        c12009k4.m56332k4(96.0f, 96.0f);
        try {
            try {
                C12015qq c12015qqClone = m72048x1().Clone();
                omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                try {
                    omqVar.mo68794k4(new C12007ix(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f), (azo) null, new C0962es(C12003du.m56385i5().Clone()));
                    C13700js c13700js = new C13700js();
                    m72030k4(omqVar, new kg7(m72040du(), c12210k4, c13700js), c13700js, list, i);
                    omqVar.dispose();
                    it = c12210k4.m56976x1().iterator();
                    while (it.hasNext()) {
                        try {
                            KeyValuePair next = it.next();
                            if (!m67872k4().m2392um().m56972k4(next.getKey())) {
                                ((C7131h4) next.getValue()).m27678kk().dispose();
                                c12210k4.m56977x1(next.getKey());
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return c12009k4;
                } catch (Throwable th) {
                    omqVar.dispose();
                    throw th;
                }
            } catch (RuntimeException e) {
                c12009k4.dispose();
                throw e;
            }
        } catch (Throwable th2) {
            it = c12210k4.m56976x1().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next2 = it.next();
                    if (!m67872k4().m2392um().m56972k4(next2.getKey())) {
                        ((C7131h4) next2.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next2.getKey());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C12009k4 m72026k4(C12023wl c12023wl, Slide slide, int i) {
        Dictionary.Enumerator it;
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C12009k4 c12009k4 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk(), 139273);
        c12009k4.m56332k4(96.0f, 96.0f);
        try {
            try {
                C12015qq c12015qqClone = m72048x1().Clone();
                omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                try {
                    omqVar.mo68794k4(new C12007ix(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f), (azo) null, new C0962es(C12003du.m56385i5().Clone()));
                    C13700js c13700js = new C13700js();
                    m72031k4(omqVar, new kg7(m72040du(), c12210k4, c13700js), c13700js, slide, i);
                    omqVar.dispose();
                    it = c12210k4.m56976x1().iterator();
                    while (it.hasNext()) {
                        try {
                            KeyValuePair next = it.next();
                            if (!m67872k4().m2392um().m56972k4(next.getKey())) {
                                ((C7131h4) next.getValue()).m27678kk().dispose();
                                c12210k4.m56977x1(next.getKey());
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return c12009k4;
                } catch (Throwable th) {
                    omqVar.dispose();
                    throw th;
                }
            } catch (RuntimeException e) {
                c12009k4.dispose();
                throw e;
            }
        } catch (Throwable th2) {
            it = c12210k4.m56976x1().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next2 = it.next();
                    if (!m67872k4().m2392um().m56972k4(next2.getKey())) {
                        ((C7131h4) next2.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next2.getKey());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m72027k4(C12015qq c12015qq) {
        float fM56699x1 = c12015qq.m56699x1();
        float fM56697kk = c12015qq.m56697kk();
        float f = fM56699x1 / fM56697kk;
        float fM56699x12 = m72046kk().m56699x1() / m72046kk().m56697kk();
        if (f > fM56699x12) {
            fM56699x1 = fM56699x12 * fM56697kk;
        } else {
            fM56697kk = fM56699x1 / fM56699x12;
        }
        return new C12015qq(fM56699x1 - (fM56699x12 * 30.0f), fM56697kk - 30.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72028k4(List<List<C14917zw>> list) {
        this.f49448to = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0368, code lost:
    
        r20[r10].setText(r5);
        r13.get_Item(0, 0).getCellFormat().getBorderBottom().setWidth(1.0d);
        r13.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte) 1);
        ((com.aspose.slides.ColorFormat) r13.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor()).m1080k4(com.aspose.slides.internal.p475wh.C12003du.m56393jw().Clone());
        m72029k4(r23, r24, r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03bd, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r4, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x03bf, code lost:
    
        r4.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72029k4(Presentation presentation, C12577yj<Integer, IComment[]> c12577yj, int i, boolean z) {
        ISlide iSlide;
        float height;
        int i2;
        IComment[] iCommentArr;
        float f;
        float f2;
        boolean z2;
        String text;
        String text2;
        int iM67430to;
        int iM67429to;
        List list = new List();
        IGenericEnumerator<KeyValuePair<Integer, IComment[]>> it = c12577yj.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().getKey());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int i3 = 0;
        ISlide iSlideAddEmptySlide = presentation.getSlides().addEmptySlide(presentation.getLayoutSlides().get_Item(0));
        iSlideAddEmptySlide.getShapes().clear();
        List.Enumerator it2 = list.iterator();
        float f3 = 0.0f;
        boolean z3 = z;
        loop1: while (it2.hasNext()) {
            try {
                Integer num = (Integer) C7019kk.m27464to(it2.next(), Integer.TYPE);
                int iIntValue = num.intValue();
                IComment[] iCommentArr2 = c12577yj.get_Item(num);
                if (iCommentArr2.length > 0) {
                    C12015qq c12015qqClone = ((SlideSize) presentation.getSlideSize()).m2755k4().Clone();
                    ITable iTableM72023k4 = m72023k4(iSlideAddEmptySlide, f3);
                    float fM56697kk = (c12015qqClone.m56697kk() - f3) - 100.0f;
                    iTableM72023k4.get_Item(i3, i3).getTextFrame().getParagraphs().get_Item(i3).getPortions().get_Item(i3).setText(C14113y2.m67408k4("Slide ", C14057f9.m66591x1(iIntValue), z3 ? "" : " (continue)"));
                    int i4 = i;
                    int i5 = 1;
                    while (true) {
                        float f4 = f3;
                        if (i4 >= iCommentArr2.length) {
                            iSlide = iSlideAddEmptySlide;
                            i2 = 0;
                            iTableM72023k4.get_Item(0, 0).getCellFormat().getBorderBottom().setWidth(1.0d);
                            iTableM72023k4.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte) 1);
                            ((ColorFormat) iTableM72023k4.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
                            height = iTableM72023k4.getHeight() + f4;
                            break;
                        }
                        iTableM72023k4.getRows().addClone(iTableM72023k4.getRows().get_Item(i5), false);
                        if (z3) {
                            iTableM72023k4.get_Item(0, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67408k4(iCommentArr2[i4].getAuthor().getInitials(), C14114y9.m67465x1(((Comment) iCommentArr2[i4]).m1168to().m7379k4())));
                        }
                        iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(iCommentArr2[i4].getText());
                        ISlide iSlide2 = iSlideAddEmptySlide;
                        Portion portionM72024k4 = m72024k4(C14113y2.m67407k4(IOUtils.LINE_SEPARATOR_UNIX, iCommentArr2[i4].getAuthor().getName(), "; ", ((Comment) iCommentArr2[i4]).m1163k4()));
                        iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().add(portionM72024k4);
                        if (iTableM72023k4.getHeight() > fM56697kk) {
                            text2 = portionM72024k4.getText();
                            iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().remove(portionM72024k4);
                            if (iTableM72023k4.getHeight() > fM56697kk) {
                                f2 = f4;
                                double height2 = iTableM72023k4.get_Item(1, i5).getHeight() / ((((double) (fM56697kk - ((Table) iTableM72023k4).getY())) - iTableM72023k4.get_Item(1, i5).getOffsetY()) + ((double) f2));
                                if (height2 > 0.0d) {
                                    String strM67394k4 = C14113y2.m67394k4(iCommentArr2[i4].getText(), C7019kk.m27462to(Double.valueOf(((double) iCommentArr2[i4].getText().length()) / height2), 14));
                                    int iM67430to2 = C14113y2.m67430to(strM67394k4, " ");
                                    iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67440x1(C14113y2.m67394k4(strM67394k4, iM67430to2)));
                                    text = C14113y2.m67440x1(C14113y2.m67422kk(iCommentArr2[i4].getText(), iM67430to2));
                                    while (iTableM72023k4.getHeight() < fM56697kk && (iM67429to = C14113y2.m67429to(text, ControlChar.SPACE_CHAR)) >= 0) {
                                        IComment[] iCommentArr3 = iCommentArr2;
                                        int i6 = iM67429to + 1;
                                        iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67408k4(iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), C14113y2.m67443x1(text, 0, i6)));
                                        text = C14113y2.m67422kk(text, i6);
                                        fM56697kk = fM56697kk;
                                        iCommentArr2 = iCommentArr3;
                                    }
                                    iCommentArr = iCommentArr2;
                                    f = fM56697kk;
                                    while (iTableM72023k4.getHeight() > f && (iM67430to = C14113y2.m67430to(iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), " ")) > 0) {
                                        text = C14113y2.m67397k4(text, 0, C14113y2.m67408k4(C14113y2.m67422kk(iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), iM67430to), " "));
                                        iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67394k4(iTableM72023k4.get_Item(1, i5).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), iM67430to));
                                    }
                                    text2 = text2;
                                } else {
                                    iCommentArr = iCommentArr2;
                                    f = fM56697kk;
                                    text = iCommentArr[i4].getText();
                                    iTableM72023k4.getRows().removeAt(i5, false);
                                    text2 = text2;
                                    z2 = true;
                                }
                            } else {
                                iCommentArr = iCommentArr2;
                                f = fM56697kk;
                                f2 = f4;
                                text = "";
                            }
                            z2 = false;
                        } else {
                            iCommentArr = iCommentArr2;
                            f = fM56697kk;
                            f2 = f4;
                            z2 = z3;
                            text = "";
                            text2 = text;
                        }
                        String strM67440x1 = C14113y2.m67440x1(text);
                        if (!C14113y2.m67411k4(text2)) {
                            break loop1;
                        }
                        i5++;
                        i4++;
                        f3 = f2;
                        fM56697kk = f;
                        iSlideAddEmptySlide = iSlide2;
                        iCommentArr2 = iCommentArr;
                        z3 = true;
                    }
                } else {
                    iSlide = iSlideAddEmptySlide;
                    height = f3;
                    i2 = i3;
                }
                if (c12577yj.containsKey(num)) {
                    c12577yj.removeItemByKey(num);
                }
                i3 = i2;
                f3 = height;
                iSlideAddEmptySlide = iSlide;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72042k4(AbstractC3150x6 abstractC3150x6, int[] iArr, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        Presentation presentationM72039x1 = m72039x1(iArr);
        try {
            kmn.m64028k4(presentationM72039x1, abstractC3150x6, iArr, new HtmlOptions(), interruptionToken);
        } finally {
            if (presentationM72039x1 != null) {
                presentationM72039x1.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.aspose.slides.ms.System.IDisposable, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.aspose.slides.ms.System.IDisposable, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.aspose.slides.n5, com.aspose.slides.v1] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.aspose.slides.internal.tb.qq] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Iterator] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m72043k4(C10909qq c10909qq, int[] iArr, boolean z, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, List<Integer> list, final InterruptionToken interruptionToken) throws Throwable {
        ?? r12;
        boolean z2;
        Presentation presentation;
        IGenericEnumerator<ISlide> iGenericEnumerator;
        C12015qq c12015qq = new C12015qq((float) C12566m9.m58654x1(m72048x1().m56699x1(), 72.0d), (float) C12566m9.m58654x1(m72048x1().m56697kk(), 72.0d));
        C13700js c13700js2 = c13700js;
        kg7 kg7Var = new kg7(m72040du(), c12210k4, c13700js2);
        m72032k4(iArr);
        boolean z3 = true;
        int i = 1;
        ?? it = m72038m9().iterator();
        ?? r24 = iArr;
        while (it.hasNext()) {
            try {
                try {
                    List list2 = (List) it.next();
                    C10948ar c10948ar = new C10948ar(c12015qq.m56699x1(), c12015qq.m56697kk());
                    C12015qq c12015qq2 = c12015qq;
                    int i2 = 13;
                    C14250os c14250os = new C14250os(C7019kk.m27462to(Float.valueOf(m72048x1().m56699x1()), 13), C7019kk.m27462to(Float.valueOf(m72048x1().m56697kk()), 13), 72.0f, 72.0f, z, c13700js2, m67872k4().m2385ks(), list);
                    int i3 = i + 1;
                    r12 = it;
                    boolean z4 = z3;
                    try {
                        m72030k4(c14250os, kg7Var, c13700js, list2, i);
                        c10948ar.m52930k4(c14250os.m68790jd());
                        c10909qq.m52514x1(c10948ar, new AbstractC3174jd() { // from class: com.aspose.slides.v1.1
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                            }

                            @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                            /* JADX INFO: renamed from: k4 */
                            public void mo4791k4() {
                                interruptionToken.throwIfInterruptionRequested();
                            }
                        });
                        if (this.f49447kk.getPrintComments()) {
                            C12577yj c12577yj = new C12577yj(Integer.class, IComment[].class);
                            List.Enumerator it2 = list2.iterator();
                            boolean z5 = false;
                            while (it2.hasNext()) {
                                try {
                                    C14917zw c14917zw = (C14917zw) it2.next();
                                    IComment[] slideComments = c14917zw.m74861x1().getSlideComments(null);
                                    if (slideComments.length > 0) {
                                        z5 = z4 ? 1 : 0;
                                    }
                                    c12577yj.addItem(Integer.valueOf(c14917zw.m74861x1().getSlideNumber()), slideComments);
                                    z5 = z5;
                                } catch (Throwable th) {
                                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        it2.dispose();
                                    }
                                    throw th;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                try {
                                    it2.dispose();
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) IDisposable.class)) {
                                        r12.dispose();
                                    }
                                    throw th;
                                }
                            }
                            if (z5) {
                                Presentation presentation2 = new Presentation();
                                try {
                                    presentation2.getSlideSize().setSize(((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), 0);
                                    presentation2.getSlides().removeAt(0);
                                    presentation2.getMasters().get_Item(0).getBackground().setType(z4 ? (byte) 1 : (byte) 0);
                                    ((FillFormat) presentation2.getMasters().get_Item(0).getBackground().getFillFormat()).m1456k4(m72040du().getBackground().getFillFormat());
                                    m72029k4(presentation2, c12577yj, 0, z4);
                                    IGenericEnumerator<ISlide> it3 = presentation2.getSlides().iterator();
                                    ?? r122 = r12;
                                    while (true) {
                                        i = i3;
                                        try {
                                            if (!it3.hasNext()) {
                                                break;
                                            }
                                            ISlide next = it3.next();
                                            C10948ar c10948ar2 = new C10948ar(c12015qq2.m56699x1(), c12015qq2.m56697kk());
                                            boolean z6 = z4;
                                            ?? r242 = r122;
                                            try {
                                                C14250os c14250os2 = new C14250os(C7019kk.m27462to(Float.valueOf(m72048x1().m56699x1()), i2), C7019kk.m27462to(Float.valueOf(m72048x1().m56697kk()), i2), 72.0f, 72.0f, z, c13700js, m67872k4().m2385ks(), list);
                                                i3 = i + 1;
                                                iGenericEnumerator = it3;
                                                presentation = presentation2;
                                                try {
                                                    m72031k4(c14250os2, kg7Var, c13700js, next, i);
                                                    c10948ar2.m52930k4(c14250os2.m68790jd());
                                                    c10909qq.m52514x1(c10948ar2, new AbstractC3174jd() { // from class: com.aspose.slides.v1.2
                                                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                                        public String getDelegateId() {
                                                            return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                                                        }

                                                        @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                                                        /* JADX INFO: renamed from: k4 */
                                                        public void mo4791k4() {
                                                            interruptionToken.throwIfInterruptionRequested();
                                                        }
                                                    });
                                                    presentation2 = presentation;
                                                    it3 = iGenericEnumerator;
                                                    z4 = z6 ? 1 : 0;
                                                    i2 = 13;
                                                    r122 = r242;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    if (C7019kk.m27456k4((Iterator) iGenericEnumerator, (Class<IDisposable>) IDisposable.class)) {
                                                        iGenericEnumerator.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                iGenericEnumerator = it3;
                                                presentation = presentation2;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            presentation = presentation2;
                                            iGenericEnumerator = it3;
                                        }
                                    }
                                    z2 = z4;
                                    r24 = r122;
                                    IGenericEnumerator<ISlide> iGenericEnumerator2 = it3;
                                    presentation = presentation2;
                                    try {
                                        if (C7019kk.m27456k4((Iterator) iGenericEnumerator2, (Class<IDisposable>) IDisposable.class)) {
                                            iGenericEnumerator2.dispose();
                                        }
                                        try {
                                            presentation.dispose();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r12 = r24;
                                            if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) IDisposable.class)) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        presentation.dispose();
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    presentation = presentation2;
                                }
                            } else {
                                z2 = z4 ? 1 : 0;
                                r24 = r12;
                                i = i3;
                            }
                        }
                        it = r24;
                        c13700js2 = c13700js;
                        c12015qq = c12015qq2;
                        z3 = z2;
                        r24 = r24;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r24 = it;
                }
            } catch (Throwable th11) {
                th = th11;
                r12 = it;
            }
        }
        ?? r123 = it;
        if (C7019kk.m27456k4((Iterator) r123, (Class<IDisposable>) IDisposable.class)) {
            r123.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m72030k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, C13700js c13700js, List<C14917zw> list, int i) {
        c13700js.f45566dy = this.f49447kk.getPrintFrameSlide();
        ShapeFrame shapeFrame = new ShapeFrame(0.0f, 0.0f, ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), (byte) 0, (byte) 0, 0.0f);
        C0962es c0962esM67873k4 = m67873k4((Background) m72040du().getBackground(), shapeFrame, abstractC14897zn, kg7Var);
        if (c0962esM67873k4 == null) {
            c0962esM67873k4 = new C0962es(C12003du.m56385i5().Clone());
        }
        abstractC14897zn.mo68794k4(shapeFrame.m2660k4().Clone(), (azo) null, c0962esM67873k4);
        if (m72040du().getHeaderFooterManager().isSlideNumberVisible() && m72038m9().size() > 1) {
            ((AutoShape) m72040du().m391k4((byte) 5)).getTextFrame().setText(C14057f9.m66591x1(i));
        }
        if (m67872k4() != null) {
            ((BaseSlide) m67872k4().getMasterHandoutSlideManager().getMasterHandoutSlide()).f1077kk.m2546bz().mo4131k4(abstractC14897zn, kg7Var, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
        }
        List.Enumerator<C14917zw> it = list.iterator();
        while (it.hasNext()) {
            try {
                AbstractC14897zn abstractC14897zn2 = abstractC14897zn;
                kg7 kg7Var2 = kg7Var;
                C13700js c13700js2 = c13700js;
                it.next().m74860k4(abstractC14897zn2, kg7Var2, c13700js2, this.f49447kk.getPrintFrameSlide(), this.f49447kk.getPrintSlideNumbers(), this.f49447kk.getPrintComments());
                abstractC14897zn = abstractC14897zn2;
                kg7Var = kg7Var2;
                c13700js = c13700js2;
            } finally {
            }
        }
        AbstractC14897zn abstractC14897zn3 = abstractC14897zn;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m67874k4(abstractC14897zn3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72031k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, C13700js c13700js, ISlide iSlide, int i) {
        AbstractC14897zn abstractC14897zn2;
        c13700js.f45566dy = false;
        ShapeFrame shapeFrame = new ShapeFrame(0.0f, 0.0f, ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), (byte) 0, (byte) 0, 0.0f);
        if (m72040du().getHeaderFooterManager().isSlideNumberVisible() && m72038m9().size() > 1) {
            ((AutoShape) m72040du().m391k4((byte) 5)).getTextFrame().setText(C14057f9.m66591x1(i));
        }
        if (m67872k4() != null) {
            abstractC14897zn2 = abstractC14897zn;
            ((Slide) iSlide).m2721x6().m69374k4(abstractC14897zn2, shapeFrame, kg7Var, c13700js, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
            ((BaseSlide) m67872k4().getMasterHandoutSlideManager().getMasterHandoutSlide()).f1077kk.m2546bz().mo4131k4(abstractC14897zn2, kg7Var, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
        } else {
            abstractC14897zn2 = abstractC14897zn;
        }
        m67874k4(abstractC14897zn2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72044k4(boolean z) {
        this.f49446du = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m72032k4(int[] iArr) {
        C12007ix[] c12007ixArrM72021c5 = m72021c5();
        C12015qq c12015qqClone = m72027k4(c12007ixArrM72021c5[0].m56570m9().Clone()).Clone();
        for (int i = 0; i < c12007ixArrM72021c5.length; i++) {
            c12007ixArrM72021c5[i] = new C12007ix(((c12007ixArrM72021c5[i].m56550c5() - c12015qqClone.m56699x1()) / 2.0f) + c12007ixArrM72021c5[i].m56557jd(), ((c12007ixArrM72021c5[i].m56575x1() - c12015qqClone.m56697kk()) / 2.0f) + c12007ixArrM72021c5[i].m56551ck(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
        }
        List list = new List();
        for (int i2 : iArr) {
            if (i2 >= 1 && i2 <= m67872k4().getSlides().size()) {
                int i3 = i2 - 1;
                Slide slide = (Slide) m67872k4().getSlides().get_Item(i3);
                if (slide != null && (!slide.getHidden() || m72047to())) {
                    list.addItem(Integer.valueOf(i3));
                }
            }
        }
        m72028k4(new List<>());
        List<C14917zw> list2 = new List<>();
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iM72041h4 = i4 % m72041h4();
            C14917zw c14917zw = new C14917zw();
            c14917zw.m74857k4(m67872k4().getSlides().get_Item(((Integer) list.get_Item(i4)).intValue()));
            c14917zw.m74859k4(c12007ixArrM72021c5[iM72041h4].Clone());
            if (iM72041h4 == 0 && i4 > 0) {
                m72038m9().addItem(list2);
                list2 = new List<>();
            }
            list2.addItem(c14917zw);
        }
        if (list2.size() > 0) {
            m72038m9().addItem(list2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72045k4(int[] iArr, C3982jd c3982jd, AbstractC3150x6 abstractC3150x6, TiffOptions tiffOptions, C3986m9 c3986m9, InterruptionToken interruptionToken) {
        int i;
        int iM27462to;
        C12015qq c12015qq;
        Presentation presentation;
        C12015qq c12015qq2 = new C12015qq((float) C12566m9.m58654x1(m72048x1().m56699x1(), 72.0d), (float) C12566m9.m58654x1(m72048x1().m56697kk(), 72.0d));
        m72032k4(iArr);
        List.Enumerator<List<C14917zw>> it = m72038m9().iterator();
        AbstractC12002ck abstractC12002ck = null;
        int i2 = 1;
        while (it.hasNext()) {
            try {
                List<C14917zw> next = it.next();
                interruptionToken.throwIfInterruptionRequested();
                if (tiffOptions.m3014k4().m56861k4()) {
                    i = 0;
                    iM27462to = C7019kk.m27462to(Double.valueOf(C12566m9.m58645k4(c12015qq2.m56699x1(), 96.0d) * ((double) ((tiffOptions.getDpiX() & 4294967295L) / 96.0f))), 14);
                } else {
                    iM27462to = tiffOptions.m3014k4().m56865x1();
                    i = 0;
                }
                C12023wl c12023wl = new C12023wl(iM27462to, !tiffOptions.m3014k4().m56861k4() ? tiffOptions.m3014k4().m56862kk() : C7019kk.m27462to(Double.valueOf(C12566m9.m58645k4(c12015qq2.m56697kk(), 96.0d) * ((double) ((tiffOptions.getDpiY() & 4294967295L) / 96.0f))), 14));
                int i3 = i2 + 1;
                C12009k4 c12009k4M72025k4 = m72025k4(c12023wl.Clone(), next, i2);
                c12009k4M72025k4.m56332k4(tiffOptions.getDpiX() & 4294967295L, tiffOptions.getDpiY() & 4294967295L);
                if ((tiffOptions.getCompressionType() == 2 || tiffOptions.getCompressionType() == 3) && tiffOptions.getBwConversionMode() != 0) {
                    c12009k4M72025k4 = C14143mt.m67713k4(c12009k4M72025k4, tiffOptions.getBwConversionMode());
                }
                if (c12009k4M72025k4 == null) {
                    i2 = i3;
                } else {
                    if (abstractC12002ck == null) {
                        c3986m9.m15744k4()[i] = new C3981h4(C3978du.f10789m9, 18L);
                        c12009k4M72025k4.m56334k4(abstractC3150x6, c3982jd, c3986m9);
                        c12015qq = c12015qq2;
                        abstractC12002ck = c12009k4M72025k4;
                    } else {
                        c12015qq = c12015qq2;
                        c3986m9.m15744k4()[i] = new C3981h4(C3978du.f10789m9, 23L);
                        abstractC12002ck.m56338k4(c12009k4M72025k4, c3986m9);
                    }
                    if (this.f49447kk.getPrintComments()) {
                        C12577yj<Integer, IComment[]> c12577yj = new C12577yj<>(Integer.class, IComment[].class);
                        List.Enumerator<C14917zw> it2 = next.iterator();
                        int i4 = i;
                        while (it2.hasNext()) {
                            try {
                                C14917zw next2 = it2.next();
                                IComment[] slideComments = next2.m74861x1().getSlideComments(null);
                                if (slideComments.length > 0) {
                                    i4 = 1;
                                }
                                c12577yj.addItem(Integer.valueOf(next2.m74861x1().getSlideNumber()), slideComments);
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                        }
                        if (i4 != 0) {
                            Presentation presentation2 = new Presentation();
                            try {
                                int i5 = i;
                                presentation2.getSlideSize().setSize(((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), i5);
                                presentation2.getSlides().removeAt(i5);
                                m72029k4(presentation2, c12577yj, i5, true);
                                IGenericEnumerator<ISlide> it3 = presentation2.getSlides().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        int i6 = i3 + 1;
                                        C12009k4 c12009k4M72026k4 = m72026k4(c12023wl.Clone(), (Slide) it3.next(), i3);
                                        presentation = presentation2;
                                        C12023wl c12023wl2 = c12023wl;
                                        try {
                                            c12009k4M72026k4.m56332k4(tiffOptions.getDpiX() & 4294967295L, tiffOptions.getDpiY() & 4294967295L);
                                            if (tiffOptions.getCompressionType() == 2 || tiffOptions.getCompressionType() == 3) {
                                                if (tiffOptions.getBwConversionMode() != 0) {
                                                    c12009k4M72026k4 = C14143mt.m67713k4(c12009k4M72026k4, tiffOptions.getBwConversionMode());
                                                }
                                            }
                                            if (c12009k4M72026k4 != null) {
                                                c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10789m9, 23L);
                                                abstractC12002ck.m56338k4(c12009k4M72026k4, c3986m9);
                                            }
                                            c12023wl = c12023wl2;
                                            i3 = i6;
                                            presentation2 = presentation;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                                it3.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        presentation = presentation2;
                                    }
                                }
                                presentation = presentation2;
                                try {
                                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                        it3.dispose();
                                    }
                                    presentation.dispose();
                                } catch (Throwable th3) {
                                    th = th3;
                                    presentation.dispose();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                presentation = presentation2;
                            }
                        }
                    }
                    i2 = i3;
                    c12015qq2 = c12015qq;
                }
            } catch (Throwable th5) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th5;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (abstractC12002ck != null) {
            c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10789m9, 20L);
            abstractC12002ck.m56335k4(c3986m9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4[] m72033k4(Presentation presentation, IRenderingOptions iRenderingOptions) {
        return m72034k4(presentation, iRenderingOptions, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4[] m72034k4(Presentation presentation, IRenderingOptions iRenderingOptions, float f, float f2) {
        boolean z;
        MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
        if (masterHandoutSlide == null) {
            masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
            z = true;
        } else {
            z = false;
        }
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        C12009k4[] c12009k4ArrM72036k4 = new C14660v1(masterHandoutSlide, (HandoutLayoutingOptions) iRenderingOptions.getSlidesLayoutOptions(), false).m72036k4(iArr, f, f2);
        if (z) {
            presentation.getMasterHandoutSlideManager().removeMasterHandoutSlide();
        }
        return c12009k4ArrM72036k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4[] m72035k4(Presentation presentation, IRenderingOptions iRenderingOptions, C12023wl c12023wl) {
        boolean z;
        MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
        if (masterHandoutSlide == null) {
            masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
            z = true;
        } else {
            z = false;
        }
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        C12009k4[] c12009k4ArrM72037k4 = new C14660v1(masterHandoutSlide, (HandoutLayoutingOptions) iRenderingOptions.getSlidesLayoutOptions(), false).m72037k4(iArr, c12023wl.Clone());
        if (z) {
            presentation.getMasterHandoutSlideManager().removeMasterHandoutSlide();
        }
        return c12009k4ArrM72037k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4[] m72036k4(int[] iArr, float f, float f2) {
        return m72037k4(iArr, new C12023wl(C7019kk.m27462to(Float.valueOf(m72048x1().m56699x1() * f), 13), C7019kk.m27462to(Float.valueOf(m72048x1().m56697kk() * f2), 13)).Clone());
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    private C12009k4[] m72037k4(int[] iArr, C12023wl c12023wl) {
        List list = new List();
        C12023wl c12023wlClone = c12023wl.Clone();
        InterruptionToken interruptionToken = (InterruptionToken) m67872k4().m2349du().getInterruptionToken();
        C14258ow c14258owM2395wl = m67872k4().m2395wl();
        try {
            m72032k4(iArr);
            List.Enumerator<List<C14917zw>> it = m72038m9().iterator();
            int i = 1;
            while (it.hasNext()) {
                try {
                    List<C14917zw> next = it.next();
                    interruptionToken.throwIfInterruptionRequested();
                    int i2 = i + 1;
                    list.addItem(m72025k4(c12023wlClone.Clone(), next, i));
                    if (this.f49447kk.getPrintComments()) {
                        C12577yj<Integer, IComment[]> c12577yj = new C12577yj<>(Integer.class, IComment[].class);
                        List.Enumerator<C14917zw> it2 = next.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            try {
                                C14917zw next2 = it2.next();
                                IComment[] slideComments = next2.m74861x1().getSlideComments(null);
                                if (slideComments.length > 0) {
                                    z = true;
                                }
                                c12577yj.addItem(Integer.valueOf(next2.m74861x1().getSlideNumber()), slideComments);
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        if (z) {
                            Presentation presentation = new Presentation();
                            try {
                                presentation.getSlideSize().setSize(((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), 0);
                                presentation.getSlides().removeAt(0);
                                m72029k4(presentation, c12577yj, 0, true);
                                IGenericEnumerator<ISlide> it3 = presentation.getSlides().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        int i3 = i2 + 1;
                                        list.addItem(m72026k4(c12023wlClone.Clone(), (Slide) it3.next(), i2));
                                        i2 = i3;
                                    } finally {
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                            } finally {
                                presentation.dispose();
                            }
                        } else {
                            continue;
                        }
                    }
                    i = i2;
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            return (C12009k4[]) list.toArray(new C12009k4[0]);
        } finally {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
        }
    }
}
