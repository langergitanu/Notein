package oO0OOo;

import oO0OooO0.C33476OooO0O0;

/* JADX INFO: renamed from: oO0OOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33036OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33476OooO0O0 f119481OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f119482OooO0O0;

    public C33036OooO0o(C33476OooO0O0 c33476OooO0O0, int i) {
        this.f119481OooO00o = c33476OooO0O0;
        this.f119482OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33036OooO0o)) {
            return false;
        }
        C33036OooO0o c33036OooO0o = (C33036OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f119481OooO00o, c33036OooO0o.f119481OooO00o) && this.f119482OooO0O0 == c33036OooO0o.f119482OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f119482OooO0O0) + (this.f119481OooO00o.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.f119482OooO0O0;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f119481OooO00o);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
