package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3302lr extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9666k4 = new C7017h4("em", "ex", "px", "cm", "mm", BackupFile.EXTENSION_NOTEIN_FILE, TranslateLanguage.PORTUGUESE, "pc", "deg", "rad", "grad", TranslateLanguage.MALAY, "s", "Hz", "khz", "dpi", "dpcm", "dppx", "%", "");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return C14113y2.f47374k4;
            case 1:
                return "%";
            case 2:
                return "em";
            case 3:
                return "ex";
            case 4:
                return "px";
            case 5:
                return "cm";
            case 6:
                return "mm";
            case 7:
                return BackupFile.EXTENSION_NOTEIN_FILE;
            case 8:
                return TranslateLanguage.PORTUGUESE;
            case 9:
                return "pc";
            case 10:
                return "deg";
            case 11:
                return "rad";
            case 12:
                return "grad";
            case 13:
                return TranslateLanguage.MALAY;
            case 14:
                return "s";
            case 15:
                return "Hz";
            case 16:
                return "kHz";
            case 17:
                return "dpi";
            case 18:
                return "dpcm";
            case 19:
                return "dppx";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9666k4.m27428k4(C14113y2.m67368h4(str))) {
            case 0:
                iArr[0] = 2;
                return true;
            case 1:
                iArr[0] = 3;
                return true;
            case 2:
                iArr[0] = 4;
                return true;
            case 3:
                iArr[0] = 5;
                return true;
            case 4:
                iArr[0] = 6;
                return true;
            case 5:
                iArr[0] = 7;
                return true;
            case 6:
                iArr[0] = 8;
                return true;
            case 7:
                iArr[0] = 9;
                return true;
            case 8:
                iArr[0] = 10;
                return true;
            case 9:
                iArr[0] = 11;
                return true;
            case 10:
                iArr[0] = 12;
                return true;
            case 11:
                iArr[0] = 13;
                return true;
            case 12:
                iArr[0] = 14;
                return true;
            case 13:
                iArr[0] = 15;
                return true;
            case 14:
                iArr[0] = 16;
                return true;
            case 15:
                iArr[0] = 17;
                return true;
            case 16:
                iArr[0] = 18;
                return true;
            case 17:
                iArr[0] = 19;
                return true;
            case 18:
                iArr[0] = 1;
                return true;
            case 19:
                iArr[0] = 0;
                return true;
            default:
                throw new ArgumentException(ResponseType.TOKEN);
        }
    }
}
