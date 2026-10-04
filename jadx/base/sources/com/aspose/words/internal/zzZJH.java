package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJH extends zzZJN {
    private int zzZKM;
    private int zzZKN;
    private int zzZKO;
    private int zzZKP;
    private boolean zzZKQ = false;

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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
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

    @Override // com.aspose.words.internal.zzZJN
    public final void zzdt() throws Exception {
        super.zzdt();
        if (this.zzZKQ) {
            this.zzZLI = this.zzZKP;
            this.zzZLH = this.zzZKO;
            this.zzZLG = this.zzZKN;
            this.zzZLF = this.zzZKM;
            this.zzZKQ = false;
        }
    }

    @Override // com.aspose.words.internal.zzZJN
    public final void zzdu() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.zzZLP;
            if (i >= iArr.length) {
                break;
            }
            i2 += iArr[i];
            i++;
        }
        int i3 = this.zzZLD;
        int i4 = this.zzZLI;
        if (!(i3 == i4 && this.zzZLC == this.zzZLH && this.zzZLB == this.zzZLG && this.zzZLA == this.zzZLF) && ((i3 - i4) * i2) % 8 == 0) {
            this.zzZKQ = true;
            this.zzZKP = i4;
            this.zzZKO = this.zzZLH;
            this.zzZKN = this.zzZLG;
            this.zzZKM = this.zzZLF;
            this.zzZLI = i3;
            this.zzZLH = this.zzZLC;
            this.zzZLG = this.zzZLB;
            this.zzZLF = this.zzZLA;
        } else {
            this.zzZKQ = false;
        }
        super.zzdu();
    }
}
