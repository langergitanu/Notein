package oO0o0OOo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0OOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.channels.BufferedChannel", m80623f = "BufferedChannel.kt", m80624l = {759}, m80625m = "receiveCatching-JP2dKIU$suspendImpl")
public final class C33694OooO0o<E> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33695OooO0o0<E> f121455OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f121456OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121457OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33694OooO0o(C33695OooO0o0 c33695OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f121455OooOo = c33695OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f121456OooOo0o = obj;
        this.f121457OooOoO0 |= Integer.MIN_VALUE;
        Object objOooo000 = C33695OooO0o0.Oooo000(this.f121455OooOo, this);
        return objOooo000 == EnumC32485OooO00o.f116726OooOo0o ? objOooo000 : new C33702OooOOO(objOooo000);
    }
}
