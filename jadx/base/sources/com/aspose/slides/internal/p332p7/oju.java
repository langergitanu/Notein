package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class oju extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private long f27984c5;

    /* JADX INFO: renamed from: du */
    private String f27985du;

    /* JADX INFO: renamed from: dy */
    private int f27986dy;

    /* JADX INFO: renamed from: h4 */
    private String f27987h4;

    /* JADX INFO: renamed from: kk */
    private boolean f27988kk;

    /* JADX INFO: renamed from: m9 */
    private long f27989m9;

    /* JADX INFO: renamed from: to */
    private int f27990to;

    /* JADX INFO: renamed from: k4 */
    public static final int f27982k4 = x6s.m44226k4("value");

    /* JADX INFO: renamed from: x1 */
    public static final int f27983x1 = x2o.m44178k4("3Arrows");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f27981jd = new C7017h4("descending", "sortBy", "ref", "customList", "dxfId", "iconSet", "iconId");

    public oju() {
        m38309x1();
    }

    public oju(AbstractC13912i5 abstractC13912i5) {
        m38309x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oju.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (oju.f27981jd.m27428k4(str)) {
                    case 0:
                        oju.this.f27988kk = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        oju.this.f27990to = x6s.m44226k4(str2);
                        break;
                    case 2:
                        oju.this.f27985du = str2;
                        break;
                    case 3:
                        oju.this.f27987h4 = str2;
                        break;
                    case 4:
                        oju.this.f27989m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        oju.this.f27986dy = x2o.m44178k4(str2);
                        break;
                    case 6:
                        oju.this.f27984c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38309x1() {
        this.f27988kk = false;
        this.f27990to = f27982k4;
        this.f27989m9 = 4294967295L;
        this.f27986dy = f27983x1;
        this.f27984c5 = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f27988kk;
        if (z) {
            c3059ii.m12955x1("descending", z ? "1" : "0");
        }
        int i = this.f27990to;
        if (i != f27982k4) {
            c3059ii.m12955x1("sortBy", x6s.m44227k4(i));
        }
        c3059ii.m12955x1("ref", this.f27985du);
        String str3 = this.f27987h4;
        if (str3 != null) {
            c3059ii.m12955x1("customList", str3);
        }
        long j = this.f27989m9;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("dxfId", C13850af.m65147x1(j));
        }
        int i2 = this.f27986dy;
        if (i2 != f27983x1) {
            c3059ii.m12955x1("iconSet", x2o.m44179k4(i2));
        }
        long j2 = this.f27984c5;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("iconId", C13850af.m65147x1(j2));
        }
        c3059ii.mo21898jd();
    }
}
