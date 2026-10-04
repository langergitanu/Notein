package o0Ooo0O0;

import com.aspose.words.StyleIdentifier;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$processPendingThumbnailUpdates$1", m80623f = "PageLayerEditor.kt", m80624l = {StyleIdentifier.BIBLIOGRAPHY}, m80625m = "invokeSuspend")
public final class C29389OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f104210OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PageLayerEditor f104211OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<C30837OooO00o> f104212OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104213OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f104214OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29389OooOOO(List<C30837OooO00o> list, PageLayerEditor pageLayerEditor, Continuation<? super C29389OooOOO> continuation) {
        super(2, continuation);
        this.f104212OooOoO = list;
        this.f104214OooOoOO = pageLayerEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29389OooOOO(this.f104212OooOoO, this.f104214OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29389OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        PageLayerEditor pageLayerEditor;
        Iterator it;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104213OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it2 = this.f104212OooOoO.iterator();
            pageLayerEditor = this.f104214OooOoOO;
            it = it2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f104210OooOo;
            pageLayerEditor = this.f104211OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            C30837OooO00o c30837OooO00o = (C30837OooO00o) it.next();
            String str = c30837OooO00o.f110198OooO0OO;
            int i2 = PageLayerEditor.f74865Oooo0o0;
            PDFView pDFView = pageLayerEditor.f74871OooOoo;
            int iOooOOo = (pDFView == null || (abstractC22830OooO0Oo = pDFView.f69170OooOooO) == null) ? -1 : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo(str);
            if (iOooOOo != -1) {
                this.f104211OooOo0o = pageLayerEditor;
                this.f104210OooOo = it;
                this.f104213OooOoO0 = 1;
                if (PageLayerEditor.OooO00o(pageLayerEditor, iOooOOo, c30837OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
