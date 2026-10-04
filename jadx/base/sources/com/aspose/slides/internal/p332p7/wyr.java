package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class wyr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32648du = new C7017h4("wrapText", "distL", "distR", "wrapPolygon");

    /* JADX INFO: renamed from: k4 */
    private int f32649k4;

    /* JADX INFO: renamed from: kk */
    private long f32650kk;

    /* JADX INFO: renamed from: to */
    private cii f32651to;

    /* JADX INFO: renamed from: x1 */
    private long f32652x1;

    public wyr() {
        m44127x1();
        this.f32651to = new cii();
    }

    public wyr(final AbstractC13912i5 abstractC13912i5) {
        m44127x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wyr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wyr.f32648du.m27428k4(str);
                if (iM27428k4 == 0) {
                    wyr.this.f32649k4 = p2c.m38580k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    wyr.this.f32652x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                wyr.this.f32650kk = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wyr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (wyr.f32648du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                wyr.this.f32651to = new cii(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44127x1() {
        this.f32649k4 = 0;
        this.f32652x1 = 4294967295L;
        this.f32650kk = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("wrapText", p2c.m38581k4(this.f32649k4));
        long j = this.f32652x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distL", C13850af.m65147x1(j));
        }
        long j2 = this.f32650kk;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distR", C13850af.m65147x1(j2));
        }
        this.f32651to.mo6846k4("wp", c3059ii, "wrapPolygon");
        c3059ii.mo21898jd();
    }
}
