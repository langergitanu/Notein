package o0o00oOo;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o0OO.C26417OooOoO;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$updateNoteSortKey$1", m80623f = "NoteListViewModel.kt", m80624l = {1888}, m80625m = "invokeSuspend")
public final class o00000OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107050OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107051OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f107052OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f107053OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Continuation continuation) {
        super(2, continuation);
        this.f107050OooOo = oooO0OO;
        this.f107053OooOoO0 = linkedHashMap;
        this.f107052OooOoO = linkedHashMap2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00000OO(this.f107050OooOo, this.f107053OooOoO0, this.f107052OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00000OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107051OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = this.f107050OooOo.f77121OooO0Oo;
            this.f107051OooOo0o = 1;
            C26417OooOoO c26417OooOoO = c27449o00O0OoO.f96040OooO0o0;
            Object objOooO = c26417OooOoO.f90710OooO00o.OooO(this.f107053OooOoO0, this.f107052OooOoO, this);
            if (objOooO != enumC32485OooO00o) {
                objOooO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO != enumC32485OooO00o) {
                objOooO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO == enumC32485OooO00o) {
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
