package o0Oo0OO0;

import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0Oo0OO0.C28064OooO00o;
import o0Oo0OO0.C28065OooO0O0;
import o0Oo0OO0.C28067OooO0Oo;
import o0Oo0OO0.C28068OooO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28069OooO0o0 {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C28068OooO0o f99503OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C28065OooO0O0 f99504OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C28067OooO0Oo f99505OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C28064OooO00o f99506OooO0Oo;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0o0$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C28069OooO0o0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99507OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f99507OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.IntegrityVerdict", oooO00o, 4);
            c34001o0ooOO0.OooOO0("requestDetails", false);
            c34001o0ooOO0.OooOO0("appIntegrity", false);
            c34001o0ooOO0.OooOO0("deviceIntegrity", false);
            c34001o0ooOO0.OooOO0("accountDetails", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            return new InterfaceC33911OooO0OO[]{C33928OooO00o.OooO0OO(C28068OooO0o.OooO00o.f99502OooO00o), C33928OooO00o.OooO0OO(C28065OooO0O0.OooO00o.f99491OooO00o), C33928OooO00o.OooO0OO(C28067OooO0Oo.OooO00o.f99498OooO00o), C33928OooO00o.OooO0OO(C28064OooO00o.C19886OooO00o.f99485OooO00o)};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            boolean z = true;
            C28068OooO0o c28068OooO0o = null;
            C28065OooO0O0 c28065OooO0O0 = null;
            C28067OooO0Oo c28067OooO0Oo = null;
            C28064OooO00o c28064OooO00o = null;
            int i = 0;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    c28068OooO0o = (C28068OooO0o) OooO00o2.OooOOO(interfaceC33531OooO0o0, 0, C28068OooO0o.OooO00o.f99502OooO00o, c28068OooO0o);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    c28065OooO0O0 = (C28065OooO0O0) OooO00o2.OooOOO(interfaceC33531OooO0o0, 1, C28065OooO0O0.OooO00o.f99491OooO00o, c28065OooO0O0);
                    i |= 2;
                } else if (iOooOo0o == 2) {
                    c28067OooO0Oo = (C28067OooO0Oo) OooO00o2.OooOOO(interfaceC33531OooO0o0, 2, C28067OooO0Oo.OooO00o.f99498OooO00o, c28067OooO0Oo);
                    i |= 4;
                } else {
                    if (iOooOo0o != 3) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    c28064OooO00o = (C28064OooO00o) OooO00o2.OooOOO(interfaceC33531OooO0o0, 3, C28064OooO00o.C19886OooO00o.f99485OooO00o, c28064OooO00o);
                    i |= 8;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            if (15 != (i & 15)) {
                C24242OooOOo.OooO0O0(i, 15, descriptor);
                throw null;
            }
            C28069OooO0o0 c28069OooO0o0 = new C28069OooO0o0();
            c28069OooO0o0.f99503OooO00o = c28068OooO0o;
            c28069OooO0o0.f99504OooO0O0 = c28065OooO0O0;
            c28069OooO0o0.f99505OooO0OO = c28067OooO0Oo;
            c28069OooO0o0.f99506OooO0Oo = c28064OooO00o;
            return c28069OooO0o0;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28069OooO0o0 value = (C28069OooO0o0) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C28069OooO0o0.Companion;
            oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 0, C28068OooO0o.OooO00o.f99502OooO00o, value.f99503OooO00o);
            oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 1, C28065OooO0O0.OooO00o.f99491OooO00o, value.f99504OooO0O0);
            oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 2, C28067OooO0Oo.OooO00o.f99498OooO00o, value.f99505OooO0OO);
            oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 3, C28064OooO00o.C19886OooO00o.f99485OooO00o, value.f99506OooO0Oo);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C28069OooO0o0> serializer() {
            return OooO00o.f99507OooO00o;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28069OooO0o0)) {
            return false;
        }
        C28069OooO0o0 c28069OooO0o0 = (C28069OooO0o0) obj;
        return OooOOO0.OooO0O0(this.f99503OooO00o, c28069OooO0o0.f99503OooO00o) && OooOOO0.OooO0O0(this.f99504OooO0O0, c28069OooO0o0.f99504OooO0O0) && OooOOO0.OooO0O0(this.f99505OooO0OO, c28069OooO0o0.f99505OooO0OO) && OooOOO0.OooO0O0(this.f99506OooO0Oo, c28069OooO0o0.f99506OooO0Oo);
    }

    public final int hashCode() {
        C28068OooO0o c28068OooO0o = this.f99503OooO00o;
        int iHashCode = (c28068OooO0o == null ? 0 : c28068OooO0o.hashCode()) * 31;
        C28065OooO0O0 c28065OooO0O0 = this.f99504OooO0O0;
        int iHashCode2 = (iHashCode + (c28065OooO0O0 == null ? 0 : c28065OooO0O0.hashCode())) * 31;
        C28067OooO0Oo c28067OooO0Oo = this.f99505OooO0OO;
        int iHashCode3 = (iHashCode2 + (c28067OooO0Oo == null ? 0 : c28067OooO0Oo.hashCode())) * 31;
        C28064OooO00o c28064OooO00o = this.f99506OooO0Oo;
        return iHashCode3 + (c28064OooO00o != null ? c28064OooO00o.hashCode() : 0);
    }

    public final String toString() {
        return "IntegrityVerdict(requestDetails=" + this.f99503OooO00o + ", appIntegrity=" + this.f99504OooO0O0 + ", deviceIntegrity=" + this.f99505OooO0OO + ", accountDetails=" + this.f99506OooO0Oo + ")";
    }
}
