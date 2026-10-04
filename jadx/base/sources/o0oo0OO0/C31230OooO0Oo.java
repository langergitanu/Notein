package o0oo0OO0;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C33983OooooO0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0oo0OO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C31230OooO0Oo {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f111363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f111364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f111365OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f111366OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f111367OooO0o0;

    /* JADX INFO: renamed from: o0oo0OO0.OooO0Oo$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C31230OooO0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111368OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f111368OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.serialization.ink.SerializedBrush", oooO00o, 4);
            c34001o0ooOO0.OooOO0("size", true);
            c34001o0ooOO0.OooOO0("color", true);
            c34001o0ooOO0.OooOO0("epsilon", true);
            c34001o0ooOO0.OooOO0("brushFamilyId", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
            return new InterfaceC33911OooO0OO[]{c33965Oooo0O0, C33983OooooO0.f122206OooO00o, c33965Oooo0O0, o00000OO.f122230OooO00o};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            int i = 0;
            float fOooO0Oo = 0.0f;
            float fOooO0Oo2 = 0.0f;
            long jOooOo00 = 0;
            String strOooo0 = null;
            boolean z = true;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 0);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    jOooOo00 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 1);
                    i |= 2;
                } else if (iOooOo0o == 2) {
                    fOooO0Oo2 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 2);
                    i |= 4;
                } else {
                    if (iOooOo0o != 3) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 3);
                    i |= 8;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C31230OooO0Oo(i, fOooO0Oo, jOooOo00, fOooO0Oo2, strOooo0);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C31230OooO0Oo value = (C31230OooO0Oo) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C31230OooO0Oo.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f = value.f111363OooO00o;
            if (zOooOoO0 || Float.compare(f, 1.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 0, f);
            }
            boolean zOooOoO02 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            long j = value.f111364OooO0O0;
            if (zOooOoO02 || j != 4278190080L) {
                oooO0O0OooO00o.OooOo0O(interfaceC33531OooO0o0, 1, j);
            }
            boolean zOooOoO03 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f2 = value.f111365OooO0OO;
            if (zOooOoO03 || Float.compare(f2, 0.01f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 2, f2);
            }
            boolean zOooOoO04 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            String str = value.f111367OooO0o0;
            if (zOooOoO04 || !OooOOO0.OooO0O0(str, "notein-pencil-v1")) {
                oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 3, str);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oo0OO0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C31230OooO0Oo> serializer() {
            return OooO00o.f111368OooO00o;
        }
    }

    public /* synthetic */ C31230OooO0Oo(int i, float f, long j, float f2, String str) {
        this.f111363OooO00o = (i & 1) == 0 ? 1.0f : f;
        if ((i & 2) == 0) {
            this.f111364OooO0O0 = 4278190080L;
        } else {
            this.f111364OooO0O0 = j;
        }
        if ((i & 4) == 0) {
            this.f111365OooO0OO = 0.01f;
        } else {
            this.f111365OooO0OO = f2;
        }
        this.f111366OooO0Oo = "PENCIL_V1";
        if ((i & 8) == 0) {
            this.f111367OooO0o0 = "notein-pencil-v1";
        } else {
            this.f111367OooO0o0 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31230OooO0Oo)) {
            return false;
        }
        C31230OooO0Oo c31230OooO0Oo = (C31230OooO0Oo) obj;
        return Float.compare(this.f111363OooO00o, c31230OooO0Oo.f111363OooO00o) == 0 && this.f111364OooO0O0 == c31230OooO0Oo.f111364OooO0O0 && Float.compare(this.f111365OooO0OO, c31230OooO0Oo.f111365OooO0OO) == 0 && OooOOO0.OooO0O0(this.f111366OooO0Oo, c31230OooO0Oo.f111366OooO0Oo) && OooOOO0.OooO0O0(this.f111367OooO0o0, c31230OooO0Oo.f111367OooO0o0);
    }

    public final int hashCode() {
        return this.f111367OooO0o0.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20509OooO0oo.OooO0OO(this.f111365OooO0OO, C20703o000000o.OooO0O0(Float.hashCode(this.f111363OooO00o) * 31, 31, this.f111364OooO0O0), 31), 31, this.f111366OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SerializedBrush(size=");
        sb.append(this.f111363OooO00o);
        sb.append(", color=");
        sb.append(this.f111364OooO0O0);
        sb.append(", epsilon=");
        sb.append(this.f111365OooO0OO);
        sb.append(", stockBrush=");
        sb.append(this.f111366OooO0Oo);
        sb.append(", brushFamilyId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f111367OooO0o0, ")");
    }

    public C31230OooO0Oo() {
        this.f111363OooO00o = 1.0f;
        this.f111364OooO0O0 = 4278190080L;
        this.f111365OooO0OO = 0.01f;
        this.f111366OooO0Oo = "PENCIL_V1";
        this.f111367OooO0o0 = "notein-pencil-v1";
    }
}
