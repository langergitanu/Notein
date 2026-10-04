package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jof extends AbstractC7020m9<jof> {

    /* JADX INFO: renamed from: k4 */
    private double f45537k4;

    /* JADX INFO: renamed from: kk */
    private double f45538kk;

    /* JADX INFO: renamed from: to */
    private double f45539to;

    /* JADX INFO: renamed from: x1 */
    private double f45540x1;

    static {
        C7019kk.m27454k4(tbp.class, (InterfaceC7014c5) new InterfaceC7014c5<tbp>() { // from class: com.aspose.slides.jof.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public tbp mo838x1() {
                return new tbp();
            }
        });
    }

    public jof() {
    }

    /* JADX INFO: renamed from: c5 */
    public final double m63453c5() {
        return C14116yg.m67475k4(this.f45538kk - this.f45537k4);
    }

    /* JADX INFO: renamed from: ck */
    public final tbp m63454ck() {
        return new tbp((m63453c5() / 2.0d) + m63460k4(), (m63459jd() / 2.0d) + m63473x1());
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final double m63455du() {
        return this.f45537k4;
    }

    /* JADX INFO: renamed from: dy */
    public final double m63456dy() {
        return this.f45539to;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof jof) {
            return m63450du((jof) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public final double m63457fa() {
        return C14116yg.m67496rv(C14116yg.m67469du(m63459jd(), 2.0d) + C14116yg.m67469du(m63453c5(), 2.0d));
    }

    /* JADX INFO: renamed from: h4 */
    public final double m63458h4() {
        return this.f45540x1;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f45537k4), Double.valueOf(this.f45540x1), Double.valueOf(this.f45538kk), Double.valueOf(this.f45539to));
    }

    /* JADX INFO: renamed from: jd */
    public final double m63459jd() {
        return C14116yg.m67475k4(this.f45539to - this.f45540x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m63460k4() {
        return C14116yg.m67491kk(this.f45537k4, this.f45538kk);
    }

    /* JADX INFO: renamed from: kk */
    public final double m63464kk() {
        return m63460k4() + m63453c5();
    }

    /* JADX INFO: renamed from: ks */
    public final tbp[] m63467ks() {
        return new tbp[]{new tbp(m63460k4(), m63473x1()), new tbp(m63464kk(), m63473x1()), new tbp(m63464kk(), m63470to()), new tbp(m63460k4(), m63470to())};
    }

    /* JADX INFO: renamed from: m9 */
    public final double m63468m9() {
        return this.f45538kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: rv, reason: merged with bridge method [inline-methods] */
    public jof Clone() {
        jof jofVar = new jof();
        CloneTo(jofVar);
        return jofVar;
    }

    /* JADX INFO: renamed from: to */
    public final double m63470to() {
        return m63473x1() + m63459jd();
    }

    public String toString() {
        return C14113y2.m67402k4("X = {0:0.0} Y = {1:0.0} Width = {2:0.0} Height = {3:0.0}", Double.valueOf(m63460k4()), Double.valueOf(m63473x1()), Double.valueOf(m63453c5()), Double.valueOf(m63459jd()));
    }

    /* JADX INFO: renamed from: up */
    public final double m63472up() {
        double dM67467ck = C14116yg.m67467ck(m63459jd() / m63457fa()) * 57.29577951308232d;
        double d = this.f45537k4;
        double d2 = this.f45538kk;
        double d3 = this.f45540x1;
        double d4 = this.f45539to;
        char c = d <= d2 ? d3 <= d4 ? (char) 2 : (char) 1 : d3 <= d4 ? (char) 3 : (char) 4;
        if (c == 1) {
            return 360.0d - dM67467ck;
        }
        if (c == 2) {
            return dM67467ck;
        }
        if (c == 3) {
            return 180.0d - dM67467ck;
        }
        if (c != 4) {
            return 0.0d;
        }
        return dM67467ck + 180.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m63473x1() {
        return C14116yg.m67491kk(this.f45540x1, this.f45539to);
    }

    /* JADX INFO: renamed from: yj */
    public final tbp m63477yj() {
        double dM63457fa = m63457fa();
        return new tbp((this.f45537k4 - this.f45538kk) / dM63457fa, (this.f45540x1 - this.f45539to) / dM63457fa);
    }

    public jof(double d, double d2, double d3, double d4) {
        this.f45537k4 = d;
        this.f45540x1 = d2;
        this.f45538kk = d3;
        this.f45539to = d4;
    }

    /* JADX INFO: renamed from: du */
    private boolean m63450du(jof jofVar) {
        return jofVar.f45537k4 == this.f45537k4 && jofVar.f45540x1 == this.f45540x1 && jofVar.f45538kk == this.f45538kk && jofVar.f45539to == this.f45539to;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ezv> m63461k4(double d, double d2) {
        ezv ezvVar;
        ezv ezvVar2;
        List<ezv> list = new List<>(2);
        if (C14116yg.m67475k4(d - this.f45537k4) >= 1.0E-4d) {
            if (C14116yg.m67475k4(d - this.f45538kk) < 1.0E-4d) {
                ezvVar = new ezv((byte) 1, (byte) 0);
            }
            if (C14116yg.m67475k4(d2 - this.f45540x1) >= 1.0E-4d) {
                ezvVar2 = new ezv((byte) 0, (byte) -1);
            } else {
                if (C14116yg.m67475k4(d2 - this.f45539to) >= 1.0E-4d) {
                    return list;
                }
                ezvVar2 = new ezv((byte) 0, (byte) 1);
            }
            list.addItem(ezvVar2);
            return list;
        }
        ezvVar = new ezv((byte) -1, (byte) 0);
        list.addItem(ezvVar);
        if (C14116yg.m67475k4(d2 - this.f45540x1) >= 1.0E-4d) {
        }
        list.addItem(ezvVar2);
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final jof m63465kk(double d, double d2) {
        return new jof(m63460k4() + d, m63473x1() + d2, m63464kk() + d, m63470to() + d2);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public void CloneTo(jof jofVar) {
        jofVar.f45537k4 = this.f45537k4;
        jofVar.f45540x1 = this.f45540x1;
        jofVar.f45538kk = this.f45538kk;
        jofVar.f45539to = this.f45539to;
    }

    /* JADX INFO: renamed from: x1 */
    public final jof m63474x1(double d) {
        return new jof(m63454ck().Clone(), m63453c5() * d, m63459jd() * d);
    }

    public jof(IGenericEnumerable<jof> iGenericEnumerable) {
        this.f45537k4 = Double.MAX_VALUE;
        this.f45540x1 = Double.MAX_VALUE;
        this.f45538kk = -1.7976931348623157E308d;
        this.f45539to = -1.7976931348623157E308d;
        IGenericEnumerator<jof> it = iGenericEnumerable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                jof next = it.next();
                if (!z) {
                    z = true;
                }
                this.f45537k4 = C14116yg.m67491kk(this.f45537k4, next.m63460k4());
                this.f45540x1 = C14116yg.m67491kk(this.f45540x1, next.m63473x1());
                this.f45538kk = C14116yg.m67502x1(this.f45538kk, next.m63460k4() + next.m63453c5());
                this.f45539to = C14116yg.m67502x1(this.f45539to, next.m63473x1() + next.m63459jd());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (z) {
            return;
        }
        this.f45539to = 0.0d;
        this.f45538kk = 0.0d;
        this.f45540x1 = 0.0d;
        this.f45537k4 = 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final jof m63462k4(double d) {
        return m63475x1(d, d);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m63466kk(jof jofVar) {
        return C14116yg.m67477k4(jofVar.m63460k4(), 3) >= C14116yg.m67477k4(m63460k4(), 3) && C14116yg.m67477k4(jofVar.m63473x1(), 3) >= C14116yg.m67477k4(m63473x1(), 3) && jofVar.m63464kk() <= m63464kk() && jofVar.m63470to() <= m63470to();
    }

    /* JADX INFO: renamed from: x1 */
    public final jof m63475x1(double d, double d2) {
        return new jof(m63460k4() - d, m63473x1() - d2, m63464kk() + d, m63470to() + d2);
    }

    public jof(tbp tbpVar, double d, double d2) {
        double d3 = tbpVar.f49090k4;
        double d4 = d / 2.0d;
        this.f45537k4 = d3 - d4;
        double d5 = tbpVar.f49091x1;
        double d6 = d2 / 2.0d;
        this.f45540x1 = d5 - d6;
        this.f45538kk = d3 + d4;
        this.f45539to = d5 + d6;
    }

    /* JADX INFO: renamed from: k4 */
    public final jof m63463k4(jof jofVar) {
        return new jof(C14116yg.m67491kk(m63460k4(), jofVar.m63460k4()), C14116yg.m67491kk(m63473x1(), jofVar.m63473x1()), C14116yg.m67502x1(m63460k4() + m63453c5(), jofVar.m63460k4() + jofVar.m63453c5()), C14116yg.m67502x1(m63473x1() + m63459jd(), jofVar.m63473x1() + jofVar.m63459jd()));
    }

    /* JADX INFO: renamed from: x1 */
    public final jof m63476x1(jof jofVar) {
        double dM67502x1 = C14116yg.m67502x1(0.0d, C14116yg.m67491kk(m63464kk(), jofVar.m63464kk()) - C14116yg.m67502x1(m63460k4(), jofVar.m63460k4()));
        double dM67502x12 = C14116yg.m67502x1(0.0d, C14116yg.m67491kk(m63470to(), jofVar.m63470to()) - C14116yg.m67502x1(m63473x1(), jofVar.m63473x1()));
        if (dM67502x1 <= 0.0d || dM67502x12 <= 0.0d) {
            return new jof();
        }
        double dM67491kk = C14116yg.m67491kk(m63464kk(), jofVar.m63464kk());
        double dM67491kk2 = C14116yg.m67491kk(m63470to(), jofVar.m63470to());
        return new jof(dM67491kk - dM67502x1, dM67491kk2 - dM67502x12, dM67491kk, dM67491kk2);
    }

    public jof(tbp tbpVar, double d, double d2, double d3) {
        this(new tbp(tbpVar.f49090k4 * d, tbpVar.f49091x1 * d), d2, d3);
    }

    /* JADX INFO: renamed from: k4 */
    public static jof m63451k4(jof jofVar, jof jofVar2) {
        return jofVar.m63476x1(jofVar2.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public static jof m63452x1(jof jofVar, jof jofVar2) {
        return jofVar.m63463k4(jofVar2.Clone());
    }

    public jof(tbp tbpVar, tbp tbpVar2) {
        this(tbpVar.f49090k4, tbpVar.f49091x1, tbpVar2.f49090k4, tbpVar2.f49091x1);
    }
}
