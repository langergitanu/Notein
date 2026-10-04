package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class kwh extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26006to = new C7017h4("Id", "SignedSignatureProperties", "SignedDataObjectProperties");

    /* JADX INFO: renamed from: k4 */
    private String f26007k4;

    /* JADX INFO: renamed from: kk */
    private u4f f26008kk;

    /* JADX INFO: renamed from: x1 */
    private gql f26009x1;

    public kwh() {
    }

    /* JADX INFO: renamed from: k4 */
    public final gql m35766k4() {
        if (this.f26009x1 != null) {
            throw new Exception("Only one <signedSignatureProperties> element can be added.");
        }
        gql gqlVar = new gql();
        this.f26009x1 = gqlVar;
        return gqlVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final u4f m35768x1() {
        if (this.f26008kk != null) {
            throw new Exception("Only one <signedDataObjectProperties> element can be added.");
        }
        u4f u4fVar = new u4f();
        this.f26008kk = u4fVar;
        return u4fVar;
    }

    public kwh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kwh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (kwh.f26006to.m27428k4(str) != 0) {
                    return false;
                }
                kwh.this.f26007k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kwh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = kwh.f26006to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    kwh.this.f26009x1 = new gql(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    kwh.this.f26008kk = new u4f(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35767k4(String str) {
        this.f26007k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26007k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        gql gqlVar = this.f26009x1;
        if (gqlVar != null) {
            gqlVar.mo6846k4("xd", c3059ii, "SignedSignatureProperties");
        }
        u4f u4fVar = this.f26008kk;
        if (u4fVar != null) {
            u4fVar.mo6846k4("xd", c3059ii, "SignedDataObjectProperties");
        }
        c3059ii.mo21898jd();
    }
}
