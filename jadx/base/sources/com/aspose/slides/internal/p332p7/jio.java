package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class jio extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25148du = new C7017h4(C18437z2.f56754h, "val", "gte", "extLst");

    /* JADX INFO: renamed from: k4 */
    private int f25149k4;

    /* JADX INFO: renamed from: kk */
    private boolean f25150kk;

    /* JADX INFO: renamed from: to */
    private g3j f25151to;

    /* JADX INFO: renamed from: x1 */
    private String f25152x1;

    public jio() {
        m34717x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34717x1() {
        this.f25149k4 = 0;
        this.f25150kk = true;
    }

    public jio(final AbstractC13912i5 abstractC13912i5) {
        m34717x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jio.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jio.f25148du.m27428k4(str);
                if (iM27428k4 == 0) {
                    jio.this.f25149k4 = ih0.m34138k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    jio.this.f25152x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                jio.this.f25150kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jio.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (jio.f25148du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                jio.this.f25151to = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, ih0.m34139k4(this.f25149k4));
        String str3 = this.f25152x1;
        if (str3 != null) {
            c3059ii.m12955x1("val", str3);
        }
        boolean z = this.f25150kk;
        if (!z) {
            c3059ii.m12955x1("gte", z ? "1" : "0");
        }
        g3j g3jVar = this.f25151to;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
