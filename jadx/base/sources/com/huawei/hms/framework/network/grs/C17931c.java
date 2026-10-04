package com.huawei.hms.framework.network.grs;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p577e.C17935c;
import com.huawei.hms.framework.network.grs.p578f.C17937b;
import com.huawei.hms.framework.network.grs.p579g.C17948h;
import com.huawei.hms.framework.network.grs.p579g.C17949i;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17953c;
import com.huawei.hms.framework.network.grs.p582h.C17955a;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17931c {

    /* JADX INFO: renamed from: i */
    private static final String f53633i = "c";

    /* JADX INFO: renamed from: j */
    private static final ExecutorService f53634j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* JADX INFO: renamed from: k */
    private static AtomicInteger f53635k = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    private GrsBaseInfo f53636a;

    /* JADX INFO: renamed from: b */
    private Context f53637b;

    /* JADX INFO: renamed from: c */
    private C17948h f53638c;

    /* JADX INFO: renamed from: d */
    private C17933a f53639d;

    /* JADX INFO: renamed from: e */
    private C17935c f53640e;

    /* JADX INFO: renamed from: f */
    private C17935c f53641f;

    /* JADX INFO: renamed from: g */
    private C17929a f53642g;

    /* JADX INFO: renamed from: h */
    private FutureTask<Boolean> f53643h;

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.c$a */
    public class a implements Callable<Boolean> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f53644a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ GrsBaseInfo f53645b;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f53644a = context;
            this.f53645b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            C17931c.this.f53638c = new C17948h();
            C17931c.this.f53640e = new C17935c(this.f53644a, GrsApp.getInstance().getBrand(C18115b5.CONNECTOR) + "share_pre_grs_conf_");
            C17931c.this.f53641f = new C17935c(this.f53644a, GrsApp.getInstance().getBrand(C18115b5.CONNECTOR) + "share_pre_grs_services_");
            C17931c c17931c = C17931c.this;
            c17931c.f53639d = new C17933a(c17931c.f53640e, C17931c.this.f53641f, C17931c.this.f53638c);
            C17931c c17931c2 = C17931c.this;
            c17931c2.f53642g = new C17929a(c17931c2.f53636a, C17931c.this.f53639d, C17931c.this.f53638c, C17931c.this.f53641f);
            if (C17931c.f53635k.incrementAndGet() <= 2 || C17937b.m77046a(this.f53644a.getPackageName(), C17931c.this.f53636a) == null) {
                new C17937b(this.f53644a, this.f53645b, true).m77052a(this.f53645b);
            }
            String strM77137c = new C17953c(this.f53645b, this.f53644a).m77137c();
            Logger.m76965v(C17931c.f53633i, "scan serviceSet is:" + strM77137c);
            String strM77020a = C17931c.this.f53641f.m77020a("services", "");
            String strM77127a = C17949i.m77127a(strM77020a, strM77137c);
            if (!TextUtils.isEmpty(strM77127a)) {
                C17931c.this.f53641f.m77024b("services", strM77127a);
                Logger.m76963i(C17931c.f53633i, "postList is:" + StringUtils.anonymizeMessage(strM77127a));
                Logger.m76963i(C17931c.f53633i, "currentServices:" + StringUtils.anonymizeMessage(strM77020a));
                if (!strM77127a.equals(strM77020a)) {
                    C17931c.this.f53638c.m77126a(C17931c.this.f53636a.getGrsParasKey(true, true, this.f53644a));
                    C17931c.this.f53638c.m77123a(new C17953c(this.f53645b, this.f53644a), (String) null, C17931c.this.f53641f);
                }
            }
            C17931c c17931c3 = C17931c.this;
            c17931c3.m76990a(c17931c3.f53640e.m77021a());
            C17931c.this.f53639d.m77015b(this.f53645b, this.f53644a);
            return Boolean.TRUE;
        }
    }

    public C17931c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f53643h = null;
        this.f53637b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        m76988a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f53636a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f53637b, grsBaseInfo2));
        this.f53643h = futureTask;
        f53634j.execute(futureTask);
        Logger.m76964i(f53633i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s", C17955a.m77147a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry());
    }

    public C17931c(GrsBaseInfo grsBaseInfo) {
        this.f53643h = null;
        m76988a(grsBaseInfo);
    }

    /* JADX INFO: renamed from: e */
    private boolean m76999e() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.f53643h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e) {
            e = e;
            str = f53633i;
            str2 = "init compute task interrupted.";
            Logger.m76968w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.m76963i(f53633i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e2) {
            e = e2;
            str = f53633i;
            str2 = "init compute task failed.";
            Logger.m76968w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.m76967w(f53633i, "init compute task timed out");
            return false;
        } catch (Exception e3) {
            e = e3;
            str = f53633i;
            str2 = "init compute task occur unknown Exception";
            Logger.m76968w(str, str2, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m77006b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!m76999e() || (grsBaseInfo = this.f53636a) == null || (context = this.f53637b) == null) {
            return false;
        }
        this.f53639d.m77012a(grsBaseInfo, context);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public String m77000a(String str, String str2) {
        if (this.f53636a == null || str == null || str2 == null) {
            Logger.m76967w(f53633i, "invalid para!");
            return null;
        }
        if (m76999e()) {
            return this.f53642g.m76977a(str, str2, this.f53637b);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m77001a(String str) {
        if (this.f53636a != null && str != null) {
            return m76999e() ? this.f53642g.m76978a(str, this.f53637b) : new HashMap();
        }
        Logger.m76967w(f53633i, "invalid para!");
        return new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public void m77002a() {
        if (m76999e()) {
            String grsParasKey = this.f53636a.getGrsParasKey(true, true, this.f53637b);
            this.f53640e.m77022a(grsParasKey);
            this.f53640e.m77022a(grsParasKey + "time");
            this.f53640e.m77022a(grsParasKey + "ETag");
            this.f53638c.m77126a(grsParasKey);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76988a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f53636a = grsBaseInfo.m80713clone();
        } catch (CloneNotSupportedException e) {
            Logger.m76968w(f53633i, "GrsClient catch CloneNotSupportedException", e);
            this.f53636a = grsBaseInfo.copy();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77003a(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.m76967w(f53633i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f53636a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (m76999e()) {
            this.f53642g.m76979a(str, iQueryUrlsCallBack, this.f53637b);
        } else {
            Logger.m76963i(f53633i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77004a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.m76967w(f53633i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f53636a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (m76999e()) {
            this.f53642g.m76980a(str, str2, iQueryUrlCallBack, this.f53637b);
        } else {
            Logger.m76963i(f53633i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76990a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.m76965v(f53633i, "sp's content is empty.");
            return;
        }
        for (String str : map.keySet()) {
            if (str.endsWith("time")) {
                String strM77020a = this.f53640e.m77020a(str, "");
                long j = 0;
                if (!TextUtils.isEmpty(strM77020a) && strM77020a.matches("\\d+")) {
                    try {
                        j = Long.parseLong(strM77020a);
                    } catch (NumberFormatException e) {
                        Logger.m76968w(f53633i, "convert expire time from String to Long catch NumberFormatException.", e);
                    }
                }
                if (!m76991a(j)) {
                    Logger.m76963i(f53633i, "init interface auto clear some invalid sp's data.");
                    String strSubstring = str.substring(0, str.length() - 4);
                    String strOooO0Oo = C21111o0ooOoO.OooO0Oo(strSubstring, "ETag");
                    this.f53640e.m77022a(strSubstring);
                    this.f53640e.m77022a(str);
                    this.f53640e.m77022a(strOooO0Oo);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m76991a(long j) {
        return System.currentTimeMillis() - j <= 604800000;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77005a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17931c.class == obj.getClass() && (obj instanceof C17931c)) {
            return this.f53636a.compare(((C17931c) obj).f53636a);
        }
        return false;
    }
}
