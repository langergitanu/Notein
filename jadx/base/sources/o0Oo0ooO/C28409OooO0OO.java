package o0Oo0ooO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28409OooO0OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f100707OooO00o;

    public C28409OooO0OO(long j) {
        this.f100707OooO00o = j;
    }

    public static final C28409OooO0OO fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C28409OooO0OO.class, "labelId")) {
            return new C28409OooO0OO(bundle.getLong("labelId"));
        }
        throw new IllegalArgumentException("Required argument \"labelId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28409OooO0OO) && this.f100707OooO00o == ((C28409OooO0OO) obj).f100707OooO00o;
    }

    public final int hashCode() {
        return Long.hashCode(this.f100707OooO00o);
    }

    public final String toString() {
        return android.support.v4.media.session.OooO00o.OooO00o(this.f100707OooO00o, ")", new StringBuilder("DeleteLabelDialogFragmentArgs(labelId="));
    }
}
