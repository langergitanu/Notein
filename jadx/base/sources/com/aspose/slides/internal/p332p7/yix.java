package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class yix extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f33399k4 = nv2.m37864k4("solid");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f33400m9 = new C7017h4("style:style", "style:width", "style:height", "style:vertical-align", "style:color");

    /* JADX INFO: renamed from: du */
    private int f33401du;

    /* JADX INFO: renamed from: h4 */
    private String f33402h4;

    /* JADX INFO: renamed from: kk */
    private String f33403kk;

    /* JADX INFO: renamed from: to */
    private String f33404to;

    /* JADX INFO: renamed from: x1 */
    private int f33405x1;

    public yix() {
        m45028x1();
    }

    public yix(AbstractC13912i5 abstractC13912i5) {
        m45028x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yix.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yix.f33400m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    yix.this.f33405x1 = nv2.m37864k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    yix.this.f33403kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    yix.this.f33404to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    yix.this.f33401du = qnt.m39601k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                yix.this.f33402h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45028x1() {
        this.f33405x1 = f33399k4;
        this.f33404to = "100%";
        this.f33401du = 0;
        this.f33402h4 = "#000000";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33405x1;
        if (i != f33399k4) {
            c3059ii.m12955x1("style:style", nv2.m37865k4(i));
        }
        c3059ii.m12955x1("style:width", this.f33403kk);
        if (!"100%".equals(this.f33404to)) {
            c3059ii.m12955x1("style:height", this.f33404to);
        }
        c3059ii.m12955x1("style:vertical-align", qnt.m39602k4(this.f33401du));
        if (!"#000000".equals(this.f33402h4)) {
            c3059ii.m12955x1("style:color", this.f33402h4);
        }
        c3059ii.mo21898jd();
    }
}
