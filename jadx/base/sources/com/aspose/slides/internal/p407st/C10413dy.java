package com.aspose.slides.internal.p407st;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10413dy extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f36952k4 = {2041, Integer.MAX_VALUE};

    public C10413dy() {
        m51409um().m51917k4(2040);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f36952k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10384c5[] m50715x1() {
        if (m50513yj().size() <= 0) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < m50513yj().size(); i2++) {
            if (m50513yj().get_Item(i2) instanceof C10384c5) {
                i++;
            }
        }
        C10384c5[] c10384c5Arr = new C10384c5[i];
        int i3 = 0;
        for (int i4 = 0; i4 < m50513yj().size(); i4++) {
            if (m50513yj().get_Item(i4) instanceof C10384c5) {
                c10384c5Arr[i3] = (C10384c5) m50513yj().get_Item(i4);
                i3++;
            }
        }
        return c10384c5Arr;
    }
}
