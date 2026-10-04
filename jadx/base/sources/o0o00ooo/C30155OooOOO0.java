package o0o00ooo;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o00ooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30155OooOOO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107325OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107326OooO0O0;

    public C30155OooOOO0(String str, String str2) {
        this.f107325OooO00o = str;
        this.f107326OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30155OooOOO0)) {
            return false;
        }
        C30155OooOOO0 c30155OooOOO0 = (C30155OooOOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107325OooO00o, c30155OooOOO0.f107325OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107326OooO0O0, c30155OooOOO0.f107326OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_favoriteListFragment_to_permissionTipsDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f107325OooO00o);
        bundle.putString(FirebaseAnalytics.Param.CONTENT, this.f107326OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f107326OooO0O0.hashCode() + (this.f107325OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionFavoriteListFragmentToPermissionTipsDialogFragment(title=");
        sb.append(this.f107325OooO00o);
        sb.append(", content=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f107326OooO0O0, ")");
    }
}
