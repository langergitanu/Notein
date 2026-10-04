package o0OoO000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoO000.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28601ooOO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101372OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101373OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f101374OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f101375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f101376OooO0o0;

    public C28601ooOO(String str, String str2, String str3, Uri uri, Bundle bundle) {
        this.f101372OooO00o = str;
        this.f101373OooO0O0 = str2;
        this.f101374OooO0OO = str3;
        this.f101375OooO0Oo = uri;
        this.f101376OooO0o0 = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28601ooOO)) {
            return false;
        }
        C28601ooOO c28601ooOO = (C28601ooOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101372OooO00o, c28601ooOO.f101372OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101373OooO0O0, c28601ooOO.f101373OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101374OooO0OO, c28601ooOO.f101374OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101375OooO0Oo, c28601ooOO.f101375OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101376OooO0o0, c28601ooOO.f101376OooO0o0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_firebaseUserAuthFragment_to_firebaseLoginConfirmFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("provider", this.f101372OooO00o);
        bundle.putString("display_name", this.f101373OooO0O0);
        bundle.putString("email", this.f101374OooO0OO);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = this.f101375OooO0Oo;
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
        Parcelable parcelable2 = this.f101376OooO0o0;
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
        return this.f101376OooO0o0.hashCode() + ((this.f101375OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f101372OooO00o.hashCode() * 31, 31, this.f101373OooO0O0), 31, this.f101374OooO0OO)) * 31);
    }

    public final String toString() {
        return "ActionFirebaseUserAuthFragmentToFirebaseLoginConfirmFragment(provider=" + this.f101372OooO00o + ", displayName=" + this.f101373OooO0O0 + ", email=" + this.f101374OooO0OO + ", photoUri=" + this.f101375OooO0Oo + ", extras=" + this.f101376OooO0o0 + ")";
    }
}
