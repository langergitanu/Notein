package io.ktor.network.util;

import androidx.core.location.LocationRequestCompat;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f80484OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O000o.OooO00o<Long> f80485OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33636Oooo00o f80486OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC32476OooO f80487OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000OO f80488OooO0o0;
    volatile /* synthetic */ int isStarted;
    volatile /* synthetic */ long lastActivityTime;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(String str, long j, oO0O000o.OooO00o<Long> oooO00o, InterfaceC33636Oooo00o scope, InterfaceC32507OooOO0o<? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32507OooOO0o) {
        OooOOO0.OooO0oO(scope, "scope");
        this.f80484OooO00o = j;
        this.f80485OooO0O0 = oooO00o;
        this.f80486OooO0OO = scope;
        this.f80487OooO0Oo = (AbstractC32476OooO) interfaceC32507OooOO0o;
        this.lastActivityTime = 0L;
        this.isStarted = 0;
        this.f80488OooO0o0 = j != LocationRequestCompat.PASSIVE_INTERVAL ? C33609OooO0oo.OooO0OO(scope, scope.OooOOO0().plus(new C33635Oooo00O("Timeout ".concat(str))), null, new OooO0O0(this, null), 2) : null;
    }

    public final void OooO00o() {
        this.lastActivityTime = this.f80485OooO0O0.invoke().longValue();
        this.isStarted = 1;
    }

    public final void OooO0O0() {
        this.isStarted = 0;
    }
}
