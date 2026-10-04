package com.aspose.slides;

import android.content.pm.PackageManager;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3055gk;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p099e3.C3551h4;
import com.aspose.slides.internal.p099e3.C3552k4;
import com.aspose.slides.internal.p099e3.C3553kk;
import com.aspose.slides.internal.p099e3.C3554m9;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p148gb.C4255x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p300nj.AbstractC6913k4;
import com.aspose.slides.internal.p300nj.C6911du;
import com.aspose.slides.internal.p300nj.C6912h4;
import com.aspose.slides.internal.p300nj.C6914kk;
import com.aspose.slides.internal.p300nj.C6915to;
import com.aspose.slides.internal.p300nj.C6916x1;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p324oq.C7138x1;
import com.aspose.slides.internal.p379rg.C10006k4;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p404sp.C10312kk;
import com.aspose.slides.internal.p404sp.C10314to;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zny {

    /* JADX INFO: renamed from: fa */
    private int f50644fa;

    /* JADX INFO: renamed from: rv */
    private final C14726w7 f50651rv;

    /* JADX INFO: renamed from: up */
    private int f50653up;

    /* JADX INFO: renamed from: k4 */
    static final C3982jd f50639k4 = m74678m9();

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f50638ix = new C7017h4("image/x-wmf", "image/x-emf", "image/jpeg");

    /* JADX INFO: renamed from: yj */
    private final Dictionary<String, Integer> f50656yj = new Dictionary<>();

    /* JADX INFO: renamed from: ks */
    private final Dictionary<String, String> f50648ks = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    final List<String> f50647kk = new List<>();

    /* JADX INFO: renamed from: x6 */
    private dnm[] f50655x6 = new dnm[0];

    /* JADX INFO: renamed from: ne */
    private String[] f50650ne = new String[0];

    /* JADX INFO: renamed from: to */
    final Dictionary<String, C14906x1> f50652to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    final Dictionary<String, C14903k4> f50642du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    final Dictionary<String, C14904kk> f50645h4 = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    final Dictionary<String, C14902h4> f50649m9 = new Dictionary<>();

    /* JADX INFO: renamed from: dy */
    final Dictionary<String, C14905to> f50643dy = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    final Dictionary<String, C14901du> f50640c5 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    final Dictionary<String, String> f50654x1 = new Dictionary<>();

    /* JADX INFO: renamed from: jd */
    final Dictionary<String, Object> f50646jd = new Dictionary<>();

    /* JADX INFO: renamed from: ck */
    List<String> f50641ck = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.zny$du */
    public static final class C14901du {

        /* JADX INFO: renamed from: k4 */
        String f50661k4;

        /* JADX INFO: renamed from: to */
        v2z f50663to;

        /* JADX INFO: renamed from: x1 */
        C12007ix f50664x1 = new C12007ix();

        /* JADX INFO: renamed from: kk */
        C12007ix f50662kk = new C12007ix();

        public C14901du(String str, C12007ix c12007ix, C12007ix c12007ix2, v2z v2zVar) {
            this.f50661k4 = str;
            c12007ix.CloneTo(this.f50664x1);
            c12007ix2.CloneTo(this.f50662kk);
            this.f50663to = v2zVar;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.zny$h4 */
    public static final class C14902h4 {

        /* JADX INFO: renamed from: du */
        int f50665du;

        /* JADX INFO: renamed from: h4 */
        int f50666h4;

        /* JADX INFO: renamed from: k4 */
        SortedList<Float, C12003du> f50667k4;

        /* JADX INFO: renamed from: kk */
        int f50668kk;

        /* JADX INFO: renamed from: to */
        int f50669to;

        /* JADX INFO: renamed from: x1 */
        int f50670x1;

        public C14902h4(SortedList<Float, C12003du> sortedList, int i, int i2, int i3, int i4, int i5) {
            this.f50667k4 = sortedList;
            this.f50670x1 = i;
            this.f50668kk = i2;
            this.f50669to = i3;
            this.f50665du = i4;
            this.f50666h4 = i5;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.zny$k4 */
    public static final class C14903k4 {

        /* JADX INFO: renamed from: du */
        final C12003du f50671du;

        /* JADX INFO: renamed from: h4 */
        final float f50672h4;

        /* JADX INFO: renamed from: k4 */
        final byte f50673k4;

        /* JADX INFO: renamed from: kk */
        final byte f50674kk;

        /* JADX INFO: renamed from: m9 */
        final float f50675m9;

        /* JADX INFO: renamed from: to */
        final boolean f50676to;

        /* JADX INFO: renamed from: x1 */
        final byte f50677x1;

        public C14903k4(byte b, byte b2, byte b3, boolean z, C12003du c12003du, float f, float f2) {
            C12003du c12003du2 = new C12003du();
            this.f50671du = c12003du2;
            this.f50673k4 = b;
            this.f50677x1 = b2;
            this.f50674kk = b3;
            this.f50676to = z;
            c12003du.CloneTo(c12003du2);
            this.f50672h4 = f;
            this.f50675m9 = f2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.zny$kk */
    public static final class C14904kk {

        /* JADX INFO: renamed from: k4 */
        int f50678k4;

        /* JADX INFO: renamed from: kk */
        int f50679kk;

        /* JADX INFO: renamed from: to */
        int f50680to;

        /* JADX INFO: renamed from: x1 */
        SortedList<Float, C12003du> f50681x1;

        public C14904kk(int i, SortedList<Float, C12003du> sortedList, int i2, int i3) {
            this.f50678k4 = i;
            this.f50681x1 = sortedList;
            this.f50679kk = i2;
            this.f50680to = i3;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.zny$to */
    public static final class C14905to {

        /* JADX INFO: renamed from: du */
        int f50682du;

        /* JADX INFO: renamed from: h4 */
        v2z f50683h4;

        /* JADX INFO: renamed from: k4 */
        String f50684k4;

        /* JADX INFO: renamed from: kk */
        int f50685kk;

        /* JADX INFO: renamed from: to */
        int f50686to;

        /* JADX INFO: renamed from: x1 */
        int f50687x1;

        public C14905to(String str, int i, int i2, int i3, int i4, v2z v2zVar) {
            this.f50684k4 = str;
            this.f50687x1 = i;
            this.f50685kk = i2;
            this.f50686to = i3;
            this.f50682du = i4;
            this.f50683h4 = v2zVar;
        }

        public C14905to(String str, int i, int i2, v2z v2zVar) {
            this.f50684k4 = str;
            this.f50685kk = 0;
            this.f50687x1 = 0;
            this.f50686to = i;
            this.f50682du = i2;
            this.f50683h4 = v2zVar;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.zny$x1 */
    public static final class C14906x1 implements IDisposable {

        /* JADX INFO: renamed from: du */
        boolean f50688du;

        /* JADX INFO: renamed from: h4 */
        C3977ck f50689h4;

        /* JADX INFO: renamed from: k4 */
        C7131h4 f50690k4;

        /* JADX INFO: renamed from: kk */
        C12023wl f50691kk = new C12023wl();

        /* JADX INFO: renamed from: to */
        C12007ix f50692to = new C12007ix();

        /* JADX INFO: renamed from: x1 */
        C7131h4 f50693x1;

        public C14906x1(C7131h4 c7131h4, C7131h4 c7131h42, C12023wl c12023wl, C12007ix c12007ix, boolean z, C3977ck c3977ck) {
            this.f50690k4 = c7131h4;
            this.f50693x1 = c7131h42;
            c12023wl.CloneTo(this.f50691kk);
            c12007ix.CloneTo(this.f50692to);
            this.f50689h4 = c3977ck;
            this.f50688du = z;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            C7131h4 c7131h4 = this.f50690k4;
            if (c7131h4 != null) {
                c7131h4.m27678kk().dispose();
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final C7131h4 m74709k4() {
            C7131h4 c7131h4 = this.f50690k4;
            return c7131h4 == null ? this.f50693x1 : c7131h4;
        }
    }

    public zny(C14726w7 c14726w7) {
        this.f50651rv = c14726w7;
    }

    /* JADX INFO: renamed from: h4 */
    private String m74654h4() {
        return C14113y2.m67402k4("page{0}-pic", Integer.valueOf(m74705x1()));
    }

    /* JADX INFO: renamed from: k4 */
    private static float m74655k4(float f, float f2, float f3) {
        double d = ((double) (f3 / 180.0f)) * 3.141592653589793d;
        return (float) ((C14116yg.m67495m9(d) * ((double) f2)) + (C14116yg.m67470dy(d) * ((double) f)));
    }

    /* JADX INFO: renamed from: m9 */
    private static C3982jd m74678m9() {
        for (C3982jd c3982jd : C3982jd.m15697k4()) {
            if ("image/jpeg".equals(c3982jd.m15699h4())) {
                return c3982jd;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010e A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000d, B:5:0x0013, B:8:0x0026, B:12:0x004d, B:14:0x008e, B:19:0x009a, B:54:0x01db, B:55:0x01de, B:29:0x00b2, B:31:0x00c5, B:32:0x00cc, B:34:0x0101, B:35:0x010e, B:37:0x011f, B:40:0x0141, B:44:0x014e, B:45:0x0164, B:47:0x016a, B:48:0x0189, B:49:0x0197, B:51:0x019e, B:52:0x01c1, B:39:0x0131, B:18:0x0097), top: B:82:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000d, B:5:0x0013, B:8:0x0026, B:12:0x004d, B:14:0x008e, B:19:0x009a, B:54:0x01db, B:55:0x01de, B:29:0x00b2, B:31:0x00c5, B:32:0x00cc, B:34:0x0101, B:35:0x010e, B:37:0x011f, B:40:0x0141, B:44:0x014e, B:45:0x0164, B:47:0x016a, B:48:0x0189, B:49:0x0197, B:51:0x019e, B:52:0x01c1, B:39:0x0131, B:18:0x0097), top: B:82:0x000d }] */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m74679to(C3552k4 c3552k4) {
        C3181c5 c3181c5M74657k4;
        Dictionary.Enumerator<String, C14903k4> it = this.f50642du.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f50646jd.containsKey((String) next.getKey())) {
                    this.f50646jd.addItem((String) next.getKey(), next.getValue());
                    C14903k4 c14903k4 = (C14903k4) next.getValue();
                    int i = (1 << c14903k4.f50677x1) + 1;
                    int i2 = (1 << c14903k4.f50674kk) + 1;
                    float f = c14903k4.f50672h4;
                    if (f <= 1.0f) {
                        f = 1.0f;
                    }
                    C6914kk c6914kk = new C6914kk();
                    c6914kk.m13637m9((String) next.getKey());
                    c6914kk.m27080ck("userSpaceOnUse");
                    float f2 = 12.0f * f;
                    c6914kk.m27088x1(C10307du.m50263kk(f2));
                    float f3 = 7.0f * f;
                    c6914kk.m27085kk(C10307du.m50263kk(f3));
                    c6914kk.m27084k4(new C10310jd((-6.0f) * f, f * (-3.5f), f2, f3));
                    c6914kk.m27083jd("auto");
                    float f4 = c14903k4.f50676to ? -c14903k4.f50675m9 : c14903k4.f50675m9;
                    C6765kp c6765kp = new C6765kp();
                    byte b = c14903k4.f50673k4;
                    if (b == 1 || b == 2 || b == 3) {
                        C11896dy c11896dyM3893k4 = azo.m3893k4(b, c14903k4.f50677x1, c14903k4.f50674kk, new float[]{0.0f});
                        c11896dyM3893k4.m55577x1(c14903k4.f50676to ? new C11913yj(0.0f, 1.0f, -1.0f, 0.0f, f4, 0.0f) : new C11913yj(0.0f, -1.0f, 1.0f, 0.0f, f4, 0.0f));
                        if (c11896dyM3893k4.m55525du() > 0 && f > 1.0f) {
                            C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c11896dyM3893k4.m55525du()));
                            for (int i3 = 0; i3 < c11896dyM3893k4.m55525du(); i3++) {
                                c12025x6Arr[i3] = new C12025x6(c11896dyM3893k4.m55565kk()[i3].m56897x1() * f, c11896dyM3893k4.m55565kk()[i3].m56895kk() * f);
                            }
                            c11896dyM3893k4 = new C11896dy(c12025x6Arr, c11896dyM3893k4.m55571to(), c11896dyM3893k4.m55531k4());
                        }
                        C3055gk.m12935k4(c11896dyM3893k4, c6765kp, c6765kp);
                        if (c14903k4.f50673k4 == 5) {
                            C7138x1 c7138x1M74657k4 = m74657k4(c6765kp.toString(), (C14093tq<C12003du>) new C14093tq(), (C14093tq<C12003du>) new C14093tq(c14903k4.f50671du.Clone()));
                            c7138x1M74657k4.m13657k4(C10307du.m50263kk(f));
                            c7138x1M74657k4.m13656k4(1);
                            c3181c5M74657k4 = c7138x1M74657k4;
                        } else {
                            c3181c5M74657k4 = m74657k4(c6765kp.toString(), (C14093tq<C12003du>) new C14093tq(c14903k4.f50671du.Clone()), (C14093tq<C12003du>) new C14093tq());
                        }
                        if (c3181c5M74657k4 != null) {
                            c6914kk.m13635k4(c3181c5M74657k4);
                        }
                        c3552k4.m13635k4(c6914kk);
                    } else {
                        if (b == 4) {
                            C4255x1 c4255x1 = new C4255x1();
                            if (C14116yg.m67480k4(f4) > 0.1d) {
                                c4255x1.m17106x1(C10307du.m50263kk(f4));
                            }
                            c4255x1.m17103kk(C10307du.m50263kk(i * f * 0.5f));
                            c4255x1.m17104to(C10307du.m50263kk(i2 * f * 0.5f));
                            C12003du c12003duClone = c14903k4.f50671du.Clone();
                            c4255x1.m13669to(new C10314to(c12003duClone.Clone()).toString());
                            c3181c5M74657k4 = c4255x1;
                            if ((c12003duClone.m56501c5() & 255) < 255) {
                                c4255x1.m13672x1(vhx.m72263x1(c12003duClone.Clone()));
                                c3181c5M74657k4 = c4255x1;
                            }
                        } else if (b != 5) {
                            c3181c5M74657k4 = null;
                        }
                        if (c3181c5M74657k4 != null) {
                        }
                        c3552k4.m13635k4(c6914kk);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        Dictionary.Enumerator<String, C14903k4> it2 = this.f50642du.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next2 = it2.next();
                if (!this.f50646jd.containsKey((String) next2.getKey())) {
                    this.f50646jd.addItem((String) next2.getKey(), next2.getValue());
                    String string = ((C14903k4) next2.getValue()).toString();
                    C3554m9 c3554m9 = new C3554m9();
                    c3554m9.m14461jd(C14113y2.m67402k4("#{0}", string));
                    C3181c5 c10006k4 = new C10006k4();
                    c10006k4.m13637m9((String) next2.getKey());
                    c10006k4.m13635k4(c3554m9);
                    c3552k4.m13635k4(c10006k4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m74684du() {
        m74699k4(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    /* JADX INFO: renamed from: kk */
    public final String m74702kk(String str) {
        int i = this.f50644fa;
        this.f50644fa = i + 1;
        String strM67408k4 = C14113y2.m67408k4("clp_", C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()));
        if (this.f50654x1.containsKey(str)) {
            return this.f50654x1.get_Item(str);
        }
        this.f50654x1.addItem(str, strM67408k4);
        return strM67408k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m74705x1() {
        return this.f50653up;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m74656k4(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = (f2 - f4) / f5;
        return (float) C14116yg.m67496rv((f7 * f7) + (f6 * f6));
    }

    /* JADX INFO: renamed from: kk */
    private void m74676kk(C3552k4 c3552k4) {
        Dictionary.Enumerator<String, C14901du> it = this.f50640c5.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f50646jd.containsKey((String) next.getKey())) {
                    this.f50646jd.addItem((String) next.getKey(), next.getValue());
                    C14901du c14901du = (C14901du) next.getValue();
                    C6915to c6915to = new C6915to();
                    c6915to.m13637m9((String) next.getKey());
                    c6915to.m27106x1(C10307du.m50263kk(c14901du.f50662kk.m56557jd()));
                    c6915to.m27101kk(C10307du.m50263kk(c14901du.f50662kk.m56551ck()));
                    c6915to.m27103to(C10307du.m50263kk(c14901du.f50664x1.m56550c5()));
                    c6915to.m27095du(C10307du.m50263kk(c14901du.f50664x1.m56575x1()));
                    c6915to.m27102m9(0);
                    C3554m9 c3554m9 = new C3554m9();
                    c3554m9.m14465to(C10307du.m50263kk(c14901du.f50662kk.m56550c5()));
                    c3554m9.m14460du(C10307du.m50263kk(c14901du.f50662kk.m56575x1()));
                    c3554m9.m14461jd(C14113y2.m67402k4("#{0}", c14901du.f50661k4));
                    c3554m9.m14463k4(new C10312kk(0));
                    String strM72067x1 = v2z.m72067x1(c14901du.f50663to);
                    if (strM72067x1 != null) {
                        c3554m9.m13630c5(strM72067x1);
                    }
                    c6915to.m13635k4(c3554m9);
                    c3552k4.m13635k4(c6915to);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static SortedList<Float, C12003du> m74680x1(C14478sy c14478sy) {
        int iM56507jd;
        int iOooO00o;
        int iOooO00o2;
        SortedList<Float, C12003du> sortedListM70902yj = c14478sy.m70902yj();
        if (sortedListM70902yj != null) {
            return sortedListM70902yj;
        }
        C12003du c12003duClone = c14478sy.m5676k4().Clone();
        C12003du c12003duClone2 = c14478sy.m5682x1().Clone();
        if (c14478sy.m70886jd() == 1) {
            int iM70897up = c14478sy.m70897up();
            if (iM70897up < 10) {
                iM56507jd = ((c12003duClone.m56507jd() & 255) * iM70897up) / 9;
                iOooO00o = ((c12003duClone.m56502ck() & 255) * iM70897up) / 9;
                iOooO00o2 = ((c12003duClone.m56505fa() & 255) * iM70897up) / 9;
            } else {
                int i = iM70897up - 9;
                int iM56507jd2 = (((255 - (c12003duClone.m56507jd() & 255)) * i) / 10) + (c12003duClone.m56507jd() & 255);
                iM56507jd = iM56507jd2;
                iOooO00o = com.aspose.slides.internal.p497xc.OooO00o.OooO00o(255, c12003duClone.m56502ck() & 255, i, 10) + (c12003duClone.m56502ck() & 255);
                iOooO00o2 = com.aspose.slides.internal.p497xc.OooO00o.OooO00o(255, c12003duClone.m56505fa() & 255, i, 10) + (c12003duClone.m56505fa() & 255);
            }
            C12003du.m56398k4(c14478sy.m5682x1().m56501c5() & 255, iM56507jd, iOooO00o, iOooO00o2).CloneTo(c12003duClone2);
        }
        SortedList<Float, C12003du> sortedList = new SortedList<>(2);
        sortedList.set_Item(Float.valueOf(0.0f), c12003duClone.Clone());
        sortedList.set_Item(Float.valueOf(1.0f), c12003duClone2.Clone());
        return sortedList;
    }

    /* JADX INFO: renamed from: to */
    public final String[] m74704to() {
        return this.f50650ne;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m74677kk(vhx vhxVar, C3552k4 c3552k4) throws Throwable {
        byte[] bArrM74683x1;
        byte[] bArrM74683x12;
        byte[] bArrM74683x13;
        zny znyVar = this;
        if (vhxVar.m72284v4().getVectorizeText() || vhxVar.m72284v4().getExternalFontsHandling() == 2) {
            return;
        }
        List.Enumerator<String> it = znyVar.f50647kk.iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                String[] strArr = {null};
                byte[][] bArr = {null};
                boolean zM74675k4 = znyVar.m74675k4(next, strArr, bArr);
                String str = strArr[0];
                byte[] bArr2 = bArr[0];
                if (zM74675k4 && !znyVar.f50641ck.containsItem(next)) {
                    try {
                        if (vhxVar.m72284v4().getExternalFontsHandling() == 1) {
                            bArrM74683x1 = bArr2 == null ? znyVar.m74683x1(next, str) : bArr2;
                            bArrM74683x13 = bArr2 == null ? znyVar.m74683x1(next, C14113y2.m67401k4(str, ".ttf", ".eot")) : bArr2;
                            bArrM74683x12 = bArr2 == null ? znyVar.m74683x1(next, C14113y2.m67401k4(str, ".ttf", ".woff")) : bArr2;
                        } else {
                            bArrM74683x1 = null;
                            bArrM74683x12 = null;
                            bArrM74683x13 = null;
                        }
                        C6765kp c6765kp = new C6765kp();
                        znyVar.m74670k4(vhxVar, c6765kp, next);
                        if (vhxVar.m72284v4().getExternalFontsHandling() == 0) {
                            c6765kp.m26792k4(", ");
                            c6765kp.m26792k4("url(\"");
                            if (znyVar.m74703kk().length > 0) {
                                try {
                                    if (vhxVar.m72285x1(next)) {
                                        c6765kp = new C6765kp();
                                        c6765kp.m26792k4(C14113y2.m67408k4("@font-face { font-family: \"", C3085sv.m13066du(next), "\"; "));
                                        c6765kp.m26792k4("src: url(\"");
                                    }
                                    znyVar.m74664k4(vhxVar.m72284v4(), c6765kp, bArr2, "data:application/x-font-ttf;charset=utf-8;base64,", "ttf");
                                    if (vhxVar.m72285x1(next)) {
                                        c6765kp.m26792k4("\")}");
                                    } else {
                                        c6765kp.m26792k4("\") format('truetype')}");
                                    }
                                    znyVar = this;
                                } catch (Throwable th) {
                                    th = th;
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                    throw th;
                                }
                            } else if (C14113y2.m67411k4(str)) {
                                znyVar = this;
                                znyVar.m74664k4(vhxVar.m72284v4(), c6765kp, bArr2, "data:application/x-font-ttf;charset=utf-8;base64,", "ttf");
                            } else {
                                znyVar = this;
                                znyVar.m74666k4(c6765kp, C14113y2.m67393k4(str, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
                                c6765kp.m26792k4("\") format('truetype')}");
                            }
                        } else {
                            boolean z = bArrM74683x1 != null;
                            boolean z2 = bArrM74683x12 != null;
                            boolean z3 = bArrM74683x13 != null;
                            String str2 = z ? "data:application/x-font-ttf;charset=utf-8;base64," : z2 ? "data:application/x-font-woff;charset=utf-8;base64," : z3 ? "data:application/vnd.ms-fontobject;charset=utf-8;base64," : null;
                            if (!z) {
                                bArrM74683x1 = z2 ? bArrM74683x12 : z3 ? bArrM74683x13 : null;
                            }
                            String str3 = z ? "ttf" : z2 ? "woff" : z3 ? "eot" : null;
                            C6765kp c6765kp2 = new C6765kp();
                            c6765kp2.m26792k4(C14113y2.m67408k4("@font-face { font-family: \"", vhxVar.m72285x1(next) ? C3085sv.m13066du(next) : next, "\"; "));
                            c6765kp2.m26792k4("src: url(\"");
                            String str4 = str3;
                            c6765kp = c6765kp2;
                            znyVar.m74664k4(vhxVar.m72284v4(), c6765kp, bArrM74683x1, str2, str4);
                            c6765kp.m26792k4("\")}");
                        }
                        znyVar.f50641ck.addItem(next);
                        C10229k4 c10229k4 = new C10229k4(C14113y2.m67402k4("<![CDATA[{0}]]>", c6765kp), true);
                        C3182du c3182du = new C3182du("style");
                        c3182du.f9461x1.set_Item(C18437z2.f56754h, "text/css");
                        c3182du.m13635k4(c10229k4);
                        c3552k4.m13635k4(c3182du);
                    } catch (IOException e) {
                        C3085sv.m13082k4(e);
                        vhxVar.m72284v4().getWarningCallback();
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return;
        }
        it.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final C3552k4 m74685k4(vhx vhxVar) {
        C3552k4 c3552k4 = new C3552k4();
        m74669k4(vhxVar, c3552k4);
        m74665k4(c3552k4);
        m74681x1(c3552k4);
        m74682x1(vhxVar, c3552k4);
        m74676kk(c3552k4);
        m74679to(c3552k4);
        m74677kk(vhxVar, c3552k4);
        return c3552k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m74706x1(String str) {
        Integer[] numArr = {0};
        this.f50656yj.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue() + 1;
        this.f50656yj.set_Item(str, Integer.valueOf(iIntValue));
        return C14113y2.m67408k4(str, C14057f9.m66591x1(iIntValue));
    }

    /* JADX INFO: renamed from: k4 */
    private static C7138x1 m74657k4(String str, C14093tq<C12003du> c14093tq, C14093tq<C12003du> c14093tq2) {
        C7138x1 c7138x1 = new C7138x1();
        c7138x1.m27686jd(str);
        if (c14093tq.m67302x1()) {
            C12003du c12003duClone = c14093tq.m67297k4().Clone();
            c7138x1.m13669to(new C10314to(c12003duClone.Clone()).toString());
            if ((c12003duClone.m56501c5() & 255) < 255) {
                c7138x1.m13672x1(vhx.m72263x1(c12003duClone.Clone()));
            }
        } else {
            c7138x1.m13669to("none");
        }
        if (c14093tq2.m67302x1()) {
            C12003du c12003duClone2 = c14093tq2.m67297k4().Clone();
            c7138x1.m13661kk(new C10314to(c12003duClone2.Clone()).toString());
            if ((c12003duClone2.m56501c5() & 255) < 255) {
                c7138x1.m13655k4(vhx.m72263x1(c12003duClone2.Clone()));
            }
        }
        return c7138x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m74681x1(C3552k4 c3552k4) {
        Dictionary.Enumerator<String, C14902h4> it = this.f50649m9.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f50646jd.containsKey((String) next.getKey())) {
                    this.f50646jd.addItem((String) next.getKey(), next.getValue());
                    C14902h4 c14902h4 = (C14902h4) next.getValue();
                    float f = c14902h4.f50666h4 / 16.0f;
                    float f2 = c14902h4.f50668kk / f;
                    C6911du c6911du = new C6911du();
                    c6911du.m13637m9((String) next.getKey());
                    c6911du.m27054x1(C10307du.m50263kk(vhx.m72225k4(c14902h4.f50670x1)));
                    c6911du.m27050kk(C10307du.m50263kk(vhx.m72225k4(f2)));
                    c6911du.m27053to(C10307du.m50263kk(vhx.m72225k4(c14902h4.f50669to)));
                    if (c14902h4.f50666h4 != 16) {
                        c6911du.m27067jd(C14113y2.m67407k4("scale(1, ", C13850af.m65102k4(f), ')'));
                    }
                    c6911du.m27066dy(1);
                    c6911du.m27072m9(0);
                    m74668k4(c6911du, c14902h4.f50667k4);
                    c3552k4.m13635k4(c6911du);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final dnm[] m74703kk() {
        return this.f50655x6;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m74658k4(C12007ix c12007ix) {
        float fM67477k4 = (float) C14116yg.m67477k4(c12007ix.m56557jd(), 2);
        float fM67477k42 = (float) C14116yg.m67477k4(c12007ix.m56551ck(), 2);
        int iM27462to = C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13);
        if (iM27462to < c12007ix.m56550c5() && iM27462to / 100 > 0.5f) {
            iM27462to = C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5() + 0.5f), 13);
        }
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13);
        if (iM27462to2 < c12007ix.m56575x1() && iM27462to2 / 100 > 0.5f) {
            iM27462to2 = C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1() + 0.5f), 13);
        }
        return new C12007ix(fM67477k4, fM67477k42, iM27462to, iM27462to2);
    }

    /* JADX INFO: renamed from: x1 */
    private void m74682x1(vhx vhxVar, C3552k4 c3552k4) {
        Dictionary.Enumerator<String, C14905to> it = this.f50643dy.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f50646jd.containsKey((String) next.getKey())) {
                    this.f50646jd.addItem((String) next.getKey(), next.getValue());
                    C14905to c14905to = (C14905to) next.getValue();
                    C6915to c6915to = new C6915to();
                    c6915to.m13637m9((String) next.getKey());
                    c6915to.m27103to(C10307du.m50263kk(c14905to.f50686to * vhxVar.m72268bv()));
                    c6915to.m27095du(C10307du.m50263kk(c14905to.f50682du * vhxVar.m72268bv()));
                    c6915to.m27102m9(0);
                    String strM72067x1 = v2z.m72067x1(c14905to.f50683h4);
                    if (strM72067x1 != null) {
                        c6915to.m27097jd(strM72067x1);
                    }
                    C3554m9 c3554m9 = new C3554m9();
                    c3554m9.m14465to(C10307du.m50263kk(c14905to.f50686to * vhxVar.m72268bv()));
                    c3554m9.m14460du(C10307du.m50263kk(c14905to.f50682du * vhxVar.m72268bv()));
                    c3554m9.m14461jd(C14113y2.m67402k4("#{0}", c14905to.f50684k4));
                    c6915to.m13635k4(c3554m9);
                    c3552k4.m13635k4(c6915to);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12023wl m74659k4(vhx vhxVar, C12015qq c12015qq) {
        C12025x6[] c12025x6Arr = {new C12025x6(c12015qq.m56699x1(), 0.0f), new C12025x6(0.0f, c12015qq.m56697kk())};
        C3108y2.m13226k4(vhxVar.m72280lr(), c12025x6Arr);
        C12025x6 c12025x6Clone = c12025x6Arr[0].Clone();
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Clone, c12025x6Clone.m56895kk(), c12025x6Clone.m56897x1() * c12025x6Clone.m56897x1())) + 0.5d), 14);
        c12025x6Arr[1].CloneTo(c12025x6Clone);
        return new C12023wl(iM27462to, C7019kk.m27462to(Double.valueOf(C14116yg.m67496rv(com.aspose.slides.internal.p040bg.OooO00o.OooO00o(c12025x6Clone, c12025x6Clone.m56895kk(), c12025x6Clone.m56897x1() * c12025x6Clone.m56897x1())) + 0.5d), 14));
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m74683x1(String str, String str2) {
        C3130fa c3130faM13363to = null;
        if (!C3131h4.m13361kk(str2)) {
            return null;
        }
        try {
            c3130faM13363to = C3131h4.m13363to(str2);
            byte[] bArr = new byte[(int) c3130faM13363to.getLength()];
            if (c3130faM13363to.read(bArr, 0, r0) != c3130faM13363to.getLength()) {
                throw new IOException(C14113y2.m67408k4(C14113y2.m67358c5(C3141rv.m13397du(str2)), " font file content for '", str, "' font wasn't read correctly."));
            }
            c3130faM13363to.close();
            c3130faM13363to.dispose();
            return bArr;
        } catch (Throwable th) {
            if (c3130faM13363to != null) {
                c3130faM13363to.close();
                c3130faM13363to.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C14726w7 m74686k4() {
        return this.f50651rv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.pm.PackageInfo] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX INFO: renamed from: k4 */
    private static String m74660k4(float f) throws PackageManager.NameNotFoundException {
        ?? packageInfo = PackageManager.getPackageInfo((String) f, 1151467520);
        ?? r3 = packageInfo;
        if (packageInfo < 0) {
            r3 = 0;
        }
        ?? r32 = r3;
        if (r3 >= 1296) {
            r32 = 1295;
        }
        int i = r32 / 36;
        int i2 = r32 % 36;
        return C14113y2.m67405k4(new char[]{(char) (i < 10 ? i + 48 : i + 55), (char) (i2 < 10 ? i2 + 48 : i2 + 55)});
    }

    /* JADX INFO: renamed from: k4 */
    private static String m74661k4(SortedList<Float, C12003du> sortedList) {
        int i;
        int size = sortedList.size();
        if (size < 1) {
            return "";
        }
        C6765kp c6765kp = new C6765kp((size * 11) - 4);
        C12003du c12003duClone = sortedList.getValues().get_Item(0).Clone();
        if ((c12003duClone.m56501c5() & 255) != 255) {
            c6765kp.m26792k4(C14098up.m67320k4(c12003duClone.m56501c5(), "x2"));
        }
        c6765kp.m26796k4("{0:x2}{1:x2}{2:x2}", Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa()));
        int i2 = 1;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            c6765kp.m26780k4('_');
            sortedList.getValues().get_Item(i2).CloneTo(c12003duClone);
            c6765kp.m26792k4(m74660k4(sortedList.getKeys().get_Item(i2).floatValue()));
            if ((c12003duClone.m56501c5() & 255) != 255) {
                c6765kp.m26792k4(C14098up.m67320k4(c12003duClone.m56501c5(), "x2"));
            }
            c6765kp.m26796k4("{0:x2}{1:x2}{2:x2}", Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa()));
            i2++;
        }
        if (size > 1) {
            c6765kp.m26780k4('_');
            sortedList.getValues().get_Item(i).CloneTo(c12003duClone);
            if ((c12003duClone.m56501c5() & 255) != 255) {
                c6765kp.m26792k4(C14098up.m67320k4(c12003duClone.m56501c5(), "x2"));
            }
            c6765kp.m26796k4("{0:x2}{1:x2}{2:x2}", Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa()));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private String m74662k4(SVGOptions sVGOptions, byte[] bArr, String str, String str2, int i) {
        int[] iArr = {0};
        String[] strArr = {null};
        return m74672k4(sVGOptions, bArr, str, str2, i, "image", iArr, strArr) ? strArr[0] : iArr[0] == 1 ? C14113y2.m67408k4("data:", str, ";base64,", C14080ne.m66953k4(bArr, 0, bArr.length)) : CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m74687k4(C14478sy c14478sy) {
        float fM56571to;
        float fM56554dy;
        float fM74656k4;
        float fM74656k42;
        float fM74656k43;
        float f;
        float f2;
        float fM74655k4;
        float fM74655k42;
        float fM70900x1 = c14478sy.m70900x1(c14478sy.m70892ks() - 180) + c14478sy.m71130wy();
        SortedList<Float, C12003du> sortedListM74680x1 = m74680x1(c14478sy);
        int length = 4;
        float f3 = 0.0f;
        if (c14478sy.m70883ck() == 1) {
            float fM27462to = C7019kk.m27462to(Float.valueOf((fM70900x1 / 1.0f) + 0.5f), 13) * 1.0f;
            C12007ix c12007ixClone = c14478sy.m70893ne().m4217k4(c14478sy.m71131xk().Clone()).Clone();
            if (C14116yg.m67480k4(c14478sy.m71130wy()) > 0.1d) {
                f2 = 2.0f;
                C12025x6[] c12025x6Arr = {new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56558k4()), new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56558k4())};
                C11913yj c11913yj = new C11913yj();
                c11913yj.m55766k4(-c14478sy.m71130wy(), c14478sy.m71126b3().Clone());
                c11913yj.m55775k4(c12025x6Arr);
                fM74655k42 = m74655k4(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk(), fM27462to);
                fM74655k4 = fM74655k42;
                for (int i = 1; i < 4; i++) {
                    float fM74655k43 = m74655k4(c12025x6Arr[i].m56897x1(), c12025x6Arr[i].m56895kk(), fM27462to);
                    if (fM74655k42 > fM74655k43) {
                        fM74655k42 = fM74655k43;
                    }
                    if (fM74655k4 < fM74655k43) {
                        fM74655k4 = fM74655k43;
                    }
                }
            } else {
                f2 = 2.0f;
                float fM74655k44 = m74655k4(c12007ixClone.m56571to(), c12007ixClone.m56554dy(), fM27462to);
                float fM74655k45 = m74655k4(c12007ixClone.m56556h4(), c12007ixClone.m56554dy(), fM27462to);
                float f4 = fM74655k44 > fM74655k45 ? fM74655k45 : fM74655k44;
                if (fM74655k44 < fM74655k45) {
                    fM74655k44 = fM74655k45;
                }
                fM74655k4 = m74655k4(c12007ixClone.m56556h4(), c12007ixClone.m56558k4(), fM27462to);
                if (f4 > fM74655k4) {
                    f4 = fM74655k4;
                }
                if (fM74655k44 >= fM74655k4) {
                    fM74655k4 = fM74655k44;
                }
                float fM74655k46 = m74655k4(c12007ixClone.m56571to(), c12007ixClone.m56558k4(), fM27462to);
                if (f4 > fM74655k46) {
                    f4 = fM74655k46;
                }
                if (fM74655k4 < fM74655k46) {
                    fM74655k4 = fM74655k46;
                }
                fM74655k42 = f4;
            }
            float f5 = (fM74655k4 - fM74655k42) * f2;
            float f6 = fM74655k42 % f5;
            if (f6 < 0.0f) {
                f6 += f5;
            }
            return m74694k4(new C14904kk(C7019kk.m27462to(Float.valueOf(fM27462to), 13), sortedListM74680x1, OooO.OooO00o(4096.0f * f5, 14), OooO.OooO00o((f6 / f5) * 256.0f, 14)));
        }
        C12007ix c12007ixClone2 = c14478sy.m71131xk().Clone();
        if (c12007ixClone2.m56550c5() <= 0.0f) {
            c12007ixClone2.m56576x1(1.0f);
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf((c12007ixClone2.m56575x1() / c12007ixClone2.m56550c5()) * 16.0f), 13);
        int i2 = iM27462to == 0 ? 1 : iM27462to;
        float f7 = i2 / 16.0f;
        int iM70883ck = c14478sy.m70883ck();
        if (iM70883ck == 2) {
            fM56571to = c12007ixClone2.m56571to();
        } else {
            if (iM70883ck != 3) {
                if (iM70883ck == 4) {
                    fM56571to = c12007ixClone2.m56571to();
                } else {
                    if (iM70883ck != 5) {
                        C12007ix c12007ixClone3 = c14478sy.m70893ne().m4217k4(c12007ixClone2.Clone()).Clone();
                        fM56571to = (c12007ixClone3.m56556h4() + c12007ixClone3.m56571to()) / 2.0f;
                        fM56554dy = (c12007ixClone3.m56558k4() + c12007ixClone3.m56554dy()) / 2.0f;
                        if (c14478sy.m70885ix() == null || c14478sy.m70885ix().m55525du() < 3) {
                            fM74656k4 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56571to(), c12007ixClone2.m56554dy(), f7);
                            float f8 = 0.0f + fM74656k4;
                            fM74656k42 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56556h4(), c12007ixClone2.m56554dy(), f7);
                            if (fM74656k42 > fM74656k4) {
                                fM74656k4 = fM74656k42;
                            }
                            float f9 = f8 + fM74656k42;
                            fM74656k43 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56556h4(), c12007ixClone2.m56558k4(), f7);
                            float f10 = f9 + fM74656k43;
                            if (fM74656k43 > fM74656k4) {
                                fM74656k4 = fM74656k43;
                            }
                            float fM74656k44 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56571to(), c12007ixClone2.m56558k4(), f7);
                            float f11 = f10 + fM74656k44;
                            f3 = fM74656k44 <= fM74656k4 ? fM74656k44 : fM74656k4;
                            f = f11;
                        } else {
                            C12025x6[] c12025x6ArrM55565kk = c14478sy.m70885ix().m55565kk();
                            f = 0.0f;
                            for (int i3 = 0; i3 < c12025x6ArrM55565kk.length; i3++) {
                                float fM74656k45 = m74656k4(fM56571to, fM56554dy, c12025x6ArrM55565kk[i3].m56897x1(), c12025x6ArrM55565kk[i3].m56895kk(), f7);
                                if (fM74656k45 > f3) {
                                    f3 = fM74656k45;
                                }
                                f += fM74656k45;
                            }
                            length = c12025x6ArrM55565kk.length;
                        }
                        return m74693k4(new C14902h4(sortedListM74680x1, C22201OooO0oO.OooO00o(fM56571to, 0.5d, 14), C22201OooO0oO.OooO00o(fM56554dy, 0.5d, 14), C22201OooO0oO.OooO00o(f3, 0.5d, 14), C22201OooO0oO.OooO00o(f / length, 0.5d, 14), i2));
                    }
                    fM56571to = c12007ixClone2.m56556h4();
                }
                fM56554dy = c12007ixClone2.m56558k4();
                if (c14478sy.m70885ix() == null) {
                    fM74656k4 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56571to(), c12007ixClone2.m56554dy(), f7);
                    float f82 = 0.0f + fM74656k4;
                    fM74656k42 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56556h4(), c12007ixClone2.m56554dy(), f7);
                    if (fM74656k42 > fM74656k4) {
                    }
                    float f92 = f82 + fM74656k42;
                    fM74656k43 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56556h4(), c12007ixClone2.m56558k4(), f7);
                    float f102 = f92 + fM74656k43;
                    if (fM74656k43 > fM74656k4) {
                    }
                    float fM74656k442 = m74656k4(fM56571to, fM56554dy, c12007ixClone2.m56571to(), c12007ixClone2.m56558k4(), f7);
                    float f112 = f102 + fM74656k442;
                    if (fM74656k442 <= fM74656k4) {
                    }
                    f = f112;
                }
                return m74693k4(new C14902h4(sortedListM74680x1, C22201OooO0oO.OooO00o(fM56571to, 0.5d, 14), C22201OooO0oO.OooO00o(fM56554dy, 0.5d, 14), C22201OooO0oO.OooO00o(f3, 0.5d, 14), C22201OooO0oO.OooO00o(f / length, 0.5d, 14), i2));
            }
            fM56571to = c12007ixClone2.m56556h4();
        }
        fM56554dy = c12007ixClone2.m56554dy();
        if (c14478sy.m70885ix() == null) {
        }
        return m74693k4(new C14902h4(sortedListM74680x1, C22201OooO0oO.OooO00o(fM56571to, 0.5d, 14), C22201OooO0oO.OooO00o(fM56554dy, 0.5d, 14), C22201OooO0oO.OooO00o(f3, 0.5d, 14), C22201OooO0oO.OooO00o(f / length, 0.5d, 14), i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74688k4(C14478sy c14478sy, C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12007ix c12007ix) {
        if (c14478sy.m70884fa() == 2) {
            return m74693k4(new C14902h4(m74680x1(c14478sy), C22201OooO0oO.OooO00o(c12025x63.m56897x1(), 0.5d, 14), C22201OooO0oO.OooO00o(c12025x63.m56895kk(), 0.5d, 14), C22201OooO0oO.OooO00o(m74656k4(c12025x63.m56897x1(), c12025x63.m56895kk(), c12025x6.m56897x1(), c12025x6.m56895kk(), 1.0f) > 0.0f ? r14 : 0.0f, 0.5d, 14), 0, 16));
        }
        float fM56897x1 = c12025x6.m56897x1() - c12025x62.m56897x1();
        float fM56895kk = c12025x6.m56895kk() - c12025x62.m56895kk();
        float fM56897x12 = (((c12025x63.m56897x1() - c12025x62.m56897x1()) * fM56895kk) - ((c12025x63.m56895kk() - c12025x62.m56895kk()) * fM56897x1)) / ((fM56897x1 * fM56897x1) + (fM56895kk * fM56895kk));
        float f = (-fM56895kk) * fM56897x12;
        float f2 = fM56897x1 * fM56897x12;
        float fOooO00o = OooO.OooO00o(((float) ((C14116yg.m67498to(f2, f) * 180.0d) / 3.141592653589793d)) / 1.0f, 14) * 1.0f;
        float fM74655k4 = m74655k4(c12025x63.m56897x1(), c12025x63.m56895kk(), fOooO00o);
        float fM74655k42 = m74655k4(c12025x63.m56897x1() + f, c12025x63.m56895kk() + f2, fOooO00o);
        float f3 = fM74655k4 > fM74655k42 ? fM74655k42 : fM74655k4;
        if (fM74655k4 < fM74655k42) {
            fM74655k4 = fM74655k42;
        }
        float f4 = (fM74655k4 - f3) * 2.0f;
        float f5 = f3 % f4;
        if (f5 < 0.0f) {
            f5 += f4;
        }
        return m74694k4(new C14904kk(C7019kk.m27462to(Float.valueOf(fOooO00o), 13), m74680x1(c14478sy), OooO.OooO00o(4096.0f * f4, 14), OooO.OooO00o((f5 / f4) * 256.0f, 14)));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74689k4(vhx vhxVar, azo azoVar, boolean z, float[] fArr) {
        fArr[0] = 0.0f;
        byte bM3897c5 = z ? azoVar.m3897c5() : azoVar.m3905jd();
        if (bM3897c5 == 0) {
            return "none";
        }
        byte bM3898ck = z ? azoVar.m3898ck() : azoVar.m3902fa();
        byte bM3924up = z ? azoVar.m3924up() : azoVar.m3931yj();
        C12003du c12003duClone = azoVar.m3916m9().Clone();
        String strM74696k4 = m74696k4(C14113y2.m67407k4(z ? "ms_" : "me_", C14042ak.m66410k4(LineArrowheadStyle.class, bM3897c5), '_', C14057f9.m66591x1(bM3898ck), 'x', C14057f9.m66591x1(bM3924up), '_', C14064he.m66704h4((float) azoVar.m3906k4()), '_', C14098up.m67320k4(c12003duClone.m56501c5(), "x2"), C14098up.m67320k4(c12003duClone.m56507jd(), "x2"), C14098up.m67320k4(c12003duClone.m56502ck(), "x2"), C14098up.m67320k4(c12003duClone.m56505fa(), "x2")), "ah");
        if (this.f50642du.containsKey(strM74696k4)) {
            fArr[0] = this.f50642du.get_Item(strM74696k4).f50675m9;
            return strM74696k4;
        }
        if (!vhxVar.m72284v4().getDisableLineEndCropping()) {
            azo.m3893k4(bM3897c5, bM3898ck, bM3924up, fArr);
        }
        this.f50642du.set_Item(strM74696k4, new C14903k4(bM3897c5, bM3898ck, bM3924up, z, c12003duClone.Clone(), (float) azoVar.m3906k4(), fArr[0]));
        return strM74696k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74690k4(vhx vhxVar, b2l b2lVar) {
        v2z v2zVarM72063k4 = b2lVar.m71130wy() != 0.0f ? v2z.m72063k4(b2lVar.m71130wy(), b2lVar.m71126b3().m56897x1(), b2lVar.m71126b3().m56895kk()) : null;
        C11913yj c11913yj = new C11913yj(vhxVar.m74623ks().m17347to(), vhxVar.m74623ks().m17329du(), vhxVar.m74623ks().m17331h4(), vhxVar.m74623ks().m17346m9(), 0.0f, 0.0f);
        if (!c11913yj.m55789x1() && c11913yj.m55778kk()) {
            c11913yj.m55780m9();
            if (v2zVarM72063k4 == null) {
                v2zVarM72063k4 = new v2z(c11913yj, 4);
            }
        }
        v2z v2zVar = v2zVarM72063k4;
        String strM72064k4 = v2z.m72064k4(v2zVar);
        if (strM72064k4.length() != 0) {
            strM72064k4 = C14113y2.m67408k4(C18115b5.CONNECTOR, C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(strM72064k4, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "m"), ")", C14113y2.f47374k4), ".", "dot"));
        }
        String strM67407k4 = C14113y2.m67407k4(C14042ak.m66410k4(PatternStyle.class, b2lVar.m3943jd()), '_', C14098up.m67320k4(b2lVar.m5676k4().m56501c5(), "x2"), C14098up.m67320k4(b2lVar.m5676k4().m56507jd(), "x2"), C14098up.m67320k4(b2lVar.m5676k4().m56502ck(), "x2"), C14098up.m67320k4(b2lVar.m5676k4().m56505fa(), "x2"), '_', C14098up.m67320k4(b2lVar.m5682x1().m56501c5(), "x2"), C14098up.m67320k4(b2lVar.m5682x1().m56507jd(), "x2"), C14098up.m67320k4(b2lVar.m5682x1().m56502ck(), "x2"), C14098up.m67320k4(b2lVar.m5682x1().m56505fa(), "x2"), strM72064k4);
        String strM74696k4 = m74696k4(strM67407k4, m74654h4());
        if (!this.f50643dy.containsKey(strM67407k4)) {
            AbstractC12002ck abstractC12002ckM3942ck = b2lVar.m3942ck();
            m74671k4(vhxVar, strM74696k4, new C7131h4(abstractC12002ckM3942ck), (C7131h4) null, abstractC12002ckM3942ck.mo15760yj() * vhxVar.m72268bv(), abstractC12002ckM3942ck.mo15757m9() * vhxVar.m72268bv(), C3977ck.m15681jd());
            this.f50643dy.set_Item(strM67407k4, new C14905to(strM74696k4, abstractC12002ckM3942ck.mo15760yj(), abstractC12002ckM3942ck.mo15757m9(), v2zVar));
        }
        return strM67407k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m74691k4(vhx vhxVar, cxj cxjVar) {
        String str;
        zny znyVar;
        if (cxjVar.m4858up() != 0) {
            return "";
        }
        String strM4866yj = cxjVar.m4866yj();
        String strM74696k4 = m74696k4(strM4866yj, m74654h4());
        C12007ix c12007ixClone = cxjVar.m4862x1(vhxVar.m72282um() * im9.m7679k4()).Clone();
        c12007ixClone.m56566kk(c12007ixClone.m56557jd() % c12007ixClone.m56550c5());
        c12007ixClone.m56572to(c12007ixClone.m56551ck() % c12007ixClone.m56575x1());
        int iOooO00o = OooO.OooO00o(c12007ixClone.m56557jd(), 14);
        int iOooO00o2 = OooO.OooO00o(c12007ixClone.m56551ck(), 14);
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12007ixClone.m56556h4())), 14) - iOooO00o;
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12007ixClone.m56558k4())), 14) - iOooO00o2;
        int i = iM27462to2 < 1 ? 1 : iM27462to2;
        int i2 = iM27462to < 1 ? 1 : iM27462to;
        v2z v2zVarM72063k4 = cxjVar.m71130wy() != 0.0f ? v2z.m72063k4(cxjVar.m71130wy(), cxjVar.m71126b3().m56897x1(), cxjVar.m71126b3().m56895kk()) : null;
        String strM72064k4 = v2z.m72064k4(v2zVarM72063k4);
        if (strM72064k4.length() != 0) {
            strM72064k4 = C14113y2.m67407k4('_', strM72064k4);
        }
        String strM74696k42 = m74696k4(C14113y2.m67402k4("tx_{0}_{1}_{2}_{3}_{4}{5}", strM4866yj, C13850af.m65103k4(iOooO00o), C13850af.m65103k4(iOooO00o2), C13850af.m65103k4(i2), C13850af.m65103k4(i), strM72064k4), "tx");
        if (!this.f50643dy.containsKey(strM74696k42)) {
            if (cxjVar.m4856u4().f47836k4 == 1.0f && cxjVar.m4856u4().f47837x1 == 1.0f) {
                float f = i;
                if (cxjVar.m4851ks().m56575x1() % f <= f * 0.3f) {
                    float f2 = i2;
                    if (cxjVar.m4851ks().m56550c5() % f2 > f2 * 0.3f) {
                    }
                    znyVar.f50643dy.set_Item(strM74696k42, new C14905to(str, iOooO00o, iOooO00o2, i2, i, v2zVarM72063k4));
                }
                AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
                if (abstractC12002ckM4846bv == null) {
                    throw new NullReferenceException("Image couldn't be empty.");
                }
                int iMo15753jd = abstractC12002ckM4846bv.mo15753jd();
                if (iMo15753jd < 2498570) {
                    iMo15753jd = 2498570;
                }
                C12009k4 c12009k4 = new C12009k4(i2, i, iMo15753jd);
                C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
                if (c7131h4M4845ar != null && c7131h4M4845ar.m27679to() && C3099wl.m13195m9(c7131h4M4845ar.m27674du())) {
                    c12009k4 = C3099wl.m13181k4(c7131h4M4845ar.m27674du(), new C12015qq(i2, f));
                } else {
                    AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                    try {
                        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, i2, f);
                        abstractC12008jdM56582k4.mo17560kk(7);
                        abstractC12008jdM56582k4.mo17507k4(abstractC12002ckM4846bv, c12007ix.Clone(), cxjVar.m4851ks().Clone(), 2);
                        abstractC12008jdM56582k4.dispose();
                    } catch (Throwable th) {
                        if (abstractC12008jdM56582k4 != null) {
                            abstractC12008jdM56582k4.dispose();
                        }
                        throw th;
                    }
                }
                str = strM74696k4;
                m74671k4(vhxVar, str, new C7131h4(c12009k4), (C7131h4) null, i2, f, C3977ck.m15681jd());
                znyVar = this;
                znyVar.f50643dy.set_Item(strM74696k42, new C14905to(str, iOooO00o, iOooO00o2, i2, i, v2zVarM72063k4));
            } else {
                str = strM74696k4;
                znyVar = this;
                znyVar.m74671k4(vhxVar, str, (C7131h4) null, cxjVar.m4845ar(), i2, i, C3977ck.m15681jd());
                znyVar.f50643dy.set_Item(strM74696k42, new C14905to(str, iOooO00o, iOooO00o2, i2, i, v2zVarM72063k4));
            }
        }
        return strM74696k42;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d2  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m74692k4(vhx vhxVar, cxj cxjVar, C11896dy c11896dy) {
        double d;
        C7131h4 c7131h4;
        C12007ix c12007ixClone;
        C11913yj c11913yj;
        String strM74696k4;
        C12012lr c12012lr;
        C12012lr c12012lrM73545k4;
        String strM4866yj = cxjVar.m4866yj();
        String strM74696k42 = m74696k4(strM4866yj, m74654h4());
        C12007ix c12007ixClone2 = cxjVar.m4851ks().Clone();
        C12007ix c12007ixClone3 = m74658k4(cxjVar.m71131xk().Clone()).Clone();
        C12007ix c12007ixClone4 = m74658k4(c12007ixClone2.Clone()).Clone();
        if (C14116yg.m67480k4(cxjVar.m71130wy()) > 0.1d) {
            C11913yj c11913yj2 = new C11913yj();
            c11913yj2.m55766k4(cxjVar.m71130wy(), cxjVar.m71126b3().Clone());
            C11896dy c11896dy2 = new C11896dy();
            c11896dy2.m55578x1(c12007ixClone3.Clone());
            c11896dy2.m55532k4(c11913yj2).CloneTo(c12007ixClone3);
        }
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        if (cxjVar.m71131xk().m56575x1() == c12007ixClone2.m56575x1() && cxjVar.m71131xk().m56550c5() == c12007ixClone2.m56550c5()) {
            c7131h4 = abstractC12002ckM4846bv != null ? new C7131h4((AbstractC12002ck) abstractC12002ckM4846bv.deepClone()) : null;
        } else {
            if (abstractC12002ckM4846bv == null) {
                throw new NullReferenceException("Image couldn't be empty.");
            }
            int iMo15753jd = abstractC12002ckM4846bv.mo15753jd();
            if (iMo15753jd < 2498570) {
                iMo15753jd = 2498570;
            }
            int iM63851up = cxjVar.m5674h4().f3913h4 == null ? 72 : cxjVar.m5674h4().f3913h4.m63851up();
            C12015qq c12015qq = new C12015qq();
            if (iM63851up == 72) {
                c12015qq = new C12015qq(c12007ixClone3.m56550c5(), c12007ixClone3.m56575x1());
            } else {
                (iM63851up == 0 ? C12023wl.m56853k4(abstractC12002ckM4846bv.m56329fa()) : C3099wl.m13184k4(iM63851up, cxjVar.m71131xk().m56570m9().Clone())).CloneTo(c12015qq);
            }
            if (abstractC12002ckM4846bv.mo15760yj() <= c12015qq.m56699x1() && abstractC12002ckM4846bv.mo15757m9() <= c12015qq.m56697kk()) {
                C12023wl.m56853k4(abstractC12002ckM4846bv.m56329fa()).CloneTo(c12015qq);
            }
            C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
            if ((c7131h4M4845ar == null || !c7131h4M4845ar.m27679to() || !C3099wl.m13195m9(c7131h4M4845ar.m27674du())) && !C7019kk.m27469x1(abstractC12002ckM4846bv, C3989up.class)) {
                d = 0.1d;
                C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13), iMo15753jd);
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    C12007ix c12007ix = new C12007ix(0.0f, 0.0f, C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13));
                    abstractC12008jdM56582k4.mo17560kk(7);
                    abstractC12008jdM56582k4.mo17507k4(abstractC12002ckM4846bv, c12007ix.Clone(), c12007ixClone2.Clone(), 2);
                    abstractC12008jdM56582k4.dispose();
                    if (!C14047bz.m66535k4(abstractC12002ckM4846bv.mo15750ck().m15685k4(), C3977ck.m15678dy().m15685k4()) || c12007ixClone2.m56550c5() > abstractC12002ckM4846bv.mo15760yj() || c12007ixClone2.m56575x1() > abstractC12002ckM4846bv.mo15757m9()) {
                        c7131h4 = new C7131h4(c12009k4);
                    } else {
                        C3152yj c3152yj = new C3152yj();
                        try {
                            C3986m9 c3986m9 = new C3986m9();
                            c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, vhxVar.m72284v4().getJpegQuality());
                            c12009k4.m56334k4(c3152yj, f50639k4, c3986m9);
                            c7131h4 = new C7131h4(c3152yj.toArray());
                        } finally {
                            c3152yj.dispose();
                        }
                    }
                    if (cxjVar.m4850jd() != null && cxjVar.m4850jd().getFillOverlayEffect() != null && c11896dy != null) {
                        omq omqVar = new omq(new C12009k4(vhxVar.mo67711m9(), vhxVar.mo67708dy(), 139273), vhxVar.mo67711m9(), vhxVar.mo67708dy());
                        cxjVar.m71127c6();
                        try {
                            C12007ix c12007ixClone5 = c12007ixClone2.Clone();
                            C12007ix[] c12007ixArr = {c12007ixClone5};
                            c12012lrM73545k4 = C14814xq.m73545k4(cxjVar, omqVar, c12007ixArr);
                            try {
                                c12007ixArr[0].CloneTo(c12007ixClone5);
                                cxjVar.m4863x1(c12007ixClone5.Clone());
                            } catch (RuntimeException e) {
                                e = e;
                                c12012lr = c12012lrM73545k4;
                                C3085sv.m13082k4(e);
                                c12012lrM73545k4 = c12012lr;
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            c12012lr = null;
                        }
                        if (c12012lrM73545k4 != null) {
                            c7131h4 = new C7131h4(c12012lrM73545k4.m56619h4());
                            c12012lrM73545k4.dispose();
                        }
                    }
                    String strM74663k4 = m74663k4(strM74696k42, c7131h4, cxjVar.m4845ar(), m74659k4(vhxVar, c12007ixClone3.m56570m9().Clone()).Clone(), c12007ixClone4.Clone(), false, C3977ck.m15681jd());
                    c12007ixClone = c12007ixClone3.Clone();
                    if (c11896dy != null) {
                        C11913yj c11913yj3 = new C11913yj();
                        c11913yj3.m55766k4(cxjVar.m71130wy(), cxjVar.m71126b3().Clone());
                        c11896dy.m55532k4(c11913yj3).CloneTo(c12007ixClone);
                        if (c12007ixClone.m56550c5() > c12007ixClone3.m56550c5() || c12007ixClone.m56575x1() > c12007ixClone3.m56575x1()) {
                            c12007ixClone.m56576x1((float) C14116yg.m67501x1(c12007ixClone.m56550c5() + 0.5f));
                            c12007ixClone.m56560k4((float) C14116yg.m67501x1(c12007ixClone.m56575x1() + 0.5f));
                        }
                    }
                    c11913yj = new C11913yj();
                    if (C14116yg.m67480k4(cxjVar.m71130wy()) > d) {
                        float fM56897x1 = cxjVar.m71126b3().m56897x1() - c12007ixClone.m56557jd();
                        float fM56895kk = cxjVar.m71126b3().m56895kk() - c12007ixClone.m56551ck();
                        c11913yj.m55786x1(fM56897x1, fM56895kk, 0);
                        c11913yj.m55765k4(cxjVar.m71130wy(), 0);
                        c11913yj.m55786x1(-fM56897x1, -fM56895kk, 0);
                    }
                    if (!cxjVar.m71125ak() || cxjVar.m71128dq()) {
                        c11913yj.m55769k4(C3108y2.m13225k4(!cxjVar.m71125ak() ? -1.0f : 1.0f, cxjVar.m71128dq() ? -1.0f : 1.0f, cxjVar.m71126b3().m56897x1() - c12007ixClone.m56557jd(), cxjVar.m71126b3().m56895kk() - c12007ixClone.m56551ck()), 0);
                    }
                    v2z v2zVar = new v2z(c11913yj, 4);
                    strM74696k4 = m74696k4(C14113y2.m67408k4("im_", strM4866yj, C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56557jd()), C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56551ck()), C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56550c5()), C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56575x1()), v2z.m72065k4(v2zVar, "_{0}")), C14113y2.m67402k4("page{0}-im", Integer.valueOf(m74705x1())));
                    if (!this.f50640c5.containsKey(strM74696k4)) {
                        if (c11896dy != null) {
                            this.f50640c5.set_Item(strM74696k4, new C14901du(strM74663k4, m74658k4(c12007ixClone.Clone()).Clone(), c12007ixClone3.Clone(), v2zVar));
                        } else {
                            this.f50640c5.set_Item(strM74696k4, new C14901du(strM74663k4, c12007ixClone.Clone(), c12007ixClone.Clone(), v2zVar));
                        }
                    }
                    return strM74696k4;
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            }
            c7131h4 = new C7131h4(C3099wl.m13181k4(c7131h4M4845ar.m27674du(), c12015qq.Clone()));
        }
        d = 0.1d;
        if (cxjVar.m4850jd() != null) {
            omq omqVar2 = new omq(new C12009k4(vhxVar.mo67711m9(), vhxVar.mo67708dy(), 139273), vhxVar.mo67711m9(), vhxVar.mo67708dy());
            cxjVar.m71127c6();
            C12007ix c12007ixClone52 = c12007ixClone2.Clone();
            C12007ix[] c12007ixArr2 = {c12007ixClone52};
            c12012lrM73545k4 = C14814xq.m73545k4(cxjVar, omqVar2, c12007ixArr2);
            c12007ixArr2[0].CloneTo(c12007ixClone52);
            cxjVar.m4863x1(c12007ixClone52.Clone());
            if (c12012lrM73545k4 != null) {
            }
        }
        String strM74663k42 = m74663k4(strM74696k42, c7131h4, cxjVar.m4845ar(), m74659k4(vhxVar, c12007ixClone3.m56570m9().Clone()).Clone(), c12007ixClone4.Clone(), false, C3977ck.m15681jd());
        c12007ixClone = c12007ixClone3.Clone();
        if (c11896dy != null) {
        }
        c11913yj = new C11913yj();
        if (C14116yg.m67480k4(cxjVar.m71130wy()) > d) {
        }
        if (!cxjVar.m71125ak()) {
            c11913yj.m55769k4(C3108y2.m13225k4(!cxjVar.m71125ak() ? -1.0f : 1.0f, cxjVar.m71128dq() ? -1.0f : 1.0f, cxjVar.m71126b3().m56897x1() - c12007ixClone.m56557jd(), cxjVar.m71126b3().m56895kk() - c12007ixClone.m56551ck()), 0);
        }
        v2z v2zVar2 = new v2z(c11913yj, 4);
        strM74696k4 = m74696k4(C14113y2.m67408k4("im_", strM4866yj, C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56557jd()), C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56551ck()), C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56550c5()), C18115b5.CONNECTOR, C13850af.m65102k4(c12007ixClone3.m56575x1()), v2z.m72065k4(v2zVar2, "_{0}")), C14113y2.m67402k4("page{0}-im", Integer.valueOf(m74705x1())));
        if (!this.f50640c5.containsKey(strM74696k4)) {
        }
        return strM74696k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74693k4(C14902h4 c14902h4) {
        String strM67407k4 = C14113y2.m67407k4("rg_", m74661k4(c14902h4.f50667k4), '_', C13850af.m65103k4(c14902h4.f50670x1), '_', C13850af.m65103k4(c14902h4.f50668kk), '_', C13850af.m65103k4(c14902h4.f50669to), '_', C13850af.m65103k4(c14902h4.f50665du), '_', C14057f9.m66587k4(c14902h4.f50666h4, "x"));
        if (!this.f50649m9.containsKey(strM67407k4)) {
            this.f50649m9.set_Item(strM67407k4, c14902h4);
        }
        return strM67407k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74694k4(C14904kk c14904kk) {
        String strM67407k4 = C14113y2.m67407k4("lg_", m74661k4(c14904kk.f50681x1), '_', C13850af.m65103k4(c14904kk.f50678k4), '_', C14057f9.m66587k4(c14904kk.f50680to, "x"), '_', C14057f9.m66587k4(c14904kk.f50679kk, "x"));
        if (!this.f50645h4.containsKey(strM67407k4)) {
            this.f50645h4.set_Item(strM67407k4, c14904kk);
        }
        return strM67407k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74695k4(String str) {
        String[] strArr = {null};
        boolean zTryGetValue = this.f50648ks.tryGetValue(str, strArr);
        String str2 = strArr[0];
        if (zTryGetValue) {
            return str2;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private String m74663k4(String str, C7131h4 c7131h4, C7131h4 c7131h42, C12023wl c12023wl, C12007ix c12007ix, boolean z, C3977ck c3977ck) {
        C14906x1[] c14906x1Arr = {null};
        boolean zTryGetValue = this.f50652to.tryGetValue(str, c14906x1Arr);
        C14906x1 c14906x1 = c14906x1Arr[0];
        if (!zTryGetValue) {
            this.f50652to.set_Item(str, new C14906x1(c7131h4, c7131h42, c12023wl.Clone(), c12007ix.Clone(), z, c3977ck));
            return str;
        }
        C7131h4 c7131h43 = c7131h4 == null ? c7131h42 : c7131h4;
        C7131h4 c7131h4M74709k4 = c14906x1.m74709k4();
        if ((c7131h43.m27679to() && !C12563k4.m58597k4(c7131h4M74709k4.m27674du(), c7131h43.m27674du())) || (c7131h43.m27680x1() && c7131h4M74709k4.m27678kk() != c7131h43.m27678kk() && (c7131h4M74709k4.m27678kk().mo15760yj() != c12023wl.m56865x1() || c7131h4M74709k4.m27678kk().mo15757m9() != c12023wl.m56862kk()))) {
            C14906x1 c14906x12 = new C14906x1(c7131h4, c7131h42, c12023wl.Clone(), c12007ix.Clone(), z, c3977ck);
            String strM74706x1 = m74706x1(m74654h4());
            this.f50652to.addItem(strM74706x1, c14906x12);
            return strM74706x1;
        }
        C12023wl c12023wl2 = c14906x1.f50691kk;
        c12023wl2.m56860k4(C14116yg.m67483k4(c12023wl2.m56865x1(), c12023wl.m56865x1()));
        C12023wl c12023wl3 = c14906x1.f50691kk;
        c12023wl3.m56866x1(C14116yg.m67483k4(c12023wl3.m56862kk(), c12023wl.m56862kk()));
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74696k4(String str, String str2) {
        String[] strArr = {null};
        boolean zTryGetValue = this.f50648ks.tryGetValue(str, strArr);
        String str3 = strArr[0];
        if (zTryGetValue) {
            return str3;
        }
        Integer[] numArr = {0};
        this.f50656yj.tryGetValue(str2, numArr);
        int iIntValue = numArr[0].intValue() + 1;
        this.f50656yj.set_Item(str2, Integer.valueOf(iIntValue));
        String strM67408k4 = C14113y2.m67408k4(str2, C14057f9.m66591x1(iIntValue));
        this.f50648ks.set_Item(str, strM67408k4);
        return strM67408k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m74697k4(String str, String str2, byte[] bArr, vhx vhxVar, C12015qq c12015qq, C12007ix c12007ix) {
        String strM74696k4 = m74696k4(str, m74654h4());
        int iM27428k4 = f50638ix.m27428k4(str2);
        return m74663k4(strM74696k4, new C7131h4(bArr), (C7131h4) null, m74659k4(vhxVar, c12015qq.Clone()).Clone(), c12007ix.Clone(), true, iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? C3977ck.m15681jd() : C3977ck.m15678dy() : C3977ck.m15684to() : C3977ck.m15679fa());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74698k4(int i) {
        this.f50653up = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m74699k4(long j) {
        List list = new List();
        Dictionary.Enumerator<String, C14906x1> it = this.f50652to.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                C14906x1 c14906x1 = (C14906x1) next.getValue();
                C7131h4 c7131h4 = c14906x1.f50690k4;
                if (c7131h4 != null) {
                    long length = ((long) ((!c7131h4.m27679to() || c14906x1.f50690k4.m27674du() == null) ? 0 : c14906x1.f50690k4.m27674du().length)) + j2;
                    if (length >= j) {
                        list.addItem(next.getKey());
                    } else {
                        j2 += length;
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                String str = (String) it2.next();
                if (this.f50652to.get_Item(str).f50690k4.m27680x1()) {
                    this.f50652to.get_Item(str).f50690k4.m27678kk().dispose();
                }
                this.f50652to.removeItemByKey(str);
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74664k4(SVGOptions sVGOptions, C6765kp c6765kp, byte[] bArr, String str, String str2) {
        int[] iArr = {0};
        String[] strArr = {null};
        boolean zM74672k4 = m74672k4(sVGOptions, bArr, str, str2, 0, "font", iArr, strArr);
        int i = iArr[0];
        String str3 = strArr[0];
        if (zM74672k4) {
            m74666k4(c6765kp, str3);
        } else if (i == 1) {
            m74667k4(c6765kp, str, bArr);
        } else if (i != 2) {
            throw new InvalidOperationException("Unknown decision");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74665k4(C3552k4 c3552k4) {
        Dictionary.Enumerator<String, C14904kk> it = this.f50645h4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f50646jd.containsKey((String) next.getKey())) {
                    this.f50646jd.addItem((String) next.getKey(), next.getValue());
                    C14904kk c14904kk = (C14904kk) next.getValue();
                    float f = c14904kk.f50679kk / 4096.0f;
                    float f2 = f / 2.0f;
                    double d = (c14904kk.f50680to * f) / 256.0f;
                    int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67470dy(((double) (c14904kk.f50678k4 / 180.0f)) * 3.141592653589793d) * d), 14);
                    int iM27462to2 = C7019kk.m27462to(Double.valueOf(d * C14116yg.m67495m9(((double) (c14904kk.f50678k4 / 180.0f)) * 3.141592653589793d)), 14);
                    double d2 = f2;
                    int iM27462to3 = C7019kk.m27462to(Double.valueOf(C14116yg.m67470dy(((double) (c14904kk.f50678k4 / 180.0f)) * 3.141592653589793d) * d2), 14) + iM27462to;
                    int iM27462to4 = C7019kk.m27462to(Double.valueOf(d2 * C14116yg.m67495m9(((double) (c14904kk.f50678k4 / 180.0f)) * 3.141592653589793d)), 14) + iM27462to2;
                    C6916x1 c6916x1 = new C6916x1();
                    c6916x1.m13637m9((String) next.getKey());
                    c6916x1.m27118x1(C10307du.m50263kk(vhx.m72225k4(iM27462to)));
                    c6916x1.m27115kk(C10307du.m50263kk(vhx.m72225k4(iM27462to2)));
                    c6916x1.m27117to(C10307du.m50263kk(vhx.m72225k4(iM27462to3)));
                    c6916x1.m27111du(C10307du.m50263kk(vhx.m72225k4(iM27462to4)));
                    c6916x1.m27066dy(1);
                    c6916x1.m27072m9(0);
                    m74668k4(c6916x1, c14904kk.f50681x1);
                    c3552k4.m13635k4(c6916x1);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74666k4(C6765kp c6765kp, String str) {
        c6765kp.m26792k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m74667k4(C6765kp c6765kp, String str, byte[] bArr) {
        c6765kp.m26792k4(str);
        c6765kp.m26792k4(C14080ne.m66952k4(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74668k4(AbstractC6913k4 abstractC6913k4, SortedList<Float, C12003du> sortedList) {
        for (int i = 0; i < sortedList.size(); i++) {
            C12003du c12003duClone = sortedList.getValues().get_Item(i).Clone();
            C6912h4 c6912h4 = new C6912h4();
            c6912h4.m27059kk(sortedList.getKeys().get_Item(i).floatValue());
            c6912h4.m27058k4(new C10314to(c12003duClone.Clone()));
            if ((c12003duClone.m56501c5() & 255) < 255) {
                c6912h4.m27060to(vhx.m72263x1(c12003duClone.Clone()));
            }
            abstractC6913k4.m13635k4(c6912h4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035e A[Catch: all -> 0x0258, TryCatch #1 {all -> 0x0258, blocks: (B:82:0x022e, B:83:0x0254, B:89:0x027c, B:91:0x0287, B:93:0x028d, B:95:0x029f, B:97:0x02a5, B:116:0x033e, B:118:0x0344, B:121:0x0350, B:123:0x035e, B:125:0x0368, B:127:0x0379, B:129:0x0383, B:131:0x0394, B:133:0x03bc, B:134:0x0403, B:137:0x040e, B:130:0x038a, B:126:0x036f, B:98:0x02b9, B:100:0x02bf, B:102:0x02c8, B:104:0x02de, B:106:0x02e6, B:108:0x0318, B:110:0x0320, B:115:0x0337, B:112:0x032a, B:114:0x0332, B:101:0x02c4, B:94:0x0292, B:88:0x0261), top: B:148:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4 A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #4 {all -> 0x025d, blocks: (B:5:0x002c, B:8:0x003f, B:11:0x0056, B:18:0x006b, B:78:0x01e2, B:80:0x01f4, B:17:0x0067), top: B:154:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0261 A[Catch: all -> 0x0258, TryCatch #1 {all -> 0x0258, blocks: (B:82:0x022e, B:83:0x0254, B:89:0x027c, B:91:0x0287, B:93:0x028d, B:95:0x029f, B:97:0x02a5, B:116:0x033e, B:118:0x0344, B:121:0x0350, B:123:0x035e, B:125:0x0368, B:127:0x0379, B:129:0x0383, B:131:0x0394, B:133:0x03bc, B:134:0x0403, B:137:0x040e, B:130:0x038a, B:126:0x036f, B:98:0x02b9, B:100:0x02bf, B:102:0x02c8, B:104:0x02de, B:106:0x02e6, B:108:0x0318, B:110:0x0320, B:115:0x0337, B:112:0x032a, B:114:0x0332, B:101:0x02c4, B:94:0x0292, B:88:0x0261), top: B:148:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0287 A[Catch: all -> 0x0258, TryCatch #1 {all -> 0x0258, blocks: (B:82:0x022e, B:83:0x0254, B:89:0x027c, B:91:0x0287, B:93:0x028d, B:95:0x029f, B:97:0x02a5, B:116:0x033e, B:118:0x0344, B:121:0x0350, B:123:0x035e, B:125:0x0368, B:127:0x0379, B:129:0x0383, B:131:0x0394, B:133:0x03bc, B:134:0x0403, B:137:0x040e, B:130:0x038a, B:126:0x036f, B:98:0x02b9, B:100:0x02bf, B:102:0x02c8, B:104:0x02de, B:106:0x02e6, B:108:0x0318, B:110:0x0320, B:115:0x0337, B:112:0x032a, B:114:0x0332, B:101:0x02c4, B:94:0x0292, B:88:0x0261), top: B:148:0x022e }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m74669k4(vhx vhxVar, C3552k4 c3552k4) throws Throwable {
        Class<IDisposable> cls;
        Class<IDisposable> cls2;
        KeyValuePair keyValuePair;
        C7131h4 c7131h4;
        byte[] bArrM27674du;
        String str;
        String str2;
        byte[] bArrM27674du2;
        String str3;
        String str4;
        C3551h4 c3551h4;
        C10310jd c10310jd;
        C3986m9 c3986m9;
        byte[] bArrM27674du3;
        String str5;
        String str6;
        String strM74662k4;
        boolean z;
        String str7;
        Class<IDisposable> cls3 = IDisposable.class;
        C3986m9 c3986m92 = new C3986m9(1);
        c3986m92.m15744k4()[0] = new C3981h4(C3978du.f10783du, vhxVar.m72284v4().getJpegQuality());
        Dictionary.Enumerator<String, C14906x1> it = this.f50652to.iterator();
        while (it.hasNext()) {
            try {
                try {
                    KeyValuePair next = it.next();
                    if (!this.f50646jd.containsKey((String) next.getKey())) {
                        this.f50646jd.addItem((String) next.getKey(), next.getValue());
                        C14906x1 c14906x1 = (C14906x1) next.getValue();
                        if (c14906x1 != null) {
                            C7131h4 c7131h4M74709k4 = !m74674k4(c14906x1, vhxVar.m72284v4()) ? c14906x1.f50693x1 : c14906x1.m74709k4();
                            boolean zM27679to = c7131h4M74709k4.m27679to();
                            String str8 = "png";
                            String str9 = "image/png";
                            if (zM27679to && (C3099wl.m13194kk(c7131h4M74709k4.m27674du()) || C3099wl.m13199x1(c7131h4M74709k4.m27674du()))) {
                                float metafileRasterizationDpi = ((vhxVar.m72284v4().getMetafileRasterizationDpi() / (vhxVar.m72282um() * im9.m7679k4())) * 4.0f) / 2.0f;
                                C12015qq c12015qq = new C12015qq(c14906x1.f50691kk.m56865x1() * metafileRasterizationDpi, c14906x1.f50691kk.m56862kk() * metafileRasterizationDpi);
                                if (zM27679to) {
                                    C12009k4 c12009k4M13179k4 = C3099wl.m13179k4(c7131h4M74709k4.m27674du(), C3099wl.m13194kk(c7131h4M74709k4.m27674du()) ? vhxVar.m74608ar() : null, c12015qq.Clone(), new C12015qq(1.0f, 1.0f));
                                    try {
                                        keyValuePair = next;
                                        c7131h4 = c7131h4M74709k4;
                                        bArrM27674du2 = C3099wl.m13188k4((AbstractC12002ck) c12009k4M13179k4);
                                    } finally {
                                        if (c12009k4M13179k4 != null) {
                                            c12009k4M13179k4.dispose();
                                        }
                                    }
                                } else {
                                    C12009k4 c12009k4 = new C12009k4(c12015qq.m56699x1() < 1.0f ? 1 : C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), c12015qq.m56697kk() < 1.0f ? 1 : C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13), 2498570);
                                    try {
                                        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                                        abstractC12008jdM56582k4.mo17586x1(2);
                                        abstractC12008jdM56582k4.mo17560kk(7);
                                        abstractC12008jdM56582k4.mo17481h4(4);
                                        abstractC12008jdM56582k4.mo17495k4(1);
                                        keyValuePair = next;
                                        c7131h4 = c7131h4M74709k4;
                                        abstractC12008jdM56582k4.mo17506k4(c14906x1.m74709k4().m27678kk(), new C12007ix(0.0f, 0.0f, c12015qq.m56699x1(), c12015qq.m56697kk()));
                                        abstractC12008jdM56582k4.dispose();
                                        byte[] bArrM13188k4 = C3099wl.m13188k4((AbstractC12002ck) c12009k4);
                                        c12009k4.dispose();
                                        bArrM27674du2 = bArrM13188k4;
                                    } catch (Throwable th) {
                                        c12009k4.dispose();
                                        throw th;
                                    }
                                }
                            } else {
                                keyValuePair = next;
                                c7131h4 = c7131h4M74709k4;
                                if ((zM27679to && C3099wl.m13168c5(c7131h4.m27674du())) || (!zM27679to && C3099wl.m13198x1(c7131h4.m27678kk()))) {
                                    str = "image/gif";
                                    bArrM27674du = zM27679to ? c7131h4.m27674du() : C3099wl.m13189k4(c7131h4.m27678kk(), C3977ck.m15680h4());
                                    str2 = "gif";
                                } else if (zM27679to && C3099wl.m13196to(c7131h4.m27674du())) {
                                    bArrM27674du2 = c7131h4.m27674du();
                                } else if (zM27679to && C3099wl.m13170du(c7131h4.m27674du())) {
                                    str2 = "jpg";
                                    bArrM27674du = c7131h4.m27674du();
                                    str = "image/jpeg";
                                } else {
                                    bArrM27674du = null;
                                    str = null;
                                    str2 = null;
                                }
                                C3551h4 c3551h42 = new C3551h4();
                                c3551h42.m13637m9((String) keyValuePair.getKey());
                                if (c14906x1.f50688du) {
                                    str3 = "jpg";
                                    str4 = "image/jpeg";
                                    cls2 = cls3;
                                    c3551h4 = c3551h42;
                                    c10310jd = new C10310jd(0.0f, 0.0f, c14906x1.f50691kk.m56865x1(), c14906x1.f50691kk.m56862kk());
                                } else {
                                    str3 = "jpg";
                                    str4 = "image/jpeg";
                                    cls2 = cls3;
                                    try {
                                        c10310jd = new C10310jd(C7019kk.m27462to(Double.valueOf(((double) c14906x1.f50692to.m56557jd()) + 0.5d), 14), C7019kk.m27462to(Double.valueOf(((double) c14906x1.f50692to.m56551ck()) + 0.5d), 14), C7019kk.m27462to(Double.valueOf(((double) c14906x1.f50692to.m56550c5()) + 0.5d), 14), C7019kk.m27462to(Double.valueOf(((double) c14906x1.f50692to.m56575x1()) + 0.5d), 14));
                                        c3551h4 = c3551h42;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cls = cls2;
                                        if (C7019kk.m27456k4((Iterator) it, cls)) {
                                            it.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                c3551h4.m14441k4(c10310jd);
                                c3551h4.m14442k4(new C10312kk(0));
                                if (str != null) {
                                    AbstractC12002ck abstractC12002ckM27678kk = c7131h4.m27680x1() ? c7131h4.m27678kk() : AbstractC12002ck.m56312k4(new C3152yj(c7131h4.m27674du()));
                                    if (m74673k4(abstractC12002ckM27678kk)) {
                                        C3152yj c3152yj = new C3152yj();
                                        abstractC12002ckM27678kk.m56333k4(c3152yj, C3977ck.m15681jd());
                                        bArrM27674du3 = c3152yj.toArray();
                                        c3986m9 = c3986m92;
                                    } else {
                                        bArrM27674du3 = c7131h4.m27679to() ? c7131h4.m27674du() : C3099wl.m13188k4(abstractC12002ckM27678kk);
                                        long length = C14047bz.m66535k4(abstractC12002ckM27678kk.mo15750ck().m15685k4(), C3977ck.m15678dy().m15685k4()) ? bArrM27674du3.length : LocationRequestCompat.PASSIVE_INTERVAL;
                                        C3152yj c3152yj2 = new C3152yj();
                                        abstractC12002ckM27678kk.m56334k4(c3152yj2, f50639k4, c3986m92);
                                        long jM27438h4 = C7019kk.m27438h4(Double.valueOf(c3152yj2.getLength() * 1.05d), 14);
                                        C3152yj c3152yj3 = new C3152yj();
                                        c3986m9 = c3986m92;
                                        abstractC12002ckM27678kk.m56333k4(c3152yj3, C3977ck.m15681jd());
                                        if (length >= jM27438h4) {
                                            if (jM27438h4 < c3152yj3.getLength()) {
                                                bArrM27674du3 = c3152yj2.toArray();
                                                str7 = str3;
                                                str9 = str4;
                                            }
                                            bArrM27674du3 = c3152yj3.toArray();
                                            str7 = "png";
                                        } else if (length > c3152yj3.getLength()) {
                                            bArrM27674du3 = c3152yj3.toArray();
                                            str7 = "png";
                                        } else {
                                            str7 = str3;
                                            str9 = str4;
                                        }
                                        c3152yj3.close();
                                        c3152yj2.close();
                                        str8 = str7;
                                    }
                                    if (!c7131h4.m27680x1()) {
                                        abstractC12002ckM27678kk.dispose();
                                    }
                                    str6 = str8;
                                    str5 = str9;
                                } else {
                                    c3986m9 = c3986m92;
                                    bArrM27674du3 = bArrM27674du;
                                    str5 = str;
                                    str6 = str2;
                                }
                                strM74662k4 = m74662k4(vhxVar.m72284v4(), bArrM27674du3, str5, str6, vhxVar.f49525jd);
                                if (strM74662k4 == null) {
                                    int iM56865x1 = m74674k4(c14906x1, vhxVar.m72284v4()) ? c14906x1.f50691kk.m56865x1() : c14906x1.f50693x1.m27678kk().mo15760yj();
                                    int iM56862kk = m74674k4(c14906x1, vhxVar.m72284v4()) ? c14906x1.f50691kk.m56862kk() : c14906x1.f50693x1.m27678kk().mo15757m9();
                                    C3553kk c3553kk = new C3553kk();
                                    c3553kk.m14452to(C10307du.m50263kk(iM56865x1));
                                    c3553kk.m14447du(C10307du.m50263kk(iM56862kk));
                                    z = false;
                                    c3553kk.m14449k4(new C10312kk(0));
                                    if (!m74674k4(c14906x1, vhxVar.m72284v4())) {
                                        c3553kk.m13630c5(C14113y2.m67402k4("scale({0}, {1}) translate({2}, {3})", C13850af.m65102k4(c14906x1.f50691kk.m56865x1() / c14906x1.f50692to.m56550c5()), C13850af.m65102k4(c14906x1.f50691kk.m56862kk() / c14906x1.f50692to.m56575x1()), C13850af.m65102k4(-c14906x1.f50692to.m56557jd()), C13850af.m65102k4(-c14906x1.f50692to.m56551ck())));
                                    }
                                    c3553kk.m14448jd(strM74662k4);
                                    c3551h4.m13635k4(c3553kk);
                                } else {
                                    z = false;
                                }
                                c3552k4.m13635k4(c3551h4);
                                c3986m92 = c3986m9;
                                cls3 = cls2;
                            }
                            bArrM27674du = bArrM27674du2;
                            str2 = "png";
                            str = "image/png";
                            C3551h4 c3551h422 = new C3551h4();
                            c3551h422.m13637m9((String) keyValuePair.getKey());
                            if (c14906x1.f50688du) {
                            }
                            c3551h4.m14441k4(c10310jd);
                            c3551h4.m14442k4(new C10312kk(0));
                            if (str != null) {
                            }
                            strM74662k4 = m74662k4(vhxVar.m72284v4(), bArrM27674du3, str5, str6, vhxVar.f49525jd);
                            if (strM74662k4 == null) {
                            }
                            c3552k4.m13635k4(c3551h4);
                            c3986m92 = c3986m9;
                            cls3 = cls2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cls2 = cls3;
                }
            } catch (Throwable th4) {
                th = th4;
                cls = cls3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, cls3)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74670k4(vhx vhxVar, C6765kp c6765kp, String str) {
        c6765kp.m26792k4(C14113y2.m67408k4("@font-face { font-family: \"", vhxVar.m72285x1(str) ? C3085sv.m13066du(str) : str, "\"; "));
        c6765kp.m26792k4("src: ");
        c6765kp.m26792k4(C14113y2.m67408k4("local(\"", str, "\"),"));
        c6765kp.m26792k4(C14113y2.m67408k4("local(\"", C14113y2.m67401k4(str, " ", ""), "\")"));
    }

    /* JADX INFO: renamed from: k4 */
    private void m74671k4(vhx vhxVar, String str, C7131h4 c7131h4, C7131h4 c7131h42, float f, float f2, C3977ck c3977ck) {
        C12015qq c12015qq = new C12015qq(f, f2);
        m74663k4(str, c7131h4, c7131h42, m74659k4(vhxVar, c12015qq.Clone()).Clone(), C12007ix.m56544k4(new C12014ne(0, 0, C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13))).Clone(), false, c3977ck);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74700k4(dnm[] dnmVarArr) {
        this.f50655x6 = dnmVarArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74701k4(String[] strArr) {
        this.f50650ne = strArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74672k4(SVGOptions sVGOptions, byte[] bArr, String str, String str2, int i, String str3, int[] iArr, String[] strArr) {
        strArr[0] = null;
        ILinkEmbedController iLinkEmbedControllerM2510x1 = sVGOptions.m2510x1();
        int iM72644k4 = m74686k4().m72644k4(iLinkEmbedControllerM2510x1, bArr, bArr, str3, str, str2, iArr);
        if (iArr[0] != 0) {
            return false;
        }
        String url = iLinkEmbedControllerM2510x1.getUrl(iM72644k4, i);
        strArr[0] = url;
        if (url != null) {
            iLinkEmbedControllerM2510x1.saveExternal(iM72644k4, bArr);
        }
        iArr[0] = 2;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74673k4(AbstractC12002ck abstractC12002ck) {
        return AbstractC12002ck.m56321kk(abstractC12002ck.mo15753jd());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74674k4(C14906x1 c14906x1, SVGOptions sVGOptions) {
        return sVGOptions.getDeletePicturesCroppedAreas() || c14906x1.f50693x1 == null;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74675k4(final String str, String[] strArr, byte[][] bArr) {
        strArr[0] = C14113y2.f47374k4;
        bArr[0] = null;
        int iM67253x1 = AbstractC14092to.m67253x1(m74703kk(), new AbstractC14041ai<dnm>() { // from class: com.aspose.slides.zny.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(dnm dnmVar) {
                return C14113y2.m67363du(dnmVar.m5199to(), str);
            }
        });
        if (AbstractC14092to.m67253x1(m74704to(), new AbstractC14041ai<String>() { // from class: com.aspose.slides.zny.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(String str2) {
                return C14113y2.m67363du(str2, str);
            }
        }) != -1) {
            return false;
        }
        if (FontsLoader.m1534k4(str, strArr, bArr)) {
            if (bArr[0] == null) {
                bArr[0] = C3131h4.m13362m9(strArr[0]);
            }
            return true;
        }
        if (iM67253x1 == -1) {
            return false;
        }
        dnm dnmVar = m74703kk()[iM67253x1];
        AbstractC3150x6 abstractC3150x6Mo47984x1 = dnmVar.m5197k4().m23120k4().m48233um().mo47984x1();
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13447k4.m62556k4(abstractC3150x6Mo47984x1, c3152yj);
                bArr[0] = c3152yj.toArray();
                strArr[0] = dnmVar.m5197k4().m23120k4().m48187h4();
                return true;
            } finally {
                c3152yj.dispose();
            }
        } finally {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
        }
    }
}
