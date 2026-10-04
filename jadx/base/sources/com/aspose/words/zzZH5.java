package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZH5 extends zzZ1H {
    private boolean zzYpB;
    private zzZAO zzYqI;
    private zzZJU zzYsy;
    private DocumentBase zzZCL;

    public zzZH5(DocumentBase documentBase, boolean z, zzZAO zzzao, zzZJU zzzju) {
        this.zzZCL = documentBase;
        this.zzYpB = z;
        this.zzYqI = zzzao;
        this.zzYsy = zzzju;
    }

    @Override // com.aspose.words.zzZ1H
    public final String zzKR(String str) {
        return this.zzYqI.zzKR(str);
    }

    @Override // com.aspose.words.zzZ1H
    public final void zzY(String str, String str2, String str3, boolean z) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzYsy.zzZ42();
        this.zzYqI.zzZ3E().zzZN("a", 0);
        this.zzYqI.zzZ3E().zzX("href", str);
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzYqI.zzZ3E().zzX("target", str2);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            this.zzYqI.zzZ3E().zzX(NoteMeta.PROPERTY_TITLE, str3);
        }
        zzLU zzlu = new zzLU();
        zzlu.zzSe("none");
        if (z) {
            zzlu.zzZs("-aw-ignore", TelemetryEventStrings.Value.TRUE);
        }
        this.zzYqI.zzZ3C().zzV(zzlu);
    }

    @Override // com.aspose.words.zzZ1H
    public final void zzZ1E() {
        this.zzYqI.zzZ3E().endElement("a");
        this.zzYsy.zzZ41();
    }

    @Override // com.aspose.words.zzZ1H
    public final boolean zzr(String str, boolean z) throws Exception {
        if (!z && this.zzYpB && com.aspose.words.internal.zzZKN.zzS(str, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            if (zzY9.zzZ(this.zzZCL, str.substring(1)) == null) {
                return false;
            }
        }
        return true;
    }
}
