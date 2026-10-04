package com.aspose.slides.internal.p243l6;

import androidx.core.content.OooO0OO;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.StringDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.l6.to */
/* JADX INFO: loaded from: classes.dex */
public class C6008to implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private AbstractC14049c6 f16977c5;

    /* JADX INFO: renamed from: ck */
    private C14112xw f16978ck;

    /* JADX INFO: renamed from: du */
    private int f16979du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC6006kk f16980dy;

    /* JADX INFO: renamed from: fa */
    private String f16981fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f16982h4;

    /* JADX INFO: renamed from: jd */
    private C14112xw f16983jd;

    /* JADX INFO: renamed from: k4 */
    Process f16984k4;

    /* JADX INFO: renamed from: kk */
    public AbstractC14049c6 f16985kk;

    /* JADX INFO: renamed from: ks */
    private C3148wl f16986ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f16987m9;

    /* JADX INFO: renamed from: ne */
    private C6003h4 f16988ne;

    /* JADX INFO: renamed from: rv */
    private C3123ar f16989rv;

    /* JADX INFO: renamed from: to */
    private C14112xw f16990to;

    /* JADX INFO: renamed from: up */
    private k4 f16991up;

    /* JADX INFO: renamed from: x1 */
    public AbstractC14049c6 f16992x1;

    /* JADX INFO: renamed from: x6 */
    private C3148wl f16993x6;

    /* JADX INFO: renamed from: yj */
    private boolean f16994yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.l6.to$k4 */
    public enum k4 {
        NoneYet(0),
        SyncOutput(1),
        SyncError(2),
        AsyncOutput(4),
        AsyncError(8);


        /* JADX INFO: renamed from: m9 */
        private static HashMap<Integer, k4> f16999m9;

        /* JADX INFO: renamed from: h4 */
        private int f17002h4;

        k4(int i) {
            this.f17002h4 = i;
            m24291x1().put(Integer.valueOf(i), this);
        }

        /* JADX INFO: renamed from: x1 */
        private static synchronized HashMap<Integer, k4> m24291x1() {
            try {
                if (f16999m9 == null) {
                    f16999m9 = new HashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f16999m9;
        }

        /* JADX INFO: renamed from: k4 */
        public int m24292k4() {
            return this.f17002h4;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m24290k4(int i) {
            return m24291x1().get(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.l6.to$kk */
    public static class kk extends AbstractC3150x6 {

        /* JADX INFO: renamed from: k4 */
        private OutputStream f17003k4;

        private kk(OutputStream outputStream) {
            this.f17003k4 = outputStream;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canRead() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canSeek() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canWrite() {
            return true;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void flush() {
            try {
                this.f17003k4.flush();
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("", e);
            }
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getLength() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getPosition() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public int read(byte[] bArr, int i, int i2) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long seek(long j, int i) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setLength(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setPosition(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f17003k4.write(bArr, i, i2);
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("", e);
            }
        }

        public /* synthetic */ kk(OutputStream outputStream, C6001du c6001du) {
            this(outputStream);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.l6.to$to */
    public final class to<T> {

        /* JADX INFO: renamed from: k4 */
        public T f17004k4;

        public to(T t) {
            this.f17004k4 = t;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.l6.to$x1 */
    public static class x1 extends AbstractC3150x6 {

        /* JADX INFO: renamed from: k4 */
        private InputStream f17006k4;

        private x1(InputStream inputStream) {
            this.f17006k4 = inputStream;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canRead() {
            return true;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canSeek() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canWrite() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void flush() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getLength() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getPosition() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public int read(byte[] bArr, int i, int i2) {
            try {
                return this.f17006k4.read(bArr, i, i2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long seek(long j, int i) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setLength(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setPosition(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void write(byte[] bArr, int i, int i2) {
            throw new NotSupportedException();
        }

        public /* synthetic */ x1(InputStream inputStream, C6001du c6001du) {
            this(inputStream);
        }
    }

    public C6008to() {
        this.f16990to = new C14112xw(-1L);
        this.f16979du = 0;
        this.f16982h4 = false;
        this.f16987m9 = false;
        this.f16980dy = null;
        this.f16977c5 = null;
        C14112xw c14112xw = C14112xw.f47372k4;
        this.f16983jd = c14112xw;
        this.f16978ck = c14112xw;
        this.f16981fa = null;
        this.f16991up = k4.m24290k4(0);
        this.f16994yj = false;
        this.f16984k4 = null;
        this.f16986ks = null;
        this.f16989rv = null;
        this.f16993x6 = null;
        this.f16988ne = null;
        this.f16992x1 = null;
        this.f16985kk = null;
    }

    /* JADX INFO: renamed from: ck */
    private boolean m24266ck() {
        return (this.f16984k4 == null || this.f16990to.equals(C14112xw.f47372k4)) ? false : true;
    }

    /* JADX INFO: renamed from: dy */
    public static C6008to m24267dy() {
        int iM24273up = m24273up();
        C14112xw c14112xwM24275x1 = m24275x1(iM24273up);
        if (C14112xw.f47372k4.equals(c14112xwM24275x1)) {
            throw new SystemException("Can't find current process");
        }
        return new C6008to(c14112xwM24275x1, iM24273up);
    }

    /* JADX INFO: renamed from: fa */
    private void m24268fa() {
        if (!m24266ck()) {
            throw new InvalidOperationException("Process has not been started.");
        }
    }

    /* JADX INFO: renamed from: up */
    private static int m24273up() {
        throw new InvalidOperationException("Use native API.");
    }

    /* JADX INFO: renamed from: x1 */
    public static C6008to m24274x1(C6003h4 c6003h4) {
        if (c6003h4 == null) {
            throw new ArgumentNullException("startInfo");
        }
        C6008to c6008to = new C6008to();
        c6008to.m24282k4(c6003h4);
        if (m24271k4(c6003h4, c6008to)) {
            return c6008to;
        }
        return null;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m24277c5() {
        if (m24266ck()) {
            m24276x1(this.f16990to);
            this.f16990to = C14112xw.f47372k4;
        }
        return m24271k4(m24278du(), this);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        Process process = this.f16984k4;
        if (process == null || this.f16994yj) {
            return;
        }
        this.f16994yj = true;
        try {
            if (process.getErrorStream() != null) {
                this.f16984k4.getErrorStream().close();
            }
            if (this.f16984k4.getInputStream() != null) {
                this.f16984k4.getInputStream().close();
            }
            if (this.f16984k4.getOutputStream() != null) {
                this.f16984k4.getOutputStream().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: du */
    public C6003h4 m24278du() {
        if (this.f16988ne == null) {
            this.f16988ne = new C6003h4();
        }
        return this.f16988ne;
    }

    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public long m24279h4() {
        to toVar = new to(0);
        long jM24270k4 = m24270k4(this.f16979du, 4, toVar);
        ((Integer) toVar.f17004k4).getClass();
        return jM24270k4;
    }

    /* JADX INFO: renamed from: jd */
    public void m24280jd() {
        m24283k4(-1);
    }

    /* JADX INFO: renamed from: k4 */
    public int m24281k4() {
        int iM24269k4 = m24269k4(this.f16990to);
        if (iM24269k4 != 259) {
            return iM24269k4;
        }
        throw new InvalidOperationException("The process must exit before getting the requested information.");
    }

    /* JADX INFO: renamed from: kk */
    public C3148wl m24284kk() {
        if (this.f16986ks == null) {
            throw new InvalidOperationException("Standard error has not been redirected");
        }
        if ((this.f16991up.m24292k4() & k4.AsyncError.m24292k4()) != 0) {
            throw new InvalidOperationException("Cannot mix asynchronous and synchonous reads.");
        }
        this.f16991up.f17002h4 |= k4.SyncError.m24292k4();
        return this.f16986ks;
    }

    /* JADX INFO: renamed from: m9 */
    public void m24285m9() {
        dispose();
    }

    /* JADX INFO: renamed from: to */
    public C3148wl m24286to() {
        if (this.f16993x6 == null) {
            throw new InvalidOperationException("Standard output has not been redirected");
        }
        if ((this.f16991up.m24292k4() & k4.AsyncOutput.m24292k4()) != 0) {
            throw new InvalidOperationException("Cannot mix asynchronous and synchonous reads.");
        }
        this.f16991up.f17002h4 |= k4.SyncOutput.f17002h4;
        return this.f16993x6;
    }

    public String toString() {
        return super.toString() + " (" + m24287x1() + ")";
    }

    private C6008to(C14112xw c14112xw, int i) {
        this.f16990to = new C14112xw(-1L);
        this.f16979du = 0;
        this.f16982h4 = false;
        this.f16987m9 = false;
        this.f16980dy = null;
        this.f16977c5 = null;
        C14112xw c14112xw2 = C14112xw.f47372k4;
        this.f16983jd = c14112xw2;
        this.f16978ck = c14112xw2;
        this.f16981fa = null;
        this.f16991up = k4.m24290k4(0);
        this.f16994yj = false;
        this.f16984k4 = null;
        this.f16986ks = null;
        this.f16989rv = null;
        this.f16993x6 = null;
        this.f16988ne = null;
        this.f16992x1 = null;
        this.f16985kk = null;
        this.f16990to = c14112xw;
        this.f16979du = i;
    }

    /* JADX INFO: renamed from: k4 */
    private int m24269k4(C14112xw c14112xw) {
        m24268fa();
        try {
            return this.f16984k4.exitValue();
        } catch (IllegalThreadStateException unused) {
            return StyleIdentifier.COLORFUL_GRID_ACCENT_6;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static C14112xw m24275x1(int i) {
        throw new InvalidOperationException("Use native API.");
    }

    /* JADX INFO: renamed from: k4 */
    private static long m24270k4(int i, int i2, to<Integer> toVar) {
        throw new InvalidOperationException("Use native API. E.g. GetProcessData() WinApi.");
    }

    /* JADX INFO: renamed from: x1 */
    public String m24287x1() {
        if (this.f16981fa == null) {
            m24268fa();
            String strM24253to = m24278du().m24253to();
            this.f16981fa = strM24253to;
            if (strM24253to == null) {
                throw new InvalidOperationException("Process has exited, so the requested information is not available.");
            }
            if (strM24253to.endsWith(".exe") || this.f16981fa.endsWith(".bat") || this.f16981fa.endsWith(".com")) {
                this.f16981fa = OooO0OO.OooO00o(4, 0, this.f16981fa);
            }
            int iLastIndexOf = this.f16981fa.lastIndexOf("\\/");
            if (iLastIndexOf != -1) {
                this.f16981fa = this.f16981fa.substring(iLastIndexOf + 1);
            }
        }
        return this.f16981fa;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24282k4(C6003h4 c6003h4) {
        if (c6003h4 == null) {
            throw new ArgumentNullException("value");
        }
        this.f16988ne = c6003h4;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m24283k4(int i) {
        m24268fa();
        if ((i == Integer.MAX_VALUE ? -1 : i) == -1) {
            try {
                this.f16984k4.waitFor();
                return true;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i);
        do {
            try {
                Thread.sleep(10L);
                try {
                    this.f16984k4.exitValue();
                    return true;
                } catch (IllegalThreadStateException unused) {
                }
            } catch (InterruptedException e2) {
                C6005k4.m24263kk(e2.getMessage());
                return false;
            }
        } while (System.currentTimeMillis() < jCurrentTimeMillis);
        this.f16984k4.destroy();
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m24271k4(C6003h4 c6003h4, C6008to c6008to) {
        String strM13412x1;
        String[] strArr;
        if (c6003h4 == null) {
            throw new ArgumentNullException("startInfo");
        }
        if (c6003h4.m24253to() == null || c6003h4.m24253to().length() == 0) {
            throw new InvalidOperationException("File name has not been set");
        }
        if (c6003h4.m24252m9() != null && !c6003h4.m24241du()) {
            throw new InvalidOperationException("StandardErrorEncoding is only supported when standard error is redirected");
        }
        if (c6003h4.m24242dy() != null && !c6003h4.m24243h4()) {
            throw new InvalidOperationException("StandardOutputEncoding is only supported when standard output is redirected");
        }
        if (c6003h4.m24239c5() && c6003h4.m24240ck() != null) {
            c6003h4.m24240ck().getClass();
        }
        C6001du c6001du = null;
        File file = (c6003h4.m24244jd() == null || c6003h4.m24244jd().length() <= 0 || !C3142to.m13421kk(c6003h4.m24244jd())) ? null : new File(c6003h4.m24244jd());
        String strM24253to = c6003h4.m24253to();
        if (!c6003h4.m24239c5()) {
            strM13412x1 = C3141rv.m13412x1(C3142to.m13417k4(), c6003h4.m24253to());
            if (C3131h4.m13361kk(strM13412x1)) {
                if (file == null) {
                    file = new File(C3142to.m13417k4());
                }
                strM24253to = strM13412x1;
            }
        } else if (file != null) {
            strM13412x1 = C3141rv.m13412x1(c6003h4.m24244jd(), c6003h4.m24253to());
            if (C3131h4.m13361kk(strM13412x1)) {
                strM24253to = strM13412x1;
            }
        }
        if (c6003h4.m24245k4() != null && c6003h4.m24245k4().trim().length() > 0) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(strM24253to, " ");
            sbOooO0OO.append(c6003h4.m24245k4());
            strM24253to = sbOooO0OO.toString();
        }
        if (c6003h4.m24251kk()) {
            StringDictionary stringDictionaryM24255x1 = c6003h4.m24255x1();
            strArr = new String[stringDictionaryM24255x1.getCount()];
            Iterator it = stringDictionaryM24255x1.getKeys().iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                strArr[i] = next.toString() + "=" + stringDictionaryM24255x1.get_Item(next.toString()).toString() + ";";
                i++;
            }
        } else {
            strArr = null;
        }
        try {
            c6008to.f16984k4 = Runtime.getRuntime().exec(m24272k4(strM24253to), strArr, file);
            c6008to.f16986ks = new C3148wl(new x1(c6008to.f16984k4.getErrorStream(), c6001du));
            c6008to.f16993x6 = new C3148wl(new x1(c6008to.f16984k4.getInputStream(), c6001du));
            c6008to.f16989rv = new C3123ar(new kk(c6008to.f16984k4.getOutputStream(), c6001du));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m24276x1(C14112xw c14112xw) {
        this.f16984k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String[] m24272k4(String str) {
        List list = new List();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == '\r' || cCharAt == ' ') {
                if (z) {
                    i2++;
                } else {
                    list.add(str.substring(i, i2));
                    i = 0;
                    i2 = 0;
                }
            } else if (cCharAt == '\"' || cCharAt == '\'') {
                if (!z && i == 0) {
                    i = i3;
                    i2 = i;
                }
                i2++;
                z = !z;
            } else {
                if (i == 0 && i2 == 0) {
                    i = i3;
                    i2 = i;
                }
                i2++;
            }
        }
        if (i >= 0 && i2 > i) {
            list.add(str.substring(i, i2));
        }
        return (String[]) list.toArray(new String[0]);
    }
}
