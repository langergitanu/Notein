package o00000oo;

import androidx.compose.p002ui.window.PopupLayout;
import java.util.List;
import o0000Ooo.EnumC24238OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34642OooOo0o;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements InterfaceC34642OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f81290OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ EnumC24238OooOOO f81291OooO0O0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81292OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO(PopupLayout popupLayout, EnumC24238OooOOO enumC24238OooOOO) {
        this.f81290OooO00o = popupLayout;
        this.f81291OooO0O0 = enumC24238OooOOO;
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final oo000o.OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j) {
        this.f81290OooO00o.setParentLayoutDirection(this.f81291OooO0O0);
        return interfaceC34643OooOoO.o00oO0O(0, 0, C34436OooOoOO.f123455OooOo0o, OooO00o.f81292OooOo0o);
    }
}
