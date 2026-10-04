package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.bv */
/* JADX INFO: loaded from: classes3.dex */
public final class C2675bv implements IGenericCloneable<C2675bv> {

    /* JADX INFO: renamed from: du */
    private int f8523du;

    /* JADX INFO: renamed from: dy */
    private C2851p3 f8524dy;

    /* JADX INFO: renamed from: h4 */
    private AbstractC2845o9 f8525h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC2718ew f8526k4;

    /* JADX INFO: renamed from: kk */
    private C2745gz f8527kk = new C2745gz();

    /* JADX INFO: renamed from: m9 */
    private C2926un f8528m9;

    /* JADX INFO: renamed from: to */
    private boolean f8529to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2718ew f8530x1;

    public C2675bv() {
        this.f8526k4 = new C2743gv(C2808m2.m12403k4(79, 129, 189));
        this.f8530x1 = new C2743gv(C2808m2.m12403k4(56, 93, 138));
        this.f8526k4 = new C2743gv();
        this.f8530x1 = new C2743gv();
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2675bv cloneT() {
        C2675bv c2675bv = new C2675bv();
        c2675bv.m12163k4(this.f8526k4);
        c2675bv.m12169x1(this.f8530x1);
        c2675bv.m12164k4(this.f8527kk);
        c2675bv.m12166k4(this.f8524dy);
        c2675bv.m12168k4(this.f8529to);
        c2675bv.m12162k4(this.f8523du);
        c2675bv.m12167k4(this.f8528m9);
        c2675bv.m12165k4(this.f8525h4);
        return c2675bv;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12169x1(AbstractC2718ew abstractC2718ew) {
        if (this.f8530x1 != abstractC2718ew) {
            if (abstractC2718ew == null) {
                throw new ArgumentNullException("value");
            }
            this.f8530x1 = abstractC2718ew.cloneT();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12162k4(int i) {
        this.f8523du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12163k4(AbstractC2718ew abstractC2718ew) {
        if (this.f8526k4 != abstractC2718ew) {
            if (abstractC2718ew == null) {
                throw new ArgumentNullException("value");
            }
            this.f8526k4 = abstractC2718ew.cloneT();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12164k4(C2745gz c2745gz) {
        if (this.f8527kk != c2745gz) {
            if (c2745gz == null) {
                throw new ArgumentNullException("value");
            }
            this.f8527kk = c2745gz.cloneT();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12165k4(AbstractC2845o9 abstractC2845o9) {
        if (this.f8525h4 != abstractC2845o9) {
            this.f8525h4 = abstractC2845o9 != null ? abstractC2845o9.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12166k4(C2851p3 c2851p3) {
        if (c2851p3 != this.f8524dy) {
            this.f8524dy = c2851p3 != null ? c2851p3.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12167k4(C2926un c2926un) {
        if (this.f8528m9 != c2926un) {
            this.f8528m9 = c2926un != null ? c2926un.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12168k4(boolean z) {
        this.f8529to = z;
    }
}
