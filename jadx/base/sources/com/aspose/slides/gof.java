package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7341br;
import com.aspose.slides.internal.p332p7.C9298yo;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes3.dex */
final class gof extends C7341br {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5294k4 = new C7017h4("clrMap");

    public gof() {
        super(false);
    }

    /* JADX INFO: renamed from: k4 */
    public static gof m6845k4(AbstractC13912i5 abstractC13912i5) {
        String strMo65023fa = abstractC13912i5.mo65023fa();
        if (abstractC13912i5.mo65048u4()) {
            return new gof();
        }
        gof gofVar = null;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (((z && !abstractC13912i5.mo65015ar()) || abstractC13912i5.mo65026h4()) && (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa))) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        if (f5294k4.m27428k4(abstractC13912i5.mo65023fa()) == 0) {
                            gofVar = new gof(abstractC13912i5);
                            break;
                        }
                        abstractC13912i5.mo65208bv();
                        z = true;
                    } else {
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        return gofVar == null ? new gof() : gofVar;
    }

    private gof(AbstractC13912i5 abstractC13912i5) {
        super(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.C7341br, com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        c3059ii.m12955x1("bg1", C9298yo.m45066k4(m29076k4()));
        c3059ii.m12955x1("tx1", C9298yo.m45066k4(m29086x1()));
        c3059ii.m12955x1("bg2", C9298yo.m45066k4(m29079kk()));
        c3059ii.m12955x1("tx2", C9298yo.m45066k4(m29083to()));
        c3059ii.m12955x1("accent1", C9298yo.m45066k4(m29066du()));
        c3059ii.m12955x1("accent2", C9298yo.m45066k4(m29072h4()));
        c3059ii.m12955x1("accent3", C9298yo.m45066k4(m29081m9()));
        c3059ii.m12955x1("accent4", C9298yo.m45066k4(m29068dy()));
        c3059ii.m12955x1("accent5", C9298yo.m45066k4(m29062c5()));
        c3059ii.m12955x1("accent6", C9298yo.m45066k4(m29074jd()));
        c3059ii.m12955x1("hlink", C9298yo.m45066k4(m29064ck()));
        c3059ii.m12955x1("folHlink", C9298yo.m45066k4(m29070fa()));
        c3059ii.mo21898jd();
    }
}
