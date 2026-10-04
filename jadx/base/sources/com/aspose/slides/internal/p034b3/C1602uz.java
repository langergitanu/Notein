package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.uz */
/* JADX INFO: loaded from: classes3.dex */
public class C1602uz extends C1606x1 {

    /* JADX INFO: renamed from: c5 */
    private k4 f6193c5;

    /* JADX INFO: renamed from: dy */
    private int f6194dy;

    /* JADX INFO: renamed from: jd */
    private List<C12314dy> f6195jd;

    /* JADX INFO: renamed from: com.aspose.slides.internal.b3.uz$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        public double f6196du = 1.0d;

        /* JADX INFO: renamed from: h4 */
        public boolean f6197h4 = false;

        /* JADX INFO: renamed from: k4 */
        public int f6198k4;

        /* JADX INFO: renamed from: kk */
        public int f6199kk;

        /* JADX INFO: renamed from: to */
        public int f6200to;

        /* JADX INFO: renamed from: x1 */
        public int f6201x1;

        public k4(int i, int i2, int i3, int i4) {
            this.f6198k4 = i;
            this.f6201x1 = i2;
            this.f6199kk = i3;
            this.f6200to = i4;
        }

        public String toString() {
            return C14113y2.m67408k4(C14067j2.m66727k4(this).mo48540du(), ": diff=", C14057f9.m66591x1(this.f6201x1), ", variation=", C14044b3.m66425h4(this.f6196du), ", stretch=", C14057f9.m66591x1(this.f6199kk), ", shrink=", C14057f9.m66591x1(this.f6200to));
        }
    }

    public C1602uz() {
        this.f6194dy = 0;
        this.f6193c5 = null;
        this.f6195jd = new List<>();
    }

    /* JADX INFO: renamed from: ar */
    public final int m8631ar() {
        if (m8662h4(28)) {
            return m8657dy(28);
        }
        return 0;
    }

    /* JADX INFO: renamed from: bv */
    public final void m8632bv() {
        if (this.f6193c5.f6198k4 == 70) {
            int size = this.f6195jd.size();
            boolean zMo57567k4 = false;
            for (int i = 0; i < size; i++) {
                C12314dy c12314dy = this.f6195jd.get_Item(i);
                k4 k4Var = this.f6193c5;
                zMo57567k4 |= c12314dy.mo57567k4(k4Var.f6196du, k4Var.f6199kk, k4Var.f6200to);
            }
            if (!zMo57567k4) {
                this.f6193c5 = null;
                return;
            }
            k4 k4Var2 = this.f6193c5;
            if (!k4Var2.f6197h4) {
                k4Var2.f6197h4 = true;
            }
            k4Var2.f6196du = 1.0d;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m8633c5(int i) {
        this.f6194dy = i;
    }

    /* JADX INFO: renamed from: jd */
    public final void m8634jd(int i) {
        int iM8636qq = m8636qq();
        int iM8631ar = m8631ar();
        k4 k4Var = this.f6193c5;
        int i2 = k4Var.f6198k4;
        if (i2 == 23) {
            int i3 = i / 2;
            m8667k4(27, Integer.valueOf(iM8636qq - i3));
            m8667k4(28, Integer.valueOf(iM8631ar - i3));
            return;
        }
        if (i2 == 39) {
            m8667k4(27, Integer.valueOf(iM8636qq - i));
            return;
        }
        if (i2 != 70) {
            if (i2 != 135) {
                throw new Exception();
            }
            m8667k4(28, Integer.valueOf(iM8631ar - i));
            return;
        }
        double d = k4Var.f6196du;
        int i4 = k4Var.f6201x1;
        k4Var.f6196du = d * ((double) ((i4 - i) / i4));
        k4Var.f6201x1 = i4 - i;
        if (k4Var.f6197h4) {
            m8632bv();
        }
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public C12023wl mo8505k4(boolean z) {
        C12023wl c12023wlClone = C12023wl.f40585k4.Clone();
        List<C12314dy> list = this.f6195jd;
        if (list != null) {
            List.Enumerator<C12314dy> it = list.iterator();
            while (it.hasNext()) {
                try {
                    C12023wl c12023wlClone2 = it.next().mo8505k4(z).Clone();
                    c12023wlClone.m56860k4(c12023wlClone.m56865x1() + c12023wlClone2.m56865x1());
                    c12023wlClone.m56866x1(C14116yg.m67483k4(c12023wlClone2.m56862kk(), c12023wlClone.m56862kk()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (m8662h4(21)) {
            c12023wlClone.m56860k4(((Integer) m8655du(21)).intValue() + c12023wlClone.m56865x1());
        }
        return c12023wlClone;
    }

    /* JADX INFO: renamed from: qq */
    public final int m8636qq() {
        if (m8662h4(27)) {
            return m8657dy(27);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m8637u4() {
        return this.f6194dy;
    }

    /* JADX INFO: renamed from: um */
    public final void m8638um() {
        int size = this.f6195jd.size();
        int iM67483k4 = 0;
        int iM8654du = 0;
        for (int i = 0; i < size; i++) {
            iM67483k4 = C14116yg.m67483k4(iM67483k4, this.f6195jd.get_Item(i).m8659f_());
            iM8654du += this.f6195jd.get_Item(i).m8654du();
        }
        m8679x1(iM67483k4);
        m8670kk(iM8654du);
    }

    /* JADX INFO: renamed from: uz */
    public final int m8639uz() {
        k4 k4Var = this.f6193c5;
        if (k4Var != null) {
            return k4Var.f6201x1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: wl */
    public final List<C12314dy> m8640wl() {
        return this.f6195jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8641x1(List<C12314dy> list) {
        List.Enumerator<C12314dy> it = list.iterator();
        while (it.hasNext()) {
            try {
                C12314dy next = it.next();
                if (next.m8681x6() == null) {
                    next.mo8680x1(this);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f6195jd = list;
    }

    public C1602uz(int i, int i2, int i3, int i4) {
        this.f6194dy = 0;
        this.f6193c5 = null;
        this.f6195jd = new List<>();
        this.f6193c5 = new k4(i, i2, i3, i4);
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
        if (C7019kk.m27469x1(c1606x1, C12314dy.class)) {
            C12314dy c12314dy = (C12314dy) c1606x1;
            m8635k4(c12314dy);
            c12314dy.mo8680x1(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8635k4(C12314dy c12314dy) {
        this.f6195jd.addItem(c12314dy);
    }
}
