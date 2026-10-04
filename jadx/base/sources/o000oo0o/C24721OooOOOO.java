package o000oo0o;

import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o000oo0o.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.Pool", m80623f = "ConnectionPoolImpl.kt", m80624l = {209}, m80625m = "acquireWithTimeout-KLykuaI")
public final class C24721OooOOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oO0O000o.OooO00o f83803OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24724OooOOo0 f83804OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f83805OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24034Oooo00O f83806OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f83807OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f83808OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C24724OooOOo0 f83809OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24721OooOOOO(C24724OooOOo0 c24724OooOOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83809OooOoo0 = c24724OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83807OooOoOO = obj;
        this.f83808OooOoo |= Integer.MIN_VALUE;
        return this.f83809OooOoo0.OooO0O0(0L, null, this);
    }
}
