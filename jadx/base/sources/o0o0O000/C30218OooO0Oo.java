package o0o0O000;

import com.orion.notein.p607ui.notelist.folder.FolderCreationDialogFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0O000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment", m80623f = "FolderCreationDialogFragment.kt", m80624l = {125}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30218OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FolderCreationDialogFragment f107639OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107640OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f107641OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30218OooO0Oo(FolderCreationDialogFragment folderCreationDialogFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f107639OooOo = folderCreationDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f107640OooOo0o = obj;
        this.f107641OooOoO0 |= Integer.MIN_VALUE;
        return FolderCreationDialogFragment.Oooo00o(this.f107639OooOo, 0, this);
    }
}
