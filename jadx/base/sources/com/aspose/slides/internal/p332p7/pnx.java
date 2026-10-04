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
import com.facebook.common.callercontext.ContextChain;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class pnx extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28507kk = new C7017h4("number", ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "soft-page-break");

    /* JADX INFO: renamed from: k4 */
    private String f28508k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f28509x1;

    public pnx() {
        m39027kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m39027kk() {
        this.f28509x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m39030k4() {
        return this.f28509x1;
    }

    public pnx(final AbstractC13912i5 abstractC13912i5) {
        m39027kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pnx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = pnx.f28507kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    pnx.this.f28508k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            pnx pnxVar = pnx.this;
                            pnxVar.f28508k4 = C14113y2.m67400k4(pnxVar.f28508k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), pnx.this.f28509x1);
                } else if (iM27428k4 == 2) {
                    pnx.this.f28509x1.addItem(new C7394ca(C18773h.f57233c, new kmn(abstractC13912i5)));
                } else if (iM27428k4 == 3) {
                    C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), pnx.this.f28509x1);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    pnx.this.f28509x1.addItem(new C7394ca("soft-page-break", new tfm(abstractC13912i5)));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39031k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f28507kk.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca(ContextChain.TAG_PRODUCT, new ok7());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca(C18773h.f57233c, new kmn());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("list", new lxj());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("soft-page-break", new tfm());
        }
        this.f28509x1.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        pnx pnxVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28508k4;
        if (str3 != null) {
            pnxVar = this;
            c3059ii2 = c3059ii;
            pnxVar.m29301k4("text", c3059ii2, "number", str3, false);
        } else {
            pnxVar = this;
            c3059ii2 = c3059ii;
        }
        List.Enumerator<C7394ca> it = pnxVar.f28509x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f28507kk.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((ok7) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((kmn) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((lxj) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 4) {
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
