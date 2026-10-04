package o0oOO0Oo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32513OooOo0O;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOO0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteSwitchViewModel$notes$1", m80623f = "NoteSwitchViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30817OooOOo0 extends AbstractC32476OooO implements InterfaceC32513OooOo0O<List<? extends NoteMeta>, String, String, Set<? extends String>, String, Boolean, com.orion.notein.p607ui.p609vo.OooO00o, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f110138OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f110139OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Set f110140OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f110141OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ String f110142OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f110143OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ boolean f110144OooOoo0;

    public C30817OooOOo0(Continuation<? super C30817OooOOo0> continuation) {
        super(8, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int tnWidth;
        int tnHeight;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f110139OooOo0o;
        String str = this.f110138OooOo;
        String str2 = this.f110141OooOoO0;
        Set set = this.f110140OooOoO;
        String str3 = this.f110142OooOoOO;
        boolean z = this.f110144OooOoo0;
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o = this.f110143OooOoo;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.getDefault());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            NoteMeta noteMeta = (NoteMeta) obj2;
            if (str2.length() == 0 || C33599OooOo0O.OooOoOO(noteMeta.getTitle(), str2, true)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NoteMeta noteMeta2 = (NoteMeta) it.next();
            if (noteMeta2.getUnboundedNote()) {
                tnWidth = 230;
                tnHeight = StyleIdentifier.GRID_TABLE_3_ACCENT_5;
            } else {
                tnWidth = noteMeta2.getTnWidth();
                tnHeight = noteMeta2.getTnHeight();
            }
            String id = noteMeta2.getId();
            boolean z2 = z;
            String title = noteMeta2.getTitle();
            String tnPath = noteMeta2.getTnPath();
            int i = tnWidth;
            PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
            int i2 = tnHeight;
            boolean z3 = noteMeta2.getPdfInfo() != null;
            long creationTime = noteMeta2.getCreationTime();
            long lastModificationTime = noteMeta2.getLastModificationTime();
            boolean zContains = set.contains(noteMeta2.getId());
            com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 = oooO00o;
            Iterator it2 = it;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new NoteVO(id, null, str, title, noteMeta2.getParentId(), tnPath, i, i2, paperOrientation, z3, creationTime, lastModificationTime, true, zContains, noteMeta2.getFavorite(), noteMeta2.getTotalPagesCount(), 0, null, null, null, null, null, null, 0, simpleDateFormat.format(new Long(noteMeta2.getCreationTime())), noteMeta2.getLockAdded(), z2 && noteMeta2.getLockAdded(), noteMeta2.getLastOpenedTime(), false, null, false, 1895694338, null));
            oooO00o = oooO00o2;
            set = set;
            arrayList2 = arrayList3;
            it = it2;
            simpleDateFormat = simpleDateFormat;
            z = z2;
        }
        ArrayList arrayList4 = arrayList2;
        try {
            final C30814OooOOOO c30814OooOOOO = new C30814OooOOOO(oooO00o);
            return OooOo.o00O0O(arrayList4, new Comparator() { // from class: o0oOO0Oo.OooOOOo
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return ((Number) c30814OooOOOO.invoke(obj3, obj4)).intValue();
                }
            });
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteSwitchViewModel");
            c20358OooO00o.OooO0Oo(e, "noteVOList sorted failed.", new Object[0]);
            return arrayList4;
        }
    }

    @Override // oO0O000o.InterfaceC32513OooOo0O
    public final Object o0Oo0oo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        C30817OooOOo0 c30817OooOOo0 = new C30817OooOOo0((Continuation) serializable);
        c30817OooOOo0.f110139OooOo0o = (List) obj;
        c30817OooOOo0.f110138OooOo = (String) obj2;
        c30817OooOOo0.f110141OooOoO0 = (String) obj3;
        c30817OooOOo0.f110140OooOoO = (Set) obj4;
        c30817OooOOo0.f110142OooOoOO = (String) obj5;
        c30817OooOOo0.f110144OooOoo0 = zBooleanValue;
        c30817OooOOo0.f110143OooOoo = (com.orion.notein.p607ui.p609vo.OooO00o) obj7;
        return c30817OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
