package o0o0O0oO;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o0O0oO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$_pagesInCurrentFolder$1", m80623f = "TrashBinListViewModel.kt", m80624l = {199, 200, 202, 213}, m80625m = "invokeSuspend")
public final class C30330OooOo extends AbstractC32476OooO implements InterfaceC32509OooOOo<C32443OooOOO<? extends NoteVO, ? extends NoteVO>, String, Boolean, Continuation<? super List<? extends Page>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f108136OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f108137OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108138OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108139OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30330OooOo(C30351Oooo0oO c30351Oooo0oO, Continuation<? super C30330OooOo> continuation) {
        super(4, continuation);
        this.f108138OooOoO = c30351Oooo0oO;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(C32443OooOOO<? extends NoteVO, ? extends NoteVO> c32443OooOOO, String str, Boolean bool, Continuation<? super List<? extends Page>> continuation) {
        bool.booleanValue();
        C30330OooOo c30330OooOo = new C30330OooOo(this.f108138OooOoO, continuation);
        c30330OooOo.f108139OooOoO0 = c32443OooOOO;
        return c30330OooOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r11 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[LOOP:5: B:24:0x0075->B:26:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Iterator it2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108136OooOo;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C30351Oooo0oO c30351Oooo0oO = this.f108138OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (((NoteVO) ((C32443OooOOO) this.f108139OooOoO0).f116638OooOo0o) == null) {
                InterfaceC33721OooO0o<String> interfaceC33721OooO0o = c30351Oooo0oO.f108237OooOOOo;
                this.f108136OooOo = 1;
                obj = C25252OooO0Oo.OooOOo(interfaceC33721OooO0o, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            return c34434OooOoO;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = this.f108137OooOo0o;
                    C30351Oooo0oO c30351Oooo0oO2 = (C30351Oooo0oO) this.f108139OooOoO0;
                    C32446OooOOOo.OooO0O0(obj);
                    c30351Oooo0oO = c30351Oooo0oO2;
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str = (String) entry.getKey();
                        Set set = (Set) entry.getValue();
                        C27020OooOoO0 c27020OooOoO0 = c30351Oooo0oO.f108229OooO0oO;
                        this.f108139OooOoO0 = c30351Oooo0oO;
                        this.f108137OooOo0o = it2;
                        this.f108136OooOo = 4;
                        if (c27020OooOoO0.OooO0O0(str, set, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    return c34434OooOoO;
                }
                C32446OooOOOo.OooO0O0(obj);
                List<Page> list = (List) obj;
                ArrayList<Page> arrayList = new ArrayList();
                for (Page page : list) {
                    PaperTheme paperTheme = page.getPaperTheme();
                    if (!(paperTheme instanceof LocalResPaperTheme) || !((LocalResPaperTheme) paperTheme).isInvalid()) {
                        page = null;
                    }
                    if (page != null) {
                        arrayList.add(page);
                    }
                }
                if (arrayList.isEmpty()) {
                    return list;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Page page2 : arrayList) {
                    List list2 = (List) linkedHashMap.get(page2.getNoteId());
                    if (list2 == null) {
                        linkedHashMap.put(page2.getNoteId(), C34429OooOOo0.OooOOO(page2));
                    } else {
                        list2.add(page2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List list3 = (List) entry2.getValue();
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((Page) it3.next()).getId());
                    }
                    arrayList2.add(new C32443OooOOO(str2, oOo000Oo.OooOo.o0OO00O(arrayList3)));
                }
                it2 = C34444Oooo0O0.OooOO0o(arrayList2).entrySet().iterator();
                while (it2.hasNext()) {
                }
                return c34434OooOoO;
            }
            C32446OooOOOo.OooO0O0(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList4.add(((NoteMeta) it.next()).getId());
            }
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList4);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TrashBinListViewModel");
            c20358OooO00o.OooO0o0("allNoteIds: " + setO0OO00O, new Object[0]);
            C27020OooOoO0 c27020OooOoO02 = c30351Oooo0oO.f108229OooO0oO;
            this.f108136OooOo = 3;
            obj = c27020OooOoO02.OooO0oo(setO0OO00O, this);
        }
        InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0oOooOOo = c30351Oooo0oO.f108226OooO0Oo.OooOOo((String) obj);
        this.f108136OooOo = 2;
        obj = C25252OooO0Oo.OooOOo(interfaceC33721OooO0oOooOOo, this);
        if (obj != enumC32485OooO00o) {
            Iterable iterable2 = (Iterable) obj;
            ArrayList arrayList42 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList42);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("TrashBinListViewModel");
            c20358OooO00o2.OooO0o0("allNoteIds: " + setO0OO00O2, new Object[0]);
            C27020OooOoO0 c27020OooOoO022 = c30351Oooo0oO.f108229OooO0oO;
            this.f108136OooOo = 3;
            obj = c27020OooOoO022.OooO0oo(setO0OO00O2, this);
        }
        return enumC32485OooO00o;
    }
}
