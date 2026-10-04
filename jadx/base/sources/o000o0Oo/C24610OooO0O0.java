package o000o0Oo;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Array;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24582OooOo0O;
import o000o0O0.C24583OooOo0o;
import o00O0oo0.InterfaceC24962OooO0O0;
import oO0o0O0O.C33574OooOOO0;

/* JADX INFO: renamed from: o000o0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24610OooO0O0 implements InterfaceC24962OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile boolean f83393OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f83394OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f83395OooO0OO = 0;

    public static final BottomSheetBehavior OooO(View view) {
        OooOOO0.OooO0oO(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.OooO0o) {
            CoordinatorLayout.OooO0OO oooO0OO = ((CoordinatorLayout.OooO0o) layoutParams).f64174OooO00o;
            if (oooO0OO instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) oooO0OO;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return OooO((View) parent);
        }
        return null;
    }

    public static byte[] OooO00o(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    public static short[] OooO0O0(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public static byte[][] OooO0OO(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    public static short[][] OooO0Oo(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, bArr.length, bArr[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    public static short[][][] OooO0o(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, bArr2.length, bArr2[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }

    public static byte[][][] OooO0o0(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        byte[][][] bArr = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, length, sArr2.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    public static boolean OooO0oO(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    public static boolean OooO0oo(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zOooO0oO = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zOooO0oO &= OooO0oO(sArr[length], sArr2[length]);
        }
        return zOooO0oO;
    }

    public static final boolean OooOO0(C24583OooOo0o c24583OooOo0o, int i) {
        OooOOO0.OooO0oO(c24583OooOo0o, "<this>");
        int i2 = C24583OooOo0o.f83294Oooo000;
        Iterator it = C33574OooOOO0.OooO(c24583OooOo0o, C24582OooOo0O.f83293OooOo0o).iterator();
        while (it.hasNext()) {
            if (((C24583OooOo0o) it.next()).f83302OooOooO == i) {
                return true;
            }
        }
        return false;
    }
}
