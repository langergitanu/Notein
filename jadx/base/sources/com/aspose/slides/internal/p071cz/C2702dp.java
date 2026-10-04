package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.dp */
/* JADX INFO: loaded from: classes3.dex */
public class C2702dp extends AbstractC7020m9<C2702dp> {

    /* JADX INFO: renamed from: k4 */
    private double f8560k4;

    /* JADX INFO: renamed from: kk */
    private double f8561kk;

    /* JADX INFO: renamed from: x1 */
    private double f8562x1;

    public C2702dp() {
        this.f8560k4 = 0.0d;
        this.f8562x1 = 0.0d;
        this.f8561kk = 0.0d;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m12207x1(C2702dp c2702dp) {
        return c2702dp.f8560k4 == this.f8560k4 && c2702dp.f8562x1 == this.f8562x1 && c2702dp.f8561kk == this.f8561kk;
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
        if (obj instanceof C2702dp) {
            return m12207x1((C2702dp) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f8560k4), Double.valueOf(this.f8562x1), Double.valueOf(this.f8561kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2702dp Clone() {
        C2702dp c2702dp = new C2702dp();
        CloneTo(c2702dp);
        return c2702dp;
    }

    public C2702dp(double d, double d2, double d3) {
        this.f8560k4 = d;
        this.f8562x1 = d2;
        this.f8561kk = d3;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C2702dp c2702dp) {
        c2702dp.f8560k4 = this.f8560k4;
        c2702dp.f8562x1 = this.f8562x1;
        c2702dp.f8561kk = this.f8561kk;
    }
}
