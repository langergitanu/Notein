package o0OoO000;

import Oooo0.C20860Ooooooo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoO000.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28552Oooo0o0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101197OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101198OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f101199OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f101200OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f101201OooO0o0;

    public C28552Oooo0o0(String str, String str2, String str3, Uri uri, Bundle bundle) {
        this.f101197OooO00o = str;
        this.f101198OooO0O0 = str2;
        this.f101199OooO0OO = str3;
        this.f101200OooO0Oo = uri;
        this.f101201OooO0o0 = bundle;
    }

    public static final C28552Oooo0o0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28552Oooo0o0.class, "provider")) {
            throw new IllegalArgumentException("Required argument \"provider\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("provider");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"provider\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("display_name")) {
            throw new IllegalArgumentException("Required argument \"display_name\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("display_name");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"display_name\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("email");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("photo_uri")) {
            throw new IllegalArgumentException("Required argument \"photo_uri\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Uri.class) && !Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Uri uri = (Uri) bundle.get("photo_uri");
        if (uri == null) {
            throw new IllegalArgumentException("Argument \"photo_uri\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("extras")) {
            throw new IllegalArgumentException("Required argument \"extras\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Bundle.class) && !Serializable.class.isAssignableFrom(Bundle.class)) {
            throw new UnsupportedOperationException(Bundle.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Bundle bundle2 = (Bundle) bundle.get("extras");
        if (bundle2 != null) {
            return new C28552Oooo0o0(string, string2, string3, uri, bundle2);
        }
        throw new IllegalArgumentException("Argument \"extras\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28552Oooo0o0)) {
            return false;
        }
        C28552Oooo0o0 c28552Oooo0o0 = (C28552Oooo0o0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101197OooO00o, c28552Oooo0o0.f101197OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101198OooO0O0, c28552Oooo0o0.f101198OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101199OooO0OO, c28552Oooo0o0.f101199OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101200OooO0Oo, c28552Oooo0o0.f101200OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101201OooO0o0, c28552Oooo0o0.f101201OooO0o0);
    }

    public final int hashCode() {
        return this.f101201OooO0o0.hashCode() + ((this.f101200OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f101197OooO00o.hashCode() * 31, 31, this.f101198OooO0O0), 31, this.f101199OooO0OO)) * 31);
    }

    public final String toString() {
        return "FirebaseLoginConfirmFragmentArgs(provider=" + this.f101197OooO00o + ", displayName=" + this.f101198OooO0O0 + ", email=" + this.f101199OooO0OO + ", photoUri=" + this.f101200OooO0Oo + ", extras=" + this.f101201OooO0o0 + ")";
    }
}
