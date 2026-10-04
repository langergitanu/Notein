package o00OO0oO;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import o0000OoO.C24224OooO00o;

/* JADX INFO: renamed from: o00OO0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25002OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f84817OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f84818OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f84819OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f84820OooO0Oo;

    public final String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + Build.MODEL);
        stringBuffer.append("," + this.f84817OooO00o);
        stringBuffer.append(",APPSecuritySDK-ALIPAYSDK,3.4.0.202206130311");
        String strSubstring = this.f84818OooO0O0;
        if (C24224OooO00o.OooO0O0(strSubstring) || strSubstring.length() < 20) {
            sb = new StringBuilder(",");
        } else {
            sb = new StringBuilder(",");
            strSubstring = strSubstring.substring(0, 20);
        }
        sb.append(strSubstring);
        stringBuffer.append(sb.toString());
        String strSubstring2 = this.f84819OooO0OO;
        if (C24224OooO00o.OooO0O0(strSubstring2) || strSubstring2.length() < 20) {
            sb2 = new StringBuilder(",");
        } else {
            sb2 = new StringBuilder(",");
            strSubstring2 = strSubstring2.substring(0, 20);
        }
        sb2.append(strSubstring2);
        stringBuffer.append(sb2.toString());
        String strSubstring3 = this.f84820OooO0Oo;
        if (C24224OooO00o.OooO0O0(strSubstring3) || strSubstring3.length() < 20) {
            sb3 = new StringBuilder(",");
        } else {
            sb3 = new StringBuilder(",");
            strSubstring3 = strSubstring3.substring(0, 20);
        }
        sb3.append(strSubstring3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
