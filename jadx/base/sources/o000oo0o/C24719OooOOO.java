package o000oo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o000oo0o.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.Pool", m80623f = "ConnectionPoolImpl.kt", m80624l = {231}, m80625m = "acquire")
public final class C24719OooOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f83799OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24724OooOOo0 f83800OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f83801OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24724OooOOo0 f83802OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24719OooOOO(C24724OooOOo0 c24724OooOOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83802OooOoO0 = c24724OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83799OooOo = obj;
        this.f83801OooOoO |= Integer.MIN_VALUE;
        return this.f83802OooOoO0.OooO00o(this);
    }
}
