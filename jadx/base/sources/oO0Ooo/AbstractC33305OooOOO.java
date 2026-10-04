package oO0Ooo;

import oO0O0OO.InterfaceC32598OooO0oo;
import oO0OOOo.C32982OooO;
import oO0Oooo.C33509OooO;

/* JADX INFO: renamed from: oO0Ooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33305OooOOO implements InterfaceC33342OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f120542OooO00o;

    public abstract boolean OooO0o(InterfaceC32598OooO0oo interfaceC32598OooO0oo);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC33342OoooOo0) && obj.hashCode() == hashCode()) {
            InterfaceC33342OoooOo0 interfaceC33342OoooOo0 = (InterfaceC33342OoooOo0) obj;
            if (interfaceC33342OoooOo0.getParameters().size() == getParameters().size()) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = OooO0OO();
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO2 = interfaceC33342OoooOo0.OooO0OO();
                if (interfaceC32598OooO0ooOooO0OO2 == null || C33509OooO.OooO0o(interfaceC32598OooO0ooOooO0OO) || C32982OooO.OooOOOO(interfaceC32598OooO0ooOooO0OO) || C33509OooO.OooO0o(interfaceC32598OooO0ooOooO0OO2) || C32982OooO.OooOOOO(interfaceC32598OooO0ooOooO0OO2)) {
                    return false;
                }
                return OooO0o(interfaceC32598OooO0ooOooO0OO2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f120542OooO00o;
        if (i != 0) {
            return i;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = OooO0OO();
        int iIdentityHashCode = (C33509OooO.OooO0o(interfaceC32598OooO0ooOooO0OO) || C32982OooO.OooOOOO(interfaceC32598OooO0ooOooO0OO)) ? System.identityHashCode(this) : C32982OooO.OooO0oO(interfaceC32598OooO0ooOooO0OO).f120976OooO00o.hashCode();
        this.f120542OooO00o = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
