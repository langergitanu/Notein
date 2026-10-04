package com.orion.notein.p607ui.settings.appearance;

import OooOoOO.C20519OooO0Oo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0o0Oo0o.C30655OooO0o0;
import o0o0Oo0o.C30656OooO0oO;
import o0oOoOo.C31036OooO0oO;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/settings/appearance/GlobalSettingDataFormatFragment;", "Lcom/orion/notein/ui/settings/page/BasePageOptionFragment;", "", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalSettingDataFormatFragment extends Hilt_GlobalSettingDataFormatFragment<String> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f78928OooOooo;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return GlobalSettingDataFormatFragment.this;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f78930OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO00o oooO00o) {
            super(0);
            this.f78930OooOo0o = oooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78930OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78931OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78931OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78931OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.GlobalSettingDataFormatFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23797OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78932OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23797OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78932OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78932OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.GlobalSettingDataFormatFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23798OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78933OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23798OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78933OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78933OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? GlobalSettingDataFormatFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public GlobalSettingDataFormatFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0O0(new OooO00o()));
        this.f78928OooOooo = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30656OooO0oO.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C23798OooO0o0(interfaceC32440OooOO0OooO0O0), new C23797OooO0Oo(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final Object OooOoO(Object obj, com.orion.notein.p607ui.settings.page.OooO00o oooO00o) throws Throwable {
        C30656OooO0oO c30656OooO0oO = (C30656OooO0oO) this.f78928OooOooo.getValue();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30655OooO0o0(c30656OooO0oO, (String) obj, null), oooO00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final List<BasePageOptionFragment.OooO0O0<String>> OooOoOO() {
        List<C31036OooO0oO> list = C31036OooO0oO.f110808OooO0OO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (C31036OooO0oO c31036OooO0oO : list) {
            String str = c31036OooO0oO.f110809OooO00o;
            Locale locale = Locale.getDefault();
            OooOOO0.OooO0o(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
            arrayList.add(new BasePageOptionFragment.OooO0O0(null, upperCase, null, c31036OooO0oO.f110809OooO00o, 13));
        }
        return arrayList;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final C33769Ooooo0o OooOoo0() {
        return ((C30656OooO0oO) this.f78928OooOooo.getValue()).f109697OooO0o0;
    }
}
