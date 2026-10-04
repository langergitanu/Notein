package o0OOo0o;

import android.os.Build;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22227OoooO;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.domain.models.switches.BrandSwitches;
import com.orion.notein.domain.models.switches.ProductSwitch;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BrandSwitchUseCase$isEnable$2", m80623f = "BrandSwitchUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27356Oooo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27428o000oOoO f95257OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f95258OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<BrandSwitches> f95259OooOoO0;

    /* JADX INFO: renamed from: o0OOo0o.Oooo0oo$OooO00o */
    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0OOo0o/Oooo0oo$OooO00o", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/orion/notein/domain/models/switches/BrandSwitches;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO00o extends TypeToken<List<? extends BrandSwitches>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27356Oooo0oo(String str, C27428o000oOoO c27428o000oOoO, List<BrandSwitches> list, Continuation<? super C27356Oooo0oo> continuation) {
        super(2, continuation);
        this.f95258OooOo0o = str;
        this.f95257OooOo = c27428o000oOoO;
        this.f95259OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27356Oooo0oo(this.f95258OooOo0o, this.f95257OooOo, this.f95259OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27356Oooo0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<BrandSwitches> list;
        Boolean boolValueOf;
        Object next;
        boolean zBooleanValue;
        Object next2;
        Object next3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "BrandSwitchUseCase", "isEnable, key: ");
        String str = this.f95258OooOo0o;
        c20358OooO00o.OooO0o0(androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str, " start."), new Object[0]);
        String valueAsString = this.f95257OooOo.f95770OooO0O0.f95374OooO00o.getValueAsString(str);
        String str2 = Build.BRAND;
        String str3 = Build.PRODUCT;
        String str4 = Build.MODEL;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "BrandSwitchUseCase", "isEnable, key: ", str, ", brand: ");
        OooOO0.OooO0OO.OooO0o0(sbOooO00o, str2, ", product: ", str3, ", model:");
        c20358OooO00o.OooO0o0(com.aspose.slides.OooOOO.OooO0O0(sbOooO00o, str4, ", fetch from config: json: ", valueAsString), new Object[0]);
        try {
            Object objFromJson = C28028OooO0o.OooO00o().fromJson(valueAsString, new OooO00o().getType());
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objFromJson);
            list = (List) objFromJson;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0Oo(e, C22201OooO0oO.OooO0O0(c20358OooO00o2, "BrandSwitchUseCase", "isEnable, key: ", str, ", parse json error, use default."), new Object[0]);
            list = this.f95259OooOoO0;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o3, "BrandSwitchUseCase", "isEnable, key: ", str, ", list: ");
        sbOooO00o2.append(list);
        c20358OooO00o3.OooO0o0(sbOooO00o2.toString(), new Object[0]);
        Iterator<T> it = list.iterator();
        while (true) {
            boolValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C33595OooOOo.OooOOo(str2, ((BrandSwitches) next).getBrand(), true)) {
                break;
            }
        }
        BrandSwitches brandSwitches = (BrandSwitches) next;
        if (brandSwitches != null) {
            Iterator<T> it2 = brandSwitches.getProducts().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                ProductSwitch productSwitch = (ProductSwitch) next2;
                if (C33595OooOOo.OooOOo(str3, productSwitch.getProduct(), true) || C33595OooOOo.OooOOo(str4, productSwitch.getProduct(), true)) {
                    break;
                }
            }
            ProductSwitch productSwitch2 = (ProductSwitch) next2;
            if (productSwitch2 != null) {
                boolValueOf = Boolean.valueOf(productSwitch2.getSwitch());
            } else {
                Iterator<T> it3 = brandSwitches.getProducts().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ProductSwitch) next3).getProduct(), "default")) {
                        break;
                    }
                }
                ProductSwitch productSwitch3 = (ProductSwitch) next3;
                if (productSwitch3 != null) {
                    boolValueOf = Boolean.valueOf(productSwitch3.getSwitch());
                }
            }
            zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o3 = C22227OoooO.OooO00o(c20358OooO00o4, "BrandSwitchUseCase", "isEnable, key: ", str, ", enable: ");
        sbOooO00o3.append(zBooleanValue);
        c20358OooO00o4.OooO0o0(sbOooO00o3.toString(), new Object[0]);
        return Boolean.valueOf(zBooleanValue);
    }
}
