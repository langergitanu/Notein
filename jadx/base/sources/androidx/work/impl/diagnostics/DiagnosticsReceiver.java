package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import o00O0O0o.OooO0o;
import o00O0O0o.OooOO0O;
import o00O0O0o.OooOOO0;
import o00O0OO0.C24847OooO0oO;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f66730OooO00o = OooOO0O.OooO0o0("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f66730OooO00o;
        OooOO0O.OooO0OO().OooO00o(str, "Requesting diagnostics", new Throwable[0]);
        try {
            o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(context);
            OooOOO0 oooOOO0OooO00o = new OooOOO0.OooO00o(DiagnosticsWorker.class).OooO00o();
            oooOO0OOoooooO.getClass();
            List listSingletonList = Collections.singletonList(oooOOO0OooO00o);
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new C24847OooO0oO(oooOO0OOoooooO, null, OooO0o.f84243OooOo, listSingletonList).Oooo();
        } catch (IllegalStateException e) {
            OooOO0O.OooO0OO().OooO0O0(str, "WorkManager is not initialized", e);
        }
    }
}
