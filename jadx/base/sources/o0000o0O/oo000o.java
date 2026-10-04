package o0000o0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.SingleProcessCoordinator", m80623f = "SingleProcessCoordinator.kt", m80624l = {66, 41}, m80625m = "lock")
public final class oo000o<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C33898OooO0Oo f81806OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81807OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f81808OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81809OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f81810OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81808OooOoO = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81809OooOoO0 = obj;
        this.f81810OooOoOO |= Integer.MIN_VALUE;
        return this.f81808OooOoO.OooO0Oo(null, this);
    }
}
