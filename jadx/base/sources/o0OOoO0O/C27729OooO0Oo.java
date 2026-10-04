package o0OOoO0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.SideEffectRunner", m80623f = "SideEffectRunner.kt", m80624l = {566}, m80625m = "handleDownloadFailure")
public final class C27729OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97831OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27740OooOOOo f97832OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97833OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Throwable f97834OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27740OooOOOo f97835OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97836OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27729OooO0Oo(C27740OooOOOo c27740OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97835OooOoOO = c27740OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97833OooOoO = obj;
        this.f97836OooOoo0 |= Integer.MIN_VALUE;
        return this.f97835OooOoOO.OooO0Oo(null, null, null, this);
    }
}
