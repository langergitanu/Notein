package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class uan {
    /* JADX INFO: renamed from: k4 */
    public static void m71588k4(TextFrame textFrame, nh5 nh5Var, com.aspose.slides.internal.p332p7.lxj lxjVar, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar, gga ggaVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (lxjVar == null) {
            throw new ArgumentNullException("listElementData");
        }
        for (com.aspose.slides.internal.p332p7.aq8 aq8Var : lxjVar.m36511du()) {
            eyu.m5783k4(textFrame, nh5Var, aq8Var, w7yVar, i, wxbVar, ggaVar);
        }
    }
}
