package oO0o0o0O;

import Oooo0oO.C21081o00000o0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OO0oO.C32928OooO0o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33866OooOO0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f122004OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32928OooO0o0 f122005OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Runnable f122006OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33866OooOO0(C32928OooO0o0 c32928OooO0o0, InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        super(1, OooOOO0.OooO00o.class, "task", "scheduleTask$task(Lio/reactivex/rxjava3/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f122005OooOo0o = c32928OooO0o0;
        this.f122004OooOo = interfaceC34415OooO0oo;
        this.f122006OooOoO0 = runnable;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
        return C21081o00000o0.OooO0O0(this.f122005OooOo0o, this.f122004OooOo, this.f122006OooOoO0, continuation);
    }
}
