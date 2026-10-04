package o00o0OoO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: o00o0OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25421OooO0O0 {

    /* JADX INFO: renamed from: o00o0OoO.OooO0O0$OooO00o */
    public static class OooO00o extends IOException {
    }

    /* JADX INFO: renamed from: o00o0OoO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19701OooO0O0 extends IOException {
    }

    /* JADX INFO: renamed from: o00o0OoO.OooO0O0$OooO0OO */
    public static class OooO0OO extends FileNotFoundException {
    }

    /* JADX INFO: renamed from: o00o0OoO.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static class C25422OooO0Oo extends IOException {
    }

    public static void OooO00o(File file) throws OooO00o {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                C19701OooO0O0 c19701OooO0O0 = new C19701OooO0O0(file.getAbsolutePath());
                OooO00o oooO00o = new OooO00o(absolutePath);
                oooO00o.initCause(c19701OooO0O0);
                throw oooO00o;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new OooO00o(file.getAbsolutePath());
        }
    }

    public static void OooO0O0(File file, File file2) throws C25422OooO0Oo {
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new OooO0OO(file.getAbsolutePath()) : new C19701OooO0O0(file2.getAbsolutePath());
        C25422OooO0Oo c25422OooO0Oo = new C25422OooO0Oo("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        c25422OooO0Oo.initCause(fileNotFoundException);
        throw c25422OooO0Oo;
    }
}
