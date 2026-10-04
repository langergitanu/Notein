package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p205ji.C5465to;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13906gx;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ny */
/* JADX INFO: loaded from: classes5.dex */
public class C13129ny {

    /* JADX INFO: renamed from: c5 */
    private AbstractC13319z7 f44163c5;

    /* JADX INFO: renamed from: ck */
    private boolean f44164ck;

    /* JADX INFO: renamed from: du */
    public final AbstractC7018k4<AbstractC13319z7> f44165du;

    /* JADX INFO: renamed from: dy */
    private SortedList f44166dy;

    /* JADX INFO: renamed from: fa */
    private Hashtable f44167fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13883dt f44168h4;

    /* JADX INFO: renamed from: ix */
    private C12903b2 f44169ix;

    /* JADX INFO: renamed from: jd */
    private AbstractC13319z7 f44170jd;

    /* JADX INFO: renamed from: k4 */
    public C13005gv f44171k4;

    /* JADX INFO: renamed from: kk */
    public C13005gv f44172kk;

    /* JADX INFO: renamed from: ks */
    private boolean f44173ks;

    /* JADX INFO: renamed from: m9 */
    private C13058k1 f44174m9;

    /* JADX INFO: renamed from: ne */
    private C13282xc f44175ne;

    /* JADX INFO: renamed from: rv */
    private C13322zd f44176rv;

    /* JADX INFO: renamed from: to */
    public C13005gv f44177to;

    /* JADX INFO: renamed from: u4 */
    private C13005gv f44178u4;

    /* JADX INFO: renamed from: up */
    private Hashtable f44179up;

    /* JADX INFO: renamed from: uz */
    private AtomicReference<Object> f44180uz;

    /* JADX INFO: renamed from: wl */
    private AbstractC13319z7 f44181wl;

    /* JADX INFO: renamed from: x1 */
    public C13005gv f44182x1;

    /* JADX INFO: renamed from: x6 */
    private C13906gx f44183x6;

    /* JADX INFO: renamed from: yj */
    private Hashtable f44184yj;

    public C13129ny() {
        this(new C13963qw());
    }

    /* JADX INFO: renamed from: ne */
    private void m61306ne() {
        if (this.f44171k4 == null) {
            this.f44171k4 = new C13005gv();
        }
        if (this.f44182x1 == null) {
            this.f44182x1 = new C13005gv();
        }
        if (this.f44172kk == null) {
            this.f44172kk = new C13005gv();
        }
        if (this.f44177to == null) {
            this.f44177to = new C13005gv();
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m61310x6() {
        m61313du().m60645k4();
        m61316h4().m60645k4();
        m61335m9().m60645k4();
        m61314dy().m60645k4();
        m61317jd().m60645k4();
    }

    /* JADX INFO: renamed from: c5 */
    public final Hashtable m61311c5() {
        return this.f44167fa;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:21:0x0049, B:23:0x0051, B:25:0x0062, B:39:0x009b, B:41:0x00a1, B:47:0x00af, B:45:0x00a8, B:46:0x00ac, B:48:0x00b2, B:50:0x00ba, B:52:0x00be, B:53:0x00c5), top: B:77:0x0049 }] */
    /* JADX INFO: renamed from: ck */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m61312ck() {
        if (this.f44164ck) {
            return;
        }
        int i = 0;
        if (this.f44166dy.size() == 0) {
            m61310x6();
            this.f44176rv = new C13322zd();
            this.f44164ck = true;
            this.f44173ks = false;
            return;
        }
        synchronized (m61324k4()) {
            if (!this.f44164ck) {
                C13306yj c13306yj = new C13306yj(this.f44168h4, this.f44170jd, this.f44175ne, this.f44169ix);
                C13322zd c13322zd = new C13322zd();
                if (!this.f44173ks) {
                    c13306yj.m61844k4(this);
                }
                try {
                    C13282xc c13282xcM61144m9 = C13091ly.m61144m9();
                    int i2 = 0;
                    while (true) {
                        try {
                            if (i2 < this.f44166dy.size()) {
                                C13282xc c13282xc = (C13282xc) this.f44166dy.getByIndex(i2);
                                C5465to.m22552k4(c13282xc);
                                if (c13282xc.m61704jd()) {
                                    if (!c13282xc.m61695c5()) {
                                        c13306yj.m61845k4(c13282xc, true);
                                    } else if (this.f44173ks) {
                                        if (c13282xc == c13282xcM61144m9) {
                                            c13306yj.m61845k4(c13282xc, false);
                                        }
                                    }
                                    i2++;
                                } else {
                                    m61299k4(new XmlSchemaException("All schemas in the set should be successfully preprocessed prior to compilation.", C14113y2.f47374k4), 0);
                                    this.f44164ck = false;
                                    if (i2 == this.f44166dy.size()) {
                                        i2--;
                                    }
                                    while (i2 >= 0) {
                                        C13282xc c13282xc2 = (C13282xc) this.f44166dy.getByIndex(i2);
                                        if (c13282xc2 != C13091ly.m61144m9()) {
                                            c13282xc2.m61711k4(this.f44164ck);
                                        }
                                        C5465to.m22553x1(c13282xc2);
                                        i2--;
                                    }
                                }
                            } else {
                                boolean zM61846k4 = c13306yj.m61846k4(this, c13322zd);
                                this.f44164ck = zM61846k4;
                                if (zM61846k4) {
                                    if (!this.f44173ks) {
                                        c13322zd.m61882k4(this.f44176rv, this.f44170jd);
                                    }
                                    this.f44173ks = false;
                                    this.f44176rv = c13322zd;
                                }
                                if (i2 == this.f44166dy.size()) {
                                    i2--;
                                }
                                while (i2 >= 0) {
                                    C13282xc c13282xc3 = (C13282xc) this.f44166dy.getByIndex(i2);
                                    if (c13282xc3 != C13091ly.m61144m9()) {
                                        c13282xc3.m61711k4(this.f44164ck);
                                    }
                                    C5465to.m22553x1(c13282xc3);
                                    i2--;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i == this.f44166dy.size()) {
                                i--;
                            }
                            while (i >= 0) {
                                C13282xc c13282xc4 = (C13282xc) this.f44166dy.getByIndex(i);
                                if (c13282xc4 != C13091ly.m61144m9()) {
                                    c13282xc4.m61711k4(this.f44164ck);
                                }
                                C5465to.m22553x1(c13282xc4);
                                i--;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final C13005gv m61313du() {
        if (this.f44171k4 == null) {
            this.f44171k4 = new C13005gv();
        }
        return this.f44171k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C13005gv m61314dy() {
        if (this.f44177to == null) {
            this.f44177to = new C13005gv();
        }
        return this.f44177to;
    }

    /* JADX INFO: renamed from: fa */
    public final C13322zd m61315fa() {
        return this.f44176rv;
    }

    /* JADX INFO: renamed from: h4 */
    public final C13005gv m61316h4() {
        if (this.f44182x1 == null) {
            this.f44182x1 = new C13005gv();
        }
        return this.f44182x1;
    }

    /* JADX INFO: renamed from: jd */
    public final C13005gv m61317jd() {
        if (this.f44178u4 == null) {
            this.f44178u4 = new C13005gv();
        }
        return this.f44178u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final ICollection m61318k4(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        for (int i = 0; i < this.f44166dy.size(); i++) {
            C13282xc c13282xc = (C13282xc) this.f44166dy.getByIndex(i);
            if (C14113y2.m67363du(m61333kk(c13282xc), str)) {
                arrayList.addItem(c13282xc);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: kk */
    public final C12903b2 m61332kk() {
        return this.f44169ix;
    }

    /* JADX INFO: renamed from: ks */
    public final AbstractC13319z7 m61334ks() {
        return this.f44170jd;
    }

    /* JADX INFO: renamed from: m9 */
    public final C13005gv m61335m9() {
        if (this.f44172kk == null) {
            this.f44172kk = new C13005gv();
        }
        return this.f44172kk;
    }

    /* JADX INFO: renamed from: rv */
    public final SortedList m61336rv() {
        return this.f44166dy;
    }

    /* JADX INFO: renamed from: to */
    public final int m61337to() {
        return this.f44166dy.size();
    }

    /* JADX INFO: renamed from: up */
    public final C13906gx m61338up() {
        return this.f44183x6;
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC13943n5 m61342yj() {
        return this.f44183x6.m65400to();
    }

    public C13129ny(AbstractC13883dt abstractC13883dt) {
        this.f44164ck = false;
        this.f44180uz = new AtomicReference<>();
        this.f44165du = new C13139og(this);
        if (abstractC13883dt == null) {
            throw new ArgumentNullException("nameTable");
        }
        this.f44168h4 = abstractC13883dt;
        this.f44166dy = new SortedList();
        this.f44167fa = new Hashtable();
        this.f44179up = new Hashtable();
        this.f44184yj = new Hashtable();
        C13134o4 c13134o4 = new C13134o4(this);
        this.f44163c5 = c13134o4;
        this.f44170jd = c13134o4;
        C13906gx c13906gx = new C13906gx();
        this.f44183x6 = c13906gx;
        if (c13906gx.m65392kk() == null) {
            this.f44183x6.m65389k4(new C14010x0());
            this.f44183x6.m65390k4(false);
        }
        this.f44183x6.m65388k4(abstractC13883dt);
        this.f44183x6.m65401to(0);
        this.f44169ix = new C12903b2();
        this.f44176rv = new C13322zd();
        this.f44173ks = true;
    }

    /* JADX INFO: renamed from: h4 */
    private void m61296h4(C13282xc c13282xc) {
        if (this.f44166dy.size() == 0) {
            return;
        }
        m61306ne();
        Iterator it = c13282xc.m61717ks().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                if (((C13021hu) this.f44171k4.m60649kk(c13021hu.m60721qq())) == c13021hu) {
                    this.f44171k4.m60646k4(c13021hu.m60721qq());
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it2 = c13282xc.m61701fa().m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it2.next();
                if (((C13146p4) this.f44182x1.m60649kk(c13146p4.m61359fa())) == c13146p4) {
                    this.f44182x1.m60646k4(c13146p4.m61359fa());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        it = c13282xc.m61737yj().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it.next();
                if (((C12943dd) this.f44172kk.m60649kk(c12943dd.m60210bv())) == c12943dd) {
                    this.f44172kk.m60646k4(c12943dd.m60210bv());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C13058k1 m61319k4(AbstractC13883dt abstractC13883dt) {
        AbstractC13883dt abstractC13883dt2 = this.f44168h4;
        if (abstractC13883dt2 != abstractC13883dt) {
            return new C13058k1(abstractC13883dt);
        }
        if (this.f44174m9 == null) {
            this.f44174m9 = new C13058k1(abstractC13883dt2);
        }
        return this.f44174m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61339x1(C13129ny c13129ny) {
        SortedList sortedListM61336rv = c13129ny.m61336rv();
        boolean z = this.f44166dy.size() == 0;
        ArrayList arrayList = new ArrayList();
        C13322zd c13322zd = new C13322zd();
        for (int i = 0; i < sortedListM61336rv.size(); i++) {
            C13282xc c13282xc = (C13282xc) sortedListM61336rv.getByIndex(i);
            C14062gk c14062gkM61725u4 = c13282xc.m61725u4();
            if (this.f44166dy.containsKey(Integer.valueOf(c13282xc.m61728uz())) || !(c14062gkM61725u4 == null || c14062gkM61725u4.m66694u4().length() == 0 || this.f44167fa.get_Item(c14062gkM61725u4) == null)) {
                arrayList.addItem(c13282xc);
            } else {
                this.f44166dy.addItem(Integer.valueOf(c13282xc.m61728uz()), c13282xc);
                if (c14062gkM61725u4 != null && c14062gkM61725u4.m66694u4().length() != 0) {
                    this.f44167fa.addItem(c14062gkM61725u4, c13282xc);
                }
                String strM61333kk = m61333kk(c13282xc);
                if (this.f44184yj.get_Item(strM61333kk) == null) {
                    this.f44184yj.addItem(strM61333kk, strM61333kk);
                }
            }
        }
        m61306ne();
        Iterator it = c13129ny.m61313du().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                if (!m61304k4(this.f44171k4, c13021hu.m60721qq(), c13021hu)) {
                    Iterator it2 = sortedListM61336rv.getValues().iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!arrayList.contains((C13282xc) next)) {
                            m61321k4((C13282xc) next, false);
                        }
                    }
                    Iterator it3 = c13129ny.m61313du().m60648kk().iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (!arrayList.contains(((C13282xc) next2).m60677c6())) {
                            this.f44171k4.m60646k4(((C13021hu) next2).m60721qq());
                        }
                    }
                    Iterator it4 = c13129ny.m61316h4().m60648kk().iterator();
                    while (it4.hasNext()) {
                        Object next3 = it4.next();
                        if (!arrayList.contains(((C13282xc) next3).m60677c6())) {
                            this.f44182x1.m60646k4(((C13146p4) next3).m61359fa());
                        }
                    }
                    Iterator it5 = c13129ny.m61335m9().m60648kk().iterator();
                    while (it5.hasNext()) {
                        Object next4 = it5.next();
                        if (!arrayList.contains(((C13282xc) next4).m60677c6())) {
                            this.f44172kk.m60646k4(((C12943dd) next4).m60210bv());
                        }
                    }
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                        return;
                    }
                    return;
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        it = c13129ny.m61316h4().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it.next();
                if (!m61304k4(this.f44182x1, c13146p4.m61359fa(), c13146p4)) {
                    Iterator it6 = sortedListM61336rv.getValues().iterator();
                    while (it6.hasNext()) {
                        Object next5 = it6.next();
                        if (!arrayList.contains((C13282xc) next5)) {
                            m61321k4((C13282xc) next5, false);
                        }
                    }
                    Iterator it7 = c13129ny.m61313du().m60648kk().iterator();
                    while (it7.hasNext()) {
                        Object next6 = it7.next();
                        if (!arrayList.contains(((C13282xc) next6).m60677c6())) {
                            this.f44171k4.m60646k4(((C13021hu) next6).m60721qq());
                        }
                    }
                    Iterator it8 = c13129ny.m61316h4().m60648kk().iterator();
                    while (it8.hasNext()) {
                        Object next7 = it8.next();
                        if (!arrayList.contains(((C13282xc) next7).m60677c6())) {
                            this.f44182x1.m60646k4(((C13146p4) next7).m61359fa());
                        }
                    }
                    Iterator it9 = c13129ny.m61335m9().m60648kk().iterator();
                    while (it9.hasNext()) {
                        Object next8 = it9.next();
                        if (!arrayList.contains(((C13282xc) next8).m60677c6())) {
                            this.f44172kk.m60646k4(((C12943dd) next8).m60210bv());
                        }
                    }
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                        return;
                    }
                    return;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        it = c13129ny.m61335m9().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it.next();
                if (!m61304k4(this.f44172kk, c12943dd.m60210bv(), c12943dd)) {
                    Iterator it10 = sortedListM61336rv.getValues().iterator();
                    while (it10.hasNext()) {
                        Object next9 = it10.next();
                        if (!arrayList.contains((C13282xc) next9)) {
                            m61321k4((C13282xc) next9, false);
                        }
                    }
                    Iterator it11 = c13129ny.m61313du().m60648kk().iterator();
                    while (it11.hasNext()) {
                        Object next10 = it11.next();
                        if (!arrayList.contains(((C13282xc) next10).m60677c6())) {
                            this.f44171k4.m60646k4(((C13021hu) next10).m60721qq());
                        }
                    }
                    Iterator it12 = c13129ny.m61316h4().m60648kk().iterator();
                    while (it12.hasNext()) {
                        Object next11 = it12.next();
                        if (!arrayList.contains(((C13282xc) next11).m60677c6())) {
                            this.f44182x1.m60646k4(((C13146p4) next11).m61359fa());
                        }
                    }
                    Iterator it13 = c13129ny.m61335m9().m60648kk().iterator();
                    while (it13.hasNext()) {
                        Object next12 = it13.next();
                        if (!arrayList.contains(((C13282xc) next12).m60677c6())) {
                            this.f44172kk.m60646k4(((C12943dd) next12).m60210bv());
                        }
                    }
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                        return;
                    }
                    return;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        m61300k4(c13129ny.m61314dy(), false);
        c13322zd.m61882k4(this.f44176rv, this.f44170jd);
        c13322zd.m61882k4(c13129ny.m61315fa(), this.f44170jd);
        this.f44176rv = c13322zd;
        if (z) {
            this.f44164ck = true;
            this.f44173ks = false;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m61295du(C13282xc c13282xc) {
        C13282xc c13282xc2;
        ArrayList arrayList = new ArrayList();
        c13282xc.m61707k4(arrayList, c13282xc);
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C13282xc) arrayList.get_Item(i)).m61725u4() != null && ((C13282xc) arrayList.get_Item(i)).m61725u4().m66694u4().length() != 0) {
                this.f44167fa.removeItem(((C13282xc) arrayList.get_Item(i)).m61725u4());
            }
            ICollection keys = this.f44179up.getKeys();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = keys.iterator();
            while (it.hasNext()) {
                try {
                    C12931ck c12931ck = (C12931ck) it.next();
                    if (c12931ck.f43493x1.equals(((C13282xc) arrayList.get_Item(i)).m61725u4()) && ((c13282xc2 = c12931ck.f43491kk) == null || C14067j2.m66729x1(c13282xc2, arrayList.get_Item(i)))) {
                        arrayList2.addItem(c12931ck);
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.f44179up.removeItem(arrayList2.get_Item(i2));
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m61308to(C13282xc c13282xc) {
        this.f44166dy.addItem(Integer.valueOf(c13282xc.m61728uz()), c13282xc);
        String strM61333kk = m61333kk(c13282xc);
        if (this.f44184yj.get_Item(strM61333kk) == null) {
            this.f44184yj.addItem(strM61333kk, strM61333kk);
        }
        if (this.f44175ne == null && "http://www.w3.org/2001/XMLSchema".equals(strM61333kk) && c13282xc.m61737yj().m60649kk(AbstractC13279x6.f44531x1) != null) {
            this.f44175ne = c13282xc;
        }
        for (int i = 0; i < c13282xc.m61736yd().size(); i++) {
            C13282xc c13282xc2 = (C13282xc) c13282xc.m61736yd().get_Item(i);
            if (!this.f44166dy.containsKey(Integer.valueOf(c13282xc2.m61728uz()))) {
                this.f44166dy.addItem(Integer.valueOf(c13282xc2.m61728uz()), c13282xc2);
            }
            String strM61333kk2 = m61333kk(c13282xc2);
            if (this.f44184yj.get_Item(strM61333kk2) == null) {
                this.f44184yj.addItem(strM61333kk2, strM61333kk2);
            }
            if (this.f44175ne == null && "http://www.w3.org/2001/XMLSchema".equals(strM61333kk2) && c13282xc.m61737yj().m60649kk(AbstractC13279x6.f44531x1) != null) {
                this.f44175ne = c13282xc;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C13282xc m61320k4(C13282xc c13282xc) {
        if (c13282xc == null) {
            throw new ArgumentNullException("Schema");
        }
        synchronized (m61324k4()) {
            try {
                if (!this.f44166dy.containsKey(Integer.valueOf(c13282xc.m61728uz()))) {
                    c13282xc = m61297k4(c13282xc.m61697du(), c13282xc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13282xc;
    }

    /* JADX INFO: renamed from: kk */
    public final String m61333kk(C13282xc c13282xc) {
        return c13282xc.m61697du() == null ? C14113y2.f47374k4 : c13282xc.m61697du();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m61340x1() {
        return this.f44164ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13282xc m61321k4(C13282xc c13282xc, boolean z) {
        if (c13282xc == null) {
            throw new ArgumentNullException("Schema");
        }
        synchronized (m61324k4()) {
            try {
                if (!this.f44166dy.containsKey(Integer.valueOf(c13282xc.m61728uz()))) {
                    return null;
                }
                if (z) {
                    m61296h4(c13282xc);
                    m61295du(c13282xc);
                }
                this.f44166dy.removeItem(Integer.valueOf(c13282xc.m61728uz()));
                if (c13282xc.m61725u4() != null) {
                    this.f44167fa.removeItem(c13282xc.m61725u4());
                }
                String strM61333kk = m61333kk(c13282xc);
                if (m61318k4(strM61333kk).size() == 0) {
                    this.f44184yj.removeItem(strM61333kk);
                }
                if (z) {
                    this.f44164ck = false;
                    this.f44173ks = true;
                }
                return c13282xc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m61341x1(C13282xc c13282xc) {
        if (c13282xc == null) {
            throw new ArgumentNullException("schemaToRemove");
        }
        if (!this.f44166dy.containsKey(Integer.valueOf(c13282xc.m61728uz()))) {
            return false;
        }
        synchronized (m61324k4()) {
            try {
                if (!this.f44166dy.containsKey(Integer.valueOf(c13282xc.m61728uz()))) {
                    return false;
                }
                Hashtable hashtable = new Hashtable();
                hashtable.addItem(m61333kk(c13282xc), c13282xc);
                for (int i = 0; i < c13282xc.m61693b3().size(); i++) {
                    String str = (String) c13282xc.m61693b3().get_Item(i);
                    if (hashtable.get_Item(str) == null) {
                        hashtable.addItem(str, str);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.f44166dy.size(); i2++) {
                    C13282xc c13282xc2 = (C13282xc) this.f44166dy.getByIndex(i2);
                    if (c13282xc2 != c13282xc && !c13282xc.m61736yd().contains(c13282xc2)) {
                        arrayList.addItem(c13282xc2);
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    C13282xc c13282xc3 = (C13282xc) arrayList.get_Item(i3);
                    if (c13282xc3.m61693b3().size() > 0) {
                        Iterator it = hashtable.getKeys().iterator();
                        while (it.hasNext()) {
                            try {
                                if (c13282xc3.m61693b3().contains((String) it.next())) {
                                    m61299k4(new XmlSchemaException("The Schema could not be removed because other schemas in the set have dependencies on this Schema or its imports.", C14113y2.f47374k4), 1);
                                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                        ((IDisposable) it).dispose();
                                    }
                                    return false;
                                }
                            } finally {
                                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it).dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                }
                m61321k4(c13282xc, true);
                for (int i4 = 0; i4 < c13282xc.m61736yd().size(); i4++) {
                    m61321k4((C13282xc) c13282xc.m61736yd().get_Item(i4), true);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[RETURN] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C13282xc m61322k4(C14062gk c14062gk, String str, DictionaryEntry[] dictionaryEntryArr) {
        C13282xc c13282xc;
        Object value;
        if (c14062gk == null || c14062gk.m66694u4().length() == 0) {
            return null;
        }
        if (dictionaryEntryArr != null) {
            for (int i = 0; i < dictionaryEntryArr.length; i++) {
                if (c14062gk.equals(dictionaryEntryArr[i].getKey())) {
                    value = dictionaryEntryArr[i].getValue();
                }
            }
            c13282xc = null;
            if (c13282xc != null) {
                return c13282xc;
            }
            String strM61697du = c13282xc.m61697du() == null ? C14113y2.f47374k4 : c13282xc.m61697du();
            if (C14113y2.m67363du(strM61697du, str)) {
                return c13282xc;
            }
            if (C14113y2.m67363du(strM61697du, C14113y2.f47374k4)) {
                return (C13282xc) this.f44179up.get_Item(new C12931ck(str, c13282xc));
            }
            return null;
        }
        value = this.f44167fa.get_Item(c14062gk);
        c13282xc = (C13282xc) value;
        if (c13282xc != null) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C13282xc m61297k4(String str, C13282xc c13282xc) {
        if (c13282xc != null && c13282xc.m61726um() == 0) {
            C13282xc[] c13282xcArr = {c13282xc};
            boolean zM61331k4 = m61331k4(c13282xcArr, str);
            C13282xc c13282xc2 = c13282xcArr[0];
            if (zM61331k4) {
                m61308to(c13282xc2);
                this.f44164ck = false;
                return c13282xc2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13282xc m61323k4(String str, AbstractC13912i5 abstractC13912i5) {
        AbstractC13883dt abstractC13883dtMo65059yd = abstractC13912i5.mo65059yd();
        C12915bu c12915bu = new C12915bu(3, abstractC13883dtMo65059yd, m61319k4(abstractC13883dtMo65059yd), this.f44170jd);
        c12915bu.m60114k4(this.f44183x6.m65400to());
        try {
            c12915bu.m60113k4(abstractC13912i5, str);
            return c12915bu.m60117x1();
        } catch (XmlSchemaException e) {
            m61299k4(e, 0);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m61324k4() {
        if (this.f44180uz.get() == null) {
            this.f44180uz.set(new Object());
        }
        return this.f44180uz.get();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61299k4(XmlSchemaException xmlSchemaException, int i) {
        AbstractC13319z7 abstractC13319z7 = this.f44170jd;
        if (abstractC13319z7 == null) {
            throw xmlSchemaException;
        }
        abstractC13319z7.mo12838k4(this, new C13020hq(xmlSchemaException, i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61325k4(C12903b2 c12903b2) {
        this.f44169ix = c12903b2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61300k4(C13005gv c13005gv, boolean z) {
        Iterator it = c13005gv.m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13078l0 c13078l0 = (C13078l0) it.next();
                if (z) {
                    m61301k4(c13078l0, c13005gv);
                }
                C13890ei c13890eiM61099x1 = c13078l0.m61099x1();
                C13078l0 c13078l02 = (C13078l0) this.f44177to.m60649kk(c13890eiM61099x1);
                if (c13078l02 != null) {
                    for (int i = 0; i < c13078l0.m61097k4().size(); i++) {
                        if (!c13078l02.m61097k4().contains(c13078l0.m61097k4().get_Item(i))) {
                            c13078l02.m61097k4().addItem(c13078l0.m61097k4().get_Item(i));
                        }
                    }
                } else {
                    m61304k4(this.f44177to, c13890eiM61099x1, c13078l0);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61301k4(C13078l0 c13078l0, C13005gv c13005gv) {
        C13021hu c13021hu = (C13021hu) this.f44171k4.m60649kk(c13078l0.m61099x1());
        if (c13078l0.m61097k4().contains(c13021hu)) {
            return;
        }
        List list = null;
        for (int i = 0; i < c13078l0.m61097k4().size(); i++) {
            C13021hu c13021hu2 = (C13021hu) c13078l0.m61097k4().get_Item(i);
            C13078l0 c13078l02 = (C13078l0) c13005gv.m60649kk(c13021hu2.m60721qq());
            if (c13078l02 != null) {
                m61301k4(c13078l02, c13005gv);
                for (int i2 = 0; i2 < c13078l02.m61097k4().size(); i2++) {
                    C13021hu c13021hu3 = (C13021hu) c13078l02.m61097k4().get_Item(i2);
                    if (c13021hu3 != c13021hu2) {
                        if (list == null) {
                            list = new List();
                        }
                        list.addItem(c13021hu3);
                    }
                }
            }
        }
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                c13078l0.m61097k4().addItem(list.get_Item(i3));
            }
        }
        c13078l0.m61097k4().addItem(c13021hu);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final void m61326k4(C13129ny c13129ny) {
        boolean z;
        if (c13129ny == null) {
            throw new ArgumentNullException("schemas");
        }
        if (this == c13129ny) {
            return;
        }
        synchronized (m61324k4()) {
            synchronized (c13129ny.m61324k4()) {
                try {
                    if (c13129ny.m61340x1()) {
                        m61339x1(c13129ny);
                    } else {
                        Iterator it = c13129ny.m61336rv().getValues().iterator();
                        while (true) {
                            try {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                C13282xc c13282xc = (C13282xc) it.next();
                                String strM61697du = c13282xc.m61697du();
                                if (strM61697du == null) {
                                    strM61697du = C14113y2.f47374k4;
                                }
                                if (!this.f44166dy.containsKey(Integer.valueOf(c13282xc.m61728uz())) && m61322k4(c13282xc.m61725u4(), strM61697du, (DictionaryEntry[]) null) == null && m61297k4(c13282xc.m61697du(), c13282xc) == null) {
                                    z = true;
                                    break;
                                }
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it).dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                        if (z) {
                            Iterator it2 = c13129ny.m61336rv().getValues().iterator();
                            while (it2.hasNext()) {
                                try {
                                    C13282xc c13282xc2 = (C13282xc) it2.next();
                                    this.f44166dy.removeItem(Integer.valueOf(c13282xc2.m61728uz()));
                                    this.f44167fa.removeItem(c13282xc2.m61725u4());
                                } catch (Throwable th2) {
                                    if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                                        ((IDisposable) it2).dispose();
                                    }
                                    throw th2;
                                }
                            }
                            if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it2).dispose();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61327k4(AbstractC13943n5 abstractC13943n5) {
        this.f44183x6.m65389k4(abstractC13943n5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m61303k4(Object obj, C13020hq c13020hq) {
        if (c13020hq.m60694k4() == 0) {
            throw c13020hq.m60695x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61328k4(String str, AbstractC13912i5 abstractC13912i5, Hashtable hashtable) {
        if (abstractC13912i5 == null) {
            throw new ArgumentNullException("reader");
        }
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        if (hashtable.get_Item(str) != null) {
            if (m61322k4(new C14062gk(abstractC13912i5.mo65040ne(), 0), str, (DictionaryEntry[]) null) == null) {
                throw new XmlSchemaException("An element or attribute information item has already been validated from the '{0}' namespace. It is an error if 'xsi:schemaLocation', 'xsi:noNamespaceSchemaLocation', or an inline Schema occurs for that namespace.", str);
            }
            return;
        }
        if (m61329k4(new C14062gk(abstractC13912i5.mo65040ne(), 0), str, new C13282xc[]{null})) {
            return;
        }
        C13282xc c13282xcM61323k4 = m61323k4(str, abstractC13912i5);
        DictionaryEntry[] dictionaryEntryArr = (DictionaryEntry[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) DictionaryEntry.class), this.f44167fa.size()));
        this.f44167fa.copyTo(AbstractC14092to.m67208k4((Object) dictionaryEntryArr), 0);
        m61297k4(str, c13282xcM61323k4);
        if (c13282xcM61323k4.m61736yd().size() > 0) {
            for (int i = 0; i < c13282xcM61323k4.m61736yd().size(); i++) {
                C13282xc c13282xc = (C13282xc) c13282xcM61323k4.m61736yd().get_Item(i);
                String strM61697du = c13282xc.m61697du();
                if (strM61697du == null) {
                    strM61697du = C14113y2.f47374k4;
                }
                if (hashtable.get_Item(strM61697du) != null && m61322k4(c13282xc.m61725u4(), strM61697du, dictionaryEntryArr) == null) {
                    m61341x1(c13282xcM61323k4);
                    throw new XmlSchemaException("An element or attribute information item has already been validated from the '{0}' namespace. It is an error if 'xsi:schemaLocation', 'xsi:noNamespaceSchemaLocation', or an inline Schema occurs for that namespace.", strM61697du);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61304k4(C13005gv c13005gv, C13890ei c13890ei, AbstractC13018hl abstractC13018hl) {
        if (c13890ei.m65289x1().length() == 0) {
            return true;
        }
        AbstractC13018hl abstractC13018hlM60649kk = c13005gv.m60649kk(c13890ei);
        if (abstractC13018hlM60649kk == null) {
            c13005gv.m60647k4(c13890ei, abstractC13018hl);
            return true;
        }
        if (abstractC13018hlM60649kk == abstractC13018hl || C14113y2.m67363du(abstractC13018hlM60649kk.m60693xk(), abstractC13018hl.m60693xk())) {
            return true;
        }
        String str = C14113y2.f47374k4;
        if (C7019kk.m27469x1(abstractC13018hl, C12969en.class)) {
            str = "The complexType '{0}' has already been declared.";
        } else if (C7019kk.m27469x1(abstractC13018hl, C13164q9.class)) {
            str = "The simpleType '{0}' has already been declared.";
        } else if (C7019kk.m27469x1(abstractC13018hl, C13021hu.class)) {
            str = "The global element '{0}' has already been declared.";
        } else if (C7019kk.m27469x1(abstractC13018hl, C13146p4.class)) {
            if ("http://www.w3.org/XML/1998/namespace".equals(c13890ei.m65284k4())) {
                AbstractC13018hl abstractC13018hlM60649kk2 = C13091ly.m61144m9().m61701fa().m60649kk(c13890ei);
                if (abstractC13018hlM60649kk == abstractC13018hlM60649kk2) {
                    c13005gv.m60652x1(c13890ei, abstractC13018hl);
                    return true;
                }
                if (abstractC13018hl == abstractC13018hlM60649kk2) {
                    return true;
                }
            }
            str = "The global attribute '{0}' has already been declared.";
        }
        m61299k4(new XmlSchemaException(str, c13890ei.toString()), 0);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61329k4(C14062gk c14062gk, String str, C13282xc[] c13282xcArr) {
        c13282xcArr[0] = null;
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        if (m61330k4(c14062gk, c13282xcArr)) {
            if (this.f44166dy.containsKey(Integer.valueOf(c13282xcArr[0].m61728uz())) && (str.length() == 0 || C14113y2.m67363du(str, c13282xcArr[0].m61697du()))) {
                return true;
            }
            if (c13282xcArr[0].m61697du() == null) {
                C13282xc c13282xcM61322k4 = m61322k4(c14062gk, str, (DictionaryEntry[]) null);
                if (c13282xcM61322k4 == null || !this.f44166dy.containsKey(Integer.valueOf(c13282xcM61322k4.m61728uz()))) {
                    c13282xcArr[0] = m61297k4(str, c13282xcArr[0]);
                    return true;
                }
                c13282xcArr[0] = c13282xcM61322k4;
                return true;
            }
            if (str.length() == 0 || C14113y2.m67363du(str, c13282xcArr[0].m61697du())) {
                m61308to(c13282xcArr[0]);
                return true;
            }
            m61299k4(new XmlSchemaException("The targetNamespace parameter '{0}' should be the same value as the targetNamespace '{1}' of the Schema.", new String[]{str, c13282xcArr[0].m61697du()}), 0);
            c13282xcArr[0] = null;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61330k4(C14062gk c14062gk, C13282xc[] c13282xcArr) {
        c13282xcArr[0] = null;
        if (c14062gk != null && c14062gk.m66694u4().length() != 0) {
            C13282xc c13282xc = (C13282xc) this.f44167fa.get_Item(c14062gk);
            c13282xcArr[0] = c13282xc;
            if (c13282xc != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61331k4(C13282xc[] c13282xcArr, String str) {
        AbstractC13883dt abstractC13883dt = this.f44168h4;
        C13091ly c13091ly = new C13091ly(abstractC13883dt, m61319k4(abstractC13883dt), this.f44170jd, this.f44169ix);
        c13091ly.m61157k4(this.f44183x6.m65400to());
        c13091ly.m61156k4(this.f44183x6);
        c13091ly.m61155k4(this.f44167fa);
        c13091ly.m61159x1(this.f44179up);
        boolean zM61158k4 = c13091ly.m61158k4(c13282xcArr[0], str, true);
        c13282xcArr[0] = c13091ly.m61154h4();
        return zM61158k4;
    }
}
