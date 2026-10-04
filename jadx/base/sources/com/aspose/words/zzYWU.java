package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzYWU {
    protected int zzVF;
    protected int zzXWA;
    private int zzXWg;
    private int zzXWh;
    private int zzXWi;
    private boolean zzXWj;
    private int zzXWk;
    private int zzXWl;
    private int zzXWm;
    private int zzXWn;
    private zzJU zzXWo;
    private zzJU zzXWp;
    protected int zzXWq;
    protected int zzXWr;
    protected int zzXWs;
    protected int zzXWt;
    protected int zzXWu;
    protected int zzXWv;
    protected int[] zzXWw;
    protected int[] zzXWx;
    private int zzXWy;
    private int zzXWz;

    public zzYWU(zzJU zzju, zzJU zzju2) {
        this.zzXWp = zzju;
        this.zzXWo = zzju2;
        int iMin = Math.min(zzju.zzci, zzju2.zzci);
        this.zzXWi = iMin;
        int i = (iMin * 2) + 2;
        this.zzXWg = i;
        this.zzXWx = new int[i];
        this.zzXWw = new int[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r0 <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r4 >= r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r3.zzXWp.zzZiR[r4] = true;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r3.zzXWm <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r6 >= r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r3.zzXWo.zzZiR[r6] = true;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzC(int i, int i2, int i3, int i4) {
        while (true) {
            zzD(i, i2, i3, i4);
            int i5 = this.zzXWn;
            if (i5 > 0 && this.zzXWm > 0) {
                zzYAX zzyaxZzE = zzE(i, i2, i3, i4);
                if (zzyaxZzE != null) {
                    if (zzyaxZzE.getSize() == 0 && ((zzyaxZzE.getXStart() == i && zzyaxZzE.getYStart() == i3) || (zzyaxZzE.getXEnd() == i2 && zzyaxZzE.getYEnd() == i4))) {
                        break;
                    }
                    zzC(i, zzyaxZzE.getXStart(), i3, zzyaxZzE.getYStart());
                    i = zzyaxZzE.getXEnd();
                    i3 = zzyaxZzE.getYEnd();
                } else {
                    return;
                }
            } else {
                break;
            }
        }
        int i6 = this.zzXWn;
        int i7 = this.zzXWm;
        if (i6 > i7) {
            if (this.zzXWv > 0) {
                this.zzXWp.zzZiR[this.zzXWl - 1] = true;
                return;
            } else {
                this.zzXWp.zzZiR[this.zzXWz] = true;
                return;
            }
        }
        if (i7 > i6) {
            if (this.zzXWr > 0) {
                this.zzXWo.zzZiR[this.zzXWk - 1] = true;
            } else {
                this.zzXWo.zzZiR[this.zzXWy] = true;
            }
        }
    }

    private void zzD(int i, int i2, int i3, int i4) {
        this.zzXWz = i;
        this.zzXWy = i3;
        this.zzXWl = i2;
        this.zzXWk = i4;
        int i5 = i2 - i;
        this.zzXWn = i5;
        int i6 = i4 - i3;
        this.zzXWm = i6;
        this.zzVF = i5 + i6;
        int i7 = i5 - i6;
        this.zzXWA = i7;
        this.zzXWj = i7 % 2 != 0;
        this.zzXWi = Math.min(i5, i6);
        this.zzXWh = Math.max(this.zzXWp.zzci, this.zzXWo.zzci);
    }

    private static ArrayList<zzJS> zzU(zzJU zzju, zzJU zzju2) {
        ArrayList<zzJS> arrayList = new ArrayList<>();
        int i = 0;
        int iZzZ = zzZ(zzju, 0);
        int i2 = 0;
        while (iZzZ != -1) {
            int i3 = iZzZ - i;
            int iZzZ2 = zzZ(zzju2, i2);
            int i4 = iZzZ2 - i2;
            if (i3 > 0 || i4 > 0) {
                arrayList.add(new zzJS(i, i2, i3, i4));
            }
            int iZzZ3 = zzZ(zzju, iZzZ, zzju2, iZzZ2);
            int i5 = iZzZ + iZzZ3;
            iZzZ = zzZ(zzju, i5);
            i2 = iZzZ3 + iZzZ2;
            i = i5;
        }
        int iZzY = zzY(zzju, i);
        int iZzY2 = zzY(zzju2, i2);
        if (iZzY <= 0 && iZzY2 <= 0) {
            return arrayList;
        }
        arrayList.add(new zzJS(i, i2, iZzY, iZzY2));
        return arrayList;
    }

    public static String zzV(zzJU zzju, zzJU zzju2) {
        return zzZ(zzU(zzju, zzju2), zzju.zzZiS, zzju2.zzZiS);
    }

    private static String zzW(int[] iArr, int i, int i2) {
        if (i < 0 || i + i2 > iArr.length) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(zztH(iArr[i + i3]));
        }
        return sb.toString();
    }

    private void zzWA(int i, int i2) {
        int i3;
        if (i == (-i2)) {
            this.zzXWt = this.zzXWw[zztE(i + 1)];
        } else if (i == i2) {
            this.zzXWt = this.zzXWw[zztE(i - 1)] + 1;
        } else {
            int i4 = this.zzXWw[zztE(i + 1)];
            int i5 = this.zzXWw[zztE(i - 1)];
            if (i5 < i4) {
                this.zzXWt = i4;
            } else {
                this.zzXWt = i5 + 1;
            }
        }
        int i6 = this.zzXWt;
        int i7 = i6 - i;
        this.zzXWr = i7;
        this.zzXWs = i6;
        this.zzXWq = i7;
        int i8 = (this.zzXWz + this.zzXWn) - 1;
        int i9 = (this.zzXWy + this.zzXWm) - 1;
        while (true) {
            int i10 = this.zzXWs;
            if (i10 >= this.zzXWn || (i3 = this.zzXWq) >= this.zzXWm || this.zzXWp.zzZiS[i8 - i10] != this.zzXWo.zzZiS[i9 - i3]) {
                break;
            }
            this.zzXWs = i10 + 1;
            this.zzXWq = i3 + 1;
        }
        this.zzXWw[zztE(i)] = this.zzXWs;
    }

    private void zzWB(int i, int i2) {
        int i3;
        if (i == (-i2)) {
            this.zzXWv = this.zzXWx[zztE(i + 1)];
        } else if (i == i2) {
            this.zzXWv = this.zzXWx[zztE(i - 1)] + 1;
        } else {
            int i4 = this.zzXWx[zztE(i + 1)];
            int i5 = this.zzXWx[zztE(i - 1)];
            if (i5 < i4) {
                this.zzXWv = i4;
            } else {
                this.zzXWv = i5 + 1;
            }
        }
        int i6 = this.zzXWv;
        int i7 = i6 - i;
        this.zzXWr = i7;
        this.zzXWu = i6;
        this.zzXWq = i7;
        while (true) {
            int i8 = this.zzXWu;
            if (i8 >= this.zzXWn || (i3 = this.zzXWq) >= this.zzXWm || this.zzXWp.zzZiS[this.zzXWz + i8] != this.zzXWo.zzZiS[this.zzXWy + i3]) {
                break;
            }
            this.zzXWu = i8 + 1;
            this.zzXWq = i3 + 1;
        }
        this.zzXWx[zztE(i)] = this.zzXWu;
    }

    private static int zzY(zzJU zzju, int i) {
        int i2 = i;
        while (i2 < zzju.zzci && zzju.zzZiR[i2]) {
            i2++;
        }
        return i2 - i;
    }

    public static String zzZ(zzJU zzju) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zzju.zzci; i++) {
            sb.append(zztH(zzju.zzZiS[i]));
        }
        return sb.toString();
    }

    private static char zztH(int i) {
        int i2;
        if (i == 57613) {
            return (char) 182;
        }
        if (i == 182) {
            return (char) 57613;
        }
        if (i == 57614) {
            return (char) 167;
        }
        if (i == 167) {
            return (char) 57614;
        }
        if (i == 57359) {
            return (char) 169;
        }
        if (i == 169) {
            return (char) 57359;
        }
        if (i == 57366) {
            return '#';
        }
        if (i == 35) {
            return (char) 57366;
        }
        if (i == 57348) {
            return (char) 164;
        }
        if (i == 164) {
            return (char) 57348;
        }
        if (i == 57347) {
            return (char) 163;
        }
        if (i == 163) {
            return (char) 57347;
        }
        if (i == 45) {
            return (char) 8722;
        }
        if (i == 43) {
            return (char) 8314;
        }
        if (i == 61) {
            return (char) 8316;
        }
        if (i < 10) {
            i2 = i + 9461;
        } else {
            if (i >= 32) {
                return (char) i;
            }
            i2 = i + 9388;
        }
        return (char) i2;
    }

    public zzYAX zzE(int i, int i2, int i3, int i4) {
        int iZztE = zztE(1);
        this.zzXWx[iZztE] = 0;
        this.zzXWw[iZztE] = 0;
        int i5 = this.zzVF;
        int i6 = (i5 % 2) + (i5 / 2);
        for (int i7 = 0; i7 <= i6; i7++) {
            if (zztG(i7)) {
                return new zzYAX(this.zzXWv + i, this.zzXWr + i3, i + this.zzXWu, i3 + this.zzXWq);
            }
            if (zztF(i7)) {
                return new zzYAX(i2 - this.zzXWs, i4 - this.zzXWq, i2 - this.zzXWt, i4 - this.zzXWr);
            }
        }
        return null;
    }

    public final boolean zzWC(int i, int i2) {
        int i3 = i + this.zzXWz;
        int i4 = i2 + this.zzXWy;
        int[] iArr = this.zzXWp.zzZiS;
        if (i3 >= iArr.length) {
            return false;
        }
        int[] iArr2 = this.zzXWo.zzZiS;
        return i4 < iArr2.length && iArr[i3] == iArr2[i4];
    }

    public final void zzYBr() {
        zzC(0, this.zzXWp.zzci, 0, this.zzXWo.zzci);
    }

    public final int zztE(int i) {
        return (i + this.zzXWh) % this.zzXWg;
    }

    public final boolean zztF(int i) {
        int iMax = i - (Math.max(0, i - this.zzXWm) * 2);
        int iMax2 = i - (Math.max(0, i - this.zzXWn) * 2);
        for (int i2 = -iMax; i2 <= iMax2; i2 += 2) {
            zzWA(i2, i);
            int i3 = -(i2 - this.zzXWA);
            if (!this.zzXWj && (-i) <= i3 && i3 <= i) {
                int i4 = this.zzXWx[zztE(i3)];
                this.zzXWu = i4;
                if (this.zzXWs + i4 >= this.zzXWn) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zztG(int i) {
        int iMax = i - (Math.max(0, i - this.zzXWm) * 2);
        int iMax2 = i - (Math.max(0, i - this.zzXWn) * 2);
        for (int i2 = -iMax; i2 <= iMax2; i2 += 2) {
            zzWB(i2, i);
            int i3 = -(i2 - this.zzXWA);
            int i4 = i - 1;
            if (this.zzXWj && (-i4) <= i3 && i3 <= i4) {
                int i5 = this.zzXWw[zztE(i3)];
                this.zzXWs = i5;
                if (this.zzXWu + i5 >= this.zzXWn) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String zzZ(ArrayList<zzJS> arrayList, int[] iArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (zzJS zzjs : arrayList) {
            String strZzW = zzW(iArr, i, zzjs.zzZiQ - i);
            if (strZzW.length() > 0) {
                zzZ(strZzW, '=', sb);
            }
            int i2 = zzjs.zzZiQ;
            int i3 = zzjs.zzZiO;
            int i4 = i2 + i3;
            if (i3 > 0) {
                String strZzW2 = zzW(iArr, i2, i3);
                if (strZzW2.length() > 0) {
                    zzZ(strZzW2, '-', sb);
                }
            }
            int i5 = zzjs.zzZiN;
            if (i5 > 0) {
                String strZzW3 = zzW(iArr2, zzjs.zzZiP, i5);
                if (strZzW3.length() > 0) {
                    zzZ(strZzW3, '+', sb);
                }
            }
            i = i4;
        }
        if (i < iArr.length) {
            String strZzW4 = zzW(iArr, i, iArr.length - i);
            if (strZzW4.length() > 0) {
                zzZ(strZzW4, '=', sb);
            }
        }
        return sb.toString();
    }

    private static int zzZ(zzJU zzju, int i) {
        int i2;
        while (true) {
            i2 = zzju.zzci;
            if (i >= i2 || !zzju.zzZiR[i]) {
                break;
            }
            i++;
        }
        if (i != i2) {
            return i;
        }
        return -1;
    }

    private static int zzZ(zzJU zzju, int i, zzJU zzju2, int i2) {
        int i3 = i;
        while (i3 < zzju.zzci && !zzju.zzZiR[i3] && i2 < zzju2.zzci && !zzju2.zzZiR[i2]) {
            i3++;
            i2++;
        }
        return i3 - i;
    }

    private static void zzZ(String str, char c, StringBuilder sb) {
        sb.append(c);
        com.aspose.words.internal.zzZNH.zzU(sb, str);
    }
}
