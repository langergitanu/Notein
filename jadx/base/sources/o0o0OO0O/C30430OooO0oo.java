package o0o0OO0O;

import OooOoo0.o00000;
import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: o0o0OO0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30430OooO0oo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f108687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f108688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f108689OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f108690OooO0Oo;

    public C30430OooO0oo(int i, int i2, String str, boolean z) {
        this.f108687OooO00o = i;
        this.f108688OooO0O0 = z;
        this.f108689OooO0OO = str;
        this.f108690OooO0Oo = i2;
    }

    public static final C30430OooO0oo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30430OooO0oo.class, "action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("action");
        if (!bundle.containsKey(FirebaseAnalytics.Param.SUCCESS)) {
            throw new IllegalArgumentException("Required argument \"success\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean(FirebaseAnalytics.Param.SUCCESS);
        int i2 = bundle.containsKey("num_pages") ? bundle.getInt("num_pages") : 0;
        if (!bundle.containsKey("target_note_id")) {
            throw new IllegalArgumentException("Required argument \"target_note_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("target_note_id");
        if (string != null) {
            return new C30430OooO0oo(i, i2, string, z);
        }
        throw new IllegalArgumentException("Argument \"target_note_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30430OooO0oo)) {
            return false;
        }
        C30430OooO0oo c30430OooO0oo = (C30430OooO0oo) obj;
        return this.f108687OooO00o == c30430OooO0oo.f108687OooO00o && this.f108688OooO0O0 == c30430OooO0oo.f108688OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108689OooO0OO, c30430OooO0oo.f108689OooO0OO) && this.f108690OooO0Oo == c30430OooO0oo.f108690OooO0Oo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108690OooO0Oo) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(o00000.OooO0O0(Integer.hashCode(this.f108687OooO00o) * 31, 31, this.f108688OooO0O0), 31, this.f108689OooO0OO);
    }

    public final String toString() {
        return "PageOperationTipsDialogFragmentArgs(action=" + this.f108687OooO00o + ", success=" + this.f108688OooO0O0 + ", targetNoteId=" + this.f108689OooO0OO + ", numPages=" + this.f108690OooO0Oo + ")";
    }
}
