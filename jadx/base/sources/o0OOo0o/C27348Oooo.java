package o0OOo0o;

import com.orion.notein.domain.models.switches.BrandSwitches;
import java.util.List;
import kotlin.coroutines.Continuation;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BrandSwitchUseCase$isEnableDropFrameFor120HZ$2", m80623f = "BrandSwitchUseCase.kt", m80624l = {116}, m80625m = "invokeSuspend")
public final class C27348Oooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27428o000oOoO f95213OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95214OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27348Oooo(C27428o000oOoO c27428o000oOoO, Continuation<? super C27348Oooo> continuation) {
        super(2, continuation);
        this.f95213OooOo = c27428o000oOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27348Oooo(this.f95213OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27348Oooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95214OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BrandSwitchUseCase");
            c20358OooO00o.OooO0o0("isEnableDropFrameFor120HZ fetch start.", new Object[0]);
            List<BrandSwitches> list = C27428o000oOoO.f95767OooO0Oo;
            this.f95214OooOo0o = 1;
            C27428o000oOoO c27428o000oOoO = this.f95213OooOo;
            c27428o000oOoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27356Oooo0oo("rconfig_enable_drop_frame_on_120hz_by_device", c27428o000oOoO, list, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("BrandSwitchUseCase");
        c20358OooO00o2.OooO0o0("isEnableDropFrameFor120HZ fetch end, enable: " + zBooleanValue + ".", new Object[0]);
        return bool;
    }
}
