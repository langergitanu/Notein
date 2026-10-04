package o0OO0oO0;

import android.content.Context;
import android.os.Build;
import com.orion.notein.domain.models.device.DeviceInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0oO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.device.DeviceManager$getDeviceInfo$2", m80623f = "DeviceManager.kt", m80624l = {52}, m80625m = "invokeSuspend")
public final class C26940OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super DeviceInfo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Context f93587OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93588OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26940OooO0o0(Context context, Continuation<? super C26940OooO0o0> continuation) {
        super(2, continuation);
        this.f93587OooOo = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26940OooO0o0(this.f93587OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super DeviceInfo> continuation) {
        return ((C26940OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93588OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO0o oooO0o = OooO0o.f93585OooO00o;
            this.f93588OooOo0o = 1;
            obj = oooO0o.OooO00o(this.f93587OooOo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String PRODUCT = Build.PRODUCT;
        OooOOO0.OooO0o(PRODUCT, "PRODUCT");
        String USER = Build.USER;
        OooOOO0.OooO0o(USER, "USER");
        return new DeviceInfo((String) obj, BRAND, PRODUCT, USER, null, 16, null);
    }
}
