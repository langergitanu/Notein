package com.aspose.slides.internal.p536z0;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.z0.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13348k4 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f44704k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f44705x1;

    public C13348k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("sourceStream");
        }
        if (!abstractC3150x6.canSeek()) {
            throw new ArgumentException("Stream should be seekable", "sourceStream");
        }
        this.f44704k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f44704k4.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f44704k4.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f44704k4.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        super.dispose(z);
        this.f44705x1 = true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f44704k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f44704k4.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f44704k4.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m62016k4() {
        return this.f44704k4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        return this.f44704k4.read(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        return this.f44704k4.seek(j, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f44704k4.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        this.f44704k4.setPosition(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        this.f44704k4.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m62017x1() {
        return this.f44705x1;
    }
}
