package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$updateNoteCurrentPageIndex$2", m80623f = "NoteUseCase.kt", m80624l = {170}, m80625m = "invokeSuspend")
public final class C27479o00Oo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteContent f96290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96291OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96292OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f96293OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27479o00Oo0O(NoteContent noteContent, int i, C27449o00O0OoO c27449o00O0OoO, Continuation<? super C27479o00Oo0O> continuation) {
        super(2, continuation);
        this.f96290OooOo = noteContent;
        this.f96293OooOoO0 = i;
        this.f96292OooOoO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27479o00Oo0O(this.f96290OooOo, this.f96293OooOoO0, this.f96292OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27479o00Oo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96291OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteContent noteContent = this.f96290OooOo;
            NoteContent noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : null, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : this.f96293OooOoO0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent.extras : null);
            InterfaceC27309OooOoO interfaceC27309OooOoO = this.f96292OooOoO.f96035OooO00o;
            String id = noteContentCopy.getId();
            int savedPageIndex = noteContentCopy.getSavedPageIndex();
            this.f96291OooOo0o = 1;
            if (interfaceC27309OooOoO.OooOO0(id, savedPageIndex, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
