package o0Oo0OO0;

import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0Oo0OO0.C28069OooO0o0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28066OooO0OO {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f99492OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f99493OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C28069OooO0o0 f99494OooO0OO;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0OO$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C28066OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99495OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f99495OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.CommandResult", oooO00o, 3);
            c34001o0ooOO0.OooOO0("commandSuccess", false);
            c34001o0ooOO0.OooOO0("diagnosticMessage", false);
            c34001o0ooOO0.OooOO0("integrityVerdict", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            return new InterfaceC33911OooO0OO[]{C33940OooO0oo.f122144OooO00o, o00000OO.f122230OooO00o, C33928OooO00o.OooO0OO(C28069OooO0o0.OooO00o.f99507OooO00o)};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            String strOooo0 = null;
            boolean z = true;
            int i = 0;
            boolean zOooOOOo = false;
            C28069OooO0o0 c28069OooO0o0 = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    zOooOOOo = OooO00o2.OooOOOo(interfaceC33531OooO0o0, 0);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 1);
                    i |= 2;
                } else {
                    if (iOooOo0o != 2) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    c28069OooO0o0 = (C28069OooO0o0) OooO00o2.OooOOO(interfaceC33531OooO0o0, 2, C28069OooO0o0.OooO00o.f99507OooO00o, c28069OooO0o0);
                    i |= 4;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C28066OooO0OO(i, zOooOOOo, strOooo0, c28069OooO0o0);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28066OooO0OO value = (C28066OooO0OO) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooO0oO(interfaceC33531OooO0o0, 0, value.f99492OooO00o);
            oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 1, value.f99493OooO0O0);
            oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 2, C28069OooO0o0.OooO00o.f99507OooO00o, value.f99494OooO0OO);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0OO$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C28066OooO0OO> serializer() {
            return OooO00o.f99495OooO00o;
        }
    }

    public /* synthetic */ C28066OooO0OO(int i, boolean z, String str, C28069OooO0o0 c28069OooO0o0) {
        if (7 != (i & 7)) {
            C24242OooOOo.OooO0O0(i, 7, OooO00o.f99495OooO00o.getDescriptor());
            throw null;
        }
        this.f99492OooO00o = z;
        this.f99493OooO0O0 = str;
        this.f99494OooO0OO = c28069OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28066OooO0OO)) {
            return false;
        }
        C28066OooO0OO c28066OooO0OO = (C28066OooO0OO) obj;
        return this.f99492OooO00o == c28066OooO0OO.f99492OooO00o && OooOOO0.OooO0O0(this.f99493OooO0O0, c28066OooO0OO.f99493OooO0O0) && OooOOO0.OooO0O0(this.f99494OooO0OO, c28066OooO0OO.f99494OooO0OO);
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Boolean.hashCode(this.f99492OooO00o) * 31, 31, this.f99493OooO0O0);
        C28069OooO0o0 c28069OooO0o0 = this.f99494OooO0OO;
        return iOooO0O0 + (c28069OooO0o0 == null ? 0 : c28069OooO0o0.hashCode());
    }

    public final String toString() {
        return "CommandResult(commandSuccess=" + this.f99492OooO00o + ", diagnosticMessage=" + this.f99493OooO0O0 + ", integrityVerdict=" + this.f99494OooO0OO + ")";
    }
}
