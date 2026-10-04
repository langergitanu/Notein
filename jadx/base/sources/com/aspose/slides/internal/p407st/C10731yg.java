package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.yg */
/* JADX INFO: loaded from: classes4.dex */
public class C10731yg {

    /* JADX INFO: renamed from: k4 */
    private final int f37540k4;

    /* JADX INFO: renamed from: x1 */
    private final byte f37541x1;

    public C10731yg(int i, byte b) {
        if (i == 5 || i == 6) {
            throw new ArgumentException("Path type can't be Escape (0x5) and ClientEscape (0x6) in MSPATHINFO structure.", C18437z2.f56754h);
        }
        this.f37540k4 = i;
        this.f37541x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10731yg m52067k4(int i) {
        int i2 = 65535 & i;
        int i3 = i2 >> 13;
        int i4 = (i2 >> 8) & 31;
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C10551my.class), i3)) {
            throw new ArgumentException("Unknown path type.", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C10660u1.class), i4)) {
            throw new ArgumentException("Unknown path escape", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        byte b = (byte) (i & 255);
        return (i3 == 5 || i3 == 6) ? new C10735yn(i3, i4, b) : new C10731yg(i3, b);
    }

    /* JADX INFO: renamed from: kk */
    public final byte m52068kk() {
        return this.f37541x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m52069to() {
        return this.f37540k4;
    }

    public String toString() {
        return C14113y2.m67402k4("EsPathInfoStructure: Type: {0}, Segments: {1}.", AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10551my.class), Integer.valueOf(m52069to())), Byte.valueOf(m52068kk()));
    }

    /* JADX INFO: renamed from: x1 */
    public int mo52070x1() {
        return C3085sv.m13071k4((C3085sv.m13071k4((m52069to() & 7) << 13) & 65535) | (m52068kk() & 255));
    }

    public C10731yg(int i, byte b, boolean z) {
        this.f37540k4 = i;
        this.f37541x1 = b;
    }
}
