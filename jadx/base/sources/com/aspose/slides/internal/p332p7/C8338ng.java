package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ng */
/* JADX INFO: loaded from: classes4.dex */
public class C8338ng extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27292x1 = new C7017h4("mcPr");

    /* JADX INFO: renamed from: k4 */
    private C9247xy f27293k4;

    public C8338ng() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C9247xy m37494k4() {
        if (this.f27293k4 != null) {
            throw new Exception("Only one <mcPr> element can be added.");
        }
        C9247xy c9247xy = new C9247xy();
        this.f27293k4 = c9247xy;
        return c9247xy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9247xy m37495x1() {
        return this.f27293k4;
    }

    public C8338ng(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ng.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8338ng.f27292x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8338ng.this.f27293k4 = new C9247xy(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9247xy c9247xy = this.f27293k4;
        if (c9247xy != null) {
            c9247xy.mo6846k4("m", c3059ii, "mcPr");
        }
        c3059ii.mo21898jd();
    }
}
