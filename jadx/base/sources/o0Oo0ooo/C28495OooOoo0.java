package o0Oo0ooo;

/* JADX INFO: renamed from: o0Oo0ooo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28495OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f100979OooO0O0;

    public C28495OooOoo0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28495OooOoo0)) {
            return false;
        }
        C28495OooOoo0 c28495OooOoo0 = (C28495OooOoo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100978OooO00o, c28495OooOoo0.f100978OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100979OooO0O0, c28495OooOoo0.f100979OooO0O0);
    }

    public final int hashCode() {
        return this.f100979OooO0O0.hashCode() + (this.f100978OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationSubmissionTarget(country=");
        sb.append(this.f100978OooO00o);
        sb.append(", phone=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f100979OooO0O0, ")");
    }

    public /* synthetic */ C28495OooOoo0(int i) {
        this("", "");
    }

    public C28495OooOoo0(String country, String phone) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(country, "country");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phone, "phone");
        this.f100978OooO00o = country;
        this.f100979OooO0O0 = phone;
    }
}
