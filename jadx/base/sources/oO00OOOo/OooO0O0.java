package oO00OOOo;

import OoooOoO.C21236OooO0oo;
import Ooooo00.C21246OooO0OO;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.jvm.javaio.C24002OooO0o0;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.C24755OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.EnumC34456OooO0O0;
import ooOOoOO0.C35128OooOo0;
import ooOOoOO0.C35132OooOoO0;
import ooOOoOO0.C35139Oooo00o;
import ooOOoOO0.OooOo00;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", m80623f = "JsonExtensionsJvm.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33569OooO0oo<? extends Object>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oOOoOoOO.OooO00o f115761OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f115762OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC34457OooO0OO f115763OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, oOOoOoOO.OooO00o oooO00o, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f115762OooOo0o = interfaceC23986Ooooo0o;
        this.f115761OooOo = oooO00o;
        this.f115763OooOoO0 = abstractC34457OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f115762OooOo0o, this.f115761OooOo, this.f115763OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33569OooO0oo<? extends Object>> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        EnumC34456OooO0O0 enumC34456OooO0O0;
        Iterator c35128OooOo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C32447OooOOo c32447OooOOo = io.ktor.utils.p616io.jvm.javaio.OooO0O0.f80853OooO00o;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = this.f115762OooOo0o;
        OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
        C24002OooO0o0 c24002OooO0o0 = new C24002OooO0o0(null, interfaceC23986Ooooo0o);
        oOOoOoOO.OooO00o oooO00oOooO0O0 = C21246OooO0OO.OooO0O0(this.f115761OooOo);
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f115763OooOoO0;
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0Oo = C21236OooO0oo.OooO0Oo(abstractC34457OooO0OO.f123492OooO0O0, oooO00oOooO0O0);
        EnumC34456OooO0O0 enumC34456OooO0O02 = EnumC34456OooO0O0.f123488OooOo0o;
        C35139Oooo00o c35139Oooo00o = new C35139Oooo00o(new C24755OooO00o(c24002OooO0o0), new char[16384]);
        if (c35139Oooo00o.OooOo() == 8) {
            c35139Oooo00o.OooO0oO((byte) 8);
            enumC34456OooO0O0 = EnumC34456OooO0O0.f123487OooOo;
        } else {
            enumC34456OooO0O0 = EnumC34456OooO0O0.f123488OooOo0o;
        }
        int iOrdinal = enumC34456OooO0O0.ordinal();
        if (iOrdinal == 0) {
            c35128OooOo0 = new C35128OooOo0(abstractC34457OooO0OO, c35139Oooo00o, interfaceC33911OooO0OOOooO0Oo);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C32442OooOO0o();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
            }
            c35128OooOo0 = new OooOo00(abstractC34457OooO0OO, c35139Oooo00o, interfaceC33911OooO0OOOooO0Oo);
        }
        return C33574OooOOO0.OooO0oO(new C35132OooOoO0(c35128OooOo0));
    }
}
