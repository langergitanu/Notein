package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class k3d extends AbstractC7361bz {

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f25442x6 = new C7017h4("name", "comment", "customMenu", "description", "help", "statusBar", "localSheetId", "hidden", "function", "vbProcedure", "xlm", "functionGroupId", "shortcutKey", "publishToServer", "workbookParameter");

    /* JADX INFO: renamed from: c5 */
    private boolean f25443c5;

    /* JADX INFO: renamed from: ck */
    private boolean f25444ck;

    /* JADX INFO: renamed from: du */
    private String f25445du;

    /* JADX INFO: renamed from: dy */
    private boolean f25446dy;

    /* JADX INFO: renamed from: fa */
    private long f25447fa;

    /* JADX INFO: renamed from: h4 */
    private String f25448h4;

    /* JADX INFO: renamed from: jd */
    private boolean f25449jd;

    /* JADX INFO: renamed from: k4 */
    private String f25450k4;

    /* JADX INFO: renamed from: kk */
    private String f25451kk;

    /* JADX INFO: renamed from: ks */
    private boolean f25452ks;

    /* JADX INFO: renamed from: m9 */
    private long f25453m9;

    /* JADX INFO: renamed from: rv */
    private String f25454rv;

    /* JADX INFO: renamed from: to */
    private String f25455to;

    /* JADX INFO: renamed from: up */
    private String f25456up;

    /* JADX INFO: renamed from: x1 */
    private String f25457x1;

    /* JADX INFO: renamed from: yj */
    private boolean f25458yj;

    public k3d() {
        m35107to();
    }

    public k3d(AbstractC13912i5 abstractC13912i5) {
        m35107to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.k3d.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (k3d.f25442x6.m27428k4(str)) {
                    case 0:
                        k3d.this.f25450k4 = str2;
                        break;
                    case 1:
                        k3d.this.f25457x1 = str2;
                        break;
                    case 2:
                        k3d.this.f25451kk = str2;
                        break;
                    case 3:
                        k3d.this.f25455to = str2;
                        break;
                    case 4:
                        k3d.this.f25445du = str2;
                        break;
                    case 5:
                        k3d.this.f25448h4 = str2;
                        break;
                    case 6:
                        k3d.this.f25453m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        k3d.this.f25446dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        k3d.this.f25443c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        k3d.this.f25449jd = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        k3d.this.f25444ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        k3d.this.f25447fa = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 12:
                        k3d.this.f25456up = str2;
                        break;
                    case 13:
                        k3d.this.f25458yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        k3d.this.f25452ks = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f25454rv = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: to */
    private void m35107to() {
        this.f25453m9 = 4294967295L;
        this.f25446dy = false;
        this.f25443c5 = false;
        this.f25449jd = false;
        this.f25444ck = false;
        this.f25447fa = 4294967295L;
        this.f25458yj = false;
        this.f25452ks = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35112k4() {
        return this.f25450k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35113x1() {
        return this.f25454rv;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f25450k4);
        String str3 = this.f25457x1;
        if (str3 != null) {
            c3059ii.m12955x1("comment", str3);
        }
        String str4 = this.f25451kk;
        if (str4 != null) {
            c3059ii.m12955x1("customMenu", str4);
        }
        String str5 = this.f25455to;
        if (str5 != null) {
            c3059ii.m12955x1("description", str5);
        }
        String str6 = this.f25445du;
        if (str6 != null) {
            c3059ii.m12955x1("help", str6);
        }
        String str7 = this.f25448h4;
        if (str7 != null) {
            c3059ii.m12955x1("statusBar", str7);
        }
        long j = this.f25453m9;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("localSheetId", C13850af.m65147x1(j));
        }
        boolean z = this.f25446dy;
        if (z) {
            c3059ii.m12955x1("hidden", z ? "1" : "0");
        }
        boolean z2 = this.f25443c5;
        if (z2) {
            c3059ii.m12955x1("function", z2 ? "1" : "0");
        }
        boolean z3 = this.f25449jd;
        if (z3) {
            c3059ii.m12955x1("vbProcedure", z3 ? "1" : "0");
        }
        boolean z4 = this.f25444ck;
        if (z4) {
            c3059ii.m12955x1("xlm", z4 ? "1" : "0");
        }
        long j2 = this.f25447fa;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("functionGroupId", C13850af.m65147x1(j2));
        }
        String str8 = this.f25456up;
        if (str8 != null) {
            c3059ii.m12955x1("shortcutKey", str8);
        }
        boolean z5 = this.f25458yj;
        if (z5) {
            c3059ii.m12955x1("publishToServer", z5 ? "1" : "0");
        }
        boolean z6 = this.f25452ks;
        if (z6) {
            c3059ii.m12955x1("workbookParameter", z6 ? "1" : "0");
        }
        c3059ii.mo21918x1(this.f25454rv);
        c3059ii.mo21898jd();
    }
}
