package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.jl */
/* JADX INFO: loaded from: classes3.dex */
public class C2146jl extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    private x1 f7430k4;

    /* JADX INFO: renamed from: x1 */
    private short[] f7431x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.jl$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        private int f7432k4;

        /* JADX INFO: renamed from: x1 */
        private short f7433x1;

        public k4() {
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m10850x1((k4) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m10851k4() {
            return this.f7432k4;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: x1 */
        public final short m10854x1() {
            return this.f7433x1;
        }

        public k4(int i, short s) {
            m10849k4(s);
            m10848k4(i);
        }

        /* JADX INFO: renamed from: k4 */
        private void m10848k4(int i) {
            this.f7432k4 = i;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m10850x1(k4 k4Var) {
            return k4Var.m10851k4() == m10851k4() && k4Var.m10854x1() == m10854x1();
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.m10848k4(m10851k4());
            k4Var.m10849k4(m10854x1());
        }

        /* JADX INFO: renamed from: k4 */
        private void m10849k4(short s) {
            this.f7433x1 = s;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.jl$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private List<k4> f7434k4;

        public x1() {
            this.f7434k4 = new List<>();
        }

        /* JADX INFO: renamed from: k4 */
        public final int m10855k4() {
            return this.f7434k4.size();
        }

        public x1(int i) {
            this.f7434k4 = new List<>(i);
        }

        /* JADX INFO: renamed from: k4 */
        public final k4 m10856k4(int i) {
            return this.f7434k4.get_Item(i);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m10857k4(k4 k4Var) {
            this.f7434k4.addItem(k4Var.Clone());
        }
    }

    public C2146jl(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
    }

    /* JADX INFO: renamed from: k4 */
    public final x1 m10846k4() {
        m11218dq();
        return this.f7430k4;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        if (m11217b3()) {
            this.f7430k4 = new x1();
            this.f7431x1 = new short[0];
            return;
        }
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        int iM11589k4 = m11221lr().m10545c5().m11589k4() & 65535;
        this.f7430k4 = new x1(iM11589k4);
        for (int i = 0; i < iM11589k4; i++) {
            this.f7430k4.m10857k4(new k4(c2212n9.m11151fa(), c2212n9.m11147c5()));
        }
        int iM11521k4 = (m11221lr().m10547du().m11521k4() & 65535) - (65535 & m11221lr().m10545c5().m11589k4());
        if (iM11521k4 >= 0) {
            this.f7431x1 = new short[iM11521k4];
            for (int i2 = 0; i2 < iM11521k4; i2++) {
                this.f7431x1[i2] = c2212n9.m11152h4();
            }
        }
    }

    public C2146jl(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }

    /* JADX INFO: renamed from: x1 */
    public final short[] m10847x1() {
        m11218dq();
        return this.f7431x1;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            for (int i = 0; i < this.f7430k4.m10855k4(); i++) {
                try {
                    k4 k4VarClone = this.f7430k4.m10856k4(i).Clone();
                    c2362x4.m11647k4(k4VarClone.m10851k4());
                    c2362x4.m11651k4(k4VarClone.m10854x1());
                } catch (Throwable th) {
                    c2362x4.dispose();
                    throw th;
                }
            }
            for (short s : this.f7431x1) {
                c2362x4.m11664x1(s);
            }
            m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
            c2362x4.dispose();
            c3152yj.dispose();
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
