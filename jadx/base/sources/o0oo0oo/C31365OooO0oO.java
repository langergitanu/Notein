package o0oo0oo;

import androidx.core.view.InputDeviceCompat;
import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31365OooO0oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final double f111985OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f111986OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f111987OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final short f111988OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short f111989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f111990OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final short f111991OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final double f111992OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final double f111993OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final double f111994OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f111995OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f111996OooOO0o;

    public C31365OooO0oO(AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        this.f111992OooO0oO = 1.0d;
        this.f111993OooO0oo = 1.0d;
        this.f111985OooO = 0.0d;
        this.f111994OooOO0 = 0.0d;
        this.f111995OooOO0O = 0;
        this.f111996OooOO0o = 0;
        short sOooo000 = abstractC31397Oooo0O0.Oooo000();
        this.f111991OooO0o0 = sOooo000;
        this.f111990OooO0o = abstractC31397Oooo0O0.ooOO();
        if ((sOooo000 & 1) != 0) {
            this.f111988OooO0OO = abstractC31397Oooo0O0.Oooo000();
            this.f111989OooO0Oo = abstractC31397Oooo0O0.Oooo000();
        } else {
            int i = abstractC31397Oooo0O0.read();
            this.f111988OooO0OO = (short) (i > 127 ? i + InputDeviceCompat.SOURCE_ANY : i);
            int i2 = abstractC31397Oooo0O0.read();
            this.f111989OooO0Oo = (short) (i2 > 127 ? i2 + InputDeviceCompat.SOURCE_ANY : i2);
        }
        if ((sOooo000 & 2) != 0) {
            this.f111995OooOO0O = this.f111988OooO0OO;
            this.f111996OooOO0o = this.f111989OooO0Oo;
        }
        if ((sOooo000 & 8) != 0) {
            double dOooo000 = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
            this.f111993OooO0oo = dOooo000;
            this.f111992OooO0oO = dOooo000;
        } else if ((sOooo000 & 64) != 0) {
            this.f111992OooO0oO = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
            this.f111993OooO0oo = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
        } else if ((sOooo000 & 128) != 0) {
            this.f111992OooO0oO = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
            this.f111985OooO = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
            this.f111994OooOO0 = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
            this.f111993OooO0oo = ((double) abstractC31397Oooo0O0.Oooo000()) / 16384.0d;
        }
    }
}
