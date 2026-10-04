package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.material.PageSize;
import com.orion.notein.domain.models.material.TemplateCollection;
import com.orion.notein.domain.models.material.TemplateFile;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateVariantFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOOO00.C27095OooOo0O;
import o0OOoo0O.C27848OooOOo0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$addTemplateCollectionToMyTemplate$2", m80623f = "ThemeUseCase.kt", m80624l = {415, 489}, m80625m = "invokeSuspend")
public final class C27555o00oOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Orientation f96663OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f96664OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f96665OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C32443OooOOO f96666OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96667OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96668OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TemplateCollection f96669OooOoo0;

    /* JADX INFO: renamed from: o0OOo0o.o00oOOO0$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f96670OooO00o;

        static {
            int[] iArr = new int[PageSize.values().length];
            try {
                iArr[PageSize.f57843A4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageSize.f57844A5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PageSize.LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PageSize.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96670OooO00o = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27555o00oOOO0(TemplateCollection templateCollection, C27570o00oOoo0 c27570o00oOoo0, Continuation<? super C27555o00oOOO0> continuation) {
        super(2, continuation);
        this.f96669OooOoo0 = templateCollection;
        this.f96668OooOoo = c27570o00oOoo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27555o00oOOO0(this.f96669OooOoo0, this.f96668OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27555o00oOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o0;
        Object next;
        Orientation orientation;
        C32443OooOOO c32443OooOOO;
        ArrayList arrayList;
        String str;
        Iterator it;
        C27570o00oOoo0 c27570o00oOoo0;
        ArrayList arrayList2;
        int i;
        String absolutePath;
        TemplateVariantFile templateVariantFile;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f96667OooOoOO;
        C27570o00oOoo0 c27570o00oOoo02 = this.f96668OooOoo;
        C27095OooOo0O c27095OooOo0O = c27570o00oOoo02.f96740OooO0O0;
        TemplateCollection templateCollection = this.f96669OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ThemeUseCase");
            c20358OooO00o.OooO00o(androidx.core.database.OooO00o.OooO00o("addTemplateCollectionToMyTemplate: START - template=", templateCollection.getTitle(), " (id=", templateCollection.getId(), ")"), new Object[0]);
            this.f96667OooOoOO = 1;
            objOooO0o0 = c27095OooOo0O.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f96665OooOoO;
            c32443OooOOO = this.f96666OooOoO0;
            orientation = this.f96663OooOo;
            arrayList = this.f96664OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ThemeUseCase");
            String id = templateCollection.getId();
            String title = templateCollection.getTitle();
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("addTemplateCollectionToMyTemplate: SUCCESS - myTemplateId=", str, ", materialId=", id, ", title=");
            sbOooO0O0.append(title);
            c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
            c20358OooO00o2.OooOOO0("ThemeUseCase");
            c20358OooO00o2.OooO00o("  PaperTheme details: orientation=" + orientation + ", color=" + c32443OooOOO.f116637OooOo + ", variantFiles=" + arrayList.size(), new Object[0]);
            return str;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o0 = obj;
        Iterator it2 = ((Iterable) objOooO0o0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            PaperTheme paperTheme = ((MyTemplate) next).getPaperTheme();
            TemplateMaterialPaperTheme templateMaterialPaperTheme = paperTheme instanceof TemplateMaterialPaperTheme ? (TemplateMaterialPaperTheme) paperTheme : null;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(templateMaterialPaperTheme != null ? templateMaterialPaperTheme.getMaterialId() : null, templateCollection.getId())) {
                break;
            }
        }
        MyTemplate myTemplate = (MyTemplate) next;
        if (myTemplate != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ThemeUseCase");
            c20358OooO00o3.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Template already in my templates: ", templateCollection.getId()), new Object[0]);
            return myTemplate.getId();
        }
        List<TemplateFile> files = templateCollection.getFiles();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = files.iterator();
        while (it3.hasNext()) {
            TemplateFile templateFile = (TemplateFile) it3.next();
            C27848OooOOo0 c27848OooOOo0 = c27570o00oOoo02.f96744OooO0o0;
            String templateId = templateCollection.getId();
            String relativePath = templateFile.getPath();
            kotlin.jvm.internal.OooOOO0.OooO0oO(templateId, "templateId");
            kotlin.jvm.internal.OooOOO0.OooO0oO(relativePath, "relativePath");
            File fileOooO00o = c27848OooOOo0.OooO00o(templateId);
            File file = new File(fileOooO00o, relativePath);
            if (file.exists()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("ApplyTemplateMaterialUseCase");
                c20358OooO00o4.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getTemplateFilePath: found at original path: ", file.getAbsolutePath()), new Object[0]);
                absolutePath = file.getAbsolutePath();
                it = it3;
            } else {
                String strOoooO0 = C33599OooOo0O.OoooO0(relativePath, "资源/");
                if (strOoooO0.equals(relativePath)) {
                    it = it3;
                } else {
                    it = it3;
                    File file2 = new File(fileOooO00o, strOoooO0);
                    if (file2.exists()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5.OooOOO0("ApplyTemplateMaterialUseCase");
                        c20358OooO00o5.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getTemplateFilePath: found at normalized path: ", file2.getAbsolutePath()), new Object[0]);
                        absolutePath = file2.getAbsolutePath();
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c27570o00oOoo0 = c27570o00oOoo02;
                c20358OooO00o6.OooOO0O(com.aspose.slides.OooOOO.OooO0O0(C22227OoooO.OooO00o(c20358OooO00o6, "ApplyTemplateMaterialUseCase", "getTemplateFilePath: file not found - templateId=", templateId, ", relativePath="), relativePath, ", tried normalizedPath=", strOoooO0), new Object[0]);
                c20358OooO00o6.OooOOO0("ApplyTemplateMaterialUseCase");
                boolean zExists = fileOooO00o.exists();
                File[] fileArrListFiles = fileOooO00o.listFiles();
                if (fileArrListFiles != null) {
                    arrayList2 = new ArrayList(fileArrListFiles.length);
                    for (File file3 : fileArrListFiles) {
                        arrayList2.add(file3.getName());
                    }
                } else {
                    arrayList2 = null;
                }
                i = 0;
                c20358OooO00o6.OooO00o("  appliedDir exists=" + zExists + ", contents=" + arrayList2, new Object[0]);
                absolutePath = null;
                if (absolutePath != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o7.OooOOO0("ThemeUseCase");
                    c20358OooO00o7.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Variant file not found: ", templateFile.getPath()), new Object[i]);
                    templateVariantFile = null;
                } else {
                    templateVariantFile = new TemplateVariantFile(templateFile.getOrientation(), templateFile.getColor(), templateFile.getColorName(), absolutePath);
                }
                if (templateVariantFile == null) {
                    arrayList3.add(templateVariantFile);
                }
                it3 = it;
                c27570o00oOoo02 = c27570o00oOoo0;
            }
            c27570o00oOoo0 = c27570o00oOoo02;
            i = 0;
            if (absolutePath != null) {
            }
            if (templateVariantFile == null) {
            }
            it3 = it;
            c27570o00oOoo02 = c27570o00oOoo0;
        }
        if (arrayList3.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o8.OooOOO0("ThemeUseCase");
            c20358OooO00o8.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No valid variant files found for template: ", templateCollection.getId()), new Object[0]);
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o9.OooOOO0("ThemeUseCase");
        c20358OooO00o9.OooO00o(Oooo0oO.o0Oo0oo.OooO0O0(arrayList3.size(), "Mapped ", " variant files"), new Object[0]);
        orientation = (Orientation) oOo000Oo.OooOo.Oooo(templateCollection.getAvailableOrientations());
        if (orientation == null) {
            orientation = Orientation.PORTRAIT;
        }
        C32443OooOOO c32443OooOOO2 = (C32443OooOOO) oOo000Oo.OooOo.Oooo(templateCollection.getAvailableColorOptions());
        if (c32443OooOOO2 == null) {
            c32443OooOOO2 = new C32443OooOOO("#FFFFFF", "白色");
        }
        c20358OooO00o9.OooOOO0("ThemeUseCase");
        StringBuilder sb = new StringBuilder("Selected default variant: orientation=");
        sb.append(orientation);
        sb.append(", color=");
        Object obj2 = c32443OooOOO2.f116637OooOo;
        sb.append(obj2);
        sb.append(" (");
        A a = c32443OooOOO2.f116638OooOo0o;
        c20358OooO00o9.OooO00o(androidx.concurrent.futures.OooO0o.OooO0O0(sb, a, ")"), new Object[0]);
        int i3 = OooO00o.f96670OooO00o[templateCollection.getPageSize().ordinal()];
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            throw new C32442OooOO0o();
        }
        PaperSpec a4 = PaperSpec.INSTANCE.getA4();
        String strOooO00o = C24761OooO.OooO00o("toString(...)");
        MyTemplate[] myTemplateArr = {new MyTemplate(strOooO00o, new TemplateMaterialPaperTheme(null, templateCollection.getId(), arrayList3, orientation, (String) a, (String) obj2, null, templateCollection.getTitle(), strOooO00o), a4, System.currentTimeMillis(), System.currentTimeMillis(), templateCollection.getTitle())};
        this.f96664OooOo0o = arrayList3;
        this.f96663OooOo = orientation;
        this.f96666OooOoO0 = c32443OooOOO2;
        this.f96665OooOoO = strOooO00o;
        this.f96667OooOoOO = 2;
        if (c27095OooOo0O.OooO00o(myTemplateArr, this) != enumC32485OooO00o) {
            c32443OooOOO = c32443OooOOO2;
            arrayList = arrayList3;
            str = strOooO00o;
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("ThemeUseCase");
            String id2 = templateCollection.getId();
            String title2 = templateCollection.getTitle();
            StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("addTemplateCollectionToMyTemplate: SUCCESS - myTemplateId=", str, ", materialId=", id2, ", title=");
            sbOooO0O02.append(title2);
            c20358OooO00o22.OooO00o(sbOooO0O02.toString(), new Object[0]);
            c20358OooO00o22.OooOOO0("ThemeUseCase");
            c20358OooO00o22.OooO00o("  PaperTheme details: orientation=" + orientation + ", color=" + c32443OooOOO.f116637OooOo + ", variantFiles=" + arrayList.size(), new Object[0]);
            return str;
        }
        return enumC32485OooO00o;
    }
}
