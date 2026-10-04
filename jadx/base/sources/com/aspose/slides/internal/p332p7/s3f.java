package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class s3f extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f29885k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f29886x6 = new C7017h4("xlink:href", "xlink:type", "office:target-frame-name", "xlink:show", "office:name", "draw:nohref", "svg:x", "svg:y", "svg:width", "svg:height", "svg:viewBox", "draw:points", NoteMeta.PROPERTY_TITLE, "desc", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private String f29887c5;

    /* JADX INFO: renamed from: ck */
    private String f29888ck;

    /* JADX INFO: renamed from: du */
    private int f29889du;

    /* JADX INFO: renamed from: dy */
    private String f29890dy;

    /* JADX INFO: renamed from: fa */
    private String f29891fa;

    /* JADX INFO: renamed from: h4 */
    private String f29892h4;

    /* JADX INFO: renamed from: jd */
    private String f29893jd;

    /* JADX INFO: renamed from: kk */
    private int f29894kk;

    /* JADX INFO: renamed from: ks */
    private String f29895ks;

    /* JADX INFO: renamed from: m9 */
    private int f29896m9;

    /* JADX INFO: renamed from: rv */
    private hec f29897rv;

    /* JADX INFO: renamed from: to */
    private String f29898to;

    /* JADX INFO: renamed from: up */
    private String f29899up;

    /* JADX INFO: renamed from: x1 */
    private String f29900x1;

    /* JADX INFO: renamed from: yj */
    private String f29901yj;

    public s3f() {
        m40759x1();
    }

    public s3f(final AbstractC13912i5 abstractC13912i5) {
        m40759x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s3f.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (s3f.f29886x6.m27428k4(str)) {
                    case 0:
                        s3f.this.f29900x1 = str2;
                        break;
                    case 1:
                        s3f.this.f29894kk = bhu.m28903k4(str2);
                        break;
                    case 2:
                        s3f.this.f29898to = str2;
                        break;
                    case 3:
                        s3f.this.f29889du = ina.m34328k4(str2);
                        break;
                    case 4:
                        s3f.this.f29892h4 = str2;
                        break;
                    case 5:
                        s3f.this.f29896m9 = ffv.m31771k4(str2);
                        break;
                    case 6:
                        s3f.this.f29890dy = str2;
                        break;
                    case 7:
                        s3f.this.f29887c5 = str2;
                        break;
                    case 8:
                        s3f.this.f29893jd = str2;
                        break;
                    case 9:
                        s3f.this.f29888ck = str2;
                        break;
                    case 10:
                        s3f.this.f29891fa = str2;
                        break;
                    case 11:
                        s3f.this.f29899up = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.s3f.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (s3f.f29886x6.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 12:
                        s3f.this.f29901yj = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            s3f s3fVar = s3f.this;
                            s3fVar.f29901yj = C14113y2.m67400k4(s3fVar.f29901yj, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 13:
                        s3f.this.f29895ks = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            s3f s3fVar2 = s3f.this;
                            s3fVar2.f29895ks = C14113y2.m67400k4(s3fVar2.f29895ks, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 14:
                        s3f.this.f29897rv = new hec(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m40759x1() {
        this.f29894kk = f29885k4;
        this.f29889du = 0;
        this.f29896m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        s3f s3fVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29900x1;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i = this.f29894kk;
        if (i != f29885k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        String str4 = this.f29898to;
        if (str4 != null) {
            c3059ii.m12955x1("office:target-frame-name", str4);
        }
        int i2 = this.f29889du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", ina.m34329k4(i2));
        }
        String str5 = this.f29892h4;
        if (str5 != null) {
            c3059ii.m12955x1("office:name", str5);
        }
        int i3 = this.f29896m9;
        if (i3 != 0) {
            c3059ii.m12955x1("draw:nohref", ffv.m31772k4(i3));
        }
        String str6 = this.f29890dy;
        if (str6 != null) {
            c3059ii.m12955x1("svg:x", str6);
        }
        String str7 = this.f29887c5;
        if (str7 != null) {
            c3059ii.m12955x1("svg:y", str7);
        }
        String str8 = this.f29893jd;
        if (str8 != null) {
            c3059ii.m12955x1("svg:width", str8);
        }
        String str9 = this.f29888ck;
        if (str9 != null) {
            c3059ii.m12955x1("svg:height", str9);
        }
        c3059ii.m12955x1("svg:viewBox", this.f29891fa);
        c3059ii.m12955x1("draw:points", this.f29899up);
        String str10 = this.f29901yj;
        if (str10 != null) {
            s3fVar = this;
            c3059ii2 = c3059ii;
            s3fVar.m29301k4("svg", c3059ii2, NoteMeta.PROPERTY_TITLE, str10, false);
        } else {
            s3fVar = this;
            c3059ii2 = c3059ii;
        }
        String str11 = s3fVar.f29895ks;
        if (str11 != null) {
            s3fVar.m29301k4("svg", c3059ii2, "desc", str11, false);
        }
        hec hecVar = s3fVar.f29897rv;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii2, "event-listeners");
        }
        c3059ii2.mo21898jd();
    }
}
