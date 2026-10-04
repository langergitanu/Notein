package oO0Oo0Oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0OO.InterfaceC33623OooOo0O;

/* JADX INFO: renamed from: oO0Oo0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.statement.HttpStatement", m80623f = "HttpStatement.kt", m80624l = {126}, m80625m = "cleanup")
public final class C33197OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120135OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33623OooOo0O f120136OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f120137OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33209OooOOO0 f120138OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33197OooO(C33209OooOOO0 c33209OooOOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f120138OooOoO0 = c33209OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f120135OooOo = obj;
        this.f120137OooOoO |= Integer.MIN_VALUE;
        return this.f120138OooOoO0.OooO00o(null, this);
    }
}
