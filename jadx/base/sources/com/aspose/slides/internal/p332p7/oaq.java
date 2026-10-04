package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class oaq extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f27813k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f27814m9 = new C7017h4("xlink:href", "xlink:type", "xlink:show", "text:section-name", "text:filter-name");

    /* JADX INFO: renamed from: du */
    private String f27815du;

    /* JADX INFO: renamed from: h4 */
    private String f27816h4;

    /* JADX INFO: renamed from: kk */
    private int f27817kk;

    /* JADX INFO: renamed from: to */
    private int f27818to;

    /* JADX INFO: renamed from: x1 */
    private String f27819x1;

    public oaq() {
        m38129x1();
    }

    public oaq(AbstractC13912i5 abstractC13912i5) {
        m38129x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oaq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = oaq.f27814m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    oaq.this.f27819x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    oaq.this.f27817kk = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    oaq.this.f27818to = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    oaq.this.f27815du = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                oaq.this.f27816h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38129x1() {
        this.f27817kk = f27813k4;
        this.f27818to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27819x1;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i = this.f27817kk;
        if (i != f27813k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f27818to;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        String str4 = this.f27815du;
        if (str4 != null) {
            c3059ii.m12955x1("text:section-name", str4);
        }
        String str5 = this.f27816h4;
        if (str5 != null) {
            c3059ii.m12955x1("text:filter-name", str5);
        }
        c3059ii.mo21898jd();
    }
}
