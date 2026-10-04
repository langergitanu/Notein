package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class kmn extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f25808jd = new C7017h4("text:outline-level", "text:restart-numbering", "text:start-value", "text:is-list-header", "text:style-name", "text:class-names", "text:cond-style-name", "text:id", "text:number", "text:s", "text:tab", "text:line-break", "text:soft-page-break", "text:span", "text:a", "text:bookmark", "text:bookmark-start", "text:bookmark-end", "text:reference-mark", "text:reference-mark-start", "text:reference-mark-end", "text:note", "text:ruby", "office:annotation", "text:change-marks", "draw:rect", "draw:line", "draw:polyline", "draw:polygon", "draw:regular-polygon", "draw:path", "draw:circle", "draw:ellipse", "draw:g", "draw:page-thumbnail", "draw:frame", "draw:measure", "draw:caption", "draw:connector", "draw:control", "dr3d:scene", "draw:custom-shape", "draw:a", "text:date", "text:time", "text:page-number", "text:page-continuation", "text:sender-firstname", "text:sender-lastname", "text:sender-initials", "text:sender-title", "text:sender-position", "text:sender-email", "text:sender-phone-private", "text:sender-fax", "text:sender-company", "text:sender-phone-work", "text:sender-street", "text:sender-city", "text:sender-postal-code", "text:sender-country", "text:sender-state-or-province", "text:author-name", "text:author-initials", "text:chapter", "text:file-name", "text:template-name", "text:sheet-name", "text:variable-set", "text:variable-get", "text:variable-input", "text:user-field-get", "text:user-field-input", "text:sequence", "text:expression", "text:text-input", "text:initial-creator", "text:creation-date", "text:creation-time", "text:description", "text:user-defined", "text:print-time", "text:print-date", "text:printed-by", "text:title", "text:subject", "text:keywords", "text:editing-cycles", "text:editing-duration", "text:modification-time", "text:modification-date", "text:creator", "text:page-count", "text:paragraph-count", "text:word-count", "text:character-count", "text:table-count", "text:image-count", "text:object-count", "text:database-display", "text:database-next", "text:database-row-select", "text:database-row-number", "text:database-name", "text:page-variable-set", "text:page-variable-get", "text:placeholder", "text:conditional-text", "text:hidden-text", "text:reference-ref", "text:bookmark-ref", "text:note-ref", "text:sequence-ref", "text:script", "text:execute-macro", "text:hidden-paragraph", "text:dde-connection", "text:measure", "text:table-formula", "text:toc-mark-start", "text:toc-mark-end", "text:toc-mark", "text:user-index-mark-start", "text:user-index-mark-end", "text:user-index-mark", "text:alphabetical-index-mark-start", "text:alphabetical-index-mark-end", "text:alphabetical-index-mark", "text:bibliography-mark", "presentation:header", "presentation:footer", "presentation:date-time", "_TEXT");

    /* JADX INFO: renamed from: c5 */
    private List<C7394ca> f25809c5;

    /* JADX INFO: renamed from: du */
    private String f25810du;

    /* JADX INFO: renamed from: dy */
    private String f25811dy;

    /* JADX INFO: renamed from: h4 */
    private String f25812h4;

    /* JADX INFO: renamed from: k4 */
    private long f25813k4;

    /* JADX INFO: renamed from: kk */
    private long f25814kk;

    /* JADX INFO: renamed from: m9 */
    private String f25815m9;

    /* JADX INFO: renamed from: to */
    private boolean f25816to;

    /* JADX INFO: renamed from: x1 */
    private boolean f25817x1;

    public kmn() {
        m35551x1();
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
    public kmn(AbstractC13912i5 abstractC13912i5) {
        List<C7394ca> list;
        C7394ca c7394ca;
        List<C7394ca> list2;
        C7394ca c7394ca2;
        List<C7394ca> list3;
        C7394ca c7394ca3;
        m35551x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kmn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (kmn.f25808jd.m27428k4(str)) {
                    case 0:
                        kmn.this.f25813k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        kmn.this.f25817x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        kmn.this.f25814kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        kmn.this.f25816to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        kmn.this.f25810du = str2;
                        break;
                    case 5:
                        kmn.this.f25812h4 = str2;
                        break;
                    case 6:
                        kmn.this.f25815m9 = str2;
                        break;
                    case 7:
                        kmn.this.f25811dy = str2;
                        break;
                }
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
                    switch (f25808jd.m27428k4(C14113y2.m67408k4(abstractC13912i5.mo65060yj(), C18241k5.f55433h, abstractC13912i5.mo65023fa()))) {
                        case 8:
                            abstractC13912i5.mo65026h4();
                            String strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "number"), strMo65042rv);
                            break;
                        case 9:
                            z1e z1eVar = new z1e(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "s"), z1eVar);
                            break;
                        case 10:
                            tf7 tf7Var = new tf7(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "tab"), tf7Var);
                            break;
                        case 11:
                            jxj jxjVar = new jxj(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "line-break"), jxjVar);
                            break;
                        case 12:
                            tfm tfmVar = new tfm(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "soft-page-break"), tfmVar);
                            break;
                        case 13:
                            omk omkVar = new omk(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "span"), omkVar);
                            break;
                        case 14:
                            hqi hqiVar = new hqi(abstractC13912i5);
                            list2 = this.f25809c5;
                            c7394ca2 = new C7394ca(C14113y2.m67408k4("text:", "a"), hqiVar);
                            break;
                        case 15:
                            y2n y2nVar = new y2n(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark"), y2nVar);
                            break;
                        case 16:
                            qah qahVar = new qah(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-start"), qahVar);
                            break;
                        case 17:
                            gij gijVar = new gij(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-end"), gijVar);
                            break;
                        case 18:
                            q6c q6cVar = new q6c(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark"), q6cVar);
                            break;
                        case 19:
                            rft rftVar = new rft(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark-start"), rftVar);
                            break;
                        case 20:
                            a8b a8bVar = new a8b(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-mark-end"), a8bVar);
                            break;
                        case 21:
                            v8e v8eVar = new v8e(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", BackupFile.FILE_CONTENT_TYPE_NOTE), v8eVar);
                            break;
                        case 22:
                            ohe oheVar = new ohe(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "ruby"), oheVar);
                            break;
                        case 23:
                            vdg vdgVar = new vdg(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("office:", "annotation"), vdgVar);
                            break;
                        case 24:
                            wiq wiqVar = new wiq(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "change-marks"), wiqVar);
                            break;
                        case 25:
                            yxk yxkVar = new yxk(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", DrawToolFactory.LASSO_TYPE_RECT), yxkVar);
                            break;
                        case 26:
                            er2 er2Var = new er2(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "line"), er2Var);
                            break;
                        case 27:
                            rpj rpjVar = new rpj(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "polyline"), rpjVar);
                            break;
                        case 28:
                            z4k z4kVar = new z4k(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "polygon"), z4kVar);
                            break;
                        case 29:
                            em0 em0Var = new em0(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "regular-polygon"), em0Var);
                            break;
                        case 30:
                            tzu tzuVar = new tzu(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "path"), tzuVar);
                            break;
                        case 31:
                            fmt fmtVar = new fmt(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "circle"), fmtVar);
                            break;
                        case 32:
                            sd3 sd3Var = new sd3(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "ellipse"), sd3Var);
                            break;
                        case 33:
                            pnk pnkVar = new pnk(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "g"), pnkVar);
                            break;
                        case 34:
                            klm klmVar = new klm(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "page-thumbnail"), klmVar);
                            break;
                        case 35:
                            vtn vtnVar = new vtn(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "frame"), vtnVar);
                            break;
                        case 36:
                            s0k s0kVar = new s0k(abstractC13912i5);
                            list3 = this.f25809c5;
                            c7394ca3 = new C7394ca(C14113y2.m67408k4("draw:", "measure"), s0kVar);
                            break;
                        case 37:
                            zz0 zz0Var = new zz0(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "caption"), zz0Var);
                            break;
                        case 38:
                            p9u p9uVar = new p9u(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "connector"), p9uVar);
                            break;
                        case 39:
                            suk sukVar = new suk(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "control"), sukVar);
                            break;
                        case 40:
                            hhy hhyVar = new hhy(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("dr3d:", "scene"), hhyVar);
                            break;
                        case 41:
                            h7e h7eVar = new h7e(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("draw:", "custom-shape"), h7eVar);
                            break;
                        case 42:
                            zg0 zg0Var = new zg0(abstractC13912i5);
                            list2 = this.f25809c5;
                            c7394ca2 = new C7394ca(C14113y2.m67408k4("draw:", "a"), zg0Var);
                            break;
                        case 43:
                            r9q r9qVar = new r9q(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "date"), r9qVar);
                            break;
                        case 44:
                            ldn ldnVar = new ldn(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "time"), ldnVar);
                            break;
                        case 45:
                            p9k p9kVar = new p9k(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-number"), p9kVar);
                            break;
                        case 46:
                            cb8 cb8Var = new cb8(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-continuation"), cb8Var);
                            break;
                        case 47:
                            akh akhVar = new akh(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-firstname"), akhVar);
                            break;
                        case 48:
                            lde ldeVar = new lde(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-lastname"), ldeVar);
                            break;
                        case 49:
                            lzv lzvVar = new lzv(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-initials"), lzvVar);
                            break;
                        case 50:
                            meq meqVar = new meq(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-title"), meqVar);
                            break;
                        case 51:
                            so4 so4Var = new so4(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-position"), so4Var);
                            break;
                        case 52:
                            ubu ubuVar = new ubu(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-email"), ubuVar);
                            break;
                        case 53:
                            pz4 pz4Var = new pz4(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-phone-private"), pz4Var);
                            break;
                        case 54:
                            btg btgVar = new btg(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-fax"), btgVar);
                            break;
                        case 55:
                            rpr rprVar = new rpr(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-company"), rprVar);
                            break;
                        case 56:
                            pe5 pe5Var = new pe5(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-phone-work"), pe5Var);
                            break;
                        case 57:
                            coq coqVar = new coq(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-street"), coqVar);
                            break;
                        case 58:
                            myn mynVar = new myn(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-city"), mynVar);
                            break;
                        case 59:
                            mcc mccVar = new mcc(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-postal-code"), mccVar);
                            break;
                        case 60:
                            rhs rhsVar = new rhs(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-country"), rhsVar);
                            break;
                        case 61:
                            gt9 gt9Var = new gt9(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sender-state-or-province"), gt9Var);
                            break;
                        case 62:
                            z9q z9qVar = new z9q(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "author-name"), z9qVar);
                            break;
                        case 63:
                            pya pyaVar = new pya(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "author-initials"), pyaVar);
                            break;
                        case 64:
                            m4c m4cVar = new m4c(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "chapter"), m4cVar);
                            break;
                        case 65:
                            gnb gnbVar = new gnb(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "file-name"), gnbVar);
                            break;
                        case 66:
                            b5b b5bVar = new b5b(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "template-name"), b5bVar);
                            break;
                        case 67:
                            abstractC13912i5.mo65026h4();
                            String strMo65042rv2 = abstractC13912i5.mo65042rv();
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sheet-name"), strMo65042rv2);
                            break;
                        case 68:
                            x9t x9tVar = new x9t(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-set"), x9tVar);
                            break;
                        case 69:
                            jme jmeVar = new jme(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-get"), jmeVar);
                            break;
                        case 70:
                            mbn mbnVar = new mbn(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "variable-input"), mbnVar);
                            break;
                        case 71:
                            pt7 pt7Var = new pt7(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-field-get"), pt7Var);
                            break;
                        case 72:
                            jai jaiVar = new jai(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-field-input"), jaiVar);
                            break;
                        case 73:
                            ykd ykdVar = new ykd(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sequence"), ykdVar);
                            break;
                        case 74:
                            ng8 ng8Var = new ng8(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "expression"), ng8Var);
                            break;
                        case 75:
                            y9s y9sVar = new y9s(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "text-input"), y9sVar);
                            break;
                        case 76:
                            ot7 ot7Var = new ot7(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "initial-creator"), ot7Var);
                            break;
                        case 77:
                            gyt gytVar = new gyt(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creation-date"), gytVar);
                            break;
                        case 78:
                            q0x q0xVar = new q0x(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creation-time"), q0xVar);
                            break;
                        case 79:
                            agb agbVar = new agb(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "description"), agbVar);
                            break;
                        case 80:
                            sza szaVar = new sza(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-defined"), szaVar);
                            break;
                        case 81:
                            xxs xxsVar = new xxs(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "print-time"), xxsVar);
                            break;
                        case 82:
                            z5t z5tVar = new z5t(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "print-date"), z5tVar);
                            break;
                        case 83:
                            qwm qwmVar = new qwm(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "printed-by"), qwmVar);
                            break;
                        case 84:
                            ab7 ab7Var = new ab7(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", NoteMeta.PROPERTY_TITLE), ab7Var);
                            break;
                        case 85:
                            l7k l7kVar = new l7k(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "subject"), l7kVar);
                            break;
                        case 86:
                            tqy tqyVar = new tqy(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "keywords"), tqyVar);
                            break;
                        case 87:
                            dnf dnfVar = new dnf(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "editing-cycles"), dnfVar);
                            break;
                        case 88:
                            sfn sfnVar = new sfn(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "editing-duration"), sfnVar);
                            break;
                        case 89:
                            yci yciVar = new yci(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "modification-time"), yciVar);
                            break;
                        case 90:
                            t6x t6xVar = new t6x(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "modification-date"), t6xVar);
                            break;
                        case 91:
                            nsh nshVar = new nsh(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "creator"), nshVar);
                            break;
                        case 92:
                            dj6 dj6Var = new dj6(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-count"), dj6Var);
                            break;
                        case 93:
                            mip mipVar = new mip(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "paragraph-count"), mipVar);
                            break;
                        case 94:
                            ge9 ge9Var = new ge9(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "word-count"), ge9Var);
                            break;
                        case 95:
                            rpo rpoVar = new rpo(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "character-count"), rpoVar);
                            break;
                        case 96:
                            z8u z8uVar = new z8u(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "table-count"), z8uVar);
                            break;
                        case 97:
                            fbk fbkVar = new fbk(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "image-count"), fbkVar);
                            break;
                        case 98:
                            g7b g7bVar = new g7b(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "object-count"), g7bVar);
                            break;
                        case 99:
                            chj chjVar = new chj(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-display"), chjVar);
                            break;
                        case 100:
                            swa swaVar = new swa(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-next"), swaVar);
                            break;
                        case 101:
                            b6d b6dVar = new b6d(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-row-select"), b6dVar);
                            break;
                        case 102:
                            zsn zsnVar = new zsn(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-row-number"), zsnVar);
                            break;
                        case 103:
                            xwz xwzVar = new xwz(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "database-name"), xwzVar);
                            break;
                        case 104:
                            knb knbVar = new knb(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-variable-set"), knbVar);
                            break;
                        case 105:
                            uqw uqwVar = new uqw(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "page-variable-get"), uqwVar);
                            break;
                        case 106:
                            w7g w7gVar = new w7g(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "placeholder"), w7gVar);
                            break;
                        case 107:
                            qxw qxwVar = new qxw(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "conditional-text"), qxwVar);
                            break;
                        case 108:
                            mqz mqzVar = new mqz(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "hidden-text"), mqzVar);
                            break;
                        case 109:
                            vqo vqoVar = new vqo(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "reference-ref"), vqoVar);
                            break;
                        case 110:
                            ri7 ri7Var = new ri7(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bookmark-ref"), ri7Var);
                            break;
                        case 111:
                            nh5 nh5Var = new nh5(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "note-ref"), nh5Var);
                            break;
                        case 112:
                            kg7 kg7Var = new kg7(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "sequence-ref"), kg7Var);
                            break;
                        case 113:
                            jof jofVar = new jof(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "script"), jofVar);
                            break;
                        case 114:
                            ezp ezpVar = new ezp(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "execute-macro"), ezpVar);
                            break;
                        case 115:
                            t5f t5fVar = new t5f(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "hidden-paragraph"), t5fVar);
                            break;
                        case 116:
                            oiv oivVar = new oiv(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "dde-connection"), oivVar);
                            break;
                        case 117:
                            f3b f3bVar = new f3b(abstractC13912i5);
                            list3 = this.f25809c5;
                            c7394ca3 = new C7394ca(C14113y2.m67408k4("text:", "measure"), f3bVar);
                            break;
                        case 118:
                            jwc jwcVar = new jwc(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "table-formula"), jwcVar);
                            break;
                        case 119:
                            phu phuVar = new phu(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark-start"), phuVar);
                            break;
                        case 120:
                            s3h s3hVar = new s3h(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark-end"), s3hVar);
                            break;
                        case 121:
                            vhx vhxVar = new vhx(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "toc-mark"), vhxVar);
                            break;
                        case 122:
                            veo veoVar = new veo(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark-start"), veoVar);
                            break;
                        case 123:
                            tuc tucVar = new tuc(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark-end"), tucVar);
                            break;
                        case 124:
                            dxs dxsVar = new dxs(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "user-index-mark"), dxsVar);
                            break;
                        case 125:
                            a3u a3uVar = new a3u(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark-start"), a3uVar);
                            break;
                        case 126:
                            f6b f6bVar = new f6b(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark-end"), f6bVar);
                            break;
                        case 127:
                            vpe vpeVar = new vpe(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "alphabetical-index-mark"), vpeVar);
                            break;
                        case 128:
                            c9v c9vVar = new c9v(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("text:", "bibliography-mark"), c9vVar);
                            break;
                        case 129:
                            coj cojVar = new coj(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "header"), cojVar);
                            break;
                        case 130:
                            q5v q5vVar = new q5v(abstractC13912i5);
                            list = this.f25809c5;
                            c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "footer"), q5vVar);
                            break;
                        case 131:
                            oul oulVar = new oul(abstractC13912i5);
                            list = this.f25809c5;
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
                    OooOO0O.OooO0O0("_TEXT", abstractC13912i5.mo65042rv(), this.f25809c5);
                }
            }
            list.addItem(c7394ca);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m35551x1() {
        this.f25817x1 = false;
        this.f25814kk = 4294967295L;
        this.f25816to = false;
        this.f25809c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String str3;
        String str4;
        Object objM29541kk;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(this.f25813k4));
        boolean z = this.f25817x1;
        String str5 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("text:restart-numbering", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f25814kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:start-value", C13850af.m65147x1(j));
        }
        boolean z2 = this.f25816to;
        if (z2) {
            if (z2) {
                str5 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:is-list-header", str5);
        }
        String str6 = this.f25810du;
        if (str6 != null) {
            c3059ii.m12955x1("text:style-name", str6);
        }
        String str7 = this.f25812h4;
        if (str7 != null) {
            c3059ii.m12955x1("text:class-names", str7);
        }
        String str8 = this.f25815m9;
        if (str8 != null) {
            c3059ii.m12955x1("text:cond-style-name", str8);
        }
        String str9 = this.f25811dy;
        if (str9 != null) {
            c3059ii.m12955x1("text:id", str9);
        }
        List.Enumerator<C7394ca> it = this.f25809c5.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25808jd.m27428k4(next.m29539k4())) {
                    case 8:
                        str3 = "text";
                        str4 = "number";
                        objM29541kk = next.m29541kk();
                        break;
                    case 9:
                        ((z1e) next.m29541kk()).mo6846k4("text", c3059ii, "s");
                        continue;
                    case 10:
                        ((tf7) next.m29541kk()).mo6846k4("text", c3059ii, "tab");
                        continue;
                    case 11:
                        ((jxj) next.m29541kk()).mo6846k4("text", c3059ii, "line-break");
                        continue;
                    case 12:
                        ((tfm) next.m29541kk()).mo6846k4("text", c3059ii, "soft-page-break");
                        continue;
                    case 13:
                        ((omk) next.m29541kk()).mo6846k4("text", c3059ii, "span");
                        continue;
                    case 14:
                        ((hqi) next.m29541kk()).mo6846k4("text", c3059ii, "a");
                        continue;
                    case 15:
                        ((y2n) next.m29541kk()).mo6846k4("text", c3059ii, "bookmark");
                        continue;
                    case 16:
                        ((qah) next.m29541kk()).mo6846k4("text", c3059ii, "bookmark-start");
                        continue;
                    case 17:
                        ((gij) next.m29541kk()).mo6846k4("text", c3059ii, "bookmark-end");
                        continue;
                    case 18:
                        ((q6c) next.m29541kk()).mo6846k4("text", c3059ii, "reference-mark");
                        continue;
                    case 19:
                        ((rft) next.m29541kk()).mo6846k4("text", c3059ii, "reference-mark-start");
                        continue;
                    case 20:
                        ((a8b) next.m29541kk()).mo6846k4("text", c3059ii, "reference-mark-end");
                        continue;
                    case 21:
                        ((v8e) next.m29541kk()).mo6846k4("text", c3059ii, BackupFile.FILE_CONTENT_TYPE_NOTE);
                        continue;
                    case 22:
                        ((ohe) next.m29541kk()).mo6846k4("text", c3059ii, "ruby");
                        continue;
                    case 23:
                        ((vdg) next.m29541kk()).mo6846k4("office", c3059ii, "annotation");
                        continue;
                    case 24:
                        ((wiq) next.m29541kk()).mo6846k4("text", c3059ii, "change-marks");
                        continue;
                    case 25:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, DrawToolFactory.LASSO_TYPE_RECT);
                        continue;
                    case 26:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, "line");
                        continue;
                    case 27:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, "polyline");
                        continue;
                    case 28:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, "polygon");
                        continue;
                    case 29:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, "regular-polygon");
                        continue;
                    case 30:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, "path");
                        continue;
                    case 31:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, "circle");
                        continue;
                    case 32:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, "ellipse");
                        continue;
                    case 33:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, "g");
                        continue;
                    case 34:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, "page-thumbnail");
                        continue;
                    case 35:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, "frame");
                        continue;
                    case 36:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, "measure");
                        continue;
                    case 37:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, "caption");
                        continue;
                    case 38:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, "connector");
                        continue;
                    case 39:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, "control");
                        continue;
                    case 40:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, "scene");
                        continue;
                    case 41:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, "custom-shape");
                        continue;
                    case 42:
                        ((zg0) next.m29541kk()).mo6846k4("draw", c3059ii, "a");
                        continue;
                    case 43:
                        ((r9q) next.m29541kk()).mo6846k4("text", c3059ii, "date");
                        continue;
                    case 44:
                        ((ldn) next.m29541kk()).mo6846k4("text", c3059ii, "time");
                        continue;
                    case 45:
                        ((p9k) next.m29541kk()).mo6846k4("text", c3059ii, "page-number");
                        continue;
                    case 46:
                        ((cb8) next.m29541kk()).mo6846k4("text", c3059ii, "page-continuation");
                        continue;
                    case 47:
                        ((akh) next.m29541kk()).mo6846k4("text", c3059ii, "sender-firstname");
                        continue;
                    case 48:
                        ((lde) next.m29541kk()).mo6846k4("text", c3059ii, "sender-lastname");
                        continue;
                    case 49:
                        ((lzv) next.m29541kk()).mo6846k4("text", c3059ii, "sender-initials");
                        continue;
                    case 50:
                        ((meq) next.m29541kk()).mo6846k4("text", c3059ii, "sender-title");
                        continue;
                    case 51:
                        ((so4) next.m29541kk()).mo6846k4("text", c3059ii, "sender-position");
                        continue;
                    case 52:
                        ((ubu) next.m29541kk()).mo6846k4("text", c3059ii, "sender-email");
                        continue;
                    case 53:
                        ((pz4) next.m29541kk()).mo6846k4("text", c3059ii, "sender-phone-private");
                        continue;
                    case 54:
                        ((btg) next.m29541kk()).mo6846k4("text", c3059ii, "sender-fax");
                        continue;
                    case 55:
                        ((rpr) next.m29541kk()).mo6846k4("text", c3059ii, "sender-company");
                        continue;
                    case 56:
                        ((pe5) next.m29541kk()).mo6846k4("text", c3059ii, "sender-phone-work");
                        continue;
                    case 57:
                        ((coq) next.m29541kk()).mo6846k4("text", c3059ii, "sender-street");
                        continue;
                    case 58:
                        ((myn) next.m29541kk()).mo6846k4("text", c3059ii, "sender-city");
                        continue;
                    case 59:
                        ((mcc) next.m29541kk()).mo6846k4("text", c3059ii, "sender-postal-code");
                        continue;
                    case 60:
                        ((rhs) next.m29541kk()).mo6846k4("text", c3059ii, "sender-country");
                        continue;
                    case 61:
                        ((gt9) next.m29541kk()).mo6846k4("text", c3059ii, "sender-state-or-province");
                        continue;
                    case 62:
                        ((z9q) next.m29541kk()).mo6846k4("text", c3059ii, "author-name");
                        continue;
                    case 63:
                        ((pya) next.m29541kk()).mo6846k4("text", c3059ii, "author-initials");
                        continue;
                    case 64:
                        ((m4c) next.m29541kk()).mo6846k4("text", c3059ii, "chapter");
                        continue;
                    case 65:
                        ((gnb) next.m29541kk()).mo6846k4("text", c3059ii, "file-name");
                        continue;
                    case 66:
                        ((b5b) next.m29541kk()).mo6846k4("text", c3059ii, "template-name");
                        continue;
                    case 67:
                        str3 = "text";
                        str4 = "sheet-name";
                        objM29541kk = next.m29541kk();
                        break;
                    case 68:
                        ((x9t) next.m29541kk()).mo6846k4("text", c3059ii, "variable-set");
                        continue;
                    case 69:
                        ((jme) next.m29541kk()).mo6846k4("text", c3059ii, "variable-get");
                        continue;
                    case 70:
                        ((mbn) next.m29541kk()).mo6846k4("text", c3059ii, "variable-input");
                        continue;
                    case 71:
                        ((pt7) next.m29541kk()).mo6846k4("text", c3059ii, "user-field-get");
                        continue;
                    case 72:
                        ((jai) next.m29541kk()).mo6846k4("text", c3059ii, "user-field-input");
                        continue;
                    case 73:
                        ((ykd) next.m29541kk()).mo6846k4("text", c3059ii, "sequence");
                        continue;
                    case 74:
                        ((ng8) next.m29541kk()).mo6846k4("text", c3059ii, "expression");
                        continue;
                    case 75:
                        ((y9s) next.m29541kk()).mo6846k4("text", c3059ii, "text-input");
                        continue;
                    case 76:
                        ((ot7) next.m29541kk()).mo6846k4("text", c3059ii, "initial-creator");
                        continue;
                    case 77:
                        ((gyt) next.m29541kk()).mo6846k4("text", c3059ii, "creation-date");
                        continue;
                    case 78:
                        ((q0x) next.m29541kk()).mo6846k4("text", c3059ii, "creation-time");
                        continue;
                    case 79:
                        ((agb) next.m29541kk()).mo6846k4("text", c3059ii, "description");
                        continue;
                    case 80:
                        ((sza) next.m29541kk()).mo6846k4("text", c3059ii, "user-defined");
                        continue;
                    case 81:
                        ((xxs) next.m29541kk()).mo6846k4("text", c3059ii, "print-time");
                        continue;
                    case 82:
                        ((z5t) next.m29541kk()).mo6846k4("text", c3059ii, "print-date");
                        continue;
                    case 83:
                        ((qwm) next.m29541kk()).mo6846k4("text", c3059ii, "printed-by");
                        continue;
                    case 84:
                        ((ab7) next.m29541kk()).mo6846k4("text", c3059ii, NoteMeta.PROPERTY_TITLE);
                        continue;
                    case 85:
                        ((l7k) next.m29541kk()).mo6846k4("text", c3059ii, "subject");
                        continue;
                    case 86:
                        ((tqy) next.m29541kk()).mo6846k4("text", c3059ii, "keywords");
                        continue;
                    case 87:
                        ((dnf) next.m29541kk()).mo6846k4("text", c3059ii, "editing-cycles");
                        continue;
                    case 88:
                        ((sfn) next.m29541kk()).mo6846k4("text", c3059ii, "editing-duration");
                        continue;
                    case 89:
                        ((yci) next.m29541kk()).mo6846k4("text", c3059ii, "modification-time");
                        continue;
                    case 90:
                        ((t6x) next.m29541kk()).mo6846k4("text", c3059ii, "modification-date");
                        continue;
                    case 91:
                        ((nsh) next.m29541kk()).mo6846k4("text", c3059ii, "creator");
                        continue;
                    case 92:
                        ((dj6) next.m29541kk()).mo6846k4("text", c3059ii, "page-count");
                        continue;
                    case 93:
                        ((mip) next.m29541kk()).mo6846k4("text", c3059ii, "paragraph-count");
                        continue;
                    case 94:
                        ((ge9) next.m29541kk()).mo6846k4("text", c3059ii, "word-count");
                        continue;
                    case 95:
                        ((rpo) next.m29541kk()).mo6846k4("text", c3059ii, "character-count");
                        continue;
                    case 96:
                        ((z8u) next.m29541kk()).mo6846k4("text", c3059ii, "table-count");
                        continue;
                    case 97:
                        ((fbk) next.m29541kk()).mo6846k4("text", c3059ii, "image-count");
                        continue;
                    case 98:
                        ((g7b) next.m29541kk()).mo6846k4("text", c3059ii, "object-count");
                        continue;
                    case 99:
                        ((chj) next.m29541kk()).mo6846k4("text", c3059ii, "database-display");
                        continue;
                    case 100:
                        ((swa) next.m29541kk()).mo6846k4("text", c3059ii, "database-next");
                        continue;
                    case 101:
                        ((b6d) next.m29541kk()).mo6846k4("text", c3059ii, "database-row-select");
                        continue;
                    case 102:
                        ((zsn) next.m29541kk()).mo6846k4("text", c3059ii, "database-row-number");
                        continue;
                    case 103:
                        ((xwz) next.m29541kk()).mo6846k4("text", c3059ii, "database-name");
                        continue;
                    case 104:
                        ((knb) next.m29541kk()).mo6846k4("text", c3059ii, "page-variable-set");
                        continue;
                    case 105:
                        ((uqw) next.m29541kk()).mo6846k4("text", c3059ii, "page-variable-get");
                        continue;
                    case 106:
                        ((w7g) next.m29541kk()).mo6846k4("text", c3059ii, "placeholder");
                        continue;
                    case 107:
                        ((qxw) next.m29541kk()).mo6846k4("text", c3059ii, "conditional-text");
                        continue;
                    case 108:
                        ((mqz) next.m29541kk()).mo6846k4("text", c3059ii, "hidden-text");
                        continue;
                    case 109:
                        ((vqo) next.m29541kk()).mo6846k4("text", c3059ii, "reference-ref");
                        continue;
                    case 110:
                        ((ri7) next.m29541kk()).mo6846k4("text", c3059ii, "bookmark-ref");
                        continue;
                    case 111:
                        ((nh5) next.m29541kk()).mo6846k4("text", c3059ii, "note-ref");
                        continue;
                    case 112:
                        ((kg7) next.m29541kk()).mo6846k4("text", c3059ii, "sequence-ref");
                        continue;
                    case 113:
                        ((jof) next.m29541kk()).mo6846k4("text", c3059ii, "script");
                        continue;
                    case 114:
                        ((ezp) next.m29541kk()).mo6846k4("text", c3059ii, "execute-macro");
                        continue;
                    case 115:
                        ((t5f) next.m29541kk()).mo6846k4("text", c3059ii, "hidden-paragraph");
                        continue;
                    case 116:
                        ((oiv) next.m29541kk()).mo6846k4("text", c3059ii, "dde-connection");
                        continue;
                    case 117:
                        ((f3b) next.m29541kk()).mo6846k4("text", c3059ii, "measure");
                        continue;
                    case 118:
                        ((jwc) next.m29541kk()).mo6846k4("text", c3059ii, "table-formula");
                        continue;
                    case 119:
                        ((phu) next.m29541kk()).mo6846k4("text", c3059ii, "toc-mark-start");
                        continue;
                    case 120:
                        ((s3h) next.m29541kk()).mo6846k4("text", c3059ii, "toc-mark-end");
                        continue;
                    case 121:
                        ((vhx) next.m29541kk()).mo6846k4("text", c3059ii, "toc-mark");
                        continue;
                    case 122:
                        ((veo) next.m29541kk()).mo6846k4("text", c3059ii, "user-index-mark-start");
                        continue;
                    case 123:
                        ((tuc) next.m29541kk()).mo6846k4("text", c3059ii, "user-index-mark-end");
                        continue;
                    case 124:
                        ((dxs) next.m29541kk()).mo6846k4("text", c3059ii, "user-index-mark");
                        continue;
                    case 125:
                        ((a3u) next.m29541kk()).mo6846k4("text", c3059ii, "alphabetical-index-mark-start");
                        continue;
                    case 126:
                        ((f6b) next.m29541kk()).mo6846k4("text", c3059ii, "alphabetical-index-mark-end");
                        continue;
                    case 127:
                        ((vpe) next.m29541kk()).mo6846k4("text", c3059ii, "alphabetical-index-mark");
                        continue;
                    case 128:
                        ((c9v) next.m29541kk()).mo6846k4("text", c3059ii, "bibliography-mark");
                        continue;
                    case 129:
                        ((coj) next.m29541kk()).mo6846k4("presentation", c3059ii, "header");
                        continue;
                    case 130:
                        ((q5v) next.m29541kk()).mo6846k4("presentation", c3059ii, "footer");
                        continue;
                    case 131:
                        ((oul) next.m29541kk()).mo6846k4("presentation", c3059ii, "date-time");
                        continue;
                    case 132:
                        c3059ii.mo21918x1((String) next.m29541kk());
                        continue;
                }
                m29301k4(str3, c3059ii, str4, (String) objM29541kk, false);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
