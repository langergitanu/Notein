package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.b0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7288b0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f20377jd = new C7017h4("alignWithMargins", "differentOddEven", "differentFirst", "oddHeader", "oddFooter", "evenHeader", "evenFooter", "firstHeader", "firstFooter");

    /* JADX INFO: renamed from: c5 */
    private String f20378c5;

    /* JADX INFO: renamed from: du */
    private String f20379du;

    /* JADX INFO: renamed from: dy */
    private String f20380dy;

    /* JADX INFO: renamed from: h4 */
    private String f20381h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f20382k4;

    /* JADX INFO: renamed from: kk */
    private boolean f20383kk;

    /* JADX INFO: renamed from: m9 */
    private String f20384m9;

    /* JADX INFO: renamed from: to */
    private String f20385to;

    /* JADX INFO: renamed from: x1 */
    private boolean f20386x1;

    public C7288b0() {
        m28677x1();
    }

    public C7288b0(final AbstractC13912i5 abstractC13912i5) {
        m28677x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.b0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7288b0.f20377jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7288b0.this.f20382k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7288b0.this.f20386x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7288b0.this.f20383kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.b0.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C7288b0.f20377jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        C7288b0.this.f20385to = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7288b0 c7288b0 = C7288b0.this;
                            c7288b0.f20385to = C14113y2.m67400k4(c7288b0.f20385to, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 4:
                        C7288b0.this.f20379du = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7288b0 c7288b02 = C7288b0.this;
                            c7288b02.f20379du = C14113y2.m67400k4(c7288b02.f20379du, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 5:
                        C7288b0.this.f20381h4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7288b0 c7288b03 = C7288b0.this;
                            c7288b03.f20381h4 = C14113y2.m67400k4(c7288b03.f20381h4, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 6:
                        C7288b0.this.f20384m9 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7288b0 c7288b04 = C7288b0.this;
                            c7288b04.f20384m9 = C14113y2.m67400k4(c7288b04.f20384m9, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 7:
                        C7288b0.this.f20380dy = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7288b0 c7288b05 = C7288b0.this;
                            c7288b05.f20380dy = C14113y2.m67400k4(c7288b05.f20380dy, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 8:
                        C7288b0.this.f20378c5 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7288b0 c7288b06 = C7288b0.this;
                            c7288b06.f20378c5 = C14113y2.m67400k4(c7288b06.f20378c5, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m28677x1() {
        this.f20382k4 = true;
        this.f20386x1 = false;
        this.f20383kk = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f20382k4;
        if (!z) {
            c3059ii.m12955x1("alignWithMargins", z ? "1" : "0");
        }
        boolean z2 = this.f20386x1;
        if (z2) {
            c3059ii.m12955x1("differentOddEven", z2 ? "1" : "0");
        }
        boolean z3 = this.f20383kk;
        if (z3) {
            c3059ii.m12955x1("differentFirst", z3 ? "1" : "0");
        }
        String str3 = this.f20385to;
        if (str3 != null) {
            m29301k4("cx", c3059ii, "oddHeader", str3, false);
        }
        String str4 = this.f20379du;
        if (str4 != null) {
            m29301k4("cx", c3059ii, "oddFooter", str4, false);
        }
        String str5 = this.f20381h4;
        if (str5 != null) {
            m29301k4("cx", c3059ii, "evenHeader", str5, false);
        }
        String str6 = this.f20384m9;
        if (str6 != null) {
            m29301k4("cx", c3059ii, "evenFooter", str6, false);
        }
        String str7 = this.f20380dy;
        if (str7 != null) {
            m29301k4("cx", c3059ii, "firstHeader", str7, false);
        }
        String str8 = this.f20378c5;
        if (str8 != null) {
            m29301k4("cx", c3059ii, "firstFooter", str8, false);
        }
        c3059ii.mo21898jd();
    }
}
