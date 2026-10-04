package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class gql extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23678du = new C7017h4("Id", "SigningTime", "SigningCertificate", "SignaturePolicyIdentifier");

    /* JADX INFO: renamed from: k4 */
    private String f23679k4;

    /* JADX INFO: renamed from: kk */
    private gxi f23680kk;

    /* JADX INFO: renamed from: to */
    private ioc f23681to;

    /* JADX INFO: renamed from: x1 */
    private String f23682x1;

    public gql() {
    }

    /* JADX INFO: renamed from: k4 */
    public final gxi m32835k4() {
        if (this.f23680kk != null) {
            throw new Exception("Only one <signingCertificate> element can be added.");
        }
        gxi gxiVar = new gxi();
        this.f23680kk = gxiVar;
        return gxiVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final ioc m32837x1() {
        if (this.f23681to != null) {
            throw new Exception("Only one <signaturePolicyIdentifier> element can be added.");
        }
        ioc iocVar = new ioc();
        this.f23681to = iocVar;
        return iocVar;
    }

    public gql(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gql.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (gql.f23678du.m27428k4(str) != 0) {
                    return false;
                }
                gql.this.f23679k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gql.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = gql.f23678du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    gql.this.f23682x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gql gqlVar = gql.this;
                            gqlVar.f23682x1 = C14113y2.m67400k4(gqlVar.f23682x1, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 2) {
                    gql.this.f23680kk = new gxi(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    gql.this.f23681to = new ioc(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32836k4(String str) {
        this.f23682x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        gql gqlVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23679k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        String str4 = this.f23682x1;
        if (str4 != null) {
            gqlVar = this;
            c3059ii2 = c3059ii;
            gqlVar.m29301k4("xd", c3059ii2, "SigningTime", str4, false);
        } else {
            gqlVar = this;
            c3059ii2 = c3059ii;
        }
        gxi gxiVar = gqlVar.f23680kk;
        if (gxiVar != null) {
            gxiVar.mo6846k4("xd", c3059ii2, "SigningCertificate");
        }
        ioc iocVar = gqlVar.f23681to;
        if (iocVar != null) {
            iocVar.mo6846k4("xd", c3059ii2, "SignaturePolicyIdentifier");
        }
        c3059ii2.mo21898jd();
    }
}
