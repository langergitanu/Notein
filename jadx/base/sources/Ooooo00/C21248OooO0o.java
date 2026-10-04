package Ooooo00;

import kotlin.jvm.internal.OooOOOO;
import o00oO0O.C25508OooOoo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Ooooo00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21248OooO0o implements InterfaceC21249OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<C21245OooO0O0, OooO> f61629OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21245OooO0O0 f61630OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C21248OooO0o(C21245OooO0O0 cacheDrawScope, InterfaceC32507OooOO0o<? super C21245OooO0O0, OooO> onBuildDrawCache) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cacheDrawScope, "cacheDrawScope");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onBuildDrawCache, "onBuildDrawCache");
        this.f61630OooOo0o = cacheDrawScope;
        this.f61629OooOo = onBuildDrawCache;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // Ooooo00.InterfaceC21250OooO0oO
    public final void OooOo(C25508OooOoo c25508OooOoo) {
        OooO oooO = this.f61630OooOo0o.f61626OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO);
        ((OooOOOO) oooO.f61625OooO00o).invoke(c25508OooOoo);
    }

    @Override // Ooooo00.InterfaceC21249OooO0o0
    public final void Oooo0o(InterfaceC21244OooO00o params) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
        C21245OooO0O0 c21245OooO0O0 = this.f61630OooOo0o;
        c21245OooO0O0.getClass();
        c21245OooO0O0.f61627OooOo0o = params;
        c21245OooO0O0.f61626OooOo = null;
        this.f61629OooOo.invoke(c21245OooO0O0);
        if (c21245OooO0O0.f61626OooOo == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21248OooO0o)) {
            return false;
        }
        C21248OooO0o c21248OooO0o = (C21248OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61630OooOo0o, c21248OooO0o.f61630OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61629OooOo, c21248OooO0o.f61629OooOo);
    }

    public final int hashCode() {
        return this.f61629OooOo.hashCode() + (this.f61630OooOo0o.hashCode() * 31);
    }

    public final String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f61630OooOo0o + ", onBuildDrawCache=" + this.f61629OooOo + ')';
    }
}
