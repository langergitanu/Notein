package o0ooO000;

import OoooooO.C21445Oooo;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0ooO000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31423OooO0oO implements InterfaceC31418OooO0O0 {
    public static String OooO00o(String str) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((str.startsWith("Windows 9") ? runtime.exec("command.com /c echo %windir%") : runtime.exec("cmd.exe /c echo %windir%")).getInputStream(), C31413OooO0O0.f112169OooO00o));
        String line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }

    @Override // o0ooO000.InterfaceC31418OooO0O0
    public final ArrayList OooOOOO() {
        String strOooO00o;
        ArrayList arrayList = new ArrayList();
        try {
            strOooO00o = System.getProperty("env.windir");
        } catch (SecurityException unused) {
            strOooO00o = null;
        }
        String property = System.getProperty("os.name");
        if (strOooO00o == null) {
            try {
                strOooO00o = OooO00o(property);
            } catch (IOException | SecurityException unused2) {
            }
        }
        if (strOooO00o == null || strOooO00o.length() <= 2) {
            String str = property.endsWith("NT") ? "WINNT" : "WINDOWS";
            for (char c = 'C'; c <= 'E'; c = (char) (c + 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(C18241k5.f55433h);
                String str2 = File.separator;
                File file = new File(C21445Oooo.OooO0O0(sb, str2, str, str2, "FONTS"));
                try {
                    if (file.exists() && file.canRead()) {
                        arrayList.add(file);
                        break;
                    }
                } catch (SecurityException unused3) {
                }
            }
            for (char c2 = 'C'; c2 <= 'E'; c2 = (char) (c2 + 1)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2);
                sb2.append(C18241k5.f55433h);
                File file2 = new File(androidx.concurrent.futures.OooO00o.OooO0OO(sb2, File.separator, "PSFONTS"));
                try {
                    if (file2.exists() && file2.canRead()) {
                        arrayList.add(file2);
                        break;
                    }
                } catch (SecurityException unused4) {
                }
            }
        } else {
            if (strOooO00o.endsWith("/")) {
                strOooO00o = androidx.core.content.OooO0OO.OooO00o(1, 0, strOooO00o);
            }
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strOooO00o);
            String str3 = File.separator;
            File file3 = new File(androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0OO, str3, "FONTS"));
            if (file3.exists() && file3.canRead()) {
                arrayList.add(file3);
            }
            File file4 = new File(strOooO00o.substring(0, 2) + str3 + "PSFONTS");
            if (file4.exists() && file4.canRead()) {
                arrayList.add(file4);
            }
        }
        return arrayList;
    }
}
