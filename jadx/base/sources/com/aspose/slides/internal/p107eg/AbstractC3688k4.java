package com.aspose.slides.internal.p107eg;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p275mi.AbstractC6388du;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3688k4 extends AbstractC6388du {

    /* JADX INFO: renamed from: kk */
    protected C3692x1 f10246kk;

    /* JADX INFO: renamed from: x1 */
    protected int f10247x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.k4$k4 */
    public static abstract class k4 extends AbstractC6388du.k4 {

        /* JADX INFO: renamed from: k4 */
        private int f10248k4;

        /* JADX INFO: renamed from: x1 */
        private C3692x1 f10249x1;

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: ck */
        public int mo14943ck() {
            return m26247kk().m63014k4();
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: fa */
        public void mo14944fa() {
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: jd */
        public boolean mo14945jd() {
            return true;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public int mo14946k4(C13637dy c13637dy) {
            return m26247kk().m63003k4(c13637dy);
        }

        /* JADX INFO: renamed from: ks */
        public final int m14984ks() {
            return m14986up().m15007k4();
        }

        /* JADX INFO: renamed from: rv */
        public final int m14985rv() {
            return this.f10248k4;
        }

        public final String toString() {
            return C14113y2.m67402k4("{0}, format = {1}", m14986up(), C14042ak.m66410k4(x1.class, m14985rv()));
        }

        /* JADX INFO: renamed from: up */
        public final C3692x1 m14986up() {
            return this.f10249x1;
        }

        /* JADX INFO: renamed from: yj */
        public final int m14987yj() {
            return m14986up().m15009x1();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.k4$x1 */
    public static final class x1 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(x1.class, Integer.class) { // from class: com.aspose.slides.internal.eg.k4.x1.1
                {
                    addConstant("Format0", 0L);
                    addConstant("Format2", 2L);
                    addConstant("Format4", 4L);
                    addConstant("Format6", 6L);
                    addConstant("Format8", 8L);
                    addConstant("Format10", 10L);
                    addConstant("Format12", 12L);
                    addConstant("Format13", 13L);
                    addConstant("Format14", 14L);
                }
            });
        }

        private x1() {
        }
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C7019kk.m27443k4((Class<?>) AbstractC3688k4.class)) {
            return false;
        }
        return m14981k4((AbstractC3688k4) obj);
    }

    public int hashCode() {
        C3692x1 c3692x1 = this.f10246kk;
        if (c3692x1 != null) {
            return c3692x1.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m14981k4(AbstractC3688k4 abstractC3688k4) {
        if (C14067j2.m66729x1(null, abstractC3688k4)) {
            return false;
        }
        if (C14067j2.m66729x1(this, abstractC3688k4)) {
            return true;
        }
        return C14067j2.m66728k4(abstractC3688k4.f10246kk, this.f10246kk);
    }

    /* JADX INFO: renamed from: kk */
    public final int m14982kk() {
        return this.f10247x1;
    }

    /* JADX INFO: renamed from: to */
    public final C3692x1 m14983to() {
        return this.f10246kk;
    }

    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("cmap: ");
        c6765kpOooO00o.m26791k4(m14983to());
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26805kk(m14982kk());
        c6765kpOooO00o.m26792k4(", Data Size=0x");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(this.f18176k4.m63014k4())));
        return c6765kpOooO00o.toString();
    }
}
