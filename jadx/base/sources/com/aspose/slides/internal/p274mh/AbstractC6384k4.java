package com.aspose.slides.internal.p274mh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p167hh.C4587x1;
import com.aspose.slides.internal.p410sx.C10800kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.mh.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6384k4 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    protected C10800kk f18159k4;

    /* JADX INFO: renamed from: x1 */
    protected final Object f18160x1 = new Object();

    public AbstractC6384k4(Map<String, C4587x1> map) {
        if (map == null) {
            throw new ArgumentException("Parameter is not valid");
        }
        this.f18159k4 = new C10800kk(this, map);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo26210k4(true);
        C14094ts.m67303k4(this);
    }

    public void finalize() throws Throwable {
        super.finalize();
        mo26210k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 m26208k4(String str, int i) {
        return this.f18159k4.m52370k4(str, i);
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4584k4[] m26212x1(String str) {
        return this.f18159k4.m52374x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public C4587x1 m26209k4(String str) {
        return this.f18159k4.m52371k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo26210k4(boolean z) {
    }

    /* JADX INFO: renamed from: k4 */
    public C12004dy[] m26211k4() {
        C12004dy[] c12004dyArrM52373k4;
        synchronized (this.f18160x1) {
            c12004dyArrM52373k4 = this.f18159k4.m52373k4();
        }
        return c12004dyArrM52373k4;
    }
}
