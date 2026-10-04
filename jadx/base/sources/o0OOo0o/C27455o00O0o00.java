package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OO.C26427Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00O0o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getNoteSizeByNoteId$2", m80623f = "NoteUseCase.kt", m80624l = {2365, 2367}, m80625m = "invokeSuspend")
public final class C27455o00O0o00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Long>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f96095OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f96096OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f96097OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96098OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96099OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27455o00O0o00(String str, Continuation continuation, C27449o00O0OoO c27449o00O0OoO, boolean z) {
        super(2, continuation);
        this.f96098OooOoO0 = c27449o00O0OoO;
        this.f96097OooOoO = z;
        this.f96099OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27455o00O0o00(this.f96099OooOoOO, continuation, this.f96098OooOoO0, this.f96097OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Long> continuation) {
        return ((C27455o00O0o00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long length;
        long j;
        PdfInfo pdfInfo;
        long j2;
        String pdfPath;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96095OooOo;
        String str = this.f96099OooOoOO;
        long length2 = 0;
        C27449o00O0OoO c27449o00O0OoO = this.f96098OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String[] strArrDatabaseList = c27449o00O0OoO.f96060OooOoOO.databaseList();
            kotlin.jvm.internal.OooOOO0.OooO0o(strArrDatabaseList, "databaseList(...)");
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArrDatabaseList) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str2);
                if (C33599OooOo0O.OooOoOO(str2, str, false)) {
                    arrayList.add(str2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File(c27449o00O0OoO.f96060OooOoOO.getDataDir() + "/databases/" + ((String) it.next())));
            }
            Iterator it2 = arrayList2.iterator();
            length = 0;
            while (it2.hasNext()) {
                length += ((File) it2.next()).length();
            }
            if (this.f96097OooOoO) {
                this.f96096OooOo0o = length;
                this.f96095OooOo = 1;
                obj = c27449o00O0OoO.f96035OooO00o.OooOO0o(str, this);
                if (obj != enumC32485OooO00o) {
                    j = length;
                }
                return enumC32485OooO00o;
            }
            return new Long(length + length2);
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.f96096OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PdfInfo pdfInfo2 = (PdfInfo) obj;
            pdfPath = pdfInfo2 == null ? pdfInfo2.getPdfPath() : null;
            if (pdfPath != null && pdfPath.length() != 0) {
                length2 = new File(pdfPath).length();
            }
            length = j2;
            return new Long(length + length2);
        }
        j = this.f96096OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null || (pdfInfo = noteContent.getPdfInfo()) == null) {
            length = j;
            return new Long(length + length2);
        }
        C26427Oooo0O0 c26427Oooo0O0 = c27449o00O0OoO.f96042OooO0oo;
        String id = pdfInfo.getId();
        this.f96096OooOo0o = j;
        this.f96095OooOo = 2;
        obj = c26427Oooo0O0.OooO0OO(id, str, this);
        if (obj != enumC32485OooO00o) {
            j2 = j;
            PdfInfo pdfInfo22 = (PdfInfo) obj;
            if (pdfInfo22 == null) {
            }
            if (pdfPath != null) {
                length2 = new File(pdfPath).length();
            }
            length = j2;
            return new Long(length + length2);
        }
        return enumC32485OooO00o;
    }
}
