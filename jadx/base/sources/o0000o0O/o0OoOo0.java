package o0000o0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.RunOnce", m80623f = "DataStoreImpl.kt", m80624l = {544, 497}, m80625m = "runIfNeeded")
public final class o0OoOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33895OooO00o f81798OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC24304ooOO f81799OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC24304ooOO f81800OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81801OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f81802OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(AbstractC24304ooOO abstractC24304ooOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81800OooOoO = abstractC24304ooOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81801OooOoO0 = obj;
        this.f81802OooOoOO |= Integer.MIN_VALUE;
        return this.f81800OooOoO.OooO0Oo(this);
    }
}
