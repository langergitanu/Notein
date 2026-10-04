package o0OOo0o;

import com.orion.notein.domain.models.page.DualLinkRef;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26515OooooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getDualLinkRefById$2", m80623f = "NoteUseCase.kt", m80624l = {562}, m80625m = "invokeSuspend")
public final class o00O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super DualLinkRef>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95876OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95873OooOo = c27449o00O0OoO;
        this.f95876OooOoO0 = str;
        this.f95875OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0(this.f95876OooOoO0, this.f95875OooOoO, continuation, this.f95873OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super DualLinkRef> continuation) {
        return ((o00O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95874OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26515OooooO0 c26515OooooO0 = this.f95873OooOo.f96052OooOOoo;
        this.f95874OooOo0o = 1;
        Object objOooO0oo = c26515OooooO0.OooO0oo(this.f95876OooOoO0, this.f95875OooOoO, this);
        return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
    }
}
