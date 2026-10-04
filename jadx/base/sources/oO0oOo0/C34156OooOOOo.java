package oO0oOo0;

import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oOo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34156OooOOOo extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f122728OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34141OooO f122729OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C34157OooOOo f122730OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f122731OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f122732OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public AbstractC34039OooOooO f122733OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f122734OooOoo0;

    public static void OooO0oo(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(C18241k5.f55433h);
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return this.f122733OooOoo;
    }

    public final String toString() {
        String str = C34336OooO0o.f123266OooO00o;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        C34141OooO c34141OooO = this.f122729OooOo0o;
        if (c34141OooO != null) {
            OooO0oo(stringBuffer, str, "distributionPoint", c34141OooO.toString());
        }
        boolean z = this.f122728OooOo;
        String str2 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            OooO0oo(stringBuffer, str, "onlyContainsUserCerts", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f122731OooOoO0;
        if (z2) {
            OooO0oo(stringBuffer, str, "onlyContainsCACerts", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        C34157OooOOo c34157OooOOo = this.f122730OooOoO;
        if (c34157OooOOo != null) {
            OooO0oo(stringBuffer, str, "onlySomeReasons", c34157OooOOo.getString());
        }
        boolean z3 = this.f122734OooOoo0;
        if (z3) {
            OooO0oo(stringBuffer, str, "onlyContainsAttributeCerts", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f122732OooOoOO;
        if (z4) {
            if (z4) {
                str2 = TelemetryEventStrings.Value.TRUE;
            }
            OooO0oo(stringBuffer, str, "indirectCRL", str2);
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
