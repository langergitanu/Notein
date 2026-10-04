package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p332p7.C7873hp;
import com.aspose.slides.internal.p332p7.C9062vr;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: renamed from: com.aspose.slides.xe */
/* JADX INFO: loaded from: classes3.dex */
class C14783xe extends ywb {
    public C14783xe(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73340k4(ICustomXmlPart iCustomXmlPart) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "datastoreItem".equals(m55443jd().mo65023fa())) {
                List list = new List();
                C7873hp c7873hp = new C7873hp(m55443jd());
                if (c7873hp.m33567kk() != null && c7873hp.m33567kk().m39505x1() != null) {
                    for (C9062vr c9062vr : c7873hp.m33567kk().m39505x1()) {
                        list.addItem(c9062vr.m43226k4());
                    }
                }
                CustomXmlPart customXmlPart = (CustomXmlPart) iCustomXmlPart;
                customXmlPart.m1281k4(c7873hp.m33568x1().Clone());
                customXmlPart.m1282k4((String[]) list.toArray(new String[0]));
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73341x1(ICustomXmlPart iCustomXmlPart) {
        mo55332up();
        C7873hp c7873hp = new C7873hp();
        c7873hp.m33566k4(((CustomXmlPart) iCustomXmlPart).m1279k4().Clone());
        if (c7873hp.m33567kk() == null) {
            c7873hp.m33565k4();
        }
        for (String str : iCustomXmlPart.getNamespaceSchemas()) {
            c7873hp.m33567kk().m39504k4().m43227k4(str);
        }
        c7873hp.mo6846k4(null, m55442ck(), "datastoreItem");
        mo55333yj();
    }

    public C14783xe(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }
}
