package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.c8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7389c8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f20953c5 = new C7017h4("entityName", "entityId", "east", "west", "north", "south", "geoPolygons", "copyrights");

    /* JADX INFO: renamed from: du */
    private double f20954du;

    /* JADX INFO: renamed from: dy */
    private C8933ua f20955dy;

    /* JADX INFO: renamed from: h4 */
    private double f20956h4;

    /* JADX INFO: renamed from: k4 */
    private String f20957k4;

    /* JADX INFO: renamed from: kk */
    private double f20958kk;

    /* JADX INFO: renamed from: m9 */
    private C9010v9 f20959m9;

    /* JADX INFO: renamed from: to */
    private double f20960to;

    /* JADX INFO: renamed from: x1 */
    private String f20961x1;

    public C7389c8() {
        m29475x1();
    }

    public C7389c8(final AbstractC13912i5 abstractC13912i5) {
        m29475x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7389c8.f20953c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7389c8.this.f20957k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7389c8.this.f20961x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7389c8.this.f20958kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7389c8.this.f20960to = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7389c8.this.f20954du = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7389c8.this.f20956h4 = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7389c8.f20953c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    C7389c8.this.f20959m9 = new C9010v9(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                C7389c8.this.f20955dy = new C8933ua(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m29475x1() {
        this.f20958kk = Double.NaN;
        this.f20960to = Double.NaN;
        this.f20954du = Double.NaN;
        this.f20956h4 = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("entityName", this.f20957k4);
        c3059ii.m12955x1("entityId", this.f20961x1);
        c3059ii.m12955x1("east", C13850af.m65101k4(this.f20958kk));
        c3059ii.m12955x1("west", C13850af.m65101k4(this.f20960to));
        c3059ii.m12955x1("north", C13850af.m65101k4(this.f20954du));
        c3059ii.m12955x1("south", C13850af.m65101k4(this.f20956h4));
        C9010v9 c9010v9 = this.f20959m9;
        if (c9010v9 != null) {
            c9010v9.mo6846k4("cx", c3059ii, "geoPolygons");
        }
        C8933ua c8933ua = this.f20955dy;
        if (c8933ua != null) {
            c8933ua.mo6846k4("cx", c3059ii, "copyrights");
        }
        c3059ii.mo21898jd();
    }
}
