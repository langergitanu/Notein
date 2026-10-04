package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7499dn;

/* JADX INFO: loaded from: classes3.dex */
class yci {
    /* JADX INFO: renamed from: k4 */
    public static void m73854k4(kp9 kp9Var, AbstractC4685kk<C7499dn> abstractC4685kk, u8s u8sVar) {
        if (kp9Var.m64091k4() == -1) {
            return;
        }
        C7499dn c7499dnInvoke = abstractC4685kk.invoke();
        C0914ds.m5234k4(kp9Var.f45823k4, c7499dnInvoke.m30461k4());
        if (kp9Var.m64091k4() == 41) {
            u8sVar.m71545k4("PPT serialization of the presetTextShape of type TextShapeType.Custom is not implemented yet.", 2);
        } else {
            c7499dnInvoke.m30462k4(kp9Var.m64091k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73855k4(kp9 kp9Var, C7499dn c7499dn) {
        if (c7499dn == null) {
            return;
        }
        Dictionary<String, Integer>[] dictionaryArr = {kp9Var.f45826x1};
        kp9Var.f45823k4 = C0914ds.m5238k4(c7499dn.m30463kk(), (C13791lr[]) null, dictionaryArr);
        kp9Var.f45826x1 = dictionaryArr[0];
        kp9Var.m64092k4(c7499dn.m30464x1());
    }
}
