package o0OoOO00;

import androidx.core.app.FrameMetricsAggregator;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOO00.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$themeList$1", m80623f = "AddPageViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29022Oooo0OO extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends Page>, Map<String, ? extends String>, Integer, Integer, Continuation<? super List<? extends ThemeVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f102828OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f102829OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ int f102830OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ int f102831OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102832OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29022Oooo0OO(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Continuation<? super C29022Oooo0OO> continuation) {
        super(5, continuation);
        this.f102832OooOoOO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        C29022Oooo0OO c29022Oooo0OO = new C29022Oooo0OO(this.f102832OooOoOO, (Continuation) serializable);
        c29022Oooo0OO.f102829OooOo0o = (List) obj;
        c29022Oooo0OO.f102828OooOo = (Map) obj2;
        c29022Oooo0OO.f102831OooOoO0 = iIntValue;
        c29022Oooo0OO.f102830OooOoO = iIntValue2;
        return c29022Oooo0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO;
        ThemeVO themeVO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f102829OooOo0o;
        Map map = this.f102828OooOo;
        int i = this.f102831OooOoO0;
        int i2 = this.f102830OooOoO;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oooO0OO = this.f102832OooOoOO;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            PaperTheme paperTheme = ((Page) next).getPaperTheme();
            if (paperTheme != null) {
                C27570o00oOoo0 c27570o00oOoo0 = oooO0OO.f73854OooO0o0;
                c27570o00oOoo0.getClass();
                if (paperTheme.availableFromLocal(c27570o00oOoo0.f96739OooO00o)) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i4 = i3 + 1;
            ThemeVO themeVO2 = null;
            if (i3 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            Page page = (Page) obj2;
            PaperTheme paperTheme2 = page.getPaperTheme();
            String str = paperTheme2 != null ? (String) map.get(paperTheme2.getMyTemplateId()) : null;
            PaperTheme paperTheme3 = page.getPaperTheme();
            if (paperTheme3 instanceof LambdaPaperTheme) {
                PaperTheme paperTheme4 = page.getPaperTheme();
                kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme4, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.LambdaPaperTheme");
                LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) paperTheme4;
                themeVO = new ThemeVO(new LambdaPaperTheme(new ColorPaperTheme(null, i2, 1, null), lambdaPaperTheme.getCategory(), lambdaPaperTheme.getOrientation(), null, lambdaPaperTheme.getPaperStyle(), null, 40, null), i3 == i, 0, 0, false, false, null, str, false, false, 892, null);
            } else if (paperTheme3 instanceof LocalUriPaperTheme) {
                PaperTheme paperTheme5 = page.getPaperTheme();
                kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme5, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.LocalUriPaperTheme");
                LocalUriPaperTheme localUriPaperTheme = (LocalUriPaperTheme) paperTheme5;
                C32443OooOOO c32443OooOOOOooO0o0 = com.orion.notein.p607ui.noteeditor.addpage.OooO0OO.OooO0o0(oooO0OO, page.getPaperSpec(), localUriPaperTheme);
                themeVO = new ThemeVO(LocalUriPaperTheme.copy$default(localUriPaperTheme, null, null, null, null, null, null, null, 127, null), i3 == i, ((Number) c32443OooOOOOooO0o0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0o0.f116637OooOo).intValue(), false, false, null, str, false, false, 880, null);
            } else if (paperTheme3 instanceof PdfPaperTheme) {
                PaperTheme paperTheme6 = page.getPaperTheme();
                kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme6, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme6;
                C32443OooOOO c32443OooOOOOooO0o02 = com.orion.notein.p607ui.noteeditor.addpage.OooO0OO.OooO0o0(oooO0OO, page.getPaperSpec(), pdfPaperTheme);
                themeVO = new ThemeVO(PdfPaperTheme.copy$default(pdfPaperTheme, null, null, 0, null, null, null, 63, null), i3 == i, ((Number) c32443OooOOOOooO0o02.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0o02.f116637OooOo).intValue(), false, false, null, str, false, false, 880, null);
            } else if (paperTheme3 instanceof LocalResPaperTheme) {
                PaperTheme paperTheme7 = page.getPaperTheme();
                kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme7, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.LocalResPaperTheme");
                themeVO = new ThemeVO(LocalResPaperTheme.copy$default((LocalResPaperTheme) paperTheme7, null, null, null, null, 0, 0, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), i3 == i, 0, 0, false, false, null, str, false, false, 892, null);
            } else if (paperTheme3 instanceof PdfSetPaperTheme) {
                PaperTheme paperTheme8 = page.getPaperTheme();
                kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme8, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfSetPaperTheme");
                themeVO = new ThemeVO(PdfSetPaperTheme.copy$default((PdfSetPaperTheme) paperTheme8, null, null, 0, null, null, null, null, 127, null), i3 == i, 0, 0, false, false, null, str, false, false, 892, null);
            } else {
                arrayList2.add(themeVO2);
                i3 = i4;
            }
            themeVO2 = themeVO;
            arrayList2.add(themeVO2);
            i3 = i4;
        }
        return oOo000Oo.OooOo.Oooo0o0(arrayList2);
    }
}
