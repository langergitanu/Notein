package o0o00oOo;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27600o0ooOO0;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$setFolderColorById$2", m80623f = "NoteListViewModel.kt", m80624l = {1164}, m80625m = "invokeSuspend")
public final class o00O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107088OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107089OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f107090OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f107091OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, String str, int i, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f107088OooOo = oooO0OO;
        this.f107091OooOoO0 = str;
        this.f107090OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0O(this.f107088OooOo, this.f107091OooOoO0, this.f107090OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107089OooOo0o;
        String str = this.f107091OooOoO0;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f107088OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
            this.f107089OooOo0o = 1;
            c27600o0ooOO0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOo0o.o000000O(c27600o0ooOO0, str, this.f107090OooOoO, null), this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        oooO0OO.f77138OooOo00.OooO0O0(str);
        return C32460OooOooO.f116667OooO00o;
    }
}
