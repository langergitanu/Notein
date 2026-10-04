package com.aspose.slides.internal.p332p7;

import OoooooO.C21445Oooo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class aq8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20173to = new C7017h4("text:start-value", "number", ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "soft-page-break");

    /* JADX INFO: renamed from: k4 */
    private long f20174k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f20175kk;

    /* JADX INFO: renamed from: x1 */
    private String f20176x1;

    public aq8() {
        m28413kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28413kk() {
        this.f20174k4 = 4294967295L;
        this.f20175kk = new List<>();
    }

    public aq8(final AbstractC13912i5 abstractC13912i5) {
        m28413kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.aq8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (aq8.f20173to.m27428k4(str) != 0) {
                    return false;
                }
                aq8.this.f20174k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.aq8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = aq8.f20173to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    aq8.this.f20176x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            aq8 aq8Var = aq8.this;
                            aq8Var.f20176x1 = C14113y2.m67400k4(aq8Var.f20176x1, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 2) {
                    C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), aq8.this.f20175kk);
                } else if (iM27428k4 == 3) {
                    aq8.this.f20175kk.addItem(new C7394ca(C18773h.f57233c, new kmn(abstractC13912i5)));
                } else if (iM27428k4 == 4) {
                    C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), aq8.this.f20175kk);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    aq8.this.f20175kk.addItem(new C7394ca("soft-page-break", new tfm(abstractC13912i5)));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m28416k4() {
        return this.f20175kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m28417k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f20173to.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca(ContextChain.TAG_PRODUCT, new ok7());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca(C18773h.f57233c, new kmn());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("list", new lxj());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("soft-page-break", new tfm());
        }
        this.f20175kk.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        aq8 aq8Var;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f20174k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:start-value", C13850af.m65147x1(j));
        }
        String str3 = this.f20176x1;
        if (str3 != null) {
            aq8Var = this;
            c3059ii2 = c3059ii;
            aq8Var.m29301k4("text", c3059ii2, "number", str3, false);
        } else {
            aq8Var = this;
            c3059ii2 = c3059ii;
        }
        List.Enumerator<C7394ca> it = aq8Var.f20175kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f20173to.m27428k4(next.m29539k4());
                if (iM27428k4 == 2) {
                    ((ok7) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((kmn) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((lxj) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((tfm) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii2.mo21898jd();
    }
}
