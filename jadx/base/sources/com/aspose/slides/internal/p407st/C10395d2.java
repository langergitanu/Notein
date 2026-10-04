package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3149x1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.d2 */
/* JADX INFO: loaded from: classes4.dex */
public class C10395d2 {

    /* JADX INFO: renamed from: c5 */
    private C10577oo f36913c5;

    /* JADX INFO: renamed from: ck */
    private C10688w5 f36914ck;

    /* JADX INFO: renamed from: du */
    private C10495ji f36915du;

    /* JADX INFO: renamed from: dy */
    private C10461h8 f36916dy;

    /* JADX INFO: renamed from: h4 */
    private C10587pa f36918h4;

    /* JADX INFO: renamed from: jd */
    private C10371bp f36919jd;

    /* JADX INFO: renamed from: k4 */
    private C10727y5 f36920k4;

    /* JADX INFO: renamed from: kk */
    private int f36921kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC10620rm f36922m9;

    /* JADX INFO: renamed from: to */
    private int f36923to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC10571o4 f36925x1;

    /* JADX INFO: renamed from: fa */
    private final List<C10549mu> f36917fa = new List<>();

    /* JADX INFO: renamed from: up */
    private final List<AbstractC10621rp> f36924up = new List<>();

    /* JADX INFO: renamed from: yj */
    private final List<InterfaceC10710xb> f36926yj = new List<>();

    public C10395d2(C10727y5 c10727y5) {
        this.f36920k4 = c10727y5;
        this.f36925x1 = c10727y5.m52064x1();
    }

    /* JADX INFO: renamed from: dq */
    private void m50575dq() {
        if ((this.f36921kk & 65535) == 0) {
            return;
        }
        Iterator<AbstractC10571o4> it = m50613wy().iterator();
        while (it.hasNext()) {
            ((InterfaceC10710xb) ((AbstractC10571o4) it.next())).mo50741k4(null);
        }
        this.f36915du = null;
        this.f36918h4 = null;
        this.f36922m9 = null;
        this.f36916dy = null;
        this.f36913c5 = null;
        this.f36919jd = null;
        this.f36914ck = null;
        this.f36917fa.clear();
        this.f36924up.clear();
        this.f36926yj.clear();
        this.f36921kk = 0;
    }

    /* JADX INFO: renamed from: kk */
    private int m50579kk(int i) {
        if (i == 4056) {
            return 1;
        }
        if (i == 4117) {
            return 32;
        }
        switch (i) {
            case 4087:
                return 2;
            case 4088:
                return 4;
            case 4089:
                return 8;
            case 4090:
                return 16;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ak */
    public int m50582ak() {
        List<AbstractC10571o4> listM50613wy = m50613wy();
        int iMo50440k4 = 0;
        for (int i = 0; i < listM50613wy.size(); i++) {
            iMo50440k4 += listM50613wy.get_Item(i).mo50440k4() + 8;
        }
        return iMo50440k4;
    }

    /* JADX INFO: renamed from: ar */
    public final C10373br m50583ar() {
        if (m50606to()) {
            return (C10373br) this.f36922m9;
        }
        return null;
    }

    /* JADX INFO: renamed from: b3 */
    public C10371bp m50584b3() {
        return this.f36919jd;
    }

    /* JADX INFO: renamed from: bv */
    public C10577oo m50585bv() {
        return this.f36913c5;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m50586c5() {
        return m50580to(256);
    }

    /* JADX INFO: renamed from: ck */
    public boolean m50587ck() {
        return m50580to(512);
    }

    /* JADX INFO: renamed from: du */
    public boolean m50588du() {
        return m50580to(2);
    }

    /* JADX INFO: renamed from: dy */
    public boolean m50589dy() {
        return m50580to(1024);
    }

    /* JADX INFO: renamed from: fa */
    public boolean m50590fa() {
        return m50580to(128);
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m50591h4() {
        return m50580to(4);
    }

    /* JADX INFO: renamed from: ix */
    public C10495ji m50592ix() {
        return this.f36915du;
    }

    /* JADX INFO: renamed from: jd */
    public boolean m50593jd() {
        return m50580to(32);
    }

    /* JADX INFO: renamed from: k4 */
    public C10727y5 m50594k4() {
        return this.f36920k4;
    }

    /* JADX INFO: renamed from: ks */
    public boolean m50600ks() {
        return m50576du(2);
    }

    /* JADX INFO: renamed from: lr */
    public List<AbstractC10621rp> m50601lr() {
        return this.f36924up;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m50602m9() {
        return m50580to(16);
    }

    /* JADX INFO: renamed from: ne */
    public boolean m50603ne() {
        return m50576du(16);
    }

    /* JADX INFO: renamed from: qq */
    public int m50604qq() {
        if (!m50591h4()) {
            return 0;
        }
        AbstractC10620rm abstractC10620rm = this.f36922m9;
        C10665uh c10665uh = abstractC10620rm instanceof C10665uh ? (C10665uh) abstractC10620rm : null;
        return (c10665uh != null ? c10665uh.mo51804x1() : ((C10712xh) abstractC10620rm).mo51804x1()).length();
    }

    /* JADX INFO: renamed from: rv */
    public boolean m50605rv() {
        return m50576du(4);
    }

    /* JADX INFO: renamed from: to */
    public boolean m50606to() {
        return m50580to(8);
    }

    /* JADX INFO: renamed from: u4 */
    public C10587pa m50607u4() {
        return this.f36918h4;
    }

    /* JADX INFO: renamed from: um */
    public C10461h8 m50608um() {
        return this.f36916dy;
    }

    /* JADX INFO: renamed from: up */
    public boolean m50609up() {
        return m50580to(64);
    }

    /* JADX INFO: renamed from: uz */
    public C10688w5 m50610uz() {
        return this.f36914ck;
    }

    /* JADX INFO: renamed from: v4 */
    public List<C10549mu> m50611v4() {
        return this.f36917fa;
    }

    /* JADX INFO: renamed from: wl */
    public String m50612wl() {
        if (!m50591h4()) {
            return null;
        }
        AbstractC10620rm abstractC10620rm = this.f36922m9;
        C10665uh c10665uh = abstractC10620rm instanceof C10665uh ? (C10665uh) abstractC10620rm : null;
        return c10665uh != null ? c10665uh.mo51804x1() : ((C10712xh) abstractC10620rm).mo51804x1();
    }

    /* JADX INFO: renamed from: wy */
    public List<AbstractC10571o4> m50613wy() {
        List<AbstractC10571o4> list = new List<>();
        if (m50599kk()) {
            list.addItem(this.f36915du);
        }
        if (m50606to()) {
            list.addItem(this.f36922m9);
        }
        if (m50588du()) {
            list.addItem(this.f36918h4);
        }
        if (m50591h4()) {
            list.addItem(this.f36922m9);
        }
        if (m50602m9()) {
            list.addItem(this.f36916dy);
        }
        if (m50589dy()) {
            for (int i = 0; i < this.f36924up.size(); i++) {
                list.addItem(this.f36924up.get_Item(i));
            }
        }
        if (m50586c5()) {
            for (int i2 = 0; i2 < this.f36917fa.size(); i2++) {
                list.addItem(this.f36917fa.get_Item(i2));
            }
        }
        if (m50593jd()) {
            list.addItem(this.f36913c5);
        }
        if (m50587ck()) {
            for (int i3 = 0; i3 < this.f36926yj.size(); i3++) {
                list.addItem((AbstractC10571o4) this.f36926yj.get_Item(i3));
            }
        }
        if (m50590fa()) {
            list.addItem(this.f36914ck);
        }
        if (m50609up()) {
            list.addItem(this.f36919jd);
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<AbstractC10621rp> m50614x1(int i) {
        List<AbstractC10621rp> list = new List<>();
        for (int i2 = 0; i2 < this.f36924up.size(); i2++) {
            if ((this.f36924up.get_Item(i2).m51409um().m51923to() & 65535) == i) {
                list.addItem(this.f36924up.get_Item(i2));
            }
        }
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public boolean m50616x6() {
        return m50576du(8);
    }

    /* JADX INFO: renamed from: yd */
    public List<InterfaceC10710xb> m50617yd() {
        return this.f36926yj;
    }

    /* JADX INFO: renamed from: yj */
    public boolean m50618yj() {
        return m50576du(1);
    }

    /* JADX INFO: renamed from: du */
    private boolean m50576du(int i) {
        return (((long) (this.f36923to & 65535)) & (((long) i) & 4294967295L)) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m50577k4(int i, boolean z) {
        int i2 = this.f36921kk & (65535 ^ (i & 65535));
        this.f36921kk = i2;
        if (z) {
            this.f36921kk = i | i2;
        }
    }

    /* JADX INFO: renamed from: to */
    private boolean m50580to(int i) {
        return (((long) (this.f36921kk & 65535)) & (((long) i) & 4294967295L)) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    private void m50581x1(int i, boolean z) {
        int i2 = this.f36923to & (65535 ^ (i & 65535));
        this.f36923to = i2;
        if (z) {
            this.f36923to = i | i2;
        }
    }

    /* JADX INFO: renamed from: kk */
    public boolean m50599kk() {
        return m50580to(1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m50595k4(C3149x1 c3149x1) {
        List<AbstractC10571o4> listM50613wy = m50613wy();
        for (int i = 0; i < listM50613wy.size(); i++) {
            listM50613wy.get_Item(i).m51412x1(c3149x1);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m50615x1() {
        return (this.f36921kk & 65535) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m50578k4(AbstractC10571o4 abstractC10571o4) {
        int iM51923to = abstractC10571o4.m51409um().m51923to();
        if (iM51923to == 1011) {
            this.f36915du = (C10495ji) abstractC10571o4;
            m50577k4(1, true);
            return;
        }
        if (iM51923to == 4010) {
            this.f36913c5 = (C10577oo) abstractC10571o4;
            m50577k4(32, true);
            return;
        }
        if (iM51923to != 4056) {
            if (iM51923to != 4063 && iM51923to != 4082) {
                if (iM51923to != 4117) {
                    switch (iM51923to) {
                        case 3998:
                            this.f36922m9 = (AbstractC10620rm) abstractC10571o4;
                            m50577k4(8, true);
                            return;
                        case 3999:
                            this.f36918h4 = (C10587pa) abstractC10571o4;
                            m50577k4(2, true);
                            return;
                        case 4000:
                            this.f36922m9 = (AbstractC10620rm) abstractC10571o4;
                            m50577k4(4, true);
                            return;
                        case 4001:
                            this.f36916dy = (C10461h8) abstractC10571o4;
                            m50577k4(16, true);
                            return;
                        case 4002:
                            this.f36919jd = (C10371bp) abstractC10571o4;
                            m50577k4(64, true);
                            return;
                        default:
                            switch (iM51923to) {
                                case 4006:
                                    this.f36914ck = (C10688w5) abstractC10571o4;
                                    m50577k4(128, true);
                                    return;
                                case 4007:
                                    this.f36917fa.addItem((C10549mu) abstractC10571o4);
                                    m50577k4(256, true);
                                    return;
                                case 4008:
                                    break;
                                default:
                                    switch (iM51923to) {
                                        case 4087:
                                        case 4088:
                                        case 4089:
                                        case 4090:
                                            break;
                                        default:
                                            m50577k4(2048, true);
                                            throw new NotImplementedException();
                                    }
                                    break;
                            }
                            break;
                    }
                }
            } else {
                this.f36926yj.addItem((InterfaceC10710xb) abstractC10571o4);
                m50577k4(512, true);
                return;
            }
        }
        this.f36924up.addItem((AbstractC10621rp) abstractC10571o4);
        m50577k4(1024, true);
        m50581x1(m50579kk(abstractC10571o4.m51409um().m51923to()), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m50596k4(InterfaceC10710xb interfaceC10710xb) {
        m50578k4((AbstractC10571o4) interfaceC10710xb);
        interfaceC10710xb.mo50741k4(this);
        ((AbstractC10571o4) interfaceC10710xb).m51413x1(this.f36925x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m50597k4(boolean z) {
        if (z) {
            m50575dq();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m50598k4(int i) {
        if (i == 1011) {
            return (this.f36921kk & 65535) == 0;
        }
        if (i != 4008) {
            switch (i) {
                case 3998:
                case 4000:
                    break;
                case 3999:
                    return (m50588du() || m50580to(12)) ? false : true;
                default:
                    return true;
            }
        }
        return !m50580to(12);
    }
}
