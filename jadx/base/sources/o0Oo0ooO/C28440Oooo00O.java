package o0Oo0ooO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Oo0ooO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28440Oooo00O implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f100807OooO00o;

    public C28440Oooo00O() {
        this(false);
    }

    public static final C28440Oooo00O fromBundle(Bundle bundle) {
        return new C28440Oooo00O(C20860Ooooooo.OooO0Oo(bundle, "bundle", C28440Oooo00O.class, "creationFlag") ? bundle.getBoolean("creationFlag") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28440Oooo00O) && this.f100807OooO00o == ((C28440Oooo00O) obj).f100807OooO00o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100807OooO00o);
    }

    public final String toString() {
        return "LabelManagementBottomSheetArgs(creationFlag=" + this.f100807OooO00o + ")";
    }

    public C28440Oooo00O(boolean z) {
        this.f100807OooO00o = z;
    }
}
