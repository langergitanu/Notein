package o0OOo0o;

import android.os.Build;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.switches.BrandHzConfig;
import com.orion.notein.domain.models.switches.ProductHzConfig;
import com.orion.notein.domain.models.switches.ToolHzConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28028OooO0o;
import o0oo00oo.C31217OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BrandSwitchUseCase$buildInkSamplingRateConfig$2", m80623f = "BrandSwitchUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27354Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C31217OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27428o000oOoO f95249OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27354Oooo0o0(C27428o000oOoO c27428o000oOoO, Continuation<? super C27354Oooo0o0> continuation) {
        super(2, continuation);
        this.f95249OooOo0o = c27428o000oOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27354Oooo0o0(this.f95249OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C31217OooO00o> continuation) {
        return ((C27354Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        Object next3;
        List<ToolHzConfig> tools;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String valueAsString = this.f95249OooOo0o.f95770OooO0O0.f95374OooO00o.getValueAsString("rconfig_ink_sampling_rate_limit_hz");
        String str = Build.BRAND;
        String str2 = Build.PRODUCT;
        String str3 = Build.MODEL;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o(com.aspose.slides.OooOOO.OooO0O0(C22227OoooO.OooO00o(c20358OooO00o, "BrandSwitchUseCase", "buildInkSamplingRateConfig: brand=", str, ", product="), str2, ", model=", str3), new Object[0]);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(str2);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(str3);
        ProductHzConfig productHzConfig = null;
        productHzConfig = null;
        Object obj2 = null;
        productHzConfig = null;
        if (C33599OooOo0O.Oooo0o0(valueAsString)) {
            c20358OooO00o.OooOOO0("BrandSwitchUseCase");
            c20358OooO00o.OooO00o("matchProductConfig: no remote config", new Object[0]);
        } else {
            try {
                Object objFromJson = C28028OooO0o.OooO00o().fromJson(valueAsString, new C27357OoooO().getType());
                kotlin.jvm.internal.OooOOO0.OooO0Oo(objFromJson);
                List list = (List) objFromJson;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (str.equalsIgnoreCase(((BrandHzConfig) next).getBrand())) {
                        break;
                    }
                }
                BrandHzConfig brandHzConfig = (BrandHzConfig) next;
                if (brandHzConfig == null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                        if (C33595OooOOo.OooOOo(((BrandHzConfig) next3).getBrand(), "default", true)) {
                            break;
                        }
                    }
                    brandHzConfig = (BrandHzConfig) next3;
                }
                if (brandHzConfig != null) {
                    Iterator<T> it3 = brandHzConfig.getProducts().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        ProductHzConfig productHzConfig2 = (ProductHzConfig) next2;
                        if (str2.equalsIgnoreCase(productHzConfig2.getProduct()) || str3.equalsIgnoreCase(productHzConfig2.getProduct())) {
                            break;
                        }
                    }
                    ProductHzConfig productHzConfig3 = (ProductHzConfig) next2;
                    if (productHzConfig3 == null) {
                        Iterator<T> it4 = brandHzConfig.getProducts().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next4 = it4.next();
                            if (C33595OooOOo.OooOOo(((ProductHzConfig) next4).getProduct(), "default", true)) {
                                obj2 = next4;
                                break;
                            }
                        }
                        productHzConfig = (ProductHzConfig) obj2;
                    } else {
                        productHzConfig = productHzConfig3;
                    }
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("BrandSwitchUseCase");
                c20358OooO00o2.OooO0Oo(e, "matchProductConfig: parse error", new Object[0]);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, Integer> entry : C31217OooO00o.f111337OooO0Oo.entrySet()) {
            linkedHashMap.put(new Integer(entry.getKey().intValue()), new Integer(entry.getValue().intValue()));
        }
        if (productHzConfig != null && (tools = productHzConfig.getTools()) != null) {
            for (ToolHzConfig toolHzConfig : tools) {
                linkedHashMap.put(new Integer(toolHzConfig.getToolType()), new Integer(toolHzConfig.getHz()));
            }
        }
        int hz = productHzConfig != null ? productHzConfig.getHz() : 144;
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o3, "BrandSwitchUseCase", "buildInkSamplingRateConfig: defaultHz=", hz, ", toolRates=");
        sbOooO00o.append(linkedHashMap);
        c20358OooO00o3.OooO0o0(sbOooO00o.toString(), new Object[0]);
        return new C31217OooO00o(hz, linkedHashMap);
    }
}
