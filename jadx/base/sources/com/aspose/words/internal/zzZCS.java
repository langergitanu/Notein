package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCS extends zzZD9 {
    private final zzZD9[] zzWI3;
    private final int zzWI4;

    public zzZCS(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private Vector zzXKt() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.zzWIn;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = this.zzWI4;
            int length = (i + i2 > bArr.length ? bArr.length : i2 + i) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            vector.addElement(new zzZC6(bArr2));
            i += this.zzWI4;
        }
    }

    public final Enumeration zzXKE() {
        return this.zzWI3 == null ? zzXKt().elements() : new Enumeration() { // from class: com.aspose.words.internal.zzZCS.1
            int zzWI2 = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.zzWI2 < zzZCS.this.zzWI3.length;
            }

            @Override // java.util.Enumeration
            public final Object nextElement() {
                zzZD9[] zzzd9Arr = zzZCS.this.zzWI3;
                int i = this.zzWI2;
                this.zzWI2 = i + 1;
                return zzzd9Arr[i];
            }
        };
    }

    @Override // com.aspose.words.internal.zzZD9
    public final byte[] zzXL5() {
        return this.zzWIn;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        Enumeration enumerationZzXKE = zzXKE();
        int iZzXL6 = 0;
        while (enumerationZzXKE.hasMoreElements()) {
            iZzXL6 += ((zzZDK) enumerationZzXKE.nextElement()).zzXL0().zzXL6();
        }
        return iZzXL6 + 4;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return true;
    }

    public zzZCS(zzZD9[] zzzd9Arr) {
        this(zzzd9Arr, (byte) 0);
    }

    private static byte[] zzZ(zzZD9[] zzzd9Arr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != zzzd9Arr.length; i++) {
            try {
                byteArrayOutputStream.write(((zzZC6) zzzd9Arr[i]).zzXL5());
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(zzzd9Arr[i].getClass().getName().concat(" found in input should only contain DEROctetString"));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private zzZCS(byte[] bArr, byte b) {
        this(bArr, null, 1000);
    }

    private zzZCS(zzZD9[] zzzd9Arr, byte b) {
        this(zzZ(zzzd9Arr), zzzd9Arr, 1000);
    }

    private zzZCS(byte[] bArr, zzZD9[] zzzd9Arr, int i) {
        super(bArr);
        this.zzWI3 = zzzd9Arr;
        this.zzWI4 = 1000;
    }

    @Override // com.aspose.words.internal.zzZD9, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.write(36);
        zzzd7.write(128);
        Enumeration enumerationZzXKE = zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzzd7.zzY((zzZDK) enumerationZzXKE.nextElement());
        }
        zzzd7.write(0);
        zzzd7.write(0);
    }

    public static zzZCS zzZ(zzZD4 zzzd4) {
        zzZD9[] zzzd9Arr = new zzZD9[zzzd4.size()];
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        int i = 0;
        while (enumerationZzXKE.hasMoreElements()) {
            zzzd9Arr[i] = (zzZD9) enumerationZzXKE.nextElement();
            i++;
        }
        return new zzZCS(zzzd9Arr);
    }
}
