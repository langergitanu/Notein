package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pm */
/* JADX INFO: loaded from: classes4.dex */
public class C8533pm extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28471kk = new C7017h4("pos", "algn");

    /* JADX INFO: renamed from: k4 */
    private double f28472k4;

    /* JADX INFO: renamed from: x1 */
    private int f28473x1;

    public C8533pm() {
        m38977to();
    }

    /* JADX INFO: renamed from: to */
    private void m38977to() {
        this.f28472k4 = Double.NaN;
        this.f28473x1 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m38978k4() {
        return this.f28472k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m38981x1() {
        return this.f28473x1;
    }

    public C8533pm(AbstractC13912i5 abstractC13912i5) {
        m38977to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8533pm.f28471kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8533pm.this.f28472k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8533pm.this.f28473x1 = C7807gx.m32975k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38979k4(double d) {
        this.f28472k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38980k4(int i) {
        this.f28473x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!C14044b3.m66437kk(this.f28472k4)) {
            c3059ii.m12955x1("pos", C22238OooO0oO.OooO00o(this.f28472k4, 12700.0d, 14));
        }
        int i = this.f28473x1;
        if (i != 0) {
            c3059ii.m12955x1("algn", C7807gx.m32976k4(i));
        }
        c3059ii.mo21898jd();
    }
}
