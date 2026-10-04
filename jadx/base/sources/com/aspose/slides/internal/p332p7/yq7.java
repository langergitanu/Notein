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
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class yq7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33471x1 = new C7017h4("master-page", "handout-master", "layer-set");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f33472k4;

    public yq7() {
        m45092kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45092kk() {
        this.f33472k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m45094k4() {
        return this.f33472k4;
    }

    public yq7(final AbstractC13912i5 abstractC13912i5) {
        m45092kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yq7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = yq7.f33471x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    kia kiaVar = new kia(abstractC13912i5);
                    list = yq7.this.f33472k4;
                    c7394ca = new C7394ca("master-page", kiaVar);
                } else if (iM27428k4 == 1) {
                    xlm xlmVar = new xlm(abstractC13912i5);
                    list = yq7.this.f33472k4;
                    c7394ca = new C7394ca("handout-master", xlmVar);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    o5n o5nVar = new o5n(abstractC13912i5);
                    list = yq7.this.f33472k4;
                    c7394ca = new C7394ca("layer-set", o5nVar);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45095k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f33471x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("master-page", new kia());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("handout-master", new xlm());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("layer-set", new o5n());
        }
        this.f33472k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f33472k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f33471x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((kia) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((xlm) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((o5n) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
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
