package oO0o0Oo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0OoO.AbstractC33796OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33718OooO0O0<T> extends C33719OooO0OO<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC32476OooO f121505OooOoOO;

    /* JADX INFO: renamed from: oO0o0Oo.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m80623f = "Builders.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_1}, m80625m = "collectTo")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121506OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC33712OooOo0O f121507OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f121508OooOoO;

        public OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            super(abstractC32479OooO0OO);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121506OooOo = obj;
            this.f121508OooOoO |= Integer.MIN_VALUE;
            return C33718OooO0O0.this.OooO0O0(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33718OooO0O0(InterfaceC32508OooOOOo<? super InterfaceC33712OooOo0O<? super T>, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        super(interfaceC32508OooOOOo, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
        this.f121505OooOoOO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.C33719OooO0OO, oO0o0OoO.AbstractC33796OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121508OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121508OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o((AbstractC32479OooO0OO) continuation);
            }
        }
        Object obj = oooO00o.f121506OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121508OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o.f121507OooOo0o = interfaceC33712OooOo0O;
            oooO00o.f121508OooOoO = 1;
            if (super.OooO0O0(interfaceC33712OooOo0O, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33712OooOo0O = oooO00o.f121507OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (interfaceC33712OooOo0O.OooOO0()) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0o0Oo.C33719OooO0OO, oO0o0OoO.AbstractC33796OooO0oO
    public final AbstractC33796OooO0oO<T> OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return new C33718OooO0O0(this.f121505OooOoOO, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
    }
}
