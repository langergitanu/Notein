package o0OOo0o;

import OooOo.C20485OooOoO;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27095OooOo0O;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0oo000O.C31190OooO0oo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00o0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27540o00o0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96558OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f96559OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27020OooOoO0 f96560OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27095OooOo0O f96561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27596o00ooo f96562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27314OooOooO f96563OooO0o0;

    public C27540o00o0oO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC27313OooOoo0 noteMetaRepo, C27020OooOoO0 c27020OooOoO0, C27095OooOo0O c27095OooOo0O, InterfaceC27314OooOooO notePlaceholderRepo, C27596o00ooo c27596o00ooo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderRepo, "notePlaceholderRepo");
        this.f96558OooO00o = abstractApplicationC26277OooOoOO;
        this.f96559OooO0O0 = noteMetaRepo;
        this.f96560OooO0OO = c27020OooOoO0;
        this.f96561OooO0Oo = c27095OooOo0O;
        this.f96563OooO0o0 = notePlaceholderRepo;
        this.f96562OooO0o = c27596o00ooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27540o00o0oO c27540o00o0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27541o00o0oO0 c27541o00o0oO0;
        c27540o00o0oO.getClass();
        if (abstractC32479OooO0OO instanceof C27541o00o0oO0) {
            c27541o00o0oO0 = (C27541o00o0oO0) abstractC32479OooO0OO;
            int i = c27541o00o0oO0.f96566OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27541o00o0oO0.f96566OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27541o00o0oO0 = new C27541o00o0oO0(c27540o00o0oO, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c27541o00o0oO0.f96564OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27541o00o0oO0.f96566OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            o0OO.OooOo oooOoOooO0O0 = c27540o00o0oO.f96563OooO0o0.OooO0O0();
            c27541o00o0oO0.f96565OooOo0o = c27540o00o0oO;
            c27541o00o0oO0.f96566OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(oooOoOooO0O0, c27541o00o0oO0);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27540o00o0oO = c27541o00o0oO0.f96565OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objOooOOo).iterator();
        while (it.hasNext()) {
            String filePath = ((NotePlaceHolder) it.next()).getFilePath();
            if (filePath != null) {
                arrayList.add(filePath);
            }
        }
        c27540o00o0oO.getClass();
        File file = new File(c27540o00o0oO.f96558OooO00o.getFilesDir(), "documents");
        C31190OooO0oo.OooO0o(file);
        ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(file, false);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListOooOo00) {
            File file2 = (File) obj;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(file2);
            if (C32501OooO0oO.OooO0o0(file2).equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!arrayList.contains(((File) obj2).getAbsolutePath())) {
                arrayList3.add(obj2);
            }
        }
        OooO0O0(BackupFile.EXTENSION_NOTEIN_FILE, arrayList3);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static void OooO0O0(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((File) obj).exists()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Long.valueOf(((File) it.next()).length()));
        }
        Iterator it2 = arrayList3.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += ((Number) it2.next()).longValue();
        }
        String strOooO0OO = C31430OooO00o.OooO0OO(jLongValue);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("StorageOptimizationUseCase");
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(arrayList.size(), "To delete ", str, " files number is ", ", space size is ");
        sbOooO0OO.append(strOooO0OO);
        c20358OooO00o.OooO0o0(sbOooO0OO.toString(), new Object[0]);
    }
}
