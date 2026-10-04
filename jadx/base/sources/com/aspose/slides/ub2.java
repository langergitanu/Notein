package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C9231xt;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class ub2 extends ywb {
    public ub2(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71591k4(ITagCollection iTagCollection) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "tagLst".equals(m55443jd().mo65023fa())) {
                for (com.aspose.slides.internal.p332p7.egt egtVar : new C9231xt(m55443jd()).m44630x1()) {
                    iTagCollection.add(egtVar.m31076k4(), egtVar.m31078x1());
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71592x1(ITagCollection iTagCollection) {
        mo55332up();
        C9231xt c9231xt = new C9231xt();
        for (String str : iTagCollection.getNamesOfTags()) {
            com.aspose.slides.internal.p332p7.egt egtVarM44629k4 = c9231xt.m44629k4();
            egtVarM44629k4.m31077k4(str);
            egtVarM44629k4.m31079x1(iTagCollection.get_Item(str));
        }
        c9231xt.mo6846k4(null, m55442ck(), "tagLst");
        mo55333yj();
    }

    public ub2(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }
}
