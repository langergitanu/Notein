package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class vsk extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31991x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private int f31992k4;

    public vsk() {
        m43239kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m43239kk() {
        this.f31992k4 = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m43241k4() {
        return this.f31992k4;
    }

    public vsk(AbstractC13912i5 abstractC13912i5) {
        m43239kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vsk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (vsk.f31991x1.m27428k4(str) != 0) {
                    return false;
                }
                vsk.this.f31992k4 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43242k4(int i) {
        this.f31992k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65103k4(this.f31992k4));
        c3059ii.mo21898jd();
    }
}
