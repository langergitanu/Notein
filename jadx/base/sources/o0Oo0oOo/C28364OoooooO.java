package o0Oo0oOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Oo0oOo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28364OoooooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100545OooO00o;

    public C28364OoooooO(String str) {
        this.f100545OooO00o = str;
    }

    public static final C28364OoooooO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28364OoooooO.class, "creatorId")) {
            throw new IllegalArgumentException("Required argument \"creatorId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("creatorId");
        if (string != null) {
            return new C28364OoooooO(string);
        }
        throw new IllegalArgumentException("Argument \"creatorId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28364OoooooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100545OooO00o, ((C28364OoooooO) obj).f100545OooO00o);
    }

    public final int hashCode() {
        return this.f100545OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("CreatorProfileFragmentArgs(creatorId="), this.f100545OooO00o, ")");
    }
}
