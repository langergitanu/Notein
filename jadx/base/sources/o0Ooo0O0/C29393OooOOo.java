package o0Ooo0O0;

import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditorPanel;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditorPanel$initByViewModel$1", m80623f = "PageLayerEditorPanel.kt", m80624l = {66}, m80625m = "invokeSuspend")
public final class C29393OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f104228OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104229OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditorPanel f104230OooOoO0;

    /* JADX INFO: renamed from: o0Ooo0O0.OooOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditorPanel$initByViewModel$1$1", m80623f = "PageLayerEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PageLayerEditorPanel f104231OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ boolean f104232OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PageLayerEditorPanel pageLayerEditorPanel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104231OooOo = pageLayerEditorPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104231OooOo, continuation);
            oooO00o.f104232OooOo0o = ((Boolean) obj).booleanValue();
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f104232OooOo0o;
            PageLayerEditorPanel pageLayerEditorPanel = this.f104231OooOo;
            if (z) {
                int i = PageLayerEditorPanel.f74885OooOooo;
                pageLayerEditorPanel.OooOO0(0L);
            } else {
                int i2 = PageLayerEditorPanel.f74885OooOooo;
                pageLayerEditorPanel.OooO();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29393OooOOo(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, PageLayerEditorPanel pageLayerEditorPanel, Continuation<? super C29393OooOOo> continuation) {
        super(2, continuation);
        this.f104228OooOo = oooO0OO;
        this.f104230OooOoO0 = pageLayerEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29393OooOOo(this.f104228OooOo, this.f104230OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29393OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104229OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f104228OooOo;
            OooO00o oooO00o = new OooO00o(this.f104230OooOoO0, null);
            this.f104229OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(oooO0OO.f74782OooOOOO, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
