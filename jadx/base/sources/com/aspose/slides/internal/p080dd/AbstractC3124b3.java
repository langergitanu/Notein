package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.b3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3124b3 implements IDisposable {

    /* JADX INFO: renamed from: to */
    public static AbstractC3124b3 f9267to = new k4();

    /* JADX INFO: renamed from: kk */
    InterfaceC14073kp f9268kk;

    /* JADX INFO: renamed from: x1 */
    protected char[] f9269x1 = C14113y2.m67365dy(C14052dq.f47188k4);

    /* JADX INFO: renamed from: com.aspose.slides.internal.dd.b3$k4 */
    public static final class k4 extends AbstractC3124b3 {
        @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
        /* JADX INFO: renamed from: k4 */
        public void mo13302k4(char c) {
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
        /* JADX INFO: renamed from: x1 */
        public AbstractC6747ar mo13310x1() {
            return AbstractC6747ar.m26634h4();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
        /* JADX INFO: renamed from: k4 */
        public void mo13304k4(String str) {
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
        /* JADX INFO: renamed from: k4 */
        public void mo13307k4(char[] cArr, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3124b3 m13312k4(AbstractC3124b3 abstractC3124b3) {
        return m13313k4(abstractC3124b3, false);
    }

    /* JADX INFO: renamed from: Z_ */
    public void mo13314Z_() {
        mo13306k4(this.f9269x1);
    }

    /* JADX INFO: renamed from: a_ */
    public void mo13315a_(boolean z) {
        mo13304k4(Boolean.toString(z));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo13311x1(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: kk */
    public void mo13308kk() {
    }

    /* JADX INFO: renamed from: to */
    public void mo13309to() {
        mo13311x1(true);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract AbstractC6747ar mo13310x1();

    /* JADX INFO: renamed from: x1 */
    public void mo13324x1(int i) {
        mo13316k4(i);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3124b3 m13313k4(AbstractC3124b3 abstractC3124b3, boolean z) {
        if (abstractC3124b3 != null) {
            return abstractC3124b3 instanceof C3137lr ? abstractC3124b3 : new C3137lr(abstractC3124b3, z);
        }
        throw new ArgumentNullException("writer is null");
    }

    /* JADX INFO: renamed from: kk */
    public void mo13322kk(String str) {
        if (str == null) {
            str = C14052dq.f47188k4;
        }
        this.f9269x1 = C14113y2.m67365dy(str);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13325x1(Object obj) {
        mo13317k4(obj);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13302k4(char c) {
    }

    /* JADX INFO: renamed from: kk */
    public void mo13323kk(boolean z) {
        mo13315a_(z);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13326x1(String str) {
        mo13304k4(str);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13316k4(int i) {
        mo13304k4(Integer.toString(i));
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13327x1(String str, Object obj) {
        mo13318k4(str, obj);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13317k4(Object obj) {
        if (obj != null) {
            mo13304k4(obj.toString());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13328x1(String str, Object obj, Object obj2) {
        mo13319k4(str, obj, obj2);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13304k4(String str) {
        if (str != null) {
            mo13306k4(C14113y2.m67365dy(str));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13329x1(String str, Object obj, Object obj2, Object obj3) {
        mo13320k4(str, obj, obj2, obj3);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13318k4(String str, Object obj) {
        mo13304k4(C14113y2.m67402k4(str, obj));
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13330x1(String str, Object... objArr) {
        mo13321k4(str, objArr);
        mo13314Z_();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13319k4(String str, Object obj, Object obj2) {
        mo13304k4(C14113y2.m67402k4(str, obj, obj2));
    }

    /* JADX INFO: renamed from: x1 */
    public void mo13311x1(boolean z) {
        if (z) {
            C14094ts.m67303k4(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13320k4(String str, Object obj, Object obj2, Object obj3) {
        mo13304k4(C14113y2.m67402k4(str, obj, obj2, obj3));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13321k4(String str, Object... objArr) {
        mo13304k4(C14113y2.m67402k4(str, objArr));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13306k4(char[] cArr) {
        if (cArr == null) {
            return;
        }
        mo13307k4(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13307k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i > cArr.length) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 < 0 || i > cArr.length - i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        while (i2 > 0) {
            mo13302k4(cArr[i]);
            i2--;
            i++;
        }
    }
}
