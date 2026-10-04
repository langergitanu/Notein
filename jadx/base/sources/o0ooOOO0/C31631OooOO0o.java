package o0ooOOO0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0ooOOO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$startCountdown$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {223}, m80625m = "invokeSuspend")
public final class C31631OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f113079OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f113080OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.login.verificationcode.OooO0OO f113081OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31631OooOO0o(com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO, Continuation continuation) {
        super(2, continuation);
        this.f113081OooOoO0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31631OooOO0o(this.f113081OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31631OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:23:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0050 -> B:22:0x0051). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object value;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f113079OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            i = 60;
            if (-1 < i) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.f113080OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = i3;
            i--;
            if (-1 < i) {
                C33781o00o0O c33781o00o0O = this.f113081OooOoO0.f72635OooO0oo;
                do {
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C31626OooO0o0.OooO00o((C31626OooO0o0) value, null, false, false, null, i, i > 0, 63)));
                if (i > 0) {
                    this.f113080OooOo0o = i;
                    this.f113079OooOo = 1;
                    if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    i3 = i;
                    i = i3;
                }
                i--;
                if (-1 < i) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }
}
