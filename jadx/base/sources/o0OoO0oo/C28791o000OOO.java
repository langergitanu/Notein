package o0OoO0oo;

import com.orion.notein.domain.models.note.Outline;
import java.util.Iterator;
import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoO0oo.o000OOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {884, 887}, m80625m = "collectDescendantOutlines")
public final class C28791o000OOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Outline f101947OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.OooO0OO f101948OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f101949OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List f101950OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f101951OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f101952OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101953OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28791o000OOO(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f101953OooOoo0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f101951OooOoOO = obj;
        this.f101952OooOoo |= Integer.MIN_VALUE;
        return this.f101953OooOoo0.OooO0oo(null, null, this);
    }
}
