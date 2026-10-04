package o0o00oo;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o00oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30127Oooo00o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107264OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107265OooO0O0;

    public C30127Oooo00o(String str, String str2) {
        this.f107264OooO00o = str;
        this.f107265OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30127Oooo00o)) {
            return false;
        }
        C30127Oooo00o c30127Oooo00o = (C30127Oooo00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107264OooO00o, c30127Oooo00o.f107264OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107265OooO0O0, c30127Oooo00o.f107265OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteListContainerFragment_to_permissionTipsDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f107264OooO00o);
        bundle.putString(FirebaseAnalytics.Param.CONTENT, this.f107265OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f107265OooO0O0.hashCode() + (this.f107264OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteListContainerFragmentToPermissionTipsDialogFragment(title=");
        sb.append(this.f107264OooO00o);
        sb.append(", content=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f107265OooO0O0, ")");
    }
}
