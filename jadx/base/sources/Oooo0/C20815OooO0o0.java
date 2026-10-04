package Oooo0;

import OooOo.C20496Oooo0o0;
import Oooo0O0.C20908OooO00o;
import Ooooo00.C21245OooO0O0;
import OooooO0.C21293OooOO0;
import OooooOO.C21324OooOooO;
import OooooOO.C21340OoooO0O;
import OooooOO.C21349OooooO0;
import OooooOO.InterfaceC21352Oooooo;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20815OooO0o0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21245OooO0O0, Ooooo00.OooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f59781OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20815OooO0o0(long j) {
        super(1);
        this.f59781OooOo0o = j;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Ooooo00.OooO invoke(C21245OooO0O0 c21245OooO0O0) {
        C21245OooO0O0 drawWithCache = c21245OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawWithCache, "$this$drawWithCache");
        float fOooO0Oo = C21293OooOO0.OooO0Oo(drawWithCache.f61627OooOo0o.OooOOo0()) / 2.0f;
        InterfaceC21352Oooooo interfaceC21352OoooooOooO0Oo = C20908OooO00o.OooO0Oo(drawWithCache, fOooO0Oo);
        int i = Build.VERSION.SDK_INT;
        long j = this.f59781OooOo0o;
        return drawWithCache.OooO0O0(new C20814OooO0Oo(fOooO0Oo, interfaceC21352OoooooOooO0Oo, new C21349OooooO0(i >= 29 ? C21340OoooO0O.f61755OooO00o.OooO00o(j, 5) : new PorterDuffColorFilter(C20496Oooo0o0.OooO0oo(j), C21324OooOooO.OooO0O0(5)))));
    }
}
