package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11532fa extends AbstractC11535k4 {

    /* JADX INFO: renamed from: k4 */
    protected static final String[] f39021k4;

    /* JADX INFO: renamed from: kk */
    private short f39022kk;

    /* JADX INFO: renamed from: x1 */
    private int f39023x1;

    static {
        String str = C14113y2.f47374k4;
        f39021k4 = new String[]{str, "%", "em", "ex", "px", "cm", "mm", BackupFile.EXTENSION_NOTEIN_FILE, TranslateLanguage.PORTUGUESE, "pc", "deg", "rad", "grad", TranslateLanguage.MALAY, "s", "Hz", "kHz", str};
    }

    public C11532fa(int i, short s) {
        super(s);
        this.f39023x1 = i;
        this.f39022kk = s;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        return C14113y2.m67408k4(C14057f9.m66586k4(this.f39023x1, (InterfaceC14073kp) C6344m9.f18038k4), f39021k4[this.f39022kk - 1]);
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: k4 */
    public float mo23699k4(short s) {
        return this.f39023x1;
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: x1 */
    public int mo23705x1(short s) {
        return this.f39023x1;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        C11532fa c11532fa = (C11532fa) C7019kk.m27452k4((Object) abstractC5788h4, C11532fa.class);
        if (C14067j2.m66729x1(null, c11532fa)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c11532fa)) {
            return true;
        }
        return C14088s7.m67181x1(m23417m9(), c11532fa.m23417m9()) && C14057f9.m66592x1(this.f39023x1, c11532fa.f39023x1);
    }
}
