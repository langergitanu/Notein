package oO0Ooo;

import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0Oo0.C32703OoooOoO;
import oO0Ooo.C33340OoooOOo;
import oO0OooO.C33450OooO;
import oO0OooO.C33451OooO00o;
import oO0OooO.InterfaceC33464OooOOOO;
import oO0o0000.InterfaceC33539OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33310OooOOo0 extends AbstractC33309OooOOo implements InterfaceC33307OooOOOO, InterfaceC33539OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120547OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f120548OooOoO0;

    /* JADX INFO: renamed from: oO0Ooo.OooOOo0$OooO00o */
    public static final class OooO00o {
        public static C33310OooOOo0 OooO00o(AbstractC33354o00o0O type, boolean z) {
            boolean zOooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            if (type instanceof C33310OooOOo0) {
                return (C33310OooOOo0) type;
            }
            if (!(type.o00000() instanceof InterfaceC33464OooOOOO) && !(type.o00000().OooO0OO() instanceof InterfaceC32637OoooOoo) && !(type instanceof C33450OooO) && !(type instanceof C33335OoooO0)) {
                zOooO0o = false;
            } else if (type instanceof C33335OoooO0) {
                zOooO0o = o00Oo0.OooO0o(type);
            } else {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = type.o00000().OooO0OO();
                C32703OoooOoO c32703OoooOoO = interfaceC32598OooO0ooOooO0OO instanceof C32703OoooOoO ? (C32703OoooOoO) interfaceC32598OooO0ooOooO0OO : null;
                zOooO0o = (c32703OoooOoO == null || c32703OoooOoO.f117583Oooo00o) ? (z && (type.o00000().OooO0OO() instanceof InterfaceC32637OoooOoo)) ? o00Oo0.OooO0o(type) : !C33295OooO0OO.OooO00o(C33451OooO00o.OooO00o(false, null, null, 24), o00OO0O0.OooO0O0.OooOO0(type), C33340OoooOOo.OooO0O0.C20314OooO0O0.f120609OooO00o) : true;
            }
            if (!zOooO0o) {
                return null;
            }
            if (type instanceof AbstractC33316OooOo0o) {
                AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) type;
                kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC33316OooOo0o.f120554OooOo.o00000(), abstractC33316OooOo0o.f120555OooOoO0.o00000());
            }
            return new C33310OooOOo0(o00OO0O0.OooO0O0.OooOO0(type).o00000Oo(false), z);
        }
    }

    public C33310OooOOo0(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, boolean z) {
        this.f120547OooOo = abstractC33328Oooo0O0;
        this.f120548OooOoO0 = z;
    }

    @Override // oO0Ooo.InterfaceC33307OooOOOO
    public final AbstractC33354o00o0O OoooO(AbstractC33320OooOoo replacement) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(replacement, "replacement");
        return C33332Oooo0oO.OooO00o(replacement.o00000OO(), this.f120548OooOoO0);
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33328Oooo0O0 o0000() {
        return this.f120547OooOo;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo, oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return false;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        return z ? this.f120547OooOo.o00000Oo(z) : this;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C33310OooOOo0(this.f120547OooOo.o0000Ooo(newAttributes), this.f120548OooOoO0);
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33309OooOOo o0000oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        return new C33310OooOOo0(abstractC33328Oooo0O0, this.f120548OooOoO0);
    }

    @Override // oO0Ooo.InterfaceC33307OooOOOO
    public final boolean o000OOo() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = this.f120547OooOo;
        return (abstractC33328Oooo0O0.o00000() instanceof InterfaceC33464OooOOOO) || (abstractC33328Oooo0O0.o00000().OooO0OO() instanceof InterfaceC32637OoooOoo);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    public final String toString() {
        return this.f120547OooOo + " & Any";
    }
}
