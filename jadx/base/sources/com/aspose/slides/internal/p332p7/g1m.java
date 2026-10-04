package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class g1m extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23162du = new C7017h4(C18437z2.f56754h, "side", "anchorx", "anchory");

    /* JADX INFO: renamed from: k4 */
    private int f23163k4;

    /* JADX INFO: renamed from: kk */
    private int f23164kk;

    /* JADX INFO: renamed from: to */
    private int f23165to;

    /* JADX INFO: renamed from: x1 */
    private int f23166x1;

    public g1m() {
        m32238x1();
    }

    public g1m(AbstractC13912i5 abstractC13912i5) {
        m32238x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g1m.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = g1m.f23162du.m27428k4(str);
                if (iM27428k4 == 0) {
                    g1m.this.f23163k4 = xo1.m44557k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    g1m.this.f23166x1 = mr1.m37071k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    g1m.this.f23164kk = iwh.m34504k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                g1m.this.f23165to = lvu.m36469k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m32238x1() {
        this.f23163k4 = 0;
        this.f23166x1 = 0;
        this.f23164kk = 0;
        this.f23165to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23163k4;
        if (i != 0) {
            c3059ii.m12955x1(C18437z2.f56754h, xo1.m44558k4(i));
        }
        int i2 = this.f23166x1;
        if (i2 != 0) {
            c3059ii.m12955x1("side", mr1.m37072k4(i2));
        }
        int i3 = this.f23164kk;
        if (i3 != 0) {
            c3059ii.m12955x1("anchorx", iwh.m34505k4(i3));
        }
        int i4 = this.f23165to;
        if (i4 != 0) {
            c3059ii.m12955x1("anchory", lvu.m36470k4(i4));
        }
        c3059ii.mo21898jd();
    }
}
