package o0o0OO;

import com.orion.notein.domain.models.note.Comment;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: renamed from: o0o0OO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$pages$1", m80623f = "TiledPageViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30372OooOOo extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends Page>, Map<String, ? extends Comment>, Integer, HashSet<String>, Continuation<? super List<? extends TiledPagePreviewVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f108398OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108399OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ HashSet f108400OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ int f108401OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108402OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30372OooOOo(Continuation continuation, C30367OooO0o0 c30367OooO0o0) {
        super(5, continuation);
        this.f108402OooOoOO = c30367OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int iIntValue = ((Number) obj3).intValue();
        C30372OooOOo c30372OooOOo = new C30372OooOOo((Continuation) serializable, this.f108402OooOoOO);
        c30372OooOOo.f108399OooOo0o = (List) obj;
        c30372OooOOo.f108398OooOo = (Map) obj2;
        c30372OooOOo.f108401OooOoO0 = iIntValue;
        c30372OooOOo.f108400OooOoO = (HashSet) obj4;
        return c30372OooOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108399OooOo0o;
        Map map = this.f108398OooOo;
        int i = this.f108401OooOoO0;
        HashSet hashSet = this.f108400OooOoO;
        Throwable th = null;
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                Throwable th2 = th;
                C34429OooOOo0.OooOOo();
                throw th2;
            }
            Page page = (Page) obj2;
            C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
            Throwable th3 = th;
            arrayList.add(new TiledPagePreviewVO(page.getId(), i2, page.getTnPath(), tnSize.f116638OooOo0o.intValue(), tnSize.f116637OooOo.intValue(), page.getPaperTheme() instanceof LocalResPaperTheme, page.getPaperOrientation(), list.size() != 1, page.getLastModificationTime(), i == 1, hashSet.contains(page.getId()), map.containsKey(page.getId()), i2 == ((Number) this.f108402OooOoOO.f108344OooOo0.getValue()).intValue(), page.getRotationDirection()));
            th = th3;
            i2 = i3;
        }
        return arrayList;
    }
}
