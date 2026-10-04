package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class hbd extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24022x1 = new C7017h4("thruBlk");

    /* JADX INFO: renamed from: k4 */
    private boolean f24023k4;

    public hbd() {
        m33267kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m33267kk() {
        this.f24023k4 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f24023k4;
        if (z) {
            c3059ii.m12955x1("thruBlk", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    public hbd(AbstractC13912i5 abstractC13912i5) {
        m33267kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hbd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (hbd.f24022x1.m27428k4(str) != 0) {
                    return false;
                }
                hbd.this.f24023k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33269k4(boolean z) {
        this.f24023k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m33270k4() {
        return this.f24023k4;
    }
}
