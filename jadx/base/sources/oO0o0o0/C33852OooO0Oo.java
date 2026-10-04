package oO0o0o0;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0o0Ooo.C33826OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33852OooO0Oo implements Continuation<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33855OooO0oO f121971OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f121972OooOo0o;

    public C33852OooO0Oo(InterfaceC34415OooO0oo interfaceC34415OooO0oo, C33855OooO0oO c33855OooO0oO) {
        this.f121972OooOo0o = interfaceC34415OooO0oo;
        this.f121971OooOo = c33855OooO0oO;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return this.f121972OooOo0o;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        C33855OooO0oO c33855OooO0oO = this.f121971OooOo;
        try {
            C33826OooO0oO.OooO00o(C32460OooOooO.f116667OooO00o, C21904OooOoo0.OooO0o0(C21904OooOoo0.OooO0OO(new C33854OooO0o0(1, c33855OooO0oO, C33855OooO0oO.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c33855OooO0oO)));
        } catch (Throwable th) {
            c33855OooO0oO.resumeWith(C32446OooOOOo.OooO00o(th));
            throw th;
        }
    }
}
