package com.aspose.slides.internal.p407st;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10661u4 implements IGenericCloneable<C10661u4> {

    /* JADX INFO: renamed from: k4 */
    private C12003du f37420k4 = new C12003du();

    /* JADX INFO: renamed from: x1 */
    private long f37421x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.st.u4$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Long.class) { // from class: com.aspose.slides.internal.st.u4.k4.1
                {
                    addConstant("Background", 0L);
                    addConstant("Text", 1L);
                    addConstant("Shadow", 2L);
                    addConstant("TitleText", 3L);
                    addConstant("Fill", 4L);
                    addConstant("Accent1", 5L);
                    addConstant("Accent2", 6L);
                    addConstant("Accent3", 7L);
                    addConstant("Rgb", 254L);
                    addConstant("Undefined", 255L);
                }
            });
        }

        private k4() {
        }
    }

    public C10661u4(long j) {
        m51791k4(C3085sv.m13078k4(j & 16777215).Clone());
        m51790k4(((j & 4294967295L) >> 24) & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m51789k4() {
        return this.f37420k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51792kk() {
        return (((m51794x1() & 4294967295L) << 24) | C3085sv.m13075k4(m51789k4().Clone())) & 4294967295L;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final C10661u4 cloneT() {
        return new C10661u4(m51794x1(), m51789k4().Clone());
    }

    public String toString() {
        return C14113y2.m67402k4("ColorIndexStruct: Color: {0}, Index: {1}, Struct: 0x{2:X}", m51789k4().toString(), AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) k4.class), Long.valueOf(m51794x1())), Long.valueOf(m51792kk()));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51794x1() {
        return this.f37421x1;
    }

    public C10661u4(long j, C12003du c12003du) {
        m51791k4(c12003du.Clone());
        m51790k4(j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51790k4(long j) {
        this.f37421x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51791k4(C12003du c12003du) {
        c12003du.CloneTo(this.f37420k4);
    }
}
