package o0OOo0o;

import kotlin.coroutines.Continuation;
import o0OOO0OO.C27012OooOOOo;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00Oo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$updatePageLastModificationTime$2", m80623f = "NoteUseCase.kt", m80624l = {400}, m80625m = "invokeSuspend")
public final class C27484o00Oo0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96314OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96315OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f96316OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96317OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96318OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27484o00Oo0oO(C27449o00O0OoO c27449o00O0OoO, String str, long j, String str2, Continuation<? super C27484o00Oo0oO> continuation) {
        super(2, continuation);
        this.f96314OooOo = c27449o00O0OoO;
        this.f96317OooOoO0 = str;
        this.f96316OooOoO = j;
        this.f96318OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27484o00Oo0oO(this.f96314OooOo, this.f96317OooOoO0, this.f96316OooOoO, this.f96318OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27484o00Oo0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96315OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27020OooOoO0 c27020OooOoO0 = this.f96314OooOo.f96039OooO0o;
            this.f96315OooOo0o = 1;
            C27015OooOOoo c27015OooOOoo = c27020OooOoO0.f94064OooO00o;
            c27015OooOOoo.getClass();
            Object objOooO0O0 = c27015OooOOoo.OooO0O0(this.f96318OooOoOO, new C27012OooOOOo(this.f96317OooOoO0, this.f96316OooOoO, null));
            if (objOooO0O0 != enumC32485OooO00o) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0O0 != enumC32485OooO00o) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0O0 == enumC32485OooO00o) {
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
