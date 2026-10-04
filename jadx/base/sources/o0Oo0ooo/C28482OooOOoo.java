package o0Oo0ooo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o0Oo0ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28482OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f100921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EnumC28488OooOoO f100922OooO0OO;

    public C28482OooOOoo() {
        this(0);
    }

    public static C28482OooOOoo OooO00o(C28482OooOOoo c28482OooOOoo, boolean z, EnumC28488OooOoO enumC28488OooOoO, int i) {
        String enteredCode = c28482OooOOoo.f100920OooO00o;
        if ((i & 2) != 0) {
            z = c28482OooOOoo.f100921OooO0O0;
        }
        c28482OooOOoo.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(enteredCode, "enteredCode");
        return new C28482OooOOoo(enteredCode, z, enumC28488OooOoO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28482OooOOoo)) {
            return false;
        }
        C28482OooOOoo c28482OooOOoo = (C28482OooOOoo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100920OooO00o, c28482OooOOoo.f100920OooO00o) && this.f100921OooO0O0 == c28482OooOOoo.f100921OooO0O0 && this.f100922OooO0OO == c28482OooOOoo.f100922OooO0OO;
    }

    public final int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(this.f100920OooO00o.hashCode() * 31, 31, this.f100921OooO0O0);
        EnumC28488OooOoO enumC28488OooOoO = this.f100922OooO0OO;
        return iOooO0O0 + (enumC28488OooOoO == null ? 0 : enumC28488OooOoO.hashCode());
    }

    public final String toString() {
        return "VerificationCodeSubmissionState(enteredCode=" + this.f100920OooO00o + ", isSubmitting=" + this.f100921OooO0O0 + ", message=" + this.f100922OooO0OO + ")";
    }

    public /* synthetic */ C28482OooOOoo(int i) {
        this("", false, null);
    }

    public C28482OooOOoo(String enteredCode, boolean z, EnumC28488OooOoO enumC28488OooOoO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(enteredCode, "enteredCode");
        this.f100920OooO00o = enteredCode;
        this.f100921OooO0O0 = z;
        this.f100922OooO0OO = enumC28488OooOoO;
    }
}
