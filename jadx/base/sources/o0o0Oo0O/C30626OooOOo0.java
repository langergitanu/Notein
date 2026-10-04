package o0o0Oo0O;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0Oo0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsViewModel$setEnableFillShape$1", m80623f = "GlobalSettingsViewModel.kt", m80624l = {441}, m80625m = "invokeSuspend")
public final class C30626OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30623OooOOOO f109612OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109613OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f109614OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30626OooOOo0(C30623OooOOOO c30623OooOOOO, boolean z, Continuation<? super C30626OooOOo0> continuation) {
        super(2, continuation);
        this.f109612OooOo = c30623OooOOOO;
        this.f109614OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30626OooOOo0(this.f109612OooOo, this.f109614OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30626OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109613OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30623OooOOOO c30623OooOOOO = this.f109612OooOo;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69578o000000O;
            this.f109613OooOo0o = 1;
            if (c30623OooOOOO.f109572OooO0Oo.OooO0oO(oooO00o, this.f109614OooOoO0, this) == enumC32485OooO00o) {
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
