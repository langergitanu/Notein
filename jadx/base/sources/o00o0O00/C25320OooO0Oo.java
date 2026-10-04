package o00o0O00;

import androidx.fragment.app.C21929Ooooo0o;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;

/* JADX INFO: renamed from: o00o0O00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25320OooO0Oo implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f86167OooO0O0;

    public C25320OooO0Oo(Object obj) {
        C21929Ooooo0o.OooO0OO(obj, "Argument must not be null");
        this.f86167OooO0O0 = obj;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(this.f86167OooO0O0.toString().getBytes(InterfaceC25116OooO0o.f85383OooO00o));
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof C25320OooO0Oo) {
            return this.f86167OooO0O0.equals(((C25320OooO0Oo) obj).f86167OooO0O0);
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return this.f86167OooO0O0.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f86167OooO0O0 + '}';
    }
}
