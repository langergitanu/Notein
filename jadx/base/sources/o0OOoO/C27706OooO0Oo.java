package o0OOoO;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.comment.CommentUseCase", m80623f = "CommentUseCase.kt", m80624l = {53, 55, 60}, m80625m = "syncQuoteTextAnno")
public final class C27706OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97701OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27710OooO0oo f97702OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97703OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f97704OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27710OooO0oo f97705OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97706OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27706OooO0Oo(C27710OooO0oo c27710OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97705OooOoOO = c27710OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97703OooOoO = obj;
        this.f97706OooOoo0 |= Integer.MIN_VALUE;
        return C27710OooO0oo.OooO00o(this.f97705OooOoOO, null, null, null, this);
    }
}
