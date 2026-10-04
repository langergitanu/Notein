package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C9607yd {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, String> f34751k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Integer, String> f34754x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Integer, String> f34752kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private final Dictionary<Integer, String> f34753to = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private Dictionary<Integer, String> m46920to(int i) {
        if (i == 1) {
            return this.f34751k4;
        }
        if (i == 2) {
            return this.f34754x1;
        }
        if (i == 4) {
            return this.f34752kk;
        }
        if (i != 6) {
            return null;
        }
        return this.f34753to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m46921k4(int i) {
        String strM46926x1 = m46926x1(i);
        if (strM46926x1 != null) {
            return strM46926x1;
        }
        throw new InvalidOperationException("Requested a name string that is not present in the font.");
    }

    /* JADX INFO: renamed from: kk */
    public final String[] m46925kk(int i) {
        Dictionary<Integer, String> dictionaryM46920to = m46920to(i);
        if (dictionaryM46920to == null) {
            return null;
        }
        String[] strArr = new String[dictionaryM46920to.size()];
        Dictionary.ValueCollection.Enumerator<Integer, String> it = dictionaryM46920to.getValues().iterator();
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
    public final String m46926x1(int i) {
        Dictionary<Integer, String> dictionaryM46920to = m46920to(i);
        if (dictionaryM46920to == null || dictionaryM46920to.size() <= 0) {
            return null;
        }
        String[] strArr = {null};
        return !dictionaryM46920to.tryGetValue(Integer.valueOf(EditingLanguage.ENGLISH_US), strArr) ? m46919k4(dictionaryM46920to) : strArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final String m46922k4(int i, int i2) {
        Dictionary<Integer, String> dictionaryM46920to = m46920to(i);
        if (dictionaryM46920to == null || dictionaryM46920to.size() <= 0) {
            return null;
        }
        String[] strArr = {null};
        dictionaryM46920to.tryGetValue(Integer.valueOf(i2), strArr);
        return strArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static String m46919k4(Dictionary<Integer, String> dictionary) {
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
    public final void m46923k4(int i, int i2, String str) {
        Dictionary<Integer, String> dictionaryM46920to;
        if (C11292du.m54264k4(str) && (dictionaryM46920to = m46920to(i)) != null) {
            dictionaryM46920to.set_Item(Integer.valueOf(i2), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C9591ks[] m46924k4() {
        Dictionary<Integer, String> dictionaryM46920to = m46920to(4);
        Dictionary<Integer, String> dictionaryM46920to2 = m46920to(1);
        if (dictionaryM46920to.size() == 0 || dictionaryM46920to2.size() == 0) {
            return null;
        }
        C9591ks[] c9591ksArr = new C9591ks[dictionaryM46920to.size()];
        Dictionary.Enumerator<Integer, String> it = dictionaryM46920to.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String[] strArr = {null};
                boolean zTryGetValue = dictionaryM46920to2.tryGetValue(next.getKey(), strArr);
                String strM46919k4 = strArr[0];
                if (!zTryGetValue) {
                    strArr[0] = strM46919k4;
                    boolean zTryGetValue2 = dictionaryM46920to2.tryGetValue(Integer.valueOf(EditingLanguage.ENGLISH_US), strArr);
                    strM46919k4 = strArr[0];
                    if (!zTryGetValue2) {
                        strM46919k4 = m46919k4(dictionaryM46920to2);
                    }
                }
                int i2 = i + 1;
                c9591ksArr[i] = new C9591ks(strM46919k4, (String) next.getValue());
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
        return c9591ksArr;
    }
}
