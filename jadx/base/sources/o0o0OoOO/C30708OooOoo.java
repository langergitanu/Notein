package o0o0OoOO;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OoOO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30708OooOoo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f109820OooO0O0;

    public C30708OooOoo(String str, String str2) {
        this.f109819OooO00o = str;
        this.f109820OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30708OooOoo)) {
            return false;
        }
        C30708OooOoo c30708OooOoo = (C30708OooOoo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109819OooO00o, c30708OooOoo.f109819OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109820OooO0O0, c30708OooOoo.f109820OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_debug_fragment_to_permissionTipsDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f109819OooO00o);
        bundle.putString(FirebaseAnalytics.Param.CONTENT, this.f109820OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f109820OooO0O0.hashCode() + (this.f109819OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionDebugFragmentToPermissionTipsDialogFragment(title=");
        sb.append(this.f109819OooO00o);
        sb.append(", content=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f109820OooO0O0, ")");
    }
}
