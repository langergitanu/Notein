package oOOoOoOO;

import java.lang.reflect.Type;
import kotlin.jvm.internal.OooOOO0;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo<?> f123413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Type f123414OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC34606OooOOOo f123415OooO0OO;

    public OooO00o(Type type, InterfaceC34595OooO0Oo type2, InterfaceC34606OooOOOo interfaceC34606OooOOOo) {
        OooOOO0.OooO0oO(type2, "type");
        this.f123413OooO00o = type2;
        this.f123414OooO0O0 = type;
        this.f123415OooO0OO = interfaceC34606OooOOOo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return OooOOO0.OooO0O0(this.f123413OooO00o, oooO00o.f123413OooO00o) && OooOOO0.OooO0O0(this.f123414OooO0O0, oooO00o.f123414OooO0O0) && OooOOO0.OooO0O0(this.f123415OooO0OO, oooO00o.f123415OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f123414OooO0O0.hashCode() + (this.f123413OooO00o.hashCode() * 31)) * 31;
        InterfaceC34606OooOOOo interfaceC34606OooOOOo = this.f123415OooO0OO;
        return iHashCode + (interfaceC34606OooOOOo == null ? 0 : interfaceC34606OooOOOo.hashCode());
    }

    public final String toString() {
        return "TypeInfo(type=" + this.f123413OooO00o + ", reifiedType=" + this.f123414OooO0O0 + ", kotlinType=" + this.f123415OooO0OO + ')';
    }
}
