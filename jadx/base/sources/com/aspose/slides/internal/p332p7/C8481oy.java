package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oy */
/* JADX INFO: loaded from: classes4.dex */
public class C8481oy extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f28144jd = new C7017h4("baseJc", "plcHide", "rSpRule", "cGpRule", "rSp", "cSp", "cGp", "mcs", "ctrlPr");

    /* JADX INFO: renamed from: c5 */
    private C7782go f28145c5;

    /* JADX INFO: renamed from: du */
    private C8717rw f28146du;

    /* JADX INFO: renamed from: dy */
    private C9404zv f28147dy;

    /* JADX INFO: renamed from: h4 */
    private C8717rw f28148h4;

    /* JADX INFO: renamed from: k4 */
    private C8880tn f28149k4;

    /* JADX INFO: renamed from: kk */
    private C8168lb f28150kk;

    /* JADX INFO: renamed from: m9 */
    private C8717rw f28151m9;

    /* JADX INFO: renamed from: to */
    private C8168lb f28152to;

    /* JADX INFO: renamed from: x1 */
    private C9408zw f28153x1;

    public C8481oy() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C9404zv m38507c5() {
        return this.f28147dy;
    }

    /* JADX INFO: renamed from: du */
    public final C8168lb m38508du() {
        return this.f28152to;
    }

    /* JADX INFO: renamed from: dy */
    public final C8717rw m38509dy() {
        return this.f28151m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8717rw m38510h4() {
        return this.f28146du;
    }

    /* JADX INFO: renamed from: jd */
    public final C7782go m38511jd() {
        return this.f28145c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m38512k4() {
        if (this.f28145c5 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f28145c5 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8717rw m38520m9() {
        return this.f28148h4;
    }

    /* JADX INFO: renamed from: to */
    public final C8168lb m38521to() {
        return this.f28150kk;
    }

    public C8481oy(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8481oy.f28144jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8481oy.this.f28149k4 = new C8880tn(abstractC13912i5);
                        return true;
                    case 1:
                        C8481oy.this.f28153x1 = new C9408zw(abstractC13912i5);
                        return true;
                    case 2:
                        C8481oy.this.f28150kk = new C8168lb(abstractC13912i5);
                        return true;
                    case 3:
                        C8481oy.this.f28152to = new C8168lb(abstractC13912i5);
                        return true;
                    case 4:
                        C8481oy.this.f28146du = new C8717rw(abstractC13912i5);
                        return true;
                    case 5:
                        C8481oy.this.f28148h4 = new C8717rw(abstractC13912i5);
                        return true;
                    case 6:
                        C8481oy.this.f28151m9 = new C8717rw(abstractC13912i5);
                        return true;
                    case 7:
                        C8481oy.this.f28147dy = new C9404zv(abstractC13912i5);
                        return true;
                    case 8:
                        C8481oy.this.f28145c5 = new C7782go(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C9408zw m38518kk() {
        return this.f28153x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m38519kk(C8717rw c8717rw) {
        this.f28151m9 = c8717rw;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8880tn m38522x1() {
        return this.f28149k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38523x1(C8168lb c8168lb) {
        this.f28152to = c8168lb;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38524x1(C8717rw c8717rw) {
        this.f28148h4 = c8717rw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38513k4(C8168lb c8168lb) {
        this.f28150kk = c8168lb;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38514k4(C8717rw c8717rw) {
        this.f28146du = c8717rw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38515k4(C8880tn c8880tn) {
        this.f28149k4 = c8880tn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38516k4(C9404zv c9404zv) {
        this.f28147dy = c9404zv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38517k4(C9408zw c9408zw) {
        this.f28153x1 = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8880tn c8880tn = this.f28149k4;
        if (c8880tn != null) {
            c8880tn.mo6846k4("m", c3059ii, "baseJc");
        }
        C9408zw c9408zw = this.f28153x1;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "plcHide");
        }
        C8168lb c8168lb = this.f28150kk;
        if (c8168lb != null) {
            c8168lb.mo6846k4("m", c3059ii, "rSpRule");
        }
        C8168lb c8168lb2 = this.f28152to;
        if (c8168lb2 != null) {
            c8168lb2.mo6846k4("m", c3059ii, "cGpRule");
        }
        C8717rw c8717rw = this.f28146du;
        if (c8717rw != null) {
            c8717rw.mo6846k4("m", c3059ii, "rSp");
        }
        C8717rw c8717rw2 = this.f28148h4;
        if (c8717rw2 != null) {
            c8717rw2.mo6846k4("m", c3059ii, "cSp");
        }
        C8717rw c8717rw3 = this.f28151m9;
        if (c8717rw3 != null) {
            c8717rw3.mo6846k4("m", c3059ii, "cGp");
        }
        C9404zv c9404zv = this.f28147dy;
        if (c9404zv != null) {
            c9404zv.mo6846k4("m", c3059ii, "mcs");
        }
        C7782go c7782go = this.f28145c5;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
