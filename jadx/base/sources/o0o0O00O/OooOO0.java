package o0o0O00O;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f107751OooO00o;

    public OooOO0(long j) {
        this.f107751OooO00o = j;
    }

    public static final OooOO0 fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", OooOO0.class, "labelId")) {
            return new OooOO0(bundle.getLong("labelId"));
        }
        throw new IllegalArgumentException("Required argument \"labelId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooOO0) && this.f107751OooO00o == ((OooOO0) obj).f107751OooO00o;
    }

    public final int hashCode() {
        return Long.hashCode(this.f107751OooO00o);
    }

    public final String toString() {
        return android.support.v4.media.session.OooO00o.OooO00o(this.f107751OooO00o, ")", new StringBuilder("LabelContainerFragmentArgs(labelId="));
    }
}
