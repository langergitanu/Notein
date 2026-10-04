package o0oo0OO0;

import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0oo0OO0.C31230OooO0Oo;
import o0oo0OO0.C31234OooO0oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0oo0OO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C31231OooO0o {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31234OooO0oo f111369OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31230OooO0Oo f111370OooO0O0;

    /* JADX INFO: renamed from: o0oo0OO0.OooO0o$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C31231OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111371OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f111371OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.serialization.ink.SerializedStroke", oooO00o, 2);
            c34001o0ooOO0.OooOO0("inputs", false);
            c34001o0ooOO0.OooOO0("brush", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            return new InterfaceC33911OooO0OO[]{C31234OooO0oo.OooO00o.f111393OooO00o, C31230OooO0Oo.OooO00o.f111368OooO00o};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            C31234OooO0oo c31234OooO0oo = null;
            boolean z = true;
            int i = 0;
            C31230OooO0Oo c31230OooO0Oo = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    c31234OooO0oo = (C31234OooO0oo) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 0, C31234OooO0oo.OooO00o.f111393OooO00o, c31234OooO0oo);
                    i |= 1;
                } else {
                    if (iOooOo0o != 1) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    c31230OooO0Oo = (C31230OooO0Oo) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 1, C31230OooO0Oo.OooO00o.f111368OooO00o, c31230OooO0Oo);
                    i |= 2;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C31231OooO0o(i, c31234OooO0oo, c31230OooO0Oo);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C31231OooO0o value = (C31231OooO0o) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C31231OooO0o.Companion;
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 0, C31234OooO0oo.OooO00o.f111393OooO00o, value.f111369OooO00o);
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 1, C31230OooO0Oo.OooO00o.f111368OooO00o, value.f111370OooO0O0);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oo0OO0.OooO0o$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C31231OooO0o> serializer() {
            return OooO00o.f111371OooO00o;
        }
    }

    public /* synthetic */ C31231OooO0o(int i, C31234OooO0oo c31234OooO0oo, C31230OooO0Oo c31230OooO0Oo) {
        if (3 != (i & 3)) {
            C24242OooOOo.OooO0O0(i, 3, OooO00o.f111371OooO00o.getDescriptor());
            throw null;
        }
        this.f111369OooO00o = c31234OooO0oo;
        this.f111370OooO0O0 = c31230OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31231OooO0o)) {
            return false;
        }
        C31231OooO0o c31231OooO0o = (C31231OooO0o) obj;
        return OooOOO0.OooO0O0(this.f111369OooO00o, c31231OooO0o.f111369OooO00o) && OooOOO0.OooO0O0(this.f111370OooO0O0, c31231OooO0o.f111370OooO0O0);
    }

    public final int hashCode() {
        return this.f111370OooO0O0.hashCode() + (this.f111369OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "SerializedStroke(inputs=" + this.f111369OooO00o + ", brush=" + this.f111370OooO0O0 + ")";
    }
}
