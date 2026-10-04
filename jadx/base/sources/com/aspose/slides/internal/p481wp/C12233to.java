package com.aspose.slides.internal.p481wp;

import com.aspose.slides.internal.p371qw.AbstractC9956kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12233to {

    /* JADX INFO: renamed from: k4 */
    public C12225k4 f40711k4;

    /* JADX INFO: renamed from: kk */
    public C12225k4 f40712kk;

    /* JADX INFO: renamed from: to */
    private AbstractC9956kk f40713to;

    /* JADX INFO: renamed from: x1 */
    public C12225k4 f40714x1;

    public C12233to(C12225k4 c12225k4, AbstractC9956kk abstractC9956kk) {
        this.f40711k4 = c12225k4;
        this.f40714x1 = c12225k4;
        this.f40712kk = c12225k4.m57056x1().m17171kk().mo17183jd() ? C12225k4.m57054k4() : this.f40714x1;
        this.f40713to = abstractC9956kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12233to m57104k4() {
        return new C12233to(this.f40711k4, this.f40714x1, this.f40712kk, this.f40713to);
    }

    /* JADX INFO: renamed from: kk */
    public final void m57106kk(C12233to c12233to, boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f40711k4 = this.f40713to.mo49001k4(this.f40711k4, c12233to.f40711k4);
        }
        if (z2) {
            this.f40714x1 = this.f40713to.mo49001k4(this.f40714x1, c12233to.f40714x1);
        }
        if (z3) {
            this.f40712kk = this.f40713to.mo49001k4(this.f40712kk, c12233to.f40712kk);
        }
    }

    public String toString() {
        return C14113y2.m67407k4("{normal: ", this.f40711k4, ", leading: ", this.f40714x1, ", rest: ", this.f40712kk, "}");
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57107x1(C12233to c12233to, boolean z, boolean z2, boolean z3) {
        C12225k4 c12225k4Mo49001k4;
        C12225k4 c12225k4Mo49001k42;
        C12225k4 c12225k4Mo49001k43;
        if (z && (c12225k4Mo49001k43 = this.f40713to.mo49001k4(this.f40711k4, c12233to.f40711k4)) != null) {
            this.f40711k4 = c12225k4Mo49001k43;
        }
        if (z2 && (c12225k4Mo49001k42 = this.f40713to.mo49001k4(this.f40714x1, c12233to.f40714x1)) != null) {
            this.f40714x1 = c12225k4Mo49001k42;
        }
        if (!z3 || (c12225k4Mo49001k4 = this.f40713to.mo49001k4(this.f40712kk, c12233to.f40712kk)) == null) {
            return;
        }
        this.f40712kk = c12225k4Mo49001k4;
    }

    private C12233to(C12225k4 c12225k4, C12225k4 c12225k42, C12225k4 c12225k43, AbstractC9956kk abstractC9956kk) {
        this.f40711k4 = c12225k4;
        this.f40714x1 = c12225k42;
        this.f40712kk = c12225k43;
        this.f40713to = abstractC9956kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12233to m57103k4(AbstractC9956kk abstractC9956kk) {
        C12225k4 c12225k4M57054k4 = C12225k4.m57054k4();
        return new C12233to(c12225k4M57054k4, c12225k4M57054k4, c12225k4M57054k4, abstractC9956kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57105k4(C12233to c12233to, boolean z, boolean z2, boolean z3) {
        C12225k4 c12225k4Mo49001k4;
        C12225k4 c12225k4Mo49001k42;
        C12225k4 c12225k4Mo49001k43;
        if (z && (c12225k4Mo49001k43 = this.f40713to.mo49001k4(this.f40711k4, c12233to.f40711k4)) != null) {
            this.f40711k4 = c12225k4Mo49001k43;
            c12233to.f40711k4 = c12225k4Mo49001k43;
        }
        if (z2 && (c12225k4Mo49001k42 = this.f40713to.mo49001k4(this.f40714x1, c12233to.f40714x1)) != null) {
            this.f40714x1 = c12225k4Mo49001k42;
            c12233to.f40714x1 = c12225k4Mo49001k42;
        }
        if (!z3 || (c12225k4Mo49001k4 = this.f40713to.mo49001k4(this.f40712kk, c12233to.f40712kk)) == null) {
            return;
        }
        this.f40712kk = c12225k4Mo49001k4;
        c12233to.f40712kk = c12225k4Mo49001k4;
    }
}
