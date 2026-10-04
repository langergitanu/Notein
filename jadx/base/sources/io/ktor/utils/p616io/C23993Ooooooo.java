package io.ktor.utils.p616io;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0OO.InterfaceC33618OooOOo0;
import oO0o0OO.InterfaceC33619OooOOoo;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o00000OO;
import oO0o0oO0.InterfaceC33886OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: io.ktor.utils.io.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23993Ooooooo implements o0Oo0oo, o0O0O00, InterfaceC33672o00ooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f80790OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00000OO f80791OooOo0o;

    public C23993Ooooooo(o00000OO o00000oo2, OooO00o oooO00o) {
        this.f80791OooOo0o = o00000oo2;
        this.f80790OooOo = oooO00o;
    }

    @Override // io.ktor.utils.p616io.o0Oo0oo
    public final InterfaceC23967Oooo00O OooO0OO() {
        return this.f80790OooOo;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33618OooOOo0 attachChild(InterfaceC33619OooOOoo interfaceC33619OooOOoo) {
        return this.f80791OooOo0o.attachChild(interfaceC33619OooOOoo);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final void cancel(CancellationException cancellationException) {
        this.f80791OooOo0o.cancel(cancellationException);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return (R) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO00o(this.f80791OooOo0o, r, interfaceC32508OooOOOo);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> key) {
        OooOOO0.OooO0oO(key, "key");
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this.f80791OooOo0o, key);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final CancellationException getCancellationException() {
        return this.f80791OooOo0o.getCancellationException();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33569OooO0oo<InterfaceC33672o00ooo> getChildren() {
        return this.f80791OooOo0o.getChildren();
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO<?> getKey() {
        return InterfaceC33672o00ooo.OooO00o.f121379OooOo0o;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33886OooO0OO getOnJoin() {
        return this.f80791OooOo0o.getOnJoin();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo getParent() {
        return this.f80791OooOo0o.getParent();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        return this.f80791OooOo0o.invokeOnCompletion(interfaceC32507OooOO0o);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isActive() {
        return this.f80791OooOo0o.isActive();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCancelled() {
        return this.f80791OooOo0o.isCancelled();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCompleted() {
        return this.f80791OooOo0o.isCompleted();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final Object join(Continuation<? super C32460OooOooO> continuation) {
        return this.f80791OooOo0o.join(continuation);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> key) {
        OooOOO0.OooO0oO(key, "key");
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this.f80791OooOo0o, key);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo plus(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        throw null;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo context) {
        OooOOO0.OooO0oO(context, "context");
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this.f80791OooOo0o, context);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean start() {
        return this.f80791OooOo0o.start();
    }

    public final String toString() {
        return "ChannelJob[" + this.f80791OooOo0o + ']';
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ void cancel() {
        this.f80791OooOo0o.cancel((CancellationException) null);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(boolean z, boolean z2, InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        return this.f80791OooOo0o.invokeOnCompletion(z, z2, interfaceC32507OooOO0o);
    }
}
