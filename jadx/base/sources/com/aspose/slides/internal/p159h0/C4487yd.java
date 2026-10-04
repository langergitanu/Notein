package com.aspose.slides.internal.p159h0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.yd */
/* JADX INFO: loaded from: classes.dex */
public class C4487yd extends AbstractC7020m9<C4487yd> {

    /* JADX INFO: renamed from: k4 */
    private double f12340k4;

    /* JADX INFO: renamed from: x1 */
    private double f12341x1;

    public C4487yd() {
        this.f12340k4 = 0.0d;
        this.f12341x1 = 0.0d;
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
        if (obj instanceof C4487yd) {
            return m18477x1((C4487yd) obj);
        }
        return false;
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m18478k4() {
        return this.f12340k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C4487yd Clone() {
        C4487yd c4487yd = new C4487yd();
        CloneTo(c4487yd);
        return c4487yd;
    }

    public String toString() {
        return C14113y2.m67402k4("X = {0:0.#} Y = {1:0.#}", Double.valueOf(this.f12340k4), Double.valueOf(this.f12341x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final double m18481x1() {
        return this.f12341x1;
    }

    public C4487yd(double d, double d2) {
        if (C14044b3.m66437kk(d)) {
            throw new ArgumentOutOfRangeException("x");
        }
        if (C14044b3.m66437kk(d2)) {
            throw new ArgumentOutOfRangeException("y");
        }
        this.f12340k4 = d;
        this.f12341x1 = d2;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m18477x1(C4487yd c4487yd) {
        return c4487yd.f12340k4 == this.f12340k4 && c4487yd.f12341x1 == this.f12341x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4487yd c4487yd) {
        c4487yd.f12340k4 = this.f12340k4;
        c4487yd.f12341x1 = this.f12341x1;
    }
}
