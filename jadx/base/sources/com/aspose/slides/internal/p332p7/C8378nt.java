package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nt */
/* JADX INFO: loaded from: classes4.dex */
public class C8378nt extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f27564dy = new C7017h4("address1", "countryRegion", "adminDistrict1", "adminDistrict2", "postalCode", "locality", "isoCountryCode");

    /* JADX INFO: renamed from: du */
    private String f27565du;

    /* JADX INFO: renamed from: h4 */
    private String f27566h4;

    /* JADX INFO: renamed from: k4 */
    private String f27567k4;

    /* JADX INFO: renamed from: kk */
    private String f27568kk;

    /* JADX INFO: renamed from: m9 */
    private String f27569m9;

    /* JADX INFO: renamed from: to */
    private String f27570to;

    /* JADX INFO: renamed from: x1 */
    private String f27571x1;

    public C8378nt() {
    }

    public C8378nt(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8378nt.f27564dy.m27428k4(str)) {
                    case 0:
                        C8378nt.this.f27567k4 = str2;
                        break;
                    case 1:
                        C8378nt.this.f27571x1 = str2;
                        break;
                    case 2:
                        C8378nt.this.f27568kk = str2;
                        break;
                    case 3:
                        C8378nt.this.f27570to = str2;
                        break;
                    case 4:
                        C8378nt.this.f27565du = str2;
                        break;
                    case 5:
                        C8378nt.this.f27566h4 = str2;
                        break;
                    case 6:
                        C8378nt.this.f27569m9 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27567k4;
        if (str3 != null) {
            c3059ii.m12955x1("address1", str3);
        }
        String str4 = this.f27571x1;
        if (str4 != null) {
            c3059ii.m12955x1("countryRegion", str4);
        }
        String str5 = this.f27568kk;
        if (str5 != null) {
            c3059ii.m12955x1("adminDistrict1", str5);
        }
        String str6 = this.f27570to;
        if (str6 != null) {
            c3059ii.m12955x1("adminDistrict2", str6);
        }
        String str7 = this.f27565du;
        if (str7 != null) {
            c3059ii.m12955x1("postalCode", str7);
        }
        String str8 = this.f27566h4;
        if (str8 != null) {
            c3059ii.m12955x1("locality", str8);
        }
        String str9 = this.f27569m9;
        if (str9 != null) {
            c3059ii.m12955x1("isoCountryCode", str9);
        }
        c3059ii.mo21898jd();
    }
}
