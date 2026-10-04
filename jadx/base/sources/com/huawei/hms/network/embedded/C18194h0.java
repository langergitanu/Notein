package com.huawei.hms.network.embedded;

import android.net.NetworkInfo;
import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.SettingUtil;
import com.huawei.hms.network.embedded.C18250l0;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18194h0 {

    /* JADX INFO: renamed from: l */
    public static final String f54997l = "NetDetectAndPolicy";

    /* JADX INFO: renamed from: i */
    public C18124c0 f55006i;

    /* JADX INFO: renamed from: d */
    public int f55001d = 2;

    /* JADX INFO: renamed from: e */
    public int f55002e = 3;

    /* JADX INFO: renamed from: f */
    public int f55003f = -1;

    /* JADX INFO: renamed from: g */
    public long f55004g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f55005h = true;

    /* JADX INFO: renamed from: j */
    public int f55007j = 0;

    /* JADX INFO: renamed from: k */
    public CountDownLatch f55008k = null;

    /* JADX INFO: renamed from: a */
    public ExecutorService f54998a = ExecutorsUtils.newSingleThreadExecutor("netdiag_submit_task");

    /* JADX INFO: renamed from: b */
    public ExecutorService f54999b = ExecutorsUtils.newSingleThreadExecutor("netdiag_execute_task");

    /* JADX INFO: renamed from: c */
    public LimitQueue<Boolean> f55000c = new LimitQueue<>(Math.max(this.f55001d, this.f55002e) + 1, false);

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.h0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f55009a;

        public a(Object obj) {
            this.f55009a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18194h0.this.m78646b(this.f55009a);
        }
    }

    public C18194h0(C18124c0 c18124c0) {
        this.f55006i = c18124c0;
    }

    /* JADX INFO: renamed from: b */
    private void m78645b(long j) {
        Logger.m76966v(f54997l, "the time the date is : nowTime = %s, lastDetectTime = %s", Long.valueOf(j), Long.valueOf(this.f55004g));
        if (m78647b() || j - this.f55004g > C18250l0.g.f55493g || m78652d()) {
            Logger.m76963i(f54997l, "the time count will reset!");
            m78655g();
        }
    }

    /* JADX INFO: renamed from: c */
    private int m78648c(long j) {
        Logger.m76965v(f54997l, "this time the initiativing ...");
        if (!this.f55005h) {
            Logger.m76965v(f54997l, "the appid is error! pls check it");
            return 0;
        }
        long j2 = this.f55004g;
        if (j - j2 > 300000) {
            this.f55007j = 0;
        }
        int i = this.f55007j;
        if (i >= 3 || j - j2 <= 60000) {
            return 0;
        }
        this.f55004g = j;
        this.f55007j = i + 1;
        return 2;
    }

    /* JADX INFO: renamed from: d */
    private int m78651d(long j) {
        String str;
        int i;
        m78645b(j);
        if (!this.f55005h) {
            str = "the appId is available";
        } else if (m78650c() || m78644a(j)) {
            str = "inhibition this time and return it";
        } else {
            if (m78653e()) {
                if (NetworkUtil.netWork(ContextHolder.getResourceContext()) == 1) {
                    Logger.m76965v(f54997l, "the http will detected ping and http");
                    i = 3;
                } else {
                    i = 2;
                }
                this.f55004g = j;
                this.f55003f++;
                Logger.m76966v(f54997l, "the time the date is : lastDetectTime = %s, detectCount = %s，selectDetectMode = %d", Long.valueOf(j), Integer.valueOf(this.f55003f), Integer.valueOf(i));
                return i;
            }
            str = "the detect shouldn't be detected";
        }
        Logger.m76965v(f54997l, str);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    private boolean m78653e() {
        String str;
        int size = this.f55000c.size();
        if (size == 1) {
            return false;
        }
        int i = size - 1;
        if (this.f55000c.get(size - 2) != this.f55000c.get(i)) {
            str = "last two requests is different";
        } else {
            if (size < this.f55001d) {
                Logger.m76965v(f54997l, "request times is not enough");
                return false;
            }
            while (i >= size - this.f55001d) {
                if (this.f55000c.get(i).booleanValue()) {
                    return false;
                }
                i--;
            }
            str = "meet bad threshold";
        }
        Logger.m76965v(f54997l, str);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX INFO: renamed from: f */
    private boolean m78654f() {
        List<InterfaceC18291o> listMo79004a = C18193h.m78641b().mo78516a().mo79004a(1);
        return (listMo79004a == null || listMo79004a.isEmpty() || ((InterfaceC18291o) System.currentTimeMillis()).mo79212c() != 204) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    private void m78655g() {
        this.f55004g = 0L;
        this.f55003f = -1;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC18304p m78656a(long j, long j2) {
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "obtain the info time:", "/");
        sbOooO00o.append(j2);
        Logger.m76965v(f54997l, sbOooO00o.toString());
        C18317q c18317q = new C18317q();
        c18317q.m79407a(C18235k.m78931b().mo78516a());
        c18317q.m79409b(C18221j.m78830c().mo78516a());
        c18317q.m79406a(C18221j.m78830c().m78832b());
        c18317q.m79405a(C18207i.m78741b().mo78516a());
        if (ContextHolder.getResourceContext() != null) {
            c18317q.m79403a(SettingUtil.getSecureInt(ContextHolder.getResourceContext().getContentResolver(), "adb_enabled", 0));
        }
        c18317q.m79408b(m78649c(j, j2));
        try {
            CountDownLatch countDownLatch = this.f55008k;
            if (countDownLatch != null) {
                Logger.m76963i(f54997l, "the netdiag has collected;and the timeout = " + countDownLatch.await(10L, TimeUnit.SECONDS));
            }
            c18317q.m79404a(C18193h.m78641b().mo78516a());
            return c18317q;
        } catch (InterruptedException unused) {
            Logger.m76967w(f54997l, "the wait has timeout! and exit it!");
            return c18317q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public <T> void m78646b(T t) {
        int iM78648c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (t instanceof Boolean) {
            this.f55000c.add((Boolean) t);
            iM78648c = m78651d(jElapsedRealtime);
        } else {
            iM78648c = m78648c(jElapsedRealtime);
        }
        m78642a(iM78648c, this.f54999b);
    }

    /* JADX INFO: renamed from: c */
    private int m78649c(long j, long j2) {
        int iMo78515a = C18207i.m78741b().mo78515a(j, j2);
        return iMo78515a == 0 ? C18221j.m78830c().mo78515a(j, j2) : iMo78515a;
    }

    /* JADX INFO: renamed from: d */
    private boolean m78652d() {
        int size;
        if (this.f55000c.isEmpty() || (size = this.f55000c.size()) < this.f55002e + 1) {
            return false;
        }
        for (int i = size - 1; i >= size - this.f55002e; i--) {
            if (!this.f55000c.get(i).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m78647b() {
        return C18207i.m78741b().mo78516a().mo79440b() > this.f55004g;
    }

    /* JADX INFO: renamed from: c */
    private boolean m78650c() {
        NetworkInfo.DetailedState detailedStateNetworkStatus = NetworkUtil.networkStatus(ContextHolder.getResourceContext());
        int iNetWork = NetworkUtil.netWork(ContextHolder.getResourceContext());
        return detailedStateNetworkStatus != NetworkInfo.DetailedState.CONNECTED || iNetWork == 2 || iNetWork == 3;
    }

    /* JADX INFO: renamed from: b */
    public boolean m78659b(long j, long j2) {
        int iNetWork = NetworkUtil.netWork(ContextHolder.getResourceContext());
        int iM78649c = m78649c(j, j2);
        Logger.m76964i(f54997l, "current_network_chang : %d ,current_network_type: %d", Integer.valueOf(iM78649c), Integer.valueOf(iNetWork));
        return iM78649c != 0 || iNetWork == -1;
    }

    /* JADX INFO: renamed from: a */
    public <T> Future<?> m78657a(T t) {
        String str;
        try {
            return this.f54998a.submit(new a(t));
        } catch (RejectedExecutionException e) {
            e = e;
            str = "the taskExecutor has error! and reject";
            Logger.m76968w(f54997l, str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "the taskExecutor has error! and other exception";
            Logger.m76968w(f54997l, str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78642a(int i, ExecutorService executorService) {
        AbstractC18166f0 abstractC18166f0M78402a;
        Logger.m76965v(f54997l, "the time detect model is : " + i);
        if (i == 0) {
            Logger.m76965v(f54997l, "this time will do nothing!");
            return;
        }
        this.f55008k = new CountDownLatch(1);
        C18152e0 c18152e0 = new C18152e0(executorService);
        c18152e0.m78404a(new C18096a0(this.f55006i));
        if (i == 2) {
            abstractC18166f0M78402a = c18152e0.m78402a();
        } else {
            if (i != 3) {
                Logger.m76963i(f54997l, "the policy model has error! and the model = " + i);
                this.f55008k.countDown();
            }
            C18208i0 c18208i0 = new C18208i0(executorService);
            c18208i0.m78404a(new C18110b0(this.f55006i));
            abstractC18166f0M78402a = c18208i0.m78402a().m78403a(c18152e0);
        }
        this.f55005h = abstractC18166f0M78402a.f54709a.m78520a();
        this.f55008k.countDown();
    }

    /* JADX INFO: renamed from: a */
    public boolean m78658a() {
        String str;
        try {
            Future<?> futureM78657a = m78657a("default");
            if (futureM78657a != null) {
                futureM78657a.get();
            }
            return m78654f();
        } catch (InterruptedException e) {
            e = e;
            str = "the InterruptedException has occur";
            Logger.m76968w(f54997l, str, e);
            return false;
        } catch (ExecutionException e2) {
            e = e2;
            str = "the executionException has occur";
            Logger.m76968w(f54997l, str, e);
            return false;
        } catch (Exception e3) {
            e = e3;
            str = "the other Exception has occur";
            Logger.m76968w(f54997l, str, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m78644a(long j) {
        return j - this.f55004g < (((long) this.f55003f) * C18250l0.g.f55491e) + 300000;
    }
}
