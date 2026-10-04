package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.t3 */
/* JADX INFO: loaded from: classes3.dex */
final class C14484t3 {

    /* JADX INFO: renamed from: k4 */
    private final List<IGradientStop> f49019k4;

    /* JADX INFO: renamed from: x1 */
    private long f49020x1;

    public C14484t3(List<IGradientStop> list) {
        this.f49019k4 = list;
    }

    /* JADX INFO: renamed from: to */
    private void m70926to() {
        this.f49020x1++;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70927k4() {
        this.f49020x1 = m70931kk();
        m70926to();
        this.f49019k4.clear();
    }

    /* JADX INFO: renamed from: kk */
    public final long m70931kk() {
        long version = this.f49020x1;
        List.Enumerator<IGradientStop> it = this.f49019k4.iterator();
        while (it.hasNext()) {
            try {
                version = ((version & 4294967295L) + (((GradientStop) it.next()).getVersion() & 4294967295L)) & 4294967295L;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return version;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70932x1() {
        this.f49020x1 = m70931kk();
        this.f49019k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70928k4(int i) {
        this.f49020x1 = m70931kk();
        m70926to();
        this.f49019k4.removeAt(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70929k4(int i, GradientStop gradientStop) {
        this.f49019k4.insertItem(i, gradientStop);
        m70926to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70930k4(GradientStop gradientStop) {
        this.f49019k4.addItem(gradientStop);
        m70926to();
    }
}
