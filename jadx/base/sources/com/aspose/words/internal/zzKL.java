package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzKL implements zzGX {
    private boolean zzC5;
    private boolean zzC6;
    private char zzC7;
    private zzHE zzC8;
    private zz6N zzC9;
    private zzKM zzCa;
    private StringBuilder zzCb;
    private zzZQC<zzJC> zzCc;
    private HashMap<String, zz6N> zzCd;
    private HashMap<String, zz6N> zzCe;
    private HashMap<String, Class> zzCf;
    private zzGZ zzCg = new zzSY();

    public static class zzZ {
        private Object zzC4;
        private boolean zzC5;
        private zz6N zzC9;
        private zzZQC<zzJC> zzCc;
        private HashMap<String, zz6N> zzCd;
        private HashMap<String, zz6N> zzCe;
        private HashMap<String, Class> zzCf;

        public zzZ(HashMap<String, Class> map, HashMap<String, zz6N> map2, HashMap<String, zz6N> map3, zzZQC<zzJC> zzzqc, zz6N zz6n, boolean z, Object obj) {
            this.zzCf = map;
            this.zzCe = new HashMap<>(map2);
            this.zzCd = new HashMap<>(map3);
            this.zzCc = new zzZQC<>(zzzqc);
            this.zzC9 = zz6n;
            this.zzC5 = z;
            this.zzC4 = obj;
        }

        public final Object zzIn() {
            return this.zzC4;
        }

        public final boolean zzIo() {
            return this.zzC5;
        }

        public final zz6N zzIp() {
            return this.zzC9;
        }

        public final zzZQC<zzJC> zzIq() {
            return new zzZQC<>(this.zzCc);
        }

        public final HashMap<String, zz6N> zzIr() {
            return new HashMap<>(this.zzCd);
        }

        public final HashMap<String, zz6N> zzIs() {
            return new HashMap<>(this.zzCe);
        }

        public final HashMap<String, Class> zzIt() {
            return this.zzCf;
        }
    }

    private boolean zzIA() {
        return this.zzCg.getClass() == zzOC.class;
    }

    private zzKN zzID() throws Exception {
        zzKO zzkoZzWv = zzWv();
        if (zzIA()) {
            return null;
        }
        return new zzKN(zzkoZzWv, this.zzCb.toString());
    }

    private void zzIE() {
        zzY("boolean", Boolean.TYPE);
        zzY("byte", Byte.TYPE);
        zzY("char", Character.TYPE);
        zzY("short", Short.TYPE);
        zzY("int", Integer.TYPE);
        zzY("float", Float.TYPE);
        zzY("long", Long.TYPE);
        zzY("double", Double.TYPE);
        zzY("Object", Object.class);
        zzY("String", String.class);
    }

    private zz6N zzU(Object obj, String str) throws Exception {
        Object objZzW = zzRE.zzW(obj);
        Object objZzX = zzRE.zzX(obj);
        zz6N zz6nZzZ = zz6N.zzZ(objZzX.getClass(), objZzW, str);
        zz6nZzZ.setValue(objZzX);
        zzZ(zz6nZzZ);
        return zz6nZzZ;
    }

    private Object zzX2(int i) throws Exception {
        if (i == 0) {
            return zzID();
        }
        if (i == 1) {
            return zzW0();
        }
        if (i == 2) {
            return zzVZ();
        }
        throw new IllegalStateException();
    }

    private void zzY(Iterable iterable) {
        zzIE();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            String strZzG = zzZZO.zzG(cls);
            if (zzZYD.zzXk(strZzG)) {
                int iIndexOf = -1;
                do {
                    iIndexOf = strZzG.indexOf(46, iIndexOf + 1);
                    zzY(strZzG.substring(iIndexOf + 1), cls);
                } while (iIndexOf != -1);
            }
        }
    }

    private Exception zzZX(String str) {
        return this.zzC6 ? new zzCX(str) : new IllegalStateException(str);
    }

    public final boolean zz0(String str) {
        return zzZZ(str) == null && zzZY(str) == null && !zzG(str);
    }

    @Override // com.aspose.words.internal.zzGX
    public final void zz8(boolean z) {
        if (zzIA() == z) {
            return;
        }
        this.zzCg = z ? new zzOC() : new zzSY();
    }

    public abstract boolean zzG(String str);

    @Override // com.aspose.words.internal.zzGX
    public final void zzH(Object obj) {
        zzZ zzz = (zzZ) zzZKW.zzZ(obj, zzZ.class);
        this.zzCb = new StringBuilder();
        this.zzCf = zzz.zzIt();
        this.zzCe = zzz.zzIs();
        this.zzCd = zzz.zzIr();
        this.zzCc = zzz.zzIq();
        this.zzC9 = zzz.zzIp();
        this.zzC5 = zzz.zzIo();
        this.zzCa = new zzKM(zzz.zzIn());
    }

    public final void zzIB() {
        if (!this.zzC8.moveNext() || this.zzC8.zzFI() == 65535) {
            throw new zzCX("Unexpected end of expression.");
        }
        this.zzCb.append(this.zzC8.zzFI());
    }

    @Override // com.aspose.words.internal.zzGX
    public final void zzIC() {
        if (zzIA() || this.zzCc.size() == 0) {
            return;
        }
        zzZ(this.zzCc.pop().zzHa());
    }

    @Override // com.aspose.words.internal.zzGX
    public final Object zzIK() {
        return new zzZ(this.zzCf, this.zzCe, this.zzCd, this.zzCc, this.zzC9, this.zzC5, this.zzCa.zzIK());
    }

    public final char zzIu() {
        return this.zzC7;
    }

    public final boolean zzIv() {
        return zzZYD.isLetter(zzIw()) || Character.isLetter(zzIw());
    }

    public final char zzIw() {
        return this.zzC8.zzFI();
    }

    @Override // com.aspose.words.internal.zzGX
    public final zzGY zzIx() {
        return this.zzCa;
    }

    public final zz6N zzIy() {
        return this.zzCc.size() == 0 ? this.zzC9 : (zz6N) this.zzCc.peek().zzHa();
    }

    public final zzGZ zzIz() {
        return this.zzCg;
    }

    @Override // com.aspose.words.internal.zzGX
    public final zzH0 zzS(zzH0 zzh0) {
        if (zzIA()) {
            return null;
        }
        return zzTQ.zzZ((zzKN) zzh0);
    }

    public abstract zzZVN zzVZ() throws Exception;

    public abstract zzJC zzW0() throws Exception;

    public abstract zzKO zzWv() throws Exception;

    @Override // com.aspose.words.internal.zzGX
    public final zzZVN zzX(zzHE zzhe, char c) throws Exception {
        return (zzZVN) zzZ(2, zzhe, ']');
    }

    @Override // com.aspose.words.internal.zzGX
    public final void zzZ(Iterable iterable, Object[] objArr, String[] strArr, boolean z, boolean z2) throws Exception {
        zzZ(objArr, strArr);
        this.zzCf = new HashMap<>();
        this.zzCe = new HashMap<>();
        this.zzCd = new HashMap<>();
        this.zzCc = new zzZQC<>();
        this.zzCb = new StringBuilder();
        this.zzCa = new zzKM(z);
        this.zzC5 = z2;
        zzY(iterable);
        zzY(objArr, strArr);
    }

    public final Class zzZY(String str) {
        return (Class) zzQW.zzZ(this.zzCf, str);
    }

    public final zz6N zzZZ(String str) {
        zz6N zz6n = (zz6N) zzQW.zzZ(this.zzCe, str);
        return zz6n == null ? (zz6N) zzQW.zzZ(this.zzCd, str) : zz6n;
    }

    public final void zzX(zz6N zz6n) {
        zzZYD.zzXk(zz6n.getName());
        zzZ((zzFZ) zz6n);
    }

    private void zzY(String str, Class cls) {
        if (this.zzCf.containsKey(str)) {
            zzZQF.zzY(this.zzCf, str);
        } else {
            zzZQF.zzY(this.zzCf, str, cls);
        }
    }

    private void zzY(Object[] objArr, String[] strArr) throws Exception {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            zz6N zz6nZzU = zzU(objArr[i], strArr[i]);
            if (i == 0) {
                this.zzC9 = zz6nZzU;
            }
        }
    }

    private static void zzZ(Object[] objArr, String[] strArr) {
        zzZ4.zzY((Object) objArr, "dataSources");
        zzZ4.zzY((Object) strArr, "dataSourceNames");
        int length = objArr.length;
        if (length != 0) {
            if (length != strArr.length) {
                throw new IllegalArgumentException("Arrays of data source objects and their names must be of the same length.");
            }
            for (int i = 0; i < length; i++) {
                zzRE.zzK(objArr[i]);
                if (i > 0) {
                    zzZ4.zzU(strArr[i], "dataSourceName");
                }
            }
            return;
        }
        throw new IllegalArgumentException("An array of data source objects must not be empty.");
    }

    @Override // com.aspose.words.internal.zzGX
    public final zzJC zzY(zzHE zzhe, char c) throws Exception {
        return (zzJC) zzZ(1, zzhe, ']');
    }

    public final void zzY(zz6N zz6n) throws Exception {
        zzZYD.zzXk(zz6n.getName());
        zzZ(zz6n);
    }

    private void zzZ(zz6N zz6n) throws Exception {
        if (zzZYD.zzXk(zz6n.getName())) {
            zzZ(zz6n, false);
        }
    }

    private void zzZ(zz6N zz6n, boolean z) throws Exception {
        HashMap<String, zz6N> map;
        if (zzIA()) {
            return;
        }
        if (!zz0(zz6n.getName())) {
            throw zzZX(zzZKN.format("{0} '{1}' has a name conflict with an existing parameter, type identifier, or keyword.", z ? "Variable" : "Parameter", zz6n.getName()));
        }
        if (z) {
            map = this.zzCd;
        } else {
            map = this.zzCe;
        }
        zzZQF.zzY(map, zz6n.getName(), zz6n);
    }

    @Override // com.aspose.words.internal.zzGX
    public final zzH0 zzZ(zzHE zzhe, char c) throws Exception {
        return (zzH0) zzZ(0, zzhe, ']');
    }

    private Object zzZ(int i, zzHE zzhe, char c) throws Exception {
        this.zzC8 = zzhe;
        this.zzC7 = c;
        this.zzCb.append(zzhe.zzFI());
        this.zzC6 = true;
        try {
            Object objZzX2 = zzX2(i);
            this.zzC6 = false;
            this.zzCb.setLength(0);
            this.zzC8 = null;
            this.zzC7 = (char) 65535;
            return objZzX2;
        } catch (zzCX e) {
            if (this.zzC5) {
                throw new zzCW(e.getMessage());
            }
            throw new IllegalStateException(zzZKN.format("An error has been encountered at the end of expression '{0}'. {1}", this.zzCb, e.getMessage()));
        }
    }

    public final zzJC zzZ(zzKO zzko, Class cls, String str) throws Exception {
        if (zzIA()) {
            return null;
        }
        zz6N zz6nZzZ = zz6N.zzZ(zzko, cls, str, this.zzCa, true);
        zzJC zzjc = new zzJC(zz6nZzZ, new zzJE(zzZ2.zzZ(zzko, this.zzCa), this.zzCb.toString()));
        this.zzCc.push(zzjc);
        zzZ(zz6nZzZ);
        return zzjc;
    }

    public final zzZVN zzZ(Class cls, String str, zzKO zzko) throws Exception {
        zz6N zz6nZzY;
        zzZYD.zzXk(str);
        if (zzIA()) {
            return null;
        }
        zz6N zz6n = (zz6N) zzQW.zzZ(this.zzCd, str);
        if (zz6n == null) {
            if (cls != null) {
                zz6nZzY = zz6N.zzX(cls, str);
            } else {
                zz6nZzY = zz6N.zzY(zzko, str);
            }
            zz6n = zz6nZzY;
            zzZ(zz6n, true);
        } else if (cls != null) {
            throw new zzCX(zzZKN.format("Can not redefine the type of variable '{0}'.", str));
        }
        return new zzZVN(zz6n, new zzKN(zzSU.zzZ(zz6n, zzko), this.zzCb.toString()));
    }

    private void zzZ(zzFZ zzfz) {
        if (zzIA() || !zzZYD.zzXk(zzfz.getName())) {
            return;
        }
        zzZQF.zzY(this.zzCe, zzfz.getName());
    }
}
