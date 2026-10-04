package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.i3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7903i3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24477x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private byte f24478k4;

    public C7903i3() {
        m33838kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m33838kk() {
        this.f24478k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m33840k4() {
        return this.f24478k4;
    }

    public C7903i3(AbstractC13912i5 abstractC13912i5) {
        m33838kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.i3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7903i3.f24477x1.m27428k4(str) != 0) {
                    return false;
                }
                C7903i3.this.f24478k4 = C8413o9.m38060k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33841k4(byte b) {
        this.f24478k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f24478k4;
        if (b != -1) {
            c3059ii.m12955x1("val", C8413o9.m38061k4(b));
        }
        c3059ii.mo21898jd();
    }
}
