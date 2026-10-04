package o0oo0OO0;

import OooOoO.C20509OooO0oo;
import com.google.firebase.firestore.util.OooOOO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o00Oo0oO.C25050OooO0O0;
import o0oo0OO0.C31233OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0oo0OO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C31234OooO0oo {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final InterfaceC33911OooO0OO<Object>[] f111389OooO0Oo = {C25050OooO0O0.OooO0Oo("com.orion.penkit.serialization.ink.SerializedToolType", EnumC31226OooO.values()), null, new C33938OooO0o0(C31233OooO0oO.OooO00o.f111388OooO00o)};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC31226OooO f111390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f111391OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<C31233OooO0oO> f111392OooO0OO;

    /* JADX INFO: renamed from: o0oo0OO0.OooO0oo$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C31234OooO0oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111393OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f111393OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.serialization.ink.SerializedStrokeInputBatch", oooO00o, 3);
            c34001o0ooOO0.OooOO0("toolType", false);
            c34001o0ooOO0.OooOO0("strokeUnitLengthCm", false);
            c34001o0ooOO0.OooOO0("inputs", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            InterfaceC33911OooO0OO<?>[] interfaceC33911OooO0OOArr = C31234OooO0oo.f111389OooO0Oo;
            return new InterfaceC33911OooO0OO[]{interfaceC33911OooO0OOArr[0], C33965Oooo0O0.f122189OooO00o, interfaceC33911OooO0OOArr[2]};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = C31234OooO0oo.f111389OooO0Oo;
            EnumC31226OooO enumC31226OooO = null;
            boolean z = true;
            int i = 0;
            float fOooO0Oo = 0.0f;
            List list = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    enumC31226OooO = (EnumC31226OooO) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 0, interfaceC33911OooO0OOArr[0], enumC31226OooO);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 1);
                    i |= 2;
                } else {
                    if (iOooOo0o != 2) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    list = (List) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 2, interfaceC33911OooO0OOArr[2], list);
                    i |= 4;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C31234OooO0oo(i, enumC31226OooO, fOooO0Oo, list);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C31234OooO0oo value = (C31234OooO0oo) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = C31234OooO0oo.f111389OooO0Oo;
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 0, interfaceC33911OooO0OOArr[0], value.f111390OooO00o);
            oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 1, value.f111391OooO0O0);
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 2, interfaceC33911OooO0OOArr[2], value.f111392OooO0OO);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oo0OO0.OooO0oo$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C31234OooO0oo> serializer() {
            return OooO00o.f111393OooO00o;
        }
    }

    public /* synthetic */ C31234OooO0oo(int i, EnumC31226OooO enumC31226OooO, float f, List list) {
        if (7 != (i & 7)) {
            C24242OooOOo.OooO0O0(i, 7, OooO00o.f111393OooO00o.getDescriptor());
            throw null;
        }
        this.f111390OooO00o = enumC31226OooO;
        this.f111391OooO0O0 = f;
        this.f111392OooO0OO = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31234OooO0oo)) {
            return false;
        }
        C31234OooO0oo c31234OooO0oo = (C31234OooO0oo) obj;
        return this.f111390OooO00o == c31234OooO0oo.f111390OooO00o && Float.compare(this.f111391OooO0O0, c31234OooO0oo.f111391OooO0O0) == 0 && OooOOO0.OooO0O0(this.f111392OooO0OO, c31234OooO0oo.f111392OooO0OO);
    }

    public final int hashCode() {
        return this.f111392OooO0OO.hashCode() + C20509OooO0oo.OooO0OO(this.f111391OooO0O0, this.f111390OooO00o.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SerializedStrokeInputBatch(toolType=");
        sb.append(this.f111390OooO00o);
        sb.append(", strokeUnitLengthCm=");
        sb.append(this.f111391OooO0O0);
        sb.append(", inputs=");
        return OooOOO.OooO0O0(")", sb, this.f111392OooO0OO);
    }
}
