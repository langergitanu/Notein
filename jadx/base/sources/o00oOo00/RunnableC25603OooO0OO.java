package o00oOo00;

import android.os.Handler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o00oOo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC25603OooO0OO implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        float andSet = C25605OooO0o0.f87351OooO00o.getAndSet(0);
        float andSet2 = C25605OooO0o0.f87352OooO0O0.getAndSet(0);
        float andSet3 = C25605OooO0o0.f87353OooO0OO.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet2 / f;
            float f4 = andSet3 / f;
            ConcurrentHashMap<OooO, Integer> concurrentHashMap = C25605OooO0o0.f87354OooO0Oo;
            if (f3 > 0.25f || f4 > 0.1f) {
                for (Map.Entry<OooO, Integer> entry : concurrentHashMap.entrySet()) {
                    C25605OooO0o0.OooO00o(entry.getKey(), -entry.getValue().intValue());
                }
            } else if (f2 > 0.98f) {
                for (Map.Entry<OooO, Integer> entry2 : concurrentHashMap.entrySet()) {
                    C25605OooO0o0.OooO00o(entry2.getKey(), entry2.getValue().intValue());
                }
            }
            concurrentHashMap.clear();
        }
        ((Handler) C25605OooO0o0.f87356OooO0o0.getValue()).postDelayed(C25605OooO0o0.f87355OooO0o, 2000L);
    }
}
