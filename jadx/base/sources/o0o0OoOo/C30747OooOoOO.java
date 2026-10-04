package o0o0OoOo;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0OOoooO.C28000OooO0o;
import o0Oo0o00.o0ooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OoOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$restoreNotesAndFolders$2", m80623f = "DebugViewModel.kt", m80624l = {421, 451, 455, 462, 491, 496}, m80625m = "invokeSuspend")
public final class C30747OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f109967OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f109968OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f109969OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f109970OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f109971OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109972OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f109973OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30747OooOoOO(C30722OooO00o c30722OooO00o, Continuation<? super C30747OooOoOO> continuation) {
        super(2, continuation);
        this.f109972OooOoo = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30747OooOoOO(this.f109972OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30747OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (r2 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b5, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258 A[PHI: r3 r8
      0x0258: PHI (r3v6 o0o0OoOo.OooO00o) = (r3v3 o0o0OoOo.OooO00o), (r3v8 o0o0OoOo.OooO00o) binds: [B:76:0x02b6, B:65:0x0257] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r8v36 java.util.Iterator) = (r8v34 java.util.Iterator), (r8v37 java.util.Iterator) binds: [B:76:0x02b6, B:65:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0198 -> B:10:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x02b6 -> B:66:0x0258). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOOo;
        Set setO0OO00O;
        C30722OooO00o c30722OooO00o;
        Iterator it;
        String str;
        Folder folder;
        Set set;
        Object objOooO0Oo;
        Folder folder2;
        C30722OooO00o c30722OooO00o2;
        C27600o0ooOO0 c27600o0ooOO0;
        Object objOooOo00;
        Iterator it2;
        String str2;
        NoteMeta noteMeta;
        Iterator it3;
        C30722OooO00o c30722OooO00o3;
        Object objOooO0Oo2;
        NoteMeta noteMeta2;
        C27449o00O0OoO c27449o00O0OoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109973OooOoo0;
        C30722OooO00o c30722OooO00o4 = this.f109972OooOoo;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C28000OooO0o c28000OooO0oOooO0o0 = c30722OooO00o4.f109863OooO0oo.OooO0o0();
                this.f109973OooOoo0 = 1;
                objOooOOo = C25252OooO0Oo.OooOOo(c28000OooO0oOooO0o0, this);
                break;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooOOo = obj;
                List list = (List) objOooOOo;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((Folder) it4.next()).getId());
                }
                setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DebugViewModel");
                c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO00o(setO0OO00O.size(), "folderIds size: ", "， folders: ", oOo000Oo.OooOo.o000oOoO(list, null, null, null, new o0OOo0o.OooO(1), 31)), new Object[0]);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    String parentId = ((Folder) obj2).getParentId();
                    if (parentId != null && !setO0OO00O.contains(parentId)) {
                        arrayList2.add(obj2);
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DebugViewModel");
                c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList2.size(), "lostFolders size: ", "， lostFolders: ", oOo000Oo.OooOo.o000oOoO(arrayList2, ";", null, null, new o0OOo0o.OooOO0(2), 30)), new Object[0]);
                c30722OooO00o = c30722OooO00o4;
                it = arrayList2.iterator();
                if (!it.hasNext()) {
                    InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0oOooOOo = c30722OooO00o4.f109866OooOO0o.OooOOo(c30722OooO00o4.f109861OooO0o0.OooO0Oo());
                    this.f109968OooOo0o = setO0OO00O;
                    this.f109967OooOo = null;
                    this.f109970OooOoO0 = null;
                    this.f109973OooOoo0 = 4;
                    objOooOo00 = C25252OooO0Oo.OooOo00(interfaceC33721OooO0oOooOOo, this);
                    break;
                } else {
                    folder = (Folder) it.next();
                    String parentId2 = folder.getParentId();
                    if (parentId2 != null) {
                        C27600o0ooOO0 c27600o0ooOO02 = c30722OooO00o.f109863OooO0oo;
                        this.f109968OooOo0o = setO0OO00O;
                        this.f109967OooOo = c30722OooO00o;
                        this.f109970OooOoO0 = it;
                        this.f109969OooOoO = folder;
                        this.f109971OooOoOO = parentId2;
                        this.f109973OooOoo0 = 2;
                        objOooO0Oo = c27600o0ooOO02.OooO0Oo(parentId2, this);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            set = setO0OO00O;
                            str = parentId2;
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o3, "DebugViewModel", "lostFolder parentId: ", str, ", ");
                            sbOooO00o.append((Folder) objOooO0Oo);
                            c20358OooO00o3.OooO0o0(sbOooO00o.toString(), new Object[0]);
                            Iterator it5 = it;
                            folder2 = folder;
                            c30722OooO00o2 = c30722OooO00o;
                            c27600o0ooOO0 = c30722OooO00o2.f109863OooO0oo;
                            this.f109968OooOo0o = set;
                            this.f109967OooOo = c30722OooO00o2;
                            this.f109970OooOoO0 = it5;
                            this.f109969OooOoO = null;
                            this.f109971OooOoOO = null;
                            this.f109973OooOoo0 = 3;
                            if (c27600o0ooOO0.OooOO0(folder2, null, this) != enumC32485OooO00o) {
                                it = it5;
                                setO0OO00O = set;
                                c30722OooO00o = c30722OooO00o2;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                    } else {
                        set = setO0OO00O;
                        Iterator it52 = it;
                        folder2 = folder;
                        c30722OooO00o2 = c30722OooO00o;
                        c27600o0ooOO0 = c30722OooO00o2.f109863OooO0oo;
                        this.f109968OooOo0o = set;
                        this.f109967OooOo = c30722OooO00o2;
                        this.f109970OooOoO0 = it52;
                        this.f109969OooOoO = null;
                        this.f109971OooOoOO = null;
                        this.f109973OooOoo0 = 3;
                        if (c27600o0ooOO0.OooOO0(folder2, null, this) != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            case 2:
                str = this.f109971OooOoOO;
                folder = (Folder) this.f109969OooOoO;
                it = (Iterator) this.f109970OooOoO0;
                c30722OooO00o = (C30722OooO00o) this.f109967OooOo;
                set = (Set) this.f109968OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o32, "DebugViewModel", "lostFolder parentId: ", str, ", ");
                sbOooO00o2.append((Folder) objOooO0Oo);
                c20358OooO00o32.OooO0o0(sbOooO00o2.toString(), new Object[0]);
                Iterator it522 = it;
                folder2 = folder;
                c30722OooO00o2 = c30722OooO00o;
                c27600o0ooOO0 = c30722OooO00o2.f109863OooO0oo;
                this.f109968OooOo0o = set;
                this.f109967OooOo = c30722OooO00o2;
                this.f109970OooOoO0 = it522;
                this.f109969OooOoO = null;
                this.f109971OooOoOO = null;
                this.f109973OooOoo0 = 3;
                if (c27600o0ooOO0.OooOO0(folder2, null, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                Iterator it6 = (Iterator) this.f109970OooOoO0;
                c30722OooO00o2 = (C30722OooO00o) this.f109967OooOo;
                Set set2 = (Set) this.f109968OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it = it6;
                setO0OO00O = set2;
                c30722OooO00o = c30722OooO00o2;
                if (!it.hasNext()) {
                }
                return enumC32485OooO00o;
            case 4:
                setO0OO00O = (Set) this.f109968OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOo00 = obj;
                Iterable iterable = (List) objOooOo00;
                if (iterable == null) {
                    iterable = C34434OooOoO.f123453OooOo0o;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : iterable) {
                    if (!((NoteMeta) obj3).getInTrashBin()) {
                        arrayList3.add(obj3);
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("DebugViewModel");
                c20358OooO00o4.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList3.size(), "noteIds size: ", "， notes: ", oOo000Oo.OooOo.o000oOoO(arrayList3, null, null, null, new o0ooOOo(1), 31)), new Object[0]);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    String parentId3 = ((NoteMeta) obj4).getParentId();
                    if (parentId3 != null && !setO0OO00O.contains(parentId3)) {
                        arrayList4.add(obj4);
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("DebugViewModel");
                c20358OooO00o5.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList4.size(), "lostNotes size: ", "， lostNotes: ", oOo000Oo.OooOo.o000oOoO(arrayList4, null, null, null, new o0OOo0o.OooOOO0(2), 31)), new Object[0]);
                it2 = arrayList4.iterator();
                it3 = it2;
                if (!it3.hasNext()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                noteMeta2 = (NoteMeta) it3.next();
                String parentId4 = noteMeta2.getParentId();
                if (parentId4 != null) {
                    C27600o0ooOO0 c27600o0ooOO03 = c30722OooO00o4.f109863OooO0oo;
                    this.f109968OooOo0o = c30722OooO00o4;
                    this.f109967OooOo = it3;
                    this.f109970OooOoO0 = noteMeta2;
                    this.f109969OooOoO = parentId4;
                    this.f109973OooOoo0 = 5;
                    objOooO0Oo2 = c27600o0ooOO03.OooO0Oo(parentId4, this);
                    if (objOooO0Oo2 != enumC32485OooO00o) {
                        C30722OooO00o c30722OooO00o5 = c30722OooO00o4;
                        noteMeta = noteMeta2;
                        str2 = parentId4;
                        c30722OooO00o3 = c30722OooO00o5;
                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o6.OooOOO0("DebugViewModel");
                        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("lostFolderNote title: ", noteMeta.getTitle(), " parentId: ", str2, ", ");
                        sbOooO0O0.append((Folder) objOooO0Oo2);
                        c20358OooO00o6.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                        noteMeta2 = noteMeta;
                        c30722OooO00o4 = c30722OooO00o3;
                        c27449o00O0OoO = c30722OooO00o4.f109866OooOO0o;
                        this.f109968OooOo0o = c30722OooO00o4;
                        this.f109967OooOo = it3;
                        this.f109970OooOoO0 = null;
                        this.f109969OooOoO = null;
                        this.f109973OooOoo0 = 6;
                        if (c27449o00O0OoO.Oooo0o(noteMeta2, null, this) != enumC32485OooO00o) {
                            if (!it3.hasNext()) {
                            }
                        }
                    }
                } else {
                    c27449o00O0OoO = c30722OooO00o4.f109866OooOO0o;
                    this.f109968OooOo0o = c30722OooO00o4;
                    this.f109967OooOo = it3;
                    this.f109970OooOoO0 = null;
                    this.f109969OooOoO = null;
                    this.f109973OooOoo0 = 6;
                    if (c27449o00O0OoO.Oooo0o(noteMeta2, null, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            case 5:
                str2 = (String) this.f109969OooOoO;
                noteMeta = (NoteMeta) this.f109970OooOoO0;
                it3 = (Iterator) this.f109967OooOo;
                c30722OooO00o3 = (C30722OooO00o) this.f109968OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo2 = obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o62.OooOOO0("DebugViewModel");
                StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("lostFolderNote title: ", noteMeta.getTitle(), " parentId: ", str2, ", ");
                sbOooO0O02.append((Folder) objOooO0Oo2);
                c20358OooO00o62.OooO0o0(sbOooO0O02.toString(), new Object[0]);
                noteMeta2 = noteMeta;
                c30722OooO00o4 = c30722OooO00o3;
                c27449o00O0OoO = c30722OooO00o4.f109866OooOO0o;
                this.f109968OooOo0o = c30722OooO00o4;
                this.f109967OooOo = it3;
                this.f109970OooOoO0 = null;
                this.f109969OooOoO = null;
                this.f109973OooOoo0 = 6;
                if (c27449o00O0OoO.Oooo0o(noteMeta2, null, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                it2 = (Iterator) this.f109967OooOo;
                c30722OooO00o4 = (C30722OooO00o) this.f109968OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it3 = it2;
                if (!it3.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
