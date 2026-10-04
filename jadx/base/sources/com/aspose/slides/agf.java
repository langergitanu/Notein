package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10618r9;
import com.aspose.slides.internal.p407st.C10676v0;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class agf {
    /* JADX INFO: renamed from: k4 */
    public static void m3570k4(MasterNotesSlide masterNotesSlide, C10618r9 c10618r9) {
        ac6 ac6VarM1932ne = masterNotesSlide.m1932ne();
        ac6VarM1932ne.m3475k4(c10618r9.m51757h4());
        ac6VarM1932ne.m3476k4(c10618r9.m51761m9());
        ac6VarM1932ne.m3477k4(c10618r9.m51620jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3571k4(m4c m4cVar) {
        MasterNotesSlide masterNotesSlide = (MasterNotesSlide) m4cVar.m64735up();
        if (masterNotesSlide == null) {
            throw new NullReferenceException("Can't create target DOM MasterNotesSlide!");
        }
        C10618r9 c10618r9 = (C10618r9) m4cVar.m64717jd();
        C1240i5.m7462k4(m4cVar);
        m3570k4(masterNotesSlide, c10618r9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3572k4(rpo rpoVar) {
        if (rpoVar == null) {
            return;
        }
        MasterNotesSlide masterNotesSlide = (MasterNotesSlide) rpoVar.m70235x1();
        C10676v0 c10676v0M70206ck = rpoVar.m70206ck();
        IMasterThemeManager themeManager = masterNotesSlide.getThemeManager();
        rpo rpoVarM70214k4 = rpoVar.m70214k4(0);
        C10556n5 c10556n5 = rpoVarM70214k4 != null ? (C10556n5) C7019kk.m27452k4((Object) rpoVarM70214k4.m70228to(), C10556n5.class) : null;
        c10676v0M70206ck.m51117x1(!themeManager.isOverrideThemeEnabled());
        c10676v0M70206ck.m51113k4(false);
        if (c10556n5 != null) {
            c10676v0M70206ck.m51836k4(c10556n5.m51357ar());
            c10676v0M70206ck.m51114kk(masterNotesSlide.getBackground().getType() == -1);
            knj knjVar = rpoVarM70214k4.m70241yj()[2];
            IFontData iFontDataM73699k4 = rpoVar.m70215k4().m73699k4(themeManager.getOverrideTheme().getFontScheme().getMajor().getLatinFont(), (String) null);
            C13827mb c13827mbM6639k4 = rpoVar.m70215k4().m71946k4().m2389rv().m6639k4();
            knjVar.m64051x1().m51276to().get_Item(0).m52151x1().m51540x1(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(0, iFontDataM73699k4)))));
        } else {
            c10676v0M70206ck.m51836k4(0L);
            c10676v0M70206ck.m51114kk(false);
        }
        C1240i5.m7464k4(rpoVar);
    }
}
