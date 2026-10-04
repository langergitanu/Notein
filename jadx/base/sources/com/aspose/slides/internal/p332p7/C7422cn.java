package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cn */
/* JADX INFO: loaded from: classes4.dex */
public class C7422cn extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21138x1 = new C7017h4("m:alnAt");

    /* JADX INFO: renamed from: k4 */
    private byte f21139k4;

    public C7422cn() {
        m29686kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m29686kk() {
        this.f21139k4 = (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m29688k4() {
        return this.f21139k4;
    }

    public C7422cn(AbstractC13912i5 abstractC13912i5) {
        m29686kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7422cn.f21138x1.m27428k4(str) != 0) {
                    return false;
                }
                C7422cn.this.f21139k4 = C13850af.m65126rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29689k4(byte b) {
        this.f21139k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f21139k4;
        if ((b & 255) != 0) {
            c3059ii.m12955x1("m:alnAt", C13850af.m65145x1(b));
        }
        c3059ii.mo21898jd();
    }
}
