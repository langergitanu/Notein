package o0OOo0o;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.orion.notein.domain.models.pdf.DuplicatedPdfResult;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OOo0o.o00OoO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$duplicatedPdfPagesToPrivateDir$2", m80623f = "PdfFileUseCase.kt", m80624l = {70}, m80625m = "invokeSuspend")
public final class C27488o00OoO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super DuplicatedPdfResult>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24034Oooo00O f96329OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f96330OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96331OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PdfiumCore f96332OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96333OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Uri f96334OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f96335OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96336OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27488o00OoO00(C27499o00Ooo0 c27499o00Ooo0, List<Integer> list, Uri uri, String str, Continuation<? super C27488o00OoO00> continuation) {
        super(2, continuation);
        this.f96333OooOoOO = c27499o00Ooo0;
        this.f96335OooOoo0 = list;
        this.f96334OooOoo = uri;
        this.f96336OooOooO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27488o00OoO00(this.f96333OooOoOO, this.f96335OooOoo0, this.f96334OooOoo, this.f96336OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super DuplicatedPdfResult> continuation) {
        return ((C27488o00OoO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, com.shockwave.pdfium.PdfDocument] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C24034Oooo00O c24034Oooo00O;
        C24034Oooo00O c24034Oooo00O2;
        Exception exc;
        PdfiumCore pdfiumCore;
        PdfDocument pdfDocument;
        PdfDocument pdfDocument2;
        String str;
        Uri uri = this.f96334OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96331OooOoO;
        List<Integer> list = this.f96335OooOoo0;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pdfiumCore = this.f96332OooOoO0;
            c24034Oooo00O = this.f96329OooOo;
            c24034Oooo00O2 = this.f96330OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    throw new Exception("dstPdfPath is null or empty.");
                }
                File file = new File(str);
                if (!file.exists()) {
                    file.createNewFile();
                }
                c24034Oooo00O.f80942OooOo0o = pdfiumCore.createDocument();
                List<Integer> list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                int i2 = 0;
                for (Object obj2 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    int iIntValue = ((Number) obj2).intValue();
                    pdfiumCore.importPage((PdfDocument) c24034Oooo00O2.f80942OooOo0o, (PdfDocument) c24034Oooo00O.f80942OooOo0o, iIntValue, i2);
                    arrayList.add(new C32443OooOOO(new Integer(iIntValue), new Integer(i2)));
                    i2 = i3;
                }
                Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
                pdfiumCore.saveAndCloseDocument((PdfDocument) c24034Oooo00O.f80942OooOo0o, ParcelFileDescriptor.open(file, 805306368));
                pdfiumCore.closeDocument((PdfDocument) c24034Oooo00O2.f80942OooOo0o);
                return new DuplicatedPdfResult(str, mapOooOO0o);
            } catch (Exception e) {
                exc = e;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PdfFileUseCase");
                c20358OooO00o.OooO0Oo(exc, "duplicatedPdfPagesToPrivateDir failed.", new Object[0]);
                pdfDocument = (PdfDocument) c24034Oooo00O2.f80942OooOo0o;
                if (pdfDocument != null) {
                }
                pdfDocument2 = (PdfDocument) c24034Oooo00O.f80942OooOo0o;
                if (pdfDocument2 != null) {
                }
                return null;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        C24034Oooo00O c24034Oooo00O3 = new C24034Oooo00O();
        c24034Oooo00O = new C24034Oooo00O();
        C27499o00Ooo0 c27499o00Ooo0 = this.f96333OooOoOO;
        PdfiumCore pdfiumCore2 = new PdfiumCore(c27499o00Ooo0.f96374OooO00o);
        try {
            List<Integer> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() < 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((Number) obj3).intValue() < 0) {
                                arrayList2.add(obj3);
                            }
                        }
                        throw new IllegalArgumentException("srcPageNumbers contains st 0 page numbers. " + oOo000Oo.OooOo.o000oOoO(arrayList2, null, null, null, new C27475o00Oo(), 31));
                    }
                }
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c27499o00Ooo0.f96374OooO00o.getContentResolver().openFileDescriptor(uri, "r");
            c24034Oooo00O3.f80942OooOo0o = parcelFileDescriptorOpenFileDescriptor != null ? pdfiumCore2.newDocument(parcelFileDescriptorOpenFileDescriptor, this.f96336OooOooO) : 0;
            this.f96330OooOo0o = c24034Oooo00O3;
            this.f96329OooOo = c24034Oooo00O;
            this.f96332OooOoO0 = pdfiumCore2;
            this.f96331OooOoO = 1;
            Object objOooO0OO = C27499o00Ooo0.OooO0OO(c27499o00Ooo0, uri, this);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24034Oooo00O2 = c24034Oooo00O3;
            obj = objOooO0OO;
            pdfiumCore = pdfiumCore2;
            str = (String) obj;
            if (str != null) {
            }
            throw new Exception("dstPdfPath is null or empty.");
        } catch (Exception e2) {
            c24034Oooo00O2 = c24034Oooo00O3;
            exc = e2;
            pdfiumCore = pdfiumCore2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PdfFileUseCase");
            c20358OooO00o2.OooO0Oo(exc, "duplicatedPdfPagesToPrivateDir failed.", new Object[0]);
            pdfDocument = (PdfDocument) c24034Oooo00O2.f80942OooOo0o;
            if (pdfDocument != null) {
                pdfiumCore.closeDocument(pdfDocument);
            }
            pdfDocument2 = (PdfDocument) c24034Oooo00O.f80942OooOo0o;
            if (pdfDocument2 != null) {
                pdfiumCore.closeDocument(pdfDocument2);
            }
            return null;
        }
    }
}
