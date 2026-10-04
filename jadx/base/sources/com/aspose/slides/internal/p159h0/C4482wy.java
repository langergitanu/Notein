package com.aspose.slides.internal.p159h0;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.wy */
/* JADX INFO: loaded from: classes.dex */
public class C4482wy extends AbstractC7020m9<C4482wy> {

    /* JADX INFO: renamed from: k4 */
    private double f12325k4;

    /* JADX INFO: renamed from: kk */
    private double f12326kk;

    /* JADX INFO: renamed from: to */
    private double f12327to;

    /* JADX INFO: renamed from: x1 */
    private double f12328x1;

    public C4482wy() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C4482wy Clone() {
        C4482wy c4482wy = new C4482wy();
        CloneTo(c4482wy);
        return c4482wy;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4482wy) {
            return m18433x1((C4482wy) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f12325k4), Double.valueOf(this.f12328x1), Double.valueOf(this.f12326kk), Double.valueOf(this.f12327to));
    }

    /* JADX INFO: renamed from: k4 */
    public final double m18435k4() {
        return this.f12325k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m18437kk() {
        return this.f12328x1;
    }

    /* JADX INFO: renamed from: to */
    public final double m18438to() {
        return this.f12327to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m18439x1() {
        return this.f12326kk;
    }

    public C4482wy(double d, double d2, double d3, double d4) {
        this.f12325k4 = d;
        this.f12328x1 = d3;
        this.f12326kk = d2;
        this.f12327to = d4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m18433x1(C4482wy c4482wy) {
        return c4482wy.f12325k4 == this.f12325k4 && c4482wy.f12328x1 == this.f12328x1 && c4482wy.f12326kk == this.f12326kk && c4482wy.f12327to == this.f12327to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4482wy c4482wy) {
        c4482wy.f12325k4 = this.f12325k4;
        c4482wy.f12328x1 = this.f12328x1;
        c4482wy.f12326kk = this.f12326kk;
        c4482wy.f12327to = this.f12327to;
    }
}
