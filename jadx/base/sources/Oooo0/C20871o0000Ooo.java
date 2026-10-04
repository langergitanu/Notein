package Oooo0;

import androidx.core.location.LocationRequestCompat;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo000O.C31190OooO0oo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: Oooo0.o0000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20871o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f60038OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f60039OooO0O0 = 0;

    public static void OooO00o(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            j3 = LocationRequestCompat.PASSIVE_INTERVAL;
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return;
            }
            long j4 = j2 + j;
            if (j4 >= 0) {
                j3 = j4;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static final int OooO0O0(float f) {
        return oO0O00O.OooO00o.OooO0O0((float) Math.ceil(f));
    }

    public static final String OooO0OO(String str, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        String str2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        File file = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "documents");
        C31190OooO0oo.OooO0o(file);
        String name = new File(str).getName();
        if (name == null || name.length() == 0) {
            return null;
        }
        String strOoooO0O = C33599OooOo0O.OoooO0O(name, ".pdf");
        if (C33599OooOo0O.OooOoOO(strOoooO0O, "_notein_pdf_", false)) {
            String strSubstring = strOoooO0O.substring(0, C33599OooOo0O.Oooo0O0(strOoooO0O, "_notein_pdf_", 0, false, 6));
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
            str2 = strSubstring + "_notein_pdf_" + UUID.randomUUID() + ".pdf";
        } else {
            str2 = strOoooO0O + "_notein_pdf_" + UUID.randomUUID() + ".pdf";
        }
        return new File(file, str2).getAbsolutePath();
    }
}
