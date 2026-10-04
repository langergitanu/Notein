package com.aspose.slides.internal.p060ca;

import com.aspose.slides.C22208OooOo0;
import com.aspose.slides.internal.p060ca.C1996ae;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.mq */
/* JADX INFO: loaded from: classes3.dex */
class C2198mq {

    /* JADX INFO: renamed from: k4 */
    private C2068ei f7642k4;

    /* JADX INFO: renamed from: x1 */
    private double f7643x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.mq$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public static final k4 f7644k4 = new k4(-1, -1);

        /* JADX INFO: renamed from: kk */
        public int f7645kk;

        /* JADX INFO: renamed from: to */
        public int f7646to;

        /* JADX INFO: renamed from: x1 */
        public int f7647x1;

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
                return m11128x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.f7647x1 = this.f7647x1;
            k4Var.f7645kk = this.f7645kk;
            k4Var.f7646to = this.f7646to;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        public k4(int i, int i2) {
            this.f7647x1 = i;
            this.f7645kk = i;
            this.f7646to = i2;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m11128x1(k4 k4Var) {
            return k4Var.f7647x1 == this.f7647x1 && k4Var.f7645kk == this.f7645kk && k4Var.f7646to == this.f7646to;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m11130k4() {
            int i = this.f7647x1;
            k4 k4Var = f7644k4;
            return i == k4Var.f7647x1 && this.f7646to == k4Var.f7646to;
        }
    }

    public C2198mq(C2068ei c2068ei, double d) {
        this.f7642k4 = c2068ei;
        this.f7643x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11127k4(C1996ae.k4 k4Var) {
        k4 k4VarClone = k4.f7644k4.Clone();
        for (int i = 0; i < k4Var.m10143kk(); i++) {
            for (int i2 = 0; i2 < k4Var.m10145x1(); i2++) {
                int iM10145x1 = (k4Var.m10145x1() * i) + i2;
                int iOooO00o = C22208OooOo0.OooO00o(iM10145x1, 8.0d, 14);
                if (((1 << (7 - (iM10145x1 - (iOooO00o * 8)))) & C7019kk.m27462to(Byte.valueOf(k4Var.m10149h4()[iOooO00o]), 6)) != 0) {
                    if (k4VarClone.m11130k4()) {
                        k4VarClone = new k4(i2, i);
                    } else {
                        k4VarClone.f7645kk++;
                    }
                } else if (!k4VarClone.m11130k4()) {
                    m11126k4(k4Var, k4VarClone.Clone());
                    k4.f7644k4.CloneTo(k4VarClone);
                }
            }
            if (!k4VarClone.m11130k4()) {
                m11126k4(k4Var, k4VarClone.Clone());
                k4.f7644k4.CloneTo(k4VarClone);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11126k4(C1996ae.k4 k4Var, k4 k4Var2) {
        double dM10144to = ((double) (k4Var.m10144to() + k4Var2.f7647x1)) * this.f7643x1;
        double dM10144to2 = ((double) (k4Var.m10144to() + k4Var2.f7645kk)) * this.f7643x1;
        double dM10143kk = ((double) ((k4Var.m10143kk() - k4Var2.f7646to) - (k4Var.m10143kk() - k4Var.m10141du()))) * this.f7643x1;
        this.f7642k4.m10468h4().m10362k4().m11513k4(new C2140j6(dM10144to, dM10143kk));
        this.f7642k4.m10468h4().m10362k4().m11513k4(new C2090fu(dM10144to, (this.f7643x1 * 1.0d) + dM10143kk));
        C2324un c2324unM10362k4 = this.f7642k4.m10468h4().m10362k4();
        double d = this.f7643x1;
        c2324unM10362k4.m11513k4(new C2090fu((d * 1.0d) + dM10144to2, (d * 1.0d) + dM10143kk));
        this.f7642k4.m10468h4().m10362k4().m11513k4(new C2090fu((this.f7643x1 * 1.0d) + dM10144to2, dM10143kk));
        this.f7642k4.m10468h4().m10362k4().m11513k4(new C2387yg(dM10144to, dM10143kk));
    }
}
