package o00000OO;

import android.graphics.Typeface;
import android.text.Spannable;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000000o.C24091OooOOOo;
import o000000o.C24093OooOOo0;
import o000000o.InterfaceC24103OooOooO;
import o00000O.C24104OooO0Oo;
import o00000O.OooOO0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oo0o0Oo.C34691OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooOOOO implements InterfaceC32510OooOOo0<C34691OooOOO0, Integer, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24104OooO0Oo.OooO00o f81247OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Spannable f81248OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(Spannable spannable, C24104OooO0Oo.OooO00o oooO00o) {
        super(3);
        this.f81248OooOo0o = spannable;
        this.f81247OooOo = oooO00o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final C32460OooOooO invoke(C34691OooOOO0 c34691OooOOO0, Integer num, Integer num2) {
        Typeface typeface;
        C34691OooOOO0 spanStyle = c34691OooOOO0;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        OooOOO0.OooO0oO(spanStyle, "spanStyle");
        C24093OooOOo0 fontWeight = spanStyle.f124945OooO0OO;
        if (fontWeight == null) {
            fontWeight = C24093OooOOo0.f81191OooOoO0;
        }
        o000000o.OooOOOO oooOOOO = spanStyle.f124946OooO0Oo;
        int i = oooOOOO != null ? oooOOOO.f81185OooO00o : 0;
        C24091OooOOOo c24091OooOOOo = spanStyle.f124948OooO0o0;
        int i2 = c24091OooOOOo != null ? c24091OooOOOo.f81186OooO00o : 1;
        C24104OooO0Oo.OooO00o oooO00o = this.f81247OooOo;
        OooOOO0.OooO0oO(fontWeight, "fontWeight");
        C24104OooO0Oo c24104OooO0Oo = C24104OooO0Oo.this;
        InterfaceC24103OooOooO interfaceC24103OooOooOOooO00o = c24104OooO0Oo.f81218OooO0o0.OooO00o(spanStyle.f124947OooO0o, fontWeight, i, i2);
        if (interfaceC24103OooOooOOooO00o instanceof InterfaceC24103OooOooO.OooO00o) {
            Object obj = ((InterfaceC24103OooOooO.OooO00o) interfaceC24103OooOooOOooO00o).f81207OooOo0o;
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj;
        } else {
            OooOO0O oooOO0O = new OooOO0O(interfaceC24103OooOooOOooO00o, c24104OooO0Oo.f81221OooOO0);
            c24104OooO0Oo.f81221OooOO0 = oooOO0O;
            Object obj2 = oooOO0O.f81236OooO0OO;
            OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj2;
        }
        this.f81248OooOo0o.setSpan(new o000000.OooOOO0(typeface), iIntValue, iIntValue2, 33);
        return C32460OooOooO.f116667OooO00o;
    }
}
