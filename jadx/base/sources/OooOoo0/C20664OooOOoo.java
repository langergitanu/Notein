package OooOoo0;

import OooooOO.C21368o0ooOoO;
import o0000Ooo.C24232OooO0o0;

/* JADX INFO: renamed from: OooOoo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20664OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f59288OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21368o0ooOoO f59289OooO0O0;

    public C20664OooOOoo(float f, C21368o0ooOoO c21368o0ooOoO) {
        this.f59288OooO00o = f;
        this.f59289OooO0O0 = c21368o0ooOoO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20664OooOOoo)) {
            return false;
        }
        C20664OooOOoo c20664OooOOoo = (C20664OooOOoo) obj;
        return C24232OooO0o0.OooO00o(this.f59288OooO00o, c20664OooOOoo.f59288OooO00o) && this.f59289OooO0O0.equals(c20664OooOOoo.f59289OooO0O0);
    }

    public final int hashCode() {
        return this.f59289OooO0O0.hashCode() + (Float.hashCode(this.f59288OooO00o) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) C24232OooO0o0.OooO0O0(this.f59288OooO00o)) + ", brush=" + this.f59289OooO0O0 + ')';
    }
}
