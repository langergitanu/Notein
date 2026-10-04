package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU9 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("manifest", "spine", "metadata", "href", "id", HTMLWriter.MEDIA_TYPE, NoteMeta.PROPERTY_TITLE, "creator", "contributor", "subject", "description", "publisher", "date");
    private String zzLr;
    private String zzLu;
    private String zzLv;
    private HashMap<String, String> zzYKV = new HashMap<>();
    private String zzYKW;
    private String zzYKX;
    private ArrayList<String> zzYKY;
    private String zzZj;

    public zzZU9(com.aspose.words.internal.zzO zzo, String str, String str2, IWarningCallback iWarningCallback) {
        String value;
        zzZ(zzo, str, "http://www.idpf.org/2007/opf");
        HashMap map = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        while (zzo.zzQ("package")) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 0) {
                zzZ(zzo, str, "http://www.idpf.org/2007/opf");
                while (zzo.zzQ("manifest")) {
                    if ("item".equals(zzo.getLocalName()) && "http://www.idpf.org/2007/opf".equals(zzo.getNamespaceURI())) {
                        String value2 = null;
                        String value3 = null;
                        String value4 = null;
                        while (zzo.zzi()) {
                            zzZ(zzo, str, "");
                            int iZzTP2 = zzUR.zzTP(zzo.getLocalName());
                            if (iZzTP2 == 3) {
                                value3 = zzo.getValue();
                            } else if (iZzTP2 == 4) {
                                value2 = zzo.getValue();
                            } else if (iZzTP2 == 5) {
                                value4 = zzo.getValue();
                            }
                        }
                        if (!com.aspose.words.internal.zzZYD.zzXk(value2) || !com.aspose.words.internal.zzZYD.zzXk(value3)) {
                            throw new IllegalStateException("The content file is invalid.");
                        }
                        if (map.containsKey(value2)) {
                            zzZ(com.aspose.words.internal.zzZKN.format("Content file '{0}' already contains an element with id '{1}'.", str, value2), iWarningCallback);
                        } else {
                            String strZzWt = com.aspose.words.internal.zzZVR.zzWt(com.aspose.words.internal.zzZYD.zzXk(str2) ? zzZDZ.zzYT(str2, value3) : value3);
                            com.aspose.words.internal.zzZQF.zzY(map, value2, strZzWt);
                            String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(strZzWt);
                            if (!this.zzYKV.containsKey(strZzU2)) {
                                com.aspose.words.internal.zzZQF.zzY(this.zzYKV, strZzU2, com.aspose.words.internal.zzZKN.zzU2(value4));
                            }
                        }
                    }
                }
            } else if (iZzTP == 1) {
                zzZ(zzo, str, "http://www.idpf.org/2007/opf");
                com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
                while (zzo.zzQ("spine")) {
                    if ("itemref".equals(zzo.getLocalName())) {
                        zzZ(zzo, str, "http://www.idpf.org/2007/opf");
                        while (zzo.zzi()) {
                            zzZ(zzo, str, "");
                            if ("idref".equals(zzo.getLocalName())) {
                                value = zzo.getValue();
                            }
                        }
                        value = null;
                    } else {
                        value = null;
                    }
                    if (com.aspose.words.internal.zzZYD.zzXk(value) && !zzim.contains(value)) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, value);
                        zzim.add(value);
                    }
                }
            } else if (iZzTP == 2) {
                zzZ(zzo, str, "http://www.idpf.org/2007/opf");
                while (zzo.zzQ("metadata")) {
                    if ("http://purl.org/dc/elements/1.1/".equals(zzo.getNamespaceURI())) {
                        String string = zzo.readString();
                        switch (zzUR.zzTP(zzo.getLocalName())) {
                            case 6:
                                this.zzZj = string;
                                break;
                            case 7:
                            case 8:
                                this.zzLu = zzZh(this.zzLu, string);
                                break;
                            case 9:
                                this.zzLv = zzZh(this.zzLv, string);
                                break;
                            case 10:
                                this.zzLr = string;
                                break;
                            case 11:
                                this.zzYKX = string;
                                break;
                            case 12:
                                this.zzYKW = string;
                                break;
                        }
                    }
                }
            }
        }
        this.zzYKY = new ArrayList<>(arrayList.size());
        for (String str3 : arrayList) {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(map, str3, ref);
            String str4 = (String) ref.get();
            if (zZzZ) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYKY, str4);
            }
        }
    }

    private static void zzZ(String str, IWarningCallback iWarningCallback) {
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 1, 25, str);
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
    private static java.lang.String zzZh(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v0 ??
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

    private boolean zzZi(String str, String str2) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYKV, str, ref);
        String str3 = (String) ref.get();
        if (zZzZ) {
            return com.aspose.words.internal.zzZKN.equals(str3, str2);
        }
        return false;
    }

    public final String getAuthor() {
        return this.zzLu;
    }

    public final String getDescription() {
        return this.zzLr;
    }

    public final String getPublisher() {
        return this.zzYKX;
    }

    public final String getSubject() {
        return this.zzLv;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    public final boolean zzMD(String str) {
        return zzZi(str, "text/html");
    }

    public final boolean zzME(String str) {
        return zzZi(str, "application/xhtml+xml");
    }

    public final String zzZj5() {
        return this.zzYKW;
    }

    public final ArrayList<String> zzZj6() {
        return this.zzYKY;
    }

    private static void zzZ(com.aspose.words.internal.zzO zzo, String str, String str2) {
        if (!com.aspose.words.internal.zzZKN.equals(zzo.getNamespaceURI(), str2)) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("The file {0} contains an element with an invalid namespace.", str));
        }
    }
}
