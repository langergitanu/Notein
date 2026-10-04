package o0O0oooO;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26275OooOoO extends C34406OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f90103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f90104OooO0OO = 30;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f90105OooO0Oo = 30;

    public C26275OooOoO(File file) {
        this.f90103OooO0O0 = file;
    }

    @Override // oOO00oo.C34406OooO00o.OooO0O0
    public final boolean OooO0o(int i) {
        return i > 3;
    }

    @Override // oOO00oo.C34406OooO00o.OooO0O0
    public final void OooO0oO(int i, String str, String message) {
        File file = this.f90103OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        if (i == 2 || i == 3) {
            return;
        }
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length >= this.f90104OooO0OO) {
                final C26273OooOo0O c26273OooOo0O = new C26273OooOo0O();
                Arrays.sort(fileArrListFiles, new Comparator() { // from class: o0O0oooO.OooOo0o
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Number) c26273OooOo0O.invoke(obj, obj2)).intValue();
                    }
                });
                fileArrListFiles[0].delete();
            }
            File file2 = new File(file, new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date()) + ".txt");
            String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
            FileWriter fileWriter = new FileWriter(file2, true);
            fileWriter.write(str2 + " " + str + "/" + i + ": " + message + IOUtils.LINE_SEPARATOR_UNIX);
            fileWriter.flush();
            fileWriter.close();
            OooOOO0(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void OooOOO0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            final C26270OooOo c26270OooOo = new C26270OooOo();
            Arrays.sort(fileArrListFiles, new Comparator() { // from class: o0O0oooO.OooOoO0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) c26270OooOo.invoke(obj, obj2)).intValue();
                }
            });
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -this.f90105OooO0Oo);
            Date time = calendar.getTime();
            kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(fileArrListFiles);
            while (OooO0O02.hasNext()) {
                File file2 = (File) OooO0O02.next();
                String name = file2.getName();
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(name);
                    String strSubstring = name.substring(0, name.length() - 4);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                    if (simpleDateFormat.parse(strSubstring).before(time)) {
                        file2.delete();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
