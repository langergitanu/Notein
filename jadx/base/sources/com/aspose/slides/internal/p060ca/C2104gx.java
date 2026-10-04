package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.gx */
/* JADX INFO: loaded from: classes3.dex */
public class C2104gx implements IGenericEnumerable<Integer> {

    /* JADX INFO: renamed from: k4 */
    private boolean f7284k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Integer, Integer> f7285x1 = new Dictionary<>();

    @Override // java.lang.Iterable
    public final IGenericEnumerator<Integer> iterator() {
        return this.f7285x1.getKeys().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10651k4() {
        this.f7285x1.clear();
    }

    /* JADX INFO: renamed from: kk */
    public final void m10653kk() {
        this.f7284k4 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10654x1() {
        this.f7284k4 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10652k4(int i) {
        this.f7285x1.addItem(Integer.valueOf(i), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m10655x1(int i) {
        return this.f7285x1.containsKey(Integer.valueOf(i));
    }
}
