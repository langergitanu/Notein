package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ug */
/* JADX INFO: loaded from: classes4.dex */
public class C8952ug extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31271to = new C7017h4("bodyPr", "lstStyle", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: k4 */
    private C7360by f31272k4;

    /* JADX INFO: renamed from: kk */
    private List<C9233xu> f31273kk;

    /* JADX INFO: renamed from: x1 */
    private C8345ni f31274x1;

    public C8952ug() {
        m42371m9();
        this.f31272k4 = new C7360by();
    }

    /* JADX INFO: renamed from: m9 */
    private void m42371m9() {
        this.f31273kk = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C9233xu[] m42372du() {
        return this.f31273kk.toArray(new C9233xu[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final C7360by m42374kk() {
        return this.f31272k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8345ni m42375to() {
        return this.f31274x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9233xu m42376x1() {
        C9233xu c9233xu = new C9233xu();
        this.f31273kk.addItem(c9233xu);
        return c9233xu;
    }

    public C8952ug(final AbstractC13912i5 abstractC13912i5) {
        m42371m9();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ug.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8952ug.f31271to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8952ug.this.f31272k4 = new C7360by(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8952ug.this.f31274x1 = new C8345ni(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8952ug.this.f31273kk.addItem(new C9233xu(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8345ni m42373k4() {
        if (this.f31274x1 != null) {
            throw new Exception("Only one <lstStyle> element can be added.");
        }
        C8345ni c8345ni = new C8345ni();
        this.f31274x1 = c8345ni;
        return c8345ni;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f31272k4.mo6846k4("a", c3059ii, "bodyPr");
        C8345ni c8345ni = this.f31274x1;
        if (c8345ni != null) {
            c8345ni.mo6846k4("a", c3059ii, "lstStyle");
        }
        List.Enumerator<C9233xu> it = this.f31273kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, ContextChain.TAG_PRODUCT);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
