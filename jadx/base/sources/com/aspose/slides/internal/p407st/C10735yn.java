package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.yn */
/* JADX INFO: loaded from: classes4.dex */
public class C10735yn extends C10731yg {

    /* JADX INFO: renamed from: k4 */
    private final int f37545k4;

    public C10735yn(int i, int i2, byte b) {
        super(i, b, true);
        this.f37545k4 = i2;
        if (i != 5 && i != 6) {
            throw new ArgumentException("Path type can be Escape (0x5) or ClientEscape (0x6).", C18437z2.f56754h);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52080k4() {
        return this.f37545k4;
    }

    @Override // com.aspose.slides.internal.p407st.C10731yg
    public String toString() {
        return C14113y2.m67402k4("EsPathEscapeInfoStructure: Type: {0}, Segments: {1}, Escape: {2}.", AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10551my.class), Integer.valueOf(m52069to())), Byte.valueOf(m52068kk()), AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10660u1.class), Integer.valueOf(m52080k4())));
    }

    @Override // com.aspose.slides.internal.p407st.C10731yg
    /* JADX INFO: renamed from: x1 */
    public int mo52070x1() {
        return ((((C3085sv.m13071k4((m52069to() & 7) << 13) & 65535) | (((m52080k4() & 31) << 8) & 65535)) & 65535) | (m52068kk() & 255)) & 65535;
    }
}
