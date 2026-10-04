package com.huawei.hms.framework.network.grs.p579g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C17962a;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p577e.C17935c;
import com.huawei.hms.framework.network.grs.p578f.C17937b;
import com.huawei.hms.framework.network.grs.p579g.p580j.C17950a;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17953c;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17954d;
import com.huawei.hms.framework.network.grs.p582h.C17958d;
import com.microsoft.identity.client.internal.MsalUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17943c {

    /* JADX INFO: renamed from: n */
    private static final String f53686n = "c";

    /* JADX INFO: renamed from: a */
    private final GrsBaseInfo f53687a;

    /* JADX INFO: renamed from: b */
    private final Context f53688b;

    /* JADX INFO: renamed from: c */
    private final C17933a f53689c;

    /* JADX INFO: renamed from: d */
    private C17944d f53690d;

    /* JADX INFO: renamed from: j */
    private final C17953c f53696j;

    /* JADX INFO: renamed from: k */
    private C17954d f53697k;

    /* JADX INFO: renamed from: e */
    private final Map<String, Future<C17944d>> f53691e = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: f */
    private final List<C17944d> f53692f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    private final JSONArray f53693g = new JSONArray();

    /* JADX INFO: renamed from: h */
    private final List<String> f53694h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    private final List<String> f53695i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l */
    private String f53698l = "";

    /* JADX INFO: renamed from: m */
    private long f53699m = 1;

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.c$a */
    public class a implements Callable<C17944d> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExecutorService f53700a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f53701b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C17935c f53702c;

        public a(ExecutorService executorService, String str, C17935c c17935c) {
            this.f53700a = executorService;
            this.f53701b = str;
            this.f53702c = c17935c;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C17944d call() {
            return C17943c.this.m77072b(this.f53700a, this.f53701b, this.f53702c);
        }
    }

    public C17943c(C17953c c17953c, C17933a c17933a) {
        this.f53696j = c17953c;
        this.f53687a = c17953c.m77136b();
        this.f53688b = c17953c.m77134a();
        this.f53689c = c17933a;
        m77074c();
        m77075d();
    }

    /* JADX INFO: renamed from: b */
    private C17944d m77071b(C17944d c17944d) throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        String str2;
        for (Map.Entry<String, Future<C17944d>> entry : this.f53691e.entrySet()) {
            if (c17944d != null && (c17944d.m77115o() || c17944d.m77113m())) {
                break;
            }
            try {
                c17944d = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = f53686n;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.m76968w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.m76963i(f53686n, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = f53686n;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.m76968w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.m76967w(f53686n, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return c17944d;
    }

    /* JADX INFO: renamed from: c */
    private void m77074c() {
        C17954d c17954dM77129a = C17950a.m77129a(this.f53688b);
        if (c17954dM77129a == null) {
            Logger.m76967w(f53686n, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        m77080a(c17954dM77129a);
        List<String> listM77139a = c17954dM77129a.m77139a();
        if (listM77139a == null || listM77139a.size() <= 0) {
            Logger.m76965v(f53686n, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (listM77139a.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String strM77145c = c17954dM77129a.m77145c();
        String strM77143b = c17954dM77129a.m77143b();
        if (listM77139a.size() > 0) {
            for (String str : listM77139a) {
                if (str.startsWith("https://")) {
                    m77073b(strM77145c, str);
                    m77070a(strM77143b, str);
                } else {
                    Logger.m76967w(f53686n, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.m76966v(f53686n, "request to GRS server url is{%s} and {%s}", this.f53694h, this.f53695i);
    }

    /* JADX INFO: renamed from: d */
    private void m77075d() {
        String grsParasKey = this.f53687a.getGrsParasKey(true, true, this.f53688b);
        this.f53698l = this.f53689c.m77010a().m77020a(grsParasKey + "ETag", "");
    }

    /* JADX INFO: renamed from: e */
    private String m77076e() {
        C17937b c17937bM77046a = C17937b.m77046a(this.f53688b.getPackageName(), this.f53687a);
        C17962a c17962aM77048a = c17937bM77046a != null ? c17937bM77046a.m77048a() : null;
        if (c17962aM77048a == null) {
            return "";
        }
        String strM77169b = c17962aM77048a.m77169b();
        Logger.m76966v(f53686n, "get appName from local assets is{%s}", strM77169b);
        return strM77169b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public C17944d m77072b(ExecutorService executorService, String str, C17935c c17935c) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C17944d c17944dM77069a = m77069a(executorService, this.f53695i, str, c17935c);
        int iM77100b = c17944dM77069a == null ? 0 : c17944dM77069a.m77100b();
        String str2 = f53686n;
        Logger.m76966v(str2, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(iM77100b));
        if (iM77100b == 404 || iM77100b == 401) {
            if (TextUtils.isEmpty(m77076e()) && TextUtils.isEmpty(this.f53687a.getAppName())) {
                Logger.m76963i(str2, "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            this.f53691e.clear();
            Logger.m76963i(str2, "this env has not deploy new interface,so use old interface.");
            c17944dM77069a = m77069a(executorService, this.f53694h, str, c17935c);
        }
        C17945e.m77117a(new ArrayList(this.f53692f), SystemClock.elapsedRealtime() - jElapsedRealtime, this.f53693g, this.f53688b);
        this.f53692f.clear();
        return c17944dM77069a;
    }

    /* JADX INFO: renamed from: a */
    public C17944d m77077a(ExecutorService executorService, String str, C17935c c17935c) {
        String str2;
        String str3;
        if (this.f53694h.isEmpty() && this.f53695i.isEmpty()) {
            return null;
        }
        try {
            return (C17944d) executorService.submit(new a(executorService, str, c17935c)).get(m77081b() != null ? r0.m77146d() : 10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            str2 = f53686n;
            str3 = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
            Logger.m76968w(str2, str3, e);
            return null;
        } catch (CancellationException unused) {
            Logger.m76963i(f53686n, "{submitExcutorTaskWithTimeout} the computation was cancelled");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            str2 = f53686n;
            str3 = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
            Logger.m76968w(str2, str3, e);
            return null;
        } catch (TimeoutException unused2) {
            Logger.m76967w(f53686n, "{submitExcutorTaskWithTimeout} the wait timed out");
            return null;
        } catch (Exception e3) {
            e = e3;
            str2 = f53686n;
            str3 = "{submitExcutorTaskWithTimeout} catch Exception";
            Logger.m76968w(str2, str3, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[LOOP:0: B:3:0x0004->B:36:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C17944d m77069a(ExecutorService executorService, List<String> list, String str, C17935c c17935c) {
        String str2;
        C17935c c17935c2;
        boolean z;
        ExecutionException executionException;
        C17944d c17944d;
        C17944d c17944d2 = null;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            String str3 = list.get(i);
            if (TextUtils.isEmpty(str3)) {
                str2 = str;
                c17935c2 = c17935c;
            } else {
                str2 = str;
                c17935c2 = c17935c;
                Future<C17944d> futureSubmit = executorService.submit(new C17941a(str3, i, this, this.f53688b, str2, this.f53687a, c17935c2).m77066g());
                this.f53691e.put(str3, futureSubmit);
                z = true;
                try {
                    c17944d = futureSubmit.get(this.f53699m, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e = e;
                } catch (CancellationException unused) {
                } catch (ExecutionException e2) {
                    executionException = e2;
                } catch (TimeoutException unused2) {
                }
                if (c17944d != null) {
                    try {
                        if (!c17944d.m77115o()) {
                            if (c17944d.m77113m()) {
                            }
                        }
                        Logger.m76963i(f53686n, "grs request return body is not null and is OK.");
                        c17944d2 = c17944d;
                    } catch (InterruptedException e3) {
                        e = e3;
                        c17944d2 = c17944d;
                        Logger.m76968w(f53686n, "the current thread was interrupted while waiting", e);
                    } catch (CancellationException unused3) {
                        c17944d2 = c17944d;
                        Logger.m76963i(f53686n, "{requestServer} the computation was cancelled");
                    } catch (ExecutionException e4) {
                        executionException = e4;
                        c17944d2 = c17944d;
                        Logger.m76968w(f53686n, "the computation threw an ExecutionException", executionException);
                    } catch (TimeoutException unused4) {
                        c17944d2 = c17944d;
                        Logger.m76967w(f53686n, "the wait timed out");
                    }
                    if (!z) {
                        Logger.m76965v(f53686n, "needBreak is true so need break current circulation");
                        break;
                    }
                    i++;
                    str = str2;
                    c17935c = c17935c2;
                }
                c17944d2 = c17944d;
            }
            z = false;
            if (!z) {
            }
        }
        return m77071b(c17944d2);
    }

    /* JADX INFO: renamed from: b */
    public C17954d m77081b() {
        return this.f53697k;
    }

    /* JADX INFO: renamed from: b */
    private void m77073b(String str, String str2) {
        if (TextUtils.isEmpty(this.f53687a.getAppName()) && TextUtils.isEmpty(m77076e())) {
            return;
        }
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
        sbOooO0OO.append(String.format(Locale.ROOT, str, TextUtils.isEmpty(m77076e()) ? this.f53687a.getAppName() : m77076e()));
        String grsReqParamJoint = this.f53687a.getGrsReqParamJoint(false, false, "1.0", this.f53688b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
            sbOooO0OO.append(grsReqParamJoint);
        }
        this.f53694h.add(sbOooO0OO.toString());
    }

    /* JADX INFO: renamed from: a */
    public String m77078a() {
        return this.f53698l;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m77079a(C17944d c17944d) {
        try {
            this.f53692f.add(c17944d);
            C17944d c17944d2 = this.f53690d;
            if (c17944d2 == null || (!c17944d2.m77115o() && !this.f53690d.m77113m())) {
                if (c17944d.m77114n()) {
                    Logger.m76963i(f53686n, "GRS server open 503 limiting strategy.");
                    C17958d.m77157a(this.f53687a.getGrsParasKey(true, true, this.f53688b), new C17958d.a(c17944d.m77111k(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (c17944d.m77113m()) {
                    Logger.m76963i(f53686n, "GRS server open 304 Not Modified.");
                }
                if (!c17944d.m77115o() && !c17944d.m77113m()) {
                    Logger.m76965v(f53686n, "grsResponseResult has exception so need return");
                    return;
                }
                this.f53690d = c17944d;
                this.f53689c.m77013a(this.f53687a, c17944d, this.f53688b, this.f53696j);
                for (Map.Entry<String, Future<C17944d>> entry : this.f53691e.entrySet()) {
                    if (!entry.getKey().equals(c17944d.m77112l()) && !entry.getValue().isCancelled()) {
                        Logger.m76963i(f53686n, "future cancel");
                        entry.getValue().cancel(true);
                    }
                }
                return;
            }
            Logger.m76965v(f53686n, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77080a(C17954d c17954d) {
        this.f53697k = c17954d;
    }

    /* JADX INFO: renamed from: a */
    private void m77070a(String str, String str2) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str2, str);
        String grsReqParamJoint = this.f53687a.getGrsReqParamJoint(false, false, m77076e(), this.f53688b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
            sbOooO0OO.append(grsReqParamJoint);
        }
        this.f53695i.add(sbOooO0OO.toString());
    }
}
