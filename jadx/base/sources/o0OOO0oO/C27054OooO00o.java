package o0OOO0oO;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOO0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27054OooO00o implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        OooOOO0.OooO0oO(task, "task");
        if (!task.isSuccessful()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseRemoteConfigDataSource");
            c20358OooO00o.OooO0OO("Fetch failed", new Object[0]);
        } else {
            Boolean bool = (Boolean) task.getResult();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("FirebaseRemoteConfigDataSource");
            c20358OooO00o2.OooO0o0("Fetch and activate succeeded. updated: " + bool, new Object[0]);
        }
    }
}
