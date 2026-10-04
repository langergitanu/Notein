package com.aspose.slides.internal.p175i1;

/* JADX INFO: renamed from: com.aspose.slides.internal.i1.du */
/* JADX INFO: loaded from: classes.dex */
class C4782du {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC4786k4 m19842k4(Object obj, int i, int i2) {
        return (obj == null || i < 0 || i2 < 0) ? new C4787kk(i, i2) : obj instanceof byte[] ? new C4784h4((byte[]) obj, i, i2) : obj instanceof short[] ? new C4785jd((short[]) obj, i, i2) : obj instanceof int[] ? new C4788m9((int[]) obj, i, i2) : obj instanceof long[] ? new C4783dy((long[]) obj, i, i2) : new C4781c5(obj, i, i2);
    }
}
