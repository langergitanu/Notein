package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOW {
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    public zzYOW(zzYOR zzyor, zzYPM zzypm) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
    }

    private static boolean zzA(Inline inline) {
        return com.aspose.words.internal.zzZKN.equals(inline.getText(), ControlChar.PAGE_BREAK) || com.aspose.words.internal.zzZKN.equals(inline.getText(), ControlChar.COLUMN_BREAK);
    }

    private static boolean zzG(Node node, int i) {
        zzYEF runPr_IInline;
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam == null || (runPr_IInline = zzzam.getRunPr_IInline()) == null) {
            return false;
        }
        return i == 1 ? runPr_IInline.getDeleteRevision() != null : i == 0 && runPr_IInline.getInsertRevision() != null && runPr_IInline.getDeleteRevision() == null;
    }

    private boolean zzRZ(boolean z) {
        return z ^ this.zzXRT.zzYsF();
    }

    private boolean zzW(Story story) {
        RevisionCollection revisions = this.zzXRT.getDocument().getRevisions();
        for (int i = 0; i < revisions.getCount(); i++) {
            Revision revision = revisions.get(i);
            if (!zzZ(revision, zzY(revision), story) && !zzZ(revisions, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean zzX(Story story) {
        Document document = this.zzXRT.getDocument();
        boolean zZzW = zzW(story);
        if (document.zzZpV().zzYWc) {
            return true;
        }
        return (document.zzZpV().zzZrN() && zZzW) || zZzW;
    }

    private boolean zzXl(Node node) {
        if (!zzG(node, 0)) {
            return true;
        }
        if (this.zzXRT.zzYs0()) {
            Inline inline = (Inline) node;
            if (inline.isInsertRevision() && inline.isDeleteRevision()) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzXm(Node node) {
        Node previousSibling = node.getPreviousSibling();
        FieldSeparator fieldSeparator = (FieldSeparator) com.aspose.words.internal.zzZKW.zzZ(previousSibling, FieldSeparator.class);
        return fieldSeparator != null && zzZOO.zzCJ(fieldSeparator.getFieldType()) && zzG(node, 1) && zzG(previousSibling, 1);
    }

    private static boolean zzXn(Node node) {
        return (node.getPreviousSibling() instanceof FieldEnd) && zzG(node, 1) && zzG(node.getPreviousSibling(), 1);
    }

    private static boolean zzXo(Node node) {
        return (node.getNextSibling() instanceof FieldStart) && zzG(node, 1) && zzG(node.getNextSibling(), 1);
    }

    private static boolean zzXp(Node node) {
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam != null) {
            return (zzzam.getRunPr_IInline().getInsertRevision() == null && zzzam.getRunPr_IInline().getDeleteRevision() == null) ? false : true;
        }
        return false;
    }

    private static Node zzXq(Node node) {
        Node nodeZzSI = node.zzSI(false);
        if (nodeZzSI == null) {
            CompositeNode parentNode = node.getParentNode();
            CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(parentNode.zzSI(false), CompositeNode.class);
            if (zzv(parentNode, false) && zzc(parentNode, compositeNode)) {
                Node lastChild = compositeNode.getLastChild();
                if (lastChild instanceof zzZAM) {
                    return lastChild;
                }
            }
        }
        return nodeZzSI;
    }

    private static boolean zzXt(Node node) {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        return inline != null && inline.zz0R() == 1 && zzA(inline);
    }

    public static boolean zzXv(Node node) {
        zzYEF runPr_IInline;
        zzZV8 deleteRevision;
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam == null || (runPr_IInline = zzzam.getRunPr_IInline()) == null || (deleteRevision = runPr_IInline.getDeleteRevision()) == null) {
            return false;
        }
        return zzZ(node, deleteRevision);
    }

    private static boolean zzXw(Node node) {
        int nodeType = node.getNodeType();
        Node nodeZzXq = zzXq(node);
        return ((nodeZzXq instanceof FieldSeparator) && zzZOO.zzCJ(((FieldSeparator) com.aspose.words.internal.zzZKW.zzZ(nodeZzXq, FieldSeparator.class)).getFieldType())) || (node instanceof FieldChar) || nodeType == 25 || (nodeZzXq != null && nodeZzXq.getNodeType() == 22);
    }

    private String zzYsW() {
        return com.aspose.words.internal.zzZKN.format("R_{0}_{1}", Integer.valueOf(this.zzXRT.zzYsx()), Integer.valueOf(this.zzXRT.zzYsy()));
    }

    private String zzYsX() {
        zzYOR zzyor = this.zzXRT;
        zzyor.zzr9(zzyor.zzYsy() + 1);
        return zzYsW();
    }

    private void zzYsY() {
        for (Revision revision : this.zzXRT.getDocument().getRevisions()) {
            if (zzW(revision)) {
                this.zzXRT.zzY(1, com.aspose.words.internal.zzZKN.format("RevisionType.{0} export is not supported for ODT format by Aspose.Words.", zzYS3.zzsy(revision.getRevisionType())), true);
            }
        }
    }

    private int zzZ(Story story, Revision revision, int i, CompositeNode compositeNode) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String strZzYsX = zzYsX();
        zzytgZzYsG.zzY("text:changed-region");
        zzytgZzYsG.zz0("xml:id", strZzYsX);
        zzytgZzYsG.zz0("text:id", strZzYsX);
        if (revision.getRevisionType() == 1) {
            i = zzZ(revision, compositeNode, i, story);
        } else if (revision.getRevisionType() == 0) {
            i = zzZ(revision, i, story);
        }
        zzytgZzYsG.zzo();
        return i;
    }

    private static boolean zzc(Node node, Node node2) {
        return (node instanceof Paragraph) && (node2 instanceof Paragraph);
    }

    private static boolean zzd(Node node, Node node2) {
        return ((node instanceof Shape) || (node2 instanceof Shape)) ? false : true;
    }

    private static boolean zze(Node node, Node node2) {
        return zzXt(node) || zzXt(node2);
    }

    private boolean zzf(Node node, Node node2) {
        zzZAM zzzam;
        zzZAM zzzam2;
        zzYEF runPr_IInline;
        zzYEF runPr_IInline2;
        zzZV8 deleteRevision;
        zzZV8 deleteRevision2;
        return (!zzG(node, 1) || (zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class)) == null || (zzzam2 = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node2, zzZAM.class)) == null || (runPr_IInline = zzzam.getRunPr_IInline()) == null || (runPr_IInline2 = zzzam2.getRunPr_IInline()) == null || (deleteRevision = runPr_IInline.getDeleteRevision()) == null || (deleteRevision2 = runPr_IInline2.getDeleteRevision()) == null || !zzZ(deleteRevision, deleteRevision2) || zzZ(node, deleteRevision) != zzZ(node2, deleteRevision2) || zze(node, node2) || this.zzXRT.zzYsp()) ? false : true;
    }

    private static boolean zzg(Node node, Node node2) {
        zzZAM zzzam;
        zzZAM zzzam2;
        zzYEF runPr_IInline;
        zzYEF runPr_IInline2;
        zzZV8 insertRevision;
        zzZV8 insertRevision2;
        return (!zzG(node2, 0) || (zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class)) == null || (zzzam2 = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node2, zzZAM.class)) == null || (runPr_IInline = zzzam.getRunPr_IInline()) == null || (runPr_IInline2 = zzzam2.getRunPr_IInline()) == null || (insertRevision = runPr_IInline.getInsertRevision()) == null || (insertRevision2 = runPr_IInline2.getInsertRevision()) == null || !zzZ(insertRevision, insertRevision2) || !zzd(node, node2) || runPr_IInline.getDeleteRevision() != null) ? false : true;
    }

    private static boolean zzv(Node node, boolean z) {
        if (node.zz9I()) {
            return false;
        }
        node.zzYB3();
        return true;
    }

    public final void zzXr(Node node) {
        if (zzXl(node) || zzg(node, node.getNextSibling())) {
            return;
        }
        if (!(node instanceof FieldEnd) || zzg(node.getPreviousSibling(), node)) {
            this.zzXRT.zzYsG().zzGB("text:change-end");
            this.zzXRT.zzYsG().zzYs("text:change-id", this.zzXRT.zzYrZ().pop());
        }
    }

    public final void zzXs(Node node) {
        if (zzXl(node) || zzg(node.getPreviousSibling(), node)) {
            return;
        }
        if (!(node instanceof FieldEnd) || zzg(node, node.getNextSibling())) {
            String strZzYsX = zzYsX();
            this.zzXRT.zzYrZ().push(strZzYsX);
            this.zzXRT.zzYsG().zzGB("text:change-start");
            this.zzXRT.zzYsG().zzYs("text:change-id", strZzYsX);
        }
    }

    public final boolean zzXu(Node node) {
        if (!zzG(node, 1) || this.zzXRT.zzYs0() || zzXt(node)) {
            return false;
        }
        if (zzf(node.getPreviousSibling(), node)) {
            return true;
        }
        this.zzXRT.zzYsG().zzGB("text:change");
        this.zzXRT.zzYsG().zzYs("text:change-id", zzYsX());
        return true;
    }

    public final void zzY(Story story) throws Exception {
        zzYsY();
        if (zzX(story)) {
            this.zzXRT.zzr9(0);
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY("text:tracked-changes");
            zzytgZzYsG.zz0("text:track-changes", this.zzXRT.getDocument().zzZpV().zzYWc ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
            RevisionCollection revisions = this.zzXRT.getDocument().getRevisions();
            int iZzZ = 0;
            while (iZzZ < revisions.getCount()) {
                if (zzZ(revisions, iZzZ)) {
                    iZzZ++;
                }
                Revision revision = revisions.get(iZzZ);
                if (!zzW(revision)) {
                    CompositeNode compositeNodeZzY = zzY(revision);
                    if (!zzZ(revision, compositeNodeZzY, story)) {
                        iZzZ = zzZ(story, revision, iZzZ, compositeNodeZzY);
                    }
                }
                iZzZ++;
            }
            zzytgZzYsG.zzo();
            this.zzXRT.zzr9(0);
        }
    }

    public final void zzYsV() throws Exception {
        RevisionCollection revisions = this.zzXRT.getDocument().getRevisions();
        int iZzY = 0;
        while (iZzY < revisions.getCount()) {
            if (zzZ(revisions, iZzY)) {
                iZzY++;
            }
            Revision revision = revisions.get(iZzY);
            CompositeNode compositeNodeZzY = zzY(revision);
            Story storyZzXj = zzYOR.zzXj(compositeNodeZzY);
            if (zzZ(revision, compositeNodeZzY, storyZzXj) || revision.getRevisionType() != 1) {
                iZzY++;
            } else {
                this.zzXRT.zzK((Section) compositeNodeZzY.getAncestor(2));
                this.zzXRS.zzYtO();
                this.zzXRT.zzRQ(true);
                compositeNodeZzY.acceptStart(this.zzXRT);
                revision.getParentNode().accept(this.zzXRT);
                this.zzXRT.zzRQ(false);
                iZzY = zzY(revision, iZzY, storyZzXj) + 1;
            }
        }
    }

    private void zzX(Revision revision) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("office:change-info");
        zzytgZzYsG.zzZ("dc:creator", revision.getAuthor());
        zzytgZzYsG.zzZ("dc:date", com.aspose.words.internal.zzJB.zzQ(revision.zzYly()));
        zzytgZzYsG.zzo();
    }

    private static boolean zzW(Revision revision) {
        return revision.getRevisionType() == 2 || revision.getRevisionType() == 4 || revision.getRevisionType() == 3;
    }

    private static boolean zzZ(RevisionCollection revisionCollection, int i) {
        if (i >= revisionCollection.getCount() - 1) {
            return false;
        }
        int i2 = i + 1;
        return (revisionCollection.get(i2).getParentNode() != revisionCollection.get(i).getParentNode() || zzW(revisionCollection.get(i2)) || zzW(revisionCollection.get(i))) ? false : true;
    }

    private int zzZ(Revision revision, int i, Story story) throws Exception {
        this.zzXRT.zzYsG().zzY("text:insertion");
        zzX(revision);
        this.zzXRT.zzYsG().zzo();
        return zzY(revision, i, story);
    }

    private int zzY(Revision revision, int i, Story story) throws Exception {
        RevisionCollection revisions = this.zzXRT.getDocument().getRevisions();
        Revision revision2 = revision;
        CompositeNode compositeNodeZzY = zzY(revision);
        while (i < revisions.getCount() - 1) {
            int i2 = i + 1;
            if (zzZ(revisions, i2)) {
                i = i2;
            }
            int i3 = i + 1;
            Revision revision3 = revisions.get(i3);
            CompositeNode compositeNodeZzY2 = zzY(revision3);
            Revision revision4 = revision;
            Story story2 = story;
            if (zzZ(revision4, compositeNodeZzY, revision3, compositeNodeZzY2, revision2, story2)) {
                return i;
            }
            if (zzG(revision3.getParentNode(), 1) && !zzZ(revision3)) {
                this.zzXRT.zzRQ(true);
                revision3.getParentNode().accept(this.zzXRT);
                this.zzXRT.zzRQ(false);
            }
            revision = revision4;
            revision2 = revision3;
            compositeNodeZzY = compositeNodeZzY2;
            story = story2;
            i = i3;
        }
        return i;
    }

    private int zzZ(Revision revision, CompositeNode compositeNode, int i, Story story) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("text:deletion");
        zzX(revision);
        int iZzYsC = this.zzXRT.zzYsC();
        zzYOR zzyor = this.zzXRT;
        zzyor.zzrd(zzyor.zzYsF() ? 1 : 4);
        int iZzZ = zzZ(revision, compositeNode, i, story, zzytgZzYsG);
        this.zzXRT.zzrd(iZzYsC);
        zzytgZzYsG.zzo();
        return iZzZ;
    }

    private int zzZ(Revision revision, CompositeNode compositeNode, int i, Story story, zzYTG zzytg) throws Exception {
        this.zzXRT.zzRQ(true);
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNode, Paragraph.class);
        if (paragraph != null) {
            this.zzXRS.zzYtO();
            this.zzXRT.zzV(paragraph, this.zzXRT.zzYA(paragraph));
        } else {
            zzytg.zzY("text:p");
        }
        if (!zzZ(revision)) {
            revision.getParentNode().accept(this.zzXRT);
        }
        this.zzXRT.zzRQ(false);
        int iZzY = zzY(revision, i, story);
        zzytg.zzo();
        return iZzY;
    }

    private static CompositeNode zzY(Revision revision) {
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(revision.getParentNode(), CompositeNode.class);
        return compositeNode == null ? revision.getParentNode().getParentNode() : compositeNode;
    }

    private static boolean zzZ(Revision revision) {
        return revision.getRevisionType() == 1 && zzXw(revision.getParentNode());
    }

    private static boolean zzZ(Node node, zzZV8 zzzv8) {
        return zzzv8.getType() == 1 && zzXw(node);
    }

    private static boolean zzZ(zzZV8 zzzv8, zzZV8 zzzv82) {
        return com.aspose.words.internal.zzZKN.equals(zzzv8.getAuthor(), zzzv82.getAuthor()) && com.aspose.words.internal.zzZQ9.zzZ(zzzv8.zzZx(), zzzv82.zzZx()) && zzzv8.getType() == zzzv82.getType();
    }

    private boolean zzZ(Revision revision, CompositeNode compositeNode, Story story) {
        Node parentNode = revision.getParentNode();
        if (zzZ(compositeNode, story)) {
            return !(!(parentNode instanceof FieldEnd) || zzg(parentNode, parentNode.getPreviousSibling()) || zzg(parentNode, parentNode.getNextSibling())) || zzW(revision) || zzXt(parentNode) || zzZ(revision) || (parentNode instanceof Shape) || !revision.isInline();
        }
        return true;
    }

    private boolean zzZ(CompositeNode compositeNode, Story story) {
        boolean zZzXk = zzYOR.zzXk(compositeNode);
        if (zzYOR.zzXj(compositeNode) == story || !(story instanceof HeaderFooter)) {
            return compositeNode == null || !zzRZ(zZzXk);
        }
        return false;
    }

    private boolean zzZ(Revision revision, CompositeNode compositeNode, Revision revision2, CompositeNode compositeNode2, Revision revision3, Story story) {
        return zzZ(revision, compositeNode, story) || zzXo(revision3.getParentNode()) || zzXm(revision2.getParentNode()) || zzXn(revision2.getParentNode()) || !zzXp(revision2.getParentNode().getPreviousSibling()) || zzZ(revision, compositeNode, revision2, compositeNode2);
    }

    private static boolean zzZ(Revision revision, CompositeNode compositeNode, Revision revision2, CompositeNode compositeNode2) {
        if (zzW(revision2)) {
            return false;
        }
        return (compositeNode2 == compositeNode && revision2.getRevisionType() == revision.getRevisionType() && (!(!com.aspose.words.internal.zzZKN.equals(revision2.getAuthor(), revision.getAuthor()) || !com.aspose.words.internal.zzZQ9.zzZ(revision2.zzYly(), revision.zzYly())) || (!(zzG(revision.getParentNode(), 0) && zzG(revision2.getParentNode(), 0)) && !(zzG(revision.getParentNode(), 1) && zzG(revision2.getParentNode(), 1))))) ? false : true;
    }
}
