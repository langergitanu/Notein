package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p205ji.C5447ar;
import com.aspose.slides.internal.p289n2.C6693kk;
import com.aspose.slides.internal.p289n2.C6695m9;
import com.aspose.slides.internal.p289n2.C6696ne;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14107wz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.WarningType;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.f9 */
/* JADX INFO: loaded from: classes5.dex */
public class C11934f9 {

    /* JADX INFO: renamed from: c5 */
    private C11924bz f40212c5;

    /* JADX INFO: renamed from: ck */
    private Dictionary<String, C11947jw> f40213ck;

    /* JADX INFO: renamed from: dy */
    private C3817h4 f40215dy;

    /* JADX INFO: renamed from: h4 */
    private C14107wz f40217h4;

    /* JADX INFO: renamed from: ix */
    private int f40218ix;

    /* JADX INFO: renamed from: jd */
    private boolean f40219jd;

    /* JADX INFO: renamed from: k4 */
    private C14062gk f40220k4;

    /* JADX INFO: renamed from: kk */
    private int f40221kk;

    /* JADX INFO: renamed from: ks */
    private boolean f40222ks;

    /* JADX INFO: renamed from: m9 */
    private C3817h4 f40223m9;

    /* JADX INFO: renamed from: ne */
    private int f40224ne;

    /* JADX INFO: renamed from: u4 */
    private C5447ar f40227u4;

    /* JADX INFO: renamed from: up */
    private boolean f40228up;

    /* JADX INFO: renamed from: x1 */
    private int f40229x1;

    /* JADX INFO: renamed from: x6 */
    private boolean f40230x6;

    /* JADX INFO: renamed from: du */
    private C14084qq f40214du = new C14084qq();

    /* JADX INFO: renamed from: fa */
    private boolean f40216fa = true;

    /* JADX INFO: renamed from: yj */
    private final Object f40231yj = new Object();

    /* JADX INFO: renamed from: rv */
    private AbstractC11970to f40225rv = null;

    /* JADX INFO: renamed from: to */
    private int f40226to = 0;

    public C11934f9(C14062gk c14062gk, int i, int i2) {
        this.f40220k4 = c14062gk;
        this.f40229x1 = i;
        this.f40221kk = i2;
        C14084qq.m67074c5().CloneTo(this.f40214du);
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ int m55939k4(C11934f9 c11934f9) {
        int i = c11934f9.f40226to;
        c11934f9.f40226to = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: du */
    public void m55945du(boolean z) {
        this.f40228up = z;
    }

    /* JADX INFO: renamed from: dy */
    public C11924bz m55947dy() {
        C11924bz c11924bzM56277to;
        synchronized (this.f40231yj) {
            try {
                c11924bzM56277to = this.f40212c5;
                if (c11924bzM56277to == null) {
                    String strM66678du = this.f40220k4.m66678du();
                    if (this.f40220k4.m66681h4() == 4 || this.f40220k4.m66681h4() == 3) {
                        if (this.f40220k4.m66681h4() == 4) {
                            strM66678du = C14113y2.m67443x1(strM66678du, 1, strM66678du.length() - 2);
                        }
                        C11924bz c11924bz = new C11924bz();
                        this.f40212c5 = c11924bz;
                        c11924bz.m55879k4(new C11972ts[]{C11972ts.m56130k4(strM66678du)});
                        c11924bzM56277to = this.f40212c5;
                    } else {
                        try {
                            c11924bzM56277to = C11988x6.m56277to(strM66678du);
                            this.f40212c5 = c11924bzM56277to;
                        } catch (RuntimeException unused) {
                            return null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11924bzM56277to;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m55948h4() {
        return this.f40219jd;
    }

    /* JADX INFO: renamed from: kk */
    public C14107wz m55958kk() {
        return this.f40217h4;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m55960m9() {
        return this.f40228up;
    }

    /* JADX INFO: renamed from: to */
    public void m55961to(boolean z) {
        this.f40219jd = z;
    }

    /* JADX INFO: renamed from: x1 */
    public int m55963x1() {
        return this.f40229x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C11947jw m55940k4(String str) {
        if (str == null) {
            str = "";
        }
        C11947jw[] c11947jwArr = {null};
        Dictionary<String, C11947jw> dictionary = this.f40213ck;
        boolean z = dictionary != null && dictionary.tryGetValue(str, c11947jwArr);
        C11947jw c11947jw = c11947jwArr[0];
        if (z) {
            return c11947jw;
        }
        C11947jw c11947jw2 = new C11947jw(this, str);
        c11947jw2.f40262k4.mo27432x1(new C11969t6(this));
        if (this.f40213ck == null) {
            this.f40213ck = new Dictionary<>();
        }
        this.f40213ck.addItem(str, c11947jw2);
        return c11947jw2;
    }

    /* JADX INFO: renamed from: du */
    public boolean m55946du() {
        return this.f40216fa;
    }

    /* JADX INFO: renamed from: kk */
    public void m55959kk(boolean z) {
        this.f40216fa = z;
    }

    /* JADX INFO: renamed from: to */
    public boolean m55962to() {
        return this.f40222ks;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55964x1(boolean z) {
        this.f40222ks = z;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC14049c6 m55949k4(C11975um c11975um, String str) {
        C11917ai c11917aiM55985k4;
        synchronized (this) {
            try {
                boolean[] zArr = {false};
                c11917aiM55985k4 = m55940k4(str).m55985k4(c11975um, zArr);
                if (zArr[0]) {
                    this.f40226to++;
                    if (this.f40227u4 == null) {
                        C11990xw c11990xw = new C11990xw(this);
                        int i = this.f40221kk;
                        this.f40227u4 = new C5447ar(c11990xw, null, i, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11917aiM55985k4.m55852k4(c11975um);
    }

    /* JADX INFO: renamed from: k4 */
    public C14062gk m55950k4() {
        return this.f40220k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55951k4(C3817h4 c3817h4, C3817h4 c3817h42) {
        this.f40223m9 = c3817h42;
        this.f40215dy = c3817h4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55952k4(C6695m9 c6695m9) {
        boolean z = this.f40230x6;
        if (z) {
            byte[] bArr = new byte[12];
            m55944k4(bArr, C7019kk.m27435du(Integer.valueOf(z ? 1 : 0), 9), 0);
            m55944k4(bArr, C7019kk.m27435du(Integer.valueOf(this.f40224ne), 9), 4);
            m55944k4(bArr, C7019kk.m27435du(Integer.valueOf(this.f40218ix), 9), 8);
            c6695m9.m26475k4(C6693kk.f18522x6, bArr, (byte[]) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55942k4(C11947jw c11947jw) {
        Dictionary<String, C11947jw> dictionary = this.f40213ck;
        if (dictionary == null || dictionary.size() == 0) {
            throw new InvalidOperationException();
        }
        this.f40213ck.removeItemByKey(c11947jw.m55986k4());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55953k4(C14107wz c14107wz) {
        this.f40217h4 = c14107wz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m55943k4(Object obj) {
        C14084qq c14084qq = new C14084qq();
        C14084qq[] c14084qqArr = {c14084qq};
        m55957k4(c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55954k4(boolean z) {
        m55959kk(z);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55955k4(boolean z, int i, int i2) {
        if (z) {
            if (i <= 0) {
                throw new ArgumentOutOfRangeException("keepAliveTime", "Must be greater than 0");
            }
            if (i2 <= 0) {
                throw new ArgumentOutOfRangeException("keepAliveInterval", "Must be greater than 0");
            }
        }
        this.f40230x6 = z;
        this.f40224ne = i;
        this.f40218ix = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55944k4(byte[] bArr, long j, int i) {
        bArr[i] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) & C7019kk.m27435du((Object) 255, 9)), 10)), 10);
        bArr[i + 1] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) & C7019kk.m27435du((Object) 65280, 9)), 10) >> 8), 10)), 10);
        bArr[i + 2] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) & C7019kk.m27435du(Integer.valueOf(WarningType.MINOR_FORMATTING_LOSS_CATEGORY), 9)), 10) >> 16), 10)), 10);
        bArr[i + 3] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) & C7019kk.m27435du((Object) 4278190080L, 10)), 10) >> 24), 10)), 10);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55956k4(C6695m9 c6695m9, C11932e0 c11932e0) {
        if (this.f40225rv == null) {
            return true;
        }
        int i = 0;
        while (true) {
            try {
                C11932e0 c11932e0M56114k4 = this.f40225rv.m56114k4(this, c11932e0, i);
                if (c11932e0M56114k4 == null) {
                    return true;
                }
                try {
                    c6695m9.m26481k4(c11932e0M56114k4);
                    return true;
                } catch (C6696ne unused) {
                    i++;
                }
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55957k4(C14084qq[] c14084qqArr) {
        C14084qq c14084qq = C14084qq.f47299x1;
        c14084qq.CloneTo(c14084qqArr[0]);
        C14077m4 c14077m4 = new C14077m4();
        synchronized (this) {
            Dictionary<String, C11947jw> dictionary = this.f40213ck;
            if (dictionary != null && dictionary.size() != 0) {
                C14077m4.m66794du(C7019kk.m27433c5(Integer.valueOf(this.f40221kk), 9)).CloneTo(c14077m4);
                List list = null;
                for (C11947jw c11947jw : new List(this.f40213ck.getValues())) {
                    if (c11947jw.m55987k4(c14077m4.Clone(), c14084qqArr)) {
                        if (list == null) {
                            list = new List();
                        }
                        list.addItem(c11947jw);
                    }
                }
                synchronized (this) {
                    try {
                        c14084qqArr[0].CloneTo(this.f40214du);
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                m55942k4((C11947jw) it.next());
                            }
                        }
                        Dictionary<String, C11947jw> dictionary2 = this.f40213ck;
                        if (dictionary2 != null && dictionary2.size() == 0) {
                            this.f40213ck = null;
                        }
                        if (this.f40213ck != null) {
                            return false;
                        }
                        C5447ar c5447ar = this.f40227u4;
                        if (c5447ar != null) {
                            c5447ar.dispose();
                            this.f40227u4 = null;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            c14084qq.CloneTo(this.f40214du);
            return true;
        }
    }
}
