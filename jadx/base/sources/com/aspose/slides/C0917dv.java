package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p407st.C10484iv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;

/* JADX INFO: renamed from: com.aspose.slides.dv */
/* JADX INFO: loaded from: classes3.dex */
class C0917dv {
    /* JADX INFO: renamed from: k4 */
    public static C13682je m5258k4(m4c m4cVar) {
        if (m4cVar.m64717jd().m51761m9() == null) {
            return null;
        }
        String strM50972x1 = m4cVar.m64717jd().m51761m9().m50972x1();
        C13938ms c13938ms = new C13938ms(new C3152yj(AbstractC6747ar.m26635ix().mo26677to(strM50972x1)));
        c13938ms.m65615k4((AbstractC13943n5) null);
        if (C14113y2.m67359c5(strM50972x1, "clrMapOvr")) {
            rsm rsmVarM70337k4 = rsm.m70337k4(c13938ms);
            C13682je c13682je = new C13682je(false);
            C14349qj.m69674k4(c13682je, rsmVarM70337k4);
            return c13682je;
        }
        gof gofVarM6845k4 = gof.m6845k4(c13938ms);
        C13682je c13682je2 = new C13682je();
        C14349qj.m69673k4(c13682je2, gofVarM6845k4);
        return c13682je2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5259k4(rpo rpoVar) {
        C13682je c13682jeM69807kk = rpoVar.m70229u4().m69807kk();
        C3152yj c3152yj = new C3152yj();
        C3059ii c3059ii = new C3059ii(c3152yj, AbstractC6747ar.m26635ix());
        c3059ii.m66262x1(4);
        c3059ii.m66258k4(1);
        c3059ii.mo65747x1(true);
        gof gofVar = new gof();
        C14349qj.m69676x1(c13682jeM69807kk, gofVar);
        gofVar.mo6846k4(null, c3059ii, "a:clrMap");
        c3059ii.m66257k4();
        c3059ii.mo21896h4();
        c3059ii.mo21893du();
        String strM26681x1 = AbstractC6747ar.m26635ix().m26681x1(c3152yj.toArray());
        C10484iv c10484iv = new C10484iv();
        c10484iv.m50971k4(strM26681x1);
        rpoVar.m70228to().m50507k4(c10484iv);
    }
}
