package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.tq */
/* JADX INFO: loaded from: classes.dex */
public final class C5738tq {

    /* JADX INFO: renamed from: du */
    private boolean f15780du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC5768yn f15781h4;

    /* JADX INFO: renamed from: k4 */
    private String f15782k4;

    /* JADX INFO: renamed from: kk */
    private boolean f15783kk;

    /* JADX INFO: renamed from: m9 */
    private int f15784m9 = 0;

    /* JADX INFO: renamed from: to */
    private boolean f15785to;

    /* JADX INFO: renamed from: x1 */
    private boolean f15786x1;

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw m23328k4(C5686ca c5686ca) {
        this.f15780du = true;
        if (this.f15786x1) {
            return new C5681bs(c5686ca.m23215kk(), c5686ca.m23216to());
        }
        throw XPathException.create("'{0}' is an invalid key pattern. It either contains a variable reference or 'key()' function.", this.f15782k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5728qw m23340x1(String str, boolean z, boolean z2) {
        this.f15786x1 = z;
        this.f15783kk = z2;
        this.f15785to = false;
        return m23333k4(C5698gf.m23269x1(str), str);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw m23329k4(C5711kk c5711kk, int[] iArr) {
        iArr[0] = 0;
        switch (c5711kk.m23297kk()) {
            case 0:
                C5734ss c5734ss = new C5734ss(c5711kk.m23297kk(), null);
                iArr[0] = iArr[0] | 4;
                return c5734ss;
            case 1:
                C5734ss c5734ss2 = new C5734ss(c5711kk.m23297kk(), null);
                iArr[0] = iArr[0] | 2;
                return c5734ss2;
            case 2:
                return new C5734ss(2, m23332k4((AbstractC5746v4) c5711kk.m23298to().get_Item(0), 0, iArr));
            case 3:
                C5718m9 c5718m9 = new C5718m9(m23332k4((AbstractC5746v4) c5711kk.m23298to().get_Item(0), 0, iArr));
                iArr[0] = iArr[0] | 8;
                return c5718m9;
            case 4:
            case 5:
            case 6:
                return (c5711kk.m23298to() == null || c5711kk.m23298to().size() <= 0) ? new C5734ss(c5711kk.m23297kk(), null) : new C5734ss(c5711kk.m23297kk(), m23332k4((AbstractC5746v4) c5711kk.m23298to().get_Item(0), 0, iArr));
            case 7:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return new C5771zj(c5711kk.m23297kk(), AbstractC14092to.m67204k4((Object[]) m23337k4(c5711kk.m23298to(), iArr)));
            case 8:
            case 12:
            case 22:
                return new C5719my(c5711kk.m23297kk(), m23332k4((AbstractC5746v4) c5711kk.m23298to().get_Item(0), 0, iArr));
            case 9:
            case 23:
            case 24:
            case 25:
            case 26:
                return (c5711kk.m23298to() == null || c5711kk.m23298to().size() <= 0) ? new C5712kp(9, null) : new C5712kp(c5711kk.m23297kk(), m23332k4((AbstractC5746v4) c5711kk.m23298to().get_Item(0), 0, iArr));
            case 10:
            case 11:
                return new C5719my(c5711kk.m23297kk(), null);
            case 27:
                this.f15780du = true;
                if (!this.f15785to && "current".equals(c5711kk.m23296h4()) && c5711kk.m23295du().length() == 0) {
                    throw XPathException.create("The 'current()' function cannot be used in a pattern.");
                }
                if (!this.f15783kk && "key".equals(c5711kk.m23296h4()) && c5711kk.m23295du().length() == 0) {
                    throw XPathException.create("'{0}' is an invalid key pattern. It either contains a variable reference or 'key()' function.", this.f15782k4);
                }
                C5737to c5737to = new C5737to(c5711kk.m23295du(), c5711kk.m23296h4(), m23337k4(c5711kk.m23298to(), iArr));
                iArr[0] = iArr[0] | 8;
                return c5737to;
            default:
                throw XPathException.create("The XPath query '{0}' is not supported.", this.f15782k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw m23330k4(C5736t6 c5736t6, int[] iArr) {
        int[] iArr2 = {0};
        AbstractC5728qw abstractC5728qwM23332k4 = m23332k4(c5736t6.m23327to(), 0, iArr2);
        int i = iArr2[0];
        int[] iArr3 = {0};
        AbstractC5728qw abstractC5728qwM23332k42 = m23332k4(c5736t6.m23325du(), 0, iArr3);
        iArr[0] = i | iArr3[0];
        switch (c5736t6.m23326kk()) {
            case 1:
            case 2:
                return new C5766yg(c5736t6.m23326kk(), abstractC5728qwM23332k4, abstractC5728qwM23332k42);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C5684c5(c5736t6.m23326kk(), abstractC5728qwM23332k4, abstractC5728qwM23332k42);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return new C5699gi(c5736t6.m23326kk(), abstractC5728qwM23332k4, abstractC5728qwM23332k42);
            case 14:
                iArr[0] = iArr[0] | 8;
                return new C5676ai(abstractC5728qwM23332k4, abstractC5728qwM23332k42);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC5728qw m23331k4(C5740u1 c5740u1, int i, int[] iArr) {
        AbstractC5728qw c5763y4;
        AbstractC5728qw c5726qn;
        AbstractC5728qw c5726qn2;
        int i2;
        AbstractC5728qw c5763y42;
        if (c5740u1.m23349to().length() > 0) {
            this.f15780du = true;
        }
        this.f15781h4 = null;
        if (c5740u1.m23347kk() == null) {
            c5763y4 = new C5763y4();
            iArr[0] = 0;
        } else if ((i & 2) != 0) {
            i2 = 0;
            c5763y4 = m23332k4(c5740u1.m23347kk(), i2, iArr);
        } else {
            C5740u1 c5740u12 = (C5740u1) C7019kk.m27452k4((Object) c5740u1.m23347kk(), C5740u1.class);
            if (c5740u12 != null && c5740u1.m23348m9() == 3 && c5740u12.m23348m9() == 5 && c5740u12.m23344h4() == 9) {
                if (c5740u12.m23347kk() != null) {
                    c5763y42 = m23332k4(c5740u12.m23347kk(), 1, iArr);
                } else {
                    c5763y42 = new C5763y4();
                    iArr[0] = 0;
                }
                AbstractC5728qw c5726qn3 = new C5726qn(c5763y42, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), false, c5740u12.m23343dy());
                if ((iArr[0] & 8) != 0) {
                    c5726qn3 = new C5724qk(c5726qn3);
                }
                iArr[0] = iArr[0] | 8;
                return c5726qn3;
            }
            if (c5740u1.m23348m9() == 4 || c5740u1.m23348m9() == 5) {
                i2 = 1;
            }
            c5763y4 = m23332k4(c5740u1.m23347kk(), i2, iArr);
        }
        AbstractC5728qw abstractC5728qw = c5763y4;
        switch (c5740u1.m23348m9()) {
            case 0:
                C5702he c5702he = new C5702he(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), false);
                iArr[0] = iArr[0] | 8;
                return c5702he;
            case 1:
                C5702he c5702he2 = new C5702he(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), true);
                iArr[0] = iArr[0] | 8;
                return c5702he2;
            case 2:
                return new C5703ig(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
            case 3:
                return (iArr[0] & 8) != 0 ? new C5770yw(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4()) : new C5704ii(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
            case 4:
                if ((i & 1) != 0) {
                    c5726qn = new C5749vt(abstractC5728qw, false, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), false);
                } else {
                    c5726qn = new C5726qn(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), false, false);
                    if ((iArr[0] & 8) != 0) {
                        c5726qn = new C5724qk(c5726qn);
                    }
                }
                iArr[0] = iArr[0] | 8;
                return c5726qn;
            case 5:
                if ((i & 1) != 0) {
                    c5726qn2 = new C5749vt(abstractC5728qw, true, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), c5740u1.m23343dy());
                } else {
                    c5726qn2 = new C5726qn(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4(), true, c5740u1.m23343dy());
                    if ((iArr[0] & 8) != 0) {
                        c5726qn2 = new C5724qk(c5726qn2);
                    }
                }
                iArr[0] = iArr[0] | 8;
                return c5726qn2;
            case 6:
                C5714lm c5714lm = new C5714lm(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
                iArr[0] = iArr[0] | 8;
                return c5714lm;
            case 7:
                C5742u5 c5742u5 = new C5742u5(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
                return (iArr[0] & 8) != 0 ? new C5724qk(c5742u5) : c5742u5;
            case 8:
                return ((c5740u1.m23344h4() == 9 || c5740u1.m23344h4() == 1 || c5740u1.m23344h4() == 2) && c5740u1.m23349to().length() == 0) ? new C5753wp(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4()) : new C5730rq();
            case 9:
                return new C5761xw(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
            case 10:
                C5747vh c5747vh = new C5747vh(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
                iArr[0] = iArr[0] | 8;
                return c5747vh;
            case 11:
                return new C5748vj(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
            case 12:
                return new C5769yo(abstractC5728qw, c5740u1.m23342du(), c5740u1.m23349to(), c5740u1.m23344h4());
            default:
                throw XPathException.create("The XPath query '{0}' is not supported.", this.f15782k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw m23332k4(AbstractC5746v4 abstractC5746v4, int i, int[] iArr) {
        AbstractC5728qw abstractC5728qwM23331k4;
        AbstractC5728qw c5695f9;
        int i2 = this.f15784m9 + 1;
        this.f15784m9 = i2;
        if (i2 > 1024) {
            throw XPathException.create("The XPath query is too complex.");
        }
        iArr[0] = 0;
        switch (abstractC5746v4.ad_()) {
            case 0:
                abstractC5728qwM23331k4 = m23331k4((C5740u1) abstractC5746v4, i, iArr);
                break;
            case 1:
                abstractC5728qwM23331k4 = m23330k4((C5736t6) abstractC5746v4, iArr);
                break;
            case 2:
                abstractC5728qwM23331k4 = m23334k4((C5757x3) abstractC5746v4, i, iArr);
                break;
            case 3:
                c5695f9 = new C5695f9(((C5732s7) abstractC5746v4).m23320kk());
                abstractC5728qwM23331k4 = c5695f9;
                break;
            case 4:
                abstractC5728qwM23331k4 = m23329k4((C5711kk) abstractC5746v4, iArr);
                break;
            case 5:
                c5695f9 = new C5701h4(m23332k4(((C5691du) abstractC5746v4).m23232kk(), 0, iArr));
                abstractC5728qwM23331k4 = c5695f9;
                break;
            case 6:
                abstractC5728qwM23331k4 = new C5710k4();
                break;
            case 7:
                abstractC5728qwM23331k4 = m23328k4((C5686ca) abstractC5746v4);
                break;
            default:
                abstractC5728qwM23331k4 = null;
                break;
        }
        this.f15784m9--;
        return abstractC5728qwM23331k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw m23333k4(AbstractC5746v4 abstractC5746v4, String str) {
        m23335k4();
        this.f15782k4 = str;
        return m23332k4(abstractC5746v4, 0, new int[]{0});
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw m23334k4(C5757x3 c5757x3, int i, int[] iArr) {
        AbstractC5728qw c5756x1;
        boolean z = (i & 4) == 0;
        int[] iArr2 = {0};
        AbstractC5728qw abstractC5728qwM23332k4 = m23332k4(c5757x3.m23360to(), 0, iArr2);
        int i2 = iArr2[0];
        if (m23336k4(abstractC5728qwM23332k4) || (i2 & 6) != 0) {
            i2 |= 2;
            i |= 2;
        }
        AbstractC5728qw abstractC5728qwM23332k42 = m23332k4(c5757x3.m23359kk(), (i & (-2)) | 4, iArr);
        if (c5757x3.m23359kk().ad_() != 2) {
            iArr[0] = iArr[0] & (-2);
        }
        int i3 = i2 & 2;
        if (i3 != 0) {
            iArr[0] = iArr[0] | 1;
        }
        C5733sq c5733sq = (C5733sq) C7019kk.m27452k4((Object) abstractC5728qwM23332k42, C5733sq.class);
        if (c5733sq != null && i3 == 0 && c5733sq.m23321rv().mo23141h4() != 5) {
            AbstractC5728qw abstractC5728qwM23321rv = c5733sq.m23321rv();
            if (abstractC5728qwM23321rv.mo23141h4() == 0) {
                abstractC5728qwM23321rv = new C5684c5(3, new C5734ss(1, null), abstractC5728qwM23321rv);
            }
            C5766yg c5766yg = new C5766yg(2, abstractC5728qwM23321rv, abstractC5728qwM23332k4);
            abstractC5728qwM23332k42 = c5733sq.f15829k4;
            abstractC5728qwM23332k4 = c5766yg;
        }
        if ((iArr[0] & 1) != 0 && C7019kk.m27469x1(abstractC5728qwM23332k42, C5724qk.class)) {
            abstractC5728qwM23332k42 = ((C5724qk) abstractC5728qwM23332k42).f15840k4;
        }
        if (this.f15781h4 == null) {
            this.f15781h4 = (AbstractC5768yn) C7019kk.m27452k4((Object) abstractC5728qwM23332k42, AbstractC5768yn.class);
        }
        boolean z2 = (abstractC5728qwM23332k42.mo23151dy() & 16) != 0;
        boolean z3 = (abstractC5728qwM23332k42.mo23151dy() & 8) != 0;
        if (i3 != 0) {
            if (z3) {
                c5756x1 = new C5751w6(abstractC5728qwM23332k42);
            } else if ((i2 & 4) != 0) {
                c5756x1 = new C5756x1(abstractC5728qwM23332k42);
            }
            abstractC5728qwM23332k42 = c5756x1;
        }
        if (z && this.f15781h4 != null) {
            if (z2 && (iArr[0] & 1) != 0) {
                C5733sq c5733sq2 = new C5733sq(abstractC5728qwM23332k42, abstractC5728qwM23332k4, false);
                AbstractC5728qw abstractC5728qw = this.f15781h4.f15829k4;
                if (C7019kk.m27469x1(abstractC5728qw, C5763y4.class)) {
                    this.f15781h4 = null;
                    return c5733sq2;
                }
                this.f15781h4.f15829k4 = new C5763y4();
                this.f15781h4 = null;
                return new C5735sv(abstractC5728qw, c5733sq2);
            }
            this.f15781h4 = null;
        }
        return new C5733sq(abstractC5728qwM23332k42, abstractC5728qwM23332k4, i3 == 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5728qw m23338k4(String str, boolean z, boolean z2) {
        this.f15786x1 = z;
        this.f15783kk = z2;
        this.f15785to = true;
        return m23333k4(C5698gf.m23248k4(str), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5728qw m23339k4(String str, boolean[] zArr) {
        AbstractC5728qw abstractC5728qwM23338k4 = m23338k4(str, true, true);
        zArr[0] = this.f15780du;
        return abstractC5728qwM23338k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m23335k4() {
        this.f15784m9 = 0;
        this.f15780du = false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m23336k4(AbstractC5728qw abstractC5728qw) {
        return abstractC5728qw.mo23141h4() == 5 || abstractC5728qw.mo23141h4() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw[] m23337k4(ArrayList arrayList, int[] iArr) {
        int size = arrayList != null ? arrayList.size() : 0;
        AbstractC5728qw[] abstractC5728qwArr = new AbstractC5728qw[size];
        iArr[0] = 0;
        for (int i = 0; i < size; i++) {
            int[] iArr2 = {0};
            abstractC5728qwArr[i] = m23332k4((AbstractC5746v4) arrayList.get_Item(i), 0, iArr2);
            iArr[0] = iArr2[0] | iArr[0];
        }
        return abstractC5728qwArr;
    }
}
