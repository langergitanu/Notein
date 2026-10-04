package o0OOoOo0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.CreateLabelUseCase", m80623f = "CreateLabelUseCase.kt", m80624l = {53, 56}, m80625m = "createLabel")
public final class C27795OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98182OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27798OooO0o0 f98183OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f98184OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98185OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27798OooO0o0 f98186OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98187OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27795OooO0OO(C27798OooO0o0 c27798OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98186OooOoOO = c27798OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98184OooOoO = obj;
        this.f98187OooOoo0 |= Integer.MIN_VALUE;
        return this.f98186OooOoOO.OooO0OO(0, null, this);
    }
}
