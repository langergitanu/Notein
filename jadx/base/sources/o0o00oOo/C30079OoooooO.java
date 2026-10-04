package o0o00oOo;

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
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oOo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$recentNoteList$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30079OoooooO extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends NoteMeta>, String, String, Boolean, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f107014OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f107015OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f107016OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f107017OooOoO0;

    /* JADX INFO: renamed from: o0o00oOo.OoooooO$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteMeta) t2).getLastModificationTime()), Long.valueOf(((NoteMeta) t).getLastModificationTime()));
        }
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        C30079OoooooO c30079OoooooO = new C30079OoooooO(5, (Continuation) serializable);
        c30079OoooooO.f107015OooOo0o = (List) obj;
        c30079OoooooO.f107014OooOo = (String) obj2;
        c30079OoooooO.f107017OooOoO0 = (String) obj3;
        c30079OoooooO.f107016OooOoO = zBooleanValue;
        return c30079OoooooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f107015OooOo0o;
        String str = this.f107014OooOo;
        String str2 = this.f107017OooOoO0;
        boolean z = this.f107016OooOoO;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        List listO00O0O = oOo000Oo.OooOo.o00O0O(list, new OooO00o());
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
        for (Iterator it = listO00O0O.iterator(); it.hasNext(); it = it) {
            NoteMeta noteMeta = (NoteMeta) it.next();
            boolean z2 = z;
            String id = noteMeta.getId();
            String title = noteMeta.getTitle();
            String tnPath = noteMeta.getTnPath();
            int tnWidth = noteMeta.getTnWidth();
            int tnHeight = noteMeta.getTnHeight();
            PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
            boolean z3 = noteMeta.getPdfInfo() != null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new NoteVO(id, null, str, title, noteMeta.getParentId(), tnPath, tnWidth, tnHeight, paperOrientation, z3, noteMeta.getCreationTime(), noteMeta.getLastModificationTime(), false, false, noteMeta.getFavorite(), noteMeta.getTotalPagesCount(), 0, null, null, null, null, null, null, 0, simpleDateFormat.format(new Long(noteMeta.getCreationTime())), noteMeta.getLockAdded(), z2, 0L, false, null, false, 2029912066, null));
            simpleDateFormat = simpleDateFormat;
            arrayList = arrayList2;
            z = z2;
        }
        return arrayList;
    }
}
