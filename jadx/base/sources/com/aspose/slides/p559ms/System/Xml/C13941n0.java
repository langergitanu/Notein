package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.n0 */
/* JADX INFO: loaded from: classes5.dex */
public class C13941n0 implements IEnumerable {

    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga f46651k4;

    /* JADX INFO: renamed from: x1 */
    public k4 f46652x1 = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.n0$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        private Object f46653k4;

        /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.n0$k4$k4, reason: collision with other inner class name */
        public static class C19073k4 implements IEnumerator {

            /* JADX INFO: renamed from: k4 */
            private Object f46654k4;

            /* JADX INFO: renamed from: x1 */
            private int f46655x1 = -1;

            public C19073k4(Object obj) {
                this.f46654k4 = obj;
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                if (this.f46655x1 < 0) {
                    this.f46655x1 = 0;
                    return true;
                }
                this.f46655x1 = 1;
                return false;
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final Object next() {
                if (this.f46655x1 == 0) {
                    return this.f46654k4;
                }
                throw new InvalidOperationException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                this.f46655x1 = -1;
            }
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m65637x1((k4) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m65638k4() {
            Object obj = this.f46653k4;
            if (obj == null) {
                return 0;
            }
            ArrayList arrayList = (ArrayList) C7019kk.m27452k4(obj, ArrayList.class);
            if (arrayList != null) {
                return arrayList.size();
            }
            return 1;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: x1 */
        public final IEnumerator m65644x1() {
            Object obj = this.f46653k4;
            if (obj == null) {
                return XmlDocument.EmptyEnumerator;
            }
            ArrayList arrayList = (ArrayList) C7019kk.m27452k4(obj, ArrayList.class);
            return arrayList != null ? arrayList.iterator() : new C19073k4(this.f46653k4);
        }

        /* JADX INFO: renamed from: k4 */
        public final Object m65639k4(int i) {
            Object obj = this.f46653k4;
            if (obj == null) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            ArrayList arrayList = (ArrayList) C7019kk.m27452k4(obj, ArrayList.class);
            if (arrayList != null) {
                return arrayList.get_Item(i);
            }
            if (i == 0) {
                return this.f46653k4;
            }
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m65645x1(int i) {
            Object obj = this.f46653k4;
            if (obj == null) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            ArrayList arrayList = (ArrayList) C7019kk.m27452k4(obj, ArrayList.class);
            if (arrayList != null) {
                arrayList.removeAt(i);
            } else {
                if (i != 0) {
                    throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
                }
                this.f46653k4 = null;
            }
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m65637x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f46653k4, this.f46653k4);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65640k4(int i, Object obj) {
            ArrayList arrayList;
            Object obj2 = this.f46653k4;
            if (obj2 == null) {
                if (i != 0) {
                    throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
                }
                m65642k4(obj);
                return;
            }
            ArrayList arrayList2 = (ArrayList) C7019kk.m27452k4(obj2, ArrayList.class);
            if (arrayList2 != null) {
                arrayList2.insertItem(i, obj);
                return;
            }
            if (i == 0) {
                arrayList = new ArrayList();
                arrayList.addItem(obj);
                obj = this.f46653k4;
            } else {
                if (i != 1) {
                    throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
                }
                arrayList = new ArrayList();
                arrayList.addItem(this.f46653k4);
            }
            arrayList.addItem(obj);
            this.f46653k4 = arrayList;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f46653k4 = this.f46653k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65642k4(Object obj) {
            Object obj2 = this.f46653k4;
            if (obj2 == null) {
                if (obj != null) {
                    this.f46653k4 = obj;
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addItem(null);
                this.f46653k4 = arrayList;
                return;
            }
            ArrayList arrayList2 = (ArrayList) C7019kk.m27452k4(obj2, ArrayList.class);
            if (arrayList2 != null) {
                arrayList2.addItem(obj);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addItem(this.f46653k4);
            arrayList3.addItem(obj);
            this.f46653k4 = arrayList3;
        }
    }

    public C13941n0(AbstractC13901ga abstractC13901ga) {
        this.f46651k4 = abstractC13901ga;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return this.f46652x1.m65644x1();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo65162k4(int i, AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901gaM65623h4 = abstractC13901ga.getNodeType() == 2 ? ((C13940my) abstractC13901ga).m65623h4() : abstractC13901ga.getParentNode();
        String value = abstractC13901ga.getValue();
        AbstractC13901ga abstractC13901ga2 = this.f46651k4;
        C13979sz eventArgs = abstractC13901ga2.getEventArgs(abstractC13901ga, abstractC13901gaM65623h4, abstractC13901ga2, value, value, 0);
        if (eventArgs != null) {
            this.f46651k4.beforeEvent(eventArgs);
        }
        this.f46652x1.m65640k4(i, abstractC13901ga);
        abstractC13901ga.setParent(this.f46651k4);
        if (eventArgs != null) {
            this.f46651k4.afterEvent(eventArgs);
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: kk */
    public final int m65631kk(String str) {
        int iM65634x1 = m65634x1();
        for (int i = 0; i < iM65634x1; i++) {
            if (C14113y2.m67363du(str, ((AbstractC13901ga) this.f46652x1.m65639k4(i)).getName())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: to */
    public final int m65632to(String str, String str2) {
        int iM65634x1 = m65634x1();
        for (int i = 0; i < iM65634x1; i++) {
            AbstractC13901ga abstractC13901ga = (AbstractC13901ga) this.f46652x1.m65639k4(i);
            if (C14113y2.m67363du(abstractC13901ga.getLocalName(), str) && C14113y2.m67363du(abstractC13901ga.getNamespaceURI(), str2)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m65634x1() {
        return this.f46652x1.m65638k4();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo65163k4(AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga == null) {
            return null;
        }
        int iM65632to = m65632to(abstractC13901ga.getLocalName(), abstractC13901ga.getNamespaceURI());
        if (iM65632to != -1) {
            return m65635x1(iM65632to, abstractC13901ga);
        }
        mo65173x1(abstractC13901ga);
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC13901ga mo65168kk(int i) {
        AbstractC13901ga abstractC13901ga = (AbstractC13901ga) this.f46652x1.m65639k4(i);
        String value = abstractC13901ga.getValue();
        AbstractC13901ga abstractC13901ga2 = this.f46651k4;
        C13979sz eventArgs = abstractC13901ga2.getEventArgs(abstractC13901ga, abstractC13901ga2, null, value, value, 1);
        if (eventArgs != null) {
            this.f46651k4.beforeEvent(eventArgs);
        }
        this.f46652x1.m65645x1(i);
        abstractC13901ga.setParent(null);
        if (eventArgs != null) {
            this.f46651k4.afterEvent(eventArgs);
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC13901ga m65633to(int i) {
        if (i < 0 || i >= this.f46652x1.m65638k4()) {
            return null;
        }
        try {
            return (AbstractC13901ga) this.f46652x1.m65639k4(i);
        } catch (ArgumentOutOfRangeException unused) {
            throw new IndexOutOfRangeException(C13968ri.m65818k4("The index being passed in is out of range."));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC13901ga m65635x1(int i, AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901gaMo65168kk = mo65168kk(i);
        mo65162k4(i, abstractC13901ga);
        return abstractC13901gaMo65168kk;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga m65630k4(AbstractC13901ga abstractC13901ga, XmlDocument xmlDocument) {
        C13979sz insertEventArgsForLoad = xmlDocument.getInsertEventArgsForLoad(abstractC13901ga, this.f46651k4);
        if (insertEventArgsForLoad != null) {
            xmlDocument.beforeEvent(insertEventArgsForLoad);
        }
        this.f46652x1.m65642k4(abstractC13901ga);
        abstractC13901ga.setParent(this.f46651k4);
        if (insertEventArgsForLoad != null) {
            xmlDocument.afterEvent(insertEventArgsForLoad);
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC13901ga mo65173x1(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901gaM65623h4 = abstractC13901ga.getNodeType() == 2 ? ((C13940my) abstractC13901ga).m65623h4() : abstractC13901ga.getParentNode();
        String value = abstractC13901ga.getValue();
        AbstractC13901ga abstractC13901ga2 = this.f46651k4;
        C13979sz eventArgs = abstractC13901ga2.getEventArgs(abstractC13901ga, abstractC13901gaM65623h4, abstractC13901ga2, value, value, 0);
        if (eventArgs != null) {
            this.f46651k4.beforeEvent(eventArgs);
        }
        this.f46652x1.m65642k4(abstractC13901ga);
        abstractC13901ga.setParent(this.f46651k4);
        if (eventArgs != null) {
            this.f46651k4.afterEvent(eventArgs);
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC13901ga m65636x1(String str) {
        int iM65631kk = m65631kk(str);
        if (iM65631kk >= 0) {
            return (AbstractC13901ga) this.f46652x1.m65639k4(iM65631kk);
        }
        return null;
    }
}
