package o00OO0oO;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import o0000OoO.C24224OooO00o;

/* JADX INFO: renamed from: o00OO0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25004OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static String f84824OooO00o = "";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f84825OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static String f84826OooO0OO = "";

    public static synchronized void OooO00o(Throwable th) {
        String string;
        try {
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.toString();
            } else {
                string = "";
            }
            arrayList.add(string);
            OooO0O0(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void OooO0O0(ArrayList arrayList) {
        try {
            if (!C24224OooO00o.OooO0O0(f84825OooO0O0) && !C24224OooO00o.OooO0O0(f84826OooO0OO)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f84826OooO0OO);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(", " + ((String) it.next()));
                }
                stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                try {
                    File file = new File(f84824OooO00o);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f84824OooO00o, f84825OooO0O0);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        } finally {
        }
    }
}
