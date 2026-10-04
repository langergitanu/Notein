package com.aspose.slides.internal.p423to;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.to.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11070k4<TKey, T> {

    /* JADX INFO: renamed from: k4 */
    private Class<TKey> f38385k4;

    /* JADX INFO: renamed from: kk */
    private final Dictionary<TKey, T> f38386kk;

    /* JADX INFO: renamed from: to */
    private T f38387to;

    /* JADX INFO: renamed from: x1 */
    private Class<T> f38388x1;

    public C11070k4() {
        this.f38386kk = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m53497k4() {
        return this.f38386kk.size();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53500kk(TKey tkey) {
        return this.f38386kk.containsKey(tkey);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53501x1(TKey tkey) {
        this.f38386kk.removeItemByKey(tkey);
    }

    public C11070k4(Class<TKey> cls, Class<T> cls2) {
        this(cls, cls2, C7019kk.m27467x1((Class) cls2));
    }

    /* JADX INFO: renamed from: k4 */
    public final T m53498k4(TKey tkey) {
        return this.f38386kk.containsKey(tkey) ? this.f38386kk.get_Item(tkey) : this.f38387to;
    }

    public C11070k4(Class<TKey> cls, Class<T> cls2, T t) {
        this.f38385k4 = cls;
        this.f38388x1 = cls2;
        this.f38386kk = new Dictionary<>();
        this.f38387to = t;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53499k4(TKey tkey, T t) {
        if (this.f38386kk.containsKey(tkey)) {
            this.f38386kk.set_Item(tkey, t);
        } else {
            this.f38386kk.addItem(tkey, t);
        }
    }
}
