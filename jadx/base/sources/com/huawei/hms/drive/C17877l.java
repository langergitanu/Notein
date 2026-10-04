package com.huawei.hms.drive;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.ThreadPoolExcutorEnhance;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.restclient.dnkeeper.R;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.embedded.C18126c2;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18424y2;
import com.huawei.hms.network.httpclient.HttpClient;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.drive.l */
/* JADX INFO: loaded from: classes6.dex */
public class C17877l {

    /* JADX INFO: renamed from: a */
    private static volatile C17877l f53413a = new C17877l();

    /* JADX INFO: renamed from: b */
    private volatile HttpClient f53414b;

    /* JADX INFO: renamed from: f */
    private String f53418f;

    /* JADX INFO: renamed from: g */
    private int f53419g;

    /* JADX INFO: renamed from: i */
    private PLSharedPreferences f53421i;

    /* JADX INFO: renamed from: l */
    private String f53424l;

    /* JADX INFO: renamed from: m */
    private List<String> f53425m;

    /* JADX INFO: renamed from: c */
    private volatile boolean f53415c = false;

    /* JADX INFO: renamed from: d */
    private volatile boolean f53416d = false;

    /* JADX INFO: renamed from: e */
    private volatile int f53417e = 60000;

    /* JADX INFO: renamed from: h */
    private ConcurrentHashMap<String, C17883r> f53420h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    private final ExecutorService f53422j = new ThreadPoolExcutorEnhance(8, 16, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), ExecutorsUtils.createThreadFactory("DNKeeper_DNKeeperManager"));

    /* JADX INFO: renamed from: k */
    private final Object f53423k = new Object();

    /* JADX INFO: renamed from: com.huawei.hms.drive.l$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f53426a;

        public a(Context context) {
            this.f53426a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17877l.this.f53421i = new PLSharedPreferences(this.f53426a, "share_pre_dns");
            String string = C17877l.this.f53421i.getString("whiteDomainRecords");
            if (!TextUtils.isEmpty(string)) {
                C17877l.this.f53425m = Arrays.asList(string.split("&"));
            }
            C17877l c17877l = C17877l.this;
            c17877l.f53414b = c17877l.m76814d();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.l$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f53428a;

        public b(String str) {
            this.f53428a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM76843a = C17882q.m76843a(C17877l.this.f53421i, this.f53428a);
            Logger.m76965v("DNKeeperManager", "checkDNKeeperIP " + zM76843a);
            if (zM76843a) {
                C17878m c17878m = new C17878m(this.f53428a);
                c17878m.m76818a(true);
                C17881p c17881p = new C17881p();
                c17881p.put(C18424y2.f56686f, "dns_init");
                C17877l.this.m76804b(c17878m, this.f53428a, c17881p);
            }
        }
    }

    private C17877l() {
    }

    /* JADX INFO: renamed from: a */
    public static C17877l m76793a() {
        return f53413a;
    }

    /* JADX INFO: renamed from: b */
    private HashMap<String, C17883r> m76803b(Set<String> set) {
        C17883r c17883rPutIfAbsent;
        HashMap<String, C17883r> map = new HashMap<>();
        if (set != null) {
            for (String str : set) {
                C17883r c17883r = this.f53420h.get(str);
                if (c17883r != null || (c17883rPutIfAbsent = this.f53420h.putIfAbsent(str, (c17883r = new C17883r()))) == null) {
                    c17883rPutIfAbsent = c17883r;
                }
                map.put(str, c17883rPutIfAbsent);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    private C17883r m76806c(String str) {
        C17883r c17883rPutIfAbsent;
        synchronized (this.f53423k) {
            try {
                C17883r c17883r = this.f53420h.get(str);
                if (c17883r != null || (c17883rPutIfAbsent = this.f53420h.putIfAbsent(str, (c17883r = new C17883r()))) == null) {
                    c17883rPutIfAbsent = c17883r;
                }
            } finally {
            }
        }
        return c17883rPutIfAbsent;
    }

    /* JADX INFO: renamed from: e */
    private Set<String> m76807e() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f53421i;
        Set<String> setKeySet = (pLSharedPreferences == null || (all = pLSharedPreferences.getAll()) == null) ? null : all.keySet();
        if (setKeySet != null) {
            setKeySet.remove("whiteDomainRecords");
            setKeySet.remove("dnkeeperSP");
        }
        return setKeySet;
    }

    /* JADX INFO: renamed from: d */
    public HttpClient m76814d() {
        if (this.f53414b == null) {
            synchronized (this.f53423k) {
                try {
                    if (this.f53414b == null) {
                        this.f53414b = new HttpClient.Builder().build();
                    }
                } finally {
                }
            }
        }
        return this.f53414b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m76804b(C17878m c17878m, String str, C17881p c17881p) {
        String strM76815a = c17878m.m76815a();
        C17883r c17883rM76806c = m76806c(strM76815a);
        if (m76802a(c17883rM76806c)) {
            return;
        }
        Set<String> setM76807e = m76807e();
        HashSet<C17878m> hashSetM76797a = m76797a(setM76807e);
        HashMap<String, C17883r> mapM76803b = m76803b(setM76807e);
        mapM76803b.put(strM76815a, c17883rM76806c);
        hashSetM76797a.add(c17878m);
        synchronized (this.f53423k) {
            Future futureM76850c = c17883rM76806c.m76850c();
            if (futureM76850c == null) {
                futureM76850c = m76800a(hashSetM76797a, str, mapM76803b, c17881p);
                Logger.m76963i("DNKeeperManager", "future == null");
                c17883rM76806c.m76844a(0L);
                c17883rM76806c.m76846a(futureM76850c);
            }
            Logger.m76965v("DNKeeperManager", "submitLazyRequest future = " + futureM76850c);
        }
    }

    /* JADX INFO: renamed from: a */
    public C17884s m76808a(C17878m c17878m) {
        C17884s c17884s = new C17884s();
        if (c17878m != null) {
            String strM76815a = c17878m.m76815a();
            Logger.m76963i("DNKeeperManager", strM76815a + " query mode is single");
            String strM76813c = m76813c();
            C17881p c17881p = new C17881p();
            if (!TextUtils.isEmpty(strM76815a) && !TextUtils.isEmpty(strM76813c) && ContextHolder.getAppContext() != null) {
                String strSubstring = StringUtils.substring(strM76815a, strM76815a.lastIndexOf(".", strM76815a.lastIndexOf(".") - 1) + 1);
                List<String> list = this.f53425m;
                if (list == null || list.contains(strSubstring) || this.f53425m.isEmpty()) {
                    if (strM76815a.equals(strM76813c)) {
                        PLSharedPreferences pLSharedPreferences = this.f53421i;
                        if (pLSharedPreferences != null) {
                            c17884s = C17882q.m76838a(pLSharedPreferences.getString(strM76815a));
                        }
                        if (C17882q.m76842a(c17884s)) {
                            c17884s = C17882q.m76837a(c17884s, this.f53424l);
                        }
                        c17884s.m76853a(1);
                        return c17884s;
                    }
                    C17883r c17883r = this.f53420h.get(strM76815a);
                    if (c17883r != null) {
                        c17884s = c17883r.m76851d();
                        if (!C17882q.m76842a(c17884s)) {
                            Logger.m76963i("DNKeeperManager", strM76815a.concat(" queryIps from Map"));
                            if (c17883r.m76848a() && System.currentTimeMillis() - c17884s.m76858b() > 60000) {
                                Logger.m76963i("DNKeeperManager", "lazyUpdate domain: ".concat(strM76815a));
                                c17881p.put(C18424y2.f56686f, C18126c2.h.f54408c);
                                m76804b(c17878m, strM76813c, c17881p);
                            }
                            c17884s.m76853a(1);
                            return c17884s;
                        }
                    }
                    PLSharedPreferences pLSharedPreferences2 = this.f53421i;
                    if (pLSharedPreferences2 != null) {
                        c17884s = C17882q.m76838a(pLSharedPreferences2.getString(strM76815a));
                        int iM76860d = c17884s.m76860d();
                        if (!C17882q.m76842a(c17884s) && iM76860d != 2) {
                            c17884s.m76853a(1);
                            Logger.m76963i("DNKeeperManager", strM76815a.concat(" queryIps from SharePreference"));
                            if (iM76860d == 1) {
                                c17881p.put(C18424y2.f56686f, C18126c2.h.f54408c);
                                m76804b(c17878m, strM76813c, c17881p);
                            }
                            return c17884s;
                        }
                    }
                    m76805b(strM76813c);
                    c17881p.put(C18424y2.f56686f, "dns_sync_query");
                    Future futureM76799a = m76799a(c17878m, strM76813c, c17881p);
                    if (futureM76799a != null) {
                        try {
                            c17884s = (C17884s) futureM76799a.get(this.f53419g, TimeUnit.MILLISECONDS);
                        } catch (Exception e) {
                            Logger.m76968w("DNKeeperManager", "queryIpsSync failed ", e);
                        }
                        if (!C17882q.m76842a(c17884s)) {
                            c17884s.m76853a(0);
                            Logger.m76963i("DNKeeperManager", strM76815a.concat("queryIps from dnkeeper service"));
                        }
                    }
                }
            }
        }
        return c17884s;
    }

    /* JADX INFO: renamed from: c */
    public String m76813c() {
        String strSynGetGrsUrl = new GrsClient(ContextHolder.getResourceContext(), new GrsBaseInfo()).synGetGrsUrl("com.huawei.dnkeeper", "ROOT");
        Logger.m76965v("DNKeeperManager", "getDomainName: " + strSynGetGrsUrl);
        if (!TextUtils.isEmpty(strSynGetGrsUrl) && strSynGetGrsUrl.contains(C18241k5.f55433h)) {
            String[] strArrSplit = strSynGetGrsUrl.split(C18241k5.f55433h);
            if (strArrSplit.length == 3) {
                strSynGetGrsUrl = strArrSplit[0] + C18241k5.f55433h + strArrSplit[1];
                this.f53424l = strArrSplit[2];
            }
        }
        if (TextUtils.isEmpty(NetworkUtil.getHost(strSynGetGrsUrl))) {
            PLSharedPreferences pLSharedPreferences = this.f53421i;
            if (pLSharedPreferences != null) {
                strSynGetGrsUrl = pLSharedPreferences.getString("dnkeeperSP");
            }
            if (TextUtils.isEmpty(NetworkUtil.getHost(strSynGetGrsUrl))) {
                strSynGetGrsUrl = this.f53418f;
            }
        }
        return NetworkUtil.getHost(strSynGetGrsUrl);
    }

    /* JADX INFO: renamed from: b */
    private void m76805b(String str) {
        if (this.f53416d) {
            return;
        }
        synchronized (C17877l.class) {
            try {
                if (this.f53416d) {
                    return;
                }
                this.f53416d = true;
                this.f53422j.execute(new b(str));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m76812b() {
        return this.f53415c;
    }

    /* JADX INFO: renamed from: a */
    private HashSet<C17878m> m76797a(Set<String> set) {
        HashSet<C17878m> hashSet = new HashSet<>();
        if (set != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                C17878m c17878m = new C17878m(it.next());
                c17878m.m76818a(true);
                c17878m.m76820b("lazyUpdate");
                hashSet.add(c17878m);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private Future m76799a(C17878m c17878m, String str, C17881p c17881p) {
        Future futureM76850c;
        C17883r c17883rM76806c = m76806c(c17878m.m76815a());
        if (m76802a(c17883rM76806c)) {
            return null;
        }
        synchronized (this.f53423k) {
            futureM76850c = c17883rM76806c.m76850c();
            if (futureM76850c == null) {
                Logger.m76963i("DNKeeperManager", "future == null");
                futureM76850c = this.f53422j.submit(new CallableC17880o(c17878m, str, c17883rM76806c, this.f53421i, c17881p));
                c17883rM76806c.m76844a(0L);
                c17883rM76806c.m76846a(futureM76850c);
            }
            Logger.m76965v("DNKeeperManager", "submitRequest future = " + futureM76850c);
        }
        return futureM76850c;
    }

    /* JADX INFO: renamed from: a */
    private Future m76800a(HashSet<C17878m> hashSet, String str, HashMap<String, C17883r> map, C17881p c17881p) {
        return this.f53422j.submit(new CallableC17879n(hashSet, str, map, this.f53421i, c17881p));
    }

    /* JADX INFO: renamed from: a */
    public void m76809a(Context context) {
        m76810a(context, 10000);
    }

    /* JADX INFO: renamed from: a */
    public void m76810a(Context context, int i) {
        CheckParamUtils.checkNotNull(context, "context == null");
        Context applicationContext = context.getApplicationContext();
        NetworkKit.init(applicationContext, null);
        try {
            this.f53418f = ContextHolder.getResourceContext().getString(R.string.networkkit_dnkeeper_domain);
        } catch (Throwable th) {
            Logger.m76965v("DNKeeperManager", "DEFAULT_DOMAIN_NAME failed: " + th);
        }
        Logger.m76965v("DNKeeperManager", "defaultDomain " + this.f53418f);
        if (i < 0 || i > 10000) {
            Logger.m76967w("DNKeeperManager", "maybe you need set a time between 0-10000");
            i = 10000;
        }
        this.f53419g = i;
        if (this.f53415c) {
            return;
        }
        this.f53415c = true;
        this.f53422j.execute(new a(applicationContext));
    }

    /* JADX INFO: renamed from: a */
    private boolean m76802a(C17883r c17883r) {
        long jCurrentTimeMillis = System.currentTimeMillis() - c17883r.m76849b();
        if (jCurrentTimeMillis >= this.f53417e) {
            return false;
        }
        Logger.m76963i("DNKeeperManager", "now - time = " + jCurrentTimeMillis);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76811a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Logger.m76965v("DNKeeperManager", "removeCache host: " + str);
        C17883r c17883r = this.f53420h.get(str);
        if (c17883r != null) {
            c17883r.m76847a(true);
        }
        return true;
    }
}
