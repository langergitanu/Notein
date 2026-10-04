package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import oO00o00o.InterfaceC32330OooO0O0;
import oO0oOoo0.C34211OooO0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0OO implements InterfaceC32330OooO0O0 {
    public static int OooO00o(int i, int i2, int i3, int i4, int i5) {
        return C34211OooO0Oo.OooOO0O(i + i2 + i3, i4) + i5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 1, list:
          (r0v3 ?? I:android.view.View) from 0x000c: RETURN (r0v3 ?? I:android.view.View)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1123)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static android.view.View OooO0O0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 1, list:
          (r0v3 ?? I:android.view.View) from 0x000c: RETURN (r0v3 ?? I:android.view.View)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1123)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v0 ??
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

    public static void OooO0OO(String str, jkl jklVar, List list) {
        list.addItem(new C7394ca(str, jklVar));
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$4((Throwable) obj);
    }
}
