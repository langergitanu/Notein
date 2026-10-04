package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13960qm;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.zd */
/* JADX INFO: loaded from: classes5.dex */
public class C13322zd implements InterfaceC13899g8 {

    /* JADX INFO: renamed from: ck */
    private int f44630ck;

    /* JADX INFO: renamed from: kk */
    private Dictionary<C13890ei, C13116n3> f44637kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<C13890ei, C13116n3> f44639to;

    /* JADX INFO: renamed from: yj */
    private Dictionary<String, C13226tw> f44642yj;

    /* JADX INFO: renamed from: k4 */
    private Dictionary<C13890ei, C13125nk> f44636k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<C13890ei, C13125nk> f44641x1 = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private C13890ei f44631du = C13890ei.f46456k4;

    /* JADX INFO: renamed from: h4 */
    private String f44634h4 = C14113y2.f47374k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f44638m9 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f44632dy = false;

    /* JADX INFO: renamed from: c5 */
    private Dictionary<String, Boolean> f44629c5 = new Dictionary<>();

    /* JADX INFO: renamed from: jd */
    private Dictionary<C13890ei, C13061k5> f44635jd = new Dictionary<>();

    /* JADX INFO: renamed from: up */
    private Dictionary<C13890ei, C13125nk> f44640up = new Dictionary<>();

    /* JADX INFO: renamed from: fa */
    private int f44633fa = 0;

    /* JADX INFO: renamed from: c5 */
    public final Dictionary<C13890ei, C13116n3> m61868c5() {
        if (this.f44637kk == null) {
            this.f44637kk = new Dictionary<>();
        }
        return this.f44637kk;
    }

    /* JADX INFO: renamed from: ck */
    public final int m61869ck() {
        return this.f44633fa;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: du */
    public final IGenericEnumerable<InterfaceC13888e0> mo61870du() {
        List list = new List();
        Dictionary.ValueCollection.Enumerator<C13890ei, C13125nk> it = this.f44636k4.getValues().iterator();
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

    /* JADX INFO: renamed from: dy */
    public final Dictionary<C13890ei, C13125nk> m61871dy() {
        return this.f44641x1;
    }

    /* JADX INFO: renamed from: fa */
    public final Dictionary<String, Boolean> m61872fa() {
        return this.f44629c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final C13890ei m61873h4() {
        return this.f44631du;
    }

    /* JADX INFO: renamed from: jd */
    public final Dictionary<C13890ei, C13116n3> m61874jd() {
        if (this.f44639to == null) {
            this.f44639to = new Dictionary<>();
        }
        return this.f44639to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13061k5 m61875k4(C13125nk c13125nk, C13890ei c13890ei) {
        if (c13125nk == null) {
            return null;
        }
        C13061k5 c13061k5M61283x1 = c13125nk.m61283x1(c13890ei);
        if (c13061k5M61283x1 != null) {
            return c13061k5M61283x1;
        }
        if (!c13125nk.m61276rv().m61459to() || c13890ei.m65284k4().length() == 0) {
            throw new XmlSchemaException("The '{0}' attribute is not declared.", c13890ei.toString());
        }
        C13061k5[] c13061k5Arr = {c13061k5M61283x1};
        boolean z = !this.f44635jd.tryGetValue(c13890ei, c13061k5Arr) && this.f44629c5.containsKey(c13890ei.m65284k4());
        C13061k5 c13061k5 = c13061k5Arr[0];
        if (z) {
            throw new XmlSchemaException("The '{0}' attribute is not declared.", c13890ei.toString());
        }
        return c13061k5;
    }

    /* JADX INFO: renamed from: kk */
    public final C13125nk m61884kk(C13890ei c13890ei) {
        C13125nk[] c13125nkArr = {null};
        boolean zTryGetValue = this.f44640up.tryGetValue(c13890ei, c13125nkArr);
        C13125nk c13125nk = c13125nkArr[0];
        if (zTryGetValue) {
            return c13125nk;
        }
        return null;
    }

    /* JADX INFO: renamed from: ks */
    public final Dictionary<String, C13226tw> m61887ks() {
        if (this.f44642yj == null) {
            this.f44642yj = new Dictionary<>();
        }
        return this.f44642yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final Dictionary<C13890ei, C13125nk> m61888m9() {
        return this.f44636k4;
    }

    /* JADX INFO: renamed from: rv */
    public final int m61889rv() {
        return this.f44630ck;
    }

    /* JADX INFO: renamed from: to */
    public final C13021hu m61890to(C13890ei c13890ei) {
        C13125nk c13125nkM61894x1 = m61894x1(c13890ei);
        if (c13125nkM61894x1 != null) {
            return c13125nkM61894x1.m61260ix();
        }
        return null;
    }

    /* JADX INFO: renamed from: up */
    public final Dictionary<C13890ei, C13125nk> m61893up() {
        return this.f44640up;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13125nk m61894x1(C13890ei c13890ei) {
        C13125nk[] c13125nkArr = {null};
        boolean zTryGetValue = this.f44636k4.tryGetValue(c13890ei, c13125nkArr);
        C13125nk c13125nk = c13125nkArr[0];
        if (zTryGetValue) {
            return c13125nk;
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m61898x6() {
        Dictionary<C13890ei, C13125nk> dictionary = this.f44636k4;
        for (int i = 0; i < 2; i++) {
            Dictionary.ValueCollection.Enumerator<C13890ei, C13125nk> it = dictionary.getValues().iterator();
            while (it.hasNext()) {
                try {
                    C13125nk next = it.next();
                    if (next.m61257dy()) {
                        this.f44638m9 = true;
                    }
                    if (next.m61279u4() != null) {
                        this.f44632dy = true;
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
            dictionary = this.f44641x1;
        }
    }

    /* JADX INFO: renamed from: yj */
    public final Dictionary<C13890ei, C13061k5> m61899yj() {
        return this.f44635jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13061k5 m61876k4(C13125nk c13125nk, C13890ei c13890ei, AbstractC13018hl abstractC13018hl, int[] iArr) {
        iArr[0] = 3;
        if (c13125nk == null) {
            if (abstractC13018hl == null) {
                C13061k5[] c13061k5Arr = {null};
                boolean zTryGetValue = this.f44635jd.tryGetValue(c13890ei, c13061k5Arr);
                C13061k5 c13061k5 = c13061k5Arr[0];
                if (zTryGetValue) {
                    iArr[0] = 0;
                    return c13061k5;
                }
                iArr[0] = 2;
                return c13061k5;
            }
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) abstractC13018hl, C13146p4.class);
            if (c13146p4 == null) {
                iArr[0] = 9;
                return null;
            }
            if (!c13890ei.equals(c13146p4.m61359fa())) {
                iArr[0] = 8;
                return null;
            }
            C13061k5 c13061k5M61369ks = c13146p4.m61369ks();
            iArr[0] = 0;
            return c13061k5M61369ks;
        }
        C13061k5 c13061k5M61283x1 = c13125nk.m61283x1(c13890ei);
        if (c13061k5M61283x1 != null) {
            iArr[0] = 0;
            return c13061k5M61283x1;
        }
        C13106mq c13106mqM61286x6 = c13125nk.m61286x6();
        if (c13106mqM61286x6 == null) {
            if (c13125nk.m61282wl().containsKey(c13890ei)) {
                iArr[0] = 7;
            }
            return c13061k5M61283x1;
        }
        if (!c13106mqM61286x6.m61190x1().m61107k4(c13890ei)) {
            iArr[0] = 6;
            return c13061k5M61283x1;
        }
        if (c13106mqM61286x6.m61185h4() == 1) {
            iArr[0] = 5;
            return c13061k5M61283x1;
        }
        C13061k5[] c13061k5Arr2 = {c13061k5M61283x1};
        boolean zTryGetValue2 = this.f44635jd.tryGetValue(c13890ei, c13061k5Arr2);
        C13061k5 c13061k52 = c13061k5Arr2[0];
        if (!zTryGetValue2) {
            if (c13106mqM61286x6.m61185h4() == 2) {
                iArr[0] = 4;
            }
            return c13061k52;
        }
        if (c13061k52.m61429b3().mo60020fa() == 37) {
            iArr[0] = 1;
            return c13061k52;
        }
        iArr[0] = 0;
        return c13061k52;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: kk */
    public final boolean mo61885kk() {
        return this.f44632dy;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: to */
    public final boolean mo61891to() {
        return this.f44638m9;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: x1 */
    public final String mo61895x1() {
        return this.f44634h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13061k5 m61877k4(C13125nk c13125nk, C13890ei c13890ei, boolean[] zArr) {
        int[] iArr = {0};
        C13061k5 c13061k5M61876k4 = m61876k4(c13125nk, c13890ei, null, iArr);
        int i = iArr[0];
        if (i == 3) {
            throw new XmlSchemaException("The '{0}' attribute is not declared.", c13890ei.toString());
        }
        if (i == 5) {
            zArr[0] = true;
            return c13061k5M61876k4;
        }
        if (i == 6 || i == 7) {
            throw new XmlSchemaException("The '{0}' attribute is not allowed.", c13890ei.toString());
        }
        return c13061k5M61876k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61886kk(String str) {
        return this.f44629c5.containsKey(str);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m61892to(String str) {
        return this.f44629c5.containsKey(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61896x1(int i) {
        this.f44630ck = i;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13888e0 mo61878k4(String str, String str2) {
        C13890ei c13890ei = new C13890ei(str, str2);
        C13125nk[] c13125nkArr = {null};
        boolean zTryGetValue = this.f44636k4.tryGetValue(c13890ei, c13125nkArr);
        C13125nk c13125nk = c13125nkArr[0];
        if (zTryGetValue) {
            return c13125nk;
        }
        c13125nkArr[0] = c13125nk;
        this.f44641x1.tryGetValue(c13890ei, c13125nkArr);
        return c13125nkArr[0];
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61897x1(String str) {
        this.f44634h4 = str;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: k4 */
    public final C13890ei mo61879k4() {
        return this.f44631du;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13960qm mo61880k4(String str) {
        if (this.f44637kk == null) {
            return null;
        }
        C13890ei c13890ei = new C13890ei(str);
        C13116n3[] c13116n3Arr = {null};
        boolean zTryGetValue = this.f44637kk.tryGetValue(c13890ei, c13116n3Arr);
        C13116n3 c13116n3 = c13116n3Arr[0];
        if (zTryGetValue) {
            return c13116n3;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61881k4(int i) {
        this.f44633fa = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61882k4(C13322zd c13322zd, AbstractC13319z7 abstractC13319z7) {
        int i = this.f44633fa;
        if (i == 0) {
            this.f44633fa = c13322zd.m61869ck();
        } else if (i != c13322zd.m61869ck()) {
            if (abstractC13319z7 != null) {
                abstractC13319z7.mo12838k4(this, new C13020hq(new XmlSchemaException("Different Schema types cannot be mixed.", C14113y2.f47374k4)));
                return;
            }
            return;
        }
        Dictionary.KeyCollection.Enumerator<String, Boolean> it = c13322zd.m61872fa().getKeys().iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                if (!this.f44629c5.containsKey(next)) {
                    this.f44629c5.addItem(next, Boolean.TRUE);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        Dictionary.Enumerator<C13890ei, C13125nk> it2 = c13322zd.f44636k4.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next2 = it2.next();
                if (!this.f44636k4.containsKey((C13890ei) next2.getKey())) {
                    this.f44636k4.addItem((C13890ei) next2.getKey(), (C13125nk) next2.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        Dictionary.Enumerator<C13890ei, C13125nk> it3 = c13322zd.f44640up.iterator();
        while (it3.hasNext()) {
            try {
                KeyValuePair next3 = it3.next();
                if (!this.f44640up.containsKey((C13890ei) next3.getKey())) {
                    this.f44640up.addItem((C13890ei) next3.getKey(), (C13125nk) next3.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        Dictionary.ValueCollection.Enumerator<C13890ei, C13061k5> it4 = c13322zd.m61899yj().getValues().iterator();
        while (it4.hasNext()) {
            try {
                C13061k5 next4 = it4.next();
                if (!this.f44635jd.containsKey(next4.m61443qq())) {
                    this.f44635jd.addItem(next4.m61443qq(), next4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        Dictionary.ValueCollection.Enumerator<String, C13226tw> it5 = c13322zd.m61887ks().getValues().iterator();
        while (it5.hasNext()) {
            try {
                C13226tw next5 = it5.next();
                if (!m61887ks().containsKey(next5.m61623k4().m65289x1())) {
                    m61887ks().addItem(next5.m61623k4().m65289x1(), next5);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61883k4(C13890ei c13890ei) {
        this.f44631du = c13890ei;
    }
}
