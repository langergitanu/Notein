package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5B {
    private ArrayList<zzZ> zz7c = new ArrayList<>();
    private DocumentBase zzX2L;
    private zzYWB zzZtB;
    private static zzYEF zzX2K = zzXVb();
    private static zzYEF zzX2J = zzXVa();
    private static zzYEF zzX2I = zzXV9();

    public static class zzT extends zzW {
        private int zzX2B;
        private boolean zzYEX;
        private boolean zzYEY;

        public zzT(boolean z, boolean z2, int i) {
            super((byte) 0);
            this.zzYEY = z;
            this.zzYEX = z2;
            this.zzX2B = i;
        }

        private boolean zzZ(zzT zzt) {
            return this.zzX2B == zzt.zzX2B;
        }

        public boolean equals(Object obj) {
            if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
                return false;
            }
            if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
                return true;
            }
            if (obj.getClass() != getClass()) {
                return false;
            }
            return zzZ((zzT) obj);
        }

        public int hashCode() {
            return this.zzX2B;
        }

        public final boolean isBold() {
            return this.zzYEY;
        }

        public final boolean isItalic() {
            return this.zzYEX;
        }

        public final int zzYO1() {
            return this.zzX2B;
        }
    }

    public static class zzU extends zzW {
        private int zzX2B;
        private boolean zzYEX;
        private boolean zzYEY;

        public zzU(boolean z, boolean z2, int i) {
            super((byte) 0);
            this.zzYEY = z;
            this.zzYEX = z2;
            this.zzX2B = i;
        }

        private boolean zzZ(zzU zzu) {
            return this.zzX2B == zzu.zzX2B;
        }

        public boolean equals(Object obj) {
            if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
                return false;
            }
            if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
                return true;
            }
            if (obj.getClass() != getClass()) {
                return false;
            }
            return zzZ((zzU) obj);
        }

        public int hashCode() {
            return this.zzX2B;
        }

        public final boolean isBold() {
            return this.zzYEY;
        }

        public final boolean isItalic() {
            return this.zzYEX;
        }

        public final int zzYO1() {
            return this.zzX2B;
        }
    }

    public static class zzV extends zzW {
        private int zzWz;
        private boolean zzX2C;
        private boolean zzX2D;
        private boolean zzX2E;
        private boolean zzX2F;
        private int zzZja;

        public zzV(boolean z, boolean z2, int i, int i2) {
            super((byte) 0);
            this.zzX2F = z;
            this.zzX2E = z2;
            this.zzX2D = z;
            this.zzX2C = z2;
            this.zzWz = i;
            this.zzZja = i2;
        }

        public final int getEnd() {
            return this.zzZja;
        }

        public final int getStart() {
            return this.zzWz;
        }

        public final void zzPC(boolean z) {
            this.zzX2E = z;
        }

        public final void zzPD(boolean z) {
            this.zzX2F = z;
        }

        public final boolean zzXV3() {
            return this.zzX2C;
        }

        public final boolean zzXV4() {
            return this.zzX2D;
        }

        public final boolean zzXV5() {
            return this.zzX2E;
        }

        public final boolean zzXV6() {
            return this.zzX2F;
        }
    }

    public static abstract class zzW implements zzZ {
        private zzW() {
        }

        @Override // com.aspose.words.zzY5B.zzZ
        public final zzW zzXV8() {
            return this;
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public static class zzX implements zzZ {
        private zzW zzX2G;
        private int zzX2H;

        public zzX(int i, zzW zzw) {
            this.zzX2H = i;
            this.zzX2G = zzw;
        }

        private boolean zzZ(zzX zzx) {
            return this.zzX2H == zzx.zzX2H && com.aspose.words.internal.zzZKO.equals(this.zzX2G, zzx.zzX2G);
        }

        public boolean equals(Object obj) {
            if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
                return false;
            }
            if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
                return true;
            }
            if (obj.getClass() != zzX.class) {
                return false;
            }
            return zzZ((zzX) obj);
        }

        public final int getSequenceNumber() {
            return this.zzX2H;
        }

        public int hashCode() {
            return (this.zzX2H * 397) ^ this.zzX2G.hashCode();
        }

        @Override // com.aspose.words.zzY5B.zzZ
        public final zzW zzXV8() {
            return this.zzX2G;
        }
    }

    public static class zzY {
        private ArrayList<Run> zzYtn = new ArrayList<>();
        private DocumentBase zzZCL;

        public zzY(DocumentBase documentBase) {
            this.zzZCL = documentBase;
        }

        public final void zzL(String str, boolean z, boolean z2) {
            zzQ(str, zzY5B.zzv(z, z2));
        }

        public final void zzQ(String str, zzYEF zzyef) {
            if (zzyef == null) {
                zzyef = new zzYEF();
            }
            if (this.zzYtn.size() > 0) {
                Run run = (Run) C21505OooO0Oo.OooO00o(1, this.zzYtn);
                if (run.zzZYh().zzV(zzyef)) {
                    run.setText(run.getText() + str);
                    return;
                }
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYtn, new Run(this.zzZCL, str, zzyef));
        }

        public final ArrayList<Run> zzXV7() {
            return this.zzYtn;
        }
    }

    public interface zzZ {
        zzW zzXV8();
    }

    public zzY5B(zzYWB zzywb) {
        this.zzZtB = zzywb;
        this.zzX2L = zzywb.getDocument();
    }

    private static zzYEF zzXV9() {
        zzYEF zzyef = new zzYEF();
        zzyef.zzQ(60, zzZU.zzZF6);
        zzyef.zzQ(70, zzZU.zzZF6);
        return zzyef;
    }

    private static zzYEF zzXVa() {
        zzYEF zzyef = new zzYEF();
        zzyef.zzQ(70, zzZU.zzZF6);
        return zzyef;
    }

    private static zzYEF zzXVb() {
        zzYEF zzyef = new zzYEF();
        zzyef.zzQ(60, zzZU.zzZF6);
        return zzyef;
    }

    private boolean zzXVc() {
        if (this.zz7c.size() < 5) {
            return false;
        }
        int i = 0;
        int i2 = 1;
        zzW zzwZzXV8 = this.zz7c.get(0).zzXV8();
        while (i2 < this.zz7c.size()) {
            zzW zzwZzXV82 = this.zz7c.get(i2).zzXV8();
            if (zzwZzXV82.equals(zzwZzXV8) || zzZ(zzwZzXV82, zzwZzXV8) || zzZ(zzwZzXV8, zzwZzXV82)) {
                i++;
            }
            i2++;
            zzwZzXV8 = zzwZzXV82;
        }
        return this.zz7c.size() - i >= 5;
    }

    private static ArrayList<Run> zzn(DocumentBase documentBase) {
        ArrayList<Run> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new Run(documentBase, "passim"));
        return arrayList;
    }

    public static zzYEF zzv(boolean z, boolean z2) {
        if (z && z2) {
            return zzX2I;
        }
        if (z) {
            return zzX2K;
        }
        if (z2) {
            return zzX2J;
        }
        return null;
    }

    public final void zzY(boolean z, boolean z2, int i, int i2) {
        zzZ(new zzU(z, z2, i), i2);
    }

    public final ArrayList<Run> zzZ(DocumentBase documentBase, boolean z, String str, String str2, String str3) {
        if (z && zzXVc()) {
            return zzn(documentBase);
        }
        zzY zzy = new zzY(documentBase);
        zzZ(zzy, this.zz7c, str, str3, str2);
        return zzy.zzXV7();
    }

    public final zzYWB zzZga() {
        return this.zzZtB;
    }

    private static boolean zzZ(zzW zzw, zzW zzw2) {
        zzT zzt = (zzT) com.aspose.words.internal.zzZKW.zzZ(zzw, zzT.class);
        zzU zzu = (zzU) com.aspose.words.internal.zzZKW.zzZ(zzw2, zzU.class);
        return (zzt == null || zzu == null || zzt.zzYO1() != zzu.zzYO1()) ? false : true;
    }

    private static void zzZ(zzY zzy, ArrayList<zzZ> arrayList, String str, String str2, String str3) {
        zzY zzy2;
        String str4;
        int i = 0;
        while (i < arrayList.size()) {
            zzZ zzz = arrayList.get(i);
            zzX zzx = (zzX) com.aspose.words.internal.zzZKW.zzZ(zzz, zzX.class);
            zzW zzwZzXV8 = zzz.zzXV8();
            if (i != 0) {
                zzy.zzQ(str, null);
            }
            zzT zzt = (zzT) com.aspose.words.internal.zzZKW.zzZ(zzwZzXV8, zzT.class);
            if (zzt != null) {
                int iZzYO1 = zzt.zzYO1();
                boolean zIsBold = zzt.isBold();
                boolean zIsItalic = zzt.isItalic();
                zzy2 = zzy;
                str4 = str3;
                zzZ(zzy2, zzx, str4, iZzYO1, zIsBold, zIsItalic);
            } else {
                zzy2 = zzy;
                str4 = str3;
                zzV zzv = (zzV) com.aspose.words.internal.zzZKW.zzZ(zzwZzXV8, zzV.class);
                if (zzv != null) {
                    zzZ(zzy2, zzx, str4, zzv.getStart(), zzv.zzXV6(), zzv.zzXV5());
                    zzy2.zzQ(str2, null);
                    zzZ(zzy2, zzx, str4, zzv.getEnd(), zzv.zzXV4(), zzv.zzXV3());
                } else {
                    zzU zzu = (zzU) com.aspose.words.internal.zzZKW.zzZ(zzwZzXV8, zzU.class);
                    if (zzu != null) {
                        zzy2.zzQ("Error! Not a valid bookmark in entry on page ", zzX2K);
                        zzZ(zzy2, zzx, str4, zzu.zzYO1(), zzu.isBold(), zzu.isItalic());
                    }
                }
            }
            i++;
            zzy = zzy2;
            str3 = str4;
        }
    }

    private static void zzZ(zzY zzy, zzX zzx, String str, int i, boolean z, boolean z2) {
        zzy.zzL(zzZ(zzx, str, i), z, z2);
    }

    private static String zzZ(zzX zzx, String str, int i) {
        if (zzx == null) {
            return Integer.toString(i);
        }
        return zzx.getSequenceNumber() + str + i;
    }

    public final void zzZ(boolean z, boolean z2, int i, int i2) {
        zzZ(new zzT(z, z2, i), i2);
    }

    public final void zzZ(boolean z, boolean z2, int i, int i2, int i3) {
        zzZ(new zzV(z, z2, i, i2), i3);
    }

    private void zzZ(zzW zzw, int i) {
        if (i == Integer.MIN_VALUE) {
            zzZ(zzw);
        } else {
            zzZ(new zzX(i, zzw));
        }
    }

    public final void zzZ(zzY5B zzy5b) {
        Iterator<zzZ> it = zzy5b.zz7c.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
    }

    private void zzZ(zzZ zzz) {
        zzZ zzz2 = this.zz7c.size() == 0 ? null : (zzZ) C21505OooO0Oo.OooO00o(1, this.zz7c);
        if (zzz2 == null || !(zzz2.equals(zzz) || zzZ(zzz2, zzz))) {
            com.aspose.words.internal.zzZQG.zzZ(this.zz7c, zzz);
        }
    }

    private boolean zzZ(zzZ zzz, zzZ zzz2) {
        zzV zzv;
        zzT zzt = (zzT) com.aspose.words.internal.zzZKW.zzZ(zzz.zzXV8(), zzT.class);
        if (zzt == null || (zzv = (zzV) com.aspose.words.internal.zzZKW.zzZ(zzz2.zzXV8(), zzV.class)) == null || zzt.zzYO1() != zzv.getStart()) {
            return false;
        }
        zzX zzx = (zzX) com.aspose.words.internal.zzZKW.zzZ(zzz, zzX.class);
        zzX zzx2 = (zzX) com.aspose.words.internal.zzZKW.zzZ(zzz2, zzX.class);
        if (zzx != null && zzx2 != null && zzx.getSequenceNumber() != zzx2.getSequenceNumber()) {
            return false;
        }
        zzv.zzPD(zzt.isBold());
        zzv.zzPC(zzt.isItalic());
        ArrayList<zzZ> arrayList = this.zz7c;
        arrayList.set(arrayList.size() - 1, zzz2);
        return true;
    }
}
