package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase", m80623f = "FolderUseCase.kt", m80624l = {92, 98}, m80625m = "moveFolderToFolder")
public final class C27404o000OOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Folder f95626OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27600o0ooOO0 f95627OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f95628OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Folder f95629OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f95630OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f95631OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27404o000OOo(C27600o0ooOO0 c27600o0ooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95630OooOoOO = c27600o0ooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95628OooOoO = obj;
        this.f95631OooOoo0 |= Integer.MIN_VALUE;
        return this.f95630OooOoOO.OooOO0(null, null, this);
    }
}
