package o0Ooooo0;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Ooooo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29715OooOOo0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f105360OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f105361OooO0O0;

    public C29715OooOOo0(int i, String str) {
        this.f105360OooO00o = i;
        this.f105361OooO0O0 = str;
    }

    public static final C29715OooOOo0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29715OooOOo0.class, "pageIndex")) {
            throw new IllegalArgumentException("Required argument \"pageIndex\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("pageIndex");
        if (!bundle.containsKey("pageId")) {
            throw new IllegalArgumentException("Required argument \"pageId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("pageId");
        if (string != null) {
            return new C29715OooOOo0(i, string);
        }
        throw new IllegalArgumentException("Argument \"pageId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29715OooOOo0)) {
            return false;
        }
        C29715OooOOo0 c29715OooOOo0 = (C29715OooOOo0) obj;
        return this.f105360OooO00o == c29715OooOOo0.f105360OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105361OooO0O0, c29715OooOOo0.f105361OooO0O0);
    }

    public final int hashCode() {
        return this.f105361OooO0O0.hashCode() + (Integer.hashCode(this.f105360OooO00o) * 31);
    }

    public final String toString() {
        return "NewOutlineDialogFragmentArgs(pageIndex=" + this.f105360OooO00o + ", pageId=" + this.f105361OooO0O0 + ")";
    }
}
