package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C9770g8 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, String> f35295k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Integer, String> f35298x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Integer, String> f35296kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private final Dictionary<Integer, String> f35297to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private Dictionary<Integer, String> m48069du(int i) {
        if (i == 1) {
            return this.f35295k4;
        }
        if (i == 2) {
            return this.f35298x1;
        }
        if (i == 4) {
            return this.f35296kk;
        }
        if (i != 6) {
            return null;
        }
        return this.f35297to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m48071k4(int i) {
        String strM48077x1 = m48077x1(i);
        if (strM48077x1 != null) {
            return strM48077x1;
        }
        throw new InvalidOperationException("Requested a name string that is not present in the font.");
    }

    /* JADX INFO: renamed from: kk */
    public final String m48075kk(int i) {
        Dictionary<Integer, String> dictionaryM48069du = m48069du(i);
        if (dictionaryM48069du == null || dictionaryM48069du.size() <= 0) {
            return null;
        }
        String[] strArr = {null};
        return !dictionaryM48069du.tryGetValue(0, strArr) ? m48070k4(dictionaryM48069du) : strArr[0];
    }

    /* JADX INFO: renamed from: to */
    public final String[] m48076to(int i) {
        Dictionary<Integer, String> dictionaryM48069du = m48069du(i);
        if (dictionaryM48069du == null) {
            return null;
        }
        String[] strArr = new String[dictionaryM48069du.size()];
        Dictionary.ValueCollection.Enumerator<Integer, String> it = dictionaryM48069du.getValues().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                strArr[i2] = it.next();
                i2++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return strArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m48077x1(int i) {
        Dictionary<Integer, String> dictionaryM48069du = m48069du(i);
        if (dictionaryM48069du == null || dictionaryM48069du.size() <= 0) {
            return null;
        }
        String[] strArr = {null};
        return !dictionaryM48069du.tryGetValue(Integer.valueOf(EditingLanguage.ENGLISH_US), strArr) ? m48070k4(dictionaryM48069du) : strArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final String m48072k4(int i, int i2) {
        Dictionary<Integer, String> dictionaryM48069du = m48069du(i);
        if (dictionaryM48069du == null || dictionaryM48069du.size() <= 0) {
            return null;
        }
        String[] strArr = {null};
        dictionaryM48069du.tryGetValue(Integer.valueOf(i2), strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static String m48070k4(Dictionary<Integer, String> dictionary) {
        Dictionary.ValueCollection.Enumerator<Integer, String> it = dictionary.getValues().iterator();
        try {
            if (it.hasNext()) {
                return it.next();
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return null;
            }
            it.dispose();
            return null;
        } finally {
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48073k4(int i, int i2, String str) {
        Dictionary<Integer, String> dictionaryM48069du;
        if (C12565ks.m58630x1(str) && (dictionaryM48069du = m48069du(i)) != null) {
            dictionaryM48069du.set_Item(Integer.valueOf(i2), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C9800x6[] m48074k4() {
        Dictionary<Integer, String> dictionaryM48069du = m48069du(4);
        Dictionary<Integer, String> dictionaryM48069du2 = m48069du(1);
        if (dictionaryM48069du.size() == 0 || dictionaryM48069du2.size() == 0) {
            return null;
        }
        C9800x6[] c9800x6Arr = new C9800x6[dictionaryM48069du.size()];
        Dictionary.Enumerator<Integer, String> it = dictionaryM48069du.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String[] strArr = {null};
                boolean zTryGetValue = dictionaryM48069du2.tryGetValue(next.getKey(), strArr);
                String strM48070k4 = strArr[0];
                if (!zTryGetValue) {
                    strArr[0] = strM48070k4;
                    boolean zTryGetValue2 = dictionaryM48069du2.tryGetValue(Integer.valueOf(EditingLanguage.ENGLISH_US), strArr);
                    strM48070k4 = strArr[0];
                    if (!zTryGetValue2) {
                        strM48070k4 = m48070k4(dictionaryM48069du2);
                    }
                }
                int i2 = i + 1;
                c9800x6Arr[i] = new C9800x6(strM48070k4, (String) next.getValue());
                i = i2;
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
        return c9800x6Arr;
    }
}
