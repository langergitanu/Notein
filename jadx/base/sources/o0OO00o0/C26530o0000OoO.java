package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27204OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO00o0.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getPenEventSettingSync$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {239}, m80625m = "invokeSuspend")
public final class C26530o0000OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27204OooO0O0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91337OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f91338OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26528o0000Oo f91339OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Integer> f91340OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26530o0000OoO(AbstractC24338OooO0o0.OooO00o oooO00o, C26528o0000Oo c26528o0000Oo, Continuation continuation) {
        super(2, continuation);
        this.f91340OooOoO0 = oooO00o;
        this.f91339OooOoO = c26528o0000Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26530o0000OoO(this.f91340OooOoO0, this.f91339OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27204OooO0O0> continuation) {
        return ((C26530o0000OoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91337OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str2 = this.f91340OooOoO0.f81922OooO00o;
            this.f91338OooOo0o = str2;
            this.f91337OooOo = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(this.f91339OooOoO, this);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str = str2;
            obj = objOooOOo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f91338OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return new C27204OooO0O0(str, ((Number) obj).intValue());
    }
}
