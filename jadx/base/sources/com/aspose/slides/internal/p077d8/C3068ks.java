package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.ks */
/* JADX INFO: loaded from: classes3.dex */
public class C3068ks {

    /* JADX INFO: renamed from: k4 */
    String[] f9110k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<String, Integer> f9111kk;

    /* JADX INFO: renamed from: x1 */
    private int f9113x1 = 0;

    /* JADX INFO: renamed from: to */
    private boolean f9112to = false;

    public C3068ks(int i, boolean z, String... strArr) {
        m12962k4(i, z, strArr);
    }

    /* JADX INFO: renamed from: k4 */
    public int m12963k4(String str) {
        Dictionary<String, Integer> dictionary;
        if (this.f9112to) {
            dictionary = this.f9111kk;
            str = C14113y2.m67398k4(str, C11697x1.m55250kk());
        } else {
            dictionary = this.f9111kk;
        }
        return dictionary.get_Item(str).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m12965x1(String str) {
        Dictionary<String, Integer> dictionary;
        if (this.f9112to) {
            dictionary = this.f9111kk;
            str = C14113y2.m67398k4(str, C11697x1.m55250kk());
        } else {
            dictionary = this.f9111kk;
        }
        return dictionary.containsKey(str);
    }

    public C3068ks(int i, String... strArr) {
        m12962k4(i, false, strArr);
    }

    /* JADX INFO: renamed from: k4 */
    public String m12964k4(int i) {
        return this.f9110k4[i - this.f9113x1];
    }

    public C3068ks(String... strArr) {
        m12962k4(0, false, strArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12962k4(int i, boolean z, String[] strArr) {
        this.f9113x1 = i;
        this.f9110k4 = strArr;
        this.f9112to = z;
        this.f9111kk = new Dictionary<>();
        int i2 = 0;
        if (this.f9112to) {
            while (i2 < strArr.length) {
                this.f9111kk.addItem(C14113y2.m67398k4(strArr[i2], C11697x1.m55250kk()), Integer.valueOf(i2 + i));
                i2++;
            }
        } else {
            while (i2 < strArr.length) {
                this.f9111kk.addItem(strArr[i2], Integer.valueOf(i2 + i));
                i2++;
            }
        }
    }
}
