package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o000ooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$batchMovePageToTrashBin$4", m80623f = "NoteUseCase.kt", m80624l = {849, 868, 872, 873, 875}, m80625m = "invokeSuspend")
public final class C27436o000ooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95830OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NoteMeta f95831OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NoteContent f95832OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Iterator f95833OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f95834OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f95835OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f95836OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ List<String> f95837OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ NoteContent f95838Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95839Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ NoteMeta f95840Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27436o000ooO0(List<String> list, NoteContent noteContent, C27449o00O0OoO c27449o00O0OoO, NoteMeta noteMeta, Continuation<? super C27436o000ooO0> continuation) {
        super(2, continuation);
        this.f95837OooOooo = list;
        this.f95838Oooo000 = noteContent;
        this.f95839Oooo00O = c27449o00O0OoO;
        this.f95840Oooo00o = noteMeta;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27436o000ooO0(this.f95837OooOooo, this.f95838Oooo000, this.f95839Oooo00O, this.f95840Oooo00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27436o000ooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e4 -> B:38:0x00e9). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        C27449o00O0OoO c27449o00O0OoO;
        Iterator it;
        int i;
        NoteMeta noteMeta;
        NoteContent noteContent;
        String id;
        List list2;
        int i2;
        C27449o00O0OoO c27449o00O0OoO2;
        NoteContent noteContentCopy;
        EnumC32485OooO00o enumC32485OooO00o;
        String id2;
        int size;
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f95836OooOooO;
        NoteMeta noteMeta2 = this.f95840Oooo00o;
        NoteContent noteContent2 = this.f95838Oooo000;
        C27449o00O0OoO c27449o00O0OoO3 = this.f95839Oooo00O;
        int i4 = 1;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = new ArrayList();
            List<String> list3 = this.f95837OooOooo;
            Iterator<String> it2 = list3.iterator();
            int i5 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i5 = -1;
                    break;
                }
                String next = it2.next();
                Page page = (Page) oOo000Oo.OooOo.Oooo(noteContent2.getPages());
                if (page == null || (id = page.getId()) == null) {
                    id = "";
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(next, id)) {
                    break;
                }
                i5++;
            }
            int i6 = i5 > -1 ? 1 : 0;
            list = arrayList;
            c27449o00O0OoO = c27449o00O0OoO3;
            it = list3.iterator();
            i = i6;
            noteMeta = noteMeta2;
            noteContent = noteContent2;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                i = this.f95834OooOoo;
                List list4 = (List) this.f95830OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list2 = list4;
                c27449o00O0OoO2 = c27449o00O0OoO3;
                noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : list2, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                this.f95830OooOo0o = list2;
                this.f95829OooOo = noteContentCopy;
                this.f95834OooOoo = i;
                this.f95836OooOooO = 3;
                enumC32485OooO00o = enumC32485OooO00o2;
                if (c27449o00O0OoO2.OoooOOo(noteContentCopy, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                id2 = noteContentCopy.getId();
                size = list2.size();
                this.f95830OooOo0o = noteContentCopy;
                obj2 = null;
                this.f95829OooOo = null;
                this.f95834OooOoo = i;
                this.f95836OooOooO = 4;
                if (c27449o00O0OoO2.Ooooo00(size, id2, this) == enumC32485OooO00o) {
                }
                if (i != 0) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                i = this.f95834OooOoo;
                NoteContent noteContent3 = (NoteContent) this.f95830OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContentCopy = noteContent3;
                c27449o00O0OoO2 = c27449o00O0OoO3;
                obj2 = null;
                enumC32485OooO00o = enumC32485OooO00o2;
                if (i != 0) {
                    String id3 = noteContentCopy.getId();
                    this.f95830OooOo0o = obj2;
                    this.f95836OooOooO = 5;
                    if (c27449o00O0OoO2.OoooOoO(id3, true, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            i = this.f95834OooOoo;
            NoteContent noteContent4 = (NoteContent) this.f95829OooOo;
            List list5 = (List) this.f95830OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = list5;
            noteContentCopy = noteContent4;
            c27449o00O0OoO2 = c27449o00O0OoO3;
            enumC32485OooO00o = enumC32485OooO00o2;
            id2 = noteContentCopy.getId();
            size = list2.size();
            this.f95830OooOo0o = noteContentCopy;
            obj2 = null;
            this.f95829OooOo = null;
            this.f95834OooOoo = i;
            this.f95836OooOooO = 4;
            if (c27449o00O0OoO2.Ooooo00(size, id2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            if (i != 0) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        i = this.f95834OooOoo;
        String str = this.f95835OooOoo0;
        it = this.f95833OooOoOO;
        noteMeta = this.f95831OooOoO;
        noteContent = this.f95832OooOoO0;
        c27449o00O0OoO = (C27449o00O0OoO) this.f95829OooOo;
        list = (List) this.f95830OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Object objOooO0Oo = obj;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0Oo);
        Page page2 = (Page) objOooO0Oo;
        Iterator<Page> it3 = noteContent.getPages().iterator();
        int i7 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i2 = -1;
                break;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(it3.next().getId(), str)) {
                i2 = i7;
                break;
            }
            i7++;
        }
        list.add(Page.copy$default(page2, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, noteContent.getId(), noteMeta.getTitle(), i2, true, null, null, null, 462847, null));
        i4 = 1;
        if (it.hasNext()) {
            List list6 = list;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((Page) it4.next()).getId());
            }
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
            List<Page> pages = noteContent2.getPages();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : pages) {
                if (!setO0OO00O.contains(((Page) obj3).getId())) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO3.f96039OooO0o;
                String id4 = noteMeta2.getId();
                this.f95830OooOo0o = arrayList3;
                this.f95829OooOo = null;
                this.f95832OooOoO0 = null;
                this.f95831OooOoO = null;
                this.f95833OooOoOO = null;
                this.f95835OooOoo0 = null;
                this.f95834OooOoo = i;
                this.f95836OooOooO = 2;
                if (c27020OooOoO0.OooOO0(id4, list, this) != enumC32485OooO00o2) {
                    list2 = arrayList3;
                    c27449o00O0OoO2 = c27449o00O0OoO3;
                    noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : list2, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                    this.f95830OooOo0o = list2;
                    this.f95829OooOo = noteContentCopy;
                    this.f95834OooOoo = i;
                    this.f95836OooOooO = 3;
                    enumC32485OooO00o = enumC32485OooO00o2;
                    if (c27449o00O0OoO2.OoooOOo(noteContentCopy, this) == enumC32485OooO00o) {
                    }
                    id2 = noteContentCopy.getId();
                    size = list2.size();
                    this.f95830OooOo0o = noteContentCopy;
                    obj2 = null;
                    this.f95829OooOo = null;
                    this.f95834OooOoo = i;
                    this.f95836OooOooO = 4;
                    if (c27449o00O0OoO2.Ooooo00(size, id2, this) == enumC32485OooO00o) {
                    }
                    if (i != 0) {
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        str = (String) it.next();
        C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO.f96039OooO0o;
        String id5 = noteContent.getId();
        this.f95830OooOo0o = list;
        this.f95829OooOo = c27449o00O0OoO;
        this.f95832OooOoO0 = noteContent;
        this.f95831OooOoO = noteMeta;
        this.f95833OooOoOO = it;
        this.f95835OooOoo0 = str;
        this.f95834OooOoo = i;
        this.f95836OooOooO = i4;
        objOooO0Oo = c27020OooOoO02.OooO0Oo(str, id5, this);
        return enumC32485OooO00o2;
    }
}
