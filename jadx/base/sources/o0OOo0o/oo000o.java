package o0OOo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase", m80623f = "FolderUseCase.kt", m80624l = {73, 78}, m80625m = "adoptOrphanFolders")
public final class oo000o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27600o0ooOO0 f97013OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f97014OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97015OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97016OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(C27600o0ooOO0 c27600o0ooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97014OooOoO = c27600o0ooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97015OooOoO0 = obj;
        this.f97016OooOoOO |= Integer.MIN_VALUE;
        return this.f97014OooOoO.OooO00o(null, this);
    }
}
