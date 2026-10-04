package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$movePagesToTheAfterOfSpecifiedPage$2", m80623f = "NoteUseCase.kt", m80624l = {1204, 1206, 1226, 1227}, m80625m = "invokeSuspend")
public final class o00OOO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96190OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96191OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f96192OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f96193OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Iterator f96194OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96195OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f96196OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96197OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ Object f96198OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f96199Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(String str, String str2, List list, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96195OooOoo = c27449o00O0OoO;
        this.f96197OooOooO = str;
        this.f96198OooOooo = list;
        this.f96199Oooo000 = str2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00OOO00(this.f96197OooOooO, this.f96199Oooo000, this.f96198OooOooo, continuation, this.f96195OooOoo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((o00OOO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r2 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r3 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b2, code lost:
    
        if (r9.Ooooo00(r3, r2, r33) != r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c0 -> B:33:0x00c4). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0o;
        String str;
        Collection arrayList;
        NoteContent noteContent;
        Iterator it;
        C27449o00O0OoO c27449o00O0OoO;
        NoteContent noteContentCopy;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96196OooOoo0;
        boolean z = true;
        String str2 = this.f96199Oooo000;
        String str3 = this.f96197OooOooO;
        C27449o00O0OoO c27449o00O0OoO2 = this.f96195OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO2.f96035OooO00o;
            this.f96196OooOoo0 = 1;
            objOooOO0o = interfaceC27309OooOoO.OooOO0o(str3, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0o = obj;
        } else {
            if (i == 2) {
                it = this.f96194OooOoOO;
                arrayList = this.f96192OooOoO;
                str = this.f96193OooOoO0;
                c27449o00O0OoO = (C27449o00O0OoO) this.f96190OooOo;
                noteContent = (NoteContent) this.f96191OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z2 = true;
                Object objOooO0Oo = obj;
                Page page = (Page) objOooO0Oo;
                if (page != null) {
                    arrayList.add(page);
                }
                z = z2;
                if (it.hasNext()) {
                    List list2 = (List) arrayList;
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Page) it2.next()).getId());
                    }
                    Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
                    List<Page> pages = noteContent.getPages();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : pages) {
                        if (!setO0OO00O.contains(((Page) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList3);
                    int i2 = 0;
                    if (str2 != null) {
                        Iterator it3 = arrayListO0ooOoO.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Page) it3.next()).getId(), str2)) {
                                break;
                            }
                            i2++;
                        }
                        i2++;
                    }
                    if (i2 == -1) {
                        return Boolean.FALSE;
                    }
                    arrayListO0ooOoO.addAll(i2, list2);
                    if (arrayListO0ooOoO.equals(noteContent.getPages())) {
                        return Boolean.FALSE;
                    }
                    noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : arrayListO0ooOoO, (24571 & 8) != 0 ? noteContent.pageLayerIds : null, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent.extras : null);
                    list = arrayListO0ooOoO;
                    this.f96191OooOo0o = list;
                    this.f96190OooOo = noteContentCopy;
                    this.f96193OooOoO0 = null;
                    this.f96192OooOoO = null;
                    this.f96194OooOoOO = null;
                    this.f96196OooOoo0 = 3;
                    if (c27449o00O0OoO2.OoooOOo(noteContentCopy, this) != enumC32485OooO00o) {
                        String id = noteContentCopy.getId();
                        int size = list.size();
                        this.f96191OooOo0o = null;
                        this.f96190OooOo = null;
                        this.f96196OooOoo0 = 4;
                    }
                } else {
                    String str4 = (String) it.next();
                    C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                    this.f96191OooOo0o = noteContent;
                    this.f96190OooOo = c27449o00O0OoO;
                    this.f96193OooOoO0 = str;
                    z2 = z;
                    this.f96192OooOoO = arrayList;
                    this.f96194OooOoOO = it;
                    this.f96196OooOoo0 = 2;
                    objOooO0Oo = c27020OooOoO0.OooO0Oo(str4, str, this);
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return Boolean.TRUE;
            }
            noteContentCopy = (NoteContent) this.f96190OooOo;
            list = (List) this.f96191OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String id2 = noteContentCopy.getId();
            int size2 = list.size();
            this.f96191OooOo0o = null;
            this.f96190OooOo = null;
            this.f96196OooOoo0 = 4;
        }
        NoteContent noteContent2 = (NoteContent) objOooOO0o;
        if (noteContent2 == null) {
            return Boolean.FALSE;
        }
        Iterable iterable = (Iterable) this.f96198OooOooo;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : iterable) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0((String) obj3, str2)) {
                arrayList4.add(obj3);
            }
        }
        str = str3;
        arrayList = new ArrayList();
        noteContent = noteContent2;
        it = arrayList4.iterator();
        c27449o00O0OoO = c27449o00O0OoO2;
        if (it.hasNext()) {
        }
        return enumC32485OooO00o;
    }
}
