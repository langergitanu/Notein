package o0OOoo0O;

import com.orion.notein.domain.models.material.TemplateCollection;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.ApplyTemplateMaterialUseCase$execute$2", m80623f = "ApplyTemplateMaterialUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27843OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27848OooOOo0 f98369OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f98370OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TemplateCollection f98371OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27843OooOOO(String str, C27848OooOOo0 c27848OooOOo0, TemplateCollection templateCollection, Continuation<? super C27843OooOOO> continuation) {
        super(2, continuation);
        this.f98370OooOo0o = str;
        this.f98369OooOo = c27848OooOOo0;
        this.f98371OooOoO0 = templateCollection;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27843OooOOO(this.f98370OooOo0o, this.f98369OooOo, this.f98371OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27843OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f98370OooOo0o;
        File file = new File(str);
        if (!file.exists()) {
            throw new IllegalStateException("Template zip file not found at: ".concat(str));
        }
        TemplateCollection templateCollection = this.f98371OooOoO0;
        File fileOooO00o = this.f98369OooOo.OooO00o(templateCollection.getId());
        if (fileOooO00o.exists()) {
            C32501OooO0oO.OooO0Oo(fileOooO00o);
        }
        fileOooO00o.mkdirs();
        try {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ApplyTemplateMaterialUseCase");
            c20358OooO00o.OooO00o("Extracting template: " + file.getAbsolutePath() + " -> " + fileOooO00o.getAbsolutePath(), new Object[0]);
            C31193OooOOo.OooO0OO(file, fileOooO00o);
            File[] fileArrListFiles = fileOooO00o.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                throw new IllegalStateException("No files extracted from template zip");
            }
            c20358OooO00o.OooOOO0("ApplyTemplateMaterialUseCase");
            c20358OooO00o.OooO00o("Template applied successfully: " + templateCollection.getTitle() + " (id=" + templateCollection.getId() + "), top-level files=" + fileArrListFiles.length, new Object[0]);
            int length = fileArrListFiles.length;
            for (int i = 0; i < length; i++) {
                File file2 = fileArrListFiles[i];
                if (file2.isDirectory()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("ApplyTemplateMaterialUseCase");
                    String name = file2.getName();
                    File[] fileArrListFiles2 = file2.listFiles();
                    if (fileArrListFiles2 != null) {
                        arrayList = new ArrayList(fileArrListFiles2.length);
                        for (File file3 : fileArrListFiles2) {
                            arrayList.add(file3.getName());
                        }
                    } else {
                        arrayList = null;
                    }
                    c20358OooO00o2.OooO00o("  [DIR] " + name + "/ -> " + arrayList, new Object[0]);
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("ApplyTemplateMaterialUseCase");
                    c20358OooO00o3.OooO00o("  [FILE] " + file2.getName(), new Object[0]);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Exception e) {
            C32501OooO0oO.OooO0Oo(fileOooO00o);
            throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to extract template: ", e.getMessage()), e);
        }
    }
}
