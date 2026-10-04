package o0OoO000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28536OooOo0O implements OnCompleteListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FirebaseCreateUserVerificationFragment f101162OooO00o;

    public /* synthetic */ C28536OooOo0O(FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment) {
        this.f101162OooO00o = firebaseCreateUserVerificationFragment;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseVerificationFragment");
            c20358OooO00o.OooO0o0("sendVerificationEmail: success", new Object[0]);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("FirebaseVerificationFragment");
        c20358OooO00o2.OooO0Oo(task.getException(), "sendVerificationEmail: failed", new Object[0]);
        FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment = this.f101162OooO00o;
        String string = firebaseCreateUserVerificationFragment.getString(R.string.send_failed);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        firebaseCreateUserVerificationFragment.Oooo0(0L, string);
    }
}
