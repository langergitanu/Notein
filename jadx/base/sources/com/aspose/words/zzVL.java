package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzVL implements IResourceLoadingCallback {
    private com.aspose.words.internal.zzZOX zzW6;
    private long zzZwY;
    private DocumentBuilder zzZwh;
    private ChmLoadOptions zzZwj;
    private String zzZwk;
    private HashMap<String, byte[]> zzZwl;
    private zzVW zzZwm;
    private zzVX zzZwn;
    private HashMap<String, String> zzZwf = new HashMap<>();
    private HashMap<String, String> zzZwe = new HashMap<>();
    private com.aspose.words.internal.zzIM<String> zzZwi = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<BookmarkStart> zzZwg = new com.aspose.words.internal.zzIM<>();

    public zzVL(com.aspose.words.internal.zzZOP zzzop, Document document, ChmLoadOptions chmLoadOptions) throws Exception {
        this.zzW6 = new com.aspose.words.internal.zzZOX(zzzop);
        this.zzZwh = new DocumentBuilder(document);
        this.zzZwj = chmLoadOptions;
    }

    private zzVO zz1a() throws Exception {
        byte[] bArrZzY;
        zzVV zzvvZzT0 = zzT0("::dataspace/storage/mscompressed/controldata");
        if (zzvvZzT0 == null || (bArrZzY = zzY(zzvvZzT0)) == null) {
            return null;
        }
        return zzVO.zzYA(bArrZzY);
    }

    private zzVK zz1b() throws Exception {
        byte[] bArrZzY;
        zzVV zzvvZzT0 = zzT0("::dataspace/storage/mscompressed/transform/{7fc28940-9d31-11d0-9b27-00a0c91e9c7c}/instancedata/resettable");
        zzVV zzvvZzT02 = zzT0("::dataspace/storage/mscompressed/content");
        zzVV zzvvZzT03 = zzT0("::dataspace/storage/mscompressed/controldata");
        if (zzvvZzT0 == null || zzvvZzT0.zz1z() || zzvvZzT02 == null || zzvvZzT02.zz1z() || zzvvZzT03 == null || zzvvZzT03.zz1z() || (bArrZzY = zzY(zzvvZzT0)) == null) {
            return null;
        }
        return zzVK.zzZ(bArrZzY, this.zzZwY, zzvvZzT02.zz1y());
    }

    private void zz1c() throws Exception {
        zzVO zzvoZz1a;
        zzVK zzvkZz1b = zz1b();
        if (zzvkZz1b == null || (zzvoZz1a = zz1a()) == null) {
            return;
        }
        this.zzZwn = new zzVX(zzvoZz1a, zzvkZz1b, this.zzW6);
    }

    private byte[] zzA(long j, long j2) throws Exception {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalStateException("Directory entry has invalid length.");
        }
        this.zzW6.zzq().zzH(j);
        return this.zzW6.zzn((int) j2);
    }

    private String zzSY(String str) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZwf, str, ref);
        String str2 = (String) ref.get();
        if (zZzZ) {
            return str2;
        }
        String str3 = "chmtopic" + com.aspose.words.internal.zzJB.zzWD(this.zzZwf.size() + 1);
        com.aspose.words.internal.zzZQF.zzY(this.zzZwf, str, str3);
        return str3;
    }

    private static boolean zzSZ(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && com.aspose.words.internal.zzZKN.zzW(str, ".hhc", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private void zzT(int i, String str) {
        if (this.zzZwh.getDocument().getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzZwh.getDocument().getWarningCallback(), i, 24, str);
        }
    }

    private zzVV zzT0(String str) {
        zzVV zzvvZzT1 = this.zzZwm.zzT1(str);
        if (zzvvZzT1 == null) {
            zzT(1, com.aspose.words.internal.zzZKN.format("The file '{0}' wasn't found in the CHM document.", str));
        }
        return zzvvZzT1;
    }

    private ArrayList<String> zzU(com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        String strZz17;
        String strZz18;
        zzVV zzvvZzT0 = zzT0("#system");
        if (zzvvZzT0 != null) {
            zzVJ zzvjZzZ = zzVJ.zzZ(zzY(zzvvZzT0), zzzo0);
            strZz17 = zzvjZzZ.zz17();
            strZz18 = zzvjZzZ.zz18();
        } else {
            strZz17 = null;
            strZz18 = null;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(strZz17) || !zzSZ(strZz18)) {
            zzVV zzvvZzT02 = zzT0("#windows");
            zzVV zzvvZzT03 = zzT0("#strings");
            if (zzvvZzT02 != null && zzvvZzT03 != null) {
                zzVH zzvhZzZ = zzVH.zzZ(zzY(zzvvZzT02), zzY(zzvvZzT03), zzzo0);
                if (!com.aspose.words.internal.zzZYD.zzXk(strZz17)) {
                    strZz17 = zzvhZzZ.zz17();
                }
                if (!zzSZ(strZz18)) {
                    strZz18 = zzvhZzZ.zz18();
                }
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (com.aspose.words.internal.zzZYD.zzXk(strZz17)) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, strZz17);
        }
        if (zzSZ(strZz18)) {
            zzZ(strZz18, arrayList, zzzo0);
        }
        return arrayList;
    }

    private byte[] zzY(zzVV zzvv) throws Exception {
        if (!zzvv.zz1z()) {
            return zzA(this.zzZwY + zzvv.zz1y(), zzvv.getLength());
        }
        zzVX zzvx = this.zzZwn;
        if (zzvx != null) {
            return zzvx.zzZ(zzvv);
        }
        throw new IllegalStateException("Found a compressed entry in an uncompressed CHM file.");
    }

    private void zzZ(Paragraph paragraph, String str) {
        String strZzSY = zzSY(str);
        paragraph.insertBefore(new BookmarkEnd(this.zzZwh.getDocument(), strZzSY), paragraph.getFirstChild());
        BookmarkStart bookmarkStart = new BookmarkStart(this.zzZwh.getDocument(), strZzSY, 0);
        paragraph.insertBefore(bookmarkStart, paragraph.getFirstChild());
        this.zzZwg.add(bookmarkStart);
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
    private java.lang.String zzZA(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
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

    /* JADX WARN: Finally extract failed */
    private int zzu(ArrayList<String> arrayList) throws Exception {
        zzVV zzvvZzT0;
        if (arrayList.size() == 0) {
            zzT(16777216, "No topic files were found in the CHM document.");
            return 0;
        }
        zzZFF zzzff = new zzZFF(this, this.zzZwh.getDocument().getWarningCallback());
        boolean z = this.zzZwi.getCount() == 0;
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<Node> arrayList3 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            String strZz6 = com.aspose.words.internal.zzZVR.zz6("", it.next());
            if (!this.zzZwi.contains(strZz6) && (zzvvZzT0 = zzT0(strZz6)) != null) {
                int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                if (com.aspose.words.internal.zzZKN.zzW(strZz6, "html", i2) || com.aspose.words.internal.zzZKN.zzW(strZz6, "htm", i2)) {
                    byte[] bArrZzY = zzY(zzvvZzT0);
                    if (!z) {
                        this.zzZwh.insertParagraph();
                    }
                    this.zzZwi.add(strZz6);
                    com.aspose.words.internal.zzZQG.zzZ(arrayList2, strZz6);
                    Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
                    Node previousSibling = currentParagraph.getPreviousSibling();
                    this.zzZwk = strZz6;
                    try {
                        new zzZFI(this.zzZwj.zz1r(), 53, zzzff).zzZ((com.aspose.words.internal.zzZOP) new com.aspose.words.internal.zzZOR(bArrZzY), this.zzZwj.zzZ9Y(), this.zzZwh, false);
                        i++;
                        this.zzZwk = null;
                        DocumentBuilder documentBuilder = this.zzZwh;
                        documentBuilder.moveTo(documentBuilder.getCurrentParagraph().getParentSection().getBody().getLastParagraph());
                        Paragraph currentParagraph2 = currentParagraph.getParentNode() == null ? this.zzZwh.getCurrentParagraph() : currentParagraph;
                        Node previousSibling2 = currentParagraph2.getPreviousSibling();
                        Object obj = currentParagraph;
                        Paragraph paragraph = currentParagraph2;
                        if (previousSibling2 != previousSibling) {
                            Node previousSibling3 = currentParagraph2.getPreviousSibling();
                            obj = currentParagraph;
                            paragraph = currentParagraph2;
                            if (previousSibling3 != null) {
                                int nodeType = currentParagraph2.getPreviousSibling().getNodeType();
                                obj = currentParagraph;
                                paragraph = currentParagraph2;
                                if (nodeType == 5) {
                                    Table table = (Table) currentParagraph2.getPreviousSibling();
                                    Paragraph firstParagraph = table.getFirstRow().getFirstCell().getFirstParagraph();
                                    obj = table;
                                    paragraph = firstParagraph;
                                }
                            }
                        }
                        zzZ(paragraph, strZz6);
                        com.aspose.words.internal.zzZQG.zzZ(arrayList3, obj);
                        z = false;
                    } catch (Throwable th) {
                        this.zzZwk = null;
                        throw th;
                    }
                } else {
                    zzT(1, com.aspose.words.internal.zzZKN.format("The topic file '{0}' was skipped, because it is not a HTML document.", strZz6));
                }
            }
        }
        ArrayList<String> arrayListZzU = zzU(arrayList2, arrayList3);
        return arrayListZzU.size() > 0 ? i + zzu(arrayListZzU) : i;
    }

    @Override // com.aspose.words.IResourceLoadingCallback
    public final int resourceLoading(ResourceLoadingArgs resourceLoadingArgs) throws Exception {
        byte[] bArrZzDL;
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzZDZ.zzYS(this.zzZwk, resourceLoadingArgs.getUri()));
        zzVV zzvvZzT0 = zzT0(strZzU2);
        if (zzvvZzT0 == null) {
            resourceLoadingArgs.setData(null);
            return 2;
        }
        if (this.zzZwl == null) {
            this.zzZwl = new HashMap<>();
        }
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZwl, strZzU2, ref);
        byte[] bArr = (byte[]) ref.get();
        if (!zZzZ) {
            try {
                bArrZzDL = zzY(zzvvZzT0);
            } catch (IllegalStateException e) {
                if (resourceLoadingArgs.getResourceType() != 0) {
                    throw e;
                }
                bArrZzDL = com.aspose.words.internal.zzEF.zzDL();
            }
            bArr = bArrZzDL;
            com.aspose.words.internal.zzZQF.zzY(this.zzZwl, strZzU2, bArr);
        }
        resourceLoadingArgs.setData(bArr);
        return 2;
    }

    public final void zzIh() throws Exception {
        zzVS zzvsZzO = zzVS.zzO(this.zzW6);
        this.zzW6.zzq().zzH(zzvsZzO.zz1w());
        this.zzZwY = zzvsZzO.zz1v();
        this.zzZwm = zzVW.zzZ(this.zzW6, zzVR.zzN(this.zzW6));
        zz1c();
        ArrayList<String> arrayListZzU = zzU(zzvsZzO.zzQZ());
        String baseUri = this.zzZwh.getDocument().getBaseUri();
        IResourceLoadingCallback resourceLoadingCallback = this.zzZwh.getDocument().getResourceLoadingCallback();
        try {
            this.zzZwh.getDocument().setBaseUri("");
            this.zzZwh.getDocument().setResourceLoadingCallback(this);
            if (zzu(arrayListZzU) < this.zzZwm.zz1A()) {
                zzT(1, "Some topic files were not imported, because they are not referenced by the table of contents or by other topic files.");
            }
        } finally {
            this.zzZwh.getDocument().setBaseUri(baseUri);
            this.zzZwh.getDocument().setResourceLoadingCallback(resourceLoadingCallback);
        }
    }

    private void zzZ(BookmarkCollection bookmarkCollection, String str) throws Exception {
        if (this.zzZwh.getDocument().getBaseUri() == null || str.length() <= 1) {
            return;
        }
        for (Bookmark bookmark : bookmarkCollection) {
            if (!this.zzZwg.contains(bookmark.getBookmarkStart())) {
                bookmark.setName(zzZA(str, bookmark.getBookmarkStart().getName()));
                this.zzZwg.add(bookmark.getBookmarkStart());
            }
        }
    }

    private void zzZ(FieldCollection fieldCollection, String str, ArrayList<String> arrayList) {
        String strZzSY;
        for (Field field : fieldCollection) {
            if (field.getType() == 88) {
                FieldStart start = field.getStart();
                if (start.zzYB1().getNodeType() == 21) {
                    Run run = (Run) start.zzYB1();
                    zzZQX zzzqxZzM7 = zzZQX.zzM7(run.getText());
                    if (!com.aspose.words.internal.zzZYD.zzXk(zzzqxZzM7.getAddress())) {
                        zzzqxZzM7.setSubAddress(zzZA(str, zzzqxZzM7.getSubAddress()));
                    } else {
                        String strZzWt = com.aspose.words.internal.zzZVR.zzWt(zzY0C.zzyx(com.aspose.words.internal.zzZKN.zzU2(zzzqxZzM7.getAddress())));
                        if (com.aspose.words.internal.zzZYD.zzXk(strZzWt) && !com.aspose.words.internal.zzZVR.zzWr(strZzWt)) {
                            String strZzYT = zzZDZ.zzYT(str, strZzWt);
                            if (this.zzZwm.zzT2(strZzYT) && !this.zzZwi.contains(strZzYT) && strZzYT.length() > 1) {
                                com.aspose.words.internal.zzZQG.zzZ(arrayList, strZzYT);
                            }
                            if (com.aspose.words.internal.zzZYD.zzXk(zzzqxZzM7.getSubAddress())) {
                                strZzSY = zzZA(strZzYT, zzzqxZzM7.getSubAddress());
                            } else {
                                strZzSY = zzSY(strZzYT);
                            }
                            zzzqxZzM7.setSubAddress(strZzSY);
                            zzzqxZzM7.setAddress("");
                        }
                    }
                    run.setText(zzzqxZzM7.zzZfj());
                }
            }
        }
    }

    private ArrayList<String> zzU(ArrayList<String> arrayList, ArrayList<Node> arrayList2) throws Exception {
        Section section;
        ArrayList<String> arrayList3 = new ArrayList<>();
        int i = 0;
        while (i < arrayList.size()) {
            String str = arrayList.get(i);
            Node nextSibling = arrayList2.get(i);
            i++;
            Node node = i < arrayList2.size() ? arrayList2.get(i) : null;
            while (nextSibling != null && nextSibling != node) {
                if (nextSibling.isComposite()) {
                    BookmarkCollection bookmarkCollection = new BookmarkCollection(nextSibling);
                    if (bookmarkCollection.getCount() > 0) {
                        zzZ(bookmarkCollection, str);
                    }
                    FieldCollection fieldCollection = new FieldCollection(nextSibling);
                    if (fieldCollection.getCount() > 0) {
                        zzZ(fieldCollection, str, arrayList3);
                    }
                }
                if (nextSibling.getNextSibling() == null && (section = (Section) nextSibling.getAncestor(2)) != null && section.getNextSibling() != null) {
                    nextSibling = ((Section) section.getNextSibling()).getBody().getFirstParagraph();
                } else {
                    nextSibling = nextSibling.getNextSibling();
                }
            }
        }
        return arrayList3;
    }

    private void zzZ(String str, ArrayList<String> arrayList, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        byte[] bArrZzY;
        zzSZ(str);
        zzVV zzvvZzT0 = zzT0(com.aspose.words.internal.zzZVR.zz7("", str));
        if (zzvvZzT0 == null || (bArrZzY = zzY(zzvvZzT0)) == null) {
            return;
        }
        zzVI.zzZ(bArrZzY, arrayList, zzzo0);
    }
}
