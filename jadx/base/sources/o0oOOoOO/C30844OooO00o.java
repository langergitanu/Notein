package o0oOOoOO;

import OooOo.OooO0O0;
import android.os.Build;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.os.LocaleListCompat;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOOoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.language.GlobalSettingsLanguageFragment$changeAppLanguage$2", m80623f = "GlobalSettingsLanguageFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30844OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f110242OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30844OooO00o(String str, Continuation<? super C30844OooO00o> continuation) {
        super(2, continuation);
        this.f110242OooOo0o = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30844OooO00o(this.f110242OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30844OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        LocaleListCompat localeListCompatForLanguageTags = LocaleListCompat.forLanguageTags(this.f110242OooOo0o);
        OooOOO0.OooO0o(localeListCompatForLanguageTags, "forLanguageTags(...)");
        AbstractC21486OooOO0o.OooO0OO oooO0OO = AbstractC21486OooOO0o.f62445OooOo0o;
        if (Build.VERSION.SDK_INT >= 33) {
            Object objOooOO0 = AbstractC21486OooOO0o.OooOO0();
            if (objOooOO0 != null) {
                AbstractC21486OooOO0o.OooO0O0.OooO0O0(objOooOO0, AbstractC21486OooOO0o.OooO00o.OooO00o(localeListCompatForLanguageTags.toLanguageTags()));
            }
        } else if (!localeListCompatForLanguageTags.equals(AbstractC21486OooOO0o.f62447OooOoO0)) {
            synchronized (AbstractC21486OooOO0o.f62451OooOooO) {
                AbstractC21486OooOO0o.f62447OooOoO0 = localeListCompatForLanguageTags;
                OooOo.OooO0O0<WeakReference<AbstractC21486OooOO0o>> oooO0O0 = AbstractC21486OooOO0o.f62449OooOoo;
                oooO0O0.getClass();
                OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
                while (oooO00o.hasNext()) {
                    AbstractC21486OooOO0o abstractC21486OooOO0o = (AbstractC21486OooOO0o) ((WeakReference) oooO00o.next()).get();
                    if (abstractC21486OooOO0o != null) {
                        abstractC21486OooOO0o.OooO0O0();
                    }
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
