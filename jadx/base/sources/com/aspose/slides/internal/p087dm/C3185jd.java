package com.aspose.slides.internal.p087dm;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.dm.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C3185jd {

    /* JADX INFO: renamed from: k4 */
    public static float f9463k4 = -1.0f;

    /* JADX INFO: renamed from: x1 */
    public static float f9464x1 = -1.0f;

    /* JADX INFO: renamed from: du */
    public String f9465du;

    /* JADX INFO: renamed from: h4 */
    public C3181c5 f9466h4;

    /* JADX INFO: renamed from: kk */
    public String f9467kk;

    /* JADX INFO: renamed from: to */
    public String f9468to;

    public C3185jd() {
        String str = C14113y2.f47374k4;
        this.f9467kk = str;
        this.f9468to = str;
        this.f9465du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3550du m13678k4() {
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = this.f9466h4.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Integer, C3181c5> next = it.next();
                if (C7019kk.m27469x1(next.getValue(), C3550du.class)) {
                    return (C3550du) next.getValue();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }
}
