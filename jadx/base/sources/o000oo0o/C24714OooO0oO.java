package o000oo0o;

import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.ConnectionPoolImpl", m80623f = "ConnectionPoolImpl.kt", m80624l = {116, 120, 138, 143}, m80625m = "useConnection")
public final class C24714OooO0oO<R> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f83767OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f83768OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C24034Oooo00O f83769OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24724OooOOo0 f83770OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC34415OooO0oo f83771OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f83772OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C24034Oooo00O f83773OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f83774OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C24716OooOO0 f83775OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f83776Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24714OooO0oO(C24716OooOO0 c24716OooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83775OooOooo = c24716OooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83774OooOooO = obj;
        this.f83776Oooo000 |= Integer.MIN_VALUE;
        return this.f83775OooOooo.OoooOoO(false, null, this);
    }
}
