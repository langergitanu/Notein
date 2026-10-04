package com.aspose.slides;

import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p258lv.C6231ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p416tb.C10909qq;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.cq */
/* JADX INFO: loaded from: classes3.dex */
class C0866cq {

    /* JADX INFO: renamed from: c5 */
    private float f4406c5;

    /* JADX INFO: renamed from: ck */
    private INotesCommentsLayoutingOptions f4407ck;

    /* JADX INFO: renamed from: du */
    private IFontData f4408du;

    /* JADX INFO: renamed from: dy */
    private float f4409dy;

    /* JADX INFO: renamed from: fa */
    private List<Integer> f4410fa;

    /* JADX INFO: renamed from: h4 */
    private List<ISlide> f4411h4;

    /* JADX INFO: renamed from: jd */
    private float f4412jd;

    /* JADX INFO: renamed from: k4 */
    private final Presentation f4413k4;

    /* JADX INFO: renamed from: kk */
    private float f4414kk;

    /* JADX INFO: renamed from: ks */
    private final Object f4415ks;

    /* JADX INFO: renamed from: m9 */
    private final List<ISlide> f4416m9;

    /* JADX INFO: renamed from: to */
    private ITextFrame f4417to;

    /* JADX INFO: renamed from: up */
    private Dictionary<ISlide, Integer> f4418up;

    /* JADX INFO: renamed from: x1 */
    private float f4419x1;

    /* JADX INFO: renamed from: yj */
    private String f4420yj;

    private C0866cq(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions) {
        Presentation presentation2;
        this.f4416m9 = new List<>();
        this.f4409dy = 10.0f;
        this.f4406c5 = 25.0f;
        this.f4412jd = 6.0f;
        this.f4418up = new Dictionary<>();
        this.f4420yj = C14113y2.f47374k4;
        this.f4415ks = new Object();
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.f4410fa = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr)));
        this.f4407ck = iNotesCommentsLayoutingOptions == null ? new NotesCommentsLayoutingOptions() : iNotesCommentsLayoutingOptions;
        if (!m4783kk() && !m4785to()) {
            this.f4413k4 = presentation;
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            synchronized (this.f4415ks) {
                presentation.m2363k4(c3152yj, 3);
                c3152yj.seek(0L, 0);
                presentation2 = new Presentation(c3152yj, m4751k4(presentation.m2349du(), presentation.getProtectionManager().isEncrypted()));
                this.f4413k4 = presentation2;
                presentation2.getFontsManager().setFontSubstRuleList(presentation.getFontsManager().getFontSubstRuleList());
            }
            c3152yj.dispose();
            this.f4411h4 = new List<>(AbstractC14092to.m67204k4((Object[]) presentation2.getSlides().toArray()));
            this.f4408du = presentation2.getMasterTheme().getFontScheme().getMinor().getLatinFont();
            while (i < this.f4413k4.getSlides().size()) {
                int i4 = i + 1;
                if (this.f4410fa.containsItem(Integer.valueOf(i4))) {
                    this.f4418up.addItem(this.f4413k4.getSlides().get_Item(i), Integer.valueOf(this.f4413k4.getSlides().get_Item(i).getSlideNumber()));
                }
                i = i4;
            }
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m4745c5() {
        List list = new List();
        if (this.f4413k4.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
            IGenericEnumerator<IShape> it = this.f4413k4.getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();
            while (it.hasNext()) {
                try {
                    IShape next = it.next();
                    if (next.getPlaceholder() == null) {
                        list.addItem(next);
                    } else if (next.getPlaceholder().getType() == 6) {
                        this.f4419x1 = next.getY();
                    } else if (next.getPlaceholder().getType() == 7) {
                        this.f4414kk = next.getY() + next.getHeight();
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
        }
        if (this.f4419x1 == 0.0f) {
            this.f4419x1 = ((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56697kk() - 20.0f;
        }
        if (this.f4414kk == 0.0f) {
            this.f4414kk = 20.0f;
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                IShape iShape = (IShape) it2.next();
                if (iShape.getY() + iShape.getHeight() > ((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56697kk() / 2.0f) {
                    if (iShape.getY() > 0.0f && iShape.getY() < this.f4419x1) {
                        this.f4419x1 = iShape.getY();
                    }
                } else if (iShape.getY() + iShape.getHeight() > this.f4414kk) {
                    this.f4414kk = iShape.getY() + iShape.getHeight();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    private boolean m4746du() {
        return this.f4407ck.getCommentsPosition() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        r10.f4420yj = r3.getName();
     */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m4747dy() {
        IGenericEnumerator<IShape> it;
        IAutoShape iAutoShape;
        if (m4783kk() || m4785to()) {
            m4745c5();
            if (m4746du()) {
                if (m4783kk()) {
                    ((NotesSize) this.f4413k4.getNotesSize()).m2031k4(new C12015qq(((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56699x1() + this.f4407ck.getCommentsAreaWidth(), ((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56697kk()));
                } else {
                    this.f4413k4.getSlideSize().setSize(((SlideSize) this.f4413k4.getSlideSize()).m2755k4().m56699x1() + this.f4407ck.getCommentsAreaWidth(), ((SlideSize) this.f4413k4.getSlideSize()).m2755k4().m56697kk(), 0);
                }
            }
            if (this.f4413k4.getMasterNotesSlideManager() != null && this.f4413k4.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
                it = this.f4413k4.getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();
                while (true) {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        IShape next = it.next();
                        if (m4777k4(next, (byte) 5)) {
                            break;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
            List list = new List();
            int i = 0;
            while (i < this.f4413k4.getSlides().size()) {
                new C6765kp();
                ISlide iSlide = this.f4413k4.getSlides().get_Item(i);
                if (m4785to()) {
                    m4787x1(iSlide);
                }
                if (this.f4411h4.containsItem(iSlide)) {
                    if (m4783kk()) {
                        if (iSlide.getNotesSlideManager().getNotesSlide() == null) {
                            iSlide.getNotesSlideManager().addNotesSlide();
                        }
                        IGenericEnumerator<IShape> it2 = iSlide.getNotesSlideManager().getNotesSlide().getShapes().iterator();
                        while (true) {
                            try {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                IShape next2 = it2.next();
                                if (next2.getPlaceholder() != null && next2.getPlaceholder().getType() == 1 && (iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) next2, IAutoShape.class)) != null) {
                                    if (((ShapeFrame) iAutoShape.getFrame()).m2660k4().m56568kk()) {
                                        iAutoShape.setHeight(this.f4419x1 - this.f4414kk);
                                        iAutoShape.setWidth(((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56699x1() - 40.0f);
                                        iAutoShape.setY(this.f4414kk);
                                        iAutoShape.setX(20.0f);
                                    }
                                    ITextFrame textFrame = iAutoShape.getTextFrame();
                                    this.f4417to = textFrame;
                                    if (textFrame != null) {
                                        m4761k4(textFrame, 12.0f);
                                        if (m4790x1() && this.f4417to.getParagraphs().getCount() > 0) {
                                            while (this.f4417to.getParagraphs().getCount() > 1) {
                                                this.f4417to.getParagraphs().removeAt(this.f4417to.getParagraphs().getCount() - 1);
                                            }
                                            if (this.f4417to.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
                                                while (this.f4417to.getParagraphs().get_Item(0).getPortions().getCount() > 1) {
                                                    this.f4417to.getParagraphs().get_Item(0).getPortions().removeAt(this.f4417to.getParagraphs().get_Item(0).getPortions().getCount() - 1);
                                                }
                                            }
                                        }
                                        m4760k4(this.f4417to);
                                        int[] iArr = {i};
                                        m4758k4(iSlide, iArr);
                                        i = iArr[0];
                                        list.addItem(iSlide);
                                    }
                                }
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
                    if (m4748h4()) {
                        int[] iArr2 = {i};
                        m4759k4(iSlide, iArr2, 0, true);
                        i = iArr2[0];
                    }
                }
                i++;
            }
            List.Enumerator it3 = list.iterator();
            while (it3.hasNext()) {
                try {
                    this.f4413k4.getSlides().remove((ISlide) it3.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
            }
            if (m4746du()) {
                it = this.f4413k4.getSlides().iterator();
                while (it.hasNext()) {
                    try {
                        m4757k4(it.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m4748h4() {
        return this.f4407ck.getCommentsPosition() == 1;
    }

    /* JADX INFO: renamed from: k4 */
    private IBaseSlide m4749k4(ISlide iSlide, C12015qq[] c12015qqArr, int[] iArr) {
        IBaseSlide iBaseSlideInsertEmptySlide;
        C12015qq c12015qqM2755k4;
        C12015qq c12015qq;
        if (m4783kk()) {
            ISlideCollection slides = this.f4413k4.getSlides();
            int i = iArr[0] + 1;
            iArr[0] = i;
            ISlide iSlideInsertClone = slides.insertClone(i, iSlide);
            INotesSlide notesSlide = iSlideInsertClone.getNotesSlideManager().getNotesSlide();
            INotesSlideManager notesSlideManager = iSlideInsertClone.getNotesSlideManager();
            iBaseSlideInsertEmptySlide = notesSlide == null ? notesSlideManager.addNotesSlide() : notesSlideManager.getNotesSlide();
            c12015qqM2755k4 = ((NotesSize) this.f4413k4.getNotesSize()).m2030k4();
            c12015qq = c12015qqArr[0];
        } else {
            LayoutSlide layoutSlide = new LayoutSlide(((MasterSlideCollection) this.f4413k4.getMasters()).m1946k4(), (byte) 11);
            ISlideCollection slides2 = this.f4413k4.getSlides();
            int i2 = iArr[0] + 1;
            iArr[0] = i2;
            iBaseSlideInsertEmptySlide = slides2.insertEmptySlide(i2, layoutSlide);
            c12015qqM2755k4 = ((SlideSize) this.f4413k4.getSlideSize()).m2755k4();
            c12015qq = c12015qqArr[0];
        }
        c12015qqM2755k4.CloneTo(c12015qq);
        iBaseSlideInsertEmptySlide.getShapes().clear();
        return iBaseSlideInsertEmptySlide;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m4783kk() {
        return this.f4407ck.getNotesPosition() != 0;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m4784m9() {
        return this.f4407ck.getNotesPosition() == 2;
    }

    /* JADX INFO: renamed from: to */
    private boolean m4785to() {
        return this.f4407ck.getCommentsPosition() != 0;
    }

    /* JADX INFO: renamed from: x1 */
    private ITable m4786x1(IBaseSlide iBaseSlide) {
        ITable iTableAddTable = iBaseSlide.getShapes().addTable(((m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).m56699x1() - this.f4407ck.getCommentsAreaWidth()) + 5.0f, 5.0f, new double[]{this.f4406c5, (this.f4407ck.getCommentsAreaWidth() - 10) - this.f4406c5}, new double[]{1.0d});
        iTableAddTable.setStylePreset(3);
        if (this.f4408du != null) {
            iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f4408du);
        }
        iTableAddTable.get_Item(0, 0).setMarginLeft(0.0d);
        iTableAddTable.get_Item(0, 0).setMarginRight(0.0d);
        iTableAddTable.get_Item(1, 0).setMarginLeft(0.0d);
        iTableAddTable.get_Item(1, 0).setMarginRight(0.0d);
        iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
        iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0f);
        iTableAddTable.get_Item(1, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iTableAddTable.get_Item(1, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
        iTableAddTable.get_Item(1, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0f);
        return iTableAddTable;
    }

    private C0866cq(Presentation presentation, int[] iArr, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions) {
        int i;
        this.f4416m9 = new List<>();
        this.f4409dy = 10.0f;
        this.f4406c5 = 25.0f;
        this.f4412jd = 6.0f;
        this.f4418up = new Dictionary<>();
        this.f4420yj = C14113y2.f47374k4;
        Object obj = new Object();
        this.f4415ks = obj;
        this.f4407ck = iNotesCommentsLayoutingOptions == null ? new NotesCommentsLayoutingOptions() : iNotesCommentsLayoutingOptions;
        this.f4410fa = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr)));
        if (!m4783kk() && !m4785to()) {
            this.f4413k4 = presentation;
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            synchronized (obj) {
                presentation.m2363k4(c3152yj, 3);
                i = 0;
                c3152yj.seek(0L, 0);
                Presentation presentation2 = new Presentation(c3152yj, m4751k4(presentation.m2349du(), presentation.getProtectionManager().isEncrypted()));
                this.f4413k4 = presentation2;
                presentation2.getFontsManager().setFontSubstRuleList(presentation.getFontsManager().getFontSubstRuleList());
            }
            c3152yj.dispose();
            List list = new List();
            int i2 = 0;
            while (i2 < this.f4413k4.getSlides().size()) {
                int i3 = i2 + 1;
                if (this.f4410fa.containsItem(Integer.valueOf(i3))) {
                    list.addItem(this.f4413k4.getSlides().get_Item(i2));
                    this.f4418up.addItem(this.f4413k4.getSlides().get_Item(i2), Integer.valueOf(this.f4413k4.getSlides().get_Item(i2).getSlideNumber()));
                }
                i2 = i3;
            }
            int i4 = 0;
            while (i4 < this.f4413k4.getSlides().size()) {
                if (!list.containsItem(this.f4413k4.getSlides().get_Item(i4))) {
                    this.f4413k4.getSlides().remove(this.f4413k4.getSlides().get_Item(i4));
                    i4--;
                }
                i4++;
            }
            this.f4411h4 = new List<>(AbstractC14092to.m67204k4((Object[]) this.f4413k4.getSlides().toArray()));
            this.f4410fa.clear();
            while (i < iArr.length) {
                i++;
                this.f4410fa.addItem(Integer.valueOf(i));
            }
            this.f4408du = this.f4413k4.getMasterTheme().getFontScheme().getMinor().getLatinFont();
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private ITable m4750k4(IBaseSlide iBaseSlide) {
        ITable iTableAddTable = iBaseSlide.getShapes().addTable(75.0f, 50.0f, new double[]{75.0d, (m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).m56699x1() - 225.0f}, new double[]{1.0d, 1.0d});
        iTableAddTable.mergeCells(iTableAddTable.get_Item(0, 0), iTableAddTable.get_Item(1, 0), false);
        iTableAddTable.setStylePreset(3);
        if (this.f4408du != null) {
            iTableAddTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f4408du);
            iTableAddTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f4408du);
            iTableAddTable.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.f4408du);
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

    /* JADX INFO: renamed from: x1 */
    private void m4787x1(ISlide iSlide) {
        for (IComment iComment : iSlide.getSlideComments(null)) {
            if (this.f4407ck.getShowCommentsByNoAuthor() || !"n/a".equals(iComment.getAuthor().getInitials())) {
                String initials = iComment.getAuthor().getInitials();
                if ("n/a".equals(initials)) {
                    initials = "";
                }
                Comment comment = (Comment) iComment;
                IAutoShape iAutoShapeAddAutoShape = iSlide.getShapes().addAutoShape(5, comment.m1169x1().m56897x1(), comment.m1169x1().m56895kk(), 50.0f, 20.0f);
                ITextFrame iTextFrameAddTextFrame = iAutoShapeAddAutoShape.addTextFrame(C14113y2.m67408k4(initials, C14114y9.m67465x1(comment.m1168to().m7379k4())));
                ((TextFrameFormat) iTextFrameAddTextFrame.getTextFrameFormat()).m2953k4(xmh.f50156k4.Clone());
                iTextFrameAddTextFrame.getTextFrameFormat().setAutofitType((byte) 2);
                iTextFrameAddTextFrame.getTextFrameFormat().setWrapText((byte) 0);
                iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
                ((ColorFormat) iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
                iAutoShapeAddAutoShape.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) iAutoShapeAddAutoShape.getFillFormat().getSolidFillColor()).m1080k4(m4789k4(iComment).Clone());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private LoadOptions m4751k4(LoadOptions loadOptions, boolean z) {
        LoadOptions loadOptions2 = new LoadOptions(3);
        loadOptions2.setDefaultAsianFont(loadOptions.getDefaultAsianFont());
        loadOptions2.setDefaultRegularFont(loadOptions.getDefaultRegularFont());
        loadOptions2.setDefaultSymbolFont(loadOptions.getDefaultSymbolFont());
        loadOptions2.setDocumentLevelFontSources(loadOptions.getDocumentLevelFontSources());
        loadOptions2.m1920k4(loadOptions.m1919k4());
        loadOptions2.setResourceLoadingCallback(loadOptions.getResourceLoadingCallback());
        if (z) {
            loadOptions2.setPassword(loadOptions.getPassword());
        }
        return loadOptions2;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m4790x1() {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) this.f4413k4.m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        C14113y2.m67403k4(" ", strArr[0]);
        return ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1) || Arrays.equals(iArrM2334k4, r1s.f48531x1)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private Portion m4752k4(String str) {
        Portion portion = new Portion();
        portion.getPortionFormat().setFontHeight(8.0f);
        portion.getPortionFormat().setLatinFont(this.f4408du);
        portion.getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) portion.getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
        portion.setText(str);
        return portion;
    }

    /* JADX INFO: renamed from: k4 */
    public final Presentation m4788k4() {
        return this.f4413k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m4789k4(IComment iComment) {
        switch ((int) (((((CommentAuthor) iComment.getAuthor()).m1174to() & 4294967295L) % 9) & 4294967295L)) {
            case 1:
                return C12003du.m56465vw();
            case 2:
                return C12003du.m56491yn();
            case 3:
                return C12003du.m56493yw();
            case 4:
                return C12003du.m56372ei();
            case 5:
                return C12003du.m56349b1();
            case 6:
                return C12003du.m56418na();
            case 7:
                return C12003du.m56491yn();
            case 8:
                return C12003du.m56415my();
            default:
                return C12003du.m56387ii();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4753k4(IAutoShape iAutoShape, IParagraph iParagraph, IParagraph iParagraph2, float f, float f2) {
        while (iAutoShape.getHeight() + iAutoShape.getY() > f && iParagraph.getPortions().getCount() > 0) {
            IPortion iPortion = iParagraph.getPortions().get_Item(iParagraph.getPortions().getCount() - 1);
            iParagraph.getPortions().remove(iPortion);
            iParagraph2.getPortions().insert(0, iPortion);
        }
        if (iAutoShape.getHeight() + iAutoShape.getY() < f) {
            Portion portion = new Portion((Portion) iParagraph2.getPortions().get_Item(0));
            portion.setText("");
            iParagraph.getPortions().add(portion);
            m4754k4(iAutoShape, portion, iParagraph2.getPortions().get_Item(0).getText(), 0, iParagraph2.getPortions().get_Item(0).getText().length(), f, f2);
            iParagraph2.getPortions().get_Item(0).setText(C14113y2.m67422kk(iParagraph2.getPortions().get_Item(0).getText(), portion.getText().length() + 1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4754k4(IAutoShape iAutoShape, IPortion iPortion, String str, int i, int i2, float f, float f2) {
        int iM67430to;
        int i3;
        C0866cq c0866cq;
        IAutoShape iAutoShape2;
        IPortion iPortion2;
        String str2;
        int i4;
        float f3;
        float f4;
        int iM67378k4 = C14113y2.m67378k4(str, " ", C21034OooOOOo.OooO00o(i2, i, 2, i));
        if (iM67378k4 < 0) {
            return;
        }
        iPortion.setText(C14113y2.m67443x1(str, 0, iM67378k4));
        if (iAutoShape.getHeight() + iAutoShape.getY() >= f) {
            if (i2 == iM67378k4) {
                do {
                    iM67430to = C14113y2.m67430to(iPortion.getText(), " ");
                    if (iM67430to < 0) {
                        return;
                    }
                    iPortion.setText(C14113y2.m67443x1(iPortion.getText(), 0, iM67430to));
                } while (iAutoShape.getHeight() + iAutoShape.getY() > f);
            } else {
                iM67430to = iM67378k4;
            }
            i3 = i;
            c0866cq = this;
            iAutoShape2 = iAutoShape;
            iPortion2 = iPortion;
            str2 = str;
            i4 = iM67430to;
            f3 = f;
            f4 = f2;
        } else {
            if (i == iM67378k4) {
                return;
            }
            i3 = iM67378k4;
            iAutoShape2 = iAutoShape;
            iPortion2 = iPortion;
            str2 = str;
            i4 = i2;
            f3 = f;
            f4 = f2;
            c0866cq = this;
        }
        c0866cq.m4754k4(iAutoShape2, iPortion2, str2, i3, i4, f3, f4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m4755k4(IAutoShape iAutoShape, ITextFrame iTextFrame, float f, float f2) {
        if (C14113y2.m67411k4(iTextFrame.getText())) {
            iTextFrame.getParagraphs().remove(iTextFrame.getParagraphs().get_Item(0));
            return;
        }
        float height = iAutoShape.getHeight();
        float y = iAutoShape.getY();
        ITextFrame textFrame = iAutoShape.getTextFrame();
        textFrame.getParagraphs().clear();
        textFrame.getTextFrameFormat().setAutofitType((byte) 2);
        iAutoShape.setHeight(0.0f);
        while (iAutoShape.getHeight() + y < f && iTextFrame.getParagraphs().getCount() > 0) {
            IParagraph iParagraph = iTextFrame.getParagraphs().get_Item(0);
            iTextFrame.getParagraphs().remove(iParagraph);
            textFrame.getParagraphs().add(iParagraph);
            iAutoShape.setWidth(f2);
        }
        if (iAutoShape.getHeight() + y <= f) {
            if (iAutoShape.getLineFormat().isFormatNotDefined() || y + height >= this.f4419x1) {
                return;
            }
            textFrame.getTextFrameFormat().setAutofitType((byte) -1);
            iAutoShape.setHeight(height);
            return;
        }
        if (textFrame.getParagraphs().getCount() == 0) {
            iTextFrame.getParagraphs().clear();
            return;
        }
        Paragraph paragraph = new Paragraph((Paragraph) textFrame.getParagraphs().get_Item(0));
        paragraph.getPortions().clear();
        iTextFrame.getParagraphs().insert(0, paragraph);
        m4753k4(iAutoShape, textFrame.getParagraphs().get_Item(textFrame.getParagraphs().getCount() - 1), paragraph, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m4756k4(IBaseSlide iBaseSlide, float f, float f2, boolean z) {
        IAutoShape iAutoShapeAddAutoShape = iBaseSlide.getShapes().addAutoShape(26, f, f2, 30.0f, 15.0f);
        iAutoShapeAddAutoShape.addTextFrame("...");
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setMarginBottom(10.0f);
        if (z) {
            iAutoShapeAddAutoShape.getFillFormat().setFillType((byte) 1);
            ((ColorFormat) iAutoShapeAddAutoShape.getFillFormat().getSolidFillColor()).m1080k4(((NotesCommentsLayoutingOptions) this.f4407ck).m2026k4().Clone());
        } else {
            iAutoShapeAddAutoShape.setUseBackgroundFill(true);
        }
        iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) iAutoShapeAddAutoShape.getShapeStyle().getLineColor()).m1080k4(C12003du.m56393jw().Clone());
        iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(12.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m4757k4(ISlide iSlide) {
        boolean z;
        IPortion iPortion;
        String text;
        INotesSlide notesSlide = m4783kk() ? iSlide.getNotesSlideManager().getNotesSlide() : iSlide;
        if (notesSlide == null) {
            notesSlide = iSlide.getNotesSlideManager().addNotesSlide();
            z = true;
        } else {
            z = false;
        }
        C12015qq c12015qqClone = (m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).Clone();
        AutoShape autoShape = (AutoShape) notesSlide.getShapes().addAutoShape(5, c12015qqClone.m56699x1() - this.f4407ck.getCommentsAreaWidth(), 0.0f, this.f4407ck.getCommentsAreaWidth(), c12015qqClone.m56697kk());
        autoShape.getFillFormat().setFillType((byte) 1);
        ((ColorFormat) autoShape.getFillFormat().getSolidFillColor()).m1080k4(((NotesCommentsLayoutingOptions) this.f4407ck).m2026k4().Clone());
        IComment[] slideComments = iSlide.getSlideComments(null);
        if (slideComments.length == 0) {
            return;
        }
        if (this.f4416m9.containsItem(iSlide) || z || !m4783kk()) {
            ITable iTableM4786x1 = m4786x1(notesSlide);
            float fM56697kk = c12015qqClone.m56697kk() - this.f4409dy;
            float length = (fM56697kk / slideComments.length) - 10.0f;
            if (length < 10.0f) {
                length = 10.0f;
            }
            int iM27462to = C7019kk.m27462to(Float.valueOf(((this.f4407ck.getCommentsAreaWidth() - this.f4406c5) / this.f4412jd) * (length / 10.0f)), 13);
            int i = 0;
            for (int i2 = 0; i2 < slideComments.length; i2++) {
                if (this.f4407ck.getShowCommentsByNoAuthor() || !"n/a".equals(slideComments[i2].getAuthor().getInitials())) {
                    iTableM4786x1.getRows().addClone(iTableM4786x1.getRows().get_Item(i), false);
                    iTableM4786x1.get_Item(0, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67408k4(slideComments[i2].getAuthor().getInitials(), C14114y9.m67465x1(((Comment) slideComments[i2]).m1168to().m7379k4())));
                    if (slideComments[i2].getText().length() > iM27462to) {
                        iPortion = iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0);
                        text = C14113y2.m67408k4(C14113y2.m67394k4(slideComments[i2].getText(), iM27462to), "...");
                    } else {
                        iPortion = iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0);
                        text = slideComments[i2].getText();
                    }
                    iPortion.setText(text);
                    Portion portionM4752k4 = m4752k4(C14113y2.m67407k4(IOUtils.LINE_SEPARATOR_UNIX, slideComments[i2].getAuthor().getName(), "; ", ((Comment) slideComments[i2]).m1163k4()));
                    iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().add(portionM4752k4);
                    if (iTableM4786x1.getHeight() > fM56697kk) {
                        iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().remove(portionM4752k4);
                        while (iTableM4786x1.getHeight() > fM56697kk) {
                            int iM67418kk = C14113y2.m67418kk(iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), ControlChar.SPACE_CHAR);
                            if (iM67418kk < 0) {
                                iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText("");
                                iTableM4786x1.get_Item(0, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText("...");
                                return;
                            }
                            iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67408k4(C14113y2.m67440x1(C14113y2.m67394k4(iTableM4786x1.get_Item(1, i).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), iM67418kk)), "..."));
                        }
                        m4756k4((IBaseSlide) notesSlide, (iTableM4786x1.getWidth() + iTableM4786x1.getX()) - 40.0f, (iTableM4786x1.getHeight() + iTableM4786x1.getY()) - 10.0f, true);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m4758k4(ISlide iSlide, int[] iArr) {
        int slideNumber = iSlide.getSlideNumber();
        if (this.f4418up.containsKey(iSlide)) {
            slideNumber = this.f4418up.get_Item(iSlide).intValue();
        }
        IGenericEnumerator<IParagraph> it = this.f4417to.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                Paragraph paragraph = (Paragraph) it.next();
                if (paragraph.getEndParagraphPortionFormat() != null) {
                    PortionFormat portionFormat = (PortionFormat) paragraph.getEndParagraphPortionFormat();
                    Portion portion = new Portion();
                    portion.f3052x1 = portionFormat;
                    paragraph.getPortions().add(portion);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        float f = 0.0f;
        Object[] objArr = true;
        IAutoShape iAutoShape = null;
        ISlide iSlideInsertClone = null;
        while (this.f4417to.getParagraphs().getCount() > 0) {
            if (!m4784m9() || objArr != false) {
                if (objArr != true && C14113y2.m67411k4(this.f4417to.getText())) {
                    return;
                }
                ISlideCollection slides = this.f4413k4.getSlides();
                int i = iArr[0] + 1;
                iArr[0] = i;
                iSlideInsertClone = slides.insertClone(i, iSlide);
                if (objArr != false) {
                    this.f4416m9.addItem(iSlideInsertClone);
                }
                int i2 = 0;
                iAutoShape = null;
                while (i2 < iSlideInsertClone.getNotesSlideManager().getNotesSlide().getShapes().size()) {
                    IShape iShape = iSlideInsertClone.getNotesSlideManager().getNotesSlide().getShapes().get_Item(i2);
                    if (m4777k4(iShape, (byte) 1)) {
                        IShape iShape2 = iSlideInsertClone.getNotesSlideManager().getNotesSlide().getShapes().get_Item(i2);
                        iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) iShape2, IAutoShape.class);
                        float width = iAutoShape.getWidth();
                        if (objArr == false) {
                            iShape2.setY(this.f4414kk);
                        }
                        f = width;
                    } else if (m4777k4(iShape, (byte) 14)) {
                        if (objArr != true) {
                            iSlideInsertClone.getNotesSlideManager().getNotesSlide().getShapes().removeAt(i2);
                            i2--;
                        } else if (this.f4418up.containsKey(iSlide)) {
                            ((Slide) iSlideInsertClone).m2717x1(this.f4418up.get_Item(iSlide).intValue());
                        }
                    } else if ((C14113y2.m67363du(iShape.getName(), this.f4420yj) && !C14113y2.m67411k4(this.f4420yj)) || (m4777k4(iShape, (byte) 5) && this.f4418up.containsKey(iSlide))) {
                        AutoShape autoShape = (AutoShape) iSlideInsertClone.getNotesSlideManager().getNotesSlide().getShapes().addAutoShape(5, iShape.getX(), iShape.getY(), iShape.getWidth(), iShape.getHeight());
                        autoShape.getFillFormat().setFillType((byte) 0);
                        autoShape.getLineFormat().setWidth(0.0d);
                        autoShape.getLineFormat().getFillFormat().setFillType((byte) 0);
                        ITextFrame iTextFrameAddTextFrame = autoShape.addTextFrame(C14057f9.m66591x1(slideNumber));
                        iTextFrameAddTextFrame.getTextFrameFormat().setAnchoringType((byte) 2);
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getParagraphFormat().setAlignment(2);
                        AutoShape autoShape2 = (AutoShape) iShape;
                        if (autoShape2.getTextFrame().getParagraphs().get_Item(0).getPortions().getCount() == 0) {
                            autoShape2.getTextFrame().getParagraphs().get_Item(0).getPortions().add(new Portion(""));
                        }
                        lrb lrbVarM2305bv = ((PortionFormat) autoShape2.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat()).m2305bv();
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(lrbVarM2305bv.m4837m9());
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold(lrbVarM2305bv.getFontBold() ? (byte) 1 : (byte) 0);
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontItalic(lrbVarM2305bv.getFontItalic() ? (byte) 1 : (byte) 0);
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
                        ((ColorFormat) iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(((C14176nc) lrbVarM2305bv.getFillFormat()).m67938m9().Clone());
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(lrbVarM2305bv.getLatinFont());
                        iShape.setHidden(true);
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14057f9.m66591x1(slideNumber));
                    }
                    i2++;
                }
                if (iAutoShape != null && iAutoShape.getTextFrame() != null) {
                    m4755k4(iAutoShape, this.f4417to, this.f4419x1, f);
                }
                objArr = false;
            } else {
                if (iAutoShape.getTextFrame() != null) {
                    float height = iAutoShape.getHeight();
                    while (C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(height - iAutoShape.getHeight())), 13) == 0 && iAutoShape.getTextFrame().getParagraphs().get_Item(iAutoShape.getTextFrame().getParagraphs().getCount() - 1).getPortions().getCount() > 0) {
                        IParagraph iParagraph = iAutoShape.getTextFrame().getParagraphs().get_Item(iAutoShape.getTextFrame().getParagraphs().getCount() - 1);
                        IPortion iPortion = iParagraph.getPortions().get_Item(iParagraph.getPortions().getCount() - 1);
                        int iM67430to = C14113y2.m67430to(iPortion.getText(), " ");
                        if (iM67430to >= 0) {
                            iPortion.setText(C14113y2.m67408k4(C14113y2.m67440x1(C14113y2.m67394k4(iPortion.getText(), iM67430to)), "..."));
                        } else {
                            iParagraph.getPortions().remove(iPortion);
                            if (iParagraph.getPortions().getCount() == 0) {
                                iAutoShape.getTextFrame().getParagraphs().remove(iParagraph);
                            }
                        }
                    }
                }
                m4756k4((IBaseSlide) iSlideInsertClone.getNotesSlideManager().getNotesSlide(), iAutoShape.getX() + 8.0f, iAutoShape.getHeight() + iAutoShape.getY() + 4.0f, false);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v36, types: [com.aspose.slides.IParagraphCollection] */
    /* JADX WARN: Type inference failed for: r12v38, types: [com.aspose.slides.IPortionCollection] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.aspose.slides.IRowCollection] */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.aspose.slides.IParagraphCollection] */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.aspose.slides.IPortionCollection] */
    /* JADX WARN: Type inference failed for: r13v16, types: [com.aspose.slides.IParagraphCollection] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.aspose.slides.IParagraphCollection] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.aspose.slides.IRowCollection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.aspose.slides.IShape, com.aspose.slides.ITable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX INFO: renamed from: k4 */
    private void m4759k4(ISlide iSlide, int[] iArr, int i, boolean z) {
        ?? r15;
        IComment[] iCommentArr;
        boolean z2;
        String text;
        String text2;
        int iM67429to;
        IComment[] slideComments = iSlide.getSlideComments(null);
        if (slideComments.length == 0) {
            return;
        }
        C12015qq c12015qq = new C12015qq();
        C12015qq[] c12015qqArr = {c12015qq};
        IBaseSlide iBaseSlideM4749k4 = m4749k4(iSlide, c12015qqArr, iArr);
        ?? r7 = 0;
        c12015qqArr[0].CloneTo(c12015qq);
        ?? M4750k4 = m4750k4(iBaseSlideM4749k4);
        float fM56697kk = c12015qq.m56697kk() - 100.0f;
        int i2 = 1;
        M4750k4.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67408k4("Slide ", C14057f9.m66591x1(this.f4411h4.indexOf(iSlide) + 1), i == 0 ? "" : " (continue)"));
        int i3 = i;
        boolean z3 = z;
        int i4 = 1;
        while (true) {
            if (i3 >= slideComments.length) {
                r15 = r7;
                break;
            }
            if (this.f4407ck.getShowCommentsByNoAuthor() || !"n/a".equals(slideComments[i3].getAuthor().getInitials())) {
                M4750k4.getRows().addClone(M4750k4.getRows().get_Item(i4), r7);
                if (z3) {
                    M4750k4.get_Item(r7, i4).getTextFrame().getParagraphs().get_Item(r7).getPortions().get_Item(r7).setText(C14113y2.m67408k4(slideComments[i3].getAuthor().getInitials(), C14114y9.m67465x1(((Comment) slideComments[i3]).m1168to().m7379k4())));
                }
                M4750k4.get_Item(i2, i4).getTextFrame().getParagraphs().get_Item(r7).getPortions().get_Item(r7).setText(slideComments[i3].getText());
                Portion portionM4752k4 = m4752k4(C14113y2.m67407k4(IOUtils.LINE_SEPARATOR_UNIX, slideComments[i3].getAuthor().getName(), "; ", ((Comment) slideComments[i3]).m1163k4()));
                M4750k4.get_Item(i2, i4).getTextFrame().getParagraphs().get_Item(r7).getPortions().add(portionM4752k4);
                if (M4750k4.getHeight() > fM56697kk) {
                    text2 = portionM4752k4.getText();
                    M4750k4.get_Item(i2, i4).getTextFrame().getParagraphs().get_Item(r7).getPortions().remove(portionM4752k4);
                    if (M4750k4.getHeight() > fM56697kk) {
                        double height = M4750k4.get_Item(i2, i4).getHeight() / (((double) (fM56697kk - ((Table) M4750k4).getY())) - M4750k4.get_Item(i2, i4).getOffsetY());
                        if (height > 0.0d) {
                            String strM67394k4 = C14113y2.m67394k4(slideComments[i3].getText(), C22208OooOo0.OooO00o(slideComments[i3].getText().length(), height, 14));
                            int iM67430to = C14113y2.m67430to(strM67394k4, " ");
                            M4750k4.get_Item(i2, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67440x1(C14113y2.m67394k4(strM67394k4, iM67430to)));
                            text = C14113y2.m67440x1(C14113y2.m67422kk(slideComments[i3].getText(), iM67430to));
                            while (M4750k4.getHeight() < fM56697kk && (iM67429to = C14113y2.m67429to(text, ControlChar.SPACE_CHAR)) >= 0) {
                                int i5 = iM67429to + 1;
                                M4750k4.get_Item(i2, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67408k4(M4750k4.get_Item(i2, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), C14113y2.m67443x1(text, 0, i5)));
                                text = C14113y2.m67422kk(text, i5);
                                slideComments = slideComments;
                                i2 = 1;
                            }
                            iCommentArr = slideComments;
                            while (M4750k4.getHeight() > fM56697kk) {
                                z2 = false;
                                int iM67430to2 = C14113y2.m67430to(M4750k4.get_Item(1, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), " ");
                                if (iM67430to2 <= 0) {
                                    break;
                                }
                                text = C14113y2.m67397k4(text, 0, C14113y2.m67408k4(C14113y2.m67422kk(M4750k4.get_Item(1, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), iM67430to2), " "));
                                M4750k4.get_Item(1, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(C14113y2.m67394k4(M4750k4.get_Item(1, i4).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), iM67430to2));
                            }
                        } else {
                            iCommentArr = slideComments;
                            ?? r152 = r7;
                            text = iCommentArr[i3].getText();
                            M4750k4.getRows().removeAt(i4, r152);
                            z2 = true;
                        }
                    } else {
                        iCommentArr = slideComments;
                        text = "";
                    }
                    z2 = false;
                } else {
                    iCommentArr = slideComments;
                    z2 = z3;
                    text = "";
                    text2 = text;
                }
                String strM67440x1 = C14113y2.m67440x1(text);
                if (!C14113y2.m67411k4(text2)) {
                    iCommentArr[i3].setText(strM67440x1);
                    m4759k4(iSlide, iArr, i3, z2);
                    r15 = 0;
                    break;
                }
                i4++;
                z3 = true;
            } else {
                iCommentArr = slideComments;
            }
            i3++;
            slideComments = iCommentArr;
            r7 = 0;
            i2 = 1;
        }
        M4750k4.get_Item(r15, r15).getCellFormat().getBorderBottom().setWidth(1.0d);
        M4750k4.get_Item(r15, r15).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) M4750k4.get_Item(r15, r15).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56393jw().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m4760k4(ITextFrame iTextFrame) {
        IGenericEnumerator<IParagraph> it = iTextFrame.getParagraphs().iterator();
        short depth = 0;
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                if (next.getParagraphFormat().getDepth() > depth) {
                    depth = next.getParagraphFormat().getDepth();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        boolean z = false;
        short numberedBulletStartWith = 0;
        short s = 0;
        for (int i = 0; i <= depth; i++) {
            for (int i2 = 0; i2 < iTextFrame.getParagraphs().getCount() - 1; i2++) {
                if (iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getDepth() <= i) {
                    if (iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getDepth() < i || iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getBullet().getType() != 2) {
                        z = false;
                        s = 0;
                    } else if (i == iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getDepth()) {
                        if (z) {
                            if (iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getBullet().getNumberedBulletStartWith() == numberedBulletStartWith) {
                                s = (short) (s + 1);
                            } else {
                                numberedBulletStartWith = iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getBullet().getNumberedBulletStartWith();
                                s = numberedBulletStartWith;
                            }
                            iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getBullet().setNumberedBulletStartWith(s);
                        } else {
                            numberedBulletStartWith = iTextFrame.getParagraphs().get_Item(i2).getParagraphFormat().getBullet().getNumberedBulletStartWith();
                            s = numberedBulletStartWith;
                            z = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4761k4(ITextFrame iTextFrame, float f) {
        float fontHeight = iTextFrame.getTextFrameFormat().getTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().getFontHeight();
        if (!C14064he.m66715kk(fontHeight)) {
            f = fontHeight;
        }
        IGenericEnumerator<IParagraph> it = iTextFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                IGenericEnumerator<IPortion> it2 = next.getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        IPortion next2 = it2.next();
                        if (C14064he.m66715kk(next2.getPortionFormat().getFontHeight())) {
                            next2.getPortionFormat().setFontHeight(f);
                        }
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
                IPortionFormat endParagraphPortionFormat = ((Paragraph) next).getEndParagraphPortionFormat();
                if (endParagraphPortionFormat != null && C14064he.m66715kk(endParagraphPortionFormat.getFontHeight())) {
                    endParagraphPortionFormat.setFontHeight(f);
                }
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
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4762k4(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions, int i, AbstractC12008jd abstractC12008jd) {
        m4763k4(presentation, iNotesCommentsLayoutingOptions, i, abstractC12008jd, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4763k4(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions, int i, AbstractC12008jd abstractC12008jd, float f, float f2) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            iNotesCommentsLayoutingOptions.setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, new int[]{i}, iNotesCommentsLayoutingOptions);
        c0866cq.m4747dy();
        c0866cq.m4775k4(abstractC12008jd, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4764k4(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions, int i, AbstractC12008jd abstractC12008jd, C12023wl c12023wl) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            iNotesCommentsLayoutingOptions.setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, new int[]{i}, iNotesCommentsLayoutingOptions);
        c0866cq.m4747dy();
        c0866cq.m4776k4(abstractC12008jd, c12023wl.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4765k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            htmlOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, htmlOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        kmn.m64021k4(c0866cq.m4788k4(), abstractC3150x6, htmlOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4766k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, PdfOptions pdfOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            pdfOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, pdfOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        c0866cq.m4773k4(abstractC3150x6, pdfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4767k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, SwfOptions swfOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            swfOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, swfOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        c0866cq.m4774k4(abstractC3150x6, swfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4768k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, TiffOptions tiffOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            tiffOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, tiffOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        kmn.m64025k4(c0866cq.m4788k4(), abstractC3150x6, tiffOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4769k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            htmlOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, iArr, htmlOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        kmn.m64021k4(c0866cq.m4788k4(), abstractC3150x6, htmlOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4770k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, PdfOptions pdfOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            pdfOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, iArr, pdfOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        c0866cq.m4773k4(abstractC3150x6, pdfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4771k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, SwfOptions swfOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            swfOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, iArr, swfOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        c0866cq.m4774k4(abstractC3150x6, swfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4772k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, TiffOptions tiffOptions, InterruptionToken interruptionToken) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            tiffOptions.getNotesCommentsLayouting().setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, iArr, tiffOptions.getNotesCommentsLayouting());
        c0866cq.m4747dy();
        kmn.m64025k4(c0866cq.m4788k4(), abstractC3150x6, tiffOptions, interruptionToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m4773k4(AbstractC3150x6 abstractC3150x6, PdfOptions pdfOptions, final InterruptionToken interruptionToken) {
        Dictionary.Enumerator it;
        C10951c5 c10951c5M68790jd;
        AbstractC3150x6 c3152yj = abstractC3150x6.canSeek() ? abstractC3150x6 : new C3152yj();
        new C12015qq();
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class, 30);
        C12015qq c12015qq = m4783kk() ? new C12015qq((float) C12566m9.m58654x1(((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56699x1(), 72.0d), (float) C12566m9.m58654x1(((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56697kk(), 72.0d)) : new C12015qq((float) C12566m9.m58654x1(((SlideSize) this.f4413k4.getSlideSize()).m2755k4().m56699x1(), 72.0d), (float) C12566m9.m58654x1(((SlideSize) this.f4413k4.getSlideSize()).m2755k4().m56697kk(), 72.0d));
        C10909qq c10909qq = new C10909qq(c3152yj, pdfOptions.m2228x1());
        C13700js c13700js = new C13700js();
        c13700js.f45576up = pdfOptions;
        c13700js.f45570k4 = true;
        c13700js.f45575to = pdfOptions.getWarningCallback();
        c13700js.f45565du = pdfOptions.getJpegQuality();
        c13700js.f45568h4 = pdfOptions.getSufficientResolution();
        c13700js.f45578yj.setHideInk(pdfOptions.getInkOptions().getHideInk());
        c13700js.f45578yj.setInterpretMaskOpAsOpacity(pdfOptions.getInkOptions().getInterpretMaskOpAsOpacity());
        C14258ow c14258owM2395wl = this.f4413k4.m2395wl();
        try {
            try {
                IGenericEnumerator<ISlide> it2 = this.f4413k4.getSlides().iterator();
                while (it2.hasNext()) {
                    try {
                        Slide slide = (Slide) it2.next();
                        if (slide != 0 && (!slide.getHidden() || pdfOptions.getShowHiddenSlides())) {
                            C10948ar c10948ar = new C10948ar(c12015qq.m56699x1(), c12015qq.m56697kk());
                            if (m4783kk()) {
                                INotesSlide notesSlide = slide.getNotesSlideManager().getNotesSlide();
                                if (notesSlide == null) {
                                    notesSlide = slide.getNotesSlideManager().addNotesSlide();
                                }
                                c10951c5M68790jd = ((NotesSlide) notesSlide).m2034x6().m64315k4(pdfOptions.getSaveMetafilesAsPng(), new kg7(notesSlide, c12210k4, c13700js), c13700js);
                            } else {
                                c10951c5M68790jd = slide.m2695k4(pdfOptions.getSaveMetafilesAsPng(), (C12210k4<C7134m9, C7131h4>) c12210k4, c13700js, interruptionToken).m68790jd();
                            }
                            c10948ar.m52930k4(c10951c5M68790jd);
                            c10909qq.m52514x1(c10948ar, new AbstractC3174jd() { // from class: com.aspose.slides.cq.1
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
                        }
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
                String strM67408k4 = C14113y2.m67408k4(BuildVersionInfo.Product, " ", "24.6");
                C3173h4 c3173h4M52492kk = c10909qq.m52512x1().m52492kk();
                IDocumentProperties documentProperties = this.f4413k4.getDocumentProperties();
                c3173h4M52492kk.m13556du(strM67408k4);
                c3173h4M52492kk.m13569kk(documentProperties.getAuthor());
                c3173h4M52492kk.m13563jd(documentProperties.getCategory());
                c3173h4M52492kk.m13576x1(((DocumentProperties) documentProperties).m1347x1().Clone());
                c3173h4M52492kk.m13571m9(documentProperties.getComments());
                c3173h4M52492kk.m13566k4(strM67408k4);
                c3173h4M52492kk.m13561h4(documentProperties.getKeywords());
                c3173h4M52492kk.m13558dy(documentProperties.getLastSavedBy());
                c3173h4M52492kk.m13565k4(((DocumentProperties) documentProperties).m1345to().Clone());
                c3173h4M52492kk.m13568kk(((DocumentProperties) documentProperties).m1342kk().Clone());
                c3173h4M52492kk.m13553c5(C14057f9.m66586k4(documentProperties.getRevisionNumber(), (InterfaceC14073kp) C11697x1.m55250kk()));
                c3173h4M52492kk.m13573to(documentProperties.getSubject());
                c3173h4M52492kk.m13577x1(documentProperties.getTitle());
                c10909qq.m52511k4();
                c3152yj.flush();
                if (c3152yj != abstractC3150x6) {
                    ((C3152yj) c3152yj).writeTo(abstractC3150x6);
                }
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (!m4788k4().m2392um().m56972k4(next.getKey())) {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            } catch (Throwable th2) {
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next2 = it.next();
                        if (!m4788k4().m2392um().m56972k4(next2.getKey())) {
                            ((C7131h4) next2.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next2.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        } finally {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m4774k4(AbstractC3150x6 abstractC3150x6, SwfOptions swfOptions, final InterruptionToken interruptionToken) {
        Dictionary.Enumerator it;
        C10951c5 c10951c5M68790jd;
        AbstractC3150x6 c3152yj = abstractC3150x6.canSeek() ? abstractC3150x6 : new C3152yj();
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class, 30);
        String strM67408k4 = C14113y2.m67408k4(BuildVersionInfo.Product, " ", "24.6");
        C3173h4 c3173h4 = new C3173h4();
        IDocumentProperties documentProperties = this.f4413k4.getDocumentProperties();
        c3173h4.m13556du(strM67408k4);
        c3173h4.m13569kk(documentProperties.getAuthor());
        c3173h4.m13563jd(documentProperties.getCategory());
        DocumentProperties documentProperties2 = (DocumentProperties) documentProperties;
        c3173h4.m13576x1(documentProperties2.m1347x1().Clone());
        c3173h4.m13571m9(documentProperties.getComments());
        c3173h4.m13566k4(strM67408k4);
        c3173h4.m13561h4(documentProperties.getKeywords());
        c3173h4.m13558dy(documentProperties.getLastSavedBy());
        c3173h4.m13565k4(documentProperties2.m1345to().Clone());
        c3173h4.m13568kk(documentProperties2.m1342kk().Clone());
        c3173h4.m13553c5(C14057f9.m66586k4(documentProperties.getRevisionNumber(), (InterfaceC14073kp) C11697x1.m55250kk()));
        c3173h4.m13573to(documentProperties.getSubject());
        c3173h4.m13577x1(documentProperties.getTitle());
        C6231ar c6231ar = new C6231ar(c3152yj, c3173h4, swfOptions.m2859k4());
        C13700js c13700js = new C13700js();
        c13700js.f45570k4 = true;
        c13700js.f45575to = swfOptions.getWarningCallback();
        c13700js.f45568h4 = 96.0f;
        C12015qq c12015qqClone = (m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).Clone();
        C14258ow c14258owM2395wl = this.f4413k4.m2395wl();
        try {
            try {
                IGenericEnumerator<ISlide> it2 = this.f4413k4.getSlides().iterator();
                while (it2.hasNext()) {
                    try {
                        Slide slide = (Slide) it2.next();
                        if (slide != 0 && (!slide.getHidden() || swfOptions.getShowHiddenSlides())) {
                            C10948ar c10948ar = new C10948ar(c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                            if (m4783kk()) {
                                INotesSlide notesSlide = slide.getNotesSlideManager().getNotesSlide();
                                if (notesSlide == null) {
                                    notesSlide = slide.getNotesSlideManager().addNotesSlide();
                                }
                                c10951c5M68790jd = ((NotesSlide) notesSlide).m2034x6().m64315k4(true, new kg7(notesSlide, c12210k4, c13700js), c13700js);
                            } else {
                                c10951c5M68790jd = slide.m2695k4(true, (C12210k4<C7134m9, C7131h4>) c12210k4, c13700js, interruptionToken).m68790jd();
                            }
                            c10948ar.m52930k4(c10951c5M68790jd);
                            c6231ar.m25236x1(c10948ar, new AbstractC3174jd() { // from class: com.aspose.slides.cq.2
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
                        }
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
                c6231ar.m25235k4();
                c3152yj.flush();
                if (c3152yj != abstractC3150x6) {
                    ((C3152yj) c3152yj).writeTo(abstractC3150x6);
                }
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (!m4788k4().m2392um().m56972k4(next.getKey())) {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            } catch (Throwable th2) {
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next2 = it.next();
                        if (!m4788k4().m2392um().m56972k4(next2.getKey())) {
                            ((C7131h4) next2.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next2.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        } finally {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4775k4(AbstractC12008jd abstractC12008jd, float f, float f2) {
        m4776k4(abstractC12008jd, new C12023wl(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(C12566m9.m58645k4((m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).m56699x1(), abstractC12008jd.mo17483jd()), f, 14), com.aspose.slides.Collections.Generic.OooO00o.OooO00o(C12566m9.m58645k4((m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).m56697kk(), abstractC12008jd.mo17474ck()), f2, 14)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m4776k4(AbstractC12008jd abstractC12008jd, C12023wl c12023wl) {
        Dictionary.Enumerator it;
        if (abstractC12008jd == null) {
            throw new ArgumentNullException("graphics");
        }
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        ISlide iSlide = this.f4413k4.getSlides().get_Item(this.f4410fa.get_Item(0).intValue() - 1);
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                C12015qq c12015qqClone = (m4783kk() ? ((NotesSize) this.f4413k4.getNotesSize()).m2030k4() : ((SlideSize) this.f4413k4.getSlideSize()).m2755k4()).Clone();
                C14258ow c14258owM2395wl = m4788k4().m2395wl();
                try {
                    omq omqVar = new omq(abstractC12008jd, c12023wl.m56865x1(), c12023wl.m56862kk(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                    try {
                        C13700js c13700js = new C13700js();
                        if (m4783kk()) {
                            INotesSlide notesSlide = iSlide.getNotesSlideManager().getNotesSlide();
                            ((NotesSlide) notesSlide).m2034x6().m64317k4(omqVar, new kg7(notesSlide, c12210k4, c13700js), c13700js);
                        } else {
                            ((Slide) iSlide).m2721x6().m69376k4(omqVar, (C12210k4<C7134m9, C7131h4>) c12210k4, c13700js, InterruptionToken.getNone());
                        }
                        omqVar.dispose();
                        if (c14258owM2395wl != null) {
                            c14258owM2395wl.dispose();
                        }
                        v7f.m72088k4(c14047bzClone.Clone(), c12015qqClone.Clone());
                        it = c12210k4.m56976x1().iterator();
                        while (it.hasNext()) {
                            try {
                                KeyValuePair next = it.next();
                                if (!m4788k4().m2392um().m56972k4(next.getKey())) {
                                    ((C7131h4) next.getValue()).m27678kk().dispose();
                                    c12210k4.m56977x1(next.getKey());
                                }
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    } catch (Throwable th) {
                        omqVar.dispose();
                        throw th;
                    }
                } finally {
                }
            } catch (RuntimeException e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw e;
            }
        } catch (Throwable th2) {
            it = c12210k4.m56976x1().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next2 = it.next();
                    if (!m4788k4().m2392um().m56972k4(next2.getKey())) {
                        ((C7131h4) next2.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next2.getKey());
                    }
                } finally {
                    if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        throw th2;
                    }
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4777k4(IShape iShape, byte b) {
        return iShape.getPlaceholder() != null && iShape.getPlaceholder().getType() == b;
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4[] m4778k4(float f, float f2) {
        new C12023wl();
        return m4782k4((m4783kk() ? new C12023wl(C7019kk.m27462to(Float.valueOf(((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56699x1() * f), 13), C7019kk.m27462to(Float.valueOf(((NotesSize) this.f4413k4.getNotesSize()).m2030k4().m56697kk() * f2), 13)) : new C12023wl(C7019kk.m27462to(Float.valueOf(((SlideSize) this.f4413k4.getSlideSize()).m2755k4().m56699x1() * f), 13), C7019kk.m27462to(Float.valueOf(((SlideSize) this.f4413k4.getSlideSize()).m2755k4().m56697kk() * f2), 13))).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4[] m4779k4(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions, int[] iArr) {
        return m4780k4(presentation, iNotesCommentsLayoutingOptions, iArr, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4[] m4780k4(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions, int[] iArr, float f, float f2) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            iNotesCommentsLayoutingOptions.setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, iArr, iNotesCommentsLayoutingOptions);
        c0866cq.m4747dy();
        return c0866cq.m4778k4(f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4[] m4781k4(Presentation presentation, INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions, int[] iArr, C12023wl c12023wl) {
        if (presentation.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            iNotesCommentsLayoutingOptions.setNotesPosition(0);
        }
        C0866cq c0866cq = new C0866cq(presentation, iArr, iNotesCommentsLayoutingOptions);
        c0866cq.m4747dy();
        return c0866cq.m4782k4(c12023wl.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4[] m4782k4(C12023wl c12023wl) {
        Slide slide;
        List list = new List();
        C12023wl c12023wlClone = c12023wl.Clone();
        C14258ow c14258owM2395wl = this.f4413k4.m2395wl();
        try {
            if (m4783kk() || m4785to()) {
                IGenericEnumerator<ISlide> it = this.f4413k4.getSlides().iterator();
                while (it.hasNext()) {
                    try {
                        Slide slide2 = (Slide) it.next();
                        C13700js c13700js = new C13700js();
                        if (slide2 != null && !slide2.getHidden()) {
                            list.addItem(m4783kk() ? ((NotesSlide) slide2.getNotesSlideManager().getNotesSlide()).m2034x6().m64316k4(c12023wlClone.Clone(), c13700js) : slide2.m2721x6().m69379x1(c12023wlClone.Clone()));
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } else {
                int i = 0;
                while (i < this.f4413k4.getSlides().size()) {
                    int i2 = i + 1;
                    if (this.f4410fa.containsItem(Integer.valueOf(i2)) && (slide = (Slide) this.f4413k4.getSlides().get_Item(i)) != null && !slide.getHidden()) {
                        list.addItem(slide.m2721x6().m69379x1(c12023wlClone.Clone()));
                    }
                    i = i2;
                }
            }
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
            return (C12009k4[]) list.toArray(new C12009k4[0]);
        } catch (Throwable th) {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
            throw th;
        }
    }
}
