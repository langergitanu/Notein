package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jof extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f25276du;

    /* JADX INFO: renamed from: kk */
    private int f25277kk;

    /* JADX INFO: renamed from: to */
    private String f25278to;

    /* JADX INFO: renamed from: x1 */
    private String f25279x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f25275k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25274h4 = new C7017h4("xlink:href", "xlink:type", "script:language");

    public jof() {
        m34856x1();
    }

    public jof(AbstractC13912i5 abstractC13912i5) {
        m34856x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jof.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jof.f25274h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    jof.this.f25279x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    jof.this.f25277kk = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                jof.this.f25278to = str2;
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f25274h4)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f25276du = C14113y2.m67400k4(this.f25276du, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m34856x1() {
        this.f25277kk = f25275k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25279x1;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i = this.f25277kk;
        if (i != f25275k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        String str4 = this.f25278to;
        if (str4 != null) {
            c3059ii.m12955x1("script:language", str4);
        }
        String str5 = this.f25276du;
        if (str5 != null) {
            c3059ii.mo21918x1(str5);
        }
        c3059ii.mo21898jd();
    }
}
