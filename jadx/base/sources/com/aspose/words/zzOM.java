package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzOM {
    private int zzZqP;

    public zzOM(int i) {
        this.zzZqP = i;
    }

    public final void zzZ(zzPR zzpr, zzZBM zzzbm) {
        zzPT zzptZzSx;
        zzPT zzptZzSx2;
        zzZ(zzpr, "-aw-margin-start", "margin");
        zzZ(zzpr, "-aw-padding-start", "padding");
        if ("table".equals(zzzbm.zzZTQ())) {
            zzPT zzptZzSx3 = zzpr.zzSx("text-align");
            if (zzptZzSx3 != null && (zzptZzSx3.zzZWj().zzP(zzL4.zzZmy) || zzptZzSx3.zzZWj().zzP(zzL4.zzZmw) || zzptZzSx3.zzZWj().zzP(zzL4.zzZmx))) {
                zzpr.remove(zzptZzSx3.zzZWo());
                zzpr.zzY(new zzM3("text-align", zzL4.zzZmA, (byte) 0));
                zzpr.zzSv("text-align");
            }
            zzPT zzptZzSx4 = zzpr.zzSx("border-collapse");
            if (zzptZzSx4 != null && zzptZzSx4.zzZWj().zzP(zzL4.zzZm1)) {
                zzpr.zzV(new zzM3("border-spacing", zzL4.zzZnl, (byte) 0));
                zzpr.zzSv("border-spacing");
            }
        }
        if (TranslateLanguage.THAI.equals(zzzbm.zzZTQ()) && ((zzptZzSx2 = zzpr.zzSx("text-align")) == null || zzptZzSx2.zzZWj().zzP(zzL4.zzZmA))) {
            zzpr.zzV(new zzM3("text-align", zzL4.zzZmF, (byte) 0));
            zzpr.zzSv("text-align");
        }
        if ((this.zzZqP & 1) == 0 && zzpr.zzSx("font-size") == null && (zzptZzSx = zzpr.zzSx("font-family")) != null && zzptZzSx.zzZWj().zzP(zzL4.zzZkU)) {
            zzpr.zzY(new zzM3("font-size", new zzOI(10.0d, 4), (byte) 0));
            zzpr.zzSv("font-size");
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
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
