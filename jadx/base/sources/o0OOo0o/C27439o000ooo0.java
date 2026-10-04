package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o000ooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$checkPageExist$2", m80623f = "NoteUseCase.kt", m80624l = {512}, m80625m = "invokeSuspend")
public final class C27439o000ooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95850OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95851OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95852OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95853OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27439o000ooo0(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95850OooOo = c27449o00O0OoO;
        this.f95853OooOoO0 = str;
        this.f95852OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27439o000ooo0(this.f95853OooOoO0, this.f95852OooOoO, continuation, this.f95850OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27439o000ooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95851OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27020OooOoO0 c27020OooOoO0 = this.f95850OooOo.f96039OooO0o;
            this.f95851OooOo0o = 1;
            obj = c27020OooOoO0.OooO0Oo(this.f95853OooOoO0, this.f95852OooOoO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Page page = (Page) obj;
        return Boolean.valueOf((page == null || page.getInTrashBin()) ? false : true);
    }
}
