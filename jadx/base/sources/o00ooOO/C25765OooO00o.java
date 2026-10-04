package o00ooOO;

import androidx.core.util.Pools;
import o0o00oO0.C30006OooOooo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o00ooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25765OooO00o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87938OooOo0o;

    public /* synthetic */ C25765OooO00o(int i) {
        this.f87938OooOo0o = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f87938OooOo0o) {
            case 0:
                return new Pools.SynchronizedPool(12);
            default:
                C32443OooOOO c32443OooOOO = (C32443OooOOO) C30006OooOooo.f106606OoooO.get("pressure_correct");
                return c32443OooOOO == null ? new C32443OooOOO(Float.valueOf(0.0f), Float.valueOf(2.0f)) : c32443OooOOO;
        }
    }
}
