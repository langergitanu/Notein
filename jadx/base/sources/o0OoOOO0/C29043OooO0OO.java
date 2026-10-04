package o0OoOOO0;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoOOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29043OooO0OO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102880OooO0O0;

    public C29043OooO0OO(String str, String str2) {
        this.f102879OooO00o = str;
        this.f102880OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29043OooO0OO)) {
            return false;
        }
        C29043OooO0OO c29043OooO0OO = (C29043OooO0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102879OooO00o, c29043OooO0OO.f102879OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102880OooO0O0, c29043OooO0OO.f102880OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_importFontDialogFragment_to_permissionTipsDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f102879OooO00o);
        bundle.putString(FirebaseAnalytics.Param.CONTENT, this.f102880OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f102880OooO0O0.hashCode() + (this.f102879OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImportFontDialogFragmentToPermissionTipsDialogFragment(title=");
        sb.append(this.f102879OooO00o);
        sb.append(", content=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f102880OooO0O0, ")");
    }
}
