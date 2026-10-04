package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class cc3 extends AbstractC7020m9<cc3> {

    /* JADX INFO: renamed from: k4 */
    private int f4304k4;

    /* JADX INFO: renamed from: x1 */
    private String f4305x1;

    public cc3() {
        this.f4304k4 = 0;
        this.f4305x1 = null;
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
        if (obj instanceof cc3) {
            return m4534x1((cc3) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Integer.valueOf(this.f4304k4), this.f4305x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m4535k4() {
        return this.f4304k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public cc3 Clone() {
        cc3 cc3Var = new cc3();
        CloneTo(cc3Var);
        return cc3Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m4538x1() {
        return this.f4305x1;
    }

    public cc3(int i, String str) {
        this.f4304k4 = i;
        this.f4305x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m4534x1(cc3 cc3Var) {
        return cc3Var.f4304k4 == this.f4304k4 && C14067j2.m66728k4(cc3Var.f4305x1, this.f4305x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(cc3 cc3Var) {
        cc3Var.f4304k4 = this.f4304k4;
        cc3Var.f4305x1 = this.f4305x1;
    }
}
