package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p229ki.C5720na;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p267m6.C6324x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.qw */
/* JADX INFO: loaded from: classes4.dex */
public class C11210qw extends AbstractC11239zj {

    /* JADX INFO: renamed from: h4 */
    private List<C11176c6> f38629h4;

    /* JADX INFO: renamed from: m9 */
    private C11191ig f38630m9;

    /* JADX INFO: renamed from: to */
    private Hashtable f38631to = new Hashtable();

    /* JADX INFO: renamed from: du */
    private Hashtable f38628du = new Hashtable();

    /* JADX INFO: renamed from: k4 */
    public final C11189h4 m53885k4(C13890ei c13890ei) {
        C11189h4 c11189h4 = (C11189h4) this.f38631to.get_Item(c13890ei);
        if (c11189h4 != null) {
            return c11189h4;
        }
        throw XsltException.create("A reference to attribute set '{0}' cannot be resolved. An 'Xsl:attribute-set' of this name must be declared at the top level of the stylesheet.", c13890ei.toString());
    }

    /* JADX INFO: renamed from: kk */
    public final C6324x1 m53890kk(C13890ei c13890ei) {
        return (C6324x1) C7019kk.m27452k4(this.f38628du.get_Item(c13890ei), C6324x1.class);
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C11176c6> m53891x1() {
        return this.f38629h4;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.aspose.slides.Collections.ArrayList, org.json.JSONStringer] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Iterator, org.json.JSONStringer] */
    /* JADX INFO: renamed from: x1 */
    private void m53884x1(C11207os c11207os) throws JSONException {
        if (c11207os.m53871kk() != null) {
            Iterator it = c11207os.m53871kk().getValues().iterator();
            while (it.hasNext()) {
                try {
                    C11189h4 c11189h4 = (C11189h4) it.next();
                    ArrayList arrayList = c11189h4.f38758x1;
                    C11189h4 c11189h42 = (C11189h4) this.f38631to.get_Item(c11189h4.m53801k4());
                    if (c11189h42 == null) {
                        c11189h42 = new C11189h4();
                        c11189h42.f38536k4 = c11189h4.m53801k4();
                        c11189h42.f38758x1 = new ArrayList();
                        this.f38631to.set_Item(c11189h4.m53801k4(), c11189h42);
                    }
                    ArrayList arrayList2 = c11189h42.f38758x1;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList2.addItem(arrayList.get_Item(size));
                        }
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
        ?? EndObject = c11207os.m53874x1().endObject();
        while (EndObject.hasNext()) {
            try {
                m53884x1((C11207os) EndObject.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) EndObject, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) EndObject).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C11191ig m53886k4() {
        if (this.f38630m9 == null) {
            this.f38630m9 = new C11191ig();
        }
        return this.f38630m9;
    }

    /* JADX INFO: renamed from: k4 */
    private void m53882k4(Hashtable hashtable, ICollection iCollection) {
        Iterator it = iCollection.iterator();
        while (it.hasNext()) {
            try {
                C13890ei c13890ei = (C13890ei) it.next();
                Object obj = hashtable.get_Item(c13890ei);
                if (obj == "P") {
                    throw XsltException.create("Circular reference in the definition of attribute set '{0}'.", c13890ei.toString());
                }
                if (obj != "D") {
                    hashtable.set_Item(c13890ei, "P");
                    m53883k4(hashtable, m53885k4(c13890ei));
                    hashtable.set_Item(c13890ei, "D");
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

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m54136k4(c11212rv, false);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.aspose.slides.Collections.ArrayList, org.json.JSONStringer] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Iterator, org.json.JSONStringer] */
    /* JADX INFO: renamed from: k4 */
    private void m53883k4(Hashtable hashtable, C11232x6 c11232x6) throws JSONException {
        ?? r5 = c11232x6.f38758x1;
        if (r5 == 0) {
            return;
        }
        ?? EndObject = r5.endObject();
        while (EndObject.hasNext()) {
            try {
                AbstractC11197k4 abstractC11197k4 = (AbstractC11197k4) EndObject.next();
                if (C7019kk.m27469x1(abstractC11197k4, C11203m4.class)) {
                    m53882k4(hashtable, AbstractC14092to.m67208k4((Object) ((C11203m4) abstractC11197k4).m53856k4()));
                } else if (C7019kk.m27469x1(abstractC11197k4, C11232x6.class)) {
                    m53883k4(hashtable, (C11232x6) abstractC11197k4);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) EndObject, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) EndObject).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) EndObject, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) EndObject).dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.aspose.slides.Collections.ArrayList, org.json.JSONException] */
    /* JADX INFO: renamed from: k4 */
    public final void m53887k4(C11207os c11207os) throws JSONException {
        m53884x1(c11207os);
        Iterator it = this.f38631to.getValues().iterator();
        while (it.hasNext()) {
            try {
                ?? r1 = ((C11189h4) it.next()).f38758x1;
                if (r1 != 0) {
                    r1.printStackTrace();
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        m53882k4(new Hashtable(), this.f38631to.getKeys());
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk == 2) {
                c11231x1.m54116x1(c11234xw);
                c11234xw.m54180k4(c11231x1.m54090h4(), null, null);
                c11231x1.m54094k4(3);
                return;
            } else if (iM54107kk != 3) {
                C6005k4.m24259k4("Invalid RootAction execution state");
                return;
            } else {
                c11231x1.m54091jd();
                return;
            }
        }
        c11231x1.m54108kk(((AbstractC11239zj) this).f38791k4);
        AbstractC10925du abstractC10925duDeepClone = c11234xw.m54166dy().deepClone();
        abstractC10925duDeepClone.mo21848ix();
        c11231x1.m54096k4(new C5720na(abstractC10925duDeepClone));
        ArrayList arrayList = this.f38758x1;
        if (arrayList != null && arrayList.size() > 0) {
            c11234xw.m54184k4(c11231x1);
        }
        c11231x1.m54094k4(2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53888k4(C13890ei c13890ei, int i, int i2) {
        if (this.f38629h4 == null) {
            this.f38629h4 = new List<>();
        }
        this.f38629h4.addItem(new C11176c6(c13890ei, i, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53889k4(C13890ei c13890ei, C6324x1 c6324x1) {
        C6324x1 c6324x12 = (C6324x1) this.f38628du.get_Item(c13890ei);
        if (c6324x12 != null) {
            C11683c5 c11683c5 = c6324x12.f17989k4;
            C11683c5 c11683c52 = c6324x1.f17989k4;
            if (!C14113y2.m67363du(c11683c5.m55062ne(), c11683c52.m55062ne()) || !C14113y2.m67363du(c11683c5.m55050ix(), c11683c52.m55050ix()) || !C14113y2.m67363du(c11683c5.m55036ak(), c11683c52.m55036ak()) || !C14113y2.m67363du(c11683c5.m55064rv(), c11683c52.m55064rv()) || !C14113y2.m67363du(c11683c5.m55047fa(), c11683c52.m55047fa()) || !C14113y2.m67363du(c11683c5.m55038b3(), c11683c52.m55038b3()) || !C14113y2.m67363du(c11683c5.m55073wy(), c11683c52.m55073wy()) || c6324x12.f17990kk != c6324x1.f17990kk || c6324x12.f17992x1 != c6324x1.f17992x1 || c6324x12.f17991to != c6324x1.f17991to) {
                throw XsltException.create("Decimal format '{0}' has a duplicate declaration.", c13890ei.toString());
            }
        }
        this.f38628du.set_Item(c13890ei, c6324x1);
    }
}
