package com.huawei.hms.drive;

import java.io.IOException;
import oOo00OoO.AbstractC34520OooO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.InterfaceC34544OooOoO;

/* JADX INFO: renamed from: com.huawei.hms.drive.cg */
/* JADX INFO: loaded from: classes6.dex */
public final class C17824cg implements InterfaceC17793bc {

    /* JADX INFO: renamed from: a */
    private final boolean f53109a;

    /* JADX INFO: renamed from: com.huawei.hms.drive.cg$a */
    public static final class a extends AbstractC34520OooO {

        /* JADX INFO: renamed from: a */
        long f53110a;

        public a(InterfaceC34544OooOoO interfaceC34544OooOoO) {
            super(interfaceC34544OooOoO);
        }

        @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO
        public void write(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            super.write(c34524OooO0Oo, j);
            this.f53110a += j;
        }
    }

    public C17824cg(boolean z) {
        this.f53109a = z;
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
    @Override // com.huawei.hms.drive.InterfaceC17793bc
    /* JADX INFO: renamed from: a */
    public com.huawei.hms.drive.C17800bj mo76180a(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
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
