package o0oo0OO0;

import OooOoo0.C20703o000000o;
import android.graphics.Matrix;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0oo0O.C31218OooO00o;
import o0oo0OO0.C31231OooO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C33977OoooOOo;
import oO0oO00.C33983OooooO0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0oo0OO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C31232OooO0o0 {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final InterfaceC33911OooO0OO<Object>[] f111372OooO0oo = {null, null, null, null, null, null, new C33977OoooOOo(o00000OO.f122230OooO00o, C33965Oooo0O0.f122189OooO00o)};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f111373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31231OooO0o f111374OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f111375OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Matrix f111376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f111377OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f111378OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<String, Float> f111379OooO0oO;

    /* JADX INFO: renamed from: o0oo0OO0.OooO0o0$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C31232OooO0o0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f111380OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f111380OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.serialization.ink.SerializedInkStroke", oooO00o, 7);
            c34001o0ooOO0.OooOO0("id", false);
            c34001o0ooOO0.OooOO0("stroke", false);
            c34001o0ooOO0.OooOO0("strokeToWorldTransform", false);
            c34001o0ooOO0.OooOO0("worldToViewTransform", false);
            c34001o0ooOO0.OooOO0("layerId", false);
            c34001o0ooOO0.OooOO0(C17625c.f52155b, false);
            c34001o0ooOO0.OooOO0("behaviorParams", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            InterfaceC33911OooO0OO<?> interfaceC33911OooO0OOOooO0OO = C33928OooO00o.OooO0OO(C31232OooO0o0.f111372OooO0oo[6]);
            o00000OO o00000oo2 = o00000OO.f122230OooO00o;
            C31218OooO00o c31218OooO00o = C31218OooO00o.f111340OooO00o;
            return new InterfaceC33911OooO0OO[]{o00000oo2, C31231OooO0o.OooO00o.f111371OooO00o, c31218OooO00o, c31218OooO00o, o00000oo2, C33983OooooO0.f122206OooO00o, interfaceC33911OooO0OOOooO0OO};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = C31232OooO0o0.f111372OooO0oo;
            Map map = null;
            int i = 0;
            String strOooo0 = null;
            C31231OooO0o c31231OooO0o = null;
            Matrix matrix = null;
            Matrix matrix2 = null;
            String strOooo02 = null;
            long jOooOo00 = 0;
            boolean z = true;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                switch (iOooOo0o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 0);
                        i |= 1;
                        break;
                    case 1:
                        c31231OooO0o = (C31231OooO0o) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 1, C31231OooO0o.OooO00o.f111371OooO00o, c31231OooO0o);
                        i |= 2;
                        break;
                    case 2:
                        matrix = (Matrix) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 2, C31218OooO00o.f111340OooO00o, matrix);
                        i |= 4;
                        break;
                    case 3:
                        matrix2 = (Matrix) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 3, C31218OooO00o.f111340OooO00o, matrix2);
                        i |= 8;
                        break;
                    case 4:
                        strOooo02 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 4);
                        i |= 16;
                        break;
                    case 5:
                        jOooOo00 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 5);
                        i |= 32;
                        break;
                    case 6:
                        map = (Map) OooO00o2.OooOOO(interfaceC33531OooO0o0, 6, interfaceC33911OooO0OOArr[6], map);
                        i |= 64;
                        break;
                    default:
                        throw new C33927OooOo00(iOooOo0o);
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C31232OooO0o0(i, strOooo0, c31231OooO0o, matrix, matrix2, strOooo02, jOooOo00, map);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C31232OooO0o0 value = (C31232OooO0o0) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 0, value.f111373OooO00o);
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 1, C31231OooO0o.OooO00o.f111371OooO00o, value.f111374OooO0O0);
            C31218OooO00o c31218OooO00o = C31218OooO00o.f111340OooO00o;
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 2, c31218OooO00o, value.f111375OooO0OO);
            oooO0O0OooO00o.OooOoo0(interfaceC33531OooO0o0, 3, c31218OooO00o, value.f111376OooO0Oo);
            oooO0O0OooO00o.OooOO0o(interfaceC33531OooO0o0, 4, value.f111378OooO0o0);
            oooO0O0OooO00o.OooOo0O(interfaceC33531OooO0o0, 5, value.f111377OooO0o);
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            Map<String, Float> map = value.f111379OooO0oO;
            if (zOooOoO0 || map != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 6, C31232OooO0o0.f111372OooO0oo[6], map);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oo0OO0.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C31232OooO0o0> serializer() {
            return OooO00o.f111380OooO00o;
        }
    }

    public /* synthetic */ C31232OooO0o0(int i, String str, C31231OooO0o c31231OooO0o, Matrix matrix, Matrix matrix2, String str2, long j, Map map) {
        if (63 != (i & 63)) {
            C24242OooOOo.OooO0O0(i, 63, OooO00o.f111380OooO00o.getDescriptor());
            throw null;
        }
        this.f111373OooO00o = str;
        this.f111374OooO0O0 = c31231OooO0o;
        this.f111375OooO0OO = matrix;
        this.f111376OooO0Oo = matrix2;
        this.f111378OooO0o0 = str2;
        this.f111377OooO0o = j;
        if ((i & 64) == 0) {
            this.f111379OooO0oO = null;
        } else {
            this.f111379OooO0oO = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31232OooO0o0)) {
            return false;
        }
        C31232OooO0o0 c31232OooO0o0 = (C31232OooO0o0) obj;
        return OooOOO0.OooO0O0(this.f111373OooO00o, c31232OooO0o0.f111373OooO00o) && OooOOO0.OooO0O0(this.f111374OooO0O0, c31232OooO0o0.f111374OooO0O0) && OooOOO0.OooO0O0(this.f111375OooO0OO, c31232OooO0o0.f111375OooO0OO) && OooOOO0.OooO0O0(this.f111376OooO0Oo, c31232OooO0o0.f111376OooO0Oo) && OooOOO0.OooO0O0(this.f111378OooO0o0, c31232OooO0o0.f111378OooO0o0) && this.f111377OooO0o == c31232OooO0o0.f111377OooO0o && OooOOO0.OooO0O0(this.f111379OooO0oO, c31232OooO0o0.f111379OooO0oO);
    }

    public final int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.f111376OooO0Oo.hashCode() + ((this.f111375OooO0OO.hashCode() + ((this.f111374OooO0O0.hashCode() + (this.f111373OooO00o.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f111378OooO0o0), 31, this.f111377OooO0o);
        Map<String, Float> map = this.f111379OooO0oO;
        return iOooO0O0 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "SerializedInkStroke(id=" + this.f111373OooO00o + ", stroke=" + this.f111374OooO0O0 + ", strokeToWorldTransform=" + this.f111375OooO0OO + ", worldToViewTransform=" + this.f111376OooO0Oo + ", layerId=" + this.f111378OooO0o0 + ", creationTime=" + this.f111377OooO0o + ", behaviorParams=" + this.f111379OooO0oO + ")";
    }
}
