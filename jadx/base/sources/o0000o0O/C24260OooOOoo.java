package o0000o0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0OO.C33621OooOo0;

/* JADX INFO: renamed from: o0000o0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl", m80623f = "DataStoreImpl.kt", m80624l = {237, 243, 246}, m80625m = "handleUpdate")
public final class C24260OooOOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooOOO f81606OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81607OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f81608OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33621OooOo0 f81609OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81610OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f81611OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24260OooOOoo(OooOOO oooOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81610OooOoOO = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81608OooOoO = obj;
        this.f81611OooOoo0 |= Integer.MIN_VALUE;
        return OooOOO.OooO0OO(this.f81610OooOoOO, null, this);
    }
}
