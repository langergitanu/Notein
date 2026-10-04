package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.s6 */
/* JADX INFO: loaded from: classes4.dex */
public class C8743s6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f29935du;

    /* JADX INFO: renamed from: kk */
    private int f29936kk;

    /* JADX INFO: renamed from: to */
    private String f29937to;

    /* JADX INFO: renamed from: x1 */
    private String f29938x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f29934k4 = C8485oz.m38541k4("unknown");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f29933h4 = new C7017h4("xml:id", "mappingType", "mappingRef");

    public C8743s6() {
        m40803x1();
    }

    public C8743s6(AbstractC13912i5 abstractC13912i5) {
        m40803x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8743s6.f29933h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8743s6.this.f29938x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8743s6.this.f29936kk = C8485oz.m38541k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8743s6.this.f29937to = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f29933h4)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f29935du = C14113y2.m67400k4(this.f29935du, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m40803x1() {
        this.f29936kk = f29934k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29938x1;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        int i = this.f29936kk;
        if (i != f29934k4) {
            c3059ii.m12955x1("mappingType", C8485oz.m38542k4(i));
        }
        String str4 = this.f29937to;
        if (str4 != null) {
            c3059ii.m12955x1("mappingRef", str4);
        }
        String str5 = this.f29935du;
        if (str5 != null) {
            c3059ii.mo21918x1(str5);
        }
        c3059ii.mo21898jd();
    }
}
