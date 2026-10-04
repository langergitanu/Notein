package o0O0oooO;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0O0Ooo.C25904OooO0O0;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.StylusHardwareInfoProviderImpl$preload$2", m80623f = "StylusHardwareInfoProviderImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends C25904OooO0O0>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000000O f90153OooOo0o;

    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0O0oooO/o000000$OooO00o", "Lcom/google/gson/reflect/TypeToken;", "", "Lo0O0Ooo/OooO0O0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO00o extends TypeToken<List<? extends C25904OooO0O0>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o000000O o000000o2, Continuation<? super o000000> continuation) {
        super(2, continuation);
        this.f90153OooOo0o = o000000o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000000(this.f90153OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends C25904OooO0O0>> continuation) {
        return ((o000000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            String valueAsString = this.f90153OooOo0o.f90155OooO00o.f95374OooO00o.getValueAsString("rconfig_stylus_hardware_info");
            if (valueAsString.length() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("StylusHardwareInfoProvider");
                c20358OooO00o.OooOO0O("Stylus hardware info JSON is empty, using default list", new Object[0]);
                return o000000O.f90154OooO0OO;
            }
            Type type = new OooO00o().getType();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("StylusHardwareInfoProvider");
            c20358OooO00o2.OooO00o("Parsing stylus hardware info JSON: ".concat(valueAsString), new Object[0]);
            Object objFromJson = C28028OooO0o.OooO00o().fromJson(valueAsString, type);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objFromJson);
            return (List) objFromJson;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("StylusHardwareInfoProvider");
            List<C25904OooO0O0> list = o000000O.f90154OooO0OO;
            c20358OooO00o3.OooO0Oo(e, "Failed to parse stylus hardware info, using default: " + list, new Object[0]);
            return list;
        }
    }
}
