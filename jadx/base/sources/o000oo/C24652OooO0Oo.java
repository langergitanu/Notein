package o000oo;

import o000oooO.InterfaceC24756OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o000oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.driver.SupportSQLitePooledConnection", m80623f = "SupportSQLiteConnectionPool.android.kt", m80624l = {83}, m80625m = "transaction")
public final class C24652OooO0Oo<R> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC24756OooO0O0 f83494OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24651OooO0OO f83495OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24651OooO0OO f83496OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f83497OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f83498OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24652OooO0Oo(C24651OooO0OO c24651OooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83496OooOoO = c24651OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83497OooOoO0 = obj;
        this.f83498OooOoOO |= Integer.MIN_VALUE;
        return this.f83496OooOoO.OooO0o0(null, null, this);
    }
}
