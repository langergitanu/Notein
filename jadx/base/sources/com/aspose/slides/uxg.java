package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class uxg extends AbstractC0753ak {

    /* JADX INFO: renamed from: com.aspose.slides.uxg$k4 */
    public static class C14654k4 extends AbstractC7020m9<C14654k4> {

        /* JADX INFO: renamed from: k4 */
        private int f49417k4;

        /* JADX INFO: renamed from: kk */
        private double f49418kk;

        /* JADX INFO: renamed from: to */
        private tbp f49419to;

        /* JADX INFO: renamed from: x1 */
        private int f49420x1;

        public C14654k4() {
            this.f49419to = new tbp();
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
            if (obj instanceof C14654k4) {
                return m71971x1((C14654k4) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(Integer.valueOf(this.f49417k4), Integer.valueOf(this.f49420x1), Double.valueOf(this.f49418kk), this.f49419to);
        }

        /* JADX INFO: renamed from: k4 */
        public final double m71972k4() {
            return this.f49418kk;
        }

        /* JADX INFO: renamed from: kk */
        public final double m71974kk() {
            return this.f49419to.f49091x1 * this.f49418kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
        public C14654k4 Clone() {
            C14654k4 c14654k4 = new C14654k4();
            CloneTo(c14654k4);
            return c14654k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final double m71976x1() {
            return this.f49419to.f49090k4 * this.f49418kk;
        }

        public C14654k4(int i, int i2, double d, tbp tbpVar) {
            tbp tbpVar2 = new tbp();
            this.f49419to = tbpVar2;
            this.f49417k4 = i;
            this.f49420x1 = i2;
            this.f49418kk = d;
            tbpVar.CloneTo(tbpVar2);
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m71971x1(C14654k4 c14654k4) {
            return c14654k4.f49417k4 == this.f49417k4 && c14654k4.f49420x1 == this.f49420x1 && c14654k4.f49418kk == this.f49418kk && C14067j2.m66728k4(c14654k4.f49419to, this.f49419to);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C14654k4 c14654k4) {
            c14654k4.f49417k4 = this.f49417k4;
            c14654k4.f49420x1 = this.f49420x1;
            c14654k4.f49418kk = this.f49418kk;
            this.f49419to.CloneTo(c14654k4.f49419to);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.uxg$x1 */
    public static class C14655x1 {

        /* JADX INFO: renamed from: c5 */
        private bay f49421c5;

        /* JADX INFO: renamed from: du */
        private double f49422du;

        /* JADX INFO: renamed from: dy */
        private bay f49423dy;

        /* JADX INFO: renamed from: h4 */
        private double f49424h4;

        /* JADX INFO: renamed from: k4 */
        private double f49425k4;

        /* JADX INFO: renamed from: kk */
        private double f49426kk;

        /* JADX INFO: renamed from: m9 */
        private double f49427m9;

        /* JADX INFO: renamed from: to */
        private double f49428to;

        /* JADX INFO: renamed from: x1 */
        private double f49429x1;

        public C14655x1(bay bayVar, bay bayVar2) {
            this.f49421c5 = bayVar2;
            this.f49423dy = bayVar;
            this.f49428to = bayVar2.m4074dy().m74262m9();
            this.f49422du = bayVar2.m4074dy().m74228ck();
            if (bayVar != null) {
                this.f49424h4 = bayVar.m4074dy().m74262m9();
                this.f49427m9 = bayVar.m4074dy().m74228ck();
            }
            this.f49426kk = 1.0d;
        }

        /* JADX INFO: renamed from: c5 */
        public final void m71977c5() {
            double dM74256kk = this.f49421c5.m4074dy().m74256kk(12);
            if (dM74256kk != 0.0d) {
                tbp tbpVarClone = yz6.m74162k4(dM74256kk, this.f49421c5.m4074dy().m74241jd(), this.f49421c5.m4074dy().m74290yj()).Clone();
                double dM74241jd = (tbpVarClone.f49090k4 / this.f49421c5.m4074dy().m74241jd()) * this.f49426kk;
                double dM74290yj = (tbpVarClone.f49091x1 / this.f49421c5.m4074dy().m74290yj()) * this.f49426kk;
                this.f49421c5.m4085k4(dM74290yj, 15);
                this.f49421c5.m4085k4(dM74241jd, 61);
                if (AbstractC0753ak.m3633k4(tbpVarClone.f49090k4 / this.f49421c5.m4074dy().m74241jd())) {
                    this.f49421c5.m4085k4(dM74241jd, 32);
                    this.f49421c5.m4085k4(dM74241jd, 18);
                }
                this.f49421c5.m4074dy().m74248k4(11, this.f49422du * dM74290yj);
                this.f49421c5.m4074dy().m74248k4(10, this.f49428to * dM74241jd);
            } else {
                this.f49421c5.m4086k4(this.f49426kk, 61, 15);
                this.f49421c5.m4074dy().m74248k4(11, m71986to());
                this.f49421c5.m4074dy().m74248k4(10, m71983kk());
            }
            bay bayVar = this.f49423dy;
            if (bayVar != null) {
                bayVar.m4086k4(this.f49426kk, 61, 15);
            }
        }

        /* JADX INFO: renamed from: du */
        public final double m71978du() {
            return this.f49424h4 * this.f49426kk;
        }

        /* JADX INFO: renamed from: dy */
        public final void m71979dy() {
            this.f49426kk = 1.0d;
        }

        /* JADX INFO: renamed from: h4 */
        public final double m71980h4() {
            return this.f49427m9 * this.f49426kk;
        }

        /* JADX INFO: renamed from: k4 */
        public final double m71981k4() {
            return this.f49425k4;
        }

        /* JADX INFO: renamed from: kk */
        public final double m71983kk() {
            return this.f49428to * this.f49426kk;
        }

        /* JADX INFO: renamed from: m9 */
        public final bay m71985m9() {
            return this.f49421c5;
        }

        /* JADX INFO: renamed from: to */
        public final double m71986to() {
            return this.f49422du * this.f49426kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final double m71987x1() {
            return this.f49429x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m71982k4(double d) {
            this.f49425k4 = d;
        }

        /* JADX INFO: renamed from: kk */
        public final void m71984kk(double d) {
            this.f49426kk = d;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m71988x1(double d) {
            this.f49429x1 = d;
        }
    }

    /* JADX INFO: renamed from: dy */
    private qu9 m71956dy() {
        return (qu9) m3643k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static double m71957k4(List<C14655x1> list, int i, int i2) {
        double dM71986to = 0.0d;
        for (int i3 = 0; i3 < i2 && i < list.size(); i3++) {
            if (list.get_Item(i).m71986to() > dM71986to) {
                dM71986to = list.get_Item(i).m71986to();
            }
            i++;
        }
        return dM71986to;
    }

    /* JADX INFO: renamed from: kk */
    private static double m71964kk(List<C14655x1> list, int i, int i2) {
        int i3 = 0;
        double dM71983kk = 0.0d;
        while (i3 < i2 && i < list.size()) {
            dM71983kk += list.get_Item(i).m71983kk() + (i3 < i2 + (-1) ? list.get_Item(i).m71978du() : 0.0d);
            i++;
            i3++;
        }
        return dM71983kk;
    }

    /* JADX INFO: renamed from: to */
    private static double m71966to(List<C14655x1> list, int i, int i2) {
        int i3 = 0;
        double dM71986to = 0.0d;
        while (i3 < i2 && i < list.size()) {
            dM71986to += list.get_Item(i).m71986to() + (i3 < i2 + (-1) ? list.get_Item(i).m71980h4() : 0.0d);
            i++;
            i3++;
        }
        return dM71986to;
    }

    /* JADX INFO: renamed from: x1 */
    private static double m71967x1(List<C14655x1> list, int i, int i2) {
        double dM71983kk = 0.0d;
        for (int i3 = 0; i3 < i2 && i < list.size(); i3++) {
            if (list.get_Item(i).m71983kk() > dM71983kk) {
                dM71983kk = list.get_Item(i).m71983kk();
            }
            i++;
        }
        return dM71983kk;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3640du(bay bayVar) {
        boolean z;
        if (bayVar.m4104u4() == null) {
            return true;
        }
        boolean z2 = true;
        for (uus uusVar : bayVar.m4104u4().m70184to()) {
            bay bayVarM71929x1 = uusVar.m71929x1(bayVar);
            if (bayVarM71929x1 != null && AbstractC0753ak.m3637m9(bayVarM71929x1)) {
                double dM4079k4 = bayVar.m4079k4(uusVar);
                double dM4075h4 = bayVarM71929x1.m4075h4(uusVar.m71918dy()) * dM4079k4;
                if (!yz6.m74166k4(uusVar.m71918dy()) || dM4079k4 >= 0.0d) {
                    z = true;
                } else {
                    z = true;
                    double dM74256kk = bayVarM71929x1.m4074dy().m74256kk(uusVar.m71924kk() == 61 ? 10 : 11);
                    if (dM74256kk != 0.0d) {
                        dM4075h4 = dM74256kk * dM4079k4;
                    }
                }
                if (AbstractC0753ak.m3634k4(dM4075h4, bayVarM71929x1.m4078k4(uusVar.m71918dy()) * dM4079k4)) {
                    double dM4072du = bayVar.m4072du(uusVar.m71924kk());
                    if (uusVar.m71928up() == 2 && AbstractC0753ak.m3634k4(dM4075h4, dM4072du)) {
                        if (mo3645k4(uusVar.m71924kk())) {
                            bayVar.m4095kk(uusVar.m71924kk(), dM4075h4);
                            z2 &= bayVar.m4072du(uusVar.m71924kk()) != dM4075h4 ? z : false;
                        }
                    }
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: k4 */
    private bay m71958k4(bay bayVar, List<bay> list) {
        C14244on c14244onM68722dy;
        if (bayVar.m4073du().m5149yj() != 1 || (c14244onM68722dy = bayVar.m4073du().m68722dy()) == null) {
            return null;
        }
        List.Enumerator<bay> it = list.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (next.m4073du() == c14244onM68722dy) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private tbp m71965kk(List<C14655x1> list, int i, int i2, double d, double d2) {
        double d3;
        double dM71986to;
        int i3;
        double d4;
        double d5;
        double d6;
        int i4 = i;
        int i5 = i2;
        double d7 = Double.MAX_VALUE;
        double d8 = Double.MAX_VALUE;
        boolean z = m71956dy().m69763m9() == 0 || m71956dy().m69763m9() == 2;
        boolean z2 = m71956dy().m69763m9() == 0 || m71956dy().m69763m9() == 1;
        int i6 = 0;
        int i7 = 0;
        double d9 = 0.0d;
        double dM71967x1 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        while (i6 < i5) {
            int i8 = i6;
            if (i7 >= list.size()) {
                break;
            }
            boolean z3 = (m71956dy().m69760h4() || (i8 % 2 == 0)) ? z2 : !z2;
            double d13 = d8;
            double d14 = d7;
            double dM71986to2 = d12;
            double d15 = d13;
            double d16 = d9;
            double d17 = d10;
            int i9 = 0;
            double d18 = 0.0d;
            double dM67502x1 = 0.0d;
            int i10 = i7;
            while (i9 < i4 && i10 < list.size()) {
                int i11 = i4 - 1;
                double dM71986to3 = list.get_Item(i10).m71986to() + (i9 < i11 ? list.get_Item(i10).m71980h4() : 0.0d);
                d18 += dM71986to3;
                int i12 = i7;
                dM67502x1 = C14116yg.m67502x1(dM67502x1, list.get_Item(i10).m71983kk());
                list.get_Item(i10).m71982k4(dM71967x1);
                list.get_Item(i10).m71988x1(dM71986to2);
                if (dM71967x1 < d14) {
                    d14 = dM71967x1;
                }
                if (dM71986to2 < d15) {
                    d15 = dM71986to2;
                }
                if (z3) {
                    dM71986to2 += dM71986to3;
                } else {
                    if (i9 < i11) {
                        dM71986to2 -= list.get_Item(i10).m71980h4();
                    }
                    int i13 = i10 + 1;
                    if (i13 < list.size()) {
                        dM71986to2 -= list.get_Item(i13).m71986to();
                    }
                }
                i10++;
                i9++;
                i4 = i;
                i7 = i12;
            }
            double d19 = dM67502x1;
            double d20 = dM71986to2;
            double d21 = d19;
            m71970x1(list, i7, i, d21);
            int i14 = i5 - 1;
            if (i8 != i14) {
                d21 += d;
            }
            if (z) {
                dM71967x1 += d21;
            } else {
                if (i8 != i14) {
                    dM71967x1 -= d;
                }
                dM71967x1 -= m71967x1(list, i10, i5);
            }
            double d22 = d16 + d21;
            double d23 = d18 + d11;
            if (d23 <= d17) {
                d23 = d17;
            }
            if (m71956dy().m69760h4()) {
                dM71986to = z3 ? d18 : -d18;
            } else if (i10 < list.size()) {
                dM71986to = ((double) (z3 ? 1 : -1)) * list.get_Item(i10).m71986to();
            } else {
                d3 = d20;
                if (m71956dy().m69758du()) {
                    i3 = i;
                    if (z3) {
                        d5 = d2;
                        d4 = d5;
                    } else {
                        d4 = d2;
                        d5 = -d4;
                    }
                    if (!m71956dy().m69760h4()) {
                        d5 = -d5;
                    }
                    d6 = d3 + d5;
                    d11 = m71956dy().m69760h4() ? d11 + d4 : d4;
                } else {
                    i3 = i;
                    double dM71966to = ((d18 - m71966to(list, i10, C14116yg.m67507x1(i3, list.size() - i10))) * ((double) (z3 ? 1 : -1))) / 2.0d;
                    if (!m71956dy().m69760h4()) {
                        dM71966to = -dM71966to;
                    }
                    d6 = d3 + dM71966to;
                }
                i6 = i8 + 1;
                double d24 = d6;
                i7 = i10;
                d9 = d22;
                d7 = d14;
                d8 = d15;
                d12 = d24;
                i5 = i2;
                i4 = i3;
                d10 = d23;
            }
            d3 = d20 - dM71986to;
            if (m71956dy().m69758du()) {
            }
            i6 = i8 + 1;
            double d242 = d6;
            i7 = i10;
            d9 = d22;
            d7 = d14;
            d8 = d15;
            d12 = d242;
            i5 = i2;
            i4 = i3;
            d10 = d23;
        }
        double d25 = d9;
        double d26 = d10;
        List.Enumerator<C14655x1> it = list.iterator();
        while (it.hasNext()) {
            try {
                C14655x1 next = it.next();
                next.m71982k4(next.m71981k4() - d7);
                next.m71988x1(next.m71987x1() - d8);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new tbp(d25, d26);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private tbp m71968x1(List<C14655x1> list, int i, int i2, double d, double d2) {
        double d3;
        double dM71983kk;
        int i3;
        int i4;
        double d4;
        double d5;
        double d6;
        int i5 = i;
        int i6 = i2;
        double d7 = Double.MAX_VALUE;
        double d8 = Double.MAX_VALUE;
        boolean z = m71956dy().m69763m9() == 0 || m71956dy().m69763m9() == 2;
        boolean z2 = m71956dy().m69763m9() == 0 || m71956dy().m69763m9() == 1;
        int i7 = 0;
        int i8 = 0;
        double d9 = 0.0d;
        double dM71957k4 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        while (i7 < i5 && i8 < list.size()) {
            double d13 = d8;
            double d14 = d7;
            double dM71983kk2 = d12;
            double d15 = d13;
            boolean z3 = (m71956dy().m69760h4() || (i7 % 2 == 0)) ? z : !z;
            double d16 = d9;
            double d17 = d10;
            int i9 = 0;
            double d18 = 0.0d;
            double dM67502x1 = 0.0d;
            int i10 = i8;
            while (i9 < i6 && i10 < list.size()) {
                int i11 = i6 - 1;
                double dM71983kk3 = list.get_Item(i10).m71983kk() + (i9 < i11 ? list.get_Item(i10).m71978du() : 0.0d);
                d18 += dM71983kk3;
                int i12 = i8;
                dM67502x1 = C14116yg.m67502x1(dM67502x1, list.get_Item(i10).m71986to());
                list.get_Item(i10).m71982k4(dM71983kk2);
                list.get_Item(i10).m71988x1(dM71957k4);
                if (dM71983kk2 < d14) {
                    d14 = dM71983kk2;
                }
                if (dM71957k4 < d15) {
                    d15 = dM71957k4;
                }
                if (z3) {
                    dM71983kk2 += dM71983kk3;
                } else {
                    if (i9 < i11) {
                        dM71983kk2 -= list.get_Item(i10).m71978du();
                    }
                    int i13 = i10 + 1;
                    if (i13 < list.size()) {
                        dM71983kk2 -= list.get_Item(i13).m71983kk();
                    }
                }
                i10++;
                i9++;
                i6 = i2;
                i8 = i12;
            }
            double d19 = dM67502x1;
            double d20 = dM71983kk2;
            double d21 = d19;
            int i14 = i7;
            m71963k4(list, i8, i2, d21);
            int i15 = i - 1;
            if (i14 != i15) {
                d21 += d;
            }
            if (z2) {
                dM71957k4 += d21;
            } else {
                if (i14 != i15) {
                    dM71957k4 -= d;
                }
                dM71957k4 -= m71957k4(list, i10, i2);
            }
            double d22 = d17 + d21;
            double d23 = d18 + d11;
            if (d23 > d16) {
                d16 = d23;
            }
            if (m71956dy().m69760h4()) {
                dM71983kk = z3 ? d18 : -d18;
            } else if (i10 < list.size()) {
                dM71983kk = ((double) (z3 ? 1 : -1)) * list.get_Item(i10).m71983kk();
            } else {
                d3 = d20;
                if (m71956dy().m69758du()) {
                    i3 = i2;
                    i4 = i14;
                    if (z3) {
                        d5 = d2;
                        d4 = d5;
                    } else {
                        d4 = d2;
                        d5 = -d4;
                    }
                    if (!m71956dy().m69760h4()) {
                        d5 = -d5;
                    }
                    d6 = d3 + d5;
                    d11 = m71956dy().m69760h4() ? d11 + d4 : d4;
                } else {
                    i3 = i2;
                    i4 = i14;
                    double dM71964kk = ((d18 - m71964kk(list, i10, C14116yg.m67507x1(i3, list.size() - i10))) * ((double) (z3 ? 1 : -1))) / 2.0d;
                    if (!m71956dy().m69760h4()) {
                        dM71964kk = -dM71964kk;
                    }
                    d6 = d3 + dM71964kk;
                }
                i7 = i4 + 1;
                i6 = i3;
                d10 = d22;
                d7 = d14;
                d8 = d15;
                d12 = d6;
                i5 = i;
                i8 = i10;
                d9 = d16;
            }
            d3 = d20 - dM71983kk;
            if (m71956dy().m69758du()) {
            }
            i7 = i4 + 1;
            i6 = i3;
            d10 = d22;
            d7 = d14;
            d8 = d15;
            d12 = d6;
            i5 = i;
            i8 = i10;
            d9 = d16;
        }
        double d24 = d9;
        double d25 = d10;
        List.Enumerator<C14655x1> it = list.iterator();
        while (it.hasNext()) {
            try {
                C14655x1 next = it.next();
                next.m71982k4(next.m71981k4() - d7);
                next.m71988x1(next.m71987x1() - d8);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new tbp(d24, d25);
    }

    /* JADX INFO: renamed from: k4 */
    private tbp m71959k4(List<C14655x1> list, int i, int i2, double d, double d2) {
        double d3 = m71956dy().m69758du() ? 0.0d : d2;
        return m71956dy().m69759dy() ? m71968x1(list, i, i2, d, (list.get_Item(0).m71983kk() + list.get_Item(0).m71978du()) * d3) : m71965kk(list, i, i2, d, (list.get_Item(0).m71986to() + list.get_Item(0).m71980h4()) * d3);
    }

    /* JADX INFO: renamed from: x1 */
    private C14654k4 m71969x1(List<C14655x1> list, tbp tbpVar, double d, double d2) {
        int i = 1;
        int i2 = 1;
        while (i * i2 < list.size()) {
            if (m71956dy().m69759dy()) {
                if (i2 > i) {
                    i++;
                } else {
                    i2++;
                }
            } else if (i > i2) {
                i2++;
            } else {
                i++;
            }
        }
        return m71960k4(list, i, i2, d, d2, tbpVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private C14654k4 m71960k4(List<C14655x1> list, int i, int i2, double d, double d2, tbp tbpVar) {
        tbp tbpVarClone = m71959k4(list, i, i2, d, d2).Clone();
        return new C14654k4(i2, i, C14116yg.m67491kk(1.0d, C14116yg.m67491kk(tbpVar.f49091x1 / tbpVarClone.f49091x1, tbpVar.f49090k4 / tbpVarClone.f49090k4)), tbpVarClone.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private void m71970x1(List<C14655x1> list, int i, int i2, double d) {
        for (int i3 = 0; i3 < i2 && i < list.size(); i3++) {
            list.get_Item(i).m71982k4(list.get_Item(i).m71981k4() + (m71956dy().m69757c5() == 3 ? d - list.get_Item(i).m71983kk() : m71956dy().m69757c5() == 2 ? (d - list.get_Item(i).m71983kk()) / 2.0d : 0.0d));
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C14654k4 m71961k4(List<C14655x1> list, tbp tbpVar, double d, double d2) {
        List.Enumerator<C14655x1> it;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        tbp tbpVar2 = tbpVar;
        int size = list.size();
        int i10 = 1;
        double d3 = 1.0d;
        int i11 = 1;
        int i12 = 1;
        double dM67502x1 = 1.0d;
        while (true) {
            if (size <= 0) {
                break;
            }
            int size2 = list.size() - i10;
            if (dM67502x1 != d3) {
                it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().m71984kk(dM67502x1);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            double d4 = d * dM67502x1;
            int i13 = 1;
            int i14 = 1;
            tbp tbpVarClone = m71959k4(list, 1, 1, d4, d2).Clone();
            if (m71956dy().m69759dy()) {
                int i15 = 1;
                while (size2 > 0 && tbpVarClone.f49090k4 <= tbpVar2.f49090k4) {
                    int i16 = i15 + 1;
                    m71959k4(list, 1, i16, d4, d2).CloneTo(tbpVarClone);
                    if (tbpVarClone.f49090k4 <= tbpVar2.f49090k4) {
                        size2--;
                        i15 = i16;
                    }
                }
                int i17 = 1;
                while (size2 > 0 && tbpVarClone.f49091x1 <= tbpVar2.f49091x1) {
                    int i18 = i17 + 1;
                    int i19 = i15;
                    m71959k4(list, i18, i19, d4, d2).CloneTo(tbpVarClone);
                    if (tbpVarClone.f49091x1 <= tbpVar2.f49091x1) {
                        size2 -= i19;
                        i17 = i18;
                    }
                    i15 = i19;
                }
                i3 = i17;
                i4 = i15;
            } else {
                while (true) {
                    i = i13;
                    while (size2 > 0 && tbpVarClone.f49091x1 <= tbpVar2.f49091x1) {
                        i13 = i + 1;
                        m71959k4(list, i13, 1, d4, d2).CloneTo(tbpVarClone);
                        if (tbpVarClone.f49091x1 <= tbpVar2.f49091x1) {
                            break;
                        }
                    }
                    size2--;
                }
                while (true) {
                    i2 = i14;
                    while (size2 > 0 && tbpVarClone.f49090k4 <= tbpVar2.f49090k4) {
                        i14 = i2 + 1;
                        i5 = i;
                        m71959k4(list, i5, i14, d4, d2).CloneTo(tbpVarClone);
                        i6 = size2;
                        if (tbpVarClone.f49090k4 <= tbpVar2.f49090k4) {
                            break;
                        }
                        size2 = i6;
                        i = i5;
                    }
                    size2 = i6 - i5;
                    i = i5;
                }
                i3 = i;
                i4 = i2;
                size2 = size2;
            }
            if (size2 > 0) {
                i9 = i3;
                tbp tbpVarClone2 = m71959k4(list, i3, i4 + 1, d4, d2).Clone();
                i8 = i4;
                tbp tbpVarClone3 = m71959k4(list, i9 + 1, i8, d4, d2).Clone();
                double dM67491kk = C14116yg.m67491kk(tbpVar2.f49091x1 / tbpVarClone3.f49091x1, tbpVar2.f49090k4 / tbpVarClone3.f49090k4);
                i7 = size2;
                dM67502x1 *= C14116yg.m67502x1(dM67491kk, C14116yg.m67491kk(tbpVar2.f49091x1 / tbpVarClone2.f49091x1, tbpVar2.f49090k4 / tbpVarClone2.f49090k4));
            } else {
                i7 = size2;
                i8 = i4;
                i9 = i3;
            }
            tbpVar2 = tbpVar;
            i11 = i9;
            size = i7;
            i12 = i8;
            i10 = 1;
            d3 = 1.0d;
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().m71979dy();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return m71960k4(list, i11, i12, d, d2, tbpVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private C14654k4 m71962k4(List<C14655x1> list, tbp tbpVar, double d, double d2, int i) {
        int iM67507x1 = C14116yg.m67507x1(i, list.size());
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) list.size()) / ((double) i))), 14);
        return m71960k4(list, m71956dy().m69759dy() ? iM27462to : iM67507x1, m71956dy().m69759dy() ? iM67507x1 : iM27462to, d, d2, tbpVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m71963k4(List<C14655x1> list, int i, int i2, double d) {
        for (int i3 = 0; i3 < i2 && i < list.size(); i3++) {
            list.get_Item(i).m71988x1(list.get_Item(i).m71987x1() + (m71956dy().m69761jd() == 3 ? d - list.get_Item(i).m71986to() : m71956dy().m69761jd() == 2 ? (d - list.get_Item(i).m71986to()) / 2.0d : 0.0d));
            i++;
        }
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public void mo3644k4(bay bayVar, double d) {
        bayVar.m4085k4(d, 30);
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3645k4(int i) {
        return i == 30;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:82|6|(5:86|8|9|10|89)(3:85|16|88)|87)|3|4|78) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = th;
     */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3646k4(bay bayVar) throws Throwable {
        z2c z2cVarM4074dy;
        double dM67502x1;
        List<C14655x1> list = new List<>();
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (next.m4073du().m5149yj() == 1) {
                    list.addItem(new C14655x1(m71958k4(next, bayVar.m4110x1()), next));
                }
            } catch (Throwable th) {
                th = th;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (list.size() != 0) {
            double dM4072du = bayVar.m4072du(30);
            tbp tbpVar = new tbp(bayVar.m4072du(61), bayVar.m4072du(15));
            if (m71956dy().m69759dy()) {
                tbpVar.f49090k4 = C14116yg.m67502x1(1.0d, (bayVar.m4072du(61) - bayVar.m4072du(3)) - bayVar.m4072du(14));
            } else {
                tbpVar.f49091x1 = C14116yg.m67502x1(1.0d, (bayVar.m4072du(15) - bayVar.m4072du(3)) - bayVar.m4072du(14));
            }
            C14654k4 c14654k4 = new C14654k4();
            int iM69762kk = m71956dy().m69762kk();
            (iM69762kk != 1 ? iM69762kk != 2 ? m71961k4(list, tbpVar.Clone(), dM4072du, bayVar.m4072du(0)) : m71962k4(list, tbpVar.Clone(), dM4072du, bayVar.m4072du(0), C14116yg.m67483k4(1, m71956dy().m69764to())) : m71969x1(list, tbpVar.Clone(), dM4072du, bayVar.m4072du(0))).CloneTo(c14654k4);
            bayVar.m4074dy().m74259kk(c14654k4.m71976x1());
            bayVar.m4074dy().m74239h4(c14654k4.m71974kk());
            if (m71956dy().m69759dy()) {
                bayVar.m4074dy().m74270to(C14116yg.m67502x1(1.0d, (bayVar.m4072du(61) - bayVar.m4072du(3)) - bayVar.m4072du(14)));
                z2cVarM4074dy = bayVar.m4074dy();
                dM67502x1 = bayVar.m4072du(15);
            } else {
                bayVar.m4074dy().m74270to(bayVar.m4072du(61));
                z2cVarM4074dy = bayVar.m4074dy();
                dM67502x1 = C14116yg.m67502x1(1.0d, (bayVar.m4072du(15) - bayVar.m4072du(3)) - bayVar.m4072du(14));
            }
            z2cVarM4074dy.m74263m9(dM67502x1);
            AbstractC0753ak.m3638x1(bayVar, m71956dy().m5210k4(), m71956dy().m5212x1());
            List.Enumerator<C14655x1> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    C14655x1 next2 = it2.next();
                    next2.m71985m9().m4074dy().m74252k4(new tbp(next2.m71981k4(), next2.m71987x1()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            if (AbstractC0753ak.m3633k4(c14654k4.m71972k4())) {
                bayVar.m4085k4(c14654k4.m71972k4(), 30);
                it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        C14655x1 next3 = it2.next();
                        next3.m71984kk(c14654k4.m71972k4());
                        next3.m71977c5();
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                bayVar.m4105um();
                return false;
            }
        }
        return true;
    }
}
