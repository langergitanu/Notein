package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.to */
/* JADX INFO: loaded from: classes4.dex */
public final class C6182to extends C6116bs {

    /* JADX INFO: renamed from: k4 */
    private int f17453k4;

    /* JADX INFO: renamed from: to */
    private SortedList<Integer, AbstractC6123ca> f17454to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.to$k4 */
    public static class k4 implements IGenericEnumerable<String> {

        /* JADX INFO: renamed from: k4 */
        private C6182to f17455k4;

        /* JADX INFO: renamed from: com.aspose.slides.internal.lm.to$k4$k4, reason: collision with other inner class name */
        public static class C19064k4 implements IGenericEnumerator<String> {

            /* JADX INFO: renamed from: k4 */
            private C6182to f17456k4;

            /* JADX INFO: renamed from: kk */
            private IGenericEnumerator<String> f17457kk;

            /* JADX INFO: renamed from: to */
            private String f17458to;

            /* JADX INFO: renamed from: x1 */
            private IGenericEnumerator<Integer> f17459x1;

            public C19064k4(C6182to c6182to) {
                this.f17456k4 = c6182to;
                this.f17459x1 = c6182to.f17454to.getKeys().iterator();
                this.f17457kk = c6182to.m25021ck().iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                String next;
                if (this.f17459x1.hasNext()) {
                    next = C14057f9.m66591x1(this.f17459x1.next().intValue());
                } else {
                    if (!this.f17457kk.hasNext()) {
                        this.f17458to = null;
                        return false;
                    }
                    next = this.f17457kk.next();
                }
                this.f17458to = next;
                return true;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final String next() {
                return this.f17458to;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                this.f17456k4.f17454to.getKeys().iterator().reset();
                this.f17456k4.m25021ck().iterator().reset();
                this.f17459x1 = this.f17456k4.f17454to.getKeys().iterator();
                this.f17457kk = this.f17456k4.m25021ck().iterator();
            }
        }

        public k4(C6182to c6182to) {
            this.f17455k4 = c6182to;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<String> iterator() {
            return new C19064k4(this.f17455k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.to$x1 */
    public static class x1 implements IGenericEnumerable<AbstractC6123ca> {

        /* JADX INFO: renamed from: k4 */
        private C6182to f17460k4;

        /* JADX INFO: renamed from: com.aspose.slides.internal.lm.to$x1$k4 */
        public static class k4 implements IGenericEnumerator<AbstractC6123ca> {

            /* JADX INFO: renamed from: k4 */
            private C6182to f17461k4;

            /* JADX INFO: renamed from: kk */
            private IGenericEnumerator<AbstractC6123ca> f17462kk;

            /* JADX INFO: renamed from: to */
            private AbstractC6123ca f17463to;

            /* JADX INFO: renamed from: x1 */
            private IGenericEnumerator<AbstractC6123ca> f17464x1;

            public k4(C6182to c6182to) {
                this.f17461k4 = c6182to;
                this.f17464x1 = c6182to.f17454to.getValues().iterator();
                this.f17462kk = c6182to.m25023jd().iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
                if (this.f17461k4 != null) {
                    this.f17461k4 = null;
                    this.f17464x1 = null;
                }
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                IGenericEnumerator<AbstractC6123ca> iGenericEnumerator;
                if (this.f17464x1.hasNext()) {
                    iGenericEnumerator = this.f17464x1;
                } else {
                    if (!this.f17462kk.hasNext()) {
                        this.f17463to = null;
                        return false;
                    }
                    iGenericEnumerator = this.f17462kk;
                }
                this.f17463to = iGenericEnumerator.next();
                return true;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final AbstractC6123ca next() {
                return this.f17463to;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                this.f17461k4.f17454to.iterator().reset();
                this.f17461k4.m25023jd().iterator().reset();
                this.f17464x1 = this.f17461k4.f17454to.getValues().iterator();
                this.f17462kk = this.f17461k4.m25023jd().iterator();
            }
        }

        public x1(C6182to c6182to) {
            this.f17460k4 = c6182to;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<AbstractC6123ca> iterator() {
            return new k4(this.f17460k4);
        }
    }

    private C6182to(SortedList<Integer, AbstractC6123ca> sortedList, int i, C6116bs c6116bs) {
        super(c6116bs);
        this.f17453k4 = 0;
        new SortedList();
        this.f17454to = sortedList;
        this.f17453k4 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ck */
    public IGenericEnumerable<String> m25021ck() {
        return super.mo25028du();
    }

    /* JADX INFO: renamed from: du */
    private int m25022du(int i) {
        int[] iArr = new int[this.f17454to.getKeys().size()];
        IGenericEnumerator<Integer> it = this.f17454to.getKeys().iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            try {
                int i4 = i3 + 1;
                iArr[i3] = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                i3 = i4;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int size = this.f17454to.size() - 1;
        int i5 = 0;
        while (i2 <= size) {
            int i6 = iArr[i5];
            if (i6 == i) {
                return i5;
            }
            if (i6 > i) {
                size = i5 - 1;
            } else {
                i2 = i5 + 1;
            }
            i5 = (i2 + size) / 2;
        }
        if (i2 < this.f17454to.size()) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public IGenericEnumerable<AbstractC6123ca> m25023jd() {
        return super.mo25029h4();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: h4 */
    public IGenericEnumerable<AbstractC6123ca> mo25029h4() {
        return new x1(this);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: kk */
    public int mo24948kk() {
        return this.f17453k4;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Array";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        List list = new List();
        IGenericEnumerator<AbstractC6123ca> it = mo25029h4().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get_Item(i) != null) {
                strArr[i] = ((AbstractC6123ca) list.get_Item(i)).toString();
            }
        }
        return C14113y2.m67403k4(",", strArr);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return mo24948kk();
    }

    public C6182to(C6116bs c6116bs) {
        super(c6116bs);
        this.f17453k4 = 0;
        this.f17454to = new SortedList<>();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: du */
    public IGenericEnumerable<String> mo25028du() {
        return new k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m25030k4(int i, AbstractC6123ca abstractC6123ca) {
        if (i >= this.f17453k4) {
            this.f17453k4 = i + 1;
        }
        this.f17454to.set_Item(Integer.valueOf(i), abstractC6123ca);
        return this.f17454to.get_Item(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: kk */
    private void m25026kk(int i) {
        int iM25022du;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("New length is out of range");
        }
        if (i < this.f17453k4 && (iM25022du = m25022du(i)) >= 0) {
            for (int size = this.f17454to.size() - 1; size >= iM25022du; size--) {
                this.f17454to.removeAt(size);
            }
        }
        this.f17453k4 = i;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo25031k4(AbstractC6123ca abstractC6123ca) {
        double dMo24775x1 = abstractC6123ca.mo24775x1();
        int iM27462to = C7019kk.m27462to(Double.valueOf(dMo24775x1), 14);
        return (((double) iM27462to) != dMo24775x1 || iM27462to < 0) ? super.mo25032k4(abstractC6123ca.toString()) : m25040x1(iM27462to);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m25040x1(int i) {
        AbstractC6123ca[] abstractC6123caArr = {null};
        boolean zTryGetValue = this.f17454to.tryGetValue(Integer.valueOf(i), abstractC6123caArr);
        AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
        return (zTryGetValue && abstractC6123ca != null) ? abstractC6123ca : C6163nh.f17403k4;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo25032k4(String str) {
        int[] iArr = {0};
        return C14057f9.m66590k4(str, iArr) ? m25040x1(iArr[0]) : super.mo25032k4(str);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: kk */
    public boolean mo25039kk(String str) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(str, iArr);
        int i = iArr[0];
        if (!zM66590k4) {
            return super.mo25039kk(str);
        }
        if (i < 0 || i >= this.f17453k4) {
            return false;
        }
        return this.f17454to.containsKey(Integer.valueOf(i));
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: x1 */
    public void mo25041x1(String str) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(str, iArr);
        int i = iArr[0];
        if (zM66590k4) {
            this.f17454to.removeItemByKey(Integer.valueOf(i));
        } else {
            super.mo25041x1(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C6141he m25033k4(InterfaceC6173qw interfaceC6173qw, AbstractC6123ca abstractC6123ca) {
        if (this.f17453k4 == 0) {
            return interfaceC6173qw.mo24980v4().m25069jd();
        }
        String string = abstractC6123ca == C6163nh.f17403k4 ? "," : abstractC6123ca.toString();
        String[] strArr = new String[this.f17453k4];
        AbstractC6123ca abstractC6123ca2 = null;
        for (int i = 0; i < this.f17453k4; i++) {
            AbstractC6123ca[] abstractC6123caArr = {abstractC6123ca2};
            boolean zTryGetValue = this.f17454to.tryGetValue(Integer.valueOf(i), abstractC6123caArr);
            abstractC6123ca2 = abstractC6123caArr[0];
            if (!zTryGetValue) {
                strArr[i] = C14113y2.f47374k4;
            } else if (abstractC6123ca2 == C6185u1.f17479k4 || abstractC6123ca2 == C6163nh.f17403k4) {
                strArr[i] = C14113y2.f47374k4;
            } else {
                strArr[i] = abstractC6123ca2.toString();
            }
        }
        return interfaceC6173qw.mo24980v4().m25068h4(C14113y2.m67403k4(string, strArr));
    }

    /* JADX INFO: renamed from: k4 */
    public final C6182to m25034k4(InterfaceC6173qw interfaceC6173qw, AbstractC6123ca[] abstractC6123caArr) {
        SortedList sortedList = new SortedList(this.f17454to);
        int iMo24948kk = this.f17453k4;
        for (AbstractC6123ca abstractC6123ca : abstractC6123caArr) {
            C6182to c6182to = (C6182to) C7019kk.m27452k4((Object) abstractC6123ca, C6182to.class);
            if (c6182to != null) {
                IGenericEnumerator<KeyValuePair<Integer, AbstractC6123ca>> it = c6182to.f17454to.iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair<Integer, AbstractC6123ca> next = it.next();
                        sortedList.addItem(Integer.valueOf(next.getKey().intValue() + iMo24948kk), next.getValue());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                iMo24948kk = c6182to.mo24948kk() + iMo24948kk;
            } else if (interfaceC6173qw.mo24983yj().m25140x1((C6116bs) C7019kk.m27452k4((Object) abstractC6123ca, C6116bs.class))) {
                C6116bs c6116bs = (C6116bs) abstractC6123ca;
                for (int i = 0; i < c6116bs.mo24948kk(); i++) {
                    AbstractC6123ca[] abstractC6123caArr2 = {null};
                    boolean zMo25038k4 = c6116bs.mo25038k4(C14057f9.m66591x1(i), abstractC6123caArr2);
                    AbstractC6123ca abstractC6123ca2 = abstractC6123caArr2[0];
                    if (zMo25038k4) {
                        sortedList.addItem(Integer.valueOf(iMo24948kk + i), abstractC6123ca2);
                    }
                }
            } else {
                sortedList.addItem(Integer.valueOf(iMo24948kk), abstractC6123ca);
                iMo24948kk++;
            }
        }
        return new C6182to(sortedList, iMo24948kk, interfaceC6173qw.mo24983yj().m25138rv());
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo24947k4(int i) {
        m25026kk(i);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo25035k4(AbstractC6123ca abstractC6123ca, AbstractC6123ca abstractC6123ca2) {
        double dMo24775x1 = abstractC6123ca.mo24775x1();
        int iM27462to = C7019kk.m27462to(Double.valueOf(dMo24775x1), 14);
        if (iM27462to != dMo24775x1 || iM27462to < 0) {
            super.mo25037k4(abstractC6123ca.toString(), abstractC6123ca2);
        } else {
            m25030k4(iM27462to, abstractC6123ca2);
        }
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo25036k4(AbstractC6155lr abstractC6155lr) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(abstractC6155lr.m24910k4(), iArr);
        int i = iArr[0];
        if (zM66590k4) {
            m25030k4(i, abstractC6155lr.mo24800k4(this));
        } else {
            super.mo25036k4(abstractC6155lr);
        }
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo25037k4(String str, AbstractC6123ca abstractC6123ca) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(str, iArr);
        int i = iArr[0];
        if (zM66590k4) {
            m25030k4(i, abstractC6123ca);
        } else {
            super.mo25037k4(str, abstractC6123ca);
        }
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        return mo24948kk() > 0;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public boolean mo25038k4(String str, AbstractC6123ca[] abstractC6123caArr) {
        C6163nh c6163nh = C6163nh.f17403k4;
        abstractC6123caArr[0] = c6163nh;
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(str, iArr);
        int i = iArr[0];
        if (zM66590k4) {
            this.f17454to.tryGetValue(Integer.valueOf(C14080ne.m66996m9(Integer.valueOf(i))), abstractC6123caArr);
        } else {
            super.mo25038k4(str, abstractC6123caArr);
        }
        return abstractC6123caArr[0] != c6163nh;
    }
}
