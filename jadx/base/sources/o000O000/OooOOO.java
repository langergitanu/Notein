package o000O000;

import java.nio.ByteBuffer;
import o000OoO.C24533OooO00o;
import o000OoO.C24534OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ThreadLocal<C24533OooO00o> f82282OooO0Oo = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f82283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24385OooOO0o f82284OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile int f82285OooO0OO = 0;

    public OooOOO(C24385OooOO0o c24385OooOO0o, int i) {
        this.f82284OooO0O0 = c24385OooOO0o;
        this.f82283OooO00o = i;
    }

    public final int OooO00o(int i) {
        C24533OooO00o c24533OooO00oOooO0O0 = OooO0O0();
        int iOooO00o = c24533OooO00oOooO0O0.OooO00o(16);
        if (iOooO00o == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c24533OooO00oOooO0O0.f82986OooO0O0;
        int i2 = iOooO00o + c24533OooO00oOooO0O0.f82985OooO00o;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final C24533OooO00o OooO0O0() {
        ThreadLocal<C24533OooO00o> threadLocal = f82282OooO0Oo;
        C24533OooO00o c24533OooO00o = threadLocal.get();
        if (c24533OooO00o == null) {
            c24533OooO00o = new C24533OooO00o();
            threadLocal.set(c24533OooO00o);
        }
        C24534OooO0O0 c24534OooO0O0 = this.f82284OooO0O0.f82276OooO00o;
        int iOooO00o = c24534OooO0O0.OooO00o(6);
        if (iOooO00o != 0) {
            int i = iOooO00o + c24534OooO0O0.f82985OooO00o;
            int i2 = (this.f82283OooO00o * 4) + c24534OooO0O0.f82986OooO0O0.getInt(i) + i + 4;
            int i3 = c24534OooO0O0.f82986OooO0O0.getInt(i2) + i2;
            ByteBuffer byteBuffer = c24534OooO0O0.f82986OooO0O0;
            c24533OooO00o.f82986OooO0O0 = byteBuffer;
            if (byteBuffer != null) {
                c24533OooO00o.f82985OooO00o = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c24533OooO00o.f82987OooO0OO = i4;
                c24533OooO00o.f82988OooO0Oo = c24533OooO00o.f82986OooO0O0.getShort(i4);
                return c24533OooO00o;
            }
            c24533OooO00o.f82985OooO00o = 0;
            c24533OooO00o.f82987OooO0OO = 0;
            c24533OooO00o.f82988OooO0Oo = 0;
        }
        return c24533OooO00o;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C24533OooO00o c24533OooO00oOooO0O0 = OooO0O0();
        int iOooO00o = c24533OooO00oOooO0O0.OooO00o(4);
        sb.append(Integer.toHexString(iOooO00o != 0 ? c24533OooO00oOooO0O0.f82986OooO0O0.getInt(iOooO00o + c24533OooO00oOooO0O0.f82985OooO00o) : 0));
        sb.append(", codepoints:");
        C24533OooO00o c24533OooO00oOooO0O02 = OooO0O0();
        int iOooO00o2 = c24533OooO00oOooO0O02.OooO00o(16);
        if (iOooO00o2 != 0) {
            int i2 = iOooO00o2 + c24533OooO00oOooO0O02.f82985OooO00o;
            i = c24533OooO00oOooO0O02.f82986OooO0O0.getInt(c24533OooO00oOooO0O02.f82986OooO0O0.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(OooO00o(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
