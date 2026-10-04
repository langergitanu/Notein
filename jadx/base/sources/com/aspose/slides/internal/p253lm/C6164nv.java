package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.nv */
/* JADX INFO: loaded from: classes4.dex */
public class C6164nv implements IGenericCollection<Object>, IGenericEnumerable<Object> {

    /* JADX INFO: renamed from: k4 */
    private C6210y9 f17404k4;

    /* JADX INFO: renamed from: kk */
    private final Object f17405kk = new Object();

    /* JADX INFO: renamed from: x1 */
    private C6210y9 f17406x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.lm.nv$k4 */
    public static class k4 implements IGenericEnumerator<Object> {

        /* JADX INFO: renamed from: k4 */
        private C6164nv f17407k4;

        /* JADX INFO: renamed from: kk */
        private boolean f17408kk = true;

        /* JADX INFO: renamed from: x1 */
        private C6210y9 f17409x1;

        public k4(C6164nv c6164nv) {
            this.f17407k4 = c6164nv;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f17408kk) {
                C6210y9 c6210y9 = this.f17407k4.f17404k4;
                this.f17409x1 = c6210y9;
                this.f17408kk = false;
                return c6210y9 != null;
            }
            C6210y9 c6210y92 = this.f17409x1;
            if (c6210y92 == null || c6210y92.m25169x1() == null) {
                return false;
            }
            this.f17409x1 = this.f17409x1.m25169x1();
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final Object next() {
            return this.f17409x1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f17408kk = true;
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void addItem(Object obj) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean containsItem(Object obj) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(Object[] objArr, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<Object> iterator() {
        return new k4(this);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean removeItem(Object obj) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        int i = 0;
        for (C6210y9 c6210y9M25169x1 = this.f17404k4; c6210y9M25169x1 != null; c6210y9M25169x1 = c6210y9M25169x1.m25169x1()) {
            i++;
        }
        return i;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(!m24951k4() ? C14113y2.m67402k4("[{0}] = {{\n", Integer.valueOf(size())) : C14113y2.f47374k4);
        for (C6210y9 c6210y9M25169x1 = this.f17404k4; c6210y9M25169x1 != null; c6210y9M25169x1 = c6210y9M25169x1.m25169x1()) {
            c6765kp.m26810x1(c6210y9M25169x1.m25167k4().toString());
        }
        if (!m24951k4()) {
            c6765kp.m26792k4("}");
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24952x1(Object obj) {
        if (!m24951k4()) {
            this.f17406x1.m25168k4(new C6210y9(obj));
            this.f17406x1 = this.f17406x1.m25169x1();
        } else {
            C6210y9 c6210y9 = new C6210y9(obj);
            this.f17406x1 = c6210y9;
            this.f17404k4 = c6210y9;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24950k4(Object obj) {
        C6210y9 c6210y9;
        if (m24951k4()) {
            c6210y9 = new C6210y9(obj);
            this.f17406x1 = c6210y9;
        } else {
            c6210y9 = new C6210y9(obj, this.f17404k4);
        }
        this.f17404k4 = c6210y9;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24951k4() {
        return this.f17404k4 == null;
    }
}
