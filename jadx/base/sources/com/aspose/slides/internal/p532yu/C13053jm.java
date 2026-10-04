package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.jm */
/* JADX INFO: loaded from: classes5.dex */
public final class C13053jm extends AbstractC13255vt {

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.jm$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        public C13047jd f43885du;

        /* JADX INFO: renamed from: k4 */
        public C13053jm f43886k4;

        /* JADX INFO: renamed from: kk */
        public C13047jd f43887kk;

        /* JADX INFO: renamed from: to */
        public C13047jd f43888to;

        /* JADX INFO: renamed from: x1 */
        public C13047jd f43889x1;

        public k4() {
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m61009x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f43886k4, this.f43886k4) && C14067j2.m66728k4(k4Var.f43889x1, this.f43889x1) && C14067j2.m66728k4(k4Var.f43887kk, this.f43887kk) && C14067j2.m66728k4(k4Var.f43888to, this.f43888to) && C14067j2.m66728k4(k4Var.f43885du, this.f43885du);
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
                return m61009x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        public k4(C13053jm c13053jm, C13047jd c13047jd, C13047jd c13047jd2) {
            this.f43886k4 = c13053jm;
            this.f43889x1 = c13047jd;
            this.f43887kk = c13047jd2;
            this.f43888to = null;
            this.f43885du = null;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f43886k4 = this.f43886k4;
            k4Var.f43889x1 = this.f43889x1;
            k4Var.f43887kk = this.f43887kk;
            k4Var.f43888to = this.f43888to;
            k4Var.f43885du = this.f43885du;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60125k4(C13047jd c13047jd, C13047jd c13047jd2, C13047jd[] c13047jdArr) {
        C13053jm c13053jm;
        Stack stack = new Stack();
        k4 k4Var = new k4(this, c13047jd, c13047jd2);
        while (true) {
            c13053jm = k4Var.f43886k4;
            k4Var.f43888to = new C13047jd(c13047jd2.m60997k4());
            if (!C7019kk.m27469x1(c13053jm.m61641x1(), C13053jm.class)) {
                break;
            }
            stack.push(k4Var.Clone());
            k4Var = new k4((C13053jm) c13053jm.m61641x1(), k4Var.f43889x1, k4Var.f43888to);
        }
        c13053jm.m61641x1().mo60125k4(k4Var.f43889x1, k4Var.f43888to, c13047jdArr);
        while (true) {
            k4Var.f43885du = new C13047jd(c13047jd.m60997k4());
            c13053jm.m61640kk().mo60125k4(k4Var.f43885du, k4Var.f43887kk, c13047jdArr);
            if (c13053jm.m61641x1().mo60126k4() && !c13053jm.m61640kk().mo60038h4()) {
                k4Var.f43889x1.m61007x1(k4Var.f43885du);
            }
            if (c13053jm.m61640kk().mo60126k4()) {
                k4Var.f43887kk.m61007x1(k4Var.f43888to);
            }
            for (int iM61003to = k4Var.f43888to.m61003to(-1); iM61003to != -1; iM61003to = k4Var.f43888to.m61003to(iM61003to)) {
                c13047jdArr[iM61003to].m61007x1(k4Var.f43885du);
            }
            if (c13053jm.m61640kk().mo60038h4()) {
                ((C12893af) c13053jm.m61640kk()).m60039k4(k4Var.f43889x1.m61000kk());
            }
            if (stack.size() == 0) {
                return;
            }
            ((k4) stack.pop()).CloneTo(k4Var);
            c13053jm = k4Var.f43886k4;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13255vt, com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60040k4(AbstractC13255vt abstractC13255vt, C12930cj c12930cj, C12979f7 c12979f7) {
        m61643x1(abstractC13255vt, c12930cj, c12979f7);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public boolean mo60126k4() {
        C13053jm c13053jm = this;
        while (true) {
            if (c13053jm.m61640kk().mo60038h4() && C14046bv.m66453dy(((C12893af) c13053jm.m61640kk()).m60042to(), C7019kk.m27440jd(0, 9))) {
                return true;
            }
            if (!c13053jm.m61640kk().mo60126k4() && !c13053jm.m61640kk().mo60038h4()) {
                return false;
            }
            AbstractC12998ga abstractC12998gaM61641x1 = c13053jm.m61641x1();
            C13053jm c13053jm2 = (C13053jm) C7019kk.m27452k4((Object) abstractC12998gaM61641x1, C13053jm.class);
            if (c13053jm2 == null) {
                return abstractC12998gaM61641x1.mo60126k4();
            }
            c13053jm = c13053jm2;
        }
    }
}
