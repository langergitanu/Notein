package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oc */
/* JADX INFO: loaded from: classes4.dex */
public final class C8426oc extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27871x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private byte f27872k4;

    public C8426oc() {
        this.f27872k4 = (byte) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m38179k4() {
        return this.f27872k4;
    }

    public C8426oc(AbstractC13912i5 abstractC13912i5) {
        this();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && f27871x1.m27428k4(AbstractC7361bz.m29293kk(abstractC13912i5)) == 0) {
                this.f27872k4 = C13850af.m65126rv(abstractC13912i5.mo65042rv());
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38180k4(byte b) {
        this.f27872k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65145x1(this.f27872k4));
        c3059ii.mo21898jd();
    }
}
