package o0OOo0o;

import android.net.Uri;
import androidx.core.net.UriKt;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00o00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$createBuiltInStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {90, 107, 145}, m80625m = "invokeSuspend")
public final class C27520o00o00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f96447OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Serializable f96448OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f96449OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C27538o00o0o0O f96450OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96451OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96452OooOoo0;

    /* JADX INFO: renamed from: o0OOo0o.o00o00o$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(Integer.parseInt((String) ((C32443OooOOO) t).f116638OooOo0o)), Integer.valueOf(Integer.parseInt((String) ((C32443OooOOO) t2).f116638OooOo0o)));
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00o00o$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(((Uri) t).getLastPathSegment(), ((Uri) t2).getLastPathSegment());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27520o00o00o(C27538o00o0o0O c27538o00o0o0O, Continuation<? super C27520o00o00o> continuation) {
        super(2, continuation);
        this.f96452OooOoo0 = c27538o00o0o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27520o00o00o(this.f96452OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27520o00o00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d A[Catch: all -> 0x0036, Exception -> 0x0039, TRY_LEAVE, TryCatch #6 {all -> 0x0036, blocks: (B:8:0x0029, B:101:0x0277, B:103:0x027d, B:106:0x02a1, B:107:0x02a7, B:108:0x02b0, B:110:0x02b6, B:112:0x02cc, B:114:0x02d2, B:118:0x02e2, B:119:0x02f7, B:121:0x02fd, B:123:0x0311, B:125:0x0327, B:126:0x0338, B:128:0x033e, B:129:0x035c, B:130:0x0376, B:132:0x037c, B:134:0x0397, B:136:0x03b6, B:133:0x038a), top: B:164:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192 A[Catch: all -> 0x019b, Exception -> 0x019f, TryCatch #12 {Exception -> 0x019f, all -> 0x019b, blocks: (B:61:0x0189, B:63:0x0192, B:68:0x01a4, B:71:0x01c7, B:73:0x01e8, B:75:0x01ee, B:76:0x01fd, B:78:0x0203, B:79:0x0211, B:80:0x0219, B:82:0x021f, B:83:0x022a, B:85:0x0230, B:97:0x024f, B:99:0x026c), top: B:170:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7 A[Catch: all -> 0x019b, Exception -> 0x019f, TryCatch #12 {Exception -> 0x019f, all -> 0x019b, blocks: (B:61:0x0189, B:63:0x0192, B:68:0x01a4, B:71:0x01c7, B:73:0x01e8, B:75:0x01ee, B:76:0x01fd, B:78:0x0203, B:79:0x0211, B:80:0x0219, B:82:0x021f, B:83:0x022a, B:85:0x0230, B:97:0x024f, B:99:0x026c), top: B:170:0x0189 }] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v40, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x03ee -> B:140:0x03f0). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r13;
        boolean z;
        Object objOooOOO0;
        List list;
        Object next;
        Object objOooO0OO;
        File file;
        ?? r132;
        Object next2;
        File file2;
        C34406OooO00o.C20358OooO00o c20358OooO00o;
        Object obj2;
        File file3;
        Iterator it;
        Object next3;
        ?? arrayList;
        String str;
        ?? r26;
        String str2;
        File file4;
        ?? O00O0O;
        String name;
        C27538o00o0o0O c27538o00o0o0O;
        ?? r262;
        ?? r133;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r3 = this.f96451OooOoOO;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        boolean z2 = false;
        String str3 = "notein_built_in_sticker_set_";
        C27538o00o0o0O c27538o00o0o0O2 = this.f96452OooOoo0;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r13 = r3;
            }
        } catch (Exception unused) {
            z = false;
            r13 = 0;
        } catch (Throwable th2) {
            th = th2;
            r13 = 0;
        }
        if (r3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<String> list2 = C27538o00o0o0O.f96549OooO0oO;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add("notein_built_in_sticker_set_" + ((String) it2.next()));
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("StickerUseCase");
            c20358OooO00o2.OooO0o0("createBuiltInStickerCollection, completeBuiltInStickerCollectionIds: " + arrayList2, new Object[0]);
            InterfaceC27321Oooo0o interfaceC27321Oooo0o = c27538o00o0o0O2.f96550OooO00o;
            String strOooO0Oo = c27538o00o0o0O2.f96551OooO0O0.OooO0Oo();
            this.f96448OooOo0o = arrayList2;
            this.f96451OooOoOO = 1;
            objOooOOO0 = interfaceC27321Oooo0o.OooOOO0(strOooO0Oo, this);
            list = arrayList2;
            if (objOooOOO0 == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (r3 == 1) {
            List list3 = (List) this.f96448OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list = list3;
            objOooOOO0 = obj;
        } else {
            if (r3 == 2) {
                File file5 = this.f96447OooOo;
                File file6 = (File) this.f96448OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    file = file6;
                    r3 = file5;
                    objOooO0OO = obj;
                    try {
                        file2 = (File) objOooO0OO;
                        c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("StickerUseCase");
                        c20358OooO00o.OooO0o0("createBuiltInStickerCollection, outputFile: " + file2 + ", size : " + (file2 == null ? C31430OooO00o.OooO0OO(file2.length()) : null), new Object[0]);
                    } catch (Exception unused2) {
                        z = false;
                        r13 = file;
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = file;
                        if (r13 != 0) {
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                    r13 = file6;
                    z = z2;
                }
                if (file2 != null) {
                    c20358OooO00o.OooO00o("createBuiltInStickerCollection, start unzip sticker resource.", new Object[0]);
                    File file7 = new File((File) r3, "sticker_unzip");
                    file7.mkdirs();
                    C31193OooOOo.OooO0OO(file2, file7);
                    File file8 = new File(file7, "sticker");
                    File[] fileArrListFiles = file8.listFiles();
                    List listOoooOO0 = fileArrListFiles != null ? oOo000Oo.OooOOO.OoooOO0(fileArrListFiles) : c34434OooOoO;
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(listOoooOO0, 10));
                    Iterator it3 = listOoooOO0.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((File) it3.next()).getName());
                    }
                    Iterator it4 = C27538o00o0o0O.f96549OooO0oO.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next4 = it4.next();
                        String str4 = (String) next4;
                        Iterator it5 = arrayList3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it5.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0((String) next3, str4)) {
                                break;
                            }
                        }
                        if (next3 == null) {
                            obj2 = next4;
                            break;
                        }
                    }
                    boolean z3 = obj2 == null;
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("StickerUseCase");
                    c20358OooO00o3.OooO0o0("createBuiltInStickerCollection, isAllStickerCollectionFileExist: " + z3, new Object[0]);
                    if (z3) {
                        file3 = file8;
                        it = C27538o00o0o0O.f96549OooO0oO.iterator();
                        r13 = file;
                        arrayList = c34434OooOoO;
                        if (it.hasNext()) {
                        }
                    }
                    if (r13 != 0) {
                        C32501OooO0oO.OooO0Oo(r13);
                    }
                    z2 = z;
                    return Boolean.valueOf(z2);
                }
                r132 = file;
                if (r132 != 0) {
                }
                return Boolean.valueOf(z2);
            }
            if (r3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f96449OooOoO;
            C27538o00o0o0O c27538o00o0o0O3 = this.f96450OooOoO0;
            file3 = this.f96447OooOo;
            r13 = (File) this.f96448OooOo0o;
            try {
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c27538o00o0o0O2 = c27538o00o0o0O3;
                    r262 = c34434OooOoO;
                    z = false;
                    str2 = "notein_built_in_sticker_set_";
                    r133 = r13;
                    z2 = z;
                    arrayList = r262;
                    str3 = str2;
                    r13 = r133;
                } catch (Throwable th4) {
                    th = th4;
                    if (r13 != 0) {
                        C32501OooO0oO.OooO0Oo(r13);
                    }
                    throw th;
                }
            } catch (Exception unused4) {
                z = z2;
            }
            if (it.hasNext()) {
                try {
                    String str5 = (String) it.next();
                    File file9 = new File(file3, str5);
                    str = str3 + str5;
                    File[] fileArrListFiles2 = file9.listFiles();
                    if (fileArrListFiles2 != null) {
                        List listOoooOO02 = oOo000Oo.OooOOO.OoooOO0(fileArrListFiles2);
                        try {
                            ArrayList arrayList4 = new ArrayList();
                            ?? r4 = arrayList;
                            for (Object obj3 : listOoooOO02) {
                                ?? r263 = r4;
                                String str6 = str3;
                                String name2 = ((File) obj3).getName();
                                kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                                File file10 = file9;
                                try {
                                    if (C33595OooOOo.OooOOo0(name2, ".svg", false)) {
                                        arrayList4.add(obj3);
                                    }
                                    file9 = file10;
                                    r4 = r263;
                                    str3 = str6;
                                } catch (Exception unused5) {
                                    z = false;
                                }
                            }
                            r26 = r4;
                            str2 = str3;
                            file4 = file9;
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                            Iterator it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                arrayList.add(Uri.fromFile((File) it6.next()));
                            }
                        } catch (Exception unused6) {
                            z = false;
                        }
                    } else {
                        r26 = arrayList;
                        str2 = str3;
                        file4 = file9;
                    }
                    if (C34429OooOOo0.OooOO0o("post", "sketches", "animal", "element").contains(str5)) {
                        Iterable<Uri> iterable = (Iterable) arrayList;
                        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                        for (Uri uri : iterable) {
                            String name3 = UriKt.toFile(uri).getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                            arrayList5.add(new C32443OooOOO(C33599OooOo0O.OooooO0(name3, ".svg"), uri));
                        }
                        List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList5, new OooO00o());
                        O00O0O = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
                        Iterator it7 = listO00O0O.iterator();
                        while (it7.hasNext()) {
                            O00O0O.add((Uri) ((C32443OooOOO) it7.next()).f116637OooOo);
                        }
                    } else {
                        O00O0O = oOo000Oo.OooOo.o00O0O((Iterable) arrayList, new OooO0O0());
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("StickerUseCase");
                    c20358OooO00o4.OooO0o0("createBuiltInStickerCollection, stickerCollectionId: " + str + ", stickerUris: " + O00O0O, new Object[0]);
                    name = file4.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                    this.f96448OooOo0o = r13;
                    this.f96447OooOo = file3;
                    this.f96450OooOoO0 = c27538o00o0o0O2;
                    this.f96449OooOoO = it;
                    this.f96451OooOoOO = 3;
                    c27538o00o0o0O2.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    c27538o00o0o0O = c27538o00o0o0O2;
                } catch (Exception unused7) {
                }
                z = false;
                if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27522o00o00oO(O00O0O, str, true, c27538o00o0o0O, name, null), this) != enumC32485OooO00o) {
                    c27538o00o0o0O2 = c27538o00o0o0O;
                    r133 = r13;
                    r262 = r26;
                    z2 = z;
                    arrayList = r262;
                    str3 = str2;
                    r13 = r133;
                    if (it.hasNext()) {
                        z2 = true;
                        r132 = r13;
                        if (r132 != 0) {
                            C32501OooO0oO.OooO0Oo(r132);
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                return enumC32485OooO00o;
            }
        }
        List list4 = (List) objOooOOO0;
        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o5.OooOOO0("StickerUseCase");
        c20358OooO00o5.OooO0o0("createBuiltInStickerCollection, builtInStickerCollections: " + list4, new Object[0]);
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String str7 = (String) next;
            Iterator it9 = list4.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((StickerCollection) next2).getId(), str7)) {
                    break;
                }
            }
            if (next2 == null) {
                break;
            }
        }
        boolean z4 = next == null;
        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o6.OooOOO0("StickerUseCase");
        c20358OooO00o6.OooO0o0("createBuiltInStickerCollection, isBuiltInStickerCollectionComplete: " + z4, new Object[0]);
        if (z4) {
            r132 = 0;
            if (r132 != 0) {
            }
            return Boolean.valueOf(z2);
        }
        c20358OooO00o6.OooO00o("createBuiltInStickerCollection, start download sticker resource.", new Object[0]);
        File file11 = new File(c27538o00o0o0O2.f96554OooO0o.getFilesDir(), "sticker_download");
        try {
            C32501OooO0oO.OooO0Oo(file11);
            file11.mkdirs();
            File file12 = new File(file11, "sticker.zip");
            file12.createNewFile();
            o0OOo0Oo.Oooo000 oooo000 = c27538o00o0o0O2.f96555OooO0o0;
            String absolutePath = file12.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            this.f96448OooOo0o = file11;
            this.f96447OooOo = file11;
            this.f96451OooOoOO = 2;
            objOooO0OO = oooo000.OooO0OO(absolutePath, this);
        } catch (Exception unused8) {
            z = false;
            r13 = file11;
        }
        if (objOooO0OO != enumC32485OooO00o) {
            file = file11;
            r3 = file11;
            file2 = (File) objOooO0OO;
            c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("StickerUseCase");
            if (file2 == null) {
            }
            c20358OooO00o.OooO0o0("createBuiltInStickerCollection, outputFile: " + file2 + ", size : " + (file2 == null ? C31430OooO00o.OooO0OO(file2.length()) : null), new Object[0]);
            if (file2 != null) {
            }
            r132 = file;
            if (r132 != 0) {
            }
            return Boolean.valueOf(z2);
        }
        return enumC32485OooO00o;
        if (r13 != 0) {
        }
        z2 = z;
        return Boolean.valueOf(z2);
    }
}
