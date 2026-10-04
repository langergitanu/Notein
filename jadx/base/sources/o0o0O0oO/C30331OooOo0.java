package o0o0O0oO;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32512OooOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0O0oO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$_notes$1", m80623f = "TrashBinListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30331OooOo0 extends AbstractC32476OooO implements InterfaceC32512OooOo0<List<? extends NoteMeta>, Integer, HashSet<String>, String, String, Boolean, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f108140OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108141OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ String f108142OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ HashSet f108143OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ String f108144OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ boolean f108145OooOoo0;

    public C30331OooOo0(Continuation<? super C30331OooOo0> continuation) {
        super(7, continuation);
    }

    @Override // oO0O000o.InterfaceC32512OooOo0
    public final Object OoooO0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        C30331OooOo0 c30331OooOo0 = new C30331OooOo0((Continuation) serializable);
        c30331OooOo0.f108141OooOo0o = (List) obj;
        c30331OooOo0.f108140OooOo = iIntValue;
        c30331OooOo0.f108143OooOoO0 = (HashSet) obj3;
        c30331OooOo0.f108142OooOoO = (String) obj4;
        c30331OooOo0.f108144OooOoOO = (String) obj5;
        c30331OooOo0.f108145OooOoo0 = zBooleanValue;
        return c30331OooOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108141OooOo0o;
        int i = this.f108140OooOo;
        HashSet hashSet = this.f108143OooOoO0;
        String str = this.f108142OooOoO;
        String str2 = this.f108144OooOoOO;
        boolean z = this.f108145OooOoo0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            NoteMeta noteMeta = (NoteMeta) it.next();
            boolean z2 = z;
            String id = noteMeta.getId();
            String title = noteMeta.getTitle();
            String tnPath = noteMeta.getTnPath();
            int tnWidth = noteMeta.getTnWidth();
            int tnHeight = noteMeta.getTnHeight();
            PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
            boolean z3 = true;
            boolean z4 = noteMeta.getPdfInfo() != null;
            long creationTime = noteMeta.getCreationTime();
            long lastModificationTime = noteMeta.getLastModificationTime();
            if (i != 1) {
                z3 = false;
            }
            ArrayList arrayList2 = arrayList;
            boolean z5 = z3;
            arrayList2.add(new NoteVO(id, null, str, title, noteMeta.getParentId(), tnPath, tnWidth, tnHeight, paperOrientation, z4, creationTime, lastModificationTime, z5, hashSet.contains(noteMeta.getId()), noteMeta.getFavorite(), noteMeta.getTotalPagesCount(), 0, null, null, null, null, null, null, 0, simpleDateFormat.format(new Long(noteMeta.getCreationTime())), noteMeta.getLockAdded(), z2, 0L, false, null, false, 2029912066, null));
            arrayList = arrayList2;
            simpleDateFormat = simpleDateFormat;
            z = z2;
            i = i;
        }
        return arrayList;
    }
}
