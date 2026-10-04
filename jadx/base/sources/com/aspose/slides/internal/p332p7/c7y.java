package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class c7y extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20948to = new C7017h4(C18437z2.f56754h, "val", "maxVal");

    /* JADX INFO: renamed from: k4 */
    private int f20949k4;

    /* JADX INFO: renamed from: kk */
    private double f20950kk;

    /* JADX INFO: renamed from: x1 */
    private double f20951x1;

    public c7y() {
        m29465x1();
    }

    public c7y(AbstractC13912i5 abstractC13912i5) {
        m29465x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c7y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = c7y.f20948to.m27428k4(str);
                if (iM27428k4 == 0) {
                    c7y.this.f20949k4 = myp.m37166k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    c7y.this.f20951x1 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                c7y.this.f20950kk = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m29465x1() {
        this.f20949k4 = 0;
        this.f20951x1 = Double.NaN;
        this.f20950kk = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, myp.m37167k4(this.f20949k4));
        if (!C14044b3.m66437kk(this.f20951x1)) {
            c3059ii.m12955x1("val", C13850af.m65101k4(this.f20951x1));
        }
        if (!C14044b3.m66437kk(this.f20950kk)) {
            c3059ii.m12955x1("maxVal", C13850af.m65101k4(this.f20950kk));
        }
        c3059ii.mo21898jd();
    }
}
