package o0OOo0o;

import android.net.Uri;
import java.io.File;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o00Ooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27499o00Ooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96374OooO00o;

    public C27499o00Ooo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f96374OooO00o = abstractApplicationC26277OooOoOO;
    }

    public static Object OooO0OO(C27499o00Ooo0 c27499o00Ooo0, Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        c27499o00Ooo0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27490o00OoOO(uri, "documents", c27499o00Ooo0, null), abstractC32479OooO0OO);
    }

    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27487o00OoO0(str, this, null), abstractC32479OooO0OO);
    }

    public final Object OooO0O0(Uri uri, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27491o00OoOO0(uri, null, this), abstractC32476OooO);
    }

    public final Boolean OooO0Oo(String str) {
        File file = new File(this.f96374OooO00o.getFilesDir(), "temp_documents");
        boolean zOooOoO0 = false;
        if (str != null) {
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            zOooOoO0 = C33595OooOOo.OooOoO0(str, absolutePath, false);
        }
        return Boolean.valueOf(zOooOoO0);
    }
}
