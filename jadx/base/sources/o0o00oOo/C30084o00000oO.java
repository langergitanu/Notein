package o0o00oOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o00oOo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30084o00000oO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107062OooO00o;

    public C30084o00000oO() {
        this(null);
    }

    public static final C30084o00000oO fromBundle(Bundle bundle) {
        return new C30084o00000oO(C20860Ooooooo.OooO0Oo(bundle, "bundle", C30084o00000oO.class, "id") ? bundle.getString("id") : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30084o00000oO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107062OooO00o, ((C30084o00000oO) obj).f107062OooO00o);
    }

    public final int hashCode() {
        String str = this.f107062OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("PdfPasswordDialogFragmentArgs(id="), this.f107062OooO00o, ")");
    }

    public C30084o00000oO(String str) {
        this.f107062OooO00o = str;
    }
}
