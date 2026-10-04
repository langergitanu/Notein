package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class kvo extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25997x1 = new C7017h4("handoutMasterId");

    /* JADX INFO: renamed from: k4 */
    private tsw f25998k4;

    public kvo() {
    }

    /* JADX INFO: renamed from: k4 */
    public final tsw m35750k4() {
        if (this.f25998k4 != null) {
            throw new Exception("Only one <handoutMasterId> element can be added.");
        }
        tsw tswVar = new tsw();
        this.f25998k4 = tswVar;
        return tswVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final tsw m35751x1() {
        return this.f25998k4;
    }

    public kvo(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kvo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (kvo.f25997x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                kvo.this.f25998k4 = new tsw(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        tsw tswVar = this.f25998k4;
        if (tswVar != null) {
            tswVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "handoutMasterId");
        }
        c3059ii.mo21898jd();
    }
}
