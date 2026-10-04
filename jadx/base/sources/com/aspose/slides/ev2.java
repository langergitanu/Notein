package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class ev2 extends AbstractC7020m9<ev2> {

    /* JADX INFO: renamed from: k4 */
    public oju f4883k4 = new oju();

    /* JADX INFO: renamed from: x1 */
    public oju f4884x1 = new oju();

    public ev2() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5735x1(ev2 ev2Var) {
        return C14067j2.m66728k4(ev2Var.f4883k4, this.f4883k4) && C14067j2.m66728k4(ev2Var.f4884x1, this.f4884x1);
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
        if (obj instanceof ev2) {
            return m5735x1((ev2) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f4883k4, this.f4884x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public ev2 Clone() {
        ev2 ev2Var = new ev2();
        CloneTo(ev2Var);
        return ev2Var;
    }

    public ev2(oju ojuVar, oju ojuVar2) {
        ojuVar.CloneTo(this.f4883k4);
        ojuVar2.CloneTo(this.f4884x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final oju m5737k4(float f) {
        return oju.m68619k4(this.f4883k4, oju.m68617k4(this.f4884x1, f));
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m5734k4(oju ojuVar, oju ojuVar2, float f) {
        return oju.m68619k4(ojuVar, oju.m68617k4(oju.m68622x1(ojuVar2, ojuVar), f));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(ev2 ev2Var) {
        this.f4883k4.CloneTo(ev2Var.f4883k4);
        this.f4884x1.CloneTo(ev2Var.f4884x1);
    }
}
