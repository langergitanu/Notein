package o0OOoo0o;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0O0oooo.C26379OooOo0o;
import o0OO00o0.C26620o00Oo00o;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34447Oooo0o0;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0OOoo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$insertOutlineToTheSameLevelList$2", m80623f = "OutlineUseCase.kt", m80624l = {82, 106}, m80625m = "invokeSuspend")
public final class C27865OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f98467OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f98468OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Outline f98469OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98470OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<String> f98471OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27865OooO0oo(C27869OooOOO c27869OooOOO, Outline outline, List<String> list, Continuation<? super C27865OooO0oo> continuation) {
        super(2, continuation);
        this.f98470OooOoO0 = c27869OooOOO;
        this.f98469OooOoO = outline;
        this.f98471OooOoOO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27865OooO0oo(this.f98470OooOoO0, this.f98469OooOoO, this.f98471OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends String>> continuation) {
        return ((C27865OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x001f, B:50:0x0109, B:52:0x010d, B:54:0x0129, B:55:0x013c, B:57:0x0142, B:58:0x0150, B:62:0x015c, B:63:0x0165, B:65:0x016b, B:66:0x0186, B:67:0x01d1, B:69:0x01d7, B:71:0x01ea, B:74:0x01f2, B:75:0x01f6, B:93:0x027a, B:95:0x027e, B:96:0x0287, B:98:0x028d, B:100:0x02a0, B:102:0x02a6, B:104:0x02b2, B:105:0x02b7, B:107:0x02bd, B:108:0x02c1, B:120:0x032a, B:122:0x032e, B:124:0x033d, B:126:0x0343, B:111:0x0301, B:114:0x030c, B:115:0x0313, B:118:0x0324, B:78:0x0237, B:81:0x0242, B:83:0x0251, B:85:0x0257, B:87:0x026a, B:91:0x0274, B:13:0x0031, B:19:0x004a, B:22:0x0057, B:23:0x0060, B:25:0x0066, B:26:0x0075, B:27:0x0081, B:29:0x0087, B:31:0x0095, B:32:0x0099, B:34:0x009f, B:36:0x00a8, B:46:0x00f7, B:39:0x00b9, B:40:0x00bd, B:42:0x00c3, B:44:0x00d3, B:16:0x003a), top: B:130:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x001f, B:50:0x0109, B:52:0x010d, B:54:0x0129, B:55:0x013c, B:57:0x0142, B:58:0x0150, B:62:0x015c, B:63:0x0165, B:65:0x016b, B:66:0x0186, B:67:0x01d1, B:69:0x01d7, B:71:0x01ea, B:74:0x01f2, B:75:0x01f6, B:93:0x027a, B:95:0x027e, B:96:0x0287, B:98:0x028d, B:100:0x02a0, B:102:0x02a6, B:104:0x02b2, B:105:0x02b7, B:107:0x02bd, B:108:0x02c1, B:120:0x032a, B:122:0x032e, B:124:0x033d, B:126:0x0343, B:111:0x0301, B:114:0x030c, B:115:0x0313, B:118:0x0324, B:78:0x0237, B:81:0x0242, B:83:0x0251, B:85:0x0257, B:87:0x026a, B:91:0x0274, B:13:0x0031, B:19:0x004a, B:22:0x0057, B:23:0x0060, B:25:0x0066, B:26:0x0075, B:27:0x0081, B:29:0x0087, B:31:0x0095, B:32:0x0099, B:34:0x009f, B:36:0x00a8, B:46:0x00f7, B:39:0x00b9, B:40:0x00bd, B:42:0x00c3, B:44:0x00d3, B:16:0x003a), top: B:130:0x0017 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        Object objOooOO0o;
        ArrayList<Outline> arrayList;
        NoteContent noteContent;
        Object next;
        int iIntValue;
        Object next2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98467OooOo;
        Outline outline = this.f98469OooOoO;
        int i2 = 16;
        C27869OooOOO c27869OooOOO = this.f98470OooOoO0;
        List<String> list = this.f98471OooOoOO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26620o00Oo00o c26620o00Oo00o = c27869OooOOO.f98487OooO00o;
                String noteId = outline.getNoteId();
                this.f98467OooOo = 1;
                objOooO0O0 = c26620o00Oo00o.OooO0O0(noteId, this);
                if (objOooO0O0 == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f98468OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o = obj;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("OutlineUseCase");
                    c20358OooO00o.OooOO0O("insertOutlineToTheSameLevelList failed, getNoteContent by noteId return null,to insert outline is " + outline, new Object[0]);
                    return list;
                }
                List<Page> pages = noteContent.getPages();
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                Iterator<T> it = pages.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Page) it.next()).getId());
                }
                int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList, 10));
                if (iOooO0Oo >= 16) {
                    i2 = iOooO0Oo;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (Outline outline2 : arrayList) {
                    linkedHashMap.put(outline2.getId(), new Integer(arrayList2.indexOf(outline2.getPageId())));
                }
                int iIndexOf = arrayList2.indexOf(outline.getPageId());
                C34406OooO00o.f123390OooO00o.OooO00o("insertOutlineToTheSameLevelList, id to index: " + OooOo.o000oOoO(C34447Oooo0o0.OooOOo0(linkedHashMap), null, null, null, new C26379OooOo0o(1), 31) + "， toInsertIndex: " + iIndexOf, new Object[0]);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    Integer num = (Integer) linkedHashMap.get(((Outline) obj2).getId());
                    if ((num != null ? num.intValue() : 0) <= iIndexOf) {
                        arrayList3.add(obj2);
                    }
                }
                C34406OooO00o.f123390OooO00o.OooO00o("insertOutlineToTheSameLevelList, A size " + arrayList3.size() + ", " + OooOo.o000oOoO(arrayList3, null, null, null, new C27862OooO0o(0), 31), new Object[0]);
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Integer num2 = (Integer) linkedHashMap.get(((Outline) next).getId());
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        do {
                            Object next3 = it2.next();
                            Integer num3 = (Integer) linkedHashMap.get(((Outline) next3).getId());
                            int iIntValue3 = num3 != null ? num3.intValue() : 0;
                            if (iIntValue2 < iIntValue3) {
                                next = next3;
                                iIntValue2 = iIntValue3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Outline outline3 = (Outline) next;
                if (outline3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        Integer num4 = (Integer) linkedHashMap.get(((Outline) obj3).getId());
                        int iIntValue4 = num4 != null ? num4.intValue() : 0;
                        Integer num5 = (Integer) linkedHashMap.get(outline3.getId());
                        if (num5 == null) {
                            num5 = new Integer(0);
                        }
                        if (iIntValue4 == num5.intValue()) {
                            arrayList4.add(obj3);
                        }
                    }
                    C34406OooO00o.f123390OooO00o.OooO00o("insertOutlineToTheSameLevelList, B size " + arrayList4.size() + ", " + OooOo.o000oOoO(arrayList4, null, null, null, new C27864OooO0oO(0), 31), new Object[0]);
                    Iterator it3 = arrayList4.iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            long creationTime = ((Outline) next2).getCreationTime();
                            do {
                                Object next4 = it3.next();
                                long creationTime2 = ((Outline) next4).getCreationTime();
                                if (creationTime < creationTime2) {
                                    next2 = next4;
                                    creationTime = creationTime2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    Outline outline4 = (Outline) next2;
                    Integer num6 = outline4 != null ? new Integer(list.indexOf(outline4.getId())) : null;
                    iIntValue = num6 != null ? num6.intValue() : -1;
                }
                C34406OooO00o.f123390OooO00o.OooO00o("insertOutlineToTheSameLevelList, targetIndex is " + iIntValue, new Object[0]);
                ArrayList arrayListO0ooOoO = OooOo.o0ooOoO(list);
                arrayListO0ooOoO.add(iIntValue + 1, outline.getId());
                return arrayListO0ooOoO;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = obj;
            Iterable iterable = (Iterable) objOooO0O0;
            int iOooO0Oo2 = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10));
            if (iOooO0Oo2 < 16) {
                iOooO0Oo2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo2);
            for (Object obj4 : iterable) {
                linkedHashMap2.put(((Outline) obj4).getId(), obj4);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                Outline outline5 = (Outline) linkedHashMap2.get((String) it4.next());
                if (outline5 != null) {
                    arrayList5.add(outline5);
                }
            }
            if (arrayList5.isEmpty()) {
                return com.facebook.soloader.OooOo.OooO0oO(outline.getId());
            }
            String parentId = ((Outline) OooOo.Oooo0oO(arrayList5)).getParentId();
            if (!arrayList5.isEmpty()) {
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((Outline) it5.next()).getParentId(), parentId)) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("OutlineUseCase");
                        c20358OooO00o2.OooOO0O("insertOutlineToTheSameLevelList failed, prevTheSameLevelList has no same parent, to insert outline is " + outline + ", prevTheSameLevelList is " + arrayList5, new Object[0]);
                        return list;
                    }
                }
            }
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27869OooOOO.f98489OooO0OO;
            String noteId2 = outline.getNoteId();
            this.f98468OooOo0o = arrayList5;
            this.f98467OooOo = 2;
            objOooOO0o = interfaceC27309OooOoO.OooOO0o(noteId2, this);
            if (objOooOO0o != enumC32485OooO00o) {
                arrayList = arrayList5;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent != null) {
                }
            }
            return enumC32485OooO00o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("OutlineUseCase");
            c20358OooO00o3.OooO0Oo(e, "insertOutlineToTheSameLevelList error.", new Object[0]);
            ArrayList arrayListO0ooOoO2 = OooOo.o0ooOoO(list);
            arrayListO0ooOoO2.add(outline.getId());
            return arrayListO0ooOoO2;
        }
    }
}
