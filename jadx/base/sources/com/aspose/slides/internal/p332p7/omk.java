package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class omk extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28035to = new C7017h4("text:style-name", "text:class-names", "text:s", "text:tab", "text:line-break", "text:soft-page-break", "text:span", "text:a", "text:bookmark", "text:bookmark-start", "text:bookmark-end", "text:reference-mark", "text:reference-mark-start", "text:reference-mark-end", "text:note", "text:ruby", "office:annotation", "text:change-marks", "draw:rect", "draw:line", "draw:polyline", "draw:polygon", "draw:regular-polygon", "draw:path", "draw:circle", "draw:ellipse", "draw:g", "draw:page-thumbnail", "draw:frame", "draw:measure", "draw:caption", "draw:connector", "draw:control", "dr3d:scene", "draw:custom-shape", "draw:a", "text:date", "text:time", "text:page-number", "text:page-continuation", "text:sender-firstname", "text:sender-lastname", "text:sender-initials", "text:sender-title", "text:sender-position", "text:sender-email", "text:sender-phone-private", "text:sender-fax", "text:sender-company", "text:sender-phone-work", "text:sender-street", "text:sender-city", "text:sender-postal-code", "text:sender-country", "text:sender-state-or-province", "text:author-name", "text:author-initials", "text:chapter", "text:file-name", "text:template-name", "text:sheet-name", "text:variable-set", "text:variable-get", "text:variable-input", "text:user-field-get", "text:user-field-input", "text:sequence", "text:expression", "text:text-input", "text:initial-creator", "text:creation-date", "text:creation-time", "text:description", "text:user-defined", "text:print-time", "text:print-date", "text:printed-by", "text:title", "text:subject", "text:keywords", "text:editing-cycles", "text:editing-duration", "text:modification-time", "text:modification-date", "text:creator", "text:page-count", "text:paragraph-count", "text:word-count", "text:character-count", "text:table-count", "text:image-count", "text:object-count", "text:database-display", "text:database-next", "text:database-row-select", "text:database-row-number", "text:database-name", "text:page-variable-set", "text:page-variable-get", "text:placeholder", "text:conditional-text", "text:hidden-text", "text:reference-ref", "text:bookmark-ref", "text:note-ref", "text:sequence-ref", "text:script", "text:execute-macro", "text:hidden-paragraph", "text:dde-connection", "text:measure", "text:table-formula", "text:toc-mark-start", "text:toc-mark-end", "text:toc-mark", "text:user-index-mark-start", "text:user-index-mark-end", "text:user-index-mark", "text:alphabetical-index-mark-start", "text:alphabetical-index-mark-end", "text:alphabetical-index-mark", "text:bibliography-mark", "presentation:header", "presentation:footer", "presentation:date-time", "_TEXT");

    /* JADX INFO: renamed from: k4 */
    private String f28036k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f28037kk;

    /* JADX INFO: renamed from: x1 */
    private String f28038x1;

    public omk() {
        m38367to();
    }

    /* JADX INFO: renamed from: to */
    private void m38367to() {
        this.f28037kk = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m38369k4(String str) {
        C7394ca c7394ca;
        switch (f28035to.m27428k4(str)) {
            case 2:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "s"), new z1e());
                break;
            case 3:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "tab"), new tf7());
                break;
            case 4:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "line-break"), new jxj());
                break;
            case 5:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "soft-page-break"), new tfm());
                break;
            case 6:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "span"), new omk());
                break;
            case 7:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "a"), new hqi());
                break;
            case 8:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark"), new y2n());
                break;
            case 9:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-start"), new qah());
                break;
            case 10:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-end"), new gij());
                break;
            case 11:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark"), new q6c());
                break;
            case 12:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark-start"), new rft());
                break;
            case 13:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark-end"), new a8b());
                break;
            case 14:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", BackupFile.FILE_CONTENT_TYPE_NOTE), new v8e());
                break;
            case 15:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "ruby"), new ohe());
                break;
            case 16:
                c7394ca = new C7394ca(C14113y2.m67408k4("office:", "annotation"), new vdg());
                break;
            case 17:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "change-marks"), new wiq());
                break;
            case 18:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", DrawToolFactory.LASSO_TYPE_RECT), new yxk());
                break;
            case 19:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "line"), new er2());
                break;
            case 20:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "polyline"), new rpj());
                break;
            case 21:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "polygon"), new z4k());
                break;
            case 22:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "regular-polygon"), new em0());
                break;
            case 23:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "path"), new tzu());
                break;
            case 24:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "circle"), new fmt());
                break;
            case 25:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "ellipse"), new sd3());
                break;
            case 26:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "g"), new pnk());
                break;
            case 27:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "page-thumbnail"), new klm());
                break;
            case 28:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "frame"), new vtn());
                break;
            case 29:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "measure"), new s0k());
                break;
            case 30:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "caption"), new zz0());
                break;
            case 31:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "connector"), new p9u());
                break;
            case 32:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "control"), new suk());
                break;
            case 33:
                c7394ca = new C7394ca(C14113y2.m67408k4("dr3d:", "scene"), new hhy());
                break;
            case 34:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "custom-shape"), new h7e());
                break;
            case 35:
                c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "a"), new zg0());
                break;
            case 36:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "date"), new r9q());
                break;
            case 37:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "time"), new ldn());
                break;
            case 38:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-number"), new p9k());
                break;
            case 39:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-continuation"), new cb8());
                break;
            case 40:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-firstname"), new akh());
                break;
            case 41:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-lastname"), new lde());
                break;
            case 42:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-initials"), new lzv());
                break;
            case 43:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-title"), new meq());
                break;
            case 44:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-position"), new so4());
                break;
            case 45:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-email"), new ubu());
                break;
            case 46:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-phone-private"), new pz4());
                break;
            case 47:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-fax"), new btg());
                break;
            case 48:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-company"), new rpr());
                break;
            case 49:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-phone-work"), new pe5());
                break;
            case 50:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-street"), new coq());
                break;
            case 51:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-city"), new myn());
                break;
            case 52:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-postal-code"), new mcc());
                break;
            case 53:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-country"), new rhs());
                break;
            case 54:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-state-or-province"), new gt9());
                break;
            case 55:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "author-name"), new z9q());
                break;
            case 56:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "author-initials"), new pya());
                break;
            case 57:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "chapter"), new m4c());
                break;
            case 58:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "file-name"), new gnb());
                break;
            case 59:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "template-name"), new b5b());
                break;
            case 60:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sheet-name"), C14113y2.f47374k4);
                break;
            case 61:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-set"), new x9t());
                break;
            case 62:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-get"), new jme());
                break;
            case 63:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-input"), new mbn());
                break;
            case 64:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-field-get"), new pt7());
                break;
            case 65:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-field-input"), new jai());
                break;
            case 66:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sequence"), new ykd());
                break;
            case 67:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "expression"), new ng8());
                break;
            case 68:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "text-input"), new y9s());
                break;
            case 69:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "initial-creator"), new ot7());
                break;
            case 70:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creation-date"), new gyt());
                break;
            case 71:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creation-time"), new q0x());
                break;
            case 72:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "description"), new agb());
                break;
            case 73:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-defined"), new sza());
                break;
            case 74:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "print-time"), new xxs());
                break;
            case 75:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "print-date"), new z5t());
                break;
            case 76:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "printed-by"), new qwm());
                break;
            case 77:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", NoteMeta.PROPERTY_TITLE), new ab7());
                break;
            case 78:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "subject"), new l7k());
                break;
            case 79:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "keywords"), new tqy());
                break;
            case 80:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "editing-cycles"), new dnf());
                break;
            case 81:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "editing-duration"), new sfn());
                break;
            case 82:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "modification-time"), new yci());
                break;
            case 83:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "modification-date"), new t6x());
                break;
            case 84:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creator"), new nsh());
                break;
            case 85:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-count"), new dj6());
                break;
            case 86:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "paragraph-count"), new mip());
                break;
            case 87:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "word-count"), new ge9());
                break;
            case 88:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "character-count"), new rpo());
                break;
            case 89:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "table-count"), new z8u());
                break;
            case 90:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "image-count"), new fbk());
                break;
            case 91:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "object-count"), new g7b());
                break;
            case 92:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-display"), new chj());
                break;
            case 93:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-next"), new swa());
                break;
            case 94:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-row-select"), new b6d());
                break;
            case 95:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-row-number"), new zsn());
                break;
            case 96:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-name"), new xwz());
                break;
            case 97:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-variable-set"), new knb());
                break;
            case 98:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-variable-get"), new uqw());
                break;
            case 99:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "placeholder"), new w7g());
                break;
            case 100:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "conditional-text"), new qxw());
                break;
            case 101:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "hidden-text"), new mqz());
                break;
            case 102:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-ref"), new vqo());
                break;
            case 103:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-ref"), new ri7());
                break;
            case 104:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "note-ref"), new nh5());
                break;
            case 105:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sequence-ref"), new kg7());
                break;
            case 106:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "script"), new jof());
                break;
            case 107:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "execute-macro"), new ezp());
                break;
            case 108:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "hidden-paragraph"), new t5f());
                break;
            case 109:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "dde-connection"), new oiv());
                break;
            case 110:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "measure"), new f3b());
                break;
            case 111:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "table-formula"), new jwc());
                break;
            case 112:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark-start"), new phu());
                break;
            case 113:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark-end"), new s3h());
                break;
            case 114:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark"), new vhx());
                break;
            case 115:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark-start"), new veo());
                break;
            case 116:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark-end"), new tuc());
                break;
            case 117:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark"), new dxs());
                break;
            case 118:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark-start"), new a3u());
                break;
            case 119:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark-end"), new f6b());
                break;
            case 120:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark"), new vpe());
                break;
            case 121:
                c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bibliography-mark"), new c9v());
                break;
            case 122:
                c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "header"), new coj());
                break;
            case 123:
                c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "footer"), new q5v());
                break;
            case 124:
                c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "date-time"), new oul());
                break;
            case 125:
                c7394ca = new C7394ca("_TEXT", C14113y2.f47374k4);
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28037kk.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m38371x1() {
        return this.f28037kk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x08d4, code lost:
    
        r3.addItem(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c9, code lost:
    
        r2.addItem(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public omk(AbstractC13912i5 abstractC13912i5) {
        List<C7394ca> list;
        C7394ca c7394ca;
        List<C7394ca> list2;
        C7394ca c7394ca2;
        List<C7394ca> list3;
        C7394ca c7394ca3;
        m38367to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.omk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = omk.f28035to.m27428k4(str);
                if (iM27428k4 == 0) {
                    omk.this.f28036k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                omk.this.f28038x1 = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f28035to.m27428k4(C14113y2.m67408k4(abstractC13912i5.mo65060yj(), C18241k5.f55433h, abstractC13912i5.mo65023fa()))) {
                        case 2:
                            z1e z1eVar = new z1e(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "s"), z1eVar);
                            break;
                        case 3:
                            tf7 tf7Var = new tf7(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "tab"), tf7Var);
                            break;
                        case 4:
                            jxj jxjVar = new jxj(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "line-break"), jxjVar);
                            break;
                        case 5:
                            tfm tfmVar = new tfm(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "soft-page-break"), tfmVar);
                            break;
                        case 6:
                            omk omkVar = new omk(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "span"), omkVar);
                            break;
                        case 7:
                            hqi hqiVar = new hqi(abstractC13912i5);
                            list2 = this.f28037kk;
                            c7394ca2 = new C7394ca(C14113y2.m67408k4("text:", "a"), hqiVar);
                            break;
                        case 8:
                            y2n y2nVar = new y2n(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark"), y2nVar);
                            break;
                        case 9:
                            qah qahVar = new qah(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-start"), qahVar);
                            break;
                        case 10:
                            gij gijVar = new gij(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-end"), gijVar);
                            break;
                        case 11:
                            q6c q6cVar = new q6c(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark"), q6cVar);
                            break;
                        case 12:
                            rft rftVar = new rft(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark-start"), rftVar);
                            break;
                        case 13:
                            a8b a8bVar = new a8b(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark-end"), a8bVar);
                            break;
                        case 14:
                            v8e v8eVar = new v8e(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", BackupFile.FILE_CONTENT_TYPE_NOTE), v8eVar);
                            break;
                        case 15:
                            ohe oheVar = new ohe(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "ruby"), oheVar);
                            break;
                        case 16:
                            vdg vdgVar = new vdg(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("office:", "annotation"), vdgVar);
                            break;
                        case 17:
                            wiq wiqVar = new wiq(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "change-marks"), wiqVar);
                            break;
                        case 18:
                            yxk yxkVar = new yxk(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", DrawToolFactory.LASSO_TYPE_RECT), yxkVar);
                            break;
                        case 19:
                            er2 er2Var = new er2(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "line"), er2Var);
                            break;
                        case 20:
                            rpj rpjVar = new rpj(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "polyline"), rpjVar);
                            break;
                        case 21:
                            z4k z4kVar = new z4k(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "polygon"), z4kVar);
                            break;
                        case 22:
                            em0 em0Var = new em0(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "regular-polygon"), em0Var);
                            break;
                        case 23:
                            tzu tzuVar = new tzu(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "path"), tzuVar);
                            break;
                        case 24:
                            fmt fmtVar = new fmt(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "circle"), fmtVar);
                            break;
                        case 25:
                            sd3 sd3Var = new sd3(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "ellipse"), sd3Var);
                            break;
                        case 26:
                            pnk pnkVar = new pnk(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "g"), pnkVar);
                            break;
                        case 27:
                            klm klmVar = new klm(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "page-thumbnail"), klmVar);
                            break;
                        case 28:
                            vtn vtnVar = new vtn(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "frame"), vtnVar);
                            break;
                        case 29:
                            s0k s0kVar = new s0k(abstractC13912i5);
                            list3 = this.f28037kk;
                            c7394ca3 = new C7394ca(C14113y2.m67408k4("draw:", "measure"), s0kVar);
                            break;
                        case 30:
                            zz0 zz0Var = new zz0(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "caption"), zz0Var);
                            break;
                        case 31:
                            p9u p9uVar = new p9u(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "connector"), p9uVar);
                            break;
                        case 32:
                            suk sukVar = new suk(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "control"), sukVar);
                            break;
                        case 33:
                            hhy hhyVar = new hhy(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("dr3d:", "scene"), hhyVar);
                            break;
                        case 34:
                            h7e h7eVar = new h7e(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "custom-shape"), h7eVar);
                            break;
                        case 35:
                            zg0 zg0Var = new zg0(abstractC13912i5);
                            list2 = this.f28037kk;
                            c7394ca2 = new C7394ca(C14113y2.m67408k4("draw:", "a"), zg0Var);
                            break;
                        case 36:
                            r9q r9qVar = new r9q(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "date"), r9qVar);
                            break;
                        case 37:
                            ldn ldnVar = new ldn(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "time"), ldnVar);
                            break;
                        case 38:
                            p9k p9kVar = new p9k(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-number"), p9kVar);
                            break;
                        case 39:
                            cb8 cb8Var = new cb8(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-continuation"), cb8Var);
                            break;
                        case 40:
                            akh akhVar = new akh(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-firstname"), akhVar);
                            break;
                        case 41:
                            lde ldeVar = new lde(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-lastname"), ldeVar);
                            break;
                        case 42:
                            lzv lzvVar = new lzv(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-initials"), lzvVar);
                            break;
                        case 43:
                            meq meqVar = new meq(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-title"), meqVar);
                            break;
                        case 44:
                            so4 so4Var = new so4(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-position"), so4Var);
                            break;
                        case 45:
                            ubu ubuVar = new ubu(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-email"), ubuVar);
                            break;
                        case 46:
                            pz4 pz4Var = new pz4(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-phone-private"), pz4Var);
                            break;
                        case 47:
                            btg btgVar = new btg(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-fax"), btgVar);
                            break;
                        case 48:
                            rpr rprVar = new rpr(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-company"), rprVar);
                            break;
                        case 49:
                            pe5 pe5Var = new pe5(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-phone-work"), pe5Var);
                            break;
                        case 50:
                            coq coqVar = new coq(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-street"), coqVar);
                            break;
                        case 51:
                            myn mynVar = new myn(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-city"), mynVar);
                            break;
                        case 52:
                            mcc mccVar = new mcc(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-postal-code"), mccVar);
                            break;
                        case 53:
                            rhs rhsVar = new rhs(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-country"), rhsVar);
                            break;
                        case 54:
                            gt9 gt9Var = new gt9(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-state-or-province"), gt9Var);
                            break;
                        case 55:
                            z9q z9qVar = new z9q(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "author-name"), z9qVar);
                            break;
                        case 56:
                            pya pyaVar = new pya(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "author-initials"), pyaVar);
                            break;
                        case 57:
                            m4c m4cVar = new m4c(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "chapter"), m4cVar);
                            break;
                        case 58:
                            gnb gnbVar = new gnb(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "file-name"), gnbVar);
                            break;
                        case 59:
                            b5b b5bVar = new b5b(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "template-name"), b5bVar);
                            break;
                        case 60:
                            abstractC13912i5.mo65026h4();
                            String strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sheet-name"), strMo65042rv);
                            break;
                        case 61:
                            x9t x9tVar = new x9t(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-set"), x9tVar);
                            break;
                        case 62:
                            jme jmeVar = new jme(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-get"), jmeVar);
                            break;
                        case 63:
                            mbn mbnVar = new mbn(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-input"), mbnVar);
                            break;
                        case 64:
                            pt7 pt7Var = new pt7(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-field-get"), pt7Var);
                            break;
                        case 65:
                            jai jaiVar = new jai(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-field-input"), jaiVar);
                            break;
                        case 66:
                            ykd ykdVar = new ykd(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sequence"), ykdVar);
                            break;
                        case 67:
                            ng8 ng8Var = new ng8(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "expression"), ng8Var);
                            break;
                        case 68:
                            y9s y9sVar = new y9s(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "text-input"), y9sVar);
                            break;
                        case 69:
                            ot7 ot7Var = new ot7(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "initial-creator"), ot7Var);
                            break;
                        case 70:
                            gyt gytVar = new gyt(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creation-date"), gytVar);
                            break;
                        case 71:
                            q0x q0xVar = new q0x(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creation-time"), q0xVar);
                            break;
                        case 72:
                            agb agbVar = new agb(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "description"), agbVar);
                            break;
                        case 73:
                            sza szaVar = new sza(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-defined"), szaVar);
                            break;
                        case 74:
                            xxs xxsVar = new xxs(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "print-time"), xxsVar);
                            break;
                        case 75:
                            z5t z5tVar = new z5t(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "print-date"), z5tVar);
                            break;
                        case 76:
                            qwm qwmVar = new qwm(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "printed-by"), qwmVar);
                            break;
                        case 77:
                            ab7 ab7Var = new ab7(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", NoteMeta.PROPERTY_TITLE), ab7Var);
                            break;
                        case 78:
                            l7k l7kVar = new l7k(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "subject"), l7kVar);
                            break;
                        case 79:
                            tqy tqyVar = new tqy(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "keywords"), tqyVar);
                            break;
                        case 80:
                            dnf dnfVar = new dnf(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "editing-cycles"), dnfVar);
                            break;
                        case 81:
                            sfn sfnVar = new sfn(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "editing-duration"), sfnVar);
                            break;
                        case 82:
                            yci yciVar = new yci(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "modification-time"), yciVar);
                            break;
                        case 83:
                            t6x t6xVar = new t6x(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "modification-date"), t6xVar);
                            break;
                        case 84:
                            nsh nshVar = new nsh(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creator"), nshVar);
                            break;
                        case 85:
                            dj6 dj6Var = new dj6(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-count"), dj6Var);
                            break;
                        case 86:
                            mip mipVar = new mip(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "paragraph-count"), mipVar);
                            break;
                        case 87:
                            ge9 ge9Var = new ge9(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "word-count"), ge9Var);
                            break;
                        case 88:
                            rpo rpoVar = new rpo(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "character-count"), rpoVar);
                            break;
                        case 89:
                            z8u z8uVar = new z8u(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "table-count"), z8uVar);
                            break;
                        case 90:
                            fbk fbkVar = new fbk(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "image-count"), fbkVar);
                            break;
                        case 91:
                            g7b g7bVar = new g7b(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "object-count"), g7bVar);
                            break;
                        case 92:
                            chj chjVar = new chj(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-display"), chjVar);
                            break;
                        case 93:
                            swa swaVar = new swa(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-next"), swaVar);
                            break;
                        case 94:
                            b6d b6dVar = new b6d(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-row-select"), b6dVar);
                            break;
                        case 95:
                            zsn zsnVar = new zsn(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-row-number"), zsnVar);
                            break;
                        case 96:
                            xwz xwzVar = new xwz(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-name"), xwzVar);
                            break;
                        case 97:
                            knb knbVar = new knb(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-variable-set"), knbVar);
                            break;
                        case 98:
                            uqw uqwVar = new uqw(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-variable-get"), uqwVar);
                            break;
                        case 99:
                            w7g w7gVar = new w7g(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "placeholder"), w7gVar);
                            break;
                        case 100:
                            qxw qxwVar = new qxw(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "conditional-text"), qxwVar);
                            break;
                        case 101:
                            mqz mqzVar = new mqz(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "hidden-text"), mqzVar);
                            break;
                        case 102:
                            vqo vqoVar = new vqo(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-ref"), vqoVar);
                            break;
                        case 103:
                            ri7 ri7Var = new ri7(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-ref"), ri7Var);
                            break;
                        case 104:
                            nh5 nh5Var = new nh5(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "note-ref"), nh5Var);
                            break;
                        case 105:
                            kg7 kg7Var = new kg7(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sequence-ref"), kg7Var);
                            break;
                        case 106:
                            jof jofVar = new jof(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "script"), jofVar);
                            break;
                        case 107:
                            ezp ezpVar = new ezp(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "execute-macro"), ezpVar);
                            break;
                        case 108:
                            t5f t5fVar = new t5f(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "hidden-paragraph"), t5fVar);
                            break;
                        case 109:
                            oiv oivVar = new oiv(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "dde-connection"), oivVar);
                            break;
                        case 110:
                            f3b f3bVar = new f3b(abstractC13912i5);
                            list3 = this.f28037kk;
                            c7394ca3 = new C7394ca(C14113y2.m67408k4("text:", "measure"), f3bVar);
                            break;
                        case 111:
                            jwc jwcVar = new jwc(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "table-formula"), jwcVar);
                            break;
                        case 112:
                            phu phuVar = new phu(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark-start"), phuVar);
                            break;
                        case 113:
                            s3h s3hVar = new s3h(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark-end"), s3hVar);
                            break;
                        case 114:
                            vhx vhxVar = new vhx(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark"), vhxVar);
                            break;
                        case 115:
                            veo veoVar = new veo(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark-start"), veoVar);
                            break;
                        case 116:
                            tuc tucVar = new tuc(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark-end"), tucVar);
                            break;
                        case 117:
                            dxs dxsVar = new dxs(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark"), dxsVar);
                            break;
                        case 118:
                            a3u a3uVar = new a3u(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark-start"), a3uVar);
                            break;
                        case 119:
                            f6b f6bVar = new f6b(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark-end"), f6bVar);
                            break;
                        case 120:
                            vpe vpeVar = new vpe(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark"), vpeVar);
                            break;
                        case 121:
                            c9v c9vVar = new c9v(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bibliography-mark"), c9vVar);
                            break;
                        case 122:
                            coj cojVar = new coj(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "header"), cojVar);
                            break;
                        case 123:
                            q5v q5vVar = new q5v(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "footer"), q5vVar);
                            break;
                        case 124:
                            oul oulVar = new oul(abstractC13912i5);
                            list = this.f28037kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "date-time"), oulVar);
                            break;
                        default:
                            abstractC13912i5.mo65208bv();
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                    }
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    OooOO0O.OooO0O0("_TEXT", abstractC13912i5.mo65042rv(), this.f28037kk);
                }
            }
            list.addItem(c7394ca);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m38370k4() {
        return this.f28036k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38372x1(String str) {
        this.f28036k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28036k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        String str4 = this.f28038x1;
        if (str4 != null) {
            c3059ii.m12955x1("text:class-names", str4);
        }
        List.Enumerator<C7394ca> it = this.f28037kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28035to.m27428k4(next.m29539k4())) {
                    case 2:
                        c3059ii2 = c3059ii;
                        ((z1e) next.m29541kk()).mo6846k4("text", c3059ii2, "s");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 3:
                        c3059ii2 = c3059ii;
                        ((tf7) next.m29541kk()).mo6846k4("text", c3059ii2, "tab");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 4:
                        c3059ii2 = c3059ii;
                        ((jxj) next.m29541kk()).mo6846k4("text", c3059ii2, "line-break");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 5:
                        c3059ii2 = c3059ii;
                        ((tfm) next.m29541kk()).mo6846k4("text", c3059ii2, "soft-page-break");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 6:
                        c3059ii2 = c3059ii;
                        ((omk) next.m29541kk()).mo6846k4("text", c3059ii2, "span");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 7:
                        c3059ii2 = c3059ii;
                        ((hqi) next.m29541kk()).mo6846k4("text", c3059ii2, "a");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 8:
                        c3059ii2 = c3059ii;
                        ((y2n) next.m29541kk()).mo6846k4("text", c3059ii2, "bookmark");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 9:
                        c3059ii2 = c3059ii;
                        ((qah) next.m29541kk()).mo6846k4("text", c3059ii2, "bookmark-start");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 10:
                        c3059ii2 = c3059ii;
                        ((gij) next.m29541kk()).mo6846k4("text", c3059ii2, "bookmark-end");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 11:
                        c3059ii2 = c3059ii;
                        ((q6c) next.m29541kk()).mo6846k4("text", c3059ii2, "reference-mark");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 12:
                        c3059ii2 = c3059ii;
                        ((rft) next.m29541kk()).mo6846k4("text", c3059ii2, "reference-mark-start");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 13:
                        c3059ii2 = c3059ii;
                        ((a8b) next.m29541kk()).mo6846k4("text", c3059ii2, "reference-mark-end");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 14:
                        c3059ii2 = c3059ii;
                        ((v8e) next.m29541kk()).mo6846k4("text", c3059ii2, BackupFile.FILE_CONTENT_TYPE_NOTE);
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 15:
                        c3059ii2 = c3059ii;
                        ((ohe) next.m29541kk()).mo6846k4("text", c3059ii2, "ruby");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 16:
                        c3059ii2 = c3059ii;
                        ((vdg) next.m29541kk()).mo6846k4("office", c3059ii2, "annotation");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 17:
                        c3059ii2 = c3059ii;
                        ((wiq) next.m29541kk()).mo6846k4("text", c3059ii2, "change-marks");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 18:
                        c3059ii2 = c3059ii;
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii2, DrawToolFactory.LASSO_TYPE_RECT);
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 19:
                        c3059ii2 = c3059ii;
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii2, "line");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 20:
                        c3059ii2 = c3059ii;
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii2, "polyline");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 21:
                        c3059ii2 = c3059ii;
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii2, "polygon");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 22:
                        c3059ii2 = c3059ii;
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii2, "regular-polygon");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 23:
                        c3059ii2 = c3059ii;
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii2, "path");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 24:
                        c3059ii2 = c3059ii;
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii2, "circle");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 25:
                        c3059ii2 = c3059ii;
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii2, "ellipse");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 26:
                        c3059ii2 = c3059ii;
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii2, "g");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 27:
                        c3059ii2 = c3059ii;
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii2, "page-thumbnail");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 28:
                        c3059ii2 = c3059ii;
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii2, "frame");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 29:
                        c3059ii2 = c3059ii;
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii2, "measure");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 30:
                        c3059ii2 = c3059ii;
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii2, "caption");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 31:
                        c3059ii2 = c3059ii;
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii2, "connector");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 32:
                        c3059ii2 = c3059ii;
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii2, "control");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 33:
                        c3059ii2 = c3059ii;
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii2, "scene");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 34:
                        c3059ii2 = c3059ii;
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii2, "custom-shape");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 35:
                        c3059ii2 = c3059ii;
                        ((zg0) next.m29541kk()).mo6846k4("draw", c3059ii2, "a");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 36:
                        c3059ii2 = c3059ii;
                        ((r9q) next.m29541kk()).mo6846k4("text", c3059ii2, "date");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 37:
                        c3059ii2 = c3059ii;
                        ((ldn) next.m29541kk()).mo6846k4("text", c3059ii2, "time");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 38:
                        c3059ii2 = c3059ii;
                        ((p9k) next.m29541kk()).mo6846k4("text", c3059ii2, "page-number");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 39:
                        c3059ii2 = c3059ii;
                        ((cb8) next.m29541kk()).mo6846k4("text", c3059ii2, "page-continuation");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 40:
                        c3059ii2 = c3059ii;
                        ((akh) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-firstname");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 41:
                        c3059ii2 = c3059ii;
                        ((lde) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-lastname");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 42:
                        c3059ii2 = c3059ii;
                        ((lzv) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-initials");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 43:
                        c3059ii2 = c3059ii;
                        ((meq) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-title");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 44:
                        c3059ii2 = c3059ii;
                        ((so4) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-position");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 45:
                        c3059ii2 = c3059ii;
                        ((ubu) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-email");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 46:
                        c3059ii2 = c3059ii;
                        ((pz4) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-phone-private");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 47:
                        c3059ii2 = c3059ii;
                        ((btg) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-fax");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 48:
                        c3059ii2 = c3059ii;
                        ((rpr) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-company");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 49:
                        c3059ii2 = c3059ii;
                        ((pe5) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-phone-work");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 50:
                        c3059ii2 = c3059ii;
                        ((coq) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-street");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 51:
                        c3059ii2 = c3059ii;
                        ((myn) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-city");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 52:
                        c3059ii2 = c3059ii;
                        ((mcc) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-postal-code");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 53:
                        c3059ii2 = c3059ii;
                        ((rhs) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-country");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 54:
                        c3059ii2 = c3059ii;
                        ((gt9) next.m29541kk()).mo6846k4("text", c3059ii2, "sender-state-or-province");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 55:
                        c3059ii2 = c3059ii;
                        ((z9q) next.m29541kk()).mo6846k4("text", c3059ii2, "author-name");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 56:
                        c3059ii2 = c3059ii;
                        ((pya) next.m29541kk()).mo6846k4("text", c3059ii2, "author-initials");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 57:
                        c3059ii2 = c3059ii;
                        ((m4c) next.m29541kk()).mo6846k4("text", c3059ii2, "chapter");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 58:
                        c3059ii2 = c3059ii;
                        ((gnb) next.m29541kk()).mo6846k4("text", c3059ii2, "file-name");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 59:
                        c3059ii2 = c3059ii;
                        ((b5b) next.m29541kk()).mo6846k4("text", c3059ii2, "template-name");
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 60:
                        c3059ii2 = c3059ii;
                        m29301k4("text", c3059ii2, "sheet-name", (String) next.m29541kk(), false);
                        continue;
                        c3059ii = c3059ii2;
                        break;
                    case 61:
                        ((x9t) next.m29541kk()).mo6846k4("text", c3059ii, "variable-set");
                        break;
                    case 62:
                        ((jme) next.m29541kk()).mo6846k4("text", c3059ii, "variable-get");
                        break;
                    case 63:
                        ((mbn) next.m29541kk()).mo6846k4("text", c3059ii, "variable-input");
                        break;
                    case 64:
                        ((pt7) next.m29541kk()).mo6846k4("text", c3059ii, "user-field-get");
                        break;
                    case 65:
                        ((jai) next.m29541kk()).mo6846k4("text", c3059ii, "user-field-input");
                        break;
                    case 66:
                        ((ykd) next.m29541kk()).mo6846k4("text", c3059ii, "sequence");
                        break;
                    case 67:
                        ((ng8) next.m29541kk()).mo6846k4("text", c3059ii, "expression");
                        break;
                    case 68:
                        ((y9s) next.m29541kk()).mo6846k4("text", c3059ii, "text-input");
                        break;
                    case 69:
                        ((ot7) next.m29541kk()).mo6846k4("text", c3059ii, "initial-creator");
                        break;
                    case 70:
                        ((gyt) next.m29541kk()).mo6846k4("text", c3059ii, "creation-date");
                        break;
                    case 71:
                        ((q0x) next.m29541kk()).mo6846k4("text", c3059ii, "creation-time");
                        break;
                    case 72:
                        ((agb) next.m29541kk()).mo6846k4("text", c3059ii, "description");
                        break;
                    case 73:
                        ((sza) next.m29541kk()).mo6846k4("text", c3059ii, "user-defined");
                        break;
                    case 74:
                        ((xxs) next.m29541kk()).mo6846k4("text", c3059ii, "print-time");
                        break;
                    case 75:
                        ((z5t) next.m29541kk()).mo6846k4("text", c3059ii, "print-date");
                        break;
                    case 76:
                        ((qwm) next.m29541kk()).mo6846k4("text", c3059ii, "printed-by");
                        break;
                    case 77:
                        ((ab7) next.m29541kk()).mo6846k4("text", c3059ii, NoteMeta.PROPERTY_TITLE);
                        break;
                    case 78:
                        ((l7k) next.m29541kk()).mo6846k4("text", c3059ii, "subject");
                        break;
                    case 79:
                        ((tqy) next.m29541kk()).mo6846k4("text", c3059ii, "keywords");
                        break;
                    case 80:
                        ((dnf) next.m29541kk()).mo6846k4("text", c3059ii, "editing-cycles");
                        break;
                    case 81:
                        ((sfn) next.m29541kk()).mo6846k4("text", c3059ii, "editing-duration");
                        break;
                    case 82:
                        ((yci) next.m29541kk()).mo6846k4("text", c3059ii, "modification-time");
                        break;
                    case 83:
                        ((t6x) next.m29541kk()).mo6846k4("text", c3059ii, "modification-date");
                        break;
                    case 84:
                        ((nsh) next.m29541kk()).mo6846k4("text", c3059ii, "creator");
                        break;
                    case 85:
                        ((dj6) next.m29541kk()).mo6846k4("text", c3059ii, "page-count");
                        break;
                    case 86:
                        ((mip) next.m29541kk()).mo6846k4("text", c3059ii, "paragraph-count");
                        break;
                    case 87:
                        ((ge9) next.m29541kk()).mo6846k4("text", c3059ii, "word-count");
                        break;
                    case 88:
                        ((rpo) next.m29541kk()).mo6846k4("text", c3059ii, "character-count");
                        break;
                    case 89:
                        ((z8u) next.m29541kk()).mo6846k4("text", c3059ii, "table-count");
                        break;
                    case 90:
                        ((fbk) next.m29541kk()).mo6846k4("text", c3059ii, "image-count");
                        break;
                    case 91:
                        ((g7b) next.m29541kk()).mo6846k4("text", c3059ii, "object-count");
                        break;
                    case 92:
                        ((chj) next.m29541kk()).mo6846k4("text", c3059ii, "database-display");
                        break;
                    case 93:
                        ((swa) next.m29541kk()).mo6846k4("text", c3059ii, "database-next");
                        break;
                    case 94:
                        ((b6d) next.m29541kk()).mo6846k4("text", c3059ii, "database-row-select");
                        break;
                    case 95:
                        ((zsn) next.m29541kk()).mo6846k4("text", c3059ii, "database-row-number");
                        break;
                    case 96:
                        ((xwz) next.m29541kk()).mo6846k4("text", c3059ii, "database-name");
                        break;
                    case 97:
                        ((knb) next.m29541kk()).mo6846k4("text", c3059ii, "page-variable-set");
                        break;
                    case 98:
                        ((uqw) next.m29541kk()).mo6846k4("text", c3059ii, "page-variable-get");
                        break;
                    case 99:
                        ((w7g) next.m29541kk()).mo6846k4("text", c3059ii, "placeholder");
                        break;
                    case 100:
                        ((qxw) next.m29541kk()).mo6846k4("text", c3059ii, "conditional-text");
                        break;
                    case 101:
                        ((mqz) next.m29541kk()).mo6846k4("text", c3059ii, "hidden-text");
                        break;
                    case 102:
                        ((vqo) next.m29541kk()).mo6846k4("text", c3059ii, "reference-ref");
                        break;
                    case 103:
                        ((ri7) next.m29541kk()).mo6846k4("text", c3059ii, "bookmark-ref");
                        break;
                    case 104:
                        ((nh5) next.m29541kk()).mo6846k4("text", c3059ii, "note-ref");
                        break;
                    case 105:
                        ((kg7) next.m29541kk()).mo6846k4("text", c3059ii, "sequence-ref");
                        break;
                    case 106:
                        ((jof) next.m29541kk()).mo6846k4("text", c3059ii, "script");
                        break;
                    case 107:
                        ((ezp) next.m29541kk()).mo6846k4("text", c3059ii, "execute-macro");
                        break;
                    case 108:
                        ((t5f) next.m29541kk()).mo6846k4("text", c3059ii, "hidden-paragraph");
                        break;
                    case 109:
                        ((oiv) next.m29541kk()).mo6846k4("text", c3059ii, "dde-connection");
                        break;
                    case 110:
                        ((f3b) next.m29541kk()).mo6846k4("text", c3059ii, "measure");
                        break;
                    case 111:
                        ((jwc) next.m29541kk()).mo6846k4("text", c3059ii, "table-formula");
                        break;
                    case 112:
                        ((phu) next.m29541kk()).mo6846k4("text", c3059ii, "toc-mark-start");
                        break;
                    case 113:
                        ((s3h) next.m29541kk()).mo6846k4("text", c3059ii, "toc-mark-end");
                        break;
                    case 114:
                        ((vhx) next.m29541kk()).mo6846k4("text", c3059ii, "toc-mark");
                        break;
                    case 115:
                        ((veo) next.m29541kk()).mo6846k4("text", c3059ii, "user-index-mark-start");
                        break;
                    case 116:
                        ((tuc) next.m29541kk()).mo6846k4("text", c3059ii, "user-index-mark-end");
                        break;
                    case 117:
                        ((dxs) next.m29541kk()).mo6846k4("text", c3059ii, "user-index-mark");
                        break;
                    case 118:
                        ((a3u) next.m29541kk()).mo6846k4("text", c3059ii, "alphabetical-index-mark-start");
                        break;
                    case 119:
                        ((f6b) next.m29541kk()).mo6846k4("text", c3059ii, "alphabetical-index-mark-end");
                        break;
                    case 120:
                        ((vpe) next.m29541kk()).mo6846k4("text", c3059ii, "alphabetical-index-mark");
                        break;
                    case 121:
                        ((c9v) next.m29541kk()).mo6846k4("text", c3059ii, "bibliography-mark");
                        break;
                    case 122:
                        ((coj) next.m29541kk()).mo6846k4("presentation", c3059ii, "header");
                        break;
                    case 123:
                        ((q5v) next.m29541kk()).mo6846k4("presentation", c3059ii, "footer");
                        break;
                    case 124:
                        ((oul) next.m29541kk()).mo6846k4("presentation", c3059ii, "date-time");
                        break;
                    case 125:
                        c3059ii.mo21918x1((String) next.m29541kk());
                        break;
                }
                c3059ii2 = c3059ii;
                c3059ii = c3059ii2;
            } finally {
            }
        }
        C3059ii c3059ii3 = c3059ii;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii3.mo21898jd();
    }
}
