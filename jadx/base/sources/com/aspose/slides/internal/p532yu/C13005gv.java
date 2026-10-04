package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13968ri;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.gv */
/* JADX INFO: loaded from: classes5.dex */
public class C13005gv {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<C13890ei, AbstractC13018hl> f43693k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private List<kk> f43694x1 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.gv$k4 */
    public static class k4 implements ICollection {

        /* JADX INFO: renamed from: k4 */
        private List<kk> f43695k4;

        /* JADX INFO: renamed from: x1 */
        private int f43696x1;

        public k4(List<kk> list, int i) {
            this.f43695k4 = list;
            this.f43696x1 = i;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public final void copyTo(AbstractC14092to abstractC14092to, int i) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException("arrayIndex");
            }
            int i2 = 0;
            while (i2 < this.f43696x1) {
                abstractC14092to.m67276kk(this.f43695k4.get_Item(i2).f43698x1, i);
                i2++;
                i++;
            }
        }

        @Override // com.aspose.slides.Collections.ICollection
        public final Object getSyncRoot() {
            return this.f43695k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ICollection
        public final boolean isSynchronized() {
            return this.f43695k4.isSynchronized();
        }

        @Override // java.lang.Iterable
        public final IEnumerator iterator() {
            return new x1(this.f43695k4, this.f43696x1, 1);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public final int size() {
            return this.f43696x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.gv$kk */
    public static class kk extends AbstractC7020m9<kk> {

        /* JADX INFO: renamed from: k4 */
        public C13890ei f43697k4;

        /* JADX INFO: renamed from: x1 */
        public AbstractC13018hl f43698x1;

        public kk() {
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m60654x1(kk kkVar) {
            return C14067j2.m66728k4(kkVar.f43697k4, this.f43697k4) && C14067j2.m66728k4(kkVar.f43698x1, this.f43698x1);
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
            if (obj instanceof kk) {
                return m60654x1((kk) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public kk Clone() {
            kk kkVar = new kk();
            CloneTo(kkVar);
            return kkVar;
        }

        public kk(C13890ei c13890ei, AbstractC13018hl abstractC13018hl) {
            this.f43697k4 = c13890ei;
            this.f43698x1 = abstractC13018hl;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(kk kkVar) {
            if (kkVar == null) {
                kkVar = new kk();
            }
            kkVar.f43697k4 = this.f43697k4;
            kkVar.f43698x1 = this.f43698x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.gv$x1 */
    public static class x1 implements IEnumerator {

        /* JADX INFO: renamed from: du */
        private List<kk> f43699du;

        /* JADX INFO: renamed from: h4 */
        private int f43700h4;

        /* JADX INFO: renamed from: k4 */
        protected int f43701k4 = -1;

        /* JADX INFO: renamed from: kk */
        protected C13890ei f43702kk;

        /* JADX INFO: renamed from: to */
        protected AbstractC13018hl f43703to;

        /* JADX INFO: renamed from: x1 */
        protected int f43704x1;

        public x1(List<kk> list, int i, int i2) {
            this.f43699du = list;
            this.f43704x1 = i;
            this.f43700h4 = i2;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            int i = this.f43701k4;
            if (i >= this.f43704x1 - 1) {
                this.f43703to = null;
                this.f43702kk = null;
                return false;
            }
            int i2 = i + 1;
            this.f43701k4 = i2;
            this.f43703to = this.f43699du.get_Item(i2).f43698x1;
            this.f43702kk = this.f43699du.get_Item(this.f43701k4).f43697k4;
            return true;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final Object next() {
            int i = this.f43701k4;
            if (i == -1) {
                throw new InvalidOperationException(C13968ri.m65819k4("Enumeration has not started. Call MoveNext.", C14113y2.f47374k4));
            }
            if (i >= this.f43704x1) {
                throw new InvalidOperationException(C13968ri.m65819k4("Enumeration has already finished.", C14113y2.f47374k4));
            }
            int i2 = this.f43700h4;
            if (i2 == 0) {
                return this.f43702kk;
            }
            if (i2 == 1) {
                return this.f43703to;
            }
            if (i2 != 2) {
                return null;
            }
            return new DictionaryEntry(this.f43702kk, this.f43703to);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f43701k4 = -1;
            this.f43703to = null;
            this.f43702kk = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m60644k4(AbstractC13018hl abstractC13018hl) {
        for (int i = 0; i < this.f43694x1.size(); i++) {
            if (this.f43694x1.get_Item(i).f43698x1 == abstractC13018hl) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public final ICollection m60648kk() {
        return new k4(this.f43694x1, this.f43693k4.size());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m60651x1() {
        return this.f43693k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60645k4() {
        this.f43693k4.clear();
        this.f43694x1.clear();
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13018hl m60649kk(C13890ei c13890ei) {
        AbstractC13018hl[] abstractC13018hlArr = {null};
        boolean zTryGetValue = this.f43693k4.tryGetValue(c13890ei, abstractC13018hlArr);
        AbstractC13018hl abstractC13018hl = abstractC13018hlArr[0];
        if (zTryGetValue) {
            return abstractC13018hl;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60652x1(C13890ei c13890ei, AbstractC13018hl abstractC13018hl) {
        AbstractC13018hl[] abstractC13018hlArr = {null};
        boolean zTryGetValue = this.f43693k4.tryGetValue(c13890ei, abstractC13018hlArr);
        AbstractC13018hl abstractC13018hl2 = abstractC13018hlArr[0];
        if (!zTryGetValue) {
            m60647k4(c13890ei, abstractC13018hl);
            return;
        }
        this.f43693k4.set_Item(c13890ei, abstractC13018hl);
        this.f43694x1.set_Item(m60644k4(abstractC13018hl2), new kk(c13890ei, abstractC13018hl));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60646k4(C13890ei c13890ei) {
        AbstractC13018hl[] abstractC13018hlArr = {null};
        boolean zTryGetValue = this.f43693k4.tryGetValue(c13890ei, abstractC13018hlArr);
        AbstractC13018hl abstractC13018hl = abstractC13018hlArr[0];
        if (zTryGetValue) {
            this.f43693k4.removeItemByKey(c13890ei);
            this.f43694x1.removeAt(m60644k4(abstractC13018hl));
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m60650kk(C13890ei c13890ei, AbstractC13018hl abstractC13018hl) {
        AbstractC13018hl[] abstractC13018hlArr = {null};
        boolean zTryGetValue = this.f43693k4.tryGetValue(c13890ei, abstractC13018hlArr);
        AbstractC13018hl abstractC13018hl2 = abstractC13018hlArr[0];
        if (zTryGetValue) {
            this.f43693k4.set_Item(c13890ei, abstractC13018hl);
            this.f43694x1.set_Item(m60644k4(abstractC13018hl2), new kk(c13890ei, abstractC13018hl));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m60653x1(C13890ei c13890ei) {
        return this.f43693k4.containsKey(c13890ei);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60647k4(C13890ei c13890ei, AbstractC13018hl abstractC13018hl) {
        this.f43693k4.addItem(c13890ei, abstractC13018hl);
        this.f43694x1.addItem(new kk(c13890ei, abstractC13018hl));
    }
}
