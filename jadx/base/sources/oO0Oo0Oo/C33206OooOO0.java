package oO0Oo0Oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO0Oo0Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.statement.HttpStatement", m80623f = "HttpStatement.kt", m80624l = {47, 50, 52, 52}, m80625m = "execute")
public final class C33206OooOO0<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f120164OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f120165OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33209OooOOO0 f120166OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120167OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f120168OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33206OooOO0(C33209OooOOO0 c33209OooOOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f120166OooOoO = c33209OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f120167OooOoO0 = obj;
        this.f120168OooOoOO |= Integer.MIN_VALUE;
        return this.f120166OooOoO.OooO0O0(null, this);
    }
}
