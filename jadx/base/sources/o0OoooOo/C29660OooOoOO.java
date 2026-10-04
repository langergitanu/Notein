package o0OoooOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0OoooOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29660OooOoOO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f105172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f105173OooO0O0;

    public C29660OooOoOO(int i, String str) {
        this.f105172OooO00o = i;
        this.f105173OooO0O0 = str;
    }

    public static final C29660OooOoOO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29660OooOoOO.class, "pageIndex")) {
            throw new IllegalArgumentException("Required argument \"pageIndex\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("pageIndex");
        if (!bundle.containsKey("pageId")) {
            throw new IllegalArgumentException("Required argument \"pageId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("pageId");
        if (string != null) {
            return new C29660OooOoOO(i, string);
        }
        throw new IllegalArgumentException("Argument \"pageId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29660OooOoOO)) {
            return false;
        }
        C29660OooOoOO c29660OooOoOO = (C29660OooOoOO) obj;
        return this.f105172OooO00o == c29660OooOoOO.f105172OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105173OooO0O0, c29660OooOoOO.f105173OooO0O0);
    }

    public final int hashCode() {
        return this.f105173OooO0O0.hashCode() + (Integer.hashCode(this.f105172OooO00o) * 31);
    }

    public final String toString() {
        return "NewCommentDialogFragmentArgs(pageIndex=" + this.f105172OooO00o + ", pageId=" + this.f105173OooO0O0 + ")";
    }
}
