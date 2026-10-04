package o0o0Oo0O;

import android.content.Context;
import android.view.View;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0Oo0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$performResetToDefaults$1", m80623f = "GlobalSettingsFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
public final class C30616OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f109554OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109555OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ GlobalSettingsFragment f109556OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f109557OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30616OooO0oO(View view, GlobalSettingsFragment globalSettingsFragment, Continuation<? super C30616OooO0oO> continuation) {
        super(2, continuation);
        this.f109557OooOoO0 = view;
        this.f109556OooOoO = globalSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30616OooO0oO c30616OooO0oO = new C30616OooO0oO(this.f109557OooOoO0, this.f109556OooOoO, continuation);
        c30616OooO0oO.f109554OooOo = obj;
        return c30616OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30616OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109555OooOo0o;
        GlobalSettingsFragment globalSettingsFragment = this.f109556OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f109554OooOo;
                C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) globalSettingsFragment.f78855OooOoo0.getValue();
                this.f109554OooOo = interfaceC33636Oooo00o;
                this.f109555OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30620OooOO0o(c30623OooOOOO, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        this.f109557OooOoO0.setEnabled(true);
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o == null) {
            Context contextRequireContext = globalSettingsFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String string = globalSettingsFragment.getString(R.string.reset_to_default_settings_success);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext, string);
        } else if (thOooO00o instanceof CancellationException) {
            Context contextRequireContext2 = globalSettingsFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
            String string2 = globalSettingsFragment.getString(R.string.reset_to_default_settings_success);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext2, string2);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GlobalSettingsFragment");
            c20358OooO00o.OooO0Oo(thOooO00o, "resetToDefaults failed", new Object[0]);
            Context contextRequireContext3 = globalSettingsFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
            String string3 = globalSettingsFragment.getString(R.string.reset_to_default_settings_failed);
            kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext3, string3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
