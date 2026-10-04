package o0OOOO0o;

import OooOoOO.C20519OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOOO0.InterfaceC27153OooO0oo;
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

/* JADX INFO: renamed from: o0OOOO0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27099OooO0oo extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27153OooO0oo f94437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94438OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f94439OooO0OO;

    public C27099OooO0oo(InterfaceC27153OooO0oo hwApi, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(hwApi, "hwApi");
        this.f94437OooO00o = hwApi;
        this.f94438OooO0O0 = abstractApplicationC26277OooOoOO;
        this.f94439OooO0OO = C20519OooO0Oo.OooO0OO(new com.google.firebase.sessions.OooO(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27097OooO0o0 c27097OooO0o0;
        C27099OooO0oo c27099OooO0oo;
        if (abstractC32479OooO0OO instanceof C27097OooO0o0) {
            c27097OooO0o0 = (C27097OooO0o0) abstractC32479OooO0OO;
            int i = c27097OooO0o0.f94431OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27097OooO0o0.f94431OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27097OooO0o0 = new C27097OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27097OooO0o0.f94429OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27097OooO0o0.f94431OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                InterfaceC27153OooO0oo interfaceC27153OooO0oo = this.f94437OooO00o;
                C27175OooO00o c27175OooO00o = new C27175OooO00o(C28036OooO0O0.OooO0OO(str), str2, str3, str4, "");
                c27097OooO0o0.f94430OooOo0o = this;
                c27097OooO0o0.f94431OooOoO = 1;
                objOooO0OO = interfaceC27153OooO0oo.OooO0OO(c27175OooO00o, c27097OooO0o0);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27099OooO0oo = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27099OooO0oo = c27097OooO0o0.f94430OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            c27099OooO0oo.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0OO, "HWAuthorizeService", "bindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HWAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "bindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        C27099OooO0oo c27099OooO0oo;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f94427OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f94427OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooO0o.f94425OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f94427OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                InterfaceC27153OooO0oo interfaceC27153OooO0oo = this.f94437OooO00o;
                C27180OooO0o0 c27180OooO0o0 = new C27180OooO0o0(str);
                oooO0o.f94426OooOo0o = this;
                oooO0o.f94427OooOoO = 1;
                objOooO00o = interfaceC27153OooO0oo.OooO00o(c27180OooO0o0, oooO0o);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27099OooO0oo = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27099OooO0oo = oooO0o.f94426OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            c27099OooO0oo.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO00o, "HWAuthorizeService", "login");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HWAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "login by authCode error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27098OooO0oO c27098OooO0oO;
        C27099OooO0oo c27099OooO0oo;
        if (abstractC32479OooO0OO instanceof C27098OooO0oO) {
            c27098OooO0oO = (C27098OooO0oO) abstractC32479OooO0OO;
            int i = c27098OooO0oO.f94435OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27098OooO0oO.f94435OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27098OooO0oO = new C27098OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27098OooO0oO.f94433OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27098OooO0oO.f94435OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                InterfaceC27153OooO0oo interfaceC27153OooO0oo = this.f94437OooO00o;
                C27178OooO0Oo c27178OooO0Oo = new C27178OooO0Oo(str);
                c27098OooO0oO.f94434OooOo0o = this;
                c27098OooO0oO.f94435OooOoO = 1;
                objOooO0O0 = interfaceC27153OooO0oo.OooO0O0(c27178OooO0Oo, c27098OooO0oO);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27099OooO0oo = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27099OooO0oo = c27098OooO0oO.f94434OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            c27099OooO0oo.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0O0, "HWAuthorizeService", "skipBindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HWAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "skipBindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }
}
