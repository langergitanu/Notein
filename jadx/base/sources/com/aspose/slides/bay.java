package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7261ao;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18374u4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class bay extends AbstractC0906dm {

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f4145x6 = new C7017h4("l", "r", "std", C18374u4.f56270c);

    /* JADX INFO: renamed from: c5 */
    private AbstractC0753ak f4146c5;

    /* JADX INFO: renamed from: ck */
    private s0k f4147ck;

    /* JADX INFO: renamed from: du */
    private tbp f4148du;

    /* JADX INFO: renamed from: dy */
    private m6r f4149dy;

    /* JADX INFO: renamed from: fa */
    private Dictionary<Integer, Double> f4150fa;

    /* JADX INFO: renamed from: h4 */
    private tbp f4151h4;

    /* JADX INFO: renamed from: jd */
    private rmh f4152jd;

    /* JADX INFO: renamed from: k4 */
    private z2c f4153k4;

    /* JADX INFO: renamed from: kk */
    private final C14244on f4154kk;

    /* JADX INFO: renamed from: ks */
    private Dictionary<Integer, Double> f4155ks;

    /* JADX INFO: renamed from: m9 */
    private tbp f4156m9;

    /* JADX INFO: renamed from: rv */
    private double f4157rv;

    /* JADX INFO: renamed from: to */
    private final List<bay> f4158to;

    /* JADX INFO: renamed from: up */
    private Dictionary<Integer, Double> f4159up;

    /* JADX INFO: renamed from: x1 */
    private final List<C14244on> f4160x1;

    /* JADX INFO: renamed from: yj */
    private Dictionary<Integer, Double> f4161yj;

    public bay(bay bayVar, C14648us c14648us, m6r m6rVar, C14244on c14244on) {
        super(bayVar, c14648us);
        this.f4148du = new tbp();
        this.f4151h4 = new tbp();
        this.f4156m9 = new tbp();
        this.f4157rv = 0.0d;
        C7261ao c7261aoM71873kk = c14648us.m71873kk();
        double dM28385up = c7261aoM71873kk.m28385up();
        double dM28393yj = c7261aoM71873kk.m28393yj();
        this.f4156m9 = new tbp(dM28385up != 0.0d ? dM28385up / 100000.0d : 1.0d, dM28393yj != 0.0d ? dM28393yj / 100000.0d : 1.0d);
        this.f4148du = new tbp(((double) c7261aoM71873kk.m28374ks()) / 100000.0d, ((double) c7261aoM71873kk.m28379rv()) / 100000.0d);
        this.f4151h4 = new tbp(((double) c7261aoM71873kk.m28392x6()) / 100000.0d, ((double) c7261aoM71873kk.m28378ne()) / 100000.0d);
        this.f4154kk = c14244on;
        this.f4158to = new List<>();
        this.f4160x1 = new List<>();
        this.f4150fa = new Dictionary<>();
        this.f4159up = new Dictionary<>();
        this.f4149dy = m6rVar;
        this.f4153k4 = new z2c(this);
        this.f4149dy.m64783kk().addItem(this);
    }

    /* JADX INFO: renamed from: c6 */
    private boolean m4054c6() {
        this.f4146c5.m3652to(this);
        if (!m4056e0()) {
            this.f4146c5.mo3642h4(this);
            m4064xk();
        }
        boolean zMo3642h4 = this.f4146c5.mo3642h4(this);
        if (!zMo3642h4) {
            m4064xk();
        }
        m4061ts();
        boolean zMo3646k4 = this.f4146c5.mo3646k4(this);
        if (zMo3646k4) {
            zMo3646k4 &= m4060k4(this);
        }
        if (zMo3646k4) {
            zMo3646k4 &= zMo3642h4;
        }
        return zMo3646k4 ? this.f4146c5.mo3640du(this) : zMo3646k4;
    }

    /* JADX INFO: renamed from: e0 */
    private boolean m4056e0() {
        rmh rmhVar = this.f4152jd;
        if (rmhVar == null) {
            return true;
        }
        boolean zM4063x1 = true;
        for (uus uusVar : rmhVar.m70182h4()) {
            if (yz6.m74181x1(uusVar.m71924kk())) {
                zM4063x1 &= m4063x1(uusVar.m71923k4(this), uusVar.m71924kk());
            }
        }
        for (uus uusVar2 : this.f4152jd.m70181du()) {
            if (uusVar2.m71924kk() == 22 && uusVar2.m71918dy() == 22 && uusVar2.m71928up() == 2) {
                List<bay> listM71923k4 = uusVar2.m71923k4(this);
                listM71923k4.addRange(uusVar2.m71925kk(this));
                if (listM71923k4.size() > 1) {
                    zM4063x1 = m4063x1(listM71923k4, uusVar2.m71924kk()) & zM4063x1;
                }
            }
        }
        return zM4063x1;
    }

    /* JADX INFO: renamed from: ts */
    private void m4061ts() {
        rmh rmhVar = this.f4152jd;
        if (rmhVar != null) {
            for (uus uusVar : rmhVar.m70182h4()) {
                if (yz6.m74166k4(uusVar.m71924kk())) {
                    m4057k4(uusVar.m71923k4(this), uusVar.m71924kk());
                }
            }
        }
    }

    /* JADX INFO: renamed from: xk */
    private void m4064xk() {
        m4109wy();
        Stack<bay> stack = new Stack<>();
        m4058k4(stack);
        while (stack.size() != 0) {
            stack.pop().m4097lr();
        }
    }

    /* JADX INFO: renamed from: ak */
    public final void m4065ak() {
        m4064xk();
        m4097lr();
    }

    /* JADX INFO: renamed from: ar */
    public final tbp m4066ar() {
        return this.f4156m9;
    }

    /* JADX INFO: renamed from: b3 */
    public final void m4067b3() {
        List.Enumerator<bay> it;
        if (m4104u4() != null) {
            for (uus uusVar : m4104u4().m70182h4()) {
                if (uusVar.m71924kk() == 7) {
                    List<bay> listM71923k4 = uusVar.m71923k4(this);
                    List.Enumerator<bay> it2 = listM71923k4.iterator();
                    double d = Double.NaN;
                    while (it2.hasNext()) {
                        try {
                            bay next = it2.next();
                            C1131g4 c1131g4 = (C1131g4) C7019kk.m27452k4((Object) next.m4077jd(), C1131g4.class);
                            if (c1131g4 != null) {
                                double dM6428dy = c1131g4.m6428dy(next);
                                if (!C14044b3.m66437kk(dM6428dy) && (C14044b3.m66437kk(d) || d > dM6428dy)) {
                                    d = dM6428dy;
                                }
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    if (C14044b3.m66437kk(d)) {
                        continue;
                    } else {
                        it = listM71923k4.iterator();
                        while (it.hasNext()) {
                            try {
                                it.next().m4103to(7, d);
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
        this.f4146c5.mo3653x1(this);
        it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4067b3();
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

    /* JADX INFO: renamed from: bv */
    public final List<bay> m4068bv() {
        List<bay> list = new List<>();
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (!C7019kk.m27469x1(next.f4146c5, C1131g4.class)) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: c5 */
    public final bay m4069c5() {
        bay bayVarM4082k4 = this;
        while (bayVarM4082k4.m4082k4() != null) {
            bayVarM4082k4 = bayVarM4082k4.m4082k4();
        }
        return bayVarM4082k4;
    }

    @Override // com.aspose.slides.AbstractC0906dm
    /* JADX INFO: renamed from: ck */
    public List<AbstractC0906dm> mo4070ck() {
        List<AbstractC0906dm> list = new List<>(this.f4158to.size());
        List.Enumerator<bay> it = this.f4158to.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: dq */
    public final boolean m4071dq() {
        if (this.f4153k4.m74280x1() != null) {
            return ((!C7019kk.m27469x1(this.f4146c5, cpm.class) && (!C7019kk.m27469x1(this.f4146c5, kvo.class) || this.f4153k4.m74287x6())) || this.f4153k4.m74233dy() == 0.0d || this.f4153k4.m74236fa() == 0.0d) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final double m4072du(int i) {
        double dM74256kk;
        double dM74233dy;
        if (this.f4159up.containsKey(Integer.valueOf(i))) {
            return this.f4159up.get_Item(Integer.valueOf(i)).doubleValue();
        }
        if (this.f4150fa.containsKey(Integer.valueOf(i))) {
            return this.f4150fa.get_Item(Integer.valueOf(i)).doubleValue();
        }
        if (yz6.m74166k4(i)) {
            if (i == 61 && m4074dy().m74233dy() != 0.0d) {
                return m4074dy().m74233dy();
            }
            if (i == 15 && m4074dy().m74236fa() != 0.0d) {
                return m4074dy().m74236fa();
            }
            if (C7019kk.m27469x1(m4082k4().m4077jd(), C14345qg.class)) {
                return m4082k4().m4075h4(i);
            }
            return 0.0d;
        }
        if (i == 1) {
            return m4074dy().m74256kk(1) + m4074dy().m74236fa();
        }
        if (i == 8) {
            dM74256kk = m4074dy().m74256kk(0);
            dM74233dy = m4074dy().m74233dy();
        } else {
            if (i != 10) {
                if (i == 18) {
                    return m4074dy().m74256kk(0);
                }
                if (i == 24) {
                    return m4074dy().m74256kk(0) + m4074dy().m74233dy();
                }
                if (i != 32) {
                    return 0.0d;
                }
                return m4074dy().m74256kk(1);
            }
            dM74256kk = m4074dy().m74256kk(1);
            dM74233dy = m4074dy().m74236fa();
        }
        return (dM74233dy / 2.0d) + dM74256kk;
    }

    /* JADX INFO: renamed from: dy */
    public final z2c m4074dy() {
        return this.f4153k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m4075h4(int i) {
        C0741ac c0741ac = (C0741ac) C7019kk.m27452k4((Object) this.f4146c5.m3643k4(), C0741ac.class);
        if (c0741ac == null || c0741ac.m3474kk() == 0.0d || !yz6.m74166k4(i)) {
            return m4072du(i);
        }
        tbp tbpVarClone = yz6.m74162k4(c0741ac.m3474kk(), m4072du(61), m4072du(15)).Clone();
        return i == 61 ? tbpVarClone.f49090k4 : tbpVarClone.f49091x1;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC0753ak m4077jd() {
        return this.f4146c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m4078k4(int i) {
        if (this.f4150fa.containsKey(Integer.valueOf(i))) {
            return this.f4150fa.get_Item(Integer.valueOf(i)).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: kk */
    public final bay m4094kk() {
        return (bay) m5145ne();
    }

    /* JADX INFO: renamed from: lr */
    public final void m4097lr() {
        boolean zM4054c6 = m4054c6();
        while (!zM4054c6 && this.f4157rv < 100.0d) {
            m4064xk();
            zM4054c6 = m4054c6();
            this.f4157rv += 1.0d;
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final double m4098m9(int i) {
        s0k s0kVar = this.f4147ck;
        if (s0kVar == null) {
            return Double.NaN;
        }
        for (fwr fwrVar : s0kVar.m70408to()) {
            if (fwrVar.m6344du() == i && fwrVar.m6348kk() == 1) {
                return fwrVar.m6345dy();
            }
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: qq */
    public final tbp m4100qq() {
        return this.f4151h4;
    }

    /* JADX INFO: renamed from: to */
    public final double m4101to(int i) {
        if (this.f4161yj.containsKey(Integer.valueOf(i))) {
            return this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue();
        }
        return Double.MAX_VALUE;
    }

    public String toString() {
        return m4077jd().toString();
    }

    /* JADX INFO: renamed from: u4 */
    public final rmh m4104u4() {
        return this.f4152jd;
    }

    /* JADX INFO: renamed from: um */
    public final void m4105um() {
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4105um();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        Dictionary.KeyCollection.Enumerator<Integer, Double> it2 = this.f4155ks.getKeys().iterator();
        while (it2.hasNext()) {
            try {
                Integer num = (Integer) C7019kk.m27464to(it2.next(), Integer.TYPE);
                m4103to(num.intValue(), this.f4155ks.get_Item(num).doubleValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        this.f4155ks.clear();
    }

    /* JADX INFO: renamed from: uz */
    public final s0k m4106uz() {
        return this.f4147ck;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m4107v4() {
        this.f4157rv = 0.0d;
        this.f4150fa = new Dictionary<>();
        this.f4159up = new Dictionary<>();
        this.f4155ks = new Dictionary<>();
        this.f4161yj = new Dictionary<>();
        m4074dy().m74265qm();
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4107v4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        s0k s0kVar = this.f4147ck;
        if (s0kVar != null) {
            for (fwr fwrVar : s0kVar.m70408to()) {
                if (fwrVar.m6348kk() == 3 && yz6.m74181x1(fwrVar.m6344du())) {
                    it = fwrVar.m6347k4(this).iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().m4074dy().m74278wp();
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: wl */
    public final tbp m4108wl() {
        return this.f4148du;
    }

    /* JADX INFO: renamed from: wy */
    public final void m4109wy() {
        m4074dy().m74224bz();
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4109wy();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final List<bay> m4110x1() {
        return this.f4158to;
    }

    /* JADX INFO: renamed from: yd */
    public final void m4113yd() {
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                tbp tbpVarClone = this.f4146c5.mo3648kk(next).Clone();
                if (tbpVarClone.f49090k4 != 0.0d || tbpVarClone.f49091x1 != 0.0d) {
                    next.m4062x1(tbpVarClone.Clone()).CloneTo(tbpVarClone);
                    next.m4074dy().m74246k4(tbpVarClone.f49090k4, tbpVarClone.f49091x1);
                    next.m4074dy().m74283x1(tbpVarClone.f49090k4, tbpVarClone.f49091x1);
                }
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
        List.Enumerator<bay> it2 = m4110x1().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m4113yd();
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private tbp m4062x1(tbp tbpVar) {
        double d = tbpVar.f49090k4;
        double d2 = tbpVar.f49091x1;
        tbp tbpVarClone = m4099m9().m72922rv().m3356to().Clone();
        double dM74269to = m4074dy().m74269to() + tbpVar.f49090k4;
        double dM74262m9 = m4074dy().m74262m9() + dM74269to;
        if (dM74269to < 0.0d) {
            d -= dM74269to;
        } else {
            double d3 = tbpVarClone.f49090k4;
            if (dM74262m9 > d3) {
                d -= dM74262m9 - d3;
            }
        }
        double dM74231du = m4074dy().m74231du() + tbpVar.f49091x1;
        double dM74228ck = m4074dy().m74228ck() + dM74231du;
        if (dM74231du < 0.0d) {
            d2 -= dM74231du;
        } else {
            double d4 = tbpVarClone.f49091x1;
            if (dM74228ck > d4) {
                d2 -= dM74228ck - d4;
            }
        }
        return new tbp(d, d2);
    }

    /* JADX INFO: renamed from: du */
    public final C14244on m4073du() {
        return this.f4154kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<C14244on> m4076h4() {
        return this.f4160x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m4079k4(uus uusVar) {
        double dM71919fa = uusVar.m71919fa();
        s0k s0kVar = this.f4147ck;
        if (s0kVar != null) {
            for (fwr fwrVar : s0kVar.m70407kk()) {
                if (fwrVar.m6348kk() == uusVar.m71927to() && C14113y2.m67363du(fwrVar.m6349to(), uusVar.m71917du()) && fwrVar.m6344du() == uusVar.m71924kk() && uusVar.m71926m9() != 1 && fwrVar.m6346h4() < dM71919fa) {
                    dM71919fa = fwrVar.m6346h4();
                }
            }
        }
        return dM71919fa;
    }

    /* JADX INFO: renamed from: kk */
    public final void m4095kk(int i, double d) {
        if (this.f4161yj.containsKey(Integer.valueOf(i)) && C14116yg.m67475k4(this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue()) < C14116yg.m67475k4(d)) {
            d = this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue();
        }
        if (this.f4159up.containsKey(Integer.valueOf(i))) {
            this.f4159up.set_Item(Integer.valueOf(i), Double.valueOf(d));
        } else {
            this.f4159up.addItem(Integer.valueOf(i), Double.valueOf(d));
        }
        if (i == 22 || i == 27) {
            m4074dy().m74268sv();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final m6r m4099m9() {
        return this.f4149dy;
    }

    /* JADX INFO: renamed from: to */
    public final bay m4102to() {
        return (bay) m5142ix();
    }

    /* JADX INFO: renamed from: du */
    private void m4055du(int i, double d) {
        if (this.f4155ks.containsKey(Integer.valueOf(i))) {
            this.f4155ks.set_Item(Integer.valueOf(i), Double.valueOf(d));
        } else {
            this.f4155ks.addItem(Integer.valueOf(i), Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m4080k4(m6r m6rVar) {
        int iM27428k4 = f4145x6.m27428k4(m6rVar.m64782k4(7, this));
        if (iM27428k4 == 0) {
            return 0;
        }
        if (iM27428k4 != 1) {
            return iM27428k4 != 2 ? 4 : 3;
        }
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m4096kk(int i) {
        return this.f4161yj.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: to */
    public final void m4103to(int i, double d) {
        m4088k4(i, d, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4111x1(int i, double d) {
        if (this.f4161yj.containsKey(Integer.valueOf(i)) && C14116yg.m67475k4(this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue()) < C14116yg.m67475k4(d)) {
            d = this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue();
        }
        if (this.f4150fa.containsKey(Integer.valueOf(i))) {
            this.f4150fa.set_Item(Integer.valueOf(i), Double.valueOf(d));
        } else {
            this.f4150fa.addItem(Integer.valueOf(i), Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final List<bay> m4081k4(int i, String str, int i2) {
        List<bay> list = new List<>();
        m4059k4(this, i, str, i2, list);
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m4112x1(int i) {
        return this.f4150fa.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m4063x1(List<bay> list, int i) {
        List.Enumerator<bay> it = list.iterator();
        double d = Double.NaN;
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (C7019kk.m27469x1(next.m4077jd(), cpm.class) && next.m4074dy().m74272u4() && !next.m4074dy().m74289yd()) {
                    double dM4072du = next.m4072du(i);
                    if (C14044b3.m66437kk(d) || d > dM4072du) {
                        d = dM4072du;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        boolean z = true;
        if (C14044b3.m66437kk(d)) {
            return true;
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                bay next2 = it.next();
                if (C7019kk.m27469x1(next2.m4077jd(), cpm.class) && next2.m4074dy().m74272u4()) {
                    double dM4072du2 = next2.m4072du(i);
                    if (d < dM4072du2 && yz6.m74180x1(dM4072du2, d)) {
                        next2.m4103to(i, d);
                        z = false;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final bay m4082k4() {
        return (bay) super.mo5141fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final bay m4083k4(String str) {
        List.Enumerator<C14244on> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                it = next.m4076h4().iterator();
                while (it.hasNext()) {
                    try {
                        if (C14113y2.m67363du(it.next().m5144ks(), str)) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return next;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                bay bayVarM4083k4 = next.m4083k4(str);
                if (bayVarM4083k4 != null) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return bayVarM4083k4;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final bay m4084k4(String str, C14244on c14244on) {
        if (C14113y2.m67363du(m4099m9().mo4816J_(), str) && (c14244on == null || m4073du() == c14244on)) {
            return this;
        }
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay bayVarM4084k4 = it.next().m4084k4(str, c14244on);
                if (bayVarM4084k4 != null) {
                    return bayVarM4084k4;
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

    /* JADX INFO: renamed from: k4 */
    public final void m4085k4(double d, int i) {
        double d2;
        double d3;
        double dM4072du;
        double dM67491kk;
        double dM74236fa;
        double dM74256kk;
        if (d >= 1.0d) {
            return;
        }
        C0741ac c0741ac = (C0741ac) C7019kk.m27452k4((Object) m4077jd().m3643k4(), C0741ac.class);
        boolean z = c0741ac != null && yz6.m74166k4(i);
        if (z) {
            if (c0741ac.m3474kk() != 0.0d) {
                m4055du(61, m4072du(61) * d);
                m4055du(15, m4072du(15) * d);
            } else {
                z2c z2cVarM4074dy = m4074dy();
                double dM74241jd = i == 61 ? z2cVarM4074dy.m74241jd() : z2cVarM4074dy.m74290yj();
                double dM4072du2 = m4072du(i);
                if (dM4072du2 >= dM74241jd) {
                    dM74241jd = dM4072du2;
                }
                m4055du(i, dM74241jd * d);
            }
            d2 = 1.0d;
            d3 = 0.0d;
        } else {
            if (i == 61) {
                if (!m4112x1(61) || !m4112x1(63)) {
                    d2 = 1.0d;
                    dM4072du = m4074dy().m74233dy();
                } else {
                    dM4072du = m4072du(i);
                    d2 = 1.0d;
                    m4055du(63, m4072du(63) * d);
                }
                d3 = 0.0d;
            } else {
                d2 = 1.0d;
                if (i == 15) {
                    if (!m4112x1(15) || !m4112x1(17)) {
                        d3 = 0.0d;
                        dM4072du = m4074dy().m74236fa();
                    } else {
                        dM4072du = m4072du(i);
                        d3 = 0.0d;
                        m4055du(17, m4072du(17) * d);
                    }
                } else {
                    d3 = 0.0d;
                    dM4072du = m4072du(i);
                }
            }
            m4055du(i, dM4072du * d);
        }
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (z) {
                    if (c0741ac.m3474kk() != d3) {
                        next.m4085k4(d, 61);
                        next.m4085k4(d, 15);
                    } else if (!next.m4077jd().mo3639du()) {
                        if (i == 61 && m4074dy().m74256kk(13) != d3) {
                            dM74256kk = m4074dy().m74256kk(13);
                        } else if (i != 15 || m4074dy().m74256kk(14) == d3) {
                            if (i == 61) {
                                dM67491kk = C14116yg.m67491kk(m4074dy().m74262m9() * d, this.f4155ks.get_Item(61).doubleValue());
                                dM74236fa = next.m4074dy().m74233dy();
                            } else {
                                dM67491kk = C14116yg.m67491kk(m4074dy().m74228ck() * d, this.f4155ks.get_Item(15).doubleValue());
                                dM74236fa = next.m4074dy().m74236fa();
                            }
                            double d4 = dM67491kk / dM74236fa;
                            if (d4 < d2) {
                                next.m4085k4(C14116yg.m67502x1(d, d4), i);
                            }
                        } else {
                            dM74256kk = m4074dy().m74256kk(14);
                        }
                        next.m4085k4((d2 - ((d2 - dM74256kk) / 4.0d)) * d, i);
                    }
                }
                next.m4085k4(d, i);
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4086k4(double d, int... iArr) {
        for (int i : iArr) {
            m4085k4(d, i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4087k4(int i, double d) {
        if (!this.f4161yj.containsKey(Integer.valueOf(i))) {
            this.f4161yj.addItem(Integer.valueOf(i), Double.valueOf(d));
        } else if (C14116yg.m67475k4(this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue()) > C14116yg.m67475k4(d)) {
            this.f4161yj.set_Item(Integer.valueOf(i), Double.valueOf(d));
        }
        m4111x1(i, d);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4088k4(int i, double d, boolean z) {
        if (!this.f4161yj.containsKey(Integer.valueOf(i))) {
            this.f4161yj.addItem(Integer.valueOf(i), Double.valueOf(d));
        } else if (z || C14116yg.m67475k4(this.f4161yj.get_Item(Integer.valueOf(i)).doubleValue()) > C14116yg.m67475k4(d)) {
            this.f4161yj.set_Item(Integer.valueOf(i), Double.valueOf(d));
        }
        m4095kk(i, d);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4057k4(List<bay> list, int i) {
        List.Enumerator<bay> it = list.iterator();
        double d = Double.NaN;
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (C7019kk.m27469x1(next.m4077jd(), cpm.class) && next.m4074dy().m74272u4()) {
                    if (i == 15 ? next.m4074dy().m74289yd() : next.m4074dy().m74261lr()) {
                        double dM4072du = next.m4072du(i);
                        if (C14044b3.m66437kk(d) || d < dM4072du) {
                            d = dM4072du;
                        }
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (C14044b3.m66437kk(d)) {
            return;
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                bay next2 = it.next();
                if (C7019kk.m27469x1(next2.m4077jd(), cpm.class) && yz6.m74180x1(next2.m4072du(i), d)) {
                    if (i == 15) {
                        next2.m4074dy().m74239h4(d);
                    } else if (i == 61) {
                        next2.m4074dy().m74259kk(d);
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4058k4(Stack<bay> stack) {
        List.Enumerator<bay> it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                stack.push(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4058k4(stack);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4089k4(AbstractC0753ak abstractC0753ak) {
        this.f4146c5 = abstractC0753ak;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4059k4(bay bayVar, int i, String str, int i2, List<bay> list) {
        int i3;
        String str2;
        int i4;
        List<bay> list2;
        if (i == 1) {
            list.addItem(bayVar);
            return;
        }
        if (i != 0) {
            List.Enumerator<bay> it = bayVar.m4110x1().iterator();
            while (it.hasNext()) {
                try {
                    bay next = it.next();
                    if (C14113y2.m67363du(str, next.m4099m9().mo4816J_())) {
                        list.addItem(next);
                    } else if (C14113y2.m67411k4(str)) {
                        boolean z = i2 == 1;
                        if (!z) {
                            List.Enumerator<C14244on> it2 = next.m4076h4().iterator();
                            while (it2.hasNext()) {
                                try {
                                    C14244on next2 = it2.next();
                                    if (next2.m68728k4(next2.m5149yj(), i2)) {
                                        z = true;
                                    }
                                } catch (Throwable th) {
                                    if (!C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        throw th;
                                    }
                                    it2.dispose();
                                    throw th;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                        if (z) {
                            list.addItem(next);
                        }
                    }
                    if (i == 3) {
                        i3 = i;
                        str2 = str;
                        i4 = i2;
                        list2 = list;
                        m4059k4(next, i3, str2, i4, list2);
                    } else {
                        i3 = i;
                        str2 = str;
                        i4 = i2;
                        list2 = list;
                    }
                    i = i3;
                    str = str2;
                    i2 = i4;
                    list = list2;
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4090k4(rmh rmhVar) {
        this.f4152jd = rmhVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4091k4(s0k s0kVar) {
        this.f4147ck = s0kVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4092k4(tbp tbpVar) {
        tbpVar.CloneTo(this.f4156m9);
    }

    @Override // com.aspose.slides.AbstractC0906dm
    /* JADX INFO: renamed from: k4 */
    public void mo4093k4(C14664v5 c14664v5) {
        List.Enumerator<bay> it = m4076h4().iterator();
        while (it.hasNext()) {
            try {
                c14664v5.m72074k4(2, it.next().m5147up(), m5147up(), this.f4149dy.m72922rv().m3357x1().m2782kk());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                c14664v5.m72074k4(3, m5147up(), next.m5147up(), this.f4149dy.m72922rv().m3357x1().m2782kk());
                next.mo4093k4(c14664v5);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private boolean m4060k4(bay bayVar) {
        List.Enumerator it;
        List list;
        boolean zM4733k4 = true;
        if (bayVar.m4106uz() != null) {
            List list2 = new List();
            fwr[] fwrVarArrM70408to = bayVar.m4106uz().m70408to();
            int length = fwrVarArrM70408to.length;
            double dM67491kk = Double.MAX_VALUE;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                fwr fwrVar = fwrVarArrM70408to[i];
                it = fwrVar.m6350x1(bayVar).iterator();
                while (it.hasNext()) {
                    try {
                        bay next = it.next();
                        if (list2.containsItem(next)) {
                            list = list2;
                        } else {
                            list2.addItem(next);
                            cpm cpmVar = (cpm) C7019kk.m27452k4((Object) next.m4077jd(), cpm.class);
                            list = list2;
                            boolean z = zM4733k4;
                            dM67491kk = C14116yg.m67491kk(dM67491kk, next.m4072du(fwrVar.m6344du()));
                            zM4733k4 = z & cpmVar.m4733k4(next, fwrVar.m6345dy(), fwrVar.m6345dy());
                        }
                        list2 = list;
                    } finally {
                    }
                }
                List list3 = list2;
                boolean z2 = zM4733k4;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                i++;
                list2 = list3;
                zM4733k4 = z2;
            }
            List list4 = list2;
            if (!zM4733k4) {
                it = list4.iterator();
                while (it.hasNext()) {
                    try {
                        cpm.m4731x1((bay) it.next(), dM67491kk);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                return false;
            }
        }
        return zM4733k4;
    }
}
