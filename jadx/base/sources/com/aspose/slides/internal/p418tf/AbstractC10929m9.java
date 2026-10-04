package com.aspose.slides.internal.p418tf;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.System.Xml.C13968ri;

/* JADX INFO: renamed from: com.aspose.slides.internal.tf.m9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10929m9 implements IEnumerable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: kk */
    public int f38011kk = -1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tf.m9$k4 */
    public static class k4 implements IEnumerator {

        /* JADX INFO: renamed from: k4 */
        private AbstractC10929m9 f38012k4;

        /* JADX INFO: renamed from: kk */
        private boolean f38013kk;

        /* JADX INFO: renamed from: x1 */
        private AbstractC10929m9 f38014x1;

        public k4(AbstractC10929m9 abstractC10929m9) {
            this.f38012k4 = abstractC10929m9.deepClone();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (!this.f38013kk) {
                this.f38014x1 = this.f38012k4.deepClone();
                this.f38013kk = true;
            }
            AbstractC10929m9 abstractC10929m9 = this.f38014x1;
            if (abstractC10929m9 != null && abstractC10929m9.mo21770x1()) {
                return true;
            }
            this.f38014x1 = null;
            return false;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            if (!this.f38013kk) {
                throw new InvalidOperationException(C13968ri.m65819k4("Enumeration has not started. Call MoveNext.", C14113y2.f47374k4));
            }
            AbstractC10929m9 abstractC10929m9 = this.f38014x1;
            if (abstractC10929m9 != null) {
                return abstractC10929m9.mo21834kk().deepClone();
            }
            throw new InvalidOperationException(C13968ri.m65819k4("Enumeration has already finished.", C14113y2.f47374k4));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f38013kk = false;
        }
    }

    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        if (this.f38011kk == -1) {
            AbstractC10929m9 abstractC10929m9DeepClone = deepClone();
            while (abstractC10929m9DeepClone.mo21770x1()) {
            }
            this.f38011kk = abstractC10929m9DeepClone.mo21835to();
        }
        return this.f38011kk;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return new k4(this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC10929m9 deepClone();

    /* JADX INFO: renamed from: kk */
    public abstract AbstractC10925du mo21834kk();

    /* JADX INFO: renamed from: to */
    public abstract int mo21835to();

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo21770x1();
}
