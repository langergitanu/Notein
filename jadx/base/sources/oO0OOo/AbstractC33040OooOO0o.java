package oO0OOo;

import oO00ooO.C32460OooOooO;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;

/* JADX INFO: renamed from: oO0OOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33040OooOO0o extends AbstractC33038OooO0oO<C32460OooOooO> {

    /* JADX INFO: renamed from: oO0OOo.OooOO0o$OooO00o */
    public static final class OooO00o extends AbstractC33040OooOO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f119487OooO0O0;

        public OooO00o(String str) {
            super(C32460OooOooO.f116667OooO00o);
            this.f119487OooO0O0 = str;
        }

        @Override // oO0OOo.AbstractC33038OooO0oO
        public final AbstractC33320OooOoo OooO00o(InterfaceC32615OooOoo module) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
            return C33509OooO.OooO0OO(EnumC33517OooO0oo.ERROR_CONSTANT_VALUE, this.f119487OooO0O0);
        }

        @Override // oO0OOo.AbstractC33038OooO0oO
        public final String toString() {
            return this.f119487OooO0O0;
        }
    }

    @Override // oO0OOo.AbstractC33038OooO0oO
    public final C32460OooOooO OooO0O0() {
        throw new UnsupportedOperationException();
    }
}
