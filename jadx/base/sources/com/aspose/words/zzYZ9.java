package com.aspose.words;

import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ9 {
    protected static String zzXZG = "DELETE";
    protected static String zzXZH = "PUT";
    protected static String zzXZI = "GET";
    protected static String zzXZJ = "POST";
    private static zzYZ9 zzXZK;
    private static boolean zzXZL;
    private String zzXZN = null;
    private zzYZ1 zzXZM = null;

    public static String zzId(String str) {
        return str == null ? "" : str;
    }

    public static String zzY(Long l) {
        return l.toString();
    }

    public static zzYZ9 zzZ(zzYZ1 zzyz1, String str) {
        zzYZ9 zzyz9 = new zzYZ9();
        zzyz9.zzXZM = zzyz1;
        if (str != null && str.length() > 0) {
            if ("/".equals(str.substring(str.length() - 1))) {
                str = androidx.core.content.OooO0OO.OooO00o(1, 0, str);
            }
            zzyz9.zzXZN = str;
        }
        zzXZL = false;
        zzXZK = zzyz9;
        return zzyz9;
    }

    private void zzZ(Map<String, String> map, HttpsURLConnection httpsURLConnection, Object obj) {
        if (this.zzXZM != null) {
            map.clear();
            this.zzXZM.zzZ(new StringBuilder((String) obj), map);
            for (String str : map.keySet()) {
                httpsURLConnection.setRequestProperty(str, map.get(str));
            }
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
    public final java.lang.String zzZ(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
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
