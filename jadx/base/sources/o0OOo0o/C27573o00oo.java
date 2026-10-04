package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TnUseCase", m80623f = "TnUseCase.kt", m80624l = {103, 106, 107}, m80625m = "updateFolderTn")
public final class C27573o00oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Folder f96762OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27585o00ooO0 f96763OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27585o00ooO0 f96764OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96765OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96766OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27573o00oo(C27585o00ooO0 c27585o00ooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96764OooOoO = c27585o00ooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96765OooOoO0 = obj;
        this.f96766OooOoOO |= Integer.MIN_VALUE;
        return this.f96764OooOoO.OooO(null, this);
    }
}
