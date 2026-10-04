package io.ktor.client.engine.cio;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0oOo.InterfaceC33899OooO0o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.ConnectionFactory", m80623f = "ConnectionFactory.kt", m80624l = {24, 26, 29}, m80625m = "connect")
public final class OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80377OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C23934OooO0oo f80378OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC33899OooO0o f80379OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC32507OooOO0o f80380OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f80381OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f80382OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C23934OooO0oo f80383OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(C23934OooO0oo c23934OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80383OooOoo0 = c23934OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80381OooOoOO = obj;
        this.f80382OooOoo |= Integer.MIN_VALUE;
        return this.f80383OooOoo0.OooO00o(null, null, this);
    }
}
