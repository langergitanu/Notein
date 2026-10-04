package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7466d8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21558x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private byte f21559k4;

    public C7466d8() {
        m30239kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m30239kk() {
        this.f21559k4 = (byte) 30;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m30241k4() {
        return this.f21559k4;
    }

    public C7466d8(AbstractC13912i5 abstractC13912i5) {
        m30239kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.d8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7466d8.f21558x1.m27428k4(str) != 0) {
                    return false;
                }
                C7466d8.this.f21559k4 = C13850af.m65126rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30242k4(byte b) {
        this.f21559k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f21559k4;
        if ((b & 255) != 30) {
            c3059ii.m12955x1("val", C13850af.m65145x1(b));
        }
        c3059ii.mo21898jd();
    }
}
