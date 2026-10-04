package o0o0O0oO;

import Oooo0o0.C21009OooOooO;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O0oO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$_pages$1", m80623f = "TrashBinListViewModel.kt", m80624l = {381, 384}, m80625m = "invokeSuspend")
public final class C30334OooOo0o extends AbstractC32476OooO implements oO0O000o.OooOo00<List<? extends Page>, Integer, HashSet<C32443OooOOO<? extends String, ? extends String>>, String, String, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f108149OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f108150OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f108151OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f108152OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f108153OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ int f108154OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Collection f108155OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Serializable f108156OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Serializable f108157OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public /* synthetic */ Object f108158Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108159Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30334OooOo0o(C30351Oooo0oO c30351Oooo0oO, Continuation<? super C30334OooOo0o> continuation) {
        super(6, continuation);
        this.f108159Oooo00O = c30351Oooo0oO;
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        int iIntValue = ((Number) obj2).intValue();
        C30334OooOo0o c30334OooOo0o = new C30334OooOo0o(this.f108159Oooo00O, (Continuation) serializable);
        c30334OooOo0o.f108155OooOoo0 = (List) obj;
        c30334OooOo0o.f108154OooOoo = iIntValue;
        c30334OooOo0o.f108156OooOooO = (HashSet) obj3;
        c30334OooOo0o.f108157OooOooo = (String) obj4;
        c30334OooOo0o.f108158Oooo000 = (String) obj5;
        return c30334OooOo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0106, code lost:
    
        if (r4 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0148 -> B:24:0x0149). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SimpleDateFormat simpleDateFormat;
        int i;
        HashSet hashSet;
        String str;
        C30351Oooo0oO c30351Oooo0oO;
        Collection collection;
        Iterator it;
        Object next;
        String recoverNoteId;
        boolean z;
        Object objOooOoOO;
        Object objOooOoOO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f108153OooOoOO;
        int i3 = 1;
        boolean z2 = false;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f108155OooOoo0;
            int i4 = this.f108154OooOoo;
            HashSet hashSet2 = (HashSet) this.f108156OooOooO;
            String str2 = (String) this.f108157OooOooo;
            String str3 = (String) this.f108158Oooo000;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TrashBinListViewModel");
            int size = list.size();
            List list2 = list;
            String strO000oOoO = oOo000Oo.OooOo.o000oOoO(list2, null, null, null, new C30333OooOo0O(), 31);
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(size, "_pages in trash size is ", ", userId: ", str2, ", ");
            sbOooO0OO.append(strO000oOoO);
            c20358OooO00o.OooO0o0(sbOooO0OO.toString(), new Object[0]);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3, Locale.getDefault());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            simpleDateFormat = simpleDateFormat2;
            i = i4;
            hashSet = hashSet2;
            str = str2;
            c30351Oooo0oO = this.f108159Oooo00O;
            collection = arrayList;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 == 1) {
                i = this.f108154OooOoo;
                recoverNoteId = this.f108151OooOoO;
                next = this.f108152OooOoO0;
                it = this.f108149OooOo;
                collection = this.f108150OooOo0o;
                c30351Oooo0oO = (C30351Oooo0oO) this.f108158Oooo000;
                simpleDateFormat = (SimpleDateFormat) this.f108157OooOooo;
                str = (String) this.f108156OooOooO;
                hashSet = (HashSet) this.f108155OooOoo0;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoOO2 = obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("TrashBinListViewModel");
                z = false;
                c20358OooO00o2.OooOO0O("_pages, warning: noteId is not equal recoverNoteId, original meta is " + ((NoteMeta) objOooOoOO2), new Object[0]);
                C27449o00O0OoO c27449o00O0OoO = c30351Oooo0oO.f108226OooO0Oo;
                this.f108155OooOoo0 = hashSet;
                this.f108156OooOooO = str;
                this.f108157OooOooo = simpleDateFormat;
                this.f108158Oooo000 = c30351Oooo0oO;
                this.f108150OooOo0o = collection;
                this.f108149OooOo = it;
                this.f108152OooOoO0 = next;
                this.f108151OooOoO = null;
                this.f108154OooOoo = i;
                this.f108153OooOoOO = 2;
                objOooOoOO = c27449o00O0OoO.OooOoOO(recoverNoteId, this);
                if (objOooOoOO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f108154OooOoo;
            Object obj2 = this.f108152OooOoO0;
            Iterator it3 = this.f108149OooOo;
            Collection collection2 = this.f108150OooOo0o;
            C30351Oooo0oO c30351Oooo0oO2 = (C30351Oooo0oO) this.f108158Oooo000;
            SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) this.f108157OooOooo;
            String str4 = (String) this.f108156OooOooO;
            HashSet hashSet3 = (HashSet) this.f108155OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            objOooOoOO = obj;
            z = false;
            hashSet = hashSet3;
            str = str4;
            simpleDateFormat = simpleDateFormat3;
            c30351Oooo0oO = c30351Oooo0oO2;
            collection = collection2;
            it = it3;
            NoteMeta noteMeta = (NoteMeta) objOooOoOO;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteMeta == null ? noteMeta.getUserId() : null, str)) {
                collection.add(obj2);
            }
            z2 = z;
            i3 = 1;
            if (it.hasNext()) {
                next = it.next();
                Page page = (Page) next;
                recoverNoteId = page.getRecoverNoteId();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(page.getNoteId(), page.getRecoverNoteId())) {
                    z = false;
                    C27449o00O0OoO c27449o00O0OoO2 = c30351Oooo0oO.f108226OooO0Oo;
                    this.f108155OooOoo0 = hashSet;
                    this.f108156OooOooO = str;
                    this.f108157OooOooo = simpleDateFormat;
                    this.f108158Oooo000 = c30351Oooo0oO;
                    this.f108150OooOo0o = collection;
                    this.f108149OooOo = it;
                    this.f108152OooOoO0 = next;
                    this.f108151OooOoO = null;
                    this.f108154OooOoo = i;
                    this.f108153OooOoOO = 2;
                    objOooOoOO = c27449o00O0OoO2.OooOoOO(recoverNoteId, this);
                    if (objOooOoOO != enumC32485OooO00o) {
                        obj2 = next;
                        NoteMeta noteMeta2 = (NoteMeta) objOooOoOO;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteMeta2 == null ? noteMeta2.getUserId() : null, str)) {
                        }
                        z2 = z;
                        i3 = 1;
                        if (it.hasNext()) {
                            boolean z3 = z2;
                            List<Page> list3 = (List) collection;
                            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                            for (Page page2 : list3) {
                                C32443OooOOO<Integer, Integer> tnSize = page2.getTnSize();
                                int iIntValue = tnSize.f116638OooOo0o.intValue();
                                int iIntValue2 = tnSize.f116637OooOo.intValue();
                                String id = page2.getId();
                                String recoverNoteId2 = page2.getRecoverNoteId();
                                String recoverNoteTitle = page2.getRecoverNoteTitle();
                                String tnPath = page2.getTnPath();
                                PaperOrientation paperOrientation = page2.getPaperOrientation();
                                boolean z4 = page2.getPaperTheme() instanceof PdfPaperTheme;
                                long creationTime = page2.getCreationTime();
                                long lastModificationTime = page2.getLastModificationTime();
                                boolean z5 = i == 1 ? true : z3;
                                Iterator it4 = hashSet.iterator();
                                ?? r9 = z3;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        r9 = -1;
                                        break;
                                    }
                                    Object next2 = it4.next();
                                    if (r9 < 0) {
                                        C34429OooOOo0.OooOOo();
                                        throw null;
                                    }
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C32443OooOOO) next2).f116637OooOo, page2.getId())) {
                                        break;
                                    }
                                    r9 = (r9 == true ? 1 : 0) + 1;
                                }
                                arrayList2.add(new NoteVO(id, recoverNoteId2, str, recoverNoteTitle, null, tnPath, iIntValue, iIntValue2, paperOrientation, z4, creationTime, lastModificationTime, z5, r9 > -1 ? true : z3, false, 1, 2, null, null, null, null, null, null, 0, simpleDateFormat.format(new Long(page2.getCreationTime())), false, false, 0L, false, null, false, 2130575360, null));
                            }
                            return arrayList2;
                        }
                    }
                    return enumC32485OooO00o;
                }
                C27449o00O0OoO c27449o00O0OoO3 = c30351Oooo0oO.f108226OooO0Oo;
                String noteId = page.getNoteId();
                this.f108155OooOoo0 = hashSet;
                this.f108156OooOooO = str;
                this.f108157OooOooo = simpleDateFormat;
                this.f108158Oooo000 = c30351Oooo0oO;
                this.f108150OooOo0o = collection;
                this.f108149OooOo = it;
                this.f108152OooOoO0 = next;
                this.f108151OooOoO = recoverNoteId;
                this.f108154OooOoo = i;
                this.f108153OooOoOO = i3;
                objOooOoOO2 = c27449o00O0OoO3.OooOoOO(noteId, this);
            }
        }
    }
}
