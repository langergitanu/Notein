package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kq */
/* JADX INFO: loaded from: classes4.dex */
public class C8122kq extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25899x1 = new C7017h4("blip");

    /* JADX INFO: renamed from: k4 */
    private C8401o2 f25900k4;

    public C8122kq() {
        this.f25900k4 = new C8401o2();
    }

    /* JADX INFO: renamed from: k4 */
    public final C8401o2 m35641k4() {
        return this.f25900k4;
    }

    public C8122kq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8122kq.f25899x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8122kq.this.f25900k4 = new C8401o2(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f25900k4.mo6846k4("a", c3059ii, "blip");
        c3059ii.mo21898jd();
    }
}
