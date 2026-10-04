package oO0OO;

/* JADX INFO: renamed from: oO0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32879OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f117992OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f117993OooO0O0;

    public C32879OooO0Oo(int i, boolean z) {
        this.f117992OooO00o = i;
        this.f117993OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32879OooO0Oo)) {
            return false;
        }
        C32879OooO0Oo c32879OooO0Oo = (C32879OooO0Oo) obj;
        return this.f117992OooO00o == c32879OooO0Oo.f117992OooO00o && this.f117993OooO0O0 == c32879OooO0Oo.f117993OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117993OooO0O0) + (Integer.hashCode(this.f117992OooO00o) * 31);
    }

    public final String toString() {
        return "LanguageVO(nameResId=" + this.f117992OooO00o + ", isSelected=" + this.f117993OooO0O0 + ")";
    }
}
