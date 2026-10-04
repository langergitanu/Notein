package o0OOo0o;

import OooOoo.C20593OooO0Oo;
import android.net.Uri;
import com.aspose.slides.C22227OoooO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.global.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OoO0oo.C28692OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOo0o.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteCreationUseCase$createPdfNotes$2", m80623f = "NoteCreationUseCase.kt", m80624l = {244, StyleIdentifier.SUBTLE_EMPHASIS, StyleIdentifier.SUBTLE_REFERENCE}, m80625m = "invokeSuspend")
public final class C27396o0000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Map<String, ? extends InterfaceC33642Oooo0oo<? extends C32460OooOooO>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o000OO f95503OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f95504OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f95505OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f95506OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f95507OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f95508OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Iterator f95509OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f95510OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Collection f95511OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f95512Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f95513Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f95514Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f95515Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f95516Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ o000OO f95517Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f95518Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ PaperTheme f95519Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f95520Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27396o0000oo(List<? extends Uri> list, o000OO o000oo2, PaperTheme paperTheme, String str, String str2, Continuation<? super C27396o0000oo> continuation) {
        super(2, continuation);
        this.f95516Oooo0O0 = list;
        this.f95517Oooo0OO = o000oo2;
        this.f95519Oooo0o0 = paperTheme;
        this.f95518Oooo0o = str;
        this.f95520Oooo0oO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27396o0000oo(this.f95516Oooo0O0, this.f95517Oooo0OO, this.f95519Oooo0o0, this.f95518Oooo0o, this.f95520Oooo0oO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Map<String, ? extends InterfaceC33642Oooo0oo<? extends C32460OooOooO>>> continuation) {
        return ((C27396o0000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Path cross not found for [B:39:0x017b, B:43:0x0199], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0218 A[LOOP:0: B:54:0x0212->B:56:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0240 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015a -> B:13:0x0058). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        long j;
        Collection collection;
        String str;
        Iterator it;
        o000OO o000oo2;
        String str2;
        List list;
        int i2;
        EnumC32485OooO00o enumC32485OooO00o;
        List listOooo0o0;
        o000OO o000oo3;
        List list2;
        List list3;
        Collection collection2;
        String strOooO0o;
        int iOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f95512Oooo0;
        o000OO o000oo4 = this.f95517Oooo0OO;
        if (i3 == 0) {
            i = 1;
            C32446OooOOOo.OooO0O0(obj);
            List<Uri> list4 = this.f95516Oooo0O0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            for (Uri uri : list4) {
                arrayList.add(UUID.randomUUID().toString());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            Iterator it2 = list4.iterator();
            String str3 = this.f95518Oooo0o;
            j = jCurrentTimeMillis;
            collection = arrayList2;
            str = this.f95520Oooo0oO;
            it = it2;
            o000oo2 = o000oo4;
            str2 = str3;
            list = arrayList;
            i2 = 0;
            if (it.hasNext()) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            listOooo0o0 = this.f95504OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            enumC32485OooO00o = enumC32485OooO00o2;
            o000oo3 = o000oo4;
            list2 = null;
            this.f95504OooOo0o = list2;
            this.f95512Oooo0 = 3;
            o000oo3.getClass();
            List<NotePlaceHolder> list5 = listOooo0o0;
            iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list5, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (NotePlaceHolder notePlaceHolder : list5) {
                String id = notePlaceHolder.getId();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0);
                EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121317OooOo0o;
                linkedHashMap.put(id, C33609OooO0oo.OooO00o(c33822OooO0OOOooO00o, null, new C27392o0000oO(o000oo3, notePlaceHolder, this.f95519Oooo0o0, null), 1));
            }
            return linkedHashMap != enumC32485OooO00o ? enumC32485OooO00o : linkedHashMap;
        }
        i2 = this.f95515Oooo00o;
        int i4 = this.f95514Oooo00O;
        j = this.f95513Oooo000;
        Collection collection3 = this.f95511OooOooo;
        String str4 = this.f95510OooOooO;
        String str5 = this.f95508OooOoo;
        it = this.f95509OooOoo0;
        Collection collection4 = this.f95507OooOoOO;
        String str6 = this.f95505OooOoO;
        str2 = this.f95506OooOoO0;
        o000oo2 = this.f95503OooOo;
        list = this.f95504OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str7 = str6;
        Collection collection5 = collection4;
        o000OO o000oo5 = o000oo4;
        String str8 = str4;
        enumC32485OooO00o = enumC32485OooO00o2;
        Object objOooO0o = obj;
        String str9 = str5;
        String str10 = (String) objOooO0o;
        String str11 = str2;
        C34406OooO00o.f123390OooO00o.OooO00o(C20593OooO0Oo.OooO0O0("NoteCreationUseCase, tempPdfPath: ", str10, "."), new Object[0]);
        collection3.add((str10 != null || str10.length() == 0) ? null : new NotePlaceHolder(str9, str7, str8, j + ((long) i2), str10, null, 0, null, 224, null));
        str2 = str11;
        collection = collection5;
        enumC32485OooO00o2 = enumC32485OooO00o;
        i2 = i4;
        o000oo4 = o000oo5;
        str = str7;
        i = 1;
        if (it.hasNext()) {
            Object next = it.next();
            i4 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            Uri uri2 = (Uri) next;
            str5 = (String) list.get(i2);
            String strOooO0OO = C28692OooO0oo.OooO0OO(o000oo2.f95610OooOOo0, uri2);
            if (str2 != null && str2.length() != 0) {
                list3 = list;
                collection2 = collection;
                strOooO0o = str2;
            } else if (strOooO0OO.length() == 0) {
                list3 = list;
                collection2 = collection;
                strOooO0o = o000oo2.f95610OooOOo0.getString(R.string.note_title_default);
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o, "getString(...)");
            } else {
                list3 = list;
                collection2 = collection;
                strOooO0o = C32501OooO0oO.OooO0o(new File(strOooO0OO));
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            o000oo5 = o000oo4;
            EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o2;
            c20358OooO00o.OooO0o0(com.aspose.slides.OooOOO.OooO0O0(C22227OoooO.OooO00o(c20358OooO00o, "NoteCreationUseCase", "Imported pdf original name : ", strOooO0OO, ", truncated name: "), strOooO0o, ", customTitle: ", str2), new Object[0]);
            this.f95504OooOo0o = list3;
            this.f95503OooOo = o000oo2;
            this.f95506OooOoO0 = str2;
            this.f95505OooOoO = str;
            Collection collection6 = collection2;
            this.f95507OooOoOO = collection6;
            this.f95509OooOoo0 = it;
            this.f95508OooOoo = str5;
            this.f95510OooOooO = strOooO0o;
            this.f95511OooOooo = collection6;
            this.f95513Oooo000 = j;
            this.f95514Oooo00O = i4;
            this.f95515Oooo00o = i2;
            this.f95512Oooo0 = i;
            C27499o00Ooo0 c27499o00Ooo0 = o000oo2.f95604OooOO0o;
            c27499o00Ooo0.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27486o00OoO(uri2, null, c27499o00Ooo0), this);
            enumC32485OooO00o = enumC32485OooO00o3;
            if (objOooO0o != enumC32485OooO00o) {
                collection3 = collection2;
                str7 = str;
                str8 = strOooO0o;
                list = list3;
                collection5 = collection3;
                String str92 = str5;
                String str102 = (String) objOooO0o;
                String str112 = str2;
                C34406OooO00o.f123390OooO00o.OooO00o(C20593OooO0Oo.OooO0O0("NoteCreationUseCase, tempPdfPath: ", str102, "."), new Object[0]);
                collection3.add((str102 != null || str102.length() == 0) ? null : new NotePlaceHolder(str92, str7, str8, j + ((long) i2), str102, null, 0, null, 224, null));
                str2 = str112;
                collection = collection5;
                enumC32485OooO00o2 = enumC32485OooO00o;
                i2 = i4;
                o000oo4 = o000oo5;
                str = str7;
                i = 1;
                if (it.hasNext()) {
                    enumC32485OooO00o = enumC32485OooO00o2;
                    listOooo0o0 = oOo000Oo.OooOo.Oooo0o0((List) collection);
                    o000oo3 = o000oo4;
                    InterfaceC27314OooOooO interfaceC27314OooOooO = o000oo3.f95601OooO0oo;
                    NotePlaceHolder[] notePlaceHolderArr = (NotePlaceHolder[]) listOooo0o0.toArray(new NotePlaceHolder[0]);
                    NotePlaceHolder[] notePlaceHolderArr2 = (NotePlaceHolder[]) Arrays.copyOf(notePlaceHolderArr, notePlaceHolderArr.length);
                    this.f95504OooOo0o = listOooo0o0;
                    list2 = null;
                    this.f95503OooOo = null;
                    this.f95506OooOoO0 = null;
                    this.f95505OooOoO = null;
                    this.f95507OooOoOO = null;
                    this.f95509OooOoo0 = null;
                    this.f95508OooOoo = null;
                    this.f95510OooOooO = null;
                    this.f95511OooOooo = null;
                    this.f95512Oooo0 = 2;
                    if (interfaceC27314OooOooO.OooO00o(notePlaceHolderArr2, this) != enumC32485OooO00o) {
                        this.f95504OooOo0o = list2;
                        this.f95512Oooo0 = 3;
                        o000oo3.getClass();
                        List<NotePlaceHolder> list52 = listOooo0o0;
                        iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list52, 10));
                        if (iOooO0Oo < 16) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
                        while (r2.hasNext()) {
                        }
                        if (linkedHashMap2 != enumC32485OooO00o) {
                        }
                    }
                }
            }
        }
    }
}
