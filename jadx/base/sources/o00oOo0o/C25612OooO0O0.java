package o00oOo0o;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import o00o0o.AbstractC25434OooO00o;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oOooo.C25634OooO0OO;
import o00oOooo.InterfaceC25633OooO0O0;
import o00oo.C25638OooO0oO;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25640OooOO0o;
import o00oo0O.C25651OooO00o;
import o00oo0oO.InterfaceC25727OooO0OO;

/* JADX INFO: renamed from: o00oOo0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25612OooO0O0 implements InterfaceC25727OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AnimatedFactoryV2Impl f87403OooO00o;

    public C25612OooO0O0(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.f87403OooO00o = animatedFactoryV2Impl;
    }

    @Override // o00oo0oO.InterfaceC25727OooO0OO
    public final InterfaceC25636OooO0Oo OooO00o(C25638OooO0oO c25638OooO0oO, int i, InterfaceC25640OooOO0o interfaceC25640OooOO0o, C25651OooO00o c25651OooO00o) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.f87403OooO00o;
        if (animatedFactoryV2Impl.f67253OooO0o0 == null) {
            animatedFactoryV2Impl.f67253OooO0o0 = new C25634OooO0OO(new C25613OooO0OO(animatedFactoryV2Impl), animatedFactoryV2Impl.f67248OooO00o, animatedFactoryV2Impl.f67257OooOO0O);
        }
        C25634OooO0OO c25634OooO0OO = animatedFactoryV2Impl.f67253OooO0o0;
        Bitmap.Config config = c25651OooO00o.f87564OooO0O0;
        c25634OooO0OO.getClass();
        InterfaceC25633OooO0O0 interfaceC25633OooO0O0 = C25634OooO0OO.f87488OooO00o;
        if (interfaceC25633OooO0O0 == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
        abstractC25434OooO00oOooOOO0.getClass();
        try {
            InterfaceC25449OooO0oO interfaceC25449OooO0oO = (InterfaceC25449OooO0oO) abstractC25434OooO00oOooOOO0.Oooo000();
            o00oo.OooO0O0 oooO0O0OooO00o = C25634OooO0OO.OooO00o(c25638OooO0oO.f87510Oooo000, c25651OooO00o, interfaceC25449OooO0oO.OooOO0o() != null ? interfaceC25633OooO0O0.OooO0OO(interfaceC25449OooO0oO.OooOO0o(), c25651OooO00o) : interfaceC25633OooO0O0.OooO0Oo(interfaceC25449OooO0oO.OooO(), interfaceC25449OooO0oO.size(), c25651OooO00o));
            abstractC25434OooO00oOooOOO0.close();
            return oooO0O0OooO00o;
        } catch (Throwable th) {
            abstractC25434OooO00oOooOOO0.close();
            throw th;
        }
    }
}
