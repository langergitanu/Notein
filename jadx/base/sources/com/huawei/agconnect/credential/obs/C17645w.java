package com.huawei.agconnect.credential.obs;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.OooO0OO;
import o0O00OOO.OooO0o;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.w */
/* JADX INFO: loaded from: classes8.dex */
public class C17645w {

    /* JADX INFO: renamed from: a */
    private static final String f52195a = "AGCHost";

    /* JADX INFO: renamed from: b */
    private static final C17645w f52196b = new C17645w();

    /* JADX INFO: renamed from: c */
    private Map<String, List<C17602ad>> f52197c = new HashMap();

    /* JADX INFO: renamed from: d */
    private Map<String, C17602ad> f52198d = new HashMap();

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f52199e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private String f52200f;

    /* JADX INFO: renamed from: g */
    private HandlerThread f52201g;

    /* JADX INFO: renamed from: h */
    private Handler f52202h;

    private C17645w() {
        HandlerThread handlerThread = new HandlerThread("subThread");
        this.f52201g = handlerThread;
        handlerThread.start();
        this.f52202h = new Handler(this.f52201g.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static final C17645w m75607a() {
        return f52196b;
    }

    /* JADX INFO: renamed from: b */
    private C17602ad m75616b(String str) {
        return C17602ad.m75433b(str);
    }

    /* JADX INFO: renamed from: a */
    private String m75608a(AGConnectInstance aGConnectInstance, List<C17614ap> list) {
        for (C17614ap c17614ap : list) {
            if (c17614ap.m75495a().equalsIgnoreCase(aGConnectInstance.getOptions().getRoutePolicy().getRouteName())) {
                return c17614ap.m75496b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C17602ad> m75617a(AGConnectInstance aGConnectInstance) {
        long j;
        List<C17602ad> listAsList;
        List<C17602ad> list;
        long j2;
        String identifier = aGConnectInstance.getIdentifier();
        if (this.f52197c.containsKey(identifier)) {
            list = this.f52197c.get(identifier);
            j2 = 0;
        } else {
            C17602ad c17602ad = new C17602ad(aGConnectInstance.getOptions().getString("agcgw/url"), aGConnectInstance.getOptions().getString("agcgw/backurl"));
            C17602ad c17602ad2 = this.f52198d.get(identifier);
            if (c17602ad2 != null) {
                j = c17602ad2.validTime;
                listAsList = Arrays.asList(c17602ad2, c17602ad);
            } else {
                C17602ad c17602adM75616b = m75616b(identifier);
                j = c17602adM75616b.validTime;
                if (c17602adM75616b.m75444g()) {
                    this.f52198d.put(identifier, c17602adM75616b);
                    listAsList = Arrays.asList(c17602adM75616b, c17602ad);
                } else {
                    listAsList = Collections.singletonList(c17602ad);
                }
            }
            this.f52197c.put(identifier, listAsList);
            list = listAsList;
            j2 = j;
        }
        m75611a(aGConnectInstance, j2);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75610a(int i, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, i);
        long time = calendar.getTime().getTime();
        C17602ad c17602ad = this.f52198d.get(str);
        if (c17602ad != null) {
            c17602ad.validTime = time;
        }
        Logger.m75329i(f52195a, "updateTTL:" + time);
        C17602ad.m75431a(str, time);
    }

    /* JADX INFO: renamed from: a */
    private void m75611a(final AGConnectInstance aGConnectInstance, long j) {
        if (this.f52199e.get() || !m75615a(j)) {
            return;
        }
        this.f52199e.set(true);
        this.f52202h.postDelayed(new Runnable() { // from class: com.huawei.agconnect.credential.obs.w.1
            @Override // java.lang.Runnable
            public void run() {
                Logger.m75329i(C17645w.f52195a, "getCachedHostAsync#start");
                C17616ar c17616ar = new C17616ar(aGConnectInstance);
                c17616ar.m75500a(C17645w.this.f52200f);
                BackendService.sendRequest(c17616ar, 1, C17617as.class, new BackendService.Options.Builder().app(aGConnectInstance).clientToken(false).build()).OooO0O0(C25835OooO0oo.f88151OooO0Oo.f88152OooO00o, new OooO0OO<C17617as>() { // from class: com.huawei.agconnect.credential.obs.w.1.1
                    @Override // o0O00OOO.OooO0OO
                    public void onComplete(OooO0o<C17617as> oooO0o) {
                        int iNextInt = new Random().nextInt(172801) + C18437z2.f56762p;
                        Logger.m75329i(C17645w.f52195a, "default ttl=" + iNextInt);
                        if (oooO0o.OooO()) {
                            C17617as c17617asOooO0oO = oooO0o.OooO0oO();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            C17645w.this.m75612a(aGConnectInstance, c17617asOooO0oO);
                            try {
                                iNextInt = Integer.parseInt(c17617asOooO0oO.m75504d());
                            } catch (NumberFormatException unused) {
                                Logger.m75329i(C17645w.f52195a, "parse ttl failed, use default instead");
                            }
                        }
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        C17645w.this.m75610a(iNextInt, aGConnectInstance.getIdentifier());
                    }
                });
            }
        }, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75612a(AGConnectInstance aGConnectInstance, C17617as c17617as) {
        String strM75608a = m75608a(aGConnectInstance, c17617as.m75502b());
        String strM75608a2 = m75608a(aGConnectInstance, c17617as.m75503c());
        Logger.m75326d(f52195a, "cached main host:" + strM75608a);
        Logger.m75326d(f52195a, "cached backup host:" + strM75608a2);
        String identifier = aGConnectInstance.getIdentifier();
        if (TextUtils.isEmpty(strM75608a) || TextUtils.isEmpty(strM75608a2)) {
            this.f52198d.remove(identifier);
            C17602ad.m75434c(identifier);
        } else {
            C17602ad c17602ad = new C17602ad(strM75608a, strM75608a2);
            this.f52198d.put(identifier, c17602ad);
            c17602ad.m75437a(identifier);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75618a(String str) {
        if ("agconnect-credential".equals(str)) {
            return;
        }
        this.f52200f = str;
    }

    /* JADX INFO: renamed from: a */
    private boolean m75615a(long j) {
        return Calendar.getInstance().getTime().after(new Date(j));
    }
}
