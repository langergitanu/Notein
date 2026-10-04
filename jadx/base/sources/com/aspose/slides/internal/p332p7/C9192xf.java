package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xf */
/* JADX INFO: loaded from: classes4.dex */
public class C9192xf extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f32799c5 = new C7017h4("chartData", "chart", "spPr", "txPr", "clrMapOvr", "fmtOvrs", "printSettings", "extLst");

    /* JADX INFO: renamed from: du */
    private C7341br f32800du;

    /* JADX INFO: renamed from: dy */
    private C7249ah f32801dy;

    /* JADX INFO: renamed from: h4 */
    private C9038vg f32802h4;

    /* JADX INFO: renamed from: k4 */
    private C8663rb f32803k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f32804kk;

    /* JADX INFO: renamed from: m9 */
    private C7277ax f32805m9;

    /* JADX INFO: renamed from: to */
    private C8952ug f32806to;

    /* JADX INFO: renamed from: x1 */
    private C7599et f32807x1;

    public C9192xf() {
        this.f32803k4 = new C8663rb();
        this.f32807x1 = new C7599et();
    }

    /* JADX INFO: renamed from: du */
    public final C7341br m44316du() {
        return this.f32800du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9038vg m44317h4() {
        return this.f32802h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7599et m44321kk() {
        return this.f32807x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7249ah m44322m9() {
        return this.f32801dy;
    }

    /* JADX INFO: renamed from: to */
    public final C8087kh m44323to() {
        return this.f32804kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8663rb m44324x1() {
        return this.f32803k4;
    }

    public C9192xf(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C9192xf.f32799c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C9192xf.this.f32803k4 = new C8663rb(abstractC13912i5);
                        return true;
                    case 1:
                        C9192xf.this.f32807x1 = new C7599et(abstractC13912i5);
                        return true;
                    case 2:
                        C9192xf.this.f32804kk = new C8087kh(abstractC13912i5);
                        return true;
                    case 3:
                        C9192xf.this.f32806to = new C8952ug(abstractC13912i5);
                        return true;
                    case 4:
                        C9192xf.this.f32800du = new C7341br(abstractC13912i5);
                        return true;
                    case 5:
                        C9192xf.this.f32802h4 = new C9038vg(abstractC13912i5);
                        return true;
                    case 6:
                        C9192xf.this.f32805m9 = new C7277ax(abstractC13912i5);
                        return true;
                    case 7:
                        C9192xf.this.f32801dy = new C7249ah(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m44318k4() {
        if (this.f32804kk != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f32804kk = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44319k4(C7249ah c7249ah) {
        this.f32801dy = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44320k4(C9038vg c9038vg) {
        this.f32802h4 = c9038vg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("cx", str2, "http://schemas.microsoft.com/office/drawing/2014/chartex");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/math") == null) {
            c3059ii.m12954to("xmlns", "m", null, "http://schemas.openxmlformats.org/officeDocument/2006/math");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/wordprocessingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "w", null, "http://schemas.openxmlformats.org/wordprocessingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing") == null) {
            c3059ii.m12954to("xmlns", "wp", null, "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2010/main") == null) {
            c3059ii.m12954to("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
        }
        if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
            c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
        }
        this.f32803k4.mo6846k4("cx", c3059ii, "chartData");
        this.f32807x1.mo6846k4("cx", c3059ii, "chart");
        C8087kh c8087kh = this.f32804kk;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f32806to;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7341br c7341br = this.f32800du;
        if (c7341br != null) {
            c7341br.mo6846k4("cx", c3059ii, "clrMapOvr");
        }
        C9038vg c9038vg = this.f32802h4;
        if (c9038vg != null) {
            c9038vg.mo6846k4("cx", c3059ii, "fmtOvrs");
        }
        C7277ax c7277ax = this.f32805m9;
        if (c7277ax != null) {
            c7277ax.mo6846k4("cx", c3059ii, "printSettings");
        }
        C7249ah c7249ah = this.f32801dy;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
