package o0Ooooo;

import com.orion.notein.domain.models.Label;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$pages$2", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29682OooOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends PagePreviewVO>, Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>>, Continuation<? super List<? extends PagePreviewVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f105228OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f105229OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends PagePreviewVO> list, Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>> map, Continuation<? super List<? extends PagePreviewVO>> continuation) {
        C29682OooOo0 c29682OooOo0 = new C29682OooOo0(3, continuation);
        c29682OooOo0.f105229OooOo0o = list;
        c29682OooOo0.f105228OooOo = map;
        return c29682OooOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List<PagePreviewVO> list = this.f105229OooOo0o;
        Map map = this.f105228OooOo;
        for (PagePreviewVO pagePreviewVO : list) {
            Iterable iterable = (List) map.get(new C32443OooOOO(pagePreviewVO.getId(), pagePreviewVO.getNoteId()));
            if (iterable == null) {
                iterable = C34434OooOoO.f123453OooOo0o;
            }
            Iterable<Label> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            for (Label label : iterable2) {
                arrayList.add(new ItemLabelVO(label.getId(), label.getName(), label.getColor(), label.getIndex()));
            }
            pagePreviewVO.setLabelList(arrayList);
        }
        return list;
    }
}
