package io.ktor.client.engine.cio;

import io.ktor.utils.p616io.Oooo0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0oOOO0.C34109OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.Endpoint", m80623f = "Endpoint.kt", m80624l = {100, 127, 129, 130}, m80625m = "makeDedicatedRequest")
public final class OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80405OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f80406OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Oooo0 f80407OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f80408OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C34109OooO0O0 f80409OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C23938OooOOo0 f80410OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f80411OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f80412OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(C23938OooOOo0 c23938OooOOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80410OooOoo = c23938OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80411OooOoo0 = obj;
        this.f80412OooOooO |= Integer.MIN_VALUE;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C23938OooOOo0.f80429Oooo00O;
        return this.f80410OooOoo.OooOOoo(null, null, this);
    }
}
