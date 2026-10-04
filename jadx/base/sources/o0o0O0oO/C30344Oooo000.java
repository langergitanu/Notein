package o0o0O0oO;

import OooOoOO.C20519OooO0Oo;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24028OooOoO0;
import o0Oo.C28014OooO0Oo;
import o0OoO0oo.oo0oOO0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0O0oO.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$noteList$1", m80623f = "TrashBinListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30344Oooo000 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends NoteVO>, List<? extends NoteVO>, List<? extends NoteVO>, com.orion.notein.p607ui.p609vo.OooO00o, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f108197OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108198OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f108199OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f108200OooOoO0;

    /* JADX INFO: renamed from: o0o0O0oO.Oooo000$OooO00o */
    public /* synthetic */ class OooO00o extends C24028OooOoO0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f108201OooOo0o = new OooO00o(NoteVO.class, "name", "getName()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.C24028OooOoO0, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return ((NoteVO) obj).getName();
        }
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        C30344Oooo000 c30344Oooo000 = new C30344Oooo000(5, (Continuation) serializable);
        c30344Oooo000.f108198OooOo0o = (List) obj;
        c30344Oooo000.f108197OooOo = (List) obj2;
        c30344Oooo000.f108200OooOoO0 = (List) obj3;
        c30344Oooo000.f108199OooOoO = (com.orion.notein.p607ui.p609vo.OooO00o) obj4;
        return c30344Oooo000.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i = 1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108198OooOo0o;
        List list2 = this.f108197OooOo;
        List list3 = this.f108200OooOoO0;
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o = this.f108199OooOoO;
        ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(list, list2), list3);
        try {
            final C28014OooO0Oo c28014OooO0Oo = new C28014OooO0Oo(oooO00o, 1);
            return oOo000Oo.OooOo.o00O0O(arrayListOooooOO, new Comparator() { // from class: o0o0O0oO.OooOooo
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((Number) c28014OooO0Oo.invoke(obj2, obj3)).intValue();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new oo0oOO0(list, i));
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TrashBinListViewModel");
            String str = (String) c32447OooOOoOooO0OO.getValue();
            String strOooO0O0 = C32435OooO0Oo.OooO0O0(e);
            StringBuilder sb = new StringBuilder("TrashBinListVm.notelist.sortwith error for sortKey: ");
            sb.append(oooO00o);
            sb.append(", list names: ");
            sb.append(str);
            sb.append(", message: ");
            c20358OooO00o.OooO0OO(androidx.concurrent.futures.OooO00o.OooO0OO(sb, strOooO0O0, "."), new Object[0]);
            return arrayListOooooOO;
        }
    }
}
