package o000OO;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    public static String OooO00o() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + C18241k5.f55433h + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String OooO0O0(Context context, int i) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C21532OooOOo.OooO0OO(i, MsalUtils.QUERY_STRING_SYMBOL);
        }
    }

    public static String OooO0OO(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
