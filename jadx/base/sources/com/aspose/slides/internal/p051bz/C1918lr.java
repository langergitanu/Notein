package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4289qw;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1918lr extends AbstractC4282kp implements InterfaceC1984kk {

    /* JADX INFO: renamed from: k4 */
    private int f6847k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1986to f6848kk;

    /* JADX INFO: renamed from: to */
    private int f6849to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1986to f6850x1;

    public C1918lr(int i, InterfaceC1986to interfaceC1986to) {
        this.f6848kk = null;
        this.f6847k4 = i;
        this.f6850x1 = interfaceC1986to;
        this.f6849to = interfaceC1986to.mo9885x1();
    }

    /* JADX INFO: renamed from: kk */
    private InterfaceC1986to m9875kk(InterfaceC1981h4 interfaceC1981h4) {
        switch (this.f6847k4) {
            case 1:
                return C1924u4.m9897k4(this.f6850x1, this.f6848kk, interfaceC1981h4);
            case 2:
                return C1924u4.m9906x1(this.f6850x1, this.f6848kk, interfaceC1981h4);
            case 3:
                return C1924u4.m9899kk(this.f6850x1, this.f6848kk, interfaceC1981h4);
            case 4:
                return C1924u4.m9902to(this.f6850x1, this.f6848kk, interfaceC1981h4);
            case 5:
                return C1924u4.m9890du(this.f6850x1, this.f6848kk, interfaceC1981h4);
            case 6:
                return C1924u4.m9904x1(this.f6850x1, interfaceC1981h4);
            case 7:
                return C1924u4.m9895k4(this.f6850x1, interfaceC1981h4);
            case 8:
                return C1924u4.m9892h4(this.f6850x1, this.f6848kk, interfaceC1981h4);
            case 9:
                return C1924u4.m9900m9(this.f6850x1, this.f6848kk, interfaceC1981h4);
            default:
                throw new C1921qq(C14113y2.m67408k4("Unknown expr operation ", C14057f9.m66591x1(this.f6847k4)));
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final double m9876c5() {
        double dM9876c5 = C7019kk.m27469x1(this.f6850x1, C1918lr.class) ? ((C1918lr) this.f6850x1).m9876c5() : C7019kk.m27469x1(this.f6850x1, C4289qw.class) ? ((C4289qw) this.f6850x1).m17259yj() : 0.0d;
        double dM9876c52 = C7019kk.m27469x1(this.f6848kk, C1918lr.class) ? ((C1918lr) this.f6848kk).m9876c5() : C7019kk.m27469x1(this.f6848kk, C4289qw.class) ? ((C4289qw) this.f6848kk).m17259yj() : 0.0d;
        if (dM9876c5 != 0.0d && dM9876c52 != 0.0d) {
            int i = this.f6847k4;
            if (i == 1) {
                return dM9876c5 + dM9876c52;
            }
            if (i == 2) {
                return dM9876c5 - dM9876c52;
            }
            if (i == 3) {
                return dM9876c5 * dM9876c52;
            }
            if (i == 4) {
                return dM9876c5 / dM9876c52;
            }
            if (i == 5) {
                return dM9876c5 % dM9876c52;
            }
            if (i == 8) {
                return C14116yg.m67502x1(dM9876c5, dM9876c52);
            }
            if (i == 9) {
                return C14116yg.m67491kk(dM9876c5, dM9876c52);
            }
        } else {
            if (dM9876c5 != 0.0d) {
                int i2 = this.f6847k4;
                return i2 != 6 ? i2 != 7 ? dM9876c5 : C14116yg.m67475k4(dM9876c5) : -dM9876c5;
            }
            if (dM9876c52 != 0.0d) {
                return dM9876c52;
            }
        }
        return 0.0d;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: dy */
    public InterfaceC1984kk mo9877dy() {
        if (this.f6849to == 1) {
            return this;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7019kk.m27469x1(obj, C1918lr.class)) {
            return false;
        }
        C1918lr c1918lr = (C1918lr) obj;
        return this.f6849to == c1918lr.f6849to && C10017to.m49170k4(this.f6850x1, c1918lr.f6850x1) && C10017to.m49170k4(this.f6848kk, c1918lr.f6848kk) && this.f6847k4 == c1918lr.f6847k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: h4 */
    public InterfaceC1986to mo9878h4() {
        return this;
    }

    public int hashCode() {
        return ((C10017to.m49168k4(this.f6848kk) + ((C10017to.m49168k4(this.f6850x1) + ((this.f6849to + 31) * 31)) * 31)) * 31) + this.f6847k4;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final double mo9879k4() {
        return m9875kk(null).mo9880k4((InterfaceC1981h4) null);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: to */
    public final int mo9884to() {
        try {
            return C7019kk.m27462to(Double.valueOf(mo9879k4()), 14);
        } catch (C1921qq unused) {
            return 0;
        }
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        int i = this.f6847k4;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return C14113y2.m67407k4("(", this.f6850x1, " ", Character.valueOf(" +-*/%".charAt(i)), this.f6848kk, ")");
            case 6:
                return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + this.f6850x1;
            case 7:
                return C14113y2.m67407k4("abs(", this.f6850x1, ")");
            case 8:
                return C14113y2.m67407k4("max(", this.f6850x1, ", ", this.f6848kk, ")");
            case 9:
                return C14113y2.m67407k4("min(", this.f6850x1, ", ", this.f6848kk, ")");
            default:
                return C14113y2.m67408k4("unknown operation ", C14057f9.m66591x1(i));
        }
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9885x1() {
        return this.f6849to;
    }

    public C1918lr(int i, InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        this.f6847k4 = i;
        this.f6850x1 = interfaceC1986to;
        this.f6848kk = interfaceC1986to2;
        if (i == 3) {
            this.f6849to = interfaceC1986to2.mo9885x1() + interfaceC1986to.mo9885x1();
        } else if (i != 4) {
            this.f6849to = interfaceC1986to.mo9885x1();
        } else {
            this.f6849to = interfaceC1986to.mo9885x1() - interfaceC1986to2.mo9885x1();
        }
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final double mo9880k4(InterfaceC1981h4 interfaceC1981h4) {
        return m9875kk(interfaceC1981h4).mo9880k4(interfaceC1981h4);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: kk */
    public final boolean mo9883kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9886x1(InterfaceC1981h4 interfaceC1981h4) {
        try {
            return C7019kk.m27462to(Double.valueOf(mo9880k4(interfaceC1981h4)), 14);
        } catch (C1921qq unused) {
            return 0;
        }
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final void mo9881k4(int i) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9882k4(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        if (this.f6850x1.equals(interfaceC1986to)) {
            this.f6850x1 = interfaceC1986to2;
        }
        if (this.f6848kk.equals(interfaceC1986to)) {
            this.f6848kk = interfaceC1986to2;
        }
        C1918lr c1918lr = (C1918lr) C7019kk.m27452k4((Object) this.f6850x1, C1918lr.class);
        if (c1918lr != null) {
            c1918lr.m9882k4(interfaceC1986to, interfaceC1986to2);
        }
        C1918lr c1918lr2 = (C1918lr) C7019kk.m27452k4((Object) this.f6848kk, C1918lr.class);
        if (c1918lr2 != null) {
            c1918lr2.m9882k4(interfaceC1986to, interfaceC1986to2);
        }
    }
}
