package o0OOOO0o;

import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import com.orion.notein.data.service.user.NoteinFirebaseUserApiService;
import com.orion.notein.domain.mapper.NoteinFirebaseUserMapper;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0O0oooO.C26326o0000oO;
import o0OOOO.C27078OooO0o0;
import o0OOOO.C27079OooO0oO;
import o0OOOO.C27081OooOO0o;
import o0OOOO.C27082OooOOOo;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27315OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOOO0o.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27111OooOoo implements InterfaceC27315OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27081OooOO0o f94515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27082OooOOOo f94516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final NoteinFirebaseUserMapper f94518OooO0Oo;

    public C27111OooOoo(C27081OooOO0o c27081OooOO0o, C27082OooOOOo c27082OooOOOo, o0000o0O.OooOO0<AbstractC24338OooO0o0> ds, NoteinFirebaseUserMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f94515OooO00o = c27081OooOO0o;
        this.f94516OooO0O0 = c27082OooOOOo;
        this.f94517OooO0OO = ds;
        this.f94518OooO0Oo = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, String str2, String str3, String str4, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27110OooOoOO c27110OooOoOO;
        String str5;
        String str6;
        C27111OooOoo c27111OooOoo;
        C27111OooOoo c27111OooOoo2;
        NoteinFirebaseUser noteinFirebaseUser;
        String str7;
        String str8;
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02;
        C27112OooOoo0 c27112OooOoo0;
        NoteinFirebaseUser noteinFirebaseUser2;
        if (abstractC32479OooO0OO instanceof C27110OooOoOO) {
            c27110OooOoOO = (C27110OooOoOO) abstractC32479OooO0OO;
            int i = c27110OooOoOO.f94513OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27110OooOoOO.f94513OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27110OooOoOO = new C27110OooOoOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27110OooOoOO.f94512OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27110OooOoOO.f94513OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27110OooOoOO.f94509OooOo0o = this;
            c27110OooOoOO.f94508OooOo = str2;
            c27110OooOoOO.f94511OooOoO0 = str4;
            c27110OooOoOO.f94513OooOoo = 1;
            C27082OooOOOo c27082OooOOOo = this.f94516OooO0O0;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOOO.OooOOOO(str, str2, str3, str4, c27082OooOOOo, null), c27110OooOoOO);
            if (objOooO0o != enumC32485OooO00o) {
                str5 = str2;
                str6 = str4;
                c27111OooOoo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                NoteinFirebaseUser noteinFirebaseUser3 = (NoteinFirebaseUser) c27110OooOoOO.f94509OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                noteinFirebaseUser2 = noteinFirebaseUser3;
                return new C27174OooO0O0(true, noteinFirebaseUser2, "0", null, 8);
            }
            noteinFirebaseUser = c27110OooOoOO.f94510OooOoO;
            str8 = c27110OooOoOO.f94511OooOoO0;
            str7 = c27110OooOoOO.f94508OooOo;
            c27111OooOoo2 = (C27111OooOoo) c27110OooOoOO.f94509OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            oooOO02 = c27111OooOoo2.f94517OooO0OO;
            c27112OooOoo0 = new C27112OooOoo0(str8, str7, null);
            c27110OooOoOO.f94509OooOo0o = noteinFirebaseUser;
            c27110OooOoOO.f94508OooOo = null;
            c27110OooOoOO.f94511OooOoO0 = null;
            c27110OooOoOO.f94510OooOoO = null;
            c27110OooOoOO.f94513OooOoo = 3;
            if (C24332OooO.OooO00o(oooOO02, c27112OooOoo0, c27110OooOoOO) != enumC32485OooO00o) {
                noteinFirebaseUser2 = noteinFirebaseUser;
                return new C27174OooO0O0(true, noteinFirebaseUser2, "0", null, 8);
            }
            return enumC32485OooO00o;
        }
        String str9 = c27110OooOoOO.f94511OooOoO0;
        String str10 = c27110OooOoOO.f94508OooOo;
        C27111OooOoo c27111OooOoo3 = (C27111OooOoo) c27110OooOoOO.f94509OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        str6 = str9;
        str5 = str10;
        c27111OooOoo = c27111OooOoo3;
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
            return new C27174OooO0O0(false, null, c27174OooO0O0.getErrorCode(), null, 10);
        }
        if (c27174OooO0O0.OooO0O0() == null) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
        NoteinFirebaseUserApiService.OooO0O0 oooO0O0 = (NoteinFirebaseUserApiService.OooO0O0) c27174OooO0O0.OooO0O0();
        String userId = oooO0O0.getCom.hihonor.honorid.core.data.TmemberRight.TAG_USERID java.lang.String();
        String accessToken = oooO0O0.getCom.huawei.hms.support.feature.result.CommonConstant.KEY_ACCESS_TOKEN java.lang.String();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FirebaseUserRepoImpl");
        c20358OooO00o.OooO00o("loginResponse: " + oooO0O0, new Object[0]);
        if (accessToken.length() <= 0) {
            c20358OooO00o.OooOOO0("FirebaseUserRepoImpl");
            c20358OooO00o.OooO0OO("Login's authorization doesn't exist.", new Object[0]);
            return new C27174OooO0O0(false, null, "100001", null, 10);
        }
        NoteinFirebaseUser noteinFirebaseUser4 = new NoteinFirebaseUser(userId, str5, str6, oooO0O0.getCreatedAt());
        C27081OooOO0o c27081OooOO0o = c27111OooOoo.f94515OooO00o;
        NoteinFirebaseUserEntity entity = c27111OooOoo.f94518OooO0Oo.toEntity(noteinFirebaseUser4);
        kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
        c27110OooOoOO.f94509OooOo0o = c27111OooOoo;
        c27110OooOoOO.f94508OooOo = userId;
        c27110OooOoOO.f94511OooOoO0 = accessToken;
        c27110OooOoOO.f94510OooOoO = noteinFirebaseUser4;
        c27110OooOoOO.f94513OooOoo = 2;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOOO.OooO0OO(c27081OooOO0o, entity, null), c27110OooOoOO);
        if (objOooO0o2 != enumC32485OooO00o) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o2 != enumC32485OooO00o) {
            c27111OooOoo2 = c27111OooOoo;
            noteinFirebaseUser = noteinFirebaseUser4;
            str7 = userId;
            str8 = accessToken;
            oooOO02 = c27111OooOoo2.f94517OooO0OO;
            c27112OooOoo0 = new C27112OooOoo0(str8, str7, null);
            c27110OooOoOO.f94509OooOo0o = noteinFirebaseUser;
            c27110OooOoOO.f94508OooOo = null;
            c27110OooOoOO.f94511OooOoO0 = null;
            c27110OooOoOO.f94510OooOoO = null;
            c27110OooOoOO.f94513OooOoo = 3;
            if (C24332OooO.OooO00o(oooOO02, c27112OooOoo0, c27110OooOoOO) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    public final Object OooO0O0(C26326o0000oO c26326o0000oO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27107OooOo0o(this, null), c26326o0000oO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27105OooOo0 c27105OooOo0;
        C27111OooOoo c27111OooOoo;
        if (abstractC32479OooO0OO instanceof C27105OooOo0) {
            c27105OooOo0 = (C27105OooOo0) abstractC32479OooO0OO;
            int i = c27105OooOo0.f94486OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27105OooOo0.f94486OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27105OooOo0 = new C27105OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27105OooOo0.f94484OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27105OooOo0.f94486OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27105OooOo0.f94485OooOo0o = this;
            c27105OooOo0.f94486OooOoO = 1;
            C27081OooOO0o c27081OooOO0o = this.f94515OooO00o;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOOO.OooO0o(null, c27081OooOO0o), c27105OooOo0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27111OooOoo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27111OooOoo = c27105OooOo0.f94485OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        NoteinFirebaseUserEntity noteinFirebaseUserEntity = (NoteinFirebaseUserEntity) objOooO0o;
        if (noteinFirebaseUserEntity != null) {
            return c27111OooOoo.f94518OooO0Oo.toModel(noteinFirebaseUserEntity);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo oooOo;
        C27111OooOoo c27111OooOoo;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i = oooOo.f94482OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f94482OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOo.f94480OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo.f94482OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            oooOo.f94481OooOo0o = this;
            oooOo.f94482OooOoO = 1;
            C27081OooOO0o c27081OooOO0o = this.f94515OooO00o;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27079OooO0oO(c27081OooOO0o, str, null), oooOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27111OooOoo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27111OooOoo = oooOo.f94481OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        NoteinFirebaseUserEntity noteinFirebaseUserEntity = (NoteinFirebaseUserEntity) objOooO0o;
        if (noteinFirebaseUserEntity != null) {
            return c27111OooOoo.f94518OooO0Oo.toModel(noteinFirebaseUserEntity);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27101OooOOOo c27101OooOOOo;
        C27111OooOoo c27111OooOoo;
        if (abstractC32479OooO0OO instanceof C27101OooOOOo) {
            c27101OooOOOo = (C27101OooOOOo) abstractC32479OooO0OO;
            int i = c27101OooOOOo.f94464OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27101OooOOOo.f94464OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27101OooOOOo = new C27101OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27101OooOOOo.f94463OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27101OooOOOo.f94464OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "FirebaseUserRepoImpl", "deleteAccount: ", str), new Object[0]);
            c27101OooOOOo.f94461OooOo0o = this;
            c27101OooOOOo.f94460OooOo = str;
            c27101OooOOOo.f94464OooOoOO = 1;
            objOooO00o = this.f94516OooO0O0.OooO00o(c27101OooOOOo);
            if (objOooO00o != enumC32485OooO00o) {
                c27111OooOoo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return (C27174OooO0O0) objOooO00o;
        }
        str = c27101OooOOOo.f94460OooOo;
        c27111OooOoo = c27101OooOOOo.f94461OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO00o;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
            return new C27174OooO0O0(false, null, c27174OooO0O0.getErrorCode(), null, 10);
        }
        c27101OooOOOo.f94461OooOo0o = null;
        c27101OooOOOo.f94460OooOo = null;
        c27101OooOOOo.f94464OooOoOO = 2;
        objOooO00o = c27111OooOoo.OooO0oO(str, c27101OooOOOo);
    }

    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    public final OooOo00 OooO0o0() {
        C27081OooOO0o c27081OooOO0o = this.f94515OooO00o;
        return new OooOo00(new C27078OooO0o0(c27081OooOO0o.f94294OooO0o, c27081OooOO0o, 0), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r10.OooO0O0(r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27109OooOoO0 c27109OooOoO0;
        C27111OooOoo c27111OooOoo;
        if (abstractC32479OooO0OO instanceof C27109OooOoO0) {
            c27109OooOoO0 = (C27109OooOoO0) abstractC32479OooO0OO;
            int i = c27109OooOoO0.f94507OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27109OooOoO0.f94507OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27109OooOoO0 = new C27109OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27109OooOoO0.f94506OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27109OooOoO0.f94507OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("logout, userId: ", str), new Object[0]);
            C27108OooOoO c27108OooOoO = new C27108OooOoO(2, null);
            c27109OooOoO0.f94504OooOo0o = this;
            c27109OooOoO0.f94503OooOo = str;
            c27109OooOoO0.f94507OooOoOO = 1;
            if (C24332OooO.OooO00o(this.f94517OooO0OO, c27108OooOoO, c27109OooOoO0) != enumC32485OooO00o) {
                c27111OooOoo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return new C27174OooO0O0(true, null, "0", null, 10);
        }
        str = c27109OooOoO0.f94503OooOo;
        c27111OooOoo = c27109OooOoO0.f94504OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27081OooOO0o c27081OooOO0o = c27111OooOoo.f94515OooO00o;
        c27109OooOoO0.f94504OooOo0o = null;
        c27109OooOoO0.f94503OooOo = null;
        c27109OooOoO0.f94507OooOoOO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:26:0x005b, B:37:0x0079, B:39:0x0097, B:41:0x009d, B:44:0x00a7, B:47:0x00af, B:50:0x00ea), top: B:74:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:26:0x005b, B:37:0x0079, B:39:0x0097, B:41:0x009d, B:44:0x00a7, B:47:0x00af, B:50:0x00ea), top: B:74:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27102OooOOo c27102OooOOo;
        String userId;
        C27111OooOoo c27111OooOoo;
        C27082OooOOOo c27082OooOOOo;
        C27111OooOoo c27111OooOoo2;
        Integer numOooOOO0;
        NoteinFirebaseUserApiService.FirebaseUserResponse firebaseUserResponse;
        Object objOooO0o;
        NoteinFirebaseUserApiService.FirebaseUserResponse firebaseUserResponse2;
        C27111OooOoo c27111OooOoo3;
        String refreshedToken;
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02;
        C27104OooOOoo c27104OooOOoo;
        String str2;
        if (abstractC32479OooO0OO instanceof C27102OooOOo) {
            c27102OooOOo = (C27102OooOOo) abstractC32479OooO0OO;
            int i = c27102OooOOo.f94470OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27102OooOOo.f94470OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27102OooOOo = new C27102OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27102OooOOo.f94467OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27102OooOOo.f94470OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            try {
                c27082OooOOOo = this.f94516OooO0O0;
                c27102OooOOo.f94466OooOo0o = this;
                userId = str;
            } catch (Exception e) {
                e = e;
                userId = str;
            }
            try {
                c27102OooOOo.f94465OooOo = userId;
                c27102OooOOo.f94470OooOoo0 = 1;
                objOooO0O0 = c27082OooOOOo.OooO0O0(c27102OooOOo);
            } catch (Exception e2) {
                e = e2;
                c27111OooOoo = this;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseUserRepoImpl");
                c20358OooO00o.OooO0Oo(e, "fetchUserByFirebaseUid error", new Object[0]);
            }
            if (objOooO0O0 != enumC32485OooO00o) {
                c27111OooOoo2 = this;
                C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0O0;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("FirebaseUserRepoImpl");
                c20358OooO00o2.OooO00o("fetchUserByFirebaseUid: " + c27174OooO0O0, new Object[0]);
                String errorCode = c27174OooO0O0.getErrorCode();
                if (errorCode == null) {
                }
                firebaseUserResponse = (NoteinFirebaseUserApiService.FirebaseUserResponse) c27174OooO0O0.OooO0O0();
                if (numOooOOO0 != null) {
                    NoteinFirebaseUser noteinFirebaseUser = new NoteinFirebaseUser(firebaseUserResponse.getId(), firebaseUserResponse.getFirebaseUserId(), firebaseUserResponse.getEmail(), firebaseUserResponse.getCreatedAt());
                    C27081OooOO0o c27081OooOO0o = c27111OooOoo2.f94515OooO00o;
                    NoteinFirebaseUserEntity entity = c27111OooOoo2.f94518OooO0Oo.toEntity(noteinFirebaseUser);
                    kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
                    c27102OooOOo.f94466OooOo0o = c27111OooOoo2;
                    c27102OooOOo.f94465OooOo = userId;
                    c27102OooOOo.f94468OooOoO0 = firebaseUserResponse;
                    c27102OooOOo.f94470OooOoo0 = 2;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOOO.OooO0OO(c27081OooOO0o, entity, null), c27102OooOOo);
                    if (objOooO0o == enumC32485OooO00o) {
                    }
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                }
                C27081OooOO0o c27081OooOO0o2 = c27111OooOoo2.f94515OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
                return new C27103OooOOo0(c27081OooOO0o2.f94290OooO00o.OooO0O0(userId), c27111OooOoo2);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            userId = c27102OooOOo.f94465OooOo;
            c27111OooOoo2 = c27102OooOOo.f94466OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) objOooO0O0;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("FirebaseUserRepoImpl");
                c20358OooO00o22.OooO00o("fetchUserByFirebaseUid: " + c27174OooO0O02, new Object[0]);
                String errorCode2 = c27174OooO0O02.getErrorCode();
                numOooOOO0 = errorCode2 == null ? C33596OooOOo0.OooOOO0(errorCode2) : null;
                firebaseUserResponse = (NoteinFirebaseUserApiService.FirebaseUserResponse) c27174OooO0O02.OooO0O0();
                if (numOooOOO0 != null && numOooOOO0.intValue() == 0 && firebaseUserResponse != null) {
                    NoteinFirebaseUser noteinFirebaseUser2 = new NoteinFirebaseUser(firebaseUserResponse.getId(), firebaseUserResponse.getFirebaseUserId(), firebaseUserResponse.getEmail(), firebaseUserResponse.getCreatedAt());
                    C27081OooOO0o c27081OooOO0o3 = c27111OooOoo2.f94515OooO00o;
                    NoteinFirebaseUserEntity entity2 = c27111OooOoo2.f94518OooO0Oo.toEntity(noteinFirebaseUser2);
                    kotlin.jvm.internal.OooOOO0.OooO0o(entity2, "toEntity(...)");
                    c27102OooOOo.f94466OooOo0o = c27111OooOoo2;
                    c27102OooOOo.f94465OooOo = userId;
                    c27102OooOOo.f94468OooOoO0 = firebaseUserResponse;
                    c27102OooOOo.f94470OooOoo0 = 2;
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOOO.OooO0OO(c27081OooOO0o3, entity2, null), c27102OooOOo);
                    if (objOooO0o == enumC32485OooO00o) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o != enumC32485OooO00o) {
                        firebaseUserResponse2 = firebaseUserResponse;
                        c27111OooOoo3 = c27111OooOoo2;
                        refreshedToken = firebaseUserResponse2.getRefreshedToken();
                        if (refreshedToken != null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("FirebaseUserRepoImpl");
                            c20358OooO00o3.OooO0o0("fetchUserByFirebaseUid: refresh token", new Object[0]);
                            oooOO02 = c27111OooOoo3.f94517OooO0OO;
                            c27104OooOOoo = new C27104OooOOoo(refreshedToken, null);
                            c27102OooOOo.f94466OooOo0o = c27111OooOoo3;
                            c27102OooOOo.f94465OooOo = userId;
                            c27102OooOOo.f94468OooOoO0 = null;
                            c27102OooOOo.f94470OooOoo0 = 3;
                            if (C24332OooO.OooO00o(oooOO02, c27104OooOOoo, c27102OooOOo) != enumC32485OooO00o) {
                            }
                        }
                        c27111OooOoo2 = c27111OooOoo3;
                    }
                    return enumC32485OooO00o;
                }
            } catch (Exception e3) {
                e = e3;
                c27111OooOoo = c27111OooOoo2;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("FirebaseUserRepoImpl");
                c20358OooO00o4.OooO0Oo(e, "fetchUserByFirebaseUid error", new Object[0]);
            }
            C27081OooOO0o c27081OooOO0o22 = c27111OooOoo2.f94515OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
            return new C27103OooOOo0(c27081OooOO0o22.f94290OooO00o.OooO0O0(userId), c27111OooOoo2);
        }
        if (i2 == 2) {
            firebaseUserResponse2 = c27102OooOOo.f94468OooOoO0;
            userId = c27102OooOOo.f94465OooOo;
            c27111OooOoo3 = c27102OooOOo.f94466OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                refreshedToken = firebaseUserResponse2.getRefreshedToken();
                if (refreshedToken != null && refreshedToken.length() != 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32.OooOOO0("FirebaseUserRepoImpl");
                    c20358OooO00o32.OooO0o0("fetchUserByFirebaseUid: refresh token", new Object[0]);
                    oooOO02 = c27111OooOoo3.f94517OooO0OO;
                    c27104OooOOoo = new C27104OooOOoo(refreshedToken, null);
                    c27102OooOOo.f94466OooOo0o = c27111OooOoo3;
                    c27102OooOOo.f94465OooOo = userId;
                    c27102OooOOo.f94468OooOoO0 = null;
                    c27102OooOOo.f94470OooOoo0 = 3;
                    if (C24332OooO.OooO00o(oooOO02, c27104OooOOoo, c27102OooOOo) != enumC32485OooO00o) {
                        str2 = userId;
                        c27111OooOoo = c27111OooOoo3;
                        userId = str2;
                    }
                    return enumC32485OooO00o;
                }
                c27111OooOoo2 = c27111OooOoo3;
            } catch (Exception e4) {
                e = e4;
                c27111OooOoo = c27111OooOoo3;
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42.OooOOO0("FirebaseUserRepoImpl");
                c20358OooO00o42.OooO0Oo(e, "fetchUserByFirebaseUid error", new Object[0]);
            }
            C27081OooOO0o c27081OooOO0o222 = c27111OooOoo2.f94515OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
            return new C27103OooOOo0(c27081OooOO0o222.f94290OooO00o.OooO0O0(userId), c27111OooOoo2);
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = c27102OooOOo.f94465OooOo;
        c27111OooOoo = c27102OooOOo.f94466OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            userId = str2;
        } catch (Exception e5) {
            e = e5;
            userId = str2;
            C34406OooO00o.C20358OooO00o c20358OooO00o422 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o422.OooOOO0("FirebaseUserRepoImpl");
            c20358OooO00o422.OooO0Oo(e, "fetchUserByFirebaseUid error", new Object[0]);
        }
        c27111OooOoo2 = c27111OooOoo;
        C27081OooOO0o c27081OooOO0o2222 = c27111OooOoo2.f94515OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return new C27103OooOOo0(c27081OooOO0o2222.f94290OooO00o.OooO0O0(userId), c27111OooOoo2);
    }

    @Override // o0OOo0Oo.InterfaceC27315OooOooo
    public final C27106OooOo0O getUid() {
        return new C27106OooOo0O(this.f94517OooO0OO.getData());
    }
}
