package o0Oo0OO0;

import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28067OooO0Oo {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final InterfaceC33911OooO0OO<Object>[] f99496OooO0O0 = {new C33938OooO0o0(o00000OO.f122230OooO00o)};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<String> f99497OooO00o = null;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0Oo$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C28067OooO0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99498OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f99498OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.DeviceIntegrity", oooO00o, 1);
            c34001o0ooOO0.OooOO0("deviceRecognitionVerdict", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            return new InterfaceC33911OooO0OO[]{C33928OooO00o.OooO0OO(C28067OooO0Oo.f99496OooO0O0[0])};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = C28067OooO0Oo.f99496OooO0O0;
            boolean z = true;
            boolean z2 = false;
            List<String> list = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else {
                    if (iOooOo0o != 0) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    list = (List) OooO00o2.OooOOO(interfaceC33531OooO0o0, 0, interfaceC33911OooO0OOArr[0], list);
                    z2 = true;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            C28067OooO0Oo c28067OooO0Oo = new C28067OooO0Oo();
            if (z2) {
                c28067OooO0Oo.f99497OooO00o = list;
                return c28067OooO0Oo;
            }
            c28067OooO0Oo.f99497OooO00o = null;
            return c28067OooO0Oo;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28067OooO0Oo value = (C28067OooO0Oo) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C28067OooO0Oo.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            List<String> list = value.f99497OooO00o;
            if (zOooOoO0 || list != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 0, C28067OooO0Oo.f99496OooO0O0[0], list);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C28067OooO0Oo> serializer() {
            return OooO00o.f99498OooO00o;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28067OooO0Oo) && OooOOO0.OooO0O0(this.f99497OooO00o, ((C28067OooO0Oo) obj).f99497OooO00o);
    }

    public final int hashCode() {
        List<String> list = this.f99497OooO00o;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "DeviceIntegrity(deviceRecognitionVerdict=" + this.f99497OooO00o + ")";
    }
}
