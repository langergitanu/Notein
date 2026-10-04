package oO00ooo;

import kotlin.coroutines.Continuation;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32478OooO0O0 implements Continuation<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32478OooO0O0 f116719OooOo0o = new C32478OooO0O0();

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
