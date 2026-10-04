package o0Oo0OO0;

import OooOoo0.C20703o000000o;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33983OooooO0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28068OooO0o {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f99499OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f99500OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f99501OooO0OO = null;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0o$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C28068OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99502OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f99502OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.RequestDetails", oooO00o, 3);
            c34001o0ooOO0.OooOO0("requestPackageName", true);
            c34001o0ooOO0.OooOO0("timestampMillis", true);
            c34001o0ooOO0.OooOO0("requestHash", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            o00000OO o00000oo2 = o00000OO.f122230OooO00o;
            return new InterfaceC33911OooO0OO[]{C33928OooO00o.OooO0OO(o00000oo2), C33983OooooO0.f122206OooO00o, C33928OooO00o.OooO0OO(o00000oo2)};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            long jOooOo00 = 0;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    str = (String) OooO00o2.OooOOO(interfaceC33531OooO0o0, 0, o00000OO.f122230OooO00o, str);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    jOooOo00 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 1);
                    i |= 2;
                } else {
                    if (iOooOo0o != 2) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    str2 = (String) OooO00o2.OooOOO(interfaceC33531OooO0o0, 2, o00000OO.f122230OooO00o, str2);
                    i |= 4;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            C28068OooO0o c28068OooO0o = new C28068OooO0o();
            if ((i & 1) == 0) {
                c28068OooO0o.f99499OooO00o = null;
            } else {
                c28068OooO0o.f99499OooO00o = str;
            }
            if ((i & 2) == 0) {
                c28068OooO0o.f99500OooO0O0 = 0L;
            } else {
                c28068OooO0o.f99500OooO0O0 = jOooOo00;
            }
            if ((i & 4) == 0) {
                c28068OooO0o.f99501OooO0OO = null;
                return c28068OooO0o;
            }
            c28068OooO0o.f99501OooO0OO = str2;
            return c28068OooO0o;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28068OooO0o value = (C28068OooO0o) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C28068OooO0o.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            String str = value.f99499OooO00o;
            if (zOooOoO0 || str != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 0, o00000OO.f122230OooO00o, str);
            }
            boolean zOooOoO02 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            long j = value.f99500OooO0O0;
            if (zOooOoO02 || j != 0) {
                oooO0O0OooO00o.OooOo0O(interfaceC33531OooO0o0, 1, j);
            }
            boolean zOooOoO03 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            String str2 = value.f99501OooO0OO;
            if (zOooOoO03 || str2 != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 2, o00000OO.f122230OooO00o, str2);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0o$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C28068OooO0o> serializer() {
            return OooO00o.f99502OooO00o;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28068OooO0o)) {
            return false;
        }
        C28068OooO0o c28068OooO0o = (C28068OooO0o) obj;
        return OooOOO0.OooO0O0(this.f99499OooO00o, c28068OooO0o.f99499OooO00o) && this.f99500OooO0O0 == c28068OooO0o.f99500OooO0O0 && OooOOO0.OooO0O0(this.f99501OooO0OO, c28068OooO0o.f99501OooO0OO);
    }

    public final int hashCode() {
        String str = this.f99499OooO00o;
        int iOooO0O0 = C20703o000000o.OooO0O0((str == null ? 0 : str.hashCode()) * 31, 31, this.f99500OooO0O0);
        String str2 = this.f99501OooO0OO;
        return iOooO0O0 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestDetails(requestPackageName=");
        sb.append(this.f99499OooO00o);
        sb.append(", timestampMillis=");
        sb.append(this.f99500OooO0O0);
        sb.append(", requestHash=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f99501OooO0OO, ")");
    }
}
