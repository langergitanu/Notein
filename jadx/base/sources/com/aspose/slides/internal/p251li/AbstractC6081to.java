package com.aspose.slides.internal.p251li;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.to */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6081to extends C6045bz {
    public AbstractC6081to() {
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m24630k4() {
        return (byte) ((mo24431G_() & 3840) >> 8);
    }

    public AbstractC6081to(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24631k4(byte b) {
        mo24437k4((short) (mo24431G_() & (-3841)));
        mo24437k4((short) (((short) ((b & 15) << 8)) | mo24431G_()));
    }
}
