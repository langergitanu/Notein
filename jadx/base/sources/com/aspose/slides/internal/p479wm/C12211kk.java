package com.aspose.slides.internal.p479wm;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p479wm.InterfaceC12212x1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wm.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12211kk<TKey, TValue extends InterfaceC12212x1> extends C12210k4<TKey, TValue> {

    /* JADX INFO: renamed from: x1 */
    private final long f40637x1;

    public C12211kk(Class<TKey> cls, Class<TValue> cls2, long j) {
        super(cls, cls2, Integer.MAX_VALUE);
        this.f40637x1 = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m56982h4() {
        Iterator<KeyValuePair<TKey, TValue>> it = this.f40631k4.iterator();
        long weight = 0;
        while (it.hasNext()) {
            weight += ((InterfaceC12212x1) ((C12210k4.x1) ((KeyValuePair) it.next()).getValue()).m56981x1()).getWeight();
        }
        return weight;
    }

    @Override // com.aspose.slides.internal.p479wm.C12210k4
    /* JADX INFO: renamed from: to */
    public void mo56975to() {
        while (this.f40637x1 < m56982h4() && this.f40631k4.size() > 1) {
            m56969du();
        }
    }
}
