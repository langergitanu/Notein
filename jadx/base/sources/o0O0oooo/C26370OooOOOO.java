package o0O0oooo;

import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.penkit.models.DualLinkRefInfo;
import o0Ooo0o0.C29421OooO0o0;
import o0Ooo0o0.EnumC29418OooO0O0;
import o0Ooo0o0.EnumC29419OooO0OO;
import o0Ooo0oO.C29423OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26370OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90488OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90489OooOo0o;

    public /* synthetic */ C26370OooOOOO(Object obj, int i) {
        this.f90489OooOo0o = i;
        this.f90488OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        PagePaddingStyle pagePaddingStyleOooO0o;
        switch (this.f90489OooOo0o) {
            case 0:
                DualLinkRefInfo it = (DualLinkRefInfo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(it.getId(), (String) this.f90488OooOo));
            default:
                C29421OooO0o0 vo = (C29421OooO0o0) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                C29423OooO00o c29423OooO00oOooOooO = ((PagePaddingFragment) this.f90488OooOo).OooOooO();
                EnumC29419OooO0OO enumC29419OooO0OO = vo.f104348OooO00o;
                PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) c29423OooO00oOooOooO.f104369OooOOO.getValue();
                if (pagePaddingStyle != null) {
                    EnumC29418OooO0O0 enumC29418OooO0O0 = (EnumC29418OooO0O0) c29423OooO00oOooOooO.f104371OooOOOO.f121747OooOo0o.getValue();
                    if (!enumC29418OooO0O0.f104337OooOo.contains(enumC29419OooO0OO)) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("PagePaddingViewModel");
                        c20358OooO00o.OooOO0O("Pattern %s is not supported by layout %s", enumC29419OooO0OO, enumC29418OooO0O0);
                    } else if (C29423OooO00o.OooOO0(pagePaddingStyle) != enumC29419OooO0OO && (pagePaddingStyleOooO0o = c29423OooO00oOooOooO.OooO0o(enumC29418OooO0O0, enumC29419OooO0OO, null, c29423OooO00oOooOooO.OooOO0O(enumC29419OooO0OO), pagePaddingStyle)) != null) {
                        c29423OooO00oOooOooO.OooOOo0(pagePaddingStyleOooO0o);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
