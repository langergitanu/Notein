package o0OooOoo;

import Oooo0.C20860Ooooooo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OooOoo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29577OooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f104901OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Uri f104902OooO0O0;

    public C29577OooO(Uri uri, String str) {
        this.f104901OooO00o = str;
        this.f104902OooO0O0 = uri;
    }

    public static final C29577OooO fromBundle(Bundle bundle) {
        Uri uri;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29577OooO.class, "message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("message");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("imported_uri")) {
            uri = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(Uri.class) && !Serializable.class.isAssignableFrom(Uri.class)) {
                throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            uri = (Uri) bundle.get("imported_uri");
        }
        return new C29577OooO(uri, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29577OooO)) {
            return false;
        }
        C29577OooO c29577OooO = (C29577OooO) obj;
        return OooOOO0.OooO0O0(this.f104901OooO00o, c29577OooO.f104901OooO00o) && OooOOO0.OooO0O0(this.f104902OooO0O0, c29577OooO.f104902OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f104901OooO00o.hashCode() * 31;
        Uri uri = this.f104902OooO0O0;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "LoginTipsDialogFragmentArgs(message=" + this.f104901OooO00o + ", importedUri=" + this.f104902OooO0O0 + ")";
    }
}
