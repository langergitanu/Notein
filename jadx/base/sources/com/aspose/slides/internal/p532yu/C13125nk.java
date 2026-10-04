package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13867bz;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13984ts;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.nk */
/* JADX INFO: loaded from: classes5.dex */
public final class C13125nk extends AbstractC13183r7 implements InterfaceC13888e0, Cloneable {

    /* JADX INFO: renamed from: k4 */
    public static final C13125nk f44145k4 = new C13125nk();

    /* JADX INFO: renamed from: ar */
    private int f44146ar;

    /* JADX INFO: renamed from: bv */
    private C13021hu f44147bv;

    /* JADX INFO: renamed from: ix */
    private boolean f44148ix;

    /* JADX INFO: renamed from: ks */
    private boolean f44149ks;

    /* JADX INFO: renamed from: ne */
    private boolean f44150ne;

    /* JADX INFO: renamed from: qq */
    private C13106mq f44151qq;

    /* JADX INFO: renamed from: rv */
    private boolean f44152rv;

    /* JADX INFO: renamed from: u4 */
    private boolean f44153u4;

    /* JADX INFO: renamed from: um */
    private C13241up[] f44154um;

    /* JADX INFO: renamed from: up */
    private Dictionary<C13890ei, C13061k5> f44155up;

    /* JADX INFO: renamed from: uz */
    private Dictionary<C13890ei, C13890ei> f44156uz;

    /* JADX INFO: renamed from: wl */
    private C13192rv f44157wl;

    /* JADX INFO: renamed from: x6 */
    private boolean f44158x6;

    /* JADX INFO: renamed from: yj */
    private List<InterfaceC13867bz> f44159yj;

    public C13125nk() {
        this.f44155up = new Dictionary<>();
        this.f44152rv = false;
        this.f44158x6 = false;
        this.f44150ne = false;
        this.f44148ix = false;
        this.f44156uz = new Dictionary<>();
    }

    /* JADX INFO: renamed from: h4 */
    public static C13125nk m61252h4() {
        C13125nk c13125nk = new C13125nk();
        c13125nk.m61434k4(AbstractC13279x6.m61669k4().m60211bz());
        return c13125nk;
    }

    /* JADX INFO: renamed from: c5 */
    public final C13125nk m61253c5() {
        return (C13125nk) m61287xk();
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m61254ck() {
        return this.f44150ne;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0
    /* JADX INFO: renamed from: du */
    public final InterfaceC13984ts mo61255du() {
        Dictionary.ValueCollection.Enumerator<C13890ei, C13061k5> it = this.f44155up.getValues().iterator();
        while (it.hasNext()) {
            try {
                C13061k5 next = it.next();
                if (next.m61052x6() == 1) {
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

    /* JADX INFO: renamed from: dy */
    public final boolean m61257dy() {
        return this.f44152rv;
    }

    /* JADX INFO: renamed from: fa */
    public final int m61258fa() {
        return this.f44146ar;
    }

    /* JADX INFO: renamed from: ix */
    public final C13021hu m61260ix() {
        return this.f44147bv;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m61261jd() {
        return this.f44158x6;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13984ts mo61262k4(String str, String str2) {
        C13890ei c13890ei = new C13890ei(str2, str);
        C13061k5[] c13061k5Arr = {null};
        boolean zTryGetValue = this.f44155up.tryGetValue(c13890ei, c13061k5Arr);
        C13061k5 c13061k5 = c13061k5Arr[0];
        if (zTryGetValue) {
            return c13061k5;
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m61271kk(boolean z) {
        this.f44152rv = z;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m61273ks() {
        return this.f44148ix;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m61274m9() {
        return this.f44149ks;
    }

    /* JADX INFO: renamed from: ne */
    public final C13241up[] m61275ne() {
        return this.f44154um;
    }

    /* JADX INFO: renamed from: rv */
    public final C13192rv m61276rv() {
        return this.f44157wl;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0
    /* JADX INFO: renamed from: to */
    public final IGenericEnumerable<InterfaceC13867bz> mo61277to() {
        return this.f44159yj;
    }

    /* JADX INFO: renamed from: u4 */
    public final IGenericList<InterfaceC13867bz> m61279u4() {
        return this.f44159yj;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m61280up() {
        return this.f44153u4;
    }

    /* JADX INFO: renamed from: uz */
    public final Dictionary<C13890ei, C13061k5> m61281uz() {
        return this.f44155up;
    }

    /* JADX INFO: renamed from: wl */
    public final Dictionary<C13890ei, C13890ei> m61282wl() {
        return this.f44156uz;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13061k5 m61283x1(C13890ei c13890ei) {
        C13061k5[] c13061k5Arr = {null};
        boolean zTryGetValue = this.f44155up.tryGetValue(c13890ei, c13061k5Arr);
        C13061k5 c13061k5 = c13061k5Arr[0];
        if (zTryGetValue) {
            return c13061k5;
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public final C13106mq m61286x6() {
        return this.f44151qq;
    }

    /* JADX INFO: renamed from: xk */
    public Object m61287xk() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m61288yj() {
        return this.f44159yj != null;
    }

    public C13125nk(AbstractC12892ae abstractC12892ae) {
        this.f44155up = new Dictionary<>();
        this.f44152rv = false;
        this.f44158x6 = false;
        this.f44150ne = false;
        this.f44148ix = false;
        this.f44156uz = new Dictionary<>();
        m61434k4(abstractC12892ae);
        this.f44157wl = C13192rv.f44275x1;
    }

    /* JADX INFO: renamed from: du */
    public final void m61256du(boolean z) {
        this.f44150ne = z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m61259h4(boolean z) {
        this.f44153u4 = z;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0
    /* JADX INFO: renamed from: k4 */
    public final String mo61263k4() {
        return m61428ar();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0
    /* JADX INFO: renamed from: kk */
    public final boolean mo61272kk() {
        return this.f44152rv;
    }

    /* JADX INFO: renamed from: to */
    public final void m61278to(boolean z) {
        this.f44158x6 = z;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0
    /* JADX INFO: renamed from: x1 */
    public final String mo61284x1() {
        return m61443qq().m65289x1();
    }

    public C13125nk(C13890ei c13890ei, String str) {
        super(c13890ei, str);
        this.f44155up = new Dictionary<>();
        this.f44152rv = false;
        this.f44158x6 = false;
        this.f44150ne = false;
        this.f44148ix = false;
        this.f44156uz = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61264k4(int i) {
        this.f44146ar = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61285x1(boolean z) {
        this.f44149ks = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61265k4(Hashtable hashtable, boolean z) {
        Dictionary.ValueCollection.Enumerator<C13890ei, C13061k5> it = this.f44155up.getValues().iterator();
        while (it.hasNext()) {
            try {
                C13061k5 next = it.next();
                if (hashtable.get_Item(next.m61443qq()) == null) {
                    if (next.m61430bv() == 1) {
                        throw new XmlSchemaException("The required attribute '{0}' is missing.", next.m61443qq().toString());
                    }
                    if (z && next.m61445um() && (next.m61430bv() == 0 || next.m61430bv() == 3)) {
                        throw new XmlSchemaException("The standalone document declaration must have a value of 'no'.", C14113y2.f47374k4);
                    }
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61266k4(C13021hu c13021hu) {
        this.f44147bv = c13021hu;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61267k4(C13061k5 c13061k5) {
        this.f44155up.addItem(c13061k5.m61443qq(), c13061k5);
        if (c13061k5.m61430bv() == 1 || c13061k5.m61430bv() == 4) {
            this.f44148ix = true;
        }
        if (c13061k5.m61430bv() == 0 || c13061k5.m61430bv() == 3) {
            if (this.f44159yj == null) {
                this.f44159yj = new List<>();
            }
            this.f44159yj.addItem(c13061k5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61268k4(C13106mq c13106mq) {
        this.f44151qq = c13106mq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61269k4(C13192rv c13192rv) {
        this.f44157wl = c13192rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61270k4(C13241up[] c13241upArr) {
        this.f44154um = c13241upArr;
    }
}
