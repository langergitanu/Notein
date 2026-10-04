package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class tbt extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f30672k4 = de9.m30306k4("pending");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f30673up = new C7017h4("table:type", "table:position", "table:table", "table:multi-deletion-spanned", "table:id", "table:acceptance-state", "table:rejecting-change-id", "change-info", "dependencies", "deletions", "cut-offs");

    /* JADX INFO: renamed from: c5 */
    private nn2 f30674c5;

    /* JADX INFO: renamed from: ck */
    private hhj f30675ck;

    /* JADX INFO: renamed from: du */
    private int f30676du;

    /* JADX INFO: renamed from: dy */
    private String f30677dy;

    /* JADX INFO: renamed from: fa */
    private aph f30678fa;

    /* JADX INFO: renamed from: h4 */
    private String f30679h4;

    /* JADX INFO: renamed from: jd */
    private s2v f30680jd;

    /* JADX INFO: renamed from: kk */
    private int f30681kk;

    /* JADX INFO: renamed from: m9 */
    private int f30682m9;

    /* JADX INFO: renamed from: to */
    private int f30683to;

    /* JADX INFO: renamed from: x1 */
    private int f30684x1;

    public tbt() {
        m41661x1();
        this.f30674c5 = new nn2();
    }

    public tbt(final AbstractC13912i5 abstractC13912i5) {
        m41661x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tbt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (tbt.f30673up.m27428k4(str)) {
                    case 0:
                        tbt.this.f30684x1 = tnt.m41814k4(str2);
                        break;
                    case 1:
                        tbt.this.f30681kk = C13850af.m65151yj(str2);
                        break;
                    case 2:
                        tbt.this.f30683to = C13850af.m65151yj(str2);
                        break;
                    case 3:
                        tbt.this.f30676du = C13850af.m65151yj(str2);
                        break;
                    case 4:
                        tbt.this.f30679h4 = str2;
                        break;
                    case 5:
                        tbt.this.f30682m9 = de9.m30306k4(str2);
                        break;
                    case 6:
                        tbt.this.f30677dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tbt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (tbt.f30673up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 7:
                        tbt.this.f30674c5 = new nn2(abstractC13912i5);
                        return true;
                    case 8:
                        tbt.this.f30680jd = new s2v(abstractC13912i5);
                        return true;
                    case 9:
                        tbt.this.f30675ck = new hhj(abstractC13912i5);
                        return true;
                    case 10:
                        tbt.this.f30678fa = new aph(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41661x1() {
        this.f30684x1 = 0;
        this.f30683to = 0;
        this.f30676du = 0;
        this.f30682m9 = f30672k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:type", tnt.m41815k4(this.f30684x1));
        c3059ii.m12955x1("table:position", C13850af.m65103k4(this.f30681kk));
        int i = this.f30683to;
        if (i != 0) {
            c3059ii.m12955x1("table:table", C13850af.m65103k4(i));
        }
        int i2 = this.f30676du;
        if (i2 != 0) {
            c3059ii.m12955x1("table:multi-deletion-spanned", C13850af.m65103k4(i2));
        }
        c3059ii.m12955x1("table:id", this.f30679h4);
        int i3 = this.f30682m9;
        if (i3 != f30672k4) {
            c3059ii.m12955x1("table:acceptance-state", de9.m30307k4(i3));
        }
        String str3 = this.f30677dy;
        if (str3 != null) {
            c3059ii.m12955x1("table:rejecting-change-id", str3);
        }
        this.f30674c5.mo6846k4("office", c3059ii, "change-info");
        s2v s2vVar = this.f30680jd;
        if (s2vVar != null) {
            s2vVar.mo6846k4("table", c3059ii, "dependencies");
        }
        hhj hhjVar = this.f30675ck;
        if (hhjVar != null) {
            hhjVar.mo6846k4("table", c3059ii, "deletions");
        }
        aph aphVar = this.f30678fa;
        if (aphVar != null) {
            aphVar.mo6846k4("table", c3059ii, "cut-offs");
        }
        c3059ii.mo21898jd();
    }
}
