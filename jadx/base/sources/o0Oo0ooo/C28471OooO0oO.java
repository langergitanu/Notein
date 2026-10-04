package o0Oo0ooo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.coroutines.Continuation;
import o0O0ooo0.EnumC26248OooOo0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$observeVerificationState$2", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28471OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C28480OooOOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseGetPhoneVerificationFragment f100869OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100870OooOo0o;

    /* JADX INFO: renamed from: o0Oo0ooo.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f100871OooO00o;

        static {
            int[] iArr = new int[EnumC28481OooOOo0.values().length];
            try {
                EnumC28481OooOOo0 enumC28481OooOOo0 = EnumC28481OooOOo0.f100917OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC28481OooOOo0 enumC28481OooOOo02 = EnumC28481OooOOo0.f100917OooOo0o;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC28481OooOOo0 enumC28481OooOOo03 = EnumC28481OooOOo0.f100917OooOo0o;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100871OooO00o = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28471OooO0oO(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C28471OooO0oO> continuation) {
        super(2, continuation);
        this.f100869OooOo = baseGetPhoneVerificationFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28471OooO0oO c28471OooO0oO = new C28471OooO0oO(this.f100869OooOo, continuation);
        c28471OooO0oO.f100870OooOo0o = obj;
        return c28471OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C28480OooOOo c28480OooOOo, Continuation<? super C32460OooOooO> continuation) {
        return ((C28471OooO0oO) create(c28480OooOOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String string;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C28480OooOOo c28480OooOOo = (C28480OooOOo) this.f100870OooOo0o;
        EnumC26248OooOo0 enumC26248OooOo0 = c28480OooOOo.f100913OooO0Oo != null ? EnumC26248OooOo0.f89696OooOoO0 : EnumC26248OooOo0.f89694OooOo0o;
        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100869OooOo;
        EnumC26248OooOo0 enumC26248OooOo0OooOoO0 = baseGetPhoneVerificationFragment.OooOoO0(enumC26248OooOo0, c28480OooOOo);
        if (baseGetPhoneVerificationFragment.OooOoO().getState() != enumC26248OooOo0OooOoO0) {
            baseGetPhoneVerificationFragment.OooOoO().setState(enumC26248OooOo0OooOoO0);
        }
        EnumC28481OooOOo0 enumC28481OooOOo0 = c28480OooOOo.f100913OooO0Oo;
        int i = enumC28481OooOOo0 == null ? -1 : OooO00o.f100871OooO00o[enumC28481OooOOo0.ordinal()];
        if (i == -1) {
            string = baseGetPhoneVerificationFragment.getString(baseGetPhoneVerificationFragment.Oooo000());
        } else if (i == 1) {
            string = baseGetPhoneVerificationFragment.getString(R.string.phone_number_is_wrong);
        } else if (i == 2) {
            string = baseGetPhoneVerificationFragment.getString(R.string.network_error);
        } else {
            if (i != 3) {
                throw new C32442OooOO0o();
            }
            string = baseGetPhoneVerificationFragment.getString(R.string.phone_is_bounded);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
        baseGetPhoneVerificationFragment.OooOoO().setSupportingText(string);
        return C32460OooOooO.f116667OooO00o;
    }
}
