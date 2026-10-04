package oO0o0OOo;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0OOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.channels.BufferedChannel", m80623f = "BufferedChannel.kt", m80624l = {3117}, m80625m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class C33697OooO0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33695OooO0o0<Object> f121475OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f121476OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121477OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33697OooO0oO(C33695OooO0o0 c33695OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f121475OooOo = c33695OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f121476OooOo0o = obj;
        this.f121477OooOoO0 |= Integer.MIN_VALUE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C33695OooO0o0.f121458OooOo;
        Object objOooo00O = this.f121475OooOo.Oooo00O(null, 0, 0L, this);
        return objOooo00O == EnumC32485OooO00o.f116726OooOo0o ? objOooo00O : new C33702OooOOO(objOooo00O);
    }
}
