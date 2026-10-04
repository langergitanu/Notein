package com.orion.notein.data.repo.backup;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.orion.notein.domain.models.page.PagePaddingStyle;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22906OooOoo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f69936OooOo0o;

    public /* synthetic */ C22906OooOoo0(int i) {
        this.f69936OooOo0o = i;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f69936OooOo0o) {
            case 0:
                GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestScopes(new Scope("https://www.googleapis.com/auth/drive.file"), new Scope[0]).build();
                kotlin.jvm.internal.OooOOO0.OooO0o(googleSignInOptionsBuild, "build(...)");
                return googleSignInOptionsBuild;
            default:
                return PagePaddingStyle.resolveHolePaddingRect$lambda$8();
        }
    }
}
