package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class tif extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30760x1 = new C7017h4("bldP", "bldDgm", "bldOleChart", "bldGraphic");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f30761k4;

    public tif() {
        m41739kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m41739kk() {
        this.f30761k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m41741k4() {
        return this.f30761k4;
    }

    public tif(final AbstractC13912i5 abstractC13912i5) {
        m41739kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tif.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = tif.f30760x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c9d c9dVar = new c9d(abstractC13912i5);
                    list = tif.this.f30761k4;
                    c7394ca = new C7394ca("bldP", c9dVar);
                } else if (iM27428k4 == 1) {
                    lkb lkbVar = new lkb(abstractC13912i5);
                    list = tif.this.f30761k4;
                    c7394ca = new C7394ca("bldDgm", lkbVar);
                } else if (iM27428k4 == 2) {
                    ljk ljkVar = new ljk(abstractC13912i5);
                    list = tif.this.f30761k4;
                    c7394ca = new C7394ca("bldOleChart", ljkVar);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    kbh kbhVar = new kbh(abstractC13912i5);
                    list = tif.this.f30761k4;
                    c7394ca = new C7394ca("bldGraphic", kbhVar);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m41742k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f30760x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("bldP", new c9d());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("bldDgm", new lkb());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("bldOleChart", new ljk());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("bldGraphic", new kbh());
        }
        this.f30761k4.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41743k4(C7394ca c7394ca) {
        this.f30761k4.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f30761k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f30760x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((c9d) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((lkb) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((ljk) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((kbh) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
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
        c3059ii.mo21898jd();
    }
}
