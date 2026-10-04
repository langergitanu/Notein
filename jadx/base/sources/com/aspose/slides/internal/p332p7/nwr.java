package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class nwr extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f27608k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f27609yj = new C7017h4("xlink:href", "xlink:type", "office:target-frame-name", "xlink:show", "office:name", "draw:nohref", "svg:cx", "svg:cy", "svg:r", NoteMeta.PROPERTY_TITLE, "desc", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private String f27610c5;

    /* JADX INFO: renamed from: ck */
    private String f27611ck;

    /* JADX INFO: renamed from: du */
    private int f27612du;

    /* JADX INFO: renamed from: dy */
    private String f27613dy;

    /* JADX INFO: renamed from: fa */
    private String f27614fa;

    /* JADX INFO: renamed from: h4 */
    private String f27615h4;

    /* JADX INFO: renamed from: jd */
    private String f27616jd;

    /* JADX INFO: renamed from: kk */
    private int f27617kk;

    /* JADX INFO: renamed from: m9 */
    private int f27618m9;

    /* JADX INFO: renamed from: to */
    private String f27619to;

    /* JADX INFO: renamed from: up */
    private hec f27620up;

    /* JADX INFO: renamed from: x1 */
    private String f27621x1;

    public nwr() {
        m37900x1();
    }

    public nwr(final AbstractC13912i5 abstractC13912i5) {
        m37900x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nwr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (nwr.f27609yj.m27428k4(str)) {
                    case 0:
                        nwr.this.f27621x1 = str2;
                        break;
                    case 1:
                        nwr.this.f27617kk = bhu.m28903k4(str2);
                        break;
                    case 2:
                        nwr.this.f27619to = str2;
                        break;
                    case 3:
                        nwr.this.f27612du = ina.m34328k4(str2);
                        break;
                    case 4:
                        nwr.this.f27615h4 = str2;
                        break;
                    case 5:
                        nwr.this.f27618m9 = ffv.m31771k4(str2);
                        break;
                    case 6:
                        nwr.this.f27613dy = str2;
                        break;
                    case 7:
                        nwr.this.f27610c5 = str2;
                        break;
                    case 8:
                        nwr.this.f27616jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nwr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (nwr.f27609yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        nwr.this.f27611ck = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            nwr nwrVar = nwr.this;
                            nwrVar.f27611ck = C14113y2.m67400k4(nwrVar.f27611ck, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 10:
                        nwr.this.f27614fa = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            nwr nwrVar2 = nwr.this;
                            nwrVar2.f27614fa = C14113y2.m67400k4(nwrVar2.f27614fa, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 11:
                        nwr.this.f27620up = new hec(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m37900x1() {
        this.f27617kk = f27608k4;
        this.f27612du = 0;
        this.f27618m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        nwr nwrVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27621x1;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i = this.f27617kk;
        if (i != f27608k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        String str4 = this.f27619to;
        if (str4 != null) {
            c3059ii.m12955x1("office:target-frame-name", str4);
        }
        int i2 = this.f27612du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", ina.m34329k4(i2));
        }
        String str5 = this.f27615h4;
        if (str5 != null) {
            c3059ii.m12955x1("office:name", str5);
        }
        int i3 = this.f27618m9;
        if (i3 != 0) {
            c3059ii.m12955x1("draw:nohref", ffv.m31772k4(i3));
        }
        c3059ii.m12955x1("svg:cx", this.f27613dy);
        c3059ii.m12955x1("svg:cy", this.f27610c5);
        c3059ii.m12955x1("svg:r", this.f27616jd);
        String str6 = this.f27611ck;
        if (str6 != null) {
            nwrVar = this;
            c3059ii2 = c3059ii;
            nwrVar.m29301k4("svg", c3059ii2, NoteMeta.PROPERTY_TITLE, str6, false);
        } else {
            nwrVar = this;
            c3059ii2 = c3059ii;
        }
        String str7 = nwrVar.f27614fa;
        if (str7 != null) {
            nwrVar.m29301k4("svg", c3059ii2, "desc", str7, false);
        }
        hec hecVar = nwrVar.f27620up;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii2, "event-listeners");
        }
        c3059ii2.mo21898jd();
    }
}
