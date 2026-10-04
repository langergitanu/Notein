package o0Oo0OO0;

import Oooo0oO.C21023OooO0Oo;
import com.huawei.hms.network.embedded.C18198h4;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33971OoooO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C28065OooO0O0 {
    public static final C19887OooO0O0 Companion = new C19887OooO0O0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final InterfaceC33911OooO0OO<Object>[] f99486OooO0o0 = {null, null, new C33938OooO0o0(o00000OO.f122230OooO00o), null};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f99487OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f99488OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<String> f99489OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f99490OooO0Oo = 0;

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0O0$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C28065OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99491OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f99491OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.integrity.data.AppIntegrity", oooO00o, 4);
            c34001o0ooOO0.OooOO0("appRecognitionVerdict", true);
            c34001o0ooOO0.OooOO0("packageName", true);
            c34001o0ooOO0.OooOO0("certificateSha256Digest", true);
            c34001o0ooOO0.OooOO0(C18198h4.f55025c, true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = C28065OooO0O0.f99486OooO0o0;
            o00000OO o00000oo2 = o00000OO.f122230OooO00o;
            return new InterfaceC33911OooO0OO[]{C33928OooO00o.OooO0OO(o00000oo2), C33928OooO00o.OooO0OO(o00000oo2), C33928OooO00o.OooO0OO(interfaceC33911OooO0OOArr[2]), C33971OoooO.f122193OooO00o};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = C28065OooO0O0.f99486OooO0o0;
            boolean z = true;
            int i = 0;
            int iOooOo0 = 0;
            String str = null;
            String str2 = null;
            List<String> list = null;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    str = (String) OooO00o2.OooOOO(interfaceC33531OooO0o0, 0, o00000OO.f122230OooO00o, str);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    str2 = (String) OooO00o2.OooOOO(interfaceC33531OooO0o0, 1, o00000OO.f122230OooO00o, str2);
                    i |= 2;
                } else if (iOooOo0o == 2) {
                    list = (List) OooO00o2.OooOOO(interfaceC33531OooO0o0, 2, interfaceC33911OooO0OOArr[2], list);
                    i |= 4;
                } else {
                    if (iOooOo0o != 3) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    iOooOo0 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 3);
                    i |= 8;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            C28065OooO0O0 c28065OooO0O0 = new C28065OooO0O0();
            if ((i & 1) == 0) {
                c28065OooO0O0.f99487OooO00o = null;
            } else {
                c28065OooO0O0.f99487OooO00o = str;
            }
            if ((i & 2) == 0) {
                c28065OooO0O0.f99488OooO0O0 = null;
            } else {
                c28065OooO0O0.f99488OooO0O0 = str2;
            }
            if ((i & 4) == 0) {
                c28065OooO0O0.f99489OooO0OO = null;
            } else {
                c28065OooO0O0.f99489OooO0OO = list;
            }
            if ((i & 8) == 0) {
                c28065OooO0O0.f99490OooO0Oo = 0;
                return c28065OooO0O0;
            }
            c28065OooO0O0.f99490OooO0Oo = iOooOo0;
            return c28065OooO0O0;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C28065OooO0O0 value = (C28065OooO0O0) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            C19887OooO0O0 c19887OooO0O0 = C28065OooO0O0.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            String str = value.f99487OooO00o;
            if (zOooOoO0 || str != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 0, o00000OO.f122230OooO00o, str);
            }
            boolean zOooOoO02 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            String str2 = value.f99488OooO0O0;
            if (zOooOoO02 || str2 != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 1, o00000OO.f122230OooO00o, str2);
            }
            boolean zOooOoO03 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            List<String> list = value.f99489OooO0OO;
            if (zOooOoO03 || list != null) {
                oooO0O0OooO00o.OooOo(interfaceC33531OooO0o0, 2, C28065OooO0O0.f99486OooO0o0[2], list);
            }
            boolean zOooOoO04 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            int i = value.f99490OooO0Oo;
            if (zOooOoO04 || i != 0) {
                oooO0O0OooO00o.OooOoOO(3, i, interfaceC33531OooO0o0);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0OO0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19887OooO0O0 {
        public final InterfaceC33911OooO0OO<C28065OooO0O0> serializer() {
            return OooO00o.f99491OooO00o;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28065OooO0O0)) {
            return false;
        }
        C28065OooO0O0 c28065OooO0O0 = (C28065OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f99487OooO00o, c28065OooO0O0.f99487OooO00o) && OooOOO0.OooO0O0(this.f99488OooO0O0, c28065OooO0O0.f99488OooO0O0) && OooOOO0.OooO0O0(this.f99489OooO0OO, c28065OooO0O0.f99489OooO0OO) && this.f99490OooO0Oo == c28065OooO0O0.f99490OooO0Oo;
    }

    public final int hashCode() {
        String str = this.f99487OooO00o;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f99488OooO0O0;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f99489OooO0OO;
        return Integer.hashCode(this.f99490OooO0Oo) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppIntegrity(appRecognitionVerdict=");
        sb.append(this.f99487OooO00o);
        sb.append(", packageName=");
        sb.append(this.f99488OooO0O0);
        sb.append(", certificateSha256Digest=");
        sb.append(this.f99489OooO0OO);
        sb.append(", versionCode=");
        return C21023OooO0Oo.OooO0OO(")", this.f99490OooO0Oo, sb);
    }
}
