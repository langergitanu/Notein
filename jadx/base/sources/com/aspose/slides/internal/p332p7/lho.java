package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class lho extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f26322k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f26323ks = new C7017h4("xlink:href", "xlink:type", "office:target-frame-name", "xlink:show", "office:name", "draw:nohref", "svg:x", "svg:y", "svg:width", "svg:height", NoteMeta.PROPERTY_TITLE, "desc", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private String f26324c5;

    /* JADX INFO: renamed from: ck */
    private String f26325ck;

    /* JADX INFO: renamed from: du */
    private int f26326du;

    /* JADX INFO: renamed from: dy */
    private String f26327dy;

    /* JADX INFO: renamed from: fa */
    private String f26328fa;

    /* JADX INFO: renamed from: h4 */
    private String f26329h4;

    /* JADX INFO: renamed from: jd */
    private String f26330jd;

    /* JADX INFO: renamed from: kk */
    private int f26331kk;

    /* JADX INFO: renamed from: m9 */
    private int f26332m9;

    /* JADX INFO: renamed from: to */
    private String f26333to;

    /* JADX INFO: renamed from: up */
    private String f26334up;

    /* JADX INFO: renamed from: x1 */
    private String f26335x1;

    /* JADX INFO: renamed from: yj */
    private hec f26336yj;

    public lho() {
        m36171x1();
    }

    public lho(final AbstractC13912i5 abstractC13912i5) {
        m36171x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lho.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (lho.f26323ks.m27428k4(str)) {
                    case 0:
                        lho.this.f26335x1 = str2;
                        break;
                    case 1:
                        lho.this.f26331kk = bhu.m28903k4(str2);
                        break;
                    case 2:
                        lho.this.f26333to = str2;
                        break;
                    case 3:
                        lho.this.f26326du = ina.m34328k4(str2);
                        break;
                    case 4:
                        lho.this.f26329h4 = str2;
                        break;
                    case 5:
                        lho.this.f26332m9 = ffv.m31771k4(str2);
                        break;
                    case 6:
                        lho.this.f26327dy = str2;
                        break;
                    case 7:
                        lho.this.f26324c5 = str2;
                        break;
                    case 8:
                        lho.this.f26330jd = str2;
                        break;
                    case 9:
                        lho.this.f26325ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lho.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (lho.f26323ks.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 10:
                        lho.this.f26328fa = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            lho lhoVar = lho.this;
                            lhoVar.f26328fa = C14113y2.m67400k4(lhoVar.f26328fa, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 11:
                        lho.this.f26334up = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            lho lhoVar2 = lho.this;
                            lhoVar2.f26334up = C14113y2.m67400k4(lhoVar2.f26334up, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 12:
                        lho.this.f26336yj = new hec(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m36171x1() {
        this.f26331kk = f26322k4;
        this.f26326du = 0;
        this.f26332m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        lho lhoVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26335x1;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i = this.f26331kk;
        if (i != f26322k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        String str4 = this.f26333to;
        if (str4 != null) {
            c3059ii.m12955x1("office:target-frame-name", str4);
        }
        int i2 = this.f26326du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", ina.m34329k4(i2));
        }
        String str5 = this.f26329h4;
        if (str5 != null) {
            c3059ii.m12955x1("office:name", str5);
        }
        int i3 = this.f26332m9;
        if (i3 != 0) {
            c3059ii.m12955x1("draw:nohref", ffv.m31772k4(i3));
        }
        String str6 = this.f26327dy;
        if (str6 != null) {
            c3059ii.m12955x1("svg:x", str6);
        }
        String str7 = this.f26324c5;
        if (str7 != null) {
            c3059ii.m12955x1("svg:y", str7);
        }
        String str8 = this.f26330jd;
        if (str8 != null) {
            c3059ii.m12955x1("svg:width", str8);
        }
        String str9 = this.f26325ck;
        if (str9 != null) {
            c3059ii.m12955x1("svg:height", str9);
        }
        String str10 = this.f26328fa;
        if (str10 != null) {
            lhoVar = this;
            c3059ii2 = c3059ii;
            lhoVar.m29301k4("svg", c3059ii2, NoteMeta.PROPERTY_TITLE, str10, false);
        } else {
            lhoVar = this;
            c3059ii2 = c3059ii;
        }
        String str11 = lhoVar.f26334up;
        if (str11 != null) {
            lhoVar.m29301k4("svg", c3059ii2, "desc", str11, false);
        }
        hec hecVar = lhoVar.f26336yj;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii2, "event-listeners");
        }
        c3059ii2.mo21898jd();
    }
}
