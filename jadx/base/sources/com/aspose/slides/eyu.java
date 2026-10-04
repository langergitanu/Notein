package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes3.dex */
class eyu {
    /* JADX INFO: renamed from: k4 */
    public static void m5783k4(TextFrame textFrame, nh5 nh5Var, com.aspose.slides.internal.p332p7.aq8 aq8Var, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar, gga ggaVar) {
        gga ggaVar2;
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (aq8Var == null) {
            throw new ArgumentNullException("listItemElementData");
        }
        if (wgi.m72729k4(ContextChain.TAG_PRODUCT, aq8Var.m28416k4()).length >= 1) {
            yup.m74097k4(textFrame, nh5Var, aq8Var.m28416k4(), w7yVar, i, wxbVar, ggaVar);
            return;
        }
        Object[] objArrM72729k4 = wgi.m72729k4("list", aq8Var.m28416k4());
        if (objArrM72729k4.length > 0) {
            int i2 = 0;
            if (((com.aspose.slides.internal.p332p7.lxj) objArrM72729k4[0]).m36515to() != null) {
                ggaVar2 = ggaVar;
                mxr.m67789k4(textFrame, (com.aspose.slides.internal.p332p7.lxj) objArrM72729k4[0], w7yVar, wxbVar, ggaVar2);
            } else {
                ggaVar2 = ggaVar;
            }
            com.aspose.slides.internal.p332p7.aq8[] aq8VarArrM36511du = ((com.aspose.slides.internal.p332p7.lxj) objArrM72729k4[0]).m36511du();
            int length = aq8VarArrM36511du.length;
            while (i2 < length) {
                m5783k4(textFrame, nh5Var, aq8VarArrM36511du[i2], w7yVar, i + 1, wxbVar, ggaVar2);
                i2++;
                ggaVar2 = ggaVar;
            }
        }
    }
}
