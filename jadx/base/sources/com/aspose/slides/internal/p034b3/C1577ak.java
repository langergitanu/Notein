package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.ak */
/* JADX INFO: loaded from: classes3.dex */
public class C1577ak extends C1606x1 {

    /* JADX INFO: renamed from: c5 */
    private int f6094c5;

    /* JADX INFO: renamed from: ck */
    private int f6095ck;

    /* JADX INFO: renamed from: dy */
    private List<C1578ar> f6096dy;

    /* JADX INFO: renamed from: fa */
    private int f6097fa;

    /* JADX INFO: renamed from: jd */
    private int f6098jd;

    public C1577ak(int i, int i2, int i3) {
        m8667k4(31, Boolean.TRUE);
        this.f6094c5 = i;
        this.f6098jd = i2;
        this.f6214k4 = i3;
        this.f6097fa = 0;
        m8471yd();
    }

    /* JADX INFO: renamed from: yd */
    private void m8471yd() {
        this.f6096dy = new List<>(this.f6094c5);
        int i = this.f6214k4;
        int i2 = this.f6094c5;
        this.f6095ck = (i - ((i2 - 1) * this.f6098jd)) / i2;
        for (int i3 = 0; i3 < this.f6094c5; i3++) {
            this.f6096dy.addItem(new C1578ar(this.f6095ck));
        }
    }

    /* JADX INFO: renamed from: ar */
    public final int m8472ar() {
        return this.f6097fa;
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m8473bv() {
        return this.f6097fa < this.f6094c5 - 1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C1578ar m8474c5(int i) {
        if (i < 0 || i >= this.f6094c5) {
            throw new ArgumentException(C14113y2.m67408k4("Invalid column number ", C14057f9.m66591x1(i), " requested; only 0-", C14057f9.m66591x1(this.f6094c5 - 1), " available."));
        }
        return this.f6096dy.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8475k4(InterfaceC1380to interfaceC1380to) {
        List.Enumerator<C1578ar> it;
        boolean zM27456k4;
        if (interfaceC1380to.mo8170j2().m8127x1() != 202) {
            m8661h4();
            it = this.f6096dy.iterator();
            while (it.hasNext()) {
                try {
                    it.next().m8661h4();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        m8676to(1);
        it = this.f6096dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().m8676to(1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: lr */
    public final boolean m8476lr() {
        int size = 0;
        for (int i = 0; i < m8478u4(); i++) {
            C1578ar c1578arM8474c5 = m8474c5(i);
            if (c1578arM8474c5 != null && c1578arM8474c5.m8584v4() != null) {
                size += c1578arM8474c5.m8584v4().size();
            }
        }
        return size == 0;
    }

    /* JADX INFO: renamed from: qq */
    public final C1578ar m8477qq() {
        return m8474c5(this.f6097fa);
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    public String toString() {
        C6765kp c6765kp = new C6765kp(super.toString());
        if (this.f6094c5 > 1) {
            c6765kp.m26792k4(" {colCount=").m26805kk(this.f6094c5);
            c6765kp.m26792k4(", colWidth=").m26805kk(this.f6095ck);
            c6765kp.m26792k4(", curFlowIdx=").m26805kk(this.f6097fa);
            c6765kp.m26792k4("}");
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: u4 */
    public final int m8478u4() {
        return this.f6094c5;
    }

    /* JADX INFO: renamed from: um */
    public final C1578ar m8479um() {
        if (!m8473bv()) {
            throw new InvalidOperationException("(Internal error.) No more flows left in span.");
        }
        int i = this.f6097fa + 1;
        this.f6097fa = i;
        return m8474c5(i);
    }

    /* JADX INFO: renamed from: uz */
    public final int m8480uz() {
        return this.f6095ck;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m8481v4() {
        int iM67483k4 = Integer.MIN_VALUE;
        for (int i = 0; i < this.f6094c5; i++) {
            iM67483k4 = C14116yg.m67483k4(iM67483k4, m8474c5(i).m8654du());
        }
        this.f6217x1 = iM67483k4;
    }

    /* JADX INFO: renamed from: wl */
    public final int m8482wl() {
        return mo8658e_();
    }
}
