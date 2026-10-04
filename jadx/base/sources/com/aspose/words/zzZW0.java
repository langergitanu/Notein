package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW0 {
    private static boolean zzEy(int i) {
        return i >= 0 && i <= 31680;
    }

    private static void zzU(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzZ(zzzow, position);
    }

    private static void zzY(com.aspose.words.internal.zzZOW zzzow, Frameset frameset) throws Exception {
        if (frameset.zzZ5v().isEmpty() && frameset.zzZ5u() == 0 && frameset.zzZ5w() == 1) {
            return;
        }
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzl(0);
        zzzow.zzl(5);
        zzzow.zzl(zzEy(frameset.zzZ5u()) ? frameset.zzZ5u() : 0);
        zzzow.zzl(zzY0E.zzZD(frameset.zzZ5v()));
        int iZzZ5w = frameset.zzZ5w();
        if (iZzZ5w == 0) {
            zzzow.zzl(1);
        } else if (iZzZ5w != 2) {
            zzzow.zzl(0);
        } else {
            zzzow.zzl(2);
        }
        zzZ(zzzow, position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Frameset zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, ListCollection listCollection) throws Exception {
        zzZRG zzzrg = zzzra.zzYGD.zzXz3;
        Frameset frameset = null;
        if (zzzrg.zzYHJ == 0) {
            return null;
        }
        zzzox.zzq().zzH(zzzrg.zzYHK);
        com.aspose.words.internal.zzZQC zzzqc = new com.aspose.words.internal.zzZQC();
        Frameset frameset2 = null;
        while (zzzox.zzq().getPosition() - ((long) zzzrg.zzYHK) < zzzrg.zzYHJ) {
            zzzox.zzXc();
            int iZzXc = zzzox.zzXc();
            switch (iZzXc) {
                case 0:
                    frameset2 = new Frameset();
                    frameset = frameset2;
                    break;
                case 1:
                    if (zzzqc.size() > 0) {
                        frameset2 = new Frameset();
                        ((Frameset) zzzqc.peek()).getChildFramesets().zzY(frameset2);
                    }
                    frameset2.zzAz(zzzox.zzXc());
                    frameset2.zzAy(zzzox.zzXc());
                    frameset2.zzNL(zzzox.zzXc());
                    zzzox.zzXc();
                    frameset2.zzAx(zzzox.zzXc());
                    frameset2.zzAw(zzzox.zzXc());
                    frameset2.zzAv(zzzox.zzXc());
                    int iZzXc2 = zzzox.zzXc();
                    frameset2.zzVy((iZzXc2 & 1) != 0);
                    frameset2.zzVx((iZzXc2 & 2) != 0);
                    zzzox.zzXc();
                    break;
                case 2:
                    if ((zzzox.zzXc() & 1) != 0) {
                        zzzqc.push(frameset2);
                    } else {
                        frameset2 = (Frameset) zzzqc.pop();
                    }
                    break;
                case 3:
                    frameset2.setName(zzZZR.zzZ(zzzox, true, true));
                    break;
                case 4:
                    frameset2.zzLf(zzZZR.zzZ(zzzox, true, true));
                    break;
                case 5:
                    frameset.zzAt(zzzox.zzXc());
                    frameset.zz3(zzY0E.zzhI(zzzox.zzXc()));
                    int iZzXc3 = zzzox.zzXc();
                    Object[] objArr = (iZzXc3 & 1) != 0;
                    Object[] objArr2 = (iZzXc3 & 2) != 0;
                    if (objArr == true) {
                        frameset.zzAu(0);
                    } else if (objArr2 == true) {
                        frameset.zzAu(2);
                    } else {
                        frameset.zzAu(1);
                    }
                    break;
                case 6:
                    int iZzXc4 = zzzox.zzXc();
                    for (int i = 0; i < iZzXc4; i++) {
                        short sZzXa = zzzox.zzXa();
                        int iZzX9 = zzzox.zzX9() & 4095;
                        if (sZzXa < listCollection.zzYP1()) {
                            listCollection.zzxs(sZzXa).zzxh(iZzX9);
                        }
                    }
                    break;
                default:
                    com.aspose.words.internal.zzZKN.format("Invalid Dofrt value {0}.", Integer.valueOf(iZzXc));
                    break;
            }
        }
        return frameset;
    }

    private static void zzY(com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.zzl(0);
        zzzow.zzl(2);
        zzzow.zzl(z ? 1 : 0);
        zzZ(zzzow, position);
    }

    public static void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow, ListCollection listCollection, Frameset frameset) throws Exception {
        if (frameset == null && listCollection.zzYP1() == 0) {
            return;
        }
        zzzra.zzYGD.zzXz3.zzYHK = (int) zzzow.zzq().getPosition();
        if (frameset != null && frameset.zzZ5x()) {
            zzZ(zzzow, frameset, true);
        }
        if (listCollection.zzYP1() > 0) {
            zzZ(zzzow, listCollection);
        }
        zzzra.zzYGD.zzXz3.zzYHJ = (int) (zzzow.zzq().getPosition() - ((long) zzzra.zzYGD.zzXz3.zzYHK));
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, ListCollection listCollection) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.zzl(0);
        zzzow.zzl(6);
        zzzow.zzl(listCollection.zzYP1());
        for (int i = 0; i < listCollection.zzYP1(); i++) {
            zzZ4J zzz4jZzxs = listCollection.zzxs(i);
            zzzow.zzK((short) i);
            int iZzYOO = zzz4jZzxs.zzYOO();
            if (zzz4jZzxs.isListStyleDefinition()) {
                iZzYOO |= 4096;
            }
            zzzow.zzK((short) iZzYOO);
        }
        zzZ(zzzow, position);
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, Frameset frameset, boolean z) throws Exception {
        if (z) {
            zzU(zzzow);
        }
        zzZ(zzzow, frameset);
        zzZ(zzzow, 3, frameset.getName());
        zzZ(zzzow, 4, frameset.getFrameDefaultUrl());
        if (z) {
            zzY(zzzow, frameset);
        }
        if (frameset.zzZ5x()) {
            zzY(zzzow, true);
            Iterator<Frameset> it = frameset.getChildFramesets().iterator();
            while (it.hasNext()) {
                zzZ(zzzow, it.next(), false);
            }
            zzY(zzzow, false);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, long j) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.zzq().zzH(j);
        zzzow.zzl((int) (position - j));
        zzzow.zzq().zzH(position);
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, int i, String str) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            long position = zzzow.zzq().getPosition();
            zzzow.zzl(0);
            zzzow.zzl(i);
            zzZZQ.zzZ(str, Integer.MAX_VALUE, zzzow, true, true);
            zzZ(zzzow, position);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, Frameset frameset) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.zzl(0);
        zzzow.zzl(1);
        zzzow.zzl(frameset.zzZ5D());
        zzzow.zzl(frameset.zzZ5C());
        zzzow.zzl(frameset.zz6y());
        zzzow.zzl(frameset.zzZ5x() ? 1 : 2);
        zzzow.zzl(frameset.zzZ5B());
        zzzow.zzl(frameset.zzZ5A());
        zzzow.zzl(frameset.zzZ5z());
        zzzow.zzl((frameset.isFrameLinkToFile() ? 1 : 0) | (frameset.zzZ5y() ? 2 : 0));
        zzzow.zzl(6);
        zzZ(zzzow, position);
    }
}
