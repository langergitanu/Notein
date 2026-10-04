package oO0o0OO;

import kotlin.coroutines.Continuation;
import oO0o0oO0.InterfaceC33889OooO0o0;

/* JADX INFO: renamed from: oO0o0OO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33642Oooo0oo<T> extends InterfaceC33672o00ooo {
    Object await(Continuation<? super T> continuation);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    InterfaceC33889OooO0o0<T> getOnAwait();
}
