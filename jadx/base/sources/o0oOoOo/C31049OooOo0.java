package o0oOoOo;

/* JADX INFO: renamed from: o0oOoOo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31049OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110854OooO0O0;

    public C31049OooOo0(int i, boolean z) {
        this.f110853OooO00o = i;
        this.f110854OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31049OooOo0)) {
            return false;
        }
        C31049OooOo0 c31049OooOo0 = (C31049OooOo0) obj;
        return this.f110853OooO00o == c31049OooOo0.f110853OooO00o && this.f110854OooO0O0 == c31049OooOo0.f110854OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110854OooO0O0) + (Integer.hashCode(this.f110853OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteFilterVO(index=");
        sb.append(this.f110853OooO00o);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110854OooO0O0);
    }
}
