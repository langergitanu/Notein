package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzRX implements zzZOY, Iterable<String[]> {
    private long zzNA;
    private zzZYI zzNB;
    private String[] zzNC;
    private boolean zzND;
    private boolean zzNE;
    private boolean zzNF;
    private int zzNG;
    private int zzNH;
    private boolean zzNI;
    private boolean zzNJ;
    private char zzNK;
    private char zzNL;
    private char zzNM;
    private char zzNN;
    private int zzNO;
    private zzZOK zzNP;
    private boolean zzNq;
    private boolean zzNr;
    private boolean zzNs;
    private boolean zzNt;
    private int zzNu;
    private char[] zzNv;
    private int zzNw;
    private String[] zzNx;
    private int zzNy;
    private int zzNz;

    public final class zzY implements Iterator<String[]> {
        private long zzNA;
        private String[] zzNm;
        private zzRX zzNn;

        public zzY(zzRX zzrx) {
            if (zzrx == null) {
                throw new NullPointerException("Value cannot be null.\r\nParameter name: reader");
            }
            this.zzNn = zzrx;
            this.zzNm = null;
            this.zzNA = zzrx.zzNA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzRk, reason: merged with bridge method [inline-methods] */
        public String[] next() {
            if (this.zzNn.zzNA == this.zzNA) {
                return this.zzNm;
            }
            throw new IllegalStateException("Collection was modified; enumeration operation may not execute.");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            try {
                if (this.zzNn.zzNA != this.zzNA) {
                    throw new IllegalStateException("Collection was modified; enumeration operation may not execute.");
                }
                if (!this.zzNn.zzRo()) {
                    this.zzNm = null;
                    this.zzNA = this.zzNn.zzNA;
                    return false;
                }
                if (this.zzNm == null) {
                    this.zzNm = new String[this.zzNn.zzNw];
                }
                this.zzNn.zzV(this.zzNm);
                this.zzNA = this.zzNn.zzNA;
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class zzZ {
        private boolean zzNo;
        private boolean zzNp;

        private zzZ() {
        }

        public final boolean isError() {
            return this.zzNo;
        }

        public final void zzRl() {
            this.zzNo = true;
        }

        public final boolean zzRm() {
            return this.zzNp;
        }

        public final void zzh(boolean z) {
            this.zzNp = z;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzRX(zzZOK zzzok, boolean z, char c, char c2, char c3, char c4) throws Exception {
        this(zzzok, z, c, c2, c3, c4, true);
    }

    private boolean zzG(char c) {
        if (c == this.zzNL) {
            return false;
        }
        return c <= 255 ? c == ' ' || c == '\t' : Character.getType(c) == 12;
    }

    private void zzRn() {
        if (this.zzNq) {
            throw new IllegalStateException("Disposed object: " + zzRX.class.getCanonicalName());
        }
    }

    private boolean zzRp() throws Exception {
        if (this.zzNt) {
            return false;
        }
        zzRn();
        int i = this.zzNP.read(this.zzNv, 0, this.zzNO);
        this.zzNu = i;
        if (i > 0) {
            return true;
        }
        this.zzNt = true;
        this.zzNv = null;
        return false;
    }

    private String zzRq() {
        int i;
        char[] cArr = this.zzNv;
        return (cArr == null || (i = this.zzNu) <= 0) ? "" : new String(cArr, 0, i);
    }

    private void zzRr() throws Exception {
        if (this.zzND) {
            return;
        }
        zzW(true, false);
    }

    private void zzU(String[] strArr) throws Exception {
        if (strArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: array");
        }
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("\r\nParameter name: index\r\nParameter value: 0");
        }
        if (this.zzNA < 0 || !this.zzND) {
            throw new IllegalStateException("No current record.");
        }
        if (strArr.length < this.zzNw) {
            throw new IllegalArgumentException("The number of fields in the record is greater than the available space from index to the end of the destination array.\r\nParameter name: array");
        }
        for (int i = 0; i < this.zzNw; i++) {
            strArr[i] = get(i);
        }
    }

    private boolean zzW(boolean z, boolean z2) throws Exception {
        if (this.zzNt) {
            if (!this.zzNs) {
                return false;
            }
            this.zzNs = false;
            this.zzNA++;
            return true;
        }
        zzRn();
        if (this.zzND) {
            if (z2) {
                RefInt refInt = new RefInt(this.zzNz);
                zzV(refInt);
                this.zzNz = refInt.get();
            } else if (this.zzNA > -1 && !this.zzNr) {
                if (this.zzNF) {
                    zzX(this.zzNw - 1, false, true);
                } else {
                    int i = this.zzNy;
                    if (i > 0 && i < this.zzNw) {
                        RefInt refInt2 = new RefInt(this.zzNz);
                        zzV(refInt2);
                        this.zzNz = refInt2.get();
                    }
                }
            }
            RefInt refInt3 = new RefInt(this.zzNz);
            boolean z3 = (this.zzNs || zzY(refInt3)) ? false : true;
            this.zzNz = refInt3.get();
            if (z3) {
                return false;
            }
            if (this.zzNs) {
                this.zzNs = false;
            } else {
                String[] strArr = this.zzNx;
                zzZKV.zzY(strArr, strArr.length);
                this.zzNy = 0;
            }
            this.zzNr = false;
            this.zzNA++;
        } else {
            this.zzNv = new char[this.zzNO];
            this.zzNC = new String[0];
            if (!zzRp()) {
                return false;
            }
            RefInt refInt4 = new RefInt(this.zzNz);
            boolean zZzY = zzY(refInt4);
            this.zzNz = refInt4.get();
            if (!zZzY) {
                return false;
            }
            this.zzNw = 0;
            this.zzNx = new String[16];
            while (zzX(this.zzNw, true, false) != null) {
                int i2 = this.zzNw + 1;
                this.zzNw = i2;
                String[] strArr2 = this.zzNx;
                if (i2 == strArr2.length) {
                    Ref ref = new Ref(strArr2);
                    zzZ((Ref<String[]>) ref, (this.zzNw + 1) * 2);
                    this.zzNx = (String[]) ref.get();
                }
            }
            int i3 = this.zzNw + 1;
            this.zzNw = i3;
            String[] strArr3 = this.zzNx;
            if (strArr3.length != i3) {
                Ref ref2 = new Ref(strArr3);
                zzZ((Ref<String[]>) ref2, this.zzNw);
                this.zzNx = (String[]) ref2.get();
            }
            this.zzND = true;
            if (this.zzNI) {
                this.zzNA = -1L;
                this.zzNs = false;
                int i4 = this.zzNw;
                this.zzNC = new String[i4];
                this.zzNB = new zzZYI(i4, (byte) 0);
                int i5 = 0;
                while (true) {
                    String[] strArr4 = this.zzNx;
                    if (i5 >= strArr4.length) {
                        break;
                    }
                    this.zzNC[i5] = strArr4[i5];
                    this.zzNB.add(strArr4[i5], i5);
                    i5++;
                }
                if (!z) {
                    refInt4.set(this.zzNz);
                    boolean zZzY2 = zzY(refInt4);
                    this.zzNz = refInt4.get();
                    if (!zZzY2) {
                        return false;
                    }
                    String[] strArr5 = this.zzNx;
                    zzZKV.zzY(strArr5, strArr5.length);
                    this.zzNy = 0;
                    this.zzNA++;
                    return true;
                }
            } else if (z) {
                this.zzNs = true;
                this.zzNA = -1L;
            } else {
                this.zzNs = false;
                this.zzNA = 0L;
            }
        }
        return true;
    }

    private String zzX(int i, boolean z, boolean z2) throws Exception {
        String strZzZ;
        if (!z) {
            if (i < 0 || i >= this.zzNw) {
                throw new IllegalArgumentException(zzZKN.format("Field index must be included in [0, FieldCount]. Specified field index was: '{0}'.", Integer.valueOf(i)) + "\r\nParameter name: field\r\nParameter value: " + i);
            }
            if (this.zzNA < 0) {
                throw new IllegalStateException("No current record.");
            }
        }
        String str = this.zzNx[i];
        if (str != null) {
            return str;
        }
        if (this.zzNr) {
            return zzZ(null, i, new RefInt(this.zzNz));
        }
        zzRn();
        int i2 = this.zzNy;
        while (i2 < i + 1) {
            byte b = 0;
            if (this.zzNz == this.zzNu) {
                this.zzNz = 0;
                zzRp();
            }
            zzZ zzz = new zzZ(b);
            if (this.zzNr) {
                RefInt refInt = new RefInt(this.zzNz);
                strZzZ = zzZ(null, i2, refInt);
                this.zzNz = refInt.get();
            } else {
                int i3 = this.zzNz;
                if (i3 != this.zzNu) {
                    if (this.zzNJ) {
                        RefInt refInt2 = new RefInt(i3);
                        zzW(refInt2);
                        this.zzNz = refInt2.get();
                    }
                    if (this.zzNt) {
                        strZzZ = "";
                    } else {
                        strZzZ = this.zzNv[this.zzNz] != this.zzNK ? zzZ(i2, z, z2, zzz) : zzY(i2, z, z2, zzz);
                        if (zzz.isError()) {
                            return null;
                        }
                    }
                } else if (i2 != i) {
                    RefInt refInt3 = new RefInt(i3);
                    String strZzZ2 = zzZ(null, i2, refInt3);
                    this.zzNz = refInt3.get();
                    strZzZ = strZzZ2;
                } else if (z2) {
                    strZzZ = null;
                } else {
                    this.zzNx[i2] = "";
                    strZzZ = "";
                }
            }
            if (z || i2 < this.zzNw - 1) {
                this.zzNy = Math.max(i2 + 1, this.zzNy);
            } else {
                this.zzNy = 0;
            }
            if (i2 == i) {
                if (z && (zzz.zzRm() || this.zzNt)) {
                    return null;
                }
                return strZzZ;
            }
            i2++;
        }
        RefInt refInt4 = new RefInt(this.zzNz);
        zzZ(new zzAO(zzRq(), this.zzNz, this.zzNA, i2), refInt4);
        this.zzNz = refInt4.get();
        return null;
    }

    private void zzi(boolean z) {
        try {
            if (this.zzNq) {
                return;
            }
            if (z) {
                try {
                    zzZOK zzzok = this.zzNP;
                    if (zzzok != null) {
                        zzzok.dispose();
                        this.zzNP = null;
                        this.zzNv = null;
                        this.zzNt = true;
                    }
                } finally {
                    this.zzNq = true;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        if (this.zzNq) {
            return;
        }
        zzi(true);
    }

    public final void finalize() throws Throwable {
        zzi(false);
    }

    public final String get(int i) throws Exception {
        return zzX(i, false, false);
    }

    public final int getFieldCount() throws Exception {
        zzRr();
        return this.zzNw;
    }

    public final boolean hasHeaders() {
        return this.zzNI;
    }

    @Override // java.lang.Iterable
    public final Iterator<String[]> iterator() {
        return new zzY(this);
    }

    public final boolean zzRo() throws Exception {
        return zzW(false, false);
    }

    public final String[] zzRs() throws Exception {
        zzRr();
        int length = this.zzNC.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = this.zzNC[i];
        }
        return strArr;
    }

    public final void zzV(String[] strArr) throws Exception {
        zzU(strArr);
    }

    private zzRX(zzZOK zzzok, boolean z, char c, char c2, char c3, char c4, boolean z2) throws Exception {
        this.zzNq = false;
        if (zzzok == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: reader");
        }
        this.zzNO = 4096;
        zzZOO zzzoo = (zzZOO) zzZKW.zzZ(zzzok, zzZOO.class);
        if (zzzoo != null) {
            zzZOP zzzopZzq = zzzoo.zzq();
            if (zzzopZzq.zzRG() && zzzopZzq.getLength() > 0) {
                this.zzNO = (int) Math.min(4096L, zzzopZzq.getLength());
            }
        }
        this.zzNP = zzzok;
        this.zzNL = c;
        this.zzNK = c2;
        this.zzNM = c3;
        this.zzNN = c4;
        this.zzNI = z;
        this.zzNJ = true;
        this.zzNF = true;
        this.zzNE = true;
        this.zzNA = -1L;
        this.zzNH = 0;
    }

    private boolean zzV(RefInt refInt) throws Exception {
        while (true) {
            if ((refInt.get() >= this.zzNu && (!zzRp() || refInt.set(0) != 0)) || zzZ(refInt)) {
                break;
            }
            OooO0o.OooO00o(1, refInt);
        }
        return !this.zzNt;
    }

    private String zzY(int i, boolean z, boolean z2, zzZ zzz) throws Exception {
        char c;
        int i2;
        int i3 = this.zzNz + 1;
        boolean z3 = false;
        int i4 = i3;
        boolean z4 = true;
        String strZzZI = null;
        boolean z5 = false;
        while (true) {
            int i5 = this.zzNu;
            if (i3 < i5) {
                char[] cArr = this.zzNv;
                char c2 = cArr[i3];
                if (z5) {
                    i4 = i3;
                    z5 = false;
                } else {
                    char c3 = this.zzNM;
                    if (c2 == c3 && (c3 != (c = this.zzNK) || (((i2 = i3 + 1) < i5 && cArr[i2] == c) || (i2 == i5 && this.zzNP.zzCR() == this.zzNK)))) {
                        if (!z2) {
                            strZzZI = zzZKN.zzZI(strZzZI, new String(this.zzNv, i4, i3 - i4));
                        }
                        z5 = true;
                    } else if (c2 == this.zzNK) {
                        z4 = false;
                    }
                }
                i3++;
            }
            if (!z4) {
                if (!this.zzNt) {
                    if (!z2 && i3 > i4) {
                        strZzZI = zzZKN.zzZI(strZzZI, new String(this.zzNv, i4, i3 - i4));
                    }
                    int i6 = i3 + 1;
                    this.zzNz = i6;
                    RefInt refInt = new RefInt(i6);
                    zzW(refInt);
                    int i7 = refInt.get();
                    this.zzNz = i7;
                    if (i7 < this.zzNu && this.zzNv[i7] == this.zzNL) {
                        this.zzNz = i7 + 1;
                        z3 = true;
                    }
                    if (!this.zzNt && !z3 && (z || i == this.zzNw - 1)) {
                        refInt.set(this.zzNz);
                        zzz.zzh(zzZ(refInt));
                        this.zzNz = refInt.get();
                    }
                }
                if (!z2) {
                    if (strZzZI == null) {
                        strZzZI = "";
                    }
                    this.zzNx[i] = strZzZI;
                }
                return strZzZI;
            }
            if (!z2 && !z5) {
                strZzZI = zzZKN.zzZI(strZzZI, new String(this.zzNv, i4, i3 - i4));
            }
            this.zzNz = 0;
            if (!zzRp()) {
                RefInt refInt2 = new RefInt(this.zzNz);
                zzZ(new zzAO(zzRq(), this.zzNz, this.zzNA, i), refInt2);
                this.zzNz = refInt2.get();
                zzz.zzRl();
                return null;
            }
            i3 = 0;
            i4 = 0;
        }
    }

    private boolean zzZ(RefInt refInt) throws Exception {
        refInt.get();
        if (refInt.get() == this.zzNu) {
            refInt.set(0);
            if (!zzRp()) {
                return false;
            }
        }
        char c = this.zzNv[refInt.get()];
        if (c != '\r' || this.zzNL == '\r') {
            if (c != '\n') {
                return false;
            }
            refInt.set(refInt.get() + 1);
            if (refInt.get() >= this.zzNu) {
                zzRp();
                refInt.set(0);
            }
            return true;
        }
        refInt.set(refInt.get() + 1);
        if (refInt.get() < this.zzNu) {
            if (this.zzNv[refInt.get()] == '\n') {
                OooO0o.OooO00o(1, refInt);
            }
        } else if (zzRp()) {
            if (this.zzNv[0] == '\n') {
                refInt.set(1);
            } else {
                refInt.set(0);
            }
        }
        if (refInt.get() >= this.zzNu) {
            zzRp();
            refInt.set(0);
        }
        return true;
    }

    private String zzZ(int i, boolean z, boolean z2, zzZ zzz) throws Exception {
        int i2;
        int i3 = this.zzNz;
        int i4 = i3;
        String strZzZ = null;
        while (true) {
            if (i3 < this.zzNu) {
                char c = this.zzNv[i3];
                if (c == this.zzNL) {
                    this.zzNz = i3 + 1;
                } else if (c == '\r' || c == '\n') {
                    this.zzNz = i3;
                    zzz.zzh(true);
                } else {
                    i3++;
                }
            }
            if (i3 < this.zzNu) {
                break;
            }
            if (!z2) {
                strZzZ = zzZKN.zzZI(strZzZ, new String(this.zzNv, i4, i3 - i4));
            }
            this.zzNz = 0;
            if (!zzRp()) {
                i3 = 0;
                i4 = 0;
                break;
            }
            i3 = 0;
            i4 = 0;
        }
        if (!z2) {
            if (!this.zzNJ) {
                if (!this.zzNt && i3 > i4) {
                    strZzZ = zzZKN.zzZI(strZzZ, new String(this.zzNv, i4, i3 - i4));
                }
            } else {
                if (this.zzNt || i3 <= i4) {
                    i2 = -1;
                } else {
                    int i5 = i3 - 1;
                    while (i5 >= 0 && zzG(this.zzNv[i5])) {
                        i5--;
                    }
                    i2 = i5 + 1;
                    if (i2 > 0) {
                        strZzZ = zzZKN.zzZI(strZzZ, new String(this.zzNv, i4, i2 - i4));
                    }
                }
                if (i2 < 0) {
                    int length = strZzZ != null ? strZzZ.length() - 1 : -1;
                    while (length >= 0 && zzG(strZzZ.charAt(length))) {
                        length--;
                    }
                    int i6 = length + 1;
                    if (i6 > 0 && i6 != strZzZ.length()) {
                        strZzZ = strZzZ.substring(0, i6);
                    }
                }
            }
            if (strZzZ == null) {
                strZzZ = "";
            }
        }
        if (zzz.zzRm() || this.zzNt) {
            RefInt refInt = new RefInt(this.zzNz);
            zzz.zzh(zzZ(refInt));
            this.zzNz = refInt.get();
            if (!z && i != this.zzNw - 1) {
                String str = (strZzZ == null || strZzZ.length() != 0) ? strZzZ : null;
                refInt.set(this.zzNz);
                strZzZ = zzZ(str, i, refInt);
                this.zzNz = refInt.get();
            }
        }
        if (!z2) {
            this.zzNx[i] = strZzZ;
        }
        return strZzZ;
    }

    private boolean zzY(RefInt refInt) throws Exception {
        if (refInt.get() < this.zzNu) {
            zzX(refInt);
        }
        while (refInt.get() >= this.zzNu && !this.zzNt) {
            if (!zzRp()) {
                return false;
            }
            refInt.set(0);
            zzX(refInt);
        }
        return !this.zzNt;
    }

    private void zzX(RefInt refInt) throws Exception {
        while (refInt.get() < this.zzNu) {
            if (this.zzNv[refInt.get()] == this.zzNN) {
                OooO0o.OooO00o(1, refInt);
                zzV(refInt);
            } else if (!this.zzNE || !zzZ(refInt)) {
                return;
            }
        }
    }

    private static void zzZ(Ref<String[]> ref, int i) {
        String[] strArr = ref.get();
        if (strArr == null) {
            ref.set(new String[i]);
            return;
        }
        if (strArr.length != i) {
            String[] strArr2 = new String[i];
            if (strArr.length <= i) {
                i = strArr.length;
            }
            zzZKV.zzZ(strArr, 0, strArr2, 0, i);
            ref.set(strArr2);
        }
    }

    private void zzZ(zzAO zzao, RefInt refInt) throws Exception {
        int i = this.zzNH;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new UnsupportedOperationException(zzZKN.format("'{0}' is not a supported ParseErrorAction.", Integer.valueOf(this.zzNH)), zzao);
                }
                throw zzao;
            }
            if (refInt.get() >= 0) {
                zzW(false, true);
                return;
            }
            return;
        }
        zz6M zz6m = new zz6M(zzao);
        int action = zz6m.getAction();
        if (action == 0) {
            throw new IllegalStateException(zzZKN.format("'{0}' is not a valid ParseErrorAction while inside a ParseError event.", Integer.valueOf(zz6m.getAction())), zz6m.zzwS());
        }
        if (action != 1) {
            if (action != 2) {
                throw new UnsupportedOperationException(zzZKN.format("'{0}' is not a supported ParseErrorAction.", Integer.valueOf(zz6m.getAction())), zz6m.zzwS());
            }
            throw zz6m.zzwS();
        }
        if (refInt.get() >= 0) {
            zzW(false, true);
        }
    }

    private boolean zzW(RefInt refInt) throws Exception {
        while (true) {
            if (refInt.get() < this.zzNu && zzG(this.zzNv[refInt.get()])) {
                OooO0o.OooO00o(1, refInt);
            } else {
                if (refInt.get() < this.zzNu) {
                    return true;
                }
                refInt.set(0);
                if (!zzRp()) {
                    return false;
                }
            }
        }
    }

    private String zzZ(String str, int i, RefInt refInt) throws Exception {
        if (i >= 0 && i < this.zzNw) {
            this.zzNr = true;
            for (int i2 = i + 1; i2 < this.zzNw; i2++) {
                this.zzNx[i2] = null;
            }
            if (str != null) {
                return str;
            }
            int i3 = this.zzNG;
            if (i3 == 0) {
                zzZ(new zz7Y(zzRq(), refInt.get(), this.zzNA, i), refInt);
                return str;
            }
            if (i3 == 1) {
                return "";
            }
            if (i3 == 2) {
                return null;
            }
            throw new UnsupportedOperationException(zzZKN.format("'{0}' is not a supported missing field action.", Integer.valueOf(this.zzNG)));
        }
        throw new IllegalArgumentException(zzZKN.format("Field index must be included in [0, FieldCount]. Specified field index was: '{0}'.", Integer.valueOf(i)) + "\r\nParameter name: fieldIndex\r\nParameter value: " + i);
    }
}
