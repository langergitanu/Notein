package o0oOOO0o;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import java.util.Iterator;
import o0Ooo0Oo.C29404OooO00o;
import o0Ooo0Oo.C29406OooO0OO;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oO.C29436OooOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOOO0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30832OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PagePaddingFragment f110182OooO00o;

    public C30832OooOO0O(PagePaddingFragment pagePaddingFragment) {
        this.f110182OooO00o = pagePaddingFragment;
    }

    public final void OooO00o(int i) {
        Object next;
        PagePaddingFragment pagePaddingFragment = this.f110182OooO00o;
        C29404OooO00o c29404OooO00o = pagePaddingFragment.f74940Ooooo00;
        if (c29404OooO00o == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("paddingColorAdapter");
            throw null;
        }
        Iterable iterable = c29404OooO00o.f66021OooO00o.f65811OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C29406OooO0OO) next).f104280OooO0O0) {
                    break;
                }
            }
        }
        C29406OooO0OO c29406OooO0OO = (C29406OooO0OO) next;
        if (c29406OooO0OO != null) {
            C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29423OooO00oOooOooO);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            int i2 = c29406OooO0OO.f104279OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0, null, new C29436OooOO0(c29423OooO00oOooOooO, i2, i, null), 2);
            PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) c29423OooO00oOooOooO.f104369OooOOO.getValue();
            LambdaPaperTheme lambdaPaperThemeOooOO0o = pagePaddingStyle == null ? null : C29423OooO00o.OooOO0o(pagePaddingStyle);
            PaperTheme baseTheme = lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.getBaseTheme() : null;
            if ((baseTheme instanceof ColorPaperTheme ? ((ColorPaperTheme) baseTheme).getColor() : -1) == i2) {
                c29423OooO00oOooOooO.OooOOOO(i);
            }
            pagePaddingFragment.OooOooO().OooOOOO(i);
        }
    }
}
