package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class qmc {

    /* JADX INFO: renamed from: k4 */
    private final List<IImageTransformOperation> f48360k4;

    /* JADX INFO: renamed from: x1 */
    private long f48361x1;

    public qmc(List<IImageTransformOperation> list) {
        this.f48360k4 = list;
    }

    /* JADX INFO: renamed from: kk */
    private void m69696kk() {
        this.f48361x1++;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69697k4() {
        this.f48361x1 = m69700x1();
        m69696kk();
        this.f48360k4.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m69700x1() {
        long version = this.f48361x1;
        List.Enumerator<IImageTransformOperation> it = this.f48360k4.iterator();
        while (it.hasNext()) {
            try {
                version = ((version & 4294967295L) + (((ImageTransformOperation) it.next()).getVersion() & 4294967295L)) & 4294967295L;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return version;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69698k4(int i) {
        this.f48361x1 = m69700x1();
        m69696kk();
        this.f48360k4.removeAt(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m69701x1(IImageTransformOperation iImageTransformOperation) {
        this.f48361x1 = m69700x1();
        m69696kk();
        return this.f48360k4.removeItem(iImageTransformOperation);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69699k4(IImageTransformOperation iImageTransformOperation) {
        this.f48360k4.addItem(iImageTransformOperation);
        m69696kk();
    }
}
