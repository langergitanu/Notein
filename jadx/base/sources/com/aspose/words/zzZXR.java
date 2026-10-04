package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import com.aspose.words.ref.Ref;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZXR extends DocumentVisitor implements zzZ8U, zzZ9W {
    private zzZXF zzYOA;
    private zzZY6 zzYOB;
    private zzZXL zzYOF;
    private zzZWP zzYOG;
    private zzYUD zzYOH;
    private zzZW2 zzYOI;
    private ShapeBase zzYOJ;
    private int zzYOK;
    protected zzYDW zzYOL;
    private com.aspose.words.internal.zz77 zzYOU;
    private com.aspose.words.internal.zzD3<String> zzYOu;
    private int zzYOv;
    private int zzYOw;
    private Section zzYOx;
    private Paragraph zzYOy;
    private zzZXF zzYOz;
    private zzZYD zzYPf;
    private IWarningCallback zzZG0;
    private DocumentBase zzZG3;
    private int zzkw;
    private com.aspose.words.internal.zzZYI zzYOE = new com.aspose.words.internal.zzZYI(false);
    private com.aspose.words.internal.zzD4 zzYOD = new com.aspose.words.internal.zzD4();
    private com.aspose.words.internal.zzZQC<zzZYD> zzYOC = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zz7D<Paragraph> zzYOt = new com.aspose.words.internal.zz7D<>();
    private com.aspose.words.internal.zzZQC<Shape> zzYOs = new com.aspose.words.internal.zzZQC<>();
    private HashMap<Paragraph, com.aspose.words.internal.zzZQC<String>> zzYOr = new HashMap<>();
    private com.aspose.words.internal.zzD3<StructuredDocumentTagRangeStart> zzYOq = new com.aspose.words.internal.zzD3<>();

    public zzZXR(zzZW2 zzzw2, DocumentBase documentBase, IWarningCallback iWarningCallback) {
        this.zzYOI = zzzw2;
        this.zzZG3 = documentBase;
        this.zzYOH = new zzYUD(this.zzZG3.getStyles());
        zzZWP zzzwp = new zzZWP(this);
        this.zzYOG = zzzwp;
        this.zzYOF = new zzZXL(this, zzzwp);
        this.zzZG0 = iWarningCallback;
    }

    private int zzFu(int i) {
        int i2 = this.zzYOD.get(i);
        if (!com.aspose.words.internal.zzD4.zzWm(i2)) {
            return i2;
        }
        int iZzZpW = zzZpW();
        this.zzYOD.set(i, iZzZpW);
        return iZzZpW;
    }

    private void zzI(Shape shape) throws Exception {
        shape.zzY9H();
        shape.zzYrB();
        this.zzYPf.zzY("w:control");
        int iZzNG = zzNG(this.zzYOI.zzZmp().zzZkB());
        Ref<String> ref = new Ref<>(null);
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYOI.zzZmf().zzZ(this.zzYPf.zzZmN(), com.aspose.words.internal.zzZKN.format("/word/activeX/activeX{0}.xml", Integer.valueOf(iZzNG)), "application/vnd.ms-office.activeX+xml", this.zzYOI.zzZmp().zzZkB(), ref);
        String str = ref.get();
        String strZzZ = shape.zzYbs() ? zzZ(shape, zz77VarZzZ) : zzZ(shape, zz77VarZzZ, iZzNG);
        this.zzYPf.zz0("r:id", str);
        this.zzYPf.zzX("w:name", strZzZ);
        this.zzYPf.zzX("w:shapeid", zzYU3.zzZR(shape));
        this.zzYPf.zzo();
    }

    private void zzJ(Shape shape) throws Exception {
        shape.zzY9I();
        OleFormat oleFormat = shape.getOleFormat();
        this.zzYPf.zzY("o:OLEObject");
        this.zzYPf.zz0("Type", oleFormat.zzYry() ? "Embed" : HttpHeaders.LINK);
        this.zzYPf.zz0("ProgID", oleFormat.getProgId());
        this.zzYPf.zz0("ShapeID", zzY23.zzXZ(shape));
        this.zzYPf.zz0("DrawAspect", oleFormat.getOleIcon() ? "Icon" : "Content");
        if (oleFormat.zzYry()) {
            this.zzYPf.zz0("ObjectID", zzYO6.zzX(oleFormat.zzYrB()));
            if (oleFormat.getOleObject() != null) {
                zzZ(oleFormat);
            } else if (oleFormat.zzYrA() != null) {
                zzY(oleFormat);
            }
        } else {
            this.zzYPf.zz0("r:id", this.zzYPf.zzZmN().zzxn().zzZ(this.zzYOI.zzZmp().zzZkC(), com.aspose.words.internal.zzZYD.zzXk(oleFormat.getSourceItem()) ? com.aspose.words.internal.zzZKN.format("{0}!{1}", oleFormat.getSourceFullName(), oleFormat.getSourceItem()) : oleFormat.getSourceFullName(), true));
            this.zzYPf.zz0("UpdateMode", oleFormat.getAutoUpdate() ? "Always" : "OnCall");
            this.zzYPf.zzZ("o:LinkType", zzY30.zzj7(oleFormat.zzZf9()));
            this.zzYPf.zze("o:LockedField", oleFormat.isLocked());
            this.zzYPf.zzZ("o:FieldCodes", "\\f " + oleFormat.zzZfa());
        }
        this.zzYPf.zzo();
    }

    private void zzK(Shape shape) throws Exception {
        shape.zzZid();
        int shapeType = shape.getShapeType();
        if (shapeType == -2) {
            zzJ(shape);
        } else {
            if (shapeType != 201) {
                return;
            }
            zzI(shape);
        }
    }

    private static boolean zzS(Comment comment) {
        return comment.getParentNode().getNodeType() != 7;
    }

    private void zzX(zzYX6 zzyx6) {
        this.zzYPf.zzZj("w:id", zzFu(zzyx6.getId()));
        this.zzYPf.zz0("w:author", zzyx6.getAuthor());
        this.zzYPf.zzU("w:date", zzyx6.zzkT());
        this.zzYPf.zz0("w:name", zzyx6.getName());
        zzZ((zzZCT) zzyx6);
        if (zzyx6.isColumn()) {
            this.zzYPf.zzZj("w:colFirst", zzyx6.getFirstColumn());
            this.zzYPf.zzZj("w:colLast", zzyx6.getLastColumn());
        }
    }

    private boolean zzZlW() {
        String contentType = this.zzYPf.zzZmN().getContentType();
        return "application/vnd.openxmlformats-officedocument.wordprocessingml.comments+xml".equals(contentType) || "application/vnd.openxmlformats-officedocument.wordprocessingml.header+xml".equals(contentType) || "application/vnd.openxmlformats-officedocument.wordprocessingml.footer+xml".equals(contentType);
    }

    private int zzZlY() {
        int i = this.zzYOv + 1;
        this.zzYOv = i;
        return i;
    }

    private int zzZlZ() {
        int i = this.zzYOw + 1;
        this.zzYOw = i;
        return i;
    }

    private static boolean zzZy(Object obj) {
        return obj == null || (obj instanceof zz4W);
    }

    public static String zzk(ShapeBase shapeBase) {
        if (shapeBase.getMarkupLanguage() == 1) {
            return "v";
        }
        switch (shapeBase.zzY9i().zzZHY()) {
            case 8:
                return "wps";
            case 9:
                return "wpg";
            case 10:
                return "wpc";
            case 11:
                return "wpi";
            case 12:
            default:
                throw new IllegalArgumentException("Unexpected DrawingML type.");
            case 13:
                return "cx1";
        }
    }

    private boolean zzl(ShapeBase shapeBase) {
        return shapeBase.isTopLevel() && shapeBase.zzY9n() != null && getCompliance() == 2;
    }

    private void zzm(ShapeBase shapeBase) throws Exception {
        this.zzYPf.zzp();
        if (zzl(shapeBase)) {
            zzo(shapeBase);
            this.zzYOG.zzT(shapeBase.zzZYh());
        } else if (this.zzYOK == 0) {
            this.zzYOG.zzT(shapeBase.zzZYh());
        }
    }

    private void zzn(ShapeBase shapeBase) throws Exception {
        if (zzl(shapeBase)) {
            this.zzYOG.zzZ(shapeBase.zzZYh(), shapeBase, true);
            zzp(shapeBase);
        } else if (this.zzYOK == 0) {
            this.zzYOG.zzZ(shapeBase.zzZYh(), shapeBase, false);
        }
        if (shapeBase.isInline() && (shapeBase.zzY9H() || shapeBase.zzY9I())) {
            this.zzYPf.zzY("w:object");
        } else {
            this.zzYPf.zzY("w:pict");
        }
    }

    @ReservedForInternalUse
    @Deprecated
    private int zzq(ShapeBase shapeBase) throws Exception {
        zz8H.zzS(shapeBase, this);
        if (shapeBase.isTopLevel()) {
            if (zz00.zzZ(shapeBase, getCompliance())) {
                zzo(shapeBase);
                this.zzYOG.zzT(shapeBase.zzZYh());
            } else if (this.zzYOK == 0) {
                this.zzYOG.zzT(shapeBase.zzZYh());
            }
        }
        if (shapeBase.zzY9i().zzZHY() != 6 && shapeBase.zzY9i().zzZHY() != 13) {
            return 0;
        }
        this.zzYOJ = null;
        return 0;
    }

    @ReservedForInternalUse
    @Deprecated
    private int zzr(ShapeBase shapeBase) throws Exception {
        ShapeBase shapeBase2 = this.zzYOJ;
        if (shapeBase2 != null && (shapeBase != shapeBase2.zzY9n() || !zz00.zzv(this.zzYOJ))) {
            return 1;
        }
        if (shapeBase.zzY9i().zzZHY() == 6 || shapeBase.zzY9i().zzZHY() == 13) {
            this.zzYOJ = shapeBase;
        }
        if (shapeBase.isTopLevel()) {
            if (zz00.zzZ(shapeBase, getCompliance())) {
                this.zzYOG.zzZ(shapeBase.zzZYh(), shapeBase, true);
                zzp(shapeBase);
            } else if (this.zzYOK == 0) {
                this.zzYOG.zzZ(shapeBase.zzZYh(), shapeBase, true);
            }
        }
        zz8H.zzZ(shapeBase, this);
        return 0;
    }

    private void zzx(Paragraph paragraph) throws Exception {
        boolean zZzY = zzYUU.zzY(paragraph.zzZYj(), this);
        boolean z = true;
        boolean z2 = zZzY || zzZWR.zzZkh().zzZ(paragraph.zzYp5(), paragraph, zZzY ^ true, this);
        if (paragraph == this.zzYOy && !this.zzYOx.zzYB3()) {
            if (z2) {
                z = z2;
            } else {
                this.zzYPf.zzY("w:pPr");
            }
            zzYUJ.zzZ(this.zzYOx, this);
            z2 = z;
        }
        if (z2) {
            this.zzYPf.zzo();
        }
    }

    @Override // com.aspose.words.zzZ9W
    public final int getCompliance() {
        return zzYO3.zzZ(this.zzYOI.zzZqS().zzYfy.zzZqn(), zzZlS());
    }

    public final Section getCurrentSection() {
        return this.zzYOx;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public DocumentBase getDocument() {
        return this.zzZG3;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) {
        this.zzYPf.zzY("w:r");
        this.zzYPf.zzY("w:ptab");
        this.zzYPf.zz0("w:relativeTo", zzZXP.zzEP(absolutePositionTab.zzc1()));
        this.zzYPf.zz0("w:alignment", zzZXP.zzER(absolutePositionTab.getAlignment()));
        this.zzYPf.zz0("w:leader", zzZXP.zzEQ(absolutePositionTab.zzc0()));
        this.zzYPf.zzo();
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        int i = this.zzYOE.get(zzY3.zzZ(bookmarkEnd));
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            throw new IllegalStateException();
        }
        this.zzYPf.zzY("w:bookmarkEnd");
        this.zzYPf.zzZj("w:id", i);
        zzZ(bookmarkEnd);
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitBookmarkStart(BookmarkStart bookmarkStart) {
        int i;
        String strZzZ = zzY3.zzZ(bookmarkStart);
        if (this.zzYOE.containsKey(strZzZ)) {
            i = this.zzYOE.get(strZzZ);
        } else {
            int iZzZpW = zzZpW();
            this.zzYOE.add(strZzZ, iZzZpW);
            i = iZzZpW;
        }
        this.zzYPf.zzY("w:bookmarkStart");
        this.zzYPf.zzZj("w:id", i);
        this.zzYPf.zzX("w:name", bookmarkStart.getName());
        if (bookmarkStart.isColumn()) {
            this.zzYPf.zzZj("w:colFirst", bookmarkStart.getFirstColumn());
            this.zzYPf.zzZj("w:colLast", bookmarkStart.getLastColumn());
        }
        zzZ(bookmarkStart);
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitCellEnd(Cell cell) {
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitCellStart(Cell cell) throws Exception {
        this.zzYPf.zzY("w:tc");
        zzYVE.zzZ(cell.zz6G(), this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitCommentEnd(Comment comment) {
        this.zzYOB.zzZmI();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        zzV(commentRangeEnd, "w:commentRangeEnd");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        zzV(commentRangeStart, "w:commentRangeStart");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitCommentStart(Comment comment) throws Exception {
        if (!zzS(comment)) {
            return 1;
        }
        int iZzFu = zzFu(comment.getId());
        this.zzYOG.zzZ(comment.zzZYh(), comment.zzZYh(), true);
        zzZX("w:commentReference", iZzFu);
        this.zzYOG.zzT(comment.zzZYh());
        if (this.zzYOB == null) {
            this.zzYOB = new zzZY6(this);
        }
        this.zzYOB.zzZ(comment, iZzFu);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        zzV(editableRangeEnd, "w:permEnd");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        this.zzYPf.zzY("w:permStart");
        this.zzYPf.zzZj("w:id", zzFu(editableRangeStart.getId()));
        zzZ(editableRangeStart);
        if (editableRangeStart.isColumn()) {
            this.zzYPf.zzZj("w:colFirst", editableRangeStart.getFirstColumn());
            this.zzYPf.zzZj("w:colLast", editableRangeStart.getLastColumn());
        }
        this.zzYPf.zz0("w:ed", editableRangeStart.getSingleUser());
        this.zzYPf.zz0("w:edGrp", zzZXQ.zzFh(editableRangeStart.getEditorGroup()));
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        this.zzYOF.zzP(fieldEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        this.zzYOF.zzP(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitFieldStart(FieldStart fieldStart) throws Exception {
        this.zzYOF.zzP(fieldStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitFootnoteEnd(Footnote footnote) throws Exception {
        zzZXF zzzxf;
        String str;
        int footnoteType = footnote.getFootnoteType();
        if (footnoteType == 0) {
            zzzxf = this.zzYOA;
            str = "w:footnoteReference";
        } else {
            if (footnoteType != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            zzzxf = this.zzYOz;
            str = "w:endnoteReference";
        }
        int iZzZlM = zzzxf.zzZlM();
        this.zzYPf.zzY(str);
        this.zzYPf.zzw("w:customMarkFollows", true ^ footnote.isAuto());
        this.zzYPf.zzZj("w:id", iZzZlM);
        this.zzYPf.zzo();
        if (!footnote.isAuto()) {
            zzZ(this.zzYPf, footnote);
        }
        this.zzYOG.zzT(footnote.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitFootnoteStart(Footnote footnote) throws Exception {
        this.zzYOG.zzZ(footnote.zzZYh(), footnote.zzZYh(), false);
        int footnoteType = footnote.getFootnoteType();
        if (footnoteType == 0) {
            this.zzYOG.zzEC(0);
            this.zzYOA.zzEI(-1);
        } else {
            if (footnoteType != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            this.zzYOG.zzEC(1);
            this.zzYOz.zzEI(-1);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitGroupShapeEnd(GroupShape groupShape) throws Exception {
        if (groupShape.getMarkupLanguage() == 0) {
            return zzq(groupShape);
        }
        zzY27.zzZ(groupShape, this.zzYPf);
        this.zzYPf.zzo();
        if (!groupShape.isTopLevel()) {
            return 0;
        }
        zzm(groupShape);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        if (groupShape.getMarkupLanguage() == 0) {
            return zzr(groupShape);
        }
        if (groupShape.isTopLevel()) {
            zzn(groupShape);
        }
        zzY27.zzZ(groupShape, false, this.zzYPf, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitOfficeMathEnd(OfficeMath officeMath) {
        zzZX6.zzZ(this.zzYPf);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        zzZX6.zzZ(officeMath.zzZsL(), officeMath.zzZYh(), this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitParagraphEnd(Paragraph paragraph) throws Exception {
        com.aspose.words.internal.zzZQC zzzqc = (com.aspose.words.internal.zzZQC) com.aspose.words.internal.zzQW.zzZ(this.zzYOr, paragraph);
        if (zzzqc != null) {
            while (zzzqc.size() > 0) {
                zzZYD zzzyd = this.zzYPf;
                zzzqc.pop();
                zzzyd.zzo();
            }
        }
        this.zzYPf.zzo();
        zzYDW zzydw = this.zzYOL;
        if (zzydw == null) {
            return 0;
        }
        zzydw.zzYd0();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitParagraphStart(Paragraph paragraph) throws Exception {
        this.zzYPf.zzY("w:p");
        this.zzYPf.zzNT(zzYU3.zzZl(paragraph.zzYp5().get(40)));
        zzZYD zzzyd = this.zzYPf;
        zzzyd.zz0("w:rsidR", zzzyd.zzZmL());
        this.zzYPf.zz0("w:rsidRPr", zzYU3.zzZl(paragraph.zzYp5().get(30)));
        this.zzYPf.zz0("w:rsidP", zzYU3.zzZl(paragraph.zzZYj().get(1580)));
        if (getCompliance() != 0) {
            if (this.zzYOt.containsKey(paragraph)) {
                this.zzYPf.zz0("w14:paraId", zzYU3.zzsV(this.zzYOt.get(paragraph)));
            } else if (zzZlS().zzYqY()) {
                if (paragraph.zzYoR() > 0) {
                    this.zzYPf.zz0("w14:paraId", zzYU3.zzsV(paragraph.zzYoR()));
                }
                if (paragraph.zzYoQ() > 0) {
                    this.zzYPf.zz0("w14:textId", zzYU3.zzsV(paragraph.zzYoQ()));
                }
            }
        }
        zzx(paragraph);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitRowEnd(Row row) {
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitRowStart(Row row) throws Exception {
        this.zzYPf.zzY("w:tr");
        if (getCompliance() != 0 && zzZlS().zzYqY()) {
            if (row.zzYoR() > 0) {
                this.zzYPf.zz0("w14:paraId", zzYU3.zzsV(row.zzYoR()));
            }
            if (row.zzYoQ() > 0) {
                this.zzYPf.zz0("w14:textId", zzYU3.zzsV(row.zzYoQ()));
            }
        }
        zzY6G zzy6g = (zzY6G) row.zzZYf().zzbn();
        if (!row.isFirstRow()) {
            zzZ(row.getParentTable().getFirstRow().zzZYf(), zzy6g);
        }
        zzYUR.zzZ(zzy6g, false, false, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitRun(Run run) throws Exception {
        if (this.zzYOF.zzYyP()) {
            return 0;
        }
        this.zzYOG.zzY(run);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitShapeEnd(Shape shape) throws Exception {
        if (this.zzYOs.size() > 0) {
            return zzq(this.zzYOs.pop());
        }
        if (shape.getMarkupLanguage() == 0) {
            return zzq(shape);
        }
        if (shape.hasChildNodes()) {
            this.zzYPf.zzo();
            this.zzYPf.zzo();
        }
        zzY27.zzZ(shape, this.zzYPf);
        this.zzYPf.zzp();
        if (shape.zzZid()) {
            zzK(shape);
        }
        if (shape.isTopLevel()) {
            zzm(shape);
        }
        if (!shape.zzY9C()) {
            return 0;
        }
        this.zzYOF.zzZlN();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitShapeStart(Shape shape) throws Exception {
        if (shape.getMarkupLanguage() == 0) {
            if (!com.aspose.words.internal.zzZYD.zzXk(shape.getHRef()) && this.zzYOF.zzZlT() && this.zzYOF.zzg(shape)) {
                shape = this.zzYOF.zzH(shape);
            }
            return zzr(shape);
        }
        boolean zZzZYL = this.zzZG3.zzZpV().zzYVg.zzZYL() & (getCompliance() != 0);
        if (shape.isTopLevel() && shape.isImage() && shape.hasImage() && !shape.zzY9f() && zZzZYL) {
            Shape shape2 = (Shape) zzY2A.zzZ(shape, false, false, this.zzYOI.zzZqS());
            this.zzYOs.push(shape2);
            return zzr(shape2);
        }
        if (shape.zzY9C()) {
            this.zzYOF.zzi(shape);
        }
        if (shape.isTopLevel()) {
            zzn(shape);
        }
        zzY27.zzZ(shape, false, this.zzYPf, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitSmartTagEnd(SmartTag smartTag) {
        this.zzYPf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitSmartTagStart(SmartTag smartTag) {
        zzZWI.zzZ(smartTag, this.zzYPf);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitSpecialChar(SpecialChar specialChar) throws Exception {
        if (zzZlS().getKeepLegacyControlChars() && com.aspose.words.internal.zzZKN.equals(specialChar.getText(), ControlChar.zzZs4)) {
            zzZ(specialChar);
            return 0;
        }
        this.zzYOG.zzY(specialChar);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitStructuredDocumentTagEnd(StructuredDocumentTag structuredDocumentTag) throws Exception {
        zzZWN.zzY(structuredDocumentTag, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitStructuredDocumentTagRangeEnd(StructuredDocumentTagRangeEnd structuredDocumentTagRangeEnd) throws Exception {
        StructuredDocumentTagRangeStart structuredDocumentTagRangeStart = this.zzYOq.get(structuredDocumentTagRangeEnd.getId());
        StructuredDocumentTag structuredDocumentTagZzYcK = structuredDocumentTagRangeStart != null ? structuredDocumentTagRangeStart.zzYcK() : null;
        if (!com.aspose.words.internal.zzZ4.zzY(structuredDocumentTagZzYcK, structuredDocumentTagRangeStart) || !StructuredDocumentTag.zz5(structuredDocumentTagRangeStart, structuredDocumentTagRangeEnd)) {
            return 0;
        }
        zzZWN.zzY(structuredDocumentTagZzYcK, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitStructuredDocumentTagRangeStart(StructuredDocumentTagRangeStart structuredDocumentTagRangeStart) throws Exception {
        StructuredDocumentTag structuredDocumentTagZzYcK = structuredDocumentTagRangeStart.zzYcK();
        StructuredDocumentTagRangeEnd rangeEnd = structuredDocumentTagRangeStart.getRangeEnd();
        if (!com.aspose.words.internal.zzZ4.zzY(structuredDocumentTagZzYcK, rangeEnd) || !StructuredDocumentTag.zz5(structuredDocumentTagRangeStart, rangeEnd)) {
            return 0;
        }
        zzZWN.zzZ(structuredDocumentTagZzYcK, this);
        this.zzYOq.add(structuredDocumentTagRangeStart.getId(), structuredDocumentTagRangeStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        zzZWN.zzZ(structuredDocumentTag, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitSubDocument(SubDocument subDocument) {
        this.zzYPf.zzZj("w:subDoc", this.zzYOI.zzZmf().zzZ((com.aspose.words.internal.zz77) null, this.zzYOI.zzZmp().zzZkX()).zzxn().zzZ(this.zzYOI.zzZmp().zzZkE(), com.aspose.words.internal.zzZVR.zzWv(subDocument.getFileName()), true));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitTableEnd(Table table) {
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitTableStart(Table table) throws Exception {
        this.zzYPf.zzY("w:tbl");
        zzYUR.zzZ(table.getFirstRow().zzZYf(), true, false, this);
        table.zzXZZ();
        zzYUA.zzZ(this.zzYPf, table);
        return 0;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final String zzFs(int i) {
        return this.zzYOH.zzFs(i);
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzFt(int i) {
        if (this.zzYOu == null) {
            this.zzYOu = new com.aspose.words.internal.zzD3<>();
            Iterator<T> it = getDocument().getChildNodes(18, true).iterator();
            while (it.hasNext()) {
                String name = ((ShapeBase) it.next()).getName();
                if (com.aspose.words.internal.zzZKN.zzS(name, "_s", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    this.zzYOu.set(zzY23.zzyW(name), name);
                }
            }
        }
        return this.zzYOu.get(i);
    }

    public final int zzFv(int i) {
        while (true) {
            int iHashCode = com.aspose.words.internal.zzZZS.zzY(new Object[0]).hashCode() & Integer.MAX_VALUE;
            if (iHashCode != 0) {
                com.aspose.words.internal.zzIM zzim = (com.aspose.words.internal.zzIM) this.zzYOI.zzZqS().zzXoS[i];
                if (!zzim.contains(Integer.valueOf(iHashCode))) {
                    zzim.add(Integer.valueOf(iHashCode));
                    return iHashCode;
                }
            }
        }
    }

    public final void zzIg() throws Exception {
        this.zzYOU = zzZma();
        this.zzYOA = new zzZXF(0, this);
        this.zzYOz = new zzZXF(1, this);
        zzZWK.zzU(this);
        zzZW3.zzY(this, this.zzYOI.zzZqS().zzXoX);
        zzZXH.zzU(this);
        zzY(new zzZYD(this.zzYOU, zzZlS().getPrettyFormat(), getCompliance(), zzZlO(), this.zzZG0));
        zzZm8();
        zzZX2.zzU(this);
        zzZWF.zzU(this);
        zzZWY.zzU(this);
        zzZY6 zzzy6 = this.zzYOB;
        if (zzzy6 != null) {
            zzzy6.close();
        }
        this.zzYOA.close();
        this.zzYOz.close();
        zzZlX();
    }

    public final String zzNE(String str) {
        return this.zzYPf.zzZmN().zzxn().zzZ(this.zzYOI.zzZmp().zzZkC(), str, true);
    }

    public final String zzNF(String str) {
        return this.zzYPf.zzZmN().zzxn().zzZ(this.zzYOI.zzZmp().zzZkA(), str, !com.aspose.words.internal.zzZVR.zzWw(str));
    }

    public final int zzNG(String str) {
        return this.zzYOI.zzNG(str);
    }

    @Override // com.aspose.words.zzZ8U
    @ReservedForInternalUse
    @Deprecated
    public final String zzNH(String str) {
        return this.zzYPf.zzZmN().zzxn().zzZ(this.zzYOI.zzZmp().zzZkD(), com.aspose.words.internal.zzZVR.zzWv(str), true);
    }

    @Override // com.aspose.words.zzZ9W
    public final void zzT(int i, String str) {
        zzZ(i, 13, str);
    }

    public final void zzV(CompositeNode compositeNode) throws Exception {
        for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            Section section = (Section) firstChild;
            this.zzYOx = section;
            this.zzYOy = section.getBody().getLastParagraph();
            this.zzYOx.getBody().accept(this);
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public final int zzY(zzYX6 zzyx6) {
        this.zzYPf.zzY("w:moveToRangeStart");
        zzX(zzyx6);
        this.zzYPf.zzo();
        return 0;
    }

    @Override // com.aspose.words.zzZ8U
    @ReservedForInternalUse
    @Deprecated
    public final String zzYn(byte[] bArr) throws Exception {
        String strZzYl = this.zzYOI.zzYl(bArr);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzYl)) {
            int iZzZU = com.aspose.words.internal.zzEF.zzZU(bArr);
            if (iZzZU == 0 && com.aspose.words.internal.zzEF.zzZM(bArr)) {
                bArr = com.aspose.words.internal.zzEF.zzZ(new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr)), bArr.length);
                iZzZU = 7;
            } else if (iZzZU == 4) {
                bArr = zzY23.zzXF(bArr);
            }
            com.aspose.words.internal.zz77 zz77VarZzZ = zzZ(iZzZU, bArr, "/word/media/image" + zzNG(this.zzYOI.zzZmp().zzZkD()));
            this.zzYOI.zzZmf().zzxo().zzY(zz77VarZzZ);
            strZzYl = zz77VarZzZ.getName();
            this.zzYOI.zzS(bArr, strZzYl);
        }
        return this.zzYPf.zzZmN().zzxn().zzZ(this.zzYOI.zzZmp().zzZkD(), strZzYl, false);
    }

    public final void zzZ(int i, int i2, String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, i, i2, str);
        }
    }

    public final void zzZX(String str, int i) {
        this.zzYPf.zzY(str);
        this.zzYPf.zzZj("w:id", i);
        this.zzYPf.zzo();
    }

    public final int zzZlO() {
        Document document = this.zzYOI.zzZqS().zzYfy;
        if (document.zzZqn() != null) {
            return document.zzZqn().zzZlO();
        }
        return 0;
    }

    public final com.aspose.words.internal.zz7D<Paragraph> zzZlP() {
        return this.zzYOt;
    }

    public final zzZW2 zzZlQ() {
        return this.zzYOI;
    }

    public final zzZX5 zzZlR() {
        return this.zzYOI.zzZlR();
    }

    public final OoxmlSaveOptions zzZlS() {
        return (OoxmlSaveOptions) this.zzYOI.zzZqS().zzXpa;
    }

    @Override // com.aspose.words.zzZ8U
    public final boolean zzZlT() {
        return this.zzYOF.zzZlT();
    }

    public final boolean zzZlU() {
        return this.zzYOF.zzZlU();
    }

    public final zzZYD zzZlV() {
        return this.zzYPf;
    }

    public final void zzZlX() {
        if (zzZlW()) {
            this.zzYOF.zzYyQ();
        }
        this.zzYPf = this.zzYOC.pop();
    }

    @Override // com.aspose.words.zzZ9W
    public final String zzZm0() {
        return null;
    }

    @Override // com.aspose.words.zzZ9W
    public final String zzZm1() {
        return null;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final zzYU6 zzZm2() {
        return this.zzYPf;
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzZm3() {
        return "r:href";
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzZm4() {
        return "r:id";
    }

    public abstract void zzZm8() throws Exception;

    @Override // com.aspose.words.zzZ8U
    public final ArrayList<String> zzZmM() {
        return this.zzYPf.zzZmM();
    }

    public abstract com.aspose.words.internal.zz77 zzZma() throws Exception;

    public final com.aspose.words.internal.zz77 zzZme() {
        return this.zzYOU;
    }

    public final com.aspose.words.internal.zz78 zzZmf() {
        return this.zzYOI.zzZmf();
    }

    @Override // com.aspose.words.zzZ8U, com.aspose.words.zzZ9W
    public final boolean zzZmh() {
        return true;
    }

    public final zzZWV zzZmp() {
        return this.zzYOI.zzZmp();
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final int zzZpW() {
        int i = this.zzkw;
        this.zzkw = i + 1;
        return i;
    }

    @Override // com.aspose.words.zzZ8U
    @ReservedForInternalUse
    @Deprecated
    public final zzYDZ zzZqS() {
        return this.zzYOI.zzZqS();
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzf(com.aspose.words.internal.zzPV zzpv) {
        String strZzf = zzY35.zzf(zzpv);
        if (strZzf == null) {
            zzT(256, com.aspose.words.internal.zzZKN.format("Unsupported color type encountered during {0} export: {1}.", "DOCX", com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("0x", com.aspose.words.internal.zzJB.zzWs(new com.aspose.words.internal.zzPV((~zzpv.zzPD()) & 255, zzpv).toArgb()))));
        }
        return strZzf;
    }

    public final void zzo(ShapeBase shapeBase) throws Exception {
        ShapeBase shapeBaseZzY;
        this.zzYPf.zzo();
        this.zzYPf.zzY("mc:Fallback");
        this.zzYOK++;
        if (shapeBase.zzY9n() != null) {
            shapeBase.zzY9n().accept(this);
        } else if (shapeBase.getMarkupLanguage() == 0 && (shapeBaseZzY = zz00.zzY(shapeBase, this.zzYOI.zzZqS(), true)) != null) {
            shapeBaseZzY.accept(this);
        }
        this.zzYPf.zzo();
        this.zzYOK--;
        this.zzYPf.zzo();
    }

    public final void zzp(ShapeBase shapeBase) {
        this.zzYPf.zzY("mc:AlternateContent");
        this.zzYPf.zzY("mc:Choice");
        this.zzYPf.zz0("Requires", zzk(shapeBase));
    }

    public final com.aspose.words.internal.zzZQC<String> zzw(Paragraph paragraph) {
        com.aspose.words.internal.zzZQC<String> zzzqc = (com.aspose.words.internal.zzZQC) com.aspose.words.internal.zzQW.zzZ(this.zzYOr, paragraph);
        if (zzzqc != null) {
            return zzzqc;
        }
        com.aspose.words.internal.zzZQC<String> zzzqc2 = new com.aspose.words.internal.zzZQC<>();
        this.zzYOr.put(paragraph, zzzqc2);
        return zzzqc2;
    }

    public final void zzT(com.aspose.words.internal.zz77 zz77Var) {
        this.zzYOU = zz77Var;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public final int zzY(zzYX9 zzyx9) {
        zzV(zzyx9, "w:moveToRangeEnd");
        return 0;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final void zzY(zzZS zzzs, boolean z) throws Exception {
        this.zzYOA.zzY(zzzs, z);
        this.zzYOz.zzY(zzzs, z);
    }

    private static void zzZ(zzY6G zzy6g, zzY6G zzy6g2) {
        Iterator<Integer> it = zzY6G.zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Border border = (Border) zzy6g2.zzPk(iIntValue);
            Border border2 = (Border) zzy6g.zzPk(iIntValue);
            if (border == null && border2 != null && border2.getLineStyle() != 0 && !border2.isInherited()) {
                zzy6g2.zzQ(iIntValue, zzY6G.zzOt(iIntValue));
            } else if (com.aspose.words.internal.zzZKO.equals(border, border2)) {
                zzy6g2.remove(iIntValue);
            }
        }
    }

    public final void zzY(zzZYD zzzyd) {
        this.zzYOC.push(this.zzYPf);
        this.zzYPf = zzzyd;
        if (zzZlW()) {
            this.zzYOF.zzYyR();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzV(Node node, String str) {
        this.zzYPf.zzY(str);
        this.zzYPf.zzZj("w:id", zzFu(((zzZA1) node).getIdInternal()));
        zzZ((zzZCT) node);
        this.zzYPf.zzo();
    }

    private static String zzX(OleFormat oleFormat) {
        zzYO2 zzyo2ZzYrA = oleFormat.zzYrA();
        if (zzyo2ZzYrA != null && com.aspose.words.internal.zzZYD.zzXk(zzyo2ZzYrA.getContentType())) {
            return zzyo2ZzYrA.getContentType();
        }
        return zzYO6.zzD3(oleFormat.getProgId());
    }

    private void zzY(OleFormat oleFormat) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzZ(oleFormat, "ooxmlPackage", this.zzYOI.zzZmp().getPackage());
        oleFormat.zzYrA().zzR1().zzH(0L);
        com.aspose.words.internal.zzZYQ.zzX(oleFormat.zzYrA().zzR1(), zz77VarZzZ.zzR1());
        zz77VarZzZ.zzR1().zzH(0L);
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public final int zzZ(zzYX6 zzyx6) {
        this.zzYPf.zzY("w:moveFromRangeStart");
        zzX(zzyx6);
        this.zzYPf.zzo();
        return 0;
    }

    public final zzZYD zzY(com.aspose.words.internal.zz77 zz77Var, String str, String str2, String str3, Ref<String> ref) throws Exception {
        return new zzZYD(this.zzYOI.zzZmf().zzZ(zz77Var, str, str2, str3, ref), zzZlS().getPrettyFormat(), getCompliance(), zzZlO(), this.zzZG0);
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public final int zzZ(zzYX9 zzyx9) {
        zzV(zzyx9, "w:moveFromRangeEnd");
        return 0;
    }

    public static void zzZ(zzYU6 zzyu6, Footnote footnote) {
        String str;
        boolean z = false;
        if (footnote.getReferenceMark().length() == 1) {
            char cCharAt = footnote.getReferenceMark().charAt(0);
            if (cCharAt == 11) {
                zzyu6.zzZ("w:br", footnote.getReferenceMark());
                z = true;
            }
            if (cCharAt == '\t') {
                zzyu6.zzZ("w:tab", (String) null);
            } else if (com.aspose.words.internal.zzZYD.zzn(cCharAt)) {
                zzyu6.zzX("w:sym", "w:font", footnote.zzZYh().getNameAscii(), "w:char", com.aspose.words.internal.zzJB.zzWu(cCharAt));
            }
            z = true;
        }
        if (z) {
            return;
        }
        if (footnote.isDeleteRevision()) {
            str = "w:delText";
        } else if (footnote.isInsertRevision()) {
            str = "w:instrText";
        } else {
            str = "w:t";
        }
        zzyu6.zzW(str, "xml:space", "preserve");
        zzyu6.writeString(footnote.getReferenceMark());
        zzyu6.zzp();
    }

    public final zzZYD zzJ(String str, String str2, String str3) throws Exception {
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzZ = zzZ(str, str2, str3, ref);
        ref.get();
        return zzzydZzZ;
    }

    private com.aspose.words.internal.zz77 zzZ(OleFormat oleFormat, String str, String str2) throws Exception {
        String strZzX = zzX(oleFormat);
        String str3 = com.aspose.words.internal.zzZKN.format("/word/embeddings/{0}{1}{2}", str, Integer.valueOf(zzNG(str2)), zzZXP.zzNs(strZzX));
        Ref<String> ref = new Ref<>(null);
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYOI.zzZmf().zzZ(this.zzYPf.zzZmN(), str3, strZzX, str2, ref);
        this.zzYPf.zz0("r:id", ref.get());
        return zz77VarZzZ;
    }

    private static String zzZ(ShapeBase shapeBase, com.aspose.words.internal.zz77 zz77Var) throws Exception {
        zzYO2 zzyo2 = (zzYO2) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzYrB(), zzYO2.class);
        zzyo2.zzR1().zzH(0L);
        com.aspose.words.internal.zzZYQ.zzX(zzyo2.zzR1(), zz77Var.zzR1());
        return zzyo2.getName();
    }

    private String zzZ(ShapeBase shapeBase, com.aspose.words.internal.zz77 zz77Var, int i) throws Exception {
        zzZBL zzzblZzYrB = shapeBase.zzYrB();
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzzblZzYrB.getOleObject().zzYrr());
        zz77Var.zzxn().zzZ("rId1", this.zzYOI.zzZmp().zzZkn(), com.aspose.words.internal.zzZKN.format("activeX{0}.bin", Integer.valueOf(i)), false);
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhV().getBytes(com.aspose.words.internal.zzZKN.format("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><ax:ocx ax:classid=\"{{{0}}}\" ax:persistence=\"persistStorage\" r:id=\"rId1\" xmlns:ax=\"{1}\" xmlns:r=\"{2}\"/>", zzkd.zzIf().zzAC().toString().toUpperCase(), this.zzYOI.zzZlR().zzZly(), this.zzYOI.zzZlR().zzZlE()));
        zz77Var.zzR1().write(bytes, 0, bytes.length);
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYOI.zzZmf().zzZ(zz77Var, com.aspose.words.internal.zzZKN.format("/word/activeX/activeX{0}.bin", Integer.valueOf(i)), "application/vnd.ms-office.activeX", this.zzYOI.zzZmp().zzZkn());
        zzkd.zzL(zz77VarZzZ.zzR1());
        zz77VarZzZ.zzR1().zzH(0L);
        String name = com.aspose.words.internal.zzZYD.zzXk(shapeBase.getName()) ? shapeBase.getName() : zzzblZzYrB.getName();
        return com.aspose.words.internal.zzZYD.zzXk(name) ? name : com.aspose.words.internal.zzZKN.format("OleControl {0}", Integer.valueOf(shapeBase.getId()));
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
    public static com.aspose.words.internal.zz77 zzZ(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
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

    @Override // com.aspose.words.zzZ9W
    public final void zzZ(HeaderFooter headerFooter) throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        String strZzZkM;
        if (headerFooter.isLinkedToPrevious()) {
            return;
        }
        if (headerFooter.isHeader()) {
            str = com.aspose.words.internal.zzZKN.format("header{0}.xml", Integer.valueOf(zzZlZ()));
            str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.header+xml";
            str3 = "w:hdr";
            str4 = "w:headerReference";
        } else {
            str = com.aspose.words.internal.zzZKN.format("footer{0}.xml", Integer.valueOf(zzZlY()));
            str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.footer+xml";
            str3 = "w:ftr";
            str4 = "w:footerReference";
        }
        if (headerFooter.isHeader()) {
            strZzZkM = this.zzYOI.zzZmp().zzSh();
        } else {
            strZzZkM = this.zzYOI.zzZmp().zzZkM();
        }
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzZ = zzZ(str, str2, strZzZkM, ref);
        String str5 = ref.get();
        zzzydZzZ.zzNU(str3);
        zzY(zzzydZzZ);
        headerFooter.accept(this);
        zzZlX();
        zzzydZzZ.endDocument();
        zzZYD zzzyd = this.zzYPf;
        zzzyd.zzY(str4);
        zzzyd.zzX("w:type", zzYUL.zzZB(headerFooter.getHeaderFooterType(), true));
        zzzyd.zzX("r:id", str5);
        zzzyd.zzp();
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final void zzZ(zzZ9W zzz9w, zzYEF zzyef) throws Exception {
        zzZXR zzzxr = (zzZXR) zzz9w;
        if (zzzxr.getCompliance() == 0) {
            return;
        }
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        Object objZzPk = zzyef.zzPk(810);
        if (!zzZy(objZzPk)) {
            zz2A.zzZ((zz27) objZzPk, zzzxr, true);
        }
        Object objZzPk2 = zzyef.zzPk(815);
        if (!zzZy(objZzPk2)) {
            zz2A.zzZ((zz21) objZzPk2, zzzxr, true);
        }
        Object objZzPk3 = zzyef.zzPk(820);
        if (!zzZy(objZzPk3)) {
            zz2A.zzZ((zz1R) objZzPk3, zzzxr, true);
        }
        Object objZzPk4 = zzyef.zzPk(825);
        if (!zzZy(objZzPk4)) {
            zz4B.zzZ("w14:textOutline", (zz4G) objZzPk4, zzzxr);
        }
        Object objZzPk5 = zzyef.zzPk(830);
        if (!zzZy(objZzPk5)) {
            zzyu6ZzZm2.zzY("w14:textFill");
            zz7T.zzZ((zz7X) objZzPk5, zzzxr, true);
            zzyu6ZzZm2.zzo();
        }
        Object objZzPk6 = zzyef.zzPk(835);
        if (!zzZy(objZzPk6)) {
            zzJN.zzZ((zz2S) objZzPk6, zzzxr, true);
        }
        Object objZzPk7 = zzyef.zzPk(840);
        if (!zzZy(objZzPk7)) {
            zzJN.zzZ((zz2N) objZzPk7, zzzxr, true);
        }
        Object objZzPk8 = zzyef.zzPk(850);
        if (objZzPk8 != null) {
            zzyu6ZzZm2.zzYz("w14:ligatures", zzZXP.zzFf(((Integer) objZzPk8).intValue()));
        }
        Object objZzPk9 = zzyef.zzPk(855);
        if (objZzPk9 != null) {
            zzyu6ZzZm2.zzYz("w14:numForm", zzZXP.zzFe(((Integer) objZzPk9).intValue()));
        }
        Object objZzPk10 = zzyef.zzPk(860);
        if (objZzPk10 != null) {
            zzyu6ZzZm2.zzYz("w14:numSpacing", zzZXP.zzFd(((Integer) objZzPk10).intValue()));
        }
        Object objZzPk11 = zzyef.zzPk(865);
        if (objZzPk11 != null) {
            zzZ(zzyu6ZzZm2, ((Integer) objZzPk11).intValue());
        }
        if (zzyef.contains(870)) {
            zzyu6ZzZm2.zzz("w14:cntxtAlts", ((Boolean) zzyef.zzPk(870)).booleanValue());
        }
    }

    private zzZYD zzZ(String str, String str2, String str3, Ref<String> ref) throws Exception {
        return zzY(this.zzYOU, str, str2, str3, ref);
    }

    public static void zzZ(com.aspose.words.internal.zz77 zz77Var, HashMap<String, com.aspose.words.internal.zz77> map, com.aspose.words.internal.zz77 zz77Var2, zzZXR zzzxr) throws Exception {
        for (com.aspose.words.internal.zz75 zz75Var : zz77Var.zzxn()) {
            if (zz75Var.isExternal()) {
                zz77Var2.zzxn().zzZ(zz75Var.getId(), zz75Var.getType(), zz75Var.getTarget(), zz75Var.isExternal());
            } else {
                String strZzZ = zz77Var2.zzZ(zz75Var);
                if (zzzxr.zzYOI.zzZmf().zzYe(strZzZ) != null) {
                    strZzZ = com.aspose.words.internal.zzZOQ.zzZX(strZzZ, com.aspose.words.internal.zzZOZ.zziD().toString() + com.aspose.words.internal.zzZOQ.zzVe(strZzZ));
                }
                com.aspose.words.internal.zz77 zz77Var3 = (com.aspose.words.internal.zz77) com.aspose.words.internal.zzQW.zzZ(map, zz75Var.getId());
                String strZzt = com.aspose.words.internal.zz78.zzt(zz77Var2.getName(), strZzZ);
                if (zz77Var3 != null) {
                    com.aspose.words.internal.zz77 zz77Var4 = new com.aspose.words.internal.zz77(strZzZ, zz77Var3.getContentType());
                    zz77Var4.zz5(zz77Var3.zzR1());
                    zzzxr.zzYOI.zzZmf().zzxo().zzY(zz77Var4);
                } else {
                    strZzt = "NULL";
                }
                zz77Var2.zzxn().zzZ(zz75Var.getId(), zz75Var.getType(), strZzt, zz75Var.isExternal());
            }
        }
    }

    private void zzZ(SpecialChar specialChar) throws Exception {
        if (specialChar != null) {
            com.aspose.words.internal.zzZKN.equals(specialChar.getText(), ControlChar.zzZs4);
        }
        zzYEF zzyefZzZYh = specialChar.zzZYh();
        visitFieldStart(new FieldStart(getDocument(), (zzYEF) zzyefZzZYh.zzbn(), 31));
        this.zzYOG.zzY(new Run(getDocument(), C20593OooO0Oo.OooO0O0("date \\@ \"", com.aspose.words.internal.zzJB.zzH8(), "\""), (zzYEF) zzyefZzZYh.zzbn()));
        visitFieldSeparator(new FieldSeparator(getDocument(), (zzYEF) specialChar.zzZYh().zzbn(), 31));
        visitFieldEnd(new FieldEnd(getDocument(), (zzYEF) zzyefZzZYh.zzbn(), 31, true));
    }

    private void zzZ(zzZCT zzzct) {
        if (zzzct.getDisplacedByCustomXml() != 2) {
            this.zzYPf.zz0("w:displacedByCustomXml", zzZXQ.zzFg(zzzct.getDisplacedByCustomXml()));
        }
    }

    private static void zzZ(zzYU6 zzyu6, int i) {
        if (i == 0) {
            zzyu6.zzX("<w14:stylisticSets xmlns:w14=\"http://schemas.microsoft.com/office/word/2010/wordml\" />");
            return;
        }
        zzyu6.zzY("w14:stylisticSets");
        for (int i2 = 1; i2 <= 524288; i2 <<= 1) {
            if ((i & i2) != 0) {
                zzyu6.zzX("w14:styleSet", "w14:id", zzZXP.zzFc(i2));
            }
        }
        zzyu6.zzo();
    }

    private void zzZ(OleFormat oleFormat) throws Exception {
        new com.aspose.words.internal.zzKD(oleFormat.getOleObject().zzYrr()).zzL(zzZ(oleFormat, "oleObject", this.zzYOI.zzZmp().zzZkC()).zzR1());
    }
}
