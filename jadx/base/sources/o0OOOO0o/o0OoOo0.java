package o0OOOO0o;

import android.graphics.Bitmap;
import com.orion.notein.data.service.dto.UserApiResultDto;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$setUserAvatar$result$1", m80623f = "UserRepoImpl.kt", m80624l = {462}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super UserApiResultDto>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27129OoooOOO f94752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94753OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bitmap f94754OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(C27129OoooOOO c27129OoooOOO, Bitmap bitmap, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f94752OooOo = c27129OoooOOO;
        this.f94754OooOoO0 = bitmap;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OoOo0(this.f94752OooOo, this.f94754OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super UserApiResultDto> continuation) {
        return ((o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94753OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27119Oooo0OO c27119Oooo0OO = this.f94752OooOo.f94599OooO0Oo;
            this.f94753OooOo0o = 1;
            obj = c27119Oooo0OO.OooOO0o(this.f94754OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
        return obj;
    }
}
