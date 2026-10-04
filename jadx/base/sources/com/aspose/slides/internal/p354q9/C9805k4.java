package com.aspose.slides.internal.p354q9;

import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.internal.p234ko.C5894x1;
import com.aspose.slides.internal.p244l7.C6010k4;
import com.aspose.slides.p559ms.System.C14100v4;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.q9.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9805k4 extends ExternalException {

    /* JADX INFO: renamed from: kk */
    private static List<k4> f35549kk = k4.m48337k4("(\\%\\d+)(!s!|!hs!)", "$1\\$s", "(\\%\\d+)(!lx!)", "$1\\$x", "(\\%\\d+)(!d!|!ld!)", "$1\\$d", "(\\%\\d+)(]|\\))", "$1\\$s$2", "(\\%\\d+)(\\s|,|\\.)", "$1\\$s$2", "(\\%)(wZ)", "$1s", "(0x)(\\%\\d+)(!)(\\d+)(lx!|x!)", "$1$2\\$$4X", "(\\%\\d+)[^d^s^x^]^\\)\\w]", "$1\\$s");

    /* JADX INFO: renamed from: k4 */
    private final int f35550k4;

    /* JADX INFO: renamed from: x1 */
    private Object[] f35551x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.q9.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        String f35552k4;

        /* JADX INFO: renamed from: x1 */
        String f35553x1;

        public k4(String str, String str2) {
            this.f35552k4 = str;
            this.f35553x1 = str2;
        }

        /* JADX INFO: renamed from: k4 */
        public String m48338k4() {
            return this.f35552k4;
        }

        /* JADX INFO: renamed from: x1 */
        public String m48339x1() {
            return this.f35553x1;
        }

        /* JADX INFO: renamed from: k4 */
        public static List<k4> m48337k4(String... strArr) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < strArr.length; i += 2) {
                arrayList.add(new k4(strArr[i], strArr[i + 1]));
            }
            return arrayList;
        }
    }

    public C9805k4(int i) {
        this.f35550k4 = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return m48335x1(C6010k4.m24293k4(this.f35550k4));
    }

    /* JADX INFO: renamed from: k4 */
    public int m48333k4() {
        return this.f35550k4;
    }

    /* JADX INFO: renamed from: x1 */
    public String m48335x1(String str) {
        String strM48334k4 = m48334k4(str);
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format(C14100v4.m67325k4(), strM48334k4, m48336x1());
        formatter.close();
        C5894x1.f16672k4.println("result string = " + sb.toString());
        return sb.toString();
    }

    public C9805k4(int i, String str) {
        super(str);
        this.f35550k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public String m48334k4(String str) {
        for (k4 k4Var : f35549kk) {
            str = str.replaceAll(k4Var.m48338k4(), k4Var.m48339x1());
        }
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    public Object[] m48336x1() {
        if (this.f35551x1 == null) {
            this.f35551x1 = new Object[0];
        }
        return this.f35551x1;
    }
}
