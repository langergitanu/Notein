package o0Oo0o0o;

import Oooo0oO.C21111o0ooOoO;
import android.net.Uri;
import androidx.core.content.C21638OooO0Oo;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.page.Page;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.C27370OooooOO;
import o0OOo0o.C27372Oooooo;
import o0oOo0o0.AbstractC30978OooO;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooOOOO.C31644OooO0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Oo0o0o.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28282o00ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f100295OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27372Oooooo f100296OooO0O0;

    public C28282o00ooo(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27372Oooooo c27372Oooooo) {
        this.f100295OooO00o = abstractApplicationC26277OooOoOO;
        this.f100296OooO0O0 = c27372Oooooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0187 A[LOOP:0: B:26:0x0181->B:28:0x0187, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01cf -> B:33:0x01db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Set set, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28284ooOO c28284ooOO;
        String str2;
        File file;
        C28282o00ooo c28282o00ooo;
        C28284ooOO c28284ooOO2;
        Iterator it;
        Collection collection;
        int i2;
        Set set2;
        Uri uri2;
        int i3;
        AbstractC30978OooO abstractC30978OooO2;
        Set set3;
        Collection collection2;
        Object objOooO00o;
        int i4;
        Collection collection3;
        C28284ooOO c28284ooOO3;
        String str3;
        Uri uri3;
        int i5;
        Iterator it2;
        File file2;
        AbstractC30978OooO abstractC30978OooO3;
        String str4;
        C28282o00ooo c28282o00ooo2;
        int i6;
        String title;
        ArrayList arrayList;
        Iterator<T> it3;
        EnumC32485OooO00o enumC32485OooO00o;
        Boolean boolValueOf;
        C32460OooOooO c32460OooOooO;
        if (abstractC32479OooO0OO instanceof C28284ooOO) {
            c28284ooOO = (C28284ooOO) abstractC32479OooO0OO;
            int i7 = c28284ooOO.f100320Oooo0o0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c28284ooOO.f100320Oooo0o0 = i7 - Integer.MIN_VALUE;
            } else {
                c28284ooOO = new C28284ooOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28284ooOO.f100318Oooo0O0;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = c28284ooOO.f100320Oooo0o0;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            File file3 = new File(this.f100295OooO00o.getCacheDir(), androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "pdf-export-"));
            C31190OooO0oo.OooO0o(file3);
            Set set4 = set;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(set4, 10));
            str2 = str;
            file = file3;
            c28282o00ooo = this;
            c28284ooOO2 = c28284ooOO;
            it = set4.iterator();
            collection = arrayList2;
            i2 = 0;
            set2 = set;
            uri2 = uri;
            i3 = i;
            abstractC30978OooO2 = abstractC30978OooO;
            if (it.hasNext()) {
            }
        } else if (i8 == 1) {
            int i9 = c28284ooOO.f100314Oooo0;
            int i10 = c28284ooOO.f100317Oooo00o;
            int i11 = c28284ooOO.f100316Oooo00O;
            Collection collection4 = c28284ooOO.f100315Oooo000;
            String str5 = (String) c28284ooOO.f100313OooOooo;
            Iterator it4 = c28284ooOO.f100312OooOooO;
            Collection collection5 = c28284ooOO.f100310OooOoo;
            File file4 = c28284ooOO.f100311OooOoo0;
            String str6 = c28284ooOO.f100309OooOoOO;
            AbstractC30978OooO abstractC30978OooO4 = c28284ooOO.f100307OooOoO;
            Uri uri4 = c28284ooOO.f100308OooOoO0;
            Set set5 = c28284ooOO.f100305OooOo;
            C28282o00ooo c28282o00ooo3 = c28284ooOO.f100306OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            set3 = set5;
            objOooO00o = obj;
            collection2 = collection5;
            uri3 = uri4;
            i4 = i10;
            str4 = str5;
            it2 = it4;
            i5 = i11;
            abstractC30978OooO3 = abstractC30978OooO4;
            collection3 = collection4;
            file2 = file4;
            str3 = str6;
            c28284ooOO3 = c28284ooOO;
            i6 = i9;
            c28282o00ooo2 = c28282o00ooo3;
            Note note = (Note) objOooO00o;
            title = note.getTitle();
            EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o2;
            C34406OooO00o.f123390OooO00o.OooO00o("exportMultiNotes: noteTitle=" + title + ", directory=" + file2 + ", noteListener=" + abstractC30978OooO3 + ", noteId=" + str4, new Object[0]);
            List<Page> pages = note.getPages();
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            it3 = pages.iterator();
            while (it3.hasNext()) {
            }
            c28284ooOO3.f100306OooOo0o = c28282o00ooo2;
            c28284ooOO3.f100305OooOo = set3;
            c28284ooOO3.f100308OooOoO0 = uri3;
            c28284ooOO3.f100307OooOoO = abstractC30978OooO3;
            c28284ooOO3.f100309OooOoOO = str3;
            c28284ooOO3.f100311OooOoo0 = file2;
            c28284ooOO3.f100310OooOoo = collection2;
            c28284ooOO3.f100312OooOooO = it2;
            c28284ooOO3.f100313OooOooo = collection3;
            c28284ooOO3.f100315Oooo000 = null;
            c28284ooOO3.f100316Oooo00O = i5;
            c28284ooOO3.f100317Oooo00o = i4;
            c28284ooOO3.f100314Oooo0 = i6;
            c28284ooOO3.f100320Oooo0o0 = 2;
            Uri uri5 = uri3;
            AbstractC30978OooO abstractC30978OooO5 = abstractC30978OooO3;
            Iterator it5 = it2;
            enumC32485OooO00o = enumC32485OooO00o3;
            if (c28282o00ooo2.OooO0Oo(str4, arrayList, file2, title, i5, null, str3, c28284ooOO3) != enumC32485OooO00o) {
            }
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = c28284ooOO.f100314Oooo0;
            int i13 = c28284ooOO.f100317Oooo00o;
            int i14 = c28284ooOO.f100316Oooo00O;
            Collection collection6 = (Collection) c28284ooOO.f100313OooOooo;
            Iterator it6 = c28284ooOO.f100312OooOooO;
            Collection collection7 = c28284ooOO.f100310OooOoo;
            File file5 = c28284ooOO.f100311OooOoo0;
            String str7 = c28284ooOO.f100309OooOoOO;
            abstractC30978OooO2 = c28284ooOO.f100307OooOoO;
            Uri uri6 = c28284ooOO.f100308OooOoO0;
            Set set6 = c28284ooOO.f100305OooOo;
            c28282o00ooo = c28284ooOO.f100306OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c28284ooOO2 = c28284ooOO;
            uri2 = uri6;
            i5 = i14;
            str3 = str7;
            i4 = i13;
            collection = collection7;
            set3 = set6;
            enumC32485OooO00o = enumC32485OooO00o2;
            if (abstractC30978OooO2 == null) {
                abstractC30978OooO2.OooO00o((i12 + 1.0f) / set3.size());
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                c32460OooOooO = null;
            }
            collection6.add(c32460OooOooO);
            enumC32485OooO00o2 = enumC32485OooO00o;
            i3 = i5;
            str2 = str3;
            it = it6;
            i2 = i4;
            file = file5;
            set2 = set3;
            if (it.hasNext()) {
                Object next = it.next();
                i4 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                String str8 = (String) next;
                C27372Oooooo c27372Oooooo = c28282o00ooo.f100296OooO0O0;
                c28284ooOO2.f100306OooOo0o = c28282o00ooo;
                Set set7 = set2;
                c28284ooOO2.f100305OooOo = set7;
                c28284ooOO2.f100308OooOoO0 = uri2;
                c28284ooOO2.f100307OooOoO = abstractC30978OooO2;
                c28284ooOO2.f100309OooOoOO = str2;
                c28284ooOO2.f100311OooOoo0 = file;
                Collection collection8 = collection;
                c28284ooOO2.f100310OooOoo = collection8;
                c28284ooOO2.f100312OooOooO = it;
                c28284ooOO2.f100313OooOooo = str8;
                c28284ooOO2.f100315Oooo000 = collection8;
                c28284ooOO2.f100316Oooo00O = i3;
                c28284ooOO2.f100317Oooo00o = i4;
                c28284ooOO2.f100314Oooo0 = i2;
                c28284ooOO2.f100320Oooo0o0 = 1;
                objOooO00o = c27372Oooooo.OooO00o(i3, str8, c28284ooOO2);
                if (objOooO00o == enumC32485OooO00o2) {
                    return enumC32485OooO00o2;
                }
                set3 = set7;
                collection2 = collection;
                uri3 = uri2;
                i6 = i2;
                c28284ooOO3 = c28284ooOO2;
                it2 = it;
                i5 = i3;
                c28282o00ooo2 = c28282o00ooo;
                file2 = file;
                str3 = str2;
                abstractC30978OooO3 = abstractC30978OooO2;
                str4 = str8;
                collection3 = collection2;
                Note note2 = (Note) objOooO00o;
                title = note2.getTitle();
                EnumC32485OooO00o enumC32485OooO00o32 = enumC32485OooO00o2;
                C34406OooO00o.f123390OooO00o.OooO00o("exportMultiNotes: noteTitle=" + title + ", directory=" + file2 + ", noteListener=" + abstractC30978OooO3 + ", noteId=" + str4, new Object[0]);
                List<Page> pages2 = note2.getPages();
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages2, 10));
                it3 = pages2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((Page) it3.next()).getId());
                }
                c28284ooOO3.f100306OooOo0o = c28282o00ooo2;
                c28284ooOO3.f100305OooOo = set3;
                c28284ooOO3.f100308OooOoO0 = uri3;
                c28284ooOO3.f100307OooOoO = abstractC30978OooO3;
                c28284ooOO3.f100309OooOoOO = str3;
                c28284ooOO3.f100311OooOoo0 = file2;
                c28284ooOO3.f100310OooOoo = collection2;
                c28284ooOO3.f100312OooOooO = it2;
                c28284ooOO3.f100313OooOooo = collection3;
                c28284ooOO3.f100315Oooo000 = null;
                c28284ooOO3.f100316Oooo00O = i5;
                c28284ooOO3.f100317Oooo00o = i4;
                c28284ooOO3.f100314Oooo0 = i6;
                c28284ooOO3.f100320Oooo0o0 = 2;
                Uri uri52 = uri3;
                AbstractC30978OooO abstractC30978OooO52 = abstractC30978OooO3;
                Iterator it52 = it2;
                enumC32485OooO00o = enumC32485OooO00o32;
                if (c28282o00ooo2.OooO0Oo(str4, arrayList, file2, title, i5, null, str3, c28284ooOO3) != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C28282o00ooo c28282o00ooo4 = c28282o00ooo2;
                i12 = i6;
                uri2 = uri52;
                file5 = file2;
                c28282o00ooo = c28282o00ooo4;
                abstractC30978OooO2 = abstractC30978OooO52;
                c28284ooOO2 = c28284ooOO3;
                collection6 = collection3;
                collection = collection2;
                it6 = it52;
                if (abstractC30978OooO2 == null) {
                }
                collection6.add(c32460OooOooO);
                enumC32485OooO00o2 = enumC32485OooO00o;
                i3 = i5;
                str2 = str3;
                it = it6;
                i2 = i4;
                file = file5;
                set2 = set3;
                if (it.hasNext()) {
                    File[] fileArrListFiles = file.listFiles();
                    List listOoooOO0 = fileArrListFiles != null ? oOo000Oo.OooOOO.OoooOO0(fileArrListFiles) : null;
                    if (listOoooOO0 == null) {
                        C34406OooO00o.f123390OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("exportMultiNotes: No files in directory: ", file.getAbsolutePath()), new Object[0]);
                        return Boolean.FALSE;
                    }
                    OutputStream outputStreamOpenOutputStream = c28282o00ooo.f100295OooO00o.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            boolValueOf = Boolean.valueOf(C31193OooOOo.OooO0oO(listOoooOO0, outputStreamOpenOutputStream));
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                oO0O000.OooO00o.OooO00o(outputStreamOpenOutputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        boolValueOf = null;
                    }
                    C32501OooO0oO.OooO0Oo(file);
                    return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, Boolean.TRUE));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Set set, File file, String str, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0O o00o0o2;
        C28282o00ooo c28282o00ooo;
        File file2;
        if (abstractC32479OooO0OO instanceof o00O0O) {
            o00o0o2 = (o00O0O) abstractC32479OooO0OO;
            int i2 = o00o0o2.f100266OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o00o0o2.f100266OooOoO = i2 - Integer.MIN_VALUE;
                c28282o00ooo = this;
            } else {
                c28282o00ooo = this;
                o00o0o2 = new o00O0O(c28282o00ooo, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o00o0o2.f100264OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o00o0o2.f100266OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sb = new StringBuilder("exportNotes: noteIds=");
            sb.append(set);
            sb.append(", outputDir=");
            sb.append(file);
            sb.append(", fileName=");
            OooOO0.OooO0O0.OooO0Oo(i, str, ", flag=", ", listener=", sb);
            sb.append(abstractC30978OooO);
            c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
            File file3 = set.size() > 1 ? new File(file, C21111o0ooOoO.OooO0Oo(str, ".zip")) : new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str).toString(), ".pdf"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            o00o0o2.f100265OooOo0o = file3;
            o00o0o2.f100266OooOoO = 1;
            c20358OooO00o.OooO00o("exportNotes: noteIds=" + set + ", outputUri=" + uriFromFile + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            if (set.isEmpty()) {
                c20358OooO00o.OooO0OO("exportNotes: noteIds is empty", new Object[0]);
                objOooO00o = Boolean.FALSE;
            } else {
                objOooO00o = set.size() > 1 ? c28282o00ooo.OooO00o(set, uriFromFile, i, abstractC30978OooO, str2, o00o0o2) : OooO0o0((String) oOo000Oo.OooOo.Oooo0o(set), uriFromFile, i, abstractC30978OooO, str2, o00o0o2);
            }
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file2 = file3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = o00o0o2.f100265OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        if (((Boolean) objOooO00o).booleanValue()) {
            return file2;
        }
        C34406OooO00o.f123390OooO00o.OooO0OO(C21638OooO0Oo.OooO00o(file2, "exportNotes: Failed to export notes to "), new Object[0]);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, List list, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o00Ooo o00ooo2;
        String str3;
        C28282o00ooo c28282o00ooo;
        String str4;
        int i2;
        String str5;
        Object objOooO00o;
        boolean z;
        Note note;
        Note note2;
        Uri uri2;
        Object objOooO0o;
        Uri uri3;
        String str6;
        List list2;
        String str7 = str;
        List list3 = list;
        Uri uri4 = uri;
        int i3 = i;
        AbstractC30978OooO abstractC30978OooO2 = abstractC30978OooO;
        if (abstractC32479OooO0OO instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) abstractC32479OooO0OO;
            int i4 = o00ooo2.f100282Oooo00O;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o00ooo2.f100282Oooo00O = i4 - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o2 = o00ooo2.f100280OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = o00ooo2.f100282Oooo00O;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o2);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str7 + ", pageIds=" + list3 + ", outputUri=" + uri4 + ", flag=" + i3 + ", listener=" + abstractC30978OooO2, new Object[0]);
            try {
                C27372Oooooo c27372Oooooo = this.f100296OooO0O0;
                o00ooo2.f100273OooOo0o = this;
                o00ooo2.f100272OooOo = str7;
                o00ooo2.f100275OooOoO0 = list3;
                o00ooo2.f100274OooOoO = uri4;
                o00ooo2.f100276OooOoOO = abstractC30978OooO2;
                str3 = str2;
                try {
                    o00ooo2.f100278OooOoo0 = str3;
                    o00ooo2.f100279OooOooO = i3;
                    o00ooo2.f100282Oooo00O = 1;
                    objOooO00o2 = c27372Oooooo.OooO00o(i3, str7, o00ooo2);
                } catch (Throwable th) {
                    th = th;
                    c28282o00ooo = this;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    String str8 = str3;
                    str4 = str7;
                    i2 = i3;
                    str5 = str8;
                    z = true;
                    if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                    }
                    note = (Note) objOooO00o;
                    if (note != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = str2;
            }
            if (objOooO00o2 != enumC32485OooO00o) {
                str4 = str7;
                i2 = i3;
                str5 = str3;
                c28282o00ooo = this;
                objOooO00o = (Note) objOooO00o2;
                z = true;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                note = (Note) objOooO00o;
                if (note != null) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i5 == 1) {
            i2 = o00ooo2.f100279OooOooO;
            String str9 = (String) o00ooo2.f100278OooOoo0;
            AbstractC30978OooO abstractC30978OooO3 = (AbstractC30978OooO) o00ooo2.f100276OooOoOO;
            Uri uri5 = (Uri) o00ooo2.f100274OooOoO;
            List list4 = (List) o00ooo2.f100275OooOoO0;
            str4 = o00ooo2.f100272OooOo;
            c28282o00ooo = o00ooo2.f100273OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO00o2);
                str5 = str9;
                list3 = list4;
                abstractC30978OooO2 = abstractC30978OooO3;
                uri4 = uri5;
                try {
                    objOooO00o = (Note) objOooO00o2;
                } catch (Throwable th3) {
                    th = th3;
                    String str10 = str5;
                    i3 = i2;
                    str7 = str4;
                    str3 = str10;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    String str82 = str3;
                    str4 = str7;
                    i2 = i3;
                    str5 = str82;
                }
            } catch (Throwable th4) {
                th = th4;
                i3 = i2;
                str7 = str4;
                str3 = str9;
                list3 = list4;
                abstractC30978OooO2 = abstractC30978OooO3;
                uri4 = uri5;
                objOooO00o = C32446OooOOOo.OooO00o(th);
                String str822 = str3;
                str4 = str7;
                i2 = i3;
                str5 = str822;
                z = true;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                note = (Note) objOooO00o;
                if (note != null) {
                }
            }
            z = true;
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = null;
            }
            note = (Note) objOooO00o;
            if (note != null) {
                return Boolean.FALSE;
            }
            C27372Oooooo c27372Oooooo2 = c28282o00ooo.f100296OooO0O0;
            o00ooo2.f100273OooOo0o = c28282o00ooo;
            o00ooo2.f100272OooOo = str4;
            o00ooo2.f100275OooOoO0 = uri4;
            o00ooo2.f100274OooOoO = abstractC30978OooO2;
            o00ooo2.f100276OooOoOO = str5;
            o00ooo2.f100278OooOoo0 = note;
            o00ooo2.f100279OooOooO = i2;
            o00ooo2.f100282Oooo00O = 2;
            Object objOooO0O0 = c27372Oooooo2.OooO0O0(i2, str4, list3, o00ooo2);
            if (objOooO0O0 != enumC32485OooO00o) {
                Uri uri6 = uri4;
                note2 = note;
                objOooO00o2 = objOooO0O0;
                uri2 = uri6;
                List list5 = (List) objOooO00o2;
                C27372Oooooo c27372Oooooo3 = c28282o00ooo.f100296OooO0O0;
                List<String> outlines = note2.getOutlines();
                o00ooo2.f100273OooOo0o = c28282o00ooo;
                o00ooo2.f100272OooOo = str4;
                o00ooo2.f100275OooOoO0 = uri2;
                o00ooo2.f100274OooOoO = abstractC30978OooO2;
                o00ooo2.f100276OooOoOO = str5;
                o00ooo2.f100278OooOoo0 = note2;
                o00ooo2.f100277OooOoo = list5;
                o00ooo2.f100279OooOooO = i2;
                o00ooo2.f100282Oooo00O = 3;
                c27372Oooooo3.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27370OooooOO(c27372Oooooo3.f95301OooO00o, outlines, str4, i2, null), o00ooo2);
                if (objOooO0o != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o2);
                return objOooO00o2;
            }
            i2 = o00ooo2.f100279OooOooO;
            List list6 = o00ooo2.f100277OooOoo;
            note2 = (Note) o00ooo2.f100278OooOoo0;
            str5 = (String) o00ooo2.f100276OooOoOO;
            abstractC30978OooO2 = (AbstractC30978OooO) o00ooo2.f100274OooOoO;
            Uri uri7 = (Uri) o00ooo2.f100275OooOoO0;
            String str11 = o00ooo2.f100272OooOo;
            c28282o00ooo = o00ooo2.f100273OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o2);
            z = true;
            uri3 = uri7;
            str6 = str11;
            list2 = list6;
            String str12 = str5;
            List list7 = (List) objOooO00o2;
            o0OOo0oo.o0ooOOo o0ooooo2 = new o0OOo0oo.o0ooOOo(abstractC30978OooO2);
            boolean z2 = (i2 & 1) == 0 ? z : false;
            boolean z3 = (i2 & 2) == 0 ? z : false;
            C31644OooO0O0 c31644OooO0O0 = new C31644OooO0O0();
            List<String> outlines2 = note2.getOutlines();
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c28282o00ooo.f100295OooO00o;
            o00ooo2.f100273OooOo0o = null;
            o00ooo2.f100272OooOo = null;
            o00ooo2.f100275OooOoO0 = null;
            o00ooo2.f100274OooOoO = null;
            o00ooo2.f100276OooOoOO = null;
            o00ooo2.f100278OooOoo0 = null;
            o00ooo2.f100277OooOoo = null;
            o00ooo2.f100282Oooo00O = 4;
            Object objOooOOO0 = c31644OooO0O0.OooOOO0(list2, list7, outlines2, uri3, abstractApplicationC26277OooOoOO, z2, o0ooooo2, str12, c28282o00ooo.f100296OooO0O0, str6, z3, o00ooo2);
            return objOooOOO0 != enumC32485OooO00o ? enumC32485OooO00o : objOooOOO0;
        }
        i2 = o00ooo2.f100279OooOooO;
        Note note3 = (Note) o00ooo2.f100278OooOoo0;
        String str13 = (String) o00ooo2.f100276OooOoOO;
        AbstractC30978OooO abstractC30978OooO4 = (AbstractC30978OooO) o00ooo2.f100274OooOoO;
        Uri uri8 = (Uri) o00ooo2.f100275OooOoO0;
        str4 = o00ooo2.f100272OooOo;
        c28282o00ooo = o00ooo2.f100273OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o2);
        note2 = note3;
        uri2 = uri8;
        abstractC30978OooO2 = abstractC30978OooO4;
        str5 = str13;
        z = true;
        List list52 = (List) objOooO00o2;
        C27372Oooooo c27372Oooooo32 = c28282o00ooo.f100296OooO0O0;
        List<String> outlines3 = note2.getOutlines();
        o00ooo2.f100273OooOo0o = c28282o00ooo;
        o00ooo2.f100272OooOo = str4;
        o00ooo2.f100275OooOoO0 = uri2;
        o00ooo2.f100274OooOoO = abstractC30978OooO2;
        o00ooo2.f100276OooOoOO = str5;
        o00ooo2.f100278OooOoo0 = note2;
        o00ooo2.f100277OooOoo = list52;
        o00ooo2.f100279OooOooO = i2;
        o00ooo2.f100282Oooo00O = 3;
        c27372Oooooo32.getClass();
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27370OooooOO(c27372Oooooo32.f95301OooO00o, outlines3, str4, i2, null), o00ooo2);
        if (objOooO0o != enumC32485OooO00o) {
            uri3 = uri2;
            str6 = str4;
            list2 = list52;
            objOooO00o2 = objOooO0o;
            String str122 = str5;
            List list72 = (List) objOooO00o2;
            o0OOo0oo.o0ooOOo o0ooooo22 = new o0OOo0oo.o0ooOOo(abstractC30978OooO2);
            if ((i2 & 1) == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            C31644OooO0O0 c31644OooO0O02 = new C31644OooO0O0();
            List<String> outlines22 = note2.getOutlines();
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = c28282o00ooo.f100295OooO00o;
            o00ooo2.f100273OooOo0o = null;
            o00ooo2.f100272OooOo = null;
            o00ooo2.f100275OooOoO0 = null;
            o00ooo2.f100274OooOoO = null;
            o00ooo2.f100276OooOoOO = null;
            o00ooo2.f100278OooOoo0 = null;
            o00ooo2.f100277OooOoo = null;
            o00ooo2.f100282Oooo00O = 4;
            Object objOooOOO02 = c31644OooO0O02.OooOOO0(list2, list72, outlines22, uri3, abstractApplicationC26277OooOoOO2, z2, o0ooooo22, str122, c28282o00ooo.f100296OooO0O0, str6, z3, o00ooo2);
            if (objOooOOO02 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, List list, File file, String str2, int i, AbstractC30978OooO abstractC30978OooO, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o00Oo0 o00oo02;
        File file2;
        if (abstractC32479OooO0OO instanceof o00Oo0) {
            o00oo02 = (o00Oo0) abstractC32479OooO0OO;
            int i2 = o00oo02.f100270OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o00oo02.f100270OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                o00oo02 = new o00Oo0(this, abstractC32479OooO0OO);
            }
        }
        o00Oo0 o00oo03 = o00oo02;
        Object obj = o00oo03.f100268OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o00oo03.f100270OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str + ", pageIds=" + list + ", outputDir=" + file + ", fileName=" + str2 + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            File file3 = new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str2).toString(), ".pdf"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            o00oo03.f100269OooOo0o = file3;
            o00oo03.f100270OooOoO = 1;
            Object objOooO0OO = OooO0OO(str, list, uriFromFile, i, abstractC30978OooO, str3, o00oo03);
            if (objOooO0OO == obj2) {
                return obj2;
            }
            file2 = file3;
            obj = objOooO0OO;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = o00oo03.f100269OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return file2;
        }
        C34406OooO00o.f123390OooO00o.OooO0OO(C21638OooO0Oo.OooO00o(file2, "exportPages: Failed to export pages to "), new Object[0]);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28280o00o0O c28280o00o0O;
        C28282o00ooo c28282o00ooo;
        if (abstractC32479OooO0OO instanceof C28280o00o0O) {
            c28280o00o0O = (C28280o00o0O) abstractC32479OooO0OO;
            int i2 = c28280o00o0O.f100290OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28280o00o0O.f100290OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                c28280o00o0O = new C28280o00o0O(this, abstractC32479OooO0OO);
            }
        }
        C28280o00o0O c28280o00o0O2 = c28280o00o0O;
        Object objOooO00o = c28280o00o0O2.f100289OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28280o00o0O2.f100290OooOooO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.f123390OooO00o.OooO00o("exportSingleNote: outputUri=" + uri + ", noteListener=" + abstractC30978OooO + ", noteId=" + str, new Object[0]);
            c28280o00o0O2.f100284OooOo0o = this;
            c28280o00o0O2.f100283OooOo = uri;
            c28280o00o0O2.f100286OooOoO0 = abstractC30978OooO;
            c28280o00o0O2.f100285OooOoO = str2;
            c28280o00o0O2.f100287OooOoOO = i;
            c28280o00o0O2.f100290OooOooO = 1;
            objOooO00o = this.f100296OooO0O0.OooO00o(i, str, c28280o00o0O2);
            if (objOooO00o != enumC32485OooO00o) {
                c28282o00ooo = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return objOooO00o;
        }
        i = c28280o00o0O2.f100287OooOoOO;
        str2 = c28280o00o0O2.f100285OooOoO;
        abstractC30978OooO = c28280o00o0O2.f100286OooOoO0;
        uri = c28280o00o0O2.f100283OooOo;
        C28282o00ooo c28282o00ooo2 = c28280o00o0O2.f100284OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        c28282o00ooo = c28282o00ooo2;
        Uri uri2 = uri;
        int i4 = i;
        AbstractC30978OooO abstractC30978OooO2 = abstractC30978OooO;
        String str3 = str2;
        Note note = (Note) objOooO00o;
        String id = note.getId();
        List<Page> pages = note.getPages();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
        Iterator<T> it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(((Page) it.next()).getId());
        }
        c28280o00o0O2.f100284OooOo0o = null;
        c28280o00o0O2.f100283OooOo = null;
        c28280o00o0O2.f100286OooOoO0 = null;
        c28280o00o0O2.f100285OooOoO = null;
        c28280o00o0O2.f100290OooOooO = 2;
        Object objOooO0OO = c28282o00ooo.OooO0OO(id, arrayList, uri2, i4, abstractC30978OooO2, str3, c28280o00o0O2);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
