package o0OoO000;

import androidx.lifecycle.C21989OooOooO;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0000O0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f101306OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f101307OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserModifyPasswordFragment f101308OooOoO0;

    public /* synthetic */ o0000O0O(FirebaseUser firebaseUser, String str, FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment) {
        this.f101307OooOo0o = firebaseUser;
        this.f101306OooOo = str;
        this.f101308OooOoO0 = firebaseUserModifyPasswordFragment;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Task<Void> taskUpdatePassword = this.f101307OooOo0o.updatePassword(this.f101306OooOo);
        final FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment = this.f101308OooOoO0;
        taskUpdatePassword.addOnCompleteListener(new OnCompleteListener() { // from class: o0OoO000.o0000OO0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task it) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                boolean zIsSuccessful = it.isSuccessful();
                FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment2 = firebaseUserModifyPasswordFragment;
                if (zIsSuccessful) {
                    String string = firebaseUserModifyPasswordFragment2.getString(R.string.toast_modify_password_success);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    firebaseUserModifyPasswordFragment2.Oooo0OO(0L, string);
                    C21989OooOooO.OooO00o(firebaseUserModifyPasswordFragment2).OooO0O0(new o0000OO(firebaseUserModifyPasswordFragment2, null));
                    return;
                }
                firebaseUserModifyPasswordFragment2.Oooo0();
                String string2 = firebaseUserModifyPasswordFragment2.getString(R.string.toast_modify_password_failed);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                firebaseUserModifyPasswordFragment2.Oooo0OO(0L, string2);
            }
        });
        return C32460OooOooO.f116667OooO00o;
    }
}
