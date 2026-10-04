package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8494p7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28231x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private byte f28232k4;

    public C8494p7() {
        m38626kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m38626kk() {
        this.f28232k4 = (byte) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m38628k4() {
        return this.f28232k4;
    }

    public C8494p7(AbstractC13912i5 abstractC13912i5) {
        m38626kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8494p7.f28231x1.m27428k4(str) != 0) {
                    return false;
                }
                C8494p7.this.f28232k4 = C13850af.m65126rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38629k4(byte b) {
        this.f28232k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65145x1(this.f28232k4));
        c3059ii.mo21898jd();
    }
}
