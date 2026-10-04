package com.aspose.slides.internal.p240kw;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kw.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5995kk extends AbstractC5994k4 {

    /* JADX INFO: renamed from: to */
    private int f16927to;

    /* JADX INFO: renamed from: k4 */
    private IGenericDictionary<Integer, String> f16925k4 = new Dictionary();

    /* JADX INFO: renamed from: x1 */
    private IGenericDictionary<Integer, String> f16928x1 = new Dictionary();

    /* JADX INFO: renamed from: kk */
    private AbstractC6747ar f16926kk = new C6773ss(true, false);

    public C5995kk() {
        m24220x1(-1);
    }

    /* JADX INFO: renamed from: to */
    private int m24219to(String str) {
        byte[] bArrMo26677to = new C6773ss(true, false).mo26677to(str);
        int i = 0;
        for (int i2 = 0; i2 < bArrMo26677to.length - 1; i2++) {
            i = (i + (bArrMo26677to[i2] & 255)) << 8;
        }
        return i + (bArrMo26677to[bArrMo26677to.length - 1] & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m24221k4() {
        return this.f16927to;
    }

    /* JADX INFO: renamed from: kk */
    public IGenericDictionary<Integer, Integer> m24223kk() {
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f16925k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                dictionary.set_Item(keyValuePair.getKey(), Integer.valueOf(m24219to((String) keyValuePair.getValue())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f16928x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair2 = (KeyValuePair) it.next();
                dictionary.set_Item(keyValuePair2.getKey(), Integer.valueOf(m24219to((String) keyValuePair2.getValue())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    public IGenericDictionary<Integer, Integer> m24224x1() {
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f16925k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                dictionary.set_Item(Integer.valueOf(m24219to((String) keyValuePair.getValue())), keyValuePair.getKey());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f16928x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair2 = (KeyValuePair) it.next();
                dictionary.set_Item(Integer.valueOf(m24219to((String) keyValuePair2.getValue())), keyValuePair2.getKey());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private String m24218k4(byte[] bArr) {
        return bArr.length == 1 ? C14113y2.m67389k4((char) (bArr[0] & 255), 1) : this.f16926kk.m26681x1(bArr);
    }

    /* JADX INFO: renamed from: x1 */
    private void m24220x1(int i) {
        this.f16927to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public String m24222k4(byte[] bArr, int i, int i2) {
        if (i2 == 1) {
            int i3 = bArr[i] & 255;
            String[] strArr = {null};
            this.f16925k4.tryGetValue(Integer.valueOf(i3), strArr);
            return strArr[0];
        }
        if (i2 != 2) {
            return null;
        }
        int i4 = ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
        String[] strArr2 = {null};
        this.f16928x1.tryGetValue(Integer.valueOf(i4), strArr2);
        return strArr2[0];
    }

    @Override // com.aspose.slides.internal.p240kw.AbstractC5994k4
    /* JADX INFO: renamed from: k4 */
    public void mo24213k4(C7191up c7191up, C7185jd c7185jd) {
        byte[] bArrM27846k4 = c7191up.m27846k4();
        if (C7019kk.m27469x1(c7185jd, C7191up.class)) {
            String strM24218k4 = m24218k4(((C7191up) c7185jd).m27846k4());
            if (bArrM27846k4.length == 1) {
                this.f16925k4.set_Item(Integer.valueOf(bArrM27846k4[0] & 255), strM24218k4);
                if (" ".equals(strM24218k4)) {
                    m24220x1(bArrM27846k4[0] & 255);
                    return;
                }
                return;
            }
            if (bArrM27846k4.length != 2) {
                throw new IOException(C14113y2.m67402k4("The mapping code should be 1 or 2 bytes. Actual is '{0}'", Integer.valueOf(bArrM27846k4.length)));
            }
            int i = (bArrM27846k4[1] & 255) | ((bArrM27846k4[0] & 255) << 8);
            this.f16928x1.set_Item(Integer.valueOf(i), strM24218k4);
            if (" ".equals(strM24218k4)) {
                m24220x1(i);
            }
        }
    }
}
