package o0OOooO;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import o000o0Oo.C24610OooO0O0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.pagelayer.PageLayerUseCase$updateNoteContent$2", m80623f = "PageLayerUseCase.kt", m80624l = {46, 47}, m80625m = "invokeSuspend")
public final class C27871OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27881OooOO0O f98495OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98496OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteContent f98497OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27871OooO(C27881OooOO0O c27881OooOO0O, NoteContent noteContent, Continuation<? super C27871OooO> continuation) {
        super(2, continuation);
        this.f98495OooOo = c27881OooOO0O;
        this.f98497OooOoO0 = noteContent;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27871OooO(this.f98495OooOo, this.f98497OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27871OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98496OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = this.f98495OooOo.f98545OooO0OO;
            NoteContent noteContent = this.f98497OooOoO0;
            this.f98496OooOo0o = 1;
            if (interfaceC27309OooOoO.OooO0oO(noteContent, this) != obj2) {
            }
            return obj2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27881OooOO0O c27881OooOO0O = this.f98495OooOo;
        String id = this.f98497OooOoO0.getId();
        this.f98496OooOo0o = 2;
        c27881OooOO0O.getClass();
        if (C24610OooO0O0.f83393OooO00o) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PageLayerUseCase");
            c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip noteId=%s", id);
            objOooO0o = C32460OooOooO.f116667OooO00o;
        } else {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27880OooOO0(c27881OooOO0O, id, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
        }
    }
}
