package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ7S extends zzTI {
    private ArrayList<String> zzYhV = new ArrayList<>();

    private static ArrayList<zzJX> zzJv(String str) {
        ArrayList<zzJX> arrayList = new ArrayList<>();
        int length = 0;
        while (length < str.length()) {
            zzJX zzjx = new zzJX();
            if (!zzjx.zzf(str, length)) {
                if (!zzjx.zzZSW()) {
                    break;
                }
                length = zzjx.getStart() + 1;
            } else {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzjx);
                length += zzjx.getLength();
            }
        }
        return arrayList;
    }

    private static boolean zzW(zzYI zzyi) {
        if (zzyi == null) {
            return false;
        }
        return zzyi.zzkz() == 10 || zzyi.zzz((byte) 10) != null;
    }

    private boolean zzX(zzJZ zzjz, zzJZ zzjz2) {
        if (zzjz == null || zzjz2 == null) {
            return false;
        }
        if (zzjz2.getType() != 8) {
            return true;
        }
        int type = zzjz.getType();
        return type != 7 ? type != 11 ? type == 12 : zzZ((zzZ8G) com.aspose.words.internal.zzZKW.zzZ(zzjz, zzZ8G.class), (zzZ4Q) com.aspose.words.internal.zzZKW.zzZ(zzjz2, zzZ4Q.class)) : zzZ((zzZ4O) com.aspose.words.internal.zzZKW.zzZ(zzjz, zzZ4O.class), (zzZ4Q) com.aspose.words.internal.zzZKW.zzZ(zzjz2, zzZ4Q.class));
    }

    private void zzY(zzZ4N zzz4n) {
        zzz4n.reset();
        while (zzz4n.moveNext()) {
            zzJZ zzjzZzZT9 = ((zzJZ) zzz4n.zzYPi()).zzZT9();
            if (zzjzZzZT9 != null) {
                zzz4n.zzX(zzjzZzZT9);
                zzJZ zzjzZzba = zzjzZzZT9.zzba();
                if (zzX(zzjzZzba, zzjzZzZT9)) {
                    zzZ(zzjzZzba, zzjzZzZT9, zzz4n);
                    if (zzjzZzba.getType() == 9 || zzjzZzba.getType() == 7) {
                        zzZ(zzjzZzba, zzz4n);
                    }
                }
            }
        }
    }

    private zzZ26 zzYUQ() {
        return (zzZ26) com.aspose.words.internal.zzZKW.zzZ(zzz((byte) 0), zzZ26.class);
    }

    private static zzZ4N zzZy(ArrayList<zzJX> arrayList) {
        zzZ4N zzz4n = new zzZ4N();
        Iterator<zzJX> it = arrayList.iterator();
        while (it.hasNext()) {
            for (zzJZ zzjz : it.next().zzZST()) {
                if (zzjz.isValid()) {
                    zzz4n.zzT(zzjz);
                    zzz4n.zzW(zzjz);
                }
            }
        }
        return zzz4n;
    }

    private static String zzp(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= str.length()) {
                i = i3;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == 11) {
                sb.append(cCharAt);
            } else {
                if (cCharAt == '\f') {
                    break;
                }
                if (com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                    if (i3 == -1) {
                        i3 = i2;
                    }
                    i2++;
                } else {
                    if ((i3 == 0 && !z) || (i3 > 0 && str.charAt(i3 - 1) != 11)) {
                        com.aspose.words.internal.zzZNH.zzU(sb, C22241OooO0Oo.OooO00o(i2, i3, i3, i3, str));
                    }
                    sb.append(cCharAt);
                }
            }
            i3 = -1;
            i2++;
        }
        if ((i == 0 && !z) || (i > 0 && str.charAt(i - 1) != 11)) {
            com.aspose.words.internal.zzZNH.zzU(sb, str.substring(i, (str.length() - i) + i));
        }
        return sb.toString();
    }

    public String zz0O() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzYhV.size(); i++) {
            if (this.zzYhV.get(i).length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, this.zzYhV.get(i));
                if (i < this.zzYhV.size() - 1) {
                    sb.append(ControlChar.LINE_BREAK_CHAR);
                }
            }
        }
        sb.append('\f');
        return sb.toString();
    }

    public void zz0P() {
        String strZz0O = zz0O();
        zzZ4N zzz4nZzZy = zzZy(zzJv(strZz0O));
        zzY(zzz4nZzZy);
        zzZ(zzz4nZzZy, strZz0O);
        this.zzYhV.clear();
        zz9L();
    }

    public final ArrayList<String> zzYUR() {
        return this.zzYhV;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public boolean zzZ(zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 13) {
            zzY(zzyi);
            return true;
        }
        if (bZzkz != 14 && bZzkz != 24) {
            return super.zzZ(zzyi);
        }
        zz9O();
        com.aspose.words.internal.zzZQG.zzZ(this.zzYhV, zzyi.zz9A());
        return true;
    }

    public final void zzj(String str, boolean z) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzYI zzyiZzZY3 = zzZY3();
            byte bZzkz = zzyiZzZY3 == null ? zzkz() : zzyiZzZY3.zzkz();
            if (bZzkz != 24 && bZzkz != 25 && bZzkz != 4) {
                str = zzp(str, z);
            }
            if (zzyiZzZY3 != null && zzyiZzZY3.zzkz() == 9) {
                ((zzZ4R) zzyiZzZY3).zzCR(str);
            }
            if (zzyiZzZY3 != null && zzyiZzZY3.zzkz() == 8) {
                ((zzZ8H) zzyiZzZY3).zzCR(str);
            }
            if (bZzkz != 24 && !zzW(zzyiZzZY3)) {
                str = zzZ1N.zzIt(str);
            }
            if (str.length() > 0) {
                zzZ7V zzz7v = new zzZ7V(str);
                if (zzZ(zzz7v)) {
                    return;
                }
                zzY(zzz7v);
            }
        }
    }

    private static void zzZ(zzJZ zzjz, zzZ4N zzz4n) {
        zzJZ zzjzZzba;
        zzJZ zzjzZzZT7 = zzjz.zzZT7();
        if (zzjzZzZT7 == null) {
            return;
        }
        if (zzjzZzZT7.isLinked()) {
            if (zzjzZzZT7.zzZSY().getType() == 12) {
                zzjzZzba = ((zzZMX) zzjzZzZT7.zzZSY()).zzZ6T();
            } else {
                zzjzZzba = zzjzZzZT7.zzZSY();
            }
        } else {
            zzjzZzba = zzjzZzZT7.zzba();
        }
        if (zzjzZzba == null) {
            return;
        }
        zzZ(zzjzZzba, zzjzZzZT7, zzz4n);
        zzJZ zzjz2 = (zzJZ) zzjzZzba.zzZT5();
        if (zzjzZzba.getType() == 11) {
            zzjz2 = (zzJZ) zzjz2.zzZT5();
        }
        while (zzjz2 != zzjzZzZT7) {
            if (!zzjz2.zzZT2()) {
                zzJZ zzjzZzZT9 = zzjz2.zzZT9();
                if (zzjzZzZT9 == null || !zzjzZzZT9.zzX(zzjzZzZT7)) {
                    return;
                }
                zzJZ zzjzZzba2 = zzjzZzZT9.zzba();
                if (zzjzZzba2 != null && zzjzZzba.zzX(zzjzZzba2)) {
                    zzZ(zzjzZzba2, zzjzZzZT9, zzz4n);
                    if (zzjzZzba2.getType() == 9) {
                        zzZ((zzZ4U) zzjzZzba2, zzz4n);
                    }
                    zzjz2 = (zzJZ) zzjzZzZT9.zzZT5();
                } else {
                    zzjz2 = (zzJZ) zzjz2.zzZT5();
                }
            }
        }
    }

    private static void zzY(zzJZ zzjz, zzJZ zzjz2) {
        zzJZ zzjz3 = zzjz.zzX(zzjz2) ? zzjz : zzjz2;
        if (!zzjz.zzX(zzjz2)) {
            zzjz2 = zzjz;
        }
        for (zzJZ zzjz4 = (zzJZ) zzjz3.zzZT5(); zzjz4 != zzjz2; zzjz4 = (zzJZ) zzjz4.zzZT5()) {
            if (zzjz4.isLinked() && zzjz4.getPriority() < zzjz.zzb7()) {
                zzjz4.zzZT8();
            }
        }
    }

    private static void zzZ(zzJZ zzjz, zzJZ zzjz2, zzZ4N zzz4n) {
        zzJZ zzjzZzY = zzjz2.zzY(zzjz);
        if (zzjzZzY != null) {
            if (zzjzZzY.getEnd() < zzjz.getStart()) {
                zzz4n.zzW(zzjz);
                zzz4n.zzU(zzjzZzY);
            } else {
                zzz4n.zzW(zzjz2);
                zzz4n.zzT(zzjzZzY);
            }
            zzz4n.zzW(zzjz2);
        }
        zzY(zzjz, zzjz2);
        zzjz.zzZ(zzz4n);
    }

    private boolean zzZ(zzZ4O zzz4o, zzZ4Q zzz4q) {
        String strZzZ;
        if (zzz4o == null || zzz4q == null) {
            return false;
        }
        if (zzz4q.zzYPm() || zzz4q.zzYPl() || zzz4q.zzYPk()) {
            return true;
        }
        if (zzz4o.getStart() < zzz4q.getEnd()) {
            strZzZ = com.aspose.words.internal.zzZKN.zzZ(zzz4o.getText().substring(zzz4o.getStart() + 1, ((zzz4q.getEnd() - zzz4o.getStart()) - 1) + zzz4o.getStart() + 1), com.aspose.words.internal.zzZP1.zzj8());
        } else {
            strZzZ = "";
        }
        return zzYUQ().zzYIM().containsKey(strZzZ);
    }

    private boolean zzZ(zzZ8G zzz8g, zzZ4Q zzz4q) {
        String strZzZ;
        if (zzz8g == null || zzz4q == null) {
            return false;
        }
        if (zzz4q.zzYPm()) {
            return true;
        }
        if (zzz8g.getStart() < zzz4q.getEnd()) {
            strZzZ = com.aspose.words.internal.zzZKN.zzZ(zzz8g.getText().substring(zzz8g.getStart() + 2, ((zzz4q.getEnd() - zzz8g.getStart()) - 2) + zzz8g.getStart() + 2), com.aspose.words.internal.zzZP1.zzj8());
        } else {
            strZzZ = "";
        }
        return zzYUQ().zzYIM().containsKey(strZzZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzZ(zzZ4N zzz4n, String str) {
        zzz4n.reset();
        com.aspose.words.internal.zzZQC zzzqc = new com.aspose.words.internal.zzZQC();
        com.aspose.words.internal.zzZQC<zzYJV> zzzqc2 = new com.aspose.words.internal.zzZQC<>();
        zzJZ zzjzZzZ6T = null;
        while (true) {
            if (!zzz4n.moveNext()) {
                break;
            }
            zzJZ zzjz = (zzJZ) zzz4n.zzYPi();
            if (zzjz.isLinked()) {
                if (zzjzZzZ6T != null && zzjzZzZ6T.getType() == 11) {
                    zzjzZzZ6T = ((zzZ8G) zzjzZzZ6T).zzZ6T();
                }
                zzj(zzZ1N.zzIr(zzZ(str, zzjzZzZ6T, zzjz.getType() == 12 ? ((zzZMX) zzjz).zzZ6T() : zzjz)).toString(), zzjzZzZ6T == null);
                if (zzjz.zzZT0()) {
                    zzYI zzyiZzb8 = zzjz.zzb8();
                    zzzqc.push(zzyiZzb8);
                    if (!zzZ(zzyiZzb8)) {
                        zzY(zzyiZzb8);
                    }
                } else {
                    zzzqc.size();
                    zzYI zzyi = (zzYI) zzzqc.pop();
                    zzyi.close();
                    if ((zzyi.zzkz() == 9 || zzyi.zzkz() == 8) && ((zzYJV) zzyi).zzZ(zzYUQ().zzYIM(), zzzqc2)) {
                        zzyi.remove();
                    }
                    if (zzyi.zzkz() == 11) {
                        ((zzZMV) zzyi).zzZ(zzYUQ().zzYIL());
                    }
                }
                zzjzZzZ6T = zzjz;
            }
        }
        while (zzzqc2.size() > 0) {
            zzYJV zzyjvPop = zzzqc2.pop();
            if (!zzyjvPop.zzYPm()) {
                zzyjvPop.zzYm5();
            }
        }
        zzj(zzZ1N.zzIr(zzZ(str, zzjzZzZ6T, (zzJZ) null)).toString(), zzjzZzZ6T == null);
    }

    private static String zzZ(String str, zzJZ zzjz, zzJZ zzjz2) {
        int end = zzjz == null ? 0 : zzjz.getEnd() + 1;
        int length = (zzjz2 == null ? str.length() : zzjz2.getStart()) - end;
        if (length == 0) {
            return "";
        }
        return length == str.length() ? str : str.substring(end, length + end);
    }
}
