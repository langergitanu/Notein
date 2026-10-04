package io.ktor.client.engine.cio;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.Endpoint", m80623f = "Endpoint.kt", m80624l = {213, 215, 229, 235}, m80625m = "connect")
public final class OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80340OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C23938OooOOo0 f80341OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f80342OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f80343OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public oO00O0oo.OooOO0O f80344OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f80345OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f80346OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f80347OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f80348OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public /* synthetic */ Object f80349Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C23938OooOOo0 f80350Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f80351Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(C23938OooOOo0 c23938OooOOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80350Oooo00O = c23938OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80349Oooo000 = obj;
        this.f80351Oooo00o |= Integer.MIN_VALUE;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C23938OooOOo0.f80429Oooo00O;
        return this.f80350Oooo00O.OooO00o(null, this);
    }
}
