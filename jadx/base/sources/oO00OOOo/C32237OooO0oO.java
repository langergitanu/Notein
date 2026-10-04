package oO00OOOo;

import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.nio.charset.Charset;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO00OOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", m80623f = "KotlinxSerializationJsonExtensions.kt", m80624l = {51}, m80625m = "invokeSuspend")
public final class C32237OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC23990Oooooo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f115780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115781OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f115782OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO f115783OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33911OooO0OO<?> f115784OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Charset f115785OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32237OooO0oO(OooO oooO, Object obj, InterfaceC33911OooO0OO<?> interfaceC33911OooO0OO, Charset charset, Continuation<? super C32237OooO0oO> continuation) {
        super(2, continuation);
        this.f115783OooOoO0 = oooO;
        this.f115782OooOoO = obj;
        this.f115784OooOoOO = interfaceC33911OooO0OO;
        this.f115785OooOoo0 = charset;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32237OooO0oO c32237OooO0oO = new C32237OooO0oO(this.f115783OooOoO0, this.f115782OooOoO, this.f115784OooOoOO, this.f115785OooOoo0, continuation);
        c32237OooO0oO.f115780OooOo = obj;
        return c32237OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC23990Oooooo interfaceC23990Oooooo, Continuation<? super C32460OooOooO> continuation) {
        return ((C32237OooO0oO) create(interfaceC23990Oooooo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115781OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC23990Oooooo interfaceC23990Oooooo = (InterfaceC23990Oooooo) this.f115780OooOo;
            Object obj2 = this.f115782OooOoO;
            OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
            InterfaceC33911OooO0OO<?> interfaceC33911OooO0OO = this.f115784OooOoOO;
            OooOOO0.OooO0o0(interfaceC33911OooO0OO, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            this.f115781OooOo0o = 1;
            if (OooO.OooO0OO(this.f115783OooOoO0, (InterfaceC33721OooO0o) obj2, interfaceC33911OooO0OO, this.f115785OooOoo0, interfaceC23990Oooooo, this) == enumC32485OooO00o) {
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
