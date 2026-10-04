package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.internal.fido.FidoChallenge;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZJ3 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("checkbox", "date", "radio", "reset", "submit", "button", "hidden");
    private int zzYsn;
    private zzZYY zzYso;
    private byte[] zzYsp;
    private byte[] zzYsq;
    private DocumentBuilder zzZwh;

    public zzZJ3(DocumentBuilder documentBuilder, zzZYY zzzyy) {
        this.zzZwh = documentBuilder;
        this.zzYso = zzzyy;
    }

    private void zzW(zzZIG zzzig) throws Exception {
        byte[] bArrZzY = zzY(this.zzZwh.getDocument(), zzzig.zzZ2B().zzL6("checked") != null);
        zzZIG zzzig2 = new zzZIG("input");
        zzzig2.zzZ2B().zzY(new zzZK9(C18437z2.f56754h, "radio"));
        String[] strArr = {"name", "disabled", "checked", "value", FidoChallenge.DEFAULT_USER_VERIFICATION_POLICY, "form", "alt"};
        for (int i = 0; i < 7; i++) {
            String str = strArr[i];
            zzZK9 zzzk9ZzL6 = zzzig.zzZ2B().zzL6(str);
            if (zzzk9ZzL6 != null) {
                if ("checked".equals(str)) {
                    zzzk9ZzL6 = new zzZK9("checked", TelemetryEventStrings.Value.TRUE);
                }
                zzzig2.zzZ2B().zzY(zzzk9ZzL6);
            }
        }
        int i2 = this.zzYsn + 1;
        this.zzYsn = i2;
        this.zzZwh.zzZ(new zzZFY(com.aspose.words.internal.zzZKN.format("DefOcxName{0}", Integer.valueOf(i2)), zzzig2.zzZ0g()), new com.aspose.words.internal.zzZOR(bArrZzY));
    }

    private byte[] zzY(Document document, boolean z) throws Exception {
        if (z) {
            if (this.zzYsq == null) {
                this.zzYsq = zzZGZ.zzX(document, true);
            }
            return this.zzYsq;
        }
        if (this.zzYsp == null) {
            this.zzYsp = zzZGZ.zzX(document, false);
        }
        return this.zzYsp;
    }

    public final void zzZ(zzZIG zzzig, String str) throws Exception {
        String attributeValue = zzzig.zzZ2B().getAttributeValue("name", "");
        String attributeValue2 = zzzig.zzZ2B().getAttributeValue("value", "");
        int iZzZR = zzzig.zzZ2B().zzZR("maxlength", 0);
        boolean z = zzzig.zzZ2B().zzL6("disabled") != null;
        boolean z2 = (z || (zzzig.zzZ2B().zzL6("readonly") != null)) ? false : true;
        switch (zzUR.zzTP(str)) {
            case 0:
                zzZ(attributeValue, z, z2, zzzig.zzZ2B().zzL6("checked") != null);
                break;
            case 1:
                zzZ(attributeValue, z2, attributeValue2, iZzZR);
                break;
            case 2:
                zzW(zzzig);
                break;
            case 3:
                this.zzYso.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
                this.zzZwh.insertField("MACROBUTTON ResetFormField [" + attributeValue2 + "]");
                break;
            case 4:
            case 5:
                this.zzYso.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
                this.zzZwh.insertField("MACROBUTTON DoFieldClick  [" + attributeValue2 + "]");
                break;
            case 6:
                break;
            default:
                zzZ(attributeValue, attributeValue2, z2, iZzZR, zzzig.zzZ2B().getAttributeValue("placeholder", ""));
                break;
        }
    }

    public abstract void zzZ(String str, String str2, boolean z, int i, String str3) throws Exception;

    public abstract void zzZ(String str, boolean z, Iterable<zzZFW> iterable) throws Exception;

    public abstract void zzZ(String str, boolean z, String str2, int i) throws Exception;

    public abstract void zzZ(String str, boolean z, boolean z2, boolean z3) throws Exception;

    public final zzZYY zzZ3J() {
        return this.zzYso;
    }

    public final DocumentBuilder zzZ3K() {
        return this.zzZwh;
    }

    public final void zzZ(zzZIG zzzig, ArrayList<zzZFW> arrayList) throws Exception {
        String attributeValue = zzzig.zzZ2B().getAttributeValue("name", "dropdown");
        boolean z = false;
        boolean z2 = zzzig.zzZ2B().zzL6("disabled") != null;
        boolean z3 = zzzig.zzZ2B().zzL6("readonly") != null;
        if (!z2 && !z3) {
            z = true;
        }
        zzZ(attributeValue, z, arrayList);
    }
}
