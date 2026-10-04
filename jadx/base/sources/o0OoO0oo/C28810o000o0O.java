package o0OoO0oo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27359OoooO00;
import o0OOo0o.C27428o000oOoO;
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

/* JADX INFO: renamed from: o0OoO0oo.o000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$isEnablePalmDetection$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {StyleIdentifier.COLORFUL_LIST_ACCENT_6}, m80625m = "invokeSuspend")
public final class C28810o000o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102008OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102009OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28810o000o0O(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, Continuation<? super C28810o000o0O> continuation) {
        super(2, continuation);
        this.f102008OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28810o000o0O(this.f102008OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C28810o000o0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102009OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102008OooOo;
        this.f102009OooOo0o = 1;
        C27428o000oOoO c27428o000oOoO = oooO0OO.f73358OooOOO;
        c27428o000oOoO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27359OoooO00(c27428o000oOoO, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
