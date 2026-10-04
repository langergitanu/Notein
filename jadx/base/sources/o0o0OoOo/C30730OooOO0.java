package o0o0OoOo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.Page;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26596o00O0o0;
import o0o0OoOO.C30713Oooo000;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OoOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$getImageList$1", m80623f = "DebugViewModel.kt", m80624l = {StyleIdentifier.LIGHT_LIST_ACCENT_6, StyleIdentifier.LIGHT_GRID_ACCENT_6, 250, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, StyleIdentifier.GRID_TABLE_2_ACCENT_1}, m80625m = "invokeSuspend")
public final class C30730OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f109906OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30722OooO00o f109907OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NoteMeta f109908OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f109909OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f109910OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f109911OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Collection f109912OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109913OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30730OooOO0(C30722OooO00o c30722OooO00o, Continuation<? super C30730OooOO0> continuation) {
        super(2, continuation);
        this.f109913OooOooO = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30730OooOO0(this.f109913OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30730OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (r2 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
    
        if (r6 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0290, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r1) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:29:0x00d5, B:35:0x00fe], limit reached: 84 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[PHI: r2 r3 r5 r6 r7 r10 r11 r13 r14
      0x0058: PHI (r2v9 java.util.Collection) = (r2v10 java.util.Collection), (r2v22 java.util.Collection) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r3v1 oOo000Oo.OooOoO) = (r3v2 oOo000Oo.OooOoO), (r3v0 oOo000Oo.OooOoO) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r5v2 com.orion.notein.domain.models.note.NoteMeta) = (r5v5 com.orion.notein.domain.models.note.NoteMeta), (r5v15 com.orion.notein.domain.models.note.NoteMeta) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r6v1 java.lang.Object) = (r6v8 java.lang.Object), (r6v23 java.lang.Object) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r7v1 int) = (r7v2 int), (r7v0 int) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r10v1 int) = (r10v2 int), (r10v0 int) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r11v3 java.util.Iterator) = (r11v5 java.util.Iterator), (r11v11 java.util.Iterator) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r13v1 java.util.Collection) = (r13v2 java.util.Collection), (r13v10 java.util.Collection) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r14v0 o0o0OoOo.OooO00o) = (r14v1 o0o0OoOo.OooO00o), (r14v6 o0o0OoOo.OooO00o) binds: [B:37:0x0121, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026f  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0149 -> B:42:0x014d). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOOo;
        Iterator it;
        C30722OooO00o c30722OooO00o;
        Collection collection;
        C30722OooO00o c30722OooO00o2;
        Collection collection2;
        Object objOooOOO;
        NoteMeta noteMeta;
        Iterator it2;
        NoteMeta noteMeta2;
        List list;
        Object objOooOO0;
        Object objOooOoO0;
        NoteContent noteContent;
        ?? arrayList;
        List<Page> pages;
        C34434OooOoO c34434OooOoO;
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109911OooOoo;
        C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
        C30722OooO00o c30722OooO00o3 = this.f109913OooOooO;
        int i2 = 4;
        int i3 = 3;
        int i4 = 2;
        int i5 = 10;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0oOooOOo = c30722OooO00o3.f109866OooOO0o.OooOOo(c30722OooO00o3.f109861OooO0o0.OooO0Oo());
            this.f109911OooOoo = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(interfaceC33721OooO0oOooOOo, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOOo = obj;
        } else {
            if (i == 2) {
                collection = this.f109910OooOoOO;
                noteMeta = this.f109908OooOoO;
                it = this.f109909OooOoO0;
                Collection collection3 = this.f109906OooOo;
                C30722OooO00o c30722OooO00o4 = this.f109907OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c30722OooO00o2 = c30722OooO00o4;
                collection2 = collection3;
                objOooOoO0 = obj;
                noteContent = (NoteContent) objOooOoO0;
                if (noteContent != null) {
                }
                arrayList = c34434OooOoO2;
                C26596o00O0o0 c26596o00O0o0 = c30722OooO00o2.f109862OooO0oO;
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O((Iterable) arrayList);
                String id = noteMeta.getId();
                this.f109907OooOo0o = c30722OooO00o2;
                this.f109906OooOo = collection2;
                this.f109909OooOoO0 = it;
                this.f109908OooOoO = noteMeta;
                this.f109910OooOoOO = collection;
                this.f109911OooOoo = i3;
                objOooOOO = c26596o00O0o0.OooOOO(id, setO0OO00O, this);
                if (objOooOOO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                collection = this.f109912OooOoo0;
                list = (List) this.f109910OooOoOO;
                noteMeta2 = this.f109908OooOoO;
                it2 = this.f109909OooOoO0;
                collection2 = this.f109906OooOo;
                c30722OooO00o2 = this.f109907OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0 = obj;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = ((Iterable) objOooOO0).iterator();
                while (it3.hasNext()) {
                    Image item = ((DualLinkRef) it3.next()).getItem();
                    if (item != null) {
                        arrayList2.add(item);
                    }
                }
                List list2 = list;
                ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list2, arrayList2);
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, i5));
                Iterator it4 = arrayListOooooOO.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((Image) it4.next()).getUri());
                }
                File[] fileArrListFiles = c30722OooO00o2.f109862OooO0oO.OooO(noteMeta2.getId()).listFiles();
                if (fileArrListFiles != null) {
                    ArrayList arrayList4 = new ArrayList();
                    int length = fileArrListFiles.length;
                    int i6 = 0;
                    while (i6 < length) {
                        C34434OooOoO c34434OooOoO3 = c34434OooOoO2;
                        File file = fileArrListFiles[i6];
                        File[] fileArr = fileArrListFiles;
                        if (!arrayList3.contains(file.getAbsolutePath())) {
                            arrayList4.add(file);
                        }
                        i6++;
                        fileArrListFiles = fileArr;
                        c34434OooOoO2 = c34434OooOoO3;
                    }
                    c34434OooOoO = c34434OooOoO2;
                    obj2 = arrayList4;
                } else {
                    c34434OooOoO = c34434OooOoO2;
                    obj2 = c34434OooOoO;
                }
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(new C30713Oooo000(noteMeta2.getTitle(), 0L, null, 14));
                ArrayList<Image> arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(list2, arrayList2);
                ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO2, 10));
                for (Image image : arrayListOooooOO2) {
                    arrayList5.add(new C30713Oooo000(null, image.creationTime, image.getUri(), 25));
                }
                Iterable<File> iterable = (Iterable) obj2;
                ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                for (File file2 : iterable) {
                    String absolutePath = file2.getAbsolutePath();
                    kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                    arrayList6.add(new C30713Oooo000(null, file2.lastModified(), absolutePath, 17));
                }
                collection.add(oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(listOooO0oO, arrayList5), arrayList6));
                i5 = 10;
                it = it2;
                collection = collection2;
                c30722OooO00o = c30722OooO00o2;
                c34434OooOoO2 = c34434OooOoO;
                i2 = 4;
                i3 = 3;
                i4 = 2;
                if (it.hasNext()) {
                    ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00((List) collection);
                    this.f109907OooOo0o = null;
                    this.f109906OooOo = null;
                    this.f109909OooOoO0 = null;
                    this.f109908OooOoO = null;
                    this.f109910OooOoOO = null;
                    this.f109912OooOoo0 = null;
                    this.f109911OooOoo = 5;
                    C33781o00o0O c33781o00o0O = c30722OooO00o3.f109880OooOoO0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, arrayListOooOo00);
                } else {
                    noteMeta = (NoteMeta) it.next();
                    String id2 = noteMeta.getId();
                    this.f109907OooOo0o = c30722OooO00o;
                    Collection collection4 = collection;
                    this.f109906OooOo = collection4;
                    this.f109909OooOoO0 = it;
                    this.f109908OooOoO = noteMeta;
                    this.f109910OooOoOO = collection4;
                    this.f109912OooOoo0 = null;
                    this.f109911OooOoo = i4;
                    objOooOoO0 = c30722OooO00o.f109866OooOO0o.OooOoO0(id2, this);
                    if (objOooOoO0 != enumC32485OooO00o) {
                        c30722OooO00o2 = c30722OooO00o;
                        collection2 = collection;
                        noteContent = (NoteContent) objOooOoO0;
                        if (noteContent != null || (pages = noteContent.getPages()) == null) {
                            arrayList = c34434OooOoO2;
                        } else {
                            List<Page> list3 = pages;
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, i5));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList.add(((Page) it5.next()).getId());
                            }
                        }
                        C26596o00O0o0 c26596o00O0o02 = c30722OooO00o2.f109862OooO0oO;
                        Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O((Iterable) arrayList);
                        String id3 = noteMeta.getId();
                        this.f109907OooOo0o = c30722OooO00o2;
                        this.f109906OooOo = collection2;
                        this.f109909OooOoO0 = it;
                        this.f109908OooOoO = noteMeta;
                        this.f109910OooOoOO = collection;
                        this.f109911OooOoo = i3;
                        objOooOOO = c26596o00O0o02.OooOOO(id3, setO0OO00O2, this);
                        if (objOooOOO != enumC32485OooO00o) {
                            it2 = it;
                            noteMeta2 = noteMeta;
                            list = (List) objOooOOO;
                            C26515OooooO0 c26515OooooO0 = c30722OooO00o2.f109858OooO;
                            String id4 = noteMeta2.getId();
                            this.f109907OooOo0o = c30722OooO00o2;
                            this.f109906OooOo = collection2;
                            this.f109909OooOoO0 = it2;
                            this.f109908OooOoO = noteMeta2;
                            this.f109910OooOoOO = list;
                            this.f109912OooOoo0 = collection;
                            this.f109911OooOoo = i2;
                            objOooOO0 = c26515OooooO0.OooOO0(id4, this);
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            collection = this.f109910OooOoOO;
            noteMeta = this.f109908OooOoO;
            it = this.f109909OooOoO0;
            Collection collection5 = this.f109906OooOo;
            C30722OooO00o c30722OooO00o5 = this.f109907OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOOO = obj;
            c30722OooO00o2 = c30722OooO00o5;
            collection2 = collection5;
            it2 = it;
            noteMeta2 = noteMeta;
            list = (List) objOooOOO;
            C26515OooooO0 c26515OooooO02 = c30722OooO00o2.f109858OooO;
            String id42 = noteMeta2.getId();
            this.f109907OooOo0o = c30722OooO00o2;
            this.f109906OooOo = collection2;
            this.f109909OooOoO0 = it2;
            this.f109908OooOoO = noteMeta2;
            this.f109910OooOoOO = list;
            this.f109912OooOoo0 = collection;
            this.f109911OooOoo = i2;
            objOooOO0 = c26515OooooO02.OooOO0(id42, this);
        }
        Iterable iterable2 = (Iterable) objOooOOo;
        ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        it = iterable2.iterator();
        c30722OooO00o = c30722OooO00o3;
        collection = arrayList7;
        if (it.hasNext()) {
        }
        return enumC32485OooO00o;
    }
}
