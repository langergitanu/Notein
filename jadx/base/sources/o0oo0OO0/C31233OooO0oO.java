package o0oo0OO0;

import OooOoO.C20509OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0oo0OO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C31233OooO0oO {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f111381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f111382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f111383OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f111384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f111385OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f111386OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f111387OooO0oO;

    /* JADX INFO: renamed from: o0oo0OO0.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C31233OooO0oO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111388OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f111388OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.serialization.ink.SerializedStrokeInput", oooO00o, 7);
            c34001o0ooOO0.OooOO0("x", false);
            c34001o0ooOO0.OooOO0("y", false);
            c34001o0ooOO0.OooOO0("timeMillis", false);
            c34001o0ooOO0.OooOO0("pressure", false);
            c34001o0ooOO0.OooOO0("tiltRadians", false);
            c34001o0ooOO0.OooOO0("orientationRadians", false);
            c34001o0ooOO0.OooOO0("strokeUnitLengthCm", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
            return new InterfaceC33911OooO0OO[]{c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            int i = 0;
            float fOooO0Oo = 0.0f;
            float fOooO0Oo2 = 0.0f;
            float fOooO0Oo3 = 0.0f;
            float fOooO0Oo4 = 0.0f;
            float fOooO0Oo5 = 0.0f;
            float fOooO0Oo6 = 0.0f;
            float fOooO0Oo7 = 0.0f;
            boolean z = true;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                switch (iOooOo0o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 0);
                        i |= 1;
                        break;
                    case 1:
                        fOooO0Oo2 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 1);
                        i |= 2;
                        break;
                    case 2:
                        fOooO0Oo3 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 2);
                        i |= 4;
                        break;
                    case 3:
                        fOooO0Oo4 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 3);
                        i |= 8;
                        break;
                    case 4:
                        fOooO0Oo5 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 4);
                        i |= 16;
                        break;
                    case 5:
                        fOooO0Oo6 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 5);
                        i |= 32;
                        break;
                    case 6:
                        fOooO0Oo7 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 6);
                        i |= 64;
                        break;
                    default:
                        throw new C33927OooOo00(iOooOo0o);
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C31233OooO0oO(i, fOooO0Oo, fOooO0Oo2, fOooO0Oo3, fOooO0Oo4, fOooO0Oo5, fOooO0Oo6, fOooO0Oo7);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C31233OooO0oO value = (C31233OooO0oO) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 0, value.f111381OooO00o);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 1, value.f111382OooO0O0);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 2, value.f111383OooO0OO);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 3, value.f111384OooO0Oo);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 4, value.f111386OooO0o0);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 5, value.f111385OooO0o);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 6, value.f111387OooO0oO);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oo0OO0.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C31233OooO0oO> serializer() {
            return OooO00o.f111388OooO00o;
        }
    }

    public /* synthetic */ C31233OooO0oO(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (127 != (i & 127)) {
            C24242OooOOo.OooO0O0(i, 127, OooO00o.f111388OooO00o.getDescriptor());
            throw null;
        }
        this.f111381OooO00o = f;
        this.f111382OooO0O0 = f2;
        this.f111383OooO0OO = f3;
        this.f111384OooO0Oo = f4;
        this.f111386OooO0o0 = f5;
        this.f111385OooO0o = f6;
        this.f111387OooO0oO = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31233OooO0oO)) {
            return false;
        }
        C31233OooO0oO c31233OooO0oO = (C31233OooO0oO) obj;
        return Float.compare(this.f111381OooO00o, c31233OooO0oO.f111381OooO00o) == 0 && Float.compare(this.f111382OooO0O0, c31233OooO0oO.f111382OooO0O0) == 0 && Float.compare(this.f111383OooO0OO, c31233OooO0oO.f111383OooO0OO) == 0 && Float.compare(this.f111384OooO0Oo, c31233OooO0oO.f111384OooO0Oo) == 0 && Float.compare(this.f111386OooO0o0, c31233OooO0oO.f111386OooO0o0) == 0 && Float.compare(this.f111385OooO0o, c31233OooO0oO.f111385OooO0o) == 0 && Float.compare(this.f111387OooO0oO, c31233OooO0oO.f111387OooO0oO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111387OooO0oO) + C20509OooO0oo.OooO0OO(this.f111385OooO0o, C20509OooO0oo.OooO0OO(this.f111386OooO0o0, C20509OooO0oo.OooO0OO(this.f111384OooO0Oo, C20509OooO0oo.OooO0OO(this.f111383OooO0OO, C20509OooO0oo.OooO0OO(this.f111382OooO0O0, Float.hashCode(this.f111381OooO00o) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SerializedStrokeInput(x=");
        sb.append(this.f111381OooO00o);
        sb.append(", y=");
        sb.append(this.f111382OooO0O0);
        sb.append(", timeMillis=");
        sb.append(this.f111383OooO0OO);
        sb.append(", pressure=");
        sb.append(this.f111384OooO0Oo);
        sb.append(", tiltRadians=");
        sb.append(this.f111386OooO0o0);
        sb.append(", orientationRadians=");
        sb.append(this.f111385OooO0o);
        sb.append(", strokeUnitLengthCm=");
        return Oooo00o.OooO0OO.OooO0OO(sb, this.f111387OooO0oO, ")");
    }
}
