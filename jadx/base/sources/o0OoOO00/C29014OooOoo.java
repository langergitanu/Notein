package o0OoOO00;

import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o0OOOO00.C27095OooOo0O;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoOO00.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$_pageTempList$1", m80623f = "AddPageViewModel.kt", m80624l = {205}, m80625m = "invokeSuspend")
public final class C29014OooOoo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Page, List<? extends Page>, Continuation<? super List<? extends Page>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Page f102774OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f102775OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f102776OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f102777OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Collection f102778OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102779OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29014OooOoo(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Continuation<? super C29014OooOoo> continuation) {
        super(3, continuation);
        this.f102779OooOoo0 = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Page page, List<? extends Page> list, Continuation<? super List<? extends Page>> continuation) {
        C29014OooOoo c29014OooOoo = new C29014OooOoo(this.f102779OooOoo0, continuation);
        c29014OooOoo.f102776OooOoO = page;
        c29014OooOoo.f102778OooOoOO = list;
        return c29014OooOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        if (0 != 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a3 -> B:27:0x00a6). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO;
        Iterator it;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO2;
        Collection collection;
        Object paperTheme;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102777OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO((Page) this.f102776OooOoO), (List) this.f102778OooOoOO);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = arrayListOooooOO.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                oooO0OO = this.f102779OooOoo0;
                if (!zHasNext) {
                    break;
                }
                Object next = it2.next();
                PaperTheme paperTheme2 = ((Page) next).getPaperTheme();
                if (paperTheme2 != null) {
                    C27570o00oOoo0 c27570o00oOoo0 = oooO0OO.f73854OooO0o0;
                    c27570o00oOoo0.getClass();
                    if (paperTheme2.availableFromLocal(c27570o00oOoo0.f96739OooO00o)) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            oooO0OO2 = oooO0OO;
            collection = arrayList2;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Page page = this.f102774OooOo;
            it = this.f102775OooOo0o;
            collection = this.f102778OooOoOO;
            oooO0OO2 = (com.orion.notein.p607ui.noteeditor.addpage.OooO0OO) this.f102776OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            MyTemplate myTemplate = (MyTemplate) obj;
            if (myTemplate != null) {
                page = null;
            } else {
                page.setPaperTheme(myTemplate.getPaperTheme());
            }
            if (page != null) {
                collection.add(page);
            }
            if (!it.hasNext()) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (List) collection) {
                    Page page2 = (Page) obj2;
                    PaperTheme paperTheme3 = page2.getPaperTheme();
                    if (paperTheme3 instanceof LambdaPaperTheme) {
                        PaperTheme paperTheme4 = page2.getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme4, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.LambdaPaperTheme");
                        paperTheme = new C32443OooOOO(C24035Oooo00o.f80943OooO00o.OooO0O0(((LambdaPaperTheme) paperTheme4).getPaperStyle().getClass()), page2.getPaperOrientation());
                    } else if (paperTheme3 instanceof LocalUriPaperTheme) {
                        PaperTheme paperTheme5 = page2.getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme5, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.LocalUriPaperTheme");
                        paperTheme = ((LocalUriPaperTheme) paperTheme5).getUri();
                    } else if (paperTheme3 instanceof LocalResPaperTheme) {
                        PaperTheme paperTheme6 = page2.getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme6, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.LocalResPaperTheme");
                        paperTheme = ((LocalResPaperTheme) paperTheme6).getResName();
                    } else if (paperTheme3 instanceof PdfPaperTheme) {
                        PaperTheme paperTheme7 = page2.getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme7, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                        paperTheme = ((PdfPaperTheme) paperTheme7).getPdfInfo().getPdfPath();
                    } else if (paperTheme3 instanceof PdfSetPaperTheme) {
                        PaperTheme paperTheme8 = page2.getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme8, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfSetPaperTheme");
                        paperTheme = ((PdfSetPaperTheme) paperTheme8).getName();
                    } else {
                        paperTheme = page2.getPaperTheme();
                    }
                    if (hashSet.add(paperTheme)) {
                        arrayList3.add(obj2);
                    }
                }
                return oOo000Oo.OooOo.o00Oo0(arrayList3, 5);
            }
            page = (Page) it.next();
            PaperTheme paperTheme9 = page.getPaperTheme();
            if (paperTheme9 != null) {
                String myTemplateId = paperTheme9.getMyTemplateId();
                if (myTemplateId != null) {
                    C27095OooOo0O c27095OooOo0O = oooO0OO2.f73851OooO;
                    this.f102776OooOoO = oooO0OO2;
                    this.f102778OooOoOO = collection;
                    this.f102775OooOo0o = it;
                    this.f102774OooOo = page;
                    this.f102777OooOoO0 = 1;
                    obj = c27095OooOo0O.OooOO0o(myTemplateId, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    MyTemplate myTemplate2 = (MyTemplate) obj;
                    if (myTemplate2 != null) {
                    }
                }
            }
            if (page != null) {
            }
            if (!it.hasNext()) {
            }
        }
    }
}
