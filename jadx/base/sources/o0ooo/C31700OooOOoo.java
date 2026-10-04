package o0ooo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31700OooOOoo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f113238OooO00o;

    public C31700OooOOoo(boolean z) {
        this.f113238OooO00o = z;
    }

    public static final C31700OooOOoo fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C31700OooOOoo.class, "used_to_create_session")) {
            return new C31700OooOOoo(bundle.getBoolean("used_to_create_session"));
        }
        throw new IllegalArgumentException("Required argument \"used_to_create_session\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31700OooOOoo) && this.f113238OooO00o == ((C31700OooOOoo) obj).f113238OooO00o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113238OooO00o);
    }

    public final String toString() {
        return "SelectNoteDialogFragmentArgs(usedToCreateSession=" + this.f113238OooO00o + ")";
    }
}
