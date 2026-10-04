package o0OOo0o;

import java.io.File;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0Oo0o0o.C28252Oooo;
import o0Oo0o0o.C28263OoooO00;
import o0oOo0o0.AbstractC30978OooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27596o00ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27387o0000o0 f96911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27449o00O0OoO f96912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27372Oooooo f96914OooO0Oo;

    public C27596o00ooo(C27387o0000o0 noteInFileUseCase, C27449o00O0OoO c27449o00O0OoO, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        this.f96911OooO00o = noteInFileUseCase;
        this.f96912OooO0O0 = c27449o00O0OoO;
        this.f96913OooO0OO = abstractApplicationC26277OooOoOO;
        this.f96914OooO0Oo = new C27372Oooooo(this);
    }

    public static File OooO(C27596o00ooo c27596o00ooo) {
        c27596o00ooo.getClass();
        File file = new File(c27596o00ooo.f96913OooO0OO.getFilesDir(), androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "exports/"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static long OooO00o(File file) {
        long jOooO00o = 0;
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(fileArrListFiles);
                    while (OooO0O02.hasNext()) {
                        File file2 = (File) OooO0O02.next();
                        jOooO00o += file2.isDirectory() ? OooO00o(file2) : file2.length();
                    }
                    return jOooO00o;
                }
            } catch (Exception e) {
                C34406OooO00o.f123390OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Error calculating directory size: ", file.getAbsolutePath()), new Object[0]);
            }
        }
        return jOooO00o;
    }

    public static int OooO0O0(File file) {
        int iOooO0O0;
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(fileArrListFiles);
                    iOooO0O0 = 0;
                    while (OooO0O02.hasNext()) {
                        try {
                            File file2 = (File) OooO0O02.next();
                            iOooO0O0 += file2.isDirectory() ? OooO0O0(file2) : 1;
                        } catch (Exception e) {
                            e = e;
                            C34406OooO00o.f123390OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Error counting files: ", file.getAbsolutePath()), new Object[0]);
                            return iOooO0O0;
                        }
                    }
                    return iOooO0O0;
                }
            } catch (Exception e2) {
                e = e2;
                iOooO0O0 = 0;
            }
        }
        return 0;
    }

    public static Object OooO0o0(C27596o00ooo c27596o00ooo, Set set, String str, int i, AbstractC30978OooO abstractC30978OooO, C28252Oooo c28252Oooo) {
        c27596o00ooo.getClass();
        C34406OooO00o.f123390OooO00o.OooO00o("exportNotesToNativeFormat: " + set + ", " + str + ", " + i, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OoOo0(c27596o00ooo, set, str, i, abstractC30978OooO, null), c28252Oooo);
    }

    public final Object OooO0OO(Set set, String str, int i, AbstractC30978OooO abstractC30978OooO, String str2, C28252Oooo c28252Oooo) {
        C34406OooO00o.f123390OooO00o.OooO00o("exportNotesToFlattenedPDF: " + set + ", " + str + ", " + i, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27374OoooooO(this, set, str, i, abstractC30978OooO, str2, null), c28252Oooo);
    }

    public final Object OooO0Oo(Set set, String str, int i, AbstractC30978OooO abstractC30978OooO, String str2, C28252Oooo c28252Oooo) {
        C34406OooO00o.f123390OooO00o.OooO00o("exportNotesToImages: " + set + ", " + str + ", " + i, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27375Ooooooo(this, set, str, i, abstractC30978OooO, str2, null), c28252Oooo);
    }

    public final Object OooO0o(Set set, String str, int i, AbstractC30978OooO abstractC30978OooO, String str2, C28252Oooo c28252Oooo) {
        C34406OooO00o.f123390OooO00o.OooO00o("exportNotesToVectorPDF: " + set + ", " + str + ", " + i, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27603ooOO(this, set, str, i, abstractC30978OooO, str2, null), c28252Oooo);
    }

    public final Object OooO0oO(String str, CopyOnWriteArrayList copyOnWriteArrayList, String str2, int i, AbstractC30978OooO abstractC30978OooO, String str3, C28263OoooO00 c28263OoooO00) {
        C34406OooO00o.f123390OooO00o.OooO00o("exportPagesToFlattenedPDF: " + str + ", " + copyOnWriteArrayList + ", " + str2 + ", " + i, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O(this, str, copyOnWriteArrayList, str2, i, abstractC30978OooO, str3, null), c28263OoooO00);
    }

    public final Object OooO0oo(String str, CopyOnWriteArrayList copyOnWriteArrayList, String str2, int i, AbstractC30978OooO abstractC30978OooO, String str3, C28263OoooO00 c28263OoooO00) {
        C34406OooO00o.f123390OooO00o.OooO00o("exportPagesToImages: " + str + ", " + copyOnWriteArrayList + ", " + str2 + ", " + i, new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27476o00Oo0(this, str, copyOnWriteArrayList, str2, i, abstractC30978OooO, str3, null), c28263OoooO00);
    }
}
