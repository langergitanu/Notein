package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class odi extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27882to = new C7017h4("svg:offset", "svg:stop-color", "svg:stop-opacity");

    /* JADX INFO: renamed from: k4 */
    private String f27883k4;

    /* JADX INFO: renamed from: kk */
    private double f27884kk;

    /* JADX INFO: renamed from: x1 */
    private String f27885x1;

    public odi() {
        m38200x1();
    }

    public odi(AbstractC13912i5 abstractC13912i5) {
        m38200x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.odi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = odi.f27882to.m27428k4(str);
                if (iM27428k4 == 0) {
                    odi.this.f27883k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    odi.this.f27885x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                odi.this.f27884kk = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38200x1() {
        this.f27884kk = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("svg:offset", this.f27883k4);
        String str3 = this.f27885x1;
        if (str3 != null) {
            c3059ii.m12955x1("svg:stop-color", str3);
        }
        if (!C14044b3.m66437kk(this.f27884kk)) {
            c3059ii.m12955x1("svg:stop-opacity", C13850af.m65101k4(this.f27884kk));
        }
        c3059ii.mo21898jd();
    }
}
