package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzRT {
    private static final zzZHW zzUR = new zzZHW("hdmx", "VDMX", "cvt ", "loca", "glyf");

    private static byte[] zzY(byte[] bArr, short s, short s2, zzID zzid) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzII zziiZzV = zzII.zzV(new zzY0(zzzor), s & 65535);
            zzZOR zzzor2 = new zzZOR();
            try {
                zzXZ zzxz = new zzXZ(zzzor2);
                zziiZzV.zzV(zzxz);
                int i = 0;
                while (true) {
                    zzIJ[] zzijArr = zziiZzV.zzyb;
                    if (i >= zzijArr.length) {
                        break;
                    }
                    zzijArr[i].zzX(zzxz);
                    i++;
                }
                zzAP zzap = new zzAP(zzzor2);
                int i2 = 0;
                int iZzQ = 0;
                while (true) {
                    zzIJ[] zzijArr2 = zziiZzV.zzyb;
                    if (i2 >= zzijArr2.length) {
                        zzap.flush();
                        byte[] bArrZzWy = zzzor2.zzWy();
                        zzzor2.close();
                        return bArrZzWy;
                    }
                    zzIJ zzij = zzijArr2[i2];
                    int i3 = 0;
                    while (true) {
                        byte[] bArr2 = zzij.zzyf;
                        if (i3 < bArr2.length) {
                            int iZzZ = (bArr2[i3] & 255) - zzRW.zzZ(zziiZzV.zzyb[i2], zzid.zzWl(i3), s2);
                            if ((((Math.abs(iZzZ) + iZzQ) + 9) / 8) + 8 > bArr.length) {
                                byte[] bArrZzZ = zzRW.zzZ(bArr, (short) (65535 - (zziiZzV.zzyd & 65535)));
                                zzzor2.close();
                                return bArrZzZ;
                            }
                            iZzQ += zzap.zzQ((short) iZzZ);
                            i3++;
                        }
                    }
                    i2++;
                }
            } catch (Throwable th) {
                zzzor2.close();
                throw th;
            }
        } finally {
            zzzor.close();
        }
    }

    private static void zzZ(zzXZ zzxz, zzZVL zzzvl) throws Exception {
        zzxz.zzi(zzzvl.zz7B.length);
        zzxz.zzj(zzzvl.zznj());
        zzxz.zzj(zzzvl.zzni());
        zzAP zzap = new zzAP((zzZOR) zzxz.zzq());
        short s = 8;
        for (zzZVK zzzvk : zzzvl.zz7B) {
            zzZ(zzap, zzzvk, zzzvl, 65535 & s);
            s = (short) (s + 1);
        }
        zzap.flush();
    }

    private static byte[] zzr(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            zzZOR zzzor2 = new zzZOR();
            try {
                zzXZ zzxz = new zzXZ(zzzor2);
                short sZzX9 = zzy0.zzX9();
                short sZzX92 = zzy0.zzX9();
                short sZzX93 = zzy0.zzX9();
                int i = sZzX9 & 65535;
                zzxz.zzi(i);
                zzxz.zzi(sZzX92 & 65535);
                int i2 = sZzX93 & 65535;
                zzxz.zzi(i2);
                zzxz.writeBytes(zzy0.zzn(i2 * 4));
                short[] sArr = new short[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    short sZzX94 = zzy0.zzX9();
                    sArr[i3] = sZzX94;
                    zzxz.zzi(sZzX94 & 65535);
                }
                zzZVL[] zzzvlArr = new zzZVL[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    zzy0.zzq().zzH(sArr[i4] & 65535);
                    zzzvlArr[i4] = zzZVL.zzn(zzy0);
                }
                for (int i5 = 0; i5 < i2; i5++) {
                    zzZ(zzxz, zzzvlArr[i5]);
                    if (zzzor2.getPosition() > bArr.length) {
                        byte[] bArrZzZ = zzRW.zzZ(bArr, (short) (65535 - i));
                        zzzor2.close();
                        return bArrZzZ;
                    }
                }
                byte[] bArrZzWy = zzzor2.zzWy();
                zzzor2.close();
                return bArrZzWy;
            } catch (Throwable th) {
                zzzor2.close();
                throw th;
            }
        } finally {
            zzzor.close();
        }
    }

    private static byte[] zzs(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            zzZOR zzzor2 = new zzZOR();
            try {
                zzXZ zzxz = new zzXZ(zzzor2);
                int length = bArr.length / 2;
                zzxz.zzj(length);
                int i = 0;
                short s = 0;
                while (i < length) {
                    short sZzXa = zzy0.zzXa();
                    int i2 = sZzXa - s;
                    boolean z = i2 < 0;
                    int i3 = z ? 0 - i2 : i2;
                    int i4 = i3 / 238;
                    if (i4 > 8 || i2 == -32768) {
                        zzxz.writeByte((byte) -18);
                        zzxz.zzj(i2);
                    } else if (z) {
                        zzxz.writeByte((byte) (i4 + 239));
                        zzxz.writeByte((byte) (i3 - (i4 * 238)));
                    } else {
                        if (i4 > 0) {
                            zzxz.writeByte((byte) (i4 + StyleIdentifier.LIGHT_LIST_ACCENT_6));
                            i3 -= i4 * 238;
                        }
                        zzxz.writeByte((byte) i3);
                    }
                    i++;
                    s = sZzXa;
                }
                byte[] bArrZzWy = zzzor2.zzWy();
                zzzor2.close();
                return bArrZzWy;
            } catch (Throwable th) {
                zzzor2.close();
                throw th;
            }
        } finally {
            zzzor.close();
        }
    }

    public static zzRU zzt(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzZZ0 zzzz0 = new zzZZ0(zzzor);
            if (!zzzz0.zzri()) {
                zzzor.close();
                return null;
            }
            zzzz0.zzXx("head");
            zzK1 zzk1ZzU = zzK1.zzU(zzzz0.zzrh());
            zzzz0.zzXx("maxp");
            zzAJ zzaj = new zzAJ(zzzz0.zzrh());
            zzzz0.zzXx("hhea");
            zzIF zzif = new zzIF(zzzz0.zzrh());
            zzzz0.zzXx("hmtx");
            zzID zzidZzY = zzID.zzY(zzzz0.zzrh(), zzif.zzxI & 65535, 65535 & zzaj.zzs2);
            zzZZ2 zzzz2 = new zzZZ2(zzzz0.zzrg().getVersion());
            zzRU zzru = new zzRU();
            Iterator<zzZYZ> it = zzzz0.zzrf().zzl9().iterator();
            while (it.hasNext()) {
                String str = it.next().zzck;
                int iZzTP = zzUR.zzTP(str);
                if (iZzTP == 0) {
                    zzzz2.zzZ(str, zzY(zzzz0.zzXw(str), zzaj.zzs2, zzk1ZzU.zzBp, zzidZzY));
                } else if (iZzTP == 1) {
                    zzzz2.zzZ(str, zzr(zzzz0.zzXw(str)));
                } else if (iZzTP == 2) {
                    zzzz2.zzZ(str, zzs(zzzz0.zzXw(str)));
                } else if (iZzTP == 3) {
                    zzzz2.zzZ(str, new byte[0]);
                } else if (iZzTP != 4) {
                    zzzz2.zzZ(str, zzzz0.zzXw(str));
                } else {
                    zzru = zzRQ.zzZ(zzzz0, zzk1ZzU.zzHW());
                    zzzz2.zzZ(str, zzru.zzRj());
                }
            }
            zzru.zzw(zzzz2.zzFA());
            zzzor.close();
            return zzru;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static void zzZ(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
