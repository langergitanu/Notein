package o0o0O0O0;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26427Oooo0O0;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0o0O0O0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportPdfViewModel$_allPdfFiles$1", m80623f = "ImportPdfViewModel.kt", m80624l = {35}, m80625m = "invokeSuspend")
public final class C30271OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends String>, Continuation<? super Map<String, ? extends List<? extends C31039OooOO0O>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f107879OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f107880OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f107881OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f107882OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f107883OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f107884OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30271OooO0oo(OooOOO0 oooOOO0, Continuation<? super C30271OooO0oo> continuation) {
        super(2, continuation);
        this.f107884OooOoo0 = oooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30271OooO0oo c30271OooO0oo = new C30271OooO0oo(this.f107884OooOoo0, continuation);
        c30271OooO0oo.f107883OooOoOO = obj;
        return c30271OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends String> list, Continuation<? super Map<String, ? extends List<? extends C31039OooOO0O>>> continuation) {
        return ((C30271OooO0oo) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:11|(1:13)(1:15)|14|16|86|17|88|18|(2:22|(1:23))|28|29|38|(3:44|(3:46|(3:48|(2:50|93)(1:94)|51)|92)(1:52)|53)|54|(4:57|(3:96|59|99)(1:98)|97|55)|95|(1:61)(4:62|63|9|(8:64|(4:67|(1:(2:69|(1:IC)(1:72))(3:101|73|(1:107)(3:103|77|108)))|104|65)|100|78|(2:81|79)|109|82|83)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        r12 = oOO00oo.C34406OooO00o.f123390OooO00o;
        r12.OooOOO0("PdfInfoRepoImpl");
        r12.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getFilesFormMediaStoreByExt: ", r0.getMessage()), new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Type inference failed for: r8v6, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x015d -> B:63:0x015e). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        OooOOO0 oooOOO0;
        Iterator it;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO;
        String[] strArr;
        String[] strArr2;
        Uri contentUri;
        ?? arrayList2;
        Cursor cursorQuery;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107881OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f107883OooOoOO;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator it2 = list.iterator();
            oooOOO0 = this.f107884OooOoo0;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = this.f107882OooOoO0;
            Iterator it3 = this.f107879OooOo;
            Collection collection2 = this.f107880OooOo0o;
            oooOOO0 = (OooOOO0) this.f107883OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            it = it3;
            arrayList = collection2;
            Object obj2 = obj;
            collection.add((List) obj2);
            if (it.hasNext()) {
                try {
                    String str = (String) it.next();
                    C26427Oooo0O0 c26427Oooo0O0 = oooOOO0.f107898OooO0Oo;
                    this.f107883OooOoOO = oooOOO0;
                    Collection collection3 = arrayList;
                    this.f107880OooOo0o = collection3;
                    this.f107879OooOo = it;
                    this.f107882OooOoO0 = collection3;
                    this.f107881OooOoO = 1;
                    abstractApplicationC26277OooOoOO = c26427Oooo0O0.f90750OooO00o;
                    ArrayList arrayList3 = new ArrayList();
                    strArr = new String[]{"_display_name", "date_added", "_data", "mime_type"};
                    strArr2 = new String[]{MimeTypeMap.getSingleton().getMimeTypeFromExtension(str)};
                    if (Build.VERSION.SDK_INT >= 29) {
                        contentUri = MediaStore.Files.getContentUri("external");
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(contentUri);
                    } else {
                        contentUri = MediaStore.Files.getContentUri("external");
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(contentUri);
                    }
                    Cursor cursor = cursorQuery;
                    if (cursor != null && cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("_data");
                        do {
                            arrayList3.add(new File(cursor.getString(columnIndex)));
                        } while (cursor.moveToNext());
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    oO0O000.OooO00o.OooO00o(cursorQuery, null);
                    File externalFilesDir = abstractApplicationC26277OooOoOO.getExternalFilesDir(null);
                    if (externalFilesDir != null && externalFilesDir.exists() && externalFilesDir.isDirectory()) {
                        File[] fileArrListFiles = externalFilesDir.listFiles();
                        if (fileArrListFiles != null) {
                            arrayList2 = new ArrayList();
                            for (File file : fileArrListFiles) {
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(file);
                                if (C32501OooO0oO.OooO0o0(file).equalsIgnoreCase("pdf")) {
                                    arrayList2.add(file);
                                }
                            }
                        } else {
                            arrayList2 = C34434OooOoO.f123453OooOo0o;
                        }
                        arrayList3.addAll((Collection) arrayList2);
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        if (hashSet.add(((File) obj3).getAbsolutePath())) {
                            arrayList4.add(obj3);
                        }
                    }
                    if (arrayList4 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    collection = arrayList;
                    obj2 = arrayList4;
                    collection.add((List) obj2);
                    if (it.hasNext()) {
                        ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00((List) arrayList);
                        ArrayList<File> arrayList5 = new ArrayList();
                        for (Object obj4 : arrayListOooOo00) {
                            File file2 = (File) obj4;
                            File parentFile = file2;
                            while (true) {
                                if (parentFile != null) {
                                    if (parentFile.isHidden()) {
                                        break;
                                    }
                                    parentFile = parentFile.getParentFile();
                                } else if (file2.getParentFile() != null && file2.exists()) {
                                    arrayList5.add(obj4);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
                        for (File file3 : arrayList5) {
                            String absolutePath = file3.getAbsolutePath();
                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                            String name = file3.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                            arrayList6.add(new C31039OooOO0O(absolutePath, name, file3.isDirectory(), file3.lastModified(), false));
                        }
                        return Oooo0.OooO0o0(new C32443OooOOO("/storage", arrayList6));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
                cursorQuery = abstractApplicationC26277OooOoOO.getContentResolver().query(contentUri, strArr, "mime_type = ?", strArr2, "date_added DESC");
            }
        }
    }
}
