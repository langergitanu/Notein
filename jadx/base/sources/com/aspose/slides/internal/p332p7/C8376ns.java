package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ns */
/* JADX INFO: loaded from: classes4.dex */
public final class C8376ns extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27557x1 = new C7017h4("m:val");

    /* JADX INFO: renamed from: k4 */
    private char f27558k4;

    public C8376ns() {
        this.f27558k4 = (char) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final char m37838k4() {
        return this.f27558k4;
    }

    public C8376ns(AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ns.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8376ns.f27557x1.m27428k4(str) != 0) {
                    return false;
                }
                if (C14113y2.m67411k4(str2)) {
                    return true;
                }
                C8376ns.this.f27558k4 = C13850af.m65075jd(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37839k4(char c) {
        this.f27558k4 = c;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        char c = this.f27558k4;
        c3059ii.m12955x1("m:val", c != 0 ? C13850af.m65100k4(c) : "");
        c3059ii.mo21898jd();
    }
}
