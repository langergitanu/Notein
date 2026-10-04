package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xx */
/* JADX INFO: loaded from: classes4.dex */
public class C9240xx extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33105to = new C7017h4("ptCount", "lvl", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8452ol f33106k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f33107kk;

    /* JADX INFO: renamed from: x1 */
    private List<C8329nd> f33108x1;

    public C9240xx() {
        m44697h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m44697h4() {
        this.f33108x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C8452ol m44702kk() {
        return this.f33106k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8329nd[] m44703to() {
        return this.f33108x1.toArray(new C8329nd[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C8329nd m44704x1() {
        C8329nd c8329nd = new C8329nd();
        this.f33108x1.addItem(c8329nd);
        return c8329nd;
    }

    public C9240xx(final AbstractC13912i5 abstractC13912i5) {
        m44697h4();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9240xx.f33105to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9240xx.this.f33106k4 = new C8452ol(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9240xx.this.f33108x1.addItem(new C8329nd(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9240xx.this.f33107kk = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8452ol m44701k4() {
        if (this.f33106k4 != null) {
            throw new Exception("Only one <ptCount> element can be added.");
        }
        C8452ol c8452ol = new C8452ol();
        this.f33106k4 = c8452ol;
        return c8452ol;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8452ol c8452ol = this.f33106k4;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii, "ptCount");
        }
        List.Enumerator<C8329nd> it = this.f33108x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "lvl");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7683fo c7683fo = this.f33107kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
