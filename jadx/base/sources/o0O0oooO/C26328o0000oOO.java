package o0O0oooO;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0oooO.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$setUserAvatar$2", m80623f = "UserViewModel.kt", m80624l = {651}, m80625m = "invokeSuspend")
public final class C26328o0000oOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90291OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bitmap f90292OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26328o0000oOO(C26320o0000OoO c26320o0000OoO, Bitmap bitmap, Continuation<? super C26328o0000oOO> continuation) {
        super(2, continuation);
        this.f90290OooOo = c26320o0000OoO;
        this.f90292OooOoO0 = bitmap;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26328o0000oOO(this.f90290OooOo, this.f90292OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C26328o0000oOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90291OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26320o0000OoO c26320o0000OoO = this.f90290OooOo;
        this.f90291OooOo0o = 1;
        Object objOooOO0o = c26320o0000OoO.f90209OooO0oo.OooOO0o(this.f90292OooOoO0, this);
        return objOooOO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0o;
    }
}
