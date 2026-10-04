package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class z4d extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f33725c5;

    /* JADX INFO: renamed from: du */
    private int f33726du;

    /* JADX INFO: renamed from: dy */
    private String f33727dy;

    /* JADX INFO: renamed from: h4 */
    private int f33728h4;

    /* JADX INFO: renamed from: jd */
    private C14077m4 f33729jd = new C14077m4();

    /* JADX INFO: renamed from: kk */
    private int f33730kk;

    /* JADX INFO: renamed from: m9 */
    private String f33731m9;

    /* JADX INFO: renamed from: to */
    private String f33732to;

    /* JADX INFO: renamed from: k4 */
    public static final int f33723k4 = eth.m31300k4("copy-all");

    /* JADX INFO: renamed from: x1 */
    public static final int f33724x1 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f33722ck = new C7017h4("table:mode", "table:table-name", "xlink:type", "xlink:actuate", "xlink:href", "table:filter-name", "table:filter-options", "table:refresh-delay");

    public z4d() {
        m45438x1();
    }

    public z4d(AbstractC13912i5 abstractC13912i5) {
        m45438x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z4d.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (z4d.f33722ck.m27428k4(str)) {
                    case 0:
                        z4d.this.f33730kk = eth.m31300k4(str2);
                        break;
                    case 1:
                        z4d.this.f33732to = str2;
                        break;
                    case 2:
                        z4d.this.f33726du = bhu.m28903k4(str2);
                        break;
                    case 3:
                        z4d.this.f33728h4 = x2a.m44176k4(str2);
                        break;
                    case 4:
                        z4d.this.f33731m9 = str2;
                        break;
                    case 5:
                        z4d.this.f33727dy = str2;
                        break;
                    case 6:
                        z4d.this.f33725c5 = str2;
                        break;
                    case 7:
                        AbstractC7361bz.m29294ks(str2).CloneTo(z4d.this.f33729jd);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45438x1() {
        this.f33730kk = f33723k4;
        this.f33726du = f33724x1;
        this.f33728h4 = 0;
        C14077m4.f47265kk.CloneTo(this.f33729jd);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33730kk;
        if (i != f33723k4) {
            c3059ii.m12955x1("table:mode", eth.m31301k4(i));
        }
        String str3 = this.f33732to;
        if (str3 != null) {
            c3059ii.m12955x1("table:table-name", str3);
        }
        int i2 = this.f33726du;
        if (i2 != f33724x1) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i2));
        }
        int i3 = this.f33728h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i3));
        }
        c3059ii.m12955x1("xlink:href", this.f33731m9);
        String str4 = this.f33727dy;
        if (str4 != null) {
            c3059ii.m12955x1("table:filter-name", str4);
        }
        String str5 = this.f33725c5;
        if (str5 != null) {
            c3059ii.m12955x1("table:filter-options", str5);
        }
        c3059ii.m12955x1("table:refresh-delay", AbstractC7361bz.m29288k4(this.f33729jd.Clone()));
        c3059ii.mo21898jd();
    }
}
