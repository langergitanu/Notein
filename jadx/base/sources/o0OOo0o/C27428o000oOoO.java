package o0OOo0o;

import com.orion.notein.domain.models.cloudsync.CloudSyncCredentialType;
import com.orion.notein.domain.models.switches.BrandSwitches;
import com.orion.notein.domain.models.switches.ProductSwitch;
import java.util.List;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo00oo.C31217OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0OOo0o.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27428o000oOoO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f95766OooO0OO = C24340OooO0oo.OooO0OO("key_user_sampling_rate_hz");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<BrandSwitches> f95767OooO0Oo = C34429OooOOo0.OooOO0o(new BrandSwitches(CloudSyncCredentialType.HUAWEI, C34429OooOOo0.OooOO0o(new ProductSwitch("DBY-W09", true), new ProductSwitch("default", true))), new BrandSwitches("honor", com.facebook.soloader.OooOo.OooO0oO(new ProductSwitch("default", false))), new BrandSwitches("xiaomi", com.facebook.soloader.OooOo.OooO0oO(new ProductSwitch("default", false))), new BrandSwitches("oppo", com.facebook.soloader.OooOo.OooO0oO(new ProductSwitch("default", false))), new BrandSwitches("vivo", com.facebook.soloader.OooOo.OooO0oO(new ProductSwitch("default", false))), new BrandSwitches("samsung", com.facebook.soloader.OooOo.OooO0oO(new ProductSwitch("default", false))));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<BrandSwitches> f95768OooO0o0 = C34429OooOOo0.OooOO0o(new BrandSwitches(CloudSyncCredentialType.HUAWEI, C34429OooOOo0.OooOO0o(new ProductSwitch("DBY-W09", true), new ProductSwitch("default", false))), new BrandSwitches("xiaomi", C34429OooOOo0.OooOO0o(new ProductSwitch("23043RP34C", true), new ProductSwitch("23046RP50C", true), new ProductSwitch("default", false))));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f95769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O f95770OooO0O0;

    public C27428o000oOoO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, o00000O getRemoteConfigUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        this.f95769OooO00o = abstractApplicationC26277OooOoOO;
        this.f95770OooO0O0 = getRemoteConfigUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27352Oooo0OO c27352Oooo0OO;
        C27428o000oOoO c27428o000oOoO;
        if (abstractC32479OooO0OO instanceof C27352Oooo0OO) {
            c27352Oooo0OO = (C27352Oooo0OO) abstractC32479OooO0OO;
            int i = c27352Oooo0OO.f95247OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27352Oooo0OO.f95247OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27352Oooo0OO = new C27352Oooo0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27352Oooo0OO.f95245OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27352Oooo0OO.f95247OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27352Oooo0OO.f95246OooOo0o = this;
            c27352Oooo0OO.f95247OooOoO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27355Oooo0oO(this, null), c27352Oooo0OO);
            if (objOooO0o != enumC32485OooO00o) {
                c27428o000oOoO = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return objOooO0o;
        }
        c27428o000oOoO = c27352Oooo0OO.f95246OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        int iIntValue = ((Number) objOooO0o).intValue();
        if (iIntValue > 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BrandSwitchUseCase");
            c20358OooO00o.OooO0o0("buildInkSamplingRateConfig: user override " + iIntValue + " Hz", new Object[0]);
            return new C31217OooO00o(iIntValue, C34436OooOoOO.f123455OooOo0o);
        }
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C27354Oooo0o0 c27354Oooo0o0 = new C27354Oooo0o0(c27428o000oOoO, null);
        c27352Oooo0OO.f95246OooOo0o = null;
        c27352Oooo0OO.f95247OooOoO = 2;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27354Oooo0o0, c27352Oooo0OO);
        return objOooO0o2 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o2;
    }
}
