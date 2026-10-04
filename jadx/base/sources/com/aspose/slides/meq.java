package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class meq implements IGenericEnumerable<gt9> {

    /* JADX INFO: renamed from: k4 */
    SortedList<String, gt9> f46227k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, String> f46228x1;

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<String, String> f46225kk = new Dictionary<>(0);

    /* JADX INFO: renamed from: to */
    private static final char[] f46226to = {IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f46224du = new C7017h4("TargetMode", "Target", "Type", "Id");

    /* JADX INFO: renamed from: com.aspose.slides.meq$k4 */
    public static class C13833k4 implements IGenericEnumerator<gt9> {

        /* JADX INFO: renamed from: k4 */
        private meq f46229k4;

        /* JADX INFO: renamed from: x1 */
        private IGenericEnumerator<gt9> f46230x1;

        public C13833k4(meq meqVar) {
            this.f46229k4 = meqVar;
            this.f46230x1 = meqVar.f46227k4.getValues().iterator();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            while (this.f46230x1.hasNext()) {
                gt9 next = this.f46230x1.next();
                if (next.m6903to() || !this.f46229k4.f46228x1.containsKey(next.m6902kk())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final gt9 next() {
            return this.f46230x1.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f46230x1.reset();
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<gt9> iterator() {
        return new C13833k4(this);
    }
}
