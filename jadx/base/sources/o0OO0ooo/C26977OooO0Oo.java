package o0OO0ooo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO0ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.message.NoteinMessageLocalDataSource", m80623f = "NoteinMessageLocalDataSource.kt", m80624l = {43}, m80625m = "getMessagesByUserSync")
public final class C26977OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93721OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26979OooO0o0 f93722OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93723OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26979OooO0o0 f93724OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26977OooO0Oo(C26979OooO0o0 c26979OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93724OooOoO0 = c26979OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93721OooOo = obj;
        this.f93723OooOoO |= Integer.MIN_VALUE;
        return this.f93724OooOoO0.OooO0O0(null, this);
    }
}
