package oO0o0OO;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33565OooO0Oo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0oO0.InterfaceC33886OooO0OO;
import oOo0000O.AbstractC34408OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class o000OOo extends AbstractC34408OooO00o implements InterfaceC33672o00ooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final o000OOo f121371OooOo = new o000OOo(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33618OooOOo0 attachChild(InterfaceC33619OooOOoo interfaceC33619OooOOoo) {
        return o000000.f121353OooOo0o;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ void cancel() {
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33569OooO0oo<InterfaceC33672o00ooo> getChildren() {
        return C33565OooO0Oo.f121193OooO00o;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33886OooO0OO getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo getParent() {
        return null;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        return o000000.f121353OooOo0o;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isActive() {
        return true;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCancelled() {
        return false;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCompleted() {
        return false;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final Object join(Continuation<? super C32460OooOooO> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo plus(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        throw null;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(boolean z, boolean z2, InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        return o000000.f121353OooOo0o;
    }
}
