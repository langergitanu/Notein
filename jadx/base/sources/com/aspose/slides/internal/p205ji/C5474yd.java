package com.aspose.slides.internal.p205ji;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.yd */
/* JADX INFO: loaded from: classes.dex */
class C5474yd extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: k4 */
    private HashMap<Object, C5449c5> f15053k4;

    public C5474yd(int i) {
        super(i);
        this.f15053k4 = new HashMap<>(1000);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void finalize() throws Throwable {
        Iterator<C5449c5> it = this.f15053k4.values().iterator();
        while (it.hasNext()) {
            it.next().m22536kk();
        }
        this.f15053k4.clear();
        super.finalize();
    }
}
