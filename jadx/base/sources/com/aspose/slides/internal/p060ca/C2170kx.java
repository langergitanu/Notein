package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kx */
/* JADX INFO: loaded from: classes3.dex */
public class C2170kx extends AbstractC2406ze {

    /* JADX INFO: renamed from: kk */
    public static final int[] f7533kk = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.kx$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: x1 */
        public boolean f7538x1 = false;

        /* JADX INFO: renamed from: to */
        public long f7537to = 0;

        /* JADX INFO: renamed from: du */
        public long f7534du = 0;

        /* JADX INFO: renamed from: kk */
        public byte[] f7536kk = null;

        /* JADX INFO: renamed from: k4 */
        public String f7535k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private static k4 m10992k4(String str, C2236ov c2236ov) throws Throwable {
        k4 k4Var = new k4();
        k4Var.f7535k4 = str;
        if (c2236ov != null) {
            k4Var.f7538x1 = true;
            byte[][] bArr = {k4Var.f7536kk};
            long[] jArr = {k4Var.f7534du};
            long[] jArr2 = {k4Var.f7537to};
            c2236ov.mo10132k4(bArr, jArr, jArr2);
            k4Var.f7536kk = bArr[0];
            k4Var.f7534du = jArr[0];
            k4Var.f7537to = jArr2[0];
        }
        return k4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.aspose.slides.ms.System.IDisposable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.aspose.slides.internal.ca.x4, com.aspose.slides.ms.System.IDisposable] */
    @Override // com.aspose.slides.internal.p060ca.AbstractC2406ze
    /* JADX INFO: renamed from: k4 */
    public void mo10714k4() {
        ?? r4;
        String next;
        Dictionary.KeyCollection.Enumerator it;
        ?? r9 = "hmtx";
        ?? r17 = IDisposable.class;
        C2132iq c2132iq = (C2132iq) this.f8349k4;
        C3152yj c3152yj = new C3152yj();
        C2362x4 c2362x4 = new C2362x4(c3152yj, false);
        try {
            Dictionary dictionary = new Dictionary();
            List list = new List();
            try {
                dictionary.addItem("cvt", m10992k4("cvt", c2132iq.m10758x1().m10582yj()));
                dictionary.addItem("fpgm", m10992k4("fpgm", c2132iq.m10758x1().m10573ks()));
                dictionary.addItem("glyf", m10992k4("glyf", c2132iq.m10758x1().m10574m9()));
                dictionary.addItem("head", m10992k4("head", c2132iq.m10758x1().m10572kk()));
                dictionary.addItem("hhea", m10992k4("hhea", c2132iq.m10758x1().m10545c5()));
                dictionary.addItem("hmtx", m10992k4("hmtx", c2132iq.m10758x1().m10552jd()));
                dictionary.addItem("loca", m10992k4("loca", c2132iq.m10758x1().m10550h4()));
                dictionary.addItem("maxp", m10992k4("maxp", c2132iq.m10758x1().m10547du()));
                dictionary.addItem("prep", m10992k4("prep", c2132iq.m10758x1().m10576rv()));
                dictionary.addItem("name", m10992k4("name", c2132iq.m10758x1().m10577to()));
                dictionary.addItem("cmap", m10992k4("cmap", c2132iq.m10758x1().m10548dy()));
                dictionary.addItem("post", m10992k4("post", c2132iq.m10758x1().m10546ck()));
                dictionary.addItem("OS/2", m10992k4("OS/2", c2132iq.m10758x1().m10581x6()));
                dictionary.addItem("GSUB", m10992k4("GSUB", c2132iq.m10758x1().m10551ix()));
                dictionary.addItem("GPOS", m10992k4("GPOS", c2132iq.m10758x1().m10575ne()));
                SortedList sortedList = new SortedList(AbstractC14070jw.m66788kk());
                List.Enumerator<String> it2 = c2132iq.m10758x1().f7225k4.iterator();
                while (it2.hasNext()) {
                    try {
                        try {
                            try {
                                next = it2.next();
                                it = dictionary.getKeys().iterator();
                                while (it.hasNext()) {
                                    try {
                                        String str = (String) it.next();
                                        if (C14113y2.m67363du(str, next)) {
                                            sortedList.addItem(str, str);
                                        }
                                    } finally {
                                    }
                                }
                                next = r17;
                            } catch (Throwable th) {
                                th = th;
                                next = r17;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = r17;
                        }
                        try {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) next)) {
                                it.dispose();
                            }
                            r17 = next;
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = next;
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) r4)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r9.dispose();
                        throw th;
                    }
                }
                ?? r42 = r17;
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) r42)) {
                    it2.dispose();
                }
                IGenericEnumerator it3 = sortedList.iterator();
                while (it3.hasNext()) {
                    try {
                        k4 k4Var = (k4) dictionary.get_Item(((KeyValuePair) it3.next()).getKey());
                        if (k4Var.f7538x1) {
                            list.addItem(k4Var);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) r42)) {
                            it3.dispose();
                        }
                    }
                }
                long size = ((long) ((list.size() * 16) + 12)) & 4294967295L;
                r9 = c2362x4;
                try {
                    r9.m11660kk(65536L);
                    r9.m11647k4(list.size() & 65535);
                    int i = f7533kk[list.size()];
                    int i2 = 1 << (i & 65535);
                    r9.m11647k4((i2 * 16) & 65535);
                    r9.m11647k4(i);
                    r9.m11647k4(((list.size() - i2) * 16) & 65535);
                    List.Enumerator it4 = list.iterator();
                    while (it4.hasNext()) {
                        try {
                            k4 k4Var2 = (k4) it4.next();
                            String strM67408k4 = k4Var2.f7535k4;
                            if ("os/2".equals(strM67408k4)) {
                                strM67408k4 = "OS/2";
                            }
                            if (strM67408k4.length() != 4) {
                                strM67408k4 = C14113y2.m67408k4(strM67408k4, " ");
                            }
                            r9.m11649k4(strM67408k4);
                            r9.m11660kk(k4Var2.f7537to);
                            r9.m11660kk(size);
                            r9.m11660kk(k4Var2.f7534du);
                            size = ((size & 4294967295L) + (((long) k4Var2.f7536kk.length) & 4294967295L)) & 4294967295L;
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) r42)) {
                                it4.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) r42)) {
                        it4.dispose();
                    }
                    List.Enumerator it5 = list.iterator();
                    long jM11654k4 = 0;
                    while (it5.hasNext()) {
                        try {
                            k4 k4Var3 = (k4) it5.next();
                            if ("head".equals(k4Var3.f7535k4)) {
                                jM11654k4 = r9.m11654k4() + c2132iq.m10758x1().m10572kk().f7556k4;
                            }
                            r9.m11657k4(k4Var3.f7536kk);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) r42)) {
                                it5.dispose();
                            }
                        }
                    }
                    c3152yj.close();
                    byte[] array = c3152yj.toArray();
                    if (jM11654k4 != 0) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            array[(int) (((long) i3) + jM11654k4)] = 0;
                        }
                        long jM11215k4 = (2981146554L - (C2236ov.m11215k4(array) & 4294967295L)) & 4294967295L;
                        C3152yj c3152yj2 = new C3152yj(array);
                        try {
                            c3152yj2.setPosition(jM11654k4);
                            C2362x4 c2362x42 = new C2362x4(c3152yj2, false);
                            try {
                                c2362x42.m11663x1(jM11215k4);
                                c2362x42.dispose();
                                c3152yj2.close();
                            } catch (Throwable th5) {
                                c2362x42.dispose();
                                throw th5;
                            }
                        } finally {
                            c3152yj2.dispose();
                        }
                    }
                    this.f8350x1.write(array, 0, array.length);
                    r9.dispose();
                } catch (Throwable th6) {
                    th = th6;
                    r9.dispose();
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                r9 = c2362x4;
            }
        } catch (Throwable th8) {
            th = th8;
            r9 = c2362x4;
        }
    }
}
