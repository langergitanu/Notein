package Oooo0O0;

import Oooo0.EnumC20853Ooooo0o;
import OooooO0.C21290OooO0o0;

/* JADX INFO: renamed from: Oooo0O0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20922OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC20853Ooooo0o f60357OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f60358OooO0O0;

    public C20922OooOOoo(EnumC20853Ooooo0o enumC20853Ooooo0o, long j) {
        this.f60357OooO00o = enumC20853Ooooo0o;
        this.f60358OooO0O0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20922OooOOoo)) {
            return false;
        }
        C20922OooOOoo c20922OooOOoo = (C20922OooOOoo) obj;
        return this.f60357OooO00o == c20922OooOOoo.f60357OooO00o && C21290OooO0o0.OooO00o(this.f60358OooO0O0, c20922OooOOoo.f60358OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f60357OooO00o.hashCode() * 31;
        int i = C21290OooO0o0.f61721OooO0o0;
        return Long.hashCode(this.f60358OooO0O0) + iHashCode;
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f60357OooO00o + ", position=" + ((Object) C21290OooO0o0.OooO0oo(this.f60358OooO0O0)) + ')';
    }
}
