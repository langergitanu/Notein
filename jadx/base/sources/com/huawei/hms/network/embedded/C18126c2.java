package com.huawei.hms.network.embedded;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.text.TextUtils;
import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.embedded.AbstractC18113b3;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18126c2 {

    /* JADX INFO: renamed from: A */
    public static volatile C18126c2 f54369A = null;

    /* JADX INFO: renamed from: s */
    public static final String f54370s = "DNManager";

    /* JADX INFO: renamed from: t */
    public static final String f54371t = "DNS_DNManager";

    /* JADX INFO: renamed from: u */
    public static final int f54372u = 5;

    /* JADX INFO: renamed from: v */
    public static final int f54373v = 3;

    /* JADX INFO: renamed from: w */
    public static final String f54374w = "airoute_conf";

    /* JADX INFO: renamed from: x */
    public static final String f54375x = "launch_used_domain";

    /* JADX INFO: renamed from: y */
    public static final long f54376y = 300000;

    /* JADX INFO: renamed from: z */
    public static final long f54377z = 120000;

    /* JADX INFO: renamed from: b */
    public String[] f54379b;

    /* JADX INFO: renamed from: i */
    public AbstractC18113b3.c f54386i;

    /* JADX INFO: renamed from: j */
    public Context f54387j;

    /* JADX INFO: renamed from: k */
    public InterfaceC18372u2 f54388k;

    /* JADX INFO: renamed from: l */
    public C18398w2 f54389l;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet<String> f54378a = new LinkedHashSet<>(5);

    /* JADX INFO: renamed from: c */
    public final PLSharedPreferences f54380c = new PLSharedPreferences(ContextHolder.getAppContext(), f54374w);

    /* JADX INFO: renamed from: d */
    public volatile boolean f54381d = false;

    /* JADX INFO: renamed from: e */
    public boolean f54382e = false;

    /* JADX INFO: renamed from: f */
    public volatile boolean f54383f = false;

    /* JADX INFO: renamed from: g */
    public final Object f54384g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f54385h = new Object();

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap<String, C18182g2> f54390m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap<String, f> f54391n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o */
    public final ExecutorService f54392o = ExecutorsUtils.newSingleThreadExecutor(f54371t);

    /* JADX INFO: renamed from: p */
    public final ThreadLocal<Integer> f54393p = new a();

    /* JADX INFO: renamed from: q */
    public final ThreadLocal<Long> f54394q = new b();

    /* JADX INFO: renamed from: r */
    public final ThreadLocal<Integer> f54395r = new c();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$a */
    public class a extends ThreadLocal<Integer> {
        public a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Integer initialValue() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$b */
    public class b extends ThreadLocal<Long> {
        public b() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Long initialValue() {
            return Long.valueOf(Utils.getCurrentTime(true));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$c */
    public class c extends ThreadLocal<Integer> {
        public c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Integer initialValue() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C18385v2 c18385v2 : C18126c2.this.f54389l.m79822a(new ArrayList(Arrays.asList(C18126c2.this.m78051k())))) {
                if (!TextUtils.isEmpty(c18385v2.m79684c())) {
                    C18224j2.m78843a(c18385v2.m79684c(), c18385v2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f54400a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f54401b;

        public e(String str, List list) {
            this.f54400a = str;
            this.f54401b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                C18182g2 c18182g2 = (C18182g2) C18126c2.this.f54390m.get(this.f54400a);
                if (c18182g2 == null) {
                    str = "the dnsInfo is empty from map,and return";
                } else if (Math.abs(Utils.getCurrentTime(true) - c18182g2.m78557b()) < 300000) {
                    str = "the dns change time is less than 5 min, and return";
                } else {
                    C18385v2 c18385v2M78840a = C18224j2.m78840a(this.f54400a);
                    if (c18385v2M78840a == null) {
                        str = "the domainResult is empty from cache,and return";
                    } else {
                        List<InetAddress> listM78669a = C18196h2.m78669a(c18385v2M78840a.m79686d());
                        if (listM78669a.size() == 0 || this.f54401b.size() == 0) {
                            str = "the address or list is empty,and return";
                        } else {
                            if (!this.f54401b.contains(listM78669a.get(0))) {
                                if (C18167f1.m78405a(listM78669a.get(0), (InetAddress) this.f54401b.get(0)) == 1) {
                                    c18182g2.m78555a(2);
                                    Logger.m76964i(C18126c2.f54370s, "after checking the threshold, the dns_type: %d need to change, and the host is %s", Integer.valueOf(c18182g2.m78559d()), this.f54400a);
                                    return;
                                } else {
                                    c18182g2.m78556a(Utils.getCurrentTime(true));
                                    Logger.m76964i(C18126c2.f54370s, "after checking the threshold, the dns_type: %d will use the origin status,the host is %s", Integer.valueOf(c18182g2.m78559d()), this.f54400a);
                                    return;
                                }
                            }
                            str = "the ip from local and the ip from dnkeeper is same,and return";
                        }
                    }
                }
                Logger.m76965v(C18126c2.f54370s, str);
            } catch (ConcurrentModificationException unused) {
                Logger.m76963i(C18126c2.f54370s, "dns and dnkeeper has exception with racing,and you need not care it");
            } catch (Throwable unused2) {
                Logger.m76965v(C18126c2.f54370s, "dns and dnkeeper has throwable with racing,and you need not care it");
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public String f54403a;

        /* JADX INFO: renamed from: b */
        public int f54404b = 0;

        /* JADX INFO: renamed from: a */
        public int m78081a() {
            return this.f54404b;
        }

        /* JADX INFO: renamed from: b */
        public String m78084b() {
            return this.f54403a;
        }

        /* JADX INFO: renamed from: a */
        public void m78082a(int i) {
            this.f54404b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m78083a(String str) {
            this.f54403a = str;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$g */
    public class g implements Runnable {
        public g(Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18256l6.m79045b().m79047a(new C18140d2());
            if (C18168f2.m78411b() == 0) {
                C18224j2.m78846c();
            }
            for (String str : C18126c2.this.m78051k()) {
                Logger.m76965v(C18126c2.f54370s, "init dnsLazyUpdate domain: " + str);
                C18307p2.m79339a(str, "dns_init", 2);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$h */
    public @interface h {

        /* JADX INFO: renamed from: a */
        public static final String f54406a = "dns_init";

        /* JADX INFO: renamed from: b */
        public static final String f54407b = "dns_prefecth";

        /* JADX INFO: renamed from: c */
        public static final String f54408c = "dns_lazy_update";

        /* JADX INFO: renamed from: d */
        public static final String f54409d = "dns_sync_query";

        /* JADX INFO: renamed from: e */
        public static final String f54410e = "dns_network_change";

        /* JADX INFO: renamed from: f */
        public static final String f54411f = "dns_file_load";
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c2$i */
    public @interface i {

        /* JADX INFO: renamed from: g */
        public static final int f54412g = 0;

        /* JADX INFO: renamed from: h */
        public static final int f54413h = 1;

        /* JADX INFO: renamed from: i */
        public static final int f54414i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f54415j = 3;
    }

    /* JADX INFO: renamed from: h */
    private void m78046h(String str) {
        C18182g2 c18182g2 = this.f54390m.get(str);
        if (c18182g2 == null || c18182g2.m78559d() != 2) {
            return;
        }
        c18182g2.m78554a();
    }

    /* JADX INFO: renamed from: j */
    public static C18126c2 m78048j() {
        if (f54369A == null) {
            synchronized (C18126c2.class) {
                try {
                    if (f54369A == null) {
                        f54369A = new C18126c2();
                    }
                } finally {
                }
            }
        }
        return f54369A;
    }

    /* JADX INFO: renamed from: k */
    private void m78050k(String str) {
        synchronized (this.f54385h) {
            try {
                if (this.f54378a.size() < 5) {
                    this.f54378a.add(str);
                    this.f54380c.edit().putString(f54375x, ContainerUtils.toString(new LinkedList(this.f54378a))).apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m78052l(String str) {
        C18182g2 c18182g2 = this.f54390m.get(str);
        if (c18182g2 == null) {
            return false;
        }
        long jM78560e = c18182g2.m78560e();
        long jAbs = Math.abs(Utils.getCurrentTime(true) - c18182g2.m78558c());
        if (jM78560e > 3 && jAbs > f54377z) {
            return true;
        }
        Logger.m76966v(f54370s, "domain = %s ,times = %d, and failure interval = %d", str, Long.valueOf(jM78560e), Long.valueOf(jAbs));
        return false;
    }

    /* JADX INFO: renamed from: a */
    public Context m78053a() {
        return this.f54387j;
    }

    /* JADX INFO: renamed from: b */
    public f m78063b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f54391n.get(str);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC18113b3.c m78066c() {
        if (this.f54386i == null) {
            this.f54386i = AbstractC18113b3.m77923a(AbstractC18113b3.f54245a);
        }
        return this.f54386i;
    }

    /* JADX INFO: renamed from: d */
    public C18398w2 m78069d() {
        return this.f54389l;
    }

    /* JADX INFO: renamed from: e */
    public int m78072e() {
        return this.f54393p.get().intValue();
    }

    /* JADX INFO: renamed from: f */
    public int m78075f() {
        return this.f54395r.get().intValue();
    }

    /* JADX INFO: renamed from: g */
    public ThreadLocal<Long> m78077g() {
        return this.f54394q;
    }

    /* JADX INFO: renamed from: i */
    public void m78080i() {
        this.f54394q.set(Long.valueOf(Utils.getCurrentTime(true)));
    }

    /* JADX INFO: renamed from: i */
    public static void m78047i(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f54370s, "dnsPrefetch, domain is empty");
        } else {
            C18307p2.m79339a(str, h.f54407b, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m78049j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C18182g2 c18182g2M78073e = m78073e(str);
        if (c18182g2M78073e == null) {
            c18182g2M78073e = new C18182g2();
        }
        int iM78075f = m78075f();
        int i2 = 3;
        if (iM78075f != 1) {
            if (iM78075f == 2 || !(iM78075f != 3 || m78069d() == null || str.equals(m78069d().m79823b().m79857b()))) {
                c18182g2M78073e.m78556a(Utils.getCurrentTime(true));
                i2 = 1;
            } else {
                i2 = 2;
            }
        } else if (!m78079h()) {
        }
        m78074e(i2);
        c18182g2M78073e.m78555a(i2);
        m78060a(str, c18182g2M78073e);
        Logger.m76964i(f54370s, OooO00o.OooO0OO(new StringBuilder(), str, " switch resolve source, from: %s, to: %s"), m78054a(iM78075f), m78054a(c18182g2M78073e.m78559d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public String[] m78051k() {
        if (this.f54379b == null) {
            this.f54379b = this.f54380c.getString(f54375x, "").split("&");
        }
        String[] strArr = this.f54379b;
        return (strArr.length == 1 && TextUtils.isEmpty(strArr[0])) ? new String[0] : (String[]) this.f54379b.clone();
    }

    /* JADX INFO: renamed from: a */
    public String m78054a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "Default" : "HttpDns" : "LocalDns" : "DNKeeper";
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC18372u2 m78064b() {
        return this.f54388k;
    }

    /* JADX INFO: renamed from: c */
    public List<InetAddress> m78067c(String str) throws UnknownHostException {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        int iM78075f = m78075f();
        if (iM78075f == 0) {
            iM78075f = m78076f(str);
        }
        Logger.m76964i(f54370s, C21111o0ooOoO.OooO0Oo(str, " dns resolve source is %s first"), m78054a(iM78075f));
        C18385v2 c18385v2M78840a = iM78075f != 1 ? C18224j2.m78840a(str) : null;
        if (C18196h2.m78675b(c18385v2M78840a)) {
            Logger.m76965v(f54370s, "cache is empty, sync query host: " + str);
            c18385v2M78840a = C18307p2.m79338a(str, iM78075f);
        } else {
            Logger.m76963i(f54370s, str + " from cache result is: " + c18385v2M78840a);
        }
        if (!C18196h2.m78675b(c18385v2M78840a)) {
            List<String> listM79686d = c18385v2M78840a.m79686d();
            Logger.m76966v(f54370s, "Compound ips of %s:" + listM79686d, str);
            m78042a(listM79686d, str);
            List<InetAddress> listM78669a = C18196h2.m78669a(listM79686d);
            if (!listM78669a.isEmpty()) {
                m78071d(c18385v2M78840a.m79673a());
                if (iM78075f == 1 && !m78079h()) {
                    C18099a3.m77842a().m77844a(new e(str, new ArrayList(listM78669a)));
                }
                try {
                    return C18167f1.m78406a(listM78669a);
                } catch (ConcurrentModificationException e2) {
                    e = e2;
                    Logger.m76969w(f54370s, "the ai module has exception: %s ,and skip it", e.getClass().getName());
                    HianalyticsHelper.getInstance().reportException(e, "crash");
                    return listM78669a;
                } catch (Throwable th) {
                    e = th;
                    Logger.m76969w(f54370s, "the ai module has throwable: %s ,and skip it", e.getClass().getName());
                    HianalyticsHelper.getInstance().reportException(e, "crash");
                    return listM78669a;
                }
            }
        }
        return C18196h2.m78673b(str);
    }

    /* JADX INFO: renamed from: d */
    public String m78070d(String str) {
        return m78054a(m78076f(str));
    }

    /* JADX INFO: renamed from: e */
    public C18182g2 m78073e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C18182g2 c18182g2 = this.f54390m.get(str);
        if (c18182g2 == null) {
            c18182g2 = new C18182g2();
            c18182g2.m78555a(m78079h() ? 3 : 2);
            C18182g2 c18182g2PutIfAbsent = this.f54390m.putIfAbsent(str, c18182g2);
            if (c18182g2PutIfAbsent != null) {
                return c18182g2PutIfAbsent;
            }
        }
        return c18182g2;
    }

    /* JADX INFO: renamed from: f */
    public int m78076f(String str) {
        C18182g2 c18182g2M78073e = m78073e(str);
        if (c18182g2M78073e == null) {
            return 2;
        }
        return c18182g2M78073e.m78559d();
    }

    /* JADX INFO: renamed from: g */
    public void m78078g(String str) {
        m78080i();
        m78074e(m78076f(str));
        m78050k(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m78079h() {
        return this.f54382e;
    }

    /* JADX INFO: renamed from: a */
    public void m78055a(Context context, InterfaceC18372u2 interfaceC18372u2) {
        if (context == null) {
            Logger.m76960e(f54370s, "invalid parameter");
            return;
        }
        this.f54387j = context.getApplicationContext();
        if (interfaceC18372u2 != null) {
            Logger.m76965v(f54370s, "enter DnsUtil.doRespone" + interfaceC18372u2);
            this.f54388k = interfaceC18372u2;
        }
        if (this.f54381d) {
            return;
        }
        synchronized (C18126c2.class) {
            try {
                if (!this.f54381d) {
                    this.f54381d = true;
                    this.f54392o.execute(new g(context));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m78071d(int i2) {
        this.f54393p.set(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: e */
    public void m78074e(int i2) {
        this.f54395r.set(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public void m78056a(AbstractC18113b3.c cVar) {
        if (cVar == null) {
            return;
        }
        this.f54386i = cVar;
    }

    /* JADX INFO: renamed from: b */
    public void m78065b(int i2) {
        int i3 = i2 * 1000;
        if (i3 < 60000 || i3 >= 86400000) {
            Logger.m76967w(f54370s, "the ttl parameter invalid, set to default:600000");
            i3 = 600000;
        }
        C18168f2.m78410a(i3);
    }

    /* JADX INFO: renamed from: a */
    public void m78057a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f54391n.remove(str);
        m78046h(str);
    }

    /* JADX INFO: renamed from: a */
    public void m78058a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C18182g2 c18182g2 = this.f54390m.get(str);
        if (c18182g2 == null) {
            c18182g2 = new C18182g2();
        }
        c18182g2.m78555a(i2);
        this.f54390m.put(str, c18182g2);
    }

    /* JADX INFO: renamed from: a */
    public void m78059a(String str, f fVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f54391n.put(str, fVar);
    }

    /* JADX INFO: renamed from: a */
    public void m78060a(String str, C18182g2 c18182g2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f54390m.put(str, c18182g2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> void m78061a(String str, T t) {
        Logger.m76965v(f54370s, "enter DnsUtil.doResponse");
        if (TextUtils.isEmpty(str) || t == 0) {
            Logger.m76967w(f54370s, "invalid parameter");
            return;
        }
        int iM78754a = t instanceof IOException ? C18210i2.m78754a((IOException) t) : t instanceof Integer ? C18210i2.m78753a(((Integer) t).intValue()) : 0;
        int iM78075f = m78075f();
        if (m78064b() != null && iM78754a != 0) {
            long currentTime = Utils.getCurrentTime(true);
            if (iM78075f == 2 && AbstractC18151e.m78274c().mo78282b(this.f54394q.get().longValue(), currentTime) && !m78052l(str)) {
                this.f54394q.set(Long.valueOf(currentTime));
                Logger.m76963i(f54370s, "network has changed,and dns_type need n't change");
            } else {
                m78049j(str);
            }
        }
        if (iM78754a == 0) {
            m78057a(str);
            return;
        }
        if (m78064b() != null) {
            if (iM78075f == 1) {
                m78064b().mo78295a(str);
            }
            f fVarM78063b = m78063b(str);
            if (fVarM78063b != null) {
                fVarM78063b.m78082a(iM78754a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78042a(List<String> list, String str) {
        if (list == null || list.size() <= 0) {
            return;
        }
        f fVar = new f();
        fVar.m78083a(list.get(0));
        m78059a(str, fVar);
    }

    /* JADX INFO: renamed from: c */
    public void m78068c(int i2) {
        InterfaceC18372u2 interfaceC18372u2 = this.f54388k;
        if (interfaceC18372u2 != null) {
            interfaceC18372u2.mo78294a(i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78062a(boolean z) {
        if (!z) {
            this.f54382e = false;
            return;
        }
        if (!this.f54381d) {
            Logger.m76967w(f54370s, "RestClient or DNManager must init first");
            return;
        }
        if (!this.f54383f) {
            synchronized (this.f54384g) {
                try {
                    if (!this.f54383f) {
                        this.f54383f = true;
                        if (this.f54389l == null) {
                            this.f54389l = new C18398w2();
                        }
                        if (TextUtils.isEmpty(this.f54389l.m79821a())) {
                            Logger.m76967w(f54370s, "HttpDns baseUrl is null");
                            return;
                        }
                        this.f54392o.execute(new d());
                    }
                } finally {
                }
            }
        }
        this.f54382e = true;
    }
}
