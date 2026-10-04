package o0O0oooO;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import o000oo0.C24684Oooo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00000O implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        FirebaseUser user;
        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "UserViewModel", "OnCompleteListener signInAnonymously:failure. ", exception), new Object[0]);
        } else {
            AuthResult authResult = (AuthResult) task.getResult();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("UserViewModel");
            c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("OnCompleteListener signInAnonymously:success. ", (authResult == null || (user = authResult.getUser()) == null) ? null : user.getUid()), new Object[0]);
        }
    }
}
