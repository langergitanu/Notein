package oO00OOO;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO00OOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", m80623f = "KotlinxSerializationConverter.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C32231OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Object, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f115729OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f115730OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32231OooO0Oo(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, Continuation<? super C32231OooO0Oo> continuation) {
        super(2, continuation);
        this.f115729OooOo = interfaceC23986Ooooo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32231OooO0Oo c32231OooO0Oo = new C32231OooO0Oo(this.f115729OooOo, continuation);
        c32231OooO0Oo.f115730OooOo0o = obj;
        return c32231OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return ((C32231OooO0Oo) create(obj, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(this.f115730OooOo0o != null || this.f115729OooOo.OooOoo());
    }
}
