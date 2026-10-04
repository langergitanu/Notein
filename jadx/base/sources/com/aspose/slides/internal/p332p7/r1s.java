package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.richeditor.fonts.FontManager;

/* JADX INFO: loaded from: classes4.dex */
public class r1s extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f29128fa = new C7017h4("numFmts", FontManager.REMOTE_FONT_DIR, "fills", "borders", "cellStyleXfs", "cellXfs", "cellStyles", "dxfs", "tableStyles", "colors", "extLst");

    /* JADX INFO: renamed from: c5 */
    private rcz f29129c5;

    /* JADX INFO: renamed from: ck */
    private g3j f29130ck;

    /* JADX INFO: renamed from: du */
    private rxa f29131du;

    /* JADX INFO: renamed from: dy */
    private ysu f29132dy;

    /* JADX INFO: renamed from: h4 */
    private vbz f29133h4;

    /* JADX INFO: renamed from: jd */
    private knj f29134jd;

    /* JADX INFO: renamed from: k4 */
    private eka f29135k4;

    /* JADX INFO: renamed from: kk */
    private bw1 f29136kk;

    /* JADX INFO: renamed from: m9 */
    private yc7 f29137m9;

    /* JADX INFO: renamed from: to */
    private nee f29138to;

    /* JADX INFO: renamed from: x1 */
    private fut f29139x1;

    public r1s() {
    }

    /* JADX INFO: renamed from: c5 */
    public final yc7 m39825c5() {
        return this.f29137m9;
    }

    /* JADX INFO: renamed from: ck */
    public final rcz m39826ck() {
        return this.f29129c5;
    }

    /* JADX INFO: renamed from: du */
    public final bw1 m39827du() {
        return this.f29136kk;
    }

    /* JADX INFO: renamed from: dy */
    public final vbz m39828dy() {
        return this.f29133h4;
    }

    /* JADX INFO: renamed from: fa */
    public final knj m39829fa() {
        return this.f29134jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final nee m39830h4() {
        return this.f29138to;
    }

    /* JADX INFO: renamed from: jd */
    public final ysu m39831jd() {
        return this.f29132dy;
    }

    /* JADX INFO: renamed from: kk */
    public final eka m39842kk() {
        return this.f29135k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final rxa m39843m9() {
        return this.f29131du;
    }

    /* JADX INFO: renamed from: to */
    public final fut m39844to() {
        return this.f29139x1;
    }

    /* JADX INFO: renamed from: up */
    public final g3j m39845up() {
        return this.f29130ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final vbz m39846x1() {
        if (this.f29133h4 != null) {
            throw new Exception("Only one <cellXfs> element can be added.");
        }
        vbz vbzVar = new vbz();
        this.f29133h4 = vbzVar;
        return vbzVar;
    }

    public r1s(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.r1s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (r1s.f29128fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        r1s.this.f29135k4 = new eka(abstractC13912i5);
                        return true;
                    case 1:
                        r1s.this.f29139x1 = new fut(abstractC13912i5);
                        return true;
                    case 2:
                        r1s.this.f29136kk = new bw1(abstractC13912i5);
                        return true;
                    case 3:
                        r1s.this.f29138to = new nee(abstractC13912i5);
                        return true;
                    case 4:
                        r1s.this.f29131du = new rxa(abstractC13912i5);
                        return true;
                    case 5:
                        r1s.this.f29133h4 = new vbz(abstractC13912i5);
                        return true;
                    case 6:
                        r1s.this.f29137m9 = new yc7(abstractC13912i5);
                        return true;
                    case 7:
                        r1s.this.f29132dy = new ysu(abstractC13912i5);
                        return true;
                    case 8:
                        r1s.this.f29129c5 = new rcz(abstractC13912i5);
                        return true;
                    case 9:
                        r1s.this.f29134jd = new knj(abstractC13912i5);
                        return true;
                    case 10:
                        r1s.this.f29130ck = new g3j(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final eka m39832k4() {
        if (this.f29135k4 != null) {
            throw new Exception("Only one <numFmts> element can be added.");
        }
        eka ekaVar = new eka();
        this.f29135k4 = ekaVar;
        return ekaVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39833k4(bw1 bw1Var) {
        this.f29136kk = bw1Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39834k4(fut futVar) {
        this.f29139x1 = futVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39835k4(g3j g3jVar) {
        this.f29130ck = g3jVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39836k4(knj knjVar) {
        this.f29134jd = knjVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39837k4(nee neeVar) {
        this.f29138to = neeVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39838k4(rcz rczVar) {
        this.f29129c5 = rczVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39839k4(rxa rxaVar) {
        this.f29131du = rxaVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39840k4(yc7 yc7Var) {
        this.f29137m9 = yc7Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39841k4(ysu ysuVar) {
        this.f29132dy = ysuVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ssml", str2, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
        eka ekaVar = this.f29135k4;
        if (ekaVar != null) {
            ekaVar.mo6846k4("ssml", c3059ii, "numFmts");
        }
        fut futVar = this.f29139x1;
        if (futVar != null) {
            futVar.mo6846k4("ssml", c3059ii, FontManager.REMOTE_FONT_DIR);
        }
        bw1 bw1Var = this.f29136kk;
        if (bw1Var != null) {
            bw1Var.mo6846k4("ssml", c3059ii, "fills");
        }
        nee neeVar = this.f29138to;
        if (neeVar != null) {
            neeVar.mo6846k4("ssml", c3059ii, "borders");
        }
        rxa rxaVar = this.f29131du;
        if (rxaVar != null) {
            rxaVar.mo6846k4("ssml", c3059ii, "cellStyleXfs");
        }
        vbz vbzVar = this.f29133h4;
        if (vbzVar != null) {
            vbzVar.mo6846k4("ssml", c3059ii, "cellXfs");
        }
        yc7 yc7Var = this.f29137m9;
        if (yc7Var != null) {
            yc7Var.mo6846k4("ssml", c3059ii, "cellStyles");
        }
        ysu ysuVar = this.f29132dy;
        if (ysuVar != null) {
            ysuVar.mo6846k4("ssml", c3059ii, "dxfs");
        }
        rcz rczVar = this.f29129c5;
        if (rczVar != null) {
            rczVar.mo6846k4("ssml", c3059ii, "tableStyles");
        }
        knj knjVar = this.f29134jd;
        if (knjVar != null) {
            knjVar.mo6846k4("ssml", c3059ii, "colors");
        }
        g3j g3jVar = this.f29130ck;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
