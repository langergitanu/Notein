package oO0o0OO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33611OooOO0O<T> extends Continuation<T> {
    C33839OooOo0 OooO0O0(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0);

    void OooOOOO(Object obj);

    <R extends T> void OooOOOo(R r, InterfaceC32510OooOOo0<? super Throwable, ? super R, ? super InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0);

    boolean cancel(Throwable th);
}
