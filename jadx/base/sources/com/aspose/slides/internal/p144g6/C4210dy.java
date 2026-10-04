package com.aspose.slides.internal.p144g6;

import com.aspose.slides.internal.p060ca.AbstractC2220nx;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.C3169ck;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10959ix;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10978x6;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.google.common.net.HttpHeaders;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4210dy {

    /* JADX INFO: renamed from: du */
    private int f11472du;

    /* JADX INFO: renamed from: k4 */
    private boolean f11473k4;

    /* JADX INFO: renamed from: kk */
    private final C4213ix f11474kk;

    /* JADX INFO: renamed from: to */
    private final boolean f11475to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC4221to f11476x1;

    public C4210dy(AbstractC4221to abstractC4221to, C4213ix c4213ix, boolean z) {
        this.f11476x1 = abstractC4221to;
        this.f11474kk = c4213ix;
        this.f11475to = z;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m16898k4(C5659x1 c5659x1) {
        String str = C14113y2.f47374k4;
        if (c5659x1.m23120k4().m48183dy() != c5659x1.m23125x1()) {
            if (c5659x1.m23122kk() && c5659x1.m23124to()) {
                return "BoldItalicSimulation";
            }
            if (c5659x1.m23122kk()) {
                return "BoldSimulation";
            }
            if (c5659x1.m23124to()) {
                return "ItalicSimulation";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m16909kk() {
        if (this.f11473k4) {
            C4217ks.m16964k4(this.f11474kk);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16910x1() {
        this.f11474kk.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private String m16899k4(C10959ix c10959ix) {
        if (c10959ix.m52944x1()) {
            return C14113y2.m67402k4(this.f11475to ? "../FixedDocument.fdoc#{0}" : "#{0}", this.f11476x1.m16993k4(c10959ix.m52941kk()));
        }
        return c10959ix.m52941kk();
    }

    /* JADX INFO: renamed from: x1 */
    private void m16900x1(C10959ix c10959ix) {
        if (C3169ck.m13544k4(c10959ix.m52941kk())) {
            this.f11476x1.m16994k4(99, C14113y2.m67402k4("Hyperlinks to local resources can crash XPS viewer. This is a bug in XPS viewer. Page {0}.", Integer.valueOf(this.f11472du)));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m16901x1(C10970u4 c10970u4) {
        this.f11474kk.m13593x1("Path.OpacityMask");
        C4127k4 c4127k4 = new C4127k4(c10970u4.m53082to());
        try {
            c4127k4.m16543k4(c10970u4.m53068dy());
            C3152yj c3152yj = new C3152yj();
            try {
                c4127k4.m16541k4(c3152yj, 5);
                C4223x1.m17007k4(this.f11474kk, this.f11476x1, c3152yj.toArray(), c10970u4.m53069h4(), c10970u4.m53080kk().Clone(), 4, null);
                c3152yj.dispose();
                c4127k4.dispose();
                this.f11474kk.m13588kk();
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c4127k4.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16902k4() {
        this.f11474kk.m13588kk();
        if (this.f11475to) {
            this.f11474kk.m13592x1();
        } else {
            this.f11474kk.m13588kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16903k4(int i, float f, float f2) {
        this.f11472du = i;
        if (this.f11475to) {
            this.f11474kk.m13584k4("FixedPage");
        } else {
            this.f11474kk.m13593x1("FixedPage");
        }
        if (this.f11475to) {
            this.f11474kk.m13590kk("xmlns", "http://schemas.microsoft.com/xps/2005/06");
            this.f11474kk.m13590kk("xmlns:x", "http://schemas.microsoft.com/xps/2005/06/resourcedictionary-key");
        }
        this.f11474kk.m13590kk("xml:lang", "en-us");
        this.f11474kk.m16933k4(HttpHeaders.WIDTH, C4209du.m16893k4(f));
        this.f11474kk.m16933k4("Height", C4209du.m16893k4(f2));
        this.f11474kk.m13590kk("Name", C14113y2.m67402k4("Page{0}", Integer.valueOf(i)));
        if (C12565ks.m58630x1(this.f11476x1.m16996to().m13564k4()) && this.f11475to) {
            this.f11474kk.m13581k4().mo21897h4(C14113y2.m67402k4("Generated by {0}", this.f11476x1.m16996to().m13564k4()));
        }
        this.f11474kk.m13593x1("Canvas");
        C4317dy c4317dy = new C4317dy();
        double d = C12566m9.f42081k4;
        c4317dy.m17336k4(96.0f / ((float) d), 96.0f / ((float) d), 0);
        this.f11474kk.m16936k4("RenderTransform", c4317dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16904k4(C10951c5 c10951c5) {
        this.f11474kk.m13593x1("Canvas");
        if (c10951c5.m52903h4() != null) {
            m16900x1(c10951c5.m52903h4());
            this.f11474kk.m13590kk("FixedPage.NavigateUri", m16899k4(c10951c5.m52903h4()));
        }
        if (c10951c5.mo52909to() != null) {
            this.f11474kk.m16936k4("RenderTransform", c10951c5.mo52909to());
        }
        if (C10978x6.m53138kk(c10951c5)) {
            C4225yj c4225yj = new C4225yj();
            if (c10951c5.mo52902du() != null) {
                if (c10951c5.mo52902du().mo52909to() == null) {
                    this.f11474kk.m13590kk("Clip", c4225yj.m17023kk(c10951c5.mo52902du()));
                    return;
                }
                this.f11474kk.m13593x1("Canvas.Clip");
                this.f11474kk.m13593x1("PathGeometry");
                this.f11474kk.m16936k4("Transform", c10951c5.mo52902du().mo52909to());
                c10951c5.mo52902du().m53105kk(0);
                this.f11474kk.m13590kk("Figures", c4225yj.m17023kk(c10951c5.mo52902du()));
                this.f11474kk.m13588kk();
                this.f11474kk.m13588kk();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16905k4(C10963ks c10963ks) {
        AbstractC2220nx[][] abstractC2220nxArr = {null};
        String strM16992k4 = this.f11476x1.m16992k4(c10963ks.m53005x1().m23120k4(), this.f11474kk.m13582k4(c10963ks.m52977ck(), c10963ks.m53004wl() != null), abstractC2220nxArr);
        AbstractC2220nx[] abstractC2220nxArr2 = abstractC2220nxArr[0];
        if (C12565ks.m58630x1(strM16992k4)) {
            if (C14113y2.m67448x1(strM16992k4, "{")) {
                strM16992k4 = C14113y2.m67408k4("{}", strM16992k4);
            }
            this.f11474kk.m13593x1("Glyphs");
            this.f11474kk.m16934k4("OriginX", c10963ks.m52982jd().m56897x1());
            this.f11474kk.m16934k4("OriginY", c10963ks.m52982jd().m56895kk());
            this.f11474kk.m13590kk("UnicodeString", strM16992k4);
            if (strM16992k4.length() == 2 && C14117yj.m67514du(strM16992k4.charAt(0))) {
                this.f11474kk.m13590kk("Indices", "(2:1)" + abstractC2220nxArr2[0]);
            }
            if (C5656k4.m23097to(c10963ks.m52997m9(), C5656k4.f15629ze)) {
                this.f11476x1.m16994k4(3, C14113y2.m67402k4("Rendering of Outlined and Embossed text is not supported upon exporting to XPS. Text will be rendered as normal text. Page {0}.", Integer.valueOf(this.f11472du)));
            }
            this.f11474kk.m16937k4("Fill", c10963ks.m52995kk().m23100h4() ? c10963ks.m52997m9().m23100h4() ? C5656k4.f15518dy : c10963ks.m52997m9() : c10963ks.m52995kk());
            this.f11474kk.m16934k4("FontRenderingEmSize", c10963ks.m53005x1().m23114dy());
            this.f11474kk.m13590kk("FontUri", this.f11476x1.mo16957k4(c10963ks.m53005x1().m23120k4()));
            String strM16898k4 = m16898k4(c10963ks.m53005x1());
            if (C12565ks.m58630x1(strM16898k4)) {
                this.f11474kk.m13590kk("StyleSimulations", strM16898k4);
            }
            if (c10963ks.mo52909to() != null) {
                this.f11474kk.m16936k4("RenderTransform", c10963ks.mo52909to());
            }
            if (c10963ks.mo52902du() != null) {
                this.f11474kk.m13590kk("Clip", new C4225yj().m17023kk(c10963ks.mo52902du()));
            }
            if (c10963ks.m53000rv() != null && c10963ks.m53000rv().m52943to() == 0) {
                m16900x1(c10963ks.m53000rv());
                this.f11474kk.m13590kk("FixedPage.NavigateUri", m16899k4(c10963ks.m53000rv()));
            }
            this.f11474kk.m13588kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16906k4(C10970u4 c10970u4) throws Throwable {
        this.f11474kk.m13593x1("Path");
        if (c10970u4.m53081m9() != null) {
            m16900x1(c10970u4.m53081m9());
            this.f11474kk.m13590kk("FixedPage.NavigateUri", m16899k4(c10970u4.m53081m9()));
        }
        C10971um c10971umM53087k4 = C10971um.m53087k4(new C12007ix(c10970u4.m53072k4().Clone(), c10970u4.m53083x1().Clone()));
        this.f11474kk.m13590kk("Data", new C4225yj().m17023kk(c10971umM53087k4));
        if (c10970u4.m53068dy() != null) {
            m16901x1(c10970u4);
        }
        this.f11474kk.m13593x1("Path.Fill");
        C4223x1.m17007k4(this.f11474kk, this.f11476x1, c10970u4.m53082to(), c10970u4.m53069h4(), c10970u4.m53080kk().Clone(), 4, null);
        this.f11474kk.m13588kk();
        this.f11474kk.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16907k4(C10971um c10971um) {
        this.f11473k4 = C4217ks.m16967k4(this.f11474kk, this.f11476x1, c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16908k4(String str, C12025x6 c12025x6) {
        this.f11474kk.m13593x1("Path");
        this.f11474kk.m13590kk("Name", str);
        this.f11474kk.m13590kk("Data", C14113y2.m67402k4("M {0},{1}", C9574to.m46741k4(c12025x6.m56897x1()), C9574to.m46741k4(c12025x6.m56895kk())));
        this.f11474kk.m16937k4("Fill", C5656k4.f15629ze);
        this.f11474kk.m13588kk();
    }
}
