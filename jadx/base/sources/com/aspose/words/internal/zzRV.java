package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzRV {
    private static final zzZHW zzUR = new zzZHW("hdmx", "VDMX", "cvt ", "loca", "glyf", "head");

    public static byte[] zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzZZ0 zzzz0 = new zzZZ0(zzzor);
            zzzz0.zzLh();
            zzzz0.zzXx("head");
            zzK1 zzk1ZzU = zzK1.zzU(zzzz0.zzrh());
            zzzz0.zzXx("maxp");
            zzAJ zzaj = new zzAJ(zzzz0.zzrh());
            zzzz0.zzXx("hhea");
            zzIF zzif = new zzIF(zzzz0.zzrh());
            zzzz0.zzXx("hmtx");
            zzID zzidZzY = zzID.zzY(zzzz0.zzrh(), zzif.zzxI & 65535, 65535 & zzaj.zzs2);
            zzZZ2 zzzz2 = new zzZZ2(zzzz0.zzrg().getVersion());
            for (zzZYZ zzzyz : zzzz0.zzrf().zzl9()) {
                int iZzTP = zzUR.zzTP(zzzyz.zzck);
                if (iZzTP == 0) {
                    String str = zzzyz.zzck;
                    zzzz2.zzZ(str, zzZ(zzzz0.zzXw(str), zzaj.zzs2, zzk1ZzU.zzBp, zzidZzY));
                } else if (iZzTP == 1) {
                    String str2 = zzzyz.zzck;
                    zzzz2.zzZ(str2, zzx(zzzz0.zzXw(str2)));
                } else if (iZzTP == 2) {
                    String str3 = zzzyz.zzck;
                    zzzz2.zzZ(str3, zzy(zzzz0.zzXw(str3)));
                } else if (iZzTP != 3) {
                    if (iZzTP == 4) {
                        zzRS.zzZ(zzzz2, zzzz0.zzXw(zzzyz.zzck), bArr2, bArr3, zzk1ZzU);
                    } else if (iZzTP != 5) {
                        String str4 = zzzyz.zzck;
                        zzzz2.zzZ(str4, zzzz0.zzXw(str4));
                    }
                }
            }
            zzzz2.zzZ("head", zzk1ZzU.toByteArray());
            byte[] bArrZzFA = zzzz2.zzFA();
            zzzor.close();
            return bArrZzFA;
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
    private static byte[] zzx(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
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

    private static byte[] zzy(byte[] bArr) throws Exception {
        int i;
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            int iZzX9 = zzy0.zzX9() & 65535;
            zzZOR zzzor2 = new zzZOR(iZzX9 * 2);
            try {
                zzXZ zzxz = new zzXZ(zzzor2);
                short s = 0;
                for (int i2 = 0; i2 < iZzX9; i2++) {
                    int iZzXa = (short) (zzy0.readByte() & 255);
                    if (iZzXa < 238) {
                        i = s + iZzXa;
                    } else if (iZzXa < 248 || iZzXa > 255) {
                        iZzXa = (iZzXa < 239 || iZzXa > 247) ? zzy0.zzXa() : -androidx.core.graphics.OooO0OO.OooO00o(iZzXa, 239, 238, (short) (255 & zzy0.readByte()));
                        i = s + iZzXa;
                    } else {
                        i = s + ((iZzXa - 247) * 238) + ((short) (255 & zzy0.readByte()));
                    }
                    if (i < -32768) {
                        i += 65536;
                    } else if (i > 32767) {
                        i -= 65536;
                    }
                    zzxz.zzj(i);
                    s = (short) i;
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

    private static byte[] zzZ(byte[] bArr, short s, short s2, zzID zzid) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            short sZzX9 = zzy0.zzX9();
            int i = sZzX9 & 65535;
            if (i == 65535) {
                return zzRW.zzZ(bArr, (short) (65535 - i));
            }
            zzII zzii = new zzII();
            zzii.zzyd = sZzX9;
            int i2 = s & 65535;
            zzii.zzye = i2;
            short sZzX92 = zzy0.zzX9();
            zzii.zzyc = zzy0.zzXc();
            int i3 = sZzX92 & 65535;
            zzii.zzyb = new zzIJ[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                zzRN zzrnZzV = zzRN.zzV(zzy0);
                zzIJ zzij = new zzIJ();
                zzij.zzN7 = zzrnZzV.zzN7;
                zzij.zzN8 = zzrnZzV.zzN8;
                zzij.zzyf = new byte[i2];
                zzii.zzyb[i4] = zzij;
            }
            zzAQ zzaq = new zzAQ(zzzor);
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i6 = 0; i6 < i2; i6++) {
                    zzii.zzyb[i5].zzyf[i6] = (byte) (zzRW.zzZ(zzii.zzyb[i5], zzid.zzWl(i6), s2) + zzaq.zzAM());
                }
            }
            zzii.zzGr();
            return zzii.toByteArray();
        } finally {
            zzzor.close();
        }
    }
}
