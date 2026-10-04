package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dz */
/* JADX INFO: loaded from: classes4.dex */
public class C7524dz extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21940to = new C7017h4("Id", "KeyName", "X509Data");

    /* JADX INFO: renamed from: k4 */
    private String f21941k4;

    /* JADX INFO: renamed from: kk */
    private C8053k3 f21942kk;

    /* JADX INFO: renamed from: x1 */
    private String f21943x1;

    public C7524dz() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8053k3 m30713k4() {
        if (this.f21942kk != null) {
            throw new Exception("Only one <x509Data> element can be added.");
        }
        C8053k3 c8053k3 = new C8053k3();
        this.f21942kk = c8053k3;
        return c8053k3;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8053k3 m30714x1() {
        return this.f21942kk;
    }

    public C7524dz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7524dz.f21940to.m27428k4(str) != 0) {
                    return false;
                }
                C7524dz.this.f21941k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7524dz.f21940to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7524dz.this.f21943x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7524dz c7524dz = C7524dz.this;
                            c7524dz.f21943x1 = C14113y2.m67400k4(c7524dz.f21943x1, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7524dz.this.f21942kk = new C8053k3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C7524dz c7524dz;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21941k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        String str4 = this.f21943x1;
        if (str4 != null) {
            c7524dz = this;
            c3059ii2 = c3059ii;
            c7524dz.m29301k4("", c3059ii2, "KeyName", str4, false);
        } else {
            c7524dz = this;
            c3059ii2 = c3059ii;
        }
        C8053k3 c8053k3 = c7524dz.f21942kk;
        if (c8053k3 != null) {
            c8053k3.mo6846k4("", c3059ii2, "X509Data");
        }
        c3059ii2.mo21898jd();
    }
}
