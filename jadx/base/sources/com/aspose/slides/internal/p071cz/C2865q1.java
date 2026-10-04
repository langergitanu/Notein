package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.q1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2865q1 extends AbstractC7020m9<C2865q1> {

    /* JADX INFO: renamed from: k4 */
    private double f8718k4;

    /* JADX INFO: renamed from: x1 */
    private double f8719x1;

    public C2865q1() {
        this.f8718k4 = 0.0d;
        this.f8719x1 = 0.0d;
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
        if (obj instanceof C2865q1) {
            return m12476x1((C2865q1) obj);
        }
        return false;
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m12477k4() {
        return this.f8718k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12025x6 m12479kk() {
        return new C12025x6((float) this.f8718k4, (float) this.f8719x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public C2865q1 Clone() {
        C2865q1 c2865q1 = new C2865q1();
        CloneTo(c2865q1);
        return c2865q1;
    }

    public String toString() {
        return C14113y2.m67402k4("X = {0:0.#} Y = {1:0.#}", Double.valueOf(this.f8718k4), Double.valueOf(this.f8719x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final double m12481x1() {
        return this.f8719x1;
    }

    public C2865q1(double d, double d2) {
        if (C14044b3.m66437kk(d)) {
            throw new ArgumentOutOfRangeException("x");
        }
        if (C14044b3.m66437kk(d2)) {
            throw new ArgumentOutOfRangeException("y");
        }
        this.f8718k4 = d;
        this.f8719x1 = d2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2968xo m12475k4(C2865q1 c2865q1, C2865q1 c2865q12) {
        return new C2968xo(c2865q1.m12477k4() - c2865q12.m12477k4(), c2865q1.m12481x1() - c2865q12.m12481x1());
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m12476x1(C2865q1 c2865q1) {
        return c2865q1.f8718k4 == this.f8718k4 && c2865q1.f8719x1 == this.f8719x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C2865q1 c2865q1) {
        c2865q1.f8718k4 = m12477k4();
        c2865q1.f8719x1 = m12481x1();
    }
}
