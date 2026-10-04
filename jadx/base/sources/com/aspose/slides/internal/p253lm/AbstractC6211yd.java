package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.yd */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6211yd extends AbstractC6123ca implements IGenericEnumerable<KeyValuePair<String, AbstractC6123ca>> {

    /* JADX INFO: renamed from: h4 */
    private AbstractC6211yd f17554h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f17555k4;

    /* JADX INFO: renamed from: to */
    private boolean f17556to;

    /* JADX INFO: renamed from: du */
    private int f17553du = 0;

    /* JADX INFO: renamed from: x1 */
    public InterfaceC6196w6 f17557x1 = new C6161na();

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.yd$k4 */
    public static class k4 implements IGenericEnumerator<KeyValuePair<String, AbstractC6123ca>> {

        /* JADX INFO: renamed from: k4 */
        private AbstractC6211yd f17558k4;

        /* JADX INFO: renamed from: kk */
        private KeyValuePair<String, AbstractC6123ca> f17559kk = new KeyValuePair<>();

        /* JADX INFO: renamed from: x1 */
        private IGenericEnumerator<KeyValuePair<String, AbstractC6155lr>> f17560x1;

        public k4(AbstractC6211yd abstractC6211yd) {
            this.f17558k4 = abstractC6211yd;
            this.f17560x1 = abstractC6211yd.f17557x1.iterator();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            KeyValuePair keyValuePair = new KeyValuePair();
            while (this.f17560x1.hasNext()) {
                this.f17560x1.next().CloneTo(keyValuePair);
                if (((AbstractC6155lr) keyValuePair.getValue()).m24916x1()) {
                    this.f17559kk = new KeyValuePair<>(keyValuePair.getKey(), ((AbstractC6155lr) keyValuePair.getValue()).mo24800k4(this.f17558k4));
                    return true;
                }
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final KeyValuePair<String, AbstractC6123ca> next() {
            return this.f17559kk;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f17560x1.reset();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.yd$kk */
    public static class kk implements IGenericEnumerable<AbstractC6123ca> {

        /* JADX INFO: renamed from: k4 */
        private AbstractC6211yd f17561k4;

        /* JADX INFO: renamed from: com.aspose.slides.internal.lm.yd$kk$k4 */
        public static class k4 implements IGenericEnumerator<AbstractC6123ca> {

            /* JADX INFO: renamed from: k4 */
            private AbstractC6211yd f17562k4;

            /* JADX INFO: renamed from: kk */
            private AbstractC6123ca f17563kk;

            /* JADX INFO: renamed from: x1 */
            private IGenericEnumerator<AbstractC6155lr> f17564x1;

            public k4(AbstractC6211yd abstractC6211yd) {
                this.f17562k4 = abstractC6211yd;
                this.f17564x1 = abstractC6211yd.f17557x1.mo24763k4().iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                while (this.f17564x1.hasNext()) {
                    AbstractC6155lr next = this.f17564x1.next();
                    if (next.m24916x1()) {
                        this.f17563kk = next.mo24800k4(this.f17562k4);
                        return true;
                    }
                }
                return false;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final AbstractC6123ca next() {
                return this.f17563kk;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                this.f17564x1.reset();
            }
        }

        public kk(AbstractC6211yd abstractC6211yd) {
            this.f17561k4 = abstractC6211yd;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<AbstractC6123ca> iterator() {
            return new k4(this.f17561k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.yd$x1 */
    public static class x1 implements IGenericEnumerable<String> {

        /* JADX INFO: renamed from: k4 */
        private AbstractC6211yd f17565k4;

        /* JADX INFO: renamed from: com.aspose.slides.internal.lm.yd$x1$k4 */
        public static class k4 implements IGenericEnumerator<String> {

            /* JADX INFO: renamed from: du */
            private String f17566du;

            /* JADX INFO: renamed from: h4 */
            private boolean f17567h4;

            /* JADX INFO: renamed from: k4 */
            private AbstractC6211yd f17568k4;

            /* JADX INFO: renamed from: kk */
            private IGenericEnumerator<String> f17569kk;

            /* JADX INFO: renamed from: to */
            private AbstractC6211yd f17570to;

            /* JADX INFO: renamed from: x1 */
            private IGenericEnumerator<KeyValuePair<String, AbstractC6155lr>> f17571x1;

            public k4(AbstractC6211yd abstractC6211yd) {
                this.f17568k4 = abstractC6211yd;
                AbstractC6211yd abstractC6211ydM25171jd = abstractC6211yd.m25171jd();
                this.f17570to = abstractC6211ydM25171jd;
                if (abstractC6211ydM25171jd == C6163nh.f17403k4 || abstractC6211ydM25171jd == C6185u1.f17479k4 || abstractC6211ydM25171jd == null) {
                    this.f17571x1 = abstractC6211yd.f17557x1.iterator();
                } else {
                    this.f17569kk = abstractC6211ydM25171jd.mo25028du().iterator();
                }
                this.f17567h4 = false;
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                AbstractC6211yd abstractC6211yd = this.f17570to;
                if (abstractC6211yd != C6163nh.f17403k4 && abstractC6211yd != C6185u1.f17479k4 && abstractC6211yd != null && !this.f17567h4) {
                    while (this.f17569kk.hasNext()) {
                        String next = this.f17569kk.next();
                        if (!this.f17568k4.mo25039kk(next)) {
                            this.f17566du = next;
                            return true;
                        }
                    }
                    this.f17567h4 = true;
                    this.f17571x1 = this.f17568k4.f17557x1.iterator();
                }
                while (this.f17571x1.hasNext()) {
                    KeyValuePair keyValuePairClone = this.f17571x1.next().Clone();
                    if (((AbstractC6155lr) keyValuePairClone.getValue()).m24916x1() && ((AbstractC6155lr) keyValuePairClone.getValue()).m24908du() == this.f17568k4) {
                        this.f17566du = (String) keyValuePairClone.getKey();
                        return true;
                    }
                }
                return false;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final String next() {
                return this.f17566du;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                AbstractC6211yd abstractC6211yd = this.f17570to;
                if (abstractC6211yd == C6163nh.f17403k4 || abstractC6211yd == C6185u1.f17479k4 || abstractC6211yd == null) {
                    this.f17571x1 = this.f17568k4.f17557x1.iterator();
                } else {
                    IGenericEnumerator<String> it = abstractC6211yd.mo25028du().iterator();
                    this.f17569kk = it;
                    it.reset();
                    this.f17567h4 = false;
                }
                this.f17568k4.f17557x1.iterator().reset();
            }
        }

        public x1(AbstractC6211yd abstractC6211yd) {
            this.f17565k4 = abstractC6211yd;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<String> iterator() {
            return new k4(this.f17565k4);
        }
    }

    public AbstractC6211yd() {
        m25181x1(true);
        m25172kk((AbstractC6211yd) C6185u1.f17479k4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public AbstractC6211yd m25171jd() {
        return this.f17554h4;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return null;
    }

    /* JADX INFO: renamed from: du */
    public IGenericEnumerable<String> mo25028du() {
        return new x1(this);
    }

    /* JADX INFO: renamed from: h4 */
    public IGenericEnumerable<AbstractC6123ca> mo25029h4() {
        return new kk(this);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, AbstractC6123ca>> iterator() {
        return new k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo25031k4(AbstractC6123ca abstractC6123ca) {
        return mo25032k4(abstractC6123ca.toString());
    }

    /* JADX INFO: renamed from: kk */
    public int mo24948kk() {
        return this.f17553du;
    }

    /* JADX INFO: renamed from: ss */
    public AbstractC6123ca m25178ss(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length <= 0) {
            throw new ArgumentException("propertyName");
        }
        if (!abstractC6211yd.mo25039kk(abstractC6123caArr[0].toString())) {
            return m25178ss(abstractC6211yd.m25171jd(), abstractC6123caArr);
        }
        C6126dc c6126dc = (C6126dc) C7019kk.m27452k4((Object) abstractC6211yd.f17557x1.mo24767x1(abstractC6123caArr[0].toString()), C6126dc.class);
        if (c6126dc != null && c6126dc.m24798fa() != null) {
            return c6126dc.m24798fa();
        }
        return C6163nh.f17403k4;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo25066to(String str) {
        AbstractC6211yd abstractC6211ydM25171jd = this;
        while (!abstractC6211ydM25171jd.mo25039kk(str)) {
            abstractC6211ydM25171jd = abstractC6211ydM25171jd.m25171jd();
            if (abstractC6211ydM25171jd == C6163nh.f17403k4 || abstractC6211ydM25171jd == C6185u1.f17479k4) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: wp */
    public AbstractC6123ca m25179wp(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length <= 0) {
            throw new ArgumentException("propertyName");
        }
        if (!abstractC6211yd.mo25039kk(abstractC6123caArr[0].toString())) {
            return m25179wp(abstractC6211yd.m25171jd(), abstractC6123caArr);
        }
        C6126dc c6126dc = (C6126dc) C7019kk.m27452k4((Object) abstractC6211yd.f17557x1.mo24767x1(abstractC6123caArr[0].toString()), C6126dc.class);
        if (c6126dc != null && c6126dc.m24797ck() != null) {
            return c6126dc.m24797ck();
        }
        return C6163nh.f17403k4;
    }

    public AbstractC6211yd(AbstractC6211yd abstractC6211yd) {
        m25172kk(abstractC6211yd);
        m25181x1(true);
        abstractC6211yd.f17556to = true;
    }

    /* JADX INFO: renamed from: h4 */
    private void m25170h4(String str) {
        AbstractC6155lr[] abstractC6155lrArr = {null};
        boolean z = this.f17557x1.mo24766k4(str, abstractC6155lrArr) && abstractC6155lrArr[0].m24908du() == this;
        AbstractC6155lr abstractC6155lr = abstractC6155lrArr[0];
        if (z) {
            this.f17557x1.mo24764k4(str, abstractC6155lr.mo24796c5());
            abstractC6155lr.m24909dy();
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m25172kk(AbstractC6211yd abstractC6211yd) {
        this.f17554h4 = abstractC6211yd;
    }

    /* JADX INFO: renamed from: du */
    public AbstractC6155lr mo24946du(String str) {
        AbstractC6155lr[] abstractC6155lrArr = {null};
        boolean zMo24766k4 = this.f17557x1.mo24766k4(str, abstractC6155lrArr);
        AbstractC6155lr abstractC6155lr = abstractC6155lrArr[0];
        if (zMo24766k4) {
            if (!abstractC6155lr.mo24859h4()) {
                return abstractC6155lr;
            }
            this.f17557x1.mo24765k4(str);
        }
        AbstractC6155lr abstractC6155lrMo24946du = m25171jd().mo24946du(str);
        if (abstractC6155lrMo24946du != null) {
            this.f17557x1.mo24764k4(str, abstractC6155lrMo24946du);
        }
        return abstractC6155lrMo24946du;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo25032k4(String str) {
        AbstractC6155lr abstractC6155lrMo24946du = mo24946du(str);
        return abstractC6155lrMo24946du != null ? abstractC6155lrMo24946du.mo24800k4(this) : C6163nh.f17403k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo25041x1(String str) {
        AbstractC6155lr[] abstractC6155lrArr = {null};
        boolean z = m25176k4(str, abstractC6155lrArr) && abstractC6155lrArr[0].m24908du() == this;
        AbstractC6155lr abstractC6155lr = abstractC6155lrArr[0];
        if (z) {
            if (!abstractC6155lr.m24913kk()) {
                throw new C6208y2(C14113y2.m67408k4("Property ", str, " isn't configurable"));
            }
            this.f17557x1.mo24765k4(str);
            abstractC6155lr.m24909dy();
            this.f17553du--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24947k4(int i) {
    }

    /* JADX INFO: renamed from: kk */
    public boolean m25177kk(AbstractC6123ca abstractC6123ca) {
        return mo25039kk(abstractC6123ca.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25180x1(String str, AbstractC6123ca abstractC6123ca) {
        mo25036k4((AbstractC6155lr) new C6165o9(this, str, abstractC6123ca));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25035k4(AbstractC6123ca abstractC6123ca, AbstractC6123ca abstractC6123ca2) {
        mo25037k4(abstractC6123ca.toString(), abstractC6123ca2);
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo25039kk(String str) {
        AbstractC6155lr[] abstractC6155lrArr = {null};
        return this.f17557x1.mo24766k4(str, abstractC6155lrArr) && abstractC6155lrArr[0].m24908du() == this;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25181x1(boolean z) {
        this.f17555k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25036k4(AbstractC6155lr abstractC6155lr) {
        String strM24910k4 = abstractC6155lr.m24910k4();
        AbstractC6155lr[] abstractC6155lrArr = {null};
        boolean z = this.f17557x1.mo24766k4(strM24910k4, abstractC6155lrArr) && abstractC6155lrArr[0].m24908du() == this;
        AbstractC6155lr abstractC6155lr2 = abstractC6155lrArr[0];
        if (!z) {
            if (abstractC6155lr2 != null) {
                abstractC6155lr2.m24908du().m25170h4(abstractC6155lr2.m24910k4());
            }
            this.f17557x1.mo24764k4(strM24910k4, abstractC6155lr);
            this.f17553du++;
            return;
        }
        int iMo24799jd = abstractC6155lr2.mo24799jd();
        if (iMo24799jd == 0) {
            int iMo24799jd2 = abstractC6155lr.mo24799jd();
            if (iMo24799jd2 == 0) {
                this.f17557x1.mo24767x1(strM24910k4).mo24802k4(this, abstractC6155lr.mo24800k4(this));
                return;
            } else {
                if (iMo24799jd2 != 1) {
                    return;
                }
                this.f17557x1.mo24765k4(strM24910k4);
                this.f17557x1.mo24764k4(strM24910k4, abstractC6155lr);
                return;
            }
        }
        if (iMo24799jd != 1) {
            return;
        }
        C6126dc c6126dc = (C6126dc) abstractC6155lr2;
        if (abstractC6155lr.mo24799jd() != 1) {
            c6126dc.mo24802k4(this, abstractC6155lr.mo24800k4(this));
            return;
        }
        C6126dc c6126dc2 = (C6126dc) abstractC6155lr;
        c6126dc.m24801k4(c6126dc2.m24797ck() != null ? c6126dc2.m24797ck() : c6126dc.m24797ck());
        c6126dc.m24804x1(c6126dc2.m24798fa() != null ? c6126dc2.m24798fa() : c6126dc.m24798fa());
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m25182x1(AbstractC6123ca abstractC6123ca) {
        return mo25066to(abstractC6123ca.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24771k4(Object obj) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25037k4(String str, AbstractC6123ca abstractC6123ca) {
        AbstractC6155lr abstractC6155lrMo24946du = mo24946du(str);
        if (abstractC6155lrMo24946du == null || (abstractC6155lrMo24946du.m24908du() != this && abstractC6155lrMo24946du.mo24799jd() == 0)) {
            mo25036k4((AbstractC6155lr) new C6165o9(this, str, abstractC6123ca));
        } else {
            abstractC6155lrMo24946du.mo24802k4(this, abstractC6123ca);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25174k4(String str, AbstractC6123ca abstractC6123ca, int i) {
        C6165o9 c6165o9 = new C6165o9(this, str, abstractC6123ca);
        c6165o9.m24912kk((i & 1) == 0);
        c6165o9.m24911k4((i & 2) == 0);
        mo25036k4((AbstractC6155lr) c6165o9);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25175k4(AbstractC6211yd abstractC6211yd) {
        if (abstractC6211yd == null || abstractC6211yd == C6163nh.f17403k4 || abstractC6211yd == C6185u1.f17479k4) {
            return false;
        }
        if (abstractC6211yd.m25171jd() == this) {
            return true;
        }
        return m25175k4(abstractC6211yd.m25171jd());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo25038k4(String str, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6155lr abstractC6155lrMo24946du = mo24946du(str);
        if (abstractC6155lrMo24946du == null) {
            abstractC6123caArr[0] = C6163nh.f17403k4;
            return false;
        }
        abstractC6123caArr[0] = abstractC6155lrMo24946du.mo24800k4(this);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m25176k4(String str, AbstractC6155lr[] abstractC6155lrArr) {
        AbstractC6155lr abstractC6155lrMo24946du = mo24946du(str);
        abstractC6155lrArr[0] = abstractC6155lrMo24946du;
        return abstractC6155lrMo24946du != null;
    }
}
