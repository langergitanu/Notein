package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.jd */
/* JADX INFO: loaded from: classes.dex */
public class C3819jd extends CollectionBase {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ex.jd$k4 */
    public static class k4 implements IEnumerator {

        /* JADX INFO: renamed from: k4 */
        private IEnumerator f10404k4;

        public k4(C3819jd c3819jd) {
            this.f10404k4 = c3819jd.iterator();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            return this.f10404k4.hasNext();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public C3817h4 next() {
            return (C3817h4) this.f10404k4.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f10404k4.reset();
        }
    }

    public boolean equals(Object obj) {
        return getInnerList().equals(obj);
    }

    public int hashCode() {
        return getInnerList().hashCode();
    }

    @Override // com.aspose.slides.Collections.CollectionBase, java.lang.Iterable
    public IEnumerator iterator() {
        return new k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public ArrayList m15294k4() {
        return getInnerList();
    }

    @Override // com.aspose.slides.Collections.CollectionBase, com.aspose.slides.Collections.IList
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C3817h4 get_Item(int i) {
        return (C3817h4) getInnerList().get_Item(i);
    }
}
