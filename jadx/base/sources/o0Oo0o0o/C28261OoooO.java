package o0Oo0o0o;

import OooOoO.C20509OooO0oo;
import Oooo0oO.C21111o0ooOoO;
import OooooO0.C21289OooO0o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.MimeTypeFilter;
import androidx.core.net.UriKt;
import androidx.core.view.ViewCompat;
import com.aspose.slides.C22201OooO0oO;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.C27372Oooooo;
import o0oOo0o0.AbstractC30978OooO;
import o0oo000O.C31182OooO;
import o0oo000O.C31187OooO0o;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31192OooOOOo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Oo0o0o.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28261OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f100129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27372Oooooo f100130OooO0O0;

    /* JADX INFO: renamed from: o0Oo0o0o.OoooO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f100131OooO00o;

        static {
            int[] iArr = new int[Page.RotationDirection.values().length];
            try {
                iArr[Page.RotationDirection.CLOCKWISE_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100131OooO00o = iArr;
        }
    }

    public C28261OoooO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27372Oooooo c27372Oooooo) {
        this.f100129OooO00o = abstractApplicationC26277OooOoOO;
        this.f100130OooO0O0 = c27372Oooooo;
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
        C28265OoooOO0 c28265OoooOO0;
        String str2;
        File file;
        C28261OoooO c28261OoooO;
        C28265OoooOO0 c28265OoooOO02;
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
        C28265OoooOO0 c28265OoooOO03;
        String str3;
        Uri uri3;
        int i5;
        Iterator it2;
        File file2;
        AbstractC30978OooO abstractC30978OooO3;
        String str4;
        C28261OoooO c28261OoooO2;
        int i6;
        String title;
        ArrayList arrayList;
        Iterator<T> it3;
        EnumC32485OooO00o enumC32485OooO00o;
        Boolean boolValueOf;
        C32460OooOooO c32460OooOooO;
        if (abstractC32479OooO0OO instanceof C28265OoooOO0) {
            c28265OoooOO0 = (C28265OoooOO0) abstractC32479OooO0OO;
            int i7 = c28265OoooOO0.f100157Oooo0o0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c28265OoooOO0.f100157Oooo0o0 = i7 - Integer.MIN_VALUE;
            } else {
                c28265OoooOO0 = new C28265OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28265OoooOO0.f100155Oooo0O0;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = c28265OoooOO0.f100157Oooo0o0;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            File file3 = new File(this.f100129OooO00o.getCacheDir(), androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "pdf-export-"));
            C31190OooO0oo.OooO0o(file3);
            Set set4 = set;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(set4, 10));
            str2 = str;
            file = file3;
            c28261OoooO = this;
            c28265OoooOO02 = c28265OoooOO0;
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
            int i9 = c28265OoooOO0.f100151Oooo0;
            int i10 = c28265OoooOO0.f100154Oooo00o;
            int i11 = c28265OoooOO0.f100153Oooo00O;
            Collection collection4 = c28265OoooOO0.f100152Oooo000;
            String str5 = (String) c28265OoooOO0.f100150OooOooo;
            Iterator it4 = c28265OoooOO0.f100149OooOooO;
            Collection collection5 = c28265OoooOO0.f100147OooOoo;
            File file4 = c28265OoooOO0.f100148OooOoo0;
            String str6 = c28265OoooOO0.f100146OooOoOO;
            AbstractC30978OooO abstractC30978OooO4 = c28265OoooOO0.f100144OooOoO;
            Uri uri4 = c28265OoooOO0.f100145OooOoO0;
            Set set5 = c28265OoooOO0.f100142OooOo;
            C28261OoooO c28261OoooO3 = c28265OoooOO0.f100143OooOo0o;
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
            c28265OoooOO03 = c28265OoooOO0;
            i6 = i9;
            c28261OoooO2 = c28261OoooO3;
            Note note = (Note) objOooO00o;
            title = note.getTitle();
            EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o2;
            C34406OooO00o.f123390OooO00o.OooO00o("exportMultiNotes: noteTitle=" + title + ", directory=" + file2 + ", noteListener=" + abstractC30978OooO3 + ", noteId=" + str4, new Object[0]);
            List<Page> pages = note.getPages();
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            it3 = pages.iterator();
            while (it3.hasNext()) {
            }
            c28265OoooOO03.f100143OooOo0o = c28261OoooO2;
            c28265OoooOO03.f100142OooOo = set3;
            c28265OoooOO03.f100145OooOoO0 = uri3;
            c28265OoooOO03.f100144OooOoO = abstractC30978OooO3;
            c28265OoooOO03.f100146OooOoOO = str3;
            c28265OoooOO03.f100148OooOoo0 = file2;
            c28265OoooOO03.f100147OooOoo = collection2;
            c28265OoooOO03.f100149OooOooO = it2;
            c28265OoooOO03.f100150OooOooo = collection3;
            c28265OoooOO03.f100152Oooo000 = null;
            c28265OoooOO03.f100153Oooo00O = i5;
            c28265OoooOO03.f100154Oooo00o = i4;
            c28265OoooOO03.f100151Oooo0 = i6;
            c28265OoooOO03.f100157Oooo0o0 = 2;
            Uri uri5 = uri3;
            AbstractC30978OooO abstractC30978OooO5 = abstractC30978OooO3;
            Iterator it5 = it2;
            enumC32485OooO00o = enumC32485OooO00o3;
            if (c28261OoooO2.OooO0Oo(str4, arrayList, file2, title, i5, null, str3, c28265OoooOO03) != enumC32485OooO00o) {
            }
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = c28265OoooOO0.f100151Oooo0;
            int i13 = c28265OoooOO0.f100154Oooo00o;
            int i14 = c28265OoooOO0.f100153Oooo00O;
            Collection collection6 = (Collection) c28265OoooOO0.f100150OooOooo;
            Iterator it6 = c28265OoooOO0.f100149OooOooO;
            Collection collection7 = c28265OoooOO0.f100147OooOoo;
            File file5 = c28265OoooOO0.f100148OooOoo0;
            String str7 = c28265OoooOO0.f100146OooOoOO;
            abstractC30978OooO2 = c28265OoooOO0.f100144OooOoO;
            Uri uri6 = c28265OoooOO0.f100145OooOoO0;
            Set set6 = c28265OoooOO0.f100142OooOo;
            c28261OoooO = c28265OoooOO0.f100143OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c28265OoooOO02 = c28265OoooOO0;
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
                C27372Oooooo c27372Oooooo = c28261OoooO.f100130OooO0O0;
                c28265OoooOO02.f100143OooOo0o = c28261OoooO;
                Set set7 = set2;
                c28265OoooOO02.f100142OooOo = set7;
                c28265OoooOO02.f100145OooOoO0 = uri2;
                c28265OoooOO02.f100144OooOoO = abstractC30978OooO2;
                c28265OoooOO02.f100146OooOoOO = str2;
                c28265OoooOO02.f100148OooOoo0 = file;
                Collection collection8 = collection;
                c28265OoooOO02.f100147OooOoo = collection8;
                c28265OoooOO02.f100149OooOooO = it;
                c28265OoooOO02.f100150OooOooo = str8;
                c28265OoooOO02.f100152Oooo000 = collection8;
                c28265OoooOO02.f100153Oooo00O = i3;
                c28265OoooOO02.f100154Oooo00o = i4;
                c28265OoooOO02.f100151Oooo0 = i2;
                c28265OoooOO02.f100157Oooo0o0 = 1;
                objOooO00o = c27372Oooooo.OooO00o(i3, str8, c28265OoooOO02);
                if (objOooO00o == enumC32485OooO00o2) {
                    return enumC32485OooO00o2;
                }
                set3 = set7;
                collection2 = collection;
                uri3 = uri2;
                i6 = i2;
                c28265OoooOO03 = c28265OoooOO02;
                it2 = it;
                i5 = i3;
                c28261OoooO2 = c28261OoooO;
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
                c28265OoooOO03.f100143OooOo0o = c28261OoooO2;
                c28265OoooOO03.f100142OooOo = set3;
                c28265OoooOO03.f100145OooOoO0 = uri3;
                c28265OoooOO03.f100144OooOoO = abstractC30978OooO3;
                c28265OoooOO03.f100146OooOoOO = str3;
                c28265OoooOO03.f100148OooOoo0 = file2;
                c28265OoooOO03.f100147OooOoo = collection2;
                c28265OoooOO03.f100149OooOooO = it2;
                c28265OoooOO03.f100150OooOooo = collection3;
                c28265OoooOO03.f100152Oooo000 = null;
                c28265OoooOO03.f100153Oooo00O = i5;
                c28265OoooOO03.f100154Oooo00o = i4;
                c28265OoooOO03.f100151Oooo0 = i6;
                c28265OoooOO03.f100157Oooo0o0 = 2;
                Uri uri52 = uri3;
                AbstractC30978OooO abstractC30978OooO52 = abstractC30978OooO3;
                Iterator it52 = it2;
                enumC32485OooO00o = enumC32485OooO00o32;
                if (c28261OoooO2.OooO0Oo(str4, arrayList, file2, title, i5, null, str3, c28265OoooOO03) != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C28261OoooO c28261OoooO4 = c28261OoooO2;
                i12 = i6;
                uri2 = uri52;
                file5 = file2;
                c28261OoooO = c28261OoooO4;
                abstractC30978OooO2 = abstractC30978OooO52;
                c28265OoooOO02 = c28265OoooOO03;
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
                        C32501OooO0oO.OooO0Oo(file);
                        return Boolean.FALSE;
                    }
                    OutputStream outputStreamOpenOutputStream = c28261OoooO.f100129OooO00o.getContentResolver().openOutputStream(uri2);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Set set, File file, String str, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        o000oOoO o000oooo2;
        C28261OoooO c28261OoooO;
        Object objOooO0o0;
        File file2;
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i2 = o000oooo2.f100262OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000oooo2.f100262OooOoO = i2 - Integer.MIN_VALUE;
                c28261OoooO = this;
            } else {
                c28261OoooO = this;
                o000oooo2 = new o000oOoO(c28261OoooO, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oooo2.f100260OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o000oooo2.f100262OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sb = new StringBuilder("exportNotes: noteIds=");
            sb.append(set);
            sb.append(", outputDir=");
            sb.append(file);
            sb.append(", fileName=");
            OooOO0.OooO0O0.OooO0Oo(i, str, ", flag=", ", listener=", sb);
            sb.append(abstractC30978OooO);
            c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
            File file3 = new File(file, C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str).toString(), ".zip"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            o000oooo2.f100261OooOo0o = file3;
            o000oooo2.f100262OooOoO = 1;
            c20358OooO00o.OooO00o("exportNotes: noteIds=" + set + ", outputUri=" + uriFromFile + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            if (set.isEmpty()) {
                c20358OooO00o.OooO0OO("exportNotes: noteIds is empty", new Object[0]);
                obj = Boolean.FALSE;
            } else {
                if (set.size() > 1) {
                    objOooO0o0 = c28261OoooO.OooO00o(set, uriFromFile, i, abstractC30978OooO, str2, o000oooo2);
                } else {
                    objOooO0o0 = OooO0o0((String) oOo000Oo.OooOo.Oooo0o(set), uriFromFile, i, abstractC30978OooO, str2, o000oooo2);
                }
                obj = objOooO0o0;
            }
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file2 = file3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = o000oooo2.f100261OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return file2;
        }
        C34406OooO00o.f123390OooO00o.OooO0OO("exportNotes: export failed", new Object[0]);
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(6:12|49|(3:52|(17:54|(1:56)(1:57)|58|(3:60|(2:64|65)|72)(3:67|(2:73|65)|72)|66|74|(1:76)(1:77)|78|(1:80)(20:81|(2:83|(2:85|(2:87|(1:89)(3:208|90|91))(1:92))(1:93))(1:94)|95|204|96|97|202|98|99|200|100|(1:104)|105|(5:122|(1:124)(3:194|127|(1:129)(7:132|133|198|134|(1:136)|126|140))|125|126|140)(1:141)|142|(1:144)|145|(1:147)|(2:149|209)(1:210)|150)|120|(0)(0)|142|(0)|145|(0)|(0)(0)|150)(3:207|151|152)|50)|206|153|(2:155|156)(3:157|(1:159)(1:160)|(2:162|163)(4:164|(2:166|(3:184|168|169)(1:177))(2:178|(1:180)(1:181))|182|183)))(2:13|14))(4:15|196|16|17))(8:21|192|22|23|190|24|(1:27)|47)|186|28|29|38|(1:40)|41|(2:43|44)(3:45|(6:48|49|(1:50)|206|153|(0)(0))|47)|(2:(0)|(1:189))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0107, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        r6 = r9;
        r9 = r3;
        r3 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x043d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, List list, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C28267OoooOOo c28267OoooOOo;
        File file;
        String str3;
        C28261OoooO c28261OoooO;
        List list2;
        File file2;
        String str4;
        int i2;
        AbstractC30978OooO abstractC30978OooO2;
        Object objOooO00o;
        Uri uri2;
        String str5;
        Note note;
        Note note2;
        C28261OoooO c28261OoooO2;
        ArrayList arrayList;
        Iterator it;
        Boolean boolValueOf;
        Page page;
        RectF rectF;
        float f;
        float fMax;
        float f2;
        float f3;
        Bitmap bitmap;
        int i3;
        Bitmap bitmapCreateBitmap;
        String str6;
        File file3;
        Bitmap bitmapDecodeResource;
        String str7 = str;
        List list3 = list;
        Uri uri3 = uri;
        int i4 = i;
        AbstractC30978OooO abstractC30978OooO3 = abstractC30978OooO;
        if (abstractC32479OooO0OO instanceof C28267OoooOOo) {
            c28267OoooOOo = (C28267OoooOOo) abstractC32479OooO0OO;
            int i5 = c28267OoooOOo.f100172Oooo00O;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c28267OoooOOo.f100172Oooo00O = i5 - Integer.MIN_VALUE;
            } else {
                c28267OoooOOo = new C28267OoooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o2 = c28267OoooOOo.f100170OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i6 = c28267OoooOOo.f100172Oooo00O;
        Boolean bool = null;
        if (i6 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o2);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str7 + ", pageIds=" + list3 + ", outputUri=" + uri3 + ",flag=" + i4 + ", listener=" + abstractC30978OooO3, new Object[0]);
            file = new File(this.f100129OooO00o.getCacheDir(), androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "image-export-"));
            C31190OooO0oo.OooO0o(file);
            C31190OooO0oo.OooOO0O(file, new C31187OooO0o());
            try {
                C27372Oooooo c27372Oooooo = this.f100130OooO0O0;
                c28267OoooOOo.f100163OooOo0o = this;
                c28267OoooOOo.f100162OooOo = str7;
                c28267OoooOOo.f100165OooOoO0 = list3;
                c28267OoooOOo.f100164OooOoO = uri3;
                c28267OoooOOo.f100166OooOoOO = abstractC30978OooO3;
                str3 = str2;
                try {
                    c28267OoooOOo.f100168OooOoo0 = str3;
                    c28267OoooOOo.f100167OooOoo = file;
                    c28267OoooOOo.f100169OooOooO = i4;
                    c28267OoooOOo.f100172Oooo00O = 1;
                    objOooO00o2 = c27372Oooooo.OooO00o(i4, str7, c28267OoooOOo);
                    if (objOooO00o2 != enumC32485OooO00o) {
                        list2 = list3;
                        file2 = file;
                        c28261OoooO = this;
                        str4 = str7;
                        i2 = i4;
                        abstractC30978OooO2 = abstractC30978OooO3;
                    }
                } catch (Throwable th) {
                    th = th;
                    c28261OoooO = this;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    File file4 = file;
                    list2 = list3;
                    file2 = file4;
                    str4 = str7;
                    i2 = i4;
                    abstractC30978OooO2 = abstractC30978OooO3;
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = str2;
            }
            return enumC32485OooO00o;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            note2 = (Note) c28267OoooOOo.f100168OooOoo0;
            file2 = (File) c28267OoooOOo.f100166OooOoOO;
            str5 = (String) c28267OoooOOo.f100164OooOoO;
            abstractC30978OooO2 = (AbstractC30978OooO) c28267OoooOOo.f100165OooOoO0;
            uri2 = (Uri) c28267OoooOOo.f100162OooOo;
            c28261OoooO2 = c28267OoooOOo.f100163OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o2);
            List list4 = (List) objOooO00o2;
            arrayList = new ArrayList();
            it = list4.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                Page page2 = (Page) next;
                c28261OoooO2.getClass();
                if (page2.getUnbounded()) {
                    rectF = C31192OooOOOo.OooO0O0(page2, Float.valueOf(100.0f));
                    page = page2;
                } else {
                    C32443OooOOO<Integer, Integer> unrotatedPageSize = page2.getUnrotatedPageSize();
                    page = page2;
                    rectF = new RectF(0.0f, 0.0f, unrotatedPageSize.f116638OooOo0o.intValue(), unrotatedPageSize.f116637OooOo.intValue());
                }
                float fWidth = rectF.width();
                float fHeight = rectF.height();
                if (page.getUnbounded()) {
                    f = 4096.0f;
                    if (fWidth > 4096.0f || fHeight > 4096.0f) {
                        fMax = Math.max(fWidth, fHeight);
                        f2 = f / fMax;
                    }
                    f2 = 1.0f;
                } else {
                    f = 3600.0f;
                    if (fWidth > 3600.0f || fHeight > 3600.0f) {
                        fMax = Math.max(fWidth, fHeight);
                        f2 = f / fMax;
                    }
                    f2 = 1.0f;
                }
                RectF rectFOooO0Oo = o00OO0O0.OooO0O0.OooO0Oo(rectF, 0.0f, 0.0f, f2);
                Float f4 = new Float(-rectFOooO0Oo.left);
                Float f5 = new Float(-rectFOooO0Oo.top);
                float fFloatValue = f4.floatValue();
                float fFloatValue2 = f5.floatValue();
                Note note3 = note2;
                Float f6 = new Float(rectFOooO0Oo.width());
                Float f7 = new Float(rectFOooO0Oo.height());
                float fFloatValue3 = f6.floatValue();
                float fFloatValue4 = f7.floatValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                List list5 = list4;
                Iterator it2 = it;
                StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("exportPages: page size: ", fFloatValue3, " x ", fFloatValue4, ", offset: ");
                sbOooO0Oo.append(fFloatValue);
                sbOooO0Oo.append(" x ");
                sbOooO0Oo.append(fFloatValue2);
                sbOooO0Oo.append(", scale: ");
                sbOooO0Oo.append(f2);
                c20358OooO00o.OooO00o(sbOooO0Oo.toString(), new Object[0]);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(C21289OooO0o.OooO0O0(fFloatValue3), C21289OooO0o.OooO0O0(fFloatValue4), Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
                AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c28261OoooO2.f100129OooO00o;
                C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, abstractApplicationC26277OooOoOO, fFloatValue, fFloatValue2, 0);
                c26120OooO0Oo.OooOo00(c26121OooO0o0);
                Float f8 = page.getUnbounded() ? new Float(100.0f) : null;
                c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "ImageExporter", "Export image watermark: ", str5, "."), new Object[0]);
                Page page3 = page;
                page3.drawPage(c26120OooO0Oo, c26121OooO0o0, abstractApplicationC26277OooOoOO, 223, f8);
                Page.RotationDirection rotationDirection = page3.getRotationDirection();
                if (rotationDirection == Page.RotationDirection.ROTATION_0) {
                    bitmap = bitmapCreateBitmap2;
                    i3 = 0;
                } else {
                    Matrix matrix = new Matrix();
                    int i9 = OooO00o.f100131OooO00o[rotationDirection.ordinal()];
                    if (i9 == 1) {
                        f3 = 90.0f;
                    } else if (i9 == 2) {
                        f3 = 180.0f;
                    } else if (i9 == 3) {
                        f3 = 270.0f;
                    } else {
                        if (i9 != 4) {
                            throw new C32442OooOO0o();
                        }
                        f3 = 0.0f;
                    }
                    matrix.postRotate(f3);
                    try {
                        try {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), matrix, true);
                            bitmap = bitmapCreateBitmap2;
                            try {
                                kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                                if (!bitmapCreateBitmap.equals(bitmap) && !bitmap.isRecycled()) {
                                    bitmap.recycle();
                                }
                                i3 = 0;
                            } catch (Exception e) {
                                e = e;
                                i3 = 0;
                                C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Failed to rotate bitmap, using original bitmap", new Object[0]);
                                bitmapCreateBitmap = bitmap;
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                i3 = 0;
                                C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Out of memory when rotating bitmap, using original bitmap", new Object[0]);
                                bitmapCreateBitmap = bitmap;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bitmap = bitmapCreateBitmap2;
                        } catch (OutOfMemoryError e4) {
                            e = e4;
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        bitmap = bitmapCreateBitmap2;
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        bitmap = bitmapCreateBitmap2;
                    }
                    if (str5 == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("ImageExporter");
                        c20358OooO00o2.OooO0o0("Drawing watermark: ".concat(str5), new Object[i3]);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float width = bitmapCreateBitmap.getWidth();
                        float height = bitmapCreateBitmap.getHeight();
                        if (str5.length() > 0) {
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setTextSize(16.0f);
                            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
                            paint.setTypeface(Typeface.DEFAULT);
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas2.drawText(str5, width - 24.0f, (height - 24.0f) - paint.getFontMetrics().bottom, paint);
                        } else {
                            try {
                                bitmapDecodeResource = BitmapFactory.decodeResource(abstractApplicationC26277OooOoOO.getResources(), R.drawable.ic_notein_watermark);
                            } catch (Exception e7) {
                                e = e7;
                                str6 = str5;
                            }
                            if (bitmapDecodeResource == null) {
                                c20358OooO00o2.OooO0OO("Failed to load watermark image resource", new Object[0]);
                            } else {
                                Paint paint2 = new Paint();
                                paint2.setAntiAlias(true);
                                paint2.setFilterBitmap(true);
                                float f9 = 225;
                                float f10 = (width - f9) - 24.0f;
                                float f11 = 48;
                                float f12 = (height - f11) - 24.0f;
                                str6 = str5;
                                try {
                                    canvas2.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), new Rect((int) f10, (int) f12, (int) (f10 + f9), (int) (f12 + f11)), paint2);
                                    if (!bitmapDecodeResource.isRecycled()) {
                                        bitmapDecodeResource.recycle();
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Failed to draw image watermark", new Object[0]);
                                }
                                canvas2.setBitmap(null);
                            }
                        }
                        str6 = str5;
                        canvas2.setBitmap(null);
                    } else {
                        str6 = str5;
                    }
                    file3 = new File(file2, note3.getTitle() + C18115b5.CONNECTOR + i7 + ".jpg");
                    if (C31182OooO.OooO0OO(bitmapCreateBitmap, file3, Bitmap.CompressFormat.JPEG, 80)) {
                        arrayList.add(file3);
                    }
                    if (!bitmapCreateBitmap.isRecycled()) {
                        bitmapCreateBitmap.recycle();
                    }
                    if (abstractC30978OooO2 == null) {
                        abstractC30978OooO2.OooO00o((i7 + 1.0f) / list5.size());
                    }
                    str5 = str6;
                    note2 = note3;
                    list4 = list5;
                    it = it2;
                    i7 = i8;
                    bool = null;
                }
                bitmapCreateBitmap = bitmap;
                if (str5 == null) {
                }
                file3 = new File(file2, note3.getTitle() + C18115b5.CONNECTOR + i7 + ".jpg");
                if (C31182OooO.OooO0OO(bitmapCreateBitmap, file3, Bitmap.CompressFormat.JPEG, 80)) {
                }
                if (!bitmapCreateBitmap.isRecycled()) {
                }
                if (abstractC30978OooO2 == null) {
                }
                str5 = str6;
                note2 = note3;
                list4 = list5;
                it = it2;
                i7 = i8;
                bool = null;
            }
            Boolean bool2 = bool;
            if (!arrayList.isEmpty()) {
                C34406OooO00o.f123390OooO00o.OooO0OO("exportPages: No bitmap files generated", new Object[0]);
                C32501OooO0oO.OooO0Oo(file2);
                return Boolean.FALSE;
            }
            String type = kotlin.jvm.internal.OooOOO0.OooO0O0(uri2.getScheme(), FirebaseAnalytics.Param.CONTENT) ? c28261OoooO2.f100129OooO00o.getContentResolver().getType(uri2) : MimeTypeMap.getSingleton().getMimeTypeFromExtension(C32501OooO0oO.OooO0o0(UriKt.toFile(uri2)));
            if (type == null) {
                C34406OooO00o.f123390OooO00o.OooO0OO("exportPages: outputMimeType is null", new Object[0]);
                return Boolean.FALSE;
            }
            if (MimeTypeFilter.matches(type, "application/zip")) {
                OutputStream outputStreamOpenOutputStream = c28261OoooO2.f100129OooO00o.getContentResolver().openOutputStream(uri2);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        boolValueOf = Boolean.valueOf(C31193OooOOo.OooO0oO(arrayList, outputStreamOpenOutputStream));
                        outputStreamOpenOutputStream.close();
                    } finally {
                    }
                } else {
                    boolValueOf = bool2;
                }
            } else {
                boolValueOf = MimeTypeFilter.matches(type, "image/*") ? Boolean.valueOf(C31190OooO0oo.OooO0OO(c28261OoooO2.f100129OooO00o, (File) arrayList.get(0), uri2)) : Boolean.FALSE;
            }
            C32501OooO0oO.OooO0Oo(file2);
            return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, Boolean.TRUE));
        }
        i2 = c28267OoooOOo.f100169OooOooO;
        file2 = c28267OoooOOo.f100167OooOoo;
        String str8 = (String) c28267OoooOOo.f100168OooOoo0;
        abstractC30978OooO2 = (AbstractC30978OooO) c28267OoooOOo.f100166OooOoOO;
        Uri uri4 = (Uri) c28267OoooOOo.f100164OooOoO;
        list2 = (List) c28267OoooOOo.f100165OooOoO0;
        str4 = (String) c28267OoooOOo.f100162OooOo;
        c28261OoooO = c28267OoooOOo.f100163OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO00o2);
            str3 = str8;
            uri3 = uri4;
        } catch (Throwable th3) {
            th = th3;
            file = file2;
            list3 = list2;
            str3 = str8;
            uri3 = uri4;
            abstractC30978OooO3 = abstractC30978OooO2;
            i4 = i2;
            str7 = str4;
            objOooO00o = C32446OooOOOo.OooO00o(th);
            File file42 = file;
            list2 = list3;
            file2 = file42;
            str4 = str7;
            i2 = i4;
            abstractC30978OooO2 = abstractC30978OooO3;
            uri2 = uri3;
            str5 = str3;
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            }
            note = (Note) objOooO00o;
            if (note != null) {
            }
        }
        objOooO00o = (Note) objOooO00o2;
        uri2 = uri3;
        str5 = str3;
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = null;
        }
        note = (Note) objOooO00o;
        if (note != null) {
            return Boolean.FALSE;
        }
        C27372Oooooo c27372Oooooo2 = c28261OoooO.f100130OooO0O0;
        c28267OoooOOo.f100163OooOo0o = c28261OoooO;
        c28267OoooOOo.f100162OooOo = uri2;
        c28267OoooOOo.f100165OooOoO0 = abstractC30978OooO2;
        c28267OoooOOo.f100164OooOoO = str5;
        c28267OoooOOo.f100166OooOoOO = file2;
        c28267OoooOOo.f100168OooOoo0 = note;
        c28267OoooOOo.f100167OooOoo = null;
        c28267OoooOOo.f100172Oooo00O = 2;
        Object objOooO0O0 = c27372Oooooo2.OooO0O0(i2, str4, list2, c28267OoooOOo);
        if (objOooO0O0 != enumC32485OooO00o) {
            note2 = note;
            objOooO00o2 = objOooO0O0;
            c28261OoooO2 = c28261OoooO;
            List list42 = (List) objOooO00o2;
            arrayList = new ArrayList();
            it = list42.iterator();
            int i72 = 0;
            while (it.hasNext()) {
            }
            Boolean bool22 = bool;
            if (!arrayList.isEmpty()) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, List list, File file, String str2, int i, AbstractC30978OooO abstractC30978OooO, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C28266OoooOOO c28266OoooOOO;
        File file2;
        if (abstractC32479OooO0OO instanceof C28266OoooOOO) {
            c28266OoooOOO = (C28266OoooOOO) abstractC32479OooO0OO;
            int i2 = c28266OoooOOO.f100160OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28266OoooOOO.f100160OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c28266OoooOOO = new C28266OoooOOO(this, abstractC32479OooO0OO);
            }
        }
        C28266OoooOOO c28266OoooOOO2 = c28266OoooOOO;
        Object obj = c28266OoooOOO2.f100158OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28266OoooOOO2.f100160OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o("exportPages: noteId=" + str + ",pageIds=" + list + ",outputDir=" + file + ", fileName=" + str2 + ", flag=" + i + ", listener=" + abstractC30978OooO, new Object[0]);
            File file3 = new File(file, list.size() == 1 ? C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str2).toString(), ".jpg"))) : C31190OooO0oo.OooOOo0(new File(file, C21111o0ooOoO.OooO0Oo(C33599OooOo0O.Oooooo0(str2).toString(), ".zip"))));
            C31190OooO0oo.OooO0oO(file3);
            Uri uriFromFile = Uri.fromFile(file3);
            c28266OoooOOO2.f100159OooOo0o = file3;
            c28266OoooOOO2.f100160OooOoO = 1;
            Object objOooO0OO = OooO0OO(str, list, uriFromFile, i, abstractC30978OooO, str3, c28266OoooOOO2);
            if (objOooO0OO == obj2) {
                return obj2;
            }
            file2 = file3;
            obj = objOooO0OO;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file2 = c28266OoooOOO2.f100159OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return file2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, Uri uri, int i, AbstractC30978OooO abstractC30978OooO, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28268OoooOo0 c28268OoooOo0;
        C28261OoooO c28261OoooO;
        if (abstractC32479OooO0OO instanceof C28268OoooOo0) {
            c28268OoooOo0 = (C28268OoooOo0) abstractC32479OooO0OO;
            int i2 = c28268OoooOo0.f100180OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28268OoooOo0.f100180OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                c28268OoooOo0 = new C28268OoooOo0(this, abstractC32479OooO0OO);
            }
        }
        C28268OoooOo0 c28268OoooOo02 = c28268OoooOo0;
        Object objOooO00o = c28268OoooOo02.f100179OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28268OoooOo02.f100180OooOooO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C34406OooO00o.f123390OooO00o.OooO00o("exportSingleNote: outputUri=" + uri + ", noteListener=" + abstractC30978OooO + ", noteId=" + str, new Object[0]);
            c28268OoooOo02.f100174OooOo0o = this;
            c28268OoooOo02.f100173OooOo = uri;
            c28268OoooOo02.f100176OooOoO0 = abstractC30978OooO;
            c28268OoooOo02.f100175OooOoO = str2;
            c28268OoooOo02.f100177OooOoOO = i;
            c28268OoooOo02.f100180OooOooO = 1;
            objOooO00o = this.f100130OooO0O0.OooO00o(i, str, c28268OoooOo02);
            if (objOooO00o != enumC32485OooO00o) {
                c28261OoooO = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return objOooO00o;
        }
        i = c28268OoooOo02.f100177OooOoOO;
        str2 = c28268OoooOo02.f100175OooOoO;
        abstractC30978OooO = c28268OoooOo02.f100176OooOoO0;
        uri = c28268OoooOo02.f100173OooOo;
        C28261OoooO c28261OoooO2 = c28268OoooOo02.f100174OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        c28261OoooO = c28261OoooO2;
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
        c28268OoooOo02.f100174OooOo0o = null;
        c28268OoooOo02.f100173OooOo = null;
        c28268OoooOo02.f100176OooOoO0 = null;
        c28268OoooOo02.f100175OooOoO = null;
        c28268OoooOo02.f100180OooOooO = 2;
        Object objOooO0OO = c28261OoooO.OooO0OO(id, arrayList, uri2, i4, abstractC30978OooO2, str3, c28268OoooOo02);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
