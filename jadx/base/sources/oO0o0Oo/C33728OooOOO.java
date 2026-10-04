package oO0o0Oo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: oO0o0Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", m80623f = "Delay.kt", m80624l = {307, StyleIdentifier.GRID_TABLE_2_ACCENT_5, StyleIdentifier.GRID_TABLE_3_ACCENT_5}, m80625m = "invokeSuspend")
public final class C33728OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C32460OooOooO>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121535OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121536OooOo0o;

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33728OooOOO c33728OooOOO = new C33728OooOOO(2, continuation);
        c33728OooOOO.f121535OooOo = obj;
        return c33728OooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C32460OooOooO> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        ((C33728OooOOO) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[PHI: r1
      0x0050: PHI (r1v4 oO0o0OOo.OooOo0O) = (r1v3 oO0o0OOo.OooOo0O), (r1v8 oO0o0OOo.OooOo0O) binds: [B:16:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:15:0x003d). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33712OooOo0O interfaceC33712OooOo0O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121536OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f121535OooOo;
            this.f121535OooOo = interfaceC33712OooOo0O;
            this.f121536OooOo0o = 1;
            if (C33644OoooO0.OooO00o(500L, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f121535OooOo;
                C32446OooOOOo.OooO0O0(obj);
                this.f121535OooOo = interfaceC33712OooOo0O;
                this.f121536OooOo0o = 3;
                if (C33644OoooO0.OooO00o(500L, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f121535OooOo;
        C32446OooOOOo.OooO0O0(obj);
        C33710OooOo0 channel = interfaceC33712OooOo0O.getChannel();
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        this.f121535OooOo = interfaceC33712OooOo0O;
        this.f121536OooOo0o = 2;
        if (channel.f121482OooOoO.OooOOO(c32460OooOooO, this) != enumC32485OooO00o) {
            this.f121535OooOo = interfaceC33712OooOo0O;
            this.f121536OooOo0o = 3;
            if (C33644OoooO0.OooO00o(500L, this) != enumC32485OooO00o) {
                C33710OooOo0 channel2 = interfaceC33712OooOo0O.getChannel();
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                this.f121535OooOo = interfaceC33712OooOo0O;
                this.f121536OooOo0o = 2;
                if (channel2.f121482OooOoO.OooOOO(c32460OooOooO2, this) != enumC32485OooO00o) {
                }
            }
        }
        return enumC32485OooO00o;
    }
}
