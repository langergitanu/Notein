package oO0Oo;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.core.os.BundleKt;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.converter.ConverterSpannedToHtml;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o000oooo.C24761OooO;
import o00oo0Oo.C25717Oooo0OO;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import o0OOo0Oo.InterfaceC27289OooO0Oo;
import o0OOo0Oo.InterfaceC27325OoooO00;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27597o00ooo00;
import o0OoO0oo.C28980oOooo0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: oO0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33173OooOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicBoolean f120039OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27545o00o0oo0 f120040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27597o00ooo00 f120041OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27325OoooO00 f120042OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27289OooO0Oo f120043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27449o00O0OoO f120044OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27288OooO0OO f120045OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f120046OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C32447OooOOo f120047OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C32447OooOOo f120048OooOO0;

    public C33173OooOO0o(C27545o00o0oo0 c27545o00o0oo0, C27597o00ooo00 vipFeatureUseCase, InterfaceC27325OoooO00 vertexAiRepo, InterfaceC27289OooO0Oo pageRepo, InterfaceC27288OooO0OO sessionRepo, C27449o00O0OoO c27449o00O0OoO, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(vertexAiRepo, "vertexAiRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageRepo, "pageRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionRepo, "sessionRepo");
        this.f120040OooO00o = c27545o00o0oo0;
        this.f120041OooO0O0 = vipFeatureUseCase;
        this.f120042OooO0OO = vertexAiRepo;
        this.f120043OooO0Oo = pageRepo;
        this.f120045OooO0o0 = sessionRepo;
        this.f120044OooO0o = c27449o00O0OoO;
        this.f120046OooO0oO = abstractApplicationC26277OooOoOO;
        this.f120047OooO0oo = C20519OooO0Oo.OooO0OO(new C28980oOooo0o(1));
        this.f120039OooO = new AtomicBoolean(false);
        this.f120048OooOO0 = C20519OooO0Oo.OooO0OO(new C25717Oooo0OO(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
    
        if (r11.OooO0o0(r12, r2, r3) == r4) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C33173OooOO0o c33173OooOO0o, String str, String str2, NoteContent noteContent, String str3, C32443OooOOO c32443OooOOO, List list, String str4, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33168OooO0Oo c33168OooO0Oo;
        String str5;
        boolean z2;
        String str6;
        NoteContent noteContent2;
        C32443OooOOO c32443OooOOO2;
        C33173OooOO0o c33173OooOO0o2;
        C27174OooO0O0 c27174OooO0O0;
        String id;
        c33173OooOO0o.getClass();
        if (abstractC32479OooO0OO instanceof C33168OooO0Oo) {
            c33168OooO0Oo = (C33168OooO0Oo) abstractC32479OooO0OO;
            int i = c33168OooO0Oo.f119970OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33168OooO0Oo.f119970OooOooo = i - Integer.MIN_VALUE;
            } else {
                c33168OooO0Oo = new C33168OooO0Oo(c33173OooOO0o, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c33168OooO0Oo.f119967OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33168OooO0Oo.f119970OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return "500007";
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((Bitmap) it.next()) != null) {
                    c33168OooO0Oo.f119963OooOo0o = c33173OooOO0o;
                    c33168OooO0Oo.f119962OooOo = noteContent;
                    c33168OooO0Oo.f119965OooOoO0 = str3;
                    c33168OooO0Oo.f119964OooOoO = c32443OooOOO;
                    str5 = str4;
                    c33168OooO0Oo.f119966OooOoOO = str5;
                    z2 = z;
                    c33168OooO0Oo.f119968OooOoo0 = z2;
                    c33168OooO0Oo.f119970OooOooo = 1;
                    objOooO0oO = c33173OooOO0o.OooO0oO(str, str2, list, c33168OooO0Oo);
                    if (objOooO0oO != enumC32485OooO00o) {
                        str6 = str3;
                        noteContent2 = noteContent;
                        c32443OooOOO2 = c32443OooOOO;
                        c33173OooOO0o2 = c33173OooOO0o;
                    }
                    return enumC32485OooO00o;
                }
            }
            return "500007";
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27174OooO0O0 = (C27174OooO0O0) c33168OooO0Oo.f119963OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
            Iterable iterable = (Iterable) c27174OooO0O0.OooO0O0();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageToHtmlResult) it2.next()).getErrorCode(), "500005")) {
                        return "500005";
                    }
                }
            }
            return "0";
        }
        boolean z3 = c33168OooO0Oo.f119968OooOoo0;
        String str7 = c33168OooO0Oo.f119966OooOoOO;
        c32443OooOOO2 = c33168OooO0Oo.f119964OooOoO;
        str6 = c33168OooO0Oo.f119965OooOoO0;
        noteContent2 = c33168OooO0Oo.f119962OooOo;
        c33173OooOO0o2 = (C33173OooOO0o) c33168OooO0Oo.f119963OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oO);
        z2 = z3;
        str5 = str7;
        c27174OooO0O0 = (C27174OooO0O0) objOooO0oO;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "500001") || z2) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                String errorCode = c27174OooO0O0.getErrorCode();
                return errorCode == null ? "599999" : errorCode;
            }
            Iterable iterable2 = (Iterable) c27174OooO0O0.OooO0O0();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            Iterator it3 = iterable2.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                ImageToHtmlResult imageToHtmlResult = (ImageToHtmlResult) next;
                String html = (kotlin.jvm.internal.OooOOO0.OooO0O0(imageToHtmlResult.getErrorCode(), "0") || imageToHtmlResult.getHtml().length() > 0) ? imageToHtmlResult.getHtml() : imageToHtmlResult.getErrorMessage();
                Page page = (Page) oOo000Oo.OooOo.OoooO00(((Number) c32443OooOOO2.f116638OooOo0o).intValue() + i3, noteContent2.getPages());
                if (page == null || (id = page.getId()) == null) {
                    id = "";
                }
                arrayList.add(OooO0o(c33173OooOO0o2.f120046OooO0oO, C24761OooO.OooO00o("toString(...)"), 3, str6, html, BundleKt.bundleOf(new C32443OooOOO("note_page_id", id))));
                it3 = it3;
                i3 = i4;
            }
            c33168OooO0Oo.f119963OooOo0o = c27174OooO0O0;
            c33168OooO0Oo.f119962OooOo = null;
            c33168OooO0Oo.f119965OooOoO0 = null;
            c33168OooO0Oo.f119964OooOoO = null;
            c33168OooO0Oo.f119966OooOoOO = null;
            c33168OooO0Oo.f119970OooOooo = 2;
        }
        return "500005";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C33173OooOO0o c33173OooOO0o, String str, String str2, String str3, C32443OooOOO c32443OooOOO, List list, String str4, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33169OooO0o c33169OooO0o;
        String str5;
        String str6;
        boolean z2;
        C33173OooOO0o c33173OooOO0o2;
        C32443OooOOO c32443OooOOO2;
        C27174OooO0O0 c27174OooO0O0;
        Iterable iterable;
        Iterator it;
        c33173OooOO0o.getClass();
        if (abstractC32479OooO0OO instanceof C33169OooO0o) {
            c33169OooO0o = (C33169OooO0o) abstractC32479OooO0OO;
            int i = c33169OooO0o.f119978OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33169OooO0o.f119978OooOooO = i - Integer.MIN_VALUE;
            } else {
                c33169OooO0o = new C33169OooO0o(c33173OooOO0o, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c33169OooO0o.f119977OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33169OooO0o.f119978OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return "500007";
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((Bitmap) it2.next()) != null) {
                    c33169OooO0o.f119972OooOo0o = c33173OooOO0o;
                    str5 = str3;
                    c33169OooO0o.f119971OooOo = str5;
                    c33169OooO0o.f119974OooOoO0 = c32443OooOOO;
                    str6 = str4;
                    c33169OooO0o.f119973OooOoO = str6;
                    z2 = z;
                    c33169OooO0o.f119975OooOoOO = z2;
                    c33169OooO0o.f119978OooOooO = 1;
                    objOooO0oO = c33173OooOO0o.OooO0oO(str, str2, list, c33169OooO0o);
                    if (objOooO0oO != enumC32485OooO00o) {
                        c33173OooOO0o2 = c33173OooOO0o;
                        c32443OooOOO2 = c32443OooOOO;
                    }
                    return enumC32485OooO00o;
                }
            }
            return "500007";
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27174OooO0O0 = (C27174OooO0O0) c33169OooO0o.f119972OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
            iterable = (Iterable) c27174OooO0O0.OooO0O0();
            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                it = iterable.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageToHtmlResult) it.next()).getErrorCode(), "500005")) {
                        return "500005";
                    }
                }
            }
            return "0";
        }
        boolean z3 = c33169OooO0o.f119975OooOoOO;
        String str7 = c33169OooO0o.f119973OooOoO;
        C32443OooOOO c32443OooOOO3 = c33169OooO0o.f119974OooOoO0;
        String str8 = c33169OooO0o.f119971OooOo;
        c33173OooOO0o2 = (C33173OooOO0o) c33169OooO0o.f119972OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oO);
        z2 = z3;
        str6 = str7;
        c32443OooOOO2 = c32443OooOOO3;
        str5 = str8;
        C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) objOooO0oO;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O02.getErrorCode(), "500001") || z2) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O02.getErrorCode(), "0") || c27174OooO0O02.OooO0O0() == null) {
                String errorCode = c27174OooO0O02.getErrorCode();
                return errorCode == null ? "599999" : errorCode;
            }
            Iterable iterable2 = (Iterable) c27174OooO0O02.OooO0O0();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            int i3 = 0;
            for (Object obj : iterable2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                ImageToHtmlResult imageToHtmlResult = (ImageToHtmlResult) obj;
                arrayList.add(OooO0o(c33173OooOO0o2.f120046OooO0oO, C24761OooO.OooO00o("toString(...)"), 1, str5, (kotlin.jvm.internal.OooOOO0.OooO0O0(imageToHtmlResult.getErrorCode(), "0") || imageToHtmlResult.getHtml().length() > 0) ? imageToHtmlResult.getHtml() : imageToHtmlResult.getErrorMessage(), BundleKt.bundleOf(new C32443OooOOO("pdf_page_index", new Integer(((Number) c32443OooOOO2.f116638OooOo0o).intValue() + i3)))));
                c32443OooOOO2 = c32443OooOOO2;
                i3 = i4;
            }
            c33169OooO0o.f119972OooOo0o = c27174OooO0O02;
            c33169OooO0o.f119971OooOo = null;
            c33169OooO0o.f119974OooOoO0 = null;
            c33169OooO0o.f119973OooOoO = null;
            c33169OooO0o.f119978OooOooO = 2;
            if (c33173OooOO0o2.OooO0o0(str6, arrayList, c33169OooO0o) != enumC32485OooO00o) {
                c27174OooO0O0 = c27174OooO0O02;
                iterable = (Iterable) c27174OooO0O0.OooO0O0();
                if (iterable instanceof Collection) {
                }
                it = iterable.iterator();
                while (it.hasNext()) {
                }
                return "0";
            }
            return enumC32485OooO00o;
        }
        return "500005";
    }

    public static final int OooO0OO(C33173OooOO0o c33173OooOO0o) {
        return ((Number) c33173OooOO0o.f120047OooO0oo.getValue()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (r1.OooO0oo(r0, r2) == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(C33173OooOO0o c33173OooOO0o, AiOcrTextPage aiOcrTextPage, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33172OooO0oo c33172OooO0oo;
        String str2;
        C33173OooOO0o c33173OooOO0o2;
        String str3;
        AiOcrSession aiOcrSession;
        C33173OooOO0o c33173OooOO0o3 = c33173OooOO0o;
        c33173OooOO0o3.getClass();
        if (abstractC32479OooO0OO instanceof C33172OooO0oo) {
            c33172OooO0oo = (C33172OooO0oo) abstractC32479OooO0OO;
            int i = c33172OooO0oo.f120018OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33172OooO0oo.f120018OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33172OooO0oo = new C33172OooO0oo(c33173OooOO0o3, abstractC32479OooO0OO);
            }
        }
        Object obj = c33172OooO0oo.f120017OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33172OooO0oo.f120018OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c33172OooO0oo.f120015OooOo0o = c33173OooOO0o3;
            str2 = str;
            c33172OooO0oo.f120014OooOo = str2;
            c33172OooO0oo.f120018OooOoOO = 1;
            if (c33173OooOO0o3.f120043OooO0Oo.OooO0OO(aiOcrTextPage, c33172OooO0oo) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            String str4 = c33172OooO0oo.f120014OooOo;
            C33173OooOO0o c33173OooOO0o4 = c33172OooO0oo.f120015OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str2 = str4;
            c33173OooOO0o3 = c33173OooOO0o4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str3 = c33172OooO0oo.f120014OooOo;
            c33173OooOO0o2 = c33172OooO0oo.f120015OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            aiOcrSession = (AiOcrSession) obj;
            if (aiOcrSession != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "AiOcrRecognizer", "Session not found: ", str3), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            AiOcrSession aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession, null, null, null, null, null, 0L, System.currentTimeMillis(), 63, null);
            InterfaceC27288OooO0OO interfaceC27288OooO0OO = c33173OooOO0o2.f120045OooO0o0;
            c33172OooO0oo.f120015OooOo0o = null;
            c33172OooO0oo.f120014OooOo = null;
            c33172OooO0oo.f120018OooOoOO = 3;
        }
        InterfaceC27288OooO0OO interfaceC27288OooO0OO2 = c33173OooOO0o3.f120045OooO0o0;
        c33172OooO0oo.f120015OooOo0o = c33173OooOO0o3;
        c33172OooO0oo.f120014OooOo = str2;
        c33172OooO0oo.f120018OooOoOO = 2;
        Object objOooO0O0 = interfaceC27288OooO0OO2.OooO0O0(str2, c33172OooO0oo);
        if (objOooO0O0 != enumC32485OooO00o) {
            c33173OooOO0o2 = c33173OooOO0o3;
            str3 = str2;
            obj = objOooO0O0;
            aiOcrSession = (AiOcrSession) obj;
            if (aiOcrSession != null) {
            }
        }
        return enumC32485OooO00o;
    }

    public static AiOcrTextPage OooO0o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, String str, int i, String str2, String str3, Bundle bundle) {
        String text = new ConverterSpannedToHtml().convert(new SpannableStringBuilder(new RTHtml(str3).convertTo(abstractApplicationC26277OooOoOO, RTFormat.SPANNED).getText()), RTFormat.HTML).getText();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
        return new AiOcrTextPage(str, i, str2, text, System.currentTimeMillis(), System.currentTimeMillis(), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r2.OooO0oo(r1, r3) == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33165OooO00o c33165OooO00o;
        C33173OooOO0o c33173OooOO0o;
        List list;
        String str2;
        C33173OooOO0o c33173OooOO0o2;
        AiOcrSession aiOcrSession;
        if (abstractC32479OooO0OO instanceof C33165OooO00o) {
            c33165OooO00o = (C33165OooO00o) abstractC32479OooO0OO;
            int i = c33165OooO00o.f119927OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33165OooO00o.f119927OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c33165OooO00o = new C33165OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c33165OooO00o.f119924OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33165OooO00o.f119927OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c33165OooO00o.f119923OooOo0o = this;
            c33165OooO00o.f119922OooOo = arrayList;
            c33165OooO00o.f119925OooOoO0 = str;
            c33165OooO00o.f119927OooOoo0 = 1;
            if (this.f120043OooO0Oo.OooO0Oo(arrayList, c33165OooO00o) != enumC32485OooO00o) {
                c33173OooOO0o = this;
                list = arrayList;
                str2 = str;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str2 = c33165OooO00o.f119925OooOoO0;
            list = c33165OooO00o.f119922OooOo;
            c33173OooOO0o = c33165OooO00o.f119923OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32460OooOooO.f116667OooO00o;
            }
            str2 = c33165OooO00o.f119925OooOoO0;
            list = c33165OooO00o.f119922OooOo;
            c33173OooOO0o2 = c33165OooO00o.f119923OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            aiOcrSession = (AiOcrSession) objOooO0O0;
            if (aiOcrSession != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "AiOcrRecognizer", "Session not found: ", str2), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            List<String> pageIds = aiOcrSession.getPageIds();
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AiOcrTextPage) it.next()).getId());
            }
            AiOcrSession aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession, null, null, null, oOo000Oo.OooOo.OooooOO(pageIds, arrayList2), null, 0L, System.currentTimeMillis(), 55, null);
            InterfaceC27288OooO0OO interfaceC27288OooO0OO = c33173OooOO0o2.f120045OooO0o0;
            c33165OooO00o.f119923OooOo0o = null;
            c33165OooO00o.f119922OooOo = null;
            c33165OooO00o.f119925OooOoO0 = null;
            c33165OooO00o.f119927OooOoo0 = 3;
        }
        InterfaceC27288OooO0OO interfaceC27288OooO0OO2 = c33173OooOO0o.f120045OooO0o0;
        c33165OooO00o.f119923OooOo0o = c33173OooOO0o;
        c33165OooO00o.f119922OooOo = list;
        c33165OooO00o.f119925OooOoO0 = str2;
        c33165OooO00o.f119927OooOoo0 = 2;
        objOooO0O0 = interfaceC27288OooO0OO2.OooO0O0(str2, c33165OooO00o);
        if (objOooO0O0 != enumC32485OooO00o) {
            c33173OooOO0o2 = c33173OooOO0o;
            aiOcrSession = (AiOcrSession) objOooO0O0;
            if (aiOcrSession != null) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, String str2, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33171OooO0oO c33171OooO0oO;
        C33173OooOO0o c33173OooOO0o;
        if (abstractC32479OooO0OO instanceof C33171OooO0oO) {
            c33171OooO0oO = (C33171OooO0oO) abstractC32479OooO0OO;
            int i = c33171OooO0oO.f120013OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33171OooO0oO.f120013OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33171OooO0oO = new C33171OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c33171OooO0oO.f120012OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33171OooO0oO.f120013OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            AiFeatureConfig aiFeatureConfig = (AiFeatureConfig) this.f120048OooOO0.getValue();
            Integer numValueOf = aiFeatureConfig != null ? Integer.valueOf(aiFeatureConfig.getAppMinVersion()) : null;
            if (numValueOf == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrRecognizer");
                c20358OooO00o.OooO0OO("minAppVersion is null", new Object[0]);
            } else if (394 < numValueOf.intValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("AiOcrRecognizer");
                c20358OooO00o2.OooO0OO("App version is too old", new Object[0]);
                return new C27174OooO0O0("199997", "App version is too old", null, false);
            }
            c33171OooO0oO.f120010OooOo0o = this;
            c33171OooO0oO.f120009OooOo = str;
            c33171OooO0oO.f120013OooOoOO = 1;
            objOooO00o = this.f120042OooO0OO.OooO00o(str2, list, c33171OooO0oO);
            if (objOooO00o != enumC32485OooO00o) {
                c33173OooOO0o = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) c33171OooO0oO.f120010OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            return c27174OooO0O0;
        }
        str = c33171OooO0oO.f120009OooOo;
        c33173OooOO0o = (C33173OooOO0o) c33171OooO0oO.f120010OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) objOooO00o;
        InterfaceC27325OoooO00 interfaceC27325OoooO00 = c33173OooOO0o.f120042OooO0OO;
        c33171OooO0oO.f120010OooOo0o = c27174OooO0O02;
        c33171OooO0oO.f120009OooOo = null;
        c33171OooO0oO.f120013OooOoOO = 2;
        return interfaceC27325OoooO00.OooO0OO(str, c33171OooO0oO) == enumC32485OooO00o ? enumC32485OooO00o : c27174OooO0O02;
    }
}
