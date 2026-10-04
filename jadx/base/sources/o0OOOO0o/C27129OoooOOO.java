package o0OOOO0o;

import Oooo0o0.C21009OooOooO;
import android.graphics.Bitmap;
import com.orion.notein.App;
import com.orion.notein.data.service.dto.UserApiResultDto;
import com.orion.notein.domain.models.User;
import com.orion.notein.domain.models.UserConstants;
import com.orion.notein.domain.models.login.LoginInfo;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00Ooo.C25086OooOo0O;
import o00o00O0.C25252OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oo0oO0.o0O0O0Oo;

/* JADX INFO: renamed from: o0OOOO0o.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27129OoooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f94595OooO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94596OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94597OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25086OooOo0O f94598OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27119Oooo0OO f94599OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f94600OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27099OooO0oo f94601OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOOO f94602OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O0 f94603OooO0oo;

    /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f94604OooOo0o;

        /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19849OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f94605OooOo0o;

            /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$getUid$$inlined$map$1$2", m80623f = "UserRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19850OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f94606OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f94607OooOo0o;

                public C19850OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f94607OooOo0o = obj;
                    this.f94606OooOo |= Integer.MIN_VALUE;
                    return C19849OooO00o.this.emit(null, this);
                }
            }

            public C19849OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f94605OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19850OooO00o c19850OooO00o;
                if (continuation instanceof C19850OooO00o) {
                    c19850OooO00o = (C19850OooO00o) continuation;
                    int i = c19850OooO00o.f94606OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19850OooO00o.f94606OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19850OooO00o = new C19850OooO00o(continuation);
                    }
                }
                Object obj2 = c19850OooO00o.f94607OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19850OooO00o.f94606OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69544OooOooO);
                    if (str == null) {
                        str = "";
                    }
                    c19850OooO00o.f94606OooOo = 1;
                    if (this.f94605OooOo0o.emit(str, c19850OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f94604OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f94604OooOo0o.collect(new C19849OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f94609OooOo0o;

        /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f94610OooOo0o;

            /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$getUidSync$$inlined$map$1$2", m80623f = "UserRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19851OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f94611OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f94612OooOo0o;

                public C19851OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f94612OooOo0o = obj;
                    this.f94611OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f94610OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19851OooO00o c19851OooO00o;
                if (continuation instanceof C19851OooO00o) {
                    c19851OooO00o = (C19851OooO00o) continuation;
                    int i = c19851OooO00o.f94611OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19851OooO00o.f94611OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19851OooO00o = new C19851OooO00o(continuation);
                    }
                }
                Object obj2 = c19851OooO00o.f94612OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19851OooO00o.f94611OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69544OooOooO);
                    if (str == null) {
                        str = "";
                    }
                    c19851OooO00o.f94611OooOo = 1;
                    if (this.f94610OooOo0o.emit(str, c19851OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f94609OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f94609OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OOOO0o.OoooOOO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$getUidSync$1", m80623f = "UserRepoImpl.kt", m80624l = {303}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f94614OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f94615OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0, Continuation continuation) {
            super(2, continuation);
            this.f94614OooOo = oooO0O0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f94614OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f94615OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f94615OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(this.f94614OooOo, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    static {
        C24340OooO0oo.OooO00o("has_import_2024_preset_pdf");
    }

    public C27129OoooOOO(o0000o0O.OooOO0<AbstractC24338OooO0o0> ds, o0000o0O.OooOO0<AbstractC24338OooO0o0> ignoreLoginStatusDataStore, C25086OooOo0O c25086OooOo0O, C27119Oooo0OO c27119Oooo0OO, C27099OooO0oo c27099OooO0oo, o0O0O00 wxAuthorizeService, OooOOOO oooOOOO, o00000O0 o00000o02) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(ignoreLoginStatusDataStore, "ignoreLoginStatusDataStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(wxAuthorizeService, "wxAuthorizeService");
        this.f94596OooO00o = ds;
        this.f94597OooO0O0 = ignoreLoginStatusDataStore;
        this.f94598OooO0OO = c25086OooOo0O;
        this.f94599OooO0Oo = c27119Oooo0OO;
        this.f94601OooO0o0 = c27099OooO0oo;
        this.f94600OooO0o = wxAuthorizeService;
        this.f94602OooO0oO = oooOOOO;
        this.f94603OooO0oo = o00000o02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(User user, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27137OooooOO c27137OooooOO;
        C27129OoooOOO c27129OoooOOO;
        if (abstractC32479OooO0OO instanceof C27137OooooOO) {
            c27137OooooOO = (C27137OooooOO) abstractC32479OooO0OO;
            int i = c27137OooooOO.f94666OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27137OooooOO.f94666OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27137OooooOO = new C27137OooooOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27137OooooOO.f94663OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27137OooooOO.f94666OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27137OooooOO.f94662OooOo0o = this;
            c27137OooooOO.f94661OooOo = user;
            c27137OooooOO.f94664OooOoO0 = str;
            c27137OooooOO.f94666OooOoo0 = 1;
            if (this.f94598OooO0OO.OooO0O0(user, c27137OooooOO) != enumC32485OooO00o) {
                c27129OoooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27137OooooOO.f94664OooOoO0;
        user = c27137OooooOO.f94661OooOo;
        c27129OoooOOO = c27137OooooOO.f94662OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c27129OoooOOO.f94596OooO00o;
        C27138OooooOo c27138OooooOo = new C27138OooooOo(str, user, null);
        c27137OooooOO.f94662OooOo0o = null;
        c27137OooooOO.f94661OooOo = null;
        c27137OooooOO.f94664OooOoO0 = null;
        c27137OooooOO.f94666OooOoo0 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(int i, String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27124OoooO c27124OoooO;
        C27129OoooOOO c27129OoooOOO;
        C27174OooO0O0 c27174OooO0O0;
        if (abstractC32479OooO0OO instanceof C27124OoooO) {
            c27124OoooO = (C27124OoooO) abstractC32479OooO0OO;
            int i2 = c27124OoooO.f94577OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27124OoooO.f94577OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c27124OoooO = new C27124OoooO(this, abstractC32479OooO0OO);
            }
        }
        C27124OoooO c27124OoooO2 = c27124OoooO;
        Object objOooO0O0 = c27124OoooO2.f94575OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27124OoooO2.f94577OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "bindPhoneNumber: loginType=", ", region=", str, ", phone=");
            OooOO0.OooO0OO.OooO0o0(sbOooO0OO, str2, ", code=", str3, ", accessToken=");
            c20358OooO00o.OooO00o(com.aspose.slides.OooOOO.OooO0O0(sbOooO0OO, str4, ", openID=", str5), new Object[0]);
            if (i == 0) {
                c27124OoooO2.f94576OooOo0o = this;
                c27124OoooO2.f94577OooOoO = 1;
                objOooO0O0 = this.f94601OooO0o0.OooO0O0(str, str2, str3, str4, str5, c27124OoooO2);
                if (objOooO0O0 != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
                }
            } else if (i == 1) {
                c27124OoooO2.f94576OooOo0o = this;
                c27124OoooO2.f94577OooOoO = 2;
                objOooO0O0 = this.f94600OooO0o.OooO0OO(str, str2, str3, str4, str5, c27124OoooO2);
                if (objOooO0O0 != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
                }
            } else if (i == 2) {
                c27124OoooO2.f94576OooOo0o = this;
                c27124OoooO2.f94577OooOoO = 3;
                objOooO0O0 = this.f94602OooO0oO.OooO0O0(str, str2, str3, str4, str5, c27124OoooO2);
                if (objOooO0O0 != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
                }
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("invalid login type");
                }
                c27124OoooO2.f94576OooOo0o = this;
                c27124OoooO2.f94577OooOoO = 4;
                objOooO0O0 = this.f94603OooO0oo.OooO0O0(str, str2, str3, str4, str5, c27124OoooO2);
                if (objOooO0O0 != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
                }
            }
            return enumC32485OooO00o;
        }
        if (i3 == 1) {
            c27129OoooOOO = (C27129OoooOOO) c27124OoooO2.f94576OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
        } else if (i3 == 2) {
            c27129OoooOOO = (C27129OoooOOO) c27124OoooO2.f94576OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
        } else if (i3 == 3) {
            c27129OoooOOO = (C27129OoooOOO) c27124OoooO2.f94576OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
        } else {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) c27124OoooO2.f94576OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return c27174OooO0O02;
            }
            c27129OoooOOO = (C27129OoooOOO) c27124OoooO2.f94576OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
        }
        if (c27174OooO0O0.f94862OooO00o) {
            LoginInfo loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
            if ((loginInfo != null ? loginInfo.getUser() : null) != null && ((LoginInfo) c27174OooO0O0.OooO0O0()).getToken() != null) {
                User user = ((LoginInfo) c27174OooO0O0.OooO0O0()).getUser();
                String token = ((LoginInfo) c27174OooO0O0.OooO0O0()).getToken();
                c27124OoooO2.f94576OooOo0o = c27174OooO0O0;
                c27124OoooO2.f94577OooOoO = 5;
                if (c27129OoooOOO.OooO(user, token, c27124OoooO2) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        }
        return c27174OooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27128OoooOO0 c27128OoooOO0;
        C27129OoooOOO c27129OoooOOO;
        if (abstractC32479OooO0OO instanceof C27128OoooOO0) {
            c27128OoooOO0 = (C27128OoooOO0) abstractC32479OooO0OO;
            int i = c27128OoooOO0.f94593OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27128OoooOO0.f94593OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27128OoooOO0 = new C27128OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27128OoooOO0.f94591OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27128OoooOO0.f94593OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            c27128OoooOO0.f94592OooOo0o = this;
            c27128OoooOO0.f94593OooOoO = 1;
            objOooO0o0 = C33633Oooo0.OooO0o0(interfaceC32508OooOOOo, c27128OoooOO0);
            if (objOooO0o0 != enumC32485OooO00o) {
                c27129OoooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserApiResultDto userApiResultDto = (UserApiResultDto) c27128OoooOO0.f94592OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            return userApiResultDto;
        }
        c27129OoooOOO = (C27129OoooOOO) c27128OoooOO0.f94592OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o0);
        UserApiResultDto userApiResultDto2 = (UserApiResultDto) objOooO0o0;
        if (Integer.parseInt(userApiResultDto2.getErrorCode()) == 4006) {
            String id = userApiResultDto2.getUser().getId();
            c27128OoooOO0.f94592OooOo0o = userApiResultDto2;
            c27128OoooOO0.f94593OooOoO = 2;
            if (c27129OoooOOO.OooO0oo(id, c27128OoooOO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return userApiResultDto2;
    }

    public final InterfaceC33721OooO0o<String> OooO0OO() {
        return C25252OooO0Oo.OooOO0o(new OooO00o(this.f94596OooO00o.getData()));
    }

    public final String OooO0Oo() {
        return (String) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooO0OO(new OooO0O0(this.f94596OooO00o.getData()), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27131OoooOo0 c27131OoooOo0;
        C27129OoooOOO c27129OoooOOO;
        C27174OooO0O0 c27174OooO0O0;
        if (abstractC32479OooO0OO instanceof C27131OoooOo0) {
            c27131OoooOo0 = (C27131OoooOo0) abstractC32479OooO0OO;
            int i2 = c27131OoooOo0.f94626OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27131OoooOo0.f94626OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c27131OoooOo0 = new C27131OoooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27131OoooOo0.f94624OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27131OoooOo0.f94626OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            if (i == 0) {
                c27131OoooOo0.f94625OooOo0o = this;
                c27131OoooOo0.f94626OooOoO = 1;
                objOooO0OO = this.f94601OooO0o0.OooO0OO(str, c27131OoooOo0);
                if (objOooO0OO != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
                }
            } else if (i == 1) {
                c27131OoooOo0.f94625OooOo0o = this;
                c27131OoooOo0.f94626OooOoO = 2;
                objOooO0OO = this.f94600OooO0o.OooO0o(str, c27131OoooOo0);
                if (objOooO0OO != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
                }
            } else if (i == 2) {
                c27131OoooOo0.f94625OooOo0o = this;
                c27131OoooOo0.f94626OooOoO = 3;
                objOooO0OO = this.f94602OooO0oO.OooO0OO(str, c27131OoooOo0);
                if (objOooO0OO != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
                }
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("invalid login type");
                }
                c27131OoooOo0.f94625OooOo0o = this;
                c27131OoooOo0.f94626OooOoO = 4;
                objOooO0OO = this.f94603OooO0oo.OooO0OO(str, c27131OoooOo0);
                if (objOooO0OO != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
                }
            }
            return enumC32485OooO00o;
        }
        if (i3 == 1) {
            c27129OoooOOO = (C27129OoooOOO) c27131OoooOo0.f94625OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
        } else if (i3 == 2) {
            c27129OoooOOO = (C27129OoooOOO) c27131OoooOo0.f94625OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
        } else if (i3 == 3) {
            c27129OoooOOO = (C27129OoooOOO) c27131OoooOo0.f94625OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
        } else {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) c27131OoooOo0.f94625OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
                return c27174OooO0O02;
            }
            c27129OoooOOO = (C27129OoooOOO) c27131OoooOo0.f94625OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0OO;
        }
        C34406OooO00o.f123390OooO00o.OooO00o("login result: " + c27174OooO0O0, new Object[0]);
        LoginInfo loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
        User user = loginInfo != null ? loginInfo.getUser() : null;
        LoginInfo loginInfo2 = (LoginInfo) c27174OooO0O0.OooO0O0();
        String token = loginInfo2 != null ? loginInfo2.getToken() : null;
        if (user != null && token != null) {
            c27131OoooOo0.f94625OooOo0o = c27174OooO0O0;
            c27131OoooOo0.f94626OooOoO = 5;
            if (c27129OoooOOO.OooO(user, token, c27131OoooOo0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return c27174OooO0O0;
    }

    public final C27113OooOooO OooO0o0(String str) {
        C25086OooOo0O c25086OooOo0O = this.f94598OooO0OO;
        return new C27113OooOooO(((o0O0O0Oo) c25086OooOo0O.f85155OooO00o).OooO0O0(str), c25086OooOo0O);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27132OoooOoO c27132OoooOoO;
        C27129OoooOOO c27129OoooOOO;
        String token;
        if (abstractC32479OooO0OO instanceof C27132OoooOoO) {
            c27132OoooOoO = (C27132OoooOoO) abstractC32479OooO0OO;
            int i = c27132OoooOoO.f94630OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27132OoooOoO.f94630OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27132OoooOoO = new C27132OoooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27132OoooOoO.f94628OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27132OoooOoO.f94630OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27132OoooOoO.f94629OooOo0o = this;
            c27132OoooOoO.f94630OooOoO = 1;
            objOooO0Oo = this.f94599OooO0Oo.OooO0Oo(str, str2, str3, c27132OoooOoO);
            if (objOooO0Oo != enumC32485OooO00o) {
                c27129OoooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = c27132OoooOoO.f94629OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            return obj;
        }
        c27129OoooOOO = (C27129OoooOOO) c27132OoooOoO.f94629OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
        if (c27174OooO0O0.f94862OooO00o) {
            LoginInfo loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
            if ((loginInfo != null ? loginInfo.getUser() : null) != null && (token = ((LoginInfo) c27174OooO0O0.OooO0O0()).getToken()) != null && token.length() != 0) {
                User user = ((LoginInfo) c27174OooO0O0.OooO0O0()).getUser();
                String token2 = ((LoginInfo) c27174OooO0O0.OooO0O0()).getToken();
                c27132OoooOoO.f94629OooOo0o = objOooO0Oo;
                c27132OoooOoO.f94630OooOoO = 2;
                if (c27129OoooOOO.OooO(user, token2, c27132OoooOoO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        }
        return objOooO0Oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27135Ooooo0o c27135Ooooo0o;
        C27129OoooOOO c27129OoooOOO;
        if (abstractC32479OooO0OO instanceof C27135Ooooo0o) {
            c27135Ooooo0o = (C27135Ooooo0o) abstractC32479OooO0OO;
            int i = c27135Ooooo0o.f94659OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27135Ooooo0o.f94659OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27135Ooooo0o = new C27135Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27135Ooooo0o.f94658OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27135Ooooo0o.f94659OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27136OooooO0 c27136OooooO0 = new C27136OooooO0(2, null);
            c27135Ooooo0o.f94656OooOo0o = this;
            c27135Ooooo0o.f94655OooOo = str;
            c27135Ooooo0o.f94659OooOoOO = 1;
            if (C24332OooO.OooO00o(this.f94596OooO00o, c27136OooooO0, c27135Ooooo0o) != enumC32485OooO00o) {
                c27129OoooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return new Integer(0);
        }
        str = c27135Ooooo0o.f94655OooOo;
        c27129OoooOOO = c27135Ooooo0o.f94656OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C25086OooOo0O c25086OooOo0O = c27129OoooOOO.f94598OooO0OO;
        c27135Ooooo0o.f94656OooOo0o = null;
        c27135Ooooo0o.f94655OooOo = null;
        c27135Ooooo0o.f94659OooOoOO = 2;
        ((o0O0O0Oo) c25086OooOo0O.f85155OooO00o).OooO00o(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27140Oooooo0 c27140Oooooo0;
        String errorCode;
        if (abstractC32479OooO0OO instanceof C27140Oooooo0) {
            c27140Oooooo0 = (C27140Oooooo0) abstractC32479OooO0OO;
            int i = c27140Oooooo0.f94673OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27140Oooooo0.f94673OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27140Oooooo0 = new C27140Oooooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c27140Oooooo0.f94672OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27140Oooooo0.f94673OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            c27140Oooooo0.f94673OooOoO0 = 1;
            objOooO = this.f94599OooO0Oo.OooO(str, str2, c27140Oooooo0);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO);
        }
        UserApiResultDto userApiResultDto = (UserApiResultDto) objOooO;
        return Boolean.valueOf((userApiResultDto == null || (errorCode = userApiResultDto.getErrorCode()) == null || Integer.parseInt(errorCode) != 0) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27141OoooooO c27141OoooooO;
        C27129OoooOOO c27129OoooOOO;
        User user;
        Object obj;
        if (abstractC32479OooO0OO instanceof C27141OoooooO) {
            c27141OoooooO = (C27141OoooooO) abstractC32479OooO0OO;
            int i = c27141OoooooO.f94676OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27141OoooooO.f94676OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27141OoooooO = new C27141OoooooO(this, abstractC32479OooO0OO);
            }
        }
        C27141OoooooO c27141OoooooO2 = c27141OoooooO;
        Object objOooOO0 = c27141OoooooO2.f94674OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27141OoooooO2.f94676OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0);
            c27141OoooooO2.f94675OooOo0o = this;
            c27141OoooooO2.f94676OooOoO = 1;
            objOooOO0 = this.f94599OooO0Oo.OooOO0(str, str2, str3, str4, str5, c27141OoooooO2);
            if (objOooOO0 != enumC32485OooO00o) {
                c27129OoooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c27141OoooooO2.f94675OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0);
            objOooOO0 = obj;
            return Boolean.valueOf(((C27174OooO0O0) objOooOO0).f94862OooO00o);
        }
        c27129OoooOOO = (C27129OoooOOO) c27141OoooooO2.f94675OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0);
        LoginInfo loginInfo = (LoginInfo) ((C27174OooO0O0) objOooOO0).OooO0O0();
        if (loginInfo != null && (user = loginInfo.getUser()) != null) {
            C25086OooOo0O c25086OooOo0O = c27129OoooOOO.f94598OooO0OO;
            c27141OoooooO2.f94675OooOo0o = objOooOO0;
            c27141OoooooO2.f94676OooOoO = 2;
            if (c25086OooOo0O.OooO0O0(user, c27141OoooooO2) != enumC32485OooO00o) {
                obj = objOooOO0;
                objOooOO0 = obj;
            }
            return enumC32485OooO00o;
        }
        return Boolean.valueOf(((C27174OooO0O0) objOooOO0).f94862OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(Bitmap bitmap, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27142Ooooooo c27142Ooooooo;
        int i;
        C27129OoooOOO c27129OoooOOO;
        int i2;
        if (abstractC32479OooO0OO instanceof C27142Ooooooo) {
            c27142Ooooooo = (C27142Ooooooo) abstractC32479OooO0OO;
            int i3 = c27142Ooooooo.f94682OooOoOO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27142Ooooooo.f94682OooOoOO = i3 - Integer.MIN_VALUE;
            } else {
                c27142Ooooooo = new C27142Ooooooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27142Ooooooo.f94681OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27142Ooooooo.f94682OooOoOO;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("UserRepoImpl");
            c20358OooO00o.OooO0Oo(e, "updatePhone error", new Object[0]);
            i = UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL;
        }
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            o0OoOo0 o0oooo02 = new o0OoOo0(this, bitmap, null);
            c27142Ooooooo.f94679OooOo0o = this;
            c27142Ooooooo.f94682OooOoOO = 1;
            objOooO0O0 = OooO0O0(o0oooo02, c27142Ooooooo);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27129OoooOOO = this;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c27142Ooooooo.f94678OooOo;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                i = i2;
                return new Integer(i);
            }
            c27129OoooOOO = c27142Ooooooo.f94679OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        UserApiResultDto userApiResultDto = (UserApiResultDto) objOooO0O0;
        i = Integer.parseInt(userApiResultDto.getErrorCode());
        if (i == 0) {
            C25086OooOo0O c25086OooOo0O = c27129OoooOOO.f94598OooO0OO;
            User user = userApiResultDto.getUser();
            c27142Ooooooo.f94679OooOo0o = null;
            c27142Ooooooo.f94678OooOo = i;
            c27142Ooooooo.f94682OooOoOO = 2;
            if (c25086OooOo0O.OooO0O0(user, c27142Ooooooo) != enumC32485OooO00o) {
                i2 = i;
                i = i2;
            }
            return enumC32485OooO00o;
        }
        return new Integer(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
    
        if (r10.OooO(r11, r12, r0) == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(int i, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27149ooOO c27149ooOO;
        C27129OoooOOO c27129OoooOOO;
        C27174OooO0O0 c27174OooO0O0;
        C27174OooO0O0 c27174OooO0O02;
        if (abstractC32479OooO0OO instanceof C27149ooOO) {
            c27149ooOO = (C27149ooOO) abstractC32479OooO0OO;
            int i2 = c27149ooOO.f94776OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27149ooOO.f94776OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c27149ooOO = new C27149ooOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27149ooOO.f94774OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27149ooOO.f94776OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            if (i == 0) {
                c27149ooOO.f94775OooOo0o = this;
                c27149ooOO.f94776OooOoO = 1;
                objOooO0Oo = this.f94601OooO0o0.OooO0Oo(str, str2, c27149ooOO);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
                }
            } else if (i == 1) {
                c27149ooOO.f94775OooOo0o = this;
                c27149ooOO.f94776OooOoO = 2;
                objOooO0Oo = this.f94600OooO0o.OooO0oO(str, str2, c27149ooOO);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
                }
            } else if (i == 2) {
                c27149ooOO.f94775OooOo0o = this;
                c27149ooOO.f94776OooOoO = 3;
                objOooO0Oo = this.f94602OooO0oO.OooO0Oo(str, str2, c27149ooOO);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
                }
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("invalid login type");
                }
                c27149ooOO.f94775OooOo0o = this;
                c27149ooOO.f94776OooOoO = 4;
                objOooO0Oo = this.f94603OooO0oo.OooO0Oo(str, str2, c27149ooOO);
                if (objOooO0Oo != enumC32485OooO00o) {
                    c27129OoooOOO = this;
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
                }
            }
            return enumC32485OooO00o;
        }
        if (i3 == 1) {
            c27129OoooOOO = (C27129OoooOOO) c27149ooOO.f94775OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
        } else if (i3 == 2) {
            c27129OoooOOO = (C27129OoooOOO) c27149ooOO.f94775OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
        } else if (i3 == 3) {
            c27129OoooOOO = (C27129OoooOOO) c27149ooOO.f94775OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
        } else {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27174OooO0O02 = (C27174OooO0O0) c27149ooOO.f94775OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                return Boolean.valueOf(c27174OooO0O02.f94862OooO00o);
            }
            c27129OoooOOO = (C27129OoooOOO) c27149ooOO.f94775OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0Oo;
        }
        C27129OoooOOO c27129OoooOOO2 = c27129OoooOOO;
        c27174OooO0O02 = c27174OooO0O0;
        C34406OooO00o.f123390OooO00o.OooO00o("skipBindPhoneNumber, result: " + c27174OooO0O02, new Object[0]);
        if (c27174OooO0O02.f94862OooO00o) {
            LoginInfo loginInfo = (LoginInfo) c27174OooO0O02.OooO0O0();
            if ((loginInfo != null ? loginInfo.getUser() : null) != null && ((LoginInfo) c27174OooO0O02.OooO0O0()).getToken() != null) {
                User user = ((LoginInfo) c27174OooO0O02.OooO0O0()).getUser();
                String token = ((LoginInfo) c27174OooO0O02.OooO0O0()).getToken();
                c27149ooOO.f94775OooOo0o = c27174OooO0O02;
                c27149ooOO.f94776OooOoO = 5;
            }
        }
        return Boolean.valueOf(c27174OooO0O02.f94862OooO00o);
    }
}
