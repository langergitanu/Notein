package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class lp6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26463x1 = new C7017h4("notesMasterId");

    /* JADX INFO: renamed from: k4 */
    private sim f26464k4;

    public lp6() {
    }

    /* JADX INFO: renamed from: k4 */
    public final sim m36353k4() {
        if (this.f26464k4 != null) {
            throw new Exception("Only one <notesMasterId> element can be added.");
        }
        sim simVar = new sim();
        this.f26464k4 = simVar;
        return simVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final sim m36354x1() {
        return this.f26464k4;
    }

    public lp6(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lp6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (lp6.f26463x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                lp6.this.f26464k4 = new sim(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        sim simVar = this.f26464k4;
        if (simVar != null) {
            simVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "notesMasterId");
        }
        c3059ii.mo21898jd();
    }
}
