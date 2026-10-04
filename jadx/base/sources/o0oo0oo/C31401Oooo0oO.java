package o0oo0oo;

import android.graphics.Path;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0ooo.C31412OooO00o;

/* JADX INFO: renamed from: o0oo0oo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31401Oooo0oO implements InterfaceC31322OooO0O0, Closeable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC31397Oooo0O0 f112125OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public HashMap f112127OooOoOO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112124OooOo0o = -1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f112123OooOo = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f112126OooOoO0 = new HashMap();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f112128OooOoo0 = new ArrayList();

    public C31401Oooo0oO(AbstractC31397Oooo0O0 abstractC31397Oooo0O0) {
        this.f112125OooOoO = abstractC31397Oooo0O0;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final List<Number> OooO00o() throws IOException {
        float fO0000O0O = (1000.0f / o0000O0O()) * 0.001f;
        return Arrays.asList(Float.valueOf(fO0000O0O), 0, 0, Float.valueOf(fO0000O0O), 0, 0);
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final C31412OooO00o OooO0OO() throws IOException {
        C31380OooOOo0 c31380OooOOo0Oooo000 = Oooo000();
        short s = c31380OooOOo0Oooo000.f112058OooO0oO;
        short s2 = c31380OooOOo0Oooo000.f112056OooO;
        float fO0000O0O = 1000.0f / o0000O0O();
        return new C31412OooO00o(s * fO0000O0O, c31380OooOOo0Oooo000.f112059OooO0oo * fO0000O0O, s2 * fO0000O0O, c31380OooOOo0Oooo000.f112060OooOO0 * fO0000O0O);
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public Path OooOOO0(String str) throws IOException {
        C31368OooOO0O c31368OooOO0OOooO0O0 = OooOooo().OooO0O0(o0000O(str));
        return c31368OooOO0OOooO0O0 == null ? new Path() : c31368OooOO0OOooO0O0.OooO00o();
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final boolean OooOOo0(String str) throws IOException {
        return o0000O(str) != 0;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final float OooOOoo(String str) throws IOException {
        int iO0000O = o0000O(str);
        return Oooo0() != null ? r0.OooO0O0(iO0000O) : 250;
    }

    public C31378OooOOOo OooOooo() throws IOException {
        return (C31378OooOOOo) o0Oo0oo("glyf");
    }

    public final C31381OooOOoo Oooo0() throws IOException {
        return (C31381OooOOoo) o0Oo0oo("hmtx");
    }

    public final C31380OooOOo0 Oooo000() throws IOException {
        return (C31380OooOOo0) o0Oo0oo("head");
    }

    public final C31379OooOOo Oooo00o() throws IOException {
        return (C31379OooOOo) o0Oo0oo("hhea");
    }

    public final int Oooo0OO() throws IOException {
        if (this.f112124OooOo0o == -1) {
            C31386OooOo0o c31386OooOo0o = (C31386OooOo0o) o0Oo0oo("maxp");
            if (c31386OooOo0o != null) {
                this.f112124OooOo0o = c31386OooOo0o.f112072OooO0o;
            } else {
                this.f112124OooOo0o = 0;
            }
        }
        return this.f112124OooOo0o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112125OooOoO.close();
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final String getName() throws IOException {
        C31387OooOoO c31387OooOoO = (C31387OooOoO) o0Oo0oo("name");
        if (c31387OooOoO != null) {
            return c31387OooOoO.f112075OooO0oo;
        }
        return null;
    }

    public final synchronized byte[] o00000OO(C31400Oooo0o0 c31400Oooo0o0) throws IOException {
        byte[] bArrOooOOo0;
        long jOooO00o = this.f112125OooOoO.OooO00o();
        this.f112125OooOoO.seek(c31400Oooo0o0.f112119OooO0O0);
        bArrOooOOo0 = this.f112125OooOoO.OooOOo0((int) c31400Oooo0o0.f112120OooO0OO);
        this.f112125OooOoO.seek(jOooO00o);
        return bArrOooOOo0;
    }

    public final C31362OooO0Oo o00000oO(boolean z) throws IOException {
        C31364OooO0o0 c31364OooO0o0 = (C31364OooO0o0) o0Oo0oo("cmap");
        if (c31364OooO0o0 == null) {
            if (!z) {
                return null;
            }
            throw new IOException("The TrueType font " + getName() + " does not contain a 'cmap' table");
        }
        C31362OooO0Oo c31362OooO0OoOooO0O0 = c31364OooO0o0.OooO0O0(0, 4);
        if (c31362OooO0OoOooO0O0 == null) {
            c31362OooO0OoOooO0O0 = c31364OooO0o0.OooO0O0(3, 10);
        }
        if (c31362OooO0OoOooO0O0 == null) {
            c31362OooO0OoOooO0O0 = c31364OooO0o0.OooO0O0(0, 3);
        }
        if (c31362OooO0OoOooO0O0 == null) {
            c31362OooO0OoOooO0O0 = c31364OooO0o0.OooO0O0(3, 1);
        }
        if (c31362OooO0OoOooO0O0 == null) {
            c31362OooO0OoOooO0O0 = c31364OooO0o0.OooO0O0(3, 0);
        }
        if (c31362OooO0OoOooO0O0 == null) {
            if (z) {
                throw new IOException("The TrueType font does not contain a Unicode cmap");
            }
            C31362OooO0Oo[] c31362OooO0OoArr = c31364OooO0o0.f111984OooO0o;
            if (c31362OooO0OoArr.length > 0) {
                return c31362OooO0OoArr[0];
            }
        }
        return c31362OooO0OoOooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0000O(String str) throws IOException {
        int iCodePointAt;
        Integer num;
        synchronized (this) {
            try {
                if (this.f112127OooOoOO == null && o00Oo0() != null) {
                    String[] strArr = o00Oo0().f112104OooO;
                    if (strArr != null) {
                        this.f112127OooOoOO = new HashMap(strArr.length);
                        for (int i = 0; i < strArr.length; i++) {
                            this.f112127OooOoOO.put(strArr[i], Integer.valueOf(i));
                        }
                    } else {
                        this.f112127OooOoOO = new HashMap();
                    }
                }
            } finally {
            }
        }
        HashMap map = this.f112127OooOoOO;
        if (map != null && (num = (Integer) map.get(str)) != null && num.intValue() > 0 && num.intValue() < ((C31386OooOo0o) o0Oo0oo("maxp")).f112072OooO0o) {
            return num.intValue();
        }
        if (str.startsWith("uni") && str.length() == 7) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i2 = 3;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > length) {
                    break;
                }
                try {
                    int i4 = Integer.parseInt(str.substring(i2, i3), 16);
                    if (i4 <= 55295 || i4 >= 57344) {
                        sb.append((char) i4);
                    }
                    i2 = i3;
                } catch (NumberFormatException unused) {
                }
                iCodePointAt = -1;
            }
            String string = sb.toString();
            if (string.length() != 0) {
                iCodePointAt = string.codePointAt(0);
            }
        } else {
            iCodePointAt = -1;
        }
        if (iCodePointAt > -1) {
            return o0000oO(false).OooO0O0(iCodePointAt);
        }
        return 0;
    }

    public final int o0000O0O() throws IOException {
        if (this.f112123OooOo == -1) {
            C31380OooOOo0 c31380OooOOo0Oooo000 = Oooo000();
            if (c31380OooOOo0Oooo000 != null) {
                this.f112123OooOo = c31380OooOOo0Oooo000.f112057OooO0o;
            } else {
                this.f112123OooOo = 0;
            }
        }
        return this.f112123OooOo;
    }

    public final void o0000Oo0(C31400Oooo0o0 c31400Oooo0o0) throws IOException {
        synchronized (this.f112125OooOoO) {
            long jOooO00o = this.f112125OooOoO.OooO00o();
            this.f112125OooOoO.seek(c31400Oooo0o0.f112119OooO0O0);
            c31400Oooo0o0.OooO00o(this, this.f112125OooOoO);
            this.f112125OooOoO.seek(jOooO00o);
        }
    }

    public void o0000o0(float f) {
    }

    public final InterfaceC31361OooO0OO o0000oO(boolean z) throws IOException {
        C31372OooOOOO c31372OooOOOO;
        C31362OooO0Oo c31362OooO0OoO00000oO = o00000oO(z);
        ArrayList arrayList = this.f112128OooOoo0;
        return (arrayList.isEmpty() || (c31372OooOOOO = (C31372OooOOOO) o0Oo0oo("GSUB")) == null) ? c31362OooO0OoO00000oO : new C31396Oooo00o(c31362OooO0OoO00000oO, c31372OooOOOO, Collections.unmodifiableList(arrayList));
    }

    public final Oooo000 o00Oo0() throws IOException {
        return (Oooo000) o0Oo0oo("post");
    }

    public final synchronized C31400Oooo0o0 o0Oo0oo(String str) throws IOException {
        C31400Oooo0o0 c31400Oooo0o0;
        c31400Oooo0o0 = (C31400Oooo0o0) this.f112126OooOoO0.get(str);
        if (c31400Oooo0o0 != null && !c31400Oooo0o0.f112121OooO0Oo) {
            o0000Oo0(c31400Oooo0o0);
        }
        return c31400Oooo0o0;
    }

    public final C31389OooOoOO ooOO() throws IOException {
        return (C31389OooOoOO) o0Oo0oo("OS/2");
    }

    public final String toString() {
        try {
            C31387OooOoO c31387OooOoO = (C31387OooOoO) o0Oo0oo("name");
            return c31387OooOoO != null ? c31387OooOoO.f112075OooO0oo : "(null)";
        } catch (IOException e) {
            return "(null - " + e.getMessage() + ")";
        }
    }
}
