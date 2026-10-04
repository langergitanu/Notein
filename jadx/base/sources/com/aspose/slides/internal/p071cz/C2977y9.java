package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2977y9 implements IGenericEnumerable<C2865q1> {

    /* JADX INFO: renamed from: k4 */
    private final List<C2865q1> f8814k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f8815kk;

    /* JADX INFO: renamed from: to */
    private boolean f8816to;

    /* JADX INFO: renamed from: x1 */
    private final int f8817x1;

    public C2977y9(int i) {
        this.f8817x1 = i;
        this.f8814k4 = new List<>();
        this.f8816to = false;
        this.f8815kk = true;
    }

    /* JADX INFO: renamed from: du */
    public final void m12624du() {
        this.f8816to = true;
        this.f8814k4.trimExcess();
    }

    /* JADX INFO: renamed from: h4 */
    public final C2842o2 m12625h4() {
        if (this.f8814k4.size() == 0) {
            return new C2842o2();
        }
        int size = this.f8814k4.size();
        double dM12477k4 = -1.7976931348623157E308d;
        double dM12481x1 = -1.7976931348623157E308d;
        double dM12477k42 = Double.MAX_VALUE;
        double dM12481x12 = Double.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2865q1 c2865q1M12480to = this.f8814k4.get_Item(i).Clone();
            if (c2865q1M12480to.m12477k4() < dM12477k42) {
                dM12477k42 = c2865q1M12480to.m12477k4();
            }
            if (c2865q1M12480to.m12481x1() < dM12481x12) {
                dM12481x12 = c2865q1M12480to.m12481x1();
            }
            if (c2865q1M12480to.m12477k4() > dM12477k4) {
                dM12477k4 = c2865q1M12480to.m12477k4();
            }
            if (c2865q1M12480to.m12481x1() > dM12481x1) {
                dM12481x1 = c2865q1M12480to.m12481x1();
            }
        }
        return new C2842o2(dM12477k42, dM12481x12, dM12477k4, dM12481x1);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C2865q1> iterator() {
        return this.f8814k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m12626k4() {
        return this.f8814k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public final int m12630kk() {
        return this.f8817x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m12631to() {
        return this.f8815kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m12632x1() {
        return this.f8816to;
    }

    public C2977y9(int i, boolean z) {
        this.f8817x1 = i;
        this.f8814k4 = new List<>();
        this.f8816to = false;
        this.f8815kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2865q1 m12627k4(int i) {
        return this.f8814k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12628k4(int i, C2865q1 c2865q1) {
        this.f8814k4.set_Item(i, c2865q1.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12629k4(C2865q1 c2865q1) {
        this.f8814k4.addItem(c2865q1.Clone());
    }
}
