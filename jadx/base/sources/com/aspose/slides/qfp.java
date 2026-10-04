package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7322bh;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7839he;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class qfp extends C14665v6 {
    public qfp(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: rv */
    private void m69559rv() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69561k4(INotesSlide iNotesSlide) {
        boolean zM27456k4;
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1) {
                if ("notes".equals(m55443jd().mo65023fa())) {
                    m69558k4(new C7839he(m55443jd()), iNotesSlide);
                } else if ("AlternateContent".equals(m55443jd().mo65023fa())) {
                    while (m55443jd().mo65026h4()) {
                        if ("Choice".equals(m55443jd().mo65023fa())) {
                            List.Enumerator<C7394ca> it = new C7322bh(m55443jd()).m28900k4().iterator();
                            while (it.hasNext()) {
                                try {
                                    C7394ca next = it.next();
                                    if ("notes".equals(next.m29539k4())) {
                                        m69558k4((C7839he) next.m29542x1(), iNotesSlide);
                                        if (zM27456k4) {
                                            return;
                                        } else {
                                            return;
                                        }
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
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69562x1(INotesSlide iNotesSlide) {
        mo55332up();
        C7839he c7839he = new C7839he();
        mo3468h4().m71548kk().addItem(iNotesSlide, mo3467du());
        C14869z1.m74189k4(iNotesSlide, c7839he.m33304to(), m72080x1());
        C14349qj.m69677x1(((BaseThemeManager) iNotesSlide.getThemeManager()).m423to(), c7839he.m33300k4());
        c7839he.m33302k4(iNotesSlide.getShowMasterShapes());
        m69560x1(iNotesSlide, c7839he);
        c7839he.mo6846k4(null, m55442ck(), "notes");
        mo55333yj();
    }

    public qfp(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar, iBaseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69557k4(INotesSlide iNotesSlide, C7839he c7839he) {
        tob tobVarM2033ne = ((NotesSlide) iNotesSlide).m2033ne();
        tobVarM2033ne.m71268to(c7839he.m33299h4());
        tobVarM2033ne.m71267k4(c7839he.m33303kk());
    }

    /* JADX INFO: renamed from: x1 */
    private void m69560x1(INotesSlide iNotesSlide, C7839he c7839he) {
        tob tobVarM2033ne = ((NotesSlide) iNotesSlide).m2033ne();
        c7839he.m33301k4(tobVarM2033ne.m71265c5());
        c7839he.m33305x1(tobVarM2033ne.m71266dy());
    }

    /* JADX INFO: renamed from: k4 */
    private void m69558k4(C7839he c7839he, INotesSlide iNotesSlide) {
        C14349qj.m69671k4(iNotesSlide.getThemeManager(), c7839he.m33298du());
        C14576tt.m71303k4(iNotesSlide.getThemeManager(), mo3471m9());
        C14869z1.m74188k4(iNotesSlide, c7839he.m33304to(), m72077k4());
        m69559rv();
        iNotesSlide.setShowMasterShapes(c7839he.m33306x1());
        m69557k4(iNotesSlide, c7839he);
    }
}
