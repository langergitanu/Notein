package o0o0O0o0;

import Oooo0.o000000O;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0o.o0O0O00;
import o0OOoooO.C27996OooO00o;
import o0o00oo.C30100OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32513OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0o0O0o0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$searchResultList$1", m80623f = "SearchViewModel.kt", m80624l = {StyleIdentifier.COLORFUL_LIST_ACCENT_6, 302}, m80625m = "invokeSuspend")
public final class C30295OooO extends AbstractC32476OooO implements InterfaceC32513OooOo0O<String, com.orion.notein.p607ui.p609vo.OooO00o, C32443OooOOO<? extends NoteVO, ? extends NoteVO>, String, Boolean, String, Boolean, Continuation<? super C32443OooOOO<? extends String, ? extends List<? extends NoteVO>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f107965OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30296OooO00o f107966OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Folder f107967OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f107968OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f107969OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f107970OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f107971OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f107972OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public PaperOrientation f107973OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ Object f107974Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f107975Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f107976Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Collection f107977Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f107978Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f107979Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public long f107980Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ String f107981Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f107982Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ com.orion.notein.p607ui.p609vo.OooO00o f107983Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Serializable f107984Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ C30296OooO00o f107985OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public /* synthetic */ boolean f107986OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30295OooO(Continuation continuation, C30296OooO00o c30296OooO00o) {
        super(8, continuation);
        this.f107985OoooO0 = c30296OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x023c -> B:40:0x025f). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        com.orion.notein.p607ui.p609vo.OooO00o oooO00o;
        String str2;
        Object objOooO0o0;
        boolean z;
        SimpleDateFormat simpleDateFormat;
        Iterator it;
        Collection collection;
        String str3;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107982Oooo0o0;
        C30296OooO00o c30296OooO00o = this.f107985OoooO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = this.f107981Oooo0o;
            oooO00o = this.f107983Oooo0oO;
            C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f107984Oooo0oo;
            str2 = (String) this.f107974Oooo;
            boolean z2 = this.f107986OoooO00;
            NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
            String id = noteVO != null ? noteVO.getId() : null;
            this.f107981Oooo0o = str;
            this.f107983Oooo0oO = oooO00o;
            this.f107984Oooo0oo = str2;
            this.f107986OoooO00 = z2;
            this.f107982Oooo0o0 = 1;
            objOooO0o0 = C30296OooO00o.OooO0o0(c30296OooO00o, str, id, this);
            if (objOooO0o0 != enumC32485OooO00o) {
                z = z2;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            boolean z3 = this.f107986OoooO00;
            str2 = (String) this.f107984Oooo0oo;
            oooO00o = this.f107983Oooo0oO;
            str = this.f107981Oooo0o;
            C32446OooOOOo.OooO0O0(obj);
            z = z3;
            objOooO0o0 = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.f107980Oooo0OO;
            long j2 = this.f107979Oooo0O0;
            int i2 = this.f107975Oooo0;
            int i3 = this.f107978Oooo00o;
            Collection collection2 = this.f107977Oooo00O;
            String str4 = this.f107976Oooo000;
            PaperOrientation paperOrientation = this.f107973OooOooo;
            String str5 = this.f107972OooOooO;
            String str6 = this.f107970OooOoo;
            String str7 = this.f107971OooOoo0;
            String str8 = this.f107969OooOoOO;
            Folder folder = this.f107967OooOoO;
            Iterator it2 = this.f107968OooOoO0;
            Collection collection3 = this.f107965OooOo;
            C30296OooO00o c30296OooO00o2 = this.f107966OooOo0o;
            List list2 = (List) this.f107974Oooo;
            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) this.f107984Oooo0oo;
            com.orion.notein.p607ui.p609vo.OooO00o oooO00o2 = this.f107983Oooo0oO;
            String str9 = this.f107981Oooo0o;
            C32446OooOOOo.OooO0O0(obj);
            String str10 = str9;
            int i4 = i2;
            int i5 = i3;
            long j3 = j;
            long j4 = j2;
            PaperOrientation paperOrientation2 = paperOrientation;
            Iterator it3 = it2;
            Collection collection4 = collection3;
            List list3 = list2;
            SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
            Object objOooO0o = obj;
            String str11 = str7;
            String str12 = str8;
            C30296OooO00o c30296OooO00o3 = c30296OooO00o2;
            oooO00o = oooO00o2;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            int iIntValue = ((Number) objOooO0o).intValue();
            boolean favorite = folder.getFavorite();
            Integer coverColor = folder.getCoverColor();
            collection2.add(new NoteVO(str12, null, str11, str15, str13, str14, i5, i4, paperOrientation2, false, j4, j3, false, false, favorite, iIntValue, 1, str10, null, null, null, null, null, coverColor == null ? coverColor.intValue() : C27996OooO00o.f99274OooO00o, simpleDateFormat3.format(new Long(folder.getCreationTime())), false, false, 0L, false, null, false, 2122055682, null));
            it = it3;
            c30296OooO00o = c30296OooO00o3;
            list = list3;
            simpleDateFormat = simpleDateFormat3;
            collection = collection4;
            str3 = str10;
            if (it.hasNext()) {
                Folder folder2 = (Folder) it.next();
                String id2 = folder2.getId();
                String userId = folder2.getUserId();
                String title = folder2.getTitle();
                String tnPath = folder2.getTnPath();
                int iOooO0o = o000000O.OooO0o(93);
                int iOooO0o2 = o000000O.OooO0o(130);
                Collection collection5 = collection;
                PaperOrientation paperOrientation3 = PaperOrientation.VERTICAL;
                long creationTime = folder2.getCreationTime();
                long lastModificationTime = folder2.getLastModificationTime();
                EnumC32485OooO00o enumC32485OooO00o2 = enumC32485OooO00o;
                String parentId = folder2.getParentId();
                C27600o0ooOO0 c27600o0ooOO0 = c30296OooO00o.f107990OooO0o0;
                String id3 = folder2.getId();
                this.f107981Oooo0o = str3;
                this.f107983Oooo0oO = oooO00o;
                this.f107984Oooo0oo = simpleDateFormat;
                this.f107974Oooo = list;
                this.f107966OooOo0o = c30296OooO00o;
                C30296OooO00o c30296OooO00o4 = c30296OooO00o;
                Collection collection6 = collection5;
                this.f107965OooOo = collection6;
                this.f107968OooOoO0 = it;
                this.f107967OooOoO = folder2;
                this.f107969OooOoOO = id2;
                this.f107971OooOoo0 = userId;
                this.f107970OooOoo = title;
                this.f107972OooOooO = tnPath;
                this.f107973OooOooo = paperOrientation3;
                this.f107976Oooo000 = parentId;
                this.f107977Oooo00O = collection6;
                this.f107978Oooo00o = iOooO0o;
                Iterator it4 = it;
                this.f107975Oooo0 = iOooO0o2;
                this.f107979Oooo0O0 = creationTime;
                this.f107980Oooo0OO = lastModificationTime;
                this.f107982Oooo0o0 = 2;
                c27600o0ooOO0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0O0O00(c27600o0ooOO0, id3, null), this);
                enumC32485OooO00o = enumC32485OooO00o2;
                if (objOooO0o != enumC32485OooO00o) {
                    i4 = iOooO0o2;
                    i5 = iOooO0o;
                    str10 = str3;
                    str11 = userId;
                    paperOrientation2 = paperOrientation3;
                    it3 = it4;
                    j4 = creationTime;
                    j3 = lastModificationTime;
                    collection2 = collection5;
                    folder = folder2;
                    str12 = id2;
                    str13 = parentId;
                    collection4 = collection2;
                    simpleDateFormat3 = simpleDateFormat;
                    list3 = list;
                    c30296OooO00o3 = c30296OooO00o4;
                    str15 = title;
                    str14 = tnPath;
                    int iIntValue2 = ((Number) objOooO0o).intValue();
                    boolean favorite2 = folder.getFavorite();
                    Integer coverColor2 = folder.getCoverColor();
                    collection2.add(new NoteVO(str12, null, str11, str15, str13, str14, i5, i4, paperOrientation2, false, j4, j3, false, false, favorite2, iIntValue2, 1, str10, null, null, null, null, null, coverColor2 == null ? coverColor2.intValue() : C27996OooO00o.f99274OooO00o, simpleDateFormat3.format(new Long(folder.getCreationTime())), false, false, 0L, false, null, false, 2122055682, null));
                    it = it3;
                    c30296OooO00o = c30296OooO00o3;
                    list = list3;
                    simpleDateFormat = simpleDateFormat3;
                    collection = collection4;
                    str3 = str10;
                    if (it.hasNext()) {
                        ArrayList arrayListOooooOO = OooOo.OooooOO(list, (List) collection);
                        final C30100OooO0oO c30100OooO0oO = new C30100OooO0oO(oooO00o, 1);
                        return new C32443OooOOO(str3, OooOo.o00O0O(arrayListOooooOO, new Comparator() { // from class: o0o0O0o0.OooO0oo
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                return ((Number) c30100OooO0oO.invoke(obj2, obj3)).intValue();
                            }
                        }));
                    }
                }
                return enumC32485OooO00o;
            }
        }
        String str16 = str;
        C32443OooOOO c32443OooOOO2 = (C32443OooOOO) objOooO0o0;
        List list4 = (List) c32443OooOOO2.f116638OooOo0o;
        List list5 = (List) c32443OooOOO2.f116637OooOo;
        simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        ArrayList<NoteMeta> arrayList = new ArrayList();
        for (Object obj2 : list4) {
            if (!((NoteMeta) obj2).getInTrashBin()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (NoteMeta noteMeta : arrayList) {
            String id4 = noteMeta.getId();
            String userId2 = noteMeta.getUserId();
            String title2 = noteMeta.getTitle();
            String tnPath2 = noteMeta.getTnPath();
            int tnWidth = noteMeta.getTnWidth();
            int tnHeight = noteMeta.getTnHeight();
            PaperOrientation paperOrientation4 = PaperOrientation.VERTICAL;
            boolean z4 = noteMeta.getPdfInfo() != null;
            arrayList2.add(new NoteVO(id4, null, userId2, title2, noteMeta.getParentId(), tnPath2, tnWidth, tnHeight, paperOrientation4, z4, noteMeta.getCreationTime(), noteMeta.getLastModificationTime(), false, false, noteMeta.getFavorite(), noteMeta.getTotalPagesCount(), 0, str16, null, null, null, null, null, 0, simpleDateFormat.format(new Long(noteMeta.getCreationTime())), noteMeta.getLockAdded(), z, 0L, false, null, false, 2029780994, null));
        }
        List list6 = list5;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
        it = list6.iterator();
        collection = arrayList3;
        str3 = str16;
        list = arrayList2;
        if (it.hasNext()) {
        }
    }

    @Override // oO0O000o.InterfaceC32513OooOo0O
    public final Object o0Oo0oo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        ((Boolean) obj5).getClass();
        boolean zBooleanValue = ((Boolean) obj7).booleanValue();
        C30295OooO c30295OooO = new C30295OooO((Continuation) serializable, this.f107985OoooO0);
        c30295OooO.f107981Oooo0o = (String) obj;
        c30295OooO.f107983Oooo0oO = (com.orion.notein.p607ui.p609vo.OooO00o) obj2;
        c30295OooO.f107984Oooo0oo = (C32443OooOOO) obj3;
        c30295OooO.f107974Oooo = (String) obj6;
        c30295OooO.f107986OoooO00 = zBooleanValue;
        return c30295OooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
