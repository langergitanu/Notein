package o0OOo0oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.TemplateDirtyDetector", m80623f = "LocalDirtyDetector.kt", m80624l = {173}, m80625m = "isLocalDeleted")
public final class o000O000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27694o000O0o f97569OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97570OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f97571OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(C27694o000O0o c27694o000O0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97569OooOo = c27694o000O0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97570OooOo0o = obj;
        this.f97571OooOoO0 |= Integer.MIN_VALUE;
        return this.f97569OooOo.OooO0Oo(null, this);
    }
}
