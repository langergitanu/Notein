package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8594qb;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class yeb extends ywb {
    public yeb(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73860k4(IPresentation iPresentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "http://schemas.openxmlformats.org/presentationml/2006/main".equals(m55443jd().mo65050up()) && "viewPr".equals(m55443jd().mo65023fa())) {
                C8594qb c8594qb = new C8594qb(m55443jd());
                Presentation presentation = (Presentation) iPresentation;
                presentation.m2351fa().m68373k4(new n3i());
                n3i n3iVarM68386rv = presentation.m2351fa().m68386rv();
                if (c8594qb.m39442dy() != null && c8594qb.m39442dy().m32753k4() != null && c8594qb.m39442dy().m32753k4().m44282x1().length > 0) {
                    n3iVarM68386rv.m67863k4(new Dictionary<>());
                    for (com.aspose.slides.internal.p332p7.uty utyVar : c8594qb.m39442dy().m32753k4().m44282x1()) {
                        n3iVarM68386rv.m67865x1().addItem(mo3471m9().m6780jd().get_Item(mo3471m9().m55338u4().m55303k4(utyVar.m42555k4()).m55296x1().m55427x1()), Boolean.valueOf(utyVar.m42558x1()));
                    }
                }
                n3iVarM68386rv.m67864k4(c8594qb);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73861x1(IPresentation iPresentation) {
        mo55332up();
        n3i n3iVarM68386rv = ((Presentation) iPresentation).m2351fa().m68386rv();
        C8594qb c8594qbM67862k4 = n3iVarM68386rv.m67862k4();
        if (c8594qbM67862k4.m39442dy() != null) {
            c8594qbM67862k4.m39442dy().m32754k4((com.aspose.slides.internal.p332p7.xat) null);
            IGenericDictionary iGenericDictionaryM67865x1 = n3iVarM68386rv.m67865x1();
            if (iGenericDictionaryM67865x1 != null) {
                Dictionary.Enumerator<IBaseSlide, C11791os> it = mo3468h4().m71548kk().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (iGenericDictionaryM67865x1.containsKey(next.getKey())) {
                            if (c8594qbM67862k4.m39442dy().m32753k4() == null) {
                                c8594qbM67862k4.m39442dy().m32754k4(new com.aspose.slides.internal.p332p7.xat());
                            }
                            com.aspose.slides.internal.p332p7.uty utyVarM44281k4 = c8594qbM67862k4.m39442dy().m32753k4().m44281k4();
                            utyVarM44281k4.m42556k4(mo3468h4().m55433g8().m55311x1((C11791os) next.getValue()).m55289du());
                            utyVarM44281k4.m42557k4(((Boolean) iGenericDictionaryM67865x1.get_Item(next.getKey())).booleanValue());
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c8594qbM67862k4.mo6846k4(null, m55442ck(), "viewPr");
        mo55333yj();
    }

    public yeb(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }
}
