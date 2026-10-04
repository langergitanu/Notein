package Oooooo;

import OooOoo0.C20703o000000o;
import OooooO0.C21293OooOO0;
import OooooOO.C21349OooooO0;
import OooooOO.InterfaceC21352Oooooo;
import Oooooo0.InterfaceC21402OooO0o0;
import com.aspose.words.StyleIdentifier;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24226OooO;
import o0000Ooo.C24237OooOO0o;
import o0000Ooo.C24239OooOOO0;

/* JADX INFO: renamed from: Oooooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21395OooO00o extends AbstractC21396OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f61898OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC21352Oooooo f61899OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f61900OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f61901OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f61902OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f61903OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C21349OooooO0 f61904OooOO0o;

    public C21395OooO00o(InterfaceC21352Oooooo interfaceC21352Oooooo) {
        int i;
        int i2;
        long j = C24226OooO.f81468OooO0O0;
        long jOooO00o = C24239OooOOO0.OooO00o(interfaceC21352Oooooo.getWidth(), interfaceC21352Oooooo.getHeight());
        this.f61899OooO0o = interfaceC21352Oooooo;
        this.f61900OooO0oO = j;
        this.f61901OooO0oo = jOooO00o;
        this.f61898OooO = 1;
        if (((int) (j >> 32)) < 0 || ((int) (j & 4294967295L)) < 0 || (i = (int) (jOooO00o >> 32)) < 0 || (i2 = (int) (jOooO00o & 4294967295L)) < 0 || i > interfaceC21352Oooooo.getWidth() || i2 > interfaceC21352Oooooo.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f61902OooOO0 = jOooO00o;
        this.f61903OooOO0O = 1.0f;
    }

    @Override // Oooooo.AbstractC21396OooO0O0
    public final boolean OooO00o(float f) {
        this.f61903OooOO0O = f;
        return true;
    }

    @Override // Oooooo.AbstractC21396OooO0O0
    public final boolean OooO0O0(C21349OooooO0 c21349OooooO0) {
        this.f61904OooOO0o = c21349OooooO0;
        return true;
    }

    @Override // Oooooo.AbstractC21396OooO0O0
    public final long OooO0OO() {
        return C24239OooOOO0.OooO(this.f61902OooOO0);
    }

    @Override // Oooooo.AbstractC21396OooO0O0
    public final void OooO0Oo(InterfaceC21402OooO0o0 interfaceC21402OooO0o0) {
        OooOOO0.OooO0oO(interfaceC21402OooO0o0, "<this>");
        InterfaceC21402OooO0o0.ooOO(interfaceC21402OooO0o0, this.f61899OooO0o, this.f61900OooO0oO, this.f61901OooO0oo, 0L, C24239OooOOO0.OooO00o(oO0O00O.OooO00o.OooO0O0(C21293OooOO0.OooO0Oo(interfaceC21402OooO0o0.OooOOo0())), oO0O00O.OooO00o.OooO0O0(C21293OooOO0.OooO0O0(interfaceC21402OooO0o0.OooOOo0()))), this.f61903OooOO0O, null, this.f61904OooOO0o, 0, this.f61898OooO, StyleIdentifier.LIST_TABLE_7_COLORFUL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21395OooO00o) {
            C21395OooO00o c21395OooO00o = (C21395OooO00o) obj;
            if (OooOOO0.OooO0O0(this.f61899OooO0o, c21395OooO00o.f61899OooO0o)) {
                int i = C24226OooO.f81469OooO0OO;
                if (this.f61900OooO0oO == c21395OooO00o.f61900OooO0oO && C24237OooOO0o.OooO00o(this.f61901OooO0oo, c21395OooO00o.f61901OooO0oo)) {
                    if (this.f61898OooO == c21395OooO00o.f61898OooO) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f61899OooO0o.hashCode() * 31;
        int i = C24226OooO.f81469OooO0OO;
        return Integer.hashCode(this.f61898OooO) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(iHashCode, 31, this.f61900OooO0oO), 31, this.f61901OooO0oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f61899OooO0o);
        sb.append(", srcOffset=");
        sb.append((Object) C24226OooO.OooO00o(this.f61900OooO0oO));
        sb.append(", srcSize=");
        sb.append((Object) C24237OooOO0o.OooO0O0(this.f61901OooO0oo));
        sb.append(", filterQuality=");
        int i = this.f61898OooO;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
