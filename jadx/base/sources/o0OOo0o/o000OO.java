package o0OOo0o;

import OooOoo.C20593OooO0Oo;
import android.net.Uri;
import androidx.fragment.app.C21904OooOoo0;
import com.aspose.slides.InvalidPasswordException;
import com.aspose.words.IncorrectPasswordException;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.global.R;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26427Oooo0O0;
import o0OO00o0.C26620o00Oo00o;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27088OooO0oo;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27296OooOO0o;
import o0OOo0Oo.InterfaceC27297OooOOO;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import o0OOoOO.C27774OooO0o0;
import o0OOooO.C27881OooOO0O;
import o0OoO0oo.C28692OooO0oo;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27600o0ooOO0 f95593OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27020OooOoO0 f95594OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27095OooOo0O f95595OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26427Oooo0O0 f95596OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26620o00Oo00o f95597OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27129OoooOOO f95598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27296OooOO0o f95599OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27297OooOOO f95600OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC27314OooOooO f95601OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27585o00ooO0 f95602OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C27449o00O0OoO f95603OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27499o00Ooo0 f95604OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C27367Ooooo00 f95605OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final InterfaceC27322Oooo0o0 f95606OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C27774OooO0o0 f95607OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C27881OooOO0O f95608OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final String f95609OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f95610OooOOo0;

    public o000OO(C27020OooOoO0 c27020OooOoO0, C27095OooOo0O c27095OooOo0O, C26427Oooo0O0 c26427Oooo0O0, C26620o00Oo00o c26620o00Oo00o, InterfaceC27296OooOO0o docRepo, C27129OoooOOO c27129OoooOOO, InterfaceC27297OooOOO fontDownloadService, InterfaceC27314OooOooO notePlaceholderRepo, C27600o0ooOO0 c27600o0ooOO0, C27585o00ooO0 c27585o00ooO0, C27449o00O0OoO c27449o00O0OoO, C27499o00Ooo0 pdfFileUseCase, InterfaceC27322Oooo0o0 remoteConfigRepo, C27367Ooooo00 c27367Ooooo00, C27774OooO0o0 c27774OooO0o0, C27881OooOO0O c27881OooOO0O, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(docRepo, "docRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontDownloadService, "fontDownloadService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderRepo, "notePlaceholderRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfFileUseCase, "pdfFileUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(remoteConfigRepo, "remoteConfigRepo");
        this.f95594OooO00o = c27020OooOoO0;
        this.f95595OooO0O0 = c27095OooOo0O;
        this.f95596OooO0OO = c26427Oooo0O0;
        this.f95597OooO0Oo = c26620o00Oo00o;
        this.f95599OooO0o0 = docRepo;
        this.f95598OooO0o = c27129OoooOOO;
        this.f95600OooO0oO = fontDownloadService;
        this.f95601OooO0oo = notePlaceholderRepo;
        this.f95593OooO = c27600o0ooOO0;
        this.f95602OooOO0 = c27585o00ooO0;
        this.f95603OooOO0O = c27449o00O0OoO;
        this.f95604OooOO0o = pdfFileUseCase;
        this.f95606OooOOO0 = remoteConfigRepo;
        this.f95605OooOOO = c27367Ooooo00;
        this.f95607OooOOOO = c27774OooO0o0;
        this.f95608OooOOOo = c27881OooOO0O;
        this.f95610OooOOo0 = abstractApplicationC26277OooOoOO;
        String string = abstractApplicationC26277OooOoOO.getString(R.string.note_title_default);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        this.f95609OooOOo = string;
    }

    public static List OooOO0(PdfDocument.Bookmark bookmark, String str, ArrayList arrayList, String str2) {
        Page page = (Page) oOo000Oo.OooOo.OoooO00((int) bookmark.pageIdx, arrayList);
        String id = page != null ? page.getId() : null;
        String strOooO00o = C24761OooO.OooO00o("toString(...)");
        List<PdfDocument.Bookmark> list = bookmark.children;
        if (list == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String title = bookmark.title;
            kotlin.jvm.internal.OooOOO0.OooO0o(title, "title");
            return com.facebook.soloader.OooOo.OooO0oO(new Outline(strOooO00o, title, str, id == null ? "" : id, str2, null, C34434OooOoO.f123453OooOo0o, jCurrentTimeMillis, jCurrentTimeMillis));
        }
        List<PdfDocument.Bookmark> list2 = list;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (PdfDocument.Bookmark bookmark2 : list2) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(bookmark2);
            arrayList2.add(OooOO0(bookmark2, strOooO00o, arrayList, str2));
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Outline) oOo000Oo.OooOo.Oooo0oO((List) it.next())).getId());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String title2 = bookmark.title;
        kotlin.jvm.internal.OooOOO0.OooO0o(title2, "title");
        Outline outline = new Outline(strOooO00o, title2, str, id == null ? "" : id, str2, null, arrayList3, jCurrentTimeMillis2, jCurrentTimeMillis2);
        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(C34428OooOOo.OooOo00(arrayList2));
        arrayListO0ooOoO.add(0, outline);
        return arrayListO0ooOoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(Note note, C27600o0ooOO0 c27600o0ooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000O0O o0000o0o2;
        if (abstractC32479OooO0OO instanceof o0000O0O) {
            o0000o0o2 = (o0000O0O) abstractC32479OooO0OO;
            int i = o0000o0o2.f95406OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o0o2.f95406OooOoO = i - Integer.MIN_VALUE;
            } else {
                o0000o0o2 = new o0000O0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = o0000o0o2.f95404OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000o0o2.f95406OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            String parentId = note.getParentId();
            if (parentId != null) {
                o0000o0o2.f95405OooOo0o = note;
                o0000o0o2.f95406OooOoO = 1;
                objOooO0Oo = c27600o0ooOO0.OooO0Oo(parentId, o0000o0o2);
                if (objOooO0Oo == obj) {
                    return obj;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        note = o0000o0o2.f95405OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        Folder folder = (Folder) objOooO0Oo;
        if (folder != null && folder.getInTrashBin()) {
            note.setParentId(null);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Note note, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27378o00000o0 c27378o00000o0;
        o000OO o000oo2;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C27378o00000o0) {
            c27378o00000o0 = (C27378o00000o0) abstractC32479OooO0OO;
            int i = c27378o00000o0.f95385OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27378o00000o0.f95385OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27378o00000o0 = new C27378o00000o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27378o00000o0.f95382OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27378o00000o0.f95385OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            o000oo2 = this;
            it = note.getPages().iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Page page = c27378o00000o0.f95383OooOoO0;
            it = c27378o00000o0.f95380OooOo;
            o000oo2 = c27378o00000o0.f95381OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            Page page2 = (Page) oOo000Oo.OooOo.Oooo((List) objOooO0O0);
            if (page2 == null) {
                page.setTnPath(page2.getTnPath());
            } else {
                C34406OooO00o.f123390OooO00o.OooO0OO("createDefaultCoverNote: Unable to create page thumbnail", new Object[0]);
            }
            if (it.hasNext()) {
                page = (Page) it.next();
                C27585o00ooO0 c27585o00ooO0 = o000oo2.f95602OooOO0;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(page);
                c27378o00000o0.f95381OooOo0o = o000oo2;
                c27378o00000o0.f95380OooOo = it;
                c27378o00000o0.f95383OooOoO0 = page;
                c27378o00000o0.f95385OooOoo0 = 1;
                objOooO0O0 = c27585o00ooO0.OooO0O0(listOooO0oO, true, c27378o00000o0);
                if (objOooO0O0 == obj) {
                    return obj;
                }
                Page page22 = (Page) oOo000Oo.OooOo.Oooo((List) objOooO0O0);
                if (page22 == null) {
                }
                if (it.hasNext()) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27385o0000Ooo c27385o0000Ooo;
        String str3;
        String str4;
        o000OO o000oo2;
        if (abstractC32479OooO0OO instanceof C27385o0000Ooo) {
            c27385o0000Ooo = (C27385o0000Ooo) abstractC32479OooO0OO;
            int i = c27385o0000Ooo.f95421OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27385o0000Ooo.f95421OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27385o0000Ooo = new C27385o0000Ooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27385o0000Ooo.f95420OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27385o0000Ooo.f95421OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            c27385o0000Ooo.f95417OooOo0o = this;
            c27385o0000Ooo.f95416OooOo = str;
            c27385o0000Ooo.f95419OooOoO0 = str2;
            c27385o0000Ooo.f95418OooOoO = string;
            c27385o0000Ooo.f95421OooOoo = 1;
            Object objOooO00o = this.f95607OooOOOO.OooO00o(string, list, c27385o0000Ooo);
            if (objOooO00o != enumC32485OooO00o) {
                str3 = str;
                str4 = string;
                obj = objOooO00o;
                o000oo2 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        str4 = c27385o0000Ooo.f95418OooOoO;
        str2 = c27385o0000Ooo.f95419OooOoO0;
        str3 = c27385o0000Ooo.f95416OooOo;
        o000oo2 = c27385o0000Ooo.f95417OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List<Page> list2 = (List) obj;
        Note.Builder parentId = new Note.Builder().setId(str4).setDefaultPageSpec(PaperSpec.INSTANCE.getA4()).setDefaultPageTheme(o000oo2.f95595OooO0O0.OooOO0O(((Page) oOo000Oo.OooOo.Oooo0oO(list2)).getPaperOrientation())).setPages(list2).setTitle(str3).setParentId(str2);
        c27385o0000Ooo.f95417OooOo0o = null;
        c27385o0000Ooo.f95416OooOo = null;
        c27385o0000Ooo.f95419OooOoO0 = null;
        c27385o0000Ooo.f95418OooOoO = null;
        c27385o0000Ooo.f95421OooOoo = 2;
        Object objOooO0OO = o000oo2.OooO0OO(parentId, c27385o0000Ooo);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0236, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a A[PHI: r2 r5 r10
      0x014a: PHI (r2v12 com.orion.notein.domain.models.note.Note$Builder) = (r2v9 com.orion.notein.domain.models.note.Note$Builder), (r2v14 com.orion.notein.domain.models.note.Note$Builder) binds: [B:37:0x0146, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r5v9 o0OOo0o.o000OO) = (r5v6 o0OOo0o.o000OO), (r5v11 o0OOo0o.o000OO) binds: [B:37:0x0146, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r10v6 com.orion.notein.domain.models.note.Note) = (r10v4 com.orion.notein.domain.models.note.Note), (r10v7 com.orion.notein.domain.models.note.Note) binds: [B:37:0x0146, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c A[PHI: r2 r5 r10
      0x016c: PHI (r2v15 com.orion.notein.domain.models.note.Note$Builder) = (r2v12 com.orion.notein.domain.models.note.Note$Builder), (r2v17 com.orion.notein.domain.models.note.Note$Builder) binds: [B:40:0x0168, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r5v12 o0OOo0o.o000OO) = (r5v9 o0OOo0o.o000OO), (r5v14 o0OOo0o.o000OO) binds: [B:40:0x0168, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r10v8 com.orion.notein.domain.models.note.Note) = (r10v6 com.orion.notein.domain.models.note.Note), (r10v9 com.orion.notein.domain.models.note.Note) binds: [B:40:0x0168, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c A[LOOP:0: B:43:0x0186->B:45:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c2 A[PHI: r2 r5 r10
      0x01c2: PHI (r2v18 com.orion.notein.domain.models.note.Note$Builder) = (r2v15 com.orion.notein.domain.models.note.Note$Builder), (r2v20 com.orion.notein.domain.models.note.Note$Builder) binds: [B:50:0x01be, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r5v15 o0OOo0o.o000OO) = (r5v12 o0OOo0o.o000OO), (r5v17 o0OOo0o.o000OO) binds: [B:50:0x01be, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r10v10 com.orion.notein.domain.models.note.Note) = (r10v8 com.orion.notein.domain.models.note.Note), (r10v11 com.orion.notein.domain.models.note.Note) binds: [B:50:0x01be, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4 A[PHI: r2 r5 r10
      0x01d4: PHI (r2v21 com.orion.notein.domain.models.note.Note$Builder) = (r2v18 com.orion.notein.domain.models.note.Note$Builder), (r2v23 com.orion.notein.domain.models.note.Note$Builder) binds: [B:53:0x01d1, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r5v18 o0OOo0o.o000OO) = (r5v15 o0OOo0o.o000OO), (r5v20 o0OOo0o.o000OO) binds: [B:53:0x01d1, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r10v12 com.orion.notein.domain.models.note.Note) = (r10v10 com.orion.notein.domain.models.note.Note), (r10v13 com.orion.notein.domain.models.note.Note) binds: [B:53:0x01d1, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0220 A[PHI: r2 r10
      0x0220: PHI (r2v32 o0OOo0o.o000OO) = (r2v29 o0OOo0o.o000OO), (r2v34 o0OOo0o.o000OO) binds: [B:65:0x021d, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r10v19 com.orion.notein.domain.models.note.Note) = (r10v16 com.orion.notein.domain.models.note.Note), (r10v21 com.orion.notein.domain.models.note.Note) binds: [B:65:0x021d, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(Note.Builder builder, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27379o00000oO c27379o00000oO;
        o000OO o000oo2;
        Note.Builder builder2;
        Note note;
        C27020OooOoO0 c27020OooOoO0;
        List<Page> pages;
        String id;
        C27020OooOoO0 c27020OooOoO02;
        List listOooO0oO;
        String id2;
        Iterator<T> it;
        Object objOooO0o0;
        C27449o00O0OoO c27449o00O0OoO;
        PdfInfo pdfInfo;
        C26620o00Oo00o c26620o00Oo00o;
        List<Outline> outlines;
        String id3;
        o000OO o000oo3;
        C27585o00ooO0 c27585o00ooO0;
        String parentId;
        if (abstractC32479OooO0OO instanceof C27379o00000oO) {
            c27379o00000oO = (C27379o00000oO) abstractC32479OooO0OO;
            int i = c27379o00000oO.f95391OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27379o00000oO.f95391OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27379o00000oO = new C27379o00000oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27379o00000oO.f95388OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27379o00000oO.f95391OooOoo0) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                Note noteBuild = builder.build();
                C34406OooO00o.f123390OooO00o.OooO00o("createNote, note: " + noteBuild, new Object[0]);
                c27379o00000oO.f95387OooOo0o = this;
                c27379o00000oO.f95386OooOo = builder;
                c27379o00000oO.f95389OooOoO0 = noteBuild;
                c27379o00000oO.f95391OooOoo0 = 1;
                if (OooO(noteBuild, this.f95593OooO, c27379o00000oO) != enumC32485OooO00o) {
                    o000oo2 = this;
                    builder2 = builder;
                    note = noteBuild;
                    if (note.getPdfInfo() == null) {
                        Page page = (Page) oOo000Oo.OooOo.Oooo(note.getPages());
                        if (page != null) {
                            c27379o00000oO.f95387OooOo0o = o000oo2;
                            c27379o00000oO.f95386OooOo = builder2;
                            c27379o00000oO.f95389OooOoO0 = note;
                            c27379o00000oO.f95391OooOoo0 = 2;
                            if (o000oo2.OooO0Oo(page, c27379o00000oO) != enumC32485OooO00o) {
                            }
                        }
                        note.setTnPath(((Page) oOo000Oo.OooOo.Oooo0oO(note.getPages())).getTnPath());
                        c27020OooOoO0 = o000oo2.f95594OooO00o;
                        pages = note.getPages();
                        id = note.getId();
                        c27379o00000oO.f95387OooOo0o = o000oo2;
                        c27379o00000oO.f95386OooOo = builder2;
                        c27379o00000oO.f95389OooOoO0 = note;
                        c27379o00000oO.f95391OooOoo0 = 4;
                        if (c27020OooOoO0.OooO00o(id, pages, c27379o00000oO) != enumC32485OooO00o) {
                            c27020OooOoO02 = o000oo2.f95594OooO00o;
                            Page defaultPage = note.getDefaultPage();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(defaultPage);
                            listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(defaultPage);
                            id2 = note.getId();
                            c27379o00000oO.f95387OooOo0o = o000oo2;
                            c27379o00000oO.f95386OooOo = builder2;
                            c27379o00000oO.f95389OooOoO0 = note;
                            c27379o00000oO.f95391OooOoo0 = 5;
                            if (c27020OooOoO02.OooO00o(id2, listOooO0oO, c27379o00000oO) != enumC32485OooO00o) {
                                List<PageLayer> defaultPageLayers = PageLayer.INSTANCE.getDefaultPageLayers(note.getId());
                                List<PageLayer> list = defaultPageLayers;
                                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((PageLayer) it.next()).getId());
                                }
                                note.setPageLayerIds(arrayList);
                                note.setActivatedPageLayerId("default");
                                C27881OooOO0O c27881OooOO0O = o000oo2.f95608OooOOOo;
                                String id4 = note.getId();
                                c27379o00000oO.f95387OooOo0o = o000oo2;
                                c27379o00000oO.f95386OooOo = builder2;
                                c27379o00000oO.f95389OooOoO0 = note;
                                c27379o00000oO.f95391OooOoo0 = 6;
                                objOooO0o0 = c27881OooOO0O.f98543OooO00o.OooO0o0(id4, defaultPageLayers, c27379o00000oO);
                                if (objOooO0o0 != EnumC32485OooO00o.f116726OooOo0o) {
                                    objOooO0o0 = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO0o0 != enumC32485OooO00o) {
                                    c27449o00O0OoO = o000oo2.f95603OooOO0O;
                                    c27379o00000oO.f95387OooOo0o = o000oo2;
                                    c27379o00000oO.f95386OooOo = builder2;
                                    c27379o00000oO.f95389OooOoO0 = note;
                                    c27379o00000oO.f95391OooOoo0 = 7;
                                    if (c27449o00O0OoO.OooOO0(note, c27379o00000oO) != enumC32485OooO00o) {
                                        pdfInfo = note.getPdfInfo();
                                        if (pdfInfo != null) {
                                            C26427Oooo0O0 c26427Oooo0O0 = o000oo2.f95596OooO0OO;
                                            String id5 = note.getId();
                                            c27379o00000oO.f95387OooOo0o = o000oo2;
                                            c27379o00000oO.f95386OooOo = builder2;
                                            c27379o00000oO.f95389OooOoO0 = note;
                                            c27379o00000oO.f95391OooOoo0 = 8;
                                            if (c26427Oooo0O0.OooO00o(pdfInfo, id5, c27379o00000oO) != enumC32485OooO00o) {
                                            }
                                        }
                                        c26620o00Oo00o = o000oo2.f95597OooO0Oo;
                                        outlines = builder2.getOutlines();
                                        id3 = note.getId();
                                        c27379o00000oO.f95387OooOo0o = o000oo2;
                                        c27379o00000oO.f95386OooOo = note;
                                        c27379o00000oO.f95389OooOoO0 = null;
                                        c27379o00000oO.f95391OooOoo0 = 9;
                                        if (c26620o00Oo00o.OooO00o(id3, outlines, c27379o00000oO) != enumC32485OooO00o) {
                                            o000oo3 = o000oo2;
                                            c27585o00ooO0 = o000oo3.f95602OooOO0;
                                            parentId = note.getParentId();
                                            c27379o00000oO.f95387OooOo0o = o000oo3;
                                            c27379o00000oO.f95386OooOo = note;
                                            c27379o00000oO.f95391OooOoo0 = 10;
                                            if (c27585o00ooO0.OooO(parentId, c27379o00000oO) != enumC32485OooO00o) {
                                                if (note.getId().length() > 0) {
                                                    C27449o00O0OoO c27449o00O0OoO2 = o000oo3.f95603OooOO0O;
                                                    c27379o00000oO.f95387OooOo0o = note;
                                                    c27379o00000oO.f95386OooOo = null;
                                                    c27379o00000oO.f95391OooOoo0 = 11;
                                                    break;
                                                }
                                                return note.getId();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c27379o00000oO.f95387OooOo0o = o000oo2;
                        c27379o00000oO.f95386OooOo = builder2;
                        c27379o00000oO.f95389OooOoO0 = note;
                        c27379o00000oO.f95391OooOoo0 = 3;
                        if (o000oo2.OooO00o(note, c27379o00000oO) != enumC32485OooO00o) {
                            note.setTnPath(((Page) oOo000Oo.OooOo.Oooo0oO(note.getPages())).getTnPath());
                            c27020OooOoO0 = o000oo2.f95594OooO00o;
                            pages = note.getPages();
                            id = note.getId();
                            c27379o00000oO.f95387OooOo0o = o000oo2;
                            c27379o00000oO.f95386OooOo = builder2;
                            c27379o00000oO.f95389OooOoO0 = note;
                            c27379o00000oO.f95391OooOoo0 = 4;
                            if (c27020OooOoO0.OooO00o(id, pages, c27379o00000oO) != enumC32485OooO00o) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (note.getPdfInfo() == null) {
                }
                break;
            case 2:
            case 3:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                note.setTnPath(((Page) oOo000Oo.OooOo.Oooo0oO(note.getPages())).getTnPath());
                c27020OooOoO0 = o000oo2.f95594OooO00o;
                pages = note.getPages();
                id = note.getId();
                c27379o00000oO.f95387OooOo0o = o000oo2;
                c27379o00000oO.f95386OooOo = builder2;
                c27379o00000oO.f95389OooOoO0 = note;
                c27379o00000oO.f95391OooOoo0 = 4;
                if (c27020OooOoO0.OooO00o(id, pages, c27379o00000oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27020OooOoO02 = o000oo2.f95594OooO00o;
                Page defaultPage2 = note.getDefaultPage();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(defaultPage2);
                listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(defaultPage2);
                id2 = note.getId();
                c27379o00000oO.f95387OooOo0o = o000oo2;
                c27379o00000oO.f95386OooOo = builder2;
                c27379o00000oO.f95389OooOoO0 = note;
                c27379o00000oO.f95391OooOoo0 = 5;
                if (c27020OooOoO02.OooO00o(id2, listOooO0oO, c27379o00000oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<PageLayer> defaultPageLayers2 = PageLayer.INSTANCE.getDefaultPageLayers(note.getId());
                List<PageLayer> list2 = defaultPageLayers2;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                }
                note.setPageLayerIds(arrayList2);
                note.setActivatedPageLayerId("default");
                C27881OooOO0O c27881OooOO0O2 = o000oo2.f95608OooOOOo;
                String id42 = note.getId();
                c27379o00000oO.f95387OooOo0o = o000oo2;
                c27379o00000oO.f95386OooOo = builder2;
                c27379o00000oO.f95389OooOoO0 = note;
                c27379o00000oO.f95391OooOoo0 = 6;
                objOooO0o0 = c27881OooOO0O2.f98543OooO00o.OooO0o0(id42, defaultPageLayers2, c27379o00000oO);
                if (objOooO0o0 != EnumC32485OooO00o.f116726OooOo0o) {
                }
                if (objOooO0o0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27449o00O0OoO = o000oo2.f95603OooOO0O;
                c27379o00000oO.f95387OooOo0o = o000oo2;
                c27379o00000oO.f95386OooOo = builder2;
                c27379o00000oO.f95389OooOoO0 = note;
                c27379o00000oO.f95391OooOoo0 = 7;
                if (c27449o00O0OoO.OooOO0(note, c27379o00000oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                pdfInfo = note.getPdfInfo();
                if (pdfInfo != null) {
                }
                c26620o00Oo00o = o000oo2.f95597OooO0Oo;
                outlines = builder2.getOutlines();
                id3 = note.getId();
                c27379o00000oO.f95387OooOo0o = o000oo2;
                c27379o00000oO.f95386OooOo = note;
                c27379o00000oO.f95389OooOoO0 = null;
                c27379o00000oO.f95391OooOoo0 = 9;
                if (c26620o00Oo00o.OooO00o(id3, outlines, c27379o00000oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                note = c27379o00000oO.f95389OooOoO0;
                builder2 = (Note.Builder) c27379o00000oO.f95386OooOo;
                o000oo2 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c26620o00Oo00o = o000oo2.f95597OooO0Oo;
                outlines = builder2.getOutlines();
                id3 = note.getId();
                c27379o00000oO.f95387OooOo0o = o000oo2;
                c27379o00000oO.f95386OooOo = note;
                c27379o00000oO.f95389OooOoO0 = null;
                c27379o00000oO.f95391OooOoo0 = 9;
                if (c26620o00Oo00o.OooO00o(id3, outlines, c27379o00000oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 9:
                note = (Note) c27379o00000oO.f95386OooOo;
                o000oo3 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27585o00ooO0 = o000oo3.f95602OooOO0;
                parentId = note.getParentId();
                c27379o00000oO.f95387OooOo0o = o000oo3;
                c27379o00000oO.f95386OooOo = note;
                c27379o00000oO.f95391OooOoo0 = 10;
                if (c27585o00ooO0.OooO(parentId, c27379o00000oO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 10:
                note = (Note) c27379o00000oO.f95386OooOo;
                o000oo3 = (o000OO) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (note.getId().length() > 0) {
                }
                return note.getId();
            case 11:
                note = (Note) c27379o00000oO.f95387OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return note.getId();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(Page page, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27380o00000oo c27380o00000oo;
        if (abstractC32479OooO0OO instanceof C27380o00000oo) {
            c27380o00000oo = (C27380o00000oo) abstractC32479OooO0OO;
            int i = c27380o00000oo.f95394OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27380o00000oo.f95394OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27380o00000oo = new C27380o00000oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27380o00000oo.f95392OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27380o00000oo.f95394OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(page);
            c27380o00000oo.f95393OooOo0o = page;
            c27380o00000oo.f95394OooOoO = 1;
            objOooO0O0 = this.f95602OooOO0.OooO0O0(listOooO0oO, true, c27380o00000oo);
            if (objOooO0O0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            page = c27380o00000oo.f95393OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Page page2 = (Page) oOo000Oo.OooOo.Oooo((List) objOooO0O0);
        if (page2 != null) {
            page.setTnPath(page2.getTnPath());
        } else {
            C34406OooO00o.f123390OooO00o.OooO0OO("createDefaultCoverNote: Unable to create page thumbnail", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:77|(1:79)(1:80)|81|(1:83)(8:350|85|89|(1:91)|92|(0)(6:94|(5:96|(0)|333|99|(11:337|101|331|102|103|348|104|105|(10:108|355|109|(2:111|(12:114|321|115|(2:157|158)(22:119|120|314|121|319|122|123|124|125|126|127|325|128|339|129|130|131|132|329|133|134|(1:361)(6:137|138|139|256|257|(10:343|268|(7:270|271|346|272|273|357|274)(4:284|341|285|286)|279|291|(1:295)|296|(2:307|(1:360))(2:303|(1:363))|306|(1:311))(0)))|147|148|141|142|291|(2:293|295)|296|(5:298|307|(0)|306|(0))(0)))(4:162|318|163|(1:362)(6:166|353|167|(2:169|(3:172|173|(2:190|191)(6:177|178|335|179|180|(6:183|184|139|256|257|(0)(0)))))(2:195|(3:198|199|(2:201|(1:203)(3:204|205|(2:212|213)(6:209|210|211|256|257|(0)(0))))(2:214|(1:216)(2:217|(2:219|(1:221)(3:222|223|(2:229|230)(6:227|228|211|256|257|(0)(0))))(2:231|(1:233)(2:234|(2:236|(1:238)(2:239|(2:248|249)(2:243|(1:245)(6:246|247|211|256|257|(0)(0)))))(2:250|(1:252)(6:253|254|211|256|257|(0)(0)))))))))|352|309))|159|142|291|(0)|296|(0)(0))|107|359)(3:266|257|(0)(0)))|98|333|99|(0)(0))|312|313)|84|333|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0780, code lost:
    
        if (r0 == r7) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x07a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x07a7, code lost:
    
        r6 = r10;
        r7 = r11;
        r5 = r22;
        r4 = 0;
        r10 = 5;
        r11 = r28;
        r13 = 0;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d8 A[Catch: Exception -> 0x0486, TRY_LEAVE, TryCatch #22 {Exception -> 0x0486, blocks: (B:109:0x03d0, B:111:0x03d8), top: B:355:0x03d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c0 A[Catch: Exception -> 0x0539, TRY_LEAVE, TryCatch #21 {Exception -> 0x0539, blocks: (B:167:0x04b8, B:169:0x04c0, B:195:0x053b), top: B:353:0x04b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x053b A[Catch: Exception -> 0x0539, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x0539, blocks: (B:167:0x04b8, B:169:0x04c0, B:195:0x053b), top: B:353:0x04b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0567 A[Catch: Exception -> 0x0452, TryCatch #19 {Exception -> 0x0452, blocks: (B:254:0x070c, B:247:0x06d3, B:239:0x069c, B:241:0x06a0, B:243:0x06a6, B:248:0x06d7, B:249:0x06dc, B:234:0x0672, B:236:0x067a, B:250:0x06dd, B:228:0x063e, B:223:0x060a, B:225:0x060e, B:227:0x0614, B:229:0x0642, B:230:0x0649, B:217:0x05df, B:219:0x05e7, B:231:0x064a, B:210:0x05b0, B:205:0x058a, B:207:0x058e, B:209:0x0594, B:212:0x05b5, B:213:0x05ba, B:199:0x055f, B:201:0x0567, B:214:0x05bb, B:184:0x0522, B:138:0x044c, B:157:0x0478, B:158:0x0481), top: B:345:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05bb A[Catch: Exception -> 0x0452, TryCatch #19 {Exception -> 0x0452, blocks: (B:254:0x070c, B:247:0x06d3, B:239:0x069c, B:241:0x06a0, B:243:0x06a6, B:248:0x06d7, B:249:0x06dc, B:234:0x0672, B:236:0x067a, B:250:0x06dd, B:228:0x063e, B:223:0x060a, B:225:0x060e, B:227:0x0614, B:229:0x0642, B:230:0x0649, B:217:0x05df, B:219:0x05e7, B:231:0x064a, B:210:0x05b0, B:205:0x058a, B:207:0x058e, B:209:0x0594, B:212:0x05b5, B:213:0x05ba, B:199:0x055f, B:201:0x0567, B:214:0x05bb, B:184:0x0522, B:138:0x044c, B:157:0x0478, B:158:0x0481), top: B:345:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05e7 A[Catch: Exception -> 0x0452, TryCatch #19 {Exception -> 0x0452, blocks: (B:254:0x070c, B:247:0x06d3, B:239:0x069c, B:241:0x06a0, B:243:0x06a6, B:248:0x06d7, B:249:0x06dc, B:234:0x0672, B:236:0x067a, B:250:0x06dd, B:228:0x063e, B:223:0x060a, B:225:0x060e, B:227:0x0614, B:229:0x0642, B:230:0x0649, B:217:0x05df, B:219:0x05e7, B:231:0x064a, B:210:0x05b0, B:205:0x058a, B:207:0x058e, B:209:0x0594, B:212:0x05b5, B:213:0x05ba, B:199:0x055f, B:201:0x0567, B:214:0x05bb, B:184:0x0522, B:138:0x044c, B:157:0x0478, B:158:0x0481), top: B:345:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x064a A[Catch: Exception -> 0x0452, TryCatch #19 {Exception -> 0x0452, blocks: (B:254:0x070c, B:247:0x06d3, B:239:0x069c, B:241:0x06a0, B:243:0x06a6, B:248:0x06d7, B:249:0x06dc, B:234:0x0672, B:236:0x067a, B:250:0x06dd, B:228:0x063e, B:223:0x060a, B:225:0x060e, B:227:0x0614, B:229:0x0642, B:230:0x0649, B:217:0x05df, B:219:0x05e7, B:231:0x064a, B:210:0x05b0, B:205:0x058a, B:207:0x058e, B:209:0x0594, B:212:0x05b5, B:213:0x05ba, B:199:0x055f, B:201:0x0567, B:214:0x05bb, B:184:0x0522, B:138:0x044c, B:157:0x0478, B:158:0x0481), top: B:345:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x067a A[Catch: Exception -> 0x0452, TryCatch #19 {Exception -> 0x0452, blocks: (B:254:0x070c, B:247:0x06d3, B:239:0x069c, B:241:0x06a0, B:243:0x06a6, B:248:0x06d7, B:249:0x06dc, B:234:0x0672, B:236:0x067a, B:250:0x06dd, B:228:0x063e, B:223:0x060a, B:225:0x060e, B:227:0x0614, B:229:0x0642, B:230:0x0649, B:217:0x05df, B:219:0x05e7, B:231:0x064a, B:210:0x05b0, B:205:0x058a, B:207:0x058e, B:209:0x0594, B:212:0x05b5, B:213:0x05ba, B:199:0x055f, B:201:0x0567, B:214:0x05bb, B:184:0x0522, B:138:0x044c, B:157:0x0478, B:158:0x0481), top: B:345:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06dd A[Catch: Exception -> 0x0452, TryCatch #19 {Exception -> 0x0452, blocks: (B:254:0x070c, B:247:0x06d3, B:239:0x069c, B:241:0x06a0, B:243:0x06a6, B:248:0x06d7, B:249:0x06dc, B:234:0x0672, B:236:0x067a, B:250:0x06dd, B:228:0x063e, B:223:0x060a, B:225:0x060e, B:227:0x0614, B:229:0x0642, B:230:0x0649, B:217:0x05df, B:219:0x05e7, B:231:0x064a, B:210:0x05b0, B:205:0x058a, B:207:0x058e, B:209:0x0594, B:212:0x05b5, B:213:0x05ba, B:199:0x055f, B:201:0x0567, B:214:0x05bb, B:184:0x0522, B:138:0x044c, B:157:0x0478, B:158:0x0481), top: B:345:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x037a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0736 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10, types: [o0OOo0Oo.OooOooO] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v12, types: [o0OOo0Oo.OooOooO] */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.coroutines.Continuation, o0OOo0o.o0000, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, oO00ooo0.OooO00o] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [kotlin.coroutines.Continuation, o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20, types: [o0OOo0Oo.OooOO0o] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [kotlin.coroutines.Continuation, o0OOo0o.o0000, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40, types: [kotlin.coroutines.Continuation, o0OOo0o.o0000, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46, types: [kotlin.coroutines.Continuation, o0OOo0o.o0000, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52, types: [kotlin.coroutines.Continuation, o0OOo0o.o0000, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64, types: [o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v8, types: [o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r16v1, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r17v10, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r18v37, types: [o0OOo0o.o0000] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.orion.notein.domain.models.note.NotePlaceHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v100 */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v106 */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v36, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.net.Uri, com.orion.notein.domain.models.note.NotePlaceHolder, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r4v99 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v100 */
    /* JADX WARN: Type inference failed for: r6v101 */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29, types: [o0OOo0Oo.OooOO0o] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Object, o0OOo0o.o000OO] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v8, types: [o0OOo0o.o0000, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r6v92 */
    /* JADX WARN: Type inference failed for: r6v93 */
    /* JADX WARN: Type inference failed for: r6v94 */
    /* JADX WARN: Type inference failed for: r6v95 */
    /* JADX WARN: Type inference failed for: r6v96 */
    /* JADX WARN: Type inference failed for: r6v97 */
    /* JADX WARN: Type inference failed for: r6v98 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v102 */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v104 */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v112 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v121 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v123 */
    /* JADX WARN: Type inference failed for: r7v124 */
    /* JADX WARN: Type inference failed for: r7v125 */
    /* JADX WARN: Type inference failed for: r7v126 */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v128 */
    /* JADX WARN: Type inference failed for: r7v129 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v130 */
    /* JADX WARN: Type inference failed for: r7v131 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r7v98 */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v54, types: [o0OOo0Oo.OooOO0o] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(NotePlaceHolder notePlaceHolder, PaperTheme paperTheme, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        ?? o0000Var;
        Object obj;
        ?? r6;
        ?? r7;
        ?? r11;
        ?? r2;
        ?? r62;
        ?? r72;
        ?? r4;
        ?? r10;
        ?? r13;
        ?? r112;
        Object obj2;
        ?? r113;
        ?? r63;
        ?? r132;
        String str;
        ?? r102;
        ?? r73;
        ?? r42;
        NotePlaceHolder notePlaceHolder2;
        C34406OooO00o.C20358OooO00o c20358OooO00o;
        ?? r0;
        String id;
        ?? r22;
        String str2;
        String string;
        Object objOooO00o;
        String str3;
        String str4;
        boolean z;
        String filePath;
        ?? r74;
        Object obj3;
        Uri uriFromFile;
        C27499o00Ooo0 c27499o00Ooo0;
        Object objOooO0o;
        boolean z2;
        Object obj4;
        PaperTheme paperTheme2;
        Uri uri;
        ?? r5;
        ?? r75;
        ?? r43;
        ?? r114;
        int i;
        ?? r64;
        PaperTheme paperTheme3;
        File file;
        NotePlaceHolder notePlaceHolder3;
        ?? r76;
        ?? r44;
        ?? r115;
        int i2;
        ?? r12;
        PaperTheme paperTheme4;
        String str5;
        PaperTheme paperTheme5;
        Uri uri2;
        o0000O00 o0000o00;
        Object obj5;
        ?? r77;
        Object obj6;
        Object obj7;
        String str6;
        ?? r116;
        String id2;
        Object obj8;
        Object objOooO0Oo;
        ?? r117;
        PaperTheme paperTheme6;
        int i3;
        ?? r78;
        ?? r65;
        Object obj9;
        NotePlaceHolder notePlaceHolder4;
        Object obj10;
        File file2;
        ?? r118;
        int i4;
        ?? r79;
        ?? r45;
        NotePlaceHolder notePlaceHolder5;
        Object obj11;
        ?? r66;
        Uri uri3;
        ?? r119;
        Object obj12;
        String str7;
        ?? r67;
        ?? r1110;
        int i5;
        ?? r710;
        ?? r68;
        ?? r46;
        NotePlaceHolder notePlaceHolder6;
        File file3;
        ?? r1111;
        int i6;
        ?? r711;
        ?? r47;
        NotePlaceHolder notePlaceHolder7;
        Object obj13;
        ?? r1112;
        int i7;
        ?? r712;
        ?? r48;
        NotePlaceHolder notePlaceHolder8;
        Object obj14;
        ?? r1113;
        int i8;
        ?? r713;
        ?? r69;
        ?? r49;
        NotePlaceHolder notePlaceHolder9;
        Object obj15;
        String str8;
        ?? r02;
        ?? r1114;
        int i9;
        ?? r714;
        ?? r610;
        ?? r410;
        NotePlaceHolder notePlaceHolder10;
        File file4;
        ?? r1115;
        int i10;
        ?? r715;
        ?? r611;
        ?? r411;
        NotePlaceHolder notePlaceHolder11;
        Object obj16;
        String str9;
        ?? r1116;
        int i11;
        ?? r716;
        ?? r612;
        ?? r412;
        NotePlaceHolder notePlaceHolder12;
        Object obj17;
        String str10;
        ?? r03;
        ?? r1117;
        int i12;
        ?? r717;
        ?? r613;
        ?? r413;
        NotePlaceHolder notePlaceHolder13;
        String str11;
        ?? r1118;
        int i13;
        ?? r718;
        ?? r614;
        ?? r414;
        NotePlaceHolder notePlaceHolder14;
        Object obj18;
        String str12;
        ?? r1119;
        int i14;
        ?? r719;
        ?? r615;
        ?? r415;
        NotePlaceHolder notePlaceHolder15;
        Object obj19;
        String str13;
        ?? r1120;
        int i15;
        ?? r720;
        ?? r616;
        ?? r416;
        NotePlaceHolder notePlaceHolder16;
        Object obj20;
        NotePlaceHolder notePlaceHolder17;
        ?? r1121;
        ?? r617;
        String id3;
        String parentId;
        String title;
        String absolutePath;
        ?? r18;
        ?? r1122;
        int i16;
        ?? r721;
        ?? r618;
        ?? r417;
        NotePlaceHolder notePlaceHolder18;
        ?? r1123;
        int i17;
        ?? r722;
        ?? r619;
        ?? r418;
        NotePlaceHolder notePlaceHolder19;
        ?? r1124;
        int i18;
        ?? r723;
        ?? r620;
        ?? r419;
        NotePlaceHolder notePlaceHolder20;
        Object obj21;
        NotePlaceHolder notePlaceHolder21 = notePlaceHolder;
        ?? r621 = "createPdfNoteByPlaceholderInternal isDocFile, pdfFilePathInPrivateDir: ";
        ?? r724 = "createPdfNoteByPlaceholderInternal isPptFile, pdfFilePathInPrivateDir: ";
        if (abstractC32479OooO0OO instanceof o0000) {
            o0000 o0000Var2 = (o0000) abstractC32479OooO0OO;
            int i19 = o0000Var2.f95355Oooo000;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                o0000Var2.f95355Oooo000 = i19 - Integer.MIN_VALUE;
                o0000Var = o0000Var2;
            } else {
                o0000Var = new o0000(this, abstractC32479OooO0OO);
            }
        }
        Object obj22 = o0000Var.f95353OooOooO;
        C21904OooOoo0.OooO0Oo();
        ?? r1125 = EnumC32485OooO00o.f116726OooOo0o;
        ?? r122 = o0000Var.f95355Oooo000;
        String str14 = "NoteCreationUseCase";
        try {
            try {
                try {
                    try {
                    } catch (Exception e) {
                        e = e;
                        r2 = "createPdfNoteByPlaceholderInternal isPptFile, pdfFilePathInPrivateDir: ";
                        r62 = o0000Var;
                        r72 = r1125;
                        r4 = 0;
                        r10 = 5;
                        r13 = 0;
                        r112 = "createPdfNoteByPlaceholderInternal, fileNameFromPlaceholderUri: ";
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                r11 = "createPdfNoteByPlaceholderInternal isPptFile, pdfFilePathInPrivateDir: ";
                r7 = r1125;
                obj = "createPdfNoteByPlaceholderInternal isDocFile, pdfFilePathInPrivateDir: ";
                r6 = o0000Var;
            }
        } catch (Exception e4) {
            e = e4;
            obj = "createPdfNoteByPlaceholderInternal, fileNameFromPlaceholderUri: ";
            r6 = o0000Var;
            r7 = r1125;
            r11 = r122;
        }
        switch (r122) {
            case 0:
                C32446OooOOOo.OooO0O0(obj22);
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteCreationUseCase");
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                c20358OooO00o2.OooO0o0("createPdfNoteByPlaceholderInternal start, placeholder is " + notePlaceHolder21 + ", templateTheme=" + paperTheme, new Object[0]);
                string = notePlaceHolder21.getExtras().getString("password");
                String filePath2 = notePlaceHolder21.getFilePath();
                long length = filePath2 != null ? new File(filePath2).length() : 0L;
                C27367Ooooo00 c27367Ooooo00 = this.f95605OooOOO;
                c27367Ooooo00.getClass();
                if (length <= AiFeatureConfig.DEFAULT_MAX_PDF_FILE_SIZE) {
                    try {
                        o00000O o00000o = c27367Ooooo00.f95286OooO00o;
                        o00000o.getClass();
                        objOooO00o = Double.valueOf(o00000o.f95374OooO00o.OooO00o());
                        break;
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    Double dValueOf = Double.valueOf(0.0d);
                    boolean z3 = objOooO00o instanceof C32445OooOOOO.OooO00o;
                    Object obj23 = objOooO00o;
                    if (z3) {
                        obj23 = dValueOf;
                    }
                    str3 = "Couldn't get pdf file path in private dir.";
                    double dOooO0Oo = oO0O00oo.OooOO0.OooO0Oo(((Number) obj23).doubleValue(), 0.0d, 1.0d);
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                    c20358OooO00o3.OooOOO0("DecideUseWPSUseCase");
                    str = "NoteCreationUseCase";
                    c20358OooO00o3.OooO0o0("DecideUseWPSUseCase rconfig_use_wps_pptx_rate: " + dOooO0Oo, new Object[0]);
                    if (dOooO0Oo > 0.0d) {
                        if (dOooO0Oo < 1.0d) {
                            oO0O00o.OooO0OO.f116801OooOo0o.getClass();
                            if (oO0O00o.OooO0OO.f116800OooOo.OooO0O0().nextDouble() < dOooO0Oo) {
                            }
                            filePath = notePlaceHolder21.getFilePath();
                            if (filePath != null) {
                                try {
                                    uriFromFile = Uri.fromFile(new File(filePath));
                                    c20358OooO00o2.OooO00o("createPdfNoteByPlaceholderInternal, fileNameFromPlaceholderUri: " + C28692OooO0oo.OooO0OO(this.f95610OooOOo0, uriFromFile) + ", placeholderFileUri: " + uriFromFile, new Object[0]);
                                    c27499o00Ooo0 = this.f95604OooOO0o;
                                    o0000Var.f95347OooOo0o = this;
                                    o0000Var.f95346OooOo = notePlaceHolder21;
                                    o0000Var.f95349OooOoO0 = paperTheme;
                                    o0000Var.f95348OooOoO = string;
                                    o0000Var.f95350OooOoOO = uriFromFile;
                                    o0000Var.f95351OooOoo = z;
                                    o0000Var.f95355Oooo000 = 1;
                                    try {
                                        c27499o00Ooo0.getClass();
                                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                    } catch (Exception e5) {
                                        e = e5;
                                        r74 = r1125;
                                        obj3 = null;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    r74 = r1125;
                                    obj3 = null;
                                }
                                try {
                                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27497o00OoOoo(uriFromFile, null, c27499o00Ooo0), o0000Var);
                                    break;
                                } catch (Exception e7) {
                                    e = e7;
                                    r74 = r1125;
                                    obj3 = null;
                                    ?? r1126 = o0000Var;
                                    r10 = 5;
                                    r13 = obj3;
                                    r62 = r1126;
                                    str14 = str;
                                    r112 = this;
                                    r2 = notePlaceHolder21;
                                    r4 = obj3;
                                    r72 = r74;
                                }
                                if (objOooO0o != r1125) {
                                    z2 = z;
                                    obj4 = objOooO0o;
                                    paperTheme2 = paperTheme;
                                    uri = uriFromFile;
                                    r5 = this;
                                    notePlaceHolder3 = notePlaceHolder21;
                                    try {
                                    } catch (Exception e8) {
                                        e = e8;
                                        r76 = r1125;
                                        r44 = 0;
                                        r115 = o0000Var;
                                        i2 = 5;
                                    }
                                    if (((Boolean) obj4).booleanValue()) {
                                        r76 = r1125;
                                        r44 = 0;
                                        r45 = 0;
                                        r115 = o0000Var;
                                        i2 = 5;
                                        i4 = 5;
                                        try {
                                            C27499o00Ooo0 c27499o00Ooo02 = r5.f95604OooOO0o;
                                            r115.f95347OooOo0o = r5;
                                            r115.f95346OooOo = notePlaceHolder3;
                                            r115.f95349OooOoO0 = paperTheme2;
                                            r115.f95348OooOoO = string;
                                            r115.f95350OooOoOO = uri;
                                            r115.f95355Oooo000 = 4;
                                            c27499o00Ooo02.getClass();
                                            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                            Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27493o00OoOOo(uri, null, c27499o00Ooo02), r115);
                                            if (objOooO0o2 == r76) {
                                                return r76;
                                            }
                                            PaperTheme paperTheme7 = paperTheme2;
                                            r12 = r5;
                                            paperTheme4 = paperTheme7;
                                            obj11 = objOooO0o2;
                                            notePlaceHolder5 = notePlaceHolder3;
                                            r79 = r76;
                                            r118 = r115;
                                            try {
                                                if (((Boolean) obj11).booleanValue()) {
                                                    C27499o00Ooo0 c27499o00Ooo03 = r12.f95604OooOO0o;
                                                    r118.f95347OooOo0o = r12;
                                                    r118.f95346OooOo = notePlaceHolder5;
                                                    r118.f95349OooOoO0 = paperTheme4;
                                                    r118.f95348OooOoO = string;
                                                    r118.f95350OooOoOO = uri;
                                                    r118.f95355Oooo000 = 7;
                                                    c27499o00Ooo03.getClass();
                                                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                                                    Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27495o00OoOo0(uri, r45, c27499o00Ooo03), r118);
                                                    notePlaceHolder5 = notePlaceHolder5;
                                                    r45 = r45;
                                                    r79 = r79;
                                                    i4 = i4;
                                                    r118 = r118;
                                                    r12 = r12;
                                                    if (objOooO0o3 != r79) {
                                                        r66 = r12;
                                                        obj14 = objOooO0o3;
                                                        notePlaceHolder8 = notePlaceHolder5;
                                                        r48 = r45;
                                                        r712 = r79;
                                                        i7 = i4;
                                                        r1112 = r118;
                                                        if (((Boolean) obj14).booleanValue()) {
                                                            C27499o00Ooo0 c27499o00Ooo04 = r66.f95604OooOO0o;
                                                            r1112.f95347OooOo0o = r66;
                                                            r1112.f95346OooOo = notePlaceHolder8;
                                                            r1112.f95349OooOoO0 = paperTheme4;
                                                            r1112.f95348OooOoO = string;
                                                            r1112.f95350OooOoOO = uri;
                                                            r1112.f95355Oooo000 = 10;
                                                            c27499o00Ooo04.getClass();
                                                            C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                                            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                                                            C27492o00OoOOO c27492o00OoOOO = new C27492o00OoOOO(uri, r48, c27499o00Ooo04);
                                                            Object objOooO0o4 = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27492o00OoOOO, r1112);
                                                            obj16 = objOooO0o4;
                                                            notePlaceHolder11 = notePlaceHolder8;
                                                            r411 = r48;
                                                            r611 = r66;
                                                            r715 = r712;
                                                            i10 = i7;
                                                            r1115 = r1112;
                                                            if (objOooO0o4 == r712) {
                                                                notePlaceHolder5 = notePlaceHolder8;
                                                                r45 = r48;
                                                                r79 = r712;
                                                                i4 = i7;
                                                                r118 = r1112;
                                                                r12 = c27492o00OoOOO;
                                                            } else if (((Boolean) obj16).booleanValue()) {
                                                                str9 = str3;
                                                                String str15 = str4;
                                                                C27499o00Ooo0 c27499o00Ooo05 = r611.f95604OooOO0o;
                                                                r1115.f95347OooOo0o = r611;
                                                                r1115.f95346OooOo = notePlaceHolder11;
                                                                r1115.f95349OooOoO0 = paperTheme4;
                                                                r1115.f95348OooOoO = string;
                                                                r1115.f95350OooOoOO = uri;
                                                                r1115.f95355Oooo000 = 13;
                                                                c27499o00Ooo05.getClass();
                                                                C33874OooO0OO c33874OooO0OO5 = C33649OoooOOo.f121328OooO00o;
                                                                Object objOooO0o5 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27500o00Ooo00(uri, r411, c27499o00Ooo05), r1115);
                                                                obj18 = objOooO0o5;
                                                                notePlaceHolder14 = notePlaceHolder11;
                                                                r414 = r411;
                                                                r614 = r611;
                                                                r718 = r715;
                                                                i13 = i10;
                                                                r1118 = r1115;
                                                                str11 = str15;
                                                                if (objOooO0o5 == r715) {
                                                                    notePlaceHolder5 = notePlaceHolder11;
                                                                    r45 = r411;
                                                                    r79 = r715;
                                                                    i4 = i10;
                                                                    r118 = r1115;
                                                                    r12 = str15;
                                                                } else if (((Boolean) obj18).booleanValue()) {
                                                                    C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal, isPdfFile", new Object[0]);
                                                                    C27499o00Ooo0 c27499o00Ooo06 = r614.f95604OooOO0o;
                                                                    r1118.f95347OooOo0o = r614;
                                                                    r1118.f95346OooOo = notePlaceHolder14;
                                                                    r1118.f95349OooOoO0 = paperTheme4;
                                                                    r1118.f95348OooOoO = string;
                                                                    r1118.f95350OooOoOO = r414;
                                                                    r1118.f95355Oooo000 = 16;
                                                                    c27499o00Ooo06.getClass();
                                                                    C33874OooO0OO c33874OooO0OO6 = C33649OoooOOo.f121328OooO00o;
                                                                    ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
                                                                    C27489o00OoO0o c27489o00OoO0o = new C27489o00OoO0o(uri, r414, c27499o00Ooo06);
                                                                    Object objOooO0o6 = C33609OooO0oo.OooO0o(executorC33873OooO0O02, c27489o00OoO0o, r1118);
                                                                    if (objOooO0o6 == r718) {
                                                                        notePlaceHolder5 = notePlaceHolder14;
                                                                        r45 = r414;
                                                                        r79 = r718;
                                                                        i4 = i13;
                                                                        r118 = r1118;
                                                                        r12 = c27489o00OoO0o;
                                                                    } else {
                                                                        paperTheme6 = paperTheme4;
                                                                        obj21 = objOooO0o6;
                                                                        notePlaceHolder20 = notePlaceHolder14;
                                                                        r419 = r414;
                                                                        r620 = r614;
                                                                        r723 = r718;
                                                                        i18 = i13;
                                                                        r1124 = r1118;
                                                                        file4 = (File) obj21;
                                                                        notePlaceHolder19 = notePlaceHolder20;
                                                                        r418 = r419;
                                                                        r619 = r620;
                                                                        r722 = r723;
                                                                        i17 = i18;
                                                                        r1123 = r1124;
                                                                        file3 = file4;
                                                                        notePlaceHolder18 = notePlaceHolder19;
                                                                        r417 = r418;
                                                                        r618 = r619;
                                                                        r721 = r722;
                                                                        i16 = i17;
                                                                        r1122 = r1123;
                                                                        paperTheme3 = paperTheme6;
                                                                        file = file3;
                                                                        notePlaceHolder17 = notePlaceHolder18;
                                                                        r43 = r417;
                                                                        r64 = r618;
                                                                        r75 = r721;
                                                                        i = i16;
                                                                        r114 = r1122;
                                                                        String str16 = string;
                                                                        if (file != null) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal, isXlsFile", new Object[0]);
                                                                    C27499o00Ooo0 c27499o00Ooo07 = r614.f95604OooOO0o;
                                                                    r1118.f95347OooOo0o = r614;
                                                                    r1118.f95346OooOo = notePlaceHolder14;
                                                                    r1118.f95349OooOoO0 = paperTheme4;
                                                                    r1118.f95348OooOoO = string;
                                                                    r1118.f95350OooOoOO = uri;
                                                                    r1118.f95355Oooo000 = 14;
                                                                    Object objOooO0OO = C27499o00Ooo0.OooO0OO(c27499o00Ooo07, uri, r1118);
                                                                    obj19 = objOooO0OO;
                                                                    notePlaceHolder15 = notePlaceHolder14;
                                                                    r415 = r414;
                                                                    r615 = r614;
                                                                    r719 = r718;
                                                                    i14 = i13;
                                                                    r1119 = r1118;
                                                                    str12 = str11;
                                                                    if (objOooO0OO == r718) {
                                                                        notePlaceHolder5 = notePlaceHolder14;
                                                                        r45 = r414;
                                                                        r79 = r718;
                                                                        i4 = i13;
                                                                        r118 = r1118;
                                                                        r12 = str11;
                                                                    } else {
                                                                        str13 = (String) obj19;
                                                                        if (str13 != null || str13.length() == 0) {
                                                                            throw new IllegalStateException(str9);
                                                                        }
                                                                        C34406OooO00o.f123390OooO00o.OooO00o(str12.concat(str13), new Object[0]);
                                                                        ?? r9 = r615.f95599OooO0o0;
                                                                        r615.f95598OooO0o.OooO0Oo();
                                                                        notePlaceHolder15.getId();
                                                                        r1119.f95347OooOo0o = r615;
                                                                        r1119.f95346OooOo = notePlaceHolder15;
                                                                        r1119.f95349OooOoO0 = paperTheme4;
                                                                        r1119.f95348OooOoO = string;
                                                                        r1119.f95350OooOoOO = r415;
                                                                        r12 = 15;
                                                                        r1119.f95355Oooo000 = 15;
                                                                        Object objOooO0OO2 = r9.OooO0OO(uri, str13, string, r1119);
                                                                        if (objOooO0OO2 == r719) {
                                                                            notePlaceHolder5 = notePlaceHolder15;
                                                                            r45 = r415;
                                                                            r79 = r719;
                                                                            i4 = i14;
                                                                            r118 = r1119;
                                                                        } else {
                                                                            paperTheme6 = paperTheme4;
                                                                            obj20 = objOooO0OO2;
                                                                            notePlaceHolder16 = notePlaceHolder15;
                                                                            r416 = r415;
                                                                            r616 = r615;
                                                                            r720 = r719;
                                                                            i15 = i14;
                                                                            r1120 = r1119;
                                                                            file4 = (File) obj20;
                                                                            notePlaceHolder19 = notePlaceHolder16;
                                                                            r418 = r416;
                                                                            r619 = r616;
                                                                            r722 = r720;
                                                                            i17 = i15;
                                                                            r1123 = r1120;
                                                                            file3 = file4;
                                                                            notePlaceHolder18 = notePlaceHolder19;
                                                                            r417 = r418;
                                                                            r618 = r619;
                                                                            r721 = r722;
                                                                            i16 = i17;
                                                                            r1122 = r1123;
                                                                            paperTheme3 = paperTheme6;
                                                                            file = file3;
                                                                            notePlaceHolder17 = notePlaceHolder18;
                                                                            r43 = r417;
                                                                            r64 = r618;
                                                                            r75 = r721;
                                                                            i = i16;
                                                                            r114 = r1122;
                                                                            String str162 = string;
                                                                            if (file != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                r12 = 0;
                                                                C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal, isCajFile", new Object[0]);
                                                                C27499o00Ooo0 c27499o00Ooo08 = r611.f95604OooOO0o;
                                                                r1115.f95347OooOo0o = r611;
                                                                r1115.f95346OooOo = notePlaceHolder11;
                                                                r1115.f95349OooOoO0 = paperTheme4;
                                                                r1115.f95348OooOoO = string;
                                                                r1115.f95350OooOoOO = uri;
                                                                r1115.f95355Oooo000 = 11;
                                                                Object objOooO0OO3 = C27499o00Ooo0.OooO0OO(c27499o00Ooo08, uri, r1115);
                                                                if (objOooO0OO3 == r715) {
                                                                    notePlaceHolder5 = notePlaceHolder11;
                                                                    r45 = r411;
                                                                    r79 = r715;
                                                                    i4 = i10;
                                                                    r118 = r1115;
                                                                } else {
                                                                    paperTheme6 = paperTheme4;
                                                                    obj17 = objOooO0OO3;
                                                                    notePlaceHolder12 = notePlaceHolder11;
                                                                    r412 = r411;
                                                                    r612 = r611;
                                                                    r716 = r715;
                                                                    i11 = i10;
                                                                    r1116 = r1115;
                                                                    str10 = (String) obj17;
                                                                    if (str10 != null || str10.length() == 0) {
                                                                        throw new IllegalStateException(str3);
                                                                    }
                                                                    C34406OooO00o.f123390OooO00o.OooO00o(str4.concat(str10), new Object[0]);
                                                                    InterfaceC27296OooOO0o interfaceC27296OooOO0o = r612.f95599OooO0o0;
                                                                    r612.f95598OooO0o.OooO0Oo();
                                                                    notePlaceHolder12.getId();
                                                                    r1116.f95347OooOo0o = r612;
                                                                    r1116.f95346OooOo = notePlaceHolder12;
                                                                    r1116.f95349OooOoO0 = paperTheme6;
                                                                    r1116.f95348OooOoO = string;
                                                                    r1116.f95350OooOoOO = r412;
                                                                    r1116.f95355Oooo000 = 12;
                                                                    interfaceC27296OooOO0o.getClass();
                                                                    r03 = r412;
                                                                    notePlaceHolder13 = notePlaceHolder12;
                                                                    r413 = r412;
                                                                    r613 = r612;
                                                                    r717 = r716;
                                                                    i12 = i11;
                                                                    r1117 = r1116;
                                                                    file4 = (File) r03;
                                                                    notePlaceHolder19 = notePlaceHolder13;
                                                                    r418 = r413;
                                                                    r619 = r613;
                                                                    r722 = r717;
                                                                    i17 = i12;
                                                                    r1123 = r1117;
                                                                    file3 = file4;
                                                                    notePlaceHolder18 = notePlaceHolder19;
                                                                    r417 = r418;
                                                                    r618 = r619;
                                                                    r721 = r722;
                                                                    i16 = i17;
                                                                    r1122 = r1123;
                                                                    paperTheme3 = paperTheme6;
                                                                    file = file3;
                                                                    notePlaceHolder17 = notePlaceHolder18;
                                                                    r43 = r417;
                                                                    r64 = r618;
                                                                    r75 = r721;
                                                                    i = i16;
                                                                    r114 = r1122;
                                                                    String str1622 = string;
                                                                    if (file != null) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            r12 = 0;
                                                            C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal, isEpubFile", new Object[0]);
                                                            C27499o00Ooo0 c27499o00Ooo09 = r66.f95604OooOO0o;
                                                            r1112.f95347OooOo0o = r66;
                                                            r1112.f95346OooOo = notePlaceHolder8;
                                                            r1112.f95349OooOoO0 = paperTheme4;
                                                            r1112.f95348OooOoO = string;
                                                            r1112.f95350OooOoOO = uri;
                                                            r1112.f95355Oooo000 = 8;
                                                            Object objOooO0OO4 = C27499o00Ooo0.OooO0OO(c27499o00Ooo09, uri, r1112);
                                                            if (objOooO0OO4 == r712) {
                                                                notePlaceHolder5 = notePlaceHolder8;
                                                                r45 = r48;
                                                                r79 = r712;
                                                                i4 = i7;
                                                                r118 = r1112;
                                                            } else {
                                                                paperTheme6 = paperTheme4;
                                                                obj15 = objOooO0OO4;
                                                                notePlaceHolder9 = notePlaceHolder8;
                                                                r49 = r48;
                                                                r69 = r66;
                                                                r713 = r712;
                                                                i8 = i7;
                                                                r1113 = r1112;
                                                                str8 = (String) obj15;
                                                                if (str8 != null || str8.length() == 0) {
                                                                    throw new IllegalStateException("Couldn't get pdf file path in private dir");
                                                                }
                                                                InterfaceC27296OooOO0o interfaceC27296OooOO0o2 = r69.f95599OooO0o0;
                                                                r69.f95598OooO0o.OooO0Oo();
                                                                notePlaceHolder9.getId();
                                                                r1113.f95347OooOo0o = r69;
                                                                r1113.f95346OooOo = notePlaceHolder9;
                                                                r1113.f95349OooOoO0 = paperTheme6;
                                                                r1113.f95348OooOoO = string;
                                                                r1113.f95350OooOoOO = r49;
                                                                r1113.f95355Oooo000 = 9;
                                                                interfaceC27296OooOO0o2.getClass();
                                                                r02 = r49;
                                                                notePlaceHolder10 = notePlaceHolder9;
                                                                r410 = r49;
                                                                r610 = r69;
                                                                r714 = r713;
                                                                i9 = i8;
                                                                r1114 = r1113;
                                                                file4 = (File) r02;
                                                                notePlaceHolder19 = notePlaceHolder10;
                                                                r418 = r410;
                                                                r619 = r610;
                                                                r722 = r714;
                                                                i17 = i9;
                                                                r1123 = r1114;
                                                                file3 = file4;
                                                                notePlaceHolder18 = notePlaceHolder19;
                                                                r417 = r418;
                                                                r618 = r619;
                                                                r721 = r722;
                                                                i16 = i17;
                                                                r1122 = r1123;
                                                                paperTheme3 = paperTheme6;
                                                                file = file3;
                                                                notePlaceHolder17 = notePlaceHolder18;
                                                                r43 = r417;
                                                                r64 = r618;
                                                                r75 = r721;
                                                                i = i16;
                                                                r114 = r1122;
                                                                String str16222 = string;
                                                                if (file != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal isDocFile", new Object[0]);
                                                    C27499o00Ooo0 c27499o00Ooo010 = r12.f95604OooOO0o;
                                                    r118.f95347OooOo0o = r12;
                                                    r118.f95346OooOo = notePlaceHolder5;
                                                    r118.f95349OooOoO0 = paperTheme4;
                                                    r118.f95348OooOoO = string;
                                                    r118.f95350OooOoOO = uri;
                                                    r118.f95355Oooo000 = i4;
                                                    Object objOooO0OO5 = C27499o00Ooo0.OooO0OO(c27499o00Ooo010, uri, r118);
                                                    notePlaceHolder5 = notePlaceHolder5;
                                                    r45 = r45;
                                                    r79 = r79;
                                                    i4 = i4;
                                                    r118 = r118;
                                                    r12 = r12;
                                                    if (objOooO0OO5 != r79) {
                                                        ?? r14 = r12;
                                                        uri3 = uri;
                                                        paperTheme6 = paperTheme4;
                                                        r5 = r14;
                                                        str5 = string;
                                                        obj12 = objOooO0OO5;
                                                        notePlaceHolder3 = notePlaceHolder5;
                                                        r44 = r45;
                                                        r76 = r79;
                                                        i2 = i4;
                                                        r119 = r118;
                                                        str7 = (String) obj12;
                                                        if (str7 != null || str7.length() == 0) {
                                                            throw new IllegalStateException("Couldn't get pdf file path in private dir");
                                                        }
                                                        C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal isDocFile, pdfFilePathInPrivateDir: ".concat(str7), new Object[0]);
                                                        ?? r622 = r5.f95599OooO0o0;
                                                        r5.f95598OooO0o.OooO0Oo();
                                                        String id4 = notePlaceHolder3.getId();
                                                        r119.f95347OooOo0o = r5;
                                                        r119.f95346OooOo = notePlaceHolder3;
                                                        r119.f95349OooOoO0 = paperTheme6;
                                                        r119.f95348OooOoO = str5;
                                                        r119.f95350OooOoOO = r44;
                                                        r119.f95355Oooo000 = 6;
                                                        ?? r16 = r119;
                                                        try {
                                                            Object objOooO00o2 = r622.OooO00o(uri3, str7, str5, id4, r16);
                                                            ?? r1127 = r16;
                                                            notePlaceHolder5 = notePlaceHolder3;
                                                            r45 = r44;
                                                            r79 = r76;
                                                            i4 = i2;
                                                            r118 = r1127;
                                                            r12 = uri3;
                                                            if (objOooO00o2 != r76) {
                                                                r67 = r5;
                                                                obj13 = objOooO00o2;
                                                                notePlaceHolder7 = notePlaceHolder3;
                                                                r47 = r44;
                                                                r711 = r76;
                                                                i6 = i2;
                                                                r1111 = r1127;
                                                                file2 = (File) obj13;
                                                                notePlaceHolder6 = notePlaceHolder7;
                                                                r46 = r47;
                                                                r68 = r67;
                                                                r710 = r711;
                                                                i5 = i6;
                                                                r1110 = r1111;
                                                                file3 = file2;
                                                                string = str5;
                                                                notePlaceHolder18 = notePlaceHolder6;
                                                                r417 = r46;
                                                                r618 = r68;
                                                                r721 = r710;
                                                                i16 = i5;
                                                                r1122 = r1110;
                                                                paperTheme3 = paperTheme6;
                                                                file = file3;
                                                                notePlaceHolder17 = notePlaceHolder18;
                                                                r43 = r417;
                                                                r64 = r618;
                                                                r75 = r721;
                                                                i = i16;
                                                                r114 = r1122;
                                                                String str162222 = string;
                                                                if (file != null) {
                                                                }
                                                            }
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            r115 = r16;
                                                            r132 = r44;
                                                            r63 = r115;
                                                            r113 = r5;
                                                            notePlaceHolder2 = notePlaceHolder3;
                                                            r42 = r44;
                                                            r73 = r76;
                                                            r102 = i2;
                                                            str14 = str;
                                                            r2 = notePlaceHolder2;
                                                            r4 = r42;
                                                            r62 = r63;
                                                            r72 = r73;
                                                            r10 = r102;
                                                            r112 = r113;
                                                            r13 = r132;
                                                        }
                                                    }
                                                }
                                                return r79;
                                            } catch (Exception e10) {
                                                e = e10;
                                                r132 = r45;
                                                r63 = r118;
                                                r113 = r12;
                                                notePlaceHolder2 = notePlaceHolder5;
                                                r42 = r45;
                                                r73 = r79;
                                                r102 = i4;
                                                str14 = str;
                                                r2 = notePlaceHolder2;
                                                r4 = r42;
                                                r62 = r63;
                                                r72 = r73;
                                                r10 = r102;
                                                r112 = r113;
                                                r13 = r132;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                        }
                                    } else {
                                        C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal isPptFile", new Object[0]);
                                        o0000O00 o0000o002 = new o0000O00(r5);
                                        C27499o00Ooo0 c27499o00Ooo011 = r5.f95604OooOO0o;
                                        o0000Var.f95347OooOo0o = r5;
                                        o0000Var.f95346OooOo = notePlaceHolder3;
                                        o0000Var.f95349OooOoO0 = paperTheme2;
                                        o0000Var.f95348OooOoO = string;
                                        o0000Var.f95350OooOoOO = o0000o002;
                                        o0000Var.f95352OooOoo0 = uri;
                                        o0000Var.f95351OooOoo = z2;
                                        o0000Var.f95355Oooo000 = 2;
                                        Object objOooO0OO6 = C27499o00Ooo0.OooO0OO(c27499o00Ooo011, uri, o0000Var);
                                        if (objOooO0OO6 != r1125) {
                                            r621 = r5;
                                            str5 = string;
                                            paperTheme5 = paperTheme2;
                                            uri2 = uri;
                                            o0000o00 = o0000o002;
                                            obj5 = objOooO0OO6;
                                            notePlaceHolder21 = notePlaceHolder3;
                                            try {
                                                str6 = (String) obj5;
                                            } catch (Exception e12) {
                                                e = e12;
                                                r77 = r1125;
                                                obj6 = null;
                                            }
                                            if (str6 != null || str6.length() == 0) {
                                                throw new IllegalStateException("Couldn't get pdf file path in private dir");
                                            }
                                            C34406OooO00o.f123390OooO00o.OooO00o("createPdfNoteByPlaceholderInternal isPptFile, pdfFilePathInPrivateDir: ".concat(str6), new Object[0]);
                                            try {
                                                r116 = r621.f95599OooO0o0;
                                                try {
                                                    r621.f95598OooO0o.OooO0Oo();
                                                    id2 = notePlaceHolder21.getId();
                                                    o0000Var.f95347OooOo0o = r621;
                                                    o0000Var.f95346OooOo = notePlaceHolder21;
                                                    o0000Var.f95349OooOoO0 = paperTheme5;
                                                    o0000Var.f95348OooOoO = str5;
                                                    try {
                                                        o0000Var.f95350OooOoOO = null;
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        r77 = r1125;
                                                        obj6 = null;
                                                        r1125 = o0000Var;
                                                        obj7 = obj6;
                                                        r724 = r77;
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    r724 = r1125;
                                                    r1125 = o0000Var;
                                                    obj7 = null;
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                r724 = r1125;
                                                r1125 = o0000Var;
                                                obj7 = null;
                                            }
                                            try {
                                                o0000Var.f95352OooOoo0 = null;
                                                o0000Var.f95355Oooo000 = 3;
                                                r724 = r1125;
                                                obj8 = null;
                                                ?? r17 = o0000Var;
                                                o0000Var = 5;
                                                i3 = 5;
                                                try {
                                                    objOooO0Oo = r116.OooO0Oo(uri2, str6, str5, id2, o0000o00, r17);
                                                    r117 = r17;
                                                } catch (Exception e16) {
                                                    e = e16;
                                                    r1125 = r17;
                                                    obj2 = obj8;
                                                    ?? r52 = r1125;
                                                    r113 = r621;
                                                    r63 = r52;
                                                    r132 = obj2;
                                                    notePlaceHolder2 = notePlaceHolder21;
                                                    r42 = obj2;
                                                    r73 = r724;
                                                    r102 = o0000Var;
                                                    str14 = str;
                                                    r2 = notePlaceHolder2;
                                                    r4 = r42;
                                                    r62 = r63;
                                                    r72 = r73;
                                                    r10 = r102;
                                                    r112 = r113;
                                                    r13 = r132;
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                r724 = r1125;
                                                obj7 = null;
                                                r1125 = o0000Var;
                                                o0000Var = 5;
                                                obj2 = obj7;
                                            }
                                            if (objOooO0Oo == r724) {
                                                return r724;
                                            }
                                            paperTheme6 = paperTheme5;
                                            obj10 = objOooO0Oo;
                                            notePlaceHolder4 = notePlaceHolder21;
                                            obj9 = obj8;
                                            r65 = r621;
                                            r78 = r724;
                                            file2 = (File) obj10;
                                            notePlaceHolder6 = notePlaceHolder4;
                                            r46 = obj9;
                                            r68 = r65;
                                            r710 = r78;
                                            i5 = i3;
                                            r1110 = r117;
                                            file3 = file2;
                                            string = str5;
                                            notePlaceHolder18 = notePlaceHolder6;
                                            r417 = r46;
                                            r618 = r68;
                                            r721 = r710;
                                            i16 = i5;
                                            r1122 = r1110;
                                            paperTheme3 = paperTheme6;
                                            file = file3;
                                            notePlaceHolder17 = notePlaceHolder18;
                                            r43 = r417;
                                            r64 = r618;
                                            r75 = r721;
                                            i = i16;
                                            r114 = r1122;
                                            String str1622222 = string;
                                            if (file != null) {
                                                try {
                                                    if (file.exists()) {
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                        str14 = str;
                                                        try {
                                                            c20358OooO00o4.OooOOO0(str14);
                                                            c20358OooO00o4.OooO0o0(str2 + file, new Object[0]);
                                                            id3 = notePlaceHolder17.getId();
                                                            parentId = notePlaceHolder17.getParentId();
                                                            title = notePlaceHolder17.getTitle();
                                                            absolutePath = file.getAbsolutePath();
                                                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                                                            r114.f95347OooOo0o = r64;
                                                            r114.f95346OooOo = notePlaceHolder17;
                                                            r114.f95349OooOoO0 = file;
                                                            r114.f95348OooOoO = r43;
                                                            r114.f95355Oooo000 = 17;
                                                            r18 = r114;
                                                            r1121 = r64;
                                                        } catch (Exception e18) {
                                                            e = e18;
                                                            ?? r27 = r114;
                                                            r1121 = r64;
                                                            r617 = r27;
                                                        }
                                                        try {
                                                            Object objOooO0o0 = r1121.OooO0o0(id3, parentId, title, absolutePath, str1622222, paperTheme3, r18);
                                                            notePlaceHolder5 = notePlaceHolder17;
                                                            r45 = r43;
                                                            r79 = r75;
                                                            i4 = i;
                                                            r118 = r1121;
                                                            r12 = id3;
                                                            break;
                                                        } catch (Exception e19) {
                                                            e = e19;
                                                            r617 = r18;
                                                            r13 = file;
                                                            r2 = notePlaceHolder17;
                                                            r4 = r43;
                                                            r62 = r617;
                                                            r72 = r75;
                                                            r10 = i;
                                                            r112 = r1121;
                                                            c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o.OooOOO0(str14);
                                                            c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("Import pdf as note failed, error: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                                                            if (r13 != 0) {
                                                            }
                                                            c20358OooO00o.OooOOO0(str14);
                                                            c20358OooO00o.OooO0Oo(e, "Couldn't import pdf. placeholder: " + r2 + ", e: " + e, new Object[0]);
                                                            if (e instanceof PdfPasswordException) {
                                                            }
                                                        }
                                                    } else {
                                                        ?? r53 = r114;
                                                        r1121 = r64;
                                                        r617 = r53;
                                                        str14 = str;
                                                        try {
                                                            throw new IllegalStateException("Couldn't dump pdf to documents dir.");
                                                        } catch (Exception e20) {
                                                            e = e20;
                                                        }
                                                    }
                                                } catch (Exception e21) {
                                                    e = e21;
                                                    ?? r54 = r114;
                                                    r1121 = r64;
                                                    r617 = r54;
                                                    str14 = str;
                                                }
                                                r13 = file;
                                                r2 = notePlaceHolder17;
                                                r4 = r43;
                                                r62 = r617;
                                                r72 = r75;
                                                r10 = i;
                                                r112 = r1121;
                                                c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o.OooOOO0(str14);
                                                c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("Import pdf as note failed, error: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                                                if (r13 != 0 && r13.exists()) {
                                                    String absolutePath2 = r13.getAbsolutePath();
                                                    new File(absolutePath2).delete();
                                                    c20358OooO00o.OooOOO0(str14);
                                                    c20358OooO00o.OooO00o("Import pdf as note failed, delete pdf file:" + absolutePath2 + ".", new Object[0]);
                                                }
                                                c20358OooO00o.OooOOO0(str14);
                                                c20358OooO00o.OooO0Oo(e, "Couldn't import pdf. placeholder: " + r2 + ", e: " + e, new Object[0]);
                                                if (!(e instanceof PdfPasswordException) || (e instanceof IncorrectPasswordException) || (e instanceof InvalidPasswordException)) {
                                                    c20358OooO00o.OooOOO0(str14);
                                                    c20358OooO00o.OooO0Oo(e, "Can't import the pdf because it is encrypted. " + r2, new Object[0]);
                                                    r0 = r112.f95601OooO0oo;
                                                    id = r2.getId();
                                                    r62.f95347OooOo0o = r13;
                                                    r62.f95346OooOo = r4;
                                                    r62.f95349OooOoO0 = r4;
                                                    r62.f95348OooOoO = r4;
                                                    r62.f95350OooOoOO = r4;
                                                    r62.f95352OooOoo0 = r4;
                                                    r62.f95355Oooo000 = 18;
                                                    if (r0.OooO0oO(r10, id, r62) == r72) {
                                                        return r72;
                                                    }
                                                } else {
                                                    ?? r04 = r112.f95601OooO0oo;
                                                    String id5 = r2.getId();
                                                    r62.f95347OooOo0o = r13;
                                                    r62.f95346OooOo = r4;
                                                    r62.f95349OooOoO0 = r4;
                                                    r62.f95348OooOoO = r4;
                                                    r62.f95350OooOoOO = r4;
                                                    r62.f95352OooOoo0 = r4;
                                                    r62.f95355Oooo000 = 19;
                                                    if (r04.OooO0oO(1, id5, r62) == r72) {
                                                        return r72;
                                                    }
                                                }
                                                r22 = r13;
                                                if (r22 != 0) {
                                                    C31190OooO0oo.OooO0oo(r22);
                                                }
                                            }
                                            r1125 = o0000Var;
                                            obj7 = obj6;
                                            r724 = r77;
                                            o0000Var = 5;
                                            obj2 = obj7;
                                            ?? r522 = r1125;
                                            r113 = r621;
                                            r63 = r522;
                                            r132 = obj2;
                                            notePlaceHolder2 = notePlaceHolder21;
                                            r42 = obj2;
                                            r73 = r724;
                                            r102 = o0000Var;
                                            str14 = str;
                                            r2 = notePlaceHolder2;
                                            r4 = r42;
                                            r62 = r63;
                                            r72 = r73;
                                            r10 = r102;
                                            r112 = r113;
                                            r13 = r132;
                                            c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o.OooOOO0(str14);
                                            c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("Import pdf as note failed, error: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                                            if (r13 != 0) {
                                                String absolutePath22 = r13.getAbsolutePath();
                                                new File(absolutePath22).delete();
                                                c20358OooO00o.OooOOO0(str14);
                                                c20358OooO00o.OooO00o("Import pdf as note failed, delete pdf file:" + absolutePath22 + ".", new Object[0]);
                                            }
                                            c20358OooO00o.OooOOO0(str14);
                                            c20358OooO00o.OooO0Oo(e, "Couldn't import pdf. placeholder: " + r2 + ", e: " + e, new Object[0]);
                                            if (e instanceof PdfPasswordException) {
                                                c20358OooO00o.OooOOO0(str14);
                                                c20358OooO00o.OooO0Oo(e, "Can't import the pdf because it is encrypted. " + r2, new Object[0]);
                                                r0 = r112.f95601OooO0oo;
                                                id = r2.getId();
                                                r62.f95347OooOo0o = r13;
                                                r62.f95346OooOo = r4;
                                                r62.f95349OooOoO0 = r4;
                                                r62.f95348OooOoO = r4;
                                                r62.f95350OooOoOO = r4;
                                                r62.f95352OooOoo0 = r4;
                                                r62.f95355Oooo000 = 18;
                                                if (r0.OooO0oO(r10, id, r62) == r72) {
                                                }
                                                r22 = r13;
                                                if (r22 != 0) {
                                                }
                                            }
                                        }
                                    }
                                    r132 = r44;
                                    r63 = r115;
                                    r113 = r5;
                                    notePlaceHolder2 = notePlaceHolder3;
                                    r42 = r44;
                                    r73 = r76;
                                    r102 = i2;
                                    str14 = str;
                                    r2 = notePlaceHolder2;
                                    r4 = r42;
                                    r62 = r63;
                                    r72 = r73;
                                    r10 = r102;
                                    r112 = r113;
                                    r13 = r132;
                                    c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0(str14);
                                    c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("Import pdf as note failed, error: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                                    if (r13 != 0) {
                                    }
                                    c20358OooO00o.OooOOO0(str14);
                                    c20358OooO00o.OooO0Oo(e, "Couldn't import pdf. placeholder: " + r2 + ", e: " + e, new Object[0]);
                                    if (e instanceof PdfPasswordException) {
                                    }
                                }
                                return r1125;
                            }
                            r75 = r1125;
                            r43 = 0;
                            r114 = o0000Var;
                            i = 5;
                            r64 = this;
                            paperTheme3 = paperTheme;
                            file = null;
                            notePlaceHolder17 = notePlaceHolder21;
                            String str16222222 = string;
                            if (file != null) {
                            }
                        }
                        z = true;
                        filePath = notePlaceHolder21.getFilePath();
                        if (filePath != null) {
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                str = "NoteCreationUseCase";
                str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str3 = "Couldn't get pdf file path in private dir.";
                z = false;
                filePath = notePlaceHolder21.getFilePath();
                if (filePath != null) {
                }
                break;
            case 1:
                boolean z4 = o0000Var.f95351OooOoo;
                uri = (Uri) o0000Var.f95350OooOoOO;
                String str17 = o0000Var.f95348OooOoO;
                paperTheme2 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder22 = o0000Var.f95346OooOo;
                o000OO o000oo2 = (o000OO) o0000Var.f95347OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj22);
                    z2 = z4;
                    notePlaceHolder3 = notePlaceHolder22;
                    str = "NoteCreationUseCase";
                    str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                    obj4 = obj22;
                    r5 = o000oo2;
                    str2 = "start create pdf note, pdfFileInPrivateDir: ";
                    string = str17;
                    str3 = "Couldn't get pdf file path in private dir.";
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } catch (Exception e22) {
                    e = e22;
                    obj = notePlaceHolder22;
                    r6 = o0000Var;
                    r7 = r1125;
                    r11 = o000oo2;
                    r4 = 0;
                    r10 = 5;
                    r13 = 0;
                    r2 = obj;
                    r62 = r6;
                    r72 = r7;
                    r112 = r11;
                }
                r132 = r44;
                r63 = r115;
                r113 = r5;
                notePlaceHolder2 = notePlaceHolder3;
                r42 = r44;
                r73 = r76;
                r102 = i2;
                str14 = str;
                r2 = notePlaceHolder2;
                r4 = r42;
                r62 = r63;
                r72 = r73;
                r10 = r102;
                r112 = r113;
                r13 = r132;
                c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(str14);
                c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("Import pdf as note failed, error: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                if (r13 != 0) {
                }
                c20358OooO00o.OooOOO0(str14);
                c20358OooO00o.OooO0Oo(e, "Couldn't import pdf. placeholder: " + r2 + ", e: " + e, new Object[0]);
                if (e instanceof PdfPasswordException) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
                Uri uri4 = o0000Var.f95352OooOoo0;
                o0000o00 = (o0000O00) o0000Var.f95350OooOoOO;
                String str18 = o0000Var.f95348OooOoO;
                paperTheme5 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder23 = o0000Var.f95346OooOo;
                o000OO o000oo3 = (o000OO) o0000Var.f95347OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj22);
                    uri2 = uri4;
                    notePlaceHolder21 = notePlaceHolder23;
                    str5 = str18;
                    r621 = o000oo3;
                    str = "NoteCreationUseCase";
                    str2 = "start create pdf note, pdfFileInPrivateDir: ";
                    obj5 = obj22;
                    str6 = (String) obj5;
                    if (str6 != null) {
                        break;
                    }
                    throw new IllegalStateException("Couldn't get pdf file path in private dir");
                } catch (Exception e23) {
                    e = e23;
                    r6 = o0000Var;
                    r7 = r1125;
                    obj = notePlaceHolder23;
                    r11 = o000oo3;
                    r4 = 0;
                    r10 = 5;
                    r13 = 0;
                    r2 = obj;
                    r62 = r6;
                    r72 = r7;
                    r112 = r11;
                }
                break;
            case 3:
                String str19 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder24 = o0000Var.f95346OooOo;
                o000OO o000oo4 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str5 = str19;
                str = "NoteCreationUseCase";
                notePlaceHolder4 = notePlaceHolder24;
                r65 = o000oo4;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r78 = r1125;
                obj9 = null;
                r117 = o0000Var;
                i3 = 5;
                obj10 = obj22;
                file2 = (File) obj10;
                notePlaceHolder6 = notePlaceHolder4;
                r46 = obj9;
                r68 = r65;
                r710 = r78;
                i5 = i3;
                r1110 = r117;
                file3 = file2;
                string = str5;
                notePlaceHolder18 = notePlaceHolder6;
                r417 = r46;
                r618 = r68;
                r721 = r710;
                i16 = i5;
                r1122 = r1110;
                paperTheme3 = paperTheme6;
                file = file3;
                notePlaceHolder17 = notePlaceHolder18;
                r43 = r417;
                r64 = r618;
                r75 = r721;
                i = i16;
                r114 = r1122;
                String str162222222 = string;
                if (file != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                Uri uri5 = (Uri) o0000Var.f95350OooOoOO;
                String str20 = o0000Var.f95348OooOoO;
                PaperTheme paperTheme8 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder25 = o0000Var.f95346OooOo;
                o000OO o000oo5 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                paperTheme4 = paperTheme8;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r79 = r1125;
                str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str3 = "Couldn't get pdf file path in private dir.";
                r45 = 0;
                string = str20;
                r118 = o0000Var;
                i4 = 5;
                uri = uri5;
                notePlaceHolder5 = notePlaceHolder25;
                obj11 = obj22;
                r12 = o000oo5;
                if (((Boolean) obj11).booleanValue()) {
                }
                return r79;
            case 5:
                Uri uri6 = (Uri) o0000Var.f95350OooOoOO;
                String str21 = o0000Var.f95348OooOoO;
                PaperTheme paperTheme9 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder26 = o0000Var.f95346OooOo;
                o000OO o000oo6 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str5 = str21;
                str = "NoteCreationUseCase";
                paperTheme6 = paperTheme9;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r76 = r1125;
                r5 = o000oo6;
                r44 = 0;
                uri3 = uri6;
                notePlaceHolder3 = notePlaceHolder26;
                r119 = o0000Var;
                i2 = 5;
                obj12 = obj22;
                str7 = (String) obj12;
                if (str7 != null) {
                    break;
                }
                throw new IllegalStateException("Couldn't get pdf file path in private dir");
            case 6:
                String str22 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder27 = o0000Var.f95346OooOo;
                o000OO o000oo7 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str5 = str22;
                str = "NoteCreationUseCase";
                notePlaceHolder7 = notePlaceHolder27;
                r67 = o000oo7;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r711 = r1125;
                r47 = 0;
                r1111 = o0000Var;
                i6 = 5;
                obj13 = obj22;
                file2 = (File) obj13;
                notePlaceHolder6 = notePlaceHolder7;
                r46 = r47;
                r68 = r67;
                r710 = r711;
                i5 = i6;
                r1110 = r1111;
                file3 = file2;
                string = str5;
                notePlaceHolder18 = notePlaceHolder6;
                r417 = r46;
                r618 = r68;
                r721 = r710;
                i16 = i5;
                r1122 = r1110;
                paperTheme3 = paperTheme6;
                file = file3;
                notePlaceHolder17 = notePlaceHolder18;
                r43 = r417;
                r64 = r618;
                r75 = r721;
                i = i16;
                r114 = r1122;
                String str1622222222 = string;
                if (file != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 7:
                Uri uri7 = (Uri) o0000Var.f95350OooOoOO;
                String str23 = o0000Var.f95348OooOoO;
                PaperTheme paperTheme10 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder28 = o0000Var.f95346OooOo;
                o000OO o000oo8 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                paperTheme4 = paperTheme10;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r66 = o000oo8;
                str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str3 = "Couldn't get pdf file path in private dir.";
                r48 = 0;
                string = str23;
                uri = uri7;
                notePlaceHolder8 = notePlaceHolder28;
                r712 = r1125;
                r1112 = o0000Var;
                i7 = 5;
                obj14 = obj22;
                if (((Boolean) obj14).booleanValue()) {
                }
                return r79;
            case 8:
                String str24 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder29 = o0000Var.f95346OooOo;
                o000OO o000oo9 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r49 = 0;
                string = str24;
                notePlaceHolder9 = notePlaceHolder29;
                r69 = o000oo9;
                r713 = r1125;
                r1113 = o0000Var;
                i8 = 5;
                obj15 = obj22;
                str8 = (String) obj15;
                if (str8 != null) {
                    break;
                }
                throw new IllegalStateException("Couldn't get pdf file path in private dir");
            case 9:
                String str25 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder30 = o0000Var.f95346OooOo;
                o000OO o000oo10 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r410 = 0;
                string = str25;
                notePlaceHolder10 = notePlaceHolder30;
                r610 = o000oo10;
                r714 = r1125;
                r1114 = o0000Var;
                i9 = 5;
                r02 = obj22;
                file4 = (File) r02;
                notePlaceHolder19 = notePlaceHolder10;
                r418 = r410;
                r619 = r610;
                r722 = r714;
                i17 = i9;
                r1123 = r1114;
                file3 = file4;
                notePlaceHolder18 = notePlaceHolder19;
                r417 = r418;
                r618 = r619;
                r721 = r722;
                i16 = i17;
                r1122 = r1123;
                paperTheme3 = paperTheme6;
                file = file3;
                notePlaceHolder17 = notePlaceHolder18;
                r43 = r417;
                r64 = r618;
                r75 = r721;
                i = i16;
                r114 = r1122;
                String str16222222222 = string;
                if (file != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 10:
                Uri uri8 = (Uri) o0000Var.f95350OooOoOO;
                String str26 = o0000Var.f95348OooOoO;
                PaperTheme paperTheme11 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder31 = o0000Var.f95346OooOo;
                o000OO o000oo11 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                paperTheme4 = paperTheme11;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r611 = o000oo11;
                str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str3 = "Couldn't get pdf file path in private dir.";
                r411 = 0;
                string = str26;
                uri = uri8;
                notePlaceHolder11 = notePlaceHolder31;
                r715 = r1125;
                r1115 = o0000Var;
                i10 = 5;
                obj16 = obj22;
                if (((Boolean) obj16).booleanValue()) {
                }
                return r79;
            case 11:
                String str27 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder32 = o0000Var.f95346OooOo;
                o000OO o000oo12 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                str4 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str3 = "Couldn't get pdf file path in private dir.";
                r412 = 0;
                string = str27;
                notePlaceHolder12 = notePlaceHolder32;
                r612 = o000oo12;
                r716 = r1125;
                r1116 = o0000Var;
                i11 = 5;
                obj17 = obj22;
                str10 = (String) obj17;
                if (str10 != null) {
                    break;
                }
                throw new IllegalStateException(str3);
            case 12:
                String str28 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder33 = o0000Var.f95346OooOo;
                o000OO o000oo13 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r413 = 0;
                string = str28;
                notePlaceHolder13 = notePlaceHolder33;
                r613 = o000oo13;
                r717 = r1125;
                r1117 = o0000Var;
                i12 = 5;
                r03 = obj22;
                file4 = (File) r03;
                notePlaceHolder19 = notePlaceHolder13;
                r418 = r413;
                r619 = r613;
                r722 = r717;
                i17 = i12;
                r1123 = r1117;
                file3 = file4;
                notePlaceHolder18 = notePlaceHolder19;
                r417 = r418;
                r618 = r619;
                r721 = r722;
                i16 = i17;
                r1122 = r1123;
                paperTheme3 = paperTheme6;
                file = file3;
                notePlaceHolder17 = notePlaceHolder18;
                r43 = r417;
                r64 = r618;
                r75 = r721;
                i = i16;
                r114 = r1122;
                String str162222222222 = string;
                if (file != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 13:
                Uri uri9 = (Uri) o0000Var.f95350OooOoOO;
                String str29 = o0000Var.f95348OooOoO;
                PaperTheme paperTheme12 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder34 = o0000Var.f95346OooOo;
                o000OO o000oo14 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                paperTheme4 = paperTheme12;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r614 = o000oo14;
                str11 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str9 = "Couldn't get pdf file path in private dir.";
                r414 = 0;
                string = str29;
                uri = uri9;
                notePlaceHolder14 = notePlaceHolder34;
                r718 = r1125;
                r1118 = o0000Var;
                i13 = 5;
                obj18 = obj22;
                if (((Boolean) obj18).booleanValue()) {
                }
                return r79;
            case 14:
                Uri uri10 = (Uri) o0000Var.f95350OooOoOO;
                String str30 = o0000Var.f95348OooOoO;
                PaperTheme paperTheme13 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder35 = o0000Var.f95346OooOo;
                o000OO o000oo15 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                paperTheme4 = paperTheme13;
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r615 = o000oo15;
                str12 = "createPdfNoteByPlaceholderInternal, pdfFilePathInPrivateDir: ";
                str9 = "Couldn't get pdf file path in private dir.";
                r415 = 0;
                string = str30;
                uri = uri10;
                notePlaceHolder15 = notePlaceHolder35;
                r719 = r1125;
                r1119 = o0000Var;
                i14 = 5;
                obj19 = obj22;
                str13 = (String) obj19;
                if (str13 != null) {
                    break;
                }
                throw new IllegalStateException(str9);
            case 15:
                String str31 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder36 = o0000Var.f95346OooOo;
                o000OO o000oo16 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r416 = 0;
                string = str31;
                notePlaceHolder16 = notePlaceHolder36;
                r616 = o000oo16;
                r720 = r1125;
                r1120 = o0000Var;
                i15 = 5;
                obj20 = obj22;
                file4 = (File) obj20;
                notePlaceHolder19 = notePlaceHolder16;
                r418 = r416;
                r619 = r616;
                r722 = r720;
                i17 = i15;
                r1123 = r1120;
                file3 = file4;
                notePlaceHolder18 = notePlaceHolder19;
                r417 = r418;
                r618 = r619;
                r721 = r722;
                i16 = i17;
                r1122 = r1123;
                paperTheme3 = paperTheme6;
                file = file3;
                notePlaceHolder17 = notePlaceHolder18;
                r43 = r417;
                r64 = r618;
                r75 = r721;
                i = i16;
                r114 = r1122;
                String str1622222222222 = string;
                if (file != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 16:
                String str32 = o0000Var.f95348OooOoO;
                paperTheme6 = (PaperTheme) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder37 = o0000Var.f95346OooOo;
                o000OO o000oo17 = (o000OO) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                str = "NoteCreationUseCase";
                str2 = "start create pdf note, pdfFileInPrivateDir: ";
                r419 = 0;
                string = str32;
                notePlaceHolder20 = notePlaceHolder37;
                r620 = o000oo17;
                r723 = r1125;
                r1124 = o0000Var;
                i18 = 5;
                obj21 = obj22;
                file4 = (File) obj21;
                notePlaceHolder19 = notePlaceHolder20;
                r418 = r419;
                r619 = r620;
                r722 = r723;
                i17 = i18;
                r1123 = r1124;
                file3 = file4;
                notePlaceHolder18 = notePlaceHolder19;
                r417 = r418;
                r618 = r619;
                r721 = r722;
                i16 = i17;
                r1122 = r1123;
                paperTheme3 = paperTheme6;
                file = file3;
                notePlaceHolder17 = notePlaceHolder18;
                r43 = r417;
                r64 = r618;
                r75 = r721;
                i = i16;
                r114 = r1122;
                String str16222222222222 = string;
                if (file != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 17:
                File file5 = (File) o0000Var.f95349OooOoO0;
                NotePlaceHolder notePlaceHolder38 = o0000Var.f95346OooOo;
                o000OO o000oo18 = (o000OO) o0000Var.f95347OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj22);
                    break;
                } catch (Exception e24) {
                    e = e24;
                    r13 = file5;
                    r2 = notePlaceHolder38;
                    r72 = r1125;
                    r4 = 0;
                    r112 = o000oo18;
                    r62 = o0000Var;
                    r10 = 5;
                    c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0(str14);
                    c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("Import pdf as note failed, error: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                    if (r13 != 0) {
                    }
                    c20358OooO00o.OooOOO0(str14);
                    c20358OooO00o.OooO0Oo(e, "Couldn't import pdf. placeholder: " + r2 + ", e: " + e, new Object[0]);
                    if (e instanceof PdfPasswordException) {
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            case 18:
            case 19:
                File file6 = (File) o0000Var.f95347OooOo0o;
                C32446OooOOOo.OooO0O0(obj22);
                r22 = file6;
                if (r22 != 0) {
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object OooO0o0(String str, String str2, String str3, String str4, String str5, PaperTheme paperTheme, o0000 o0000Var) throws Exception {
        PdfInfo pdfInfo = new PdfInfo(null, str4, null, str5, 5, null);
        try {
            PdfiumCore pdfiumCore = new PdfiumCore(this.f95610OooOOo0);
            pdfiumCore.closeDocument(pdfiumCore.newDocument(pdfInfo.getPdfPath(), pdfInfo.getPassword()));
            ArrayList arrayListOooOO0o = OooOO0o(pdfInfo, str, paperTheme != null);
            ArrayList arrayListOooOO0O = OooOO0O(pdfInfo, arrayListOooOO0o, str);
            if (str4.length() > 0) {
                if (!C31190OooO0oo.OooOOoo(str4)) {
                    throw new IllegalStateException("Unable to dump pdf file");
                }
                pdfInfo.setPdfPath(str4);
            }
            PaperOrientation paperOrientation = ((Page) oOo000Oo.OooOo.Oooo0oO(arrayListOooOO0o)).getPaperOrientation();
            if (paperTheme == null) {
                paperTheme = this.f95595OooO0O0.OooOO0O(paperOrientation);
            }
            return OooO0OO(new Note.Builder().setId(str).setDefaultPageSpec(PaperSpec.INSTANCE.getA4()).setDefaultPageTheme(paperTheme).setPages(arrayListOooOO0o).setOutlines((List<Outline>) arrayListOooOO0O).setTitle(str3).setParentId(str2).setPdfInfo(pdfInfo), o0000Var);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteCreationUseCase");
            c20358OooO00o.OooO0Oo(e, "createPdfNote, can not open pdf file.", new Object[0]);
            throw e;
        }
    }

    public final Object OooO0oO(List list, String str, String str2, PaperTheme paperTheme, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C34406OooO00o.f123390OooO00o.OooO00o("createPdfNotes, pdfUriList: " + list + ", folderId: " + str + ", customTitle: " + str2 + ", templateTheme: " + paperTheme, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27396o0000oo(list, this, paperTheme, str2, str, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000O0 o0000o0;
        String str3;
        String str4;
        o000OO o000oo2;
        if (abstractC32479OooO0OO instanceof o0000O0) {
            o0000o0 = (o0000O0) abstractC32479OooO0OO;
            int i = o0000o0.f95402OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o0.f95402OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o0000o0 = new o0000O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = o0000o0.f95399OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000o0.f95402OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            C27088OooO0oo c27088OooO0ooOooOOOO = this.f95595OooO0O0.OooOOOO();
            o0000o0.f95398OooOo0o = this;
            str3 = str;
            o0000o0.f95397OooOo = str3;
            str4 = str2;
            o0000o0.f95400OooOoO0 = str4;
            o0000o0.f95402OooOoo0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c27088OooO0ooOooOOOO, o0000o0);
            if (objOooOOo != enumC32485OooO00o) {
                o000oo2 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
            return objOooOOo;
        }
        String str5 = o0000o0.f95400OooOoO0;
        String str6 = o0000o0.f95397OooOo;
        o000OO o000oo3 = o0000o0.f95398OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        str4 = str5;
        str3 = str6;
        o000oo2 = o000oo3;
        PaperTheme paperThemeOooOO0O = (PaperTheme) objOooOOo;
        if (paperThemeOooOO0O == null) {
            paperThemeOooOO0O = o000oo2.f95595OooO0O0.OooOO0O(PaperOrientation.VERTICAL);
        }
        PaperTheme paperTheme = paperThemeOooOO0O;
        String strOooO00o = C24761OooO.OooO00o("toString(...)");
        String strOooO00o2 = C24761OooO.OooO00o("toString(...)");
        PaperSpec.Companion companion = PaperSpec.INSTANCE;
        Note.Builder pages = new Note.Builder().setId(strOooO00o).setDefaultPageSpec(companion.getA4()).setDefaultPageTheme(paperTheme).setTitle(str3).setParentId(str4).setPages(com.facebook.soloader.OooOo.OooO0oO(new Page(strOooO00o2, strOooO00o, companion.getA4(), paperTheme.getOrientation(), paperTheme, null, null, null, false, 1, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520416, null)));
        o0000o0.f95398OooOo0o = null;
        o0000o0.f95397OooOo = null;
        o0000o0.f95400OooOoO0 = null;
        o0000o0.f95402OooOoo0 = 2;
        Object objOooO0OO = o000oo2.OooO0OO(pages, o0000o0);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }

    public final ArrayList OooOO0O(PdfInfo pdfInfo, ArrayList arrayList, String noteId) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        PdfiumCore pdfiumCore = new PdfiumCore(this.f95610OooOOo0);
        PdfDocument pdfDocumentNewDocument = pdfiumCore.newDocument(pdfInfo.getPdfPath(), pdfInfo.getPassword());
        List<PdfDocument.Bookmark> tableOfContents = pdfiumCore.getTableOfContents(pdfDocumentNewDocument);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(tableOfContents);
        ArrayList arrayList2 = new ArrayList();
        for (PdfDocument.Bookmark bookmark : tableOfContents) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(bookmark);
            C34431OooOo0.OooOo0o(arrayList2, OooOO0(bookmark, null, arrayList, noteId));
        }
        pdfiumCore.closeDocument(pdfDocumentNewDocument);
        return arrayList2;
    }

    public final ArrayList OooOO0o(PdfInfo pdfInfo, String str, boolean z) throws IOException {
        PdfiumCore pdfiumCore;
        PdfDocument pdfDocument;
        int i;
        int i2;
        String noteId = str;
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        ArrayList arrayList = new ArrayList();
        PdfiumCore pdfiumCore2 = new PdfiumCore(this.f95610OooOOo0);
        PdfDocument pdfDocumentNewDocument = pdfiumCore2.newDocument(pdfInfo.getPdfPath(), pdfInfo.getPassword());
        int pageCount = pdfiumCore2.getPageCount(pdfDocumentNewDocument);
        int i3 = 0;
        while (i3 < pageCount) {
            Size pageSize = pdfiumCore2.getPageSize(pdfDocumentNewDocument, i3);
            Integer numValueOf = Integer.valueOf(pageSize.getWidth());
            Integer numValueOf2 = Integer.valueOf(pageSize.getHeight());
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            if (iIntValue == 0 || iIntValue2 == 0) {
                pdfiumCore = pdfiumCore2;
                pdfDocument = pdfDocumentNewDocument;
                i = pageCount;
                i2 = i3;
            } else {
                PaperOrientation orientation = PaperOrientation.INSTANCE.getOrientation(iIntValue, iIntValue2);
                float height = (orientation == PaperOrientation.HORIZONTAL ? PaperSpec.INSTANCE.getA4().getHeight() : PaperSpec.INSTANCE.getA4().getWidth()) / iIntValue;
                int i4 = (int) (iIntValue * height);
                int i5 = (int) (iIntValue2 * height);
                PaperSpec paperSpec = new PaperSpec("PDF", "", false, Integer.min(i4, i5), Integer.max(i4, i5), null, null, 0, 0, 484, null);
                i2 = i3;
                i = pageCount;
                pdfiumCore = pdfiumCore2;
                pdfDocument = pdfDocumentNewDocument;
                arrayList.add(new Page(C24761OooO.OooO00o("toString(...)"), noteId, paperSpec, orientation, new PdfPaperTheme(null, pdfInfo, i3, orientation, null, null, 49, null), null, null, null, false, z ? 1 : 2, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520672, null));
            }
            i3 = i2 + 1;
            noteId = str;
            pageCount = i;
            pdfiumCore2 = pdfiumCore;
            pdfDocumentNewDocument = pdfDocument;
        }
        pdfiumCore2.closeDocument(pdfDocumentNewDocument);
        return arrayList;
    }
}
