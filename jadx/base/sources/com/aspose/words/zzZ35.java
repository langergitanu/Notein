package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ35 extends zzZ3E {
    private int mVerticalAlignment;
    private boolean zzY7G;
    private int zzY7H;
    private boolean zzY7I;
    private int zzY7J;
    private int zzY7K;
    private int zzY7L;
    private int zzY7M;
    private int zzY7N;
    private int zzY7O;
    private int zzY7P;
    private int zzY7Q;
    private int zzY7R;
    private int zzY7S;
    private int zzY7T;
    private int zzY7U;
    private int zzY7V;
    private int zzY7W;
    private int zzY7X;
    private int zzY7Y;
    private int zzY7Z;
    private int zzY80;
    private boolean zzY81;
    private int zzY82;
    private boolean zzY83;
    private int zzY84;
    private int zzY85;
    private int zzY86;
    private int[] zzY87;
    private int[] zzY88;
    private boolean zzY89;
    private boolean zzY8a;
    private int zzY8b;
    private int zzY8c;
    private int zzY8d;
    private int zzY8e;
    private int zzY8f;
    private int zzY8g;
    private boolean zzYS;
    private zzZ3C zzYau;
    private int zzZC9;
    private int zzZhl;
    private int zzZhm;
    private int zzZhn;
    private int zzZho;
    private int zzvP;

    public zzZ35(zzX6 zzx6) {
        super(zzx6);
    }

    public static zzZ35 zzY(zzZ35 zzz35) {
        if (zzz35 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: pr");
        }
        zzZ35 zzz352 = new zzZ35(zzz35.zzZoP());
        zzz352.zzY8g = zzz35.zzY8g;
        zzz352.zzY8f = zzz35.zzY8f;
        zzz352.zzY8e = zzz35.zzY8e;
        zzz352.zzY8d = zzz35.zzY8d;
        zzz352.zzZho = zzz35.zzZho;
        zzz352.zzZhn = zzz35.zzZhn;
        zzz352.zzZhm = zzz35.zzZhm;
        zzz352.zzZhl = zzz35.zzZhl;
        zzz352.zzY8c = zzz35.zzY8c;
        zzz352.zzY8b = zzz35.zzY8b;
        zzz352.zzY8a = zzz35.zzY8a;
        zzz352.zzY89 = zzz35.zzY89;
        int[] iArr = zzz35.zzY88;
        if (iArr != null) {
            int[] iArr2 = new int[iArr.length];
            zzz352.zzY88 = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, zzz35.zzY88.length);
        }
        int[] iArr3 = zzz35.zzY87;
        if (iArr3 != null) {
            int[] iArr4 = new int[iArr3.length];
            zzz352.zzY87 = iArr4;
            System.arraycopy(iArr3, 0, iArr4, 0, zzz35.zzY87.length);
        }
        zzz352.zzY86 = zzz35.zzY86;
        zzz352.zzY85 = zzz35.zzY85;
        zzz352.zzY84 = zzz35.zzY84;
        zzz352.zzYau = zzZ3C.zzY(zzz35.zzYau);
        zzz352.zzY83 = zzz35.zzY83;
        zzz352.zzY82 = zzz35.zzY82;
        zzz352.zzY81 = zzz35.zzY81;
        zzz352.zzY80 = zzz35.zzY80;
        zzz352.zzY7Z = zzz35.zzY7Z;
        zzz352.zzY7X = zzz35.zzY7X;
        zzz352.zzY7W = zzz35.zzY7W;
        zzz352.zzY7V = zzz35.zzY7V;
        zzz352.zzY7U = zzz35.zzY7U;
        zzz352.zzY7T = zzz35.zzY7T;
        zzz352.zzY7S = zzz35.zzY7S;
        zzz352.zzY7R = zzz35.zzY7R;
        zzz352.zzY7Q = zzz35.zzY7Q;
        zzz352.zzY7P = zzz35.zzY7P;
        zzz352.zzY7O = zzz35.zzY7O;
        zzz352.zzY7N = zzz35.zzY7N;
        zzz352.zzY7M = zzz35.zzY7M;
        zzz352.zzY7L = zzz35.zzY7L;
        zzz352.zzvP = zzz35.zzvP;
        zzz352.mVerticalAlignment = zzz35.mVerticalAlignment;
        zzz352.zzZC9 = zzz35.zzZC9;
        zzz352.zzY7K = zzz35.zzY7K;
        zzz352.zzY7J = zzz35.zzY7J;
        zzz352.zzYS = zzz35.zzYS;
        zzz352.zzY7I = zzz35.zzY7I;
        zzz352.zzY7H = zzz35.zzY7H;
        zzz352.zzY7G = zzz35.zzY7G;
        return zzz352;
    }

    public static zzZ35 zzZ(zzZ35 zzz35) {
        if (zzz35 == null) {
            zzz35 = new zzZ35(null);
        }
        if (zzz35.zzZoP() == null || zzz35.isCached()) {
            return zzz35;
        }
        zzZ35 zzz352 = (zzZ35) com.aspose.words.internal.zzQW.zzZ((Map<zzZ35, TValue>) zzz35.zzZoP().zzZAK, zzz35);
        if (zzz352 != null) {
            return zzz352;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz35.zzZoP().zzZAK, zzz35, zzz35);
        return zzz35;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ35 zzz35 = (zzZ35) obj;
        return this.zzY8g == zzz35.zzY8g && this.zzY8f == zzz35.zzY8f && this.zzY8e == zzz35.zzY8e && this.zzY8d == zzz35.zzY8d && this.zzZho == zzz35.zzZho && this.zzZhn == zzz35.zzZhn && this.zzZhm == zzz35.zzZhm && this.zzZhl == zzz35.zzZhl && this.zzY8a == zzz35.zzY8a && this.zzY89 == zzz35.zzY89 && this.zzY85 == zzz35.zzY85 && this.zzY84 == zzz35.zzY84 && this.zzY83 == zzz35.zzY83 && this.zzY82 == zzz35.zzY82 && this.zzY8c == zzz35.zzY8c && this.zzY8b == zzz35.zzY8b && this.zzY81 == zzz35.zzY81 && this.zzY80 == zzz35.zzY80 && this.zzY7Z == zzz35.zzY7Z && this.zzY7Y == zzz35.zzY7Y && this.zzY7X == zzz35.zzY7X && this.zzvP == zzz35.zzvP && this.zzY7W == zzz35.zzY7W && this.zzY7V == zzz35.zzY7V && this.zzY7U == zzz35.zzY7U && this.zzY7T == zzz35.zzY7T && this.zzY7S == zzz35.zzY7S && this.zzY7R == zzz35.zzY7R && this.zzY7Q == zzz35.zzY7Q && this.zzY7P == zzz35.zzY7P && this.zzY7O == zzz35.zzY7O && this.zzY7N == zzz35.zzY7N && this.zzY7M == zzz35.zzY7M && this.zzY7L == zzz35.zzY7L && this.mVerticalAlignment == zzz35.mVerticalAlignment && this.zzZC9 == zzz35.zzZC9 && this.zzY7K == zzz35.zzY7K && this.zzY7J == zzz35.zzY7J && this.zzYS == zzz35.zzYS && this.zzY7I == zzz35.zzY7I && this.zzY7H == zzz35.zzY7H && this.zzY7G == zzz35.zzY7G && com.aspose.words.internal.zzZKO.equals(zzYMV(), zzz35.zzYMV()) && com.aspose.words.internal.zzZ1.zzZ(this.zzY88, zzz35.zzY88) && com.aspose.words.internal.zzZ1.zzZ(this.zzY87, zzz35.zzY87);
    }

    public final int getBorderAppliesTo() {
        return this.zzY84;
    }

    public final int getBorderDistanceFrom() {
        return this.zzY85;
    }

    public final int getColumnsCount() {
        return this.zzY87.length;
    }

    public final int getFirstPageTray() {
        return this.zzY7Y;
    }

    public final int getLineNumberCountBy() {
        return this.zzY7T;
    }

    public final int getLineNumberRestartMode() {
        return this.zzY7W;
    }

    public final int getLineStartingNumber() {
        return this.zzY7V;
    }

    public final int getOrientation() {
        return this.zzvP;
    }

    public final int getOtherPagesTray() {
        return this.zzY7X;
    }

    public final int getPageHeight() {
        return this.zzY8e;
    }

    public final int getPageStartingNumber() {
        return this.zzY80;
    }

    public final int getPageWidth() {
        return this.zzY8f;
    }

    public final boolean getRestartPageNumbering() {
        return this.zzY80 >= 0;
    }

    public final int getSectionStart() {
        return this.zzY8g;
    }

    public final boolean getSuppressEndnotes() {
        return this.zzY7G;
    }

    public final int getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public final void setBorderAppliesTo(int i) {
        zzYN6();
        this.zzY84 = i;
    }

    public final void setBorderDistanceFrom(int i) {
        zzYN6();
        this.zzY85 = i;
    }

    public final void setFirstPageTray(int i) {
        zzYN6();
        this.zzY7Y = i;
    }

    public final void setHeadingLevelForChapter(int i) {
        zzYN6();
        this.zzY7Z = Math.max(0, i);
    }

    public final void setLineNumberCountBy(int i) {
        zzYN6();
        this.zzY7T = i;
    }

    public final void setLineNumberRestartMode(int i) {
        zzYN6();
        this.zzY7W = i;
    }

    public final void setLineStartingNumber(int i) {
        zzYN6();
        this.zzY7V = i;
    }

    public final void setOrientation(int i) {
        zzYN6();
        this.zzvP = i;
    }

    public final void setOtherPagesTray(int i) {
        zzYN6();
        this.zzY7X = i;
    }

    public final void setPageStartingNumber(int i) {
        zzYN6();
        this.zzY80 = i;
    }

    public final void setSectionStart(int i) {
        zzYN6();
        this.zzY8g = i;
    }

    public final void setSuppressEndnotes(boolean z) {
        zzYN6();
        this.zzY7G = z;
    }

    public final void setVerticalAlignment(int i) {
        zzYN6();
        this.mVerticalAlignment = i;
    }

    public final void zzHi(int i) {
        zzYN6();
        this.zzZhn = i;
    }

    public final void zzHj(int i) {
        zzYN6();
        this.zzZho = i;
    }

    public final void zzTM(boolean z) {
        zzYN6();
        this.zzY7I = z;
    }

    public final void zzTN(boolean z) {
        zzYN6();
        this.zzYS = z;
    }

    public final void zzTO(boolean z) {
        zzYN6();
        this.zzY81 = z;
    }

    public final void zzTP(boolean z) {
        zzYN6();
        this.zzY83 = z;
    }

    public final void zzTQ(boolean z) {
        zzYN6();
        this.zzY89 = z;
    }

    public final void zzTR(boolean z) {
        zzYN6();
        this.zzY8a = z;
    }

    public final void zzU(int[] iArr, int i) {
        zzYN6();
        this.zzY87 = iArr;
        this.zzY86 = i;
    }

    public final void zzX(zzZ3C zzz3c) {
        zzYN6();
        this.zzYau = zzz3c;
    }

    public final int zzYLa() {
        return this.zzY7H;
    }

    public final boolean zzYLb() {
        return this.zzY7I;
    }

    public final int zzYLc() {
        return this.zzY7J;
    }

    public final int zzYLd() {
        return this.zzZC9;
    }

    public final int zzYLe() {
        return this.zzY7L;
    }

    public final int zzYLf() {
        return this.zzY7M;
    }

    public final int zzYLg() {
        return this.zzY7N;
    }

    public final int zzYLh() {
        return this.zzY7O;
    }

    public final int zzYLi() {
        return this.zzY7P;
    }

    public final int zzYLj() {
        return this.zzY7Q;
    }

    public final int zzYLk() {
        return this.zzY7R;
    }

    public final int zzYLl() {
        return this.zzY7S;
    }

    public final int zzYLm() {
        return this.zzY7U;
    }

    public final boolean zzYLn() {
        return this.zzY7Z > 0;
    }

    public final void zzYLo() {
        zzYN6();
        this.zzY80 = -1;
    }

    public final boolean zzYLp() {
        return this.zzY81;
    }

    public final int zzYLq() {
        return this.zzY82;
    }

    public final boolean zzYLr() {
        return this.zzY83;
    }

    public final int zzYLs() {
        return this.zzY86;
    }

    public final int[] zzYLt() {
        return this.zzY87;
    }

    public final int[] zzYLu() {
        return this.zzY88;
    }

    public final boolean zzYLv() {
        return this.zzY89;
    }

    public final boolean zzYLw() {
        return this.zzY8a;
    }

    public final int zzYLx() {
        return this.zzY8b;
    }

    public final int zzYLy() {
        return this.zzY8c;
    }

    public final int zzYLz() {
        return this.zzY8d;
    }

    public final zzZ3C zzYMV() {
        if (this.zzYau == null) {
            this.zzYau = new zzZ3C(zzZoP(), false);
        }
        return this.zzYau;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzY8g);
        zzwB(this.zzY8f);
        zzwB(this.zzY8e);
        zzwB(this.zzY8d);
        zzwB(this.zzZho);
        zzwB(this.zzZhn);
        zzwB(this.zzZhm);
        zzwB(this.zzZhl);
        zzUC(this.zzY8a);
        zzUC(this.zzY89);
        zzwB(this.zzY85);
        zzwB(this.zzY84);
        zzUC(this.zzY83);
        zzwB(this.zzY82);
        zzwB(this.zzY8c);
        zzwB(this.zzY8b);
        zzUC(this.zzY81);
        zzwB(this.zzY80);
        zzwB(this.zzY7Z);
        zzwB(this.zzY7Y);
        zzwB(this.zzY7X);
        zzwB(this.zzvP);
        zzwB(this.zzY7W);
        zzwB(this.zzY7V);
        zzwB(this.zzY7U);
        zzwB(this.zzY7T);
        zzwB(this.zzY7S);
        zzwB(this.zzY7R);
        zzwB(this.zzY7Q);
        zzwB(this.zzY7P);
        zzwB(this.zzY7O);
        zzwB(this.zzY7N);
        zzwB(this.zzY7M);
        zzwB(this.zzY7L);
        zzwB(this.mVerticalAlignment);
        zzwB(this.zzZC9);
        zzwB(this.zzY7K);
        zzwB(this.zzY7J);
        zzUC(this.zzYS);
        zzUC(this.zzY7I);
        zzwB(this.zzY7H);
        zzUC(this.zzY7G);
        zzZp(zzYMV());
        zzj(this.zzY88);
        zzj(this.zzY87);
    }

    public final int zzYPY() {
        return this.zzY7K;
    }

    public final int zzZRf() {
        return this.zzZhl;
    }

    public final int zzZRg() {
        return this.zzZhm;
    }

    public final int zzZRh() {
        return this.zzZhn;
    }

    public final int zzZRi() {
        return this.zzZho;
    }

    public final boolean zzZz() {
        return this.zzYS;
    }

    public final void zzi(int[] iArr) {
        zzYN6();
        this.zzY88 = iArr;
    }

    public final void zzvC(int i) {
        zzYN6();
        this.zzY7H = i;
    }

    public final void zzvD(int i) {
        zzYN6();
        this.zzY7J = i;
    }

    public final void zzvE(int i) {
        zzYN6();
        this.zzY7K = i;
    }

    public final void zzvF(int i) {
        zzYN6();
        this.zzZC9 = i;
    }

    public final void zzvG(int i) {
        zzYN6();
        this.zzY7L = i;
    }

    public final void zzvH(int i) {
        zzYN6();
        this.zzY7M = i;
    }

    public final void zzvI(int i) {
        zzYN6();
        this.zzY7N = i;
    }

    public final void zzvJ(int i) {
        zzYN6();
        this.zzY7O = i;
    }

    public final void zzvK(int i) {
        zzYN6();
        this.zzY7P = i;
    }

    public final void zzvL(int i) {
        zzYN6();
        this.zzY7Q = i;
    }

    public final void zzvM(int i) {
        zzYN6();
        this.zzY7R = i;
    }

    public final void zzvN(int i) {
        zzYN6();
        this.zzY7S = i;
    }

    public final void zzvO(int i) {
        zzYN6();
        this.zzY7U = i;
    }

    public final void zzvP(int i) {
        zzYN6();
        this.zzY82 = i;
    }

    public final void zzvQ(int i) {
        zzYN6();
        this.zzY8b = i;
    }

    public final void zzvR(int i) {
        zzYN6();
        this.zzY8c = i;
    }

    public final void zzvS(int i) {
        zzYN6();
        this.zzZhl = i;
    }

    public final void zzvT(int i) {
        zzYN6();
        this.zzZhm = i;
    }

    public final void zzvU(int i) {
        zzYN6();
        this.zzY8d = i;
    }

    public final void zzvV(int i) {
        zzYN6();
        this.zzY8e = i;
    }

    public final void zzvW(int i) {
        zzYN6();
        this.zzY8f = i;
    }
}
