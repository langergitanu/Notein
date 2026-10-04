package com.orion.notein.p607ui.login.verificationcode;

import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C22008OoooOo0;
import androidx.lifecycle.o0OoOo0;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.p607ui.login.verificationcode.OooO00o;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OOOO0o.C27129OoooOOO;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0ooOOO0.C31620OooO;
import o0ooOOO0.C31623OooO0OO;
import o0ooOOO0.C31625OooO0o;
import o0ooOOO0.C31626OooO0o0;
import o0ooOOO0.C31627OooO0oO;
import o0ooOOO0.C31628OooO0oo;
import o0ooOOO0.C31629OooOO0;
import o0ooOOO0.C31631OooOO0o;
import o0ooOOO0.EnumC31621OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/login/verificationcode/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33769Ooooo0o f72630OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f72631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27600o0ooOO0 f72632OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27449o00O0OoO f72633OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C31623OooO0OO f72634OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f72635OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33772OooooOo f72636OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33768Ooooo00 f72637OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00000OO f72638OooOO0o;

    public OooO0OO(C27129OoooOOO c27129OoooOOO, C27449o00O0OoO c27449o00O0OoO, C27600o0ooOO0 c27600o0ooOO0, C22008OoooOo0 savedStateHandle) {
        Integer num;
        String str;
        OooOOO0.OooO0oO(savedStateHandle, "savedStateHandle");
        this.f72631OooO0Oo = c27129OoooOOO;
        this.f72633OooO0o0 = c27449o00O0OoO;
        this.f72632OooO0o = c27600o0ooOO0;
        LinkedHashMap linkedHashMap = savedStateHandle.f65645OooO00o;
        if (!linkedHashMap.containsKey("country")) {
            throw new IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) savedStateHandle.OooO0O0("country");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("phone")) {
            throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) savedStateHandle.OooO0O0("phone");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value");
        }
        String str4 = linkedHashMap.containsKey(CommonConstant.KEY_ACCESS_TOKEN) ? (String) savedStateHandle.OooO0O0(CommonConstant.KEY_ACCESS_TOKEN) : null;
        if (linkedHashMap.containsKey("loginType")) {
            num = (Integer) savedStateHandle.OooO0O0("loginType");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"loginType\" of type integer does not support null values");
            }
        } else {
            num = 0;
        }
        if (linkedHashMap.containsKey("openID")) {
            str = (String) savedStateHandle.OooO0O0("openID");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"openID\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        this.f72634OooO0oO = new C31623OooO0OO(num.intValue(), str2, str3, str4, str);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(new C31626OooO0o0(str2, str3, "", false, false, null, 60, true));
        this.f72635OooO0oo = c33781o00o0OOooO00o;
        this.f72630OooO = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 1, 5);
        this.f72636OooOO0 = c33772OooooOoOooO0O0;
        this.f72637OooOO0O = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O0);
        OooO0oO(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r0.emit(r1, r2) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r0.emit(r1, r2) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C31620OooO c31620OooO;
        Object value;
        C31626OooO0o0 c31626OooO0o0;
        Object value2;
        C31626OooO0o0 c31626OooO0o02;
        Object value3;
        OooO0OO oooO0OO2 = oooO0OO;
        if (abstractC32479OooO0OO instanceof C31620OooO) {
            c31620OooO = (C31620OooO) abstractC32479OooO0OO;
            int i = c31620OooO.f113045OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c31620OooO.f113045OooOoO = i - Integer.MIN_VALUE;
            } else {
                c31620OooO = new C31620OooO(oooO0OO2, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c31620OooO.f113043OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c31620OooO.f113045OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C31626OooO0o0 c31626OooO0o03 = (C31626OooO0o0) oooO0OO2.f72635OooO0oo.getValue();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C31629OooOO0 c31629OooOO0 = new C31629OooOO0(oooO0OO2, c31626OooO0o03, null);
            c31620OooO.f113044OooOo0o = oooO0OO2;
            c31620OooO.f113045OooOoO = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c31629OooOO0, c31620OooO);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        oooO0OO2 = c31620OooO.f113044OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        int iIntValue = ((Number) objOooO0o).intValue();
        if (iIntValue == 0) {
            C33781o00o0O c33781o00o0O = oooO0OO2.f72635OooO0oo;
            do {
                value3 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value3, C31626OooO0o0.OooO00o((C31626OooO0o0) value3, null, false, false, null, 0, false, 199)));
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0OO2);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31625OooO0o(oooO0OO2, null), 2);
            C33772OooooOo c33772OooooOo = oooO0OO2.f72636OooOO0;
            OooO00o.OooO0O0 oooO0O0 = OooO00o.OooO0O0.f72622OooO00o;
            c31620OooO.f113044OooOo0o = null;
            c31620OooO.f113045OooOoO = 2;
        } else {
            if (iIntValue == 4001 || (4000 <= iIntValue && iIntValue < 5000)) {
                C33781o00o0O c33781o00o0O2 = oooO0OO2.f72635OooO0oo;
                do {
                    value = c33781o00o0O2.getValue();
                    c31626OooO0o0 = (C31626OooO0o0) value;
                } while (!c33781o00o0O2.OooO(value, C31626OooO0o0.OooO00o(c31626OooO0o0, null, false, c31626OooO0o0.f113061OooO0OO.length() >= 4, EnumC31621OooO00o.f113048OooOo0o, 0, false, 199)));
                return C32460OooOooO.f116667OooO00o;
            }
            C33781o00o0O c33781o00o0O3 = oooO0OO2.f72635OooO0oo;
            do {
                value2 = c33781o00o0O3.getValue();
                c31626OooO0o02 = (C31626OooO0o0) value2;
            } while (!c33781o00o0O3.OooO(value2, C31626OooO0o0.OooO00o(c31626OooO0o02, null, false, c31626OooO0o02.f113061OooO0OO.length() >= 4, null, 0, false, 199)));
            C33772OooooOo c33772OooooOo2 = oooO0OO2.f72636OooOO0;
            OooO00o.OooO0OO oooO0OO3 = new OooO00o.OooO0OO();
            c31620OooO.f113044OooOo0o = null;
            c31620OooO.f113045OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r0.emit(r1, r2) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
    
        if (r0.emit(r1, r2) == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C31627OooO0oO c31627OooO0oO;
        Object value;
        C31626OooO0o0 c31626OooO0o0;
        Object value2;
        C31626OooO0o0 c31626OooO0o02;
        Object value3;
        OooO0OO oooO0OO2 = oooO0OO;
        if (abstractC32479OooO0OO instanceof C31627OooO0oO) {
            c31627OooO0oO = (C31627OooO0oO) abstractC32479OooO0OO;
            int i = c31627OooO0oO.f113069OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c31627OooO0oO.f113069OooOoO = i - Integer.MIN_VALUE;
            } else {
                c31627OooO0oO = new C31627OooO0oO(oooO0OO2, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c31627OooO0oO.f113067OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c31627OooO0oO.f113069OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C31626OooO0o0 c31626OooO0o03 = (C31626OooO0o0) oooO0OO2.f72635OooO0oo.getValue();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C31628OooO0oo c31628OooO0oo = new C31628OooO0oo(oooO0OO2, c31626OooO0o03, null);
            c31627OooO0oO.f113068OooOo0o = oooO0OO2;
            c31627OooO0oO.f113069OooOoO = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c31628OooO0oo, c31627OooO0oO);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        oooO0OO2 = c31627OooO0oO.f113068OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
        if (c27174OooO0O0.f94862OooO00o) {
            C33781o00o0O c33781o00o0O = oooO0OO2.f72635OooO0oo;
            do {
                value3 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value3, C31626OooO0o0.OooO00o((C31626OooO0o0) value3, null, false, false, null, 0, false, 199)));
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0OO2);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31625OooO0o(oooO0OO2, null), 2);
            C33772OooooOo c33772OooooOo = oooO0OO2.f72636OooOO0;
            OooO00o.OooO0O0 oooO0O0 = OooO00o.OooO0O0.f72622OooO00o;
            c31627OooO0oO.f113068OooOo0o = null;
            c31627OooO0oO.f113069OooOoO = 2;
        } else {
            if (OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), LoginErrorCode.ERROR_CODE_VERIFICATION_CODE_ERROR)) {
                C33781o00o0O c33781o00o0O2 = oooO0OO2.f72635OooO0oo;
                do {
                    value2 = c33781o00o0O2.getValue();
                    c31626OooO0o02 = (C31626OooO0o0) value2;
                } while (!c33781o00o0O2.OooO(value2, C31626OooO0o0.OooO00o(c31626OooO0o02, null, false, c31626OooO0o02.f113061OooO0OO.length() >= 4, EnumC31621OooO00o.f113048OooOo0o, 0, false, 199)));
                return C32460OooOooO.f116667OooO00o;
            }
            C33781o00o0O c33781o00o0O3 = oooO0OO2.f72635OooO0oo;
            do {
                value = c33781o00o0O3.getValue();
                c31626OooO0o0 = (C31626OooO0o0) value;
            } while (!c33781o00o0O3.OooO(value, C31626OooO0o0.OooO00o(c31626OooO0o0, null, false, c31626OooO0o0.f113061OooO0OO.length() >= 4, null, 0, false, 199)));
            C33772OooooOo c33772OooooOo2 = oooO0OO2.f72636OooOO0;
            OooO00o.OooO0OO oooO0OO3 = new OooO00o.OooO0OO();
            c31627OooO0oO.f113068OooOo0o = null;
            c31627OooO0oO.f113069OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    public static void OooO0oO(OooO0OO oooO0OO) {
        o00000OO o00000oo2 = oooO0OO.f72638OooOO0o;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        oooO0OO.f72638OooOO0o = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), null, null, new C31631OooOO0o(oooO0OO, null), 3);
    }
}
