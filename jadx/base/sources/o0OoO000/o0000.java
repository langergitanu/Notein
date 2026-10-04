package o0OoO000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f101268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f101269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f101270OooO0o0;

    public o0000(String str, String str2, String str3, Uri uri, Bundle bundle) {
        this.f101266OooO00o = str;
        this.f101267OooO0O0 = str2;
        this.f101268OooO0OO = str3;
        this.f101269OooO0Oo = uri;
        this.f101270OooO0o0 = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000)) {
            return false;
        }
        o0000 o0000Var = (o0000) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101266OooO00o, o0000Var.f101266OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101267OooO0O0, o0000Var.f101267OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101268OooO0OO, o0000Var.f101268OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101269OooO0Oo, o0000Var.f101269OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101270OooO0o0, o0000Var.f101270OooO0o0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_firebaseUserLoginFragment_to_firebaseLoginConfirmFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("provider", this.f101266OooO00o);
        bundle.putString("display_name", this.f101267OooO0O0);
        bundle.putString("email", this.f101268OooO0OO);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = this.f101269OooO0Oo;
        if (zIsAssignableFrom) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("photo_uri", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(Uri.class)) {
                throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("photo_uri", (Serializable) parcelable);
        }
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(Bundle.class);
        Parcelable parcelable2 = this.f101270OooO0o0;
        if (zIsAssignableFrom2) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("extras", parcelable2);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(Bundle.class)) {
            throw new UnsupportedOperationException(Bundle.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("extras", (Serializable) parcelable2);
        return bundle;
    }

    public final int hashCode() {
        return this.f101270OooO0o0.hashCode() + ((this.f101269OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f101266OooO00o.hashCode() * 31, 31, this.f101267OooO0O0), 31, this.f101268OooO0OO)) * 31);
    }

    public final String toString() {
        return "ActionFirebaseUserLoginFragmentToFirebaseLoginConfirmFragment(provider=" + this.f101266OooO00o + ", displayName=" + this.f101267OooO0O0 + ", email=" + this.f101268OooO0OO + ", photoUri=" + this.f101269OooO0Oo + ", extras=" + this.f101270OooO0o0 + ")";
    }
}
