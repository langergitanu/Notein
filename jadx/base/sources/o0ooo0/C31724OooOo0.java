package o0ooo0;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0ooo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31724OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f113323OooO00o;

    public C31724OooOo0(byte[] bArr) {
        this.f113323OooO00o = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ FamilyKind = ");
        byte[] bArr = this.f113323OooO00o;
        sb.append((int) bArr[0]);
        sb.append(", SerifStyle = ");
        sb.append((int) bArr[1]);
        sb.append(", Weight = ");
        sb.append((int) bArr[2]);
        sb.append(", Proportion = ");
        sb.append((int) bArr[3]);
        sb.append(", Contrast = ");
        sb.append((int) bArr[4]);
        sb.append(", StrokeVariation = ");
        sb.append((int) bArr[5]);
        sb.append(", ArmStyle = ");
        sb.append((int) bArr[6]);
        sb.append(", Letterform = ");
        sb.append((int) bArr[7]);
        sb.append(", Midline = ");
        sb.append((int) bArr[8]);
        sb.append(", XHeight = ");
        return C21023OooO0Oo.OooO0OO("}", bArr[9], sb);
    }
}
