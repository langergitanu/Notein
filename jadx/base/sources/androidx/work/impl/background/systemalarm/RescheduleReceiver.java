package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o00O0O0o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f66723OooO00o = OooOO0O.OooO0o0("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        OooOO0O.OooO0OO().OooO00o(f66723OooO00o, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            oooOO0OOoooooO.getClass();
            synchronized (o00O0OO0.OooOO0O.f84358OooOO0o) {
                try {
                    oooOO0OOoooooO.f84359OooO = pendingResultGoAsync;
                    if (oooOO0OOoooooO.f84367OooO0oo) {
                        pendingResultGoAsync.finish();
                        oooOO0OOoooooO.f84359OooO = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            OooOO0O.OooO0OO().OooO0O0(f66723OooO00o, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
