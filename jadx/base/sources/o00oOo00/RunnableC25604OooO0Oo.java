package o00oOo00;

import android.os.Handler;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oOo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC25604OooO0Oo implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis() - 10000;
        ConcurrentHashMap<String, OooOOO0> concurrentHashMap = OooOO0O.f87373OooO0Oo;
        Date date = new Date(jCurrentTimeMillis);
        ConcurrentHashMap<String, OooOOO0> concurrentHashMap2 = OooOO0O.f87373OooO0Oo;
        synchronized (concurrentHashMap2) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, OooOOO0> entry : concurrentHashMap2.entrySet()) {
                    if (entry.getValue().f87384OooO0O0.compareTo(date) < 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    ((OooOOO0) entry2.getValue()).f87383OooO00o.clear();
                    OooOO0O.f87373OooO0Oo.remove(entry2.getKey());
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ((Handler) C25605OooO0o0.f87356OooO0o0.getValue()).postDelayed(C25605OooO0o0.f87357OooO0oO, 10000L);
    }
}
