package oO0OO0OO;

import com.google.common.base.Charsets;
import com.google.common.p563io.BaseEncoding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import oO000Oo.C32052o0000oo0;
import oO000OoO.C32074OooO0Oo;

/* JADX INFO: renamed from: oO0OO0OO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32915OooOOoo {
    static {
        Logger.getLogger(C32915OooOOoo.class.getName());
    }

    public static byte[][] OooO00o(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C32074OooO0Oo c32074OooO0Oo = (C32074OooO0Oo) it.next();
            int i2 = i + 1;
            bArr[i] = c32074OooO0Oo.f114853OooO00o.OooOO0o();
            i += 2;
            bArr[i2] = c32074OooO0Oo.f114854OooO0O0.OooOO0o();
        }
        Logger logger = C32052o0000oo0.f114574OooO00o;
        int i3 = 0;
        while (i3 < size) {
            byte[] bArr2 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr3 = bArr[i4];
            byte[] bArr4 = C32052o0000oo0.f114575OooO0O0;
            if (C32052o0000oo0.OooO00o(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (C32052o0000oo0.OooO00o(bArr5, bArr4)) {
                                int i6 = 0;
                                for (int i7 = 0; i7 <= bArr6.length; i7++) {
                                    if (i7 == bArr6.length || bArr6[i7] == 44) {
                                        byte[] bArrDecode = BaseEncoding.base64().decode(new String(bArr6, i6, i7 - i6, Charsets.US_ASCII));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrDecode);
                                        i6 = i7 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i4] = BaseEncoding.base64().decode(new String(bArr3, Charsets.US_ASCII));
            }
            i3 += 2;
        }
        return bArr;
    }
}
