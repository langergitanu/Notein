package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p131fi.C3998x1;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p274mh.C6386to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p456v5.C11609m9;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C9794uz {

    /* JADX INFO: renamed from: k4 */
    private static final Object f35481k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, C3998x1> f35484x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static C3998x1 f35482kk = new C3998x1();

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, List<C12004dy>> f35483to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private static final Dictionary<String, List<C12004dy>> f35480du = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<String, List<C12004dy>> m48255k4(String str, boolean z) {
        Dictionary<String, List<C12004dy>> dictionary = new Dictionary<>();
        m48262k4(str, z, dictionary);
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<C12004dy> m48256k4(String str) {
        C3998x1 c3998x1M48259k4;
        String strM13406kk = C3141rv.m13406kk(str);
        synchronized (f35481k4) {
            try {
                Dictionary<String, List<C12004dy>> dictionary = f35480du;
                if (dictionary.containsKey(strM13406kk)) {
                    return dictionary.get_Item(strM13406kk);
                }
                C12004dy[] c12004dyArr = new C12004dy[0];
                Dictionary<String, C3998x1> dictionary2 = f35484x1;
                if (dictionary2.containsKey(strM13406kk)) {
                    c3998x1M48259k4 = dictionary2.get_Item(strM13406kk);
                    c12004dyArr = (C12004dy[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) c3998x1M48259k4.m15799k4()).deepClone(), C12004dy[].class);
                } else {
                    C3998x1 c3998x1 = new C3998x1();
                    try {
                        C3130fa c3130faM13363to = C3131h4.m13363to(strM13406kk);
                        try {
                            int length = (int) c3130faM13363to.getLength();
                            byte[] bArr = new byte[length];
                            c3130faM13363to.read(bArr, 0, length);
                            c3130faM13363to.close();
                            c3130faM13363to.dispose();
                            if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4))) {
                                byte[] bArrM54219k4 = C11240k4.m54219k4(bArr);
                                AbstractC4786k4 abstractC4786k4M19846k4 = AbstractC4786k4.m19846k4(bArrM54219k4);
                                c3998x1.m15797k4(abstractC4786k4M19846k4.m19848du(), bArrM54219k4.length);
                                abstractC4786k4M19846k4.m19849h4();
                                c3998x1M48259k4 = m48259k4(c3998x1, dictionary2);
                            } else {
                                AbstractC4786k4 abstractC4786k4M19846k42 = AbstractC4786k4.m19846k4(bArr);
                                c3998x1.m15797k4(abstractC4786k4M19846k42.m19848du(), length);
                                abstractC4786k4M19846k42.m19849h4();
                                c3998x1M48259k4 = m48259k4(c3998x1, dictionary2);
                            }
                            try {
                                dictionary2.addItem(strM13406kk, c3998x1M48259k4);
                            } catch (FileNotFoundException | Exception unused) {
                            }
                        } catch (Throwable th) {
                            if (c3130faM13363to != null) {
                                c3130faM13363to.dispose();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | Exception unused2) {
                        c3998x1M48259k4 = c3998x1;
                    }
                }
                List<C12004dy> listM48258k4 = m48258k4(c12004dyArr, c3998x1M48259k4.m15799k4());
                if (listM48258k4.size() > 0) {
                    f35480du.addItem(strM13406kk, listM48258k4);
                }
                return listM48258k4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static List<C12004dy> m48257k4(byte[] bArr) {
        C11609m9 c11609m9 = new C11609m9();
        try {
            String strM66952k4 = C14080ne.m66952k4(c11609m9.m19588x1(bArr));
            c11609m9.dispose();
            synchronized (f35481k4) {
                try {
                    List<C12004dy>[] listArr = {null};
                    Dictionary<String, List<C12004dy>> dictionary = f35483to;
                    boolean zTryGetValue = dictionary.tryGetValue(strM66952k4, listArr);
                    List<C12004dy> list = listArr[0];
                    if (zTryGetValue) {
                        return list;
                    }
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    C12004dy[] c12004dyArr = (C12004dy[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) f35482kk.m15799k4()).deepClone(), C12004dy[].class);
                    AbstractC4786k4 abstractC4786k4M19846k4 = AbstractC4786k4.m19846k4(bArr2);
                    f35482kk.m15797k4(abstractC4786k4M19846k4.m19848du(), length);
                    abstractC4786k4M19846k4.m19849h4();
                    List<C12004dy> listM48258k4 = m48258k4(c12004dyArr, f35482kk.m15799k4());
                    if (listM48258k4.size() > 0) {
                        dictionary.addItem(strM66952k4, listM48258k4);
                    }
                    return listM48258k4;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            c11609m9.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static List<C12004dy> m48258k4(C12004dy[] c12004dyArr, C12004dy[] c12004dyArr2) {
        List<C12004dy> list = new List<>();
        if (c12004dyArr.length != c12004dyArr2.length) {
            for (C12004dy c12004dy : c12004dyArr2) {
                if (!m48263k4(c12004dyArr, c12004dy)) {
                    list.addItem(c12004dy);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r3 = (com.aspose.slides.internal.p131fi.C3998x1) r0.getValue();
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C3998x1 m48259k4(C3998x1 c3998x1, Dictionary<String, C3998x1> dictionary) {
        Dictionary.Enumerator<String, C3998x1> it = dictionary.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                KeyValuePair next = it.next();
                if (C6386to.m26215k4(c3998x1.m15800x1(), ((C3998x1) next.getValue()).m15800x1())) {
                    break;
                }
            } catch (Exception unused) {
                if (it != null) {
                    it.dispose();
                }
                return c3998x1;
            } catch (Throwable th) {
                if (it != null) {
                    it.dispose();
                }
                throw th;
            }
        }
        it.dispose();
        return c3998x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12004dy m48260k4(C9790ts c9790ts) {
        C12004dy c12004dy = null;
        if (!C14113y2.m67411k4(c9790ts.m48187h4())) {
            Dictionary<String, C3998x1> dictionary = f35484x1;
            if (dictionary.containsKey(c9790ts.m48187h4())) {
                C12004dy[] c12004dyArrM15799k4 = dictionary.get_Item(c9790ts.m48187h4()).m15799k4();
                int length = c12004dyArrM15799k4.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C12004dy c12004dy2 = c12004dyArrM15799k4[i];
                    if (c12004dy2.m56529h4(c9790ts.m48183dy())) {
                        c12004dy = c12004dy2;
                        break;
                    }
                    i++;
                }
                if (c12004dy != null && !c9790ts.m48202k4().equals(c12004dy.m56527du())) {
                    for (C12004dy c12004dy3 : f35484x1.get_Item(c9790ts.m48187h4()).m15799k4()) {
                        if (c12004dy3.m56529h4(c9790ts.m48183dy()) && c9790ts.m48202k4().equals(c12004dy3.m56527du())) {
                            return c12004dy3;
                        }
                    }
                }
            }
        }
        return c12004dy;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public static void m48261k4() {
        synchronized (f35481k4) {
            try {
                Dictionary.ValueCollection.Enumerator<String, C3998x1> it = f35484x1.getValues().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().dispose();
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
                f35484x1.clear();
                f35482kk.dispose();
                f35482kk = new C3998x1();
                f35483to.clear();
                f35480du.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m48262k4(String str, boolean z, Dictionary<String, List<C12004dy>> dictionary) {
        for (String str2 : C3142to.m13414du(str)) {
            String strM13406kk = C3141rv.m13406kk(C3141rv.m13412x1(str, str2));
            List<C12004dy> listM48256k4 = m48256k4(strM13406kk);
            if (listM48256k4 != null && !dictionary.containsKey(strM13406kk)) {
                dictionary.addItem(strM13406kk, listM48256k4);
            }
        }
        if (z) {
            for (String str3 : C3142to.m13423to(str)) {
                m48262k4(C3141rv.m13412x1(str, str3), z, dictionary);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48263k4(C12004dy[] c12004dyArr, C12004dy c12004dy) {
        for (C12004dy c12004dy2 : c12004dyArr) {
            if (c12004dy.equals(c12004dy2)) {
                return true;
            }
        }
        return false;
    }
}
