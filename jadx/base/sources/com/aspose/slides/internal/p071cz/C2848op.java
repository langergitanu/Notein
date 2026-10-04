package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.op */
/* JADX INFO: loaded from: classes3.dex */
final class C2848op implements IGenericCloneable<C2848op> {

    /* JADX INFO: renamed from: du */
    private boolean f8698du;

    /* JADX INFO: renamed from: dy */
    private final double f8699dy;

    /* JADX INFO: renamed from: h4 */
    private C2865q1 f8700h4;

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC2836nm> f8701k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private final int f8702kk;

    /* JADX INFO: renamed from: m9 */
    private final boolean f8703m9;

    /* JADX INFO: renamed from: to */
    private final double f8704to;

    /* JADX INFO: renamed from: x1 */
    private final boolean f8705x1;

    public C2848op(double d, double d2, int i, boolean z, boolean z2) {
        this.f8700h4 = new C2865q1();
        this.f8699dy = d;
        this.f8704to = d2;
        this.f8702kk = i;
        this.f8705x1 = z;
        this.f8703m9 = z2;
        this.f8700h4 = new C2865q1();
    }

    /* JADX INFO: renamed from: du */
    public final void m12446du() {
        this.f8698du = true;
    }

    /* JADX INFO: renamed from: h4 */
    public final C2848op m12447h4() {
        C2848op c2848op = new C2848op(this.f8699dy, this.f8704to, this.f8702kk, this.f8705x1, this.f8703m9);
        this.f8700h4.CloneTo(c2848op.f8700h4);
        return c2848op;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12448k4(double d, double d2) {
        m12445k4(new C2750hc(d, d2));
    }

    /* JADX INFO: renamed from: kk */
    public final C2674bu m12454kk() {
        C2674bu c2674bu = new C2674bu(0);
        C2865q1 c2865q1Clone = this.f8700h4.Clone();
        List.Enumerator<AbstractC2836nm> it = this.f8701k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo12231k4(c2674bu, c2865q1Clone.Clone()).CloneTo(c2865q1Clone);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c2674bu;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final C2848op cloneT() {
        C2848op c2848opM12447h4 = m12447h4();
        c2848opM12447h4.f8698du = this.f8698du;
        List.Enumerator<AbstractC2836nm> it = this.f8701k4.iterator();
        while (it.hasNext()) {
            try {
                c2848opM12447h4.f8701k4.addItem(it.next().cloneT());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c2848opM12447h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12456x1(double d, double d2) {
        m12450k4(new C2865q1(d, d2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12449k4(double d, double d2, double d3, double d4) {
        m12445k4(new C2932uz(d2, d, d3, d4));
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m12457x1() {
        return this.f8701k4.size() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m12445k4(AbstractC2836nm abstractC2836nm) {
        this.f8701k4.addItem(abstractC2836nm);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12450k4(C2865q1 c2865q1) {
        c2865q1.CloneTo(this.f8700h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12451k4(C2865q1 c2865q1, C2865q1 c2865q12) {
        m12445k4(new C2716en(c2865q1.Clone(), c2865q12.Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12452k4(C2865q1 c2865q1, C2865q1 c2865q12, C2865q1 c2865q13) {
        m12445k4(new C2983yo(c2865q1.Clone(), c2865q12.Clone(), c2865q13.Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m12453k4() {
        return this.f8698du;
    }
}
