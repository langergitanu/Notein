package o0o0OOO;

import OooOo.C20485OooOoO;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookVariantFile;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateVariantFile;
import com.orion.notein.domain.models.papertheme.paperstyle.NonePaperStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOO.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$createNote$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1890, 1968, 1978, 1982, 2017, CommonConstant.RETCODE.INDEPENDENT_AUTH_NOT_ALLOW, 2030, 2037}, m80625m = "invokeSuspend")
public final class C30516Oooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f108961OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108962OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108963OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108964OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108965OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30516Oooooo(C30520o000000o c30520o000000o, String str, String str2, Continuation<? super C30516Oooooo> continuation) {
        super(2, continuation);
        this.f108964OooOoO0 = c30520o000000o;
        this.f108963OooOoO = str;
        this.f108965OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30516Oooooo(this.f108964OooOoO0, this.f108963OooOoO, this.f108965OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C30516Oooooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x045c, code lost:
    
        if (r0 == r6) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0563, code lost:
    
        if (r0 == r6) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0565 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0284  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PaperTheme paperTheme;
        Object objOooO0OO;
        MyTemplate myTemplate;
        PaperTheme paperTheme2;
        PaperTheme paperTheme3;
        String str;
        Object objOooO0OO2;
        TemplateBookPaperTheme templateBookPaperThemeCopy$default;
        Object objOooO0oO;
        Object next;
        String selectedColorName;
        Object objOooO0oO2;
        Object next2;
        String selectedColorName2;
        String str2;
        String str3;
        String str4;
        String str5;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108961OooOo;
        C30520o000000o c30520o000000o = this.f108964OooOoO0;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                int iIntValue = ((Number) c30520o000000o.f109043OoooOOo.f121747OooOo0o.getValue()).intValue();
                o0OOo0o.o000OO o000oo2 = c30520o000000o.f109004OooOO0;
                String str6 = this.f108965OooOoOO;
                String str7 = this.f108963OooOoO;
                if (iIntValue == 0) {
                    PaperTheme paperTheme4 = (PaperTheme) c30520o000000o.f109044OoooOo0.f121747OooOo0o.getValue();
                    if (paperTheme4 == null || (paperTheme = (PaperTheme) c30520o000000o.f109046OoooOoo.f121747OooOo0o.getValue()) == null) {
                        return null;
                    }
                    PaperSpec paperSpecOooOOo = C30520o000000o.OooOOo((String) c30520o000000o.f109012OooOOo0.getValue());
                    boolean zBooleanValue = ((Boolean) c30520o000000o.f109017OooOo0O.getValue()).booleanValue();
                    this.f108961OooOo = 1;
                    o000oo2.getClass();
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    ArrayList arrayList = new ArrayList();
                    boolean z = ((paperTheme instanceof LambdaPaperTheme) && (((LambdaPaperTheme) paperTheme).getPaperStyle() instanceof NonePaperStyle)) ? false : true;
                    if (!zBooleanValue && z) {
                        Page page = new Page(C24761OooO.OooO00o("toString(...)"), string, paperSpecOooOOo, paperTheme.getOrientation(), paperTheme, null, null, null, zBooleanValue, -1, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520416, null);
                        zBooleanValue = zBooleanValue;
                        arrayList.add(page);
                    }
                    arrayList.add(new Page(C24761OooO.OooO00o("toString(...)"), string, paperSpecOooOOo, paperTheme4.getOrientation(), paperTheme4, null, null, null, zBooleanValue, 1, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520416, null));
                    objOooO0OO = o000oo2.OooO0OO(new Note.Builder().setId(string).setTitle(str7).setDefaultPageSpec(paperSpecOooOOo).setDefaultPageTheme(paperTheme4).setPages(arrayList).setParentId(str6).setUnbounded(zBooleanValue), this);
                    break;
                } else {
                    if (iIntValue != 1 || (myTemplate = (MyTemplate) c30520o000000o.f109037OoooO.getValue()) == null || myTemplate.getId().length() == 0) {
                        return null;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                    String id = myTemplate.getId();
                    PaperTheme paperTheme5 = myTemplate.getPaperTheme();
                    String simpleName = paperTheme5 != null ? paperTheme5.getClass().getSimpleName() : null;
                    C33781o00o0O c33781o00o0O = c30520o000000o.f109032Oooo0OO;
                    Object value = c33781o00o0O.getValue();
                    C33781o00o0O c33781o00o0O2 = c30520o000000o.f109033Oooo0o;
                    Object value2 = c33781o00o0O2.getValue();
                    C33781o00o0O c33781o00o0O3 = c30520o000000o.f109036Oooo0oo;
                    Object value3 = c33781o00o0O3.getValue();
                    StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("createNote - MyTemplate: id=", id, ", paperTheme type=", simpleName, ", variantSelectorTemplateId=");
                    sbOooO0O0.append(value);
                    sbOooO0O0.append(", tempOrientation=");
                    sbOooO0O0.append(value2);
                    sbOooO0O0.append(", tempColor=");
                    sbOooO0O0.append(value3);
                    c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
                    if ((myTemplate.getPaperTheme() instanceof TemplateMaterialPaperTheme) && kotlin.jvm.internal.OooOOO0.OooO0O0(c33781o00o0O.getValue(), myTemplate.getId())) {
                        PaperTheme paperTheme6 = myTemplate.getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme6, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme");
                        TemplateMaterialPaperTheme templateMaterialPaperTheme = (TemplateMaterialPaperTheme) paperTheme6;
                        Orientation selectedOrientation = (Orientation) c33781o00o0O2.getValue();
                        if (selectedOrientation == null) {
                            selectedOrientation = templateMaterialPaperTheme.getSelectedOrientation();
                        }
                        String selectedColor = (String) c33781o00o0O3.getValue();
                        if (selectedColor == null) {
                            selectedColor = templateMaterialPaperTheme.getSelectedColor();
                        }
                        c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                        c20358OooO00o.OooO00o("createNote - Applying temp variant: orientation=" + selectedOrientation + ", color=" + selectedColor + ", original: orientation=" + templateMaterialPaperTheme.getSelectedOrientation() + ", color=" + templateMaterialPaperTheme.getSelectedColor(), new Object[0]);
                        Iterator<T> it = templateMaterialPaperTheme.getVariantFiles().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next2 = it.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateVariantFile) next2).getColor(), selectedColor)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        TemplateVariantFile templateVariantFile = (TemplateVariantFile) next2;
                        if (templateVariantFile == null || (selectedColorName2 = templateVariantFile.getColorName()) == null) {
                            selectedColorName2 = templateMaterialPaperTheme.getSelectedColorName();
                        }
                        paperTheme2 = TemplateMaterialPaperTheme.copy$default(templateMaterialPaperTheme, null, null, null, selectedOrientation, selectedColor, selectedColorName2, null, null, null, 455, null);
                    } else {
                        c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                        c20358OooO00o.OooO00o("createNote - Using original paperTheme (no temp variant)", new Object[0]);
                        paperTheme2 = myTemplate.getPaperTheme();
                    }
                    if (paperTheme2 == null) {
                        return null;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PaperConfigDialogViewModel");
                    String simpleName2 = paperTheme2.getClass().getSimpleName();
                    PaperOrientation orientation = paperTheme2.getOrientation();
                    boolean z2 = paperTheme2 instanceof TemplateMaterialPaperTheme;
                    if (z2) {
                        TemplateMaterialPaperTheme templateMaterialPaperTheme2 = (TemplateMaterialPaperTheme) paperTheme2;
                        paperTheme3 = paperTheme2;
                        str = "selectedOrientation=" + templateMaterialPaperTheme2.getSelectedOrientation() + ", selectedColor=" + templateMaterialPaperTheme2.getSelectedColor();
                    } else {
                        paperTheme3 = paperTheme2;
                        str = "N/A";
                    }
                    c20358OooO00o2.OooO00o("createNote - Final paperTheme: type=" + simpleName2 + ", orientation=" + orientation + ", materialTheme=" + str, new Object[0]);
                    if (!z2) {
                        PaperTheme paperTheme7 = paperTheme3;
                        if (!(paperTheme7 instanceof TemplateBookPaperTheme)) {
                            PaperSpec paperSpec = myTemplate.getPaperSpec();
                            if (paperSpec == null) {
                                return null;
                            }
                            this.f108961OooOo = 8;
                            o000oo2.getClass();
                            String string2 = UUID.randomUUID().toString();
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
                            objOooO0OO2 = o000oo2.OooO0OO(new Note.Builder().setId(string2).setTitle(str7).setDefaultPageSpec(paperSpec).setDefaultPageTheme(paperTheme7).setParentId(str6).setPages(com.facebook.soloader.OooOo.OooO0oO(new Page(C24761OooO.OooO00o("toString(...)"), string2, paperSpec, paperTheme7.getOrientation(), paperTheme7, null, null, null, false, 1, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520416, null))), this);
                        } else {
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c33781o00o0O.getValue(), myTemplate.getId()) || c33781o00o0O2.getValue() == null || c33781o00o0O3.getValue() == null) {
                                templateBookPaperThemeCopy$default = (TemplateBookPaperTheme) paperTheme7;
                            } else {
                                Object value4 = c33781o00o0O2.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(value4);
                                Orientation orientation2 = (Orientation) value4;
                                Object value5 = c33781o00o0O3.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(value5);
                                String str8 = (String) value5;
                                TemplateBookPaperTheme templateBookPaperTheme = (TemplateBookPaperTheme) paperTheme7;
                                Iterator<T> it2 = templateBookPaperTheme.getVariantFiles().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateBookVariantFile) next).getColor(), str8)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                TemplateBookVariantFile templateBookVariantFile = (TemplateBookVariantFile) next;
                                if (templateBookVariantFile == null || (selectedColorName = templateBookVariantFile.getColorName()) == null) {
                                    selectedColorName = templateBookPaperTheme.getSelectedColorName();
                                }
                                templateBookPaperThemeCopy$default = TemplateBookPaperTheme.copy$default(templateBookPaperTheme, null, null, null, 0, orientation2, str8, selectedColorName, null, null, 399, null);
                            }
                            TemplateBookPaperTheme templateBookPaperTheme2 = templateBookPaperThemeCopy$default;
                            String variantPdfPath = templateBookPaperTheme2.getVariantPdfPath();
                            if (variantPdfPath == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("PaperConfigDialogViewModel");
                                c20358OooO00o3.OooO0OO("createNote - No PDF path found for TemplateBook variant", new Object[0]);
                                return null;
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o4.OooOOO0("PaperConfigDialogViewModel");
                            int pageCount = templateBookPaperTheme2.getPageCount();
                            Orientation selectedOrientation2 = templateBookPaperTheme2.getSelectedOrientation();
                            String selectedColor2 = templateBookPaperTheme2.getSelectedColor();
                            StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(pageCount, "createNote - TemplateBook detected, importing as PDF: pdfPath=", variantPdfPath, ", pageCount=", ", orientation=");
                            sbOooO0OO.append(selectedOrientation2);
                            sbOooO0OO.append(", color=");
                            sbOooO0OO.append(selectedColor2);
                            c20358OooO00o4.OooO00o(sbOooO0OO.toString(), new Object[0]);
                            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Uri.fromFile(new File(variantPdfPath)));
                            this.f108961OooOo = 5;
                            objOooO0oO = c30520o000000o.f109004OooOO0.OooO0oO(listOooO0oO, this.f108965OooOoOO, this.f108963OooOoO, templateBookPaperTheme2, this);
                            if (objOooO0oO != enumC32485OooO00o) {
                                Map map = (Map) objOooO0oO;
                                str4 = (String) oOo000Oo.OooOo.Oooo0oo(map.keySet());
                                if (str4 != null) {
                                    InterfaceC33642Oooo0oo interfaceC33642Oooo0oo = (InterfaceC33642Oooo0oo) map.get(str4);
                                    if (interfaceC33642Oooo0oo != null) {
                                        this.f108962OooOo0o = str4;
                                        this.f108961OooOo = 6;
                                        if (interfaceC33642Oooo0oo.await(this) != enumC32485OooO00o) {
                                            str5 = str4;
                                            str4 = str5;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o5.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o5, "PaperConfigDialogViewModel", "createNote - TemplateBook imported successfully: noteId=", str4), new Object[0]);
                                            this.f108962OooOo0o = str4;
                                            this.f108961OooOo = 7;
                                            if (c30520o000000o.OooOo00(this) != enumC32485OooO00o) {
                                            }
                                        }
                                    } else {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o52.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o52, "PaperConfigDialogViewModel", "createNote - TemplateBook imported successfully: noteId=", str4), new Object[0]);
                                        this.f108962OooOo0o = str4;
                                        this.f108961OooOo = 7;
                                        if (c30520o000000o.OooOo00(this) != enumC32485OooO00o) {
                                        }
                                    }
                                }
                                return str4;
                            }
                        }
                        break;
                    } else {
                        c20358OooO00o2.OooOOO0("PaperConfigDialogViewModel");
                        TemplateMaterialPaperTheme templateMaterialPaperTheme3 = (TemplateMaterialPaperTheme) paperTheme3;
                        c20358OooO00o2.OooO00o("createNote - TemplateMaterialPaperTheme detected, importing as PDF: materialId=" + templateMaterialPaperTheme3.getMaterialId() + ", orientation=" + templateMaterialPaperTheme3.getSelectedOrientation() + ", color=" + templateMaterialPaperTheme3.getSelectedColor(), new Object[0]);
                        String variantPdfPath2 = templateMaterialPaperTheme3.getVariantPdfPath();
                        if (variantPdfPath2 == null) {
                            c20358OooO00o2.OooOOO0("PaperConfigDialogViewModel");
                            c20358OooO00o2.OooO0OO("createNote - No PDF path found for selected variant", new Object[0]);
                            return null;
                        }
                        List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(Uri.fromFile(new File(variantPdfPath2)));
                        this.f108961OooOo = 2;
                        objOooO0oO2 = c30520o000000o.f109004OooOO0.OooO0oO(listOooO0oO2, this.f108965OooOoOO, this.f108963OooOoO, paperTheme3, this);
                        if (objOooO0oO2 != enumC32485OooO00o) {
                            Map map2 = (Map) objOooO0oO2;
                            str2 = (String) oOo000Oo.OooOo.Oooo0oo(map2.keySet());
                            if (str2 != null) {
                                InterfaceC33642Oooo0oo interfaceC33642Oooo0oo2 = (InterfaceC33642Oooo0oo) map2.get(str2);
                                if (interfaceC33642Oooo0oo2 != null) {
                                    this.f108962OooOo0o = str2;
                                    this.f108961OooOo = 3;
                                    if (interfaceC33642Oooo0oo2.await(this) != enumC32485OooO00o) {
                                        str3 = str2;
                                        str2 = str3;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o6.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o6, "PaperConfigDialogViewModel", "createNote - TemplateMaterialPaperTheme imported successfully: noteId=", str2), new Object[0]);
                                        this.f108962OooOo0o = str2;
                                        this.f108961OooOo = 4;
                                        if (c30520o000000o.OooOo00(this) == enumC32485OooO00o) {
                                        }
                                    }
                                } else {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o62.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o62, "PaperConfigDialogViewModel", "createNote - TemplateMaterialPaperTheme imported successfully: noteId=", str2), new Object[0]);
                                    this.f108962OooOo0o = str2;
                                    this.f108961OooOo = 4;
                                    if (c30520o000000o.OooOo00(this) == enumC32485OooO00o) {
                                    }
                                }
                            }
                        }
                    }
                }
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0OO = obj;
                return (String) objOooO0OO;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO2 = obj;
                Map map22 = (Map) objOooO0oO2;
                str2 = (String) oOo000Oo.OooOo.Oooo0oo(map22.keySet());
                if (str2 != null) {
                }
            case 3:
                str3 = this.f108962OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str2 = str3;
                C34406OooO00o.C20358OooO00o c20358OooO00o622 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o622.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o622, "PaperConfigDialogViewModel", "createNote - TemplateMaterialPaperTheme imported successfully: noteId=", str2), new Object[0]);
                this.f108962OooOo0o = str2;
                this.f108961OooOo = 4;
                return c30520o000000o.OooOo00(this) == enumC32485OooO00o ? enumC32485OooO00o : str2;
            case 4:
            case 7:
                String str9 = this.f108962OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return str9;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO = obj;
                Map map3 = (Map) objOooO0oO;
                str4 = (String) oOo000Oo.OooOo.Oooo0oo(map3.keySet());
                if (str4 != null) {
                }
                return str4;
            case 6:
                str5 = this.f108962OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str4 = str5;
                C34406OooO00o.C20358OooO00o c20358OooO00o522 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o522.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o522, "PaperConfigDialogViewModel", "createNote - TemplateBook imported successfully: noteId=", str4), new Object[0]);
                this.f108962OooOo0o = str4;
                this.f108961OooOo = 7;
                if (c30520o000000o.OooOo00(this) != enumC32485OooO00o) {
                    return str4;
                }
                break;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0OO2 = obj;
                return (String) objOooO0OO2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
