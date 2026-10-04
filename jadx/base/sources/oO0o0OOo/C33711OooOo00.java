package oO0o0OOo;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OOo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33711OooOo00 {

    /* JADX INFO: renamed from: oO0o0OOo.OooOo00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.channels.ProduceKt", m80623f = "Produce.kt", m80624l = {302}, m80625m = "awaitClose")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oO0O000o.OooO00o f121493OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC33712OooOo0O f121494OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f121495OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f121496OooOoO0;

        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121496OooOoO0 = obj;
            this.f121495OooOoO |= Integer.MIN_VALUE;
            return C33711OooOo00.OooO00o(null, null, this);
        }
    }

    /* JADX INFO: renamed from: oO0o0OOo.OooOo00$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33614OooOOO0 f121497OooOo0o;

        public OooO0O0(C33614OooOOO0 c33614OooOOO0) {
            this.f121497OooOo0o = c33614OooOOO0;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            this.f121497OooOo0o.resumeWith(c32460OooOooO);
            return c32460OooOooO;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(InterfaceC33712OooOo0O<?> interfaceC33712OooOo0O, oO0O000o.OooO00o<C32460OooOooO> oooO00o, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o2;
        if (continuation instanceof OooO00o) {
            oooO00o2 = (OooO00o) continuation;
            int i = oooO00o2.f121495OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o2.f121495OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o2 = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o2.f121496OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o2.f121495OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (oooO00o2.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o) != interfaceC33712OooOo0O) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                oooO00o2.f121494OooOo0o = interfaceC33712OooOo0O;
                oooO00o2.f121493OooOo = oooO00o;
                oooO00o2.f121495OooOoO = 1;
                C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(oooO00o2));
                c33614OooOOO0.OooOOoo();
                interfaceC33712OooOo0O.OooOO0O(new OooO0O0(c33614OooOOO0));
                if (c33614OooOOO0.OooOOo() == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO00o = oooO00o2.f121493OooOo;
                C32446OooOOOo.OooO0O0(obj);
            }
            oooO00o.invoke();
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            oooO00o.invoke();
            throw th;
        }
    }

    public static C33710OooOo0 OooO0O0(InterfaceC33636Oooo00o interfaceC33636Oooo00o, C33635Oooo00O c33635Oooo00O, int i, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i2) {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = c33635Oooo00O;
        if ((i2 & 1) != 0) {
            interfaceC34415OooO0oo = oOo0000O.OooO.f123416OooOo0o;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        EnumC33692OooO0OO enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
        EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121317OooOo0o;
        C33710OooOo0 c33710OooOo0 = new C33710OooOo0(C33628OooOoo.OooO0O0(interfaceC33636Oooo00o, interfaceC34415OooO0oo), C33703OooOOO0.OooO00o(i, 4, enumC33692OooO0OO), true, true);
        c33710OooOo0.Ooooooo(enumC33637Oooo0O0, c33710OooOo0, interfaceC32508OooOOOo);
        return c33710OooOo0;
    }
}
