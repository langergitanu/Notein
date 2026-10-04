package o0o0OOO;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31091ooOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OOO.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$coverThemes$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30515OooooOo extends AbstractC32476OooO implements InterfaceC32509OooOOo<PaperTheme, PaperOrientation, List<? extends PaperTheme>, Continuation<? super List<? extends o0oOoOo.o0OoOo0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ PaperOrientation f108958OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ PaperTheme f108959OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f108960OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(PaperTheme paperTheme, PaperOrientation paperOrientation, List<? extends PaperTheme> list, Continuation<? super List<? extends o0oOoOo.o0OoOo0>> continuation) {
        C30515OooooOo c30515OooooOo = new C30515OooooOo(4, continuation);
        c30515OooooOo.f108959OooOo0o = paperTheme;
        c30515OooooOo.f108958OooOo = paperOrientation;
        c30515OooooOo.f108960OooOoO0 = list;
        return c30515OooooOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        PaperTheme paperTheme = this.f108959OooOo0o;
        PaperOrientation paperOrientation = this.f108958OooOo;
        List list = this.f108960OooOoO0;
        ArrayList<PaperTheme> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PaperTheme) obj2).getOrientation() == paperOrientation) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (PaperTheme paperTheme2 : arrayList) {
            arrayList2.add(new ThemeVO(paperTheme2, kotlin.jvm.internal.OooOOO0.OooO0O0(paperTheme2, paperTheme), 0, 0, true, false, null, null, false, false, 972, null));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            ThemeCategory category = ((ThemeVO) obj3).getPaperTheme().getCategory();
            Object arrayList3 = linkedHashMap.get(category);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(category, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ThemeCategory themeCategory = (ThemeCategory) entry.getKey();
            arrayList4.add(new o0oOoOo.o0OoOo0(new C31091ooOO(themeCategory.getId(), themeCategory.getName(), C34434OooOoO.f123453OooOo0o, false), (List) entry.getValue()));
        }
        return arrayList4;
    }
}
