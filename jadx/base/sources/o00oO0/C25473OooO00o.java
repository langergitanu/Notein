package o00oO0;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.OooOOO0;
import o00oO00o.C25480OooO0Oo;
import o00oOo.C25600OooO00o;

/* JADX INFO: renamed from: o00oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25473OooO00o extends C25480OooO0Oo<Object> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25600OooO00o f86786OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f86787OooO0OO = -1;

    public C25473OooO00o(C25600OooO00o c25600OooO00o) {
        this.f86786OooO0O0 = c25600OooO00o;
    }

    @Override // o00oO00o.C25480OooO0Oo, o00oO00o.InterfaceC25482OooO0o0
    public final void OooO0Oo(String id) {
        OooOOO0.OooO0oO(id, "id");
        this.f86787OooO0OO = System.currentTimeMillis();
    }

    @Override // o00oO00o.C25480OooO0Oo, o00oO00o.InterfaceC25482OooO0o0
    public final void OooO0o0(String id, Object obj, Animatable animatable) {
        OooOOO0.OooO0oO(id, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C25600OooO00o c25600OooO00o = this.f86786OooO0O0;
        c25600OooO00o.f87344OooOOoo = jCurrentTimeMillis - this.f86787OooO0OO;
        c25600OooO00o.invalidateSelf();
    }
}
