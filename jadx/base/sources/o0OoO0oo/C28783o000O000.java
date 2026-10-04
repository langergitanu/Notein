package o0OoO0oo;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o000O000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28783o000O000 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101920OooO0O0;

    public C28783o000O000(String str, String str2) {
        this.f101919OooO00o = str;
        this.f101920OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28783o000O000)) {
            return false;
        }
        C28783o000O000 c28783o000O000 = (C28783o000O000) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101919OooO00o, c28783o000O000.f101919OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101920OooO0O0, c28783o000O000.f101920OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57956x8af9756d;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f101919OooO00o);
        bundle.putString(FirebaseAnalytics.Param.CONTENT, this.f101920OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101920OooO0O0.hashCode() + (this.f101919OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToPermissionTipsDialogFragment(title=");
        sb.append(this.f101919OooO00o);
        sb.append(", content=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101920OooO0O0, ")");
    }
}
