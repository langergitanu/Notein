package o0oOoO0o;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooO0o;

/* JADX INFO: renamed from: o0oOoO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31002OooO0O0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110718OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110719OooO0O0;

    public C31002OooO0O0() {
        this("", "");
    }

    public static final C31002OooO0O0 fromBundle(Bundle bundle) {
        String string;
        String string2 = "";
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C31002OooO0O0.class, "code")) {
            string = bundle.getString("code");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        if (bundle.containsKey("originalPassword") && (string2 = bundle.getString("originalPassword")) == null) {
            throw new IllegalArgumentException("Argument \"originalPassword\" is marked as non-null but was passed a null value.");
        }
        return new C31002OooO0O0(string, string2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31002OooO0O0)) {
            return false;
        }
        C31002OooO0O0 c31002OooO0O0 = (C31002OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f110718OooO00o, c31002OooO0O0.f110718OooO00o) && OooOOO0.OooO0O0(this.f110719OooO0O0, c31002OooO0O0.f110719OooO0O0);
    }

    public final int hashCode() {
        return this.f110719OooO0O0.hashCode() + (this.f110718OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSetPasswordFragmentArgs(code=");
        sb.append(this.f110718OooO00o);
        sb.append(", originalPassword=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110719OooO0O0, ")");
    }

    public C31002OooO0O0(String str, String str2) {
        this.f110718OooO00o = str;
        this.f110719OooO0O0 = str2;
    }
}
