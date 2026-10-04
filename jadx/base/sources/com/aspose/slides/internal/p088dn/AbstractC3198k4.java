package com.aspose.slides.internal.p088dn;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3198k4 {

    /* JADX INFO: renamed from: k4 */
    private static HashMap<Class, AbstractC3198k4> f9530k4 = new HashMap<>();

    /* JADX INFO: renamed from: x1 */
    private static AbstractC3198k4 f9531x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$c5 */
    public static class c5 extends AbstractC3198k4 {
        private c5() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((short[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Short.valueOf(((short[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            ((short[]) obj)[i] = C14080ne.m66877du(obj2, (InterfaceC14073kp) null);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$du */
    public static class du extends AbstractC3198k4 {
        private du() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((float[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Float.valueOf(((float[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            float[] fArr = (float[]) obj;
            if (obj2.getClass().equals(Character.class)) {
                fArr[i] = ((Character) obj2).charValue();
            } else {
                fArr[i] = C14080ne.m66862ck(obj2, (InterfaceC14073kp) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$dy */
    public static class dy extends AbstractC3198k4 {
        private dy() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((Object[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return ((Object[]) obj)[i];
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            Object[] objArr = (Object[]) obj;
            if (obj2 instanceof AbstractC14092to) {
                objArr[i] = AbstractC14092to.m67212k4((AbstractC14092to) obj2);
            } else {
                objArr[i] = obj2;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$h4 */
    public static class h4 extends AbstractC3198k4 {
        private h4() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((int[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Integer.valueOf(((int[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            ((int[]) obj)[i] = C14080ne.m66999m9(obj2, (InterfaceC14073kp) null);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$k4 */
    public static class k4 extends AbstractC3198k4 {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((boolean[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Boolean.valueOf(((boolean[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            ((boolean[]) obj)[i] = C14080ne.m66966k4(obj2, (InterfaceC14073kp) null);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$kk */
    public static class kk extends AbstractC3198k4 {
        private kk() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((char[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Character.valueOf(((char[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            ((char[]) obj)[i] = C14080ne.m67040x1(obj2, (InterfaceC14073kp) null);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$m9 */
    public static class m9 extends AbstractC3198k4 {
        private m9() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((long[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Long.valueOf(((long[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            ((long[]) obj)[i] = C14080ne.m66848c5(obj2, (InterfaceC14073kp) null);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$to */
    public static class to extends AbstractC3198k4 {
        private to() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((double[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Double.valueOf(((double[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            double[] dArr = (double[]) obj;
            if (obj2.getClass().equals(Character.class)) {
                dArr[i] = ((Character) obj2).charValue();
            } else {
                dArr[i] = C14080ne.m66904fa(obj2, (InterfaceC14073kp) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.k4$x1 */
    public static class x1 extends AbstractC3198k4 {
        private x1() {
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public int mo13773k4(Object obj) {
            return ((byte[]) obj).length;
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public Object mo13774k4(Object obj, int i) {
            return Byte.valueOf(((byte[]) obj)[i]);
        }

        @Override // com.aspose.slides.internal.p088dn.AbstractC3198k4
        /* JADX INFO: renamed from: k4 */
        public void mo13775k4(Object obj, int i, Object obj2) {
            ((byte[]) obj)[i] = C14080ne.m67012to(obj2, (InterfaceC14073kp) null);
        }
    }

    static {
        f9531x1 = new dy();
        f9530k4.put(Byte.TYPE, new x1());
        f9530k4.put(Short.TYPE, new c5());
        f9530k4.put(Integer.TYPE, new h4());
        f9530k4.put(Long.TYPE, new m9());
        f9530k4.put(Character.TYPE, new kk());
        f9530k4.put(Float.TYPE, new du());
        f9530k4.put(Double.TYPE, new to());
        f9530k4.put(Boolean.TYPE, new k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3198k4 m13771k4() {
        return f9531x1;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo13773k4(Object obj);

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo13774k4(Object obj, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo13775k4(Object obj, int i, Object obj2);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3198k4 m13772k4(Class cls) {
        AbstractC3198k4 abstractC3198k4 = f9530k4.get(cls);
        return abstractC3198k4 == null ? f9531x1 : abstractC3198k4;
    }
}
