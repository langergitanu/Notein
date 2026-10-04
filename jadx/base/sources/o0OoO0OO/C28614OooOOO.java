package o0OoO0OO;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.domain.models.login.LoginInfo;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0Oo0ooo.C28473OooOO0;
import o0Oo0ooo.C28477OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0OO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onWXImageViewCreated$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {232, 233}, m80625m = "invokeSuspend")
public final class C28614OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginByThirdPartyChildFragment f101419OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101420OooOo0o;

    /* JADX INFO: renamed from: o0OoO0OO.OooOOO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ LoginByThirdPartyChildFragment f101421OooOo0o;

        /* JADX INFO: renamed from: o0OoO0OO.OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onWXImageViewCreated$1$1$1$1$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19919OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LoginInfo f101422OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LoginByThirdPartyChildFragment f101423OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19919OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, LoginInfo loginInfo, Continuation<? super C19919OooO00o> continuation) {
                super(2, continuation);
                this.f101423OooOo0o = loginByThirdPartyChildFragment;
                this.f101422OooOo = loginInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19919OooO00o(this.f101423OooOo0o, this.f101422OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19919OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC28618OooOOo interfaceC28618OooOOo = this.f101423OooOo0o.f72577OooOo;
                LoginInfo loginInfo = this.f101422OooOo;
                interfaceC28618OooOOo.OooOOoo(1, loginInfo.getAccessToken(), loginInfo.getOpenID());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OoO0OO.OooOOO$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onWXImageViewCreated$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {237, 241}, m80625m = "emit")
        public static final class OooO0O0 extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public C27174OooO0O0 f101424OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public OooO00o f101425OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public AuthorizeInfo f101426OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public LoginByThirdPartyChildFragment f101427OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public /* synthetic */ Object f101428OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public int f101429OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f101430OooOoo0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(OooO00o<? super T> oooO00o, Continuation<? super OooO0O0> continuation) {
                super(continuation);
                this.f101430OooOoo0 = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f101428OooOoOO = obj;
                this.f101429OooOoo |= Integer.MIN_VALUE;
                return this.f101430OooOoo0.emit(null, this);
            }
        }

        public OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
            this.f101421OooOo0o = loginByThirdPartyChildFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[Catch: Exception -> 0x00cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:45:0x00c8, B:47:0x00cc), top: B:55:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(C27174OooO0O0<AuthorizeInfo> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            OooO0O0 oooO0O0;
            AuthorizeInfo authorizeInfoOooO0O0;
            LoginByThirdPartyChildFragment loginByThirdPartyChildFragment;
            Object objOooO0oO;
            OooO00o<T> oooO00o;
            LoginInfo loginInfo;
            AuthorizeInfo authorizeInfo;
            LoginByThirdPartyChildFragment loginByThirdPartyChildFragment2;
            Context context;
            AlertDialogC28626OooOoO0 alertDialogC28626OooOoO0;
            if (continuation instanceof OooO0O0) {
                oooO0O0 = (OooO0O0) continuation;
                int i = oooO0O0.f101429OooOoo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0O0.f101429OooOoo = i - Integer.MIN_VALUE;
                } else {
                    oooO0O0 = new OooO0O0(this, continuation);
                }
            }
            Object obj = oooO0O0.f101428OooOoOO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO0O0.f101429OooOoo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                authorizeInfoOooO0O0 = c27174OooO0O0.OooO0O0();
                loginByThirdPartyChildFragment = this.f101421OooOo0o;
                if (authorizeInfoOooO0O0 == null) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), LoginErrorCode.ERROR_CODE_OTHER)) {
                        LoginByThirdPartyChildFragment.OooOoO(loginByThirdPartyChildFragment);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                String authCode = authorizeInfoOooO0O0.getAuthCode();
                if (authCode != null && authCode.length() != 0) {
                    AlertDialogC28626OooOoO0 alertDialogC28626OooOoO02 = loginByThirdPartyChildFragment.f72584OooOooO;
                    if (alertDialogC28626OooOoO02 != null) {
                        alertDialogC28626OooOoO02.dismiss();
                    }
                    C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
                    String authCode2 = authorizeInfoOooO0O0.getAuthCode();
                    oooO0O0.f101425OooOo0o = this;
                    oooO0O0.f101424OooOo = c27174OooO0O0;
                    oooO0O0.f101427OooOoO0 = loginByThirdPartyChildFragment;
                    oooO0O0.f101426OooOoO = authorizeInfoOooO0O0;
                    oooO0O0.f101429OooOoo = 1;
                    objOooO0oO = c28477OooOOO0OooOoOO.OooO0oO(1, authCode2, oooO0O0);
                    if (objOooO0oO != enumC32485OooO00o) {
                        oooO00o = this;
                    }
                    return enumC32485OooO00o;
                }
                if (authorizeInfoOooO0O0.getQrCodeBytes() != null) {
                    byte[] qrCodeBytes = authorizeInfoOooO0O0.getQrCodeBytes();
                    alertDialogC28626OooOoO0 = loginByThirdPartyChildFragment.f72584OooOooO;
                    if (alertDialogC28626OooOoO0 != null) {
                    }
                    AlertDialogC28626OooOoO0 alertDialogC28626OooOoO03 = new AlertDialogC28626OooOoO0(context);
                    loginByThirdPartyChildFragment.f72584OooOooO = alertDialogC28626OooOoO03;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(qrCodeBytes, "qrCodeBytes");
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(qrCodeBytes, 0, qrCodeBytes.length), o000000O.OooO0o(109), o000000O.OooO0o(109), false);
                    kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    alertDialogC28626OooOoO03.f101471OooOo0o.setImageBitmap(bitmapCreateScaledBitmap);
                    alertDialogC28626OooOoO03.show();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                authorizeInfo = oooO0O0.f101426OooOoO;
                loginByThirdPartyChildFragment2 = oooO0O0.f101427OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                authorizeInfoOooO0O0 = authorizeInfo;
                loginByThirdPartyChildFragment = loginByThirdPartyChildFragment2;
                if (authorizeInfoOooO0O0.getQrCodeBytes() != null && (context = loginByThirdPartyChildFragment.getContext()) != null) {
                    byte[] qrCodeBytes2 = authorizeInfoOooO0O0.getQrCodeBytes();
                    try {
                        alertDialogC28626OooOoO0 = loginByThirdPartyChildFragment.f72584OooOooO;
                        if (alertDialogC28626OooOoO0 != null) {
                            alertDialogC28626OooOoO0.dismiss();
                        }
                    } catch (Exception unused) {
                    }
                    AlertDialogC28626OooOoO0 alertDialogC28626OooOoO032 = new AlertDialogC28626OooOoO0(context);
                    loginByThirdPartyChildFragment.f72584OooOooO = alertDialogC28626OooOoO032;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(qrCodeBytes2, "qrCodeBytes");
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(qrCodeBytes2, 0, qrCodeBytes2.length), o000000O.OooO0o(109), o000000O.OooO0o(109), false);
                    kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
                    alertDialogC28626OooOoO032.f101471OooOo0o.setImageBitmap(bitmapCreateScaledBitmap2);
                    alertDialogC28626OooOoO032.show();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            AuthorizeInfo authorizeInfo2 = oooO0O0.f101426OooOoO;
            loginByThirdPartyChildFragment = oooO0O0.f101427OooOoO0;
            C27174OooO0O0<AuthorizeInfo> c27174OooO0O02 = oooO0O0.f101424OooOo;
            oooO00o = oooO0O0.f101425OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            authorizeInfoOooO0O0 = authorizeInfo2;
            c27174OooO0O0 = c27174OooO0O02;
            objOooO0oO = obj;
            C27174OooO0O0 c27174OooO0O03 = (C27174OooO0O0) objOooO0oO;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O03.getErrorCode(), "10002") && (loginInfo = (LoginInfo) c27174OooO0O03.OooO0O0()) != null) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                C19919OooO00o c19919OooO00o = new C19919OooO00o(loginByThirdPartyChildFragment, loginInfo, null);
                oooO0O0.f101425OooOo0o = oooO00o;
                oooO0O0.f101424OooOo = c27174OooO0O0;
                oooO0O0.f101427OooOoO0 = loginByThirdPartyChildFragment;
                oooO0O0.f101426OooOoO = authorizeInfoOooO0O0;
                oooO0O0.f101429OooOoo = 2;
                if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, c19919OooO00o, oooO0O0) != enumC32485OooO00o) {
                    authorizeInfo = authorizeInfoOooO0O0;
                    loginByThirdPartyChildFragment2 = loginByThirdPartyChildFragment;
                    authorizeInfoOooO0O0 = authorizeInfo;
                    loginByThirdPartyChildFragment = loginByThirdPartyChildFragment2;
                }
                return enumC32485OooO00o;
            }
            if (authorizeInfoOooO0O0.getQrCodeBytes() != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28614OooOOO(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C28614OooOOO> continuation) {
        super(2, continuation);
        this.f101419OooOo = loginByThirdPartyChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28614OooOOO(this.f101419OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28614OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (((oO0o0Oo.InterfaceC33721OooO0o) r8).collect(r1, r7) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101420OooOo0o;
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101419OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
            this.f101420OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28473OooOO0(c28477OooOOO0OooOoOO, 1, null, null), this);
            if (obj != enumC32485OooO00o) {
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
        OooO00o oooO00o = new OooO00o(loginByThirdPartyChildFragment);
        this.f101420OooOo0o = 2;
    }
}
