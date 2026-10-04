package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fl */
/* JADX INFO: loaded from: classes4.dex */
public class C7673fl extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f22846h4 = new C7017h4("countryRegion", "adminDistrict1", "adminDistrict2", "postalCode", "entityType");

    /* JADX INFO: renamed from: du */
    private int f22847du;

    /* JADX INFO: renamed from: k4 */
    private String f22848k4;

    /* JADX INFO: renamed from: kk */
    private String f22849kk;

    /* JADX INFO: renamed from: to */
    private String f22850to;

    /* JADX INFO: renamed from: x1 */
    private String f22851x1;

    public C7673fl() {
        m31827x1();
    }

    public C7673fl(AbstractC13912i5 abstractC13912i5) {
        m31827x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7673fl.f22846h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7673fl.this.f22848k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7673fl.this.f22851x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7673fl.this.f22849kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7673fl.this.f22850to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C7673fl.this.f22847du = C8798sr.m41220k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m31827x1() {
        this.f22847du = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22848k4;
        if (str3 != null) {
            c3059ii.m12955x1("countryRegion", str3);
        }
        String str4 = this.f22851x1;
        if (str4 != null) {
            c3059ii.m12955x1("adminDistrict1", str4);
        }
        String str5 = this.f22849kk;
        if (str5 != null) {
            c3059ii.m12955x1("adminDistrict2", str5);
        }
        String str6 = this.f22850to;
        if (str6 != null) {
            c3059ii.m12955x1("postalCode", str6);
        }
        c3059ii.m12955x1("entityType", C8798sr.m41221k4(this.f22847du));
        c3059ii.mo21898jd();
    }
}
