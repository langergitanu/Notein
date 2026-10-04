package oo0oO0;

/* JADX INFO: renamed from: oo0oO0.o00O0o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34828o00O0o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f125292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f125293OooO0O0;

    public C34828o00O0o0o(String id, String title) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(title, "title");
        this.f125292OooO00o = id;
        this.f125293OooO0O0 = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34828o00O0o0o)) {
            return false;
        }
        C34828o00O0o0o c34828o00O0o0o = (C34828o00O0o0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125292OooO00o, c34828o00O0o0o.f125292OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125293OooO0O0, c34828o00O0o0o.f125293OooO0O0);
    }

    public final int hashCode() {
        return this.f125293OooO0O0.hashCode() + (this.f125292OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteIdAndTitle(id=");
        sb.append(this.f125292OooO00o);
        sb.append(", title=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f125293OooO0O0, ")");
    }
}
