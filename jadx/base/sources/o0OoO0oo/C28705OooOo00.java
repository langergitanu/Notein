package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0OoO0oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28705OooOo00 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101705OooO00o;

    public C28705OooOo00(int i) {
        this.f101705OooO00o = i;
    }

    public static final C28705OooOo00 fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C28705OooOo00.class, "pageNum")) {
            return new C28705OooOo00(bundle.getInt("pageNum"));
        }
        throw new IllegalArgumentException("Required argument \"pageNum\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28705OooOo00) && this.f101705OooO00o == ((C28705OooOo00) obj).f101705OooO00o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101705OooO00o);
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(")", this.f101705OooO00o, new StringBuilder("JumpToPageDialogFragmentArgs(pageNum="));
    }
}
