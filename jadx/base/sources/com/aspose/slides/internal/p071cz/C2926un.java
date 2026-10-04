package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.un */
/* JADX INFO: loaded from: classes3.dex */
public final class C2926un implements IGenericCloneable<C2926un> {

    /* JADX INFO: renamed from: du */
    private C2966xk f8770du;

    /* JADX INFO: renamed from: dy */
    private C2808m2 f8771dy;

    /* JADX INFO: renamed from: h4 */
    private C2966xk f8772h4;

    /* JADX INFO: renamed from: k4 */
    private double f8773k4;

    /* JADX INFO: renamed from: kk */
    private int f8774kk = 9;

    /* JADX INFO: renamed from: m9 */
    private C2808m2 f8775m9;

    /* JADX INFO: renamed from: to */
    private double f8776to;

    /* JADX INFO: renamed from: x1 */
    private double f8777x1;

    public C2926un() {
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public C2926un cloneT() {
        return new C2926un(this);
    }

    /* JADX INFO: renamed from: du */
    public C2966xk m12552du() {
        return this.f8770du;
    }

    /* JADX INFO: renamed from: dy */
    public C2808m2 m12553dy() {
        return this.f8771dy;
    }

    /* JADX INFO: renamed from: h4 */
    public C2966xk m12554h4() {
        return this.f8772h4;
    }

    /* JADX INFO: renamed from: k4 */
    public double m12555k4() {
        return this.f8773k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m12560kk() {
        return this.f8774kk;
    }

    /* JADX INFO: renamed from: m9 */
    public C2808m2 m12562m9() {
        return this.f8775m9;
    }

    /* JADX INFO: renamed from: to */
    public double m12563to() {
        return this.f8776to;
    }

    /* JADX INFO: renamed from: x1 */
    public double m12564x1() {
        return this.f8777x1;
    }

    private C2926un(C2926un c2926un) {
        m12556k4(c2926un.m12555k4());
        m12565x1(c2926un.m12564x1());
        m12557k4(c2926un.m12560kk());
        m12561kk(c2926un.m12563to());
        m12559k4(c2926un.m12552du());
        m12567x1(c2926un.m12554h4());
        m12558k4(c2926un.m12562m9());
        m12566x1(c2926un.m12553dy());
    }

    /* JADX INFO: renamed from: k4 */
    public void m12556k4(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8773k4 = d;
    }

    /* JADX INFO: renamed from: kk */
    public void m12561kk(double d) {
        this.f8776to = d;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12565x1(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8777x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12557k4(int i) {
        this.f8774kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12566x1(C2808m2 c2808m2) {
        if (this.f8771dy != c2808m2) {
            this.f8771dy = c2808m2 != null ? c2808m2.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12558k4(C2808m2 c2808m2) {
        if (this.f8775m9 != c2808m2) {
            this.f8775m9 = c2808m2 != null ? c2808m2.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m12567x1(C2966xk c2966xk) {
        if (this.f8772h4 != c2966xk) {
            this.f8772h4 = c2966xk != null ? c2966xk.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12559k4(C2966xk c2966xk) {
        if (this.f8770du != c2966xk) {
            this.f8770du = c2966xk != null ? c2966xk.cloneT() : null;
        }
    }
}
