package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class nn2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27476to = new C7017h4("creator", "date", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: k4 */
    private String f27477k4;

    /* JADX INFO: renamed from: kk */
    private List<ok7> f27478kk;

    /* JADX INFO: renamed from: x1 */
    private String f27479x1;

    public nn2() {
        m37733x1();
    }

    public nn2(final AbstractC13912i5 abstractC13912i5) {
        m37733x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nn2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = nn2.f27476to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    nn2.this.f27477k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            nn2 nn2Var = nn2.this;
                            nn2Var.f27477k4 = C14113y2.m67400k4(nn2Var.f27477k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    nn2.this.f27479x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            nn2 nn2Var2 = nn2.this;
                            nn2Var2.f27479x1 = C14113y2.m67400k4(nn2Var2.f27479x1, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    nn2.this.f27478kk.addItem(new ok7(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m37733x1() {
        this.f27478kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4(AzureActiveDirectorySlice.DC_PARAMETER, c3059ii, "creator", this.f27477k4, false);
        m29301k4(AzureActiveDirectorySlice.DC_PARAMETER, c3059ii, "date", this.f27479x1, false);
        List.Enumerator<ok7> it = this.f27478kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, ContextChain.TAG_PRODUCT);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
