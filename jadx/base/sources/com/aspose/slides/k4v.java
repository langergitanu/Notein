package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10618r9;
import com.aspose.slides.internal.p407st.C10676v0;

/* JADX INFO: loaded from: classes3.dex */
class k4v {
    /* JADX INFO: renamed from: k4 */
    public static void m63650k4(ac6 ac6Var, C10618r9 c10618r9) {
        ac6Var.m3475k4(c10618r9.m51757h4());
        ac6Var.m3476k4(c10618r9.m51761m9());
        ac6Var.m3477k4(c10618r9.m51620jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63651k4(m4c m4cVar) {
        NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) m4cVar.m64735up(), NotesSlide.class);
        if (notesSlide == null) {
            throw new NullReferenceException("Can't create target DOM Slide!");
        }
        C10618r9 c10618r9 = (C10618r9) m4cVar.m64717jd();
        C1240i5.m7462k4(m4cVar);
        m63650k4(notesSlide.m2032ix(), c10618r9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63652k4(rpo rpoVar) {
        NotesSlide notesSlide = (NotesSlide) rpoVar.m70235x1();
        C10495ji c10495jiM70209fa = rpoVar.m70209fa();
        C10676v0 c10676v0M70206ck = rpoVar.m70206ck();
        IOverrideThemeManager themeManager = notesSlide.getThemeManager();
        rpo rpoVarM70214k4 = rpoVar.m70214k4(4);
        C10556n5 c10556n5 = rpoVarM70214k4 != null ? (C10556n5) C7019kk.m27452k4((Object) rpoVarM70214k4.m70228to(), C10556n5.class) : null;
        if (c10556n5 != null) {
            c10556n5.m51360qq().m50983x1(c10495jiM70209fa.m51011to());
        }
        if (c10556n5 != null) {
            c10676v0M70206ck.m51836k4(c10556n5.m51357ar());
            c10676v0M70206ck.m51114kk(notesSlide.getBackground().getType() == -1);
            c10676v0M70206ck.m51113k4(true);
            c10676v0M70206ck.m51117x1(!themeManager.isOverrideThemeEnabled());
        } else {
            c10676v0M70206ck.m51836k4(0L);
            c10676v0M70206ck.m51114kk(false);
            c10676v0M70206ck.m51113k4(false);
            c10676v0M70206ck.m51117x1(false);
        }
        C1240i5.m7464k4(rpoVar);
    }
}
