package o0000OO0;

import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements OooOOO<Void, o0000OO.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f81434OooO00o;

    public OooOO0O(C33614OooOOO0 c33614OooOOO0) {
        this.f81434OooO00o = c33614OooOOO0;
    }

    @Override // o0000OO0.OooOOO
    public final void onError(o0000OO.OooO00o oooO00o) {
        o0000OO.OooO00o e = oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(e, "e");
        C33614OooOOO0 c33614OooOOO0 = this.f81434OooO00o;
        if (c33614OooOOO0.OooOo0o()) {
            c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(e));
        }
    }

    @Override // o0000OO0.OooOOO
    public final void onResult(Void r2) {
        C33614OooOOO0 c33614OooOOO0 = this.f81434OooO00o;
        if (c33614OooOOO0.OooOo0o()) {
            c33614OooOOO0.resumeWith(C32460OooOooO.f116667OooO00o);
        }
    }
}
