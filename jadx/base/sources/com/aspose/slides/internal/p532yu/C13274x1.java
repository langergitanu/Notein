package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13274x1 extends C13192rv {

    /* JADX INFO: renamed from: du */
    private Hashtable f44452du;

    /* JADX INFO: renamed from: dy */
    private int f44453dy;

    /* JADX INFO: renamed from: h4 */
    private Object[] f44454h4;

    /* JADX INFO: renamed from: m9 */
    private C13047jd f44455m9;

    public C13274x1(int i, int i2, boolean z) {
        super(i, false, z);
        this.f44453dy = 0;
        this.f44452du = new Hashtable(i2);
        this.f44454h4 = new Object[i2];
        this.f44455m9 = new C13047jd(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60049k4(C13190rs c13190rs, boolean z) {
        IDictionaryEnumerator it = this.f44452du.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                DictionaryEntry dictionaryEntry = (DictionaryEntry) it.next();
                C13047jd c13047jd = c13190rs.f44265rv;
                Object value = dictionaryEntry.getValue();
                Class cls = Integer.TYPE;
                if (!c13047jd.m60999k4(((Integer) C7019kk.m27464to(value, cls)).intValue()) && (!z || this.f44455m9.m60999k4(((Integer) C7019kk.m27464to(dictionaryEntry.getValue(), cls)).intValue()))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addItem(dictionaryEntry.getKey());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: x1 */
    public boolean mo60053x1(C13190rs c13190rs) {
        if (c13190rs.f44267up.f44122x1 != this.f44453dy) {
            return mo61457k4() && c13190rs.f44267up.f44122x1 == -1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60050k4(C13190rs c13190rs, boolean z, C13129ny c13129ny) {
        ArrayList arrayList = new ArrayList();
        IDictionaryEnumerator it = this.f44452du.iterator();
        while (it.hasNext()) {
            try {
                DictionaryEntry dictionaryEntry = (DictionaryEntry) it.next();
                C13047jd c13047jd = c13190rs.f44265rv;
                Object value = dictionaryEntry.getValue();
                Class cls = Integer.TYPE;
                if (!c13047jd.m60999k4(((Integer) C7019kk.m27464to(value, cls)).intValue()) && (!z || this.f44455m9.m60999k4(((Integer) C7019kk.m27464to(dictionaryEntry.getValue(), cls)).intValue()))) {
                    C13192rv.m61454k4((AbstractC12950dp) C7019kk.m27452k4(this.f44454h4[((Integer) C7019kk.m27464to(dictionaryEntry.getValue(), cls)).intValue()], AbstractC12950dp.class), c13129ny, arrayList);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public Object mo60051k4(C13890ei c13890ei, C13190rs c13190rs, int[] iArr) {
        Object obj = this.f44452du.get_Item(c13890ei);
        iArr[0] = 0;
        if (obj == null) {
            c13190rs.f44261kk = false;
            return null;
        }
        int iIntValue = ((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue();
        if (c13190rs.f44265rv.m60999k4(iIntValue)) {
            iArr[0] = -2;
            return null;
        }
        C13114n0 c13114n0 = c13190rs.f44267up;
        if (c13114n0.f44122x1 == -1) {
            c13114n0.f44122x1 = 0;
        }
        c13190rs.f44265rv.m61006x1(iIntValue);
        if (this.f44455m9.m60999k4(iIntValue)) {
            c13190rs.f44267up.f44122x1++;
        }
        return this.f44454h4[iIntValue];
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public void mo60052k4(C13190rs c13190rs) {
        c13190rs.f44265rv = new C13047jd(this.f44452du.size());
        c13190rs.f44267up.f44122x1 = -1;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo61457k4() {
        return super.mo61457k4() || this.f44453dy == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61665k4(C13890ei c13890ei, Object obj, boolean z) {
        if (this.f44452du.get_Item(c13890ei) != null) {
            return false;
        }
        int size = this.f44452du.size();
        this.f44452du.addItem(c13890ei, Integer.valueOf(size));
        this.f44454h4[size] = obj;
        if (!z) {
            this.f44455m9.m61006x1(size);
            this.f44453dy++;
        }
        return true;
    }
}
