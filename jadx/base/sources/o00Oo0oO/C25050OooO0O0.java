package o00Oo0oO;

import Oooo0.o0OoOo0;
import android.os.SystemClock;
import android.util.Log;
import com.aspose.slides.C22220Oooo00o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import o00oO0o.C25570OooO;
import oO00ooO.C32442OooOO0o;
import oO0oO00.C33961OooOooo;
import oO0oO00.C33963Oooo00O;

/* JADX INFO: renamed from: o00Oo0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25050OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f85051OooO00o = -1;

    public static synchronized boolean OooO00o() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f85051OooO00o < 3000) {
            return true;
        }
        f85051OooO00o = jElapsedRealtime;
        return false;
    }

    public static final int OooO0O0(int i) {
        C22220Oooo00o.OooO0OO(i, "<this>");
        int iOooO00o = o0OoOo0.OooO00o(i);
        if (iOooO00o == 0) {
            return 3;
        }
        if (iOooO00o == 1) {
            return 1;
        }
        if (iOooO00o == 2) {
            return 2;
        }
        throw new C32442OooOO0o();
    }

    public static final C33963Oooo00O OooO0OO(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        C33961OooOooo c33961OooOooo = new C33961OooOooo(str, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = values[i];
            int i3 = i2 + 1;
            String strName = (String) oOo000Oo.OooOOO.OooOooo(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            c33961OooOooo.OooOO0(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) oOo000Oo.OooOOO.OooOooo(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(annotation, "annotation");
                    int i4 = c33961OooOooo.f122283OooO0Oo;
                    List<Annotation>[] listArr = c33961OooOooo.f122284OooO0o;
                    List<Annotation> arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(1);
                        listArr[c33961OooOooo.f122283OooO0Oo] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        C33963Oooo00O c33963Oooo00O = new C33963Oooo00O(str, values);
        c33963Oooo00O.f122185OooO0O0 = c33961OooOooo;
        return c33963Oooo00O;
    }

    public static final C33963Oooo00O OooO0Oo(String str, Enum[] values) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        return new C33963Oooo00O(str, values);
    }

    public static final C25570OooO OooO0o(oO0O000o.OooO00o defaultFactory) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultFactory, "defaultFactory");
        return new C25570OooO(defaultFactory);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String OooO0o0(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(kotlin.jvm.internal.OooOOO0.OooOOO0(str, "getprop ")).getInputStream()), 1024);
            try {
                try {
                    String line = bufferedReader.readLine();
                    kotlin.jvm.internal.OooOOO0.OooO0o(line, "input.readLine()");
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                        return line;
                    } catch (IOException e) {
                        Log.e("RomUtils--->", "Exception while closing InputStream", e);
                        return line;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e("RomUtils--->", kotlin.jvm.internal.OooOOO0.OooOOO0(str, "Unable to read sysprop "), e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            Log.e("RomUtils--->", "Exception while closing InputStream", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                        Log.e("RomUtils--->", "Exception while closing InputStream", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
    }
}
