package o0o0OO0O;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o0OO0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30425OooO0OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f108683OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f108684OooO0O0;

    public C30425OooO0OO(int i, String str) {
        this.f108683OooO00o = i;
        this.f108684OooO0O0 = str;
    }

    public static final C30425OooO0OO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30425OooO0OO.class, "action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("action");
        if (bundle.containsKey("exclude_note")) {
            return new C30425OooO0OO(i, bundle.getString("exclude_note"));
        }
        throw new IllegalArgumentException("Required argument \"exclude_note\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30425OooO0OO)) {
            return false;
        }
        C30425OooO0OO c30425OooO0OO = (C30425OooO0OO) obj;
        return this.f108683OooO00o == c30425OooO0OO.f108683OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108684OooO0O0, c30425OooO0OO.f108684OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f108683OooO00o) * 31;
        String str = this.f108684OooO0O0;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ChooseNoteDialogFragmentArgs(action=" + this.f108683OooO00o + ", excludeNote=" + this.f108684OooO0O0 + ")";
    }
}
