package o0000o0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0000o0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl", m80623f = "DataStoreImpl.kt", m80624l = {544}, m80625m = "decrementCollector")
public final class C24259OooOOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C33898OooO0Oo f81601OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOOO f81602OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81603OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81604OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f81605OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24259OooOOo0(OooOOO oooOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81603OooOoO = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81604OooOoO0 = obj;
        this.f81605OooOoOO |= Integer.MIN_VALUE;
        return OooOOO.OooO0O0(this.f81603OooOoO, this);
    }
}
