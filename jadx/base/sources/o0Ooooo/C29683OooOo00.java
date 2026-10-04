package o0Ooooo;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.search.TextSearchResult;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Ooooo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$pages$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29683OooOo00 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends Page>, NoteContent, String, List<? extends TextSearchResult>, Continuation<? super List<? extends PagePreviewVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ NoteContent f105230OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f105231OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ List f105232OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f105233OooOoO0;

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        C29683OooOo00 c29683OooOo00 = new C29683OooOo00(5, (Continuation) serializable);
        c29683OooOo00.f105231OooOo0o = (List) obj;
        c29683OooOo00.f105230OooOo = (NoteContent) obj2;
        c29683OooOo00.f105233OooOoO0 = (String) obj3;
        c29683OooOo00.f105232OooOoO = (List) obj4;
        return c29683OooOo00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        PagePreviewVO pagePreviewVO;
        boolean z = true;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f105231OooOo0o;
        NoteContent noteContent = this.f105230OooOo;
        String str = this.f105233OooOoO0;
        List list2 = this.f105232OooOoO;
        if (str.length() != 0) {
            List<TextSearchResult> list3 = list2;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            for (TextSearchResult textSearchResult : list3) {
                int pageIndex = textSearchResult.getPageIndex();
                Page page = textSearchResult.getPage();
                C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
                int iIntValue = tnSize.f116638OooOo0o.intValue();
                int iIntValue2 = tnSize.f116637OooOo.intValue();
                RectF rectF = (RectF) oOo000Oo.OooOo.Oooo(textSearchResult.getTextRectList());
                PointF pointFOooO0OO = rectF != null ? o00OO0O0.OooO0O0.OooO0OO(rectF) : null;
                arrayList.add(new PagePreviewVO(page.getId(), page.getNoteId(), pageIndex, textSearchResult.getTnPath(), iIntValue, iIntValue2, (pageIndex != noteContent.getSavedPageIndex() || noteContent.getUnboundedNote()) ? false : z, false, false, true, !page.getUnbounded(), pointFOooO0OO != null ? new Point((int) pointFOooO0OO.x, (int) pointFOooO0OO.y) : null, null, page.getRotationDirection(), 4096, null));
                z = true;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            Page page2 = (Page) obj2;
            C32443OooOOO<Integer, Integer> tnSize2 = page2.getTnSize();
            int iIntValue3 = tnSize2.f116638OooOo0o.intValue();
            int iIntValue4 = tnSize2.f116637OooOo.intValue();
            if (iIntValue3 == 0 || iIntValue4 == 0) {
                pagePreviewVO = null;
            } else {
                pagePreviewVO = new PagePreviewVO(page2.getId(), page2.getNoteId(), i, page2.getTnPath(), iIntValue3, iIntValue4, i == noteContent.getSavedPageIndex() && !noteContent.getUnboundedNote(), page2.getPaperTheme() instanceof LocalResPaperTheme, list.size() != 1, false, !page2.getUnbounded(), null, null, page2.getRotationDirection(), 6144, null);
            }
            if (pagePreviewVO != null) {
                arrayList2.add(pagePreviewVO);
            }
            i = i2;
        }
        return arrayList2;
    }
}
