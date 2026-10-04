package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzYAH extends zzYA3 implements zzZ99 {
    private String zzXce;
    private zzYAH zzXcf;
    private zzYAH zzXcg;
    private FieldChar zzXch;
    private Object zzYDg;
    private Field zzZz7;

    public zzYAH(FieldChar fieldChar) {
        super(0);
        this.zzXch = fieldChar;
    }

    private static void zzH(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        if (zzyau2 == null) {
            return;
        }
        zzZYV zzzyvZzZoS = zzyau.zzab().zzZoS();
        zzyau2.zzY6W();
        zzZ4N zzz4nZzYPe = zzyau.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzyau2);
        zzYAU zzyau3 = zzz4nZzYPe.moveNext() ? (zzYAU) zzz4nZzYPe.zzYPi() : null;
        zzz4nZzYPe.zzX(zzyau);
        while (!com.aspose.words.internal.zzZKO.zzA(zzz4nZzYPe.zzYPi(), zzyau3)) {
            zzzyvZzZoS.zzL((zzYAU) zzz4nZzYPe.zzYPi());
        }
    }

    private static boolean zzI(zzYWB zzywb) {
        Iterator<Node> it = zzywb.iterator();
        while (it.hasNext()) {
            int nodeType = it.next().getNodeType();
            if (nodeType == 17 || nodeType == 18 || nodeType == 35) {
                return true;
            }
        }
        return false;
    }

    private int zzV(zzZOR zzzor) {
        if (!zzzor.zzZaI()) {
            zzzor.zzCQ(zzY5y());
        }
        return zzzor.zzZaJ();
    }

    private int zzW(zzZOR zzzor) {
        return zzab().zzZp0().zzv5(0) + zzV(zzzor);
    }

    private boolean zzY5E() {
        return ((zzZ35) ((zzZ2D) zzZ8m().zza9()).zzYTt()).zzYLn();
    }

    private boolean zzY5F() {
        if (getFieldType() != 33 || zzY5E()) {
            return false;
        }
        int index = zzZ8m().getIndex();
        Object obj = this.zzYDg;
        return obj != null && ((Integer) obj).intValue() == index;
    }

    private boolean zzY5G() throws Exception {
        if (getField().getType() != 33 || zzqh(1024) == null || zzY6j() != null || zzY5E() || zzY5F()) {
            return false;
        }
        getField();
        zzYAF zzyaf = new zzYAF(this, zzab().zzZoM());
        zzZQI zzzqiZzZ = zzZOQ.zzZ(zzab(), getField(), zzyaf, (byte) -1);
        if (zzzqiZzZ == null) {
            return false;
        }
        Ref<zzYAU> ref = new Ref<>(null);
        Ref<zzYAU> ref2 = new Ref<>(null);
        zzY(ref, ref2);
        zzYAU zzyau = ref.get();
        zzYAU zzyau2 = ref2.get();
        zzY5A();
        zzZ(zzyau, zzyau2, zzzqiZzZ.zzZga(), zzY5A().zzY7w(), zzyaf);
        zzaa().zzab().zzZoS().commit();
        this.zzYDg = Integer.valueOf(zzZ8m().getIndex());
        return true;
    }

    private void zzY5H() {
        zzZ((short) 512, true);
    }

    private int zzY5x() {
        FieldPageRef fieldPageRef = (FieldPageRef) getField();
        zzYAT zzyat = (zzYAT) zzab().zzZoO().get(fieldPageRef.getBookmarkName());
        if (zzyat == null) {
            fieldPageRef.getBookmarkName();
            return -1;
        }
        fieldPageRef.zzZI(zzyat.zzZcG());
        return zzZt(zzyat);
    }

    private int zzY5y() {
        Document documentZzYBb = this.zzXch.zzYBb();
        if (!documentZzYBb.zzZql()) {
            return 0;
        }
        PageSetup pageSetup = documentZzYBb.getFirstSection().getPageSetup();
        return (pageSetup.getRestartPageNumbering() && pageSetup.getPageStartingNumber() == 0) ? -1 : 0;
    }

    private static zzYAU zzZq(zzYAU zzyau) {
        if (zzyau.zzY6X()) {
            return zzyau.zzaa() instanceof zzYVI ? ((zzYVN) zzyau.zza9().zzYTk()).zzYzk() : zzyau;
        }
        zzZ4N zzz4nZzYPe = zzyau.zzaa().zzY4s().zzYPe();
        if (!zzz4nZzYPe.zzW(zzyau)) {
            return null;
        }
        while (zzz4nZzYPe.movePrevious()) {
            zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            if (zzyau.zzY6X()) {
                return zzyau;
            }
        }
        zzz4nZzYPe.zzX(zzyau);
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau2 = (zzYAU) zzz4nZzYPe.zzYPi();
            if (zzyau2.zzY6X()) {
                return zzyau2;
            }
        }
        return null;
    }

    private static int zzZr(zzYAU zzyau) {
        zzYAU zzyauZzZq = zzZq(zzyau);
        if (zzyauZzZq != null) {
            zzyauZzZq.zza9();
        }
        int i = 0;
        for (zzZ2D zzz2d = com.aspose.words.internal.zzZKW.zzZ(zzyauZzZq.zza9().zzYTk(), zzZ2D.class) != null ? (zzZ2D) com.aspose.words.internal.zzZKW.zzZ(zzyauZzZq.zza9().zzYTk(), zzZ2D.class) : (zzZ2D) zzg(zzyauZzZq).zza9(); zzz2d != null; zzz2d = (zzZ2D) zzz2d.zzYTo()) {
            i++;
        }
        return i;
    }

    private static int zzZs(zzYAU zzyau) {
        zzZ2D zzz2d = (zzZ2D) zzg(zzyau).zza9();
        int i = !zzz2d.zzYJb().isEmpty() ? 1 : 0;
        for (zzYN8 zzyn8 = (zzYN8) zzz2d.zzYJb().zzYo1(); zzyn8 != null && zzyn8.zza9() == zzz2d; zzyn8 = (zzYN8) zzyn8.zzYo1()) {
            i++;
        }
        return i;
    }

    public static int zzZt(zzYAU zzyau) {
        zzYN8 zzyn8Zzg = zzg(zzyau);
        if (zzyn8Zzg == null) {
            return -1;
        }
        return zzyn8Zzg.getPageNumber();
    }

    private static void zzZu(zzYAU zzyau) {
        zzZYW zzzywZzab;
        zzTC zztc = (zzZ55) zzyau.zzZZJ();
        if (zztc == null || (zzzywZzab = zztc.zzab()) == null) {
            return;
        }
        zzzywZzab.zzY(zztc);
    }

    private static void zzZv(zzYAU zzyau) throws Exception {
        zzUZ zzuz = (zzUZ) zzyau.zzqh(2);
        if (zzuz != null && zzuz.zzac()) {
            if (!zzuz.zzZXR()) {
                zzuz.zz0p();
            }
            if (zzuz.zzYo0() == null || !((zzUZ) zzuz.zzYo0()).zzY8m()) {
                return;
            }
            zzuz.zzYo0().zzYnV();
        }
    }

    private static zzYN8 zzg(zzYMD zzymd) {
        while (zzymd != null) {
            int iZz60 = zzymd.zz60();
            if (iZz60 == 1) {
                return (zzYN8) zzymd;
            }
            if (iZz60 == 64) {
                zzymd = zzZq((zzYAU) zzymd);
            } else if (iZz60 == 2048) {
                zzymd = ((zzYC4) zzymd).zzY8N();
            }
            if (zzymd != null) {
                zzymd = zzymd.zzZZJ();
            }
        }
        return null;
    }

    public final Field getField() {
        if (this.zzZz7 == null) {
            int iZzZ1s = zzZ1s();
            if (iZzZ1s != 1) {
                if (iZzZ1s != 2) {
                    if (iZzZ1s != 3 || zzY5C() == null) {
                        return null;
                    }
                } else if (zzY5A() == null) {
                    return null;
                }
            } else if (zzY5A() == null || zzY5C() == null) {
                return null;
            }
            this.zzZz7 = zzZQB.zzX((FieldStart) zzY5C().zzXch, zzY5B() != null ? (FieldSeparator) zzY5B().zzXch : null, (FieldEnd) zzY5A().zzXch);
        }
        return this.zzZz7;
    }

    public final int getFieldType() {
        return zzY5C().zzXch.getFieldType();
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzZ99
    public final String getScreenTip() {
        if (getFieldType() != 88) {
            return null;
        }
        return ((FieldHyperlink) getField()).getScreenTip();
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() {
        switch (this.zzXch.getNodeType()) {
            case 22:
                return "[";
            case 23:
                return "|";
            case 24:
                return "]";
            default:
                return " ";
        }
    }

    public final void zzX(zzYAH zzyah) {
        int nodeType = this.zzXch.getNodeType();
        if (nodeType == 22) {
            zzY5A().zzX(zzyah);
            zzyah.zzXcg = zzY5A();
        } else {
            if (nodeType != 24) {
                throw new IllegalStateException("Unexpected node type.");
            }
            this.zzXcg = zzyah;
            zzyah.zzXcg = this;
        }
    }

    public final void zzY(zzZOR zzzor) throws Exception {
        if (this.zzXch.isRemoved()) {
            return;
        }
        this.zzXch.getAncestor(4);
        zzZ(getField(), new zzYAF(this, zzzor), true);
    }

    public final zzYAH zzY5A() {
        switch (this.zzXch.getNodeType()) {
            case 22:
                return this.zzXcf;
            case 23:
                return this.zzXcg;
            case 24:
                return this;
            default:
                throw new IllegalStateException("Unexpected node type.");
        }
    }

    public final zzYAH zzY5B() {
        zzYAH zzyahZzY5A = this;
        while (true) {
            switch (zzyahZzY5A.zzXch.getNodeType()) {
                case 22:
                    zzyahZzY5A = zzyahZzY5A.zzY5A();
                    break;
                case 23:
                    return zzyahZzY5A;
                case 24:
                    return zzyahZzY5A.zzXcg;
                default:
                    throw new IllegalStateException("Unexpected node type.");
            }
        }
    }

    public final zzYAH zzY5C() {
        zzYAH zzyahZzY5A = this;
        while (true) {
            switch (zzyahZzY5A.zzXch.getNodeType()) {
                case 22:
                    return zzyahZzY5A;
                case 23:
                    zzyahZzY5A.zzY5A();
                    zzyahZzY5A = zzyahZzY5A.zzY5A();
                    break;
                case 24:
                    return zzyahZzY5A.zzXcf;
                default:
                    throw new IllegalStateException("Unexpected node type.");
            }
        }
    }

    public final boolean zzY5D() {
        return zzZOO.zzCD(getFieldType()) ? zzZOO.zzCE(getFieldType()) : zzZOO.zzi(getField());
    }

    public final FieldChar zzY5z() {
        return this.zzXch;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAH zzyah = new zzYAH(this.zzXch);
        zzyah.zzXce = this.zzXce;
        zzyah.zzZz7 = this.zzZz7;
        zzZB(zzyah);
        return zzyah;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY7o() {
        return this.zzXcf;
    }

    @Override // com.aspose.words.zzYAU
    public final void zzY7p() {
        try {
            if (zzZ1s() == 2 && !zzY5G() && !zzE((short) 512)) {
                zzY5H();
                if (zzY5D()) {
                    return;
                }
                zzYWB zzywbZzZgI = (zza8().zzYT4() && getFieldType() == 83) ? null : getField().zzZgI();
                if (zzywbZzZgI == null) {
                    return;
                }
                Ref<zzYAU> ref = new Ref<>(null);
                Ref<zzYAU> ref2 = new Ref<>(null);
                zzZ(ref, ref2);
                zzZ(ref.get(), ref2.get(), zzywbZzZgI, true, null);
                zzaa().zzab().zzZoS().commit();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZ99
    public final String zzYWa() {
        return getFieldType() == 88 ? ((FieldHyperlink) getField()).getTarget() : "";
    }

    @Override // com.aspose.words.zzYAU
    public final void zzZ(Map<zzYAU, zzYAU> map, zzYAU zzyau) {
        zzYAH zzyah;
        super.zzZ(map, zzyau);
        zzYAH zzyah2 = ((zzYAH) zzyau).zzXcg;
        if (zzyah2 == null || (zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ((zzYAU) com.aspose.words.internal.zzQW.zzZ((Map<zzYAH, TValue>) map, zzyah2), zzYAH.class)) == null) {
            return;
        }
        this.zzXcg = zzyah;
        zzyah.zzXcg = this;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        switch (this.zzXch.getNodeType()) {
            case 22:
                return 2;
            case 23:
                return 1;
            case 24:
                return 3;
            default:
                throw new IllegalStateException("Unexpected node type.");
        }
    }

    @Override // com.aspose.words.zzYAU
    public final void zzZC(zzYAU zzyau) {
        this.zzXcf = (zzYAH) zzyau;
    }

    public final void zzZU(Field field) {
        this.zzZz7 = field;
    }

    @Override // com.aspose.words.zzZ99
    public final String zzZkA() {
        int fieldType = getFieldType();
        if (fieldType == 3) {
            FieldRef fieldRef = (FieldRef) getField();
            if (!fieldRef.getInsertHyperlink()) {
                return null;
            }
            return "#" + fieldRef.getBookmarkName();
        }
        if (fieldType == 37) {
            FieldPageRef fieldPageRef = (FieldPageRef) getField();
            if (!fieldPageRef.getInsertHyperlink()) {
                return null;
            }
            return "#" + fieldPageRef.getBookmarkName();
        }
        if (fieldType != 72) {
            if (fieldType != 88) {
                return null;
            }
            return ((FieldHyperlink) getField()).getHRef();
        }
        FieldNoteRef fieldNoteRef = (FieldNoteRef) getField();
        if (!fieldNoteRef.getInsertHyperlink()) {
            return null;
        }
        return "#" + fieldNoteRef.getBookmarkName();
    }

    public final void zzY(zzYAH zzyah) {
        int nodeType = this.zzXch.getNodeType();
        if (nodeType == 23) {
            zzY5A().zzY(zzyah);
            zzyah.zzXcf = zzY5A();
        } else {
            if (nodeType == 24) {
                this.zzXcf = zzyah;
                zzyah.zzXcf = this;
                return;
            }
            throw new IllegalStateException("Unexpected node type.");
        }
    }

    public final int zzX(zzZOR zzzor) {
        int fieldType = getFieldType();
        if (fieldType == 26) {
            return zzW(zzzor);
        }
        if (fieldType == 33) {
            return zzZt(this);
        }
        if (fieldType == 37) {
            return zzY5x();
        }
        if (fieldType == 65) {
            return zzZr(this);
        }
        if (fieldType != 66) {
            return -1;
        }
        return zzZs(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(Field field, zzYAG zzyag, boolean z) throws Exception {
        zzYAU zzyauZzY5C;
        zzYAU zzyauZzY5A;
        zzYAH zzyah;
        boolean z2;
        zzYAU zzyau;
        zzYAU zzyau2;
        Field field2;
        zzYAG zzyag2;
        boolean zZzZ;
        if (zzY5F()) {
            return;
        }
        if (z && zzqh(1024) == null) {
            zzqh(2);
        }
        zzZQI zzzqiZzZ = zzZOQ.zzZ(zzab(), field, zzyag, z ? (byte) 1 : (byte) 0);
        if (zzzqiZzZ == null) {
            return;
        }
        int iZzZeg = zzzqiZzZ.zzZeg();
        boolean z3 = false;
        if (iZzZeg == 0) {
            Ref<zzYAU> ref = new Ref<>(null);
            Ref<zzYAU> ref2 = new Ref<>(null);
            zzY(ref, ref2);
            zzyauZzY5C = ref.get();
            zzyauZzY5A = ref2.get();
        } else {
            if (iZzZeg != 1) {
                if (iZzZeg == 2) {
                    Ref<zzYAU> ref3 = new Ref<>(null);
                    Ref<zzYAU> ref4 = new Ref<>(null);
                    zzZ(ref3, ref4);
                    zzYAU zzyau3 = ref3.get();
                    zzyau2 = ref4.get();
                    zzyah = this;
                    z2 = z ? 1 : 0;
                    zzyau = zzyau3;
                    z3 = true;
                    zzyag2 = null;
                    field2 = field;
                    zZzZ = zzyah.zzZ(field2, z2, zzzqiZzZ, zzyau, zzyau2, zzyag2);
                    zzYAU zzyau4 = zzyau;
                    zzYAU zzyau5 = zzyau2;
                    zzYAG zzyag3 = zzyag2;
                    if (zZzZ) {
                        if (z) {
                            zzZ(zzyau4, zzzqiZzZ.zzZga());
                            zzZu(zzyau4);
                        }
                        zzZv(zzyau4);
                        zzZ(zzyau4, zzyau5, zzzqiZzZ.zzZga(), zzY5A().zzY7w() ? true : z3, zzyag3);
                        if (z) {
                            zzaa().zzab().zzZoS().commit();
                        }
                        if (getFieldType() == 33) {
                            this.zzYDg = Integer.valueOf(zzZ8m().getIndex());
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Unexpected field range type.");
            }
            zzyauZzY5C = zzY5C();
            zzyauZzY5A = zzY5A();
        }
        zzyah = this;
        z2 = z ? 1 : 0;
        zzyau = zzyauZzY5C;
        zzyau2 = zzyauZzY5A;
        field2 = field;
        zzyag2 = zzyag;
        zZzZ = zzyah.zzZ(field2, z2, zzzqiZzZ, zzyau, zzyau2, zzyag2);
        zzYAU zzyau42 = zzyau;
        zzYAU zzyau52 = zzyau2;
        zzYAG zzyag32 = zzyag2;
        if (zZzZ) {
        }
    }

    private void zzY(Ref<zzYAU> ref, Ref<zzYAU> ref2) {
        zzY5B();
        zzZ4N zzz4nZzYPe = zzaa().zzY4s().zzYPe();
        if (zzz4nZzYPe.zzW(zzY5B()) && zzz4nZzYPe.moveNext()) {
            ref.set((zzYAU) zzz4nZzYPe.zzYPi());
            if (ref.get() == zzY5A()) {
                ref2.set(null);
                return;
            } else {
                if (zzz4nZzYPe.zzW(zzY5A()) && zzz4nZzYPe.movePrevious()) {
                    ref2.set((zzYAU) zzz4nZzYPe.zzYPi());
                    ref2.get();
                    zzY5B();
                    return;
                }
                throw new IllegalStateException();
            }
        }
        throw new IllegalStateException();
    }

    private boolean zzZ(Field field, boolean z, zzZQI zzzqi, zzYAU zzyau, zzYAU zzyau2, zzYAG zzyag) throws Exception {
        zzZ55 zzz55;
        if (zzab().zzZoI() != 1 || field.getType() != 26 || !z || !field.zzZgt() || (zzz55 = (zzZ55) zzyau.zzZZJ()) != ((zzZ55) zzyau2.zzZZJ())) {
            return false;
        }
        zzz55.zzYj(true);
        zzZ(zzyau, zzyau2, zzzqi.zzZga(), false, zzyag);
        zzaa().zzab().zzZoS().commit();
        zzY5A().zzZZJ();
        if (zzz55.zzZU((zzYAU) zzz55.zz6w())) {
            zzY9Q.zzG((zzYAU) zzz55.zz6x(), (zzYAU) zzz55.zz6w());
        }
        zzZ59.zzy(zzz55);
        zzz55.zzYj(false);
        return true;
    }

    private void zzZ(Ref<zzYAU> ref, Ref<zzYAU> ref2) {
        zzZ4N zzz4nZzYPe = zzaa().zzY4s().zzYPe();
        if (zzz4nZzYPe.zzW(zzY5A()) && zzz4nZzYPe.moveNext()) {
            ref.set((zzYAU) zzz4nZzYPe.zzYPi());
            ref2.set(null);
            while (((zzYAU) zzz4nZzYPe.zzYPi()).zzY7w()) {
                ref2.set((zzYAU) zzz4nZzYPe.zzYPi());
                if (!zzz4nZzYPe.moveNext()) {
                    throw new IllegalStateException();
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    private zzYAU zzZ(zzYAU zzyau, zzYAU zzyau2, zzYWB zzywb, boolean z, zzYAG zzyag) throws Exception {
        zzYAU zzyauZzZ = zzZ(zzywb, zzyau, z, zzyag);
        zzH(zzyau, zzyau2);
        return zzyauZzZ;
    }

    private zzYAU zzZ(zzYWB zzywb, zzYAU zzyau, boolean z, zzYAG zzyag) throws Exception {
        zzYAU zzyauZz14 = null;
        if (!zzywb.zz13() && !zzywb.isEmpty()) {
            zzZYO zzzyo = new zzZYO(zzywb, zzyau);
            while (zzzyo.moveNext()) {
                if (zzyauZz14 == null) {
                    zzzyo.zzZnU().zzXbB = zzaa();
                    zzyauZz14 = zzzyo.zz14();
                }
                if (z) {
                    zzzyo.zz14().zzY7v();
                }
                zzab().zzZoS().zzZ(zzzyo.zzZnU(), zzzyo.zz14());
                if (zzyag != null) {
                    zzyag.zzZp(zzzyo.zz14());
                }
            }
        }
        return zzyauZz14;
    }

    private static void zzZ(zzYAU zzyau, zzYWB zzywb) throws Exception {
        zzZ55 zzz55 = (zzZ55) zzyau.zzZZJ();
        if (zzz55 == null) {
            return;
        }
        zzZNC.zzZ(zzz55, zzI(zzywb));
    }
}
