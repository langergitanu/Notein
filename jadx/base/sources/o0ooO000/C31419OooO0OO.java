package o0ooO000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: o0ooO000.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31419OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC31418OooO0O0 f112187OooO00o;

    public static void OooO0O0(File file, ArrayList arrayList) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory()) {
                    String lowerCase = file2.getName().toLowerCase(Locale.US);
                    if ((lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf") || lowerCase.endsWith(".pfb") || lowerCase.endsWith(".ttc")) && !lowerCase.startsWith("fonts.")) {
                        arrayList.add(file2.toURI());
                    }
                } else if (!file2.getName().startsWith(".")) {
                    OooO0O0(file2, arrayList);
                }
            }
        }
    }

    public final ArrayList OooO00o() {
        InterfaceC31418OooO0O0 c31423OooO0oO;
        if (this.f112187OooO00o == null) {
            if (System.getProperty("java.vendor").equals("The Android Project")) {
                c31423OooO0oO = new C31417OooO00o();
            } else {
                String property = System.getProperty("os.name");
                c31423OooO0oO = property.startsWith("Windows") ? new C31423OooO0oO() : property.startsWith("Mac") ? new C31420OooO0Oo() : property.startsWith("OS/400") ? new C31422OooO0o0() : new C31421OooO0o();
            }
            this.f112187OooO00o = c31423OooO0oO;
        }
        ArrayList arrayListOooOOOO = this.f112187OooO00o.OooOOOO();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListOooOOOO.iterator();
        while (it.hasNext()) {
            OooO0O0((File) it.next(), arrayList);
        }
        return arrayList;
    }
}
