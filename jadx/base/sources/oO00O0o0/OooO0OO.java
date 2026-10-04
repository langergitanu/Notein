package oO00O0o0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Byte, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f115519OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(StringBuilder sb) {
        super(1);
        this.f115519OooOo0o = sb;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Byte b) {
        byte bByteValue = b.byteValue();
        StringBuilder sb = this.f115519OooOo0o;
        if (bByteValue == 32) {
            sb.append("%20");
        } else if (OooO0O0.f115511OooO00o.contains(Byte.valueOf(bByteValue)) || OooO0O0.f115514OooO0Oo.contains(Byte.valueOf(bByteValue))) {
            sb.append((char) bByteValue);
        } else {
            sb.append(OooO0O0.OooO00o(bByteValue));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
