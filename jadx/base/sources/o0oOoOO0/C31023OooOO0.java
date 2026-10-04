package o0oOoOO0;

import Oooo0.C20860Ooooooo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOoOO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31023OooOO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f110760OooO00o;

    public C31023OooOO0(Uri uri) {
        this.f110760OooO00o = uri;
    }

    public static final C31023OooOO0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C31023OooOO0.class, "uri")) {
            throw new IllegalArgumentException("Required argument \"uri\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Uri.class) && !Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Uri uri = (Uri) bundle.get("uri");
        if (uri != null) {
            return new C31023OooOO0(uri);
        }
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31023OooOO0) && OooOOO0.OooO0O0(this.f110760OooO00o, ((C31023OooOO0) obj).f110760OooO00o);
    }

    public final int hashCode() {
        return this.f110760OooO00o.hashCode();
    }

    public final String toString() {
        return "UserAvatarModifyFragmentArgs(uri=" + this.f110760OooO00o + ")";
    }
}
