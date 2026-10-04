package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.i2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7902i2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24475x1 = new C7017h4("graphicData");

    /* JADX INFO: renamed from: k4 */
    private C9132wr f24476k4;

    public C7902i2() {
        this.f24476k4 = new C9132wr();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9132wr m33836k4() {
        return this.f24476k4;
    }

    public C7902i2(AbstractC13912i5 abstractC13912i5) {
        String strMo65023fa = abstractC13912i5.mo65023fa();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        while (true) {
            boolean zM67363du = false;
            while (true) {
                if ((!zM67363du || abstractC13912i5.mo65015ar()) && !abstractC13912i5.mo65026h4()) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (f24475x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                        throw new Exception(C14113y2.m67408k4("Unknown element \"", abstractC13912i5.mo65023fa(), "\""));
                    }
                    this.f24476k4 = new C9132wr(abstractC13912i5);
                    zM67363du = C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa);
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        this.f24476k4.mo6846k4("a", c3059ii, "graphicData");
        c3059ii.mo21898jd();
    }
}
