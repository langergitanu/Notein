package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.um */
/* JADX INFO: loaded from: classes.dex */
public class C5555um {

    /* JADX INFO: renamed from: k4 */
    private List<k4> f15288k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.jw.um$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private String f15294k4;

        /* JADX INFO: renamed from: x1 */
        private String f15295x1;

        /* JADX INFO: renamed from: k4 */
        public final String m22828k4() {
            return this.f15294k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final String m22829x1() {
            return this.f15295x1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m22818x1(final String str) {
        return m22820x1().findIndex(new AbstractC14041ai<k4>() { // from class: com.aspose.slides.internal.jw.um.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(k4 k4Var) {
                return C14113y2.m67363du(k4Var.m22829x1(), str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final int m22821k4() {
        return m22820x1().size();
    }

    /* JADX INFO: renamed from: x1 */
    private int m22819x1(final String str, final String str2) {
        return m22820x1().findIndex(new AbstractC14041ai<k4>() { // from class: com.aspose.slides.internal.jw.um.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(k4 k4Var) {
                return C14113y2.m67363du(k4Var.m22829x1(), str2) && C14113y2.m67363du(k4Var.m22828k4(), str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m22822k4(int i) {
        return m22820x1().get_Item(i).m22829x1();
    }

    /* JADX INFO: renamed from: x1 */
    private List<k4> m22820x1() {
        if (this.f15288k4 == null) {
            this.f15288k4 = new List<>();
        }
        return this.f15288k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22823k4(String str) {
        return m22818x1(str) != -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22824k4(String str, String str2) {
        return m22819x1(str, str2) != -1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m22825x1(int i) {
        return m22820x1().get_Item(i).m22828k4();
    }
}
