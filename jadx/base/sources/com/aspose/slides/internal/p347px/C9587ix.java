package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p036b6.C1629g8;
import com.aspose.slides.internal.p036b6.C1644s7;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p274mh.C6386to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C9587ix {

    /* JADX INFO: renamed from: k4 */
    private static Object f34603k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, C1644s7> f34606x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static C1644s7 f34604kk = new C1644s7();

    /* JADX INFO: renamed from: to */
    private static Dictionary<String, C12004dy> f34605to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private static Dictionary<String, List<C12004dy>> f34602du = new Dictionary<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.aspose.slides.internal.b6.s7] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX INFO: renamed from: k4 */
    public static List<C12004dy> m46826k4(String str) {
        C1644s7 c1644s7Equals;
        IGenericDictionary iGenericDictionary;
        String strM13406kk = C3141rv.m13406kk(str);
        synchronized (f34603k4) {
            try {
                if (f34602du.containsKey(strM13406kk)) {
                    return f34602du.get_Item(strM13406kk);
                }
                C12004dy[] c12004dyArr = new C12004dy[0];
                if (f34606x1.containsKey(strM13406kk)) {
                    c1644s7Equals = f34606x1.get_Item(strM13406kk);
                    c12004dyArr = (C12004dy[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) c1644s7Equals.m8905k4()).deepClone(), C12004dy[].class);
                } else {
                    C1644s7 c1644s7 = new C1644s7();
                    try {
                        C3130fa c3130faM13363to = C3131h4.m13363to(strM13406kk);
                        try {
                            int length = (int) c3130faM13363to.getLength();
                            byte[] bArr = new byte[length];
                            c3130faM13363to.read(bArr, 0, length);
                            c3130faM13363to.close();
                            c3130faM13363to.dispose();
                            c1644s7Equals = "OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4));
                            try {
                                if (c1644s7Equals != 0) {
                                    byte[] bArrM8801k4 = C1629g8.m8801k4(bArr);
                                    AbstractC4786k4 abstractC4786k4M19846k4 = AbstractC4786k4.m19846k4(bArrM8801k4);
                                    c1644s7.m8904k4(abstractC4786k4M19846k4.m19848du(), bArrM8801k4.length);
                                    abstractC4786k4M19846k4.m19849h4();
                                    C1644s7 c1644s7M46827k4 = m46827k4(c1644s7, f34606x1);
                                    iGenericDictionary = f34606x1;
                                    c1644s7Equals = c1644s7M46827k4;
                                } else {
                                    AbstractC4786k4 abstractC4786k4M19846k42 = AbstractC4786k4.m19846k4(bArr);
                                    c1644s7.m8904k4(abstractC4786k4M19846k42.m19848du(), length);
                                    abstractC4786k4M19846k42.m19849h4();
                                    C1644s7 c1644s7M46827k42 = m46827k4(c1644s7, f34606x1);
                                    iGenericDictionary = f34606x1;
                                    c1644s7Equals = c1644s7M46827k42;
                                }
                                iGenericDictionary.addItem(strM13406kk, c1644s7Equals);
                            } catch (FileNotFoundException | Exception unused) {
                            }
                        } catch (Throwable th) {
                            if (c3130faM13363to != null) {
                                c3130faM13363to.dispose();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | Exception unused2) {
                        c1644s7Equals = c1644s7;
                    }
                }
                List<C12004dy> listM46831x1 = m46831x1(c12004dyArr, c1644s7Equals.m8905k4());
                if (listM46831x1 != null) {
                    f34602du.addItem(strM13406kk, listM46831x1);
                }
                return listM46831x1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static List<C12004dy> m46831x1(C12004dy[] c12004dyArr, C12004dy[] c12004dyArr2) {
        if (c12004dyArr.length == c12004dyArr2.length) {
            return null;
        }
        List<C12004dy> list = new List<>();
        for (C12004dy c12004dy : c12004dyArr2) {
            if (!m46830k4(c12004dyArr, c12004dy)) {
                list.addItem(c12004dy);
            }
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r3 = (com.aspose.slides.internal.p036b6.C1644s7) r0.getValue();
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C1644s7 m46827k4(C1644s7 c1644s7, Dictionary<String, C1644s7> dictionary) {
        Dictionary.Enumerator<String, C1644s7> it = dictionary.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                KeyValuePair next = it.next();
                if (C6386to.m26215k4(c1644s7.m8906x1(), ((C1644s7) next.getValue()).m8906x1())) {
                    break;
                }
            } catch (Exception unused) {
                if (it != null) {
                    it.dispose();
                }
                return c1644s7;
            } catch (Throwable th) {
                if (it != null) {
                    it.dispose();
                }
                throw th;
            }
        }
        it.dispose();
        return c1644s7;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12004dy m46828k4(byte[] bArr) {
        C12004dy c12004dyM46829k4;
        AbstractC4715g8 abstractC4715g8M19610du = AbstractC4715g8.m19610du();
        try {
            String strM66952k4 = C14080ne.m66952k4(abstractC4715g8M19610du.m19588x1(bArr));
            abstractC4715g8M19610du.dispose();
            synchronized (f34603k4) {
                try {
                    if (f34605to.containsKey(strM66952k4)) {
                        c12004dyM46829k4 = f34605to.get_Item(strM66952k4);
                    } else {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, bArr.length);
                        C12004dy[] c12004dyArr = (C12004dy[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) f34604kk.m8905k4()).deepClone(), C12004dy[].class);
                        AbstractC4786k4 abstractC4786k4M19846k4 = AbstractC4786k4.m19846k4(bArr2);
                        f34604kk.m8904k4(abstractC4786k4M19846k4.m19848du(), length);
                        abstractC4786k4M19846k4.m19849h4();
                        c12004dyM46829k4 = m46829k4(c12004dyArr, f34604kk.m8905k4());
                        if (c12004dyM46829k4 != null) {
                            f34605to.addItem(strM66952k4, c12004dyM46829k4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c12004dyM46829k4;
        } catch (Throwable th2) {
            if (abstractC4715g8M19610du != null) {
                abstractC4715g8M19610du.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12004dy m46829k4(C12004dy[] c12004dyArr, C12004dy[] c12004dyArr2) {
        C12004dy c12004dy = null;
        if (c12004dyArr.length == c12004dyArr2.length) {
            return null;
        }
        if (c12004dyArr2.length - c12004dyArr.length != 1) {
            throw new ArgumentException("The difference is more than one font family", "old");
        }
        for (C12004dy c12004dy2 : c12004dyArr2) {
            if (!m46830k4(c12004dyArr, c12004dy2)) {
                if (c12004dy == null) {
                    c12004dy = c12004dy2;
                } else if (!C14113y2.m67363du(c12004dy.m56527du(), c12004dy2.m56527du())) {
                    throw new InvalidOperationException("More than one difference was found");
                }
            }
        }
        return c12004dy;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m46830k4(C12004dy[] c12004dyArr, C12004dy c12004dy) {
        for (C12004dy c12004dy2 : c12004dyArr) {
            if (c12004dy.equals(c12004dy2)) {
                return true;
            }
        }
        return false;
    }
}
