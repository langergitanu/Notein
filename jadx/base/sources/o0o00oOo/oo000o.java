package o0o00oOo;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27600o0ooOO0;
import o0OOoooO.C28003OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$flatMapLatest$2", m80623f = "NoteListViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class oo000o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Folder>, C32443OooOOO<? extends NoteVO, ? extends NoteVO>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f107146OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107147OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107148OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107149OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f107148OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Folder> interfaceC33723OooO0oO, C32443OooOOO<? extends NoteVO, ? extends NoteVO> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
        oo000o oo000oVar = new oo000o(this.f107148OooOoO, continuation);
        oo000oVar.f107146OooOo = interfaceC33723OooO0oO;
        oo000oVar.f107149OooOoO0 = c32443OooOOO;
        return oo000oVar.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107147OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f107146OooOo;
            NoteVO noteVO = (NoteVO) ((C32443OooOOO) this.f107149OooOoO0).f116638OooOo0o;
            if (noteVO == null || (id = noteVO.getId()) == null) {
                id = "";
            }
            C27600o0ooOO0 c27600o0ooOO0 = this.f107148OooOoO.f77124OooO0oO;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(id);
            c27600o0ooOO0.getClass();
            C28003OooO0oo c28003OooO0ooOooO0o = c27600o0ooOO0.f96982OooO00o.OooO0o(listOooO0oO);
            this.f107147OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = c28003OooO0ooOooO0o.collect(new C30058Oooo0o(interfaceC33723OooO0oO), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
