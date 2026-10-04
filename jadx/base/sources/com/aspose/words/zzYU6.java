package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
class zzYU6 extends com.aspose.words.internal.zzP {
    private int zzXSv;
    private boolean zzXSw;

    public zzYU6(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0, boolean z, boolean z2) throws Exception {
        super(zzzop, zzzo0, z);
        this.zzXSw = z2;
    }

    private static String getPrefix(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf > 0 ? str.substring(0, iIndexOf + 1) : "";
    }

    public static Object zzSx(boolean z) {
        if (z) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    private void zzU(String str, long j) {
        zzX(str, com.aspose.words.internal.zzJB.zz8(j));
    }

    private static String zzWK(double d) {
        return com.aspose.words.internal.zzJB.zzZT(zzYU3.zzV(d, 7, 2)) + TranslateLanguage.PORTUGUESE;
    }

    public static String zzWL(double d) {
        return com.aspose.words.internal.zzJB.zzX(d, 3) + "%";
    }

    public final void zz0(String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            zzX(str, str2);
        }
    }

    public final void zzA(String str, String str2, String str3) {
        if (com.aspose.words.internal.zzZKN.equals(str2, str3)) {
            return;
        }
        zz0(str, str2);
    }

    public final void zzN(String str, double d) {
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            return;
        }
        zzO(str, d);
    }

    public final void zzO(String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzZi(str, ((Integer) obj).intValue());
    }

    public final void zzP(String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            zz0(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            zzZj(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            zzU(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzO(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            zzx(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof zzY0) {
            zzx(str, ((zzY0) obj).zz8X());
        } else if (obj instanceof com.aspose.words.internal.zzPV) {
            zz0(str, zzYU3.zzZS((com.aspose.words.internal.zzPV) obj));
        } else {
            if (!(obj instanceof com.aspose.words.internal.zzZQ9)) {
                throw new IllegalStateException("Unknown object type in WriteAttribute method.");
            }
            zzV(str, (com.aspose.words.internal.zzZQ9) obj);
        }
    }

    public final void zzQ(String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Boolean) {
            zzy(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            zzYz(str, (String) obj);
        } else if (obj instanceof Integer) {
            zzZl(str, ((Integer) obj).intValue());
        } else {
            if (!(obj instanceof com.aspose.words.internal.zzPV)) {
                throw new IllegalStateException("Unknown object type in the WriteVal method.");
            }
            zzX(str, (com.aspose.words.internal.zzPV) obj);
        }
    }

    public final void zzV(String str, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        zzYz(str, zzYU3.zzXZ(bArr));
    }

    public void zzW(Shading shading) throws Exception {
    }

    public final void zzX(String str, com.aspose.words.internal.zzPV zzpv) {
        zzYz(str, zzYU3.zzZS(zzpv));
    }

    public final void zzY(String str, Object obj, Object obj2) {
        if (obj == null) {
            obj = obj2;
        }
        zzP(str, obj);
    }

    public final void zzYx(String str, String str2) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
            throw new IllegalStateException("Attempted to write a null or empty value, but it is required according to the schema.");
        }
        zzYz(str, str2);
    }

    public final void zzYy(String str, String str2) {
        if (str2 != null) {
            zzY(str);
            zzX(getPrefix(str) + "val", str2);
            zzp();
        }
    }

    public final boolean zzYyI() {
        return this.zzXSv > 0;
    }

    public final void zzYyJ() {
        this.zzXSv--;
    }

    public final void zzYyK() {
        this.zzXSv++;
    }

    public final void zzYz(String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            zzY(str);
            zzX(getPrefix(str) + "val", str2);
            zzp();
        }
    }

    public void zzZ(String str, Border border) throws Exception {
    }

    public final void zzZh(String str, int i) {
        if (i != 0) {
            zzZj(str, i);
        }
    }

    public final void zzZi(String str, int i) {
        zzX(str, com.aspose.words.internal.zzJB.zzWE(i));
    }

    public final void zzZj(String str, int i) {
        zzX(str, com.aspose.words.internal.zzJB.zzWF(i));
    }

    public final void zzZk(String str, int i) {
        if (i > 0) {
            zzYz(str, com.aspose.words.internal.zzJB.zzWF(i));
        }
    }

    public final void zzZl(String str, int i) {
        zzYz(str, com.aspose.words.internal.zzJB.zzWF(i));
    }

    public boolean zzZmO() {
        return false;
    }

    public void zzZmP() throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public final void zze(String str, boolean z) {
        if (z) {
            zzZ(str, (String) null);
        }
    }

    public final void zzv(String str, int i, int i2) {
        if (i != i2) {
            zzZl(str, i);
        }
    }

    public void zzw(String str, boolean z) {
        if (z) {
            zzX(str, this.zzXSw ? "on" : TelemetryEventStrings.Value.TRUE);
        }
    }

    public void zzx(String str, boolean z) {
        if (this.zzXSw) {
            zzX(str, z ? "on" : "off");
        } else {
            zzX(str, z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
    }

    public void zzy(String str, boolean z) {
        if (z) {
            zzZ(str, (String) null);
        } else {
            zzYz(str, "off");
        }
    }

    public void zzz(String str, boolean z) {
        zzYz(str, z ? "on" : "off");
    }

    public final void zzU(String str, byte[] bArr) {
        zzX(str, zzYU3.zzXZ(bArr));
    }

    public final boolean zzW(String str, Object... objArr) {
        int length = objArr.length / 2;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[(i * 2) + 1];
            if (obj != null && (!(obj instanceof String) || !"".equals((String) obj))) {
                zzY(str);
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    zzP((String) objArr[i3], objArr[i3 + 1]);
                }
                return true;
            }
        }
        return false;
    }

    public final void zzX(String str, Object... objArr) {
        if (zzW(str, objArr)) {
            zzp();
        }
    }

    public final void zzY(String str, com.aspose.words.internal.zzZOZ zzzoz) {
        zzX(str, zzzoz.toString("B"));
    }

    public final void zzZ(String str, PreferredWidth preferredWidth, boolean z) {
        if (preferredWidth == null) {
            return;
        }
        zzW(str, preferredWidth.zzYmE(), preferredWidth.getType(), z);
    }

    public final void zzz(String str, String str2, String str3) {
        zz0(str, com.aspose.words.internal.zzZKN.zzT(com.aspose.words.internal.zzZKN.format("{0},{1}", str2, str3), ','));
    }

    public final void zzO(String str, double d) {
        zzX(str, com.aspose.words.internal.zzJB.zzZU(d));
    }

    public final void zzU(String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        zzV(str, com.aspose.words.internal.zzZQ9.zzZ(zzzq9, 0L));
    }

    public final void zzV(String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        if (zzzq9.zzkR() == 2) {
            zzzq9 = zzzq9.zzkF();
        }
        zz0(str, com.aspose.words.internal.zzJB.zzR(zzzq9));
    }

    public void zzY(zzZV8 zzzv8, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public final void zzZ(String str, PreferredWidth preferredWidth, PreferredWidth preferredWidth2, PreferredWidth preferredWidth3, PreferredWidth preferredWidth4, boolean z) {
        if (preferredWidth == null && preferredWidth2 == null && preferredWidth3 == null && preferredWidth4 == null) {
            return;
        }
        zzY(str);
        zzZ("w:top", preferredWidth, z);
        zzZ(z ? "w:start" : "w:left", preferredWidth2, z);
        zzZ("w:bottom", preferredWidth3, z);
        zzZ(z ? "w:end" : "w:right", preferredWidth4, z);
        zzp();
    }

    public final void zzU(String str, String str2, String str3, String str4) {
        zz0(str, com.aspose.words.internal.zzZKN.zzT(com.aspose.words.internal.zzZKN.format("{0},{1},{2}", str2, str3, str4), ','));
    }

    public final void zzX(String str, Border border) throws Exception {
        if (border == null || border.isInherited()) {
            return;
        }
        if (border.zz8F()) {
            zzX(str, "w:val", "nil");
        } else {
            zzZ(str, border);
        }
    }

    public void zzY(zzYX5 zzyx5, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public final void zzV(String str, Object... objArr) throws Exception {
        int length = objArr.length / 2;
        for (int i = 0; i < length; i++) {
            Border border = (Border) objArr[(i * 2) + 1];
            if (border != null && !border.isInherited()) {
                zzY(str);
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    zzX((String) objArr[i3], (Border) objArr[i3 + 1]);
                }
                zzp();
                return;
            }
        }
    }

    public void zzX(zzZV8 zzzv8, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    private void zzW(String str, int i, int i2, boolean z) {
        String strZzWF;
        if (!z) {
            strZzWF = com.aspose.words.internal.zzJB.zzWF(i);
        } else if (i2 == 2) {
            strZzWF = zzWL(((double) i) / 50.0d);
        } else {
            strZzWF = zzWK(i);
        }
        zzX(str, "w:w", strZzWF, "w:type", zzY8T.zzkO(i2));
    }

    public void zzX(zzYX5 zzyx5, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public void zzZ(zzZMK zzzmk, String str, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public void zzZ(zzZV8 zzzv8, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public void zzZ(zzYX5 zzyx5, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public final void zzV(String str, int i, boolean z) {
        zzW(str, i, 3, z);
    }

    public void zzZ(zzYTV zzytv, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public void zzV(zzZV8 zzzv8, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public void zzW(zzZV8 zzzv8, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }

    public void zzW(zzYX5 zzyx5, int i) throws Exception {
        throw new UnsupportedOperationException("Concrete classes should implement.");
    }
}
