package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class v2b extends AbstractC7361bz {

    /* JADX INFO: renamed from: uz */
    private static final C7017h4 f31497uz = new C7017h4("distT", "distB", "distL", "distR", "simplePos", "relativeHeight", "behindDoc", "locked", "layoutInCell", "hidden", "allowOverlap", "positionH", "positionV", "extent", "effectExtent", "wrapNone", "wrapSquare", "wrapTight", "wrapThrough", "wrapTopAndBottom", "docPr", "cNvGraphicFramePr", "graphic");

    /* JADX INFO: renamed from: c5 */
    private boolean f31498c5;

    /* JADX INFO: renamed from: ck */
    private boolean f31499ck;

    /* JADX INFO: renamed from: du */
    private byte f31500du;

    /* JADX INFO: renamed from: dy */
    private boolean f31501dy;

    /* JADX INFO: renamed from: fa */
    private C9391zp f31502fa;

    /* JADX INFO: renamed from: h4 */
    private long f31503h4;

    /* JADX INFO: renamed from: ix */
    private C8318n9 f31504ix;

    /* JADX INFO: renamed from: jd */
    private byte f31505jd;

    /* JADX INFO: renamed from: k4 */
    private long f31506k4;

    /* JADX INFO: renamed from: kk */
    private long f31507kk;

    /* JADX INFO: renamed from: ks */
    private C7258al f31508ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f31509m9;

    /* JADX INFO: renamed from: ne */
    private C7632f3 f31510ne;

    /* JADX INFO: renamed from: rv */
    private foz f31511rv;

    /* JADX INFO: renamed from: to */
    private long f31512to;

    /* JADX INFO: renamed from: u4 */
    private C7902i2 f31513u4;

    /* JADX INFO: renamed from: up */
    private ogo f31514up;

    /* JADX INFO: renamed from: x1 */
    private long f31515x1;

    /* JADX INFO: renamed from: x6 */
    private C7394ca f31516x6;

    /* JADX INFO: renamed from: yj */
    private kkf f31517yj;

    public v2b() {
        m42687x1();
        this.f31502fa = new C9391zp();
        this.f31514up = new ogo();
        this.f31517yj = new kkf();
        this.f31508ks = new C7258al();
        this.f31510ne = new C7632f3();
        this.f31513u4 = new C7902i2();
    }

    public v2b(final AbstractC13912i5 abstractC13912i5) {
        m42687x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.v2b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (v2b.f31497uz.m27428k4(str)) {
                    case 0:
                        v2b.this.f31506k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        v2b.this.f31515x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        v2b.this.f31507kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        v2b.this.f31512to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 4:
                        v2b.this.f31500du = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 5:
                        v2b.this.f31503h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        v2b.this.f31509m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        v2b.this.f31501dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        v2b.this.f31498c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        v2b.this.f31505jd = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 10:
                        v2b.this.f31499ck = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v2b.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                v2b v2bVar;
                C7394ca c7394ca;
                int iM27428k4 = v2b.f31497uz.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    v2b.this.f31502fa = new C9391zp(abstractC13912i5);
                    return true;
                }
                switch (iM27428k4) {
                    case 11:
                        v2b.this.f31514up = new ogo(abstractC13912i5);
                        return true;
                    case 12:
                        v2b.this.f31517yj = new kkf(abstractC13912i5);
                        return true;
                    case 13:
                        v2b.this.f31508ks = new C7258al(abstractC13912i5);
                        return true;
                    case 14:
                        v2b.this.f31511rv = new foz(abstractC13912i5);
                        return true;
                    case 15:
                        v2bVar = v2b.this;
                        c7394ca = new C7394ca("wrapNone", new l9b(abstractC13912i5));
                        break;
                    case 16:
                        v2bVar = v2b.this;
                        c7394ca = new C7394ca("wrapSquare", new cnx(abstractC13912i5));
                        break;
                    case 17:
                        v2bVar = v2b.this;
                        c7394ca = new C7394ca("wrapTight", new lvv(abstractC13912i5));
                        break;
                    case 18:
                        v2bVar = v2b.this;
                        c7394ca = new C7394ca("wrapThrough", new wyr(abstractC13912i5));
                        break;
                    case 19:
                        v2bVar = v2b.this;
                        c7394ca = new C7394ca("wrapTopAndBottom", new f8d(abstractC13912i5));
                        break;
                    case 20:
                        v2b.this.f31510ne = new C7632f3(abstractC13912i5);
                        return true;
                    case 21:
                        v2b.this.f31504ix = new C8318n9(abstractC13912i5);
                        return true;
                    case 22:
                        v2b.this.f31513u4 = new C7902i2(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                v2bVar.f31516x6 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m42687x1() {
        this.f31506k4 = 4294967295L;
        this.f31515x1 = 4294967295L;
        this.f31507kk = 4294967295L;
        this.f31512to = 4294967295L;
        this.f31500du = (byte) -1;
        this.f31505jd = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f31506k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distT", C13850af.m65147x1(j));
        }
        long j2 = this.f31515x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distB", C13850af.m65147x1(j2));
        }
        long j3 = this.f31507kk;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distL", C13850af.m65147x1(j3));
        }
        long j4 = this.f31512to;
        if ((j4 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distR", C13850af.m65147x1(j4));
        }
        byte b = this.f31500du;
        if (b != -1) {
            c3059ii.m12955x1("simplePos", b == 1 ? "1" : "0");
        }
        c3059ii.m12955x1("relativeHeight", C13850af.m65147x1(this.f31503h4));
        c3059ii.m12955x1("behindDoc", this.f31509m9 ? "1" : "0");
        c3059ii.m12955x1("locked", this.f31501dy ? "1" : "0");
        c3059ii.m12955x1("layoutInCell", this.f31498c5 ? "1" : "0");
        byte b2 = this.f31505jd;
        if (b2 != -1) {
            c3059ii.m12955x1("hidden", b2 == 1 ? "1" : "0");
        }
        c3059ii.m12955x1("allowOverlap", this.f31499ck ? "1" : "0");
        this.f31502fa.mo6846k4("wp", c3059ii, "simplePos");
        this.f31514up.mo6846k4("wp", c3059ii, "positionH");
        this.f31517yj.mo6846k4("wp", c3059ii, "positionV");
        this.f31508ks.mo6846k4("wp", c3059ii, "extent");
        foz fozVar = this.f31511rv;
        if (fozVar != null) {
            fozVar.mo6846k4("wp", c3059ii, "effectExtent");
        }
        C7394ca c7394ca = this.f31516x6;
        if (c7394ca != null) {
            switch (f31497uz.m27428k4(c7394ca.m29539k4())) {
                case 15:
                    ((l9b) this.f31516x6.m29541kk()).mo6846k4("wp", c3059ii, this.f31516x6.m29539k4());
                    break;
                case 16:
                    ((cnx) this.f31516x6.m29541kk()).mo6846k4("wp", c3059ii, this.f31516x6.m29539k4());
                    break;
                case 17:
                    ((lvv) this.f31516x6.m29541kk()).mo6846k4("wp", c3059ii, this.f31516x6.m29539k4());
                    break;
                case 18:
                    ((wyr) this.f31516x6.m29541kk()).mo6846k4("wp", c3059ii, this.f31516x6.m29539k4());
                    break;
                case 19:
                    ((f8d) this.f31516x6.m29541kk()).mo6846k4("wp", c3059ii, this.f31516x6.m29539k4());
                    break;
            }
        }
        this.f31510ne.mo6846k4("wp", c3059ii, "docPr");
        C8318n9 c8318n9 = this.f31504ix;
        if (c8318n9 != null) {
            c8318n9.mo6846k4("wp", c3059ii, "cNvGraphicFramePr");
        }
        this.f31513u4.mo6846k4("a", c3059ii, "graphic");
        c3059ii.mo21898jd();
    }
}
