package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJF extends zzZJN {
    private static int zzY(byte[] bArr, byte[] bArr2, int i) throws IOException {
        int length = bArr2.length;
        int length2 = bArr.length;
        int i2 = i;
        int i3 = 0;
        while (i2 < length && i3 < length2) {
            int i4 = i3 + 1;
            try {
                byte b = bArr[i3];
                if (b >= 0 && b <= 127) {
                    i3 = i4;
                    int i5 = 0;
                    while (i5 < b + 1) {
                        int i6 = i2 + 1;
                        int i7 = i3 + 1;
                        try {
                            bArr2[i2] = bArr[i3];
                            i5++;
                            i2 = i6;
                            i3 = i7;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            e = e;
                            i2 = i6;
                            e.printStackTrace();
                            return i2 - i;
                        }
                    }
                } else if (b >= 0 || b < -127) {
                    i3 += 2;
                } else {
                    i3 += 2;
                    byte b2 = bArr[i4];
                    int i8 = 0;
                    while (i8 < (-b) + 1) {
                        int i9 = i2 + 1;
                        try {
                            bArr2[i2] = b2;
                            i8++;
                            i2 = i9;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            e = e2;
                            i2 = i9;
                            e.printStackTrace();
                            return i2 - i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
            }
        }
        return i2 - i;
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
    @Override // com.aspose.words.internal.zzZJN
    public final void zzX(
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
