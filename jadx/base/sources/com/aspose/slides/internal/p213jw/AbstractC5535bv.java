package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.Collection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p265m4.InterfaceC6314k4;
import com.aspose.slides.internal.p265m4.InterfaceC6315kk;
import com.aspose.slides.internal.p265m4.InterfaceC6316x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p304nv.C6951k4;
import com.aspose.slides.internal.p304nv.C6952kk;
import com.aspose.slides.internal.p304nv.C6953x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.internal.p517y2.InterfaceC12779to;
import com.aspose.slides.internal.p517y2.InterfaceC12788yd;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.bv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5535bv implements InterfaceC6315kk, InterfaceC12777qq {

    /* JADX INFO: renamed from: du */
    private final Object f15190du;

    /* JADX INFO: renamed from: h4 */
    private final Collection<C6952kk> f15191h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC5535bv f15192k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC5535bv f15193kk;

    /* JADX INFO: renamed from: m9 */
    private final Object f15194m9;

    /* JADX INFO: renamed from: to */
    private List<k4> f15195to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5535bv f15196x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.jw.bv$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final String f15199k4;

        /* JADX INFO: renamed from: kk */
        private InterfaceC12788yd f15200kk;

        /* JADX INFO: renamed from: x1 */
        private Object f15201x1;

        public k4(String str, Object obj, InterfaceC12788yd interfaceC12788yd) {
            this.f15199k4 = str;
            this.f15201x1 = obj;
            this.f15200kk = interfaceC12788yd;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m22673k4() {
            return this.f15199k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final Object m22674x1() {
            return this.f15201x1;
        }
    }

    public AbstractC5535bv() {
        this.f15190du = new Object();
        this.f15194m9 = new Object();
        this.f15191h4 = new Collection<>();
    }

    /* JADX INFO: renamed from: k4 */
    private int m22618k4(final String str) {
        return m22651qm().findIndex(new AbstractC14041ai<k4>() { // from class: com.aspose.slides.internal.jw.bv.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(k4 k4Var) {
                return C14113y2.m67363du(k4Var.m22673k4(), str);
            }
        });
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: A_ */
    public InterfaceC12779to mo22620A_() {
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ak, reason: merged with bridge method [inline-methods] */
    public final AbstractC5535bv mo22654sv() {
        AbstractC5535bv abstractC5535bvMo22646kp = mo22646kp();
        if (abstractC5535bvMo22646kp == null) {
            return null;
        }
        AbstractC5535bv abstractC5535bvMo22653ss = abstractC5535bvMo22646kp.mo22653ss();
        while (abstractC5535bvMo22653ss != null) {
            AbstractC5535bv abstractC5535bvMo22631g8 = abstractC5535bvMo22653ss.mo22631g8();
            if (abstractC5535bvMo22631g8 == this) {
                return abstractC5535bvMo22653ss;
            }
            abstractC5535bvMo22653ss = abstractC5535bvMo22631g8;
        }
        return abstractC5535bvMo22653ss;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ar */
    public String mo22622ar() {
        return mo22660v4().mo22622ar();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: b3, reason: merged with bridge method [inline-methods] */
    public final AbstractC5535bv mo22653ss() {
        return this.f15196x1;
    }

    /* JADX INFO: renamed from: bz */
    public final void m22624bz() {
        AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss();
        while (abstractC5535bvMo22653ss != null) {
            AbstractC5535bv abstractC5535bvMo22631g8 = abstractC5535bvMo22653ss.mo22631g8();
            m22663x1(abstractC5535bvMo22653ss);
            abstractC5535bvMo22653ss = abstractC5535bvMo22631g8;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public String mo22604c5() {
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: c6 */
    public void mo22625c6() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ck */
    public String mo22626ck() {
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: dq, reason: merged with bridge method [inline-methods] */
    public final AbstractC5535bv mo22631g8() {
        if (mo22646kp() != null) {
            return this.f15193kk;
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: du */
    public final short mo22628du(InterfaceC12777qq interfaceC12777qq) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: dy */
    public final Object mo22630dy(String str, String str2) {
        return mo22660v4().mo22630dy(str, str2);
    }

    /* JADX INFO: renamed from: e0 */
    public String mo22607e0() {
        if (mo22608fa() == 8 || mo22608fa() == 7) {
            return mo22606dy();
        }
        if (mo22608fa() == 9 || mo22608fa() == 10 || mo22608fa() == 12) {
            return null;
        }
        AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss();
        if (abstractC5535bvMo22653ss == null) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        while (abstractC5535bvMo22653ss != null) {
            if (abstractC5535bvMo22653ss.mo22608fa() == 4 || abstractC5535bvMo22653ss.mo22608fa() == 3 || abstractC5535bvMo22653ss.mo22608fa() == 1) {
                c6765kp.m26792k4(abstractC5535bvMo22653ss.mo22607e0());
            }
            abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8();
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: fa */
    public abstract byte mo22608fa();

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: h4 */
    public boolean mo22632h4(InterfaceC12777qq interfaceC12777qq) {
        return C14067j2.m66729x1(this, interfaceC12777qq);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ix */
    public final Object mo22633ix(String str) {
        int iM22618k4 = m22618k4(str);
        if (iM22618k4 != -1) {
            return m22651qm().get_Item(iM22618k4).m22674x1();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: jd */
    public String mo22634jd() {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC5535bv m22641kk(AbstractC5535bv abstractC5535bv) {
        if (this == abstractC5535bv || m22656to(abstractC5535bv)) {
            throw new ArgumentException();
        }
        if (abstractC5535bv.mo22646kp() != null) {
            abstractC5535bv.mo22646kp().m22663x1(abstractC5535bv);
        }
        InterfaceC12778rv interfaceC12778rv = (InterfaceC12778rv) C7019kk.m27452k4((Object) abstractC5535bv, C5552rv.class);
        C5552rv c5552rvMo22660v4 = mo22660v4();
        if (interfaceC12778rv != null && interfaceC12778rv != c5552rvMo22660v4) {
            throw new ArgumentException();
        }
        AbstractC5535bv abstractC5535bvMo22658um = mo22658um();
        abstractC5535bv.f15193kk = null;
        if (abstractC5535bvMo22658um == null) {
            this.f15196x1 = abstractC5535bv;
        } else {
            abstractC5535bvMo22658um.f15193kk = abstractC5535bv;
        }
        mo22639k4(abstractC5535bv);
        abstractC5535bv.m22629du(this);
        return abstractC5535bv;
    }

    /* JADX INFO: renamed from: ks */
    public void mo22611ks(String str) {
        AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss();
        if (abstractC5535bvMo22653ss != null && abstractC5535bvMo22653ss.mo22631g8() == null && abstractC5535bvMo22653ss.mo22608fa() == 3) {
            abstractC5535bvMo22653ss.mo22611ks(str);
        } else {
            m22624bz();
            m22655to(mo22660v4().mo22780h4(str));
        }
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public final AbstractC5535bv mo22646kp() {
        return this.f15192k4;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract String mo22612m9();

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public final boolean mo22648m9(InterfaceC12777qq interfaceC12777qq) {
        return mo22632h4(interfaceC12777qq);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ne */
    public final String mo22650ne(String str) {
        return mo22660v4().m22805to().mo13292k4(str);
    }

    /* JADX INFO: renamed from: qm */
    public final List<k4> m22651qm() {
        if (this.f15195to == null) {
            synchronized (this.f15190du) {
                try {
                    if (this.f15195to == null) {
                        this.f15195to = new List<>();
                    }
                } finally {
                }
            }
        }
        return this.f15195to;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: rv */
    public final String mo22652rv(String str) {
        return mo22660v4().m22805to().mo52700x1(str);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC5535bv m22655to(InterfaceC12777qq interfaceC12777qq) {
        return m22641kk((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq, AbstractC5535bv.class));
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, Value=\"{1}\"", mo22612m9(), mo22606dy());
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ts */
    public final boolean mo22657ts() {
        return (mo22620A_() == null || mo22620A_().mo59443k4() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: um */
    public AbstractC5535bv mo22658um() {
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public C5552rv mo22660v4() {
        return mo22646kp().mo22660v4();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: wy, reason: merged with bridge method [inline-methods] */
    public final AbstractC5535bv mo22661wp() {
        return mo22658um();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5535bv m22663x1(AbstractC5535bv abstractC5535bv) {
        if (abstractC5535bv.mo22646kp() != this) {
            throw new ArgumentException();
        }
        if (abstractC5535bv == mo22653ss()) {
            if (abstractC5535bv == mo22658um()) {
                this.f15196x1 = null;
                mo22639k4((AbstractC5535bv) null);
            } else {
                this.f15196x1 = abstractC5535bv.f15193kk;
            }
        } else if (abstractC5535bv == mo22658um()) {
            AbstractC5535bv abstractC5535bvMo22654sv = abstractC5535bv.mo22654sv();
            abstractC5535bvMo22654sv.f15193kk = null;
            mo22639k4(abstractC5535bvMo22654sv);
        } else if (abstractC5535bv.mo22654sv() != null) {
            abstractC5535bv.mo22654sv().f15193kk = abstractC5535bv.f15193kk;
        }
        abstractC5535bv.f15193kk = null;
        abstractC5535bv.m22629du((AbstractC5535bv) null);
        return abstractC5535bv;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract InterfaceC12777qq mo22614x1(boolean z);

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x6 */
    public final boolean mo22669x6(String str) {
        return C14113y2.m67363du(mo22660v4().m22805to().mo23227x1(), str);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: xk */
    public final boolean mo22670xk() {
        return mo22658um() != null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: yd */
    public final InterfaceC12760ar mo22671yd() {
        return new C5542h4(this);
    }

    public AbstractC5535bv(C5552rv c5552rv) {
        this.f15190du = new Object();
        this.f15194m9 = new Object();
        if (c5552rv == null) {
            throw new ArgumentException();
        }
        this.f15191h4 = new Collection<>();
        this.f15192k4 = c5552rv;
    }

    /* JADX INFO: renamed from: du */
    public void m22629du(AbstractC5535bv abstractC5535bv) {
        this.f15192k4 = abstractC5535bv;
    }

    /* JADX INFO: renamed from: dy */
    public String mo22606dy() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericCollection<InterfaceC6316x1> m22635k4(InterfaceC6314k4 interfaceC6314k4, int i) {
        Collection collection;
        synchronized (this.f15194m9) {
            try {
                collection = new Collection();
                IGenericEnumerator<C6952kk> it = this.f15191h4.iterator();
                while (it.hasNext()) {
                    try {
                        C6952kk next = it.next();
                        if (C14113y2.m67363du(next.m27204k4(), interfaceC6314k4.mo25861k4()) && (i == 2 || ((next.m27206kk() && i == 1) || (!next.m27206kk() && i == 0)))) {
                            collection.addItem(next.m27207x1());
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return collection;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC5535bv m22642kk(AbstractC5535bv abstractC5535bv, AbstractC5535bv abstractC5535bv2) {
        AbstractC5535bv abstractC5535bvMo22631g8 = abstractC5535bv2.mo22631g8();
        m22663x1(abstractC5535bv2);
        m22636k4(abstractC5535bv, abstractC5535bvMo22631g8);
        return abstractC5535bv2;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public final boolean mo22649m9(String str, String str2) {
        return mo22660v4().mo22649m9(str, str2);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m22656to(AbstractC5535bv abstractC5535bv) {
        for (AbstractC5535bv abstractC5535bvMo22646kp = mo22646kp(); abstractC5535bvMo22646kp != null; abstractC5535bvMo22646kp = abstractC5535bvMo22646kp.mo22646kp()) {
            if (abstractC5535bvMo22646kp == abstractC5535bv) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5535bv m22664x1(AbstractC5535bv abstractC5535bv, AbstractC5535bv abstractC5535bv2) {
        if (this == abstractC5535bv || m22656to(abstractC5535bv)) {
            throw new ArgumentException();
        }
        if (abstractC5535bv2 == null) {
            return m22641kk(abstractC5535bv);
        }
        if (abstractC5535bv2.mo22646kp() != this) {
            throw new ArgumentException();
        }
        if (abstractC5535bv == abstractC5535bv2) {
            return abstractC5535bv;
        }
        C5552rv c5552rvMo22660v4 = abstractC5535bv.mo22660v4();
        C5552rv c5552rvMo22660v42 = mo22660v4();
        if (c5552rvMo22660v4 != null && c5552rvMo22660v4 != c5552rvMo22660v42) {
            throw new ArgumentException();
        }
        if (abstractC5535bv.mo22646kp() != null) {
            abstractC5535bv.mo22646kp().m22663x1(abstractC5535bv);
        }
        if (abstractC5535bv2 == mo22658um()) {
            abstractC5535bv2.f15193kk = abstractC5535bv;
            abstractC5535bv.f15193kk = null;
            mo22639k4(abstractC5535bv);
        } else {
            AbstractC5535bv abstractC5535bv3 = abstractC5535bv2.f15193kk;
            abstractC5535bv2.f15193kk = abstractC5535bv;
            abstractC5535bv.f15193kk = abstractC5535bv3;
        }
        abstractC5535bv.m22629du(this);
        return abstractC5535bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5535bv m22636k4(AbstractC5535bv abstractC5535bv, AbstractC5535bv abstractC5535bv2) {
        if (this == abstractC5535bv || m22656to(abstractC5535bv)) {
            throw new ArgumentException();
        }
        if (abstractC5535bv2 == null) {
            return m22641kk(abstractC5535bv);
        }
        if (abstractC5535bv2.mo22646kp() != this) {
            throw new ArgumentException();
        }
        if (abstractC5535bv == abstractC5535bv2) {
            return abstractC5535bv;
        }
        C5552rv c5552rvMo22660v4 = abstractC5535bv.mo22660v4();
        C5552rv c5552rvMo22660v42 = mo22660v4();
        if (c5552rvMo22660v4 != null && c5552rvMo22660v4 != c5552rvMo22660v42) {
            throw new ArgumentException();
        }
        if (abstractC5535bv.mo22646kp() != null) {
            abstractC5535bv.mo22646kp().m22663x1(abstractC5535bv);
        }
        if (abstractC5535bv2 == mo22653ss()) {
            this.f15196x1 = abstractC5535bv;
            abstractC5535bv.f15193kk = abstractC5535bv2;
        } else {
            AbstractC5535bv abstractC5535bvMo22654sv = abstractC5535bv2.mo22654sv();
            abstractC5535bv.f15193kk = abstractC5535bv2;
            abstractC5535bvMo22654sv.f15193kk = abstractC5535bv;
        }
        abstractC5535bv.m22629du(this);
        return abstractC5535bv;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: kk */
    public final InterfaceC12777qq mo22643kk(InterfaceC12777qq interfaceC12777qq) {
        return m22641kk((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq, AbstractC5535bv.class));
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12777qq mo22665x1(InterfaceC12777qq interfaceC12777qq) {
        return m22663x1((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq, AbstractC5535bv.class));
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq mo22637k4(InterfaceC12777qq interfaceC12777qq, InterfaceC12777qq interfaceC12777qq2) {
        return m22636k4((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq, AbstractC5535bv.class), (AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq2, AbstractC5535bv.class));
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: kk */
    public final InterfaceC12777qq mo22644kk(InterfaceC12777qq interfaceC12777qq, InterfaceC12777qq interfaceC12777qq2) {
        return m22642kk((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq, AbstractC5535bv.class), (AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq2, AbstractC5535bv.class));
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12777qq mo22666x1(InterfaceC12777qq interfaceC12777qq, InterfaceC12777qq interfaceC12777qq2) {
        return m22664x1((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq, AbstractC5535bv.class), (AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12777qq2, AbstractC5535bv.class));
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: k4 */
    public final Object mo22638k4(String str, Object obj, InterfaceC12788yd interfaceC12788yd) {
        int iM22618k4 = m22618k4(str);
        if (iM22618k4 == -1) {
            m22651qm().addItem(new k4(str, obj, interfaceC12788yd));
            return null;
        }
        k4 k4Var = m22651qm().get_Item(iM22618k4);
        m22651qm().set_Item(iM22618k4, new k4(str, obj, interfaceC12788yd));
        return k4Var.m22674x1();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: kk */
    public void mo22645kk(String str) {
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public void mo22667x1(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22639k4(AbstractC5535bv abstractC5535bv) {
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m22668x1(InterfaceC6314k4 interfaceC6314k4) {
        synchronized (this.f15194m9) {
            try {
                IGenericEnumerator<C6952kk> it = this.f15191h4.iterator();
                while (it.hasNext()) {
                    try {
                        if (C14113y2.m67363du(it.next().m27204k4(), interfaceC6314k4.mo25861k4())) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return true;
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
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m22619k4(String str, String[] strArr, String[] strArr2) {
        int iM67429to = C14113y2.m67429to(str, ':');
        if (-1 == iM67429to || iM67429to == 0 || str.length() - 1 == iM67429to) {
            strArr[0] = C14113y2.f47374k4;
            strArr2[0] = str;
        } else {
            strArr[0] = C14113y2.m67443x1(str, 0, iM67429to);
            strArr2[0] = C14113y2.m67422kk(str, iM67429to + 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22640k4(InterfaceC6314k4 interfaceC6314k4) {
        new C6953x1(this, (C6951k4) interfaceC6314k4, 2).m27214to();
        return !r0.m27213kk();
    }
}
