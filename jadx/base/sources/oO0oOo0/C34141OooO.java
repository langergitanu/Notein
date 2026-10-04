package oO0oOo0;

import com.huawei.hms.network.embedded.C18241k5;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.InterfaceC34017OooO0o;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oOo0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34141OooO extends oO0oO0Oo.OooOo00 implements InterfaceC34017OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f122682OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public oO0oO0Oo.OooOo00 f122683OooOo0o;

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
        return new C34079o0ooOoO(2, 128, this.f122682OooOo, this.f122683OooOo0o);
    }

    public final String toString() {
        String string;
        String str;
        String str2 = C34336OooO0o.f123266OooO00o;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str2);
        int i = this.f122682OooOo;
        oO0oO0Oo.OooOo00 oooOo00 = this.f122683OooOo0o;
        if (i == 0) {
            string = oooOo00.toString();
            str = "fullName";
        } else {
            string = oooOo00.toString();
            str = "nameRelativeToCRLIssuer";
        }
        OooO0oo(stringBuffer, str2, str, string);
        stringBuffer.append("]");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
