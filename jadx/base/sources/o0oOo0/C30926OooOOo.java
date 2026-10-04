package o0oOo0;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0oOo0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30926OooOOo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110500OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110501OooO0O0;

    public C30926OooOOo(int i, boolean z) {
        this.f110500OooO00o = i;
        this.f110501OooO0O0 = z;
    }

    public static final C30926OooOOo fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C30926OooOOo.class, "feature")) {
            return new C30926OooOOo(bundle.getInt("feature"), bundle.containsKey("guide_mode") ? bundle.getBoolean("guide_mode") : false);
        }
        throw new IllegalArgumentException("Required argument \"feature\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30926OooOOo)) {
            return false;
        }
        C30926OooOOo c30926OooOOo = (C30926OooOOo) obj;
        return this.f110500OooO00o == c30926OooOOo.f110500OooO00o && this.f110501OooO0O0 == c30926OooOOo.f110501OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110501OooO0O0) + (Integer.hashCode(this.f110500OooO00o) * 31);
    }

    public final String toString() {
        return "VipRestrictedFeatureDialogFragmentArgs(feature=" + this.f110500OooO00o + ", guideMode=" + this.f110501OooO0O0 + ")";
    }
}
