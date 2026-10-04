package o0oOoO0;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0oOoO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30999OooO0oO implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f110715OooO00o;

    public C30999OooO0oO(Uri uri) {
        this.f110715OooO00o = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30999OooO0oO) && OooOOO0.OooO0O0(this.f110715OooO00o, ((C30999OooO0oO) obj).f110715OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_userSettingFragment_to_userAvatarModifyFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = this.f110715OooO00o;
        if (zIsAssignableFrom) {
            OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("uri", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("uri", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        return this.f110715OooO00o.hashCode();
    }

    public final String toString() {
        return "ActionUserSettingFragmentToUserAvatarModifyFragment(uri=" + this.f110715OooO00o + ")";
    }
}
