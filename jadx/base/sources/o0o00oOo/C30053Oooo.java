package o0o00oOo;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00oOo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$deleteNote$2$1$1", m80623f = "NoteListViewModel.kt", m80624l = {1414}, m80625m = "invokeSuspend")
public final class C30053Oooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106878OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106879OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f106880OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30053Oooo(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, String str, Continuation<? super C30053Oooo> continuation) {
        super(2, continuation);
        this.f106878OooOo = oooO0OO;
        this.f106880OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30053Oooo(this.f106878OooOo, this.f106880OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30053Oooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106879OooOo0o;
        String str = this.f106880OooOoO0;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106878OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
            this.f106879OooOo0o = 1;
            obj = c27449o00O0OoO.OooOoOO(str, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        NoteMeta noteMeta = (NoteMeta) obj;
        if (noteMeta != null && noteMeta.getInTrashBin()) {
            oooO0OO.f77138OooOo00.OooO0Oo(str, true);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
