package o0OoO0oo;

import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOoo0o.C27858OooO00o;
import o0OOoo0o.C27869OooOOO;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$addOutline$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {928}, m80625m = "invokeSuspend")
public final class o000OO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101939OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101940OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101941OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101942OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f101943OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, String str2, String str3, Continuation<? super o000OO00> continuation) {
        super(2, continuation);
        this.f101939OooOo = oooO0OO;
        this.f101942OooOoO0 = str;
        this.f101941OooOoO = str2;
        this.f101943OooOoOO = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000OO00(this.f101939OooOo, this.f101942OooOoO0, this.f101941OooOoO, this.f101943OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000OO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101940OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f101939OooOo;
            this.f101940OooOo0o = 1;
            String string = UUID.randomUUID().toString();
            String str = this.f101942OooOoO0;
            String str2 = this.f101941OooOoO;
            String str3 = this.f101943OooOoOO;
            C27869OooOOO c27869OooOOO = oooO0OO.f73357OooOO0o;
            c27869OooOOO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27858OooO00o(c27869OooOOO, str, string, str3, str2, null, null), this) == enumC32485OooO00o) {
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
