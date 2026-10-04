package o0o00oOo;

import androidx.core.view.PointerIconCompat;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o00oOo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel", m80623f = "NoteListViewModel.kt", m80624l = {PointerIconCompat.TYPE_ZOOM_IN, 1022}, m80625m = "deleteSelectedNotesAndFolders")
public final class C30064OoooO00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f106945OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO0OO f106946OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f106947OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f106948OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106949OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f106950OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30064OoooO00(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f106949OooOoOO = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f106947OooOoO = obj;
        this.f106950OooOoo0 |= Integer.MIN_VALUE;
        return this.f106949OooOoOO.OooOO0o(this);
    }
}
