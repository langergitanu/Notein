package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.it */
/* JADX INFO: loaded from: classes4.dex */
public class C7956it extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24914x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private double f24915k4;

    public C7956it() {
        m34425kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m34425kk() {
        this.f24915k4 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m34427k4() {
        return this.f24915k4;
    }

    public C7956it(AbstractC13912i5 abstractC13912i5) {
        m34425kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.it.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7956it.f24914x1.m27428k4(str) != 0) {
                    return false;
                }
                C7956it.this.f24915k4 = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34428k4(double d) {
        this.f24915k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65101k4(this.f24915k4));
        c3059ii.mo21898jd();
    }
}
