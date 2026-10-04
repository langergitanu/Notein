package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.cx */
/* JADX INFO: loaded from: classes3.dex */
public class C2038cx {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Integer, String> f7053k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, String> f7054x1 = new Dictionary<>();

    public C2038cx() {
    }

    public boolean equals(Object obj) {
        String str = (String) C7019kk.m27452k4(obj, String.class);
        return str != null ? m10342k4(str) : C14067j2.m66729x1(this, obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10341k4(String str, int i) {
        if (!this.f7054x1.containsKey(str)) {
            this.f7054x1.addItem(str, str);
        }
        if (this.f7053k4.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f7053k4.addItem(Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m10344x1() {
        Integer num;
        int iIntValue;
        String str = C14113y2.f47374k4;
        Dictionary.KeyCollection.Enumerator<Integer, String> it = this.f7053k4.getKeys().iterator();
        do {
            try {
                if (!it.hasNext()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return str;
                }
                num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                iIntValue = num.intValue();
                if (C14113y2.m67411k4(str)) {
                    str = this.f7053k4.get_Item(num);
                }
                if (iIntValue == 1033 || iIntValue == 3081 || iIntValue == 2057 || iIntValue == 4105) {
                    break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        } while (iIntValue != 5129);
        String str2 = this.f7053k4.get_Item(num);
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return str2;
    }

    public C2038cx(String str) {
        m10341k4(str, EditingLanguage.ENGLISH_US);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m10342k4(String str) {
        return this.f7054x1.containsKey(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m10343k4() {
        String[] strArr = new String[this.f7054x1.getKeys().size()];
        Dictionary.KeyCollection.Enumerator<String, String> it = this.f7054x1.getKeys().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                int i2 = i + 1;
                strArr[i] = it.next();
                i = i2;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return strArr;
    }
}
