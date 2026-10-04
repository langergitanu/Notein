package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18374u4 {

    /* JADX INFO: renamed from: b */
    public static final String f56269b = "u4";

    /* JADX INFO: renamed from: c */
    public static final String f56270c = "init";

    /* JADX INFO: renamed from: a */
    public long f56271a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.u4$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18374u4.this.m79597b();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.u4$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C18374u4 f56273a = new C18374u4();
    }

    /* JADX INFO: renamed from: a */
    private void m79595a() {
        this.f56271a = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m79597b() {
        C18143d5.reportSysEvent(Long.valueOf(this.f56271a), f56270c, f56270c);
    }

    public static C18374u4 getInstance() {
        return b.f56273a;
    }

    public long getInitTime() {
        return this.f56271a;
    }

    public void init() {
        m79595a();
        HianalyticsHelper.getInstance().getReportExecutor().execute(new a());
    }
}
