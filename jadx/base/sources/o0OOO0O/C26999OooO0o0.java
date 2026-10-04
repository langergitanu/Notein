package o0OOO0O;

import com.google.firebase.Firebase;
import com.google.firebase.storage.StorageKt;
import com.google.firebase.storage.StorageReference;
import com.orion.notein.domain.models.papertheme.ThemeUtils;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.Oooo000;
import o0OOo0o.C27520o00o00o;
import o0OoOOO0.C29056OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOO0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26999OooO0o0 implements Oooo000 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c4 -> B:34:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(C26999OooO0o0 c26999OooO0o0, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26998OooO0Oo c26998OooO0Oo;
        PdfiumCore pdfiumCore;
        C26999OooO0o0 c26999OooO0o02;
        Iterator it;
        c26999OooO0o0.getClass();
        if (abstractC32479OooO0OO instanceof C26998OooO0Oo) {
            c26998OooO0Oo = (C26998OooO0Oo) abstractC32479OooO0OO;
            int i = c26998OooO0Oo.f93907OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26998OooO0Oo.f93907OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26998OooO0Oo = new C26998OooO0Oo(c26999OooO0o0, abstractC32479OooO0OO);
            }
        }
        Object obj = c26998OooO0Oo.f93904OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26998OooO0Oo.f93907OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            File[] fileArrListFiles = ThemeUtils.INSTANCE.getThemeDownloadDir(abstractApplicationC26277OooOoOO).listFiles();
            if (fileArrListFiles == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                OooOOO0.OooO0o(name, "getName(...)");
                if (C33595OooOOo.OooOOo0(name, ".pdf", false)) {
                    arrayList.add(file);
                }
            }
            pdfiumCore = new PdfiumCore(abstractApplicationC26277OooOoOO);
            c26999OooO0o02 = c26999OooO0o0;
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = c26998OooO0Oo.f93905OooOoO0;
        PdfiumCore pdfiumCore2 = c26998OooO0Oo.f93902OooOo;
        C26999OooO0o0 c26999OooO0o03 = c26998OooO0Oo.f93903OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        pdfiumCore = pdfiumCore2;
        c26999OooO0o02 = c26999OooO0o03;
        while (it.hasNext()) {
            File file2 = (File) it.next();
            try {
            } catch (IOException unused) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ObjectStorageServiceRepoImpl");
                c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("clearInvalidTheme: ", file2.getName()), new Object[0]);
                String name2 = file2.getName();
                OooOOO0.OooO0o(name2, "getName(...)");
                String absolutePath = file2.getAbsolutePath();
                OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                c26998OooO0Oo.f93903OooOo0o = c26999OooO0o02;
                c26998OooO0Oo.f93902OooOo = pdfiumCore;
                c26998OooO0Oo.f93905OooOoO0 = it;
                c26998OooO0Oo.f93907OooOoo0 = 1;
                if (c26999OooO0o02.OooO00o(name2, absolutePath, c26998OooO0Oo) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26999OooO0o03 = c26999OooO0o02;
                pdfiumCore2 = pdfiumCore;
            }
            pdfiumCore.newDocument(file2.getAbsolutePath(), (String) null);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.Oooo000
    public final Object OooO00o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        StorageReference reference = StorageKt.getStorage(Firebase.INSTANCE).getReference();
        OooOOO0.OooO0o(reference, "getReference(...)");
        StorageReference storageReferenceChild = reference.child("theme/" + str);
        OooOOO0.OooO0o(storageReferenceChild, "child(...)");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO00o(storageReferenceChild, str2, null), abstractC32479OooO0OO);
    }

    @Override // o0OOo0Oo.Oooo000
    public final Object OooO0O0(String str, String str2, C29056OooOOO c29056OooOOO) {
        StorageReference reference = StorageKt.getStorage(Firebase.INSTANCE).getReference();
        OooOOO0.OooO0o(reference, "getReference(...)");
        StorageReference storageReferenceChild = reference.child("fonts/" + str);
        OooOOO0.OooO0o(storageReferenceChild, "child(...)");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO00o(storageReferenceChild, str2, null), c29056OooOOO);
    }

    @Override // o0OOo0Oo.Oooo000
    public final Object OooO0OO(String str, C27520o00o00o c27520o00o00o) {
        StorageReference reference = StorageKt.getStorage(Firebase.INSTANCE).getReference();
        OooOOO0.OooO0o(reference, "getReference(...)");
        StorageReference storageReferenceChild = reference.child("sticker/sticker.zip");
        OooOOO0.OooO0o(storageReferenceChild, "child(...)");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO00o(storageReferenceChild, str, null), c27520o00o00o);
    }
}
