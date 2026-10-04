package oO00OOoO;

import kotlin.coroutines.Continuation;
import oO00ooo.InterfaceC32480OooO0Oo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00OOoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32240OooO implements InterfaceC32480OooO0Oo, Continuation<?> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32240OooO f115798OooOo0o = new C32240OooO();

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return oOo0000O.OooO.f123416OooOo0o;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        C32248OooO0oo.f115820OooO00o.getClass();
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
