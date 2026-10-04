package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz8W {
    private zz8Z zzZ7J;

    public zz8W(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    private zzBO zzPw(String str) {
        zzBO zzboZzQz = this.zzZ7J.zzZCO().zzQz(str);
        if (zzboZzQz != null) {
            return zzboZzQz;
        }
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(0);
        zz2Q zz2q2 = new zz2Q();
        zz2q2.setValue(1);
        zzBO zzbo = new zzBO();
        zzbo.zzZ(new zzAQ());
        zzbo.zzZFs().zzJp(1);
        zzbo.zzZFs().zzZ(new zzBW[]{zz2q});
        zzbo.zzY(new zzAQ());
        zzbo.zzZFr().zzJp(1);
        zzbo.zzZFr().zzZ(new zzBW[]{zz2q});
        zzbo.zzV(new zzAQ());
        zzbo.zzZFo().zzJp(1);
        zzbo.zzZFo().zzZ(new zzBW[]{zz2q2});
        return zzbo;
    }

    private static boolean zzT(zzAQ zzaq) {
        return zzaq == null || zzaq.isEmpty();
    }

    private static double zzW(int i, double d) {
        if (i == 1) {
            return zzHK.zzYR(d).getValue();
        }
        if (i != 2) {
            return 0.0d;
        }
        return d * 100000.0d;
    }

    private static String zzX(int i, double d) {
        return com.aspose.words.internal.zzZKN.format("val {0}", com.aspose.words.internal.zzJB.zzZZ(zzW(i, d)));
    }

    public static zz7H zzY(zz8X zz8x) {
        zz7H zz7hZzOA;
        if (!zz8x.zzZCz() && (zz7hZzOA = zz7G.zzOA(zz8x.getType())) != null) {
            zzZ(zz8x, zz7hZzOA);
            return zz7hZzOA;
        }
        return new zz7H();
    }

    public final zz2O zzZ(zz8X zz8x, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (zzzq4.isEmpty()) {
            return null;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzR = com.aspose.words.internal.zzSA.zzR(zzzq4);
        zz2O zz2o = new zz2O(0);
        zz2o.zzO(this.zzZ7J.zzZCJ());
        if (zz8x == null) {
            return zz2o;
        }
        zz2o.zzZ(zzZ(zzzq4ZzR, zz8x.zzZCC()));
        zz2o.zzZ(zzY(zz8x));
        zz2o.setFill(zzX(zz8x));
        return zz2o;
    }

    public static zz7X zzX(zz8X zz8x) {
        if (zz8x.zzZCA() == null) {
            return null;
        }
        zzH0 zzh0 = new zzH0();
        zzh0.zzY(new zzH1());
        zzh0.zzZQ1().zzYt(zz8x.zzZCA());
        return zzh0;
    }

    private static void zzZ(zz8X zz8x, zz7H zz7h) {
        if (zz8x.zzZCw() == null || zz8x.zzZCw().length == 0) {
            return;
        }
        HashMap map = new HashMap();
        for (zz2M zz2m : zz8x.zzZCw()) {
            String strZzZ = zzZ(zz7h, zz2m.zzZvl());
            int iZzZ = zzZ(zz7h, strZzZ);
            if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
                if (iZzZ == 0) {
                    iZzZ = 2;
                }
                map.put(strZzZ, zzX(iZzZ, zz2m.getValue()));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            zz7h.zzZAP().zzP((String) entry.getKey(), (String) entry.getValue(), false);
        }
    }

    private static int zzZ(zz7H zz7h, String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0;
        }
        Iterator<zzJM> it = zz7h.zzZAM().iterator();
        while (it.hasNext()) {
            int iZzRM = it.next().zzRM(str);
            if (iZzRM != 0) {
                return iZzRM;
            }
        }
        return 0;
    }

    private static String zzZ(zz7H zz7h, int i) {
        if (i > 0 && i <= zz7h.zzZAP().zzZA2().size()) {
            return zz7h.zzZAP().zzZA2().get(i - 1).getName();
        }
        return "";
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
    public static com.aspose.words.zz07 zzZ(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
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

    public final void zzZ(zz2O zz2o, String str, boolean z) {
        zz18 zz18VarZzPq = this.zzZ7J.zzZCN().zzPq(str);
        zzBO zzboZzPw = zzPw(str);
        if (zz18VarZzPq != null) {
            zz2o.zzZ(zz18VarZzPq.zzZTj());
        }
        if (zz2o.getFill().zzZQ4() != 0 && !z && !zzT(zzboZzPw.zzZFs())) {
            zz2o.setFill(new zz1C(zzboZzPw.zzZFs().zzZO0()[0]));
        }
        if (zzT(zzboZzPw.zzZFr())) {
            return;
        }
        if (zz2o.getOutline() == null) {
            zz2o.setOutline(new zz4G());
        }
        zz2o.getOutline().setFill(new zz1C(zzboZzPw.zzZFr().zzZO0()[0]));
    }

    public final void zzZ(zz2O zz2o, zz4A zz4a, String str) {
        zzBW zzbwZzZQX;
        zzBO zzboZzPw = zzPw(str);
        if (!zzT(zzboZzPw.zzZFo())) {
            zzbwZzZQX = zzboZzPw.zzZFo().zzZO0()[0];
        } else {
            zzbwZzZQX = zz2o.zzZTj() != null ? zz2o.zzZTj().zzZu5().zzZQX() : null;
        }
        if (zzbwZzZQX != null) {
            zz4a.zzZxp().zzZHc().setFill(new zz1C(zzbwZzZQX));
        }
        if (zzT(zzboZzPw.zzZFp())) {
            return;
        }
        zz4a.zzZxp().zzZHc().setOutline(new zz4G());
        zz4a.zzZxp().zzZHc().getOutline().setFill(new zz1C(zzboZzPw.zzZFp().zzZO0()[0]));
    }
}
