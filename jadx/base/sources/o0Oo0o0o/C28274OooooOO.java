package o0Oo0o0o;

import Oooo0oO.C21111o0ooOoO;
import android.net.Uri;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteInFile;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.C27372Oooooo;
import o0OOo0o.C27387o0000o0;
import o0OOo0o.C27399o000O0o;
import o0OOo0o.o000;
import o0OoO0oo.C28692OooO0oo;
import o0oOo0o0.AbstractC30978OooO;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Oo0o0o.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28274OooooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f100218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27372Oooooo f100219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27387o0000o0 f100220OooO0OO;

    public C28274OooooOO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27372Oooooo c27372Oooooo, C27387o0000o0 noteInFileUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        this.f100218OooO00o = abstractApplicationC26277OooOoOO;
        this.f100219OooO0O0 = c27372Oooooo;
        this.f100220OooO0OO = noteInFileUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cb -> B:35:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Set set, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C28269OoooOoO c28269OoooOoO;
        C28274OooooOO c28274OooooOO;
        C27387o0000o0.OooO0OO oooO0OO;
        C28274OooooOO c28274OooooOO2;
        Iterator it;
        Collection collection;
        Set set2;
        AbstractC30978OooO abstractC30978OooO2;
        int i2;
        C28269OoooOoO c28269OoooOoO2;
        Uri uri2;
        Boolean boolValueOf;
        if (abstractC32479OooO0OO instanceof C28269OoooOoO) {
            c28269OoooOoO = (C28269OoooOoO) abstractC32479OooO0OO;
            int i3 = c28269OoooOoO.f100192Oooo00o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c28269OoooOoO.f100192Oooo00o = i3 - Integer.MIN_VALUE;
                c28274OooooOO = this;
            } else {
                c28274OooooOO = this;
                c28269OoooOoO = new C28269OoooOoO(c28274OooooOO, abstractC32479OooO0OO);
            }
        }
        Object obj = c28269OoooOoO.f100190Oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c28269OoooOoO.f100192Oooo00o;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27387o0000o0.OooO0OO oooO0OO2 = new C27387o0000o0.OooO0OO(8, (i & 1) != 0, (i & 2) != 0, (i & 4) != 0);
            ArrayList arrayList = new ArrayList();
            oooO0OO = oooO0OO2;
            c28274OooooOO2 = c28274OooooOO;
            it = set.iterator();
            collection = arrayList;
            set2 = set;
            abstractC30978OooO2 = abstractC30978OooO;
            i2 = 0;
            c28269OoooOoO2 = c28269OoooOoO;
            uri2 = uri;
            if (it.hasNext()) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c28269OoooOoO.f100189OooOooo;
            int i6 = c28269OoooOoO.f100188OooOooO;
            Iterator it2 = c28269OoooOoO.f100186OooOoo;
            Collection collection2 = c28269OoooOoO.f100187OooOoo0;
            C27387o0000o0.OooO0OO oooO0OO3 = c28269OoooOoO.f100185OooOoOO;
            AbstractC30978OooO abstractC30978OooO3 = c28269OoooOoO.f100183OooOoO;
            Uri uri3 = c28269OoooOoO.f100184OooOoO0;
            Set set3 = c28269OoooOoO.f100181OooOo;
            c28274OooooOO2 = c28269OoooOoO.f100182OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i2 = i5;
            abstractC30978OooO2 = abstractC30978OooO3;
            oooO0OO = oooO0OO3;
            collection = collection2;
            it = it2;
            int i7 = i6;
            float f = 1.0f;
            c28269OoooOoO2 = c28269OoooOoO;
            uri2 = uri3;
            NoteInFile noteInFile = (NoteInFile) obj;
            if (abstractC30978OooO2 != null) {
                abstractC30978OooO2.OooO00o((i2 * f) / set3.size());
            }
            if (noteInFile != null) {
                collection.add(noteInFile);
            }
            i2 = i7;
            set2 = set3;
            if (it.hasNext()) {
                Object next = it.next();
                int i8 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                f = 1.0f;
                C27387o0000o0 c27387o0000o0 = c28274OooooOO2.f100220OooO0OO;
                c28269OoooOoO2.f100182OooOo0o = c28274OooooOO2;
                c28269OoooOoO2.f100181OooOo = set2;
                c28269OoooOoO2.f100184OooOoO0 = uri2;
                c28269OoooOoO2.f100183OooOoO = abstractC30978OooO2;
                c28269OoooOoO2.f100185OooOoOO = oooO0OO;
                c28269OoooOoO2.f100187OooOoo0 = collection;
                c28269OoooOoO2.f100186OooOoo = it;
                c28269OoooOoO2.f100188OooOooO = i8;
                c28269OoooOoO2.f100189OooOooo = i2;
                c28269OoooOoO2.f100192Oooo00o = 1;
                Object objOooo0oO = C27387o0000o0.Oooo0oO(c27387o0000o0, (String) next, oooO0OO, c28269OoooOoO2, 4);
                if (objOooo0oO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                set3 = set2;
                obj = objOooo0oO;
                i7 = i8;
                NoteInFile noteInFile2 = (NoteInFile) obj;
                if (abstractC30978OooO2 != null) {
                }
                if (noteInFile2 != null) {
                }
                i2 = i7;
                set2 = set3;
                if (it.hasNext()) {
                    List list = (List) collection;
                    OutputStream outputStreamOpenOutputStream = c28274OooooOO2.f100218OooO00o.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                File file = ((NoteInFile) it3.next()).getFile();
                                if (file != null) {
                                    arrayList2.add(file);
                                }
                            }
                            boolValueOf = Boolean.valueOf(C31193OooOOo.OooO0oO(arrayList2, outputStreamOpenOutputStream));
                            outputStreamOpenOutputStream.close();
                        } finally {
                        }
                    } else {
                        boolValueOf = null;
                    }
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((NoteInFile) it4.next()).deleteFileWithItsParentAfterUsed();
                    }
                    if (abstractC30978OooO2 != null) {
                        abstractC30978OooO2.OooO00o(1.0f);
                    }
                    return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, Boolean.TRUE));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Set set, File file, String str, int i, AbstractC30978OooO abstractC30978OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28270OoooOoo c28270OoooOoo;
        File file2;
        if (abstractC32479OooO0OO instanceof C28270OoooOoo) {
            c28270OoooOoo = (C28270OoooOoo) abstractC32479OooO0OO;
            int i2 = c28270OoooOoo.f100195OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28270OoooOoo.f100195OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c28270OoooOoo = new C28270OoooOoo(this, abstractC32479OooO0OO);
            }
        }
        C28270OoooOoo c28270OoooOoo2 = c28270OoooOoo;
        Object objOooO00o = c28270OoooOoo2.f100193OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28270OoooOoo2.f100195OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NativeFormatExporter");
            c20358OooO00o.OooO0o0("exportNotes: noteIds=" + set + ", outputDir=" + file + ", fileName=" + str + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            File file3 = set.size() > 1 ? new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(str, ".zip")))) : new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str).toString(), ".in"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            c28270OoooOoo2.f100194OooOo0o = file3;
            c28270OoooOoo2.f100195OooOoO = 1;
            c20358OooO00o.OooO00o("exportNotes: noteIds=" + set + ", outputUri=" + uriFromFile + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            if (set.isEmpty()) {
                c20358OooO00o.OooO0OO("exportNotes: noteIds is empty", new Object[0]);
                objOooO00o = Boolean.FALSE;
            } else {
                objOooO00o = set.size() > 1 ? OooO00o(set, uriFromFile, i, abstractC30978OooO, c28270OoooOoo2) : OooO0o0((String) oOo000Oo.OooOo.Oooo0o(set), uriFromFile, i, abstractC30978OooO, c28270OoooOoo2);
            }
            if (objOooO00o == obj) {
                return obj;
            }
            file2 = file3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = c28270OoooOoo2.f100194OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        if (((Boolean) objOooO00o).booleanValue()) {
            return file2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, CopyOnWriteArrayList copyOnWriteArrayList, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28272Ooooo0o c28272Ooooo0o;
        Uri uri2;
        String str2;
        int i2;
        AbstractC30978OooO abstractC30978OooO2;
        List list;
        C28274OooooOO c28274OooooOO;
        AbstractC30978OooO abstractC30978OooO3;
        Uri uri3;
        List list2;
        C28274OooooOO c28274OooooOO2;
        String str3;
        NoteInFile noteInFile;
        if (abstractC32479OooO0OO instanceof C28272Ooooo0o) {
            c28272Ooooo0o = (C28272Ooooo0o) abstractC32479OooO0OO;
            int i3 = c28272Ooooo0o.f100209OooOooo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c28272Ooooo0o.f100209OooOooo = i3 - Integer.MIN_VALUE;
            } else {
                c28272Ooooo0o = new C28272Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28272Ooooo0o.f100206OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c28272Ooooo0o.f100209OooOooo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c28272Ooooo0o.f100202OooOo0o = this;
            c28272Ooooo0o.f100201OooOo = str;
            c28272Ooooo0o.f100204OooOoO0 = copyOnWriteArrayList;
            uri2 = uri;
            c28272Ooooo0o.f100203OooOoO = uri2;
            c28272Ooooo0o.f100205OooOoOO = abstractC30978OooO;
            c28272Ooooo0o.f100207OooOoo0 = i;
            c28272Ooooo0o.f100209OooOooo = 1;
            Object objOooO00o = this.f100219OooO0O0.OooO00o(i, str, c28272Ooooo0o);
            if (objOooO00o != enumC32485OooO00o) {
                str2 = str;
                i2 = i;
                abstractC30978OooO2 = abstractC30978OooO;
                list = copyOnWriteArrayList;
                objOooO0o = objOooO00o;
                c28274OooooOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC30978OooO3 = c28272Ooooo0o.f100205OooOoOO;
            uri3 = c28272Ooooo0o.f100203OooOoO;
            list2 = c28272Ooooo0o.f100204OooOoO0;
            str3 = c28272Ooooo0o.f100201OooOo;
            c28274OooooOO2 = c28272Ooooo0o.f100202OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            noteInFile = (NoteInFile) objOooO0o;
            if (noteInFile != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "NativeFormatExporter", "exportPages: Couldn't get notein file, by noteId: ", str3, ", pageIds: ");
                sbOooO00o.append(list2);
                c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
                return Boolean.FALSE;
            }
            if (abstractC30978OooO3 != null) {
                abstractC30978OooO3.OooO00o(0.5f);
            }
            boolean zOooO0OO = C31190OooO0oo.OooO0OO(c28274OooooOO2.f100218OooO00o, noteInFile.getFile(), uri3);
            noteInFile.deleteFileWithItsParentAfterUsed();
            if (abstractC30978OooO3 != null) {
                abstractC30978OooO3.OooO00o(1.0f);
            }
            return Boolean.valueOf(zOooO0OO);
        }
        i2 = c28272Ooooo0o.f100207OooOoo0;
        abstractC30978OooO2 = c28272Ooooo0o.f100205OooOoOO;
        uri2 = c28272Ooooo0o.f100203OooOoO;
        list = c28272Ooooo0o.f100204OooOoO0;
        String str4 = c28272Ooooo0o.f100201OooOo;
        C28274OooooOO c28274OooooOO3 = c28272Ooooo0o.f100202OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        str2 = str4;
        c28274OooooOO = c28274OooooOO3;
        Note note = (Note) objOooO0o;
        String strOooO0OO = C28692OooO0oo.OooO0OO(c28274OooooOO.f100218OooO00o, uri2);
        String title = strOooO0OO.length() == 0 ? note.getTitle() : C32501OooO0oO.OooO0o(new File(strOooO0OO));
        C27387o0000o0.OooO0OO oooO0OO = new C27387o0000o0.OooO0OO((i2 & 1) != 0, (i2 & 2) != 0, (i2 & 4) != 0, (i2 & 16) != 0, false);
        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(list);
        c28272Ooooo0o.f100202OooOo0o = c28274OooooOO;
        c28272Ooooo0o.f100201OooOo = str2;
        c28272Ooooo0o.f100204OooOoO0 = list;
        c28272Ooooo0o.f100203OooOoO = uri2;
        c28272Ooooo0o.f100205OooOoOO = abstractC30978OooO2;
        c28272Ooooo0o.f100209OooOooo = 2;
        C27387o0000o0 c27387o0000o0 = c28274OooooOO.f100220OooO0OO;
        c27387o0000o0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27399o000O0o(c27387o0000o0, str2, setO0OO00O, title, oooO0OO, null), c28272Ooooo0o);
        if (objOooO0o != enumC32485OooO00o) {
            abstractC30978OooO3 = abstractC30978OooO2;
            uri3 = uri2;
            list2 = list;
            c28274OooooOO2 = c28274OooooOO;
            str3 = str2;
            noteInFile = (NoteInFile) objOooO0o;
            if (noteInFile != null) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, CopyOnWriteArrayList copyOnWriteArrayList, File file, String str2, int i, AbstractC30978OooO abstractC30978OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28271Ooooo00 c28271Ooooo00;
        File file2;
        if (abstractC32479OooO0OO instanceof C28271Ooooo00) {
            c28271Ooooo00 = (C28271Ooooo00) abstractC32479OooO0OO;
            int i2 = c28271Ooooo00.f100199OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28271Ooooo00.f100199OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c28271Ooooo00 = new C28271Ooooo00(this, abstractC32479OooO0OO);
            }
        }
        C28271Ooooo00 c28271Ooooo002 = c28271Ooooo00;
        Object obj = c28271Ooooo002.f100197OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28271Ooooo002.f100199OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str + ", pageIds=" + copyOnWriteArrayList + ", outputDir=" + file + ", fileName=" + str2 + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            File file3 = new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str2).toString(), ".in"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            c28271Ooooo002.f100198OooOo0o = file3;
            c28271Ooooo002.f100199OooOoO = 1;
            Object objOooO0OO = OooO0OO(str, copyOnWriteArrayList, uriFromFile, i, abstractC30978OooO, c28271Ooooo002);
            if (objOooO0OO == obj2) {
                return obj2;
            }
            file2 = file3;
            obj = objOooO0OO;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = c28271Ooooo002.f100198OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return file2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28273OooooO0 c28273OooooO0;
        C28274OooooOO c28274OooooOO;
        String str2;
        int i2;
        Uri uri2;
        AbstractC30978OooO abstractC30978OooO2;
        C28274OooooOO c28274OooooOO2;
        String str3;
        File file;
        Uri uri3 = uri;
        AbstractC30978OooO abstractC30978OooO3 = abstractC30978OooO;
        if (abstractC32479OooO0OO instanceof C28273OooooO0) {
            c28273OooooO0 = (C28273OooooO0) abstractC32479OooO0OO;
            int i3 = c28273OooooO0.f100217OooOooO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c28273OooooO0.f100217OooOooO = i3 - Integer.MIN_VALUE;
            } else {
                c28273OooooO0 = new C28273OooooO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c28273OooooO0.f100216OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c28273OooooO0.f100217OooOooO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.f123390OooO00o.OooO00o("exportSingleNote: outputUri=" + uri3 + ", noteListener=" + abstractC30978OooO3 + ", noteId=" + str, new Object[0]);
            c28273OooooO0.f100211OooOo0o = this;
            c28273OooooO0.f100210OooOo = str;
            c28273OooooO0.f100213OooOoO0 = uri3;
            c28273OooooO0.f100212OooOoO = abstractC30978OooO3;
            c28273OooooO0.f100214OooOoOO = i;
            c28273OooooO0.f100217OooOooO = 1;
            objOooO00o = this.f100219OooO0O0.OooO00o(i, str, c28273OooooO0);
            if (objOooO00o != enumC32485OooO00o) {
                c28274OooooOO = this;
                str2 = str;
                i2 = i;
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c28273OooooO0.f100214OooOoOO;
            abstractC30978OooO2 = c28273OooooO0.f100212OooOoO;
            uri2 = c28273OooooO0.f100213OooOoO0;
            str3 = c28273OooooO0.f100210OooOo;
            c28274OooooOO2 = c28273OooooO0.f100211OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            NoteInFile noteInFile = (NoteInFile) objOooO00o;
            if (abstractC30978OooO2 != null) {
                abstractC30978OooO2.OooO00o(0.5f);
            }
            file = noteInFile == null ? noteInFile.getFile() : null;
            if (file == null && file.exists()) {
                boolean zOooO0OO = C31190OooO0oo.OooO0OO(c28274OooooOO2.f100218OooO00o, file, uri2);
                noteInFile.deleteFileWithItsParentAfterUsed();
                if (abstractC30978OooO2 != null) {
                    abstractC30978OooO2.OooO00o(1.0f);
                }
                return Boolean.valueOf(zOooO0OO);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "NativeFormatExporter", "exportSingleNote: noteInFile is null or not exist, noteId=", str3, ", flag=");
            sbOooO00o.append(i2);
            sbOooO00o.append(", outputUri=");
            sbOooO00o.append(uri2);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            return Boolean.FALSE;
        }
        i2 = c28273OooooO0.f100214OooOoOO;
        AbstractC30978OooO abstractC30978OooO4 = c28273OooooO0.f100212OooOoO;
        Uri uri4 = c28273OooooO0.f100213OooOoO0;
        String str4 = c28273OooooO0.f100210OooOo;
        c28274OooooOO = c28273OooooO0.f100211OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        str2 = str4;
        abstractC30978OooO3 = abstractC30978OooO4;
        uri3 = uri4;
        Note note = (Note) objOooO00o;
        String strOooO0OO = C28692OooO0oo.OooO0OO(c28274OooooOO.f100218OooO00o, uri3);
        String title = strOooO0OO.length() == 0 ? note.getTitle() : C32501OooO0oO.OooO0o(new File(strOooO0OO));
        C27387o0000o0.OooO0OO oooO0OO = new C27387o0000o0.OooO0OO((i2 & 1) != 0, (i2 & 2) != 0, (i2 & 4) != 0, (i2 & 16) != 0, false);
        c28273OooooO0.f100211OooOo0o = c28274OooooOO;
        c28273OooooO0.f100210OooOo = str2;
        c28273OooooO0.f100213OooOoO0 = uri3;
        c28273OooooO0.f100212OooOoO = abstractC30978OooO3;
        c28273OooooO0.f100214OooOoOO = i2;
        c28273OooooO0.f100217OooOooO = 2;
        C27387o0000o0 c27387o0000o0 = c28274OooooOO.f100220OooO0OO;
        c27387o0000o0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO00o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000(c27387o0000o0, str2, title, oooO0OO, null), c28273OooooO0);
        if (objOooO00o != enumC32485OooO00o) {
            uri2 = uri3;
            abstractC30978OooO2 = abstractC30978OooO3;
            c28274OooooOO2 = c28274OooooOO;
            str3 = str2;
            NoteInFile noteInFile2 = (NoteInFile) objOooO00o;
            if (abstractC30978OooO2 != null) {
            }
            if (noteInFile2 == null) {
            }
            if (file == null) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o2, "NativeFormatExporter", "exportSingleNote: noteInFile is null or not exist, noteId=", str3, ", flag=");
            sbOooO00o2.append(i2);
            sbOooO00o2.append(", outputUri=");
            sbOooO00o2.append(uri2);
            c20358OooO00o2.OooO0o0(sbOooO00o2.toString(), new Object[0]);
            return Boolean.FALSE;
        }
        return enumC32485OooO00o;
    }
}
