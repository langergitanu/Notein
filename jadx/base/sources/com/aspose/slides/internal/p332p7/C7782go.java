package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.go */
/* JADX INFO: loaded from: classes4.dex */
public class C7782go extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23566x1 = new C7017h4("rPr");

    /* JADX INFO: renamed from: k4 */
    private C9135ws f23567k4;

    public C7782go() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C9135ws m32692k4() {
        if (this.f23567k4 != null) {
            throw new Exception("Only one <rPr> element can be added.");
        }
        C9135ws c9135ws = new C9135ws();
        this.f23567k4 = c9135ws;
        return c9135ws;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9135ws m32693x1() {
        return this.f23567k4;
    }

    public C7782go(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.go.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7782go.f23566x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7782go.this.f23567k4 = new C9135ws(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9135ws c9135ws = this.f23567k4;
        if (c9135ws != null) {
            c9135ws.mo6846k4("a", c3059ii, "rPr");
        }
        c3059ii.mo21898jd();
    }
}
