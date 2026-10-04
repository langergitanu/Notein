package o0Oo0OO0;

import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28064OooO00o {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f99484OooO00o = null;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C19886OooO00o implements InterfaceC33966Oooo0OO<C28064OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19886OooO00o f99485OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            C19886OooO00o c19886OooO00o = new C19886OooO00o();
            f99485OooO00o = c19886OooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.AccountDetails", c19886OooO00o, 1);
            c34001o0ooOO0.OooOO0("appLicensingVerdict", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            return new InterfaceC33911OooO0OO[]{C33928OooO00o.OooO0OO(o00000OO.f122230OooO00o)};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            boolean z = true;
            boolean z2 = false;
            String str = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else {
                    if (iOooOo0o != 0) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    str = (String) OooO00o2.OooOOO(interfaceC33531OooO0o0, 0, o00000OO.f122230OooO00o, str);
                    z2 = true;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            C28064OooO00o c28064OooO00o = new C28064OooO00o();
            if (z2) {
                c28064OooO00o.f99484OooO00o = str;
                return c28064OooO00o;
            }
            c28064OooO00o.f99484OooO00o = null;
            return c28064OooO00o;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28064OooO00o value = (C28064OooO00o) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C28064OooO00o.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            String str = value.f99484OooO00o;
            if (zOooOoO0 || str != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 0, o00000OO.f122230OooO00o, str);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO00o$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C28064OooO00o> serializer() {
            return C19886OooO00o.f99485OooO00o;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28064OooO00o) && OooOOO0.OooO0O0(this.f99484OooO00o, ((C28064OooO00o) obj).f99484OooO00o);
    }

    public final int hashCode() {
        String str = this.f99484OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("AccountDetails(appLicensingVerdict="), this.f99484OooO00o, ")");
    }
}
