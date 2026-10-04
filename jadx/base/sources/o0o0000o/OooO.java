package o0o0000o;

import OooOooo.C20785Oooo00o;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f105411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f105412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f105413OooO0OO;

    public OooO(int i, int i2, int i3) {
        this.f105411OooO00o = i;
        this.f105412OooO0O0 = i2;
        this.f105413OooO0OO = i3;
    }

    public static final OooO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", OooO.class, "currentAngle")) {
            throw new IllegalArgumentException("Required argument \"currentAngle\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("currentAngle");
        if (!bundle.containsKey("minAngle")) {
            throw new IllegalArgumentException("Required argument \"minAngle\" is missing and does not have an android:defaultValue");
        }
        int i2 = bundle.getInt("minAngle");
        if (bundle.containsKey("maxAngle")) {
            return new OooO(i, i2, bundle.getInt("maxAngle"));
        }
        throw new IllegalArgumentException("Required argument \"maxAngle\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return this.f105411OooO00o == oooO.f105411OooO00o && this.f105412OooO0O0 == oooO.f105412OooO0O0 && this.f105413OooO0OO == oooO.f105413OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105413OooO0OO) + C20785Oooo00o.OooO00o(this.f105412OooO0O0, Integer.hashCode(this.f105411OooO00o) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetRulerAngleDialogFragmentArgs(currentAngle=");
        sb.append(this.f105411OooO00o);
        sb.append(", minAngle=");
        sb.append(this.f105412OooO0O0);
        sb.append(", maxAngle=");
        return C21023OooO0Oo.OooO0OO(")", this.f105413OooO0OO, sb);
    }
}
