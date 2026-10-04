package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d1 */
/* JADX INFO: loaded from: classes9.dex */
public class RunnableC18139d1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public Runnable f54509a;

    public RunnableC18139d1(Runnable runnable) {
        this.f54509a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public void m78157a(Throwable th) {
        HianalyticsHelper.getInstance().reportException(th, "crash");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f54509a.run();
        } catch (Throwable th) {
            Logger.m76961e("ai", "train task exception!", th);
            m78157a(th);
        }
    }
}
