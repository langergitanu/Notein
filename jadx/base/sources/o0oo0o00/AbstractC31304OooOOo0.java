package o0oo0o00;

import OooOooO.C20733OooOO0O;
import com.aspose.slides.C22226Oooo0oo;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34536OooOOo;

/* JADX INFO: renamed from: o0oo0o00.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31304OooOOo0 implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int[] f111747OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111748OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int[] f111749OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String[] f111750OooOoO0;

    /* JADX INFO: renamed from: o0oo0o00.OooOOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f111751OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C34536OooOOo f111752OooO0O0;

        public OooO00o(String[] strArr, C34536OooOOo c34536OooOOo) {
            this.f111751OooO00o = strArr;
            this.f111752OooO0O0 = c34536OooOOo;
        }

        public static OooO00o OooO00o(String... strArr) {
            try {
                C34527OooO0oO[] c34527OooO0oOArr = new C34527OooO0oO[strArr.length];
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                for (int i = 0; i < strArr.length; i++) {
                    C31305OooOOoo.o0Oo0oo(c34524OooO0Oo, strArr[i]);
                    c34524OooO0Oo.readByte();
                    c34527OooO0oOArr[i] = c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo);
                }
                return new OooO00o((String[]) strArr.clone(), C34536OooOOo.OooO00o.OooO0O0(c34527OooO0oOArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0oo0o00.OooOOo0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f111753OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f111754OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0O0 f111755OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f111756OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0O0 f111757OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO0O0 f111758OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO0O0 f111759OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO0O0 f111760OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO0O0 f111761OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final OooO0O0 f111762Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f111763Oooo00O;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("BEGIN_ARRAY", 0);
            f111754OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("END_ARRAY", 1);
            f111753OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("BEGIN_OBJECT", 2);
            f111756OooOoO0 = oooO0O03;
            OooO0O0 oooO0O04 = new OooO0O0("END_OBJECT", 3);
            f111755OooOoO = oooO0O04;
            OooO0O0 oooO0O05 = new OooO0O0("NAME", 4);
            f111757OooOoOO = oooO0O05;
            OooO0O0 oooO0O06 = new OooO0O0("STRING", 5);
            f111759OooOoo0 = oooO0O06;
            OooO0O0 oooO0O07 = new OooO0O0("NUMBER", 6);
            f111758OooOoo = oooO0O07;
            OooO0O0 oooO0O08 = new OooO0O0("BOOLEAN", 7);
            f111760OooOooO = oooO0O08;
            OooO0O0 oooO0O09 = new OooO0O0("NULL", 8);
            f111761OooOooo = oooO0O09;
            OooO0O0 oooO0O010 = new OooO0O0("END_DOCUMENT", 9);
            f111762Oooo000 = oooO0O010;
            f111763Oooo00O = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04, oooO0O05, oooO0O06, oooO0O07, oooO0O08, oooO0O09, oooO0O010};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f111763Oooo00O.clone();
        }
    }

    public final String OooO00o() {
        return C20733OooOO0O.OooO0O0(this.f111748OooOo0o, this.f111747OooOo, this.f111750OooOoO0, this.f111749OooOoO);
    }

    public final void OooO0OO(int i) {
        int i2 = this.f111748OooOo0o;
        int[] iArr = this.f111747OooOo;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C31299OooOOO("Nesting too deep at " + OooO00o());
            }
            this.f111747OooOo = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f111750OooOoO0;
            this.f111750OooOoO0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f111749OooOoO;
            this.f111749OooOoO = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f111747OooOo;
        int i3 = this.f111748OooOo0o;
        this.f111748OooOo0o = i3 + 1;
        iArr3[i3] = i;
    }

    public final void OooOOO0(String str) throws C31301OooOOOO {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " at path ");
        sbOooO0OO.append(OooO00o());
        throw new C31301OooOOOO(sbOooO0OO.toString());
    }
}
