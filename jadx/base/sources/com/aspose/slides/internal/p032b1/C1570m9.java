package com.aspose.slides.internal.p032b1;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.b1.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1570m9 implements InterfaceC14089ss<C1570m9> {

    /* JADX INFO: renamed from: k4 */
    private float f6083k4;

    /* JADX INFO: renamed from: kk */
    private int f6084kk;

    /* JADX INFO: renamed from: to */
    private boolean f6085to;

    /* JADX INFO: renamed from: x1 */
    private boolean f6086x1;

    public C1570m9(float f) {
        this(f, 0, false, false);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
    public boolean equals(Object obj) {
        return m8455k4((C1570m9) C7019kk.m27452k4(obj, C1570m9.class));
    }

    /* JADX INFO: renamed from: k4 */
    public final float m8453k4() {
        return this.f6083k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m8456kk() {
        return this.f6086x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m8457to() {
        return this.f6085to;
    }

    public String toString() {
        String str;
        if (m8457to()) {
            return "auto";
        }
        if (m8456kk()) {
            return "inherit";
        }
        switch (m8458x1()) {
            case 0:
                str = TranslateLanguage.PORTUGUESE;
                break;
            case 1:
                str = "em";
                break;
            case 2:
                str = "ex";
                break;
            case 3:
                str = "%";
                break;
            case 4:
                str = "px";
                break;
            case 5:
                str = BackupFile.EXTENSION_NOTEIN_FILE;
                break;
            case 6:
                str = "cm";
                break;
            case 7:
                str = "mm";
                break;
            case 8:
                str = "pc";
                break;
            default:
                throw new ArgumentOutOfRangeException(C14113y2.m67391k4(C11697x1.m55250kk(), "The Unit is out of range: {0}", C14042ak.m66410k4(C1567h4.class, m8458x1())));
        }
        return C14113y2.m67391k4(C11697x1.m55250kk(), "{0}{1}", Float.valueOf(m8453k4()), str);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8458x1() {
        return this.f6084kk;
    }

    public C1570m9(float f, int i) {
        this(f, i, false, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8454k4(boolean z) {
        this.f6086x1 = z;
    }

    public C1570m9(float f, int i, boolean z, boolean z2) {
        this.f6083k4 = f;
        this.f6084kk = i;
        this.f6085to = z;
        this.f6086x1 = z2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8455k4(C1570m9 c1570m9) {
        if (C14067j2.m66729x1(null, c1570m9)) {
            return false;
        }
        if (m8457to() && c1570m9.m8457to()) {
            return true;
        }
        if (m8456kk() && c1570m9.m8456kk()) {
            return true;
        }
        return m8458x1() == c1570m9.m8458x1() && C14064he.m66718x1(m8453k4(), c1570m9.m8453k4());
    }

    public C1570m9(boolean z) {
        this(0.0f, 0, z, false);
    }
}
