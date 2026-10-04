package o0OoO000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOOO0 implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        if (it.isSuccessful()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseSetNameFragment");
            c20358OooO00o.OooO0o0("updateProfile: success", new Object[0]);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("FirebaseSetNameFragment");
            c20358OooO00o2.OooO0Oo(it.getException(), "updateProfile: failed", new Object[0]);
        }
    }
}
