package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zg */
/* JADX INFO: loaded from: classes4.dex */
public class C9365zg extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33879kk = new C7017h4("prst", "avLst");

    /* JADX INFO: renamed from: k4 */
    private int f33880k4;

    /* JADX INFO: renamed from: x1 */
    private C7733g6 f33881x1;

    public C9365zg() {
    }

    /* JADX INFO: renamed from: kk */
    public final C7733g6 m45600kk() {
        return this.f33881x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m45601x1() {
        return this.f33880k4;
    }

    public C9365zg(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9365zg.f33879kk.m27428k4(str) != 0) {
                    return false;
                }
                C9365zg.this.f33880k4 = C8574q3.m39320k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zg.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9365zg.f33879kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C9365zg.this.f33881x1 = new C7733g6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7733g6 m45598k4() {
        if (this.f33881x1 != null) {
            throw new Exception("Only one <avLst> element can be added.");
        }
        C7733g6 c7733g6 = new C7733g6();
        this.f33881x1 = c7733g6;
        return c7733g6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45599k4(int i) {
        this.f33880k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        c3059ii.m12955x1("prst", C8574q3.m39321k4(this.f33880k4));
        C7733g6 c7733g6 = this.f33881x1;
        if (c7733g6 != null) {
            c7733g6.mo6846k4("a", c3059ii, "avLst");
        }
        c3059ii.mo21898jd();
    }
}
