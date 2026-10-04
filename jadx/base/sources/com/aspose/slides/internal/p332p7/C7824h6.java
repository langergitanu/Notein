package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7824h6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f23930h4 = new C7017h4("latitude", "longitude", "entityName", "entityType", "address");

    /* JADX INFO: renamed from: du */
    private C8378nt f23931du;

    /* JADX INFO: renamed from: k4 */
    private double f23932k4;

    /* JADX INFO: renamed from: kk */
    private String f23933kk;

    /* JADX INFO: renamed from: to */
    private int f23934to;

    /* JADX INFO: renamed from: x1 */
    private double f23935x1;

    public C7824h6() {
        m33143x1();
    }

    public C7824h6(final AbstractC13912i5 abstractC13912i5) {
        m33143x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7824h6.f23930h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7824h6.this.f23932k4 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7824h6.this.f23935x1 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7824h6.this.f23933kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C7824h6.this.f23934to = C8798sr.m41220k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7824h6.f23930h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                C7824h6.this.f23931du = new C8378nt(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m33143x1() {
        this.f23932k4 = Double.NaN;
        this.f23935x1 = Double.NaN;
        this.f23934to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!C14044b3.m66437kk(this.f23932k4)) {
            c3059ii.m12955x1("latitude", C13850af.m65101k4(this.f23932k4));
        }
        if (!C14044b3.m66437kk(this.f23935x1)) {
            c3059ii.m12955x1("longitude", C13850af.m65101k4(this.f23935x1));
        }
        c3059ii.m12955x1("entityName", this.f23933kk);
        c3059ii.m12955x1("entityType", C8798sr.m41221k4(this.f23934to));
        C8378nt c8378nt = this.f23931du;
        if (c8378nt != null) {
            c8378nt.mo6846k4("cx", c3059ii, "address");
        }
        c3059ii.mo21898jd();
    }
}
