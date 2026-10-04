package oOO00ooo;

import android.os.Process;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: oOO00ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34407OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f123394OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SimpleDateFormat f123395OooO00o = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f123396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f123397OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f123398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f123399OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f123400OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f123401OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f123402OooO0oo;

    /* JADX INFO: renamed from: oOO00ooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C20359OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f123406OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f123408OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f123409OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f123403OooO00o = System.currentTimeMillis();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f123404OooO0O0 = Process.myPid();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f123405OooO0OO = Process.myTid();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f123407OooO0o = "";

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final String f123410OooO0oo = "";

        public C20359OooO00o(int i, String str) {
            this.f123406OooO0Oo = i;
            this.f123408OooO0o0 = str;
        }
    }

    public C34407OooO00o(C20359OooO00o c20359OooO00o) {
        this.f123396OooO0O0 = c20359OooO00o.f123403OooO00o;
        this.f123397OooO0OO = c20359OooO00o.f123404OooO0O0;
        this.f123398OooO0Oo = c20359OooO00o.f123405OooO0OO;
        this.f123400OooO0o0 = c20359OooO00o.f123406OooO0Oo;
        this.f123399OooO0o = c20359OooO00o.f123408OooO0o0;
        this.f123401OooO0oO = c20359OooO00o.f123407OooO0o;
        this.f123402OooO0oo = c20359OooO00o.f123409OooO0oO;
        this.f123394OooO = c20359OooO00o.f123410OooO0oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f123395OooO00o.format(Long.valueOf(this.f123396OooO0O0)));
        sb.append(" ");
        int i = this.f123400OooO0o0;
        sb.append(i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? 'V' : 'A' : 'E' : 'W' : 'I' : 'D');
        sb.append("/");
        sb.append(this.f123399OooO0o);
        sb.append(" ");
        sb.append(this.f123397OooO0OO);
        sb.append(C18241k5.f55433h);
        sb.append(this.f123398OooO0Oo);
        sb.append(" ");
        sb.append(this.f123401OooO0oO);
        sb.append(":0] ");
        sb.append(this.f123402OooO0oo);
        String str = this.f123394OooO;
        if (str != null) {
            sb.append('\n');
            sb.append(str);
        }
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb.toString();
    }
}
