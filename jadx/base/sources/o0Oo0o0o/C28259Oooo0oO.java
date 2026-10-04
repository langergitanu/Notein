package o0Oo0o0o;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Oo0o0o.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28259Oooo0oO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f100127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f100128OooO0O0;

    public C28259Oooo0oO(boolean z, int i) {
        this.f100127OooO00o = z;
        this.f100128OooO0O0 = i;
    }

    public static final C28259Oooo0oO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28259Oooo0oO.class, "no_progress")) {
            throw new IllegalArgumentException("Required argument \"no_progress\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("no_progress");
        if (bundle.containsKey("export_source")) {
            return new C28259Oooo0oO(z, bundle.getInt("export_source"));
        }
        throw new IllegalArgumentException("Required argument \"export_source\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28259Oooo0oO)) {
            return false;
        }
        C28259Oooo0oO c28259Oooo0oO = (C28259Oooo0oO) obj;
        return this.f100127OooO00o == c28259Oooo0oO.f100127OooO00o && this.f100128OooO0O0 == c28259Oooo0oO.f100128OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f100128OooO0O0) + (Boolean.hashCode(this.f100127OooO00o) * 31);
    }

    public final String toString() {
        return "ExportProgressDialogFragmentArgs(noProgress=" + this.f100127OooO00o + ", exportSource=" + this.f100128OooO0O0 + ")";
    }
}
