package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class bsv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20690kk = new C7017h4("svg:width", "chart:style-name");

    /* JADX INFO: renamed from: k4 */
    private String f20691k4;

    /* JADX INFO: renamed from: x1 */
    private String f20692x1;

    public bsv() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29110k4() {
        return this.f20692x1;
    }

    public bsv(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bsv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bsv.f20690kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    bsv.this.f20691k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bsv.this.f20692x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20691k4;
        if (str3 != null) {
            c3059ii.m12955x1("svg:width", str3);
        }
        String str4 = this.f20692x1;
        if (str4 != null) {
            c3059ii.m12955x1("chart:style-name", str4);
        }
        c3059ii.mo21898jd();
    }
}
