package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class k6w extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f25486du;

    /* JADX INFO: renamed from: kk */
    private String f25487kk;

    /* JADX INFO: renamed from: to */
    private int f25488to;

    /* JADX INFO: renamed from: x1 */
    private long f25489x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f25485k4 = xk2.m44457k4("visible");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25484h4 = new C7017h4("table:number-columns-repeated", "table:style-name", "table:visibility", "table:default-cell-style-name");

    public k6w() {
        m35164kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m35164kk() {
        this.f25489x1 = 1L;
        this.f25488to = f25485k4;
    }

    public k6w(AbstractC13912i5 abstractC13912i5) {
        m35164kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.k6w.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = k6w.f25484h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    k6w.this.f25489x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    k6w.this.f25487kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    k6w.this.f25488to = xk2.m44457k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                k6w.this.f25486du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35167k4() {
        return this.f25487kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35168k4(String str) {
        this.f25487kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f25489x1;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("table:number-columns-repeated", C13850af.m65147x1(j));
        }
        String str3 = this.f25487kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:style-name", str3);
        }
        int i = this.f25488to;
        if (i != f25485k4) {
            c3059ii.m12955x1("table:visibility", xk2.m44458k4(i));
        }
        String str4 = this.f25486du;
        if (str4 != null) {
            c3059ii.m12955x1("table:default-cell-style-name", str4);
        }
        c3059ii.mo21898jd();
    }
}
