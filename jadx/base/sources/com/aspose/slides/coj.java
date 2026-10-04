package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.AbstractC11721ck;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class coj extends abb {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4392k4 = new C7017h4("generator", NoteMeta.PROPERTY_TITLE, "description", "subject", "keyword", "initial-creator", "creator", "printed-by", "creation-date", "date", "print-date", "template", "auto-reload", "hyperlink-behaviour", "language", "editing-cycles", "editing-duration", "document-statistic", "user-defined");

    public coj(C11839vw c11839vw, OdpSerializationContext odpSerializationContext) {
        super(c11839vw, odpSerializationContext);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4696k4(IDocumentProperties iDocumentProperties) {
        Object objM41564kk;
        Object objM29541kk;
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "document-meta".equals(m55443jd().mo65023fa())) {
                List.Enumerator<C7394ca> it = new com.aspose.slides.internal.p332p7.jb7(m55443jd()).m34623x1().m44749k4().iterator();
                while (it.hasNext()) {
                    try {
                        C7394ca next = it.next();
                        switch (f4392k4.m27428k4(next.m29539k4())) {
                            case 0:
                                iDocumentProperties.setNameOfApplication((String) next.m29541kk());
                                break;
                            case 1:
                                iDocumentProperties.setTitle((String) next.m29541kk());
                                break;
                            case 2:
                                iDocumentProperties.setComments((String) next.m29541kk());
                                break;
                            case 3:
                                iDocumentProperties.setSubject((String) next.m29541kk());
                                break;
                            case 4:
                                iDocumentProperties.setKeywords((String) next.m29541kk());
                                break;
                            case 5:
                                iDocumentProperties.setAuthor((String) next.m29541kk());
                                break;
                            case 6:
                                iDocumentProperties.setLastSavedBy((String) next.m29541kk());
                                break;
                            case 7:
                                objM29541kk = next.m29541kk();
                                break;
                            case 8:
                                ((DocumentProperties) iDocumentProperties).m1336k4(((C14084qq) C7019kk.m27464to(next.m29541kk(), C14084qq.class)).Clone());
                                break;
                            case 9:
                                ((DocumentProperties) iDocumentProperties).m1346to(C14084qq.m67089k4((String) next.m29541kk(), C11697x1.m55252to(), 16).Clone());
                                break;
                            case 10:
                                ((DocumentProperties) iDocumentProperties).m1343kk(((C14084qq) C7019kk.m27464to(next.m29541kk(), C14084qq.class)).Clone());
                                break;
                            case 11:
                                break;
                            case 12:
                                break;
                            case 13:
                                break;
                            case 14:
                                objM29541kk = next.m29541kk();
                                break;
                            case 15:
                                iDocumentProperties.setRevisionNumber(((Long) next.m29541kk()).intValue());
                                break;
                            case 16:
                                ((DocumentProperties) iDocumentProperties).m1335k4(((C14077m4) C7019kk.m27464to(next.m29541kk(), C14077m4.class)).Clone());
                                break;
                            case 17:
                                break;
                            case 18:
                                com.aspose.slides.internal.p332p7.t7u t7uVar = (com.aspose.slides.internal.p332p7.t7u) next.m29541kk();
                                if (!C14113y2.m67411k4(t7uVar.m41561k4())) {
                                    try {
                                        int iM41565x1 = t7uVar.m41565x1();
                                        if (iM41565x1 != 1) {
                                            objM41564kk = iM41565x1 != 2 ? iM41565x1 != 3 ? iM41565x1 != 4 ? t7uVar.m41564kk() : Boolean.valueOf(C14051ck.m66555k4(t7uVar.m41564kk())) : wgi.m72735ne(t7uVar.m41564kk()).Clone() : C14084qq.m67089k4(t7uVar.m41564kk(), C11697x1.m55252to(), 16).Clone();
                                        } else {
                                            int[] iArr = {0};
                                            objM41564kk = C14057f9.m66590k4(t7uVar.m41564kk(), iArr) ? Integer.valueOf(iArr[0]) : Float.valueOf(C14064he.m66707k4(t7uVar.m41564kk(), C11697x1.m55250kk()));
                                        }
                                    } catch (RuntimeException e) {
                                        C3085sv.m13082k4(e);
                                        objM41564kk = t7uVar.m41564kk();
                                    }
                                    if (objM41564kk != null) {
                                        ((DocumentProperties) iDocumentProperties).m1339k4(t7uVar.m41561k4(), objM41564kk);
                                    }
                                }
                                break;
                            default:
                                throw new Exception(C14113y2.m67408k4("Unknown element \"", next.m29539k4(), "\""));
                        }
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
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: kk */
    public final void m4697kk(IDocumentProperties iDocumentProperties) {
        mo3467du().m55414ck();
        m4698x1(iDocumentProperties);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4698x1(IDocumentProperties iDocumentProperties) {
        int i;
        String strM72721k4;
        C14084qq c14084qqM67093k4;
        mo55332up();
        com.aspose.slides.internal.p332p7.jb7 jb7Var = new com.aspose.slides.internal.p332p7.jb7();
        jb7Var.m34622k4();
        if (!C14113y2.m67411k4(iDocumentProperties.getNameOfApplication())) {
            jb7Var.m34623x1().m44750k4(new C7394ca("generator", iDocumentProperties.getNameOfApplication()));
        }
        if (!C14113y2.m67411k4(iDocumentProperties.getTitle())) {
            jb7Var.m34623x1().m44750k4(new C7394ca(NoteMeta.PROPERTY_TITLE, iDocumentProperties.getTitle()));
        }
        if (!C14113y2.m67411k4(iDocumentProperties.getComments())) {
            jb7Var.m34623x1().m44750k4(new C7394ca("description", iDocumentProperties.getComments()));
        }
        if (!C14113y2.m67411k4(iDocumentProperties.getSubject())) {
            jb7Var.m34623x1().m44750k4(new C7394ca("subject", iDocumentProperties.getSubject()));
        }
        if (!C14113y2.m67411k4(iDocumentProperties.getKeywords())) {
            jb7Var.m34623x1().m44750k4(new C7394ca("keyword", iDocumentProperties.getKeywords()));
        }
        if (!C14113y2.m67411k4(iDocumentProperties.getAuthor())) {
            jb7Var.m34623x1().m44750k4(new C7394ca("initial-creator", iDocumentProperties.getAuthor()));
        }
        if (!C14113y2.m67411k4(iDocumentProperties.getLastSavedBy())) {
            jb7Var.m34623x1().m44750k4(new C7394ca("creator", iDocumentProperties.getLastSavedBy()));
        }
        DocumentProperties documentProperties = (DocumentProperties) iDocumentProperties;
        jb7Var.m34623x1().m44750k4(new C7394ca("creation-date", documentProperties.m1347x1().Clone()));
        jb7Var.m34623x1().m44750k4(new C7394ca("date", C13850af.m65108k4(documentProperties.m1342kk().Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffK")));
        jb7Var.m34623x1().m44750k4(new C7394ca("print-date", documentProperties.m1345to().Clone()));
        jb7Var.m34623x1().m44750k4(new C7394ca("editing-cycles", Long.valueOf(((long) iDocumentProperties.getRevisionNumber()) & 4294967295L)));
        jb7Var.m34623x1().m44750k4(new C7394ca("editing-duration", documentProperties.m1334k4().Clone()));
        if (iDocumentProperties.getCountOfCustomProperties() > 0) {
            for (int i2 = 0; i2 < iDocumentProperties.getCountOfCustomProperties(); i2++) {
                String customPropertyName = iDocumentProperties.getCustomPropertyName(i2);
                Object objM1348x1 = documentProperties.m1348x1(customPropertyName);
                if (!C14113y2.m67411k4(customPropertyName) && objM1348x1 != null) {
                    com.aspose.slides.internal.p332p7.t7u t7uVar = new com.aspose.slides.internal.p332p7.t7u();
                    t7uVar.m41563k4(customPropertyName);
                    if (C7019kk.m27469x1(objM1348x1, Boolean.class)) {
                        t7uVar.m41562k4(4);
                        strM72721k4 = C14113y2.m67368h4(objM1348x1.toString());
                    } else {
                        if (C7019kk.m27469x1(objM1348x1, C14084qq.class)) {
                            t7uVar.m41562k4(2);
                            c14084qqM67093k4 = (C14084qq) C7019kk.m27464to(objM1348x1, C14084qq.class);
                        } else if (C7019kk.m27469x1(objM1348x1, Date.class)) {
                            t7uVar.m41562k4(2);
                            c14084qqM67093k4 = C14084qq.m67093k4((Date) C7019kk.m27464to(objM1348x1, Date.class));
                        } else if (C7019kk.m27469x1(objM1348x1, C14077m4.class)) {
                            t7uVar.m41562k4(3);
                            strM72721k4 = wgi.m72721k4(((C14077m4) C7019kk.m27464to(objM1348x1, C14077m4.class)).Clone());
                        } else {
                            t7uVar.m41566x1(objM1348x1.toString());
                            if (!C7019kk.m27469x1(objM1348x1, Integer.class) && !C7019kk.m27469x1(objM1348x1, Float.class) && !C7019kk.m27469x1(objM1348x1, Double.class)) {
                                i = C7019kk.m27469x1(objM1348x1, String.class) ? 5 : 1;
                                jb7Var.m34623x1().m44750k4(new C7394ca("user-defined", t7uVar));
                            }
                            t7uVar.m41562k4(i);
                            jb7Var.m34623x1().m44750k4(new C7394ca("user-defined", t7uVar));
                        }
                        strM72721k4 = c14084qqM67093k4.m67140k4("yyyy-MM-ddTHH:mm:ss");
                    }
                    t7uVar.m41566x1(strM72721k4);
                    jb7Var.m34623x1().m44750k4(new C7394ca("user-defined", t7uVar));
                }
            }
        }
        jb7Var.mo6846k4(null, m55442ck(), "document-meta");
        mo55333yj();
    }

    public coj(C11839vw c11839vw, AbstractC11721ck abstractC11721ck) {
        super(c11839vw, abstractC11721ck);
    }
}
