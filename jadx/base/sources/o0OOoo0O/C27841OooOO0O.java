package o0OOoo0O;

import com.orion.notein.domain.models.material.TemplateBook;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27554o00oOO;
import o0OOo0o.C27570o00oOoo0;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.ApplyTemplateBookUseCase$execute$2", m80623f = "ApplyTemplateBookUseCase.kt", m80624l = {96}, m80625m = "invokeSuspend")
public final class C27841OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f98361OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f98362OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27844OooOOO0 f98363OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98364OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ TemplateBook f98365OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27841OooOO0O(String str, C27844OooOOO0 c27844OooOOO0, TemplateBook templateBook, Continuation<? super C27841OooOO0O> continuation) {
        super(2, continuation);
        this.f98364OooOoO0 = str;
        this.f98363OooOoO = c27844OooOOO0;
        this.f98365OooOoOO = templateBook;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27841OooOO0O(this.f98364OooOoO0, this.f98363OooOoO, this.f98365OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27841OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x015d A[Catch: Exception -> 0x001d, TryCatch #1 {Exception -> 0x001d, blocks: (B:6:0x0016, B:42:0x0159, B:44:0x015d, B:46:0x0186), top: B:55:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186 A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #1 {Exception -> 0x001d, blocks: (B:6:0x0016, B:42:0x0159, B:44:0x015d, B:46:0x0186), top: B:55:0x0016 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        Object objOooO0o;
        int i;
        String str;
        int i2 = 1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f98361OooOo;
        TemplateBook templateBook = this.f98365OooOoOO;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f98362OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                str = (String) objOooO0o;
                if (str != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ApplyTemplateBookUseCase");
                    c20358OooO00o.OooO0OO("Failed to apply template_book: " + templateBook.getId(), new Object[0]);
                    return str;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("ApplyTemplateBookUseCase");
                c20358OooO00o2.OooO00o("Template_book applied: myTemplateId=" + str + ", title=" + templateBook.getTitle(), new Object[0]);
                return str;
            } catch (Exception e) {
                e = e;
                C32501OooO0oO.OooO0Oo(file);
                throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to extract template_book: ", e.getMessage()), e);
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        String str2 = this.f98364OooOoO0;
        File file2 = new File(str2);
        if (!file2.exists()) {
            throw new IllegalStateException("Template book ZIP not found: ".concat(str2));
        }
        String id = templateBook.getId();
        C27844OooOOO0 c27844OooOOO0 = this.f98363OooOoO;
        File file3 = new File(c27844OooOOO0.f98372OooO00o.getFilesDir(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("my_templates/material_", id));
        if (file3.exists()) {
            C32501OooO0oO.OooO0Oo(file3);
        }
        file3.mkdirs();
        try {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ApplyTemplateBookUseCase");
            c20358OooO00o3.OooO00o("Extracting template_book: " + file2.getAbsolutePath() + " -> " + file3.getAbsolutePath(), new Object[0]);
            C31193OooOOo.OooO0OO(file2, file3);
            File[] fileArrListFiles = file3.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                throw new IllegalStateException("No files extracted from template_book zip");
            }
            c20358OooO00o3.OooOOO0("ApplyTemplateBookUseCase");
            c20358OooO00o3.OooO00o("Template_book extracted: " + templateBook.getTitle() + " (id=" + templateBook.getId() + "), top-level files=" + fileArrListFiles.length, new Object[0]);
            int length = fileArrListFiles.length;
            int i5 = 0;
            while (true) {
                ArrayList arrayList = null;
                if (i5 >= length) {
                    break;
                }
                File file4 = fileArrListFiles[i5];
                if (file4.isDirectory()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("ApplyTemplateBookUseCase");
                    String name = file4.getName();
                    File[] fileArrListFiles2 = file4.listFiles();
                    if (fileArrListFiles2 != null) {
                        arrayList = new ArrayList(fileArrListFiles2.length);
                        int length2 = fileArrListFiles2.length;
                        i = i2;
                        for (int i6 = i4; i6 < length2; i6++) {
                            arrayList.add(fileArrListFiles2[i6].getName());
                        }
                    } else {
                        i = i2;
                    }
                    c20358OooO00o4.OooO00o("  [DIR] " + name + "/ -> " + arrayList, new Object[0]);
                } else {
                    i = i2;
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("ApplyTemplateBookUseCase");
                    c20358OooO00o5.OooO00o("  [FILE] " + file4.getName(), new Object[0]);
                }
                i5++;
                i2 = i;
                i4 = 0;
            }
            int i7 = i2;
            C27570o00oOoo0 c27570o00oOoo0 = c27844OooOOO0.f98373OooO0O0;
            this.f98362OooOo0o = file3;
            this.f98361OooOo = i7;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27554o00oOO(templateBook, c27570o00oOoo0, null), this);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str = (String) objOooO0o;
            if (str != null) {
            }
        } catch (Exception e2) {
            e = e2;
            file = file3;
            C32501OooO0oO.OooO0Oo(file);
            throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to extract template_book: ", e.getMessage()), e);
        }
    }
}
