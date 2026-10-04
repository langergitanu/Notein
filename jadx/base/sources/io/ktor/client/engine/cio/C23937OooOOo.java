package io.ktor.client.engine.cio;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28035OooO00o;
import oO000oo.C32134OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Ooo0O.C33415Oooo0oO;
import oO0Ooo0O.C33419OoooO0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.EndpointKt$setupTimeout$timeoutJob$1", m80623f = "Endpoint.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
public final class C23937OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f80425OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80426OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f80427OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f80428OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23937OooOOo(long j, InterfaceC34415OooO0oo interfaceC34415OooO0oo, C32134OooO0o0 c32134OooO0o0, Continuation<? super C23937OooOOo> continuation) {
        super(2, continuation);
        this.f80425OooOo = j;
        this.f80428OooOoO0 = interfaceC34415OooO0oo;
        this.f80427OooOoO = c32134OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23937OooOOo(this.f80425OooOo, this.f80428OooOoO0, this.f80427OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23937OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80426OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f80426OooOo0o = 1;
            if (C33644OoooO0.OooO00o(this.f80425OooOo, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        InterfaceC33672o00ooo interfaceC33672o00oooOooO0Oo = oO00o00.OooO0OO.OooO0Oo(this.f80428OooOoO0);
        C32134OooO0o0 c32134OooO0o0 = this.f80427OooOoO;
        String str = c32134OooO0o0.f115215OooO00o.f115593OooO;
        C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
        C33419OoooO0.OooO00o oooO00o = (C33419OoooO0.OooO00o) c32134OooO0o0.OooO00o();
        interfaceC33672o00oooOooO0Oo.cancel(C28035OooO00o.OooO00o("Request is timed out", new C33415Oooo0oO(str, oooO00o != null ? oooO00o.f120814OooO00o : null)));
        return C32460OooOooO.f116667OooO00o;
    }
}
