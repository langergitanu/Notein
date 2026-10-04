package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ld2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26195kk = new C7017h4("locked", "hidden");

    /* JADX INFO: renamed from: k4 */
    private byte f26196k4;

    /* JADX INFO: renamed from: x1 */
    private byte f26197x1;

    public ld2() {
        m35998x1();
    }

    public ld2(AbstractC13912i5 abstractC13912i5) {
        m35998x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ld2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ld2.f26195kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    ld2.this.f26196k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                ld2.this.f26197x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35998x1() {
        this.f26196k4 = (byte) -1;
        this.f26197x1 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f26196k4;
        if (b != -1) {
            c3059ii.m12955x1("locked", b == 1 ? "1" : "0");
        }
        byte b2 = this.f26197x1;
        if (b2 != -1) {
            c3059ii.m12955x1("hidden", b2 == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
