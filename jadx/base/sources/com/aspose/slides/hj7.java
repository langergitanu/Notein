package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class hj7 extends abb {

    /* JADX INFO: renamed from: k4 */
    private static final C12380dy f5523k4 = new C12380dy(C14113y2.m67402k4("Master([0-9]+)\\-", FirebaseAnalytics.Param.INDEX), 0);

    public hj7(C11839vw c11839vw, OdpSerializationContext odpSerializationContext) {
        super(c11839vw, odpSerializationContext);
    }

    /* JADX INFO: renamed from: c5 */
    private IGenericList<KeyValuePair<com.aspose.slides.internal.p332p7.kia, IGenericList<com.aspose.slides.internal.p332p7.kia>>> m7202c5() {
        IGenericList<com.aspose.slides.internal.p332p7.kia> iGenericListM69246up = mo3471m9().m69960x1().m69246up();
        if (m7212x1(iGenericListM69246up)) {
            return m7204k4(iGenericListM69246up);
        }
        com.aspose.slides.internal.p332p7.kia[] kiaVarArr = (com.aspose.slides.internal.p332p7.kia[]) ((List) iGenericListM69246up).toArray(new com.aspose.slides.internal.p332p7.kia[0]);
        com.aspose.slides.internal.p332p7.kia[] kiaVarArr2 = new com.aspose.slides.internal.p332p7.kia[0];
        List list = new List();
        for (com.aspose.slides.internal.p332p7.kia kiaVar : kiaVarArr) {
            list.add(new KeyValuePair(kiaVar, AbstractC14092to.m67204k4((Object[]) kiaVarArr2)));
        }
        return list;
    }

    /* JADX INFO: renamed from: dy */
    private float[] m7203dy() {
        com.aspose.slides.internal.p332p7.kia kiaVar = mo3471m9().m69960x1().m69246up().size() > 0 ? mo3471m9().m69960x1().m69246up().get_Item(0) : null;
        return m7209k4((kiaVar == null || kiaVar.m35422du() == null) ? "" : kiaVar.m35422du().m39655k4(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private IGenericList<KeyValuePair<com.aspose.slides.internal.p332p7.kia, IGenericList<com.aspose.slides.internal.p332p7.kia>>> m7204k4(IGenericList<com.aspose.slides.internal.p332p7.kia> iGenericList) {
        List list = new List();
        Dictionary dictionary = new Dictionary(iGenericList.size());
        IGenericEnumerator<com.aspose.slides.internal.p332p7.kia> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                com.aspose.slides.internal.p332p7.kia next = it.next();
                int iM66582k4 = C14057f9.m66582k4(f5523k4.m57989x1(next.m35424k4()).m58004du().m58000k4(1).mo57995kk());
                com.aspose.slides.Collections.Generic.IGenericCollection list2 = dictionary.containsKey(Integer.valueOf(iM66582k4)) ? (IGenericList) ((KeyValuePair) list.get_Item(((Integer) dictionary.get_Item(Integer.valueOf(iM66582k4))).intValue())).getValue() : new List();
                if (dictionary.containsKey(Integer.valueOf(iM66582k4))) {
                    list2.addItem(next);
                } else {
                    list.addItem(new KeyValuePair(next, list2));
                    dictionary.addItem(Integer.valueOf(iM66582k4), Integer.valueOf(list.size() - 1));
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
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private void m7210x1(Presentation presentation) {
        float[] fArrM7208k4 = m7208k4();
        ((SlideSize) presentation.getSlideSize()).setSize(fArrM7208k4[0], fArrM7208k4[1], 0);
        presentation.getSlideSize().setOrientation(fArrM7208k4[2] == 0.0f ? 0 : 1);
        float[] fArrM7203dy = m7203dy();
        ((NotesSize) presentation.getNotesSize()).m2031k4(new C12015qq(fArrM7203dy[0], fArrM7203dy[1]));
    }

    public hj7(C11839vw c11839vw, qye qyeVar) {
        super(c11839vw, qyeVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m7205k4(MasterSlide masterSlide) {
        ((TextStyle) masterSlide.getBodyStyle()).m2989m9();
    }

    /* JADX INFO: renamed from: x1 */
    private void m7211x1(Presentation presentation, com.aspose.slides.internal.p332p7.xgo xgoVar) {
        com.aspose.slides.internal.p332p7.yq7 yq7VarM44346kk = xgoVar.m44346kk();
        pkv pkvVar = new pkv(xgoVar.m44348x1(), mo3468h4(), "M");
        sm2 sm2Var = new sm2(mo3468h4(), xgoVar);
        IGenericEnumerator<IMasterSlide> it = presentation.getMasters().iterator();
        while (it.hasNext()) {
            try {
                MasterSlide masterSlide = (MasterSlide) it.next();
                pkvVar.m69130x1().m2058k4(masterSlide);
                s1a.m70421k4(masterSlide, yq7VarM44346kk, xgoVar, sm2Var, pkvVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (presentation.getMasterHandoutSlideManager().getMasterHandoutSlide() != null) {
            MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
            pkvVar.m69130x1().m2058k4(masterHandoutSlide);
            C14351ql.m69694k4(masterHandoutSlide, yq7VarM44346kk, sm2Var, pkvVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m7212x1(IGenericList<com.aspose.slides.internal.p332p7.kia> iGenericList) {
        IGenericEnumerator<com.aspose.slides.internal.p332p7.kia> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                if (!f5523k4.m57988to(it.next().m35424k4())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7213k4(Presentation presentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "document-styles".equals(m55443jd().mo65023fa())) {
                mo3471m9().m69957to().throwIfInterruptionRequested();
                com.aspose.slides.internal.p332p7.xgo xgoVar = new com.aspose.slides.internal.p332p7.xgo(m55443jd());
                m7207k4(xgoVar);
                m7206k4(presentation, xgoVar);
                m7210x1(presentation);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    private void m7206k4(Presentation presentation, com.aspose.slides.internal.p332p7.xgo xgoVar) {
        ILayoutSlide iLayoutSlideM1943x1;
        wxb wxbVar = new wxb(mo3471m9(), xgoVar.m44343du());
        IMasterSlide iMasterSlide = presentation.getMasters().get_Item(0);
        iMasterSlide.getShapes().clear();
        IGenericList<KeyValuePair<com.aspose.slides.internal.p332p7.kia, IGenericList<com.aspose.slides.internal.p332p7.kia>>> iGenericListM7202c5 = m7202c5();
        if (iGenericListM7202c5.size() > 1) {
            for (int i = 1; i < iGenericListM7202c5.size(); i++) {
                presentation.getMasters().addClone(iMasterSlide);
            }
        }
        for (int i2 = 0; i2 < iGenericListM7202c5.size(); i2++) {
            KeyValuePair keyValuePairClone = iGenericListM7202c5.get_Item(i2).Clone();
            MasterSlide masterSlide = (MasterSlide) presentation.getMasters().get_Item(i2);
            m7205k4(masterSlide);
            jkn.m63388k4(masterSlide, (com.aspose.slides.internal.p332p7.kia) keyValuePairClone.getKey(), wxbVar);
            for (int i3 = 0; i3 < ((IGenericList) keyValuePairClone.getValue()).size(); i3++) {
                com.aspose.slides.internal.p332p7.kia kiaVar = (com.aspose.slides.internal.p332p7.kia) ((IGenericList) keyValuePairClone.getValue()).get_Item(i3);
                if (masterSlide.getLayoutSlides().size() > i3) {
                    iLayoutSlideM1943x1 = masterSlide.getLayoutSlides().get_Item(i3);
                    iLayoutSlideM1943x1.getShapes().clear();
                } else {
                    iLayoutSlideM1943x1 = masterSlide.m1943x1((byte) 11);
                    ((LayoutSlide) iLayoutSlideM1943x1).m1849x6().m5302k4(presentation.m2351fa().m68390um());
                }
                ka1.m63734k4(iLayoutSlideM1943x1, kiaVar, wxbVar);
            }
            if (((IGenericList) keyValuePairClone.getValue()).size() == 0) {
                IGenericEnumerator<ILayoutSlide> it = masterSlide.getLayoutSlides().iterator();
                while (it.hasNext()) {
                    try {
                        LayoutSlide layoutSlide = (LayoutSlide) it.next();
                        layoutSlide.setShowMasterShapes(false);
                        IGenericEnumerator<IShape> it2 = masterSlide.getShapes().iterator();
                        while (it2.hasNext()) {
                            try {
                                Shape shape = (Shape) it2.next();
                                if (shape.getPlaceholder() == null) {
                                    layoutSlide.getShapes().addClone(shape);
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
                        BaseSlideHeaderFooterManager baseSlideHeaderFooterManager = (BaseSlideHeaderFooterManager) layoutSlide.getHeaderFooterManager();
                        if (masterSlide.getHeaderFooterManager().isSlideNumberVisible()) {
                            AutoShape autoShape = (AutoShape) masterSlide.m391k4((byte) 5);
                            AutoShape autoShape2 = (AutoShape) layoutSlide.m391k4((byte) 5);
                            if (autoShape2 != null) {
                                autoShape2.m288x1().m2910k4((ITextFrame) autoShape.m288x1());
                            }
                        } else {
                            baseSlideHeaderFooterManager.setSlideNumberVisibility(false);
                        }
                        if (masterSlide.getHeaderFooterManager().isFooterVisible()) {
                            AutoShape autoShape3 = (AutoShape) masterSlide.m391k4((byte) 6);
                            AutoShape autoShape4 = (AutoShape) layoutSlide.m391k4((byte) 6);
                            if (autoShape4 != null) {
                                autoShape4.m288x1().m2910k4((ITextFrame) autoShape3.m288x1());
                            }
                        } else {
                            baseSlideHeaderFooterManager.setFooterVisibility(false);
                        }
                        if (masterSlide.getHeaderFooterManager().isDateTimeVisible()) {
                            AutoShape autoShape5 = (AutoShape) masterSlide.m391k4((byte) 4);
                            AutoShape autoShape6 = (AutoShape) layoutSlide.m391k4((byte) 4);
                            if (autoShape6 != null) {
                                autoShape6.m288x1().m2925kk(autoShape5.m288x1());
                            }
                        } else {
                            baseSlideHeaderFooterManager.setDateTimeVisibility(false);
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
        }
        if (mo3471m9().m69960x1().m69248yj() != null) {
            com.aspose.slides.internal.p332p7.xlm xlmVarM69248yj = mo3471m9().m69960x1().m69248yj();
            IMasterHandoutSlide defaultMasterHandoutSlide = presentation.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
            defaultMasterHandoutSlide.getThemeManager().setOverrideThemeEnabled(false);
            hy0.m7330k4(defaultMasterHandoutSlide.getThemeManager().getOverrideTheme());
            defaultMasterHandoutSlide.getThemeManager().setOverrideThemeEnabled(true);
            C0704a4.m3203k4((MasterHandoutSlide) defaultMasterHandoutSlide, xlmVarM69248yj, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7214k4(Presentation presentation, C14354qo c14354qo) {
        mo55332up();
        com.aspose.slides.internal.p332p7.xgo xgoVar = new com.aspose.slides.internal.p332p7.xgo();
        mo3468h4().m2059k4(xgoVar);
        xgoVar.m44345k4();
        m7211x1(presentation, xgoVar);
        c14354qo.m69719x1(presentation);
        xgoVar.mo6846k4(null, m55442ck(), "document-styles");
        mo55333yj();
    }

    /* JADX INFO: renamed from: k4 */
    private void m7207k4(com.aspose.slides.internal.p332p7.xgo xgoVar) {
        mo3471m9().m69953k4(new pt0(xgoVar.m44347to(), xgoVar.m44343du(), xgoVar.m44344h4()));
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m7208k4() {
        return m7209k4(mo3471m9().m69960x1().m69246up().size() > 0 ? mo3471m9().m69960x1().m69246up().get_Item(0).m35429x1() : "", false);
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m7209k4(String str, boolean z) {
        float[] fArr = new float[3];
        fArr[2] = 0.0f;
        if (!C14113y2.m67411k4(str)) {
            IGenericEnumerator<KeyValuePair<TKey, TValue>> it = mo3471m9().m69960x1().m69242k4().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair keyValuePair = (KeyValuePair) it.next();
                    if (C14113y2.m67363du(((com.aspose.slides.internal.p332p7.jlf) keyValuePair.getValue()).m34811x1(), str)) {
                        double dM72708k4 = 720.0d;
                        double dM72708k42 = 540.0d;
                        if (((com.aspose.slides.internal.p332p7.jlf) keyValuePair.getValue()).m34810kk() != null) {
                            dM72708k4 = wgi.m72708k4(((com.aspose.slides.internal.p332p7.jlf) keyValuePair.getValue()).m34810kk().m28586k4(), 720.0d);
                            dM72708k42 = wgi.m72708k4(((com.aspose.slides.internal.p332p7.jlf) keyValuePair.getValue()).m34810kk().m28590x1(), 540.0d);
                        }
                        fArr[0] = (float) dM72708k4;
                        fArr[1] = (float) dM72708k42;
                        if (((com.aspose.slides.internal.p332p7.jlf) keyValuePair.getValue()).m34810kk() != null && ((com.aspose.slides.internal.p332p7.jlf) keyValuePair.getValue()).m34810kk().m28589kk() == 1) {
                            fArr[2] = 1.0f;
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return fArr;
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
        fArr[0] = z ? 595.25f : 793.75f;
        fArr[1] = z ? 793.75f : 595.25f;
        fArr[2] = z ? 1.0f : 0.0f;
        return fArr;
    }
}
