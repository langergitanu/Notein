package o00oOooo;

import com.facebook.animated.webp.WebPImage;
import o00o0o.AbstractC25434OooO00o;
import o00oOo0o.C25613OooO0OO;
import o00oOoo0.C25629OooO0Oo;
import o00oOoo0.C25630OooO0o0;
import o00oOoo0.InterfaceC25628OooO0OO;
import o00oo0O.C25651OooO00o;
import o00oo0OO.AbstractC25682OooO0O0;

/* JADX INFO: renamed from: o00oOooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25634OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InterfaceC25633OooO0O0 f87488OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final InterfaceC25633OooO0O0 f87489OooO0O0;

    static {
        InterfaceC25633OooO0O0 interfaceC25633OooO0O0;
        InterfaceC25633OooO0O0 interfaceC25633OooO0O02 = null;
        try {
            interfaceC25633OooO0O0 = (InterfaceC25633OooO0O0) Class.forName("com.facebook.animated.gif.GifImage").newInstance();
        } catch (Throwable unused) {
            interfaceC25633OooO0O0 = null;
        }
        f87488OooO00o = interfaceC25633OooO0O0;
        try {
            interfaceC25633OooO0O02 = (InterfaceC25633OooO0O0) WebPImage.class.newInstance();
        } catch (Throwable unused2) {
        }
        f87489OooO0O0 = interfaceC25633OooO0O02;
    }

    public C25634OooO0OO(C25613OooO0OO c25613OooO0OO, AbstractC25682OooO0O0 abstractC25682OooO0O0, boolean z) {
    }

    public static o00oo.OooO0O0 OooO00o(String str, C25651OooO00o c25651OooO00o, InterfaceC25628OooO0OO interfaceC25628OooO0OO) {
        c25651OooO00o.getClass();
        C25630OooO0o0 c25630OooO0o0 = new C25630OooO0o0(interfaceC25628OooO0OO);
        c25630OooO0o0.f87479OooO0O0 = null;
        c25630OooO0o0.f87480OooO0OO = null;
        c25630OooO0o0.f87481OooO0Oo = str;
        try {
            C25629OooO0Oo c25629OooO0Oo = new C25629OooO0Oo(c25630OooO0o0);
            AbstractC25434OooO00o.OooOooo(c25630OooO0o0.f87479OooO0O0);
            c25630OooO0o0.f87479OooO0O0 = null;
            AbstractC25434OooO00o.OooOOoo(c25630OooO0o0.f87480OooO0OO);
            c25630OooO0o0.f87480OooO0OO = null;
            o00oo.OooO0O0 oooO0O0 = new o00oo.OooO0O0();
            oooO0O0.f87493OooOoO = c25629OooO0Oo;
            oooO0O0.f87494OooOoOO = true;
            return oooO0O0;
        } catch (Throwable th) {
            AbstractC25434OooO00o.OooOooo(c25630OooO0o0.f87479OooO0O0);
            c25630OooO0o0.f87479OooO0O0 = null;
            AbstractC25434OooO00o.OooOOoo(c25630OooO0o0.f87480OooO0OO);
            c25630OooO0o0.f87480OooO0OO = null;
            throw th;
        }
    }
}
