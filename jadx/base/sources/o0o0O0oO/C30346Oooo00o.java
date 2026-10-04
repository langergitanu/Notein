package o0o0O0oO;

import com.orion.notein.domain.models.folder.Folder;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0O0oO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel", m80623f = "TrashBinListViewModel.kt", m80624l = {709, 711}, m80625m = "recoverFolder")
public final class C30346Oooo00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Folder f108204OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30351Oooo0oO f108205OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108206OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108207OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f108208OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30346Oooo00o(C30351Oooo0oO c30351Oooo0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f108206OooOoO = c30351Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f108207OooOoO0 = obj;
        this.f108208OooOoOO |= Integer.MIN_VALUE;
        return this.f108206OooOoO.OooOO0(null, this);
    }
}
