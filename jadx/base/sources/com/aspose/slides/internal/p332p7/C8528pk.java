package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pk */
/* JADX INFO: loaded from: classes4.dex */
public class C8528pk extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28449to = new C7017h4("r:embed", "name", "builtIn");

    /* JADX INFO: renamed from: k4 */
    private String f28450k4;

    /* JADX INFO: renamed from: kk */
    private boolean f28451kk;

    /* JADX INFO: renamed from: x1 */
    private String f28452x1;

    public C8528pk() {
        m38946du();
    }

    /* JADX INFO: renamed from: du */
    private void m38946du() {
        this.f28452x1 = "";
        this.f28451kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m38951k4() {
        return this.f28450k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m38954kk() {
        return this.f28451kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m38955x1() {
        return this.f28452x1;
    }

    public C8528pk(AbstractC13912i5 abstractC13912i5) {
        m38946du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8528pk.f28449to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8528pk.this.f28450k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8528pk.this.f28452x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8528pk.this.f28451kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38952k4(String str) {
        this.f28450k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38956x1(String str) {
        this.f28452x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:embed", this.f28450k4);
        if (!"".equals(this.f28452x1)) {
            c3059ii.m12955x1("name", this.f28452x1);
        }
        boolean z = this.f28451kk;
        if (z) {
            c3059ii.m12955x1("builtIn", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38953k4(boolean z) {
        this.f28451kk = z;
    }
}
