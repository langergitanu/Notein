package o0OO0Ooo;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: o0OO0Ooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26761OooOo0 implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestScopes(new Scope("https://www.googleapis.com/auth/drive.file"), new Scope[0]).build();
        kotlin.jvm.internal.OooOOO0.OooO0o(googleSignInOptionsBuild, "build(...)");
        return googleSignInOptionsBuild;
    }
}
