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
import o0OOo0o.C27372Oooooo;
import o0OOo0oo.C27658OoooOOO;
import o0oOo0o0.AbstractC30978OooO;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooOOOO.C31644OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f100297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27372Oooooo f100298OooO0O0;

    public o0OoOo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27372Oooooo c27372Oooooo) {
        this.f100297OooO00o = abstractApplicationC26277OooOoOO;
        this.f100298OooO0O0 = c27372Oooooo;
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
        C28275OooooOo c28275OooooOo;
        String str2;
        File file;
        o0OoOo0 o0oooo02;
        C28275OooooOo c28275OooooOo2;
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
        C28275OooooOo c28275OooooOo3;
        String str3;
        Uri uri3;
        int i5;
        Iterator it2;
        File file2;
        AbstractC30978OooO abstractC30978OooO3;
        String str4;
        o0OoOo0 o0oooo03;
        int i6;
        String title;
        ArrayList arrayList;
        Iterator<T> it3;
        EnumC32485OooO00o enumC32485OooO00o;
        Boolean boolValueOf;
        C32460OooOooO c32460OooOooO;
        if (abstractC32479OooO0OO instanceof C28275OooooOo) {
            c28275OooooOo = (C28275OooooOo) abstractC32479OooO0OO;
            int i7 = c28275OooooOo.f100236Oooo0o0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c28275OooooOo.f100236Oooo0o0 = i7 - Integer.MIN_VALUE;
            } else {
                c28275OooooOo = new C28275OooooOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28275OooooOo.f100234Oooo0O0;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = c28275OooooOo.f100236Oooo0o0;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            File file3 = new File(this.f100297OooO00o.getCacheDir(), androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "pdf-export-"));
            C31190OooO0oo.OooO0o(file3);
            Set set4 = set;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(set4, 10));
            str2 = str;
            file = file3;
            o0oooo02 = this;
            c28275OooooOo2 = c28275OooooOo;
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
            int i9 = c28275OooooOo.f100230Oooo0;
            int i10 = c28275OooooOo.f100233Oooo00o;
            int i11 = c28275OooooOo.f100232Oooo00O;
            Collection collection4 = c28275OooooOo.f100231Oooo000;
            String str5 = (String) c28275OooooOo.f100229OooOooo;
            Iterator it4 = c28275OooooOo.f100228OooOooO;
            Collection collection5 = c28275OooooOo.f100226OooOoo;
            File file4 = c28275OooooOo.f100227OooOoo0;
            String str6 = c28275OooooOo.f100225OooOoOO;
            AbstractC30978OooO abstractC30978OooO4 = c28275OooooOo.f100223OooOoO;
            Uri uri4 = c28275OooooOo.f100224OooOoO0;
            Set set5 = c28275OooooOo.f100221OooOo;
            o0OoOo0 o0oooo04 = c28275OooooOo.f100222OooOo0o;
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
            c28275OooooOo3 = c28275OooooOo;
            i6 = i9;
            o0oooo03 = o0oooo04;
            Note note = (Note) objOooO00o;
            title = note.getTitle();
            EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o2;
            C34406OooO00o.f123390OooO00o.OooO00o("exportMultiNotes: noteTitle=" + title + ", directory=" + file2 + ", noteListener=" + abstractC30978OooO3 + ", noteId=" + str4, new Object[0]);
            List<Page> pages = note.getPages();
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            it3 = pages.iterator();
            while (it3.hasNext()) {
            }
            c28275OooooOo3.f100222OooOo0o = o0oooo03;
            c28275OooooOo3.f100221OooOo = set3;
            c28275OooooOo3.f100224OooOoO0 = uri3;
            c28275OooooOo3.f100223OooOoO = abstractC30978OooO3;
            c28275OooooOo3.f100225OooOoOO = str3;
            c28275OooooOo3.f100227OooOoo0 = file2;
            c28275OooooOo3.f100226OooOoo = collection2;
            c28275OooooOo3.f100228OooOooO = it2;
            c28275OooooOo3.f100229OooOooo = collection3;
            c28275OooooOo3.f100231Oooo000 = null;
            c28275OooooOo3.f100232Oooo00O = i5;
            c28275OooooOo3.f100233Oooo00o = i4;
            c28275OooooOo3.f100230Oooo0 = i6;
            c28275OooooOo3.f100236Oooo0o0 = 2;
            Uri uri5 = uri3;
            AbstractC30978OooO abstractC30978OooO5 = abstractC30978OooO3;
            Iterator it5 = it2;
            enumC32485OooO00o = enumC32485OooO00o3;
            if (o0oooo03.OooO0Oo(str4, arrayList, file2, title, i5, null, str3, c28275OooooOo3) != enumC32485OooO00o) {
            }
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = c28275OooooOo.f100230Oooo0;
            int i13 = c28275OooooOo.f100233Oooo00o;
            int i14 = c28275OooooOo.f100232Oooo00O;
            Collection collection6 = (Collection) c28275OooooOo.f100229OooOooo;
            Iterator it6 = c28275OooooOo.f100228OooOooO;
            Collection collection7 = c28275OooooOo.f100226OooOoo;
            File file5 = c28275OooooOo.f100227OooOoo0;
            String str7 = c28275OooooOo.f100225OooOoOO;
            abstractC30978OooO2 = c28275OooooOo.f100223OooOoO;
            Uri uri6 = c28275OooooOo.f100224OooOoO0;
            Set set6 = c28275OooooOo.f100221OooOo;
            o0oooo02 = c28275OooooOo.f100222OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c28275OooooOo2 = c28275OooooOo;
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
                C27372Oooooo c27372Oooooo = o0oooo02.f100298OooO0O0;
                c28275OooooOo2.f100222OooOo0o = o0oooo02;
                Set set7 = set2;
                c28275OooooOo2.f100221OooOo = set7;
                c28275OooooOo2.f100224OooOoO0 = uri2;
                c28275OooooOo2.f100223OooOoO = abstractC30978OooO2;
                c28275OooooOo2.f100225OooOoOO = str2;
                c28275OooooOo2.f100227OooOoo0 = file;
                Collection collection8 = collection;
                c28275OooooOo2.f100226OooOoo = collection8;
                c28275OooooOo2.f100228OooOooO = it;
                c28275OooooOo2.f100229OooOooo = str8;
                c28275OooooOo2.f100231Oooo000 = collection8;
                c28275OooooOo2.f100232Oooo00O = i3;
                c28275OooooOo2.f100233Oooo00o = i4;
                c28275OooooOo2.f100230Oooo0 = i2;
                c28275OooooOo2.f100236Oooo0o0 = 1;
                objOooO00o = c27372Oooooo.OooO00o(i3, str8, c28275OooooOo2);
                if (objOooO00o == enumC32485OooO00o2) {
                    return enumC32485OooO00o2;
                }
                set3 = set7;
                collection2 = collection;
                uri3 = uri2;
                i6 = i2;
                c28275OooooOo3 = c28275OooooOo2;
                it2 = it;
                i5 = i3;
                o0oooo03 = o0oooo02;
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
                c28275OooooOo3.f100222OooOo0o = o0oooo03;
                c28275OooooOo3.f100221OooOo = set3;
                c28275OooooOo3.f100224OooOoO0 = uri3;
                c28275OooooOo3.f100223OooOoO = abstractC30978OooO3;
                c28275OooooOo3.f100225OooOoOO = str3;
                c28275OooooOo3.f100227OooOoo0 = file2;
                c28275OooooOo3.f100226OooOoo = collection2;
                c28275OooooOo3.f100228OooOooO = it2;
                c28275OooooOo3.f100229OooOooo = collection3;
                c28275OooooOo3.f100231Oooo000 = null;
                c28275OooooOo3.f100232Oooo00O = i5;
                c28275OooooOo3.f100233Oooo00o = i4;
                c28275OooooOo3.f100230Oooo0 = i6;
                c28275OooooOo3.f100236Oooo0o0 = 2;
                Uri uri52 = uri3;
                AbstractC30978OooO abstractC30978OooO52 = abstractC30978OooO3;
                Iterator it52 = it2;
                enumC32485OooO00o = enumC32485OooO00o32;
                if (o0oooo03.OooO0Oo(str4, arrayList, file2, title, i5, null, str3, c28275OooooOo3) != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o0OoOo0 o0oooo05 = o0oooo03;
                i12 = i6;
                uri2 = uri52;
                file5 = file2;
                o0oooo02 = o0oooo05;
                abstractC30978OooO2 = abstractC30978OooO52;
                c28275OooooOo2 = c28275OooooOo3;
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
                    OutputStream outputStreamOpenOutputStream = o0oooo02.f100297OooO00o.getContentResolver().openOutputStream(uri2);
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
        C28277Oooooo0 c28277Oooooo0;
        o0OoOo0 o0oooo02;
        File file2;
        if (abstractC32479OooO0OO instanceof C28277Oooooo0) {
            c28277Oooooo0 = (C28277Oooooo0) abstractC32479OooO0OO;
            int i2 = c28277Oooooo0.f100243OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28277Oooooo0.f100243OooOoO = i2 - Integer.MIN_VALUE;
                o0oooo02 = this;
            } else {
                o0oooo02 = this;
                c28277Oooooo0 = new C28277Oooooo0(o0oooo02, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c28277Oooooo0.f100241OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28277Oooooo0.f100243OooOoO;
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
            c28277Oooooo0.f100242OooOo0o = file3;
            c28277Oooooo0.f100243OooOoO = 1;
            c20358OooO00o.OooO00o("exportNotes: noteIds=" + set + ", outputUri=" + uriFromFile + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            if (set.isEmpty()) {
                c20358OooO00o.OooO0OO("exportNotes: noteIds is empty", new Object[0]);
                objOooO00o = Boolean.FALSE;
            } else {
                objOooO00o = set.size() > 1 ? o0oooo02.OooO00o(set, uriFromFile, i, abstractC30978OooO, str2, c28277Oooooo0) : OooO0o0((String) oOo000Oo.OooOo.Oooo0o(set), uriFromFile, i, abstractC30978OooO, str2, c28277Oooooo0);
            }
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file2 = file3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = c28277Oooooo0.f100242OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        if (((Boolean) objOooO00o).booleanValue()) {
            return file2;
        }
        C34406OooO00o.f123390OooO00o.OooO0OO(C21638OooO0Oo.OooO00o(file2, "exportNotes: Failed to export notes to "), new Object[0]);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, List list, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28278OoooooO c28278OoooooO;
        o0OoOo0 o0oooo02;
        if (abstractC32479OooO0OO instanceof C28278OoooooO) {
            c28278OoooooO = (C28278OoooooO) abstractC32479OooO0OO;
            int i2 = c28278OoooooO.f100250OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28278OoooooO.f100250OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                c28278OoooooO = new C28278OoooooO(this, abstractC32479OooO0OO);
            }
        }
        C28278OoooooO c28278OoooooO2 = c28278OoooooO;
        Object objOooO0O0 = c28278OoooooO2.f100249OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28278OoooooO2.f100250OooOoo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str + ", pageIds=" + list + ", outputUri=" + uri + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            c28278OoooooO2.f100246OooOo0o = this;
            c28278OoooooO2.f100245OooOo = uri;
            c28278OoooooO2.f100248OooOoO0 = abstractC30978OooO;
            c28278OoooooO2.f100247OooOoO = str2;
            c28278OoooooO2.f100250OooOoo = 1;
            objOooO0O0 = this.f100298OooO0O0.OooO0O0(i, str, list, c28278OoooooO2);
            if (objOooO0O0 != enumC32485OooO00o) {
                o0oooo02 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return objOooO0O0;
        }
        str2 = c28278OoooooO2.f100247OooOoO;
        abstractC30978OooO = c28278OoooooO2.f100248OooOoO0;
        uri = c28278OoooooO2.f100245OooOo;
        o0oooo02 = c28278OoooooO2.f100246OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        C27658OoooOOO c27658OoooOOO = new C27658OoooOOO(abstractC30978OooO);
        o0OoOo0 o0oooo03 = o0oooo02;
        C31644OooO0O0 c31644OooO0O0 = new C31644OooO0O0();
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = o0oooo03.f100297OooO00o;
        c28278OoooooO2.f100246OooOo0o = null;
        c28278OoooooO2.f100245OooOo = null;
        c28278OoooooO2.f100248OooOoO0 = null;
        c28278OoooooO2.f100247OooOoO = null;
        c28278OoooooO2.f100250OooOoo = 2;
        Object objOooOO0O = c31644OooO0O0.OooOO0O((List) objOooO0O0, uri, abstractApplicationC26277OooOoOO, c27658OoooOOO, str2, c28278OoooooO2);
        return objOooOO0O == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, List list, File file, String str2, int i, AbstractC30978OooO abstractC30978OooO, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28276Oooooo c28276Oooooo;
        File file2;
        if (abstractC32479OooO0OO instanceof C28276Oooooo) {
            c28276Oooooo = (C28276Oooooo) abstractC32479OooO0OO;
            int i2 = c28276Oooooo.f100239OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28276Oooooo.f100239OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c28276Oooooo = new C28276Oooooo(this, abstractC32479OooO0OO);
            }
        }
        C28276Oooooo c28276Oooooo2 = c28276Oooooo;
        Object obj = c28276Oooooo2.f100237OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28276Oooooo2.f100239OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str + ", pageIds=" + list + ", outputDir=" + file + ", fileName=" + str2 + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            File file3 = new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str2).toString(), ".pdf"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            c28276Oooooo2.f100238OooOo0o = file3;
            c28276Oooooo2.f100239OooOoO = 1;
            Object objOooO0OO = OooO0OO(str, list, uriFromFile, i, abstractC30978OooO, str3, c28276Oooooo2);
            if (objOooO0OO == obj2) {
                return obj2;
            }
            file2 = file3;
            obj = objOooO0OO;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = c28276Oooooo2.f100238OooOo0o;
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
        C28279Ooooooo c28279Ooooooo;
        o0OoOo0 o0oooo02;
        if (abstractC32479OooO0OO instanceof C28279Ooooooo) {
            c28279Ooooooo = (C28279Ooooooo) abstractC32479OooO0OO;
            int i2 = c28279Ooooooo.f100259OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28279Ooooooo.f100259OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                c28279Ooooooo = new C28279Ooooooo(this, abstractC32479OooO0OO);
            }
        }
        C28279Ooooooo c28279Ooooooo2 = c28279Ooooooo;
        Object objOooO00o = c28279Ooooooo2.f100258OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28279Ooooooo2.f100259OooOooO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.f123390OooO00o.OooO00o("exportSingleNote: outputUri=" + uri + ", noteListener=" + abstractC30978OooO + ", noteId=" + str, new Object[0]);
            c28279Ooooooo2.f100253OooOo0o = this;
            c28279Ooooooo2.f100252OooOo = uri;
            c28279Ooooooo2.f100255OooOoO0 = abstractC30978OooO;
            c28279Ooooooo2.f100254OooOoO = str2;
            c28279Ooooooo2.f100256OooOoOO = i;
            c28279Ooooooo2.f100259OooOooO = 1;
            objOooO00o = this.f100298OooO0O0.OooO00o(i, str, c28279Ooooooo2);
            if (objOooO00o != enumC32485OooO00o) {
                o0oooo02 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return objOooO00o;
        }
        i = c28279Ooooooo2.f100256OooOoOO;
        str2 = c28279Ooooooo2.f100254OooOoO;
        abstractC30978OooO = c28279Ooooooo2.f100255OooOoO0;
        uri = c28279Ooooooo2.f100252OooOo;
        o0OoOo0 o0oooo03 = c28279Ooooooo2.f100253OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        o0oooo02 = o0oooo03;
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
        c28279Ooooooo2.f100253OooOo0o = null;
        c28279Ooooooo2.f100252OooOo = null;
        c28279Ooooooo2.f100255OooOoO0 = null;
        c28279Ooooooo2.f100254OooOoO = null;
        c28279Ooooooo2.f100259OooOooO = 2;
        Object objOooO0OO = o0oooo02.OooO0OO(id, arrayList, uri2, i4, abstractC30978OooO2, str3, c28279Ooooooo2);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
