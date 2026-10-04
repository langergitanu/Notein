package oO0o0oO0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO0o0oO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.selects.SelectImplementation", m80623f = "Select.kt", m80624l = {453, 456}, m80625m = "doSelectSuspend")
public final class C33891OooO0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f122080OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33890OooO0oO f122081OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122082OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33890OooO0oO<Object> f122083OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33891OooO0oo(C33890OooO0oO c33890OooO0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f122083OooOoO0 = c33890OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f122080OooOo = obj;
        this.f122082OooOoO |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33890OooO0oO.f122065OooOoo0;
        return this.f122083OooOoO0.OooO0oO(this);
    }
}
