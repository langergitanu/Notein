package OooO0O0;

import android.content.Context;
import androidx.fragment.app.C21904OooOoo0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24230OooO0Oo;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33561OooO;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f58148OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f58149OooO0O0 = 0;

    public static final C24230OooO0Oo OooO00o(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return new C24230OooO0Oo(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static Object OooO0O0(int i, List list) {
        return OooO00o.OooO00o(i, list);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:(3:33|7|(1:9)(0))|27) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO0OO(String str, String str2) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        File file;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            file = new File(str, str2);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!file.exists()) {
            return null;
        }
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                }
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                }
                return sb.toString();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 == null) {
                    throw th;
                }
                try {
                    bufferedReader2.close();
                    throw th;
                } catch (Throwable unused3) {
                    throw th;
                }
            }
            break;
        }
        bufferedReader.close();
        return sb.toString();
        if (bufferedReader2 != null) {
            bufferedReader = bufferedReader2;
            break;
            bufferedReader.close();
        }
        return sb.toString();
    }

    public static String OooO0Oo(int i) {
        String upperCase = Integer.toString(i, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        return length != 1 ? length != 2 ? length != 3 ? "uni".concat(upperCase) : "uni0".concat(upperCase) : "uni00".concat(upperCase) : "uni000".concat(upperCase);
    }

    public static C33561OooO OooO0o0(InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        C33561OooO c33561OooO = new C33561OooO();
        c33561OooO.f121186OooOoO = C21904OooOoo0.OooO0O0(c33561OooO, c33561OooO, interfaceC32508OooOOOo);
        return c33561OooO;
    }
}
