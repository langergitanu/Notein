package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class b6d extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f20426m9 = new C7017h4("text:table-name", "text:table-type", "text:database-name", "text:condition", "text:row-number", "connection-resource");

    /* JADX INFO: renamed from: du */
    private long f20427du;

    /* JADX INFO: renamed from: h4 */
    private r1l f20428h4;

    /* JADX INFO: renamed from: k4 */
    private String f20429k4;

    /* JADX INFO: renamed from: kk */
    private String f20430kk;

    /* JADX INFO: renamed from: to */
    private String f20431to;

    /* JADX INFO: renamed from: x1 */
    private int f20432x1;

    public b6d() {
        m28728x1();
    }

    public b6d(final AbstractC13912i5 abstractC13912i5) {
        m28728x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.b6d.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = b6d.f20426m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    b6d.this.f20429k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    b6d.this.f20432x1 = tgm.m41711k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    b6d.this.f20430kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    b6d.this.f20431to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                b6d.this.f20427du = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.b6d.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (b6d.f20426m9.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                b6d.this.f20428h4 = new r1l(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m28728x1() {
        this.f20432x1 = 0;
        this.f20427du = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:table-name", this.f20429k4);
        int i = this.f20432x1;
        if (i != 0) {
            c3059ii.m12955x1("text:table-type", tgm.m41712k4(i));
        }
        String str3 = this.f20430kk;
        if (str3 != null) {
            c3059ii.m12955x1("text:database-name", str3);
        }
        String str4 = this.f20431to;
        if (str4 != null) {
            c3059ii.m12955x1("text:condition", str4);
        }
        long j = this.f20427du;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:row-number", C13850af.m65147x1(j));
        }
        r1l r1lVar = this.f20428h4;
        if (r1lVar != null) {
            r1lVar.mo6846k4("form", c3059ii, "connection-resource");
        }
        c3059ii.mo21898jd();
    }
}
