package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class az5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20341kk = new C7017h4(RequestParameters.POSITION, "color");

    /* JADX INFO: renamed from: k4 */
    private double f20342k4;

    /* JADX INFO: renamed from: x1 */
    private bz0 f20343x1;

    public az5() {
        m28635x1();
        this.f20343x1 = new bz0();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28635x1() {
        this.f20342k4 = Double.NaN;
    }

    public az5(final AbstractC13912i5 abstractC13912i5) {
        m28635x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.az5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (az5.f20341kk.m27428k4(str) != 0) {
                    return false;
                }
                az5.this.f20342k4 = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.az5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (az5.f20341kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                az5.this.f20343x1 = new bz0(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(RequestParameters.POSITION, C13850af.m65101k4(this.f20342k4));
        this.f20343x1.mo6846k4("ssml", c3059ii, "color");
        c3059ii.mo21898jd();
    }
}
