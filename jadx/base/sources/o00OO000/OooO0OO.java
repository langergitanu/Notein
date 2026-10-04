package o00OO000;

import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34536OooOOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO implements Closeable {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final String[] f84718OooOoOO = new String[128];

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int[] f84719OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f84720OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int[] f84721OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String[] f84722OooOoO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f84723OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C34536OooOOo f84724OooO0O0;

        public OooO00o(String[] strArr, C34536OooOOo c34536OooOOo) {
            this.f84723OooO00o = strArr;
            this.f84724OooO0O0 = c34536OooOOo;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static OooO00o OooO00o(String... strArr) {
            String str;
            try {
                C34527OooO0oO[] c34527OooO0oOArr = new C34527OooO0oO[strArr.length];
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = OooO0OO.f84718OooOoOO;
                    c34524OooO0Oo.o0OoO0o(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    c34524OooO0Oo.o000Oo0O(i2, i3, str2);
                                }
                                c34524OooO0Oo.o000Oo0o(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                            }
                            c34524OooO0Oo.o000Oo0o(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        c34524OooO0Oo.o000Oo0O(i2, length, str2);
                    }
                    c34524OooO0Oo.o0OoO0o(34);
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
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f84725OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f84726OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0O0 f84727OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f84728OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0O0 f84729OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO0O0 f84730OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO0O0 f84731OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO0O0 f84732OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO0O0 f84733OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final OooO0O0 f84734Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f84735Oooo00O;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("BEGIN_ARRAY", 0);
            f84726OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("END_ARRAY", 1);
            f84725OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("BEGIN_OBJECT", 2);
            f84728OooOoO0 = oooO0O03;
            OooO0O0 oooO0O04 = new OooO0O0("END_OBJECT", 3);
            f84727OooOoO = oooO0O04;
            OooO0O0 oooO0O05 = new OooO0O0("NAME", 4);
            f84729OooOoOO = oooO0O05;
            OooO0O0 oooO0O06 = new OooO0O0("STRING", 5);
            f84731OooOoo0 = oooO0O06;
            OooO0O0 oooO0O07 = new OooO0O0("NUMBER", 6);
            f84730OooOoo = oooO0O07;
            OooO0O0 oooO0O08 = new OooO0O0("BOOLEAN", 7);
            f84732OooOooO = oooO0O08;
            OooO0O0 oooO0O09 = new OooO0O0("NULL", 8);
            f84733OooOooo = oooO0O09;
            OooO0O0 oooO0O010 = new OooO0O0("END_DOCUMENT", 9);
            f84734Oooo000 = oooO0O010;
            f84735Oooo00O = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04, oooO0O05, oooO0O06, oooO0O07, oooO0O08, oooO0O09, oooO0O010};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f84735Oooo00O.clone();
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f84718OooOoOO[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f84718OooOoOO;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void OooO00o() throws IOException;

    public abstract void OooO0OO() throws IOException;

    public abstract void OooOOO0() throws IOException;

    public abstract void OooOOo0() throws IOException;

    public final String OooOOoo() {
        int i = this.f84720OooOo0o;
        int[] iArr = this.f84719OooOo;
        String[] strArr = this.f84722OooOoO0;
        int[] iArr2 = this.f84721OooOoO;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean OooOooo() throws IOException;

    public abstract int Oooo0() throws IOException;

    public abstract boolean Oooo000() throws IOException;

    public abstract double Oooo00o() throws IOException;

    public abstract String Oooo0OO() throws IOException;

    public abstract void o00000OO() throws IOException;

    public abstract void o00000oO() throws IOException;

    public final void o0000oO(String str) throws o00OO000.OooO0O0 {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " at path ");
        sbOooO0OO.append(OooOOoo());
        throw new o00OO000.OooO0O0(sbOooO0OO.toString());
    }

    public final void o00Oo0(int i) {
        int i2 = this.f84720OooOo0o;
        int[] iArr = this.f84719OooOo;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new o00OO000.OooO00o("Nesting too deep at " + OooOOoo());
            }
            this.f84719OooOo = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f84722OooOoO0;
            this.f84722OooOoO0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f84721OooOoO;
            this.f84721OooOoO = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f84719OooOo;
        int i3 = this.f84720OooOo0o;
        this.f84720OooOo0o = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int o0Oo0oo(OooO00o oooO00o) throws IOException;

    public abstract OooO0O0 ooOO() throws IOException;
}
