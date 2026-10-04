package o0Ooooo0;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOoo0o.C27861OooO0Oo;
import o0OOoo0o.C27869OooOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Ooooo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineViewModel$safeCheckNoteContentOutlineIds$1", m80623f = "EditorOutlineViewModel.kt", m80624l = {82, 84, 99, 110, 112, 118}, m80625m = "invokeSuspend")
public final class C29711OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f105348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f105349OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f105350OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f105351OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f105352OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C29705OooOO0 f105353OooOoo0;

    /* JADX INFO: renamed from: o0Ooooo0.OooOOO0$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0((Integer) ((C32443OooOOO) t).f116637OooOo, (Integer) ((C32443OooOOO) t2).f116637OooOo);
        }
    }

    /* JADX INFO: renamed from: o0Ooooo0.OooOOO0$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0((Integer) ((C32443OooOOO) t).f116637OooOo, (Integer) ((C32443OooOOO) t2).f116637OooOo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29711OooOOO0(String str, Continuation continuation, C29705OooOO0 c29705OooOO0) {
        super(2, continuation);
        this.f105352OooOoOO = str;
        this.f105353OooOoo0 = c29705OooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29711OooOOO0(this.f105352OooOoOO, continuation, this.f105353OooOoo0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29711OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0390, code lost:
    
        if (r3.OoooOOo(r2, r52) != r1) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0310 A[LOOP:1: B:111:0x030a->B:113:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x034c A[LOOP:2: B:115:0x0346->B:117:0x034c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[LOOP:9: B:23:0x00a8->B:25:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[PHI: r2 r4 r5
      0x0031: PHI (r2v23 java.util.List) = (r2v20 java.util.List), (r2v31 java.util.List) binds: [B:100:0x02cd, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r4v19 java.lang.Object) = (r4v18 java.lang.Object), (r4v27 java.lang.Object) binds: [B:100:0x02cd, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r5v17 com.orion.notein.domain.models.note.NoteContent) = (r5v15 com.orion.notein.domain.models.note.NoteContent), (r5v28 com.orion.notein.domain.models.note.NoteContent) binds: [B:100:0x02cd, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029e  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOoO0;
        NoteContent noteContent;
        Object objOooO0o;
        NoteContent noteContent2;
        List list;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        List list2;
        ArrayList arrayList3;
        NoteContent noteContent3;
        ArrayList arrayList4;
        NoteContent noteContent4;
        List list3;
        Object next;
        Object objOooO0o2;
        Iterator it2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105350OooOoO;
        C29705OooOO0 c29705OooOO0 = this.f105353OooOoo0;
        String str = this.f105352OooOoOO;
        C27869OooOOO c27869OooOOO = c29705OooOO0.f105289OooO0Oo;
        C27449o00O0OoO c27449o00O0OoO = c29705OooOO0.f105290OooO0o;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "EditorOutlineViewModel", "safeCheckNoteContentOutlineIds, noteId: ", str), new Object[0]);
                this.f105350OooOoO = 1;
                objOooOoO0 = c27449o00O0OoO.OooOoO0(str, this);
                if (objOooOoO0 != enumC32485OooO00o) {
                    noteContent = (NoteContent) objOooOoO0;
                    if (noteContent != null) {
                        this.f105349OooOo0o = noteContent;
                        this.f105350OooOoO = 2;
                        c27869OooOOO.getClass();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27861OooO0Oo(c27869OooOOO, str, null), this);
                        if (objOooO0o != enumC32485OooO00o) {
                            noteContent2 = noteContent;
                            list = (List) objOooO0o;
                            List<Page> pages = noteContent2.getPages();
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                            it = pages.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Page) it.next()).getId());
                            }
                            ArrayList<Outline> arrayList5 = new ArrayList();
                            for (Object obj2 : list) {
                                String parentId = ((Outline) obj2).getParentId();
                                if (parentId == null || parentId.length() == 0) {
                                    arrayList5.add(obj2);
                                }
                            }
                            if (noteContent2.getOutlines().isEmpty() || arrayList5.isEmpty()) {
                                arrayList2 = arrayList;
                                List list4 = list;
                                ArrayList<Outline> arrayList6 = new ArrayList();
                                for (Object obj3 : list4) {
                                    String parentId2 = ((Outline) obj3).getParentId();
                                    if (parentId2 != null) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        while (parentId2 != null) {
                                            if (linkedHashSet.contains(parentId2)) {
                                                arrayList6.add(obj3);
                                            } else {
                                                linkedHashSet.add(parentId2);
                                                Iterator it3 = list4.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next = it3.next();
                                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Outline) next).getId(), parentId2)) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                Outline outline = (Outline) next;
                                                if (outline != null) {
                                                    parentId2 = outline.getParentId();
                                                }
                                            }
                                        }
                                    }
                                }
                                arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList6, 10));
                                for (Outline outline2 : arrayList6) {
                                    List<String> children = outline2.getChildren();
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj4 : children) {
                                        String str2 = (String) obj4;
                                        if (!arrayList6.isEmpty()) {
                                            Iterator it4 = arrayList6.iterator();
                                            while (it4.hasNext()) {
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Outline) it4.next()).getId(), str2)) {
                                                }
                                                break;
                                            }
                                        }
                                        arrayList7.add(obj4);
                                    }
                                    arrayList4.add(Outline.copy$default(outline2, null, null, null, null, null, null, arrayList7, 0L, 0L, 443, null));
                                }
                                if (!arrayList4.isEmpty()) {
                                    this.f105349OooOo0o = noteContent2;
                                    this.f105348OooOo = arrayList2;
                                    this.f105351OooOoO0 = null;
                                    this.f105350OooOoO = 4;
                                    if (c27869OooOOO.OooO0o0(str, arrayList4, this) != enumC32485OooO00o) {
                                        noteContent4 = noteContent2;
                                        list3 = arrayList2;
                                        this.f105349OooOo0o = noteContent4;
                                        this.f105348OooOo = list3;
                                        this.f105350OooOoO = 5;
                                        c27869OooOOO.getClass();
                                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27861OooO0Oo(c27869OooOOO, str, null), this);
                                        if (objOooO0o2 != enumC32485OooO00o) {
                                            NoteContent noteContent5 = noteContent4;
                                            ArrayList<Outline> arrayList8 = new ArrayList();
                                            for (Object obj5 : (List) objOooO0o2) {
                                                String parentId3 = ((Outline) obj5).getParentId();
                                                if (parentId3 == null || parentId3.length() == 0) {
                                                    arrayList8.add(obj5);
                                                }
                                            }
                                            ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(arrayList8, 10));
                                            for (Outline outline3 : arrayList8) {
                                                arrayList9.add(new C32443OooOOO(outline3, new Integer(list3.indexOf(outline3.getPageId()))));
                                            }
                                            List listO00O0O = OooOo.o00O0O(arrayList9, new OooO0O0());
                                            ArrayList arrayList10 = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
                                            it2 = listO00O0O.iterator();
                                            while (it2.hasNext()) {
                                                arrayList10.add(((Outline) ((C32443OooOOO) it2.next()).f116638OooOo0o).getId());
                                            }
                                            NoteContent noteContentCopy = noteContent5.copy((24571 & 1) != 0 ? noteContent5.id : null, (24571 & 2) != 0 ? noteContent5.defaultPage : null, (24571 & 4) != 0 ? noteContent5.pages : null, (24571 & 8) != 0 ? noteContent5.pageLayerIds : null, (24571 & 16) != 0 ? noteContent5.outlines : arrayList10, (24571 & 32) != 0 ? noteContent5.pdfInfo : null, (24571 & 64) != 0 ? noteContent5.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent5.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent5.zoom : 0.0f, (24571 & 512) != 0 ? noteContent5.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent5.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent5.unboundedNote : false, (24571 & 4096) != 0 ? noteContent5.creationTime : 0L, (24571 & 8192) != 0 ? noteContent5.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent5.extras : null);
                                            this.f105349OooOo0o = null;
                                            this.f105348OooOo = null;
                                            this.f105350OooOoO = 6;
                                        }
                                    }
                                }
                                break;
                            } else {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "EditorOutlineViewModel", "safeCheckNoteContentOutlineIds, noteId: ", str, ", noteContent.outlines is empty, but outlines is not empty, so update noteContent.outlines with outlines."), new Object[0]);
                                ArrayList arrayList11 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
                                for (Outline outline4 : arrayList5) {
                                    arrayList11.add(new C32443OooOOO(outline4, new Integer(arrayList.indexOf(outline4.getPageId()))));
                                }
                                List listO00O0O2 = OooOo.o00O0O(arrayList11, new OooO00o());
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("EditorOutlineViewModel");
                                c20358OooO00o3.OooO0o0(C21532OooOOo.OooO0OO(listO00O0O2.size(), "safeCheckNoteContentOutlineIds, sortedTopLevelOutlineIds: "), new Object[0]);
                                List list5 = listO00O0O2;
                                ArrayList arrayList12 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                                Iterator it5 = list5.iterator();
                                while (it5.hasNext()) {
                                    arrayList12.add(((Outline) ((C32443OooOOO) it5.next()).f116638OooOo0o).getId());
                                }
                                NoteContent noteContentCopy2 = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : null, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : arrayList12, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                                this.f105349OooOo0o = noteContent2;
                                this.f105348OooOo = list;
                                this.f105351OooOoO0 = arrayList;
                                this.f105350OooOoO = 3;
                                if (c27449o00O0OoO.OoooOOo(noteContentCopy2, this) != enumC32485OooO00o) {
                                    list2 = list;
                                    arrayList3 = arrayList;
                                    noteContent3 = noteContent2;
                                    arrayList2 = arrayList3;
                                    list = list2;
                                    noteContent2 = noteContent3;
                                    List list42 = list;
                                    ArrayList<Outline> arrayList62 = new ArrayList();
                                    while (r5.hasNext()) {
                                    }
                                    arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList62, 10));
                                    while (r5.hasNext()) {
                                    }
                                    if (!arrayList4.isEmpty()) {
                                    }
                                }
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooOoO0 = obj;
                noteContent = (NoteContent) objOooOoO0;
                if (noteContent != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
                noteContent = this.f105349OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                noteContent2 = noteContent;
                list = (List) objOooO0o;
                List<Page> pages2 = noteContent2.getPages();
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages2, 10));
                it = pages2.iterator();
                while (it.hasNext()) {
                }
                ArrayList<Outline> arrayList52 = new ArrayList();
                while (r11.hasNext()) {
                }
                if (noteContent2.getOutlines().isEmpty()) {
                    break;
                }
                arrayList2 = arrayList;
                List list422 = list;
                ArrayList<Outline> arrayList622 = new ArrayList();
                while (r5.hasNext()) {
                }
                arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList622, 10));
                while (r5.hasNext()) {
                }
                if (!arrayList4.isEmpty()) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 3:
                arrayList3 = this.f105351OooOoO0;
                list2 = this.f105348OooOo;
                noteContent3 = this.f105349OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                arrayList2 = arrayList3;
                list = list2;
                noteContent2 = noteContent3;
                List list4222 = list;
                ArrayList<Outline> arrayList6222 = new ArrayList();
                while (r5.hasNext()) {
                }
                arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList6222, 10));
                while (r5.hasNext()) {
                }
                if (!arrayList4.isEmpty()) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                list3 = this.f105348OooOo;
                noteContent4 = this.f105349OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f105349OooOo0o = noteContent4;
                this.f105348OooOo = list3;
                this.f105350OooOoO = 5;
                c27869OooOOO.getClass();
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27861OooO0Oo(c27869OooOOO, str, null), this);
                if (objOooO0o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                list3 = this.f105348OooOo;
                noteContent4 = this.f105349OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o2 = obj;
                NoteContent noteContent52 = noteContent4;
                ArrayList<Outline> arrayList82 = new ArrayList();
                while (r4.hasNext()) {
                }
                ArrayList arrayList92 = new ArrayList(C34428OooOOo.OooOOoo(arrayList82, 10));
                while (r5.hasNext()) {
                }
                List listO00O0O3 = OooOo.o00O0O(arrayList92, new OooO0O0());
                ArrayList arrayList102 = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O3, 10));
                it2 = listO00O0O3.iterator();
                while (it2.hasNext()) {
                }
                NoteContent noteContentCopy3 = noteContent52.copy((24571 & 1) != 0 ? noteContent52.id : null, (24571 & 2) != 0 ? noteContent52.defaultPage : null, (24571 & 4) != 0 ? noteContent52.pages : null, (24571 & 8) != 0 ? noteContent52.pageLayerIds : null, (24571 & 16) != 0 ? noteContent52.outlines : arrayList102, (24571 & 32) != 0 ? noteContent52.pdfInfo : null, (24571 & 64) != 0 ? noteContent52.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent52.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent52.zoom : 0.0f, (24571 & 512) != 0 ? noteContent52.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent52.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent52.unboundedNote : false, (24571 & 4096) != 0 ? noteContent52.creationTime : 0L, (24571 & 8192) != 0 ? noteContent52.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent52.extras : null);
                this.f105349OooOo0o = null;
                this.f105348OooOo = null;
                this.f105350OooOoO = 6;
                break;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
