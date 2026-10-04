package oO0Ooo;

import java.util.List;
import o0Oo0o00.o0OOO0o;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO.C33467OooOOo0;
import oO0o0000.InterfaceC33541OooO0oO;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33320OooOoo implements oOo0oooO.OooO00o, InterfaceC33541OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120567OooOo0o;

    public abstract oO0Oo0o0.OooOO0 OooOOO0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC33320OooOoo)) {
            return false;
        }
        AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) obj;
        if (o00000O0() == abstractC33320OooOoo.o00000O0()) {
            return o00OO.OooO00o.OooO0Oo(C33467OooOOo0.f120936OooO00o, o00000OO(), abstractC33320OooOoo.o00000OO());
        }
        return false;
    }

    @Override // oOo0oooO.OooO00o
    public final InterfaceC34588OooO0oO getAnnotations() {
        return C33304OooOO0o.OooO00o(o000000o());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f120567OooOo0o;
        if (i != 0) {
            return i;
        }
        if (o0OOO0o.OooO0O0(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (o00000O0() ? 1 : 0) + ((o000000O().hashCode() + (o00000().hashCode() * 31)) * 31);
        }
        this.f120567OooOo0o = iHashCode;
        return iHashCode;
    }

    public abstract InterfaceC33342OoooOo0 o00000();

    public abstract List<InterfaceC33348OooooOO> o000000O();

    public abstract C33339OoooOOO o000000o();

    public abstract AbstractC33320OooOoo o00000O(AbstractC33457OooO0oO abstractC33457OooO0oO);

    public abstract boolean o00000O0();

    public abstract AbstractC33354o00o0O o00000OO();
}
