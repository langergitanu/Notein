package o0000OO0;

import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: o0000OO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24168OooOO0o implements OooOOO<C24183Oooo, o0000OO.OooOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f81435OooO00o;

    public C24168OooOO0o(C33614OooOOO0 c33614OooOOO0) {
        this.f81435OooO00o = c33614OooOOO0;
    }

    @Override // o0000OO0.OooOOO
    public final void onError(o0000OO.OooOO0O oooOO0O) {
        o0000OO.OooOO0O e = oooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(e, "e");
        C33614OooOOO0 c33614OooOOO0 = this.f81435OooO00o;
        if (c33614OooOOO0.OooOo0o()) {
            c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(e));
        }
    }

    @Override // o0000OO0.OooOOO
    public final void onResult(C24183Oooo c24183Oooo) {
        C24183Oooo result = c24183Oooo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        C33614OooOOO0 c33614OooOOO0 = this.f81435OooO00o;
        if (c33614OooOOO0.OooOo0o()) {
            c33614OooOOO0.resumeWith(result);
        }
    }
}
