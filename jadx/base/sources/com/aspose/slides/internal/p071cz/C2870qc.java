package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.qc */
/* JADX INFO: loaded from: classes3.dex */
public class C2870qc extends AbstractC7020m9<C2870qc> {

    /* JADX INFO: renamed from: k4 */
    private double f8722k4;

    /* JADX INFO: renamed from: kk */
    private double f8723kk;

    /* JADX INFO: renamed from: x1 */
    private double f8724x1;

    public C2870qc() {
        this.f8722k4 = 0.0d;
        this.f8724x1 = 0.0d;
        this.f8723kk = 0.0d;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m12485x1(C2870qc c2870qc) {
        return c2870qc.f8722k4 == this.f8722k4 && c2870qc.f8724x1 == this.f8724x1 && c2870qc.f8723kk == this.f8723kk;
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
        if (obj instanceof C2870qc) {
            return m12485x1((C2870qc) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f8722k4), Double.valueOf(this.f8724x1), Double.valueOf(this.f8723kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2870qc Clone() {
        C2870qc c2870qc = new C2870qc();
        CloneTo(c2870qc);
        return c2870qc;
    }

    public C2870qc(double d, double d2, double d3) {
        this.f8722k4 = d;
        this.f8724x1 = d2;
        this.f8723kk = d3;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C2870qc c2870qc) {
        c2870qc.f8722k4 = this.f8722k4;
        c2870qc.f8724x1 = this.f8724x1;
        c2870qc.f8723kk = this.f8723kk;
    }
}
