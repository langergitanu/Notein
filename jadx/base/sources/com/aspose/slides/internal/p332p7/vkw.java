package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;

/* JADX INFO: loaded from: classes4.dex */
public class vkw extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private boolean f31908c5;

    /* JADX INFO: renamed from: ck */
    private boolean f31909ck;

    /* JADX INFO: renamed from: du */
    private int f31910du;

    /* JADX INFO: renamed from: dy */
    private int f31911dy;

    /* JADX INFO: renamed from: fa */
    private boolean f31912fa;

    /* JADX INFO: renamed from: h4 */
    private int f31913h4;

    /* JADX INFO: renamed from: ix */
    private String f31914ix;

    /* JADX INFO: renamed from: jd */
    private boolean f31915jd;

    /* JADX INFO: renamed from: ks */
    private String f31916ks;

    /* JADX INFO: renamed from: m9 */
    private int f31917m9;

    /* JADX INFO: renamed from: ne */
    private String f31918ne;

    /* JADX INFO: renamed from: rv */
    private String f31919rv;

    /* JADX INFO: renamed from: up */
    private String f31920up;

    /* JADX INFO: renamed from: x6 */
    private String f31921x6;

    /* JADX INFO: renamed from: yj */
    private String f31922yj;

    /* JADX INFO: renamed from: k4 */
    public static final int f31903k4 = jn2.m34846k4("none");

    /* JADX INFO: renamed from: x1 */
    public static final int f31907x1 = oen.m38222k4("stop");

    /* JADX INFO: renamed from: kk */
    public static final int f31904kk = pjq.m38944k4("noControl");

    /* JADX INFO: renamed from: to */
    public static final int f31905to = rhq.m40008k4("between");

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f31906u4 = new C7017h4(C18437z2.f56754h, "errorStyle", "imeMode", "operator", "allowBlank", "showDropDown", "showInputMessage", "showErrorMessage", "errorTitle", "error", "promptTitle", AuthenticationConstants.AAD.QUERY_PROMPT, "sqref", "formula1", "formula2");

    public vkw() {
        m43155x1();
    }

    public vkw(final AbstractC13912i5 abstractC13912i5) {
        m43155x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vkw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (vkw.f31906u4.m27428k4(str)) {
                    case 0:
                        vkw.this.f31910du = jn2.m34846k4(str2);
                        break;
                    case 1:
                        vkw.this.f31913h4 = oen.m38222k4(str2);
                        break;
                    case 2:
                        vkw.this.f31917m9 = pjq.m38944k4(str2);
                        break;
                    case 3:
                        vkw.this.f31911dy = rhq.m40008k4(str2);
                        break;
                    case 4:
                        vkw.this.f31908c5 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        vkw.this.f31915jd = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        vkw.this.f31909ck = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        vkw.this.f31912fa = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        vkw.this.f31920up = str2;
                        break;
                    case 9:
                        vkw.this.f31922yj = str2;
                        break;
                    case 10:
                        vkw.this.f31916ks = str2;
                        break;
                    case 11:
                        vkw.this.f31919rv = str2;
                        break;
                    case 12:
                        vkw.this.f31921x6 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vkw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = vkw.f31906u4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 13) {
                    vkw.this.f31918ne = abstractC13912i5.mo65052v4();
                    if (abstractC13912i5.mo65048u4()) {
                        return true;
                    }
                    while (abstractC13912i5.mo65028jd() != 15) {
                        abstractC13912i5.mo65026h4();
                        vkw vkwVar = vkw.this;
                        vkwVar.f31918ne = C14113y2.m67400k4(vkwVar.f31918ne, abstractC13912i5.mo65052v4());
                    }
                    return true;
                }
                if (iM27428k4 != 14) {
                    return false;
                }
                vkw.this.f31914ix = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    vkw vkwVar2 = vkw.this;
                    vkwVar2.f31914ix = C14113y2.m67400k4(vkwVar2.f31914ix, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m43155x1() {
        this.f31910du = f31903k4;
        this.f31913h4 = f31907x1;
        this.f31917m9 = f31904kk;
        this.f31911dy = f31905to;
        this.f31908c5 = false;
        this.f31915jd = false;
        this.f31909ck = false;
        this.f31912fa = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        vkw vkwVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31910du;
        if (i != f31903k4) {
            c3059ii.m12955x1(C18437z2.f56754h, jn2.m34847k4(i));
        }
        int i2 = this.f31913h4;
        if (i2 != f31907x1) {
            c3059ii.m12955x1("errorStyle", oen.m38223k4(i2));
        }
        int i3 = this.f31917m9;
        if (i3 != f31904kk) {
            c3059ii.m12955x1("imeMode", pjq.m38945k4(i3));
        }
        int i4 = this.f31911dy;
        if (i4 != f31905to) {
            c3059ii.m12955x1("operator", rhq.m40009k4(i4));
        }
        boolean z = this.f31908c5;
        if (z) {
            c3059ii.m12955x1("allowBlank", z ? "1" : "0");
        }
        boolean z2 = this.f31915jd;
        if (z2) {
            c3059ii.m12955x1("showDropDown", z2 ? "1" : "0");
        }
        boolean z3 = this.f31909ck;
        if (z3) {
            c3059ii.m12955x1("showInputMessage", z3 ? "1" : "0");
        }
        boolean z4 = this.f31912fa;
        if (z4) {
            c3059ii.m12955x1("showErrorMessage", z4 ? "1" : "0");
        }
        String str3 = this.f31920up;
        if (str3 != null) {
            c3059ii.m12955x1("errorTitle", str3);
        }
        String str4 = this.f31922yj;
        if (str4 != null) {
            c3059ii.m12955x1("error", str4);
        }
        String str5 = this.f31916ks;
        if (str5 != null) {
            c3059ii.m12955x1("promptTitle", str5);
        }
        String str6 = this.f31919rv;
        if (str6 != null) {
            c3059ii.m12955x1(AuthenticationConstants.AAD.QUERY_PROMPT, str6);
        }
        c3059ii.m12955x1("sqref", this.f31921x6);
        String str7 = this.f31918ne;
        if (str7 != null) {
            vkwVar = this;
            c3059ii2 = c3059ii;
            vkwVar.m29301k4("ssml", c3059ii2, "formula1", str7, true);
        } else {
            vkwVar = this;
            c3059ii2 = c3059ii;
        }
        String str8 = vkwVar.f31914ix;
        if (str8 != null) {
            vkwVar.m29301k4("ssml", c3059ii2, "formula2", str8, true);
        }
        c3059ii2.mo21898jd();
    }
}
