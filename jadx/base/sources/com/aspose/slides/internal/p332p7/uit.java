package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class uit extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31303to = new C7017h4("tm", "fmla", "val");

    /* JADX INFO: renamed from: k4 */
    private String f31304k4;

    /* JADX INFO: renamed from: kk */
    private ijy f31305kk;

    /* JADX INFO: renamed from: x1 */
    private String f31306x1;

    public uit() {
        m42410h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m42410h4() {
        this.f31304k4 = "indefinite";
        this.f31306x1 = "";
    }

    /* JADX INFO: renamed from: k4 */
    public final ijy m42414k4() {
        if (this.f31305kk != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        ijy ijyVar = new ijy();
        this.f31305kk = ijyVar;
        return ijyVar;
    }

    /* JADX INFO: renamed from: kk */
    public final String m42416kk() {
        return this.f31306x1;
    }

    /* JADX INFO: renamed from: to */
    public final ijy m42417to() {
        return this.f31305kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m42418x1() {
        return this.f31304k4;
    }

    public uit(final AbstractC13912i5 abstractC13912i5) {
        m42410h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uit.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = uit.f31303to.m27428k4(str);
                if (iM27428k4 == 0) {
                    uit.this.f31304k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                uit.this.f31306x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uit.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (uit.f31303to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                uit.this.f31305kk = new ijy(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42419x1(String str) {
        this.f31306x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42415k4(String str) {
        this.f31304k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"indefinite".equals(this.f31304k4)) {
            c3059ii.m12955x1("tm", this.f31304k4);
        }
        if (!"".equals(this.f31306x1)) {
            c3059ii.m12955x1("fmla", this.f31306x1);
        }
        ijy ijyVar = this.f31305kk;
        if (ijyVar != null) {
            ijyVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "val");
        }
        c3059ii.mo21898jd();
    }
}
