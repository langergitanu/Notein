package o0OoOO00;

import android.graphics.Color;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.domain.models.papertheme.paperstyle.BlankPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOO00.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$_defaultPageTemplateList$1", m80623f = "AddPageViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29013OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Page, Continuation<? super List<? extends Page>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102772OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102773OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29013OooOoOO(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Continuation<? super C29013OooOoOO> continuation) {
        super(2, continuation);
        this.f102772OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29013OooOoOO c29013OooOoOO = new C29013OooOoOO(this.f102772OooOo, continuation);
        c29013OooOoOO.f102773OooOo0o = obj;
        return c29013OooOoOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Page page, Continuation<? super List<? extends Page>> continuation) {
        return ((C29013OooOoOO) create(page, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List listOooOO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Page page = (Page) this.f102773OooOo0o;
        C27095OooOo0O c27095OooOo0O = this.f102772OooOo.f73851OooO;
        PaperOrientation orientation = page.getPaperOrientation();
        c27095OooOo0O.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(orientation, "orientation");
        c27095OooOo0O.f94414OooO00o.getClass();
        PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
        if (orientation == paperOrientation) {
            ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null);
            PaperStyle.Companion companion = PaperStyle.INSTANCE;
            BlankPaperStyle blank_paper = companion.getBLANK_PAPER();
            ThemeCategory themeCategory = o0OOOO00.OooOO0O.f94361OooOOOO;
            listOooOO0o = C34429OooOOo0.OooOO0o(new LambdaPaperTheme(colorPaperTheme, themeCategory, paperOrientation, null, blank_paper, null, 40, null), new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null), themeCategory, paperOrientation, null, companion.getLINE_PAPER_V(), null, 40, null), new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null), themeCategory, paperOrientation, null, companion.getSQUARE_PAPER_V(), null, 40, null), new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null), o0OOOO00.OooOO0O.f94362OooOOOo, paperOrientation, null, companion.getCORNELL_PAPER_V(), null, 40, null));
        } else {
            ColorPaperTheme colorPaperTheme2 = new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null);
            PaperOrientation paperOrientation2 = PaperOrientation.HORIZONTAL;
            PaperStyle.Companion companion2 = PaperStyle.INSTANCE;
            BlankPaperStyle blank_paper2 = companion2.getBLANK_PAPER();
            ThemeCategory themeCategory2 = o0OOOO00.OooOO0O.f94361OooOOOO;
            listOooOO0o = C34429OooOOo0.OooOO0o(new LambdaPaperTheme(colorPaperTheme2, themeCategory2, paperOrientation2, null, blank_paper2, null, 40, null), new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null), themeCategory2, paperOrientation2, null, companion2.getLINE_PAPER_H(), null, 40, null), new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null), themeCategory2, paperOrientation2, null, companion2.getSQUARE_PAPER_H(), null, 40, null), new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#FCF9F4"), 1, null), o0OOOO00.OooOO0O.f94362OooOOOo, paperOrientation2, null, companion2.getCORNELL_PAPER_V(), null, 40, null));
        }
        List list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Page("", "", page.getPaperSpec(), page.getPaperOrientation(), (PaperTheme) it.next(), null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524256, null));
        }
        return arrayList;
    }
}
