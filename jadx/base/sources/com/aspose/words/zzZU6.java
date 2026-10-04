package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import com.aspose.words.ref.Ref;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU6 implements IResourceLoadingCallback {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("full-path", HTMLWriter.MEDIA_TYPE);
    private zzZU9 zzYKR;
    private String zzYKT;
    private DocumentBuilder zzZwh;
    private HashMap<String, String> zzYKQ = new HashMap<>();
    private HashMap<String, String> zzYKP = new HashMap<>();
    private com.aspose.words.internal.zzIM<String> zzYKU = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<BookmarkStart> zzZwg = new com.aspose.words.internal.zzIM<>();
    private HashMap<String, com.aspose.words.internal.zzZOR> zzYKS = new HashMap<>();

    public zzZU6(com.aspose.words.internal.zzZOP zzzop, Document document) throws Exception {
        this.zzZwh = new DocumentBuilder(document);
        for (zzYQO zzyqo : new zzYQP(zzzop).zzYvp()) {
            com.aspose.words.internal.zzZQF.zzY(this.zzYKS, com.aspose.words.internal.zzZKN.zzU2(zzyqo.getName()), zzyqo.zzYvo());
        }
    }

    private com.aspose.words.internal.zzZOR zzMA(String str) {
        Ref ref = new Ref(null);
        com.aspose.words.internal.zzZQF.zzZ(this.zzYKS, com.aspose.words.internal.zzZKN.zzU2(str), ref);
        return (com.aspose.words.internal.zzZOR) ref.get();
    }

    private String zzMB(String str) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYKQ, str, ref);
        String str2 = (String) ref.get();
        if (zZzZ) {
            return str2;
        }
        String str3 = "epubfile" + com.aspose.words.internal.zzJB.zzWD(this.zzYKQ.size() + 1);
        com.aspose.words.internal.zzZQF.zzY(this.zzYKQ, str, str3);
        return str3;
    }

    private zzZU9 zzMC(String str) throws Exception {
        String str2 = ".".equals(str) ? "" : str;
        com.aspose.words.internal.zzZOR zzzorZzR = zzR(zzMA(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("/", str)));
        if (zzzorZzR != null) {
            return new zzZU9(new com.aspose.words.internal.zzO(zzzorZzR), str, str2, this.zzZwh.getDocument().getWarningCallback());
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Couldn't find the '", str, "' file."));
    }

    private static com.aspose.words.internal.zzZOR zzR(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        int iZzT;
        byte[] bArrZzWy = zzzor.zzWy();
        String strZzZn = com.aspose.words.internal.zzZO0.zzhV().zzZn(bArrZzWy);
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        int iZzT2 = com.aspose.words.internal.zzZKN.zzT(strZzZn, "<?xml", i);
        if (iZzT2 >= 0 && (iZzT = com.aspose.words.internal.zzZKN.zzT(strZzZn, "?>", i)) >= 0 && iZzT >= iZzT2) {
            String strSubstring = strZzZn.substring(iZzT2, iZzT2 + iZzT);
            if (!strSubstring.contains("version='1.0'") && !strSubstring.contains("version=\"1.0\"")) {
                com.aspose.words.internal.zzXE zzxe = new com.aspose.words.internal.zzXE(bArrZzWy.length);
                zzxe.zzR(com.aspose.words.internal.zzZO0.zzhV().getBytes("<?xml version='1.0' encoding='utf-8'?>"));
                for (int i2 = iZzT + 2; i2 < bArrZzWy.length; i2++) {
                    zzxe.zzX(bArrZzWy[i2]);
                }
                return new com.aspose.words.internal.zzZOR(zzxe.zzWy());
            }
        }
        return zzzor;
    }

    private void zzT(int i, String str) {
        if (this.zzZwh.getDocument().getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzZwh.getDocument().getWarningCallback(), i, 25, str);
        }
    }

    private void zzX(Paragraph paragraph, String str) {
        String strZzMB = zzMB(str);
        paragraph.insertBefore(new BookmarkEnd(this.zzZwh.getDocument(), strZzMB), paragraph.getFirstChild());
        BookmarkStart bookmarkStart = new BookmarkStart(this.zzZwh.getDocument(), strZzMB, 0);
        paragraph.insertBefore(bookmarkStart, paragraph.getFirstChild());
        this.zzZwg.add(bookmarkStart);
    }

    private Node zzZ(String str, zzZFF zzzff, Ref<com.aspose.words.internal.zzZYG<BookmarkEnd>> ref) throws Exception {
        Node node;
        ref.set(null);
        boolean z = true;
        boolean z2 = this.zzYKU.getCount() == 0;
        com.aspose.words.internal.zzZOR zzzorZzMA = zzMA(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("/", str));
        if (zzzorZzMA == null) {
            zzT(1, com.aspose.words.internal.zzZKN.format("The file '{0}' was skipped because it doesn't exist in the package.", str));
            return null;
        }
        if (!z2) {
            this.zzZwh.insertParagraph();
        }
        this.zzYKU.add(str);
        Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
        Node previousSibling = currentParagraph.getPreviousSibling();
        zzZFH zzzfh = new zzZFH();
        if (!this.zzYKR.zzME(str)) {
            int i = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
            if (!com.aspose.words.internal.zzZKN.zzW(str, "xhtml", i) && !com.aspose.words.internal.zzZKN.zzW(str, "xht", i)) {
                z = false;
            }
        }
        zzzfh.zzYmE = z;
        this.zzYKT = str;
        try {
            zzZFI zzzfi = new zzZFI(zzzfh, 55, zzzff);
            zzzfi.zzZ((com.aspose.words.internal.zzZOP) zzzorZzMA, (com.aspose.words.internal.zzZO0) null, this.zzZwh, false);
            ref.set(zzzfi.zzZ1J());
            this.zzYKT = null;
            DocumentBuilder documentBuilder = this.zzZwh;
            documentBuilder.moveTo(documentBuilder.getCurrentParagraph().getParentSection().getBody().getLastParagraph());
            if (currentParagraph.getParentNode() == null && !z2) {
                currentParagraph = this.zzZwh.insertParagraph();
            }
            if (currentParagraph.getPreviousSibling() == previousSibling || currentParagraph.getPreviousSibling() == null || currentParagraph.getPreviousSibling().getNodeType() != 5) {
                node = currentParagraph;
            } else {
                Table table = (Table) currentParagraph.getPreviousSibling();
                currentParagraph = table.getFirstRow().getFirstCell().getFirstParagraph();
                node = table;
            }
            zzX(currentParagraph, str);
            return node;
        } catch (Throwable th) {
            this.zzYKT = null;
            throw th;
        }
    }

    private void zzZO(ArrayList<String> arrayList) throws Exception {
        while (arrayList.size() != 0) {
            zzZFF zzzff = new zzZFF(this, this.zzZwh.getDocument().getWarningCallback());
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<Node> arrayList3 = new ArrayList<>();
            ArrayList<com.aspose.words.internal.zzZYG<BookmarkEnd>> arrayList4 = new ArrayList<>();
            for (String str : arrayList) {
                Ref<com.aspose.words.internal.zzZYG<BookmarkEnd>> ref = new Ref<>(null);
                Node nodeZzZ = zzZ(str, zzzff, ref);
                com.aspose.words.internal.zzZYG<BookmarkEnd> zzzyg = ref.get();
                if (nodeZzZ != null) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList2, str);
                    com.aspose.words.internal.zzZQG.zzZ(arrayList3, nodeZzZ);
                    com.aspose.words.internal.zzZQG.zzZ(arrayList4, zzzyg);
                }
            }
            arrayList = zzZ(arrayList2, arrayList3, arrayList4);
            if (arrayList.size() <= 0) {
                return;
            }
        }
        zzT(16777216, "No files were found in the EPUB document.");
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
    private java.lang.String zzZg(
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

    private void zzZj3() {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYKR.getTitle())) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().setTitle(this.zzYKR.getTitle());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYKR.getAuthor())) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().setAuthor(this.zzYKR.getAuthor());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYKR.getSubject())) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().setSubject(this.zzYKR.getSubject());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYKR.getDescription())) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().setComments(this.zzYKR.getDescription());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYKR.getPublisher())) {
            this.zzZwh.getDocument().getBuiltInDocumentProperties().setCompany(this.zzYKR.getPublisher());
        }
        com.aspose.words.internal.zzZQ9 zzzq9ZzZi = com.aspose.words.internal.zzJB.zzZi(this.zzYKR.zzZj5());
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZi, com.aspose.words.internal.zzZQ9.zz35)) {
            return;
        }
        this.zzZwh.getDocument().getBuiltInDocumentProperties().zzB(zzzq9ZzZi);
    }

    private String zzZj4() throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzMA = zzMA("/META-INF/container.xml");
        if (zzzorZzMA == null) {
            throw new IllegalStateException("Couldn't find the 'container.xml' file.");
        }
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzorZzMA);
        if (!zzo.zzQ("container")) {
            throw new IllegalStateException("The 'container.xml' file is invalid.");
        }
        String value = null;
        String strZzU2 = null;
        while (zzo.zzQ("rootfiles")) {
            if (!"rootfile".equals(zzo.getLocalName())) {
                throw new IllegalStateException("The 'container.xml' file is invalid.");
            }
            while (zzo.zzi()) {
                int iZzTP = zzUR.zzTP(zzo.getLocalName());
                if (iZzTP == 0) {
                    value = zzo.getValue();
                } else if (iZzTP == 1) {
                    strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzo.getValue());
                }
            }
            if ("application/oebps-package+xml".equals(strZzU2)) {
                break;
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value) && "application/oebps-package+xml".equals(strZzU2)) {
            return value;
        }
        throw new IllegalStateException("The 'container.xml' file is invalid.");
    }

    @Override // com.aspose.words.IResourceLoadingCallback
    public final int resourceLoading(ResourceLoadingArgs resourceLoadingArgs) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzMA = zzMA("/" + com.aspose.words.internal.zzZVR.zzWt(zzZDZ.zzYS(this.zzYKT, resourceLoadingArgs.getUri())));
        if (zzzorZzMA == null) {
            resourceLoadingArgs.setData(null);
            return 2;
        }
        resourceLoadingArgs.setData(zzzorZzMA.zzWy());
        return 2;
    }

    public final void zzIh() throws Exception {
        this.zzYKR = zzMC(zzZj4());
        String baseUri = this.zzZwh.getDocument().getBaseUri();
        IResourceLoadingCallback resourceLoadingCallback = this.zzZwh.getDocument().getResourceLoadingCallback();
        try {
            this.zzZwh.getDocument().setBaseUri("");
            this.zzZwh.getDocument().setResourceLoadingCallback(this);
            zzZO(this.zzYKR.zzZj6());
            this.zzZwh.getDocument().setBaseUri(baseUri);
            this.zzZwh.getDocument().setResourceLoadingCallback(resourceLoadingCallback);
            this.zzZwh.getDocument().setBackgroundShape(null);
            zzZj3();
        } catch (Throwable th) {
            this.zzZwh.getDocument().setBaseUri(baseUri);
            this.zzZwh.getDocument().setResourceLoadingCallback(resourceLoadingCallback);
            throw th;
        }
    }

    private ArrayList<String> zzZ(ArrayList<String> arrayList, ArrayList<Node> arrayList2, ArrayList<com.aspose.words.internal.zzZYG<BookmarkEnd>> arrayList3) {
        Section section;
        ArrayList<String> arrayList4 = new ArrayList<>();
        int i = 0;
        while (i < arrayList.size()) {
            String str = arrayList.get(i);
            Node nextSibling = arrayList2.get(i);
            int i2 = i + 1;
            Node node = i2 < arrayList2.size() ? arrayList2.get(i2) : null;
            while (nextSibling != null && nextSibling != node) {
                if (nextSibling.isComposite()) {
                    BookmarkCollection bookmarkCollection = new BookmarkCollection(nextSibling);
                    if (bookmarkCollection.getCount() > 0) {
                        zzZ(bookmarkCollection, str, arrayList3.get(i));
                    }
                    FieldCollection fieldCollection = new FieldCollection(nextSibling);
                    if (fieldCollection.getCount() > 0) {
                        zzZ(fieldCollection, str, arrayList4);
                    }
                }
                if (nextSibling.getNextSibling() == null && (section = (Section) nextSibling.getAncestor(2)) != null && section.getNextSibling() != null) {
                    nextSibling = ((Section) section.getNextSibling()).getBody().getFirstParagraph();
                } else {
                    nextSibling = nextSibling.getNextSibling();
                }
            }
            i = i2;
        }
        return arrayList4;
    }

    private void zzZ(BookmarkCollection bookmarkCollection, String str, com.aspose.words.internal.zzZYG<BookmarkEnd> zzzyg) {
        if (this.zzZwh.getDocument().getBaseUri() == null || str.length() <= 1) {
            return;
        }
        for (Bookmark bookmark : bookmarkCollection) {
            if (!this.zzZwg.contains(bookmark.getBookmarkStart())) {
                String strZzZg = zzZg(com.aspose.words.internal.zzZKN.zzU2(str), bookmark.getBookmarkStart().getName());
                if (zzzyg.containsKey(bookmark.getBookmarkStart().getName())) {
                    zzzyg.get(bookmark.getBookmarkStart().getName()).setName(strZzZg);
                }
                bookmark.getBookmarkStart().setName(strZzZg);
                this.zzZwg.add(bookmark.getBookmarkStart());
            }
        }
    }

    private void zzZ(FieldCollection fieldCollection, String str, ArrayList<String> arrayList) {
        Run run;
        String strZzMB;
        for (Field field : fieldCollection) {
            if (field.getType() == 88 && (run = (Run) com.aspose.words.internal.zzZKW.zzZ(field.getStart().zzYB1(), Run.class)) != null) {
                zzZQX zzzqxZzM7 = zzZQX.zzM7(run.getText());
                if (!com.aspose.words.internal.zzZYD.zzXk(zzzqxZzM7.getAddress())) {
                    zzzqxZzM7.setSubAddress(zzZg(str, zzzqxZzM7.getSubAddress()));
                } else {
                    String strZzWt = com.aspose.words.internal.zzZVR.zzWt(zzY0C.zzyx(com.aspose.words.internal.zzZKN.zzU2(zzzqxZzM7.getAddress())));
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzWt) && !com.aspose.words.internal.zzZVR.zzWr(strZzWt)) {
                        String strZzYT = zzZDZ.zzYT(str, strZzWt);
                        if (this.zzYKR.zzME(strZzYT) || this.zzYKR.zzMD(strZzYT)) {
                            if (this.zzYKS.containsKey("/" + strZzYT) && !this.zzYKU.contains(strZzYT) && strZzYT.length() > 1) {
                                com.aspose.words.internal.zzZQG.zzZ(arrayList, strZzYT);
                            }
                            if (com.aspose.words.internal.zzZYD.zzXk(zzzqxZzM7.getSubAddress())) {
                                strZzMB = zzZg(strZzYT, zzzqxZzM7.getSubAddress());
                            } else {
                                strZzMB = zzMB(strZzYT);
                            }
                        } else {
                            strZzMB = "";
                        }
                        zzzqxZzM7.setSubAddress(strZzMB);
                        zzzqxZzM7.setAddress("");
                    }
                }
                run.setText(zzzqxZzM7.zzZfj());
            }
        }
    }
}
