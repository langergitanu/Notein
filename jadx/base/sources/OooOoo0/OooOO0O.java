package OooOoo0;

import OooOo.C20496Oooo0o0;
import Oooo0.C20857Oooooo;
import Oooo00o.AbstractC20903OooO00o;
import Ooooo00.C21245OooO0O0;
import OooooO0.C21284OooO;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import OooooOO.AbstractC21365o0OoOo0;
import OooooOO.C21324OooOooO;
import OooooOO.C21334Oooo0o0;
import OooooOO.C21335Oooo0oO;
import OooooOO.C21340OoooO0O;
import OooooOO.C21368o0ooOoO;
import OooooOO.InterfaceC21370ooOO;
import Oooooo0.C21403OooO0oO;
import Oooooo0.C21404OooO0oo;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import o0000Ooo.C24232OooO0o0;
import o00oO0O.C25548o0ooOoO;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21245OooO0O0, Ooooo00.OooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC20903OooO00o f59264OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ float f59265OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C21368o0ooOoO f59266OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C25548o0ooOoO<OooO> f59267OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(float f, AbstractC20903OooO00o abstractC20903OooO00o, C25548o0ooOoO c25548o0ooOoO, C21368o0ooOoO c21368o0ooOoO) {
        super(1);
        this.f59265OooOo0o = f;
        this.f59264OooOo = abstractC20903OooO00o;
        this.f59267OooOoO0 = c25548o0ooOoO;
        this.f59266OooOoO = c21368o0ooOoO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Ooooo00.OooO invoke(C21245OooO0O0 c21245OooO0O0) {
        C21334Oooo0o0 c21334Oooo0o0;
        C21245OooO0O0 drawWithCache = c21245OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawWithCache, "$this$drawWithCache");
        float density = drawWithCache.getDensity();
        float f = this.f59265OooOo0o;
        if (density * f < 0.0f || C21293OooOO0.OooO0OO(drawWithCache.f61627OooOo0o.OooOOo0()) <= 0.0f) {
            return drawWithCache.OooO0O0(OooOOO0.f59273OooOo0o);
        }
        float f2 = 2;
        float fMin = Math.min(C24232OooO0o0.OooO00o(f, 0.0f) ? 1.0f : (float) Math.ceil(drawWithCache.getDensity() * f), (float) Math.ceil(C21293OooOO0.OooO0OO(drawWithCache.f61627OooOo0o.OooOOo0()) / f2));
        float f3 = fMin / f2;
        long jOooO00o = C21289OooO0o.OooO00o(f3, f3);
        long jOooO00o2 = C21294OooOO0O.OooO00o(C21293OooOO0.OooO0Oo(drawWithCache.f61627OooOo0o.OooOOo0()) - fMin, C21293OooOO0.OooO0O0(drawWithCache.f61627OooOo0o.OooOOo0()) - fMin);
        boolean z = f2 * fMin > C21293OooOO0.OooO0OO(drawWithCache.f61627OooOo0o.OooOOo0());
        AbstractC21365o0OoOo0 abstractC21365o0OoOo0OooO00o = this.f59264OooOo.OooO00o(drawWithCache.f61627OooOo0o.OooOOo0(), drawWithCache.f61627OooOo0o.getLayoutDirection(), drawWithCache);
        boolean z2 = abstractC21365o0OoOo0OooO00o instanceof AbstractC21365o0OoOo0.OooO00o;
        C21368o0ooOoO c21368o0ooOoO = this.f59266OooOoO;
        if (z2) {
            AbstractC21365o0OoOo0.OooO00o oooO00o = (AbstractC21365o0OoOo0.OooO00o) abstractC21365o0OoOo0OooO00o;
            if (z) {
                return drawWithCache.OooO0O0(new OooOOO(oooO00o, c21368o0ooOoO));
            }
            int i = Build.VERSION.SDK_INT;
            long j = c21368o0ooOoO.f61817OooO00o;
            Object nativeColorFilter = i >= 29 ? C21340OoooO0O.f61755OooO00o.OooO00o(j, 5) : new PorterDuffColorFilter(C20496Oooo0o0.OooO0oo(j), C21324OooOooO.OooO0O0(5));
            kotlin.jvm.internal.OooOOO0.OooO0oO(nativeColorFilter, "nativeColorFilter");
            throw null;
        }
        if (!(abstractC21365o0OoOo0OooO00o instanceof AbstractC21365o0OoOo0.OooO0OO)) {
            if (!(abstractC21365o0OoOo0OooO00o instanceof AbstractC21365o0OoOo0.OooO0O0)) {
                throw new C32442OooOO0o();
            }
            if (z) {
                jOooO00o = C21290OooO0o0.f61718OooO0O0;
            }
            long j2 = jOooO00o;
            if (z) {
                jOooO00o2 = drawWithCache.f61627OooOo0o.OooOOo0();
            }
            return drawWithCache.OooO0O0(new OooOOOO(c21368o0ooOoO, j2, jOooO00o2, z ? C21403OooO0oO.f61923OooOo0o : new C21404OooO0oo(fMin, 0.0f, 0, 0, 30)));
        }
        C21284OooO c21284OooO = ((AbstractC21365o0OoOo0.OooO0OO) abstractC21365o0OoOo0OooO00o).f61802OooO00o;
        if (C20857Oooooo.OooO0OO(c21284OooO)) {
            return drawWithCache.OooO0O0(new C20661OooOOOo(z, c21368o0ooOoO, c21284OooO.f61707OooO0o0, f3, fMin, jOooO00o, jOooO00o2, new C21404OooO0oo(fMin, 0.0f, 0, 0, 30)));
        }
        C25548o0ooOoO<OooO> c25548o0ooOoO = this.f59267OooOoO0;
        OooO oooO = c25548o0ooOoO.f87134OooO00o;
        if (oooO == null) {
            oooO = new OooO(0);
            c25548o0ooOoO.f87134OooO00o = oooO;
        }
        C21334Oooo0o0 c21334Oooo0o0OooO00o = oooO.f59219OooO00o;
        if (c21334Oooo0o0OooO00o == null) {
            c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
            oooO.f59219OooO00o = c21334Oooo0o0OooO00o;
        }
        c21334Oooo0o0OooO00o.reset();
        c21334Oooo0o0OooO00o.OooO0o(c21284OooO);
        if (z) {
            c21334Oooo0o0 = c21334Oooo0o0OooO00o;
        } else {
            InterfaceC21370ooOO interfaceC21370ooOOOooO00o = C21335Oooo0oO.OooO00o();
            C21334Oooo0o0 c21334Oooo0o02 = c21334Oooo0o0OooO00o;
            interfaceC21370ooOOOooO00o.OooO0o(new C21284OooO(fMin, fMin, c21284OooO.OooO0O0() - fMin, c21284OooO.OooO00o() - fMin, C20662OooOOo.OooO00o(fMin, c21284OooO.f61707OooO0o0), C20662OooOOo.OooO00o(fMin, c21284OooO.f61706OooO0o), C20662OooOOo.OooO00o(fMin, c21284OooO.f61708OooO0oO), C20662OooOOo.OooO00o(fMin, c21284OooO.f61709OooO0oo)));
            c21334Oooo0o02.OooO0oo(c21334Oooo0o02, interfaceC21370ooOOOooO00o, 0);
            c21334Oooo0o0 = c21334Oooo0o02;
        }
        return drawWithCache.OooO0O0(new C20663OooOOo0(c21334Oooo0o0, c21368o0ooOoO));
    }
}
