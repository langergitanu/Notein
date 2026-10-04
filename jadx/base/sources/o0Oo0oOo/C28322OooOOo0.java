package o0Oo0oOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Oo0oOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28322OooOOo0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f100445OooO0O0;

    public C28322OooOOo0(String str, String str2) {
        this.f100444OooO00o = str;
        this.f100445OooO0O0 = str2;
    }

    public static final C28322OooOOo0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28322OooOOo0.class, "materialId")) {
            throw new IllegalArgumentException("Required argument \"materialId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("materialId");
        if (string != null) {
            return new C28322OooOOo0(string, bundle.containsKey("source") ? bundle.getString("source") : null);
        }
        throw new IllegalArgumentException("Argument \"materialId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28322OooOOo0)) {
            return false;
        }
        C28322OooOOo0 c28322OooOOo0 = (C28322OooOOo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100444OooO00o, c28322OooOOo0.f100444OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100445OooO0O0, c28322OooOOo0.f100445OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f100444OooO00o.hashCode() * 31;
        String str = this.f100445OooO0O0;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreativeLibraryDetailFragmentArgs(materialId=");
        sb.append(this.f100444OooO00o);
        sb.append(", source=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f100445OooO0O0, ")");
    }
}
