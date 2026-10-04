package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8967uo;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10567nz;

/* JADX INFO: loaded from: classes3.dex */
class wrl {
    /* JADX INFO: renamed from: k4 */
    public static void m72906k4(com.aspose.slides.internal.p332p7.ehe eheVar, C10562nk c10562nk, gi8 gi8Var) {
        if (eheVar == null || eheVar.m31097kk() == null) {
            return;
        }
        if (eheVar.m31097kk().m40177k4() == null || eheVar.m31097kk().m40177k4().size() != 1) {
            throw new InvalidOperationException();
        }
        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) C7019kk.m27452k4((Object) eheVar.m31097kk().m40177k4().get_Item(0).m29542x1(), com.aspose.slides.internal.p332p7.rx0.class);
        if (rx0Var == null) {
            throw new InvalidOperationException();
        }
        if (rx0Var.m40596k4().m36317um() != 8) {
            throw new InvalidOperationException();
        }
        ubb.m71607k4(rx0Var.m40596k4(), c10562nk, 0);
        ubb.m71606k4(rx0Var.m40596k4(), c10562nk);
        vij.m72294k4(rx0Var.m40596k4().m36322wy(), c10562nk, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72907k4(C8967uo c8967uo, m4c m4cVar) {
        C10567nz c10567nz = (C10567nz) m4cVar.m64729ne();
        if (c10567nz == null || c10567nz.m51389to() == null || c10567nz.m51389to().m50999jd() == null) {
            return;
        }
        vij.m72297k4(c8967uo.m42512kk().m31093k4(), new C10562nk[]{c10567nz.m51389to().m50999jd()}, true, m4cVar);
    }
}
