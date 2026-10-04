package o00000;

import o00000.C24061OooOoo0;

/* JADX INFO: renamed from: o00000.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24060OooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24061OooOoo0.OooO0O0<Object> f81068OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24060OooOoo(C24061OooOoo0.OooO0O0<Object> oooO0O0) {
        super(0);
        this.f81068OooOo0o = oooO0O0;
    }

    @Override // oO0O000o.OooO00o
    public final Boolean invoke() {
        C24061OooOoo0.OooO0O0<Object> oooO0O0 = this.f81068OooOo0o;
        oooO0O0.f81074OooO0O0.setValue(Integer.valueOf(oooO0O0.OooO00o() - 1));
        if (oooO0O0.OooO00o() >= 0) {
            return Boolean.valueOf(oooO0O0.OooO00o() == 0);
        }
        throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + oooO0O0.OooO00o() + ')').toString());
    }
}
