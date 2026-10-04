package oO0Ooo;

import OooOoo0.C20706o00000oO;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: oO0Ooo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33349OooooOo implements InterfaceC33348OooooOO {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC33348OooooOO)) {
            return false;
        }
        InterfaceC33348OooooOO interfaceC33348OooooOO = (InterfaceC33348OooooOO) obj;
        return OooO00o() == interfaceC33348OooooOO.OooO00o() && OooO0OO() == interfaceC33348OooooOO.OooO0OO() && getType().equals(interfaceC33348OooooOO.getType());
    }

    public final int hashCode() {
        int iOooO00o = Oooo0.o0OoOo0.OooO00o(OooO0OO());
        if (o00Oo0.OooOOO(getType())) {
            return (iOooO00o * 31) + 19;
        }
        return (iOooO00o * 31) + (OooO00o() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (OooO00o()) {
            return C18358t1.g.f56183c;
        }
        if (OooO0OO() == 1) {
            return getType().toString();
        }
        return C20706o00000oO.OooO0OO(OooO0OO()) + " " + getType();
    }
}
