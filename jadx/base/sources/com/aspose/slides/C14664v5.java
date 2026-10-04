package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p332p7.C7555ed;
import com.aspose.slides.internal.p332p7.C8336nf;

/* JADX INFO: renamed from: com.aspose.slides.v5 */
/* JADX INFO: loaded from: classes3.dex */
class C14664v5 implements IGenericEnumerable<C14808xn> {

    /* JADX INFO: renamed from: k4 */
    private final C7555ed f49474k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C14808xn> f49475x1;

    public C14664v5(C7555ed c7555ed) {
        this.f49474k4 = c7555ed;
        C8336nf[] c8336nfArrM30911k4 = c7555ed.m30911k4();
        this.f49475x1 = new List<>(c8336nfArrM30911k4.length);
        for (C8336nf c8336nf : c8336nfArrM30911k4) {
            this.f49475x1.addItem(new C14808xn(c8336nf));
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C14808xn> iterator() {
        return this.f49475x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14808xn m72074k4(int i, C14648us c14648us, C14648us c14648us2, String str) {
        C14808xn c14808xn = new C14808xn(i);
        c14808xn.m73509k4(c14648us, this);
        c14808xn.m73515x1(c14648us2, this);
        c14808xn.m73510k4(str);
        m72075k4(c14808xn);
        return c14808xn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72075k4(C14808xn c14808xn) {
        this.f49475x1.addItem(c14808xn);
        this.f49474k4.m30910k4(C14808xn.m73503x1(c14808xn));
    }
}
