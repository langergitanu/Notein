package okhttp3.internal.concurrent;

import android.support.v4.media.session.OooO00o;
import com.aspose.words.ControlChar;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m80612d2 = {"okhttp"}, m80613k = 2, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class TaskLoggerKt {
    public static final void OooO00o(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.f124330OooO0oo.getClass();
        TaskRunner.f124331OooOO0.fine(taskQueue.f124322OooO0O0 + ControlChar.SPACE_CHAR + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f124317OooO00o);
    }

    public static final String OooO0O0(long j) {
        String strOooO00o;
        if (j <= -999500000) {
            strOooO00o = OooO00o.OooO00o((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strOooO00o = OooO00o.OooO00o((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strOooO00o = OooO00o.OooO00o((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500) {
            strOooO00o = OooO00o.OooO00o((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500000) {
            strOooO00o = OooO00o.OooO00o((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strOooO00o = OooO00o.OooO00o((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strOooO00o}, 1));
    }
}
