package com.huawei.hms.network.embedded;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18434z {

    /* JADX INFO: renamed from: d */
    public static final String f56735d = "DetectEventListener";

    /* JADX INFO: renamed from: e */
    public static final AbstractC18434z f56736e = new a();

    /* JADX INFO: renamed from: a */
    public C18124c0 f56737a;

    /* JADX INFO: renamed from: b */
    public C18277n f56738b;

    /* JADX INFO: renamed from: c */
    public long f56739c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z$a */
    public static class a extends AbstractC18434z {
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC18291o f56740a;

        public b(InterfaceC18291o interfaceC18291o) {
            this.f56740a = interfaceC18291o;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18421y c18421y = new C18421y();
            c18421y.put("domain", this.f56740a.mo79206a()).put("req_start_time", this.f56740a.mo79210b()).put("req_total_time", this.f56740a.mo79214e()).put("error_code", this.f56740a.mo79212c());
            Logger.m76965v(AbstractC18434z.f56735d, "the detect date :" + c18421y.get());
            HianalyticsHelper.getInstance().onEvent(c18421y.get(), C18421y.f56676a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m80014a(int i) {
        mo77832a(i, "");
    }

    /* JADX INFO: renamed from: b */
    public void mo77834b(int i) {
        C18277n c18277n = this.f56738b;
        if (c18277n != null) {
            c18277n.m79207a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo77832a(int i, String str) {
        C18277n c18277n = this.f56738b;
        if (c18277n != null) {
            c18277n.m79211b(i);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.f56738b.m79209a(new URL(str).getHost());
            } catch (IOException unused) {
                Logger.m76967w(f56735d, "obtain host has error");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo77835b(C18180g0 c18180g0) {
        this.f56738b = new C18277n();
        this.f56739c = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public <T extends AbstractC18263m> void m80015a(C18124c0 c18124c0, AbstractC18263m abstractC18263m, int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = abstractC18263m;
        c18124c0.m78038a(messageObtain);
    }

    /* JADX INFO: renamed from: a */
    public void mo77833a(C18180g0 c18180g0) {
        if (this.f56738b != null) {
            this.f56738b.m79208a(SystemClock.elapsedRealtime() - this.f56739c);
            if (c18180g0 == null || !(c18180g0.m78521b() instanceof AbstractC18263m)) {
                return;
            }
            ((C18249l) c18180g0.m78521b()).mo79006a(this.f56738b);
            m80015a(this.f56737a, (C18249l) c18180g0.m78521b(), 1003);
        }
    }

    /* JADX INFO: renamed from: a */
    public <T extends InterfaceC18291o> void m80016a(T t) {
        if (!HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getResourceContext())) {
            Logger.m76963i(f56735d, "HianalyticsHelper report disable, and return!");
        } else if (t == null) {
            Logger.m76963i(f56735d, "the detect data has error! detect == null");
        } else {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new b(t));
        }
    }
}
