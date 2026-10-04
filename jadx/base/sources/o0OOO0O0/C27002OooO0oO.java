package o0OOO0O0;

import Oooo0oO.o0Oo0oo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o000oooo.C24761OooO;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0Oo00oO.C28036OooO0O0;
import o0OoO0oo.C28692OooO0oo;
import o0oo000O.C31182OooO;
import o0oo000O.C31187OooO0o;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oo0oO0.InterfaceC34703OooO0OO;

/* JADX INFO: renamed from: o0OOO0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27002OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f93948OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34703OooO0OO f93949OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33898OooO0Oo f93950OooO0OO;

    public C27002OooO0oO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC34703OooO0OO dao) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
        this.f93948OooO00o = abstractApplicationC26277OooOoOO;
        this.f93949OooO0O0 = dao;
        this.f93950OooO0OO = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r5.OooO0OO(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27002OooO0oO c27002OooO0oO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        c27002OooO0oO.getClass();
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f93919OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f93919OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(c27002OooO0oO, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = oooO0O0.f93918OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f93919OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooO0O0.f93916OooOo0o = c27002OooO0oO;
            oooO0O0.f93915OooOo = str;
            oooO0O0.f93919OooOoOO = 1;
            objOooO0OO = c27002OooO0oO.OooO0OO(str);
            if (objOooO0OO != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0OO);
            return C32460OooOooO.f116667OooO00o;
        }
        str = oooO0O0.f93915OooOo;
        c27002OooO0oO = oooO0O0.f93916OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        File file = (File) objOooO0OO;
        if (file.exists()) {
            C32501OooO0oO.OooO0Oo(file);
        }
        InterfaceC34703OooO0OO interfaceC34703OooO0OO = c27002OooO0oO.f93949OooO0O0;
        oooO0O0.f93916OooOo0o = null;
        oooO0O0.f93915OooOo = null;
        oooO0O0.f93919OooOoOO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C27002OooO0oO c27002OooO0oO, String str, AiOcrSessionInputSource aiOcrSessionInputSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27001OooO0o0 c27001OooO0o0;
        c27002OooO0oO.getClass();
        if (abstractC32479OooO0OO instanceof C27001OooO0o0) {
            c27001OooO0o0 = (C27001OooO0o0) abstractC32479OooO0OO;
            int i = c27001OooO0o0.f93947OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27001OooO0o0.f93947OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27001OooO0o0 = new C27001OooO0o0(c27002OooO0oO, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27001OooO0o0.f93946OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27001OooO0o0.f93947OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27001OooO0o0.f93944OooOo0o = c27002OooO0oO;
            c27001OooO0o0.f93943OooOo = aiOcrSessionInputSource;
            c27001OooO0o0.f93947OooOoOO = 1;
            objOooO0OO = c27002OooO0oO.OooO0OO(str);
            if (objOooO0OO != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0OO);
            return objOooO0OO;
        }
        aiOcrSessionInputSource = c27001OooO0o0.f93943OooOo;
        c27002OooO0oO = c27001OooO0o0.f93944OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        AiOcrSessionInputSource aiOcrSessionInputSource2 = aiOcrSessionInputSource;
        File file = new File((File) objOooO0OO, "data_source");
        C31190OooO0oo.OooO0o(file);
        C31190OooO0oo.OooOO0O(file, new C31187OooO0o());
        if (aiOcrSessionInputSource2.getSourceType() == 0) {
            c27001OooO0o0.f93944OooOo0o = null;
            c27001OooO0o0.f93943OooOo = null;
            c27001OooO0o0.f93947OooOoOO = 2;
            Object objOooO0o0 = c27002OooO0oO.OooO0o0(file, aiOcrSessionInputSource2, c27001OooO0o0);
            return objOooO0o0 == obj ? obj : objOooO0o0;
        }
        c27002OooO0oO.getClass();
        List<String> sourceUris = aiOcrSessionInputSource2.getSourceUris();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sourceUris.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse((String) it.next());
            kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27002OooO0oO.f93948OooO00o;
            String strOooO0OO = C28692OooO0oo.OooO0OO(abstractApplicationC26277OooOoOO, uri);
            File file2 = new File(file, strOooO0OO);
            if (file2.exists()) {
                file2 = new File(file, UUID.randomUUID() + C18115b5.CONNECTOR + strOooO0OO);
            }
            Uri uriForFile = C31190OooO0oo.OooO0O0(abstractApplicationC26277OooOoOO, uri, file2) ? FileProvider.getUriForFile(abstractApplicationC26277OooOoOO, C28036OooO0O0.OooO0O0(abstractApplicationC26277OooOoOO), file2) : null;
            if (uriForFile != null) {
                arrayList.add(uriForFile);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String string = ((Uri) it2.next()).toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            arrayList2.add(string);
        }
        return AiOcrSessionInputSource.copy$default(aiOcrSessionInputSource2, null, 0, arrayList2, null, 11, null);
    }

    public final File OooO0OO(String str) {
        File file = new File(o0Oo0oo.OooO0Oo(this.f93948OooO00o.getFilesDir().getAbsolutePath(), "/text_recognize_sessions/", str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final Boolean OooO0Oo(Uri uri, File file) {
        boolean zOooO0O0;
        Boolean boolValueOf;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f93948OooO00o;
        int iOooO00o = C31182OooO.OooO00o(abstractApplicationC26277OooOoOO, uri);
        try {
            InputStream inputStreamOpenInputStream = abstractApplicationC26277OooOoOO.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    if (iOooO00o != 0) {
                        zOooO0O0 = C31182OooO.OooO0OO(C31182OooO.OooO0O0(iOooO00o, BitmapFactory.decodeStream(inputStreamOpenInputStream)), C31190OooO0oo.OooOOO0(file.getAbsolutePath()), Bitmap.CompressFormat.JPEG, 100);
                    } else {
                        zOooO0O0 = C31190OooO0oo.OooO0O0(abstractApplicationC26277OooOoOO, uri, file);
                    }
                    boolValueOf = Boolean.valueOf(zOooO0O0);
                    inputStreamOpenInputStream.close();
                } finally {
                }
            } else {
                boolValueOf = null;
            }
            return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextRecognizeSessionLocalDataSource");
            c20358OooO00o.OooO0OO("copyFileFromUri: Exception: %s", e.getMessage());
            return Boolean.valueOf(C31190OooO0oo.OooO0O0(abstractApplicationC26277OooOoOO, uri, file));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        C27002OooO0oO c27002OooO0oO;
        File file;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f93942OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f93942OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = oooO0o.f93941OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f93942OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooO0o.f93939OooOo0o = this;
            oooO0o.f93938OooOo = uri;
            oooO0o.f93942OooOoOO = 1;
            objOooO0OO = OooO0OO(str);
            if (objOooO0OO != obj) {
                c27002OooO0oO = this;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) oooO0o.f93939OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            if (((Boolean) objOooO0OO).booleanValue()) {
                return null;
            }
            return file;
        }
        uri = oooO0o.f93938OooOo;
        c27002OooO0oO = (C27002OooO0oO) oooO0o.f93939OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        File file2 = (File) objOooO0OO;
        if (file2.exists()) {
            File file3 = new File(file2, C24761OooO.OooO00o("toString(...)").concat(".jpg"));
            oooO0o.f93939OooOo0o = file3;
            oooO0o.f93938OooOo = null;
            oooO0o.f93942OooOoOO = 2;
            objOooO0OO = c27002OooO0oO.OooO0Oo(uri, file3);
            if (objOooO0OO != obj) {
                file = file3;
                if (((Boolean) objOooO0OO).booleanValue()) {
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c1 -> B:26:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(File file, AiOcrSessionInputSource aiOcrSessionInputSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        C27002OooO0oO c27002OooO0oO;
        Iterator it;
        C27002OooO0oO c27002OooO0oO2;
        Collection collection;
        int i;
        File file2;
        AiOcrSessionInputSource aiOcrSessionInputSource2;
        Uri uriForFile;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i2 = oooO0OO.f93929Oooo000;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f93929Oooo000 = i2 - Integer.MIN_VALUE;
                c27002OooO0oO = this;
            } else {
                c27002OooO0oO = this;
                oooO0OO = new OooO0OO(c27002OooO0oO, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0OO.f93927OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooO0OO.f93929Oooo000;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<String> sourceUris = aiOcrSessionInputSource.getSourceUris();
            ArrayList arrayList = new ArrayList();
            it = sourceUris.iterator();
            c27002OooO0oO2 = c27002OooO0oO;
            collection = arrayList;
            i = 0;
            file2 = file;
            aiOcrSessionInputSource2 = aiOcrSessionInputSource;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = oooO0OO.f93925OooOoo;
            File file3 = oooO0OO.f93926OooOoo0;
            it = oooO0OO.f93924OooOoOO;
            collection = oooO0OO.f93922OooOoO;
            AiOcrSessionInputSource aiOcrSessionInputSource3 = oooO0OO.f93923OooOoO0;
            File file4 = oooO0OO.f93920OooOo;
            c27002OooO0oO2 = oooO0OO.f93921OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                uriForFile = null;
            } else {
                AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27002OooO0oO2.f93948OooO00o;
                uriForFile = FileProvider.getUriForFile(abstractApplicationC26277OooOoOO, C28036OooO0O0.OooO0O0(abstractApplicationC26277OooOoOO), file3);
            }
            if (uriForFile != null) {
                collection.add(uriForFile);
            }
            aiOcrSessionInputSource2 = aiOcrSessionInputSource3;
            file2 = file4;
            if (it.hasNext()) {
                Object next = it.next();
                int i4 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                Uri uri = Uri.parse((String) next);
                AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = c27002OooO0oO2.f93948OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
                String strOooO0OO = C28692OooO0oo.OooO0OO(abstractApplicationC26277OooOoOO2, uri);
                File file5 = new File(file2, strOooO0OO);
                if (file5.exists()) {
                    file5 = new File(file2, UUID.randomUUID() + C18115b5.CONNECTOR + strOooO0OO);
                }
                oooO0OO.f93921OooOo0o = c27002OooO0oO2;
                oooO0OO.f93920OooOo = file2;
                oooO0OO.f93923OooOoO0 = aiOcrSessionInputSource2;
                oooO0OO.f93922OooOoO = collection;
                oooO0OO.f93924OooOoOO = it;
                oooO0OO.f93926OooOoo0 = file5;
                oooO0OO.f93925OooOoo = i4;
                oooO0OO.f93929Oooo000 = 1;
                Boolean boolOooO0Oo = c27002OooO0oO2.OooO0Oo(uri, file5);
                if (boolOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                file4 = file2;
                obj = boolOooO0Oo;
                i = i4;
                aiOcrSessionInputSource3 = aiOcrSessionInputSource2;
                file3 = file5;
                if (((Boolean) obj).booleanValue()) {
                }
                if (uriForFile != null) {
                }
                aiOcrSessionInputSource2 = aiOcrSessionInputSource3;
                file2 = file4;
                if (it.hasNext()) {
                    List list = (List) collection;
                    if (list.isEmpty()) {
                        return null;
                    }
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String string = ((Uri) it2.next()).toString();
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                        arrayList2.add(string);
                    }
                    return AiOcrSessionInputSource.copy$default(aiOcrSessionInputSource2, null, 0, arrayList2, null, 11, null);
                }
            }
        }
    }
}
