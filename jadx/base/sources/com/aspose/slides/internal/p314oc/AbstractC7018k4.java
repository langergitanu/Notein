package com.aspose.slides.internal.p314oc;

import com.aspose.slides.p559ms.System.AbstractC14085qw;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.oc.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7018k4<T extends AbstractC14085qw> {

    /* JADX INFO: renamed from: x1 */
    protected final ArrayList<T> f19081x1 = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.oc.k4$k4 */
    public static final class k4<T> extends ArrayList<T> {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return new ArrayList(this).iterator();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public synchronized void mo27429k4(T t) {
        String delegateId = t.getDelegateId();
        if (delegateId != null) {
            for (int size = this.f19081x1.size() - 1; size >= 0; size--) {
                if (delegateId.equals(this.f19081x1.get(size).getDelegateId())) {
                    this.f19081x1.remove(size);
                    return;
                }
            }
        }
        this.f19081x1.remove(t);
    }

    /* JADX INFO: renamed from: kk */
    public final synchronized void m27431kk(T t) {
        this.f19081x1.clear();
        this.f19081x1.add(t);
    }

    /* JADX INFO: renamed from: x1 */
    public synchronized void mo27432x1(T t) {
        String delegateId = t.getDelegateId();
        if (delegateId != null) {
            for (int size = this.f19081x1.size() - 1; size >= 0; size--) {
                if (delegateId.equals(this.f19081x1.get(size).getDelegateId())) {
                    return;
                }
            }
        }
        this.f19081x1.add(t);
    }

    /* JADX INFO: renamed from: k4 */
    public synchronized boolean m27430k4() {
        return this.f19081x1.isEmpty();
    }
}
