package com.aspose.slides.internal.p067cu;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.aspose.slides.internal.cu.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C2631kk {

    /* JADX INFO: renamed from: k4 */
    private LinkedList<C2633x1> f8443k4 = new LinkedList<>();

    /* JADX INFO: renamed from: du */
    public C2631kk m12019du() {
        float f;
        float f2;
        float f3;
        float f4;
        C2631kk c2631kk = new C2631kk();
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (C2633x1 c2633x1 : this.f8443k4) {
            float[] fArrM12035kk = c2633x1.m12035kk();
            int iM12037x1 = c2633x1.m12037x1();
            if (iM12037x1 == 2) {
                f = fArrM12035kk[0];
                f2 = fArrM12035kk[1];
            } else if (iM12037x1 != 4) {
                if (iM12037x1 == 6) {
                    c2631kk.m12021k4(C2633x1.m12030k4(fArrM12035kk[0], fArrM12035kk[1], f5, f6));
                    f3 = fArrM12035kk[2];
                    f4 = fArrM12035kk[3];
                } else if (iM12037x1 == 8) {
                    c2631kk.m12021k4(C2633x1.m12031k4(fArrM12035kk[2], fArrM12035kk[3], fArrM12035kk[0], fArrM12035kk[1], f5, f6));
                    f3 = fArrM12035kk[4];
                    f4 = fArrM12035kk[5];
                }
                f5 = f3;
                f6 = f4;
            } else {
                c2631kk.m12021k4(C2633x1.m12032x1(f5, f6));
                f = fArrM12035kk[0];
                f2 = fArrM12035kk[1];
            }
            f6 = f2;
            f5 = f;
        }
        c2631kk.m12021k4(C2633x1.m12029k4(f5, f6));
        return c2631kk;
    }

    /* JADX INFO: renamed from: k4 */
    public int m12020k4() {
        return this.f8443k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public Iterator<C2633x1> m12022kk() {
        return this.f8443k4.iterator();
    }

    /* JADX INFO: renamed from: to */
    public Iterator<C2633x1> m12023to() {
        return this.f8443k4.descendingIterator();
    }

    /* JADX INFO: renamed from: x1 */
    public void m12024x1() {
        this.f8443k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public void m12021k4(C2633x1 c2633x1) {
        this.f8443k4.addFirst(c2633x1);
    }

    /* JADX INFO: renamed from: x1 */
    public void m12025x1(C2633x1 c2633x1) {
        this.f8443k4.addLast(c2633x1);
    }
}
