package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteCreationUseCase", m80623f = "NoteCreationUseCase.kt", m80624l = {637}, m80625m = "fixNoteParentFolder")
public final class o0000O0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f95404OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Note f95405OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f95406OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o000OO f95407OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o000OO o000oo2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95407OooOoO0 = o000oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95404OooOo = obj;
        this.f95406OooOoO |= Integer.MIN_VALUE;
        return this.f95407OooOoO0.OooO(null, null, this);
    }
}
