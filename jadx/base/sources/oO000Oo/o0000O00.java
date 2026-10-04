package oO000Oo;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O00 extends AbstractC33087Oooo0o0.AbstractC33090OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0OOo0o.OooO0OO f114508OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33094OoooO f114509OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33101OoooOO0<?, ?> f114510OooO0OO;

    public o0000O00(C33101OoooOO0<?, ?> c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO) {
        this.f114510OooO0OO = (C33101OoooOO0) Preconditions.checkNotNull(c33101OoooOO0, "method");
        this.f114509OooO0O0 = (C33094OoooO) Preconditions.checkNotNull(c33094OoooO, "headers");
        this.f114508OooO00o = (oO0OOo0o.OooO0OO) Preconditions.checkNotNull(oooO0OO, "callOptions");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0000O00.class == obj.getClass()) {
            o0000O00 o0000o00 = (o0000O00) obj;
            if (Objects.equal(this.f114508OooO00o, o0000o00.f114508OooO00o) && Objects.equal(this.f114509OooO0O0, o0000o00.f114509OooO0O0) && Objects.equal(this.f114510OooO0OO, o0000o00.f114510OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f114508OooO00o, this.f114509OooO0O0, this.f114510OooO0OO);
    }

    public final String toString() {
        return "[method=" + this.f114510OooO0OO + " headers=" + this.f114509OooO0O0 + " callOptions=" + this.f114508OooO00o + "]";
    }
}
