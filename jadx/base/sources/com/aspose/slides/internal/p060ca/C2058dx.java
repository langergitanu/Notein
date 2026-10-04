package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dx */
/* JADX INFO: loaded from: classes3.dex */
public class C2058dx implements IGenericEnumerable<String> {

    /* JADX INFO: renamed from: k4 */
    private boolean f7109k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, String> f7110x1 = new Dictionary<>();

    @Override // java.lang.Iterable
    public final IGenericEnumerator<String> iterator() {
        return this.f7110x1.getKeys().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10438k4() {
        this.f7110x1.clear();
    }

    /* JADX INFO: renamed from: kk */
    public final void m10440kk() {
        this.f7109k4 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10441x1() {
        this.f7109k4 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10439k4(String str) {
        this.f7110x1.addItem(str, str);
    }
}
