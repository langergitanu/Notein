package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p517y2.InterfaceC12773ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.ks */
/* JADX INFO: loaded from: classes.dex */
public class C5547ks implements InterfaceC12773ks {

    /* JADX INFO: renamed from: k4 */
    private List<String> f15252k4;

    /* JADX INFO: renamed from: x1 */
    private List<String> m22758x1() {
        if (this.f15252k4 == null) {
            this.f15252k4 = new List<>();
        }
        return this.f15252k4;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<String> iterator() {
        return m22758x1().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m22759k4() {
        return m22758x1().size();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m22760k4(int i) {
        return m22758x1().get_Item(i);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12773ks
    /* JADX INFO: renamed from: k4 */
    public final boolean mo22761k4(String str) {
        return m22758x1().containsItem(str);
    }
}
