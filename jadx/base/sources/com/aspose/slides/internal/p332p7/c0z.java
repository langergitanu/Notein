package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class c0z extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f20877du = new C7017h4("style:length", "style:lines", "style:distance", "style:style-name");

    /* JADX INFO: renamed from: k4 */
    private String f20878k4;

    /* JADX INFO: renamed from: kk */
    private String f20879kk;

    /* JADX INFO: renamed from: to */
    private String f20880to;

    /* JADX INFO: renamed from: x1 */
    private long f20881x1;

    public c0z() {
        m29386x1();
    }

    public c0z(AbstractC13912i5 abstractC13912i5) {
        m29386x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c0z.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = c0z.f20877du.m27428k4(str);
                if (iM27428k4 == 0) {
                    c0z.this.f20878k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    c0z.this.f20881x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    c0z.this.f20879kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                c0z.this.f20880to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m29386x1() {
        this.f20878k4 = "1";
        this.f20881x1 = 1L;
        this.f20879kk = "0cm";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"1".equals(this.f20878k4)) {
            c3059ii.m12955x1("style:length", this.f20878k4);
        }
        long j = this.f20881x1;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("style:lines", C13850af.m65147x1(j));
        }
        if (!"0cm".equals(this.f20879kk)) {
            c3059ii.m12955x1("style:distance", this.f20879kk);
        }
        String str3 = this.f20880to;
        if (str3 != null) {
            c3059ii.m12955x1("style:style-name", str3);
        }
        c3059ii.mo21898jd();
    }
}
