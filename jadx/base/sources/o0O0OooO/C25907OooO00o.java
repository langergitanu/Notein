package o0O0OooO;

import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0OooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25907OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f88440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f88441OooOo0o;

    public /* synthetic */ C25907OooO00o(Oooo000 oooo000, long j) {
        this.f88441OooOo0o = oooo000;
        this.f88440OooOo = j;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        oO0O000o.OooO00o action = (oO0O000o.OooO00o) obj;
        OooOOO0.OooO0oO(action, "action");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Oooo000 oooo000 = this.f88441OooOo0o;
        if (jCurrentTimeMillis - oooo000.f80941OooOo0o >= this.f88440OooOo) {
            oooo000.f80941OooOo0o = jCurrentTimeMillis;
            action.invoke();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
