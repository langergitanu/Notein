package o0Oo0OO0;

import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28070OooO0oO {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f99508OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f99509OooO0O0;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C28070OooO0oO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99510OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f99510OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.ServerCommand", oooO00o, 2);
            c34001o0ooOO0.OooOO0("commandString", false);
            c34001o0ooOO0.OooOO0("tokenString", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            o00000OO o00000oo2 = o00000OO.f122230OooO00o;
            return new InterfaceC33911OooO0OO[]{o00000oo2, o00000oo2};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            String strOooo0 = null;
            boolean z = true;
            int i = 0;
            String strOooo02 = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 0);
                    i |= 1;
                } else {
                    if (iOooOo0o != 1) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    strOooo02 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 1);
                    i |= 2;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C28070OooO0oO(i, strOooo0, strOooo02);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28070OooO0oO value = (C28070OooO0oO) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 0, value.f99508OooO00o);
            oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 1, value.f99509OooO0O0);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C28070OooO0oO> serializer() {
            return OooO00o.f99510OooO00o;
        }
    }

    public /* synthetic */ C28070OooO0oO(int i, String str, String str2) {
        if (3 != (i & 3)) {
            C24242OooOOo.OooO0O0(i, 3, OooO00o.f99510OooO00o.getDescriptor());
            throw null;
        }
        this.f99508OooO00o = str;
        this.f99509OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28070OooO0oO)) {
            return false;
        }
        C28070OooO0oO c28070OooO0oO = (C28070OooO0oO) obj;
        return OooOOO0.OooO0O0(this.f99508OooO00o, c28070OooO0oO.f99508OooO00o) && OooOOO0.OooO0O0(this.f99509OooO0O0, c28070OooO0oO.f99509OooO0O0);
    }

    public final int hashCode() {
        return this.f99509OooO0O0.hashCode() + (this.f99508OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerCommand(commandString=");
        sb.append(this.f99508OooO00o);
        sb.append(", tokenString=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f99509OooO0O0, ")");
    }

    public C28070OooO0oO(String commandString, String tokenString) {
        OooOOO0.OooO0oO(commandString, "commandString");
        OooOOO0.OooO0oO(tokenString, "tokenString");
        this.f99508OooO00o = commandString;
        this.f99509OooO0O0 = tokenString;
    }
}
