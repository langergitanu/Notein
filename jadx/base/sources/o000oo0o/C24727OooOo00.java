package o000oo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o000oo0o.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.PooledConnectionImpl", m80623f = "ConnectionPoolImpl.kt", m80624l = {562}, m80625m = "endTransaction")
public final class C24727OooOo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24717OooOO0O f83851OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24723OooOOo f83852OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f83853OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f83854OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24723OooOOo f83855OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f83856OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24727OooOo00(C24723OooOOo c24723OooOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83855OooOoOO = c24723OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83853OooOoO = obj;
        this.f83856OooOoo0 |= Integer.MIN_VALUE;
        return this.f83855OooOoOO.OooO0o(false, this);
    }
}
