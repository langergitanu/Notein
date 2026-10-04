package o0OOOO0o;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import o00o0Oo0.C25419OooO00o;
import o0O0OoO0.C25898OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import o0oooOOo.C31845OooO0Oo;
import o0oooOOo.C31850OooOO0;
import o0oooOo.C31856OooO0o0;
import o0oooOo.C31857OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33587OooO0oo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.XiaoMiAuthorizeService$authorize$2", m80623f = "XiaoMiAuthorizeService.kt", m80624l = {96, 147, 157}, m80625m = "invokeSuspend")
public final class o000000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super C27174OooO0O0<AuthorizeInfo>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94687OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94688OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f94689OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ActivityC21897OooOo0 f94690OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(ActivityC21897OooOo0 activityC21897OooOo0, o00000O0 o00000o02, Continuation continuation) {
        super(2, continuation);
        this.f94690OooOoO0 = activityC21897OooOo0;
        this.f94689OooOoO = o00000o02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o000000 o000000Var = new o000000(this.f94690OooOoO0, this.f94689OooOoO, continuation);
        o000000Var.f94687OooOo = obj;
        return o000000Var;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((o000000) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r3.emit(r9, r25) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a9, code lost:
    
        if (r3.emit(r19, r25) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d0, code lost:
    
        if (r3.emit(r7, r25) != r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0178 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:37:0x0145, B:40:0x0151, B:43:0x0157, B:45:0x015b, B:46:0x0178, B:48:0x017c, B:50:0x0181), top: B:58:0x000f }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, oO0o0Oo.OooO0oO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C31850OooOO0 c31850OooOO0OooO00o;
        C31856OooO0o0.OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r3 = this.f94688OooOo0o;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaoMiAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "xiaomi authorize error", new Object[0]);
            C27174OooO0O0 c27174OooO0O0 = new C27174OooO0O0(false, null, "xiaomi authorize error", null, 8);
            this.f94687OooOo = null;
            this.f94688OooOo0o = 3;
        }
        if (r3 != 0) {
            if (r3 == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (r3 == 2) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (r3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f94687OooOo;
        ActivityC21897OooOo0 activityC21897OooOo0 = this.f94690OooOoO0;
        if (activityC21897OooOo0 != null) {
            int[] iArr = {1, 3};
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO00o("xiaomi authorize, appId:2882303761520170166 redirectUrl: https://service.note-in.com/user/xiaomi/login, skipConfirm: true", new Object[0]);
            int length = C25419OooO00o.OooO00o("ro.mi.os.version.name").length();
            o00000O0 o00000o02 = this.f94689OooOoO;
            if (length <= 0) {
                if (C25419OooO00o.OooO00o("ro.miui.ui.version.name").length() > 0) {
                    String strOooO00o = C25419OooO00o.OooO00o("ro.build.version.incremental");
                    Pattern patternCompile = Pattern.compile("(\\d+)\\.(\\d+).*");
                    kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                    Matcher matcher = patternCompile.matcher(strOooO00o);
                    kotlin.jvm.internal.OooOOO0.OooO0o(matcher, "matcher(...)");
                    C33587OooO0oo c33587OooO0ooOooO00o = C25898OooO0Oo.OooO00o(matcher, 0, strOooO00o);
                    if (c33587OooO0ooOooO00o != null) {
                        int i = Integer.parseInt((String) ((C33587OooO0oo.OooO00o) c33587OooO0ooOooO00o.OooO00o()).get(1));
                        int i2 = Integer.parseInt((String) ((C33587OooO0oo.OooO00o) c33587OooO0ooOooO00o.OooO00o()).get(2));
                        if (i > 8 || (i == 8 && i2 >= 2)) {
                        }
                        C31856OooO0o0 c31856OooO0o0 = (C31856OooO0o0) c31850OooOO0OooO00o.OooO00o();
                        oooO00o = c31856OooO0o0.f113538OooO0O0;
                        if (oooO00o != null) {
                            int i3 = oooO00o != null ? oooO00o.f113539OooO00o : 0;
                            String str = oooO00o != null ? oooO00o.f113540OooO0O0 : null;
                            c20358OooO00o2.OooOOO0("XiaoMiAuthorizeService");
                            c20358OooO00o2.OooO0OO("xiaomi authorize error, errorCode: " + i3 + ", errorMessage: " + str, new Object[0]);
                        } else {
                            C31856OooO0o0.OooO0O0 oooO0O0 = c31856OooO0o0.f113537OooO00o;
                            String str2 = oooO0O0 != null ? oooO0O0.f113549OooO0oo : null;
                            kotlin.jvm.internal.OooOOO0.OooO0o(str2, "getCode(...)");
                            C27174OooO0O0 c27174OooO0O02 = new C27174OooO0O0(true, new AuthorizeInfo(null, str2, null, 5, null), LoginErrorCode.ERROR_CODE_HW_NEED_USER_AUTHORIZE, null, 8);
                            this.f94687OooOo = interfaceC33723OooO0oO;
                            this.f94688OooOo0o = 2;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                c20358OooO00o2.OooOOO0("XiaoMiAuthorizeService");
                c20358OooO00o2.OooO0o0("xiaomi authorize, use authByQrCode", new Object[0]);
                C31857OooO0oO c31857OooO0oO = (C31857OooO0oO) o00000o02.f94700OooO0O0.getValue();
                c31857OooO0oO.f113550OooO00o.f113496OooO0O0 = String.valueOf(2882303761520170166L);
                C31845OooO0Oo.OooO00o oooO00o2 = c31857OooO0oO.f113550OooO00o;
                oooO00o2.f113497OooO0OO = "https://service.note-in.com/user/xiaomi/login";
                oooO00o2.f113494OooO = "qr";
                oooO00o2.f113495OooO00o = iArr;
                Boolean bool = Boolean.TRUE;
                oooO00o2.f113498OooO0Oo = bool;
                oooO00o2.f113505OooOO0o = bool;
                oooO00o2.f113499OooO0o = "code";
                c31850OooOO0OooO00o = c31857OooO0oO.OooO00o(activityC21897OooOo0);
                C31856OooO0o0 c31856OooO0o02 = (C31856OooO0o0) c31850OooOO0OooO00o.OooO00o();
                oooO00o = c31856OooO0o02.f113538OooO0O0;
                if (oooO00o != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            c20358OooO00o2.OooOOO0("XiaoMiAuthorizeService");
            c20358OooO00o2.OooO0o0("xiaomi authorize, use authForMiui", new Object[0]);
            C31857OooO0oO c31857OooO0oO2 = (C31857OooO0oO) o00000o02.f94700OooO0O0.getValue();
            c31857OooO0oO2.f113550OooO00o.f113496OooO0O0 = String.valueOf(2882303761520170166L);
            C31845OooO0Oo.OooO00o oooO00o3 = c31857OooO0oO2.f113550OooO00o;
            oooO00o3.f113497OooO0OO = "https://service.note-in.com/user/xiaomi/login";
            oooO00o3.f113503OooOO0 = Boolean.FALSE;
            oooO00o3.f113495OooO00o = iArr;
            oooO00o3.f113498OooO0Oo = Boolean.TRUE;
            oooO00o3.f113501OooO0oO = true;
            oooO00o3.f113499OooO0o = "code";
            c31850OooOO0OooO00o = c31857OooO0oO2.OooO00o(activityC21897OooOo0);
            C31856OooO0o0 c31856OooO0o022 = (C31856OooO0o0) c31850OooOO0OooO00o.OooO00o();
            oooO00o = c31856OooO0o022.f113538OooO0O0;
            if (oooO00o != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("XiaoMiAuthorizeService");
        c20358OooO00o3.OooO0OO("xiaomi authorize error, activity is null", new Object[0]);
        C27174OooO0O0 c27174OooO0O03 = new C27174OooO0O0(false, null, null, null, 14);
        this.f94688OooOo0o = 1;
        return enumC32485OooO00o;
    }
}
