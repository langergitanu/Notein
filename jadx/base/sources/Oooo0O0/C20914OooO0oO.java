package Oooo0O0;

import OooOo.C20496Oooo0o0;
import Ooooo00.C21245OooO0O0;
import OooooO0.C21293OooOO0;
import OooooOO.C21324OooOooO;
import OooooOO.C21340OoooO0O;
import OooooOO.C21349OooooO0;
import OooooOO.InterfaceC21352Oooooo;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import o00000o0.EnumC24118OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20914OooO0oO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21245OooO0O0, Ooooo00.OooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f60335OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f60336OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f60337OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC24118OooO0oO f60338OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20914OooO0oO(long j, boolean z, EnumC24118OooO0oO enumC24118OooO0oO, boolean z2) {
        super(1);
        this.f60336OooOo0o = j;
        this.f60335OooOo = z;
        this.f60338OooOoO0 = enumC24118OooO0oO;
        this.f60337OooOoO = z2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Ooooo00.OooO invoke(C21245OooO0O0 c21245OooO0O0) {
        C21245OooO0O0 drawWithCache = c21245OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawWithCache, "$this$drawWithCache");
        InterfaceC21352Oooooo interfaceC21352OoooooOooO0Oo = C20908OooO00o.OooO0Oo(drawWithCache, C21293OooOO0.OooO0Oo(drawWithCache.f61627OooOo0o.OooOOo0()) / 2.0f);
        int i = Build.VERSION.SDK_INT;
        long j = this.f60336OooOo0o;
        return drawWithCache.OooO0O0(new C20912OooO0o(this.f60335OooOo, this.f60338OooOoO0, this.f60337OooOoO, interfaceC21352OoooooOooO0Oo, new C21349OooooO0(i >= 29 ? C21340OoooO0O.f61755OooO00o.OooO00o(j, 5) : new PorterDuffColorFilter(C20496Oooo0o0.OooO0oo(j), C21324OooOooO.OooO0O0(5)))));
    }
}
