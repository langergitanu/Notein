package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0OO.InterfaceC33618OooOOo0;
import oO0o0OO.InterfaceC33619OooOOoo;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0oO0.InterfaceC33886OooO0OO;
import oO0o0oO0.InterfaceC33889OooO0o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbw implements InterfaceC33642Oooo0oo {
    private final /* synthetic */ InterfaceC33622OooOo00 zza;

    public zzbw(InterfaceC33622OooOo00 interfaceC33622OooOo00) {
        this.zza = interfaceC33622OooOo00;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33618OooOOo0 attachChild(InterfaceC33619OooOOoo interfaceC33619OooOOoo) {
        return this.zza.attachChild(interfaceC33619OooOOoo);
    }

    @Override // oO0o0OO.InterfaceC33642Oooo0oo
    public final Object await(Continuation continuation) {
        return this.zza.await(continuation);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final Object fold(Object obj, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        return this.zza.fold(obj, interfaceC32508OooOOOo);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo.OooO0O0 get(InterfaceC34415OooO0oo.OooO0OO oooO0OO) {
        return this.zza.get(oooO0OO);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33569OooO0oo getChildren() {
        return this.zza.getChildren();
    }

    @Override // oO0o0OO.InterfaceC33642Oooo0oo
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // oO0o0OO.InterfaceC33642Oooo0oo
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO getKey() {
        return this.zza.getKey();
    }

    @Override // oO0o0OO.InterfaceC33642Oooo0oo
    public final InterfaceC33889OooO0o0 getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33886OooO0OO getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo getParent() {
        return this.zza.getParent();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        return this.zza.invokeOnCompletion(interfaceC32507OooOO0o);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final Object join(Continuation continuation) {
        return this.zza.join(continuation);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO oooO0OO) {
        return this.zza.minusKey(oooO0OO);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo plus(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        return this.zza.plus(interfaceC33672o00ooo);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean start() {
        return this.zza.start();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(boolean z, boolean z2, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        return this.zza.invokeOnCompletion(z, z2, interfaceC32507OooOO0o);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return this.zza.plus(interfaceC34415OooO0oo);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
