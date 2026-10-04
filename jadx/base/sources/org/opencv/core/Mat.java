package org.opencv.core;

import Oooo0oO.C21023OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18358t1;
import oOO00OO0.OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public class Mat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f126603OooO00o;

    public Mat(long j) {
        if (j == 0) {
            throw new UnsupportedOperationException("Native object address is NULL");
        }
        this.f126603OooO00o = j;
    }

    private static native int nGetF(long j, int i, int i2, int i3, float[] fArr);

    private static native int nPutB(long j, int i, int i2, int i3, byte[] bArr);

    private static native int nPutF(long j, int i, int i2, int i3, float[] fArr);

    private static native long n_Mat();

    private static native long n_clone(long j);

    private static native void n_create(long j, int i, int i2, int i3);

    private static native long n_dataAddr(long j);

    private static native void n_delete(long j);

    private static native int n_dims(long j);

    private static native boolean n_isContinuous(long j);

    private static native boolean n_isSubmatrix(long j);

    private static native int n_size_i(long j, int i);

    private static native long n_total(long j);

    private static native int n_type(long j);

    public final void OooO00o(int i, int i2) {
        n_create(this.f126603OooO00o, i, 1, i2);
    }

    public final void OooO0O0(float[] fArr) {
        int iN_type = n_type(this.f126603OooO00o);
        if (fArr.length % OooO00o.OooO00o(iN_type) == 0) {
            if ((iN_type & 7) != 5) {
                throw new UnsupportedOperationException(C21532OooOOo.OooO0OO(iN_type, "Mat data type is not compatible: "));
            }
            nGetF(this.f126603OooO00o, 0, 0, fArr.length, fArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + fArr.length + ") should be multiple of the Mat channels count (" + OooO00o.OooO00o(iN_type) + ")");
        }
    }

    public final void OooO0OO(byte[] bArr) {
        int iN_type = n_type(this.f126603OooO00o);
        if (bArr == null || bArr.length % OooO00o.OooO00o(iN_type) != 0) {
            StringBuilder sb = new StringBuilder("Provided data element number (");
            sb.append(bArr == null ? 0 : bArr.length);
            sb.append(") should be multiple of the Mat channels count (");
            sb.append(OooO00o.OooO00o(iN_type));
            sb.append(")");
            throw new UnsupportedOperationException(sb.toString());
        }
        int i = iN_type & 7;
        if (i != 0 && i != 1) {
            throw new UnsupportedOperationException(C21532OooOOo.OooO0OO(iN_type, "Mat data type is not compatible: "));
        }
        nPutB(this.f126603OooO00o, 0, 0, bArr.length, bArr);
    }

    public final void OooO0Oo(float[] fArr) {
        int iN_type = n_type(this.f126603OooO00o);
        if (fArr.length % OooO00o.OooO00o(iN_type) == 0) {
            if ((iN_type & 7) != 5) {
                throw new UnsupportedOperationException(C21532OooOOo.OooO0OO(iN_type, "Mat data type is not compatible: "));
            }
            nPutF(this.f126603OooO00o, 0, 0, fArr.length, fArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + fArr.length + ") should be multiple of the Mat channels count (" + OooO00o.OooO00o(iN_type) + ")");
        }
    }

    public final long OooO0o0() {
        return n_total(this.f126603OooO00o);
    }

    public final Object clone() throws CloneNotSupportedException {
        return new Mat(n_clone(this.f126603OooO00o));
    }

    public final void finalize() throws Throwable {
        n_delete(this.f126603OooO00o);
        super.finalize();
    }

    public final String toString() {
        String str;
        long j = this.f126603OooO00o;
        String strOooO0OO = n_dims(j) > 0 ? "" : "-1*-1*";
        for (int i = 0; i < n_dims(j); i++) {
            strOooO0OO = C21023OooO0Oo.OooO0OO(C18358t1.g.f56183c, n_size_i(j, i), C22218Oooo.OooO0OO(strOooO0OO));
        }
        StringBuilder sb = new StringBuilder("Mat [ ");
        sb.append(strOooO0OO);
        int iN_type = n_type(j);
        int i2 = OooO00o.f123306OooO00o;
        switch (iN_type & 7) {
            case 0:
                str = "CV_8U";
                break;
            case 1:
                str = "CV_8S";
                break;
            case 2:
                str = "CV_16U";
                break;
            case 3:
                str = "CV_16S";
                break;
            case 4:
                str = "CV_32S";
                break;
            case 5:
                str = "CV_32F";
                break;
            case 6:
                str = "CV_64F";
                break;
            case 7:
                str = "CV_16F";
                break;
            default:
                throw new UnsupportedOperationException(C21532OooOOo.OooO0OO(iN_type, "Unsupported CvType value: "));
        }
        int iOooO00o = OooO00o.OooO00o(iN_type);
        sb.append(iOooO00o <= 4 ? str + "C" + iOooO00o : str + "C(" + iOooO00o + ")");
        sb.append(", isCont=");
        sb.append(n_isContinuous(j));
        sb.append(", isSubmat=");
        sb.append(n_isSubmatrix(j));
        sb.append(", nativeObj=0x");
        sb.append(Long.toHexString(j));
        sb.append(", dataAddr=0x");
        sb.append(Long.toHexString(n_dataAddr(j)));
        sb.append(" ]");
        return sb.toString();
    }

    public Mat() {
        this.f126603OooO00o = n_Mat();
    }
}
