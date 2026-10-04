package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.dq */
/* JADX INFO: loaded from: classes.dex */
public final class C4439dq implements IGenericEnumerable<C4436c6> {

    /* JADX INFO: renamed from: dy */
    private C4485xk f12193dy;

    /* JADX INFO: renamed from: k4 */
    private int f12195k4;

    /* JADX INFO: renamed from: kk */
    private boolean f12196kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f12199x1;

    /* JADX INFO: renamed from: to */
    private C4459os f12198to = new C4459os();

    /* JADX INFO: renamed from: du */
    private C4459os f12192du = new C4459os();

    /* JADX INFO: renamed from: h4 */
    private List<C4436c6> f12194h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private List<C4439dq> f12197m9 = new List<>();

    public C4439dq(C4485xk c4485xk) {
        this.f12193dy = c4485xk;
        m18141k4(0);
        m18128k4(false);
        m18131x1(false);
    }

    /* JADX INFO: renamed from: kk */
    private void m18129kk(C4459os c4459os) {
        this.f12192du = c4459os.Clone();
    }

    /* JADX INFO: renamed from: yj */
    private void m18132yj() {
        m18130x1(new C4459os(Float.POSITIVE_INFINITY));
        m18129kk(new C4459os(Float.NEGATIVE_INFINITY));
        if (this.f12194h4.size() == 0) {
            return;
        }
        List.Enumerator<C4436c6> it = this.f12194h4.iterator();
        while (it.hasNext()) {
            try {
                C4436c6 next = it.next();
                m18130x1(new C4459os(C14116yg.m67504x1(m18147to().m18285k4(), next.m18113to()), C14116yg.m67504x1(m18147to().m18290x1(), next.m18107du())));
                m18129kk(new C4459os(C14116yg.m67481k4(m18135du().m18285k4(), next.m18113to()), C14116yg.m67481k4(m18135du().m18290x1(), next.m18107du())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m18133c5() {
        int i = 1;
        while (i < this.f12194h4.size()) {
            if (C4459os.m18282x1(this.f12194h4.get_Item(i).m18108k4(), this.f12194h4.get_Item(i - 1).m18108k4()).m18288kk() < 1.0f) {
                this.f12194h4.removeAt(i);
                i--;
            }
            i++;
        }
        if (m18151x1() && !C4479w6.m18415k4(this.f12194h4.get_Item(0).m18108k4().Clone(), ((C4436c6) OooO0O0.OooO00o(this.f12194h4, 1)).m18108k4().Clone())) {
            List<C4436c6> list = this.f12194h4;
            list.addItem(new C4436c6(list.get_Item(0).m18108k4().Clone(), 1));
        }
        m18132yj();
    }

    /* JADX INFO: renamed from: ck */
    public final List<C4439dq> m18134ck() {
        return this.f12197m9;
    }

    /* JADX INFO: renamed from: du */
    public final C4459os m18135du() {
        return this.f12192du.Clone();
    }

    /* JADX INFO: renamed from: dy */
    public final void m18136dy() {
        int i = 0;
        float fM18290x1 = 0.0f;
        while (i < this.f12194h4.size() - 1) {
            C4459os c4459osClone = this.f12194h4.get_Item(i).m18108k4().Clone();
            i++;
            C4459os c4459osClone2 = this.f12194h4.get_Item(i).m18108k4().Clone();
            fM18290x1 += (c4459osClone.m18290x1() + c4459osClone2.m18290x1()) * (c4459osClone2.m18285k4() - c4459osClone.m18285k4());
        }
        if ((m18140k4() != 1 || fM18290x1 <= 0.0f) && (m18140k4() != 2 || fM18290x1 >= 0.0f)) {
            return;
        }
        this.f12194h4.reverse();
        m18131x1(true);
    }

    /* JADX INFO: renamed from: fa */
    public final C11896dy m18137fa() {
        C11896dy c11896dy = new C11896dy();
        m18127k4(c11896dy);
        return c11896dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m18138h4() {
        return this.f12194h4.size();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C4436c6> iterator() {
        return this.f12194h4.iterator();
    }

    /* JADX INFO: renamed from: jd */
    public final void m18139jd() {
        int size = !C4479w6.m18415k4(this.f12194h4.get_Item(0).m18108k4().Clone(), ((C4436c6) OooO0O0.OooO00o(this.f12194h4, 1)).m18108k4().Clone()) ? this.f12194h4.size() : this.f12194h4.size() - 1;
        if (size < 4) {
            return;
        }
        int i = 0;
        while (i < size) {
            C4459os c4459os = new C4459os();
            int i2 = i + 1;
            int i3 = i2 % size;
            int i4 = (i + 2) % size;
            C4459os[] c4459osArr = {c4459os};
            boolean zM18417k4 = C4479w6.m18417k4(this.f12194h4.get_Item(i).m18108k4().Clone(), this.f12194h4.get_Item(i3).m18108k4().Clone(), this.f12194h4.get_Item(i4).m18108k4().Clone(), this.f12194h4.get_Item((i + 3) % size).m18108k4().Clone(), c4459osArr);
            c4459osArr[0].CloneTo(c4459os);
            if (zM18417k4) {
                this.f12194h4.get_Item(i3).m18111k4(c4459os.Clone());
                this.f12194h4.removeAt(i4);
                size--;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m18140k4() {
        return this.f12195k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m18146m9() {
        m18128k4(true);
    }

    /* JADX INFO: renamed from: to */
    public final C4459os m18147to() {
        return this.f12198to.Clone();
    }

    /* JADX INFO: renamed from: up */
    public final C4485xk m18148up() {
        return this.f12193dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4436c6 m18149x1(int i) {
        return this.f12194h4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18141k4(int i) {
        this.f12195k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m18145kk() {
        return this.f12196kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18150x1(C4439dq c4439dq) {
        this.f12197m9.addItem(c4439dq);
    }

    /* JADX INFO: renamed from: x1 */
    private void m18130x1(C4459os c4459os) {
        this.f12198to = c4459os.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18142k4(C4436c6 c4436c6) {
        this.f12194h4.addItem(c4436c6);
    }

    /* JADX INFO: renamed from: x1 */
    private void m18131x1(boolean z) {
        this.f12196kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18143k4(C4459os c4459os) {
        List.Enumerator<C4436c6> it = this.f12194h4.iterator();
        while (it.hasNext()) {
            try {
                C4436c6 next = it.next();
                next.m18111k4(new C4459os(next.m18108k4().m18285k4() - c4459os.m18285k4(), c4459os.m18290x1() - next.m18108k4().m18290x1()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m18132yj();
    }

    /* JADX INFO: renamed from: k4 */
    private void m18127k4(C11896dy c11896dy) {
        int i = 0;
        while (i < this.f12194h4.size() - 1) {
            float fM18113to = this.f12194h4.get_Item(i).m18113to();
            float fM18107du = this.f12194h4.get_Item(i).m18107du();
            i++;
            c11896dy.m55574x1(fM18113to, fM18107du, this.f12194h4.get_Item(i).m18113to(), this.f12194h4.get_Item(i).m18107du());
        }
        if (m18151x1()) {
            c11896dy.m55567m9();
        } else {
            c11896dy.m55585yj();
        }
        List.Enumerator<C4439dq> it = this.f12197m9.iterator();
        while (it.hasNext()) {
            try {
                it.next().m18127k4(c11896dy);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m18151x1() {
        return this.f12199x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m18128k4(boolean z) {
        this.f12199x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m18144k4(C4439dq c4439dq) {
        return m18147to().m18285k4() > c4439dq.m18147to().m18285k4() && m18147to().m18290x1() > c4439dq.m18147to().m18290x1() && m18135du().m18285k4() < c4439dq.m18135du().m18285k4() && m18135du().m18290x1() < c4439dq.m18135du().m18290x1();
    }
}
