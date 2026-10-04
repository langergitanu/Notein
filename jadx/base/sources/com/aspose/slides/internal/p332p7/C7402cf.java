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
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cf */
/* JADX INFO: loaded from: classes4.dex */
public class C7402cf extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21048du = new C7017h4("formatCode", "ptCount", TranslateLanguage.PORTUGUESE, "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f21049k4;

    /* JADX INFO: renamed from: kk */
    private List<C9069vu> f21050kk;

    /* JADX INFO: renamed from: to */
    private C7683fo f21051to;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f21052x1;

    public C7402cf() {
        m29577dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m29577dy() {
        this.f21050kk = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C9069vu[] m29584du() {
        return this.f21050kk.toArray(new C9069vu[0]);
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC7414ck m29585h4() {
        return this.f21051to;
    }

    /* JADX INFO: renamed from: kk */
    public final String m29588kk() {
        return this.f21049k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8452ol m29589to() {
        return this.f21052x1;
    }

    public C7402cf(final AbstractC13912i5 abstractC13912i5) {
        m29577dy();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7402cf.f21048du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7402cf.this.f21049k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7402cf c7402cf = C7402cf.this;
                            c7402cf.f21049k4 = C14113y2.m67400k4(c7402cf.f21049k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C7402cf.this.f21052x1 = new C8452ol(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7402cf.this.f21050kk.addItem(new C9069vu(abstractC13912i5));
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7402cf.this.f21051to = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8452ol m29586k4() {
        if (this.f21052x1 != null) {
            throw new Exception("Only one <ptCount> element can be added.");
        }
        C8452ol c8452ol = new C8452ol();
        this.f21052x1 = c8452ol;
        return c8452ol;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9069vu m29590x1() {
        C9069vu c9069vu = new C9069vu();
        this.f21050kk.addItem(c9069vu);
        return c9069vu;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29587k4(String str) {
        this.f21049k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C7402cf c7402cf;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21049k4;
        if (str3 != null) {
            c7402cf = this;
            c3059ii2 = c3059ii;
            c7402cf.m29301k4("c", c3059ii2, "formatCode", str3, false);
        } else {
            c7402cf = this;
            c3059ii2 = c3059ii;
        }
        C8452ol c8452ol = c7402cf.f21052x1;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii2, "ptCount");
        }
        List.Enumerator<C9069vu> it = c7402cf.f21050kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii2, TranslateLanguage.PORTUGUESE);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C7683fo c7683fo = c7402cf.f21051to;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}
