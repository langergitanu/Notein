package o0OOOO0o;

import OooOoOO.C20519OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import o0OOOo00.C27175OooO00o;
import o0OOOo00.C27178OooO0Oo;
import o0OOOo00.C27180OooO0o0;
import o0Oo00oO.C28036OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO0.OooOOO f94699OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32447OooOOo f94700OooO0O0;

    public o00000O0(o0OOOOO0.OooOOO xiaomiApi) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(xiaomiApi, "xiaomiApi");
        this.f94699OooO00o = xiaomiApi;
        this.f94700OooO0O0 = C20519OooO0Oo.OooO0OO(new o000OOo());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000O o000000o2;
        o00000O0 o00000o02;
        if (abstractC32479OooO0OO instanceof o000000O) {
            o000000o2 = (o000000O) abstractC32479OooO0OO;
            int i = o000000o2.f94693OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000o2.f94693OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000000o2 = new o000000O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = o000000o2.f94691OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000o2.f94693OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                o0OOOOO0.OooOOO oooOOO = this.f94699OooO00o;
                C27175OooO00o c27175OooO00o = new C27175OooO00o(C28036OooO0O0.OooO0OO(str), str2, str3, str4, "");
                o000000o2.f94692OooOo0o = this;
                o000000o2.f94693OooOoO = 1;
                objOooO0OO = oooOOO.OooO0OO(c27175OooO00o, o000000o2);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o00000o02 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00000o02 = o000000o2.f94692OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            o00000o02.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0OO, "XiaoMiAuthorizeService", "bindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaoMiAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "bindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27143o000000o c27143o000000o;
        o00000O0 o00000o02;
        if (abstractC32479OooO0OO instanceof C27143o000000o) {
            c27143o000000o = (C27143o000000o) abstractC32479OooO0OO;
            int i = c27143o000000o.f94697OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27143o000000o.f94697OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27143o000000o = new C27143o000000o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27143o000000o.f94695OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27143o000000o.f94697OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                o0OOOOO0.OooOOO oooOOO = this.f94699OooO00o;
                C27180OooO0o0 c27180OooO0o0 = new C27180OooO0o0(str);
                c27143o000000o.f94696OooOo0o = this;
                c27143o000000o.f94697OooOoO = 1;
                objOooO00o = oooOOO.OooO00o(c27180OooO0o0, c27143o000000o);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o00000o02 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00000o02 = c27143o000000o.f94696OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            o00000o02.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO00o, "XiaoMiAuthorizeService", "login");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaoMiAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "login by authCode error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00000 o00000Var;
        o00000O0 o00000o02;
        if (abstractC32479OooO0OO instanceof o00000) {
            o00000Var = (o00000) abstractC32479OooO0OO;
            int i = o00000Var.f94685OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00000Var.f94685OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00000Var = new o00000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = o00000Var.f94683OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00000Var.f94685OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                o0OOOOO0.OooOOO oooOOO = this.f94699OooO00o;
                C27178OooO0Oo c27178OooO0Oo = new C27178OooO0Oo(str);
                o00000Var.f94684OooOo0o = this;
                o00000Var.f94685OooOoO = 1;
                objOooO0O0 = oooOOO.OooO0O0(c27178OooO0Oo, o00000Var);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o00000o02 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00000o02 = o00000Var.f94684OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            o00000o02.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0O0, "XiaoMiAuthorizeService", "skipBindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaoMiAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "skipBindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }
}
