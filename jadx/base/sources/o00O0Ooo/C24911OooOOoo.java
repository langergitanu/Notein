package o00O0Ooo;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o00O0Ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24911OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f84532OooO00o = o00O0O0o.OooOO0O.OooO0o0("WakeLocks");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f84533OooO0O0 = new WeakHashMap<>();

    public static PowerManager.WakeLock OooO00o(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f84533OooO0O0;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strConcat);
        }
        return wakeLockNewWakeLock;
    }
}
