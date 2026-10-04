package com.aspose.slides.internal.p449us;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p234ko.C5894x1;
import com.aspose.slides.internal.p243l6.C6008to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p505xn.C12568qq;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.us.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11556x1 {

    /* JADX INFO: renamed from: k4 */
    private static String f39060k4;

    /* JADX INFO: renamed from: k4 */
    public static String m54537k4(String str, String str2) {
        if (str2 != null) {
            f39060k4 = C3141rv.m13406kk(C3141rv.m13412x1(str2, "TestDataNet/Lic/Aspose.Total.Product.Family.lic"));
        }
        return C14113y2.m67402k4("{0} -lk \"{1}\"", str, f39060k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54540x1(String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        m54537k4(null, null);
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4("--format bmp ");
        c6765kp.m26792k4(C14113y2.m67402k4("--element #slide-{0}{1} ", Integer.valueOf(i + 1), z ? "-notes" : ""));
        c6765kp.m26792k4(C14113y2.m67402k4("--output \"{0}\" ", C3141rv.m13400h4(str3)));
        c6765kp.m26792k4(C14113y2.m67402k4("--prefix \"{0}\" ", C3141rv.m13411x1(str3)));
        c6765kp.m26792k4(C14113y2.m67402k4("--hres {0} ", Integer.valueOf(i2)));
        c6765kp.m26792k4(C14113y2.m67402k4("--vres {0} ", Integer.valueOf(i3)));
        c6765kp.m26792k4(C14113y2.m67402k4("--license \"{0}\" ", f39060k4));
        c6765kp.m26792k4(C14113y2.m67402k4("\"{0}\" ", str2));
        C6008to c6008to = new C6008to();
        try {
            c6008to.m24278du().m24254to(false);
            c6008to.m24278du().m24256x1(str);
            c6008to.m24278du().m24248k4(true);
            c6008to.m24278du().m24247k4(c6765kp.toString());
            c6008to.m24277c5();
            c6008to.m24280jd();
            if (c6008to.m24281k4() == 0) {
            } else {
                throw new Exception(C14113y2.m67402k4("Command line: \"{0} {1}\". Tool exit with code {2}", str, c6765kp, Integer.valueOf(c6008to.m24281k4())));
            }
        } finally {
            c6008to.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54538k4(String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("--format bmp ");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("--pages {0} ", Integer.valueOf(i)));
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("--output \"{0}\" ", C3141rv.m13400h4(str3)));
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("--prefix \"{0}\" ", C3141rv.m13411x1(str3)));
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("--hres {0} ", Integer.valueOf(i2)));
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("--vres {0} ", Integer.valueOf(i3)));
        c6765kpOooO00o.m26792k4("--quality 100 ");
        if (!z) {
            c6765kpOooO00o.m26792k4("--nosmooth ");
        }
        c6765kpOooO00o.m26792k4("--noprompt ");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("\"{0}\" ", str2));
        C6008to c6008to = new C6008to();
        try {
            c6008to.m24278du().m24254to(false);
            c6008to.m24278du().m24256x1(str);
            c6008to.m24278du().m24248k4(true);
            c6008to.m24278du().m24247k4(c6765kpOooO00o.toString());
            c6008to.m24277c5();
            c6008to.m24280jd();
            if (c6008to.m24281k4() == 0) {
            } else {
                throw new Exception(C14113y2.m67402k4("Command line: \"{0} {1}\". Tool exit with code {2}", str, c6765kpOooO00o, Integer.valueOf(c6008to.m24281k4())));
            }
        } finally {
            c6008to.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54539k4(String str, boolean z, String str2, String str3, String str4) {
        String strM67402k4 = C14113y2.m67411k4(str4) ? C14113y2.m67402k4("-cl {0} \"{1}\"", str3, str2) : C14113y2.m67402k4("-cl {0} -pw {2} \"{1}\"", str3, str2, str4);
        PrintStream printStream = C5894x1.f16672k4;
        printStream.println(str);
        printStream.println(strM67402k4);
        String strM54537k4 = m54537k4(strM67402k4, null);
        String[] strArr = {C14113y2.f47374k4};
        int iM58663k4 = C12568qq.m58663k4(str, strM54537k4, strArr);
        String str5 = strArr[0];
        printStream.println(C14113y2.m67402k4("Result: {0}\n{1}", Integer.valueOf(iM58663k4), str5));
        if (iM58663k4 != 0) {
            throw new InvalidOperationException(C14113y2.m67402k4("PDF file does not conform to {0}. \r\nFile: {1} \r\nValidator exit code: {2}. \r\nValidator message: {3}", str3, str2, Integer.valueOf(iM58663k4), str5));
        }
    }
}
