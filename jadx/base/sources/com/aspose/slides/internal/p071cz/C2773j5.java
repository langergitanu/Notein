package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.j5 */
/* JADX INFO: loaded from: classes3.dex */
final class C2773j5 implements IGenericCloneable<C2773j5> {

    /* JADX INFO: renamed from: c5 */
    private final double f8631c5;

    /* JADX INFO: renamed from: du */
    private final int f8632du;

    /* JADX INFO: renamed from: dy */
    private final boolean f8633dy;

    /* JADX INFO: renamed from: h4 */
    private final double f8634h4;

    /* JADX INFO: renamed from: k4 */
    private double f8635k4;

    /* JADX INFO: renamed from: kk */
    private C2848op f8636kk;

    /* JADX INFO: renamed from: m9 */
    private final List<C2848op> f8637m9 = new List<>();

    /* JADX INFO: renamed from: to */
    private final boolean f8638to;

    /* JADX INFO: renamed from: x1 */
    private double f8639x1;

    public C2773j5(double d, double d2, int i, boolean z, boolean z2) {
        this.f8631c5 = d;
        this.f8634h4 = d2;
        this.f8632du = i;
        this.f8638to = z;
        this.f8633dy = z2;
        m12342k4(1.0d);
        m12350x1(1.0d);
    }

    /* JADX INFO: renamed from: m9 */
    private C2848op m12338m9() {
        C2848op c2848op = this.f8636kk;
        if (c2848op == null || c2848op.m12453k4()) {
            C2848op c2848op2 = new C2848op(this.f8631c5, this.f8634h4, this.f8632du, this.f8638to, this.f8633dy);
            this.f8636kk = c2848op2;
            m12337k4(c2848op2);
        }
        return this.f8636kk;
    }

    /* JADX INFO: renamed from: du */
    public final double m12339du() {
        return this.f8635k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m12340h4() {
        return this.f8639x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C2674bu> m12341k4() {
        List<C2674bu> list = new List<>();
        List.Enumerator<C2848op> it = this.f8637m9.iterator();
        while (it.hasNext()) {
            try {
                C2674bu c2674buM12454kk = it.next().m12454kk();
                if (C14116yg.m67475k4(1.0d - m12339du()) > 0.01d || C14116yg.m67475k4(1.0d - m12340h4()) > 0.01d) {
                    c2674buM12454kk.m12160x1(m12339du(), m12340h4(), true);
                    c2674buM12454kk.m12144du();
                }
                list.addItem(c2674buM12454kk);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final void m12347kk() {
        C2848op c2848op = new C2848op(this.f8631c5, this.f8634h4, this.f8632du, this.f8638to, this.f8633dy);
        this.f8636kk = c2848op;
        m12337k4(c2848op);
    }

    /* JADX INFO: renamed from: to */
    public final void m12348to() {
        m12338m9().m12446du();
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C2773j5 cloneT() {
        C2773j5 c2773j5 = new C2773j5(this.f8631c5, this.f8634h4, this.f8632du, this.f8638to, this.f8633dy);
        List.Enumerator<C2848op> it = this.f8637m9.iterator();
        while (it.hasNext()) {
            try {
                c2773j5.m12337k4(it.next().cloneT());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c2773j5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12342k4(double d) {
        this.f8635k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12350x1(double d) {
        this.f8639x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12343k4(double d, double d2) {
        m12338m9().m12448k4(d, d2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12351x1(double d, double d2) {
        if (!m12338m9().m12457x1()) {
            this.f8636kk = null;
        }
        m12338m9().m12456x1(d, d2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12344k4(double d, double d2, double d3, double d4) {
        m12338m9().m12449k4(d, d2, d3, d4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12337k4(C2848op c2848op) {
        this.f8637m9.addItem(c2848op);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12345k4(C2865q1 c2865q1, C2865q1 c2865q12) {
        m12338m9().m12451k4(c2865q1.Clone(), c2865q12.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12346k4(C2865q1 c2865q1, C2865q1 c2865q12, C2865q1 c2865q13) {
        m12338m9().m12452k4(c2865q1.Clone(), c2865q12.Clone(), c2865q13.Clone());
    }
}
