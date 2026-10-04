package o0oo0o00;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.util.Arrays;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: o0oo0o00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31305OooOOoo extends AbstractC31307OooOo0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String[] f111764OooOooo = new String[128];

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C34524OooO0Oo f111765OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f111766OooOooO;

    static {
        for (int i = 0; i <= 31; i++) {
            f111764OooOooo[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f111764OooOooo;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C31305OooOOoo(C34524OooO0Oo c34524OooO0Oo) {
        this.f111765OooOoo = c34524OooO0Oo;
        OooOOO0(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o0Oo0oo(C34524OooO0Oo c34524OooO0Oo, String str) throws IOException {
        String str2;
        String[] strArr = f111764OooOooo;
        c34524OooO0Oo.o0OoO0o(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        c34524OooO0Oo.o000Oo0O(i, i2, str);
                    }
                    c34524OooO0Oo.o000Oo0o(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                c34524OooO0Oo.o000Oo0o(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            c34524OooO0Oo.o000Oo0O(i, length, str);
        }
        c34524OooO0Oo.o0OoO0o(34);
    }

    public final void OooOOo0() throws IOException {
        int iOooO0OO = OooO0OO();
        int i = 2;
        if (iOooO0OO != 1) {
            C34524OooO0Oo c34524OooO0Oo = this.f111765OooOoo;
            if (iOooO0OO == 2) {
                c34524OooO0Oo.o0OoO0o(44);
            } else if (iOooO0OO == 4) {
                c34524OooO0Oo.o000Oo0o(C18241k5.f55433h);
                i = 5;
            } else {
                if (iOooO0OO == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iOooO0OO != 6) {
                    if (iOooO0OO != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i = 7;
            }
        }
        this.f111780OooOo[this.f111781OooOo0o - 1] = i;
    }

    public final AbstractC31307OooOo0 OooOOoo() throws IOException {
        if (this.f111784OooOoOO) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + OooO00o());
        }
        o0000oO();
        o00Oo0(1, 2, '[');
        return this;
    }

    public final AbstractC31307OooOo0 OooOooo() throws IOException {
        if (this.f111784OooOoOO) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + OooO00o());
        }
        o0000oO();
        o00Oo0(3, 5, '{');
        return this;
    }

    public final AbstractC31307OooOo0 Oooo0() throws IOException {
        this.f111784OooOoOO = false;
        Oooo000(3, 5, '}');
        return this;
    }

    public final void Oooo000(int i, int i2, char c) throws IOException {
        int iOooO0OO = OooO0OO();
        if (iOooO0OO != i2 && iOooO0OO != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f111766OooOooO != null) {
            throw new IllegalStateException("Dangling name: " + this.f111766OooOooO);
        }
        int i3 = this.f111781OooOo0o;
        int i4 = ~this.f111785OooOoo0;
        if (i3 == i4) {
            this.f111785OooOoo0 = i4;
            return;
        }
        int i5 = i3 - 1;
        this.f111781OooOo0o = i5;
        this.f111783OooOoO0[i5] = null;
        int[] iArr = this.f111782OooOoO;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f111765OooOoo.o0OoO0o(c);
    }

    public final AbstractC31307OooOo0 Oooo00o() throws IOException {
        Oooo000(1, 2, ']');
        return this;
    }

    public final AbstractC31307OooOo0 Oooo0OO(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f111781OooOo0o == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iOooO0OO = OooO0OO();
        if ((iOooO0OO != 3 && iOooO0OO != 5) || this.f111766OooOooO != null || this.f111784OooOoOO) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f111766OooOooO = str;
        this.f111783OooOoO0[this.f111781OooOo0o - 1] = str;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f111781OooOo0o;
        if (i > 1 || (i == 1 && this.f111780OooOo[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f111781OooOo0o = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f111781OooOo0o == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final AbstractC31307OooOo0 o00000OO(long j) throws IOException {
        if (this.f111784OooOoOO) {
            this.f111784OooOoOO = false;
            Oooo0OO(Long.toString(j));
            return this;
        }
        o0000oO();
        OooOOo0();
        this.f111765OooOoo.o000Oo0o(Long.toString(j));
        int[] iArr = this.f111782OooOoO;
        int i = this.f111781OooOo0o - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final AbstractC31307OooOo0 o00000oO(String str) throws IOException {
        if (str == null) {
            ooOO();
            return this;
        }
        if (this.f111784OooOoOO) {
            this.f111784OooOoOO = false;
            Oooo0OO(str);
            return this;
        }
        o0000oO();
        OooOOo0();
        o0Oo0oo(this.f111765OooOoo, str);
        int[] iArr = this.f111782OooOoO;
        int i = this.f111781OooOo0o - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void o0000oO() throws IOException {
        if (this.f111766OooOooO != null) {
            int iOooO0OO = OooO0OO();
            C34524OooO0Oo c34524OooO0Oo = this.f111765OooOoo;
            if (iOooO0OO == 5) {
                c34524OooO0Oo.o0OoO0o(44);
            } else if (iOooO0OO != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f111780OooOo[this.f111781OooOo0o - 1] = 4;
            o0Oo0oo(c34524OooO0Oo, this.f111766OooOooO);
            this.f111766OooOooO = null;
        }
    }

    public final void o00Oo0(int i, int i2, char c) throws IOException {
        int i3;
        int i4 = this.f111781OooOo0o;
        int i5 = this.f111785OooOoo0;
        if (i4 == i5 && ((i3 = this.f111780OooOo[i4 - 1]) == i || i3 == i2)) {
            this.f111785OooOoo0 = ~i5;
            return;
        }
        OooOOo0();
        int i6 = this.f111781OooOo0o;
        int[] iArr = this.f111780OooOo;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new C31299OooOOO("Nesting too deep at " + OooO00o() + ": circular reference?");
            }
            this.f111780OooOo = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f111783OooOoO0;
            this.f111783OooOoO0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f111782OooOoO;
            this.f111782OooOoO = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        OooOOO0(i);
        this.f111782OooOoO[this.f111781OooOo0o - 1] = 0;
        this.f111765OooOoo.o0OoO0o(c);
    }

    public final AbstractC31307OooOo0 ooOO() throws IOException {
        if (this.f111784OooOoOO) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + OooO00o());
        }
        if (this.f111766OooOooO != null) {
            this.f111766OooOooO = null;
            return this;
        }
        OooOOo0();
        this.f111765OooOoo.o000Oo0o(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        int[] iArr = this.f111782OooOoO;
        int i = this.f111781OooOo0o - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
