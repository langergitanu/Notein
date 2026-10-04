package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: com.huawei.hms.base.log.c */
/* JADX INFO: loaded from: classes6.dex */
public class C17736c {

    /* JADX INFO: renamed from: b */
    public String f52490b;

    /* JADX INFO: renamed from: c */
    public String f52491c;

    /* JADX INFO: renamed from: d */
    public int f52492d;

    /* JADX INFO: renamed from: g */
    public String f52495g;

    /* JADX INFO: renamed from: h */
    public int f52496h;

    /* JADX INFO: renamed from: i */
    public int f52497i;

    /* JADX INFO: renamed from: j */
    public int f52498j;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f52489a = new StringBuilder();

    /* JADX INFO: renamed from: e */
    public long f52493e = 0;

    /* JADX INFO: renamed from: f */
    public long f52494f = 0;

    public C17736c(int i, String str, int i2, String str2) {
        this.f52491c = "HMS";
        this.f52498j = i;
        this.f52490b = str;
        this.f52492d = i2;
        if (str2 != null) {
            this.f52491c = str2;
        }
        m75837b();
    }

    /* JADX INFO: renamed from: a */
    public static String m75832a(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? String.valueOf(i) : "E" : "W" : "I" : "D";
    }

    /* JADX INFO: renamed from: b */
    public final C17736c m75837b() {
        this.f52493e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f52494f = threadCurrentThread.getId();
        this.f52496h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.f52498j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.f52495g = stackTraceElement.getFileName();
            this.f52497i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m75839c() {
        StringBuilder sb = new StringBuilder();
        m75838b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m75838b(sb);
        m75836a(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public <T> C17736c m75833a(T t) {
        this.f52489a.append(t);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C17736c m75834a(Throwable th) {
        m75833a('\n').m75833a(Log.getStackTraceString(th));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m75835a() {
        StringBuilder sb = new StringBuilder();
        m75836a(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final StringBuilder m75836a(StringBuilder sb) {
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f52489a.toString());
        return sb;
    }

    /* JADX INFO: renamed from: b */
    public final StringBuilder m75838b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f52493e)));
        String strM75832a = m75832a(this.f52492d);
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(strM75832a);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f52491c);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.f52490b);
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f52496h);
        sb.append(':');
        sb.append(this.f52494f);
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f52495g);
        sb.append(':');
        sb.append(this.f52497i);
        sb.append(']');
        return sb;
    }
}
