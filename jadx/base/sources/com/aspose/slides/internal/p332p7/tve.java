package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tve extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f30912du;

    /* JADX INFO: renamed from: h4 */
    private int f30913h4;

    /* JADX INFO: renamed from: kk */
    private String f30914kk;

    /* JADX INFO: renamed from: m9 */
    private int f30915m9;

    /* JADX INFO: renamed from: to */
    private String f30916to;

    /* JADX INFO: renamed from: x1 */
    private String f30917x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f30911k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f30910dy = new C7017h4("script:event-name", "script:language", "script:macro-name", "xlink:href", "xlink:type", "xlink:actuate");

    public tve() {
        m41956x1();
    }

    public tve(AbstractC13912i5 abstractC13912i5) {
        m41956x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tve.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tve.f30910dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    tve.this.f30917x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    tve.this.f30914kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    tve.this.f30916to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    tve.this.f30912du = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    tve.this.f30913h4 = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                tve.this.f30915m9 = x2a.m44176k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41956x1() {
        this.f30913h4 = f30911k4;
        this.f30915m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("script:event-name", this.f30917x1);
        c3059ii.m12955x1("script:language", this.f30914kk);
        String str3 = this.f30916to;
        if (str3 != null) {
            c3059ii.m12955x1("script:macro-name", str3);
        }
        String str4 = this.f30912du;
        if (str4 != null) {
            c3059ii.m12955x1("xlink:href", str4);
        }
        int i = this.f30913h4;
        if (i != f30911k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f30915m9;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
