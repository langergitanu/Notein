package o0OOoOo0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoOo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.DeleteLabelUseCase", m80623f = "DeleteLabelUseCase.kt", m80624l = {11, 13}, m80625m = "deleteLabelById")
public final class C27797OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f98191OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27799OooO0oO f98192OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27799OooO0oO f98193OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98194OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98195OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27797OooO0o(C27799OooO0oO c27799OooO0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98193OooOoO = c27799OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98194OooOoO0 = obj;
        this.f98195OooOoOO |= Integer.MIN_VALUE;
        return this.f98193OooOoO.OooO00o(0L, this);
    }
}
