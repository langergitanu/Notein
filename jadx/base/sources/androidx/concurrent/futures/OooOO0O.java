package androidx.concurrent.futures;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33642Oooo0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O extends C24019OooOO0o implements InterfaceC32507OooOO0o<Continuation<Object>, Object> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<Object> continuation) {
        return ((InterfaceC33642Oooo0oo) this.receiver).await(continuation);
    }
}
