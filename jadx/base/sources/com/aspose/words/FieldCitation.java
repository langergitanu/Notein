package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FieldCitation extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\m", "\\n", "\\t", "\\y", "\\f", "\\s", "\\v", "\\p", "\\l");

    public static class zzZ {
        private String zzYG0;
        private String zzYG1;
        private String zzYG2;
        private boolean zzYG3;
        private boolean zzYG4;
        private boolean zzYG5;
        private boolean zzYG6;
        private boolean zzYG7;
        private Source zzYG8;
        private String zzZpC;

        public zzZ(Source source, boolean z, boolean z2) {
            this.zzYG8 = source;
            this.zzYG7 = z;
            this.zzYG6 = z2;
        }

        public final String getPageNumber() {
            return this.zzYG0;
        }

        public final String getPrefix() {
            return this.zzZpC;
        }

        public final String getSuffix() {
            return this.zzYG2;
        }

        public final boolean getSuppressAuthor() {
            return this.zzYG5;
        }

        public final boolean getSuppressTitle() {
            return this.zzYG4;
        }

        public final boolean getSuppressYear() {
            return this.zzYG3;
        }

        public final String getVolumeNumber() {
            return this.zzYG1;
        }

        public final void setPageNumber(String str) {
            this.zzYG0 = str;
        }

        public final void setPrefix(String str) {
            this.zzZpC = str;
        }

        public final void setSuffix(String str) {
            this.zzYG2 = str;
        }

        public final void setVolumeNumber(String str) {
            this.zzYG1 = str;
        }

        public final void zzZfJ() {
            this.zzYG3 = true;
        }

        public final void zzZfK() {
            this.zzYG4 = true;
        }

        public final void zzZfL() {
            this.zzYG5 = true;
        }

        public final boolean zzZfM() {
            return this.zzYG6;
        }

        public final boolean zzZfN() {
            return this.zzYG7;
        }

        public final Source zzZfO() {
            return this.zzYG8;
        }
    }

    private static com.aspose.words.internal.zzFQ<String> zzG(Iterable<Source> iterable) {
        HashMap map = new HashMap();
        Iterator<Source> it = iterable.iterator();
        while (it.hasNext()) {
            for (Person person : it.next().zzY7H()) {
                Ref ref = new Ref(null);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(map, person.getLast(), ref);
                com.aspose.words.internal.zzIM zzim = (com.aspose.words.internal.zzIM) ref.get();
                if (!zZzZ) {
                    zzim = new com.aspose.words.internal.zzIM();
                    com.aspose.words.internal.zzZQF.zzY(map, person.getLast(), zzim);
                }
                zzim.add(person);
            }
        }
        com.aspose.words.internal.zzIM zzim2 = new com.aspose.words.internal.zzIM();
        for (Map.Entry entry : map.entrySet()) {
            if (((com.aspose.words.internal.zzIM) entry.getValue()).getCount() > 1) {
                zzim2.add((String) entry.getKey());
            }
        }
        return zzim2;
    }

    private static com.aspose.words.internal.zzFQ<Person> zzH(Iterable<Source> iterable) {
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        com.aspose.words.internal.zzIM zzim2 = new com.aspose.words.internal.zzIM();
        Iterator<Source> it = iterable.iterator();
        while (it.hasNext()) {
            ArrayList<Person> arrayListZzY7H = it.next().zzY7H();
            for (Person person : arrayListZzY7H) {
                if (zzim.contains(person)) {
                    zzim2.add(person);
                }
            }
            Iterator<Person> it2 = arrayListZzY7H.iterator();
            while (it2.hasNext()) {
                zzim.add(it2.next());
            }
        }
        return zzim2;
    }

    private static int zzMk(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 2;
            case 1:
            case 2:
            case 3:
                return 1;
            default:
                return 0;
        }
    }

    private static byte zzP(Node node, boolean z) {
        while (node != null) {
            if (node instanceof FieldChar) {
                return (byte) 1;
            }
            if (node.zz0R() != 0) {
                String text = node.getText();
                return com.aspose.words.internal.zzZYD.zzZ1(text.charAt(text.length() - 1)) == z ? (byte) 1 : (byte) 0;
            }
            node = node.zzYB9();
        }
        return (byte) -1;
    }

    private static zzZ zzY(Map<String, Source> map, String str, com.aspose.words.internal.zzFQ<Person> zzfq, com.aspose.words.internal.zzFQ<String> zzfq2) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<String, V>) map, str, ref);
        Source source = (Source) ref.get();
        if (zZzZ) {
            return new zzZ(source, zzZ(source, zzfq), zzY(source, zzfq2));
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x001d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList<zzZ> zzZ(Map<String, Source> map, String str, com.aspose.words.internal.zzFQ<Person> zzfq, com.aspose.words.internal.zzFQ<String> zzfq2) {
        zzZ zzzZzY = zzY(map, str, zzfq, zzfq2);
        if (zzzZzY == null) {
            return null;
        }
        ArrayList<zzZ> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzZzY);
        int i = 0;
        for (zzZPC zzzpc : zzZgq().zzZfC()) {
            String lowerCase = zzzpc.getName().toLowerCase();
            switch (zzUR.zzTP(lowerCase)) {
                case 0:
                    zzzZzY = zzY(map, zzzpc.zzZca(), zzfq, zzfq2);
                    if (zzzZzY != null) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzZzY);
                        if (zzMk(lowerCase) == 0 || (i = i + 1) != 10) {
                        }
                    }
                    break;
                case 1:
                    zzzZzY.zzZfL();
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                case 2:
                    zzzZzY.zzZfK();
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                case 3:
                    zzzZzY.zzZfJ();
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                case 4:
                    zzzZzY.setPrefix(zzzpc.zzZca());
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                case 5:
                    zzzZzY.setSuffix(zzzpc.zzZca());
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                case 6:
                    zzzZzY.setVolumeNumber(zzzpc.zzZca());
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                case 7:
                    zzzZzY.setPageNumber(zzzpc.zzZca());
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
                default:
                    if (zzMk(lowerCase) == 0) {
                    }
                    break;
            }
            return null;
        }
        return arrayList;
    }

    private boolean zzZfP() {
        byte bZzP = zzP(getStart().zzYB9(), true);
        if (bZzP != -1) {
            return bZzP == 1;
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(getStart().getParentParagraph().zzYB9(), Paragraph.class);
        if (paragraph == null) {
            return false;
        }
        return com.aspose.words.internal.zz7L.zzN(zzP(paragraph.zzZYq(), false));
    }

    private void zzZfQ() {
        if (zzZfP()) {
            getEnd().getParentNode().insertBefore(new Run(getStart().getDocument(), " "), getEnd());
        }
    }

    private void zzZn(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        Body body;
        Paragraph firstParagraph;
        Document document = new Document(zzzop, new HtmlLoadOptions());
        Section firstSection = document.getFirstSection();
        if (firstSection == null || (body = firstSection.getBody()) == null || (firstParagraph = body.getFirstParagraph()) == null) {
            return;
        }
        getEnd().getParentNode().zzZ(((Paragraph) new NodeImporter(document, getStart().getDocument(), 0).importNode(firstParagraph, true)).getFirstChild(), (Node) null, getEnd());
    }

    public String getAnotherSourceTag() {
        return zzZgq().zzt("\\m", false);
    }

    public String getFormatLanguageId() {
        return zzZgq().zzt("\\l", false);
    }

    public String getPageNumber() {
        return zzZgq().zzt("\\p", false);
    }

    public String getPrefix() {
        return zzZgq().zzt("\\f", false);
    }

    public String getSourceTag() {
        return zzZgq().zzDG(0);
    }

    public String getSuffix() {
        return zzZgq().zzt("\\s", false);
    }

    public boolean getSuppressAuthor() {
        return zzZgq().zzMj("\\n");
    }

    public boolean getSuppressTitle() {
        return zzZgq().zzMj("\\t");
    }

    public boolean getSuppressYear() {
        return zzZgq().zzMj("\\y");
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzMk(str);
    }

    public String getVolumeNumber() {
        return zzZgq().zzt("\\v", false);
    }

    public void setAnotherSourceTag(String str) throws Exception {
        zzZgq().zzZf("\\m", str);
    }

    public void setFormatLanguageId(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setPageNumber(String str) throws Exception {
        zzZgq().zzZf("\\p", str);
    }

    public void setPrefix(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setSourceTag(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setSuffix(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setSuppressAuthor(boolean z) throws Exception {
        zzZgq().zzs("\\n", z);
    }

    public void setSuppressTitle(boolean z) throws Exception {
        zzZgq().zzs("\\t", z);
    }

    public void setSuppressYear(boolean z) throws Exception {
        zzZgq().zzs("\\y", z);
    }

    public void setVolumeNumber(String str) throws Exception {
        zzZgq().zzZf("\\v", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        Bibliography bibliography = getStart().zzYBb().getBibliography();
        if (!bibliography.zz9V()) {
            return null;
        }
        String sourceTag = getSourceTag();
        if (com.aspose.words.internal.zzZKN.zzU3(sourceTag)) {
            return new zzZP2(this, "No source specified.");
        }
        Collection<com.aspose.words.internal.zzZOP> collectionZzY = zzY(bibliography.zz9U(), sourceTag);
        if (collectionZzY == null) {
            return new zzZP2(this, "Invalid source specified.");
        }
        com.aspose.words.internal.zzST zzst = new com.aspose.words.internal.zzST(collectionZzY);
        try {
            Collection<com.aspose.words.internal.zzZOP> collectionZzZ = zzZ(collectionZzY, bibliography);
            if (collectionZzZ == null) {
                return new zzZP2(this, "Invalid source specified.");
            }
            zzst = new com.aspose.words.internal.zzST(collectionZzZ);
            try {
                com.aspose.words.internal.zzZOY zzzoyZzZbn = zzZgn().zzZbn();
                try {
                    zzZfQ();
                    Iterator<com.aspose.words.internal.zzZOP> it = collectionZzZ.iterator();
                    while (it.hasNext()) {
                        zzZn(it.next());
                    }
                    zzst.dispose();
                    return new zzZP4(this);
                } finally {
                    zzzoyZzZbn.dispose();
                }
            } finally {
            }
        } finally {
        }
    }

    private Collection<com.aspose.words.internal.zzZOP> zzY(Map<String, Source> map, String str) throws Exception {
        ArrayList arrayList = new ArrayList();
        ArrayList<zzZ> arrayListZzZ = zzZ(map, str, zzH(map.values()), zzG(map.values()));
        if (arrayListZzZ == null) {
            return null;
        }
        int iZzMm = zzZR5.zzMm(getFormatLanguageId());
        int i = 0;
        while (i < arrayListZzZ.size()) {
            boolean z = true;
            boolean z2 = i == 0;
            if (i != arrayListZzZ.size() - 1) {
                z = false;
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZOP>) arrayList, zzZ(arrayListZzZ.get(i), iZzMm, z2, z));
            i++;
        }
        return arrayList;
    }

    private static boolean zzY(Source source, com.aspose.words.internal.zzFQ<String> zzfq) {
        Iterator<Person> it = source.zzY7H().iterator();
        while (it.hasNext()) {
            if (zzfq.contains(it.next().getLast())) {
                return true;
            }
        }
        return false;
    }

    private static Collection<com.aspose.words.internal.zzZOP> zzZ(Iterable<com.aspose.words.internal.zzZOP> iterable, Bibliography bibliography) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<com.aspose.words.internal.zzZOP> it = iterable.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZOP zzzopZzZR = bibliography.zzZR(it.next());
            if (zzzopZzZR == null) {
                return null;
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZOP>) arrayList, zzzopZzZR);
        }
        return arrayList;
    }

    private static boolean zzZ(Source source, com.aspose.words.internal.zzFQ<Person> zzfq) {
        Iterator<Person> it = source.zzY7H().iterator();
        while (it.hasNext()) {
            if (zzfq.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static com.aspose.words.internal.zzZOP zzZ(zzZ zzz, int i, boolean z, boolean z2) throws Exception {
        if (zzz.zzZfO().zzY7E()) {
            i = zzz.zzZfO().zzY7F();
        }
        return new zzYO("Citation", i).zzG("FirstAuthor", z).zzG("LastAuthor", z2).zzG("RepeatedAuthor", zzz.zzZfN()).zzG("NonUniqueLastName", zzz.zzZfM()).zzG("NoAuthor", zzz.getSuppressAuthor()).zzG("NoTitle", zzz.getSuppressTitle()).zzG("NoYear", zzz.getSuppressYear()).zzZB("PagePrefix", zzz.getPrefix()).zzZB("PageSuffix", zzz.getSuffix()).zzZB("Volume", zzz.getVolumeNumber()).zzZB("Pages", zzz.getPageNumber()).zzZ(zzz.zzZfO()).zz9S();
    }
}
