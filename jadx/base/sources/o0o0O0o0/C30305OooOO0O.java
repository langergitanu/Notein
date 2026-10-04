package o0o0O0o0;

import Oooo0.o000000O;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0O0o0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$setCurrentFolder$2", m80623f = "SearchViewModel.kt", m80624l = {491}, m80625m = "invokeSuspend")
public final class C30305OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f108048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteVO f108049OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30296OooO00o f108050OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f108051OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30305OooOO0O(NoteVO noteVO, C30296OooO00o c30296OooO00o, Continuation<? super C30305OooOO0O> continuation) {
        super(2, continuation);
        this.f108051OooOoO0 = noteVO;
        this.f108050OooOoO = c30296OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30305OooOO0O(this.f108051OooOoO0, this.f108050OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30305OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String parentId;
        Object objOooO0Oo;
        NoteVO noteVO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108048OooOo;
        C30296OooO00o c30296OooO00o = this.f108050OooOoO;
        NoteVO noteVO2 = this.f108051OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (noteVO2 != null && (parentId = noteVO2.getParentId()) != null) {
                this.f108049OooOo0o = noteVO2;
                this.f108048OooOo = 1;
                objOooO0Oo = c30296OooO00o.f107990OooO0o0.OooO0Oo(parentId, this);
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                noteVO = noteVO2;
            }
            C32443OooOOO c32443OooOOO = new C32443OooOOO(noteVO2, noteVO);
            C33781o00o0O c33781o00o0O = c30296OooO00o.f107997OooOOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c32443OooOOO);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        noteVO = this.f108049OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0Oo = obj;
        Folder folder = (Folder) objOooO0Oo;
        NoteVO noteVO3 = folder != null ? new NoteVO(folder.getId(), null, noteVO.getUid(), folder.getTitle(), folder.getParentId(), folder.getTnPath(), o000000O.OooO0o(93), o000000O.OooO0o(130), PaperOrientation.VERTICAL, false, folder.getCreationTime(), folder.getLastModificationTime(), false, false, folder.getFavorite(), 0, 1, null, null, null, null, null, null, 0, null, false, false, 0L, false, null, false, 2147352578, null) : null;
        C32443OooOOO c32443OooOOO2 = new C32443OooOOO(noteVO2, noteVO3);
        C33781o00o0O c33781o00o0O2 = c30296OooO00o.f107997OooOOO0;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, c32443OooOOO2);
        return C32460OooOooO.f116667OooO00o;
    }
}
