package o0oo0;

import OooOoO.C20509OooO0oo;
import androidx.appcompat.app.OooOOO;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C31178OooO0O0 {
    public static final C20161OooO0O0 Companion = new C20161OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f111207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f111208OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f111209OooO0OO;

    /* JADX INFO: renamed from: o0oo0.OooO0O0$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C31178OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111210OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f111210OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.estimator.EstimatorConfig", oooO00o, 3);
            c34001o0ooOO0.OooOO0("typeName", false);
            c34001o0ooOO0.OooOO0("predictionFactor", true);
            c34001o0ooOO0.OooOO0("isEnable", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            return new InterfaceC33911OooO0OO[]{o00000OO.f122230OooO00o, C33965Oooo0O0.f122189OooO00o, C33940OooO0oo.f122144OooO00o};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            String strOooo0 = null;
            float fOooO0Oo = 0.0f;
            boolean z = true;
            int i = 0;
            boolean zOooOOOo = false;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 0);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 1);
                    i |= 2;
                } else {
                    if (iOooOo0o != 2) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    zOooOOOo = OooO00o2.OooOOOo(interfaceC33531OooO0o0, 2);
                    i |= 4;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C31178OooO0O0(strOooo0, fOooO0Oo, i, zOooOOOo);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C31178OooO0O0 value = (C31178OooO0O0) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 0, value.f111207OooO00o);
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f = value.f111208OooO0O0;
            if (zOooOoO0 || Float.compare(f, 0.6f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 1, f);
            }
            boolean zOooOoO02 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            boolean z = value.f111209OooO0OO;
            if (zOooOoO02 || !z) {
                oooO0O0OooO00o.OooO0oO(interfaceC33531OooO0o0, 2, z);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20161OooO0O0 {
        public final InterfaceC33911OooO0OO<C31178OooO0O0> serializer() {
            return OooO00o.f111210OooO00o;
        }
    }

    public /* synthetic */ C31178OooO0O0(String str, float f, int i, boolean z) {
        if (1 != (i & 1)) {
            C24242OooOOo.OooO0O0(i, 1, OooO00o.f111210OooO00o.getDescriptor());
            throw null;
        }
        this.f111207OooO00o = str;
        if ((i & 2) == 0) {
            this.f111208OooO0O0 = 0.6f;
        } else {
            this.f111208OooO0O0 = f;
        }
        if ((i & 4) == 0) {
            this.f111209OooO0OO = true;
        } else {
            this.f111209OooO0OO = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31178OooO0O0)) {
            return false;
        }
        C31178OooO0O0 c31178OooO0O0 = (C31178OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f111207OooO00o, c31178OooO0O0.f111207OooO00o) && Float.compare(this.f111208OooO0O0, c31178OooO0O0.f111208OooO0O0) == 0 && this.f111209OooO0OO == c31178OooO0O0.f111209OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111209OooO0OO) + C20509OooO0oo.OooO0OO(this.f111208OooO0O0, this.f111207OooO00o.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EstimatorConfig(typeName=");
        sb.append(this.f111207OooO00o);
        sb.append(", predictionFactor=");
        sb.append(this.f111208OooO0O0);
        sb.append(", isEnable=");
        return OooOOO.OooO00o(sb, ")", this.f111209OooO0OO);
    }
}
