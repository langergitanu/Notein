package io.ktor.client.engine.cio;

import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import kotlin.coroutines.Continuation;
import oO000oo.C32134OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2", m80623f = "utils.kt", m80624l = {33, 34}, m80625m = "invokeSuspend")
public final class C23943OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f80470OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80471OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f80472OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23990Oooooo f80473OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ boolean f80474OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f80475OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23943OooOoO(C32134OooO0o0 c32134OooO0o0, InterfaceC23990Oooooo interfaceC23990Oooooo, boolean z, boolean z2, InterfaceC34415OooO0oo interfaceC34415OooO0oo, Continuation<? super C23943OooOoO> continuation) {
        super(2, continuation);
        this.f80470OooOo = c32134OooO0o0;
        this.f80473OooOoO0 = interfaceC23990Oooooo;
        this.f80472OooOoO = z;
        this.f80474OooOoOO = z2;
        this.f80475OooOoo0 = interfaceC34415OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23943OooOoO(this.f80470OooOo, this.f80473OooOoO0, this.f80472OooOoO, this.f80474OooOoOO, this.f80475OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23943OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (io.ktor.client.engine.cio.C23945OooOoOO.OooO0O0(r3, r2, r6.f80475OooOoo0, true, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80471OooOo0o;
        InterfaceC23990Oooooo interfaceC23990Oooooo = this.f80473OooOoO0;
        C32134OooO0o0 c32134OooO0o0 = this.f80470OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f80471OooOo0o = 1;
            if (C23945OooOoOO.OooO0OO(c32134OooO0o0, interfaceC23990Oooooo, this.f80472OooOoO, this.f80474OooOoOO, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f80471OooOo0o = 2;
    }
}
