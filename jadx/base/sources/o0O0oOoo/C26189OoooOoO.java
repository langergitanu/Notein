package o0O0oOoo;

import OooOooo.C20803Ooooo0o;
import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.C21348Ooooo0o;
import com.orion.niui.components.button.TextButtonView;
import o0000Ooo.C24232OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0o0Oo.C34698OooOo00;

/* JADX INFO: renamed from: o0O0oOoo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26189OoooOoO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24232OooO0o0 f89414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextButtonView f89415OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f89416OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24232OooO0o0 f89417OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C34698OooOo00 f89418OooOoOO;

    public C26189OoooOoO(TextButtonView textButtonView, C24232OooO0o0 c24232OooO0o0, C24232OooO0o0 c24232OooO0o02, float f, C34698OooOo00 c34698OooOo00) {
        this.f89415OooOo0o = textButtonView;
        this.f89414OooOo = c24232OooO0o0;
        this.f89417OooOoO0 = c24232OooO0o02;
        this.f89416OooOoO = f;
        this.f89418OooOoOO = c34698OooOo00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            TextButtonView textButtonView = this.f89415OooOo0o;
            String textState = textButtonView.getTextState();
            boolean shouldFillMaxWidthState = textButtonView.getShouldFillMaxWidthState();
            InterfaceC21233OooO0o interfaceC21233OooO0oOooO0OO = InterfaceC21233OooO0o.OooO00o.f61602OooOo0o;
            if (shouldFillMaxWidthState) {
                interfaceC21233OooO0oOooO0OO = C20803Ooooo0o.OooO0OO(interfaceC21233OooO0oOooO0OO);
            }
            boolean enabledState = textButtonView.getEnabledState();
            EnumC26187OoooOOo variantState = textButtonView.getVariantState();
            C21348Ooooo0o c21348Ooooo0oM80728getAccentColorStateQN2ZGVo = textButtonView.m80728getAccentColorStateQN2ZGVo();
            long j = c21348Ooooo0oM80728getAccentColorStateQN2ZGVo != null ? c21348Ooooo0oM80728getAccentColorStateQN2ZGVo.f61768OooO00o : C21348Ooooo0o.f61766OooO0oO;
            interfaceC21033OooOOOO2.OooOo00(1433067297);
            boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(textButtonView);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooOo0o || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new C26188OoooOo0(textButtonView, 0);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            InterfaceC21233OooO0o interfaceC21233OooO0o = interfaceC21233OooO0oOooO0OO;
            o000oOoO.OooO00o(textState, interfaceC21233OooO0o, this.f89414OooOo, this.f89417OooOoO0, this.f89416OooOoO, this.f89418OooOoOO, variantState, j, enabledState, null, null, (oO0O000o.OooO00o) objOooOo0, interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
