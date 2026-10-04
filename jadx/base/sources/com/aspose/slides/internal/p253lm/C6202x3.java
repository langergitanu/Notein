package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.x3 */
/* JADX INFO: loaded from: classes4.dex */
public class C6202x3 extends AbstractC6211yd {

    /* JADX INFO: renamed from: du */
    private C6202x3 f17529du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC6211yd f17530h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC6155lr f17531k4;

    /* JADX INFO: renamed from: to */
    private AbstractC6155lr f17532to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.x3$k4 */
    public static class k4 implements IGenericEnumerable<String> {

        /* JADX INFO: renamed from: k4 */
        private C6202x3 f17533k4;

        /* JADX INFO: renamed from: com.aspose.slides.internal.lm.x3$k4$k4, reason: collision with other inner class name */
        public static class C19065k4 implements IGenericEnumerator<String> {

            /* JADX INFO: renamed from: k4 */
            private C6202x3 f17534k4;

            /* JADX INFO: renamed from: kk */
            private String f17535kk;

            /* JADX INFO: renamed from: to */
            private boolean f17536to;

            /* JADX INFO: renamed from: x1 */
            private IGenericEnumerator<String> f17537x1;

            public C19065k4(C6202x3 c6202x3) {
                IGenericEnumerable<String> iGenericEnumerableM25148ck;
                this.f17534k4 = c6202x3;
                if (c6202x3.f17530h4 != null) {
                    this.f17536to = true;
                    iGenericEnumerableM25148ck = c6202x3.f17530h4.mo25028du();
                } else {
                    iGenericEnumerableM25148ck = c6202x3.m25148ck();
                }
                this.f17537x1 = iGenericEnumerableM25148ck.iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                while (this.f17537x1.hasNext()) {
                    String next = this.f17537x1.next();
                    if (!this.f17536to) {
                        this.f17535kk = next;
                        return true;
                    }
                    if (this.f17534k4.m25149h4(next) == null) {
                        this.f17535kk = next;
                        return true;
                    }
                }
                if (!this.f17536to) {
                    return false;
                }
                this.f17536to = false;
                this.f17537x1 = this.f17534k4.m25148ck().iterator();
                return hasNext();
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final String next() {
                return this.f17535kk;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                if (this.f17534k4.f17530h4 != null) {
                    this.f17534k4.f17530h4.mo25028du().iterator().reset();
                }
                this.f17534k4.m25148ck().iterator().reset();
                this.f17537x1 = (this.f17534k4.f17530h4 != null ? this.f17534k4.f17530h4.mo25028du() : this.f17534k4.m25148ck()).iterator();
            }
        }

        public k4(C6202x3 c6202x3) {
            this.f17533k4 = c6202x3;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<String> iterator() {
            return new C19065k4(this.f17533k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.x3$x1 */
    public static class x1 implements IGenericEnumerable<AbstractC6123ca> {

        /* JADX INFO: renamed from: k4 */
        private C6202x3 f17538k4;

        /* JADX INFO: renamed from: com.aspose.slides.internal.lm.x3$x1$k4 */
        public static class k4 implements IGenericEnumerator<AbstractC6123ca> {

            /* JADX INFO: renamed from: k4 */
            private C6202x3 f17539k4;

            /* JADX INFO: renamed from: x1 */
            private IGenericEnumerator<String> f17540x1;

            public k4(C6202x3 c6202x3) {
                this.f17539k4 = c6202x3;
                this.f17540x1 = c6202x3.mo25028du().iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                return this.f17540x1.hasNext();
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final AbstractC6123ca next() {
                return this.f17539k4.mo25032k4(this.f17540x1.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                this.f17540x1.reset();
            }
        }

        public x1(C6202x3 c6202x3) {
            this.f17538k4 = c6202x3;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<AbstractC6123ca> iterator() {
            return new k4(this.f17538k4);
        }
    }

    public C6202x3(C6202x3 c6202x3) {
        super(c6202x3);
        if (c6202x3 == null) {
            throw new ArgumentNullException("outer");
        }
        this.f17529du = c6202x3.m25153jd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ck */
    public IGenericEnumerable<String> m25148ck() {
        return super.mo25028du();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        AbstractC6211yd abstractC6211yd = this.f17530h4;
        if (abstractC6211yd != null) {
            return abstractC6211yd.mo24769C_();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: du */
    public IGenericEnumerable<String> mo25028du() {
        return new k4(this);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: dy */
    public String mo24770dy() {
        return "object";
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: h4 */
    public IGenericEnumerable<AbstractC6123ca> mo25029h4() {
        return new x1(this);
    }

    /* JADX INFO: renamed from: jd */
    public final C6202x3 m25153jd() {
        C6202x3 c6202x3 = this.f17529du;
        return c6202x3 != null ? c6202x3 : this;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo25032k4(String str) {
        AbstractC6155lr abstractC6155lr;
        AbstractC6155lr abstractC6155lr2;
        return (!"this".equals(str) || (abstractC6155lr2 = this.f17531k4) == null) ? (!"arguments".equals(str) || (abstractC6155lr = this.f17532to) == null) ? super.mo25032k4(str) : abstractC6155lr.mo24800k4(this) : abstractC6155lr2.mo24800k4(this);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Scope";
    }

    public C6202x3(C6202x3 c6202x3, AbstractC6211yd abstractC6211yd) {
        super(c6202x3);
        if (c6202x3 == null) {
            throw new ArgumentNullException("outer");
        }
        if (abstractC6211yd == null) {
            throw new ArgumentNullException("bag");
        }
        this.f17529du = c6202x3.m25153jd();
        this.f17530h4 = abstractC6211yd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public AbstractC6155lr m25149h4(String str) {
        return super.mo24946du(str);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: du */
    public AbstractC6155lr mo24946du(String str) {
        AbstractC6211yd abstractC6211yd;
        AbstractC6155lr abstractC6155lrMo24946du;
        AbstractC6155lr abstractC6155lrMo24946du2 = super.mo24946du(str);
        if ((abstractC6155lrMo24946du2 != null && abstractC6155lrMo24946du2.m24908du() == this) || (abstractC6211yd = this.f17530h4) == null || (abstractC6155lrMo24946du = abstractC6211yd.mo24946du(str)) == null) {
            return abstractC6155lrMo24946du2;
        }
        C6146j5 c6146j5 = new C6146j5(this, abstractC6155lrMo24946du.m24910k4(), abstractC6155lrMo24946du, this.f17530h4);
        mo25036k4((AbstractC6155lr) c6146j5);
        return c6146j5;
    }

    public C6202x3(AbstractC6211yd abstractC6211yd) {
        super(C6185u1.f17479k4);
        this.f17530h4 = abstractC6211yd;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo24771k4(Object obj) {
        AbstractC6211yd abstractC6211yd = this.f17530h4;
        if (abstractC6211yd != null) {
            abstractC6211yd.mo24771k4(obj);
        }
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo25037k4(String str, AbstractC6123ca abstractC6123ca) {
        C6165o9 c6165o9;
        if ("this".equals(str)) {
            AbstractC6155lr abstractC6155lr = this.f17531k4;
            if (abstractC6155lr != null) {
                abstractC6155lr.mo24802k4(this, abstractC6123ca);
                return;
            } else {
                c6165o9 = new C6165o9(this, str, abstractC6123ca);
                this.f17531k4 = c6165o9;
            }
        } else {
            if (!"arguments".equals(str)) {
                AbstractC6155lr abstractC6155lrMo24946du = mo24946du(str);
                if (abstractC6155lrMo24946du != null) {
                    abstractC6155lrMo24946du.mo24802k4(this, abstractC6123ca);
                    return;
                }
                C6202x3 c6202x3 = this.f17529du;
                if (c6202x3 != null) {
                    c6202x3.m25180x1(str, abstractC6123ca);
                    return;
                } else {
                    m25180x1(str, abstractC6123ca);
                    return;
                }
            }
            AbstractC6155lr abstractC6155lr2 = this.f17532to;
            if (abstractC6155lr2 != null) {
                abstractC6155lr2.mo24802k4(this, abstractC6123ca);
                return;
            } else {
                c6165o9 = new C6165o9(this, str, abstractC6123ca);
                this.f17532to = c6165o9;
            }
        }
        mo25036k4((AbstractC6155lr) c6165o9);
    }
}
