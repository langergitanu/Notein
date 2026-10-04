package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class vah extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f31651du = new C7017h4("w_DxaOrig", "w_DyaOrig", "control");

    /* JADX INFO: renamed from: k4 */
    private long f31652k4;

    /* JADX INFO: renamed from: kk */
    private C8249m9 f31653kk;

    /* JADX INFO: renamed from: to */
    private slx f31654to;

    /* JADX INFO: renamed from: x1 */
    private long f31655x1;

    public vah() {
        m42846x1();
    }

    public vah(AbstractC13912i5 abstractC13912i5) {
        m42846x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vah.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = vah.f31651du.m27428k4(str);
                if (iM27428k4 == 0) {
                    vah.this.f31652k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                vah.this.f31655x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        if (f31651du.m27428k4(abstractC13912i5.mo65023fa()) == 2) {
                            this.f31654to = new slx(abstractC13912i5);
                            break;
                        } else {
                            this.f31653kk = new C8249m9(abstractC13912i5);
                            if (abstractC13912i5.mo65015ar()) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m42846x1() {
        this.f31652k4 = 4294967295L;
        this.f31655x1 = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f31652k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("w:dxaOrig", C13850af.m65147x1(j));
        }
        long j2 = this.f31655x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("w:dyaOrig", C13850af.m65147x1(j2));
        }
        C8249m9 c8249m9 = this.f31653kk;
        if (c8249m9 != null) {
            c8249m9.mo6846k4("", c3059ii, "");
        }
        slx slxVar = this.f31654to;
        if (slxVar != null) {
            slxVar.mo6846k4("w", c3059ii, "control");
        }
        c3059ii.mo21898jd();
    }
}
