package o0OO0o0O;

import kotlin.coroutines.Continuation;
import o00OO0oO.C25003OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo0oO0.InterfaceC34723Oooo;

/* JADX INFO: renamed from: o0OO0o0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.colorset.ColorSetLocalDataSource$deleteColorSet$2", m80623f = "ColorSetLocalDataSource.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C26921OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25003OooO0O0 f93462OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93463OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93464OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26921OooO0O0(C25003OooO0O0 c25003OooO0O0, String str, Continuation<? super C26921OooO0O0> continuation) {
        super(2, continuation);
        this.f93462OooOo = c25003OooO0O0;
        this.f93464OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26921OooO0O0(this.f93462OooOo, this.f93464OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26921OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93463OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C25003OooO0O0 c25003OooO0O0 = this.f93462OooOo;
            this.f93463OooOo0o = 1;
            if (((InterfaceC34723Oooo) c25003OooO0O0.f84821OooO00o).OooO0o0(this.f93464OooOoO0, this) == enumC32485OooO00o) {
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
