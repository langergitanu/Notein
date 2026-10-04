package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gh */
/* JADX INFO: loaded from: classes4.dex */
public class C7761gh extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23427du = new C7017h4("Id", "Manifest", "SignatureProperties", "QualifyingProperties");

    /* JADX INFO: renamed from: k4 */
    private String f23428k4;

    /* JADX INFO: renamed from: kk */
    private C8710rt f23429kk;

    /* JADX INFO: renamed from: to */
    private afk f23430to;

    /* JADX INFO: renamed from: x1 */
    private C8399o0 f23431x1;

    public C7761gh() {
    }

    /* JADX INFO: renamed from: du */
    public final C8399o0 m32523du() {
        return this.f23431x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8710rt m32524h4() {
        return this.f23429kk;
    }

    /* JADX INFO: renamed from: kk */
    public final afk m32527kk() {
        if (this.f23430to != null) {
            throw new Exception("Only one <qualifyingProperties> element can be added.");
        }
        afk afkVar = new afk();
        this.f23430to = afkVar;
        return afkVar;
    }

    /* JADX INFO: renamed from: to */
    public final String m32528to() {
        return this.f23428k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8710rt m32529x1() {
        if (this.f23429kk != null) {
            throw new Exception("Only one <signatureProperties> element can be added.");
        }
        C8710rt c8710rt = new C8710rt();
        this.f23429kk = c8710rt;
        return c8710rt;
    }

    public C7761gh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7761gh.f23427du.m27428k4(str) != 0) {
                    return false;
                }
                C7761gh.this.f23428k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7761gh.f23427du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7761gh.this.f23431x1 = new C8399o0(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7761gh.this.f23429kk = new C8710rt(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7761gh.this.f23430to = new afk(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8399o0 m32525k4() {
        if (this.f23431x1 != null) {
            throw new Exception("Only one <manifest> element can be added.");
        }
        C8399o0 c8399o0 = new C8399o0();
        this.f23431x1 = c8399o0;
        return c8399o0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32526k4(String str) {
        this.f23428k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23428k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        C8399o0 c8399o0 = this.f23431x1;
        if (c8399o0 != null) {
            c8399o0.mo6846k4("", c3059ii, "Manifest");
        }
        C8710rt c8710rt = this.f23429kk;
        if (c8710rt != null) {
            c8710rt.mo6846k4("", c3059ii, "SignatureProperties");
        }
        afk afkVar = this.f23430to;
        if (afkVar != null) {
            afkVar.mo6846k4("", c3059ii, "QualifyingProperties");
        }
        c3059ii.mo21898jd();
    }
}
