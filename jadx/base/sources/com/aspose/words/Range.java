package com.aspose.words;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class Range {
    private StructuredDocumentTagCollection zzXCQ;
    private FieldCollection zzXCR;
    private BookmarkCollection zzXCS;
    private FormFieldCollection zzXCT;
    private Node zzYR6;
    private RevisionCollection zzYSR;

    public Range(Node node) {
        this.zzYR6 = node;
    }

    private int zzZ(com.aspose.words.internal.zzZNR zzznr, String str) throws Exception {
        return zzZ(zzznr, str, new FindReplaceOptions());
    }

    public void delete() {
        if (this.zzYR6.isComposite()) {
            ((CompositeNode) this.zzYR6).removeAllChildren();
        }
        if (this.zzYR6.getParentNode() != null) {
            this.zzYR6.getParentNode().removeChild(this.zzYR6);
        }
    }

    public BookmarkCollection getBookmarks() {
        if (this.zzXCS == null) {
            this.zzXCS = new BookmarkCollection(this.zzYR6);
        }
        return this.zzXCS;
    }

    public FieldCollection getFields() {
        if (this.zzXCR == null) {
            this.zzXCR = new FieldCollection(this.zzYR6);
        }
        return this.zzXCR;
    }

    public FormFieldCollection getFormFields() {
        if (this.zzXCT == null) {
            this.zzXCT = new FormFieldCollection(this.zzYR6);
        }
        return this.zzXCT;
    }

    public final Node getNode() {
        return this.zzYR6;
    }

    public RevisionCollection getRevisions() {
        if (this.zzYSR == null) {
            this.zzYSR = new RevisionCollection(this.zzYR6);
        }
        return this.zzYSR;
    }

    public StructuredDocumentTagCollection getStructuredDocumentTags() {
        if (this.zzXCQ == null) {
            this.zzXCQ = new StructuredDocumentTagCollection(this.zzYR6);
        }
        return this.zzXCQ;
    }

    public String getText() {
        return this.zzYR6.getText();
    }

    public void normalizeFieldTypes() {
        Iterator<Field> it = zzZQF.zzZS(this.zzYR6).iterator();
        while (it.hasNext()) {
            it.next().normalizeFieldTypes();
        }
    }

    public int replace(String str, String str2) throws Exception {
        return replace(str, str2, new FindReplaceOptions());
    }

    public Document toDocument() throws Exception {
        return zzYK5.zzZ(this);
    }

    public void unlinkFields() throws Exception {
        zzZP7.zzZt(this.zzYR6);
    }

    public void updateFields() throws Exception {
        zzZOQ.zzZs(this.zzYR6);
    }

    public int replace(Pattern pattern, String str) throws Exception {
        return zzZ(com.aspose.words.internal.zzZNR.zzZ(pattern), str);
    }

    public final int zzZ(com.aspose.words.internal.zzZNR zzznr, String str, FindReplaceOptions findReplaceOptions) throws Exception {
        if (findReplaceOptions.getLegacyMode()) {
            return new zzZNX(this.zzYR6, zzznr, str, findReplaceOptions.getReplacingCallback(), findReplaceOptions.getDirection() == 0).zzZ9D();
        }
        return new zzZNZ(this.zzYR6, zzznr, str, findReplaceOptions).zzZ9D();
    }

    public int replace(String str, String str2, FindReplaceOptions findReplaceOptions) throws Exception {
        if (findReplaceOptions.getLegacyMode()) {
            return new zzZNX(this.zzYR6, str, str2, findReplaceOptions.getMatchCase(), findReplaceOptions.getFindWholeWordsOnly()).zzZ9D();
        }
        return new zzZNZ(this.zzYR6, str, str2, findReplaceOptions).zzZ9D();
    }

    public int replace(Pattern pattern, String str, FindReplaceOptions findReplaceOptions) throws Exception {
        return zzZ(com.aspose.words.internal.zzZNR.zzZ(pattern), str, findReplaceOptions);
    }
}
