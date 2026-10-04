package o0OoO0oo;

import com.orion.notein.domain.models.note.Comment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o000Ooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$getComment$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {835}, m80625m = "invokeSuspend")
public final class C28803o000Ooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Comment>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101988OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101989OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101990OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28803o000Ooo0(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, Continuation<? super C28803o000Ooo0> continuation) {
        super(2, continuation);
        this.f101988OooOo = oooO0OO;
        this.f101990OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28803o000Ooo0(this.f101988OooOo, this.f101990OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Comment> continuation) {
        return ((C28803o000Ooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101989OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f101988OooOo;
        String strOooOO0O = oooO0OO.OooOO0O();
        this.f101989OooOo0o = 1;
        Object objOooO0OO = oooO0OO.f73356OooOO0O.f97721OooO00o.OooO0OO(this.f101990OooOoO0, strOooOO0O, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
